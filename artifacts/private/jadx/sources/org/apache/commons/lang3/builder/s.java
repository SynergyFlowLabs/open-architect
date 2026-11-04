package org.apache.commons.lang3.builder;

import java.io.Serializable;
import java.lang.reflect.Array;
import java.util.Collection;
import java.util.Map;
import java.util.WeakHashMap;
import kotlinx.serialization.json.internal.AbstractJsonLexerKt;

/* JADX INFO: loaded from: classes14.dex */
public abstract class s implements Serializable {
    private static final long Y = -2587890625525655916L;
    public static final s Z = new a();

    /* JADX INFO: renamed from: p0, reason: collision with root package name */
    public static final s f337005p0 = new c();

    /* JADX INFO: renamed from: p1, reason: collision with root package name */
    public static final s f337006p1 = new e();
    public static final s H1 = new f();

    /* JADX INFO: renamed from: p2, reason: collision with root package name */
    public static final s f337007p2 = new g();

    /* JADX INFO: renamed from: g3, reason: collision with root package name */
    public static final s f337002g3 = new d();

    /* JADX INFO: renamed from: h3, reason: collision with root package name */
    public static final s f337003h3 = new b();

    /* JADX INFO: renamed from: i3, reason: collision with root package name */
    private static final ThreadLocal<WeakHashMap<Object, Object>> f337004i3 = new ThreadLocal<>();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private boolean f337008a = true;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private boolean f337009b = true;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private boolean f337010c = false;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private boolean f337011d = true;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private String f337012e = "[";

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private String f337013f = "]";

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private String f337014g = "=";

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private boolean f337015h = false;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private boolean f337016i = false;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private String f337017j = ",";

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private String f337018k = "{";

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private String f337019l = ",";

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private boolean f337020m = true;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private String f337021n = "}";

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    private boolean f337022o = true;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    private String f337023s = "<null>";

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    private String f337024t = "<size=";

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    private String f337025v = ">";

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    private String f337026w = "<";
    private String X = ">";

    private static final class a extends s {

        /* JADX INFO: renamed from: j3, reason: collision with root package name */
        private static final long f337027j3 = 1;

        a() {
        }

        private Object readResolve() {
            return s.Z;
        }
    }

    private static final class b extends s {

        /* JADX INFO: renamed from: j3, reason: collision with root package name */
        private static final long f337028j3 = 1;

        /* JADX INFO: renamed from: k3, reason: collision with root package name */
        private static final String f337029k3 = "\"";

        b() {
            c1(false);
            e1(false);
            R0("{");
            Q0("}");
            P0("[");
            N0("]");
            U0(",");
            T0(":");
            X0(AbstractJsonLexerKt.NULL);
            b1("\"<");
            a1(">\"");
            Z0("\"<size=");
            Y0(">\"");
        }

        private void h1(StringBuffer stringBuffer, String str) {
            stringBuffer.append('\"');
            stringBuffer.append(str);
            stringBuffer.append('\"');
        }

        private boolean i1(String str) {
            return str.startsWith(n0()) && str.startsWith(l0());
        }

        private boolean j1(String str) {
            return str.startsWith(p0()) && str.endsWith(o0());
        }

        private Object readResolve() {
            return s.f337003h3;
        }

        @Override // org.apache.commons.lang3.builder.s
        protected void C(StringBuffer stringBuffer, String str, Object obj) {
            if (obj == null) {
                W(stringBuffer, str);
                return;
            }
            if (!(obj instanceof String) && !(obj instanceof Character)) {
                if ((obj instanceof Number) || (obj instanceof Boolean)) {
                    stringBuffer.append(obj);
                    return;
                }
                String string = obj.toString();
                if (j1(string) || i1(string)) {
                    stringBuffer.append(obj);
                    return;
                } else {
                    C(stringBuffer, str, string);
                    return;
                }
            }
            h1(stringBuffer, obj.toString());
        }

        @Override // org.apache.commons.lang3.builder.s
        protected void T(StringBuffer stringBuffer, String str) {
            if (str == null) {
                throw new UnsupportedOperationException("Field names are mandatory when using JsonToStringStyle");
            }
            super.T(stringBuffer, f337029k3 + str + f337029k3);
        }

