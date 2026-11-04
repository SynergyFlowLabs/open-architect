package db;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.annotation.p0;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.recyclerview.widget.RecyclerView;
import com.planner5d.library.widget.AnimatedImageView;
import com.planner5d.library.widget.preloader.PreloaderBoxV2View;

/* JADX INFO: loaded from: classes4.dex */
public final class b implements b4.b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NonNull
    private final ConstraintLayout f269749a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NonNull
    public final TextView f269750b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @NonNull
    public final AnimatedImageView f269751c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @NonNull
    public final TextView f269752d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    @NonNull
    public final TextView f269753e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    @NonNull
    public final ImageView f269754f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    @NonNull
    public final TextView f269755g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    @NonNull
    public final PreloaderBoxV2View f269756h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    @NonNull
    public final RecyclerView f269757i;

    private b(@NonNull ConstraintLayout constraintLayout, @NonNull TextView textView, @NonNull AnimatedImageView animatedImageView, @NonNull TextView textView2, @NonNull TextView textView3, @NonNull ImageView imageView, @NonNull TextView textView4, @NonNull PreloaderBoxV2View preloaderBoxV2View, @NonNull RecyclerView recyclerView) {
        this.f269749a = constraintLayout;
        this.f269750b = textView;
        this.f269751c = animatedImageView;
        this.f269752d = textView2;
        this.f269753e = textView3;
        this.f269754f = imageView;
        this.f269755g = textView4;
        this.f269756h = preloaderBoxV2View;
        this.f269757i = recyclerView;
    }

    @NonNull
    public static b a(@NonNull View view) {
        int i10 = com.planner5d.library.contest.e.i.f150807d3;
        TextView textView = (TextView) b4.c.a(view, i10);
        if (textView != null) {
            i10 = com.planner5d.library.contest.e.i.f151062u3;
            AnimatedImageView animatedImageView = (AnimatedImageView) b4.c.a(view, i10);
            if (animatedImageView != null) {
                i10 = com.planner5d.library.contest.e.i.f151077v3;
                TextView textView2 = (TextView) b4.c.a(view, i10);
                if (textView2 != null) {
                    i10 = com.planner5d.library.contest.e.i.f151092w3;
                    TextView textView3 = (TextView) b4.c.a(view, i10);
                    if (textView3 != null) {
                        i10 = com.planner5d.library.contest.e.i.f151107x3;
                        ImageView imageView = (ImageView) b4.c.a(view, i10);
                        if (imageView != null) {
                            i10 = com.planner5d.library.contest.e.i.f151137z3;
                            TextView textView4 = (TextView) b4.c.a(view, i10);
                            if (textView4 != null) {
                                i10 = com.planner5d.library.contest.e.i.A3;
                                PreloaderBoxV2View preloaderBoxV2View = (PreloaderBoxV2View) b4.c.a(view, i10);
                                if (preloaderBoxV2View != null) {
                                    i10 = com.planner5d.library.contest.e.i.B3;
                                    RecyclerView recyclerView = (RecyclerView) b4.c.a(view, i10);
                                    if (recyclerView != null) {
                                        return new b((ConstraintLayout) view, textView, animatedImageView, textView2, textView3, imageView, textView4, preloaderBoxV2View, recyclerView);
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
    public static b c(@NonNull LayoutInflater layoutInflater) {
        return d(layoutInflater, null, false);
    }

    @NonNull
    public static b d(@NonNull LayoutInflater layoutInflater, @p0 ViewGroup viewGroup, boolean z10) {
        View viewInflate = layoutInflater.inflate(com.planner5d.library.contest.e.l.X, viewGroup, false);
        if (z10) {
            viewGroup.addView(viewInflate);
        }
        return a(viewInflate);
    }

    @Override // b4.b
    @NonNull
    /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
    public ConstraintLayout getRoot() {
        return this.f269749a;
    }
}
