package androidx.compose.material3;

import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes.dex */
@androidx.compose.runtime.internal.w0(parameters = 1)
@SourceDebugExtension({"SMAP\nMenu.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Menu.kt\nandroidx/compose/material3/MenuDefaults\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 3 Dp.kt\nandroidx/compose/ui/unit/DpKt\n*L\n1#1,535:1\n1#2:536\n113#3:537\n*S KotlinDebug\n*F\n+ 1 Menu.kt\nandroidx/compose/material3/MenuDefaults\n*L\n256#1:537\n*E\n"})
public final class wj {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    public static final wj f34253a = new wj();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static final float f34254b = d0.e0.f267938a.a();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static final float f34255c = d0.g1.f268088a.b();

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @NotNull
    private static final androidx.compose.foundation.layout.g5 f34256d = androidx.compose.foundation.layout.d5.g(bk.f26296c, androidx.compose.ui.unit.h.r(0));

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final int f34257e = 0;

    private wj() {
    }

    @androidx.compose.runtime.o
    @oj.i(name = "getContainerColor")
    public final long a(@Nullable androidx.compose.runtime.c0 c0Var, int i10) {
        if (androidx.compose.runtime.m0.l0()) {
            androidx.compose.runtime.m0.A0(-1787427929, i10, -1, "androidx.compose.material3.MenuDefaults.<get-containerColor> (Menu.kt:193)");
        }
        long jR = o6.r(d0.g1.f268088a.a(), c0Var, 6);
        if (androidx.compose.runtime.m0.l0()) {
            androidx.compose.runtime.m0.z0();
        }
        return jR;
    }

    @NotNull
    public final xj b(@NotNull l6 l6Var) {
        xj xjVarE = l6Var.E();
        if (xjVarE != null) {
            return xjVarE;
        }
        d0.d1 d1Var = d0.d1.f267807a;
        xj xjVar = new xj(o6.o(l6Var, d1Var.w()), o6.o(l6Var, d1Var.E()), o6.o(l6Var, d1Var.X()), androidx.compose.ui.graphics.q0.w(o6.o(l6Var, d1Var.g()), d1Var.h(), 0.0f, 0.0f, 0.0f, 14, null), androidx.compose.ui.graphics.q0.w(o6.o(l6Var, d1Var.i()), d1Var.j(), 0.0f, 0.0f, 0.0f, 14, null), androidx.compose.ui.graphics.q0.w(o6.o(l6Var, d1Var.k()), d1Var.l(), 0.0f, 0.0f, 0.0f, 14, null), null);
        l6Var.w1(xjVar);
        return xjVar;
    }

    @NotNull
    public final androidx.compose.foundation.layout.g5 c() {
        return f34256d;
    }

    public final float d() {
        return f34255c;
    }

    @androidx.compose.runtime.o
    @oj.i(name = "getShape")
    @NotNull
    public final androidx.compose.ui.graphics.q3 e(@Nullable androidx.compose.runtime.c0 c0Var, int i10) {
        if (androidx.compose.runtime.m0.l0()) {
            androidx.compose.runtime.m0.A0(218702739, i10, -1, "androidx.compose.material3.MenuDefaults.<get-shape> (Menu.kt:189)");
        }
        androidx.compose.ui.graphics.q3 q3VarI = cx.i(d0.g1.f268088a.c(), c0Var, 6);
        if (androidx.compose.runtime.m0.l0()) {
            androidx.compose.runtime.m0.z0();
        }
        return q3VarI;
    }

    public final float f() {
        return f34254b;
    }

    @androidx.compose.runtime.o
    @NotNull
    public final xj g(@Nullable androidx.compose.runtime.c0 c0Var, int i10) {
        if (androidx.compose.runtime.m0.l0()) {
            androidx.compose.runtime.m0.A0(1326531516, i10, -1, "androidx.compose.material3.MenuDefaults.itemColors (Menu.kt:199)");
        }
        xj xjVarB = b(pj.f31758a.a(c0Var, 6));
        if (androidx.compose.runtime.m0.l0()) {
            androidx.compose.runtime.m0.z0();
        }
        return xjVarB;
    }

    @androidx.compose.runtime.o
    @NotNull
    public final xj h(long j10, long j11, long j12, long j13, long j14, long j15, @Nullable androidx.compose.runtime.c0 c0Var, int i10, int i11) {
        long jU = (i11 & 1) != 0 ? androidx.compose.ui.graphics.q0.f38131b.u() : j10;
        long jU2 = (i11 & 2) != 0 ? androidx.compose.ui.graphics.q0.f38131b.u() : j11;
        long jU3 = (i11 & 4) != 0 ? androidx.compose.ui.graphics.q0.f38131b.u() : j12;
        long jU4 = (i11 & 8) != 0 ? androidx.compose.ui.graphics.q0.f38131b.u() : j13;
        long jU5 = (i11 & 16) != 0 ? androidx.compose.ui.graphics.q0.f38131b.u() : j14;
        long jU6 = (i11 & 32) != 0 ? androidx.compose.ui.graphics.q0.f38131b.u() : j15;
        if (androidx.compose.runtime.m0.l0()) {
            androidx.compose.runtime.m0.A0(-1278543580, i10, -1, "androidx.compose.material3.MenuDefaults.itemColors (Menu.kt:224)");
        }
        xj xjVarA = b(pj.f31758a.a(c0Var, 6)).a(jU, jU2, jU3, jU4, jU5, jU6);
        if (androidx.compose.runtime.m0.l0()) {
            androidx.compose.runtime.m0.z0();
        }
        return xjVarA;
    }
}
