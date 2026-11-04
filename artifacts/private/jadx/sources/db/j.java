package db;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.annotation.p0;
import androidx.recyclerview.widget.RecyclerView;
import androidx.swiperefreshlayout.widget.SwipeRefreshLayout;
import com.planner5d.library.widget.preloader.PreloaderBoxV2View;

/* JADX INFO: loaded from: classes4.dex */
public final class j implements b4.b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NonNull
    private final FrameLayout f269816a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NonNull
    public final ImageView f269817b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @NonNull
    public final FrameLayout f269818c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @NonNull
    public final TextView f269819d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    @NonNull
    public final TextView f269820e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    @NonNull
    public final ImageView f269821f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    @NonNull
    public final TextView f269822g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    @NonNull
    public final PreloaderBoxV2View f269823h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    @NonNull
    public final RecyclerView f269824i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    @NonNull
    public final TextView f269825j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    @NonNull
    public final TextView f269826k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    @NonNull
    public final TextView f269827l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    @NonNull
    public final SwipeRefreshLayout f269828m;

    private j(@NonNull FrameLayout frameLayout, @NonNull ImageView imageView, @NonNull FrameLayout frameLayout2, @NonNull TextView textView, @NonNull TextView textView2, @NonNull ImageView imageView2, @NonNull TextView textView3, @NonNull PreloaderBoxV2View preloaderBoxV2View, @NonNull RecyclerView recyclerView, @NonNull TextView textView4, @NonNull TextView textView5, @NonNull TextView textView6, @NonNull SwipeRefreshLayout swipeRefreshLayout) {
        this.f269816a = frameLayout;
        this.f269817b = imageView;
        this.f269818c = frameLayout2;
        this.f269819d = textView;
        this.f269820e = textView2;
        this.f269821f = imageView2;
        this.f269822g = textView3;
        this.f269823h = preloaderBoxV2View;
        this.f269824i = recyclerView;
        this.f269825j = textView4;
        this.f269826k = textView5;
        this.f269827l = textView6;
        this.f269828m = swipeRefreshLayout;
    }

    @NonNull
    public static j a(@NonNull View view) {
        int i10 = com.planner5d.library.contest.e.i.f150985p1;
        ImageView imageView = (ImageView) b4.c.a(view, i10);
        if (imageView != null) {
            i10 = com.planner5d.library.contest.e.i.f151000q1;
            FrameLayout frameLayout = (FrameLayout) b4.c.a(view, i10);
            if (frameLayout != null) {
                i10 = com.planner5d.library.contest.e.i.f150792c3;
                TextView textView = (TextView) b4.c.a(view, i10);
                if (textView != null) {
                    i10 = com.planner5d.library.contest.e.i.f150822e3;
                    TextView textView2 = (TextView) b4.c.a(view, i10);
                    if (textView2 != null) {
                        i10 = com.planner5d.library.contest.e.i.f150897j3;
                        ImageView imageView2 = (ImageView) b4.c.a(view, i10);
                        if (imageView2 != null) {
                            i10 = com.planner5d.library.contest.e.i.f151032s3;
                            TextView textView3 = (TextView) b4.c.a(view, i10);
                            if (textView3 != null) {
                                i10 = com.planner5d.library.contest.e.i.f151047t3;
                                PreloaderBoxV2View preloaderBoxV2View = (PreloaderBoxV2View) b4.c.a(view, i10);
                                if (preloaderBoxV2View != null) {
                                    i10 = com.planner5d.library.contest.e.i.B3;
                                    RecyclerView recyclerView = (RecyclerView) b4.c.a(view, i10);
                                    if (recyclerView != null) {
                                        i10 = com.planner5d.library.contest.e.i.G3;
                                        TextView textView4 = (TextView) b4.c.a(view, i10);
                                        if (textView4 != null) {
                                            i10 = com.planner5d.library.contest.e.i.H3;
                                            TextView textView5 = (TextView) b4.c.a(view, i10);
                                            if (textView5 != null) {
                                                i10 = com.planner5d.library.contest.e.i.R3;
                                                TextView textView6 = (TextView) b4.c.a(view, i10);
                                                if (textView6 != null) {
                                                    i10 = com.planner5d.library.contest.e.i.f150898j4;
                                                    SwipeRefreshLayout swipeRefreshLayout = (SwipeRefreshLayout) b4.c.a(view, i10);
                                                    if (swipeRefreshLayout != null) {
                                                        return new j((FrameLayout) view, imageView, frameLayout, textView, textView2, imageView2, textView3, preloaderBoxV2View, recyclerView, textView4, textView5, textView6, swipeRefreshLayout);
                                                    }
                                                }
                                            }
                                        }
                                    }
                                }
                            }
                        }
                    }
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i10)));
    }

    @NonNull
    public static j c(@NonNull LayoutInflater layoutInflater) {
        return d(layoutInflater, null, false);
    }

    @NonNull
    public static j d(@NonNull LayoutInflater layoutInflater, @p0 ViewGroup viewGroup, boolean z10) {
        View viewInflate = layoutInflater.inflate(com.planner5d.library.contest.e.l.f151322w0, viewGroup, false);
        if (z10) {
            viewGroup.addView(viewInflate);
        }
        return a(viewInflate);
    }

    @Override // b4.b
    @NonNull
    /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
    public FrameLayout getRoot() {
        return this.f269816a;
    }
}
