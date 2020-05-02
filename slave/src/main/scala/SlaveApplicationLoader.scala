import com.github.andriimartynov.akka_dns_discovery_demo.AkkaClusterComponents
import play.api._
import play.api.ApplicationLoader.Context
import play.api.routing.Router
import play.filters.HttpFiltersComponents

class SlaveApplicationLoader extends ApplicationLoader {
  def load(context: Context): Application =
    new SlaveApplicationComponents(context).application
}

class SlaveApplicationComponents(context: Context)
  extends BuiltInComponentsFromContext(context)
    with HttpFiltersComponents
    with AkkaClusterComponents {

  LoggerConfigurator(context.environment.classLoader).foreach {
    _.configure(context.environment, context.initialConfiguration, Map.empty)
  }

  lazy val router = Router.empty
}
