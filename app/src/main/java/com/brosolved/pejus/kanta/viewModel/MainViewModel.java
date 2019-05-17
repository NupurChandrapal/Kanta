package com.brosolved.pejus.kanta.viewModel;

import com.brosolved.pejus.kanta.models.MutableUser;
import com.brosolved.pejus.kanta.models.User;
import com.brosolved.pejus.kanta.remote.Repository;

import androidx.lifecycle.LiveData;
import androidx.lifecycle.ViewModel;

public class MainViewModel extends ViewModel {



    public LiveData<User> getUserInfo(String number){

        return Repository.getInstance().loadUser(number);

    }

    public LiveData<MutableUser> addOrGet(String number, String isBuyer) {return  Repository.getInstance().addOrGet(number, isBuyer);}

}
