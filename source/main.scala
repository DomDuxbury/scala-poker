import deck.Deck

object PokerGame {
  def main(args: Array[String]): Unit = {
    try {
      val aceofhearts = new Deck()
      aceofhearts.cards map (card => println(card.name))
      println("======================================")
      aceofhearts.shuffle
      aceofhearts.cards map (card => println(card.name))
      println(f"top card: ${aceofhearts.takeTopCard.name} ==========")
      aceofhearts.cards map (card => println(card.name))
    } catch {
      case e: Exception => println(e)
    }
  } 
}


