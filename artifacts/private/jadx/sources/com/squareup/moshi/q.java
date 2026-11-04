package com.squareup.moshi;

import java.io.IOException;
import java.math.BigDecimal;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import kotlinx.serialization.json.internal.AbstractJsonLexerKt;

/* JADX INFO: loaded from: classes13.dex */
final class q extends m {

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private static final Object f267241i = new Object();

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private Object[] f267242h;

    static final class a implements Iterator<Object>, Cloneable {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final m.c f267243a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final Object[] f267244b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        int f267245c;

        a(m.c cVar, Object[] objArr, int i10) {
            this.f267243a = cVar;
            this.f267244b = objArr;
            this.f267245c = i10;
        }

        /* JADX INFO: Access modifiers changed from: protected */
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public a clone() {
            return new a(this.f267243a, this.f267244b, this.f267245c);
        }

        @Override // java.util.Iterator
        public boolean hasNext() {
            return this.f267245c < this.f267244b.length;
        }

        @Override // java.util.Iterator
        public Object next() {
            Object[] objArr = this.f267244b;
            int i10 = this.f267245c;
            this.f267245c = i10 + 1;
            return objArr[i10];
        }

        @Override // java.util.Iterator
        public void remove() {
            throw new UnsupportedOperationException();
        }
    }

    q(Object obj) {
        int[] iArr = this.f267172b;
        int i10 = this.f267171a;
        iArr[i10] = 7;
        Object[] objArr = new Object[32];
        this.f267242h = objArr;
        this.f267171a = i10 + 1;
        objArr[i10] = obj;
    }

    private void H(Object obj) {
        int i10 = this.f267171a;
        if (i10 == this.f267242h.length) {
            if (i10 == 256) {
                throw new j("Nesting too deep at " + S());
            }
            int[] iArr = this.f267172b;
            this.f267172b = Arrays.copyOf(iArr, iArr.length * 2);
            String[] strArr = this.f267173c;
            this.f267173c = (String[]) Arrays.copyOf(strArr, strArr.length * 2);
            int[] iArr2 = this.f267174d;
            this.f267174d = Arrays.copyOf(iArr2, iArr2.length * 2);
            Object[] objArr = this.f267242h;
            this.f267242h = Arrays.copyOf(objArr, objArr.length * 2);
        }
        Object[] objArr2 = this.f267242h;
        int i11 = this.f267171a;
        this.f267171a = i11 + 1;
        objArr2[i11] = obj;
    }

    private void I() {
        int i10 = this.f267171a;
        int i11 = i10 - 1;
        this.f267171a = i11;
        Object[] objArr = this.f267242h;
        objArr[i11] = null;
        this.f267172b[i11] = 0;
        if (i11 > 0) {
            int[] iArr = this.f267174d;
            int i12 = i10 - 2;
            iArr[i12] = iArr[i12] + 1;
            Object obj = objArr[i10 - 2];
            if (obj instanceof Iterator) {
                Iterator it = (Iterator) obj;
                if (it.hasNext()) {
                    H(it.next());
                }
            }
        }
    }

    @fj.h
    private <T> T N(Class<T> cls, m.c cVar) throws IOException {
        int i10 = this.f267171a;
        Object obj = i10 != 0 ? this.f267242h[i10 - 1] : null;
        if (cls.isInstance(obj)) {
            return cls.cast(obj);
        }
        if (obj == null && cVar == m.c.NULL) {
            return null;
        }
        if (obj == f267241i) {
            throw new IllegalStateException("JsonReader is closed");
        }
        throw E(obj, cVar);
    }

    private String R(Map.Entry<?, ?> entry) {
        Object key = entry.getKey();
        if (key instanceof String) {
            return (String) key;
        }
        throw E(key, m.c.NAME);
    }

    @Override // com.squareup.moshi.m
    public void F0() throws IOException {
        m.c cVar = m.c.END_ARRAY;
        a aVar = (a) N(a.class, cVar);
        if (aVar.f267243a != cVar || aVar.hasNext()) {
            throw E(aVar, cVar);
        }
        I();
    }

    @Override // com.squareup.moshi.m
    public void F1() throws IOException {
        m.c cVar = m.c.END_OBJECT;
        a aVar = (a) N(a.class, cVar);
        if (aVar.f267243a != cVar || aVar.hasNext()) {
            throw E(aVar, cVar);
        }
        this.f267173c[this.f267171a - 1] = null;
        I();
    }

    @Override // com.squareup.moshi.m
    public void J0() throws IOException {
        List list = (List) N(List.class, m.c.BEGIN_ARRAY);
        a aVar = new a(m.c.END_ARRAY, list.toArray(new Object[list.size()]), 0);
        Object[] objArr = this.f267242h;
        int i10 = this.f267171a;
        objArr[i10 - 1] = aVar;
        this.f267172b[i10 - 1] = 1;
        this.f267174d[i10 - 1] = 0;
        if (aVar.hasNext()) {
            H(aVar.next());
        }
    }

