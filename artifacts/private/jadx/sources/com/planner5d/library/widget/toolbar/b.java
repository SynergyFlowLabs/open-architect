package com.planner5d.library.widget.toolbar;

import android.view.View;
import androidx.compose.runtime.internal.w0;
import androidx.viewpager2.widget.ViewPager2;
import com.planner5d.library.widget.AppBarLayout;
import java.lang.ref.WeakReference;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes8.dex */
@w0(parameters = 0)
public final class b extends ViewPager2.j {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final int f258837d = 8;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    private final ij.c<View> f258838a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NotNull
    private final c f258839b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @NotNull
    private final WeakReference<AppBarLayout> f258840c;

    public b(@NotNull AppBarLayout appBarLayout, @NotNull ij.c<View> rootView) {
        Intrinsics.checkNotNullParameter(appBarLayout, "appBarLayout");
        Intrinsics.checkNotNullParameter(rootView, "rootView");
        this.f258838a = rootView;
        this.f258839b = new c(null, 1, null);
        this.f258840c = new WeakReference<>(appBarLayout);
    }

    @Override // androidx.viewpager2.widget.ViewPager2.j
    public void a(int i10) {
        AppBarLayout appBarLayout;
        if (i10 == 0) {
            c cVar = this.f258839b;
            View view = this.f258838a.get();
            if (view != null && (appBarLayout = this.f258840c.get()) != null) {
                cVar.c(view, appBarLayout);
            }
        }
    }
}
