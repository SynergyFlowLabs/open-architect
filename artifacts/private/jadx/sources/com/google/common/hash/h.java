package com.google.common.hash;

import java.math.RoundingMode;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicLongArray;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes5.dex */
@k
abstract class h implements g.c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final h f118811a = new a("MURMUR128_MITZ_32", 0);

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final h f118812b = new h("MURMUR128_MITZ_64", 1) { // from class: com.google.common.hash.h.b
        {
            a aVar = null;
        }

        private long l(byte[] bytes) {
            return com.google.common.primitives.n.k(bytes[7], bytes[6], bytes[5], bytes[4], bytes[3], bytes[2], bytes[1], bytes[0]);
        }

        private long n(byte[] bytes) {
            return com.google.common.primitives.n.k(bytes[15], bytes[14], bytes[13], bytes[12], bytes[11], bytes[10], bytes[9], bytes[8]);
        }

        @Override // com.google.common.hash.g.c
        public <T> boolean T1(@h0 T object, n<? super T> funnel, int numHashFunctions, c bits) {
            long jB = bits.b();
            byte[] bArrL = s.x().d(object, funnel).l();
            long jL = l(bArrL);
            long jN = n(bArrL);
            for (int i10 = 0; i10 < numHashFunctions; i10++) {
                if (!bits.e((Long.MAX_VALUE & jL) % jB)) {
                    return false;
                }
                jL += jN;
            }
            return true;
        }

        @Override // com.google.common.hash.g.c
        public <T> boolean h3(@h0 T object, n<? super T> funnel, int numHashFunctions, c bits) {
            long jB = bits.b();
            byte[] bArrL = s.x().d(object, funnel).l();
            long jL = l(bArrL);
            long jN = n(bArrL);
            long j10 = jL;
            boolean zH = false;
            for (int i10 = 0; i10 < numHashFunctions; i10++) {
                zH |= bits.h((Long.MAX_VALUE & j10) % jB);
                j10 += jN;
            }
            return zH;
        }
    };

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static final /* synthetic */ h[] f118813c = k();

    final enum a extends h {
        a(String $enum$name, int $enum$ordinal) {
            super($enum$name, $enum$ordinal, null);
        }

        @Override // com.google.common.hash.g.c
        public <T> boolean T1(@h0 T object, n<? super T> funnel, int numHashFunctions, c bits) {
            long jB = bits.b();
            long jC = s.x().d(object, funnel).c();
            int i10 = (int) jC;
            int i11 = (int) (jC >>> 32);
            for (int i12 = 1; i12 <= numHashFunctions; i12++) {
                int i13 = (i12 * i11) + i10;
                if (i13 < 0) {
                    i13 = ~i13;
                }
                if (!bits.e(((long) i13) % jB)) {
                    return false;
                }
            }
            return true;
        }

        @Override // com.google.common.hash.g.c
        public <T> boolean h3(@h0 T object, n<? super T> funnel, int numHashFunctions, c bits) {
            long jB = bits.b();
            long jC = s.x().d(object, funnel).c();
            int i10 = (int) jC;
            int i11 = (int) (jC >>> 32);
            boolean zH = false;
            int i12 = 3 << 0;
            for (int i13 = 1; i13 <= numHashFunctions; i13++) {
                int i14 = (i13 * i11) + i10;
                if (i14 < 0) {
                    i14 = ~i14;
                }
                zH |= bits.h(((long) i14) % jB);
            }
            return zH;
        }
    }

    private h(String $enum$name, int $enum$ordinal) {
        super($enum$name, $enum$ordinal);
    }

    private static /* synthetic */ h[] k() {
        return new h[]{f118811a, f118812b};
    }

    public static h valueOf(String name) {
        return (h) Enum.valueOf(h.class, name);
    }

    public static h[] values() {
        return (h[]) f118813c.clone();
    }

    /* synthetic */ h(String str, int i10, a aVar) {
        this(str, i10);
    }

    static final class c {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private static final int f118814c = 6;

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final AtomicLongArray f118815a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private final a0 f118816b;

        c(long bits) {
            com.google.common.base.j0.e(bits > 0, "data length is zero!");
            this.f118815a = new AtomicLongArray(com.google.common.primitives.l.e(com.google.common.math.h.g(bits, 64L, RoundingMode.CEILING)));
            this.f118816b = b0.a();
        }

        public static long[] i(AtomicLongArray atomicLongArray) {
            int length = atomicLongArray.length();
            long[] jArr = new long[length];
            for (int i10 = 0; i10 < length; i10++) {
                jArr[i10] = atomicLongArray.get(i10);
            }
            return jArr;
        }

        long a() {
            return this.f118816b.sum();
        }

        long b() {
            return ((long) this.f118815a.length()) * 64;
        }

        c c() {
            return new c(i(this.f118815a));
        }

        int d() {
            return this.f118815a.length();
        }

        boolean e(long bitIndex) {
            return ((1 << ((int) bitIndex)) & this.f118815a.get((int) (bitIndex >>> 6))) != 0;
        }

        public boolean equals(@fj.a Object o10) {
            if (o10 instanceof c) {
                return Arrays.equals(i(this.f118815a), i(((c) o10).f118815a));
            }
            return false;
        }

        void f(c other) {
            boolean z10;
            if (this.f118815a.length() == other.f118815a.length()) {
                z10 = true;
                int i10 = 7 << 1;
            } else {
                z10 = false;
            }
            com.google.common.base.j0.m(z10, "BitArrays must be of equal length (%s != %s)", this.f118815a.length(), other.f118815a.length());
            for (int i11 = 0; i11 < this.f118815a.length(); i11++) {
                g(i11, other.f118815a.get(i11));
            }
        }

        void g(int i10, long longValue) {
            while (true) {
                long j10 = this.f118815a.get(i10);
                long j11 = j10 | longValue;
                if (j10 == j11) {
                    return;
                }
                int i11 = i10;
                if (this.f118815a.compareAndSet(i11, j10, j11)) {
                    this.f118816b.add(Long.bitCount(j11) - Long.bitCount(j10));
                    return;
                }
                i10 = i11;
            }
        }

        boolean h(long bitIndex) {
            long j10;
            long j11;
            if (e(bitIndex)) {
                return false;
            }
            int i10 = (int) (bitIndex >>> 6);
            long j12 = 1 << ((int) bitIndex);
            do {
                j10 = this.f118815a.get(i10);
                j11 = j10 | j12;
                if (j10 == j11) {
                    return false;
                }
            } while (!this.f118815a.compareAndSet(i10, j10, j11));
            this.f118816b.a();
            return true;
        }

        public int hashCode() {
            return Arrays.hashCode(i(this.f118815a));
        }

        c(long[] data) {
            com.google.common.base.j0.e(data.length > 0, "data length is zero!");
            this.f118815a = new AtomicLongArray(data);
            this.f118816b = b0.a();
            long jBitCount = 0;
            for (long j10 : data) {
                jBitCount += (long) Long.bitCount(j10);
            }
            this.f118816b.add(jBitCount);
        }
    }
}
