import akka.actor.{ ActorSystem, Props }

object Root extends App {
  case class Run(num: Int)

  ActorSystem("main").actorOf(Props[RootActor]) ! Run(3)
}
