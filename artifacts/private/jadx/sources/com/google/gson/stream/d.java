package com.google.gson.stream;

import com.facebook.internal.z0;
import com.google.gson.y;
import java.io.Closeable;
import java.io.Flushable;
import java.io.IOException;
import java.io.Writer;
import java.math.BigDecimal;
import java.math.BigInteger;
import java.util.Arrays;
import java.util.Objects;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicLong;
import java.util.regex.Pattern;
import kotlinx.serialization.json.internal.AbstractJsonLexerKt;

/* JADX INFO: loaded from: classes5.dex */
public class d implements Closeable, Flushable {

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private static final Pattern f125619l = Pattern.compile("-?(?:0|[1-9][0-9]*)(?:\\.[0-9]+)?(?:[eE][-+]?[0-9]+)?");

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private static final String[] f125620m = new String[128];

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private static final String[] f125621n;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final Writer f125622a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private int[] f125623b = new int[32];

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private int f125624c = 0;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private com.google.gson.e f125625d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private String f125626e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private String f125627f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private boolean f125628g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private y f125629h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private boolean f125630i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private String f125631j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private boolean f125632k;

    static {
        int i10 = 3 << 0;
        for (int i11 = 0; i11 <= 31; i11++) {
            f125620m[i11] = String.format("\\u%04x", Integer.valueOf(i11));
        }
        String[] strArr = f125620m;
        strArr[34] = "\\\"";
        strArr[92] = "\\\\";
        strArr[9] = "\\t";
        strArr[8] = "\\b";
        strArr[10] = "\\n";
        strArr[13] = "\\r";
        strArr[12] = "\\f";
        String[] strArr2 = (String[]) strArr.clone();
        f125621n = strArr2;
        strArr2[60] = "\\u003c";
        strArr2[62] = "\\u003e";
        strArr2[38] = "\\u0026";
        strArr2[61] = "\\u003d";
        strArr2[39] = "\\u0027";
    }

    public d(Writer writer) {
        I(6);
        this.f125629h = y.LEGACY_STRICT;
        this.f125632k = true;
        Objects.requireNonNull(writer, "out == null");
        this.f125622a = writer;
        R(com.google.gson.e.f125260d);
    }

    @z7.a
    private d E(int i10, char c10) throws IOException {
        c();
        I(i10);
        this.f125622a.write(c10);
        return this;
    }

    private int H() {
        int i10 = this.f125624c;
        if (i10 != 0) {
            return this.f125623b[i10 - 1];
        }
        throw new IllegalStateException("JsonWriter is closed.");
    }

    private void I(int i10) {
        int i11 = this.f125624c;
        int[] iArr = this.f125623b;
        if (i11 == iArr.length) {
            this.f125623b = Arrays.copyOf(iArr, i11 * 2);
        }
        int[] iArr2 = this.f125623b;
        int i12 = this.f125624c;
        this.f125624c = i12 + 1;
        iArr2[i12] = i10;
    }

    private void N(int i10) {
        this.f125623b[this.f125624c - 1] = i10;
    }

    private static boolean a(Class<? extends Number> cls) {
        return cls == Integer.class || cls == Long.class || cls == Byte.class || cls == Short.class || cls == BigDecimal.class || cls == BigInteger.class || cls == AtomicInteger.class || cls == AtomicLong.class;
    }

    private void b() throws IOException {
        int iH = H();
        if (iH == 5) {
            this.f125622a.write(this.f125627f);
        } else if (iH != 3) {
            throw new IllegalStateException("Nesting problem.");
        }
        x();
        N(4);
    }

    private void c() throws IOException {
        int iH = H();
        if (iH == 1) {
            N(2);
            x();
            return;
        }
        if (iH == 2) {
            this.f125622a.append((CharSequence) this.f125627f);
            x();
        } else {
            if (iH == 4) {
                this.f125622a.append((CharSequence) this.f125626e);
                N(5);
                return;
            }
            if (iH != 6) {
                if (iH != 7) {
                    throw new IllegalStateException("Nesting problem.");
                }
                if (this.f125629h != y.LENIENT) {
                    throw new IllegalStateException("JSON must have only one top-level value.");
                }
            }
            N(7);
        }
    }

