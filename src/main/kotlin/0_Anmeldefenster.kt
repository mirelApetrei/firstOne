fun tryLoggingIn(): Boolean{
    val logins : Map<String,String>  = mapOf("Mark" to "12345", "Simone" to "55555", "Sebastian" to "HalloIchBinSeb",
        "Tim" to "Passwort", "Marie" to "MarieIstDieBeste", "Nicole" to "NicPrincess1")
    // TODO : Schreibe hier deinen Code nach der Aufgabenstellung.
    var isTheNameInTheList = readln()
    var isThePasswordInTheList = readln()
    return logins.containsKey(isTheNameInTheList)
}



fun main(){
    //TODO : Funktionsaufruf
    tryLoggingIn()
}