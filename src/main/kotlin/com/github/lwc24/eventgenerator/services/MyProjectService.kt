package com.github.lwc24.eventgenerator.services

import com.github.lwc24.eventgenerator.MyBundle
import com.intellij.openapi.project.Project

class MyProjectService(project: Project) {

    init {
        println(MyBundle.message("projectService", project.name))
    }
}
