package db;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.annotation.p0;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.planner5d.library.contest.view.voting.ContestVotingProgressView;
import com.planner5d.library.widget.AnimatedImageView;

/* JADX INFO: loaded from: classes4.dex */
public final class f implements b4.b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NonNull
    private final ConstraintLayout f269783a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NonNull
    public final AnimatedImageView f269784b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @NonNull
    public final ContestVotingProgressView f269785c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @NonNull
    public final TextView f269786d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    @NonNull
    public final TextView f269787e;

    private f(@NonNull ConstraintLayout constraintLayout, @NonNull AnimatedImageView animatedImageView, @NonNull ContestVotingProgressView contestVotingProgressView, @NonNull TextView textView, @NonNull TextView textView2) {
        this.f269783a = constraintLayout;
        this.f269784b = animatedImageView;
        this.f269785c = contestVotingProgressView;
        this.f269786d = textView;
        this.f269787e = textView2;
    }

    @NonNull
    public static f a(@NonNull View view) {
        int i10 = com.planner5d.library.contest.e.i.f150928l4;
        AnimatedImageView animatedImageView = (AnimatedImageView) b4.c.a(view, i10);
        if (animatedImageView != null) {
            i10 = com.planner5d.library.contest.e.i.f150943m4;
            ContestVotingProgressView contestVotingProgressView = (ContestVotingProgressView) b4.c.a(view, i10);
            if (contestVotingProgressView != null) {
                i10 = com.planner5d.library.contest.e.i.f150958n4;
                TextView textView = (TextView) b4.c.a(view, i10);
                if (textView != null) {
                    i10 = com.planner5d.library.contest.e.i.f150973o4;
                    TextView textView2 = (TextView) b4.c.a(view, i10);
                    if (textView2 != null) {
                        return new f((ConstraintLayout) view, animatedImageView, contestVotingProgressView, textView, textView2);
                    }
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i10)));
    }

    @NonNull
    public static f c(@NonNull LayoutInflater layoutInflater) {
        return d(layoutInflater, null, false);
    }

    @NonNull
    public static f d(@NonNull LayoutInflater layoutInflater, @p0 ViewGroup viewGroup, boolean z10) {
        View viewInflate = layoutInflater.inflate(com.planner5d.library.contest.e.l.f151244f0, viewGroup, false);
        if (z10) {
            viewGroup.addView(viewInflate);
        }
        return a(viewInflate);
    }

    @Override // b4.b
    @NonNull
    /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
    public ConstraintLayout getRoot() {
        return this.f269783a;
    }
}
