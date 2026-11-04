package com.google.common.hash;

import java.io.InvalidObjectException;
import java.io.ObjectInputStream;
import java.io.Serializable;
import java.nio.ByteBuffer;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.util.Arrays;

/* JADX INFO: loaded from: classes5.dex */
@k
@z7.j
final class e0 extends com.google.common.hash.c implements Serializable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final MessageDigest f118763a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final int f118764b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final boolean f118765c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final String f118766d;

    private static final class b extends com.google.common.hash.a {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private final MessageDigest f118767b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private final int f118768c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private boolean f118769d;

        private void u() {
            com.google.common.base.j0.h0(!this.f118769d, "Cannot re-use a Hasher after calling hash() on it");
        }

        @Override // com.google.common.hash.r
        public p n() {
            u();
            this.f118769d = true;
            return this.f118768c == this.f118767b.getDigestLength() ? p.h(this.f118767b.digest()) : p.h(Arrays.copyOf(this.f118767b.digest(), this.f118768c));
        }

        @Override // com.google.common.hash.a
        protected void q(byte b10) {
            u();
            this.f118767b.update(b10);
        }

        @Override // com.google.common.hash.a
        protected void r(ByteBuffer bytes) {
            u();
            this.f118767b.update(bytes);
        }

        @Override // com.google.common.hash.a
        protected void t(byte[] b10, int off, int len) {
            u();
            this.f118767b.update(b10, off, len);
        }

        private b(MessageDigest digest, int bytes) {
            this.f118767b = digest;
            this.f118768c = bytes;
        }
    }

    private static final class c implements Serializable {

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private static final long f118770d = 0;

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final String f118771a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private final int f118772b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private final String f118773c;

        private Object readResolve() {
            return new e0(this.f118771a, this.f118772b, this.f118773c);
        }

        private c(String algorithmName, int bytes, String toString) {
            this.f118771a = algorithmName;
            this.f118772b = bytes;
            this.f118773c = toString;
        }
    }

    e0(String algorithmName, String toString) {
        MessageDigest messageDigestL = l(algorithmName);
        this.f118763a = messageDigestL;
        this.f118764b = messageDigestL.getDigestLength();
        this.f118766d = (String) com.google.common.base.j0.E(toString);
        this.f118765c = m(messageDigestL);
    }

    private static MessageDigest l(String algorithmName) {
        try {
            return MessageDigest.getInstance(algorithmName);
        } catch (NoSuchAlgorithmException e10) {
            throw new AssertionError(e10);
        }
    }

    private static boolean m(MessageDigest digest) {
        try {
            digest.clone();
            return true;
        } catch (CloneNotSupportedException unused) {
            return false;
        }
    }

    private void readObject(ObjectInputStream stream) throws InvalidObjectException {
        throw new InvalidObjectException("Use SerializedForm");
    }

    @Override // com.google.common.hash.q
    public int h() {
        return this.f118764b * 8;
    }

    @Override // com.google.common.hash.q
    public r i() {
        if (this.f118765c) {
            try {
                return new b((MessageDigest) this.f118763a.clone(), this.f118764b);
            } catch (CloneNotSupportedException unused) {
            }
        }
        return new b(l(this.f118763a.getAlgorithm()), this.f118764b);
    }

    public String toString() {
        return this.f118766d;
    }

    Object writeReplace() {
        return new c(this.f118763a.getAlgorithm(), this.f118764b, this.f118766d);
    }

    e0(String algorithmName, int bytes, String toString) {
        this.f118766d = (String) com.google.common.base.j0.E(toString);
        MessageDigest messageDigestL = l(algorithmName);
        this.f118763a = messageDigestL;
        int digestLength = messageDigestL.getDigestLength();
        com.google.common.base.j0.m(bytes >= 4 && bytes <= digestLength, "bytes (%s) must be >= 4 and < %s", bytes, digestLength);
        this.f118764b = bytes;
        this.f118765c = m(messageDigestL);
    }
}
