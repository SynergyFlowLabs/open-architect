package androidx.viewpager2.widget;

import android.view.View;
import android.view.ViewParent;
import androidx.annotation.NonNull;
import androidx.annotation.t0;
import androidx.core.util.t;
import androidx.recyclerview.widget.RecyclerView;

/* JADX INFO: loaded from: classes3.dex */
public final class e implements ViewPager2.m {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final int f76233a;

    public e(@t0 int i10) {
        t.j(i10, "Margin must be non-negative");
        this.f76233a = i10;
    }

    private ViewPager2 b(@NonNull View view) {
        ViewParent parent = view.getParent();
        ViewParent parent2 = parent.getParent();
        if ((parent instanceof RecyclerView) && (parent2 instanceof ViewPager2)) {
            return (ViewPager2) parent2;
        }
        throw new IllegalStateException("Expected the page view to be managed by a ViewPager2 instance.");
    }

    @Override // androidx.viewpager2.widget.ViewPager2.m
    public void a(@NonNull View view, float f10) {
        ViewPager2 viewPager2B = b(view);
        float f11 = this.f76233a * f10;
        if (viewPager2B.getOrientation() != 0) {
            view.setTranslationY(f11);
            return;
        }
        if (viewPager2B.l()) {
            f11 = -f11;
        }
        view.setTranslationX(f11);
    }
}
