package androidx.compose.ui.draw;

import androidx.compose.runtime.k7;
import androidx.compose.ui.graphics.i0;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes.dex */
public interface y extends androidx.compose.ui.unit.d {

    public static final class a {
        @k7
        @Deprecated
        public static int a(@NotNull y yVar, long j10) {
            return y.super.c8(j10);
        }

        @k7
        @Deprecated
        public static int b(@NotNull y yVar, float f10) {
            return y.super.g6(f10);
        }

        @k7
        @Deprecated
        public static float c(@NotNull y yVar, long j10) {
            return y.super.y(j10);
        }

        @k7
        @Deprecated
        public static float d(@NotNull y yVar, float f10) {
            return y.super.F3(f10);
        }

        @k7
        @Deprecated
        public static float e(@NotNull y yVar, int i10) {
            return y.super.D3(i10);
        }

        @k7
        @Deprecated
        public static long f(@NotNull y yVar, long j10) {
            return y.super.C0(j10);
        }

        @k7
        @Deprecated
        public static float g(@NotNull y yVar, long j10) {
            return y.super.p6(j10);
        }

        @k7
        @Deprecated
        public static float h(@NotNull y yVar, float f10) {
            return y.super.S7(f10);
        }

        @k7
        @Deprecated
        @NotNull
        public static n0.j i(@NotNull y yVar, @NotNull androidx.compose.ui.unit.k kVar) {
            return y.super.N3(kVar);
        }

        @k7
        @Deprecated
        public static long j(@NotNull y yVar, long j10) {
            return y.super.k4(j10);
        }

        @k7
        @Deprecated
        public static long k(@NotNull y yVar, float f10) {
            return y.super.d0(f10);
        }

        @k7
        @Deprecated
        public static long l(@NotNull y yVar, float f10) {
            return y.super.m1(f10);
        }

        @k7
        @Deprecated
        public static long m(@NotNull y yVar, int i10) {
            return y.super.j1(i10);
        }
    }

    float K5();

    long O3();

    void P6(@Nullable i0 i0Var);

    float R();

    void S(long j10);

    void c2(float f10);

    @Nullable
    i0 o0();

    void q7(long j10);

    float r();

    void s(int i10);

    void setAlpha(float f10);

    int t();

    long u();

    void y3(float f10);
}
