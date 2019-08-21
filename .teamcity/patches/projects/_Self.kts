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
            param("env.LifeTimeAPIVersion", "2")
        }
        add {
            param("env.LifeTimeEnvironmentURL", "wwdt-lt.outsystemsenterprise.com")
        }
        add {
            param("TriggeredBy", "")
        }
        add {
            param("env.AcceptanceEnvironment", "Testing")
        }
        add {
            param("ApplicationScope", "")
        }
        add {
            param("env.ArtifactsFolder", "Artifacts")
        }
        add {
            param("env.DevelopmentEnvironment", "Development")
        }
        add {
            param("env.ProductionEnvironment", "Production")
        }
        add {
            param("ApplicationScopeWithTests", "")
        }
    }
}
