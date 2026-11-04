package ra;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.annotation.NonNull;
import androidx.annotation.p0;
import androidx.fragment.app.FragmentContainerView;

/* JADX INFO: loaded from: classes6.dex */
public final class a implements b4.b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NonNull
    private final FragmentContainerView f362231a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NonNull
    public final FragmentContainerView f362232b;

    private a(@NonNull FragmentContainerView fragmentContainerView, @NonNull FragmentContainerView fragmentContainerView2) {
        this.f362231a = fragmentContainerView;
        this.f362232b = fragmentContainerView2;
    }

    @NonNull
    public static a a(@NonNull View view) {
        if (view == null) {
            throw new NullPointerException("rootView");
        }
        FragmentContainerView fragmentContainerView = (FragmentContainerView) view;
        return new a(fragmentContainerView, fragmentContainerView);
    }

    @NonNull
    public static a c(@NonNull LayoutInflater layoutInflater) {
        return d(layoutInflater, null, false);
    }

    @NonNull
    public static a d(@NonNull LayoutInflater layoutInflater, @p0 ViewGroup viewGroup, boolean z10) {
        View viewInflate = layoutInflater.inflate(com.planner5d.library.activity.tutorial.c.l.D, viewGroup, false);
        if (z10) {
            viewGroup.addView(viewInflate);
        }
        return a(viewInflate);
    }

    @Override // b4.b
    @NonNull
    /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
    public FragmentContainerView getRoot() {
        return this.f362231a;
    }
}
