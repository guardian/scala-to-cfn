
name := "scala-to-cfn"

version := "0.1"

scalaVersion := "2.12.7"


libraryDependencies ++= Seq(
  "com.typesafe.play" %% "play-json" % "2.6.10",
  "org.typelevel" %% "cats-core" % "1.4.0",
  "com.amazonaws" % "aws-lambda-java-core" % "1.2.0"
)


assemblyJarName := "step.jar"