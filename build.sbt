name := "scala-sbt"

version := "1.0"

scalaVersion := "2.11.8"

libraryDependencies += "org.scalatest" %% "scalatest" % "3.0.0" % "test"
libraryDependencies += "org.specs2" %% "specs2-core" % "3.8.5" % "test"
libraryDependencies += "org.scalacheck" %% "scalacheck" % "1.13.2" % "test"

resolvers += "scalaz-bintray" at "http://dl.bintray.com/scalaz/releases"