package androidx.compose.ui.graphics;

import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes2.dex */
public final class m0 {
    @NotNull
    public static final k0 a(@NotNull t1 t1Var) {
        return c.a(t1Var);
    }

    public static final void b(@NotNull k0 k0Var, float f10, float f11, float f12) {
        if (f10 == 0.0f) {
            return;
        }
        k0Var.c(f11, f12);
        k0Var.H(f10);
        k0Var.c(-f11, -f12);
    }

    public static final void c(@NotNull k0 k0Var, float f10, float f11, float f12) {
        b(k0Var, i1.a(f10), f11, f12);
    }

    public static /* synthetic */ void d(k0 k0Var, float f10, float f11, float f12, int i10, Object obj) {
        if ((i10 & 2) != 0) {
            f11 = 0.0f;
        }
        if ((i10 & 4) != 0) {
            f12 = 0.0f;
        }
        c(k0Var, f10, f11, f12);
    }

    public static final void e(@NotNull k0 k0Var, float f10, float f11, float f12, float f13) {
        if (f10 == 1.0f && f11 == 1.0f) {
            return;
        }
        k0Var.c(f12, f13);
        k0Var.v(f10, f11);
        k0Var.c(-f12, -f13);
    }

    public static /* synthetic */ void f(k0 k0Var, float f10, float f11, float f12, float f13, int i10, Object obj) {
        if ((i10 & 2) != 0) {
            f11 = f10;
        }
        e(k0Var, f10, f11, f12, f13);
    }

    public static final void g(@NotNull k0 k0Var, @NotNull Function0<Unit> function0) {
        try {
            k0Var.save();
            function0.invoke();
            kotlin.jvm.internal.h0.d(1);
        } finally {
            kotlin.jvm.internal.h0.d(1);
            k0Var.B();
            kotlin.jvm.internal.h0.c(1);
        }
    }

    public static final void h(@NotNull k0 k0Var, @NotNull n0.j jVar, @NotNull h2 h2Var, @NotNull Function0<Unit> function0) {
        try {
            k0Var.l(jVar, h2Var);
            function0.invoke();
            kotlin.jvm.internal.h0.d(1);
            k0Var.B();
            kotlin.jvm.internal.h0.c(1);
        } catch (Throwable th2) {
            kotlin.jvm.internal.h0.d(1);
            k0Var.B();
            kotlin.jvm.internal.h0.c(1);
            throw th2;
        }
    }
}
