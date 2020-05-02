import sbt._

object Akka {
  lazy val AKKA_VERSION: String = "2.5.27"
  lazy val AKKA_HTTP_VERSION: String = "10.1.11"
  lazy val AKKA_MANAGEMENT_VERSION: String = "1.0.6"

  lazy val dependencies: Seq[ModuleID] = Seq(
    "com.typesafe.akka" %% "akka-discovery" % AKKA_VERSION,
    "com.typesafe.akka" %% "akka-remote" % AKKA_VERSION,
    "com.typesafe.akka" %% "akka-slf4j" % AKKA_VERSION
  )

  object HTTP {
    lazy val dependencies: Seq[ModuleID] = Seq(
      "com.typesafe.akka" %% "akka-http" % AKKA_HTTP_VERSION,
      "com.typesafe.akka" %% "akka-http-spray-json" % AKKA_HTTP_VERSION
    )
  }

  object Management {
    lazy val dependencies: Seq[ModuleID] = Seq(
      "com.lightbend.akka.management" %% "akka-management" % AKKA_MANAGEMENT_VERSION,
      "com.lightbend.akka.management" %% "akka-management-cluster-bootstrap" % AKKA_MANAGEMENT_VERSION
    )
  }
  
}