        @Override // org.apache.commons.lang3.builder.s
        public void g(StringBuffer stringBuffer, String str, Object obj, Boolean bool) {
            if (str == null) {
                throw new UnsupportedOperationException("Field names are mandatory when using JsonToStringStyle");
            }
            if (!D0(bool)) {
                throw new UnsupportedOperationException("FullDetail must be true when using JsonToStringStyle");
            }
            super.g(stringBuffer, str, obj, bool);
        }

        @Override // org.apache.commons.lang3.builder.s
        public void j(StringBuffer stringBuffer, String str, byte[] bArr, Boolean bool) {
            if (str == null) {
                throw new UnsupportedOperationException("Field names are mandatory when using JsonToStringStyle");
            }
            if (!D0(bool)) {
                throw new UnsupportedOperationException("FullDetail must be true when using JsonToStringStyle");
            }
            super.j(stringBuffer, str, bArr, bool);
        }

        @Override // org.apache.commons.lang3.builder.s
        public void k(StringBuffer stringBuffer, String str, char[] cArr, Boolean bool) {
            if (str == null) {
                throw new UnsupportedOperationException("Field names are mandatory when using JsonToStringStyle");
            }
            if (!D0(bool)) {
                throw new UnsupportedOperationException("FullDetail must be true when using JsonToStringStyle");
            }
            super.k(stringBuffer, str, cArr, bool);
        }

        @Override // org.apache.commons.lang3.builder.s
        public void l(StringBuffer stringBuffer, String str, double[] dArr, Boolean bool) {
            if (str == null) {
                throw new UnsupportedOperationException("Field names are mandatory when using JsonToStringStyle");
            }
            if (!D0(bool)) {
                throw new UnsupportedOperationException("FullDetail must be true when using JsonToStringStyle");
            }
            super.l(stringBuffer, str, dArr, bool);
        }

        @Override // org.apache.commons.lang3.builder.s
        public void m(StringBuffer stringBuffer, String str, float[] fArr, Boolean bool) {
            if (str == null) {
                throw new UnsupportedOperationException("Field names are mandatory when using JsonToStringStyle");
            }
            if (!D0(bool)) {
                throw new UnsupportedOperationException("FullDetail must be true when using JsonToStringStyle");
            }
            super.m(stringBuffer, str, fArr, bool);
        }

        @Override // org.apache.commons.lang3.builder.s
        public void n(StringBuffer stringBuffer, String str, int[] iArr, Boolean bool) {
            if (str == null) {
                throw new UnsupportedOperationException("Field names are mandatory when using JsonToStringStyle");
            }
            if (!D0(bool)) {
                throw new UnsupportedOperationException("FullDetail must be true when using JsonToStringStyle");
            }
            super.n(stringBuffer, str, iArr, bool);
        }

        @Override // org.apache.commons.lang3.builder.s
        public void o(StringBuffer stringBuffer, String str, long[] jArr, Boolean bool) {
            if (str == null) {
                throw new UnsupportedOperationException("Field names are mandatory when using JsonToStringStyle");
            }
            if (!D0(bool)) {
                throw new UnsupportedOperationException("FullDetail must be true when using JsonToStringStyle");
            }
            super.o(stringBuffer, str, jArr, bool);
        }

        @Override // org.apache.commons.lang3.builder.s
        public void p(StringBuffer stringBuffer, String str, Object[] objArr, Boolean bool) {
            if (str == null) {
                throw new UnsupportedOperationException("Field names are mandatory when using JsonToStringStyle");
            }
            if (!D0(bool)) {
                throw new UnsupportedOperationException("FullDetail must be true when using JsonToStringStyle");
            }
            super.p(stringBuffer, str, objArr, bool);
        }

