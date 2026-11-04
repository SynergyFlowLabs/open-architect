package com.planner5d.library.activity.fragment.dialog;

import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import com.planner5d.library.activity.fragment.dialog.about.About;
import com.planner5d.library.activity.fragment.dialog.onboarding.OnboardingDialog;
import com.planner5d.library.activity.fragment.profile.about.AboutFragment;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes6.dex */
public final class s implements com.planner5d.library.services.p {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    private final k f132842a;

    @ij.a
    public s(@NotNull k dialogLauncher) {
        Intrinsics.checkNotNullParameter(dialogLauncher, "dialogLauncher");
        this.f132842a = dialogLauncher;
    }

    @Override // com.planner5d.library.services.p
    public boolean a(@Nullable androidx.fragment.app.m mVar) {
        return mVar instanceof OnboardingDialog;
    }

    @Override // com.planner5d.library.services.p
    public void b(@NotNull FragmentManager fragmentManager) {
        Intrinsics.checkNotNullParameter(fragmentManager, "fragmentManager");
        new OnboardingDialog().show(fragmentManager, "onboarding_dialog");
    }

    @Override // com.planner5d.library.services.p
    public void c() {
        this.f132842a.c(About.class).g();
    }

    @Override // com.planner5d.library.services.p
    @NotNull
    public Class<? extends Fragment> d() {
        return AboutFragment.class;
    }
}
