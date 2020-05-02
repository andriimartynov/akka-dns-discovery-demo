package com.github.andriimartynov.akka_dns_discovery_demo

import akka.actor.ActorSystem
import akka.management.cluster.bootstrap.ClusterBootstrap
import akka.management.scaladsl.AkkaManagement

trait AkkaClusterComponents {
  def actorSystem: ActorSystem

  actorSystem.actorOf(ClusterListener.props, "cluster-listener")

  AkkaManagement(actorSystem).start()

  ClusterBootstrap(actorSystem).start()
}