        @Override // org.apache.commons.lang3.builder.s
        public void q(StringBuffer stringBuffer, String str, short[] sArr, Boolean bool) {
            if (str == null) {
                throw new UnsupportedOperationException("Field names are mandatory when using JsonToStringStyle");
            }
            if (!D0(bool)) {
                throw new UnsupportedOperationException("FullDetail must be true when using JsonToStringStyle");
            }
            super.q(stringBuffer, str, sArr, bool);
        }

        @Override // org.apache.commons.lang3.builder.s
        public void r(StringBuffer stringBuffer, String str, boolean[] zArr, Boolean bool) {
            if (str == null) {
                throw new UnsupportedOperationException("Field names are mandatory when using JsonToStringStyle");
            }
            if (!D0(bool)) {
                throw new UnsupportedOperationException("FullDetail must be true when using JsonToStringStyle");
            }
            super.r(stringBuffer, str, zArr, bool);
        }

        @Override // org.apache.commons.lang3.builder.s
        protected void x(StringBuffer stringBuffer, String str, char c10) {
            h1(stringBuffer, String.valueOf(c10));
        }
    }

    private static final class c extends s {

        /* JADX INFO: renamed from: j3, reason: collision with root package name */
        private static final long f337030j3 = 1;

        c() {
            R0("[");
            U0(System.lineSeparator() + "  ");
            W0(true);
            Q0(System.lineSeparator() + "]");
        }

        private Object readResolve() {
            return s.f337005p0;
        }
    }

    private static final class d extends s {

        /* JADX INFO: renamed from: j3, reason: collision with root package name */
        private static final long f337031j3 = 1;

        d() {
            c1(false);
            e1(false);
        }

        private Object readResolve() {
            return s.f337002g3;
        }
    }

    private static final class e extends s {

        /* JADX INFO: renamed from: j3, reason: collision with root package name */
        private static final long f337032j3 = 1;

        e() {
            d1(false);
        }

        private Object readResolve() {
            return s.f337006p1;
        }
    }

    private static final class f extends s {

        /* JADX INFO: renamed from: j3, reason: collision with root package name */
        private static final long f337033j3 = 1;

        f() {
            f1(true);
            e1(false);
        }

        private Object readResolve() {
            return s.H1;
        }
    }

    private static final class g extends s {

        /* JADX INFO: renamed from: j3, reason: collision with root package name */
        private static final long f337034j3 = 1;

        g() {
            c1(false);
            e1(false);
            d1(false);
            R0("");
            Q0("");
        }

        private Object readResolve() {
            return s.f337007p2;
        }
    }

    protected s() {
    }

    static boolean E0(Object obj) {
        Map<Object, Object> mapT0 = t0();
        return mapT0 != null && mapT0.containsKey(obj);
    }

    static void K0(Object obj) {
        if (obj != null) {
            if (t0() == null) {
                f337004i3.set(new WeakHashMap<>());
            }
            t0().put(obj, null);
        }
    }

    static void g1(Object obj) {
        Map<Object, Object> mapT0;
        if (obj == null || (mapT0 = t0()) == null) {
            return;
        }
        mapT0.remove(obj);
        if (mapT0.isEmpty()) {
            f337004i3.remove();
        }
    }

    static Map<Object, Object> t0() {
        return f337004i3.get();
    }

    protected void A(StringBuffer stringBuffer, String str, int i10) {
        stringBuffer.append(i10);
    }

    protected boolean A0() {
        return this.f337022o;
    }

    protected void B(StringBuffer stringBuffer, String str, long j10) {
        stringBuffer.append(j10);
    }

    protected boolean B0() {
        return this.f337016i;
    }

    protected void C(StringBuffer stringBuffer, String str, Object obj) {
        stringBuffer.append(obj);
    }

    protected boolean C0() {
        return this.f337015h;
    }

    protected void D(StringBuffer stringBuffer, String str, Collection<?> collection) {
        stringBuffer.append(collection);
    }

    protected boolean D0(Boolean bool) {
        return bool == null ? this.f337022o : bool.booleanValue();
    }

    protected void E(StringBuffer stringBuffer, String str, Map<?, ?> map) {
        stringBuffer.append(map);
    }

    protected void F(StringBuffer stringBuffer, String str, short s10) {
        stringBuffer.append((int) s10);
    }

