package com.geancarloleiva.a4_listandrecyclerview.service

import com.geancarloleiva.a4_listandrecyclerview.model.Category
import com.geancarloleiva.a4_listandrecyclerview.model.Product

//This class will implement Singleton pattern
object DataService {

    val lstCategory = listOf<Category>(
        Category("JOGGER", "cat_jogger"),
        Category("SHIRTS", "cat_tshirt"),
        Category("JOGGER 2", "cat_jogger"),
        Category("SHIRTS 2", "cat_tshirt"),
        Category("JOGGER 3", "cat_jogger"),
        Category("SHIRTS 3", "cat_tshirt"),
        Category("JOGGER 4", "cat_jogger"),
        Category("SHIRTS 4", "cat_tshirt"),
        Category("JOGGER 5", "cat_jogger"),
        Category("SHIRTS 5", "cat_tshirt"),
        Category("JOGGER 6", "cat_jogger"),
        Category("SHIRTS 6", "cat_tshirt"),
        Category("JOGGER 7", "cat_jogger"),
        Category("SHIRTS 7", "cat_tshirt"),
        Category("JOGGER 8", "cat_jogger"),
        Category("SHIRTS 8", "cat_tshirt")
    )

    val lstJogger = listOf<Product>(
        Product("Jogger 1", "S/ 100.00", "jogger_1"),
        Product("Jogger 2", "S/ 140.00", "jogger_2"),
        Product("Jogger 3", "S/ 90.00", "jogger_1"),
        Product("Jogger 4", "S/ 130.00", "jogger_2"),
        Product("Jogger 5", "S/ 120.00", "jogger_1")
    )

    val lstTshirt = listOf<Product>(
        Product("Tshirt 1", "S/ 40.00", "tshirt_1"),
        Product("Tshirt 2", "S/ 80.00", "tshirt_2"),
        Product("Tshirt 3", "S/ 180.00", "tshirt_1"),
        Product("Tshirt 4", "S/ 120.00", "tshirt_2"),
        Product("Tshirt 5", "S/ 45.00", "tshirt_1"),
        Product("Tshirt 6", "S/ 10.00", "tshirt_2"),
        Product("Tshirt 7", "S/ 110.00", "tshirt_1")
    )
}