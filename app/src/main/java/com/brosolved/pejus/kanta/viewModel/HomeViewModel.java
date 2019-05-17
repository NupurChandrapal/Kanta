package com.brosolved.pejus.kanta.viewModel;

import com.brosolved.pejus.kanta.models.Categories;
import com.brosolved.pejus.kanta.models.Products;
import com.brosolved.pejus.kanta.remote.Repository;

import androidx.lifecycle.LiveData;
import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.ViewModel;

public class HomeViewModel extends ViewModel {

    private static final String TAG = "HomeViewModel";

    public MutableLiveData<Categories> getCategories(){
        return Repository.getInstance().loadAllCategories();
    }

    public LiveData<Products> getProducts(){
        return Repository.getInstance().loadAllProducts();
    }
}
