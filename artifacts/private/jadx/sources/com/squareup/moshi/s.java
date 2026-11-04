package com.squareup.moshi;

import java.io.IOException;
import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import okio.l0;
import okio.z0;

/* JADX INFO: loaded from: classes13.dex */
final class s extends t {

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    Object[] f267259k = new Object[32];

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    @fj.h
    private String f267260l;

    class a extends okio.x {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ okio.l f267261b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        a(z0 z0Var, okio.l lVar) {
            super(z0Var);
            this.f267261b = lVar;
        }

        @Override // okio.x, okio.z0, java.io.Closeable, java.lang.AutoCloseable
        public void close() throws IOException {
            if (s.this.t() == 9) {
                s sVar = s.this;
                Object[] objArr = sVar.f267259k;
                int i10 = sVar.f267263a;
                if (objArr[i10] == null) {
                    sVar.f267263a = i10 - 1;
                    Object objL = m.e(this.f267261b).l();
                    s sVar2 = s.this;
                    boolean z10 = sVar2.f267269g;
                    sVar2.f267269g = true;
                    try {
                        sVar2.r0(objL);
                        s sVar3 = s.this;
                        sVar3.f267269g = z10;
                        int[] iArr = sVar3.f267266d;
                        int i11 = sVar3.f267263a - 1;
                        iArr[i11] = iArr[i11] + 1;
                        return;
                    } catch (Throwable th2) {
                        s.this.f267269g = z10;
                        throw th2;
                    }
                }
            }
            throw new AssertionError();
        }
    }

