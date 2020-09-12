fun main() {
    val virus:Virus;
    virus = VirusFactory().makeVirus(VirusType.INFLUENZA);
    virus.mutate();
}