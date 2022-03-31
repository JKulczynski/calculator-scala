ThisBuild / version := "0.1.0-SNAPSHOT"

ThisBuild / scalaVersion := "2.13.8"

lazy val root = (project in file("."))
  .settings(
    name := "calculator-again"
  )
libraryDependencies += "org.scalactic" %% "scalactic" % "3.2.11"
libraryDependencies += "org.scalatest" %% "scalatest" % "3.2.11" % "test"
libraryDependencies += "org.scalacheck" %% "scalacheck" % "1.15.4" % "test"
libraryDependencies += "org.scalatestplus" %% "scalacheck-1-15" % "3.2.11.0" % "test"