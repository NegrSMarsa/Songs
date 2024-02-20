class Song(val title: String, val artist: String){
    fun play(){
        println("Playing the $title by $artist")
    }
    fun stop(){
        println("Stopped playing $title")
    }
}

fun main(args: Array<String>){
    val songOne = Song("Cherry Waves","Deftones")
    val songTwo = Song("CARNIVAL","¥$,Kanye West & Ty Dolla \$ign")
    val songThree = Song("ILUV","Yeat")
    songOne.play()
    songTwo.play()
    songThree.play()
}