package com.google.common.hash;

import java.nio.ByteBuffer;
import java.security.InvalidKeyException;
import java.security.Key;
import java.security.NoSuchAlgorithmException;
import javax.crypto.Mac;

/* JADX INFO: loaded from: classes5.dex */
@k
@z7.j
final class d0 extends c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final Mac f118754a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final Key f118755b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final String f118756c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final int f118757d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final boolean f118758e;

    private static final class b extends com.google.common.hash.a {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private final Mac f118759b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private boolean f118760c;

        private void u() {
            com.google.common.base.j0.h0(!this.f118760c, "Cannot re-use a Hasher after calling hash() on it");
        }

        @Override // com.google.common.hash.r
        public p n() {
            u();
            this.f118760c = true;
            return p.h(this.f118759b.doFinal());
        }

        @Override // com.google.common.hash.a
        protected void q(byte b10) {
            u();
            this.f118759b.update(b10);
        }

        @Override // com.google.common.hash.a
        protected void r(ByteBuffer bytes) {
            u();
            com.google.common.base.j0.E(bytes);
            this.f118759b.update(bytes);
        }

        @Override // com.google.common.hash.a
        protected void s(byte[] b10) {
            u();
            this.f118759b.update(b10);
        }

        @Override // com.google.common.hash.a
        protected void t(byte[] b10, int off, int len) {
            u();
            this.f118759b.update(b10, off, len);
        }

        private b(Mac mac) {
            this.f118759b = mac;
        }
    }

    d0(String algorithmName, Key key, String toString) {
        Mac macL = l(algorithmName, key);
        this.f118754a = macL;
        this.f118755b = (Key) com.google.common.base.j0.E(key);
        this.f118756c = (String) com.google.common.base.j0.E(toString);
        this.f118757d = macL.getMacLength() * 8;
        this.f118758e = m(macL);
    }

    private static Mac l(String algorithmName, Key key) {
        try {
            Mac mac = Mac.getInstance(algorithmName);
            mac.init(key);
            return mac;
        } catch (InvalidKeyException e10) {
            throw new IllegalArgumentException(e10);
        } catch (NoSuchAlgorithmException e11) {
            throw new IllegalStateException(e11);
        }
    }

    private static boolean m(Mac mac) {
        try {
            mac.clone();
            return true;
        } catch (CloneNotSupportedException unused) {
            return false;
        }
    }

    @Override // com.google.common.hash.q
    public int h() {
        return this.f118757d;
    }

    @Override // com.google.common.hash.q
    public r i() {
        if (this.f118758e) {
            try {
                return new b((Mac) this.f118754a.clone());
            } catch (CloneNotSupportedException unused) {
            }
        }
        return new b(l(this.f118754a.getAlgorithm(), this.f118755b));
    }

    public String toString() {
        return this.f118756c;
    }
}
