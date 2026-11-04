package rd;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.annotation.NonNull;
import androidx.annotation.p0;
import androidx.viewpager2.widget.ViewPager2;

/* JADX INFO: loaded from: classes10.dex */
public final class l implements b4.b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NonNull
    private final ViewPager2 f366631a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NonNull
    public final ViewPager2 f366632b;

    private l(@NonNull ViewPager2 viewPager2, @NonNull ViewPager2 viewPager3) {
        this.f366631a = viewPager2;
        this.f366632b = viewPager3;
    }

    @NonNull
    public static l a(@NonNull View view) {
        if (view == null) {
            throw new NullPointerException("rootView");
        }
        ViewPager2 viewPager2 = (ViewPager2) view;
        return new l(viewPager2, viewPager2);
    }

    @NonNull
    public static l c(@NonNull LayoutInflater layoutInflater) {
        return d(layoutInflater, null, false);
    }

    @NonNull
    public static l d(@NonNull LayoutInflater layoutInflater, @p0 ViewGroup viewGroup, boolean z10) {
        View viewInflate = layoutInflater.inflate(qd.b.l.f352673l1, viewGroup, false);
        if (z10) {
            viewGroup.addView(viewInflate);
        }
        return a(viewInflate);
    }

    @Override // b4.b
    @NonNull
    /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
    public ViewPager2 getRoot() {
        return this.f366631a;
    }
}
