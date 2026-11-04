package com.google.android.filament.utils;

import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes4.dex */
@SourceDebugExtension({"SMAP\nRay.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Ray.kt\ncom/google/android/filament/utils/RayKt\n+ 2 Vector.kt\ncom/google/android/filament/utils/Float3\n*L\n1#1,22:1\n306#2:23\n322#2:24\n*S KotlinDebug\n*F\n+ 1 Ray.kt\ncom/google/android/filament/utils/RayKt\n*L\n21#1:23\n21#1:24\n*E\n"})
public final class b0 {
    @NotNull
    public static final f a(@NotNull a0 r10, float f10) {
        Intrinsics.checkNotNullParameter(r10, "r");
        f fVarF = r10.f();
        f fVarE = r10.e();
        f fVar = new f(fVarE.H() * f10, fVarE.K() * f10, fVarE.L() * f10);
        return new f(fVarF.H() + fVar.H(), fVarF.K() + fVar.K(), fVarF.L() + fVar.L());
    }
}
