package com.planner5d.library.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.annotation.NonNull;
import androidx.fragment.app.FragmentContainerView;
import com.planner5d.library.widget.onboarding.OnboardingListenerView;

/* JADX INFO: loaded from: classes4.dex */
public final class k implements b4.b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NonNull
    private final OnboardingListenerView f159202a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NonNull
    public final OnboardingListenerView f159203b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @NonNull
    public final FragmentContainerView f159204c;

    private k(@NonNull OnboardingListenerView onboardingListenerView, @NonNull OnboardingListenerView onboardingListenerView2, @NonNull FragmentContainerView fragmentContainerView) {
        this.f159202a = onboardingListenerView;
        this.f159203b = onboardingListenerView2;
        this.f159204c = fragmentContainerView;
    }

    @NonNull
    public static k a(@NonNull View view) {
        OnboardingListenerView onboardingListenerView = (OnboardingListenerView) view;
        int i10 = com.planner5d.library.f.j.Ni;
        FragmentContainerView fragmentContainerView = (FragmentContainerView) b4.c.a(view, i10);
        if (fragmentContainerView != null) {
            return new k(onboardingListenerView, onboardingListenerView, fragmentContainerView);
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i10)));
    }

    @NonNull
    public static k c(@NonNull LayoutInflater layoutInflater) {
        return d(layoutInflater, null, false);
    }

    @NonNull
    public static k d(@NonNull LayoutInflater layoutInflater, @androidx.annotation.p0 ViewGroup viewGroup, boolean z10) {
        View viewInflate = layoutInflater.inflate(com.planner5d.library.f.m.Q0, viewGroup, false);
        if (z10) {
            viewGroup.addView(viewInflate);
        }
        return a(viewInflate);
    }

    @Override // b4.b
    @NonNull
    /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
    public OnboardingListenerView getRoot() {
        return this.f159202a;
    }
}
