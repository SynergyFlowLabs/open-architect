package db;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.annotation.p0;
import androidx.constraintlayout.helper.widget.Flow;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.planner5d.library.contest.view.prize.ContestPrizeView;
import com.planner5d.library.widget.AnimatedImageView;
import com.planner5d.library.widget.preloader.PreloaderSimpleV2View;

/* JADX INFO: loaded from: classes4.dex */
public final class e implements b4.b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NonNull
    private final ConstraintLayout f269772a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NonNull
    public final AnimatedImageView f269773b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @NonNull
    public final ImageView f269774c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @NonNull
    public final TextView f269775d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    @NonNull
    public final ContestPrizeView f269776e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    @NonNull
    public final ContestPrizeView f269777f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    @NonNull
    public final ContestPrizeView f269778g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    @NonNull
    public final Flow f269779h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    @NonNull
    public final TextView f269780i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    @NonNull
    public final PreloaderSimpleV2View f269781j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    @NonNull
    public final TextView f269782k;

    private e(@NonNull ConstraintLayout constraintLayout, @NonNull AnimatedImageView animatedImageView, @NonNull ImageView imageView, @NonNull TextView textView, @NonNull ContestPrizeView contestPrizeView, @NonNull ContestPrizeView contestPrizeView2, @NonNull ContestPrizeView contestPrizeView3, @NonNull Flow flow, @NonNull TextView textView2, @NonNull PreloaderSimpleV2View preloaderSimpleV2View, @NonNull TextView textView3) {
        this.f269772a = constraintLayout;
        this.f269773b = animatedImageView;
        this.f269774c = imageView;
        this.f269775d = textView;
        this.f269776e = contestPrizeView;
        this.f269777f = contestPrizeView2;
        this.f269778g = contestPrizeView3;
        this.f269779h = flow;
        this.f269780i = textView2;
        this.f269781j = preloaderSimpleV2View;
        this.f269782k = textView3;
    }

    @NonNull
    public static e a(@NonNull View view) {
        int i10 = com.planner5d.library.contest.e.i.Z3;
        AnimatedImageView animatedImageView = (AnimatedImageView) b4.c.a(view, i10);
        if (animatedImageView != null) {
            i10 = com.planner5d.library.contest.e.i.f150763a4;
            ImageView imageView = (ImageView) b4.c.a(view, i10);
            if (imageView != null) {
                i10 = com.planner5d.library.contest.e.i.f150778b4;
                TextView textView = (TextView) b4.c.a(view, i10);
                if (textView != null) {
                    i10 = com.planner5d.library.contest.e.i.f150793c4;
                    ContestPrizeView contestPrizeView = (ContestPrizeView) b4.c.a(view, i10);
                    if (contestPrizeView != null) {
                        i10 = com.planner5d.library.contest.e.i.f150808d4;
                        ContestPrizeView contestPrizeView2 = (ContestPrizeView) b4.c.a(view, i10);
                        if (contestPrizeView2 != null) {
                            i10 = com.planner5d.library.contest.e.i.f150823e4;
                            ContestPrizeView contestPrizeView3 = (ContestPrizeView) b4.c.a(view, i10);
                            if (contestPrizeView3 != null) {
                                i10 = com.planner5d.library.contest.e.i.f150838f4;
                                Flow flow = (Flow) b4.c.a(view, i10);
                                if (flow != null) {
                                    i10 = com.planner5d.library.contest.e.i.f150853g4;
                                    TextView textView2 = (TextView) b4.c.a(view, i10);
                                    if (textView2 != null) {
                                        i10 = com.planner5d.library.contest.e.i.f150868h4;
                                        PreloaderSimpleV2View preloaderSimpleV2View = (PreloaderSimpleV2View) b4.c.a(view, i10);
                                        if (preloaderSimpleV2View != null) {
                                            i10 = com.planner5d.library.contest.e.i.f150883i4;
                                            TextView textView3 = (TextView) b4.c.a(view, i10);
                                            if (textView3 != null) {
                                                return new e((ConstraintLayout) view, animatedImageView, imageView, textView, contestPrizeView, contestPrizeView2, contestPrizeView3, flow, textView2, preloaderSimpleV2View, textView3);
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
    public static e c(@NonNull LayoutInflater layoutInflater) {
        return d(layoutInflater, null, false);
    }

    @NonNull
    public static e d(@NonNull LayoutInflater layoutInflater, @p0 ViewGroup viewGroup, boolean z10) {
        View viewInflate = layoutInflater.inflate(com.planner5d.library.contest.e.l.f151219a0, viewGroup, false);
        if (z10) {
            viewGroup.addView(viewInflate);
        }
        return a(viewInflate);
    }

    @Override // b4.b
    @NonNull
    /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
    public ConstraintLayout getRoot() {
        return this.f269772a;
    }
}
