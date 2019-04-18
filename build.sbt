name := "TesingWithScalaJS"

version := "0.1"

scalaVersion := "2.12.8"

enablePlugins(ScalaJSPlugin)

scalaJSUseMainModuleInitializer := true

libraryDependencies += "org.querki" %%% "jquery-facade" % "1.2"

libraryDependencies += "org.scalatest" %%% "scalatest" % "3.0.7" % Test