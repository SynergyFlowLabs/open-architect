package com.planner5d.library.spaces.view;

import androidx.compose.runtime.internal.w0;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.m;
import com.planner5d.library.services.o0;
import com.planner5d.library.spaces.view.onboarding.OnboardingSearchAddressDialog;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes11.dex */
@w0(parameters = 1)
public final class a implements o0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final int f230227a = 0;

    @ij.a
    public a() {
    }

    @Override // com.planner5d.library.services.o0
    public void a(@NotNull FragmentManager fragmentManager) {
        Intrinsics.checkNotNullParameter(fragmentManager, "fragmentManager");
        new OnboardingSearchAddressDialog().show(fragmentManager, OnboardingSearchAddressDialog.FRAGMENT_TAG);
    }

    @Override // com.planner5d.library.services.o0
    public boolean b(@Nullable m mVar) {
        return mVar instanceof OnboardingSearchAddressDialog;
    }
}
