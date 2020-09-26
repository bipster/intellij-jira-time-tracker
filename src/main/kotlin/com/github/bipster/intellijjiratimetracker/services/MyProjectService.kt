package com.github.bipster.intellijjiratimetracker.services

import com.intellij.openapi.project.Project
import com.github.bipster.intellijjiratimetracker.MyBundle

class MyProjectService(project: Project) {

    init {
        println(MyBundle.message("projectService", project.name))
    }
}
