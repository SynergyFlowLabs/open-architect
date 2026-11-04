package io.sentry.vendor.gson.stream;

import com.facebook.internal.z0;
import java.io.Closeable;
import java.io.Flushable;
import java.io.IOException;
import java.io.Writer;
import java.util.Arrays;
import kotlinx.serialization.json.internal.AbstractJsonLexerKt;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes11.dex */
@lm.a.c
public class d implements Closeable, Flushable {

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private static final String[] f307085j = new String[128];

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private static final String[] f307086k;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final Writer f307087a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private int[] f307088b = new int[32];

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private int f307089c = 0;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private String f307090d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private String f307091e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private boolean f307092f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private boolean f307093g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private String f307094h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private boolean f307095i;

    static {
        for (int i10 = 0; i10 <= 31; i10++) {
            f307085j[i10] = String.format("\\u%04x", Integer.valueOf(i10));
        }
        String[] strArr = f307085j;
        strArr[34] = "\\\"";
        strArr[92] = "\\\\";
        strArr[9] = "\\t";
        strArr[8] = "\\b";
        strArr[10] = "\\n";
        strArr[13] = "\\r";
        strArr[12] = "\\f";
        String[] strArr2 = (String[]) strArr.clone();
        f307086k = strArr2;
        strArr2[60] = "\\u003c";
        strArr2[62] = "\\u003e";
        strArr2[38] = "\\u0026";
        strArr2[61] = "\\u003d";
        strArr2[39] = "\\u0027";
    }

    public d(Writer writer) {
        E(6);
        this.f307091e = ":";
        this.f307095i = true;
        if (writer == null) {
            throw new NullPointerException("out == null");
        }
        this.f307087a = writer;
    }

    private void E(int i10) {
        int i11 = this.f307089c;
        int[] iArr = this.f307088b;
        if (i11 == iArr.length) {
            this.f307088b = Arrays.copyOf(iArr, i11 * 2);
        }
        int[] iArr2 = this.f307088b;
        int i12 = this.f307089c;
        this.f307089c = i12 + 1;
        iArr2[i12] = i10;
    }

    private void H(int i10) {
        this.f307088b[this.f307089c - 1] = i10;
    }

    /* JADX WARN: Code duplicated, block: B:21:0x003a  */
    private void T(String str) throws IOException {
        String str2;
        String[] strArr = this.f307093g ? f307086k : f307085j;
        this.f307087a.write(34);
        int length = str.length();
        int i10 = 0;
        for (int i11 = 0; i11 < length; i11++) {
            char cCharAt = str.charAt(i11);
            if (cCharAt < 128) {
                str2 = strArr[cCharAt];
                if (str2 != null) {
                    if (i10 < i11) {
                        this.f307087a.write(str, i10, i11 - i10);
                    }
                    this.f307087a.write(str2);
                    i10 = i11 + 1;
                }
            } else {
                if (cCharAt == 8232) {
                    str2 = "\\u2028";
                } else if (cCharAt == 8233) {
                    str2 = "\\u2029";
                }
                if (i10 < i11) {
                    this.f307087a.write(str, i10, i11 - i10);
                }
                this.f307087a.write(str2);
                i10 = i11 + 1;
            }
        }
        if (i10 < length) {
            this.f307087a.write(str, i10, length - i10);
        }
        this.f307087a.write(34);
    }

    private void a() throws IOException {
        int iY = y();
        if (iY == 5) {
            this.f307087a.write(44);
        } else if (iY != 3) {
            throw new IllegalStateException("Nesting problem.");
        }
        r();
        H(4);
    }

    private void b() throws IOException {
        int iY = y();
        if (iY == 1) {
            H(2);
            r();
            return;
        }
        if (iY == 2) {
            this.f307087a.append(AbstractJsonLexerKt.COMMA);
            r();
        } else {
            if (iY == 4) {
                this.f307087a.append((CharSequence) this.f307091e);
                H(5);
                return;
            }
            if (iY != 6) {
                if (iY != 7) {
                    throw new IllegalStateException("Nesting problem.");
                }
                if (!this.f307092f) {
                    throw new IllegalStateException("JSON must have only one top-level value.");
                }
            }
            H(7);
        }
    }

    private d e(int i10, int i11, char c10) throws IOException {
        int iY = y();
        if (iY != i11 && iY != i10) {
            throw new IllegalStateException("Nesting problem.");
        }
        if (this.f307094h != null) {
            throw new IllegalStateException("Dangling name: " + this.f307094h);
        }
        this.f307089c--;
        if (iY == i11) {
            r();
        }
        this.f307087a.write(c10);
        return this;
    }

