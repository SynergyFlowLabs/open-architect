package androidx.compose.ui.input.pointer;

import androidx.compose.runtime.k7;
import androidx.compose.ui.platform.o4;
import kotlin.jvm.functions.Function2;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes2.dex */
public interface l0 extends androidx.compose.ui.unit.d {

    public static final class a {
        @Deprecated
        public static long a(@NotNull l0 l0Var) {
            return l0.super.i0();
        }

        @Deprecated
        public static boolean b(@NotNull l0 l0Var) {
            return l0.super.U7();
        }

        public static /* synthetic */ void c() {
        }

        @k7
        @Deprecated
        public static int d(@NotNull l0 l0Var, long j10) {
            return l0.super.c8(j10);
        }

        @k7
        @Deprecated
        public static int e(@NotNull l0 l0Var, float f10) {
            return l0.super.g6(f10);
        }

        @Deprecated
        public static void f(@NotNull l0 l0Var, boolean z10) {
            l0.super.t6(z10);
        }

        @k7
        @Deprecated
        public static float g(@NotNull l0 l0Var, long j10) {
            return l0.super.y(j10);
        }

        @k7
        @Deprecated
        public static float h(@NotNull l0 l0Var, float f10) {
            return l0.super.F3(f10);
        }

        @k7
        @Deprecated
        public static float i(@NotNull l0 l0Var, int i10) {
            return l0.super.D3(i10);
        }

        @k7
        @Deprecated
        public static long j(@NotNull l0 l0Var, long j10) {
            return l0.super.C0(j10);
        }

        @k7
        @Deprecated
        public static float k(@NotNull l0 l0Var, long j10) {
            return l0.super.p6(j10);
        }

        @k7
        @Deprecated
        public static float l(@NotNull l0 l0Var, float f10) {
            return l0.super.S7(f10);
        }

        @k7
        @Deprecated
        @NotNull
        public static n0.j m(@NotNull l0 l0Var, @NotNull androidx.compose.ui.unit.k kVar) {
            return l0.super.N3(kVar);
        }

        @k7
        @Deprecated
        public static long n(@NotNull l0 l0Var, long j10) {
            return l0.super.k4(j10);
        }

        @k7
        @Deprecated
        public static long o(@NotNull l0 l0Var, float f10) {
            return l0.super.d0(f10);
        }

        @k7
        @Deprecated
        public static long p(@NotNull l0 l0Var, float f10) {
            return l0.super.m1(f10);
        }

        @k7
        @Deprecated
        public static long q(@NotNull l0 l0Var, int i10) {
            return l0.super.j1(i10);
        }
    }

    default boolean U7() {
        return false;
    }

    long a();

    @Nullable
    <R> Object g5(@NotNull Function2<? super c, ? super kotlin.coroutines.d<? super R>, ? extends Object> function2, @NotNull kotlin.coroutines.d<? super R> dVar);

    @NotNull
    o4 getViewConfiguration();

    default long i0() {
        return n0.n.f332724b.c();
    }

    default void t6(boolean z10) {
    }
}
