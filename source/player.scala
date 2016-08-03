package player
import card.Card

class Player(val name : String) {
  var hand = List() : List[Card]
  var chips = 0 : Int
}
