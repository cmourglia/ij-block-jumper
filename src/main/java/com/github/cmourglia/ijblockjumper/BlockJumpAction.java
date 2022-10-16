package com.github.cmourglia.ijblockjumper;

import com.intellij.openapi.actionSystem.AnActionEvent;
import com.intellij.openapi.actionSystem.CommonDataKeys;
import com.intellij.openapi.editor.*;
import com.intellij.openapi.util.TextRange;
import org.jetbrains.annotations.NotNull;

public class BlockJumpAction {
    private static boolean isWhitespace(String str) {
        final int length = str.length();
        for (int i = 0; i < length; ++i) {
            final char c = str.charAt(i);
            if (c == ' ' || c == '\n' || c == '\r' || c == '\t') continue;
            return false;
        }
        return true;
    }

    private static int findNextSpaceLine(Document document, Caret caret, boolean backward) {
        int startLine = caret.getLogicalPosition().line;
        int line = startLine;

        final int offset = backward ? -1 : 1;

        final int minBound = 0;
        final int maxBound = document.getLineCount();

        while (line >= minBound && line < maxBound)
        {
            int start = document.getLineStartOffset(line);
            int end = document.getLineEndOffset(line);

            if (isWhitespace(document.getText(new TextRange(start, end)))) {
                if (line == startLine) {
                    startLine += offset;
                }
                else { break; }
            }

            line += offset;
        }

        return line;
    }

    public static void moveCaret(@NotNull AnActionEvent event, boolean backward, boolean select) {
        Editor editor = event.getRequiredData(CommonDataKeys.EDITOR);
        Caret caret = editor.getCaretModel().getPrimaryCaret();
        Document document = editor.getDocument();

        int currentLine = caret.getLogicalPosition().line;
        int nextLine = findNextSpaceLine(document, caret, backward);
        int offset = nextLine - currentLine;
        caret.moveCaretRelatively(0, offset, select, true);
    }
}
