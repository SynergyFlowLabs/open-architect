package com.google.common.hash;

import java.security.Key;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Iterator;
import java.util.zip.Adler32;
import java.util.zip.CRC32;
import java.util.zip.Checksum;
import javax.crypto.spec.SecretKeySpec;

/* JADX INFO: loaded from: classes5.dex */
@k
public final class s {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    static final int f118903a = (int) System.currentTimeMillis();

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    @z7.j
    static abstract class b implements w<Checksum> {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public static final b f118904b = new a("CRC_32", 0, "Hashing.crc32()");

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public static final b f118905c = new C1085b("ADLER_32", 1, "Hashing.adler32()");

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private static final /* synthetic */ b[] f118906d = k();

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final q f118907a;

        final enum a extends b {
            a(String $enum$name, int $enum$ordinal, String toString) {
                super($enum$name, $enum$ordinal, toString);
            }

            @Override // com.google.common.base.s0
            /* JADX INFO: renamed from: l, reason: merged with bridge method [inline-methods] */
            public Checksum get() {
                return new CRC32();
            }
        }

        /* JADX INFO: renamed from: com.google.common.hash.s$b$b, reason: collision with other inner class name */
        final enum C1085b extends b {
            C1085b(String $enum$name, int $enum$ordinal, String toString) {
                super($enum$name, $enum$ordinal, toString);
            }

            @Override // com.google.common.base.s0
            /* JADX INFO: renamed from: l, reason: merged with bridge method [inline-methods] */
            public Checksum get() {
                return new Adler32();
            }
        }

        static {
            int i10 = 2 ^ 0;
        }

        private static /* synthetic */ b[] k() {
            return new b[]{f118904b, f118905c};
        }

        public static b valueOf(String name) {
            return (b) Enum.valueOf(b.class, name);
        }

        public static b[] values() {
            return (b[]) f118906d.clone();
        }

        private b(String $enum$name, int $enum$ordinal, String toString) {
            super($enum$name, $enum$ordinal);
            this.f118907a = new com.google.common.hash.i(this, 32, toString);
        }
    }

    private static final class c extends com.google.common.hash.b {
        public boolean equals(@fj.a Object object) {
            if (object instanceof c) {
                return Arrays.equals(this.f118749a, ((c) object).f118749a);
            }
            return false;
        }

        @Override // com.google.common.hash.q
        public int h() {
            int i10 = 5 ^ 0;
            int iH = 0;
            for (q qVar : this.f118749a) {
                iH += qVar.h();
            }
            return iH;
        }

        public int hashCode() {
            return Arrays.hashCode(this.f118749a);
        }

        @Override // com.google.common.hash.b
        p m(r[] hashers) {
            byte[] bArr = new byte[h() / 8];
            int iN = 0;
            for (r rVar : hashers) {
                p pVarN = rVar.n();
                iN += pVarN.n(bArr, iN, pVarN.d() / 8);
            }
            return p.h(bArr);
        }

        private c(q... functions) {
            super(functions);
            for (q qVar : functions) {
                com.google.common.base.j0.o(qVar.h() % 8 == 0, "the number of bits (%s) in hashFunction (%s) must be divisible by 8", qVar.h(), qVar);
            }
        }
    }

    private static final class d {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private long f118908a;

        public d(long seed) {
            this.f118908a = seed;
        }

        public double a() {
            long j10 = (this.f118908a * 2862933555777941757L) + 1;
            this.f118908a = j10;
            return ((double) (((int) (j10 >>> 33)) + 1)) / 2.147483648E9d;
        }
    }

    private static class e {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        static final q f118909a = new e0("MD5", "Hashing.md5()");

        private e() {
        }
    }

    private static class f {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        static final q f118910a = new e0(org.apache.commons.codec.digest.g.f335249c, "Hashing.sha1()");

        private f() {
        }
    }

    private static class g {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        static final q f118911a = new e0(org.apache.commons.codec.digest.g.f335251e, "Hashing.sha256()");

        private g() {
        }
    }

    private static class h {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        static final q f118912a = new e0(org.apache.commons.codec.digest.g.f335252f, "Hashing.sha384()");

        private h() {
        }
    }

    private static class i {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        static final q f118913a = new e0(org.apache.commons.codec.digest.g.f335253g, "Hashing.sha512()");

        private i() {
        }
    }

    private s() {
    }

    @Deprecated
    public static q A(int seed) {
        return new g0(seed, false);
    }

    public static q B() {
        return g0.f118798d;
    }

    public static q C(int seed) {
        return new g0(seed, true);
    }

    @Deprecated
    public static q D() {
        return f.f118910a;
    }

    public static q E() {
        return g.f118911a;
    }

    public static q F() {
        return h.f118912a;
    }

    public static q G() {
        return i.f118913a;
    }

    public static q H() {
        return j0.f118833e;
    }

    public static q I(long k10, long k11) {
        return new j0(2, 4, k10, k11);
    }

    public static q a() {
        return b.f118905c.f118907a;
    }

    static int b(int bits) {
        com.google.common.base.j0.e(bits > 0, "Number of bits must be positive");
        return (bits + 31) & (-32);
    }

