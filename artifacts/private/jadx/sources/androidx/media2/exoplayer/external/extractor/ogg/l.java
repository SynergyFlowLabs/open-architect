package androidx.media2.exoplayer.external.extractor.ogg;

import androidx.annotation.b1;
import androidx.media2.exoplayer.external.k0;
import androidx.media2.exoplayer.external.util.p;
import androidx.media2.exoplayer.external.util.x;
import java.util.Arrays;

/* JADX INFO: loaded from: classes2.dex */
@b1({b1.a.LIBRARY_GROUP})
final class l {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final String f54672a = "VorbisUtil";

    public static final class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final int f54673a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final int f54674b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final long[] f54675c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public final int f54676d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public final boolean f54677e;

        public a(int dimensions, int entries, long[] lengthMap, int lookupType, boolean isOrdered) {
            this.f54673a = dimensions;
            this.f54674b = entries;
            this.f54675c = lengthMap;
            this.f54676d = lookupType;
            this.f54677e = isOrdered;
        }
    }

    public static final class b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final String f54678a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final String[] f54679b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final int f54680c;

        public b(String vendor, String[] comments, int length) {
            this.f54678a = vendor;
            this.f54679b = comments;
            this.f54680c = length;
        }
    }

    public static final class c {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final boolean f54681a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final int f54682b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final int f54683c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public final int f54684d;

        public c(boolean blockFlag, int windowType, int transformType, int mapping) {
            this.f54681a = blockFlag;
            this.f54682b = windowType;
            this.f54683c = transformType;
            this.f54684d = mapping;
        }
    }

    public static final class d {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final long f54685a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final int f54686b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final long f54687c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public final int f54688d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public final int f54689e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public final int f54690f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        public final int f54691g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        public final int f54692h;

        /* JADX INFO: renamed from: i, reason: collision with root package name */
        public final boolean f54693i;

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        public final byte[] f54694j;

        public d(long version, int channels, long sampleRate, int bitrateMax, int bitrateNominal, int bitrateMin, int blockSize0, int blockSize1, boolean framingFlag, byte[] data) {
            this.f54685a = version;
            this.f54686b = channels;
            this.f54687c = sampleRate;
            this.f54688d = bitrateMax;
            this.f54689e = bitrateNominal;
            this.f54690f = bitrateMin;
            this.f54691g = blockSize0;
            this.f54692h = blockSize1;
            this.f54693i = framingFlag;
            this.f54694j = data;
        }

        public int a() {
            int i10 = this.f54689e;
            return i10 == 0 ? (this.f54690f + this.f54688d) / 2 : i10;
        }
    }

    private l() {
    }

    public static int a(int x10) {
        int i10 = 0;
        while (x10 > 0) {
            i10++;
            x10 >>>= 1;
        }
        return i10;
    }

    private static long b(long entries, long dimension) {
        return (long) Math.floor(Math.pow(entries, 1.0d / dimension));
    }

    private static a c(j bitArray) throws k0 {
        if (bitArray.e(24) != 5653314) {
            int iC = bitArray.c();
            StringBuilder sb2 = new StringBuilder(66);
            sb2.append("expected code book to start with [0x56, 0x43, 0x42] at ");
            sb2.append(iC);
            throw new k0(sb2.toString());
        }
        int iE = bitArray.e(16);
        int iE2 = bitArray.e(24);
        long[] jArr = new long[iE2];
        boolean zD = bitArray.d();
        long jB = 0;
        if (zD) {
            int iE3 = bitArray.e(5) + 1;
            int i10 = 0;
            while (i10 < iE2) {
                int iE4 = bitArray.e(a(iE2 - i10));
                for (int i11 = 0; i11 < iE4 && i10 < iE2; i11++) {
                    jArr[i10] = iE3;
                    i10++;
                }
                iE3++;
            }
        } else {
            boolean zD2 = bitArray.d();
            for (int i12 = 0; i12 < iE2; i12++) {
                if (!zD2) {
                    jArr[i12] = bitArray.e(5) + 1;
                } else if (bitArray.d()) {
                    jArr[i12] = bitArray.e(5) + 1;
                } else {
                    jArr[i12] = 0;
                }
            }
        }
        int iE5 = bitArray.e(4);
        if (iE5 > 2) {
            StringBuilder sb3 = new StringBuilder(53);
            sb3.append("lookup type greater than 2 not decodable: ");
            sb3.append(iE5);
            throw new k0(sb3.toString());
        }
        if (iE5 == 1 || iE5 == 2) {
            bitArray.h(32);
            bitArray.h(32);
            int iE6 = bitArray.e(4) + 1;
            bitArray.h(1);
            if (iE5 != 1) {
                jB = ((long) iE2) * ((long) iE);
            } else if (iE != 0) {
                jB = b(iE2, iE);
            }
            bitArray.h((int) (jB * ((long) iE6)));
        }
        return new a(iE, iE2, jArr, iE5, zD);
    }

    private static void d(j bitArray) throws k0 {
        int iE = bitArray.e(6) + 1;
        for (int i10 = 0; i10 < iE; i10++) {
            int iE2 = bitArray.e(16);
            if (iE2 == 0) {
                bitArray.h(8);
                bitArray.h(16);
                bitArray.h(16);
                bitArray.h(6);
                bitArray.h(8);
                int iE3 = bitArray.e(4) + 1;
                for (int i11 = 0; i11 < iE3; i11++) {
                    bitArray.h(8);
                }
            } else {
                if (iE2 != 1) {
                    StringBuilder sb2 = new StringBuilder(52);
                    sb2.append("floor type greater than 1 not decodable: ");
                    sb2.append(iE2);
                    throw new k0(sb2.toString());
                }
                int iE4 = bitArray.e(5);
                int[] iArr = new int[iE4];
                int i12 = -1;
                for (int i13 = 0; i13 < iE4; i13++) {
                    int iE5 = bitArray.e(4);
                    iArr[i13] = iE5;
                    if (iE5 > i12) {
                        i12 = iE5;
                    }
                }
                int i14 = i12 + 1;
                int[] iArr2 = new int[i14];
                for (int i15 = 0; i15 < i14; i15++) {
                    iArr2[i15] = bitArray.e(3) + 1;
                    int iE6 = bitArray.e(2);
                    if (iE6 > 0) {
                        bitArray.h(8);
                    }
                    for (int i16 = 0; i16 < (1 << iE6); i16++) {
                        bitArray.h(8);
                    }
                }
                bitArray.h(2);
                int iE7 = bitArray.e(4);
                int i17 = 0;
                int i18 = 0;
                for (int i19 = 0; i19 < iE4; i19++) {
                    i17 += iArr2[iArr[i19]];
                    while (i18 < i17) {
                        bitArray.h(iE7);
                        i18++;
                    }
                }
            }
        }
    }

    private static void e(int channels, j bitArray) throws k0 {
        int iE = bitArray.e(6) + 1;
        for (int i10 = 0; i10 < iE; i10++) {
            int iE2 = bitArray.e(16);
            if (iE2 != 0) {
                StringBuilder sb2 = new StringBuilder(52);
                sb2.append("mapping type other than 0 not supported: ");
                sb2.append(iE2);
                p.d(f54672a, sb2.toString());
            } else {
                int iE3 = bitArray.d() ? bitArray.e(4) + 1 : 1;
                if (bitArray.d()) {
                    int iE4 = bitArray.e(8) + 1;
                    for (int i11 = 0; i11 < iE4; i11++) {
                        int i12 = channels - 1;
                        bitArray.h(a(i12));
                        bitArray.h(a(i12));
                    }
                }
                if (bitArray.e(2) != 0) {
                    throw new k0("to reserved bits must be zero after mapping coupling steps");
                }
                if (iE3 > 1) {
                    for (int i13 = 0; i13 < channels; i13++) {
                        bitArray.h(4);
                    }
                }
                for (int i14 = 0; i14 < iE3; i14++) {
                    bitArray.h(8);
                    bitArray.h(8);
                    bitArray.h(8);
                }
            }
        }
    }

    private static c[] f(j bitArray) {
        int iE = bitArray.e(6) + 1;
        c[] cVarArr = new c[iE];
        for (int i10 = 0; i10 < iE; i10++) {
            cVarArr[i10] = new c(bitArray.d(), bitArray.e(16), bitArray.e(16), bitArray.e(8));
        }
        return cVarArr;
    }

    private static void g(j bitArray) throws k0 {
        int iE = bitArray.e(6) + 1;
        for (int i10 = 0; i10 < iE; i10++) {
            if (bitArray.e(16) > 2) {
                throw new k0("residueType greater than 2 is not decodable");
            }
            bitArray.h(24);
            bitArray.h(24);
            bitArray.h(24);
            int iE2 = bitArray.e(6) + 1;
            bitArray.h(8);
            int[] iArr = new int[iE2];
            for (int i11 = 0; i11 < iE2; i11++) {
                iArr[i11] = ((bitArray.d() ? bitArray.e(5) : 0) * 8) + bitArray.e(3);
            }
            for (int i12 = 0; i12 < iE2; i12++) {
                for (int i13 = 0; i13 < 8; i13++) {
                    if ((iArr[i12] & (1 << i13)) != 0) {
                        bitArray.h(8);
                    }
                }
            }
        }
    }

    public static b h(x headerData) throws k0 {
        k(3, headerData, false);
        String strA = headerData.A((int) headerData.s());
        int length = strA.length();
        long jS = headerData.s();
        String[] strArr = new String[(int) jS];
        int length2 = length + 15;
        for (int i10 = 0; i10 < jS; i10++) {
            String strA2 = headerData.A((int) headerData.s());
            strArr[i10] = strA2;
            length2 = length2 + 4 + strA2.length();
        }
        if ((headerData.D() & 1) != 0) {
            return new b(strA, strArr, length2 + 1);
        }
        throw new k0("framing bit expected to be set");
    }

    public static d i(x headerData) throws k0 {
        k(1, headerData, false);
        long jS = headerData.s();
        int iD = headerData.D();
        long jS2 = headerData.s();
        int iO = headerData.o();
        int iO2 = headerData.o();
        int iO3 = headerData.o();
        int iD2 = headerData.D();
        return new d(jS, iD, jS2, iO, iO2, iO3, (int) Math.pow(2.0d, iD2 & 15), (int) Math.pow(2.0d, (iD2 & 240) >> 4), (headerData.D() & 1) > 0, Arrays.copyOf(headerData.f57720a, headerData.d()));
    }

    public static c[] j(x headerData, int channels) throws k0 {
        k(5, headerData, false);
        int iD = headerData.D() + 1;
        j jVar = new j(headerData.f57720a);
        jVar.h(headerData.c() * 8);
        for (int i10 = 0; i10 < iD; i10++) {
            c(jVar);
        }
        int iE = jVar.e(6) + 1;
        for (int i11 = 0; i11 < iE; i11++) {
            if (jVar.e(16) != 0) {
                throw new k0("placeholder of time domain transforms not zeroed out");
            }
        }
        d(jVar);
        g(jVar);
        e(channels, jVar);
        c[] cVarArrF = f(jVar);
        if (jVar.d()) {
            return cVarArrF;
        }
        throw new k0("framing bit after modes not set as expected");
    }

    public static boolean k(int headerType, x header, boolean quiet) throws k0 {
        if (header.a() < 7) {
            if (quiet) {
                return false;
            }
            int iA = header.a();
            StringBuilder sb2 = new StringBuilder(29);
            sb2.append("too short header: ");
            sb2.append(iA);
            throw new k0(sb2.toString());
        }
        if (header.D() != headerType) {
            if (quiet) {
                return false;
            }
            String strValueOf = String.valueOf(Integer.toHexString(headerType));
            throw new k0(strValueOf.length() != 0 ? "expected header type ".concat(strValueOf) : new String("expected header type "));
        }
        if (header.D() == 118 && header.D() == 111 && header.D() == 114 && header.D() == 98 && header.D() == 105 && header.D() == 115) {
            return true;
        }
        if (quiet) {
            return false;
        }
        throw new k0("expected characters 'vorbis'");
    }
}
