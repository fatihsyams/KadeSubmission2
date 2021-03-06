package com.example.kadesubmission2.model

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