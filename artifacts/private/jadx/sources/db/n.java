package db;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import androidx.annotation.NonNull;
import androidx.annotation.p0;
import androidx.appcompat.widget.AppCompatTextView;
import com.planner5d.library.contest.view.archive.ContestInactiveView;
import com.planner5d.library.contest.view.archive.ContestParticipantView;
import com.planner5d.library.widget.RoundedCornersLayout;
import com.planner5d.library.widget.preloader.shimmer.ShimmerView;

/* JADX INFO: loaded from: classes4.dex */
public final class n implements b4.b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NonNull
    private final ContestInactiveView f269849a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NonNull
    public final RoundedCornersLayout f269850b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @NonNull
    public final ImageView f269851c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @NonNull
    public final ContestParticipantView f269852d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    @NonNull
    public final ImageView f269853e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    @NonNull
    public final View f269854f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    @NonNull
    public final AppCompatTextView f269855g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    @NonNull
    public final AppCompatTextView f269856h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    @NonNull
    public final AppCompatTextView f269857i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    @NonNull
    public final AppCompatTextView f269858j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    @NonNull
    public final ShimmerView f269859k;

    private n(@NonNull ContestInactiveView contestInactiveView, @NonNull RoundedCornersLayout roundedCornersLayout, @NonNull ImageView imageView, @NonNull ContestParticipantView contestParticipantView, @NonNull ImageView imageView2, @NonNull View view, @NonNull AppCompatTextView appCompatTextView, @NonNull AppCompatTextView appCompatTextView2, @NonNull AppCompatTextView appCompatTextView3, @NonNull AppCompatTextView appCompatTextView4, @NonNull ShimmerView shimmerView) {
        this.f269849a = contestInactiveView;
        this.f269850b = roundedCornersLayout;
        this.f269851c = imageView;
        this.f269852d = contestParticipantView;
        this.f269853e = imageView2;
        this.f269854f = view;
        this.f269855g = appCompatTextView;
        this.f269856h = appCompatTextView2;
        this.f269857i = appCompatTextView3;
        this.f269858j = appCompatTextView4;
        this.f269859k = shimmerView;
    }

    @NonNull
    public static n a(@NonNull View view) {
        View viewA;
        int i10 = com.planner5d.library.contest.e.i.I2;
        RoundedCornersLayout roundedCornersLayout = (RoundedCornersLayout) b4.c.a(view, i10);
        if (roundedCornersLayout != null) {
            i10 = com.planner5d.library.contest.e.i.L2;
            ImageView imageView = (ImageView) b4.c.a(view, i10);
            if (imageView != null) {
                i10 = com.planner5d.library.contest.e.i.O2;
                ContestParticipantView contestParticipantView = (ContestParticipantView) b4.c.a(view, i10);
                if (contestParticipantView != null) {
                    i10 = com.planner5d.library.contest.e.i.Z2;
                    ImageView imageView2 = (ImageView) b4.c.a(view, i10);
                    if (imageView2 != null && (viewA = b4.c.a(view, (i10 = com.planner5d.library.contest.e.i.f150987p3))) != null) {
                        i10 = com.planner5d.library.contest.e.i.f151032s3;
                        AppCompatTextView appCompatTextView = (AppCompatTextView) b4.c.a(view, i10);
                        if (appCompatTextView != null) {
                            i10 = com.planner5d.library.contest.e.i.H3;
                            AppCompatTextView appCompatTextView2 = (AppCompatTextView) b4.c.a(view, i10);
                            if (appCompatTextView2 != null) {
                                i10 = com.planner5d.library.contest.e.i.f150913k4;
                                AppCompatTextView appCompatTextView3 = (AppCompatTextView) b4.c.a(view, i10);
                                if (appCompatTextView3 != null) {
                                    i10 = com.planner5d.library.contest.e.i.Z8;
                                    AppCompatTextView appCompatTextView4 = (AppCompatTextView) b4.c.a(view, i10);
                                    if (appCompatTextView4 != null) {
                                        i10 = com.planner5d.library.contest.e.i.f151038s9;
                                        ShimmerView shimmerView = (ShimmerView) b4.c.a(view, i10);
                                        if (shimmerView != null) {
                                            return new n((ContestInactiveView) view, roundedCornersLayout, imageView, contestParticipantView, imageView2, viewA, appCompatTextView, appCompatTextView2, appCompatTextView3, appCompatTextView4, shimmerView);
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
    public static n c(@NonNull LayoutInflater layoutInflater) {
        return d(layoutInflater, null, false);
    }

    @NonNull
    public static n d(@NonNull LayoutInflater layoutInflater, @p0 ViewGroup viewGroup, boolean z10) {
        View viewInflate = layoutInflater.inflate(com.planner5d.library.contest.e.l.C2, viewGroup, false);
        if (z10) {
            viewGroup.addView(viewInflate);
        }
        return a(viewInflate);
    }

    @Override // b4.b
    @NonNull
    /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
    public ContestInactiveView getRoot() {
        return this.f269849a;
    }
}
