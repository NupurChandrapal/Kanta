package com.brosolved.pejus.kanta.viewModel;

import com.brosolved.pejus.kanta.models.CartProduct;
import com.brosolved.pejus.kanta.models.MSProduct;
import com.brosolved.pejus.kanta.remote.Repository;

import java.util.List;

import androidx.lifecycle.LiveData;
import androidx.lifecycle.ViewModel;

public class DetailsViewModel extends ViewModel {

    public LiveData<CartProduct> addToCart(int user_id, int product_id, int quintiy){
        return Repository.getInstance().addToCart(user_id, product_id, quintiy);
    }

    public LiveData<List<MSProduct>> orderStatus(int user_id){
        return Repository.getInstance().orderStatus(user_id);
    }

    public LiveData<CartProduct> updateStatus(int order_id, int status){
        return Repository.getInstance().updateStatus(order_id, status);
    }

    public LiveData<CartProduct> orderBuyer(int user_id){
        return Repository.getInstance().orderBuyer(user_id);
    }

}