    protected boolean F0() {
        return this.f337009b;
    }

    protected void G(StringBuffer stringBuffer, String str, boolean z10) {
        stringBuffer.append(z10);
    }

    protected boolean G0() {
        return this.f337008a;
    }

    protected void H(StringBuffer stringBuffer, String str, byte[] bArr) {
        stringBuffer.append(this.f337018k);
        for (int i10 = 0; i10 < bArr.length; i10++) {
            if (i10 > 0) {
                stringBuffer.append(this.f337019l);
            }
            w(stringBuffer, str, bArr[i10]);
        }
        stringBuffer.append(this.f337021n);
    }

    protected boolean H0() {
        return this.f337011d;
    }

    protected void I(StringBuffer stringBuffer, String str, char[] cArr) {
        stringBuffer.append(this.f337018k);
        for (int i10 = 0; i10 < cArr.length; i10++) {
            if (i10 > 0) {
                stringBuffer.append(this.f337019l);
            }
            x(stringBuffer, str, cArr[i10]);
        }
        stringBuffer.append(this.f337021n);
    }

    protected boolean I0() {
        return this.f337010c;
    }

    protected void J(StringBuffer stringBuffer, String str, double[] dArr) {
        stringBuffer.append(this.f337018k);
        for (int i10 = 0; i10 < dArr.length; i10++) {
            if (i10 > 0) {
                stringBuffer.append(this.f337019l);
            }
            y(stringBuffer, str, dArr[i10]);
        }
        stringBuffer.append(this.f337021n);
    }

    protected void J0(StringBuffer stringBuffer, String str, Object obj) {
        stringBuffer.append(this.f337018k);
        int length = Array.getLength(obj);
        for (int i10 = 0; i10 < length; i10++) {
            Object obj2 = Array.get(obj, i10);
            if (i10 > 0) {
                stringBuffer.append(this.f337019l);
            }
            if (obj2 == null) {
                W(stringBuffer, str);
            } else {
                V(stringBuffer, str, obj2, this.f337020m);
            }
        }
        stringBuffer.append(this.f337021n);
    }

    protected void K(StringBuffer stringBuffer, String str, float[] fArr) {
        stringBuffer.append(this.f337018k);
        for (int i10 = 0; i10 < fArr.length; i10++) {
            if (i10 > 0) {
                stringBuffer.append(this.f337019l);
            }
            z(stringBuffer, str, fArr[i10]);
        }
        stringBuffer.append(this.f337021n);
    }

    protected void L(StringBuffer stringBuffer, String str, int[] iArr) {
        stringBuffer.append(this.f337018k);
        for (int i10 = 0; i10 < iArr.length; i10++) {
            if (i10 > 0) {
                stringBuffer.append(this.f337019l);
            }
            A(stringBuffer, str, iArr[i10]);
        }
        stringBuffer.append(this.f337021n);
    }

    protected void L0(StringBuffer stringBuffer) {
        int length = stringBuffer.length();
        int length2 = this.f337017j.length();
        if (length > 0 && length2 > 0 && length >= length2) {
            for (int i10 = 0; i10 < length2; i10++) {
                if (stringBuffer.charAt((length - 1) - i10) != this.f337017j.charAt((length2 - 1) - i10)) {
                    return;
                }
            }
            stringBuffer.setLength(length - length2);
        }
    }

    protected void M(StringBuffer stringBuffer, String str, long[] jArr) {
        stringBuffer.append(this.f337018k);
        for (int i10 = 0; i10 < jArr.length; i10++) {
            if (i10 > 0) {
                stringBuffer.append(this.f337019l);
            }
            B(stringBuffer, str, jArr[i10]);
        }
        stringBuffer.append(this.f337021n);
    }

    protected void M0(boolean z10) {
        this.f337020m = z10;
    }

