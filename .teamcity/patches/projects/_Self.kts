package patches.projects

import jetbrains.buildServer.configs.kotlin.v2018_2.*
import jetbrains.buildServer.configs.kotlin.v2018_2.Project
import jetbrains.buildServer.configs.kotlin.v2018_2.ui.*

/*
This patch script was generated by TeamCity on settings change in UI.
To apply the patch, change the root project
accordingly, and delete the patch script.
*/
changeProject(DslContext.projectId) {
    params {
        add {
            param("TriggeredBy", "")
        }
        add {
            param("ApplicationScope", "")
        }
        add {
            param("ApplicationScopeWithTests", "")
        }
    }
}
