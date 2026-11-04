package db;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.annotation.p0;
import androidx.compose.ui.platform.ComposeView;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import com.planner5d.library.widget.AppBarLayout;
import com.planner5d.library.widget.preloader.PreloaderSimpleV2View;

/* JADX INFO: loaded from: classes4.dex */
public final class k implements b4.b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NonNull
    private final CoordinatorLayout f269829a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NonNull
    public final AppBarLayout f269830b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @NonNull
    public final PreloaderSimpleV2View f269831c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @NonNull
    public final TextView f269832d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    @NonNull
    public final ImageView f269833e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    @NonNull
    public final ComposeView f269834f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    @NonNull
    public final ComposeView f269835g;

    private k(@NonNull CoordinatorLayout coordinatorLayout, @NonNull AppBarLayout appBarLayout, @NonNull PreloaderSimpleV2View preloaderSimpleV2View, @NonNull TextView textView, @NonNull ImageView imageView, @NonNull ComposeView composeView, @NonNull ComposeView composeView2) {
        this.f269829a = coordinatorLayout;
        this.f269830b = appBarLayout;
        this.f269831c = preloaderSimpleV2View;
        this.f269832d = textView;
        this.f269833e = imageView;
        this.f269834f = composeView;
        this.f269835g = composeView2;
    }

    @NonNull
    public static k a(@NonNull View view) {
        int i10 = com.planner5d.library.contest.e.i.f150805d1;
        AppBarLayout appBarLayout = (AppBarLayout) b4.c.a(view, i10);
        if (appBarLayout != null) {
            i10 = com.planner5d.library.contest.e.i.E3;
            PreloaderSimpleV2View preloaderSimpleV2View = (PreloaderSimpleV2View) b4.c.a(view, i10);
            if (preloaderSimpleV2View != null) {
                i10 = com.planner5d.library.contest.e.i.F3;
                TextView textView = (TextView) b4.c.a(view, i10);
                if (textView != null) {
                    i10 = com.planner5d.library.contest.e.i.Q3;
                    ImageView imageView = (ImageView) b4.c.a(view, i10);
                    if (imageView != null) {
                        i10 = com.planner5d.library.contest.e.i.O9;
                        ComposeView composeView = (ComposeView) b4.c.a(view, i10);
                        if (composeView != null) {
                            i10 = com.planner5d.library.contest.e.i.f150994pa;
                            ComposeView composeView2 = (ComposeView) b4.c.a(view, i10);
                            if (composeView2 != null) {
                                return new k((CoordinatorLayout) view, appBarLayout, preloaderSimpleV2View, textView, imageView, composeView, composeView2);
                            }
                        }
                    }
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i10)));
    }

    @NonNull
    public static k c(@NonNull LayoutInflater layoutInflater) {
        return d(layoutInflater, null, false);
    }

    @NonNull
    public static k d(@NonNull LayoutInflater layoutInflater, @p0 ViewGroup viewGroup, boolean z10) {
        View viewInflate = layoutInflater.inflate(com.planner5d.library.contest.e.l.f151326x0, viewGroup, false);
        if (z10) {
            viewGroup.addView(viewInflate);
        }
        return a(viewInflate);
    }

    @Override // b4.b
    @NonNull
    /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
    public CoordinatorLayout getRoot() {
        return this.f269829a;
    }
}
