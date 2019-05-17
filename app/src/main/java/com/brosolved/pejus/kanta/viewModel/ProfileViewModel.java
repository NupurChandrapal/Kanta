package com.brosolved.pejus.kanta.viewModel;

import com.brosolved.pejus.kanta.models.UserInfo;
import com.brosolved.pejus.kanta.remote.Repository;

import androidx.lifecycle.LiveData;
import androidx.lifecycle.ViewModel;

public class ProfileViewModel extends ViewModel {

    public LiveData<UserInfo> updateUserInfo(UserInfo userInfo){
        return Repository.getInstance().updateUserInfo(userInfo);
    }
}
