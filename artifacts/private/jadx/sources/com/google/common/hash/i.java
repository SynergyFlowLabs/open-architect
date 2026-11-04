package com.google.common.hash;

import java.io.Serializable;
import java.util.zip.Checksum;

/* JADX INFO: loaded from: classes5.dex */
@k
@z7.j
final class i extends c implements Serializable {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private static final long f118817d = 0;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final w<? extends Checksum> f118818a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final int f118819b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final String f118820c;

    private final class b extends com.google.common.hash.a {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private final Checksum f118821b;

        @Override // com.google.common.hash.r
        public p n() {
            long value = this.f118821b.getValue();
            return i.this.f118819b == 32 ? p.i((int) value) : p.j(value);
        }

        @Override // com.google.common.hash.a
        protected void q(byte b10) {
            this.f118821b.update(b10);
        }

        @Override // com.google.common.hash.a
        protected void t(byte[] bytes, int off, int len) {
            this.f118821b.update(bytes, off, len);
        }

        private b(Checksum checksum) {
            this.f118821b = (Checksum) com.google.common.base.j0.E(checksum);
        }
    }

    i(w<? extends Checksum> checksumSupplier, int bits, String toString) {
        this.f118818a = (w) com.google.common.base.j0.E(checksumSupplier);
        com.google.common.base.j0.k(bits == 32 || bits == 64, "bits (%s) must be either 32 or 64", bits);
        this.f118819b = bits;
        this.f118820c = (String) com.google.common.base.j0.E(toString);
    }

    @Override // com.google.common.hash.q
    public int h() {
        return this.f118819b;
    }

    @Override // com.google.common.hash.q
    public r i() {
        return new b(this.f118818a.get());
    }

    public String toString() {
        return this.f118820c;
    }
}
