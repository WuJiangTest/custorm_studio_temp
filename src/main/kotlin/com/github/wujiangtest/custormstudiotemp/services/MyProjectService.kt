package com.github.wujiangtest.custormstudiotemp.services

import com.intellij.openapi.project.Project
import com.github.wujiangtest.custormstudiotemp.MyBundle

class MyProjectService(project: Project) {

    init {
        println(MyBundle.message("projectService", project.name))
    }
}
