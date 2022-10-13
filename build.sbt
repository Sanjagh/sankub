name := "sankub"
ThisBuild / scalaVersion := "3.2.0"

lazy val persist = project in file("persist")
lazy val engine = (project in file("engine")).dependsOn(persist)

lazy val root = (project in file(".")).aggregate(engine, persist)
