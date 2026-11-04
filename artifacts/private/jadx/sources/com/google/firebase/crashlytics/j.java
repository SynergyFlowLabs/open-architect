package com.google.firebase.crashlytics;

import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes5.dex */
public final class j {
    @NotNull
    public static final FirebaseCrashlytics a(@NotNull com.google.firebase.d dVar) {
        Intrinsics.checkNotNullParameter(dVar, "<this>");
        FirebaseCrashlytics firebaseCrashlytics = FirebaseCrashlytics.getInstance();
        Intrinsics.checkNotNullExpressionValue(firebaseCrashlytics, "getInstance(...)");
        return firebaseCrashlytics;
    }

    public static final void b(@NotNull FirebaseCrashlytics firebaseCrashlytics, @NotNull Throwable throwable, @NotNull Function1<? super k, Unit> init) {
        Intrinsics.checkNotNullParameter(firebaseCrashlytics, "<this>");
        Intrinsics.checkNotNullParameter(throwable, "throwable");
        Intrinsics.checkNotNullParameter(init, "init");
        k kVar = new k();
        init.invoke(kVar);
        firebaseCrashlytics.recordException(throwable, kVar.a());
    }

    public static final void c(@NotNull FirebaseCrashlytics firebaseCrashlytics, @NotNull Function1<? super k, Unit> init) {
        Intrinsics.checkNotNullParameter(firebaseCrashlytics, "<this>");
        Intrinsics.checkNotNullParameter(init, "init");
        k kVar = new k();
        init.invoke(kVar);
        firebaseCrashlytics.setCustomKeys(kVar.a());
    }
}
