package com.brosolved.pejus.kanta.viewModel;

import com.brosolved.pejus.kanta.models.Categories;
import com.brosolved.pejus.kanta.models.Product;
import com.brosolved.pejus.kanta.models.Status;
import com.brosolved.pejus.kanta.remote.Repository;
import com.brosolved.pejus.kanta.MainActivity;

import java.util.List;

import androidx.lifecycle.LiveData;
import androidx.lifecycle.ViewModel;

public class ProductViewModel extends ViewModel {

    public LiveData<Categories> getCategory(){
        return Repository.getInstance().loadAllCategories();
    }

    public LiveData<Boolean> addProduct(Product product){
        return Repository.getInstance().addProduct(product, String.valueOf(MainActivity.userInfo.getId()));
    }

    public LiveData<List<Product>> getProducts(int id){
        return Repository.getInstance().loadAllProducts(id);
    }

    public  LiveData<Status> delete(int id){
        return Repository.getInstance().delteProduct(id);
    }

    public LiveData<Product> update(Product product){
        return Repository.getInstance().updateProduct(product);
    }
}
