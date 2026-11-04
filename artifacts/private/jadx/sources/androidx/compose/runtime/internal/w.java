package androidx.compose.runtime.internal;

import androidx.compose.runtime.q4;
import androidx.compose.runtime.s4;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes.dex */
@SourceDebugExtension({"SMAP\nComposableLambda.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ComposableLambda.kt\nandroidx/compose/runtime/internal/ComposableLambdaKt\n+ 2 BitwiseOperators.kt\nandroidx/compose/runtime/BitwiseOperatorsKt\n+ 3 Composer.kt\nandroidx/compose/runtime/ComposerKt\n+ 4 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,1373:1\n31#2:1374\n1282#3,6:1375\n1#4:1381\n*S KotlinDebug\n*F\n+ 1 ComposableLambda.kt\nandroidx/compose/runtime/internal/ComposableLambdaKt\n*L\n1345#1:1374\n1372#1:1375,6\n*E\n"})
public final class w {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final int f36144a = 10;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static final int f36145b = 3;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @NotNull
    private static final Object f36146c = new Object();

    public static final int a(int i10, int i11) {
        return i10 << (((i11 % 10) * 3) + 1);
    }

    @androidx.compose.runtime.w
    @NotNull
    public static final c b(@NotNull androidx.compose.runtime.c0 c0Var, int i10, boolean z10, @NotNull Object obj) {
        v vVar;
        c0Var.m0(Integer.rotateLeft(i10, 1), f36146c);
        Object objI0 = c0Var.i0();
        if (objI0 == androidx.compose.runtime.c0.f35327a.a()) {
            vVar = new v(i10, z10, obj);
            c0Var.Y(vVar);
        } else {
            Intrinsics.checkNotNull(objI0, "null cannot be cast to non-null type androidx.compose.runtime.internal.ComposableLambdaImpl");
            vVar = (v) objI0;
            vVar.F0(obj);
        }
        c0Var.v0();
        return vVar;
    }

    @androidx.compose.runtime.w
    @NotNull
    public static final c c(int i10, boolean z10, @NotNull Object obj) {
        return new v(i10, z10, obj);
    }

    public static final int d(int i10) {
        return a(2, i10);
    }

    @androidx.compose.runtime.o
    @androidx.compose.runtime.w
    @NotNull
    public static final c e(int i10, boolean z10, @NotNull Object obj, @Nullable androidx.compose.runtime.c0 c0Var, int i11) {
        if (androidx.compose.runtime.m0.l0()) {
            androidx.compose.runtime.m0.A0(-1573003438, i11, -1, "androidx.compose.runtime.internal.rememberComposableLambda (ComposableLambda.kt:1371)");
        }
        Object objI0 = c0Var.i0();
        if (objI0 == androidx.compose.runtime.c0.f35327a.a()) {
            objI0 = new v(i10, z10, obj);
            c0Var.Y(objI0);
        }
        v vVar = (v) objI0;
        vVar.F0(obj);
        if (androidx.compose.runtime.m0.l0()) {
            androidx.compose.runtime.m0.z0();
        }
        return vVar;
    }

    public static final boolean f(@Nullable q4 q4Var, @NotNull q4 q4Var2) {
        if (q4Var != null) {
            if (!(q4Var instanceof s4) || !(q4Var2 instanceof s4)) {
                return false;
            }
            s4 s4Var = (s4) q4Var;
            if (s4Var.w() && !Intrinsics.areEqual(q4Var, q4Var2) && !Intrinsics.areEqual(s4Var.h(), ((s4) q4Var2).h())) {
                return false;
            }
        }
        return true;
    }

    public static final int g(int i10) {
        return a(1, i10);
    }
}