    protected void N(StringBuffer stringBuffer, String str, Object[] objArr) {
        stringBuffer.append(this.f337018k);
        for (int i10 = 0; i10 < objArr.length; i10++) {
            Object obj = objArr[i10];
            if (i10 > 0) {
                stringBuffer.append(this.f337019l);
            }
            if (obj == null) {
                W(stringBuffer, str);
            } else {
                V(stringBuffer, str, obj, this.f337020m);
            }
        }
        stringBuffer.append(this.f337021n);
    }

    protected void N0(String str) {
        if (str == null) {
            str = "";
        }
        this.f337021n = str;
    }

    protected void O(StringBuffer stringBuffer, String str, short[] sArr) {
        stringBuffer.append(this.f337018k);
        for (int i10 = 0; i10 < sArr.length; i10++) {
            if (i10 > 0) {
                stringBuffer.append(this.f337019l);
            }
            F(stringBuffer, str, sArr[i10]);
        }
        stringBuffer.append(this.f337021n);
    }

    protected void O0(String str) {
        if (str == null) {
            str = "";
        }
        this.f337019l = str;
    }

    protected void P(StringBuffer stringBuffer, String str, boolean[] zArr) {
        stringBuffer.append(this.f337018k);
        for (int i10 = 0; i10 < zArr.length; i10++) {
            if (i10 > 0) {
                stringBuffer.append(this.f337019l);
            }
            G(stringBuffer, str, zArr[i10]);
        }
        stringBuffer.append(this.f337021n);
    }

    protected void P0(String str) {
        if (str == null) {
            str = "";
        }
        this.f337018k = str;
    }

    public void Q(StringBuffer stringBuffer, Object obj) {
        if (!this.f337016i) {
            L0(stringBuffer);
        }
        t(stringBuffer);
        g1(obj);
    }

    protected void Q0(String str) {
        if (str == null) {
            str = "";
        }
        this.f337013f = str;
    }

    protected void R(StringBuffer stringBuffer, String str) {
        S(stringBuffer);
    }

    protected void R0(String str) {
        if (str == null) {
            str = "";
        }
        this.f337012e = str;
    }

    protected void S(StringBuffer stringBuffer) {
        stringBuffer.append(this.f337017j);
    }

    protected void S0(boolean z10) {
        this.f337022o = z10;
    }

    protected void T(StringBuffer stringBuffer, String str) {
        if (!this.f337008a || str == null) {
            return;
        }
        stringBuffer.append(str);
        stringBuffer.append(this.f337014g);
    }

    protected void T0(String str) {
        if (str == null) {
            str = "";
        }
        this.f337014g = str;
    }

    protected void U(StringBuffer stringBuffer, Object obj) {
        if (!H0() || obj == null) {
            return;
        }
        K0(obj);
        stringBuffer.append('@');
        stringBuffer.append(Integer.toHexString(System.identityHashCode(obj)));
    }

    protected void U0(String str) {
        if (str == null) {
            str = "";
        }
        this.f337017j = str;
    }

