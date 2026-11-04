package db;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.annotation.NonNull;
import androidx.annotation.p0;
import androidx.appcompat.widget.AppCompatTextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.google.android.material.progressindicator.CircularProgressIndicator;
import com.planner5d.library.contest.view.voting.ContestVotingItemView;
import com.planner5d.library.contest.view.voting.ContestVotingProgressView;

/* JADX INFO: loaded from: classes4.dex */
public final class l implements b4.b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NonNull
    private final ConstraintLayout f269836a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NonNull
    public final ContestVotingProgressView f269837b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @NonNull
    public final ContestVotingItemView f269838c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @NonNull
    public final CircularProgressIndicator f269839d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    @NonNull
    public final ContestVotingItemView f269840e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    @NonNull
    public final CircularProgressIndicator f269841f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    @NonNull
    public final AppCompatTextView f269842g;

    private l(@NonNull ConstraintLayout constraintLayout, @NonNull ContestVotingProgressView contestVotingProgressView, @NonNull ContestVotingItemView contestVotingItemView, @NonNull CircularProgressIndicator circularProgressIndicator, @NonNull ContestVotingItemView contestVotingItemView2, @NonNull CircularProgressIndicator circularProgressIndicator2, @NonNull AppCompatTextView appCompatTextView) {
        this.f269836a = constraintLayout;
        this.f269837b = contestVotingProgressView;
        this.f269838c = contestVotingItemView;
        this.f269839d = circularProgressIndicator;
        this.f269840e = contestVotingItemView2;
        this.f269841f = circularProgressIndicator2;
        this.f269842g = appCompatTextView;
    }

    @NonNull
    public static l a(@NonNull View view) {
        int i10 = com.planner5d.library.contest.e.i.f150988p4;
        ContestVotingProgressView contestVotingProgressView = (ContestVotingProgressView) b4.c.a(view, i10);
        if (contestVotingProgressView != null) {
            i10 = com.planner5d.library.contest.e.i.E6;
            ContestVotingItemView contestVotingItemView = (ContestVotingItemView) b4.c.a(view, i10);
            if (contestVotingItemView != null) {
                i10 = com.planner5d.library.contest.e.i.F6;
                CircularProgressIndicator circularProgressIndicator = (CircularProgressIndicator) b4.c.a(view, i10);
                if (circularProgressIndicator != null) {
                    i10 = com.planner5d.library.contest.e.i.G6;
                    ContestVotingItemView contestVotingItemView2 = (ContestVotingItemView) b4.c.a(view, i10);
                    if (contestVotingItemView2 != null) {
                        i10 = com.planner5d.library.contest.e.i.H6;
                        CircularProgressIndicator circularProgressIndicator2 = (CircularProgressIndicator) b4.c.a(view, i10);
                        if (circularProgressIndicator2 != null) {
                            i10 = com.planner5d.library.contest.e.i.f151086vc;
                            AppCompatTextView appCompatTextView = (AppCompatTextView) b4.c.a(view, i10);
                            if (appCompatTextView != null) {
                                return new l((ConstraintLayout) view, contestVotingProgressView, contestVotingItemView, circularProgressIndicator, contestVotingItemView2, circularProgressIndicator2, appCompatTextView);
                            }
                        }
                    }
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i10)));
    }

    @NonNull
    public static l c(@NonNull LayoutInflater layoutInflater) {
        return d(layoutInflater, null, false);
    }

    @NonNull
    public static l d(@NonNull LayoutInflater layoutInflater, @p0 ViewGroup viewGroup, boolean z10) {
        View viewInflate = layoutInflater.inflate(com.planner5d.library.contest.e.l.f151330y0, viewGroup, false);
        if (z10) {
            viewGroup.addView(viewInflate);
        }
        return a(viewInflate);
    }

    @Override // b4.b
    @NonNull
    /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
    public ConstraintLayout getRoot() {
        return this.f269836a;
    }
}
