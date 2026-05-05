pluginManagement {
    repositories {
        google {
            content {
                includeGroupByRegex("com\\.android.*")
                includeGroupByRegex("com\\.google.*")
                includeGroupByRegex("androidx.*")
            }
        }
        mavenCentral()
        maven(url = uri("https://trade-log-sdk-android-498628473923.d.codeartifact.us-east-1.amazonaws.com/maven/tradelog-sdk-android/")) {
            credentials {
                username = "aws"
                password = "eyJ2ZXIiOjEsImlzdSI6MTc3NzQzMTA5OCwiZW5jIjoiQTEyOEdDTSIsInRhZyI6ImVmSUg1VGlrOHRoMTNtMHhaV1VNM1EiLCJleHAiOjE3Nzc0NzQyOTgsImFsZyI6IkExMjhHQ01LVyIsIml2IjoiZklPcDBINWFkT1dPUk9JOCJ9.sDxzmjBfHOY9XIJ2RRqnew.talILWXLcum5mAwm.TvlCR4fiUEjHzXmMXRXf_Faryxessbn9oOIj0xOsDoavhLwex7OSKqJFySYZu-R1Ss4ymWqupElS73aTdHbfqMdPzi-trvPHuA2fMspy1FZbFvLbV5EctneB7or0euGXA9hvJDBwBrMrnNg1b2LFjjBsU4EGD9OfYqc9j06VeBvVqvLyxFPqF60f32QjTqJc0foUbeOHYB81WGkE3wSt6hhizJc62dM30C_ApJzHjPicRt8f9_f4VltbHEdeyygvfRIokjw1j4lbAxIoUb1Opq7HV5xNPb4k5JpZG2wEMqJCwUYnaJoc8cok71-uHN98Objvatp_7U6dhZB7W2g9-bsW6dnzF-1WNDMcMv5sb7wnIOZMdP5F7k99N-igPTN7sC2pkZuqhOWwdMAlyJuG5rHiy9jt-8fIzP2avvucmT8OSEd40jhj-HVur5E5j19xXIcT6lj4zCDfKR57bra24C4A4vSPLW4-HMSwCC5p96Msi2pYY3kpO-esnC3ICCJ1I2GZE6CHaYRMORdXoDU9fi-phheJ9wxh9x_ZmUAX559eL0HeIDFR7IljeAM9-vR3y_OodBA-i_NHn6LOutSOsPirdQgEWaFgtcvMfAnpY1ZzDBsqtB7MeddCFPOqxZqERoqz4WnVqddIaXu3HvyDes1A7vRLcuj2O3bX7QDcmxRhAUe9zDmF3mBsk7vbxqVb6HQlU0hKWuaTtbRlr-_JA5vKZwIhFS8Le1aTEvP9yL7SRvT05OU-YVIw9dU1pgrWPy36XRYOc2nruqy-1jIgQuumcNqe_JyqIxrNsBkm4JEjPIh6FsEFtCsnPyI7QTrOQL43_GUR1v2k-EHzaAG4mVgPZxG5ZPQEsMpScnEfLAXVHY4Lij8kNVI8ggclYw_bNjNKimk6E84_OXR56g6uo6_ieQj1LSEVo3YjgiADJXdhLUe8CYua4Y0SlakdcP77vCQu.wEQQUnyr9rbbHFM8bypUfg"
            }
        }
        maven(url = uri("https://storage.googleapis.com/download.flutter.io"))
        gradlePluginPortal()
    }
}
plugins {
    id("org.gradle.toolchains.foojay-resolver-convention") version "1.0.0"
}
dependencyResolutionManagement {
    repositoriesMode.set(RepositoriesMode.FAIL_ON_PROJECT_REPOS)
    repositories {
        google()
        mavenCentral()
        maven(url = uri("https://trade-log-sdk-android-498628473923.d.codeartifact.us-east-1.amazonaws.com/maven/tradelog-sdk-android/")) {
            credentials {
                username = "aws"
                password = "eyJ2ZXIiOjEsImlzdSI6MTc3ODAyNDMxMywiZW5jIjoiQTEyOEdDTSIsInRhZyI6Ik1YbVdLZVQyQld0SWh4QjJNZE5VNGciLCJleHAiOjE3NzgwNjc1MTMsImFsZyI6IkExMjhHQ01LVyIsIml2IjoiaXF4TGZWSnlDeDRFWXd6UyJ9.ys85E5_QOVOFrfu5tlowDA.deduc9uAytVeFZEp.lcuhRME3FiwzwdPe-acziHe-T5yhF6eLA5_LTpEqsFbhvLvJFLXT1rZDhPeB8JKqeJzM7vRz7jAVMC4p9AeL_XNnZfUUQWzUcey3tSdN_oL9eJ3_jvIOK6wBQqaHEB30knDpS4fm-ii1BEp19HdzvKQYou9xmPVtRMAPceqWts9cMcwKS43e2_8AiWKL-QSwe-G_UcGczGGsljDQadINbj8xztME4VeZ7PzCneeAErd6Vpgsi9bBu81d0XZL7itkYU-6MWEpn8UW2X5BFM4y9bARZ3lirU8ZChknvxxfYl0ciikOztgelVRHKmNW3SWzC3bCFdIvE-gEiXwHKgTlNvC84gG50af0Pfq7_D7NRJG4AVz1EXewwnwG8s6YaTGDma2a6BuTPJEIbQlfAqKWc38vc6w3cwuVqkIswI4wCoW61jFOzcRDrMUGp7qLwO7j0dAT8BnLYLSoe_fGQfOIg3p-NpwcrCOH5wyzZHTo92-_fjqRkCiLDybSJHfc4IbJmIz83NKgsX1_FptUsC5o96CnlgDAQCGH1OU7vtf3F406pjEoEzuQwl2lO5eWo6Rha6Pfys8nDur7-PMBrf8Dr3gkt6ny9VeMvlXnJJyQdFAA9H-SlFPFws7kpAgjZiadvbro_ioWyu0zKLsMzwKMuZOLsJOeZUXbq_RLqNptJfttnda5j8iOCcCyQZKxeI_nBbDqt-2fRXznmFWQZ9XapFXFEFndpTUHnrjQAfkT2taMfMtbiRjsxcDA7noL_wTtvSeepfpGVGMaKuaMnc1Wgu94-C1Pcu6R4yrOx6qpopsbzZxAVrf7CK4dQjFO9EhcPSGzAkVnkMWOXxCV07azY_88Y88yQHHUL8n4iMtSSd37Mhmt8roElSzobu1_eWHosgVkJNnXvBREsPMMVxfYKcWhO8RyWNKlRV4sQJmGBV-yYZxEoYKXl2TzBmJEXGyE6Kcm17CHvNPYxoMPXtXJ.gi_20qRmoIvAEmhlsOrFEw"
            }
        }
        maven(url = uri("https://storage.googleapis.com/download.flutter.io"))
    }
}

rootProject.name = "My Application"
include(":app")
