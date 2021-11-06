name := "Guidebook"

version := "1.0"

scalaVersion := "2.12.14"

val akkaVersion = "2.5.4"

resolvers += "Lightbend Repository" at "http://repo.typesafe.com/typesafe/releases/"

libraryDependencies ++= Seq(
  "com.typesafe.akka" %% "akka-actor" % akkaVersion
)