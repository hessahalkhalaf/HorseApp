package com.example.horseapp.dataLayer


data class HorsesDataModel(
 //   val id_horses_in_modelHorses: Int = 0,
//    val id_user_in_dataModelHorses:Int =0,
    // for initialize
    val Data_horse_Name:String = "",
    val Data_horse_image: List<String> = listOf(""),
    val data_horse_Content:String = "",

    )//end dataClass HorsesDataModel


data class UserDataModel(
    val id_user_in_data_modelUser :Int=0,
    val data_User_Name: String,
    val data_User_image: String,
    val data_User_contact :String,
)//end UserDataModel dataClass


