package com.google.common.hash;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.InvalidObjectException;
import java.io.ObjectInputStream;
import java.io.OutputStream;
import java.io.Serializable;
import java.math.RoundingMode;

/* JADX INFO: loaded from: classes5.dex */
@k
@com.google.common.annotations.a
public final class g<T> implements com.google.common.base.k0<T>, Serializable {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private static final long f118787e = 912559;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final h.c f118788a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final int f118789b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final n<? super T> f118790c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final c f118791d;

    private static class b<T> implements Serializable {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        private static final long f118792e = 1;

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final long[] f118793a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final int f118794b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final n<? super T> f118795c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        final c f118796d;

        b(g<T> bf2) {
            this.f118793a = h.c.i(((g) bf2).f118788a.f118815a);
            this.f118794b = ((g) bf2).f118789b;
            this.f118795c = ((g) bf2).f118790c;
            this.f118796d = ((g) bf2).f118791d;
        }

        Object readResolve() {
            return new g(new h.c(this.f118793a), this.f118794b, this.f118795c, this.f118796d);
        }
    }

    interface c extends Serializable {
        <T> boolean T1(@h0 T object, n<? super T> funnel, int numHashFunctions, h.c bits);

        <T> boolean h3(@h0 T object, n<? super T> funnel, int numHashFunctions, h.c bits);

        int ordinal();
    }

    public static <T> g<T> h(n<? super T> funnel, int expectedInsertions) {
        return j(funnel, expectedInsertions);
    }

    public static <T> g<T> i(n<? super T> funnel, int expectedInsertions, double fpp) {
        return k(funnel, expectedInsertions, fpp);
    }

    public static <T> g<T> j(n<? super T> funnel, long expectedInsertions) {
        return k(funnel, expectedInsertions, 0.03d);
    }

    public static <T> g<T> k(n<? super T> funnel, long expectedInsertions, double fpp) {
        return l(funnel, expectedInsertions, fpp, h.f118812b);
    }

    @com.google.common.annotations.e
    static <T> g<T> l(n<? super T> funnel, long expectedInsertions, double fpp, c strategy) {
        com.google.common.base.j0.E(funnel);
        com.google.common.base.j0.p(expectedInsertions >= 0, "Expected insertions (%s) must be >= 0", expectedInsertions);
        com.google.common.base.j0.u(fpp > 0.0d, "False positive probability (%s) must be > 0.0", Double.valueOf(fpp));
        com.google.common.base.j0.u(fpp < 1.0d, "False positive probability (%s) must be < 1.0", Double.valueOf(fpp));
        com.google.common.base.j0.E(strategy);
        if (expectedInsertions == 0) {
            expectedInsertions = 1;
        }
        long jP = p(expectedInsertions, fpp);
        try {
            return new g<>(new h.c(jP), q(expectedInsertions, jP), funnel, strategy);
        } catch (IllegalArgumentException e10) {
            throw new IllegalArgumentException("Could not create BloomFilter of " + jP + " bits", e10);
        }
    }

    @com.google.common.annotations.e
    static long p(long n10, double p10) {
        if (p10 == 0.0d) {
            p10 = Double.MIN_VALUE;
        }
        return (long) (((-n10) * Math.log(p10)) / (Math.log(2.0d) * Math.log(2.0d)));
    }

    @com.google.common.annotations.e
    static int q(long n10, long m10) {
        return Math.max(1, (int) Math.round((m10 / n10) * Math.log(2.0d)));
    }

    private void readObject(ObjectInputStream stream) throws InvalidObjectException {
        throw new InvalidObjectException("Use SerializedForm");
    }

    public static <T> g<T> t(InputStream in, n<? super T> funnel) throws IOException {
        int i10;
        int iP;
        com.google.common.base.j0.F(in, "InputStream");
        com.google.common.base.j0.F(funnel, "Funnel");
        int i11 = -1;
        try {
            try {
                DataInputStream dataInputStream = new DataInputStream(in);
                byte b10 = dataInputStream.readByte();
                try {
                    iP = com.google.common.primitives.u.p(dataInputStream.readByte());
                    try {
                        i11 = dataInputStream.readInt();
                        h hVar = h.values()[b10];
                        h.c cVar = new h.c(com.google.common.math.h.d(i11, 64L));
                        for (int i12 = 0; i12 < i11; i12++) {
                            cVar.g(i12, dataInputStream.readLong());
                        }
                        return new g<>(cVar, iP, funnel, hVar);
                    } catch (Exception e10) {
                        e = e10;
                        int i13 = i11;
                        i11 = b10;
                        i10 = i13;
                        throw new IOException("Unable to deserialize BloomFilter from InputStream. strategyOrdinal: " + i11 + " numHashFunctions: " + iP + " dataLength: " + i10, e);
                    }
                } catch (Exception e11) {
                    e = e11;
                    iP = -1;
                    i11 = b10;
                    i10 = -1;
                }
            } catch (IOException e12) {
                throw e12;
            }
        } catch (Exception e13) {
            e = e13;
            i10 = -1;
            iP = -1;
        }
    }

