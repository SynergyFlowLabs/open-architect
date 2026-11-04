package com.squareup.moshi;

import java.io.IOException;
import kotlinx.serialization.json.internal.AbstractJsonLexerKt;
import okio.e1;
import okio.l0;
import okio.z0;

/* JADX INFO: loaded from: classes13.dex */
final class p extends t {

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private static final String[] f267236n = new String[128];

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private final okio.m f267237k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private String f267238l = ":";

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private String f267239m;

    class a implements z0 {
        a() {
        }

        @Override // okio.z0
        public void Ga(okio.l lVar, long j10) throws IOException {
            p.this.f267237k.Ga(lVar, j10);
        }

        @Override // okio.z0, java.io.Closeable, java.lang.AutoCloseable
        public void close() {
            if (p.this.t() != 9) {
                throw new AssertionError();
            }
            p pVar = p.this;
            int i10 = pVar.f267263a;
            pVar.f267263a = i10 - 1;
            int[] iArr = pVar.f267266d;
            int i11 = i10 - 2;
            iArr[i11] = iArr[i11] + 1;
        }

        @Override // okio.z0, java.io.Flushable
        public void flush() throws IOException {
            p.this.f267237k.flush();
        }

        @Override // okio.z0
        public e1 timeout() {
            return e1.f334887f;
        }
    }

    static {
        for (int i10 = 0; i10 <= 31; i10++) {
            f267236n[i10] = String.format("\\u%04x", Integer.valueOf(i10));
        }
        String[] strArr = f267236n;
        strArr[34] = "\\\"";
        strArr[92] = "\\\\";
        strArr[9] = "\\t";
        strArr[8] = "\\b";
        strArr[10] = "\\n";
        strArr[13] = "\\r";
        strArr[12] = "\\f";
    }

    p(okio.m mVar) {
        if (mVar == null) {
            throw new NullPointerException("sink == null");
        }
        this.f267237k = mVar;
        int i10 = 4 & 6;
        y(6);
    }

    private t B0(int i10, int i11, char c10) throws IOException {
        int i12 = this.f267263a;
        int i13 = this.f267271i;
        if (i12 == i13) {
            int[] iArr = this.f267264b;
            if (iArr[i12 - 1] == i10 || iArr[i12 - 1] == i11) {
                this.f267271i = ~i13;
                return this;
            }
        }
        w0();
        d();
        y(i10);
        this.f267266d[this.f267263a - 1] = 0;
        this.f267237k.writeByte(c10);
        return this;
    }

    /* JADX WARN: Code duplicated, block: B:16:0x0035  */
    static void H0(okio.m mVar, String str) throws IOException {
        String str2;
        String[] strArr = f267236n;
        mVar.writeByte(34);
        int length = str.length();
        int i10 = 0;
        for (int i11 = 0; i11 < length; i11++) {
            char cCharAt = str.charAt(i11);
            if (cCharAt < 128) {
                str2 = strArr[cCharAt];
                if (str2 != null) {
                    if (i10 < i11) {
                        mVar.K3(str, i10, i11);
                    }
                    mVar.pa(str2);
                    i10 = i11 + 1;
                }
            } else {
                if (cCharAt == 8232) {
                    str2 = "\\u2028";
                } else if (cCharAt == 8233) {
                    str2 = "\\u2029";
                }
                if (i10 < i11) {
                    mVar.K3(str, i10, i11);
                }
                mVar.pa(str2);
                i10 = i11 + 1;
            }
        }
        if (i10 < length) {
            mVar.K3(str, i10, length);
        }
        mVar.writeByte(34);
    }

    private void M0() throws IOException {
        if (this.f267239m != null) {
            r0();
            H0(this.f267237k, this.f267239m);
            this.f267239m = null;
        }
    }

    private void r0() throws IOException {
        int iT = t();
        if (iT == 5) {
            this.f267237k.writeByte(44);
        } else if (iT != 3) {
            throw new IllegalStateException("Nesting problem.");
        }
        y0();
        E(4);
    }

    private void w0() throws IOException {
        int iT = t();
        int i10 = 2;
        int i11 = 6 >> 2;
        if (iT == 1) {
            y0();
        } else if (iT == 2) {
            this.f267237k.writeByte(44);
            y0();
        } else if (iT == 4) {
            this.f267237k.pa(this.f267238l);
            i10 = 5;
            int i12 = 6 << 5;
        } else {
            if (iT == 9) {
                throw new IllegalStateException("Sink from valueSink() was not closed");
            }
            i10 = 7;
            if (iT != 6) {
                if (iT != 7) {
                    throw new IllegalStateException("Nesting problem.");
                }
                if (!this.f267268f) {
                    throw new IllegalStateException("JSON must have only one top-level value.");
                }
            }
        }
        E(i10);
    }

    private t x0(int i10, int i11, char c10) throws IOException {
        int iT = t();
        if (iT != i11 && iT != i10) {
            throw new IllegalStateException("Nesting problem.");
        }
        if (this.f267239m != null) {
            throw new IllegalStateException("Dangling name: " + this.f267239m);
        }
        int i12 = this.f267263a;
        int i13 = this.f267271i;
        if (i12 == (~i13)) {
            this.f267271i = ~i13;
            return this;
        }
        int i14 = i12 - 1;
        this.f267263a = i14;
        this.f267265c[i14] = null;
        int[] iArr = this.f267266d;
        int i15 = i12 - 2;
        iArr[i15] = iArr[i15] + 1;
        if (iT == i11) {
            y0();
        }
        this.f267237k.writeByte(c10);
        return this;
    }