    protected void V(StringBuffer stringBuffer, String str, Object obj, boolean z10) {
        if (E0(obj) && !(obj instanceof Number) && !(obj instanceof Boolean) && !(obj instanceof Character)) {
            v(stringBuffer, str, obj);
            return;
        }
        K0(obj);
        try {
            if (obj instanceof Collection) {
                if (z10) {
                    D(stringBuffer, str, (Collection) obj);
                } else {
                    i0(stringBuffer, str, ((Collection) obj).size());
                }
            } else if (obj instanceof Map) {
                if (z10) {
                    E(stringBuffer, str, (Map) obj);
                } else {
                    i0(stringBuffer, str, ((Map) obj).size());
                }
            } else if (obj instanceof long[]) {
                if (z10) {
                    M(stringBuffer, str, (long[]) obj);
                } else {
                    e0(stringBuffer, str, (long[]) obj);
                }
            } else if (obj instanceof int[]) {
                if (z10) {
                    L(stringBuffer, str, (int[]) obj);
                } else {
                    d0(stringBuffer, str, (int[]) obj);
                }
            } else if (obj instanceof short[]) {
                if (z10) {
                    O(stringBuffer, str, (short[]) obj);
                } else {
                    g0(stringBuffer, str, (short[]) obj);
                }
            } else if (obj instanceof byte[]) {
                if (z10) {
                    H(stringBuffer, str, (byte[]) obj);
                } else {
                    Z(stringBuffer, str, (byte[]) obj);
                }
            } else if (obj instanceof char[]) {
                if (z10) {
                    I(stringBuffer, str, (char[]) obj);
                } else {
                    a0(stringBuffer, str, (char[]) obj);
                }
            } else if (obj instanceof double[]) {
                if (z10) {
                    J(stringBuffer, str, (double[]) obj);
                } else {
                    b0(stringBuffer, str, (double[]) obj);
                }
            } else if (obj instanceof float[]) {
                if (z10) {
                    K(stringBuffer, str, (float[]) obj);
                } else {
                    c0(stringBuffer, str, (float[]) obj);
                }
            } else if (obj instanceof boolean[]) {
                if (z10) {
                    P(stringBuffer, str, (boolean[]) obj);
                } else {
                    h0(stringBuffer, str, (boolean[]) obj);
                }
            } else if (obj.getClass().isArray()) {
                if (z10) {
                    N(stringBuffer, str, (Object[]) obj);
                } else {
                    f0(stringBuffer, str, (Object[]) obj);
                }
            } else if (z10) {
                C(stringBuffer, str, obj);
            } else {
                Y(stringBuffer, str, obj);
            }
        } finally {
            g1(obj);
        }
    }

    protected void V0(boolean z10) {
        this.f337016i = z10;
    }

    protected void W(StringBuffer stringBuffer, String str) {
        stringBuffer.append(this.f337023s);
    }

    protected void W0(boolean z10) {
        this.f337015h = z10;
    }

    public void X(StringBuffer stringBuffer, Object obj) {
        if (obj != null) {
            s(stringBuffer, obj);
            U(stringBuffer, obj);
            u(stringBuffer);
            if (this.f337015h) {
                S(stringBuffer);
            }
        }
    }

    protected void X0(String str) {
        if (str == null) {
            str = "";
        }
        this.f337023s = str;
    }

    protected void Y(StringBuffer stringBuffer, String str, Object obj) {
        stringBuffer.append(this.f337026w);
        stringBuffer.append(u0(obj.getClass()));
        stringBuffer.append(this.X);
    }

    protected void Y0(String str) {
        if (str == null) {
            str = "";
        }
        this.f337025v = str;
    }

    protected void Z(StringBuffer stringBuffer, String str, byte[] bArr) {
        i0(stringBuffer, str, bArr.length);
    }

    protected void Z0(String str) {
        if (str == null) {
            str = "";
        }
        this.f337024t = str;
    }

    public void a(StringBuffer stringBuffer, String str, byte b10) {
        T(stringBuffer, str);
        w(stringBuffer, str, b10);
        R(stringBuffer, str);
    }

    protected void a0(StringBuffer stringBuffer, String str, char[] cArr) {
        i0(stringBuffer, str, cArr.length);
    }

    protected void a1(String str) {
        if (str == null) {
            str = "";
        }
        this.X = str;
    }

    public void b(StringBuffer stringBuffer, String str, char c10) {
        T(stringBuffer, str);
        x(stringBuffer, str, c10);
        R(stringBuffer, str);
    }

    protected void b0(StringBuffer stringBuffer, String str, double[] dArr) {
        i0(stringBuffer, str, dArr.length);
    }

    protected void b1(String str) {
        if (str == null) {
            str = "";
        }
        this.f337026w = str;
    }

    public void c(StringBuffer stringBuffer, String str, double d10) {
        T(stringBuffer, str);
        y(stringBuffer, str, d10);
        R(stringBuffer, str);
    }

    protected void c0(StringBuffer stringBuffer, String str, float[] fArr) {
        i0(stringBuffer, str, fArr.length);
    }

    protected void c1(boolean z10) {
        this.f337009b = z10;
    }

    public void d(StringBuffer stringBuffer, String str, float f10) {
        T(stringBuffer, str);
        z(stringBuffer, str, f10);
        R(stringBuffer, str);
    }

