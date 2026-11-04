package androidx.compose.material;

import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes.dex */
@u7
@androidx.compose.runtime.internal.w0(parameters = 1)
@SourceDebugExtension({"SMAP\nExposedDropdownMenu.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ExposedDropdownMenu.kt\nandroidx/compose/material/ExposedDropdownMenuDefaults\n+ 2 Composer.kt\nandroidx/compose/runtime/ComposerKt\n+ 3 CompositionLocal.kt\nandroidx/compose/runtime/CompositionLocal\n*L\n1#1,671:1\n1282#2,6:672\n1282#2,6:678\n75#3:684\n75#3:685\n*S KotlinDebug\n*F\n+ 1 ExposedDropdownMenu.kt\nandroidx/compose/material/ExposedDropdownMenuDefaults\n*L\n236#1:672,6\n241#1:678,6\n293#1:684\n391#1:685\n*E\n"})
public final class b8 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    public static final b8 f22170a = new b8();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final int f22171b = 0;

    static final class a implements Function2<androidx.compose.runtime.c0, Integer, Unit> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ boolean f22172a;

        a(boolean z10) {
            this.f22172a = z10;
        }

        @androidx.compose.runtime.o
        @androidx.compose.runtime.t(applier = "androidx.compose.ui.UiComposable")
        public final void c(androidx.compose.runtime.c0 c0Var, int i10) {
            if (!c0Var.h((i10 & 3) != 2, i10 & 1)) {
                c0Var.u();
                return;
            }
            if (androidx.compose.runtime.m0.l0()) {
                int i11 = 7 | (-1);
                androidx.compose.runtime.m0.A0(726122713, i10, -1, "androidx.compose.material.ExposedDropdownMenuDefaults.TrailingIcon.<anonymous> (ExposedDropdownMenu.kt:241)");
            }
            i9.e(androidx.compose.material.internal.m.a.f23217a.a(), "Trailing icon for exposed dropdown menu", androidx.compose.ui.draw.u.a(androidx.compose.ui.a0.E, this.f22172a ? 180.0f : 360.0f), 0L, c0Var, 48, 8);
            if (androidx.compose.runtime.m0.l0()) {
                androidx.compose.runtime.m0.z0();
            }
        }

        @Override // kotlin.jvm.functions.Function2
        public /* bridge */ /* synthetic */ Unit invoke(androidx.compose.runtime.c0 c0Var, Integer num) {
            c(c0Var, num.intValue());
            return Unit.f312394a;
        }
    }

    private b8() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit e() {
        return Unit.f312394a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit f(androidx.compose.ui.semantics.e0 e0Var) {
        return Unit.f312394a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit g(b8 b8Var, boolean z10, Function0 function0, int i10, int i11, androidx.compose.runtime.c0 c0Var, int i12) {
        b8Var.d(z10, function0, c0Var, androidx.compose.runtime.t4.a(i10 | 1), i11);
        return Unit.f312394a;
    }

    @androidx.compose.runtime.o
    @u7
    @androidx.compose.runtime.t(applier = "androidx.compose.ui.UiComposable")
    public final void d(final boolean z10, @Nullable Function0<Unit> function0, @Nullable androidx.compose.runtime.c0 c0Var, final int i10, final int i11) {
        int i12;
        final Function0<Unit> function1;
        androidx.compose.runtime.c0 c0VarR = c0Var.R(876077373);
        if ((i11 & 1) != 0) {
            i12 = i10 | 6;
        } else if ((i10 & 6) == 0) {
            i12 = (c0VarR.G(z10) ? 4 : 2) | i10;
        } else {
            i12 = i10;
        }
        int i13 = i11 & 2;
        if (i13 != 0) {
            i12 |= 48;
        } else if ((i10 & 48) == 0) {
            i12 |= c0VarR.k0(function0) ? 32 : 16;
        }
        if (c0VarR.h((i12 & 19) != 18, i12 & 1)) {
            if (i13 != 0) {
                Object objI0 = c0VarR.i0();
                if (objI0 == androidx.compose.runtime.c0.f35327a.a()) {
                    objI0 = new Function0() { // from class: androidx.compose.material.y7
                        @Override // kotlin.jvm.functions.Function0
                        public final Object invoke() {
                            return b8.e();
                        }
                    };
                    c0VarR.Y(objI0);
                }
                function1 = (Function0) objI0;
            } else {
                function1 = function0;
            }
            if (androidx.compose.runtime.m0.l0()) {
                androidx.compose.runtime.m0.A0(876077373, i12, -1, "androidx.compose.material.ExposedDropdownMenuDefaults.TrailingIcon (ExposedDropdownMenu.kt:235)");
            }
            androidx.compose.ui.a0.a aVar = androidx.compose.ui.a0.E;
            Object objI1 = c0VarR.i0();
            if (objI1 == androidx.compose.runtime.c0.f35327a.a()) {
                objI1 = new Function1() { // from class: androidx.compose.material.z7
                    @Override // kotlin.jvm.functions.Function1
                    public final Object invoke(Object obj) {
                        return b8.f((androidx.compose.ui.semantics.e0) obj);
                    }
                };
                c0VarR.Y(objI1);
            }
            f9.c(function1, androidx.compose.ui.semantics.t.c(aVar, (Function1) objI1), false, null, androidx.compose.runtime.internal.w.e(726122713, true, new a(z10), c0VarR, 54), c0VarR, ((i12 >> 3) & 14) | 24576, 12);
            if (androidx.compose.runtime.m0.l0()) {
                androidx.compose.runtime.m0.z0();
            }
        } else {
            c0VarR.u();
            function1 = function0;
        }
        androidx.compose.runtime.s5 s5VarT = c0VarR.T();
        if (s5VarT != null) {
            s5VarT.a(new Function2() { // from class: androidx.compose.material.a8
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    return b8.g(this.f21978a, z10, function1, i10, i11, (androidx.compose.runtime.c0) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    @androidx.compose.runtime.o
    @NotNull
    public final gj h(long j10, long j11, long j12, long j13, long j14, long j15, long j16, long j17, long j18, long j19, long j20, long j21, long j22, long j23, long j24, long j25, long j26, long j27, long j28, long j29, long j30, long j31, @Nullable androidx.compose.runtime.c0 c0Var, int i10, int i11, int i12, int i13) {
        long j32;
        long jW;
        long j33;
        long jW2;
        long j34;
        long jW3;
        long j35;
        long jW4;
        long jW5;
        long jW6 = (i13 & 1) != 0 ? androidx.compose.ui.graphics.q0.w(((androidx.compose.ui.graphics.q0) c0Var.W(x4.a())).M(), ((Number) c0Var.W(w4.c())).floatValue(), 0.0f, 0.0f, 0.0f, 14, null) : j10;
        long jW7 = (i13 & 2) != 0 ? androidx.compose.ui.graphics.q0.w(jW6, u4.f25148a.b(c0Var, 6), 0.0f, 0.0f, 0.0f, 14, null) : j11;
        long jS = (i13 & 4) != 0 ? androidx.compose.ui.graphics.q0.f38131b.s() : j12;
        long j36 = (i13 & 8) != 0 ? x9.f25488a.a(c0Var, 6).j() : j13;
        long jD = (i13 & 16) != 0 ? x9.f25488a.a(c0Var, 6).d() : j14;
        long jW8 = (i13 & 32) != 0 ? androidx.compose.ui.graphics.q0.w(x9.f25488a.a(c0Var, 6).j(), u4.f25148a.c(c0Var, 6), 0.0f, 0.0f, 0.0f, 14, null) : j15;
        long jW9 = (i13 & 64) != 0 ? androidx.compose.ui.graphics.q0.w(x9.f25488a.a(c0Var, 6).i(), u4.f25148a.b(c0Var, 6), 0.0f, 0.0f, 0.0f, 14, null) : j16;
        if ((i13 & 128) != 0) {
            long j37 = jW9;
            jW = androidx.compose.ui.graphics.q0.w(j37, u4.f25148a.b(c0Var, 6), 0.0f, 0.0f, 0.0f, 14, null);
            j32 = j37;
        } else {
            j32 = jW9;
            jW = j17;
        }
        long jD2 = (i13 & 256) != 0 ? x9.f25488a.a(c0Var, 6).d() : j18;
        long jW10 = (i13 & 512) != 0 ? androidx.compose.ui.graphics.q0.w(x9.f25488a.a(c0Var, 6).i(), 0.54f, 0.0f, 0.0f, 0.0f, 14, null) : j19;
        if ((i13 & 1024) != 0) {
            long j38 = jW10;
            jW2 = androidx.compose.ui.graphics.q0.w(j38, u4.f25148a.b(c0Var, 6), 0.0f, 0.0f, 0.0f, 14, null);
            j33 = j38;
        } else {
            j33 = jW10;
            jW2 = j20;
        }
        long j39 = (i13 & 2048) != 0 ? j33 : j21;
        long jW11 = (i13 & 4096) != 0 ? androidx.compose.ui.graphics.q0.w(x9.f25488a.a(c0Var, 6).i(), 0.54f, 0.0f, 0.0f, 0.0f, 14, null) : j22;
        long jW12 = (i13 & 8192) != 0 ? androidx.compose.ui.graphics.q0.w(x9.f25488a.a(c0Var, 6).j(), u4.f25148a.c(c0Var, 6), 0.0f, 0.0f, 0.0f, 14, null) : j23;
        if ((i13 & 16384) != 0) {
            long j40 = jW11;
            jW3 = androidx.compose.ui.graphics.q0.w(j40, u4.f25148a.b(c0Var, 6), 0.0f, 0.0f, 0.0f, 14, null);
            j34 = j40;
        } else {
            j34 = jW11;
            jW3 = j24;
        }
        long jD3 = (32768 & i13) != 0 ? x9.f25488a.a(c0Var, 6).d() : j25;
        long jW13 = (65536 & i13) != 0 ? androidx.compose.ui.graphics.q0.w(x9.f25488a.a(c0Var, 6).j(), u4.f25148a.c(c0Var, 6), 0.0f, 0.0f, 0.0f, 14, null) : j26;
        long jW14 = (131072 & i13) != 0 ? androidx.compose.ui.graphics.q0.w(x9.f25488a.a(c0Var, 6).i(), u4.f25148a.d(c0Var, 6), 0.0f, 0.0f, 0.0f, 14, null) : j27;
        if ((262144 & i13) != 0) {
            long j41 = jW14;
            jW4 = androidx.compose.ui.graphics.q0.w(j41, u4.f25148a.b(c0Var, 6), 0.0f, 0.0f, 0.0f, 14, null);
            j35 = j41;
        } else {
            j35 = jW14;
            jW4 = j28;
        }
        long jD4 = (524288 & i13) != 0 ? x9.f25488a.a(c0Var, 6).d() : j29;
        long jW15 = (1048576 & i13) != 0 ? androidx.compose.ui.graphics.q0.w(x9.f25488a.a(c0Var, 6).i(), u4.f25148a.d(c0Var, 6), 0.0f, 0.0f, 0.0f, 14, null) : j30;
        if ((i13 & 2097152) != 0) {
            jW5 = androidx.compose.ui.graphics.q0.w(jW15, u4.f25148a.b(c0Var, 6), 0.0f, 0.0f, 0.0f, 14, null);
        } else {
            jW5 = j31;
        }
        if (androidx.compose.runtime.m0.l0()) {
            androidx.compose.runtime.m0.A0(1162641182, i10, i11, "androidx.compose.material.ExposedDropdownMenuDefaults.outlinedTextFieldColors (ExposedDropdownMenu.kt:417)");
        }
        long j42 = j34;
        k5 k5Var = new k5(jW6, jW7, j36, jD, jW8, j32, jD2, jW, j33, jW2, j39, j42, jW12, jW3, jD3, jS, jW13, j35, jW4, jD4, jW15, jW5, null);
        if (androidx.compose.runtime.m0.l0()) {
            androidx.compose.runtime.m0.z0();
        }
        return k5Var;
    }

    @androidx.compose.runtime.o
    @NotNull
    public final gj i(long j10, long j11, long j12, long j13, long j14, long j15, long j16, long j17, long j18, long j19, long j20, long j21, long j22, long j23, long j24, long j25, long j26, long j27, long j28, long j29, long j30, long j31, @Nullable androidx.compose.runtime.c0 c0Var, int i10, int i11, int i12, int i13) {
        long j32;
        long jW;
        long j33;
        long jW2;
        long j34;
        long jW3;
        long j35;
        long jW4;
        long jW5;
        long jW6 = (i13 & 1) != 0 ? androidx.compose.ui.graphics.q0.w(((androidx.compose.ui.graphics.q0) c0Var.W(x4.a())).M(), ((Number) c0Var.W(w4.c())).floatValue(), 0.0f, 0.0f, 0.0f, 14, null) : j10;
        long jW7 = (i13 & 2) != 0 ? androidx.compose.ui.graphics.q0.w(jW6, u4.f25148a.b(c0Var, 6), 0.0f, 0.0f, 0.0f, 14, null) : j11;
        long jW8 = (i13 & 4) != 0 ? androidx.compose.ui.graphics.q0.w(x9.f25488a.a(c0Var, 6).i(), 0.12f, 0.0f, 0.0f, 0.0f, 14, null) : j12;
        long j36 = (i13 & 8) != 0 ? x9.f25488a.a(c0Var, 6).j() : j13;
        long jD = (i13 & 16) != 0 ? x9.f25488a.a(c0Var, 6).d() : j14;
        long jW9 = (i13 & 32) != 0 ? androidx.compose.ui.graphics.q0.w(x9.f25488a.a(c0Var, 6).j(), u4.f25148a.c(c0Var, 6), 0.0f, 0.0f, 0.0f, 14, null) : j15;
        long jW10 = (i13 & 64) != 0 ? androidx.compose.ui.graphics.q0.w(x9.f25488a.a(c0Var, 6).i(), 0.42f, 0.0f, 0.0f, 0.0f, 14, null) : j16;
        if ((i13 & 128) != 0) {
            long j37 = jW10;
            jW = androidx.compose.ui.graphics.q0.w(j37, u4.f25148a.b(c0Var, 6), 0.0f, 0.0f, 0.0f, 14, null);
            j32 = j37;
        } else {
            j32 = jW10;
            jW = j17;
        }
        long jD2 = (i13 & 256) != 0 ? x9.f25488a.a(c0Var, 6).d() : j18;
        long jW11 = (i13 & 512) != 0 ? androidx.compose.ui.graphics.q0.w(x9.f25488a.a(c0Var, 6).i(), 0.54f, 0.0f, 0.0f, 0.0f, 14, null) : j19;
        if ((i13 & 1024) != 0) {
            long j38 = jW11;
            jW2 = androidx.compose.ui.graphics.q0.w(j38, u4.f25148a.b(c0Var, 6), 0.0f, 0.0f, 0.0f, 14, null);
            j33 = j38;
        } else {
            j33 = jW11;
            jW2 = j20;
        }
        long j39 = (i13 & 2048) != 0 ? j33 : j21;
        long jW12 = (i13 & 4096) != 0 ? androidx.compose.ui.graphics.q0.w(x9.f25488a.a(c0Var, 6).i(), 0.54f, 0.0f, 0.0f, 0.0f, 14, null) : j22;
        long jW13 = (i13 & 8192) != 0 ? androidx.compose.ui.graphics.q0.w(x9.f25488a.a(c0Var, 6).j(), u4.f25148a.c(c0Var, 6), 0.0f, 0.0f, 0.0f, 14, null) : j23;
        if ((i13 & 16384) != 0) {
            long j40 = jW12;
            jW3 = androidx.compose.ui.graphics.q0.w(j40, u4.f25148a.b(c0Var, 6), 0.0f, 0.0f, 0.0f, 14, null);
            j34 = j40;
        } else {
            j34 = jW12;
            jW3 = j24;
        }
        long jD3 = (32768 & i13) != 0 ? x9.f25488a.a(c0Var, 6).d() : j25;
        long jW14 = (65536 & i13) != 0 ? androidx.compose.ui.graphics.q0.w(x9.f25488a.a(c0Var, 6).j(), u4.f25148a.c(c0Var, 6), 0.0f, 0.0f, 0.0f, 14, null) : j26;
        long jW15 = (131072 & i13) != 0 ? androidx.compose.ui.graphics.q0.w(x9.f25488a.a(c0Var, 6).i(), u4.f25148a.d(c0Var, 6), 0.0f, 0.0f, 0.0f, 14, null) : j27;
        if ((262144 & i13) != 0) {
            long j41 = jW15;
            jW4 = androidx.compose.ui.graphics.q0.w(j41, u4.f25148a.b(c0Var, 6), 0.0f, 0.0f, 0.0f, 14, null);
            j35 = j41;
        } else {
            j35 = jW15;
            jW4 = j28;
        }
        long jD4 = (524288 & i13) != 0 ? x9.f25488a.a(c0Var, 6).d() : j29;
        long jW16 = (1048576 & i13) != 0 ? androidx.compose.ui.graphics.q0.w(x9.f25488a.a(c0Var, 6).i(), u4.f25148a.d(c0Var, 6), 0.0f, 0.0f, 0.0f, 14, null) : j30;
        if ((i13 & 2097152) != 0) {
            jW5 = androidx.compose.ui.graphics.q0.w(jW16, u4.f25148a.b(c0Var, 6), 0.0f, 0.0f, 0.0f, 14, null);
        } else {
            jW5 = j31;
        }
        if (androidx.compose.runtime.m0.l0()) {
            androidx.compose.runtime.m0.A0(1208167904, i10, i11, "androidx.compose.material.ExposedDropdownMenuDefaults.textFieldColors (ExposedDropdownMenu.kt:322)");
        }
        long j42 = j34;
        k5 k5Var = new k5(jW6, jW7, j36, jD, jW9, j32, jD2, jW, j33, jW2, j39, j42, jW13, jW3, jD3, jW8, jW14, j35, jW4, jD4, jW16, jW5, null);
        if (androidx.compose.runtime.m0.l0()) {
            androidx.compose.runtime.m0.z0();
        }
        return k5Var;
    }
}
