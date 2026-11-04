package androidx.media3.exoplayer;

import java.lang.annotation.Documented;
import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

/* JADX INFO: loaded from: classes3.dex */
@androidx.media3.common.util.b1
public interface a5 {
    public static final int H0 = 7;
    public static final int I0 = 24;
    public static final int J0 = 16;
    public static final int K0 = 8;
    public static final int L0 = 0;
    public static final int M0 = 32;
    public static final int N0 = 32;
    public static final int O0 = 0;
    public static final int P0 = 64;
    public static final int Q0 = 64;
    public static final int R0 = 0;
    public static final int S0 = 384;
    public static final int T0 = 256;
    public static final int U0 = 128;
    public static final int V0 = 0;
    public static final int W0 = 3584;
    public static final int X0 = 2048;
    public static final int Y0 = 1024;
    public static final int Z0 = 512;

    /* JADX INFO: renamed from: a1, reason: collision with root package name */
    public static final int f62789a1 = 0;

    @Target({ElementType.TYPE_USE})
    @Documented
    @Retention(RetentionPolicy.SOURCE)
    public @interface a {
    }

    @Target({ElementType.TYPE_USE})
    @Documented
    @Retention(RetentionPolicy.SOURCE)
    public @interface b {
    }

    @Target({ElementType.TYPE_USE})
    @Documented
    @Retention(RetentionPolicy.SOURCE)
    public @interface c {
    }

    @Target({ElementType.TYPE_USE})
    @Documented
    @Retention(RetentionPolicy.SOURCE)
    public @interface d {
    }

    @Target({ElementType.TYPE_USE})
    @Documented
    @Retention(RetentionPolicy.SOURCE)
    public @interface e {
    }

    public interface f {
        void a(z4 z4Var);
    }

    @Target({ElementType.TYPE_USE})
    @Documented
    @Retention(RetentionPolicy.SOURCE)
    public @interface g {
    }

    @e.a({"WrongConstant"})
    static int B(int i10, int i11, int i12, int i13, int i14, int i15) {
        return i10 | i11 | i12 | i13 | i14 | i15;
    }

    @e.a({"WrongConstant"})
    static int C(int i10) {
        return i10 & 64;
    }

    static int D(int i10, int i11, int i12) {
        return B(i10, i11, i12, 0, 128, 0);
    }

    @e.a({"WrongConstant"})
    static int F(int i10) {
        return i10 & 7;
    }

    @e.a({"WrongConstant"})
    static int H(int i10) {
        return i10 & S0;
    }

    static boolean I(int i10, boolean z10) {
        int iF = F(i10);
        return iF == 4 || (z10 && iF == 3);
    }

    static int K(int i10, int i11, int i12, int i13, int i14) {
        return B(i10, i11, i12, i13, i14, 0);
    }

    @e.a({"WrongConstant"})
    static int L(int i10) {
        return i10 & 32;
    }

    static int M(int i10) {
        return n(i10, 0, 0, 0);
    }

    static int n(int i10, int i11, int i12, int i13) {
        return B(i10, i11, i12, 0, 128, i13);
    }

    @e.a({"WrongConstant"})
    static int o(int i10) {
        return i10 & 24;
    }

    @e.a({"WrongConstant"})
    static int z(int i10) {
        return i10 & W0;
    }

    default void G() {
    }

    default void Q(f fVar) {
    }

    int b(androidx.media3.common.w wVar) throws s0;

    int f();

    String getName();

    int l() throws s0;
}