    protected void d0(StringBuffer stringBuffer, String str, int[] iArr) {
        i0(stringBuffer, str, iArr.length);
    }

    protected void d1(boolean z10) {
        this.f337008a = z10;
    }

    public void e(StringBuffer stringBuffer, String str, int i10) {
        T(stringBuffer, str);
        A(stringBuffer, str, i10);
        R(stringBuffer, str);
    }

    protected void e0(StringBuffer stringBuffer, String str, long[] jArr) {
        i0(stringBuffer, str, jArr.length);
    }

    protected void e1(boolean z10) {
        this.f337011d = z10;
    }

    public void f(StringBuffer stringBuffer, String str, long j10) {
        T(stringBuffer, str);
        B(stringBuffer, str, j10);
        R(stringBuffer, str);
    }

    protected void f0(StringBuffer stringBuffer, String str, Object[] objArr) {
        i0(stringBuffer, str, objArr.length);
    }

    protected void f1(boolean z10) {
        this.f337010c = z10;
    }

    public void g(StringBuffer stringBuffer, String str, Object obj, Boolean bool) {
        T(stringBuffer, str);
        if (obj == null) {
            W(stringBuffer, str);
        } else {
            V(stringBuffer, str, obj, D0(bool));
        }
        R(stringBuffer, str);
    }

    protected void g0(StringBuffer stringBuffer, String str, short[] sArr) {
        i0(stringBuffer, str, sArr.length);
    }

    public void h(StringBuffer stringBuffer, String str, short s10) {
        T(stringBuffer, str);
        F(stringBuffer, str, s10);
        R(stringBuffer, str);
    }

    protected void h0(StringBuffer stringBuffer, String str, boolean[] zArr) {
        i0(stringBuffer, str, zArr.length);
    }

    public void i(StringBuffer stringBuffer, String str, boolean z10) {
        T(stringBuffer, str);
        G(stringBuffer, str, z10);
        R(stringBuffer, str);
    }

    protected void i0(StringBuffer stringBuffer, String str, int i10) {
        stringBuffer.append(this.f337024t);
        stringBuffer.append(i10);
        stringBuffer.append(this.f337025v);
    }

    public void j(StringBuffer stringBuffer, String str, byte[] bArr, Boolean bool) {
        T(stringBuffer, str);
        if (bArr == null) {
            W(stringBuffer, str);
        } else if (D0(bool)) {
            H(stringBuffer, str, bArr);
        } else {
            Z(stringBuffer, str, bArr);
        }
        R(stringBuffer, str);
    }

    public void j0(StringBuffer stringBuffer, String str) {
        k0(stringBuffer, str);
    }

    public void k(StringBuffer stringBuffer, String str, char[] cArr, Boolean bool) {
        T(stringBuffer, str);
        if (cArr == null) {
            W(stringBuffer, str);
        } else if (D0(bool)) {
            I(stringBuffer, str, cArr);
        } else {
            a0(stringBuffer, str, cArr);
        }
        R(stringBuffer, str);
    }

    public void k0(StringBuffer stringBuffer, String str) {
        int iIndexOf;
        int iLastIndexOf;
        if (str == null || (iIndexOf = str.indexOf(this.f337012e) + this.f337012e.length()) == (iLastIndexOf = str.lastIndexOf(this.f337013f)) || iIndexOf < 0 || iLastIndexOf < 0) {
            return;
        }
        if (this.f337015h) {
            L0(stringBuffer);
        }
        stringBuffer.append((CharSequence) str, iIndexOf, iLastIndexOf);
        S(stringBuffer);
    }

    public void l(StringBuffer stringBuffer, String str, double[] dArr, Boolean bool) {
        T(stringBuffer, str);
        if (dArr == null) {
            W(stringBuffer, str);
        } else if (D0(bool)) {
            J(stringBuffer, str, dArr);
        } else {
            b0(stringBuffer, str, dArr);
        }
        R(stringBuffer, str);
    }

    protected String l0() {
        return this.f337021n;
    }

