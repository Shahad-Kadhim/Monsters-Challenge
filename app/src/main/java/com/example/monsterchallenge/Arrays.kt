package com.example.monsterchallenge

import android.app.Application
import android.content.Context
import com.bumptech.glide.Glide

object Arrays {
    lateinit var application: Context

    val ARRAY_OF_MEAL= arrayListOf(
        Meal("Cakes","https://hips.hearstapps.com/hmg-prod.s3.amazonaws.com/images/delish-210329-delishsummertreats-spumoneicecreamcake322-sc-1622665696.jpg?crop=0.920xw:0.690xh;0.0240xw,0.204xh&resize=480:*"),
        Meal("Drinks","https://hips.hearstapps.com/hmg-prod.s3.amazonaws.com/images/delish-210322-whipped-lemonade-03-landscape-jg-1622598691.jpg?crop=1.00xw:0.752xh;0,0.151xh&resize=480:*")
        ,Meal("Desserts","https://hips.hearstapps.com/hmg-prod.s3.amazonaws.com/images/delish-190619-air-fryer-donuts-302-landscape-pf-1561758031.jpg?crop=1.00xw:0.752xh;0,0.186xh&resize=980:*")
        ,Meal("Sandwiches","https://hips.hearstapps.com/hmg-prod.s3.amazonaws.com/images/delish-20210423-ultimate-veggie-sandwich-001-ab-1622826517.jpg?resize=980:*"),
        Meal("Burgers","https://hips.hearstapps.com/hmg-prod.s3.amazonaws.com/images/delish-greek-salmon-burgers-1622231969.jpg?crop=0.668xw:1.00xh;0.172xw,0&resize=980:*"),
        Meal("Chicken","https://hips.hearstapps.com/hmg-prod.s3.amazonaws.com/images/delish-20210325-peri-peri-chicken-007-ab-1622216649.jpg?crop=0.901xw:0.880xh;0.0595xw,0.0338xh&resize=980:*")
        , Meal("Soup","https://images.unsplash.com/photo-1613844237701-8f3664fc2eff?ixid=MnwxMjA3fDB8MHxwaG90by1wYWdlfHx8fGVufDB8fHx8&ixlib=rb-1.2.1&auto=format&fit=crop&w=400&q=80"),
        Meal("Fish","https://images.unsplash.com/photo-1519708227418-c8fd9a32b7a2?ixlib=rb-1.2.1&ixid=MnwxMjA3fDB8MHxwaG90by1wYWdlfHx8fGVufDB8fHx8&auto=format&fit=crop&w=750&q=80"),
        Meal("Feta Eggs","https://hips.hearstapps.com/hmg-prod.s3.amazonaws.com/images/delish-210525-bakedeggs-02-landscape-jg-1622840259.jpg?crop=1xw:0.9168905168905169xh;center,top&resize=980:*")
    , Meal("Ice Cream","https://hips.hearstapps.com/hmg-prod.s3.amazonaws.com/images/210331-delish-no-churn-ice-cream-21561-eb-1622839116.jpg?crop=1.00xw:1.00xh;0,0&resize=980:*")
    )
}