    private Object writeReplace() {
        return new b(this);
    }

    @Override // com.google.common.base.k0
    @Deprecated
    public boolean apply(@h0 T input) {
        return o(input);
    }

    public long e() {
        double dB = this.f118788a.b();
        return com.google.common.math.c.q(((-Math.log1p(-(this.f118788a.a() / dB))) * dB) / ((double) this.f118789b), RoundingMode.HALF_UP);
    }

    @Override // com.google.common.base.k0
    public boolean equals(@fj.a Object object) {
        if (object == this) {
            return true;
        }
        if (object instanceof g) {
            g gVar = (g) object;
            if (this.f118789b == gVar.f118789b && this.f118790c.equals(gVar.f118790c) && this.f118788a.equals(gVar.f118788a) && this.f118791d.equals(gVar.f118791d)) {
                return true;
            }
        }
        return false;
    }

    @com.google.common.annotations.e
    long f() {
        return this.f118788a.b();
    }

    public g<T> g() {
        return new g<>(this.f118788a.c(), this.f118789b, this.f118790c, this.f118791d);
    }

    public int hashCode() {
        return com.google.common.base.d0.b(Integer.valueOf(this.f118789b), this.f118790c, this.f118791d, this.f118788a);
    }

    public double m() {
        return Math.pow(this.f118788a.a() / f(), this.f118789b);
    }

    public boolean n(g<T> that) {
        com.google.common.base.j0.E(that);
        return this != that && this.f118789b == that.f118789b && f() == that.f() && this.f118791d.equals(that.f118791d) && this.f118790c.equals(that.f118790c);
    }

    public boolean o(@h0 T object) {
        return this.f118791d.T1(object, this.f118790c, this.f118789b, this.f118788a);
    }

    @z7.a
    public boolean r(@h0 T object) {
        return this.f118791d.h3(object, this.f118790c, this.f118789b, this.f118788a);
    }

    public void s(g<T> that) {
        com.google.common.base.j0.E(that);
        com.google.common.base.j0.e(this != that, "Cannot combine a BloomFilter with itself.");
        int i10 = this.f118789b;
        int i11 = that.f118789b;
        com.google.common.base.j0.m(i10 == i11, "BloomFilters must have the same number of hash functions (%s != %s)", i10, i11);
        com.google.common.base.j0.s(f() == that.f(), "BloomFilters must have the same size underlying bit arrays (%s != %s)", f(), that.f());
        com.google.common.base.j0.y(this.f118791d.equals(that.f118791d), "BloomFilters must have equal strategies (%s != %s)", this.f118791d, that.f118791d);
        com.google.common.base.j0.y(this.f118790c.equals(that.f118790c), "BloomFilters must have equal funnels (%s != %s)", this.f118790c, that.f118790c);
        this.f118788a.f(that.f118788a);
    }

    public void u(OutputStream out) throws IOException {
        DataOutputStream dataOutputStream = new DataOutputStream(out);
        dataOutputStream.writeByte(com.google.common.primitives.t.a(this.f118791d.ordinal()));
        dataOutputStream.writeByte(com.google.common.primitives.u.a(this.f118789b));
        dataOutputStream.writeInt(this.f118788a.f118815a.length());
        for (int i10 = 0; i10 < this.f118788a.f118815a.length(); i10++) {
            dataOutputStream.writeLong(this.f118788a.f118815a.get(i10));
        }
    }

    private g(h.c bits, int numHashFunctions, n<? super T> funnel, c strategy) {
        com.google.common.base.j0.k(numHashFunctions > 0, "numHashFunctions (%s) must be > 0", numHashFunctions);
        com.google.common.base.j0.k(numHashFunctions <= 255, "numHashFunctions (%s) must be <= 255", numHashFunctions);
        this.f118788a = (h.c) com.google.common.base.j0.E(bits);
        this.f118789b = numHashFunctions;
        this.f118790c = (n) com.google.common.base.j0.E(funnel);
        this.f118791d = (c) com.google.common.base.j0.E(strategy);
    }
}
