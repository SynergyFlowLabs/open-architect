package qc;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.annotation.NonNull;
import androidx.annotation.p0;
import androidx.viewpager.widget.ViewPager;

/* JADX INFO: loaded from: classes7.dex */
public final class a implements b4.b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NonNull
    private final ViewPager f350303a;

    private a(@NonNull ViewPager viewPager) {
        this.f350303a = viewPager;
    }

    @NonNull
    public static a a(@NonNull View view) {
        if (view != null) {
            return new a((ViewPager) view);
        }
        throw new NullPointerException("rootView");
    }

    @NonNull
    public static a c(@NonNull LayoutInflater layoutInflater) {
        return d(layoutInflater, null, false);
    }

    @NonNull
    public static a d(@NonNull LayoutInflater layoutInflater, @p0 ViewGroup viewGroup, boolean z10) {
        View viewInflate = layoutInflater.inflate(pc.b.l.W, viewGroup, false);
        if (z10) {
            viewGroup.addView(viewInflate);
        }
        return a(viewInflate);
    }

    @Override // b4.b
    @NonNull
    /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
    public ViewPager getRoot() {
        return this.f350303a;
    }
}
