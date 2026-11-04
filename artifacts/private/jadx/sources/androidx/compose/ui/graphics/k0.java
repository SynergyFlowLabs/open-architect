package androidx.compose.ui.graphics;

import java.util.List;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes2.dex */
@SourceDebugExtension({"SMAP\nCanvas.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Canvas.kt\nandroidx/compose/ui/graphics/Canvas\n+ 2 IntSize.kt\nandroidx/compose/ui/unit/IntSizeKt\n+ 3 InlineClassHelper.kt\nandroidx/compose/ui/util/InlineClassHelperKt\n*L\n1#1,540:1\n30#2:541\n80#3:542\n*S KotlinDebug\n*F\n+ 1 Canvas.kt\nandroidx/compose/ui/graphics/Canvas\n*L\n494#1:541\n494#1:542\n*E\n"})
public interface k0 {

    public static final class a {
        @Deprecated
        public static void c(@NotNull k0 k0Var, @NotNull n0.j jVar, int i10) {
            k0.super.u(jVar, i10);
        }

        @Deprecated
        public static void e(@NotNull k0 k0Var, @NotNull n0.j jVar, float f10, float f11, boolean z10, @NotNull h2 h2Var) {
            k0.super.h(jVar, f10, f11, z10, h2Var);
        }

        @Deprecated
        public static void f(@NotNull k0 k0Var, @NotNull n0.j jVar, float f10, float f11, boolean z10, @NotNull h2 h2Var) {
            k0.super.A(jVar, f10, f11, z10, h2Var);
        }

        @Deprecated
        public static void h(@NotNull k0 k0Var, @NotNull n0.j jVar, @NotNull h2 h2Var) {
            k0.super.m(jVar, h2Var);
        }

        @Deprecated
        public static void i(@NotNull k0 k0Var, @NotNull n0.j jVar, @NotNull h2 h2Var) {
            k0.super.o(jVar, h2Var);
        }

        @Deprecated
        public static void k(@NotNull k0 k0Var, float f10, float f11) {
            k0.super.G(f10, f11);
        }
    }

    static /* synthetic */ void C(k0 k0Var, k2 k2Var, int i10, int i11, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: clipPath-mtrdD-E");
        }
        if ((i11 & 2) != 0) {
            i10 = p0.f38096b.b();
        }
        k0Var.e(k2Var, i10);
    }

    static /* synthetic */ void E(k0 k0Var, float f10, float f11, float f12, float f13, int i10, int i11, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: clipRect-N_I0leg");
        }
        if ((i11 & 16) != 0) {
            i10 = p0.f38096b.b();
        }
        k0Var.b(f10, f11, f12, f13, i10);
    }

    static /* synthetic */ void I(k0 k0Var, float f10, float f11, int i10, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: scale");
        }
        if ((i10 & 2) != 0) {
            f11 = f10;
        }
        k0Var.v(f10, f11);
    }

    static /* synthetic */ void p(k0 k0Var, n0.j jVar, int i10, int i11, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: clipRect-mtrdD-E");
        }
        if ((i11 & 2) != 0) {
            i10 = p0.f38096b.b();
        }
        k0Var.u(jVar, i10);
    }

    static /* synthetic */ void r(k0 k0Var, t1 t1Var, long j10, long j11, long j12, long j13, h2 h2Var, int i10, Object obj) {
        long jE;
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: drawImageRect-HPBpro0");
        }
        long jB = (i10 & 2) != 0 ? androidx.compose.ui.unit.q.f42709b.b() : j10;
        if ((i10 & 4) != 0) {
            jE = androidx.compose.ui.unit.u.e((((long) t1Var.getHeight()) & com.rabbitmq.client.k0.f265952a) | (((long) t1Var.getWidth()) << 32));
        } else {
            jE = j11;
        }
        k0Var.g(t1Var, jB, jE, (i10 & 8) != 0 ? androidx.compose.ui.unit.q.f42709b.b() : j12, (i10 & 16) != 0 ? jE : j13, h2Var);
    }

    default void A(@NotNull n0.j jVar, float f10, float f11, boolean z10, @NotNull h2 h2Var) {
        h(jVar, i1.a(f10), i1.a(f11), z10, h2Var);
    }

    void B();

    void D();

    void F(long j10, long j11, @NotNull h2 h2Var);

    default void G(float f10, float f11) {
        J(i1.a(f10), i1.a(f11));
    }

    void H(float f10);

    void J(float f10, float f11);

    void L(@NotNull float[] fArr);

    void M(@NotNull k2 k2Var, @NotNull h2 h2Var);

    void N(long j10, float f10, @NotNull h2 h2Var);

    void P(float f10, float f11, float f12, float f13, float f14, float f15, @NotNull h2 h2Var);

    void b(float f10, float f11, float f12, float f13, int i10);

    void c(float f10, float f11);

    void e(@NotNull k2 k2Var, int i10);

    void f(int i10, @NotNull List<n0.g> list, @NotNull h2 h2Var);

    void g(@NotNull t1 t1Var, long j10, long j11, long j12, long j13, @NotNull h2 h2Var);

    default void h(@NotNull n0.j jVar, float f10, float f11, boolean z10, @NotNull h2 h2Var) {
        n(jVar.t(), jVar.B(), jVar.x(), jVar.j(), f10, f11, z10, h2Var);
    }

    void i(int i10, @NotNull float[] fArr, @NotNull h2 h2Var);

    void j(@NotNull d4 d4Var, int i10, @NotNull h2 h2Var);

    void l(@NotNull n0.j jVar, @NotNull h2 h2Var);

    default void m(@NotNull n0.j jVar, @NotNull h2 h2Var) {
        y(jVar.t(), jVar.B(), jVar.x(), jVar.j(), h2Var);
    }

    void n(float f10, float f11, float f12, float f13, float f14, float f15, boolean z10, @NotNull h2 h2Var);

    default void o(@NotNull n0.j jVar, @NotNull h2 h2Var) {
        x(jVar.t(), jVar.B(), jVar.x(), jVar.j(), h2Var);
    }

    void q();

    void save();

    default void u(@NotNull n0.j jVar, int i10) {
        b(jVar.t(), jVar.B(), jVar.x(), jVar.j(), i10);
    }

    void v(float f10, float f11);

    void x(float f10, float f11, float f12, float f13, @NotNull h2 h2Var);

    void y(float f10, float f11, float f12, float f13, @NotNull h2 h2Var);

    void z(@NotNull t1 t1Var, long j10, @NotNull h2 h2Var);
}