    public void m(StringBuffer stringBuffer, String str, float[] fArr, Boolean bool) {
        T(stringBuffer, str);
        if (fArr == null) {
            W(stringBuffer, str);
        } else if (D0(bool)) {
            K(stringBuffer, str, fArr);
        } else {
            c0(stringBuffer, str, fArr);
        }
        R(stringBuffer, str);
    }

    protected String m0() {
        return this.f337019l;
    }

    public void n(StringBuffer stringBuffer, String str, int[] iArr, Boolean bool) {
        T(stringBuffer, str);
        if (iArr == null) {
            W(stringBuffer, str);
        } else if (D0(bool)) {
            L(stringBuffer, str, iArr);
        } else {
            d0(stringBuffer, str, iArr);
        }
        R(stringBuffer, str);
    }

    protected String n0() {
        return this.f337018k;
    }

    public void o(StringBuffer stringBuffer, String str, long[] jArr, Boolean bool) {
        T(stringBuffer, str);
        if (jArr == null) {
            W(stringBuffer, str);
        } else if (D0(bool)) {
            M(stringBuffer, str, jArr);
        } else {
            e0(stringBuffer, str, jArr);
        }
        R(stringBuffer, str);
    }

    protected String o0() {
        return this.f337013f;
    }

    public void p(StringBuffer stringBuffer, String str, Object[] objArr, Boolean bool) {
        T(stringBuffer, str);
        if (objArr == null) {
            W(stringBuffer, str);
        } else if (D0(bool)) {
            N(stringBuffer, str, objArr);
        } else {
            f0(stringBuffer, str, objArr);
        }
        R(stringBuffer, str);
    }

    protected String p0() {
        return this.f337012e;
    }

    public void q(StringBuffer stringBuffer, String str, short[] sArr, Boolean bool) {
        T(stringBuffer, str);
        if (sArr == null) {
            W(stringBuffer, str);
        } else if (D0(bool)) {
            O(stringBuffer, str, sArr);
        } else {
            g0(stringBuffer, str, sArr);
        }
        R(stringBuffer, str);
    }

    protected String q0() {
        return this.f337014g;
    }

    public void r(StringBuffer stringBuffer, String str, boolean[] zArr, Boolean bool) {
        T(stringBuffer, str);
        if (zArr == null) {
            W(stringBuffer, str);
        } else if (D0(bool)) {
            P(stringBuffer, str, zArr);
        } else {
            h0(stringBuffer, str, zArr);
        }
        R(stringBuffer, str);
    }

    protected String r0() {
        return this.f337017j;
    }

    protected void s(StringBuffer stringBuffer, Object obj) {
        if (!this.f337009b || obj == null) {
            return;
        }
        K0(obj);
        if (this.f337010c) {
            stringBuffer.append(u0(obj.getClass()));
        } else {
            stringBuffer.append(obj.getClass().getName());
        }
    }

    protected String s0() {
        return this.f337023s;
    }

    protected void t(StringBuffer stringBuffer) {
        stringBuffer.append(this.f337013f);
    }

    protected void u(StringBuffer stringBuffer) {
        stringBuffer.append(this.f337012e);
    }

    protected String u0(Class<?> cls) {
        return org.apache.commons.lang3.m.E(cls);
    }

    protected void v(StringBuffer stringBuffer, String str, Object obj) {
        org.apache.commons.lang3.s.y(stringBuffer, obj);
    }

    protected String v0() {
        return this.f337025v;
    }

    protected void w(StringBuffer stringBuffer, String str, byte b10) {
        stringBuffer.append((int) b10);
    }

    protected String w0() {
        return this.f337024t;
    }

    protected void x(StringBuffer stringBuffer, String str, char c10) {
        stringBuffer.append(c10);
    }

    protected String x0() {
        return this.X;
    }

    protected void y(StringBuffer stringBuffer, String str, double d10) {
        stringBuffer.append(d10);
    }

    protected String y0() {
        return this.f337026w;
    }

    protected void z(StringBuffer stringBuffer, String str, float f10) {
        stringBuffer.append(f10);
    }

    protected boolean z0() {
        return this.f337020m;
    }
}
