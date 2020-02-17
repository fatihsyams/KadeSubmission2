package com.example.kadesubmission2.model
import com.google.gson.annotations.SerializedName


data class ResponseLastModel (
    val item : List<ResponseLastModel>,
    val idEvent:String,
    val strEvent:String,
    val strLeague:String,
    val strSeason:String,
    val strHomeTeam:String,
    val strAwayTeam:String,

    val intHomeScore:String?,

    val intRound:String,
    val intAwayScore:String?,

    val dateEvent:String,
    val strTime:String,
    val idHomeTeam:String,
    val idAwayTeam:String
)

//data class ResponseNextModel (
//    val idEvent:String,
//    val strEvent:String,
//    val strLeague:String,
//    val strSeason:String,
//    val strHomeTeam:String,
//    val strAwayTeam:String,
//
//    val intHomeScore:String?,
//
//    val intRound:String,
//    val intAwayScore:String?,
//
//    val dateEvent:String,
//    val strTime:String,
//    val idHomeTeam:String,
//    val idAwayTeam:String
//)


data class LeagueResponse<T>(
    @SerializedName("leagues")
    val datas: T
)

data class Match(
    @SerializedName("dateEvent")
    val dateEvent: String,
    @SerializedName("dateEventLocal")
    val dateEventLocal: String,
    @SerializedName("idAPIfootball")
    val idAPIfootball: Any,
    @SerializedName("idAwayTeam")
    val idAwayTeam: String,
    @SerializedName("idEvent")
    val idEvent: String,
    @SerializedName("idHomeTeam")
    val idHomeTeam: String,
    @SerializedName("idLeague")
    val idLeague: String,
    @SerializedName("idSoccerXML")
    val idSoccerXML: String,
    @SerializedName("intAwayScore")
    val intAwayScore: String,
    @SerializedName("intAwayShots")
    val intAwayShots: Any,
    @SerializedName("intHomeScore")
    val intHomeScore: String,
    @SerializedName("intHomeShots")
    val intHomeShots: Any,
    @SerializedName("intRound")
    val intRound: String,
    @SerializedName("intSpectators")
    val intSpectators: Any,
    @SerializedName("strAwayFormation")
    val strAwayFormation: Any,
    @SerializedName("strAwayGoalDetails")
    val strAwayGoalDetails: String,
    @SerializedName("strAwayLineupDefense")
    val strAwayLineupDefense: String,
    @SerializedName("strAwayLineupForward")
    val strAwayLineupForward: String,
    @SerializedName("strAwayLineupGoalkeeper")
    val strAwayLineupGoalkeeper: String,
    @SerializedName("strAwayLineupMidfield")
    val strAwayLineupMidfield: String,
    @SerializedName("strAwayLineupSubstitutes")
    val strAwayLineupSubstitutes: String,
    @SerializedName("strAwayRedCards")
    val strAwayRedCards: String,
    @SerializedName("strAwayTeam")
    val strAwayTeam: String,
    @SerializedName("strAwayYellowCards")
    val strAwayYellowCards: String,
    @SerializedName("strBanner")
    val strBanner: Any,
    @SerializedName("strCircuit")
    val strCircuit: Any,
    @SerializedName("strCity")
    val strCity: Any,
    @SerializedName("strCountry")
    val strCountry: Any,
    @SerializedName("strDate")
    val strDate: String,
    @SerializedName("strDescriptionEN")
    val strDescriptionEN: String,
    @SerializedName("strEvent")
    val strEvent: String,
    @SerializedName("strEventAlternate")
    val strEventAlternate: String,
    @SerializedName("strFanart")
    val strFanart: Any,
    @SerializedName("strFilename")
    val strFilename: String,
    @SerializedName("strHomeFormation")
    val strHomeFormation: Any,
    @SerializedName("strHomeGoalDetails")
    val strHomeGoalDetails: String,
    @SerializedName("strHomeLineupDefense")
    val strHomeLineupDefense: String,
    @SerializedName("strHomeLineupForward")
    val strHomeLineupForward: String,
    @SerializedName("strHomeLineupGoalkeeper")
    val strHomeLineupGoalkeeper: String,
    @SerializedName("strHomeLineupMidfield")
    val strHomeLineupMidfield: String,
    @SerializedName("strHomeLineupSubstitutes")
    val strHomeLineupSubstitutes: String,
    @SerializedName("strHomeRedCards")
    val strHomeRedCards: String,
    @SerializedName("strHomeTeam")
    val strHomeTeam: String,
    @SerializedName("strHomeYellowCards")
    val strHomeYellowCards: String,
    @SerializedName("strLeague")
    val strLeague: String,
    @SerializedName("strLocked")
    val strLocked: String,
    @SerializedName("strMap")
    val strMap: Any,
    @SerializedName("strPoster")
    val strPoster: Any,
    @SerializedName("strResult")
    val strResult: String,
    @SerializedName("strSeason")
    val strSeason: String,
    @SerializedName("strSport")
    val strSport: String,
    @SerializedName("strTVStation")
    val strTVStation: Any,
    @SerializedName("strThumb")
    val strThumb: Any,
    @SerializedName("strTime")
    val strTime: String,
    @SerializedName("strTimeLocal")
    val strTimeLocal: String,
    @SerializedName("strTweet1")
    val strTweet1: String,
    @SerializedName("strTweet2")
    val strTweet2: String,
    @SerializedName("strTweet3")
    val strTweet3: String,
    @SerializedName("strVideo")
    val strVideo: String
)