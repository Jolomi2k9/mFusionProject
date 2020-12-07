package com.example.mfusionclone.screens.menu

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel

class MenuViewModel : ViewModel() {

    /**
     * The various menu items, stored in as mutable live data.
     * This item can only be accessed by members of this class.
     */
    private val _menuOrderItems = MutableLiveData<MutableList<String>>()
    /**
     * Create a version of menu item that can be read, but not modified
     * from external members.
     */
    val menuOrderItems: LiveData<MutableList<String>>
        get() = _menuOrderItems

    /**
     * The various menu items prices, stored in as mutable live data.
     * This item can only be accessed by members of this class.
     */
    private val _menuOrderPrice = MutableLiveData<MutableList<Double>>()
    /**
     * Create a version of menu order price that can be read, but not modified
     * from external members.
     */
    val menuOrderPrice: LiveData<MutableList<Double>>
        get() = _menuOrderPrice


    /**Variable to hold the order total*/
    private var _menuOrderTotal = MutableLiveData<MutableList<Double>>()

    val menuOrderTotal: LiveData<MutableList<Double>>
        get() = _menuOrderTotal

    /**
     * initializing the menu item lists
     */
    private lateinit var OrderItems: MutableList<String>

    /**
     * initializing the menu item lists
     */
    private lateinit var menuItemList: MutableList<String>

    /**
     * initializing the menu price lists
     */
    private lateinit var menuListPrice: MutableList<Double>


    /**
     *Menu items
     */
    private fun menuLists(){
        menuItemList = mutableListOf(
            "Rice",
            "Chicken",
            "Soda",
            "Soup"
        )
    }

    /**
     *Menu prices
     */
    private fun menuPrices(){
        menuListPrice = mutableListOf(
            4.20,
            6.70,
            7.50,
            3.50
        )
    }



    init {

       /* _menuOrderTotal.value?.add(0.0)

        _menuOrderItems.value?.add("")

        _menuOrderPrice.value?.add(0.0) */
    }

     fun addToOrder(num: Int){
        _menuOrderItems.value?.add(menuItemList[num])
        _menuOrderPrice.value?.add(menuListPrice[num])

         orderTotal()
    }

    fun removeOrderItem(num: Int){
        _menuOrderItems.value?.removeAt(num)
        _menuOrderPrice.value?.removeAt(num)

        orderTotal()
    }

    fun orderTotal(){
        /** */
        var prices = mutableListOf(_menuOrderPrice)

        /**Loops through the prices and adds each to menuOrderTotal*/
        /*for (i in prices){
            _menuOrderTotal += i
        }*/
    }


}