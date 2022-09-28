package com.example.inventory.data


import androidx.room.ColumnInfo
import androidx.room.Entity
import androidx.room.PrimaryKey
import java.text.NumberFormat


fun Item.getFormattedPrice(): String =
    NumberFormat.getCurrencyInstance().format(itemPrice)

@Entity
data class Item(
    @PrimaryKey(autoGenerate = true)
    val id: Int = 0,
    @ColumnInfo
    val itemName: String,
    @ColumnInfo
    val itemPrice: Double,
    @ColumnInfo
    val quantityInStock: Int,
) {
}
