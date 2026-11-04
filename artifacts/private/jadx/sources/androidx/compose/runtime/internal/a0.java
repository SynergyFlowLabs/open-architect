package androidx.compose.runtime.internal;

import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes.dex */
@SourceDebugExtension({"SMAP\nComposableLambdaN.jvm.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ComposableLambdaN.jvm.kt\nandroidx/compose/runtime/internal/ComposableLambdaN_jvmKt\n+ 2 Composer.kt\nandroidx/compose/runtime/ComposerKt\n+ 3 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,181:1\n1282#2,6:182\n1#3:188\n*S KotlinDebug\n*F\n+ 1 ComposableLambdaN.jvm.kt\nandroidx/compose/runtime/internal/ComposableLambdaN_jvmKt\n*L\n171#1:182,6\n*E\n"})
public final class a0 {
    @androidx.compose.runtime.w
    @NotNull
    public static final x a(@NotNull androidx.compose.runtime.c0 c0Var, int i10, boolean z10, int i11, @NotNull Object obj) {
        z zVar;
        c0Var.h0(i10);
        Object objI0 = c0Var.i0();
        if (objI0 == androidx.compose.runtime.c0.f35327a.a()) {
            zVar = new z(i10, z10, i11);
            c0Var.Y(zVar);
        } else {
            Intrinsics.checkNotNull(objI0, "null cannot be cast to non-null type androidx.compose.runtime.internal.ComposableLambdaNImpl");
            zVar = (z) objI0;
        }
        zVar.n(obj);
        c0Var.w0();
        return zVar;
    }

    @androidx.compose.runtime.w
    @NotNull
    public static final x b(int i10, boolean z10, int i11, @NotNull Object obj) {
        z zVar = new z(i10, z10, i11);
        zVar.n(obj);
        return zVar;
    }

    @androidx.compose.runtime.o
    @androidx.compose.runtime.w
    @NotNull
    public static final x c(int i10, boolean z10, int i11, @NotNull Object obj, @Nullable androidx.compose.runtime.c0 c0Var, int i12) {
        if (androidx.compose.runtime.m0.l0()) {
            int i13 = 3 | (-1);
            androidx.compose.runtime.m0.A0(-293456346, i12, -1, "androidx.compose.runtime.internal.rememberComposableLambdaN (ComposableLambdaN.jvm.kt:170)");
        }
        Object objI0 = c0Var.i0();
        if (objI0 == androidx.compose.runtime.c0.f35327a.a()) {
            objI0 = new z(i10, z10, i11);
            c0Var.Y(objI0);
        }
        z zVar = (z) objI0;
        zVar.n(obj);
        if (androidx.compose.runtime.m0.l0()) {
            androidx.compose.runtime.m0.z0();
        }
        return zVar;
    }
}
