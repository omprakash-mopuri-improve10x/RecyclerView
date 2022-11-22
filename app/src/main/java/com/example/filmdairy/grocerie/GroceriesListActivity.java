package com.example.filmdairy.grocerie;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import com.example.filmdairy.R;

import java.util.ArrayList;

public class GroceriesListActivity extends AppCompatActivity {

    public ArrayList<Grocery> groceriesList;
    public RecyclerView groceriesRv;
    public GroceryAdapter groceryAdapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_groceries_list);
        getSupportActionBar().hide();
        setupData();
        setupGroceriesRecyclerView();
    }

    public void setupData() {
        groceriesList = new ArrayList<>();

        Grocery freshFruits = new Grocery();
        freshFruits.imageUrl = "https://resources.dunzo.com/web-assets/prod/_next/static/images/dunzo-daily-fresh-fruits-3b26c10dc05d15fbe45ceb3d0eaa816d.png";
        freshFruits.title = "Fresh Fruits";
        groceriesList.add(freshFruits);

        Grocery onionsAndTomatoes = new Grocery();
        onionsAndTomatoes.imageUrl = "https://resources.dunzo.com/web-assets/prod/_next/static/images/dunzo-daily-onions-and-tomatos-1986e0017a966f57a20fce08853c25ad.png";
        onionsAndTomatoes.title = "Onions & Tomatoes";
        groceriesList.add(onionsAndTomatoes);

        Grocery freshVegetables = new Grocery();
        freshVegetables.imageUrl = "https://resources.dunzo.com/web-assets/prod/_next/static/images/dunzo-daily-fresh-vegetables-9799bef8ba92fd03c53f0546ae404a55.png";
        freshVegetables.title = "Fresh Vegetables";
        groceriesList.add(freshVegetables);

        Grocery exoticFruits = new Grocery();
        exoticFruits.imageUrl = "https://resources.dunzo.com/web-assets/prod/_next/static/images/dunzo-daily-exotic-fruits-d5fb208beef0323598ebd4e0c676d2b8.png";
        exoticFruits.title = "Exotic Fruits";
        groceriesList.add(exoticFruits);

        Grocery mango = new Grocery();
        mango.imageUrl = "https://resources.dunzo.com/web-assets/prod/_next/static/images/dunzo-daily-mangoes-5dec36e3d054464908f125421f2748c2.png";
        mango.title = "Mangoes";
        groceriesList.add(mango);

        Grocery dairy = new Grocery();
        dairy.imageUrl = "https://resources.dunzo.com/web-assets/prod/_next/static/images/dunzo-daily-dairy-91f031697f2e433799e567f021460f9b.png";
        dairy.title = "Dairy";
        groceriesList.add(dairy);

        Grocery breadAndBuns = new Grocery();
        breadAndBuns.imageUrl = "https://resources.dunzo.com/web-assets/prod/_next/static/images/dunzo-daily-bread-and-buns-ea6fc0dcbc8cd860c88cc1310c64e8d6.png";
        breadAndBuns.title = "Bread & Buns";
        groceriesList.add(breadAndBuns);

        Grocery cerealsAndOats = new Grocery();
        cerealsAndOats.imageUrl = "https://resources.dunzo.com/web-assets/prod/_next/static/images/dunzo-daily-cereal-and-oats-4578a048785cef3231ce946e0385e320.png";
        cerealsAndOats.title = "Cereals & Oats";
        groceriesList.add(cerealsAndOats);

        Grocery healthDrinks = new Grocery();
        healthDrinks.imageUrl = "https://resources.dunzo.com/web-assets/prod/_next/static/images/dunzo-daily-horlicks-25492b5096ad52bcd21607c6fc3f03d9.png";
        healthDrinks.title = "Health Drinks";
        groceriesList.add(healthDrinks);

        Grocery readyToEat = new Grocery();
        readyToEat.imageUrl = "https://resources.dunzo.com/web-assets/prod/_next/static/images/dunzo-daily-ready-to-eat-9f44b2f69ef008732be5de955293bfe5.png";
        readyToEat.title = "Ready-to-eat";
        groceriesList.add(readyToEat);

        Grocery biscuitsAndCookies = new Grocery();
        biscuitsAndCookies.imageUrl = "https://resources.dunzo.com/web-assets/prod/_next/static/images/dunzo-daily-biscuits-and-cookies-ee0423b9d3478a4c7499cf7f1d32e4bf.png";
        biscuitsAndCookies.title = "Biscuits & cookies";
        groceriesList.add(biscuitsAndCookies);

        Grocery chipsAndNamkeen = new Grocery();
        chipsAndNamkeen.imageUrl = "https://resources.dunzo.com/web-assets/prod/_next/static/images/dunzo-daily-chips-and-namkeen-e3d8b0e18b4b6721cc565d03922ca3d5.png";
        chipsAndNamkeen.title = "Chips & Namkeens";
        groceriesList.add(chipsAndNamkeen);

        Grocery teaAndCoffee = new Grocery();
        teaAndCoffee.imageUrl = "https://resources.dunzo.com/web-assets/prod/_next/static/images/dunzo-daily-tea-and-coffee-683381e7427398452e760dfb6c816e1e.png";
        teaAndCoffee.title = "Tea & Coffee";
        groceriesList.add(teaAndCoffee);

        Grocery softDrinksAndJuice = new Grocery();
        softDrinksAndJuice.imageUrl = "https://resources.dunzo.com/web-assets/prod/_next/static/images/dunzo-daily-softdrinks-and-juice-09a3e724b1b1851ffe9747d4c03eb3b7.png";
        softDrinksAndJuice.title = "Soft Drinks & Juice";
        groceriesList.add(softDrinksAndJuice);

        Grocery energyAndSoftDrinks = new Grocery();
        energyAndSoftDrinks.imageUrl = "https://resources.dunzo.com/web-assets/prod/_next/static/images/dunzo-daily-energy-and-sportsdrinks-8dc82b984a9a536206aa8685dce463b8.png";
        energyAndSoftDrinks.title = "Energy & Soft Drinks";
        groceriesList.add(energyAndSoftDrinks);

        Grocery attaAndFlours = new Grocery();
        attaAndFlours.imageUrl = "https://resources.dunzo.com/web-assets/prod/_next/static/images/dunzo-daily-atta-and-flours-b85c359a33d1a017df2ddc830dbb3172.png";
        attaAndFlours.title = "Atta & Flours";
        groceriesList.add(attaAndFlours);

        Grocery backingEssentials = new Grocery();
        backingEssentials.imageUrl = "https://resources.dunzo.com/web-assets/prod/_next/static/images/dunzo-daily-baking-essentials-5b3a70840b2f29a6bfd8f08bbc62c339.png";
        backingEssentials.title = "Backing Essentials";
        groceriesList.add(backingEssentials);

        Grocery cookingPastes = new Grocery();
        cookingPastes.imageUrl = "https://resources.dunzo.com/web-assets/prod/_next/static/images/dunzo-daily-cooking-pastes-75b2e7ccc1255261d1a277d63209b1ae.png";
        cookingPastes.title = "Cooking Pastes";
        groceriesList.add(cookingPastes);

        Grocery masalaAndSpices = new Grocery();
        masalaAndSpices.imageUrl = "https://resources.dunzo.com/web-assets/prod/_next/static/images/dunzo-daily-masala-and-spices-985e3e74c25545edecc6e13b3f3728fb.png";
        masalaAndSpices.title = "Masala & Spices";
        groceriesList.add(masalaAndSpices);

        Grocery cannedFruitsAndVegetables = new Grocery();
        cannedFruitsAndVegetables.imageUrl = "https://resources.dunzo.com/web-assets/prod/_next/static/images/dunzo-daily-canned-fruit-and-vegetables-c6adef7534b8faa7100c671daab54e2f.png";
        cannedFruitsAndVegetables.title = "Canned Fruits & Vegetables";
        groceriesList.add(cannedFruitsAndVegetables);

        Grocery chicken = new Grocery();
        chicken.imageUrl = "https://resources.dunzo.com/web-assets/prod/_next/static/images/dunzo-daily-chicken-8883976089fb7016f8b1e0f058fcdd8a.png";
        chicken.title = "Chicken";
        groceriesList.add(chicken);

        Grocery fishAndSeafood = new Grocery();
        fishAndSeafood.imageUrl = "https://resources.dunzo.com/web-assets/prod/_next/static/images/dunzo-daily-fish-and-seafood-b692e65b128c6dc49d42a4c39b8dac92.png";
        fishAndSeafood.title = "Fish & seafood";
        groceriesList.add(fishAndSeafood);

        Grocery mutton = new Grocery();
        mutton.imageUrl = "https://resources.dunzo.com/web-assets/prod/_next/static/images/dunzo-daily-mutton-af19fffe878f5d0e057cc44865967cb5.png";
        mutton.title = "Mutton";
        groceriesList.add(mutton);

        Grocery marinatedCuts = new Grocery();
        marinatedCuts.imageUrl = "https://resources.dunzo.com/web-assets/prod/_next/static/images/dunzo-daily-marinated-cuts-daf965857a0904ab3cc263e2e3c1f672.png";
        marinatedCuts.title = "Marinated cuts";
        groceriesList.add(marinatedCuts);

        Grocery eggs = new Grocery();
        eggs.imageUrl = "https://resources.dunzo.com/web-assets/prod/_next/static/images/dunzo-daily-eggs-e1f42bcafd6d5cd04084de21bad9c494.png";
        eggs.title = "Eggs";
        groceriesList.add(eggs);
    }

    public void setupGroceriesRecyclerView() {
        groceriesRv = findViewById(R.id.groceries_rv);
        groceriesRv.setLayoutManager(new GridLayoutManager(this, 3));
        groceryAdapter = new GroceryAdapter();
        groceryAdapter.setData(groceriesList);
        groceriesRv.setAdapter(groceryAdapter);
    }
}