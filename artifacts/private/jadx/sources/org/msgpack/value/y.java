package org.msgpack.value;

import java.math.BigInteger;
import java.util.AbstractMap;
import java.util.Arrays;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

/* JADX INFO: loaded from: classes14.dex */
public final class y {

    public static class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final Map<x, x> f339418a = new LinkedHashMap();

        public s a() {
            return y.s(this.f339418a);
        }

        public a b(Map.Entry<? extends x, ? extends x> entry) {
            c(entry.getKey(), entry.getValue());
            return this;
        }

        public a c(x xVar, x xVar2) {
            this.f339418a.put(xVar, xVar2);
            return this;
        }

        public a d(Iterable<? extends Map.Entry<? extends x, ? extends x>> iterable) {
            for (Map.Entry<? extends x, ? extends x> entry : iterable) {
                c(entry.getKey(), entry.getValue());
            }
            return this;
        }

        public a e(Map<? extends x, ? extends x> map) {
            Iterator<Map.Entry<? extends x, ? extends x>> it = map.entrySet().iterator();
            while (it.hasNext()) {
                b(it.next());
            }
            return this;
        }
    }

    private y() {
    }

    public static p A(byte[] bArr) {
        return new org.msgpack.value.impl.l(bArr);
    }

    public static p B(byte[] bArr, int i10, int i11) {
        return C(bArr, i10, i11, false);
    }

    public static p C(byte[] bArr, int i10, int i11, boolean z10) {
        return (z10 && i10 == 0 && i11 == bArr.length) ? new org.msgpack.value.impl.l(bArr) : new org.msgpack.value.impl.l(Arrays.copyOfRange(bArr, i10, i11));
    }

    public static p D(byte[] bArr, boolean z10) {
        return z10 ? new org.msgpack.value.impl.l(bArr) : new org.msgpack.value.impl.l(Arrays.copyOf(bArr, bArr.length));
    }

    public static f a() {
        return org.msgpack.value.impl.c.A0();
    }

    public static l b() {
        return org.msgpack.value.impl.j.C0();
    }

    public static f c(List<? extends x> list) {
        return list.isEmpty() ? org.msgpack.value.impl.c.A0() : new org.msgpack.value.impl.c((x[]) list.toArray(new x[list.size()]));
    }

    public static f d(x... xVarArr) {
        return xVarArr.length == 0 ? org.msgpack.value.impl.c.A0() : new org.msgpack.value.impl.c((x[]) Arrays.copyOf(xVarArr, xVarArr.length));
    }

    public static f e(x[] xVarArr, boolean z10) {
        if (xVarArr.length == 0) {
            return org.msgpack.value.impl.c.A0();
        }
        return z10 ? new org.msgpack.value.impl.c(xVarArr) : new org.msgpack.value.impl.c((x[]) Arrays.copyOf(xVarArr, xVarArr.length));
    }

    public static g f(byte[] bArr) {
        return i(bArr, false);
    }

    public static g g(byte[] bArr, int i10, int i11) {
        return h(bArr, i10, i11, false);
    }

    public static g h(byte[] bArr, int i10, int i11, boolean z10) {
        return (z10 && i10 == 0 && i11 == bArr.length) ? new org.msgpack.value.impl.e(bArr) : new org.msgpack.value.impl.e(Arrays.copyOfRange(bArr, i10, i11));
    }

    public static g i(byte[] bArr, boolean z10) {
        return z10 ? new org.msgpack.value.impl.e(bArr) : new org.msgpack.value.impl.e(Arrays.copyOf(bArr, bArr.length));
    }

    public static h j(boolean z10) {
        return z10 ? org.msgpack.value.impl.f.f339394b : org.msgpack.value.impl.f.f339395c;
    }

    public static i k(byte b10, byte[] bArr) {
        return new org.msgpack.value.impl.h(b10, bArr);
    }

    public static j l(double d10) {
        return new org.msgpack.value.impl.g(d10);
    }

    public static j m(float f10) {
        return new org.msgpack.value.impl.g(f10);
    }

    public static k n(byte b10) {
        return new org.msgpack.value.impl.i(b10);
    }

    public static k o(int i10) {
        return new org.msgpack.value.impl.i(i10);
    }

    public static k p(long j10) {
        return new org.msgpack.value.impl.i(j10);
    }

    public static k q(BigInteger bigInteger) {
        return new org.msgpack.value.impl.d(bigInteger);
    }

    public static k r(short s10) {
        return new org.msgpack.value.impl.i(s10);
    }

    public static <K extends x, V extends x> l s(Map<K, V> map) {
        x[] xVarArr = new x[map.size() * 2];
        int i10 = 0;
        for (Map.Entry<K, V> entry : map.entrySet()) {
            xVarArr[i10] = entry.getKey();
            xVarArr[i10 + 1] = entry.getValue();
            i10 += 2;
        }
        return new org.msgpack.value.impl.j(xVarArr);
    }

    public static l t(x... xVarArr) {
        return xVarArr.length == 0 ? org.msgpack.value.impl.j.C0() : new org.msgpack.value.impl.j((x[]) Arrays.copyOf(xVarArr, xVarArr.length));
    }

    public static l u(x[] xVarArr, boolean z10) {
        if (xVarArr.length == 0) {
            return org.msgpack.value.impl.j.C0();
        }
        return z10 ? new org.msgpack.value.impl.j(xVarArr) : new org.msgpack.value.impl.j((x[]) Arrays.copyOf(xVarArr, xVarArr.length));
    }

    public static s v(Map.Entry<? extends x, ? extends x>... entryArr) {
        x[] xVarArr = new x[entryArr.length * 2];
        for (int i10 = 0; i10 < entryArr.length; i10 += 2) {
            int i11 = i10 * 2;
            xVarArr[i11] = entryArr[i10].getKey();
            xVarArr[i11 + 1] = entryArr[i10].getValue();
        }
        return u(xVarArr, true);
    }

    public static a w() {
        return new a();
    }

    public static Map.Entry<x, x> x(x xVar, x xVar2) {
        return new AbstractMap.SimpleEntry(xVar, xVar2);
    }

    public static m y() {
        return org.msgpack.value.impl.k.z0();
    }

    public static p z(String str) {
        return new org.msgpack.value.impl.l(str);
    }
}
