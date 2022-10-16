package com.github.cmourglia.ijblockjumper;

import com.intellij.openapi.actionSystem.AnAction;
import com.intellij.openapi.actionSystem.AnActionEvent;
import org.jetbrains.annotations.NotNull;

public class JumpSelectForwardAction extends AnAction {
    @Override
    public void actionPerformed(@NotNull AnActionEvent event) {
        BlockJumpAction.moveCaret(event, false, true);
    }
}