    @Override // com.squareup.moshi.m
    public void a9() throws IOException {
        if (this.f267176f) {
            throw new j("Cannot skip unexpected " + f() + " at " + S());
        }
        int i10 = this.f267171a;
        if (i10 > 1) {
            this.f267173c[i10 - 2] = AbstractJsonLexerKt.NULL;
        }
        Object obj = i10 != 0 ? this.f267242h[i10 - 1] : null;
        if (obj instanceof a) {
            throw new j("Expected a value but was " + f() + " at path " + S());
        }
        if (obj instanceof Map.Entry) {
            Object[] objArr = this.f267242h;
            objArr[i10 - 1] = ((Map.Entry) objArr[i10 - 1]).getValue();
        } else {
            if (i10 > 0) {
                I();
                return;
            }
            throw new j("Expected a value but was " + f() + " at path " + S());
        }
    }

    @Override // com.squareup.moshi.m
    @fj.h
    public <T> T c() throws IOException {
        N(Void.class, m.c.NULL);
        I();
        return null;
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public void close() throws IOException {
        Arrays.fill(this.f267242h, 0, this.f267171a, (Object) null);
        this.f267242h[0] = f267241i;
        this.f267172b[0] = 8;
        this.f267171a = 1;
    }

    @Override // com.squareup.moshi.m
    public okio.n d() throws IOException {
        Object objL = l();
        okio.l lVar = new okio.l();
        t tVarR = t.r(lVar);
        try {
            tVarR.m(objL);
            tVarR.close();
            return lVar;
        } catch (Throwable th2) {
            if (tVarR != null) {
                try {
                    tVarR.close();
                } catch (Throwable th3) {
                    th2.addSuppressed(th3);
                }
            }
            throw th2;
        }
    }

    @Override // com.squareup.moshi.m
    public m.c f() throws IOException {
        int i10 = this.f267171a;
        if (i10 == 0) {
            return m.c.END_DOCUMENT;
        }
        Object obj = this.f267242h[i10 - 1];
        if (obj instanceof a) {
            return ((a) obj).f267243a;
        }
        if (obj instanceof List) {
            return m.c.BEGIN_ARRAY;
        }
        if (obj instanceof Map) {
            return m.c.BEGIN_OBJECT;
        }
        if (obj instanceof Map.Entry) {
            return m.c.NAME;
        }
        if (obj instanceof String) {
            return m.c.STRING;
        }
        if (obj instanceof Boolean) {
            return m.c.BOOLEAN;
        }
        if (obj instanceof Number) {
            return m.c.NUMBER;
        }
        if (obj == null) {
            return m.c.NULL;
        }
        if (obj == f267241i) {
            throw new IllegalStateException("JsonReader is closed");
        }
        throw E(obj, "a JSON value");
    }

    @Override // com.squareup.moshi.m
    public m g() {
        return new q(this);
    }

    @Override // com.squareup.moshi.m
    public void h() throws IOException {
        if (hasNext()) {
            H(na());
        }
    }

    @Override // com.squareup.moshi.m
    public boolean hasNext() throws IOException {
        int i10 = this.f267171a;
        if (i10 == 0) {
            return false;
        }
        Object obj = this.f267242h[i10 - 1];
        return !(obj instanceof Iterator) || ((Iterator) obj).hasNext();
    }

    @Override // com.squareup.moshi.m
    public String jc() throws IOException {
        int i10 = this.f267171a;
        Object obj = i10 != 0 ? this.f267242h[i10 - 1] : null;
        if (obj instanceof String) {
            I();
            return (String) obj;
        }
        if (obj instanceof Number) {
            I();
            return obj.toString();
        }
        if (obj == f267241i) {
            throw new IllegalStateException("JsonReader is closed");
        }
        throw E(obj, m.c.STRING);
    }

    @Override // com.squareup.moshi.m
    public int m(m.b bVar) throws IOException {
        Map.Entry<?, ?> entry = (Map.Entry) N(Map.Entry.class, m.c.NAME);
        String strR = R(entry);
        int length = bVar.f267179a.length;
        for (int i10 = 0; i10 < length; i10++) {
            if (bVar.f267179a[i10].equals(strR)) {
                this.f267242h[this.f267171a - 1] = entry.getValue();
                this.f267173c[this.f267171a - 2] = strR;
                return i10;
            }
        }
        return -1;
    }

    @Override // com.squareup.moshi.m
    public void m1() throws IOException {
        Map map = (Map) N(Map.class, m.c.BEGIN_OBJECT);
        a aVar = new a(m.c.END_OBJECT, map.entrySet().toArray(new Object[map.size()]), 0);
        Object[] objArr = this.f267242h;
        int i10 = this.f267171a;
        objArr[i10 - 1] = aVar;
        this.f267172b[i10 - 1] = 3;
        if (aVar.hasNext()) {
            H(aVar.next());
        }
    }

    @Override // com.squareup.moshi.m
    public String na() throws IOException {
        Map.Entry<?, ?> entry = (Map.Entry) N(Map.Entry.class, m.c.NAME);
        String strR = R(entry);
        this.f267242h[this.f267171a - 1] = entry.getValue();
        this.f267173c[this.f267171a - 2] = strR;
        return strR;
    }

    @Override // com.squareup.moshi.m
    public boolean nextBoolean() throws IOException {
        Boolean bool = (Boolean) N(Boolean.class, m.c.BOOLEAN);
        I();
        return bool.booleanValue();
    }

    @Override // com.squareup.moshi.m
    public double nextDouble() throws IOException {
        double dDoubleValue;
        m.c cVar = m.c.NUMBER;
        Object objN = N(Object.class, cVar);
        if (objN instanceof Number) {
            dDoubleValue = ((Number) objN).doubleValue();
        } else {
            if (!(objN instanceof String)) {
                throw E(objN, cVar);
            }
            try {
                dDoubleValue = Double.parseDouble((String) objN);
            } catch (NumberFormatException unused) {
                throw E(objN, m.c.NUMBER);
            }
        }
        if (this.f267175e || !(Double.isNaN(dDoubleValue) || Double.isInfinite(dDoubleValue))) {
            I();
            return dDoubleValue;
        }
        throw new k("JSON forbids NaN and infinities: " + dDoubleValue + " at path " + S());
    }

    @Override // com.squareup.moshi.m
    public int nextInt() throws IOException {
        int iIntValueExact;
        m.c cVar = m.c.NUMBER;
        Object objN = N(Object.class, cVar);
        if (objN instanceof Number) {
            iIntValueExact = ((Number) objN).intValue();
        } else {
            if (!(objN instanceof String)) {
                throw E(objN, cVar);
            }
            try {
                try {
                    iIntValueExact = Integer.parseInt((String) objN);
                } catch (NumberFormatException unused) {
                    iIntValueExact = new BigDecimal((String) objN).intValueExact();
                }
            } catch (NumberFormatException unused2) {
                throw E(objN, m.c.NUMBER);
            }
        }
        I();
        return iIntValueExact;
    }

    @Override // com.squareup.moshi.m
    public long nextLong() throws IOException {
        long jLongValueExact;
        m.c cVar = m.c.NUMBER;
        Object objN = N(Object.class, cVar);
        if (objN instanceof Number) {
            jLongValueExact = ((Number) objN).longValue();
        } else {
            if (!(objN instanceof String)) {
                throw E(objN, cVar);
            }
            try {
                try {
                    jLongValueExact = Long.parseLong((String) objN);
                } catch (NumberFormatException unused) {
                    jLongValueExact = new BigDecimal((String) objN).longValueExact();
                }
            } catch (NumberFormatException unused2) {
                throw E(objN, m.c.NUMBER);
            }
        }
        I();
        return jLongValueExact;
    }

    @Override // com.squareup.moshi.m
    public int o(m.b bVar) throws IOException {
        int i10 = this.f267171a;
        Object obj = i10 != 0 ? this.f267242h[i10 - 1] : null;
        if (!(obj instanceof String)) {
            if (obj != f267241i) {
                return -1;
            }
            throw new IllegalStateException("JsonReader is closed");
        }
        String str = (String) obj;
        int length = bVar.f267179a.length;
        for (int i11 = 0; i11 < length; i11++) {
            if (bVar.f267179a[i11].equals(str)) {
                I();
                return i11;
            }
        }
        return -1;
    }

    @Override // com.squareup.moshi.m
    public void t() throws IOException {
        if (!this.f267176f) {
            this.f267242h[this.f267171a - 1] = ((Map.Entry) N(Map.Entry.class, m.c.NAME)).getValue();
            this.f267173c[this.f267171a - 2] = AbstractJsonLexerKt.NULL;
            return;
        }
        m.c cVarF = f();
        na();
        throw new j("Cannot skip unexpected " + cVarF + " at " + S());
    }

    q(q qVar) {
        super(qVar);
        this.f267242h = (Object[]) qVar.f267242h.clone();
        for (int i10 = 0; i10 < this.f267171a; i10++) {
            Object[] objArr = this.f267242h;
            Object obj = objArr[i10];
            if (obj instanceof a) {
                objArr[i10] = ((a) obj).clone();
            }
        }
    }
}
