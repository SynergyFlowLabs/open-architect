package com.google.common.hash;

import java.io.Serializable;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;

/* JADX INFO: loaded from: classes5.dex */
@k
@z7.j
final class f0 extends c implements Serializable {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    static final q f118777b = new f0(0);

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    static final q f118778c = new f0(s.f118903a);

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private static final long f118779d = 0;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final int f118780a;

    private static final class a extends f {

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        private static final int f118781g = 16;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        private static final long f118782h = -8663945395140668459L;

        /* JADX INFO: renamed from: i, reason: collision with root package name */
        private static final long f118783i = 5545529020109919103L;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private long f118784d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        private long f118785e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        private int f118786f;

        a(int seed) {
            super(16);
            long j10 = seed;
            this.f118784d = j10;
            this.f118785e = j10;
            this.f118786f = 0;
        }

        private void v(long k10, long k11) {
            long jX = x(k10) ^ this.f118784d;
            this.f118784d = jX;
            long jRotateLeft = Long.rotateLeft(jX, 27);
            long j10 = this.f118785e;
            this.f118784d = ((jRotateLeft + j10) * 5) + 1390208809;
            long jY = y(k11) ^ j10;
            this.f118785e = jY;
            this.f118785e = ((Long.rotateLeft(jY, 31) + this.f118784d) * 5) + 944331445;
        }

        private static long w(long k10) {
            long j10 = (k10 ^ (k10 >>> 33)) * (-49064778989728563L);
            long j11 = (j10 ^ (j10 >>> 33)) * (-4265267296055464877L);
            return j11 ^ (j11 >>> 33);
        }

        private static long x(long k10) {
            return Long.rotateLeft(k10 * f118782h, 31) * f118783i;
        }

        private static long y(long k10) {
            return Long.rotateLeft(k10 * f118783i, 33) * f118782h;
        }

        @Override // com.google.common.hash.f
        protected p p() {
            long j10 = this.f118784d;
            int i10 = this.f118786f;
            long j11 = j10 ^ ((long) i10);
            long j12 = this.f118785e ^ ((long) i10);
            long j13 = j11 + j12;
            this.f118784d = j13;
            this.f118785e = j12 + j13;
            this.f118784d = w(j13);
            long jW = w(this.f118785e);
            long j14 = this.f118784d + jW;
            this.f118784d = j14;
            this.f118785e = jW + j14;
            return p.h(ByteBuffer.wrap(new byte[16]).order(ByteOrder.LITTLE_ENDIAN).putLong(this.f118784d).putLong(this.f118785e).array());
        }

        @Override // com.google.common.hash.f
        protected void s(ByteBuffer bb2) {
            v(bb2.getLong(), bb2.getLong());
            this.f118786f += 16;
        }

