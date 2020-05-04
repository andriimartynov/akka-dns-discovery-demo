# akka-dns-discovery-demo

This is an example SBT project showing how to create an Akka Cluster with dns [discovery method](https://doc.akka.io/docs/akka/current/discovery/index.html#discovery-method-dns).

## Starting via [docker-compose](https://docs.docker.com/compose/)

```
docker-compose -f docker/docker-compose.yml up
```

## Starting via [helm](https://helm.sh)

```
helm install akka-dns-discovery-demo helm/akka-dns-discovery-demo
```