package com.github.cmourglia.blockjumper;

import com.intellij.openapi.actionSystem.AnAction;
import com.intellij.openapi.actionSystem.AnActionEvent;
import com.intellij.openapi.actionSystem.CommonDataKeys;
import com.intellij.openapi.editor.Caret;
import com.intellij.openapi.editor.CaretModel;
import com.intellij.openapi.editor.Editor;
import com.intellij.openapi.project.Project;
import org.jetbrains.annotations.NotNull;

public class JumpForwardAction extends AnAction {
    @Override
    public void actionPerformed(@NotNull AnActionEvent event) {
        BlockJumpAction.moveCaret(event, false, false);
    }
}
