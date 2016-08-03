package deck

import card.Card

class Deck() {
  var cards = Deck.createDeck()
  
  def shuffle = {
    this.cards = util.Random.shuffle(cards)
  }

  def takeTopCard() : Card = {
    val topCard = this.cards.head
    this.cards = this.cards.tail
    topCard
  }

  this.shuffle
}

object Deck {
  private def createDeck() : Seq[Card] = {
    var cards = for (suit <- Card.valid_suits; value <- Card.valid_values) 
      yield new Card(suit = suit, value = value)
    cards.toSeq
  }
}
