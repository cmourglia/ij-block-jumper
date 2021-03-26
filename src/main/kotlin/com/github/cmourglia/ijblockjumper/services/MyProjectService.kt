package com.github.cmourglia.ijblockjumper.services

import com.github.cmourglia.ijblockjumper.MyBundle
import com.intellij.openapi.project.Project

class MyProjectService(project: Project) {

    init {
        println(MyBundle.message("projectService", project.name))
    }
}
