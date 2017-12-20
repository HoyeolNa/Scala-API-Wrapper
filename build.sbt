enablePlugins(JavaAppPackaging)
name := "eos-scala-rpc-api"

version := "1.0"

scalaVersion := "2.12.4"

mappings in Universal ++= {
  (baseDirectory.value / "conf").list().map(f => {
    val conf = baseDirectory.value / "conf" / f
    conf -> s"conf/$f"
  }).toSeq
}

resourceDirectory in Compile := baseDirectory.value / "conf"

libraryDependencies ++= Seq(
  "org.scalactic" %% "scalactic" % "3.0.1",
  "org.scalatest" %% "scalatest" % "3.0.1" % "test",
  "com.typesafe.play" %% "play-json" % "2.6.8",
  "com.typesafe" % "config" % "1.3.2",
  "org.asynchttpclient" % "async-http-client" % "2.1.0-RC2"
)
        