import deck.Card

object PokerGame {
  def main(args: Array[String]): Unit = {
    try {
      val aceofhearts = new Card("heart", "ace")
      println(aceofhearts.suit)
    } catch {
      case e: Exception => println(e)
    }
  } 
}


