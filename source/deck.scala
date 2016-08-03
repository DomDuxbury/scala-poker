package deck

import card.Card

class Deck() {
  val cards = Deck.createDeck()
}

object Deck {
  def createDeck() : Array[Card] = {
    val queenofspades = new Card(suit = "spade", value = "queen")
    Array(queenofspades)
  }
}
