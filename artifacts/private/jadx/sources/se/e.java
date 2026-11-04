package se;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ScrollView;
import android.widget.Space;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.annotation.p0;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.google.android.material.button.MaterialButton;
import com.planner5d.library.widget.preloader.PreloaderCoverView;

/* JADX INFO: loaded from: classes12.dex */
public final class e implements b4.b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NonNull
    private final ConstraintLayout f376008a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NonNull
    public final MaterialButton f376009b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @NonNull
    public final MaterialButton f376010c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @NonNull
    public final MaterialButton f376011d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    @NonNull
    public final ScrollView f376012e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    @NonNull
    public final PreloaderCoverView f376013f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    @NonNull
    public final Space f376014g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    @NonNull
    public final TextView f376015h;

    private e(@NonNull ConstraintLayout constraintLayout, @NonNull MaterialButton materialButton, @NonNull MaterialButton materialButton2, @NonNull MaterialButton materialButton3, @NonNull ScrollView scrollView, @NonNull PreloaderCoverView preloaderCoverView, @NonNull Space space, @NonNull TextView textView) {
        this.f376008a = constraintLayout;
        this.f376009b = materialButton;
        this.f376010c = materialButton2;
        this.f376011d = materialButton3;
        this.f376012e = scrollView;
        this.f376013f = preloaderCoverView;
        this.f376014g = space;
        this.f376015h = textView;
    }

    @NonNull
    public static e a(@NonNull View view) {
        int i10 = com.planner5d.library.view.d.i.O1;
        MaterialButton materialButton = (MaterialButton) b4.c.a(view, i10);
        if (materialButton != null) {
            i10 = com.planner5d.library.view.d.i.Q1;
            MaterialButton materialButton2 = (MaterialButton) b4.c.a(view, i10);
            if (materialButton2 != null) {
                i10 = com.planner5d.library.view.d.i.R1;
                MaterialButton materialButton3 = (MaterialButton) b4.c.a(view, i10);
                if (materialButton3 != null) {
                    i10 = com.planner5d.library.view.d.i.C2;
                    ScrollView scrollView = (ScrollView) b4.c.a(view, i10);
                    if (scrollView != null) {
                        i10 = com.planner5d.library.view.d.i.f247152m7;
                        PreloaderCoverView preloaderCoverView = (PreloaderCoverView) b4.c.a(view, i10);
                        if (preloaderCoverView != null) {
                            i10 = com.planner5d.library.view.d.i.X8;
                            Space space = (Space) b4.c.a(view, i10);
                            if (space != null) {
                                i10 = com.planner5d.library.view.d.i.f247077ga;
                                TextView textView = (TextView) b4.c.a(view, i10);
                                if (textView != null) {
                                    return new e((ConstraintLayout) view, materialButton, materialButton2, materialButton3, scrollView, preloaderCoverView, space, textView);
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
        View viewInflate = layoutInflater.inflate(com.planner5d.library.view.d.l.f247410h0, viewGroup, false);
        if (z10) {
            viewGroup.addView(viewInflate);
        }
        return a(viewInflate);
    }

    @Override // b4.b
    @NonNull
    /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
    public ConstraintLayout getRoot() {
        return this.f376008a;
    }
}
