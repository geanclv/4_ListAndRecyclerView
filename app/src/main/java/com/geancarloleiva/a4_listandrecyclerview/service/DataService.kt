package com.geancarloleiva.a4_listandrecyclerview.service

import com.geancarloleiva.a4_listandrecyclerview.model.Category
import com.geancarloleiva.a4_listandrecyclerview.model.Product

//This class will implement Singleton pattern
object DataService {

    val lstCategory = listOf<Category>(
        Category("JOGGER", "joggerimage"),
        Category("SHIRTS", "shirtimage")
    )

    val lstJogger = listOf<Product>(
        Product("Jogger 1", "S/ 100.00", "img1"),
        Product("Jogger 2", "S/ 140.00", "img2"),
        Product("Jogger 3", "S/ 90.00", "img3"),
        Product("Jogger 4", "S/ 130.00", "img4"),
        Product("Jogger 5", "S/ 120.00", "img5")
    )

    val lstTshirt = listOf<Product>(
        Product("Tshirt 1", "S/ 40.00", "img1"),
        Product("Tshirt 2", "S/ 80.00", "img2"),
        Product("Tshirt 3", "S/ 180.00", "img3"),
        Product("Tshirt 4", "S/ 120.00", "img4"),
        Product("Tshirt 5", "S/ 45.00", "img5"),
        Product("Tshirt 6", "S/ 10.00", "img6"),
        Product("Tshirt 7", "S/ 110.00", "img7")
    )
}