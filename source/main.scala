import deck.Deck

object PokerGame {
  def main(args: Array[String]): Unit = {
    try {
      val aceofhearts = new Deck()
      aceofhearts.cards map (card => println(card.suit))
    } catch {
      case e: Exception => println(e)
    }
  } 
}


