package deck

class Card(val suit: String, val value: String) {
  if (
    !(Card.valid_suits contains suit) || 
    !(Card.valid_values contains value)) {
    throw new IllegalArgumentException(
      f"""
        Invalid card args: 
           Suit: ${suit}
           Value: ${value} 
      """);
  }
}
 

object Card {
  val valid_suits = Array("heart", "diamond", "club", "spade")
  val valid_values = Array(
                     "one", "two", "three", "four", 
                     "five", "six","seven", "eight", "nine",
                     "ten", "jack", "queen", "king", "ace"
                   )
}
