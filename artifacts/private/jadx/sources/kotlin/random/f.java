package kotlin.random;

import com.rabbitmq.client.k0;
import java.io.Serializable;
import kotlin.e1;
import kotlin.internal.m;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes11.dex */
@e1(version = "1.3")
@SourceDebugExtension({"SMAP\nRandom.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Random.kt\nkotlin/random/Random\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,383:1\n1#2:384\n*E\n"})
public abstract class f {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    public static final a f312895a = new a(null);

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NotNull
    private static final f f312896b = m.f312513a.b();

    public static final class a extends f implements Serializable {

        /* JADX INFO: renamed from: kotlin.random.f$a$a, reason: collision with other inner class name */
        private static final class C2261a implements Serializable {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            @NotNull
            public static final C2261a f312897a = new C2261a();

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            private static final long f312898b = 0;

            private C2261a() {
            }

            private final Object readResolve() {
                return f.f312895a;
            }
        }

        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private final Object writeReplace() {
            return C2261a.f312897a;
        }

        @Override // kotlin.random.f
        public int b(int i10) {
            return f.f312896b.b(i10);
        }

        @Override // kotlin.random.f
        public boolean c() {
            return f.f312896b.c();
        }

        @Override // kotlin.random.f
        @NotNull
        public byte[] d(int i10) {
            return f.f312896b.d(i10);
        }

        @Override // kotlin.random.f
        @NotNull
        public byte[] e(@NotNull byte[] array) {
            Intrinsics.checkNotNullParameter(array, "array");
            return f.f312896b.e(array);
        }

        @Override // kotlin.random.f
        @NotNull
        public byte[] f(@NotNull byte[] array, int i10, int i11) {
            Intrinsics.checkNotNullParameter(array, "array");
            return f.f312896b.f(array, i10, i11);
        }

        @Override // kotlin.random.f
        public double h() {
            return f.f312896b.h();
        }

        @Override // kotlin.random.f
        public double i(double d10) {
            return f.f312896b.i(d10);
        }

        @Override // kotlin.random.f
        public double j(double d10, double d11) {
            return f.f312896b.j(d10, d11);
        }

        @Override // kotlin.random.f
        public float k() {
            return f.f312896b.k();
        }

        @Override // kotlin.random.f
        public int l() {
            return f.f312896b.l();
        }

        @Override // kotlin.random.f
        public int m(int i10) {
            return f.f312896b.m(i10);
        }

        @Override // kotlin.random.f
        public int n(int i10, int i11) {
            return f.f312896b.n(i10, i11);
        }

        @Override // kotlin.random.f
        public long o() {
            return f.f312896b.o();
        }

        @Override // kotlin.random.f
        public long p(long j10) {
            return f.f312896b.p(j10);
        }

        @Override // kotlin.random.f
        public long q(long j10, long j11) {
            return f.f312896b.q(j10, j11);
        }

        private a() {
        }
    }

    public static /* synthetic */ byte[] g(f fVar, byte[] bArr, int i10, int i11, int i12, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: nextBytes");
        }
        if ((i12 & 2) != 0) {
            i10 = 0;
        }
        if ((i12 & 4) != 0) {
            i11 = bArr.length;
        }
        return fVar.f(bArr, i10, i11);
    }

    public abstract int b(int i10);

    public boolean c() {
        return b(1) != 0;
    }

    @NotNull
    public byte[] d(int i10) {
        return e(new byte[i10]);
    }

    @NotNull
    public byte[] e(@NotNull byte[] array) {
        Intrinsics.checkNotNullParameter(array, "array");
        return f(array, 0, array.length);
    }

    @NotNull
    public byte[] f(@NotNull byte[] array, int i10, int i11) {
        Intrinsics.checkNotNullParameter(array, "array");
        if (i10 < 0 || i10 > array.length || i11 < 0 || i11 > array.length) {
            throw new IllegalArgumentException(("fromIndex (" + i10 + ") or toIndex (" + i11 + ") are out of range: 0.." + array.length + '.').toString());
        }
        if (i10 > i11) {
            throw new IllegalArgumentException(("fromIndex (" + i10 + ") must be not greater than toIndex (" + i11 + ").").toString());
        }
        int i12 = (i11 - i10) / 4;
        for (int i13 = 0; i13 < i12; i13++) {
            int iL = l();
            array[i10] = (byte) iL;
            array[i10 + 1] = (byte) (iL >>> 8);
            array[i10 + 2] = (byte) (iL >>> 16);
            array[i10 + 3] = (byte) (iL >>> 24);
            i10 += 4;
        }
        int i14 = i11 - i10;
        int iB = b(i14 * 8);
        for (int i15 = 0; i15 < i14; i15++) {
            array[i10 + i15] = (byte) (iB >>> (i15 * 8));
        }
        return array;
    }

    public double h() {
        return e.d(b(26), b(27));
    }

    public double i(double d10) {
        return j(0.0d, d10);
    }

    public double j(double d10, double d11) {
        double dH;
        g.d(d10, d11);
        double d12 = d11 - d10;
        if (!Double.isInfinite(d12) || Double.isInfinite(d10) || Double.isNaN(d10) || Double.isInfinite(d11) || Double.isNaN(d11)) {
            dH = d10 + (h() * d12);
        } else {
            double d13 = 2;
            double dH2 = h() * ((d11 / d13) - (d10 / d13));
            dH = d10 + dH2 + dH2;
        }
        return dH >= d11 ? Math.nextAfter(d11, Double.NEGATIVE_INFINITY) : dH;
    }

    public float k() {
        return b(24) / 1.6777216E7f;
    }

    public int l() {
        return b(32);
    }

    public int m(int i10) {
        return n(0, i10);
    }

    public int n(int i10, int i11) {
        int iL;
        int i12;
        int iB;
        g.e(i10, i11);
        int i13 = i11 - i10;
        if (i13 > 0 || i13 == Integer.MIN_VALUE) {
            if (((-i13) & i13) == i13) {
                iB = b(g.g(i13));
            } else {
                do {
                    iL = l() >>> 1;
                    i12 = iL % i13;
                } while ((iL - i12) + (i13 - 1) < 0);
                iB = i12;
            }
            return i10 + iB;
        }
        while (true) {
            int iL2 = l();
            if (i10 <= iL2 && iL2 < i11) {
                return iL2;
            }
        }
    }

    public long o() {
        return (((long) l()) << 32) + ((long) l());
    }

    public long p(long j10) {
        return q(0L, j10);
    }

    public long q(long j10, long j11) {
        long jO;
        long j12;
        long jB;
        int iL;
        g.f(j10, j11);
        long j13 = j11 - j10;
        if (j13 > 0) {
            if (((-j13) & j13) == j13) {
                int i10 = (int) j13;
                int i11 = (int) (j13 >>> 32);
                if (i10 != 0) {
                    iL = b(g.g(i10));
                } else if (i11 == 1) {
                    iL = l();
                } else {
                    jB = (((long) b(g.g(i11))) << 32) + (((long) l()) & k0.f265952a);
                }
                jB = ((long) iL) & k0.f265952a;
            } else {
                do {
                    jO = o() >>> 1;
                    j12 = jO % j13;
                } while ((jO - j12) + (j13 - 1) < 0);
                jB = j12;
            }
            return j10 + jB;
        }
        while (true) {
            long jO2 = o();
            if (j10 <= jO2 && jO2 < j11) {
                return jO2;
            }
        }
    }
}
