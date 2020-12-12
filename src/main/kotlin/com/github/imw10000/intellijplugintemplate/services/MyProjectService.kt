package com.github.imw10000.intellijplugintemplate.services

import com.intellij.openapi.project.Project
import com.github.imw10000.intellijplugintemplate.MyBundle

class MyProjectService(project: Project) {

    init {
        println(MyBundle.message("projectService", project.name))
    }
}
