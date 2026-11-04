package io.intercom.android.sdk.carousel;

import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.n0;
import java.util.List;

/* JADX INFO: loaded from: classes13.dex */
public class CarouselScreenPagerAdapter extends n0 {
    private List<CarouselScreenFragment> fragments;

    public CarouselScreenPagerAdapter(FragmentManager fragmentManager, List<CarouselScreenFragment> list) {
        super(fragmentManager);
        this.fragments = list;
    }

    @Override // androidx.viewpager.widget.a
    public int getCount() {
        return this.fragments.size();
    }

    @Override // androidx.fragment.app.n0
    public Fragment getItem(int i10) {
        return this.fragments.get(i10);
    }
}
