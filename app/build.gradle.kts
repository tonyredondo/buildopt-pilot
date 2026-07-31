plugins {
    application
}

dependencies {
    implementation(project(":lib07"))
}

application {
    mainClass = "dev.buildopt.pilot.app.Main"
}
