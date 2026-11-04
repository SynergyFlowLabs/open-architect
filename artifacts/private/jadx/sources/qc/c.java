package qc;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.ImageButton;
import android.widget.LinearLayout;
import androidx.annotation.NonNull;
import androidx.annotation.p0;
import com.google.android.material.tabs.TabLayout;
import com.planner5d.library.widget.preloader.PreloaderBoxView;

/* JADX INFO: loaded from: classes7.dex */
public final class c implements b4.b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NonNull
    private final FrameLayout f350310a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NonNull
    public final ImageButton f350311b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @NonNull
    public final FrameLayout f350312c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @NonNull
    public final LinearLayout f350313d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    @NonNull
    public final PreloaderBoxView f350314e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    @NonNull
    public final TabLayout f350315f;

    private c(@NonNull FrameLayout frameLayout, @NonNull ImageButton imageButton, @NonNull FrameLayout frameLayout2, @NonNull LinearLayout linearLayout, @NonNull PreloaderBoxView preloaderBoxView, @NonNull TabLayout tabLayout) {
        this.f350310a = frameLayout;
        this.f350311b = imageButton;
        this.f350312c = frameLayout2;
        this.f350313d = linearLayout;
        this.f350314e = preloaderBoxView;
        this.f350315f = tabLayout;
    }

    @NonNull
    public static c a(@NonNull View view) {
        int i10 = pc.b.i.f343102a2;
        ImageButton imageButton = (ImageButton) b4.c.a(view, i10);
        if (imageButton != null) {
            i10 = pc.b.i.f343163e3;
            FrameLayout frameLayout = (FrameLayout) b4.c.a(view, i10);
            if (frameLayout != null) {
                i10 = pc.b.i.Y4;
                LinearLayout linearLayout = (LinearLayout) b4.c.a(view, i10);
                if (linearLayout != null) {
                    i10 = pc.b.i.f343199g9;
                    PreloaderBoxView preloaderBoxView = (PreloaderBoxView) b4.c.a(view, i10);
                    if (preloaderBoxView != null) {
                        i10 = pc.b.i.Qb;
                        TabLayout tabLayout = (TabLayout) b4.c.a(view, i10);
                        if (tabLayout != null) {
                            return new c((FrameLayout) view, imageButton, frameLayout, linearLayout, preloaderBoxView, tabLayout);
                        }
                    }
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i10)));
    }

    @NonNull
    public static c c(@NonNull LayoutInflater layoutInflater) {
        return d(layoutInflater, null, false);
    }

    @NonNull
    public static c d(@NonNull LayoutInflater layoutInflater, @p0 ViewGroup viewGroup, boolean z10) {
        View viewInflate = layoutInflater.inflate(pc.b.l.f343565b0, viewGroup, false);
        if (z10) {
            viewGroup.addView(viewInflate);
        }
        return a(viewInflate);
    }

    @Override // b4.b
    @NonNull
    /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
    public FrameLayout getRoot() {
        return this.f350310a;
    }
}
