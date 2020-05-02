lazy val `akka-dns-discovery-demo` = (project in file("."))
  .aggregate(
    `akka-dns-discovery-demo-core`,
    `akka-dns-discovery-demo-master`,
    `akka-dns-discovery-demo-slave`
  )

lazy val `akka-dns-discovery-demo-core` = (project in file("core")).settings(
  libraryDependencies ++= Akka.dependencies,
  libraryDependencies ++= Akka.HTTP.dependencies,
  libraryDependencies ++= Akka.Management.dependencies,
  libraryDependencies ++= Logback.dependencies,
  scalaVersion := "2.12.11"
)

lazy val `akka-dns-discovery-demo-master` = (project in file("master"))
  .dependsOn(`akka-dns-discovery-demo-core`)
  .enablePlugins(DockerPlugin, PlayScala)
  .disablePlugins(PlayLayoutPlugin)
  .settings(Docker.settings)

lazy val `akka-dns-discovery-demo-slave` = (project in file("slave"))
  .dependsOn(`akka-dns-discovery-demo-core`)
  .enablePlugins(DockerPlugin, PlayScala)
  .disablePlugins(PlayLayoutPlugin)
  .settings(Docker.settings)
      