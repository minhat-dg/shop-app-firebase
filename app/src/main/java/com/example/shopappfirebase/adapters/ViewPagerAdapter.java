package com.example.shopappfirebase.adapters;

import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentActivity;
import androidx.fragment.app.FragmentStatePagerAdapter;
import androidx.viewpager2.adapter.FragmentStateAdapter;

import com.example.shopappfirebase.fragments.AccountFragment;
import com.example.shopappfirebase.fragments.HomeFragment;
import com.example.shopappfirebase.fragments.SellFragment;

public class ViewPagerAdapter extends FragmentStateAdapter {
    public ViewPagerAdapter(@NonNull FragmentActivity fragmentActivity) {
        super(fragmentActivity);
    }

    @NonNull
    @Override
    public Fragment createFragment(int position) {
        switch (position){
            case 0:
                return new HomeFragment();
            case 1:
                return new SellFragment();
            case 2:
                return new AccountFragment();
            default:
                return new HomeFragment();
        }
    }


    @Override
    public int getItemCount() {
        return 3;
    }
}
