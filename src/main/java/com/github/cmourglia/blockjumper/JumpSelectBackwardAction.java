package com.github.cmourglia.blockjumper;

import com.intellij.openapi.actionSystem.AnAction;
import com.intellij.openapi.actionSystem.AnActionEvent;
import org.jetbrains.annotations.NotNull;

public class JumpSelectBackwardAction extends AnAction {
    @Override
    public void actionPerformed(@NotNull AnActionEvent event) {
        BlockJumpAction.moveCaret(event, true, true);
    }
}