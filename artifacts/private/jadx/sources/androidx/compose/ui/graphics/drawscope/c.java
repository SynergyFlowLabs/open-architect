package androidx.compose.ui.graphics.drawscope;

import androidx.annotation.x;
import androidx.compose.runtime.k7;
import androidx.compose.ui.graphics.r0;
import androidx.compose.ui.graphics.t1;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes2.dex */
public interface c extends f {

    public static final class a {
        @Deprecated
        public static void a(@NotNull c cVar, @NotNull t1 t1Var, long j10, long j11, long j12, long j13, @x(from = 0.0d, to = 1.0d) float f10, @NotNull i iVar, @Nullable r0 r0Var, int i10, int i11) {
            c.super.n8(t1Var, j10, j11, j12, j13, f10, iVar, r0Var, i10, i11);
        }

        @Deprecated
        public static long b(@NotNull c cVar) {
            return c.super.Y();
        }

        @Deprecated
        public static long c(@NotNull c cVar) {
            return c.super.d();
        }

        @Deprecated
        public static void d(@NotNull c cVar, @NotNull androidx.compose.ui.graphics.layer.c cVar2, long j10, @NotNull Function1<? super f, Unit> function1) {
            c.super.H3(cVar2, j10, function1);
        }

        @k7
        @Deprecated
        public static int e(@NotNull c cVar, long j10) {
            return c.super.c8(j10);
        }

        @k7
        @Deprecated
        public static int f(@NotNull c cVar, float f10) {
            return c.super.g6(f10);
        }

        @k7
        @Deprecated
        public static float g(@NotNull c cVar, long j10) {
            return c.super.y(j10);
        }

        @k7
        @Deprecated
        public static float h(@NotNull c cVar, float f10) {
            return c.super.F3(f10);
        }

        @k7
        @Deprecated
        public static float i(@NotNull c cVar, int i10) {
            return c.super.D3(i10);
        }

        @k7
        @Deprecated
        public static long j(@NotNull c cVar, long j10) {
            return c.super.C0(j10);
        }

        @k7
        @Deprecated
        public static float k(@NotNull c cVar, long j10) {
            return c.super.p6(j10);
        }

        @k7
        @Deprecated
        public static float l(@NotNull c cVar, float f10) {
            return c.super.S7(f10);
        }

        @k7
        @Deprecated
        @NotNull
        public static n0.j m(@NotNull c cVar, @NotNull androidx.compose.ui.unit.k kVar) {
            return c.super.N3(kVar);
        }

        @k7
        @Deprecated
        public static long n(@NotNull c cVar, long j10) {
            return c.super.k4(j10);
        }

        @k7
        @Deprecated
        public static long o(@NotNull c cVar, float f10) {
            return c.super.d0(f10);
        }

        @k7
        @Deprecated
        public static long p(@NotNull c cVar, float f10) {
            return c.super.m1(f10);
        }

        @k7
        @Deprecated
        public static long q(@NotNull c cVar, int i10) {
            return c.super.j1(i10);
        }
    }

    void E4();
}
