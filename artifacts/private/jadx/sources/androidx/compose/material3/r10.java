package androidx.compose.material3;

import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes.dex */
@androidx.compose.runtime.internal.w0(parameters = 1)
@SourceDebugExtension({"SMAP\nChip.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Chip.kt\nandroidx/compose/material3/SuggestionChipDefaults\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,2969:1\n1#2:2970\n*E\n"})
public final class r10 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    public static final r10 f32387a = new r10();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static final float f32388b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static final float f32389c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final int f32390d = 0;

    static {
        d0.x2 x2Var = d0.x2.f269296a;
        f32388b = x2Var.a();
        f32389c = x2Var.F();
    }

    private r10() {
    }

    @androidx.compose.runtime.o
    @NotNull
    public final d5 a(@Nullable androidx.compose.runtime.c0 c0Var, int i10) {
        if (androidx.compose.runtime.m0.l0()) {
            androidx.compose.runtime.m0.A0(1671233087, i10, -1, "androidx.compose.material3.SuggestionChipDefaults.elevatedSuggestionChipColors (Chip.kt:1851)");
        }
        d5 d5VarD = d(pj.f31758a.a(c0Var, 6));
        if (androidx.compose.runtime.m0.l0()) {
            androidx.compose.runtime.m0.z0();
        }
        return d5VarD;
    }

    @androidx.compose.runtime.o
    @NotNull
    public final d5 b(long j10, long j11, long j12, long j13, long j14, long j15, @Nullable androidx.compose.runtime.c0 c0Var, int i10, int i11) {
        long jU = (i11 & 1) != 0 ? androidx.compose.ui.graphics.q0.f38131b.u() : j10;
        long jU2 = (i11 & 2) != 0 ? androidx.compose.ui.graphics.q0.f38131b.u() : j11;
        long jU3 = (i11 & 4) != 0 ? androidx.compose.ui.graphics.q0.f38131b.u() : j12;
        long jU4 = (i11 & 8) != 0 ? androidx.compose.ui.graphics.q0.f38131b.u() : j13;
        long jU5 = (i11 & 16) != 0 ? androidx.compose.ui.graphics.q0.f38131b.u() : j14;
        long jU6 = (i11 & 32) != 0 ? androidx.compose.ui.graphics.q0.f38131b.u() : j15;
        if (androidx.compose.runtime.m0.l0()) {
            androidx.compose.runtime.m0.A0(1269423125, i10, -1, "androidx.compose.material3.SuggestionChipDefaults.elevatedSuggestionChipColors (Chip.kt:1873)");
        }
        d5 d5VarD = d(pj.f31758a.a(c0Var, 6));
        androidx.compose.ui.graphics.q0.a aVar = androidx.compose.ui.graphics.q0.f38131b;
        d5 d5VarB = d5VarD.b(jU, jU2, jU3, aVar.u(), jU4, jU5, jU6, aVar.u());
        if (androidx.compose.runtime.m0.l0()) {
            androidx.compose.runtime.m0.z0();
        }
        return d5VarB;
    }

    @androidx.compose.runtime.o
    @NotNull
    public final e5 c(float f10, float f11, float f12, float f13, float f14, float f15, @Nullable androidx.compose.runtime.c0 c0Var, int i10, int i11) {
        if ((i11 & 1) != 0) {
            f10 = d0.x2.f269296a.k();
        }
        if ((i11 & 2) != 0) {
            f11 = d0.x2.f269296a.q();
        }
        if ((i11 & 4) != 0) {
            f12 = d0.x2.f269296a.o();
        }
        if ((i11 & 8) != 0) {
            f13 = d0.x2.f269296a.p();
        }
        if ((i11 & 16) != 0) {
            f14 = d0.x2.f269296a.g();
        }
        float f16 = f14;
        if ((i11 & 32) != 0) {
            f15 = d0.x2.f269296a.m();
        }
        if (androidx.compose.runtime.m0.l0()) {
            androidx.compose.runtime.m0.A0(1118088467, i10, -1, "androidx.compose.material3.SuggestionChipDefaults.elevatedSuggestionChipElevation (Chip.kt:1926)");
        }
        float f17 = f15;
        float f18 = f12;
        float f19 = f10;
        e5 e5Var = new e5(f19, f11, f18, f13, f16, f17, null);
        if (androidx.compose.runtime.m0.l0()) {
            androidx.compose.runtime.m0.z0();
        }
        return e5Var;
    }

    @NotNull
    public final d5 d(@NotNull l6 l6Var) {
        d5 d5VarR = l6Var.r();
        if (d5VarR != null) {
            return d5VarR;
        }
        d0.x2 x2Var = d0.x2.f269296a;
        long jO = o6.o(l6Var, x2Var.j());
        long jO2 = o6.o(l6Var, x2Var.C());
        long jO3 = o6.o(l6Var, x2Var.E());
        androidx.compose.ui.graphics.q0.a aVar = androidx.compose.ui.graphics.q0.f38131b;
        long jU = aVar.u();
        long jO4 = o6.o(l6Var, x2Var.l());
        d0.g gVar = d0.g.f268054a;
        d5 d5Var = new d5(jO, jO2, jO3, jU, androidx.compose.ui.graphics.q0.w(jO4, gVar.n(), 0.0f, 0.0f, 0.0f, 14, null), androidx.compose.ui.graphics.q0.w(o6.o(l6Var, x2Var.c()), x2Var.d(), 0.0f, 0.0f, 0.0f, 14, null), androidx.compose.ui.graphics.q0.w(o6.o(l6Var, gVar.c()), gVar.d(), 0.0f, 0.0f, 0.0f, 14, null), aVar.u(), null);
        l6Var.j1(d5Var);
        return d5Var;
    }

    public final float e() {
        return f32388b;
    }

    public final float f() {
        return f32389c;
    }

    @androidx.compose.runtime.o
    @oj.i(name = "getShape")
    @NotNull
    public final androidx.compose.ui.graphics.q3 g(@Nullable androidx.compose.runtime.c0 c0Var, int i10) {
        if (androidx.compose.runtime.m0.l0()) {
            androidx.compose.runtime.m0.A0(641188183, i10, -1, "androidx.compose.material3.SuggestionChipDefaults.<get-shape> (Chip.kt:1937)");
        }
        androidx.compose.ui.graphics.q3 q3VarI = cx.i(d0.x2.f269296a.b(), c0Var, 6);
        if (androidx.compose.runtime.m0.l0()) {
            androidx.compose.runtime.m0.z0();
        }
        return q3VarI;
    }

    @androidx.compose.runtime.o
    @kotlin.l(level = kotlin.n.WARNING, message = "Maintained for binary compatibility. Use the suggestChipBorder functions instead", replaceWith = @kotlin.b1(expression = "suggestionChipBorder(enabled, borderColor, disabledBorderColor, borderWidth)", imports = {}))
    @NotNull
    public final c5 h(long j10, long j11, float f10, @Nullable androidx.compose.runtime.c0 c0Var, int i10, int i11) {
        long jW;
        long jR = (i11 & 1) != 0 ? o6.r(d0.x2.f269296a.v(), c0Var, 6) : j10;
        if ((i11 & 2) != 0) {
            d0.x2 x2Var = d0.x2.f269296a;
            jW = androidx.compose.ui.graphics.q0.w(o6.r(x2Var.s(), c0Var, 6), x2Var.t(), 0.0f, 0.0f, 0.0f, 14, null);
        } else {
            jW = j11;
        }
        float fW = (i11 & 4) != 0 ? d0.x2.f269296a.w() : f10;
        if (androidx.compose.runtime.m0.l0()) {
            androidx.compose.runtime.m0.A0(439283919, i10, -1, "androidx.compose.material3.SuggestionChipDefaults.suggestionChipBorder (Chip.kt:1839)");
        }
        c5 c5Var = new c5(jR, jW, fW, null);
        if (androidx.compose.runtime.m0.l0()) {
            androidx.compose.runtime.m0.z0();
        }
        return c5Var;
    }

    @androidx.compose.runtime.o
    @NotNull
    public final androidx.compose.foundation.a1 i(boolean z10, long j10, long j11, float f10, @Nullable androidx.compose.runtime.c0 c0Var, int i10, int i11) {
        long jW;
        long jR = (i11 & 2) != 0 ? o6.r(d0.x2.f269296a.v(), c0Var, 6) : j10;
        if ((i11 & 4) != 0) {
            d0.x2 x2Var = d0.x2.f269296a;
            jW = androidx.compose.ui.graphics.q0.w(o6.r(x2Var.s(), c0Var, 6), x2Var.t(), 0.0f, 0.0f, 0.0f, 14, null);
        } else {
            jW = j11;
        }
        float fW = (i11 & 8) != 0 ? d0.x2.f269296a.w() : f10;
        if (androidx.compose.runtime.m0.l0()) {
            androidx.compose.runtime.m0.A0(-637354809, i10, -1, "androidx.compose.material3.SuggestionChipDefaults.suggestionChipBorder (Chip.kt:1812)");
        }
        if (!z10) {
            jR = jW;
        }
        androidx.compose.foundation.a1 a1VarA = androidx.compose.foundation.b1.a(fW, jR);
        if (androidx.compose.runtime.m0.l0()) {
            androidx.compose.runtime.m0.z0();
        }
        return a1VarA;
    }

    @androidx.compose.runtime.o
    @NotNull
    public final d5 j(@Nullable androidx.compose.runtime.c0 c0Var, int i10) {
        if (androidx.compose.runtime.m0.l0()) {
            androidx.compose.runtime.m0.A0(1918570697, i10, -1, "androidx.compose.material3.SuggestionChipDefaults.suggestionChipColors (Chip.kt:1733)");
        }
        d5 d5VarD0 = w5.d0(pj.f31758a.a(c0Var, 6));
        if (androidx.compose.runtime.m0.l0()) {
            androidx.compose.runtime.m0.z0();
        }
        return d5VarD0;
    }

    @androidx.compose.runtime.o
    @NotNull
    public final d5 k(long j10, long j11, long j12, long j13, long j14, long j15, @Nullable androidx.compose.runtime.c0 c0Var, int i10, int i11) {
        long jU = (i11 & 1) != 0 ? androidx.compose.ui.graphics.q0.f38131b.u() : j10;
        long jU2 = (i11 & 2) != 0 ? androidx.compose.ui.graphics.q0.f38131b.u() : j11;
        long jU3 = (i11 & 4) != 0 ? androidx.compose.ui.graphics.q0.f38131b.u() : j12;
        long jU4 = (i11 & 8) != 0 ? androidx.compose.ui.graphics.q0.f38131b.u() : j13;
        long jU5 = (i11 & 16) != 0 ? androidx.compose.ui.graphics.q0.f38131b.u() : j14;
        long jU6 = (i11 & 32) != 0 ? androidx.compose.ui.graphics.q0.f38131b.u() : j15;
        if (androidx.compose.runtime.m0.l0()) {
            androidx.compose.runtime.m0.A0(1882647883, i10, -1, "androidx.compose.material3.SuggestionChipDefaults.suggestionChipColors (Chip.kt:1755)");
        }
        d5 d5VarD0 = w5.d0(pj.f31758a.a(c0Var, 6));
        androidx.compose.ui.graphics.q0.a aVar = androidx.compose.ui.graphics.q0.f38131b;
        d5 d5VarB = d5VarD0.b(jU, jU2, jU3, aVar.u(), jU4, jU5, jU6, aVar.u());
        if (androidx.compose.runtime.m0.l0()) {
            androidx.compose.runtime.m0.z0();
        }
        return d5VarB;
    }

    @androidx.compose.runtime.o
    @NotNull
    public final e5 l(float f10, float f11, float f12, float f13, float f14, float f15, @Nullable androidx.compose.runtime.c0 c0Var, int i10, int i11) {
        if ((i11 & 1) != 0) {
            f10 = d0.x2.f269296a.r();
        }
        if ((i11 & 2) != 0) {
            f11 = f10;
        }
        if ((i11 & 4) != 0) {
            f12 = f10;
        }
        if ((i11 & 8) != 0) {
            f13 = f10;
        }
        if ((i11 & 16) != 0) {
            f14 = d0.x2.f269296a.g();
        }
        float f16 = f14;
        if ((i11 & 32) != 0) {
            f15 = f10;
        }
        if (androidx.compose.runtime.m0.l0()) {
            androidx.compose.runtime.m0.A0(1929994057, i10, -1, "androidx.compose.material3.SuggestionChipDefaults.suggestionChipElevation (Chip.kt:1786)");
        }
        float f17 = f15;
        float f18 = f12;
        float f19 = f10;
        e5 e5Var = new e5(f19, f11, f18, f13, f16, f17, null);
        if (androidx.compose.runtime.m0.l0()) {
            androidx.compose.runtime.m0.z0();
        }
        return e5Var;
    }
}
