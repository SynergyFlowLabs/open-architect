package db;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewStub;
import androidx.annotation.NonNull;
import androidx.annotation.p0;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.swiperefreshlayout.widget.SwipeRefreshLayout;
import com.google.android.material.progressindicator.LinearProgressIndicator;
import com.planner5d.library.widget.EnhancedRecyclerView;

/* JADX INFO: loaded from: classes4.dex */
public final class i implements b4.b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NonNull
    private final ConstraintLayout f269811a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NonNull
    public final ViewStub f269812b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @NonNull
    public final EnhancedRecyclerView f269813c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @NonNull
    public final LinearProgressIndicator f269814d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    @NonNull
    public final SwipeRefreshLayout f269815e;

    private i(@NonNull ConstraintLayout constraintLayout, @NonNull ViewStub viewStub, @NonNull EnhancedRecyclerView enhancedRecyclerView, @NonNull LinearProgressIndicator linearProgressIndicator, @NonNull SwipeRefreshLayout swipeRefreshLayout) {
        this.f269811a = constraintLayout;
        this.f269812b = viewStub;
        this.f269813c = enhancedRecyclerView;
        this.f269814d = linearProgressIndicator;
        this.f269815e = swipeRefreshLayout;
    }

    @NonNull
    public static i a(@NonNull View view) {
        int i10 = com.planner5d.library.contest.e.i.f150837f3;
        ViewStub viewStub = (ViewStub) b4.c.a(view, i10);
        if (viewStub != null) {
            i10 = com.planner5d.library.contest.e.i.f151002q3;
            EnhancedRecyclerView enhancedRecyclerView = (EnhancedRecyclerView) b4.c.a(view, i10);
            if (enhancedRecyclerView != null) {
                i10 = com.planner5d.library.contest.e.i.f151017r3;
                LinearProgressIndicator linearProgressIndicator = (LinearProgressIndicator) b4.c.a(view, i10);
                if (linearProgressIndicator != null) {
                    i10 = com.planner5d.library.contest.e.i.f150898j4;
                    SwipeRefreshLayout swipeRefreshLayout = (SwipeRefreshLayout) b4.c.a(view, i10);
                    if (swipeRefreshLayout != null) {
                        return new i((ConstraintLayout) view, viewStub, enhancedRecyclerView, linearProgressIndicator, swipeRefreshLayout);
                    }
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i10)));
    }

    @NonNull
    public static i c(@NonNull LayoutInflater layoutInflater) {
        return d(layoutInflater, null, false);
    }

    @NonNull
    public static i d(@NonNull LayoutInflater layoutInflater, @p0 ViewGroup viewGroup, boolean z10) {
        View viewInflate = layoutInflater.inflate(com.planner5d.library.contest.e.l.f151314u0, viewGroup, false);
        if (z10) {
            viewGroup.addView(viewInflate);
        }
        return a(viewInflate);
    }

    @Override // b4.b
    @NonNull
    /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
    public ConstraintLayout getRoot() {
        return this.f269811a;
    }
}
