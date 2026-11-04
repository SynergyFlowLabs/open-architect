package ne;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.annotation.NonNull;
import androidx.annotation.p0;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import androidx.fragment.app.FragmentContainerView;
import b4.b;
import b4.c;
import com.google.android.material.progressindicator.LinearProgressIndicator;
import com.planner5d.library.util.navigation.l;
import com.planner5d.library.widget.AppBarLayout;
import com.planner5d.library.widget.ScalableTabLayout;
import com.planner5d.library.widget.Toolbar;

/* JADX INFO: loaded from: classes12.dex */
public final class a implements b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NonNull
    private final CoordinatorLayout f332779a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NonNull
    public final AppBarLayout f332780b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @NonNull
    public final View f332781c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @NonNull
    public final FragmentContainerView f332782d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    @NonNull
    public final LinearProgressIndicator f332783e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    @NonNull
    public final Toolbar f332784f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    @NonNull
    public final ScalableTabLayout f332785g;

    private a(@NonNull CoordinatorLayout coordinatorLayout, @NonNull AppBarLayout appBarLayout, @NonNull View view, @NonNull FragmentContainerView fragmentContainerView, @NonNull LinearProgressIndicator linearProgressIndicator, @NonNull Toolbar toolbar, @NonNull ScalableTabLayout scalableTabLayout) {
        this.f332779a = coordinatorLayout;
        this.f332780b = appBarLayout;
        this.f332781c = view;
        this.f332782d = fragmentContainerView;
        this.f332783e = linearProgressIndicator;
        this.f332784f = toolbar;
        this.f332785g = scalableTabLayout;
    }

    @NonNull
    public static a a(@NonNull View view) {
        View viewA;
        int i10 = l.i.f242590r6;
        AppBarLayout appBarLayout = (AppBarLayout) c.a(view, i10);
        if (appBarLayout != null && (viewA = c.a(view, (i10 = l.i.f242676y6))) != null) {
            i10 = l.i.A6;
            FragmentContainerView fragmentContainerView = (FragmentContainerView) c.a(view, i10);
            if (fragmentContainerView != null) {
                i10 = l.i.B6;
                LinearProgressIndicator linearProgressIndicator = (LinearProgressIndicator) c.a(view, i10);
                if (linearProgressIndicator != null) {
                    i10 = l.i.C6;
                    Toolbar toolbar = (Toolbar) c.a(view, i10);
                    if (toolbar != null) {
                        i10 = l.i.D6;
                        ScalableTabLayout scalableTabLayout = (ScalableTabLayout) c.a(view, i10);
                        if (scalableTabLayout != null) {
                            return new a((CoordinatorLayout) view, appBarLayout, viewA, fragmentContainerView, linearProgressIndicator, toolbar, scalableTabLayout);
                        }
                    }
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i10)));
    }

    @NonNull
    public static a c(@NonNull LayoutInflater layoutInflater) {
        return d(layoutInflater, null, false);
    }

    @NonNull
    public static a d(@NonNull LayoutInflater layoutInflater, @p0 ViewGroup viewGroup, boolean z10) {
        View viewInflate = layoutInflater.inflate(l.C1715l.f242815n0, viewGroup, false);
        if (z10) {
            viewGroup.addView(viewInflate);
        }
        return a(viewInflate);
    }

    @Override // b4.b
    @NonNull
    /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
    public CoordinatorLayout getRoot() {
        return this.f332779a;
    }
}
