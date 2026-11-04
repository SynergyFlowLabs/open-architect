package db;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.Space;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.annotation.p0;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.planner5d.library.widget.ContestPlaceBadgeView;
import com.planner5d.library.widget.ProfileIconView;
import com.planner5d.library.widget.RoundedCornersLayout;
import com.planner5d.library.widget.preloader.PreloaderBoxV2View;

/* JADX INFO: loaded from: classes4.dex */
public final class h implements b4.b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NonNull
    private final FrameLayout f269794a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NonNull
    public final ImageView f269795b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @NonNull
    public final FrameLayout f269796c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @NonNull
    public final TextView f269797d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    @NonNull
    public final TextView f269798e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    @NonNull
    public final TextView f269799f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    @NonNull
    public final PreloaderBoxV2View f269800g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    @NonNull
    public final ConstraintLayout f269801h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    @NonNull
    public final TextView f269802i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    @NonNull
    public final Space f269803j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    @NonNull
    public final RoundedCornersLayout f269804k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    @NonNull
    public final ProfileIconView f269805l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    @NonNull
    public final TextView f269806m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    @NonNull
    public final ContestPlaceBadgeView f269807n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    @NonNull
    public final TextView f269808o;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    @NonNull
    public final LinearLayout f269809s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    @NonNull
    public final RoundedCornersLayout f269810t;

    private h(@NonNull FrameLayout frameLayout, @NonNull ImageView imageView, @NonNull FrameLayout frameLayout2, @NonNull TextView textView, @NonNull TextView textView2, @NonNull TextView textView3, @NonNull PreloaderBoxV2View preloaderBoxV2View, @NonNull ConstraintLayout constraintLayout, @NonNull TextView textView4, @NonNull Space space, @NonNull RoundedCornersLayout roundedCornersLayout, @NonNull ProfileIconView profileIconView, @NonNull TextView textView5, @NonNull ContestPlaceBadgeView contestPlaceBadgeView, @NonNull TextView textView6, @NonNull LinearLayout linearLayout, @NonNull RoundedCornersLayout roundedCornersLayout2) {
        this.f269794a = frameLayout;
        this.f269795b = imageView;
        this.f269796c = frameLayout2;
        this.f269797d = textView;
        this.f269798e = textView2;
        this.f269799f = textView3;
        this.f269800g = preloaderBoxV2View;
        this.f269801h = constraintLayout;
        this.f269802i = textView4;
        this.f269803j = space;
        this.f269804k = roundedCornersLayout;
        this.f269805l = profileIconView;
        this.f269806m = textView5;
        this.f269807n = contestPlaceBadgeView;
        this.f269808o = textView6;
        this.f269809s = linearLayout;
        this.f269810t = roundedCornersLayout2;
    }

    @NonNull
    public static h a(@NonNull View view) {
        int i10 = com.planner5d.library.contest.e.i.J2;
        ImageView imageView = (ImageView) b4.c.a(view, i10);
        if (imageView != null) {
            i10 = com.planner5d.library.contest.e.i.K2;
            FrameLayout frameLayout = (FrameLayout) b4.c.a(view, i10);
            if (frameLayout != null) {
                i10 = com.planner5d.library.contest.e.i.M2;
                TextView textView = (TextView) b4.c.a(view, i10);
                if (textView != null) {
                    i10 = com.planner5d.library.contest.e.i.N2;
                    TextView textView2 = (TextView) b4.c.a(view, i10);
                    if (textView2 != null) {
                        i10 = com.planner5d.library.contest.e.i.P2;
                        TextView textView3 = (TextView) b4.c.a(view, i10);
                        if (textView3 != null) {
                            i10 = com.planner5d.library.contest.e.i.Q2;
                            PreloaderBoxV2View preloaderBoxV2View = (PreloaderBoxV2View) b4.c.a(view, i10);
                            if (preloaderBoxV2View != null) {
                                i10 = com.planner5d.library.contest.e.i.R2;
                                ConstraintLayout constraintLayout = (ConstraintLayout) b4.c.a(view, i10);
                                if (constraintLayout != null) {
                                    i10 = com.planner5d.library.contest.e.i.S2;
                                    TextView textView4 = (TextView) b4.c.a(view, i10);
                                    if (textView4 != null) {
                                        i10 = com.planner5d.library.contest.e.i.T2;
                                        Space space = (Space) b4.c.a(view, i10);
                                        if (space != null) {
                                            i10 = com.planner5d.library.contest.e.i.U2;
                                            RoundedCornersLayout roundedCornersLayout = (RoundedCornersLayout) b4.c.a(view, i10);
                                            if (roundedCornersLayout != null) {
                                                i10 = com.planner5d.library.contest.e.i.V2;
                                                ProfileIconView profileIconView = (ProfileIconView) b4.c.a(view, i10);
                                                if (profileIconView != null) {
                                                    i10 = com.planner5d.library.contest.e.i.W2;
                                                    TextView textView5 = (TextView) b4.c.a(view, i10);
                                                    if (textView5 != null) {
                                                        i10 = com.planner5d.library.contest.e.i.X2;
                                                        ContestPlaceBadgeView contestPlaceBadgeView = (ContestPlaceBadgeView) b4.c.a(view, i10);
                                                        if (contestPlaceBadgeView != null) {
                                                            i10 = com.planner5d.library.contest.e.i.Y2;
                                                            TextView textView6 = (TextView) b4.c.a(view, i10);
                                                            if (textView6 != null) {
                                                                i10 = com.planner5d.library.contest.e.i.f150762a3;
                                                                LinearLayout linearLayout = (LinearLayout) b4.c.a(view, i10);
                                                                if (linearLayout != null) {
                                                                    i10 = com.planner5d.library.contest.e.i.f150777b3;
                                                                    RoundedCornersLayout roundedCornersLayout2 = (RoundedCornersLayout) b4.c.a(view, i10);
                                                                    if (roundedCornersLayout2 != null) {
                                                                        return new h((FrameLayout) view, imageView, frameLayout, textView, textView2, textView3, preloaderBoxV2View, constraintLayout, textView4, space, roundedCornersLayout, profileIconView, textView5, contestPlaceBadgeView, textView6, linearLayout, roundedCornersLayout2);
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
                    }
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i10)));
    }

    @NonNull
    public static h c(@NonNull LayoutInflater layoutInflater) {
        return d(layoutInflater, null, false);
    }

    @NonNull
    public static h d(@NonNull LayoutInflater layoutInflater, @p0 ViewGroup viewGroup, boolean z10) {
        View viewInflate = layoutInflater.inflate(com.planner5d.library.contest.e.l.f151318v0, viewGroup, false);
        if (z10) {
            viewGroup.addView(viewInflate);
        }
        return a(viewInflate);
    }

    @Override // b4.b
    @NonNull
    /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
    public FrameLayout getRoot() {
        return this.f269794a;
    }
}
