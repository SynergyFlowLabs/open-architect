package com.planner5d.library.widget.carousel;

import androidx.compose.runtime.internal.w0;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.s;
import com.planner5d.library.services.r;
import com.planner5d.library.services.utility.i;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes12.dex */
@w0(parameters = 0)
public final class d extends androidx.viewpager2.adapter.a {

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public static final int f254211n = 8;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    @NotNull
    private final int[] f254212m;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public d(@NotNull int[] list, @NotNull s fa2) {
        super(fa2);
        Intrinsics.checkNotNullParameter(list, "list");
        Intrinsics.checkNotNullParameter(fa2, "fa");
        this.f254212m = list;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.h
    public int getItemCount() {
        return this.f254212m.length;
    }

    @Override // androidx.viewpager2.adapter.a
    @NotNull
    public Fragment j(int i10) {
        ViewPagerCarouselFragment viewPagerCarouselFragment = new ViewPagerCarouselFragment();
        viewPagerCarouselFragment.setArguments(new i().f(r.id, this.f254212m[i10]).a());
        return viewPagerCarouselFragment;
    }
}
