name := "BinanceClient"

scalaVersion := "2.11.5"

libraryDependencies ++= Seq( 
  "org.json4s" %% "json4s-native" % "3.2.11",
  "org.json4s" %% "json4s" % "3.2.11",
  "io.spray" %% "spray-json" % "1.3.2",
  "org.scalanlp" %% "breeze" % "0.11.2"
)