    s() {
        y(6);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public s r0(@fj.h Object obj) {
        String str;
        Object objPut;
        int iT = t();
        int i10 = this.f267263a;
        int i11 = 2 | 1;
        if (i10 == 1) {
            int i12 = i11 << 6;
            if (iT != 6) {
                throw new IllegalStateException("JSON must have only one top-level value.");
            }
            this.f267264b[i10 - 1] = 7;
            this.f267259k[i10 - 1] = obj;
            return this;
        }
        if (iT != 3 || (str = this.f267260l) == null) {
            if (iT == 1) {
                ((List) this.f267259k[i10 - 1]).add(obj);
                return this;
            }
            if (iT == 9) {
                throw new IllegalStateException("Sink from valueSink() was not closed");
            }
            throw new IllegalStateException("Nesting problem.");
        }
        if ((obj == null && !this.f267269g) || (objPut = ((Map) this.f267259k[i10 - 1]).put(str, obj)) == null) {
            this.f267260l = null;
            return this;
        }
        throw new IllegalArgumentException("Map key '" + this.f267260l + "' has multiple values at path " + S() + ": " + objPut + " and " + obj);
    }

    @Override // com.squareup.moshi.t
    public t T(double d10) throws IOException {
        if (!this.f267268f && (Double.isNaN(d10) || d10 == Double.NEGATIVE_INFINITY || d10 == Double.POSITIVE_INFINITY)) {
            throw new IllegalArgumentException("Numeric values must be finite, but was " + d10);
        }
        if (this.f267270h) {
            this.f267270h = false;
            return o(Double.toString(d10));
        }
        r0(Double.valueOf(d10));
        int[] iArr = this.f267266d;
        int i10 = this.f267263a - 1;
        iArr[i10] = iArr[i10] + 1;
        return this;
    }

    @Override // com.squareup.moshi.t
    public t X(long j10) throws IOException {
        if (this.f267270h) {
            this.f267270h = false;
            return o(Long.toString(j10));
        }
        r0(Long.valueOf(j10));
        int[] iArr = this.f267266d;
        int i10 = this.f267263a - 1;
        iArr[i10] = iArr[i10] + 1;
        return this;
    }

    @Override // com.squareup.moshi.t
    public t Y(@fj.h Boolean bool) throws IOException {
        if (this.f267270h) {
            throw new IllegalStateException("Boolean cannot be used as a map key in JSON at path " + S());
        }
        r0(bool);
        int[] iArr = this.f267266d;
        int i10 = this.f267263a - 1;
        iArr[i10] = iArr[i10] + 1;
        return this;
    }

    @Override // com.squareup.moshi.t
    public t a() throws IOException {
        if (this.f267270h) {
            throw new IllegalStateException("Array cannot be used as a map key in JSON at path " + S());
        }
        int i10 = this.f267263a;
        int i11 = this.f267271i;
        if (i10 == i11 && this.f267264b[i10 - 1] == 1) {
            this.f267271i = ~i11;
            return this;
        }
        d();
        ArrayList arrayList = new ArrayList();
        r0(arrayList);
        Object[] objArr = this.f267259k;
        int i12 = this.f267263a;
        objArr[i12] = arrayList;
        this.f267266d[i12] = 0;
        y(1);
        return this;
    }

    @Override // com.squareup.moshi.t
    public t c() throws IOException {
        if (this.f267270h) {
            throw new IllegalStateException("Object cannot be used as a map key in JSON at path " + S());
        }
        int i10 = this.f267263a;
        int i11 = this.f267271i;
        if (i10 == i11 && this.f267264b[i10 - 1] == 3) {
            this.f267271i = ~i11;
            return this;
        }
        d();
        u uVar = new u();
        r0(uVar);
        this.f267259k[this.f267263a] = uVar;
        y(3);
        return this;
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public void close() throws IOException {
        int i10 = this.f267263a;
        if (i10 > 1 || (i10 == 1 && this.f267264b[i10 - 1] != 7)) {
            throw new IOException("Incomplete document");
        }
        this.f267263a = 0;
    }

    @Override // com.squareup.moshi.t
    public t d0(@fj.h Number number) throws IOException {
        if ((number instanceof Byte) || (number instanceof Short) || (number instanceof Integer) || (number instanceof Long)) {
            return X(number.longValue());
        }
        if (!(number instanceof Float) && !(number instanceof Double)) {
            if (number == null) {
                return q();
            }
            BigDecimal bigDecimal = number instanceof BigDecimal ? (BigDecimal) number : new BigDecimal(number.toString());
            if (this.f267270h) {
                this.f267270h = false;
                return o(bigDecimal.toString());
            }
            r0(bigDecimal);
            int[] iArr = this.f267266d;
            int i10 = this.f267263a - 1;
            iArr[i10] = iArr[i10] + 1;
            return this;
        }
        return T(number.doubleValue());
    }

    @Override // com.squareup.moshi.t
    public t e() throws IOException {
        if (t() != 1) {
            throw new IllegalStateException("Nesting problem.");
        }
        int i10 = this.f267263a;
        int i11 = this.f267271i;
        if (i10 == (~i11)) {
            this.f267271i = ~i11;
            return this;
        }
        int i12 = i10 - 1;
        this.f267263a = i12;
        this.f267259k[i12] = null;
        int[] iArr = this.f267266d;
        int i13 = i10 - 2;
        iArr[i13] = iArr[i13] + 1;
        return this;
    }

    @Override // com.squareup.moshi.t
    public t f0(@fj.h String str) throws IOException {
        if (this.f267270h) {
            this.f267270h = false;
            return o(str);
        }
        r0(str);
        int[] iArr = this.f267266d;
        int i10 = this.f267263a - 1;
        iArr[i10] = iArr[i10] + 1;
        return this;
    }

    @Override // java.io.Flushable
    public void flush() throws IOException {
        if (this.f267263a == 0) {
            throw new IllegalStateException("JsonWriter is closed.");
        }
    }

    @Override // com.squareup.moshi.t
    public t g() throws IOException {
        if (t() != 3) {
            throw new IllegalStateException("Nesting problem.");
        }
        if (this.f267260l != null) {
            throw new IllegalStateException("Dangling name: " + this.f267260l);
        }
        int i10 = this.f267263a;
        int i11 = this.f267271i;
        if (i10 == (~i11)) {
            this.f267271i = ~i11;
            return this;
        }
        this.f267270h = false;
        int i12 = i10 - 1;
        this.f267263a = i12;
        this.f267259k[i12] = null;
        this.f267265c[i12] = null;
        int[] iArr = this.f267266d;
        int i13 = i10 - 2;
        iArr[i13] = iArr[i13] + 1;
        return this;
    }

    @Override // com.squareup.moshi.t
    public t j0(boolean z10) throws IOException {
        if (this.f267270h) {
            throw new IllegalStateException("Boolean cannot be used as a map key in JSON at path " + S());
        }
        r0(Boolean.valueOf(z10));
        int[] iArr = this.f267266d;
        int i10 = this.f267263a - 1;
        iArr[i10] = iArr[i10] + 1;
        return this;
    }

    @Override // com.squareup.moshi.t
    public okio.m k0() {
        if (this.f267270h) {
            throw new IllegalStateException("BufferedSink cannot be used as a map key in JSON at path " + S());
        }
        if (t() == 9) {
            throw new IllegalStateException("Sink from valueSink() was not closed");
        }
        y(9);
        okio.l lVar = new okio.l();
        return l0.d(new a(lVar, lVar));
    }

    @Override // com.squareup.moshi.t
    public t o(String str) throws IOException {
        if (str == null) {
            throw new NullPointerException("name == null");
        }
        if (this.f267263a == 0) {
            throw new IllegalStateException("JsonWriter is closed.");
        }
        if (t() != 3 || this.f267260l != null || this.f267270h) {
            throw new IllegalStateException("Nesting problem.");
        }
        this.f267260l = str;
        this.f267265c[this.f267263a - 1] = str;
        return this;
    }

    @Override // com.squareup.moshi.t
    public t q() throws IOException {
        if (this.f267270h) {
            throw new IllegalStateException("null cannot be used as a map key in JSON at path " + S());
        }
        r0(null);
        int[] iArr = this.f267266d;
        int i10 = this.f267263a - 1;
        iArr[i10] = iArr[i10] + 1;
        return this;
    }

    public Object w0() {
        int i10 = this.f267263a;
        if (i10 > 1 || (i10 == 1 && this.f267264b[i10 - 1] != 7)) {
            throw new IllegalStateException("Incomplete document");
        }
        return this.f267259k[0];
    }
}
