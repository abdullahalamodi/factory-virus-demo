class VirusFactory {

    fun makeVirus(type: String): Virus {
        return when (type) {
            "corona" -> CoronaVirus()
            "inFluenzaVirus" -> InFluenzaVirus()
            else -> HIVVirus()
        };
    }
}