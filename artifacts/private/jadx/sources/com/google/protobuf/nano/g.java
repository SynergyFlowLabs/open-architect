package com.google.protobuf.nano;

import java.io.IOException;
import java.nio.charset.Charset;
import java.util.Arrays;
import java.util.Map;

/* JADX INFO: loaded from: classes5.dex */
public final class g {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final int f126186a = 1;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final int f126187b = 2;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final int f126188c = 3;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final int f126189d = 4;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final int f126190e = 5;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final int f126191f = 6;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static final int f126192g = 7;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public static final int f126193h = 8;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public static final int f126194i = 9;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public static final int f126195j = 10;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public static final int f126196k = 11;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public static final int f126197l = 12;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public static final int f126198m = 13;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public static final int f126199n = 14;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public static final int f126200o = 15;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public static final int f126201p = 16;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public static final int f126202q = 17;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public static final int f126203r = 18;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    protected static final Charset f126204s = Charset.forName("UTF-8");

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    protected static final Charset f126205t = Charset.forName("ISO-8859-1");

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public static final Object f126206u = new Object();

    private g() {
    }

    public static byte[] a(String str) {
        return str.getBytes(f126205t);
    }

    public static void b(c cVar, c cVar2) {
        e eVar = cVar.f126153b;
        if (eVar != null) {
            cVar2.f126153b = eVar.clone();
        }
    }

    public static <K, V> int c(Map<K, V> map, int i10, int i11, int i12) {
        int iK = b.K(i10);
        int iY = 0;
        for (Map.Entry<K, V> entry : map.entrySet()) {
            K key = entry.getKey();
            V value = entry.getValue();
            if (key == null || value == null) {
                throw new IllegalStateException("keys and values in maps cannot be null");
            }
            int iJ = b.j(1, i11, key) + b.j(2, i12, value);
            iY += iK + iJ + b.y(iJ);
        }
        return iY;
    }

    public static byte[] d(String str) {
        return str.getBytes(f126204s);
    }

    public static <K, V> boolean e(Map<K, V> map, Map<K, V> map2) {
        if (map == map2) {
            return true;
        }
        if (map == null) {
            return map2.size() == 0;
        }
        if (map2 == null) {
            return map.size() == 0;
        }
        if (map.size() != map2.size()) {
            return false;
        }
        for (Map.Entry<K, V> entry : map.entrySet()) {
            if (!map2.containsKey(entry.getKey()) || !m(entry.getValue(), map2.get(entry.getKey()))) {
                return false;
            }
        }
        return true;
    }

    public static boolean f(double[] dArr, double[] dArr2) {
        if (dArr == null || dArr.length == 0) {
            return dArr2 == null || dArr2.length == 0;
        }
        return Arrays.equals(dArr, dArr2);
    }

    public static boolean g(float[] fArr, float[] fArr2) {
        if (fArr != null && fArr.length != 0) {
            return Arrays.equals(fArr, fArr2);
        }
        return fArr2 == null || fArr2.length == 0;
    }

    public static boolean h(int[] iArr, int[] iArr2) {
        if (iArr == null || iArr.length == 0) {
            return iArr2 == null || iArr2.length == 0;
        }
        return Arrays.equals(iArr, iArr2);
    }

    public static boolean i(long[] jArr, long[] jArr2) {
        if (jArr != null && jArr.length != 0) {
            return Arrays.equals(jArr, jArr2);
        }
        if (jArr2 != null && jArr2.length != 0) {
            return false;
        }
        return true;
    }

    public static boolean j(Object[] objArr, Object[] objArr2) {
        int length = objArr == null ? 0 : objArr.length;
        int length2 = objArr2 == null ? 0 : objArr2.length;
        int i10 = 0;
        int i11 = 0;
        while (true) {
            if (i10 >= length || objArr[i10] != null) {
                while (i11 < length2 && objArr2[i11] == null) {
                    i11++;
                }
                boolean z10 = i10 >= length;
                boolean z11 = i11 >= length2;
                if (z10 && z11) {
                    return true;
                }
                if (z10 != z11 || !objArr[i10].equals(objArr2[i11])) {
                    return false;
                }
                i10++;
                i11++;
            } else {
                i10++;
            }
        }
    }

    public static boolean k(boolean[] zArr, boolean[] zArr2) {
        if (zArr != null && zArr.length != 0) {
            return Arrays.equals(zArr, zArr2);
        }
        return zArr2 == null || zArr2.length == 0;
    }

    public static boolean l(byte[][] bArr, byte[][] bArr2) {
        int length = bArr == null ? 0 : bArr.length;
        int length2 = bArr2 == null ? 0 : bArr2.length;
        int i10 = 0;
        int i11 = 0;
        while (true) {
            if (i10 >= length || bArr[i10] != null) {
                while (i11 < length2 && bArr2[i11] == null) {
                    i11++;
                }
                boolean z10 = i10 >= length;
                boolean z11 = i11 >= length2;
                if (z10 && z11) {
                    return true;
                }
                if (z10 != z11 || !Arrays.equals(bArr[i10], bArr2[i11])) {
                    return false;
                }
                i10++;
                i11++;
            } else {
                i10++;
            }
        }
    }

