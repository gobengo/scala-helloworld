package HelloWorld

object HelloWorld extends App {
  if (args.length > 0) {
    val name = args.mkString(" ")
    println(s"Hello, ${name}")
  } else {
    println("Provide your name as args")
  }
}

