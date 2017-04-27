lazy val root = crossProject.in(file(".")).
  settings(
    name := "skynet",
    organization := "com.temerev",
    scalaVersion := "2.12.1",
    version := "0.1.0",
    fork in run := true,
    cancelable in Global := true
  ).jvmSettings(
    libraryDependencies +=
      "com.typesafe.akka" %% "akka-actor" % "2.5.0-RC2"
  ).jsSettings(
    libraryDependencies +=
      "org.akka-js" %%% "akkajsactor" % "0.2.5.0-RC2-SNAPSHOT-weak-map",
    persistLauncher := true,
    postLinkJSEnv := NodeJSEnv(args = Seq("--max_old_space_size=4096")).value
  )

lazy val rootJS = root.js
lazy val rootJVM = root.jvm
