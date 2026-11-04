package org.apache.commons.codec.binary;

/* JADX INFO: loaded from: classes9.dex */
public class j implements nk.a, nk.b {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static final int f335216c = 1;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private static final int f335217d = 2;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private static final int f335218e = 4;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private static final int f335219f = 8;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private static final int f335220g = 16;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private static final int f335221h = 32;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private static final int f335222i = 64;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private static final int f335223j = 128;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final char[] f335214a = new char[0];

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static final byte[] f335215b = new byte[0];

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private static final int[] f335224k = {1, 2, 4, 8, 16, 32, 64, 128};

    public static byte[] g(byte[] bArr) {
        if (i(bArr)) {
            return f335215b;
        }
        int length = bArr.length >> 3;
        byte[] bArr2 = new byte[length];
        int length2 = bArr.length - 1;
        int i10 = 0;
        while (i10 < length) {
            int i11 = 0;
            while (true) {
                int[] iArr = f335224k;
                if (i11 < iArr.length) {
                    if (bArr[length2 - i11] == 49) {
                        bArr2[i10] = (byte) (iArr[i11] | bArr2[i10]);
                    }
                    i11++;
                }
            }
            i10++;
            length2 -= 8;
        }
        return bArr2;
    }

    public static byte[] h(char[] cArr) {
        if (cArr == null || cArr.length == 0) {
            return f335215b;
        }
        int length = cArr.length >> 3;
        byte[] bArr = new byte[length];
        int length2 = cArr.length - 1;
        int i10 = 0;
        while (i10 < length) {
            int i11 = 0;
            while (true) {
                int[] iArr = f335224k;
                if (i11 < iArr.length) {
                    if (cArr[length2 - i11] == '1') {
                        bArr[i10] = (byte) (iArr[i11] | bArr[i10]);
                    }
                    i11++;
                }
            }
            i10++;
            length2 -= 8;
        }
        return bArr;
    }

    private static boolean i(byte[] bArr) {
        return bArr == null || bArr.length == 0;
    }

    public static byte[] j(byte[] bArr) {
        if (i(bArr)) {
            return f335215b;
        }
        int length = bArr.length << 3;
        byte[] bArr2 = new byte[length];
        int i10 = length - 1;
        int i11 = 0;
        while (i11 < bArr.length) {
            int i12 = 0;
            while (true) {
                int[] iArr = f335224k;
                if (i12 < iArr.length) {
                    if ((iArr[i12] & bArr[i11]) == 0) {
                        bArr2[i10 - i12] = 48;
                    } else {
                        bArr2[i10 - i12] = 49;
                    }
                    i12++;
                }
            }
            i11++;
            i10 -= 8;
        }
        return bArr2;
    }

    public static char[] k(byte[] bArr) {
        if (i(bArr)) {
            return f335214a;
        }
        int length = bArr.length << 3;
        char[] cArr = new char[length];
        int i10 = length - 1;
        int i11 = 0;
        while (i11 < bArr.length) {
            int i12 = 0;
            while (true) {
                int[] iArr = f335224k;
                if (i12 < iArr.length) {
                    if ((iArr[i12] & bArr[i11]) == 0) {
                        cArr[i10 - i12] = org.locationtech.jts.geom.l.f338160j;
                    } else {
                        cArr[i10 - i12] = org.locationtech.jts.geom.l.f338161k;
                    }
                    i12++;
                }
            }
            i11++;
            i10 -= 8;
        }
        return cArr;
    }

    public static String l(byte[] bArr) {
        return new String(k(bArr));
    }

    @Override // nk.g
    public Object a(Object obj) throws nk.h {
        if (obj instanceof byte[]) {
            return k((byte[]) obj);
        }
        throw new nk.h("argument not a byte array");
    }

    @Override // nk.e
    public Object b(Object obj) throws nk.f {
        if (obj == null) {
            return f335215b;
        }
        if (obj instanceof byte[]) {
            return g((byte[]) obj);
        }
        if (obj instanceof char[]) {
            return h((char[]) obj);
        }
        if (obj instanceof String) {
            return h(((String) obj).toCharArray());
        }
        throw new nk.f("argument not a byte array");
    }

    @Override // nk.a
    public byte[] d(byte[] bArr) {
        return g(bArr);
    }

    @Override // nk.b
    public byte[] e(byte[] bArr) {
        return j(bArr);
    }

    public byte[] m(String str) {
        return str == null ? f335215b : h(str.toCharArray());
    }
}