    private static boolean m(Object obj, Object obj2) {
        if (obj == null || obj2 == null) {
            throw new IllegalStateException("keys and values in maps cannot be null");
        }
        return ((obj instanceof byte[]) && (obj2 instanceof byte[])) ? Arrays.equals((byte[]) obj, (byte[]) obj2) : obj.equals(obj2);
    }

    public static <K, V> int n(Map<K, V> map) {
        int iV = 0;
        if (map == null) {
            return 0;
        }
        for (Map.Entry<K, V> entry : map.entrySet()) {
            iV += v(entry.getValue()) ^ v(entry.getKey());
        }
        return iV;
    }

    public static int o(double[] dArr) {
        if (dArr != null && dArr.length != 0) {
            return Arrays.hashCode(dArr);
        }
        return 0;
    }

    public static int p(float[] fArr) {
        if (fArr == null || fArr.length == 0) {
            return 0;
        }
        return Arrays.hashCode(fArr);
    }

    public static int q(int[] iArr) {
        if (iArr == null || iArr.length == 0) {
            return 0;
        }
        return Arrays.hashCode(iArr);
    }

    public static int r(long[] jArr) {
        if (jArr != null && jArr.length != 0) {
            return Arrays.hashCode(jArr);
        }
        return 0;
    }

    public static int s(Object[] objArr) {
        int length = objArr == null ? 0 : objArr.length;
        int iHashCode = 0;
        for (int i10 = 0; i10 < length; i10++) {
            Object obj = objArr[i10];
            if (obj != null) {
                iHashCode = (iHashCode * 31) + obj.hashCode();
            }
        }
        return iHashCode;
    }

    public static int t(boolean[] zArr) {
        if (zArr == null || zArr.length == 0) {
            return 0;
        }
        return Arrays.hashCode(zArr);
    }

    public static int u(byte[][] bArr) {
        int length = bArr == null ? 0 : bArr.length;
        int iHashCode = 0;
        for (int i10 = 0; i10 < length; i10++) {
            byte[] bArr2 = bArr[i10];
            if (bArr2 != null) {
                iHashCode = (iHashCode * 31) + Arrays.hashCode(bArr2);
            }
        }
        return iHashCode;
    }

    private static int v(Object obj) {
        return obj instanceof byte[] ? Arrays.hashCode((byte[]) obj) : obj.hashCode();
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static final <K, V> Map<K, V> w(a aVar, Map<K, V> map, i.c cVar, int i10, int i11, V v10, int i12, int i13) throws IOException {
        Map<K, V> mapA = cVar.a(map);
        int iK = aVar.k(aVar.B());
        Object objX = null;
        while (true) {
            int I = aVar.I();
            if (I == 0) {
                break;
            }
            if (I == i12) {
                objX = aVar.w(i10);
            } else if (I == i13) {
                if (i11 == 11) {
                    aVar.v((j) v10);
                } else {
                    v10 = (V) aVar.w(i11);
                }
            } else if (!aVar.Q(I)) {
                break;
            }
        }
        aVar.a(0);
        aVar.j(iK);
        if (objX == null) {
            objX = x(i10);
        }
        if (v10 == 0) {
            v10 = x(i11);
        }
        mapA.put(objX, v10);
        return mapA;
    }

    private static Object x(int i10) {
        switch (i10) {
            case 1:
                return Double.valueOf(0.0d);
            case 2:
                return Float.valueOf(0.0f);
            case 3:
            case 4:
            case 6:
            case 16:
            case 18:
                return 0L;
            case 5:
            case 7:
            case 13:
            case 14:
            case 15:
            case 17:
                return 0;
            case 8:
                return Boolean.FALSE;
            case 9:
                return "";
            case 10:
            case 11:
            default:
                throw new IllegalArgumentException("Type: " + i10 + " is not a primitive type.");
            case 12:
                return m.f126229p;
        }
    }

    public static <K, V> void y(b bVar, Map<K, V> map, int i10, int i11, int i12) throws IOException {
        for (Map.Entry<K, V> entry : map.entrySet()) {
            K key = entry.getKey();
            V value = entry.getValue();
            if (key == null || value == null) {
                throw new IllegalStateException("keys and values in maps cannot be null");
            }
            int iJ = b.j(1, i11, key) + b.j(2, i12, value);
            bVar.Q0(i10, 2);
            bVar.E0(iJ);
            bVar.j0(1, i11, key);
            bVar.j0(2, i12, value);
        }
    }

    public static String z(String str) {
        return new String(str.getBytes(f126205t), f126204s);
    }
}
