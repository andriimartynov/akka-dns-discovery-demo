import com.github.andriimartynov.akka_dns_discovery_demo.AkkaClusterComponents
import play.api._
import play.api.ApplicationLoader.Context
import play.api.i18n.I18nComponents
import play.api.routing.Router
import play.filters.HttpFiltersComponents

class MasterApplicationLoader extends ApplicationLoader {
  def load(context: Context): Application = {
    new MasterApplicationComponents(context).application
  }
}

class MasterApplicationComponents(context: Context)
  extends BuiltInComponentsFromContext(context)
    with I18nComponents
    with HttpFiltersComponents
    with AkkaClusterComponents {

  LoggerConfigurator(context.environment.classLoader).foreach {
    _.configure(context.environment, context.initialConfiguration, Map.empty)
  }

  lazy val router = Router.empty
}
