fun main() {
    val virus:Virus;
    virus = VirusFactory().makeVirus("inFluenzaVirus");

    virus.mutate();
}