    @z7.a
    private d f(int i10, int i11, char c10) throws IOException {
        int iH = H();
        if (iH != i11 && iH != i10) {
            throw new IllegalStateException("Nesting problem.");
        }
        if (this.f125631j != null) {
            throw new IllegalStateException("Dangling name: " + this.f125631j);
        }
        this.f125624c--;
        if (iH == i11) {
            x();
        }
        this.f125622a.write(c10);
        return this;
    }

    /* JADX WARN: Code duplicated, block: B:20:0x003d  */
    private void f0(String str) throws IOException {
        String str2;
        String[] strArr = this.f125630i ? f125621n : f125620m;
        this.f125622a.write(34);
        int length = str.length();
        int i10 = 0;
        for (int i11 = 0; i11 < length; i11++) {
            char cCharAt = str.charAt(i11);
            if (cCharAt < 128) {
                str2 = strArr[cCharAt];
                if (str2 != null) {
                    if (i10 < i11) {
                        this.f125622a.write(str, i10, i11 - i10);
                    }
                    this.f125622a.write(str2);
                    i10 = i11 + 1;
                }
            } else {
                if (cCharAt == 8232) {
                    str2 = "\\u2028";
                } else if (cCharAt == 8233) {
                    str2 = "\\u2029";
                }
                if (i10 < i11) {
                    this.f125622a.write(str, i10, i11 - i10);
                }
                this.f125622a.write(str2);
                i10 = i11 + 1;
            }
        }
        if (i10 < length) {
            this.f125622a.write(str, i10, length - i10);
        }
        this.f125622a.write(34);
    }

    private void x() throws IOException {
        if (this.f125628g) {
            return;
        }
        this.f125622a.write(this.f125625d.b());
        int i10 = this.f125624c;
        for (int i11 = 1; i11 < i10; i11++) {
            this.f125622a.write(this.f125625d.a());
        }
    }

    private void y0() throws IOException {
        if (this.f125631j != null) {
            b();
            f0(this.f125631j);
            this.f125631j = null;
        }
    }

    @Deprecated
    public final void C1(boolean z10) {
        d0(z10 ? y.LENIENT : y.LEGACY_STRICT);
    }

    public final void R(com.google.gson.e eVar) {
        Objects.requireNonNull(eVar);
        this.f125625d = eVar;
        this.f125627f = ",";
        if (eVar.c()) {
            this.f125626e = ": ";
            if (this.f125625d.b().isEmpty()) {
                this.f125627f = ", ";
            }
        } else {
            this.f125626e = ":";
        }
        this.f125628g = this.f125625d.b().isEmpty() && this.f125625d.a().isEmpty();
    }

    public final void T(boolean z10) {
        this.f125630i = z10;
    }

    public final void X(String str) {
        if (str.isEmpty()) {
            R(com.google.gson.e.f125260d);
        } else {
            R(com.google.gson.e.f125261e.d(str));
        }
    }

