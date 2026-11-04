package com.planner5d.library.modules.user.user;

import kotlin.Unit;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes9.dex */
@androidx.compose.runtime.internal.w0(parameters = 1)
@ij.f
public final class d extends b {

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public static final int f222997k = 0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    @ij.a
    public d(@NotNull fg.e<q0> userProperties, @NotNull fg.e<com.planner5d.library.activity.fragment.dialog.k> dialogLauncher, @NotNull com.planner5d.library.model.manager.initialization.r initializationManager, @NotNull fg.e<com.planner5d.library.activity.fragment.x> navigator, @NotNull com.planner5d.library.model.manager.config.p preferences, @NotNull fg.e<t> userAuthorization, @NotNull fg.e<t0> userPurchases, @NotNull com.planner5d.library.activity.fragment.n defaultFragmentProvider, @NotNull com.planner5d.library.services.utility.f1 globalCoroutineScope) {
        super(userProperties, dialogLauncher, initializationManager, navigator, preferences, userAuthorization, userPurchases, defaultFragmentProvider, globalCoroutineScope);
        Intrinsics.checkNotNullParameter(userProperties, "userProperties");
        Intrinsics.checkNotNullParameter(dialogLauncher, "dialogLauncher");
        Intrinsics.checkNotNullParameter(initializationManager, "initializationManager");
        Intrinsics.checkNotNullParameter(navigator, "navigator");
        Intrinsics.checkNotNullParameter(preferences, "preferences");
        Intrinsics.checkNotNullParameter(userAuthorization, "userAuthorization");
        Intrinsics.checkNotNullParameter(userPurchases, "userPurchases");
        Intrinsics.checkNotNullParameter(defaultFragmentProvider, "defaultFragmentProvider");
        Intrinsics.checkNotNullParameter(globalCoroutineScope, "globalCoroutineScope");
    }

    @Override // com.planner5d.library.modules.user.user.b
    @Nullable
    public Object b(boolean z10, @NotNull kotlin.coroutines.d<? super Unit> dVar) {
        return Unit.f312394a;
    }

    @Override // com.planner5d.library.modules.user.user.b
    public void d() {
    }
}