    private void y0() throws IOException {
        if (this.f267267e == null) {
            return;
        }
        this.f267237k.writeByte(10);
        int i10 = this.f267263a;
        for (int i11 = 1; i11 < i10; i11++) {
            this.f267237k.pa(this.f267267e);
        }
    }

    @Override // com.squareup.moshi.t
    public void H(String str) {
        super.H(str);
        this.f267238l = !str.isEmpty() ? ": " : ":";
    }

    @Override // com.squareup.moshi.t
    public t T(double d10) throws IOException {
        if (!this.f267268f && (Double.isNaN(d10) || Double.isInfinite(d10))) {
            throw new IllegalArgumentException("Numeric values must be finite, but was " + d10);
        }
        if (this.f267270h) {
            this.f267270h = false;
            return o(Double.toString(d10));
        }
        M0();
        w0();
        this.f267237k.pa(Double.toString(d10));
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
        M0();
        w0();
        this.f267237k.pa(Long.toString(j10));
        int[] iArr = this.f267266d;
        int i10 = this.f267263a - 1;
        iArr[i10] = iArr[i10] + 1;
        return this;
    }

    @Override // com.squareup.moshi.t
    public t Y(Boolean bool) throws IOException {
        return bool == null ? q() : j0(bool.booleanValue());
    }

    @Override // com.squareup.moshi.t
    public t a() throws IOException {
        if (!this.f267270h) {
            M0();
            return B0(1, 2, AbstractJsonLexerKt.BEGIN_LIST);
        }
        throw new IllegalStateException("Array cannot be used as a map key in JSON at path " + S());
    }

    @Override // com.squareup.moshi.t
    public t c() throws IOException {
        if (!this.f267270h) {
            M0();
            return B0(3, 5, AbstractJsonLexerKt.BEGIN_OBJ);
        }
        throw new IllegalStateException("Object cannot be used as a map key in JSON at path " + S());
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public void close() throws IOException {
        this.f267237k.close();
        int i10 = this.f267263a;
        if (i10 > 1 || (i10 == 1 && this.f267264b[i10 - 1] != 7)) {
            throw new IOException("Incomplete document");
        }
        this.f267263a = 0;
    }

    @Override // com.squareup.moshi.t
    public t d0(@fj.h Number number) throws IOException {
        if (number == null) {
            return q();
        }
        String string = number.toString();
        if (!this.f267268f && (string.equals("-Infinity") || string.equals("Infinity") || string.equals("NaN"))) {
            throw new IllegalArgumentException("Numeric values must be finite, but was " + number);
        }
        if (this.f267270h) {
            this.f267270h = false;
            return o(string);
        }
        M0();
        w0();
        this.f267237k.pa(string);
        int[] iArr = this.f267266d;
        int i10 = this.f267263a - 1;
        iArr[i10] = iArr[i10] + 1;
        return this;
    }

    @Override // com.squareup.moshi.t
    public t e() throws IOException {
        return x0(1, 2, AbstractJsonLexerKt.END_LIST);
    }

    @Override // com.squareup.moshi.t
    public t f0(String str) throws IOException {
        if (str == null) {
            return q();
        }
        if (this.f267270h) {
            this.f267270h = false;
            return o(str);
        }
        M0();
        w0();
        H0(this.f267237k, str);
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
        this.f267237k.flush();
    }

    @Override // com.squareup.moshi.t
    public t g() throws IOException {
        this.f267270h = false;
        return x0(3, 5, AbstractJsonLexerKt.END_OBJ);
    }

    @Override // com.squareup.moshi.t
    public t j0(boolean z10) throws IOException {
        if (this.f267270h) {
            throw new IllegalStateException("Boolean cannot be used as a map key in JSON at path " + S());
        }
        M0();
        w0();
        this.f267237k.pa(z10 ? com.facebook.internal.z0.P : "false");
        int[] iArr = this.f267266d;
        int i10 = this.f267263a - 1;
        iArr[i10] = iArr[i10] + 1;
        return this;
    }

    @Override // com.squareup.moshi.t
    public okio.m k0() throws IOException {
        if (this.f267270h) {
            throw new IllegalStateException("BufferedSink cannot be used as a map key in JSON at path " + S());
        }
        M0();
        w0();
        y(9);
        return l0.d(new a());
    }

    @Override // com.squareup.moshi.t
    public t o(String str) throws IOException {
        if (str == null) {
            throw new NullPointerException("name == null");
        }
        if (this.f267263a == 0) {
            throw new IllegalStateException("JsonWriter is closed.");
        }
        int iT = t();
        if ((iT != 3 && iT != 5) || this.f267239m != null || this.f267270h) {
            throw new IllegalStateException("Nesting problem.");
        }
        this.f267239m = str;
        this.f267265c[this.f267263a - 1] = str;
        return this;
    }

    @Override // com.squareup.moshi.t
    public t q() throws IOException {
        if (this.f267270h) {
            throw new IllegalStateException("null cannot be used as a map key in JSON at path " + S());
        }
        if (this.f267239m != null) {
            if (!this.f267269g) {
                this.f267239m = null;
                return this;
            }
            M0();
        }
        w0();
        this.f267237k.pa(AbstractJsonLexerKt.NULL);
        int[] iArr = this.f267266d;
        int i10 = this.f267263a - 1;
        iArr[i10] = iArr[i10] + 1;
        return this;
    }
}
