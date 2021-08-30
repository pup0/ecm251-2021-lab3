import org.json.JSONArray

fun main(args: Array<String>) {
    val resposta = khttp.get("https://deckofcardsapi.com/api/deck/new/shuffle/?deck_count=1")
    val baralho_id = resposta.jsonObject["deck_id"]
    val cards_resposta = khttp.get("https://deckofcardsapi.com/api/deck/$baralho_id/draw/?count=1")
    val carta_json : JSONArray = cards_resposta.jsonObject["cards"] as JSONArray
    val valorDaCarta = carta_json[0]
    println("")
}