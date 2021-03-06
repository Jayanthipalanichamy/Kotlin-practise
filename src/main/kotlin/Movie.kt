import java.util.*
data class Movie(val imdbID: String, val title:String, val releaseDate: Int,val geners:List<String>, val director:String,val actors: List<String>,val actress: List<String>, val duration: Int ) {
    override fun toString(): String {
        return "Movie(imdbID='$imdbID', title='$title', releaseDate=$releaseDate, geners=$geners, director='$director', actors=$actors, actress=$actress, duration=$duration)"
    }

    infix fun hasReleaseYear(year : Int): Boolean = releaseDate == year
    infix fun hasDurationGreaterThan(minDuration:  Int): Boolean = duration >= minDuration
    infix fun hasActor(actor: String): Boolean = actors.contains(actor)


}