    public static p c(Iterable<p> hashCodes) {
        Iterator<p> it = hashCodes.iterator();
        com.google.common.base.j0.e(it.hasNext(), "Must be at least 1 hash code to combine.");
        int iD = it.next().d() / 8;
        byte[] bArr = new byte[iD];
        Iterator<p> it2 = hashCodes.iterator();
        while (it2.hasNext()) {
            byte[] bArrA = it2.next().a();
            com.google.common.base.j0.e(bArrA.length == iD, "All hashcodes must have the same bit length.");
            for (int i10 = 0; i10 < bArrA.length; i10++) {
                bArr[i10] = (byte) ((bArr[i10] * 37) ^ bArrA[i10]);
            }
        }
        return p.h(bArr);
    }

    public static p d(Iterable<p> hashCodes) {
        Iterator<p> it = hashCodes.iterator();
        com.google.common.base.j0.e(it.hasNext(), "Must be at least 1 hash code to combine.");
        int iD = it.next().d() / 8;
        byte[] bArr = new byte[iD];
        Iterator<p> it2 = hashCodes.iterator();
        while (it2.hasNext()) {
            byte[] bArrA = it2.next().a();
            com.google.common.base.j0.e(bArrA.length == iD, "All hashcodes must have the same bit length.");
            for (int i10 = 0; i10 < bArrA.length; i10++) {
                bArr[i10] = (byte) (bArr[i10] + bArrA[i10]);
            }
        }
        return p.h(bArr);
    }

    public static q e(q first, q second, q... rest) {
        ArrayList arrayList = new ArrayList();
        arrayList.add(first);
        arrayList.add(second);
        Collections.addAll(arrayList, rest);
        return new c((q[]) arrayList.toArray(new q[0]));
    }

    public static q f(Iterable<q> hashFunctions) {
        com.google.common.base.j0.E(hashFunctions);
        ArrayList arrayList = new ArrayList();
        Iterator<q> it = hashFunctions.iterator();
        while (it.hasNext()) {
            arrayList.add(it.next());
        }
        com.google.common.base.j0.k(!arrayList.isEmpty(), "number of hash functions (%s) must be > 0", arrayList.size());
        return new c((q[]) arrayList.toArray(new q[0]));
    }

    public static int g(long input, int buckets) {
        int i10 = 0;
        com.google.common.base.j0.k(buckets > 0, "buckets must be positive: %s", buckets);
        d dVar = new d(input);
        while (true) {
            int iA = (int) (((double) (i10 + 1)) / dVar.a());
            if (iA < 0 || iA >= buckets) {
                break;
            }
            i10 = iA;
        }
        return i10;
    }

    public static int h(p hashCode, int buckets) {
        return g(hashCode.m(), buckets);
    }

    public static q i() {
        return b.f118904b.f118907a;
    }

    public static q j() {
        return j.f118823a;
    }

    public static q k() {
        return l.f118874a;
    }

    public static q l() {
        return m.f118878a;
    }

    public static q m(int minimumBits) {
        int iB = b(minimumBits);
        if (iB == 32) {
            return g0.f118799e;
        }
        if (iB <= 128) {
            return f0.f118778c;
        }
        int i10 = (iB + 127) / 128;
        q[] qVarArr = new q[i10];
        qVarArr[0] = f0.f118778c;
        int i11 = f118903a;
        for (int i12 = 1; i12 < i10; i12++) {
            i11 += 1500450271;
            qVarArr[i12] = y(i11);
        }
        return new c(qVarArr);
    }

    public static q n(Key key) {
        return new d0("HmacMD5", key, v("hmacMd5", key));
    }

    public static q o(byte[] key) {
        return n(new SecretKeySpec((byte[]) com.google.common.base.j0.E(key), "HmacMD5"));
    }

    public static q p(Key key) {
        return new d0("HmacSHA1", key, v("hmacSha1", key));
    }

    public static q q(byte[] key) {
        return p(new SecretKeySpec((byte[]) com.google.common.base.j0.E(key), "HmacSHA1"));
    }

    public static q r(Key key) {
        return new d0("HmacSHA256", key, v("hmacSha256", key));
    }

    public static q s(byte[] key) {
        return r(new SecretKeySpec((byte[]) com.google.common.base.j0.E(key), "HmacSHA256"));
    }

    public static q t(Key key) {
        return new d0("HmacSHA512", key, v("hmacSha512", key));
    }

    public static q u(byte[] key) {
        return t(new SecretKeySpec((byte[]) com.google.common.base.j0.E(key), "HmacSHA512"));
    }

    private static String v(String methodName, Key key) {
        return "Hashing." + methodName + "(Key[algorithm=" + key.getAlgorithm() + ", format=" + key.getFormat() + "])";
    }

    @Deprecated
    public static q w() {
        return e.f118909a;
    }

    public static q x() {
        return f0.f118777b;
    }

    public static q y(int seed) {
        return new f0(seed);
    }

    @Deprecated
    public static q z() {
        return g0.f118797c;
    }
}