    public final void Y(boolean z10) {
        this.f125632k = z10;
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public void close() throws IOException {
        this.f125622a.close();
        int i10 = this.f125624c;
        if (i10 > 1 || (i10 == 1 && this.f125623b[i10 - 1] != 7)) {
            throw new IOException("Incomplete document");
        }
        this.f125624c = 0;
    }

    @z7.a
    public d d() throws IOException {
        y0();
        return E(1, AbstractJsonLexerKt.BEGIN_LIST);
    }

    public final void d0(y yVar) {
        Objects.requireNonNull(yVar);
        this.f125629h = yVar;
    }

    @z7.a
    public d e() throws IOException {
        y0();
        return E(3, AbstractJsonLexerKt.BEGIN_OBJ);
    }

    public void flush() throws IOException {
        if (this.f125624c == 0) {
            throw new IllegalStateException("JsonWriter is closed.");
        }
        this.f125622a.flush();
    }

    @z7.a
    public d g() throws IOException {
        return f(1, 2, AbstractJsonLexerKt.END_LIST);
    }

    @z7.a
    public d g0(double d10) throws IOException {
        y0();
        if (this.f125629h == y.LENIENT || !(Double.isNaN(d10) || Double.isInfinite(d10))) {
            c();
            this.f125622a.append((CharSequence) Double.toString(d10));
            return this;
        }
        throw new IllegalArgumentException("Numeric values must be finite, but was " + d10);
    }

    @z7.a
    public d h() throws IOException {
        return f(3, 5, AbstractJsonLexerKt.END_OBJ);
    }

    public final com.google.gson.e j() {
        return this.f125625d;
    }

    @z7.a
    public d j0(float f10) throws IOException {
        y0();
        if (this.f125629h == y.LENIENT || !(Float.isNaN(f10) || Float.isInfinite(f10))) {
            c();
            this.f125622a.append((CharSequence) Float.toString(f10));
            return this;
        }
        throw new IllegalArgumentException("Numeric values must be finite, but was " + f10);
    }

    @z7.a
    public d k0(long j10) throws IOException {
        y0();
        c();
        this.f125622a.write(Long.toString(j10));
        return this;
    }

    public final boolean l() {
        return this.f125632k;
    }

    public final y m() {
        return this.f125629h;
    }

    public final boolean o() {
        return this.f125630i;
    }

    @z7.a
    public d o0(Boolean bool) throws IOException {
        if (bool == null) {
            return y();
        }
        y0();
        c();
        this.f125622a.write(bool.booleanValue() ? z0.P : "false");
        return this;
    }

    public boolean q() {
        return this.f125629h == y.LENIENT;
    }

    @z7.a
    public d r(String str) throws IOException {
        if (str == null) {
            return y();
        }
        y0();
        c();
        this.f125622a.append((CharSequence) str);
        return this;
    }

    @z7.a
    public d r0(Number number) throws IOException {
        if (number == null) {
            return y();
        }
        y0();
        String string = number.toString();
        Class<?> cls = number.getClass();
        if (!a(cls)) {
            if (string.equals("-Infinity") || string.equals("Infinity") || string.equals("NaN")) {
                if (this.f125629h != y.LENIENT) {
                    throw new IllegalArgumentException("Numeric values must be finite, but was " + string);
                }
            } else if (cls != Float.class && cls != Double.class && !f125619l.matcher(string).matches()) {
                throw new IllegalArgumentException("String created by " + cls + " is not a valid JSON number: " + string);
            }
        }
        c();
        this.f125622a.append((CharSequence) string);
        return this;
    }

    @z7.a
    public d t(String str) throws IOException {
        Objects.requireNonNull(str, "name == null");
        if (this.f125631j != null) {
            throw new IllegalStateException("Already wrote a name, expecting a value.");
        }
        int iH = H();
        if (iH != 3 && iH != 5) {
            throw new IllegalStateException("Please begin an object before writing a name.");
        }
        this.f125631j = str;
        return this;
    }

    @z7.a
    public d w0(String str) throws IOException {
        if (str == null) {
            return y();
        }
        y0();
        c();
        f0(str);
        return this;
    }

    @z7.a
    public d x0(boolean z10) throws IOException {
        y0();
        c();
        this.f125622a.write(z10 ? z0.P : "false");
        return this;
    }

    @z7.a
    public d y() throws IOException {
        if (this.f125631j != null) {
            if (!this.f125632k) {
                this.f125631j = null;
                return this;
            }
            y0();
        }
        c();
        this.f125622a.write(AbstractJsonLexerKt.NULL);
        return this;
    }
}