    private void k0() throws IOException {
        if (this.f307094h != null) {
            a();
            T(this.f307094h);
            this.f307094h = null;
        }
    }

    private void r() throws IOException {
        if (this.f307090d == null) {
            return;
        }
        this.f307087a.write(10);
        int i10 = this.f307089c;
        for (int i11 = 1; i11 < i10; i11++) {
            this.f307087a.write(this.f307090d);
        }
    }

    private d x(int i10, char c10) throws IOException {
        b();
        E(i10);
        this.f307087a.write(c10);
        return this;
    }

    private int y() {
        int i10 = this.f307089c;
        if (i10 != 0) {
            return this.f307088b[i10 - 1];
        }
        throw new IllegalStateException("JsonWriter is closed.");
    }

    public final void C1(boolean z10) {
        this.f307092f = z10;
    }

    public final void I(boolean z10) {
        this.f307093g = z10;
    }

    public final void N(@Nullable String str) {
        if (str == null || str.length() == 0) {
            this.f307090d = null;
            this.f307091e = ":";
        } else {
            this.f307090d = str;
            this.f307091e = ": ";
        }
    }

    public final void R(boolean z10) {
        this.f307095i = z10;
    }

    public d X(double d10) throws IOException {
        k0();
        if (!this.f307092f && (Double.isNaN(d10) || Double.isInfinite(d10))) {
            throw new IllegalArgumentException("Numeric values must be finite, but was " + d10);
        }
        b();
        this.f307087a.append((CharSequence) Double.toString(d10));
        return this;
    }

    public d Y(long j10) throws IOException {
        k0();
        b();
        this.f307087a.write(Long.toString(j10));
        return this;
    }

    public d c() throws IOException {
        k0();
        return x(1, AbstractJsonLexerKt.BEGIN_LIST);
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public void close() throws IOException {
        this.f307087a.close();
        int i10 = this.f307089c;
        if (i10 > 1 || (i10 == 1 && this.f307088b[i10 - 1] != 7)) {
            throw new IOException("Incomplete document");
        }
        this.f307089c = 0;
    }

    public d d() throws IOException {
        k0();
        return x(3, AbstractJsonLexerKt.BEGIN_OBJ);
    }

    public d d0(@Nullable Boolean bool) throws IOException {
        if (bool == null) {
            return t();
        }
        k0();
        b();
        this.f307087a.write(bool.booleanValue() ? z0.P : "false");
        return this;
    }

    public d f() throws IOException {
        return e(1, 2, AbstractJsonLexerKt.END_LIST);
    }

    public d f0(@Nullable Number number) throws IOException {
        if (number == null) {
            return t();
        }
        k0();
        String string = number.toString();
        if (this.f307092f || !(string.equals("-Infinity") || string.equals("Infinity") || string.equals("NaN"))) {
            b();
            this.f307087a.append((CharSequence) string);
            return this;
        }
        throw new IllegalArgumentException("Numeric values must be finite, but was " + number);
    }

    @Override // java.io.Flushable
    public void flush() throws IOException {
        if (this.f307089c == 0) {
            throw new IllegalStateException("JsonWriter is closed.");
        }
        this.f307087a.flush();
    }

    public d g() throws IOException {
        return e(3, 5, AbstractJsonLexerKt.END_OBJ);
    }

    public d g0(@Nullable String str) throws IOException {
        if (str == null) {
            return t();
        }
        k0();
        b();
        T(str);
        return this;
    }

    @Nullable
    public String h() {
        return this.f307090d;
    }

    public final boolean j() {
        return this.f307095i;
    }

    public d j0(boolean z10) throws IOException {
        k0();
        b();
        this.f307087a.write(z10 ? z0.P : "false");
        return this;
    }

    public final boolean l() {
        return this.f307093g;
    }

    public boolean m() {
        return this.f307092f;
    }

    public d o(@Nullable String str) throws IOException {
        if (str == null) {
            return t();
        }
        k0();
        b();
        this.f307087a.append((CharSequence) str);
        return this;
    }

    public d q(String str) throws IOException {
        if (str == null) {
            throw new NullPointerException("name == null");
        }
        if (this.f307094h != null) {
            throw new IllegalStateException();
        }
        if (this.f307089c == 0) {
            throw new IllegalStateException("JsonWriter is closed.");
        }
        this.f307094h = str;
        return this;
    }

    public d t() throws IOException {
        if (this.f307094h != null) {
            if (!this.f307095i) {
                this.f307094h = null;
                return this;
            }
            k0();
        }
        b();
        this.f307087a.write(AbstractJsonLexerKt.NULL);
        return this;
    }
}
