package deck

import card.Card

class Deck() {
  var cards = Deck.createDeck()
  
  def shuffle = {
    this.cards = util.Random.shuffle(cards)
  }

  this.shuffle
}

object Deck {
  private def createDeck() : Seq[Card] = 
    (for (suit <- Card.valid_suits; value <- Card.valid_values) 
      yield new Card(suit = suit, value = value)).toSeq    
}
