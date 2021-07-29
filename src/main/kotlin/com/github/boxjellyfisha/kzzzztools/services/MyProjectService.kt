package com.github.boxjellyfisha.kzzzztools.services

import com.github.boxjellyfisha.kzzzztools.MyBundle
import com.intellij.openapi.project.Project

class MyProjectService(project: Project) {

    init {
        println(MyBundle.message("projectService", project.name))
    }
}
