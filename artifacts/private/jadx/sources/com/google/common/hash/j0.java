package com.google.common.hash;

import java.io.Serializable;
import java.nio.ByteBuffer;

/* JADX INFO: loaded from: classes5.dex */
@k
@z7.j
final class j0 extends c implements Serializable {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    static final q f118833e = new j0(2, 4, 506097522914230528L, 1084818905618843912L);

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private static final long f118834f = 0;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final int f118835a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final int f118836b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final long f118837c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final long f118838d;

    private static final class a extends f {

        /* JADX INFO: renamed from: l, reason: collision with root package name */
        private static final int f118839l = 8;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private final int f118840d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        private final int f118841e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        private long f118842f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        private long f118843g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        private long f118844h;

        /* JADX INFO: renamed from: i, reason: collision with root package name */
        private long f118845i;

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        private long f118846j;

        /* JADX INFO: renamed from: k, reason: collision with root package name */
        private long f118847k;

        a(int c10, int d10, long k10, long k11) {
            super(8);
            this.f118846j = 0L;
            this.f118847k = 0L;
            this.f118840d = c10;
            this.f118841e = d10;
            this.f118842f = 8317987319222330741L ^ k10;
            this.f118843g = 7237128888997146477L ^ k11;
            this.f118844h = 7816392313619706465L ^ k10;
            this.f118845i = 8387220255154660723L ^ k11;
        }

        private void v(long m10) {
            this.f118845i ^= m10;
            w(this.f118840d);
            this.f118842f = m10 ^ this.f118842f;
        }

        private void w(int iterations) {
            for (int i10 = 0; i10 < iterations; i10++) {
                long j10 = this.f118842f;
                long j11 = this.f118843g;
                this.f118842f = j10 + j11;
                this.f118844h += this.f118845i;
                this.f118843g = Long.rotateLeft(j11, 13);
                long jRotateLeft = Long.rotateLeft(this.f118845i, 16);
                long j12 = this.f118843g;
                long j13 = this.f118842f;
                this.f118843g = j12 ^ j13;
                this.f118845i = jRotateLeft ^ this.f118844h;
                long jRotateLeft2 = Long.rotateLeft(j13, 32);
                long j14 = this.f118844h;
                long j15 = this.f118843g;
                this.f118844h = j14 + j15;
                this.f118842f = jRotateLeft2 + this.f118845i;
                this.f118843g = Long.rotateLeft(j15, 17);
                long jRotateLeft3 = Long.rotateLeft(this.f118845i, 21);
                long j16 = this.f118843g;
                long j17 = this.f118844h;
                this.f118843g = j16 ^ j17;
                this.f118845i = jRotateLeft3 ^ this.f118842f;
                this.f118844h = Long.rotateLeft(j17, 32);
            }
        }

        @Override // com.google.common.hash.f
        protected p p() {
            long j10 = this.f118847k ^ (this.f118846j << 56);
            this.f118847k = j10;
            v(j10);
            this.f118844h ^= 255;
            w(this.f118841e);
            return p.j(((this.f118842f ^ this.f118843g) ^ this.f118844h) ^ this.f118845i);
        }

        @Override // com.google.common.hash.f
        protected void s(ByteBuffer buffer) {
            this.f118846j += 8;
            v(buffer.getLong());
        }

        @Override // com.google.common.hash.f
        protected void t(ByteBuffer buffer) {
            this.f118846j += (long) buffer.remaining();
            int i10 = 0;
            while (buffer.hasRemaining()) {
                this.f118847k ^= (((long) buffer.get()) & 255) << i10;
                i10 += 8;
            }
        }
    }

    j0(int c10, int d10, long k10, long k11) {
        com.google.common.base.j0.k(c10 > 0, "The number of SipRound iterations (c=%s) during Compression must be positive.", c10);
        com.google.common.base.j0.k(d10 > 0, "The number of SipRound iterations (d=%s) during Finalization must be positive.", d10);
        this.f118835a = c10;
        this.f118836b = d10;
        this.f118837c = k10;
        this.f118838d = k11;
    }

    public boolean equals(@fj.a Object object) {
        if (object instanceof j0) {
            j0 j0Var = (j0) object;
            if (this.f118835a == j0Var.f118835a && this.f118836b == j0Var.f118836b && this.f118837c == j0Var.f118837c && this.f118838d == j0Var.f118838d) {
                return true;
            }
        }
        return false;
    }

    @Override // com.google.common.hash.q
    public int h() {
        return 64;
    }

    public int hashCode() {
        return (int) ((((long) ((j0.class.hashCode() ^ this.f118835a) ^ this.f118836b)) ^ this.f118837c) ^ this.f118838d);
    }

    @Override // com.google.common.hash.q
    public r i() {
        return new a(this.f118835a, this.f118836b, this.f118837c, this.f118838d);
    }

    public String toString() {
        return "Hashing.sipHash" + this.f118835a + "" + this.f118836b + "(" + this.f118837c + ", " + this.f118838d + ")";
    }
}
