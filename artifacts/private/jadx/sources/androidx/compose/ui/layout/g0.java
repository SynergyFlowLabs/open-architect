package androidx.compose.ui.layout;

import java.util.Set;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes2.dex */
public interface g0 {

    public static final class a {
        @Deprecated
        public static boolean a(@NotNull g0 g0Var) {
            return g0.super.U();
        }

        public static /* synthetic */ void b() {
        }

        @Deprecated
        public static long d(@NotNull g0 g0Var, @NotNull g0 g0Var2, long j10, boolean z10) {
            return g0.super.V(g0Var2, j10, z10);
        }

        @Deprecated
        public static long f(@NotNull g0 g0Var, long j10) {
            return g0.super.K(j10);
        }

        @Deprecated
        public static long g(@NotNull g0 g0Var, long j10) {
            return g0.super.w(j10);
        }

        @Deprecated
        public static void h(@NotNull g0 g0Var, @NotNull g0 g0Var2, @NotNull float[] fArr) {
            g0.super.y0(g0Var2, fArr);
        }

        @Deprecated
        public static void i(@NotNull g0 g0Var, @NotNull float[] fArr) {
            g0.super.K0(fArr);
        }
    }

    static /* synthetic */ long A0(g0 g0Var, g0 g0Var2, long j10, boolean z10, int i10, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: localPositionOf-S_NoaFU");
        }
        if ((i10 & 2) != 0) {
            j10 = n0.g.f332700b.e();
        }
        if ((i10 & 4) != 0) {
            z10 = true;
        }
        return g0Var.V(g0Var2, j10, z10);
    }

    static /* synthetic */ n0.j W(g0 g0Var, g0 g0Var2, boolean z10, int i10, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: localBoundingBoxOf");
        }
        if ((i10 & 2) != 0) {
            z10 = true;
        }
        return g0Var.e0(g0Var2, z10);
    }

    boolean I();

    default long K(long j10) {
        return n0.g.f332700b.c();
    }

    default void K0(@NotNull float[] fArr) {
        throw new UnsupportedOperationException("transformToScreen is not implemented on this LayoutCoordinates");
    }

    int M(@NotNull androidx.compose.ui.layout.a aVar);

    @NotNull
    Set<androidx.compose.ui.layout.a> S0();

    default boolean U() {
        return false;
    }

    default long V(@NotNull g0 g0Var, long j10, boolean z10) {
        throw new UnsupportedOperationException("localPositionOf is not implemented on this LayoutCoordinates");
    }

    long a();

    long c0(long j10);

    @NotNull
    n0.j e0(@NotNull g0 g0Var, boolean z10);

    @Nullable
    g0 g0();

    long k0(long j10);

    long r0(@NotNull g0 g0Var, long j10);

    @Nullable
    g0 s0();

    default long w(long j10) {
        return n0.g.f332700b.c();
    }

    long w0(long j10);

    default void y0(@NotNull g0 g0Var, @NotNull float[] fArr) {
        s0.a.l("transformFrom is not implemented on this LayoutCoordinates");
    }
}
