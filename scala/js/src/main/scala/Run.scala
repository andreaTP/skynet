import akka.actor.{ ActorSystem, Props }

import scalajs.js

object Root extends js.JSApp {
  case class Run(num: Int)

  def main() =
    ActorSystem("main").actorOf(Props[RootActor]) ! Run(3)

}
