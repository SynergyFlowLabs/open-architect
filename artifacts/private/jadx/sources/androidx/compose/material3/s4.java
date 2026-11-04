package androidx.compose.material3;

import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes.dex */
@androidx.compose.runtime.internal.w0(parameters = 1)
@SourceDebugExtension({"SMAP\nCheckbox.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Checkbox.kt\nandroidx/compose/material3/CheckboxDefaults\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 3 Dp.kt\nandroidx/compose/ui/unit/DpKt\n*L\n1#1,739:1\n1#2:740\n113#3:741\n*S KotlinDebug\n*F\n+ 1 Checkbox.kt\nandroidx/compose/material3/CheckboxDefaults\n*L\n391#1:741\n*E\n"})
public final class s4 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    public static final s4 f32691a = new s4();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static final float f32692b = androidx.compose.ui.unit.h.r(2);

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final int f32693c = 0;

    private s4() {
    }

    @androidx.compose.runtime.o
    @NotNull
    public final r4 a(@Nullable androidx.compose.runtime.c0 c0Var, int i10) {
        if (androidx.compose.runtime.m0.l0()) {
            androidx.compose.runtime.m0.A0(-9530498, i10, -1, "androidx.compose.material3.CheckboxDefaults.colors (Checkbox.kt:315)");
        }
        r4 r4VarC = c(pj.f31758a.a(c0Var, 6));
        if (androidx.compose.runtime.m0.l0()) {
            androidx.compose.runtime.m0.z0();
        }
        return r4VarC;
    }

    @androidx.compose.runtime.o
    @NotNull
    public final r4 b(long j10, long j11, long j12, long j13, long j14, long j15, @Nullable androidx.compose.runtime.c0 c0Var, int i10, int i11) {
        long jU = (i11 & 1) != 0 ? androidx.compose.ui.graphics.q0.f38131b.u() : j10;
        long jU2 = (i11 & 2) != 0 ? androidx.compose.ui.graphics.q0.f38131b.u() : j11;
        long jU3 = (i11 & 4) != 0 ? androidx.compose.ui.graphics.q0.f38131b.u() : j12;
        long jU4 = (i11 & 8) != 0 ? androidx.compose.ui.graphics.q0.f38131b.u() : j13;
        long jU5 = (i11 & 16) != 0 ? androidx.compose.ui.graphics.q0.f38131b.u() : j14;
        long jU6 = (i11 & 32) != 0 ? androidx.compose.ui.graphics.q0.f38131b.u() : j15;
        if (androidx.compose.runtime.m0.l0()) {
            androidx.compose.runtime.m0.A0(-89536160, i10, -1, "androidx.compose.material3.CheckboxDefaults.colors (Checkbox.kt:341)");
        }
        r4 r4VarC = c(pj.f31758a.a(c0Var, 6));
        androidx.compose.ui.graphics.q0.a aVar = androidx.compose.ui.graphics.q0.f38131b;
        r4 r4VarE = r4VarC.e(jU3, aVar.s(), jU, aVar.s(), jU4, aVar.s(), jU6, jU, jU2, jU4, jU5, jU6);
        if (androidx.compose.runtime.m0.l0()) {
            androidx.compose.runtime.m0.z0();
        }
        return r4VarE;
    }

    @NotNull
    public final r4 c(@NotNull l6 l6Var) {
        r4 r4VarK = l6Var.k();
        if (r4VarK != null) {
            return r4VarK;
        }
        d0.q qVar = d0.q.f268665a;
        long jO = o6.o(l6Var, qVar.z());
        androidx.compose.ui.graphics.q0.a aVar = androidx.compose.ui.graphics.q0.f38131b;
        r4 r4Var = new r4(jO, aVar.s(), o6.o(l6Var, qVar.e()), aVar.s(), androidx.compose.ui.graphics.q0.w(o6.o(l6Var, qVar.f()), 0.38f, 0.0f, 0.0f, 0.0f, 14, null), aVar.s(), androidx.compose.ui.graphics.q0.w(o6.o(l6Var, qVar.f()), 0.38f, 0.0f, 0.0f, 0.0f, 14, null), o6.o(l6Var, qVar.e()), o6.o(l6Var, qVar.T()), androidx.compose.ui.graphics.q0.w(o6.o(l6Var, qVar.f()), 0.38f, 0.0f, 0.0f, 0.0f, 14, null), androidx.compose.ui.graphics.q0.w(o6.o(l6Var, qVar.G()), 0.38f, 0.0f, 0.0f, 0.0f, 14, null), androidx.compose.ui.graphics.q0.w(o6.o(l6Var, qVar.f()), 0.38f, 0.0f, 0.0f, 0.0f, 14, null), null);
        l6Var.d1(r4Var);
        return r4Var;
    }

    public final float d() {
        return f32692b;
    }
}
