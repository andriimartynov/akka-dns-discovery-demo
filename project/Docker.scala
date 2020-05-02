import com.typesafe.sbt.packager.docker.DockerPermissionStrategy
import com.typesafe.sbt.packager.docker.DockerPlugin.autoImport._
import sbt.Setting

object Docker {
  lazy val settings: Seq[Setting[_]] = Seq(
    dockerBaseImage := "openjdk:11-jre-slim",
    dockerExposedPorts := Seq(8558, 25520),
    dockerExposedUdpPorts := Seq.empty[Int],
    dockerPermissionStrategy := DockerPermissionStrategy.CopyChown,
    dockerUsername := Some("andriimartynov"),
    dockerUpdateLatest := true
  )
  
}
