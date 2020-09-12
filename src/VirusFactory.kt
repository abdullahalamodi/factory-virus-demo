class VirusFactory {


    fun makeVirus(type: VirusType): Virus {
        return when (type) {
            VirusType.CORONA -> CoronaVirus()
            VirusType.INFLUENZA -> InFluenzaVirus()
            else -> HIVVirus()
        };
    }

}

enum class VirusType{
    CORONA,
    INFLUENZA,
    HIV
}