        /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
        @Override // com.google.common.hash.f
        protected void t(ByteBuffer bb2) {
            long jP;
            long jP2;
            long jP3;
            long jP4;
            long jP5;
            long jP6;
            long jP7;
            this.f118786f += bb2.remaining();
            long jP8 = 0;
            switch (bb2.remaining()) {
                case 1:
                    jP = 0;
                    jP7 = jP ^ ((long) com.google.common.primitives.u.p(bb2.get(0)));
                    this.f118784d = x(jP7) ^ this.f118784d;
                    this.f118785e ^= y(jP8);
                    return;
                case 2:
                    jP2 = 0;
                    jP = jP2 ^ (((long) com.google.common.primitives.u.p(bb2.get(1))) << 8);
                    jP7 = jP ^ ((long) com.google.common.primitives.u.p(bb2.get(0)));
                    this.f118784d = x(jP7) ^ this.f118784d;
                    this.f118785e ^= y(jP8);
                    return;
                case 3:
                    jP3 = 0;
                    jP2 = (((long) com.google.common.primitives.u.p(bb2.get(2))) << 16) ^ jP3;
                    jP = jP2 ^ (((long) com.google.common.primitives.u.p(bb2.get(1))) << 8);
                    jP7 = jP ^ ((long) com.google.common.primitives.u.p(bb2.get(0)));
                    this.f118784d = x(jP7) ^ this.f118784d;
                    this.f118785e ^= y(jP8);
                    return;
                case 4:
                    jP4 = 0;
                    jP3 = jP4 ^ (((long) com.google.common.primitives.u.p(bb2.get(3))) << 24);
                    jP2 = (((long) com.google.common.primitives.u.p(bb2.get(2))) << 16) ^ jP3;
                    jP = jP2 ^ (((long) com.google.common.primitives.u.p(bb2.get(1))) << 8);
                    jP7 = jP ^ ((long) com.google.common.primitives.u.p(bb2.get(0)));
                    this.f118784d = x(jP7) ^ this.f118784d;
                    this.f118785e ^= y(jP8);
                    return;
                case 5:
                    jP5 = 0;
                    jP4 = jP5 ^ (((long) com.google.common.primitives.u.p(bb2.get(4))) << 32);
                    jP3 = jP4 ^ (((long) com.google.common.primitives.u.p(bb2.get(3))) << 24);
                    jP2 = (((long) com.google.common.primitives.u.p(bb2.get(2))) << 16) ^ jP3;
                    jP = jP2 ^ (((long) com.google.common.primitives.u.p(bb2.get(1))) << 8);
                    jP7 = jP ^ ((long) com.google.common.primitives.u.p(bb2.get(0)));
                    this.f118784d = x(jP7) ^ this.f118784d;
                    this.f118785e ^= y(jP8);
                    return;
                case 6:
                    jP6 = 0;
                    jP5 = (((long) com.google.common.primitives.u.p(bb2.get(5))) << 40) ^ jP6;
                    jP4 = jP5 ^ (((long) com.google.common.primitives.u.p(bb2.get(4))) << 32);
                    jP3 = jP4 ^ (((long) com.google.common.primitives.u.p(bb2.get(3))) << 24);
                    jP2 = (((long) com.google.common.primitives.u.p(bb2.get(2))) << 16) ^ jP3;
                    jP = jP2 ^ (((long) com.google.common.primitives.u.p(bb2.get(1))) << 8);
                    jP7 = jP ^ ((long) com.google.common.primitives.u.p(bb2.get(0)));
                    this.f118784d = x(jP7) ^ this.f118784d;
                    this.f118785e ^= y(jP8);
                    return;
                case 7:
                    jP6 = ((long) com.google.common.primitives.u.p(bb2.get(6))) << 48;
                    jP5 = (((long) com.google.common.primitives.u.p(bb2.get(5))) << 40) ^ jP6;
                    jP4 = jP5 ^ (((long) com.google.common.primitives.u.p(bb2.get(4))) << 32);
                    jP3 = jP4 ^ (((long) com.google.common.primitives.u.p(bb2.get(3))) << 24);
                    jP2 = (((long) com.google.common.primitives.u.p(bb2.get(2))) << 16) ^ jP3;
                    jP = jP2 ^ (((long) com.google.common.primitives.u.p(bb2.get(1))) << 8);
                    jP7 = jP ^ ((long) com.google.common.primitives.u.p(bb2.get(0)));
                    this.f118784d = x(jP7) ^ this.f118784d;
                    this.f118785e ^= y(jP8);
                    return;
                case 8:
                    jP7 = bb2.getLong();
                    this.f118784d = x(jP7) ^ this.f118784d;
                    this.f118785e ^= y(jP8);
                    return;
                case 9:
                    jP8 ^= (long) com.google.common.primitives.u.p(bb2.get(8));
                    jP7 = bb2.getLong();
                    this.f118784d = x(jP7) ^ this.f118784d;
                    this.f118785e ^= y(jP8);
                    return;
                case 10:
                    jP8 ^= ((long) com.google.common.primitives.u.p(bb2.get(9))) << 8;
                    jP8 ^= (long) com.google.common.primitives.u.p(bb2.get(8));
                    jP7 = bb2.getLong();
                    this.f118784d = x(jP7) ^ this.f118784d;
                    this.f118785e ^= y(jP8);
                    return;
                case 11:
                    jP8 ^= ((long) com.google.common.primitives.u.p(bb2.get(10))) << 16;
                    jP8 ^= ((long) com.google.common.primitives.u.p(bb2.get(9))) << 8;
                    jP8 ^= (long) com.google.common.primitives.u.p(bb2.get(8));
                    jP7 = bb2.getLong();
                    this.f118784d = x(jP7) ^ this.f118784d;
                    this.f118785e ^= y(jP8);
                    return;
                case 12:
                    jP8 ^= ((long) com.google.common.primitives.u.p(bb2.get(11))) << 24;
                    jP8 ^= ((long) com.google.common.primitives.u.p(bb2.get(10))) << 16;
                    jP8 ^= ((long) com.google.common.primitives.u.p(bb2.get(9))) << 8;
                    jP8 ^= (long) com.google.common.primitives.u.p(bb2.get(8));
                    jP7 = bb2.getLong();
                    this.f118784d = x(jP7) ^ this.f118784d;
                    this.f118785e ^= y(jP8);
                    return;
                case 13:
                    jP8 ^= ((long) com.google.common.primitives.u.p(bb2.get(12))) << 32;
                    jP8 ^= ((long) com.google.common.primitives.u.p(bb2.get(11))) << 24;
                    jP8 ^= ((long) com.google.common.primitives.u.p(bb2.get(10))) << 16;
                    jP8 ^= ((long) com.google.common.primitives.u.p(bb2.get(9))) << 8;
                    jP8 ^= (long) com.google.common.primitives.u.p(bb2.get(8));
                    jP7 = bb2.getLong();
                    this.f118784d = x(jP7) ^ this.f118784d;
                    this.f118785e ^= y(jP8);
                    return;
                case 14:
                    jP8 ^= ((long) com.google.common.primitives.u.p(bb2.get(13))) << 40;
                    jP8 ^= ((long) com.google.common.primitives.u.p(bb2.get(12))) << 32;
                    jP8 ^= ((long) com.google.common.primitives.u.p(bb2.get(11))) << 24;
                    jP8 ^= ((long) com.google.common.primitives.u.p(bb2.get(10))) << 16;
                    jP8 ^= ((long) com.google.common.primitives.u.p(bb2.get(9))) << 8;
                    jP8 ^= (long) com.google.common.primitives.u.p(bb2.get(8));
                    jP7 = bb2.getLong();
                    this.f118784d = x(jP7) ^ this.f118784d;
                    this.f118785e ^= y(jP8);
                    return;
                case 15:
                    jP8 = ((long) com.google.common.primitives.u.p(bb2.get(14))) << 48;
                    jP8 ^= ((long) com.google.common.primitives.u.p(bb2.get(13))) << 40;
                    jP8 ^= ((long) com.google.common.primitives.u.p(bb2.get(12))) << 32;
                    jP8 ^= ((long) com.google.common.primitives.u.p(bb2.get(11))) << 24;
                    jP8 ^= ((long) com.google.common.primitives.u.p(bb2.get(10))) << 16;
                    jP8 ^= ((long) com.google.common.primitives.u.p(bb2.get(9))) << 8;
                    jP8 ^= (long) com.google.common.primitives.u.p(bb2.get(8));
                    jP7 = bb2.getLong();
                    this.f118784d = x(jP7) ^ this.f118784d;
                    this.f118785e ^= y(jP8);
                    return;
                default:
                    throw new AssertionError("Should never get here.");
            }
        }
    }

    f0(int seed) {
        this.f118780a = seed;
    }

    public boolean equals(@fj.a Object object) {
        return (object instanceof f0) && this.f118780a == ((f0) object).f118780a;
    }

    @Override // com.google.common.hash.q
    public int h() {
        return 128;
    }

    public int hashCode() {
        return this.f118780a ^ f0.class.hashCode();
    }

    @Override // com.google.common.hash.q
    public r i() {
        return new a(this.f118780a);
    }

    public String toString() {
        return "Hashing.murmur3_128(" + this.f118780a + ")";
    }
}
