package com.github.cmourglia.blockjumper;

import com.intellij.openapi.actionSystem.AnAction;
import com.intellij.openapi.actionSystem.AnActionEvent;
import com.intellij.openapi.actionSystem.CommonDataKeys;
import com.intellij.openapi.editor.Caret;
import com.intellij.openapi.editor.Document;
import com.intellij.openapi.editor.Editor;
import com.intellij.openapi.editor.LogicalPosition;
import com.intellij.openapi.util.TextRange;
import org.jetbrains.annotations.NotNull;
import sun.jvm.hotspot.opto.Block;

public class JumpBackwardAction extends AnAction {
    @Override
    public void actionPerformed(@NotNull AnActionEvent event) {
        BlockJumpAction.moveCaret(event, true, false);
    }
}
