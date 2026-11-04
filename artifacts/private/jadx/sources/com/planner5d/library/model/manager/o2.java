package com.planner5d.library.model.manager;

import android.app.Activity;
import android.net.Uri;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes7.dex */
@androidx.compose.runtime.internal.w0(parameters = 1)
public final class o2 implements com.planner5d.library.model.manager.payments.a0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final int f192223a = 0;

    @Override // com.planner5d.library.model.manager.payments.a0
    public void b(@NotNull com.planner5d.library.model.manager.statistics.g0 user) {
        Intrinsics.checkNotNullParameter(user, "user");
    }

    @Override // com.planner5d.library.model.manager.payments.a0
    public boolean c() {
        return false;
    }

    @Override // com.planner5d.library.model.manager.payments.a0
    public void d(@NotNull Activity activity, @NotNull com.planner5d.library.model.manager.config.purchaseplacement.b.a placement, @NotNull Function2<? super Boolean, ? super Boolean, Unit> onComplete) {
        Intrinsics.checkNotNullParameter(activity, "activity");
        Intrinsics.checkNotNullParameter(placement, "placement");
        Intrinsics.checkNotNullParameter(onComplete, "onComplete");
    }

    @Override // com.planner5d.library.model.manager.payments.a0
    @Nullable
    public com.planner5d.library.model.manager.statistics.events.y3.c e(@NotNull com.planner5d.library.model.manager.config.purchaseplacement.b.a placement) {
        Intrinsics.checkNotNullParameter(placement, "placement");
        return null;
    }

    @Override // com.planner5d.library.model.manager.payments.a0
    public boolean f(@NotNull Uri uri) {
        Intrinsics.checkNotNullParameter(uri, "uri");
        return false;
    }

    @Override // com.planner5d.library.model.manager.payments.a0
    public void g() {
    }

    @Override // com.planner5d.library.model.manager.payments.a0
    public void h() {
    }

    @Override // com.planner5d.library.model.manager.payments.a0
    @Nullable
    public Object i(@NotNull Activity activity, @NotNull com.planner5d.library.model.manager.statistics.events.h3 h3Var, @NotNull kotlin.coroutines.d<? super Unit> dVar) {
        return Unit.f312394a;
    }

    @Override // com.planner5d.library.model.manager.payments.a0
    public boolean isEnabled() {
        return false;
    }
}
