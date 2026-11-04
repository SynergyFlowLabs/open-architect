package org.apache.commons.lang3.text;

import java.io.IOException;
import java.io.Reader;
import java.io.Serializable;
import java.io.Writer;
import java.nio.CharBuffer;
import java.util.Iterator;
import java.util.List;
import java.util.Objects;
import kotlinx.serialization.json.internal.AbstractJsonLexerKt;

/* JADX INFO: loaded from: classes14.dex */
@Deprecated
public class e implements CharSequence, Appendable, Serializable, org.apache.commons.lang3.builder.a<String> {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    static final int f337288e = 32;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private static final long f337289f = 7628716375283629643L;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    protected char[] f337290a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    protected int f337291b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private String f337292c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private String f337293d;

    class b extends i {
        b() {
        }

        @Override // org.apache.commons.lang3.text.i
        protected List<String> Y(char[] cArr, int i10, int i11) {
            if (cArr != null) {
                return super.Y(cArr, i10, i11);
            }
            e eVar = e.this;
            return super.Y(eVar.f337290a, 0, eVar.w1());
        }

        @Override // org.apache.commons.lang3.text.i
        public String j() {
            String strJ = super.j();
            return strJ == null ? e.this.toString() : strJ;
        }
    }

    class c extends Writer {
        c() {
        }

        @Override // java.io.Writer, java.io.Closeable, java.lang.AutoCloseable
        public void close() {
        }

        @Override // java.io.Writer, java.io.Flushable
        public void flush() {
        }

        @Override // java.io.Writer
        public void write(int i10) {
            e.this.append((char) i10);
        }

        @Override // java.io.Writer
        public void write(char[] cArr) {
            e.this.u(cArr);
        }

        @Override // java.io.Writer
        public void write(char[] cArr, int i10, int i11) {
            e.this.v(cArr, i10, i11);
        }

        @Override // java.io.Writer
        public void write(String str) {
            e.this.i(str);
        }

        @Override // java.io.Writer
        public void write(String str, int i10, int i11) {
            e.this.j(str, i10, i11);
        }
    }

    public e() {
        this(32);
    }

    private e o1(g gVar, String str, int i10, int i11, int i12) {
        e eVar;
        String str2;
        if (gVar != null && this.f337291b != 0) {
            int length = str == null ? 0 : str.length();
            int i13 = i10;
            while (i13 < i11 && i12 != 0) {
                int iG = gVar.g(this.f337290a, i13, i10, i11);
                if (iG > 0) {
                    eVar = this;
                    str2 = str;
                    eVar.p1(i13, i13 + iG, iG, str2, length);
                    i11 = (i11 - iG) + length;
                    i13 = (i13 + length) - 1;
                    if (i12 > 0) {
                        i12--;
                    }
                } else {
                    eVar = this;
                    str2 = str;
                }
                i13++;
                this = eVar;
                str = str2;
            }
        }
        return this;
    }

    private void p1(int i10, int i11, int i12, String str, int i13) {
        int i14 = (this.f337291b - i12) + i13;
        if (i13 != i12) {
            A0(i14);
            char[] cArr = this.f337290a;
            System.arraycopy(cArr, i11, cArr, i10 + i13, this.f337291b - i11);
            this.f337291b = i14;
        }
        if (i13 > 0) {
            str.getChars(0, i13, this.f337290a, i10);
        }
    }

    private void y0(int i10, int i11, int i12) {
        char[] cArr = this.f337290a;
        System.arraycopy(cArr, i11, cArr, i10, this.f337291b - i11);
        this.f337291b -= i12;
    }

    public e A(Object obj, int i10, char c10) {
        if (i10 > 0) {
            A0(this.f337291b + i10);
            String strF0 = obj == null ? F0() : obj.toString();
            if (strF0 == null) {
                strF0 = "";
            }
            int length = strF0.length();
            if (length >= i10) {
                strF0.getChars(length - i10, length, this.f337290a, this.f337291b);
            } else {
                int i11 = i10 - length;
                for (int i12 = 0; i12 < i11; i12++) {
                    this.f337290a[this.f337291b + i12] = c10;
                }
                strF0.getChars(0, length, this.f337290a, this.f337291b + i11);
            }
            this.f337291b += i10;
        }
        return this;
    }

    public e A0(int i10) {
        char[] cArr = this.f337290a;
        if (i10 > cArr.length) {
            char[] cArr2 = new char[i10 * 2];
            this.f337290a = cArr2;
            System.arraycopy(cArr, 0, cArr2, 0, this.f337291b);
        }
        return this;
    }

    public char[] A1() {
        int i10 = this.f337291b;
        if (i10 == 0) {
            return org.apache.commons.lang3.c.f337052r;
        }
        char[] cArr = new char[i10];
        System.arraycopy(this.f337290a, 0, cArr, 0, i10);
        return cArr;
    }

    public e B(int i10, int i11, char c10) {
        return C(String.valueOf(i10), i11, c10);
    }

    public boolean B0(e eVar) {
        int i10;
        if (this == eVar) {
            return true;
        }
        if (eVar == null || (i10 = this.f337291b) != eVar.f337291b) {
            return false;
        }
        char[] cArr = this.f337290a;
        char[] cArr2 = eVar.f337290a;
        for (int i11 = i10 - 1; i11 >= 0; i11--) {
            if (cArr[i11] != cArr2[i11]) {
                return false;
            }
        }
        return true;
    }

    public char[] B1(int i10, int i11) {
        int iG1 = G1(i10, i11) - i10;
        if (iG1 == 0) {
            return org.apache.commons.lang3.c.f337052r;
        }
        char[] cArr = new char[iG1];
        System.arraycopy(this.f337290a, i10, cArr, 0, iG1);
        return cArr;
    }

    public e C(Object obj, int i10, char c10) {
        if (i10 > 0) {
            A0(this.f337291b + i10);
            String strF0 = obj == null ? F0() : obj.toString();
            if (strF0 == null) {
                strF0 = "";
            }
            int length = strF0.length();
            if (length >= i10) {
                strF0.getChars(0, i10, this.f337290a, this.f337291b);
            } else {
                int i11 = i10 - length;
                strF0.getChars(0, length, this.f337290a, this.f337291b);
                for (int i12 = 0; i12 < i11; i12++) {
                    this.f337290a[this.f337291b + length + i12] = c10;
                }
            }
            this.f337291b += i10;
        }
        return this;
    }

    public boolean C0(e eVar) {
        if (this == eVar) {
            return true;
        }
        int i10 = this.f337291b;
        if (i10 != eVar.f337291b) {
            return false;
        }
        char[] cArr = this.f337290a;
        char[] cArr2 = eVar.f337290a;
        for (int i11 = i10 - 1; i11 >= 0; i11--) {
            char c10 = cArr[i11];
            char c11 = cArr2[i11];
            if (c10 != c11 && Character.toUpperCase(c10) != Character.toUpperCase(c11)) {
                return false;
            }
        }
        return true;
    }

    public StringBuffer C1() {
        StringBuffer stringBuffer = new StringBuffer(this.f337291b);
        stringBuffer.append(this.f337290a, 0, this.f337291b);
        return stringBuffer;
    }

    public e D() {
        String str = this.f337292c;
        if (str != null) {
            return i(str);
        }
        i(System.lineSeparator());
        return this;
    }

    public char[] D0(char[] cArr) {
        int length = length();
        if (cArr == null || cArr.length < length) {
            cArr = new char[length];
        }
        System.arraycopy(this.f337290a, 0, cArr, 0, length);
        return cArr;
    }

    public StringBuilder D1() {
        StringBuilder sb2 = new StringBuilder(this.f337291b);
        sb2.append(this.f337290a, 0, this.f337291b);
        return sb2;
    }

    public e E() {
        String str = this.f337293d;
        return str == null ? this : i(str);
    }

    public String E0() {
        return this.f337292c;
    }

    public e E1() {
        int i10 = this.f337291b;
        if (i10 != 0) {
            char[] cArr = this.f337290a;
            int i11 = 0;
            while (i11 < i10 && cArr[i11] <= ' ') {
                i11++;
            }
            while (i11 < i10 && cArr[i10 - 1] <= ' ') {
                i10--;
            }
            int i12 = this.f337291b;
            if (i10 < i12) {
                q0(i10, i12);
            }
            if (i11 > 0) {
                q0(0, i11);
            }
        }
        return this;
    }

    public e F(int i10, char c10) {
        if (i10 >= 0) {
            A0(this.f337291b + i10);
            for (int i11 = 0; i11 < i10; i11++) {
                char[] cArr = this.f337290a;
                int i12 = this.f337291b;
                this.f337291b = i12 + 1;
                cArr[i12] = c10;
            }
        }
        return this;
    }

    public String F0() {
        return this.f337293d;
    }

    protected void F1(int i10) {
        if (i10 < 0 || i10 > this.f337291b) {
            throw new StringIndexOutOfBoundsException(i10);
        }
    }

    public e G(char c10) {
        if (w1() > 0) {
            append(c10);
        }
        return this;
    }

    public int G0(char c10) {
        return H0(c10, 0);
    }

    protected int G1(int i10, int i11) {
        if (i10 < 0) {
            throw new StringIndexOutOfBoundsException(i10);
        }
        int i12 = this.f337291b;
        if (i11 > i12) {
            i11 = i12;
        }
        if (i10 <= i11) {
            return i11;
        }
        throw new StringIndexOutOfBoundsException("end < start");
    }

    public e H(char c10, char c11) {
        if (w1() > 0) {
            append(c10);
            return this;
        }
        append(c11);
        return this;
    }

    public int H0(char c10, int i10) {
        if (i10 < 0) {
            i10 = 0;
        }
        if (i10 >= this.f337291b) {
            return -1;
        }
        char[] cArr = this.f337290a;
        while (i10 < this.f337291b) {
            if (cArr[i10] == c10) {
                return i10;
            }
            i10++;
        }
        return -1;
    }

    public e I(char c10, int i10) {
        if (i10 > 0) {
            append(c10);
        }
        return this;
    }

    public int I0(String str) {
        return J0(str, 0);
    }

    public e J(String str) {
        return L(str, null);
    }

    public int J0(String str, int i10) {
        if (i10 < 0) {
            i10 = 0;
        }
        if (str != null && i10 < this.f337291b) {
            int length = str.length();
            if (length == 1) {
                return H0(str.charAt(0), i10);
            }
            if (length == 0) {
                return i10;
            }
            int i11 = this.f337291b;
            if (length > i11) {
                return -1;
            }
            char[] cArr = this.f337290a;
            int i12 = (i11 - length) + 1;
            while (i10 < i12) {
                for (int i13 = 0; i13 < length; i13++) {
                    if (str.charAt(i13) != cArr[i10 + i13]) {
                        i10++;
                    }
                }
                return i10;
            }
        }
        return -1;
    }

    public e K(String str, int i10) {
        if (str != null && i10 > 0) {
            i(str);
        }
        return this;
    }

    public int K0(g gVar) {
        return L0(gVar, 0);
    }

    public e L(String str, String str2) {
        if (isEmpty()) {
            str = str2;
        }
        if (str != null) {
            i(str);
        }
        return this;
    }

    public int L0(g gVar, int i10) {
        int i11;
        if (i10 < 0) {
            i10 = 0;
        }
        if (gVar != null && i10 < (i11 = this.f337291b)) {
            char[] cArr = this.f337290a;
            for (int i12 = i10; i12 < i11; i12++) {
                if (gVar.g(cArr, i12, i10, i11) > 0) {
                    return i12;
                }
            }
        }
        return -1;
    }

    public void M(Appendable appendable) throws IOException {
        if (appendable instanceof Writer) {
            ((Writer) appendable).write(this.f337290a, 0, this.f337291b);
            return;
        }
        if (appendable instanceof StringBuilder) {
            ((StringBuilder) appendable).append(this.f337290a, 0, this.f337291b);
            return;
        }
        if (appendable instanceof StringBuffer) {
            ((StringBuffer) appendable).append(this.f337290a, 0, this.f337291b);
        } else if (appendable instanceof CharBuffer) {
            ((CharBuffer) appendable).put(this.f337290a, 0, this.f337291b);
        } else {
            appendable.append(this);
        }
    }

    public e M0(int i10, char c10) {
        F1(i10);
        A0(this.f337291b + 1);
        char[] cArr = this.f337290a;
        System.arraycopy(cArr, i10, cArr, i10 + 1, this.f337291b - i10);
        this.f337290a[i10] = c10;
        this.f337291b++;
        return this;
    }

    public e N(Iterable<?> iterable, String str) {
        if (iterable != null) {
            String string = Objects.toString(str, "");
            Iterator<?> it = iterable.iterator();
            while (it.hasNext()) {
                h(it.next());
                if (it.hasNext()) {
                    i(string);
                }
            }
        }
        return this;
    }

    public e N0(int i10, double d10) {
        return S0(i10, String.valueOf(d10));
    }

    public e O(Iterator<?> it, String str) {
        if (it != null) {
            String string = Objects.toString(str, "");
            while (it.hasNext()) {
                h(it.next());
                if (it.hasNext()) {
                    i(string);
                }
            }
        }
        return this;
    }

    public e O0(int i10, float f10) {
        return S0(i10, String.valueOf(f10));
    }

    public e P(Object[] objArr, String str) {
        if (objArr != null && objArr.length > 0) {
            String string = Objects.toString(str, "");
            h(objArr[0]);
            for (int i10 = 1; i10 < objArr.length; i10++) {
                i(string);
                h(objArr[i10]);
            }
        }
        return this;
    }

    public e P0(int i10, int i11) {
        return S0(i10, String.valueOf(i11));
    }

    public e Q(char c10) {
        return append(c10).D();
    }

    public e Q0(int i10, long j10) {
        return S0(i10, String.valueOf(j10));
    }

    public e R(double d10) {
        return b(d10).D();
    }

    public e R0(int i10, Object obj) {
        return obj == null ? S0(i10, this.f337293d) : S0(i10, obj.toString());
    }

    public e S(float f10) {
        return c(f10).D();
    }

    public e S0(int i10, String str) {
        int length;
        F1(i10);
        if (str == null) {
            str = this.f337293d;
        }
        if (str != null && (length = str.length()) > 0) {
            int i11 = this.f337291b + length;
            A0(i11);
            char[] cArr = this.f337290a;
            System.arraycopy(cArr, i10, cArr, i10 + length, this.f337291b - i10);
            this.f337291b = i11;
            boolean z10 = false;
            str.getChars(0, length, this.f337290a, i10);
        }
        return this;
    }

    public e T(int i10) {
        return d(i10).D();
    }

    public e T0(int i10, boolean z10) {
        F1(i10);
        if (z10) {
            A0(this.f337291b + 4);
            char[] cArr = this.f337290a;
            System.arraycopy(cArr, i10, cArr, i10 + 4, this.f337291b - i10);
            char[] cArr2 = this.f337290a;
            cArr2[i10] = 't';
            cArr2[i10 + 1] = 'r';
            cArr2[i10 + 2] = AbstractJsonLexerKt.UNICODE_ESC;
            cArr2[i10 + 3] = 'e';
            this.f337291b += 4;
            return this;
        }
        A0(this.f337291b + 5);
        char[] cArr3 = this.f337290a;
        System.arraycopy(cArr3, i10, cArr3, i10 + 5, this.f337291b - i10);
        char[] cArr4 = this.f337290a;
        cArr4[i10] = 'f';
        cArr4[i10 + 1] = 'a';
        cArr4[i10 + 2] = 'l';
        cArr4[i10 + 3] = ni.f.f333366c;
        cArr4[i10 + 4] = 'e';
        this.f337291b += 5;
        return this;
    }

    public e U(long j10) {
        return e(j10).D();
    }

    public e U0(int i10, char[] cArr) {
        F1(i10);
        if (cArr == null) {
            return S0(i10, this.f337293d);
        }
        int length = cArr.length;
        if (length > 0) {
            A0(this.f337291b + length);
            char[] cArr2 = this.f337290a;
            System.arraycopy(cArr2, i10, cArr2, i10 + length, this.f337291b - i10);
            System.arraycopy(cArr, 0, this.f337290a, i10, length);
            this.f337291b += length;
        }
        return this;
    }

    public e V(Object obj) {
        return h(obj).D();
    }

    public e V0(int i10, char[] cArr, int i11, int i12) {
        F1(i10);
        if (cArr == null) {
            return S0(i10, this.f337293d);
        }
        if (i11 < 0 || i11 > cArr.length) {
            throw new StringIndexOutOfBoundsException("Invalid offset: " + i11);
        }
        if (i12 < 0 || i11 + i12 > cArr.length) {
            throw new StringIndexOutOfBoundsException("Invalid length: " + i12);
        }
        if (i12 > 0) {
            A0(this.f337291b + i12);
            char[] cArr2 = this.f337290a;
            System.arraycopy(cArr2, i10, cArr2, i10 + i12, this.f337291b - i10);
            System.arraycopy(cArr, i11, this.f337290a, i10, i12);
            this.f337291b += i12;
        }
        return this;
    }

    public e W(String str) {
        return i(str).D();
    }

    public int W0(char c10) {
        return X0(c10, this.f337291b - 1);
    }

    public e X(String str, int i10, int i11) {
        return j(str, i10, i11).D();
    }

    public int X0(char c10, int i10) {
        int i11 = this.f337291b;
        if (i10 >= i11) {
            i10 = i11 - 1;
        }
        if (i10 < 0) {
            return -1;
        }
        while (i10 >= 0) {
            if (this.f337290a[i10] == c10) {
                return i10;
            }
            i10--;
        }
        return -1;
    }

    public e Y(String str, Object... objArr) {
        return k(str, objArr).D();
    }

    public int Y0(String str) {
        return Z0(str, this.f337291b - 1);
    }

    public e Z(StringBuffer stringBuffer) {
        return l(stringBuffer).D();
    }

    public int Z0(String str, int i10) {
        int i11 = this.f337291b;
        if (i10 >= i11) {
            i10 = i11 - 1;
        }
        if (str != null && i10 >= 0) {
            int length = str.length();
            if (length > 0 && length <= this.f337291b) {
                if (length == 1) {
                    return X0(str.charAt(0), i10);
                }
                for (int i12 = (i10 - length) + 1; i12 >= 0; i12--) {
                    for (int i13 = 0; i13 < length; i13++) {
                        if (str.charAt(i13) != this.f337290a[i12 + i13]) {
                        }
                    }
                    return i12;
                }
            }
            if (length == 0) {
                return i10;
            }
        }
        return -1;
    }

    @Override // java.lang.Appendable
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public e append(char c10) {
        A0(length() + 1);
        char[] cArr = this.f337290a;
        int i10 = this.f337291b;
        this.f337291b = i10 + 1;
        cArr[i10] = c10;
        return this;
    }

    public e a0(StringBuffer stringBuffer, int i10, int i11) {
        return m(stringBuffer, i10, i11).D();
    }

    public int a1(g gVar) {
        return b1(gVar, this.f337291b);
    }

    public e b(double d10) {
        return i(String.valueOf(d10));
    }

    public e b0(StringBuilder sb2) {
        return n(sb2).D();
    }

    public int b1(g gVar, int i10) {
        int i11 = this.f337291b;
        if (i10 >= i11) {
            i10 = i11 - 1;
        }
        if (gVar != null && i10 >= 0) {
            char[] cArr = this.f337290a;
            int i12 = i10 + 1;
            while (i10 >= 0) {
                if (gVar.g(cArr, i10, 0, i12) > 0) {
                    return i10;
                }
                i10--;
            }
        }
        return -1;
    }

    public e c(float f10) {
        return i(String.valueOf(f10));
    }

    public e c0(StringBuilder sb2, int i10, int i11) {
        return o(sb2, i10, i11).D();
    }

    public String c1(int i10) {
        if (i10 <= 0) {
            return "";
        }
        int i11 = this.f337291b;
        return i10 >= i11 ? new String(this.f337290a, 0, i11) : new String(this.f337290a, 0, i10);
    }

    @Override // java.lang.CharSequence
    public char charAt(int i10) {
        if (i10 < 0 || i10 >= length()) {
            throw new StringIndexOutOfBoundsException(i10);
        }
        return this.f337290a[i10];
    }

    public boolean contains(String str) {
        return J0(str, 0) >= 0;
    }

    public e d(int i10) {
        return i(String.valueOf(i10));
    }

    public e d0(e eVar) {
        return r(eVar).D();
    }

    public String d1(int i10, int i11) {
        int i12;
        if (i10 < 0) {
            i10 = 0;
        }
        if (i11 <= 0 || i10 >= (i12 = this.f337291b)) {
            return "";
        }
        return i12 <= i10 + i11 ? new String(this.f337290a, i10, i12 - i10) : new String(this.f337290a, i10, i11);
    }

    public e e(long j10) {
        return i(String.valueOf(j10));
    }

    public e e0(e eVar, int i10, int i11) {
        return s(eVar, i10, i11).D();
    }

    public e e1() {
        if (this.f337290a.length > length()) {
            char[] cArr = this.f337290a;
            char[] cArr2 = new char[length()];
            this.f337290a = cArr2;
            boolean z10 = false & false;
            System.arraycopy(cArr, 0, cArr2, 0, this.f337291b);
        }
        return this;
    }

    public boolean equals(Object obj) {
        return (obj instanceof e) && B0((e) obj);
    }

    @Override // java.lang.Appendable
    /* JADX INFO: renamed from: f, reason: merged with bridge method [inline-methods] */
    public e append(CharSequence charSequence) {
        if (charSequence == null) {
            return E();
        }
        if (charSequence instanceof e) {
            return r((e) charSequence);
        }
        if (charSequence instanceof StringBuilder) {
            return n((StringBuilder) charSequence);
        }
        if (charSequence instanceof StringBuffer) {
            return l((StringBuffer) charSequence);
        }
        return charSequence instanceof CharBuffer ? p((CharBuffer) charSequence) : i(charSequence.toString());
    }

    public e f0(boolean z10) {
        return t(z10).D();
    }

    public int f1(Readable readable) throws IOException {
        int i10 = this.f337291b;
        if (readable instanceof Reader) {
            Reader reader = (Reader) readable;
            A0(i10 + 1);
            while (true) {
                char[] cArr = this.f337290a;
                int i11 = this.f337291b;
                int i12 = reader.read(cArr, i11, cArr.length - i11);
                if (i12 == -1) {
                    break;
                }
                int i13 = this.f337291b + i12;
                this.f337291b = i13;
                A0(i13 + 1);
            }
        } else if (readable instanceof CharBuffer) {
            CharBuffer charBuffer = (CharBuffer) readable;
            int iRemaining = charBuffer.remaining();
            A0(this.f337291b + iRemaining);
            charBuffer.get(this.f337290a, this.f337291b, iRemaining);
            this.f337291b += iRemaining;
        } else {
            while (true) {
                A0(this.f337291b + 1);
                char[] cArr2 = this.f337290a;
                int i14 = this.f337291b;
                int i15 = readable.read(CharBuffer.wrap(cArr2, i14, cArr2.length - i14));
                if (i15 == -1) {
                    break;
                }
                this.f337291b += i15;
            }
        }
        return this.f337291b - i10;
    }

    @Override // java.lang.Appendable
    /* JADX INFO: renamed from: g, reason: merged with bridge method [inline-methods] */
    public e append(CharSequence charSequence, int i10, int i11) {
        return charSequence == null ? E() : j(charSequence.toString(), i10, i11);
    }

    public e g0(char[] cArr) {
        return u(cArr).D();
    }

    public e g1(int i10, int i11, String str) {
        int iG1 = G1(i10, i11);
        p1(i10, iG1, iG1 - i10, str, str == null ? 0 : str.length());
        return this;
    }

    public void getChars(int i10, int i11, char[] cArr, int i12) {
        if (i10 < 0) {
            throw new StringIndexOutOfBoundsException(i10);
        }
        if (i11 < 0 || i11 > length()) {
            throw new StringIndexOutOfBoundsException(i11);
        }
        if (i10 > i11) {
            throw new StringIndexOutOfBoundsException("end < start");
        }
        System.arraycopy(this.f337290a, i10, cArr, i12, i11 - i10);
    }

    public e h(Object obj) {
        if (obj == null) {
            return E();
        }
        return obj instanceof CharSequence ? append((CharSequence) obj) : i(obj.toString());
    }

    public e h0(char[] cArr, int i10, int i11) {
        return v(cArr, i10, i11).D();
    }

    public e h1(g gVar, String str, int i10, int i11, int i12) {
        return o1(gVar, str, i10, G1(i10, i11), i12);
    }

    public int hashCode() {
        char[] cArr = this.f337290a;
        int i10 = 0;
        for (int i11 = this.f337291b - 1; i11 >= 0; i11--) {
            i10 = (i10 * 31) + cArr[i11];
        }
        return i10;
    }

    public e i(String str) {
        if (str == null) {
            return E();
        }
        int length = str.length();
        if (length > 0) {
            int length2 = length();
            A0(length2 + length);
            str.getChars(0, length, this.f337290a, length2);
            this.f337291b += length;
        }
        return this;
    }

    public Reader i0() {
        return new a();
    }

    public e i1(char c10, char c11) {
        if (c10 != c11) {
            for (int i10 = 0; i10 < this.f337291b; i10++) {
                char[] cArr = this.f337290a;
                if (cArr[i10] == c10) {
                    cArr[i10] = c11;
                }
            }
        }
        return this;
    }

    public boolean isEmpty() {
        if (this.f337291b != 0) {
            return false;
        }
        int i10 = 7 | 1;
        return true;
    }

    public e j(String str, int i10, int i11) {
        int i12;
        if (str == null) {
            return E();
        }
        if (i10 < 0 || i10 > str.length()) {
            throw new StringIndexOutOfBoundsException("startIndex must be valid");
        }
        if (i11 < 0 || (i12 = i10 + i11) > str.length()) {
            throw new StringIndexOutOfBoundsException("length must be valid");
        }
        if (i11 > 0) {
            int length = length();
            A0(length + i11);
            str.getChars(i10, i12, this.f337290a, length);
            this.f337291b += i11;
        }
        return this;
    }

    public i j0() {
        return new b();
    }

    public e j1(String str, String str2) {
        int length = str == null ? 0 : str.length();
        if (length > 0) {
            int length2 = str2 == null ? 0 : str2.length();
            int iJ0 = J0(str, 0);
            while (iJ0 >= 0) {
                p1(iJ0, iJ0 + length, length, str2, length2);
                iJ0 = J0(str, iJ0 + length2);
            }
        }
        return this;
    }

    public e k(String str, Object... objArr) {
        return i(String.format(str, objArr));
    }

    public Writer k0() {
        return new c();
    }

    public e k1(g gVar, String str) {
        return h1(gVar, str, 0, this.f337291b, -1);
    }

    public e l(StringBuffer stringBuffer) {
        if (stringBuffer == null) {
            return E();
        }
        int length = stringBuffer.length();
        if (length > 0) {
            int length2 = length();
            A0(length2 + length);
            stringBuffer.getChars(0, length, this.f337290a, length2);
            this.f337291b += length;
        }
        return this;
    }

    @Override // org.apache.commons.lang3.builder.a
    /* JADX INFO: renamed from: l0, reason: merged with bridge method [inline-methods] */
    public String build() {
        return toString();
    }

    public e l1(char c10, char c11) {
        if (c10 != c11) {
            for (int i10 = 0; i10 < this.f337291b; i10++) {
                char[] cArr = this.f337290a;
                if (cArr[i10] == c10) {
                    cArr[i10] = c11;
                    return this;
                }
            }
        }
        return this;
    }

    @Override // java.lang.CharSequence
    public int length() {
        return this.f337291b;
    }

    public e m(StringBuffer stringBuffer, int i10, int i11) {
        int i12;
        if (stringBuffer == null) {
            return E();
        }
        if (i10 < 0 || i10 > stringBuffer.length()) {
            throw new StringIndexOutOfBoundsException("startIndex must be valid");
        }
        if (i11 < 0 || (i12 = i10 + i11) > stringBuffer.length()) {
            throw new StringIndexOutOfBoundsException("length must be valid");
        }
        if (i11 > 0) {
            int length = length();
            A0(length + i11);
            stringBuffer.getChars(i10, i12, this.f337290a, length);
            this.f337291b += i11;
        }
        return this;
    }

    public int m0() {
        return this.f337290a.length;
    }

    public e m1(String str, String str2) {
        int iJ0;
        int length = str == null ? 0 : str.length();
        if (length <= 0 || (iJ0 = J0(str, 0)) < 0) {
            return this;
        }
        p1(iJ0, iJ0 + length, length, str2, str2 != null ? str2.length() : 0);
        return this;
    }

    public e n(StringBuilder sb2) {
        if (sb2 == null) {
            return E();
        }
        int length = sb2.length();
        if (length > 0) {
            int length2 = length();
            A0(length2 + length);
            sb2.getChars(0, length, this.f337290a, length2);
            this.f337291b += length;
        }
        return this;
    }

    public e n0() {
        this.f337291b = 0;
        return this;
    }

    public e n1(g gVar, String str) {
        return h1(gVar, str, 0, this.f337291b, 1);
    }

    public e o(StringBuilder sb2, int i10, int i11) {
        int i12;
        if (sb2 == null) {
            return E();
        }
        if (i10 < 0 || i10 > sb2.length()) {
            throw new StringIndexOutOfBoundsException("startIndex must be valid");
        }
        if (i11 < 0 || (i12 = i10 + i11) > sb2.length()) {
            throw new StringIndexOutOfBoundsException("length must be valid");
        }
        if (i11 > 0) {
            int length = length();
            A0(length + i11);
            sb2.getChars(i10, i12, this.f337290a, length);
            this.f337291b += i11;
        }
        return this;
    }

    public boolean o0(char c10) {
        char[] cArr = this.f337290a;
        for (int i10 = 0; i10 < this.f337291b; i10++) {
            if (cArr[i10] == c10) {
                return true;
            }
        }
        return false;
    }

    public e p(CharBuffer charBuffer) {
        if (charBuffer == null) {
            return E();
        }
        if (!charBuffer.hasArray()) {
            i(charBuffer.toString());
            return this;
        }
        int iRemaining = charBuffer.remaining();
        int length = length();
        A0(length + iRemaining);
        System.arraycopy(charBuffer.array(), charBuffer.arrayOffset() + charBuffer.position(), this.f337290a, length, iRemaining);
        this.f337291b += iRemaining;
        return this;
    }

    public boolean p0(g gVar) {
        return L0(gVar, 0) >= 0;
    }

    public e q(CharBuffer charBuffer, int i10, int i11) {
        if (charBuffer == null) {
            return E();
        }
        if (!charBuffer.hasArray()) {
            j(charBuffer.toString(), i10, i11);
            return this;
        }
        int iRemaining = charBuffer.remaining();
        if (i10 < 0 || i10 > iRemaining) {
            throw new StringIndexOutOfBoundsException("startIndex must be valid");
        }
        if (i11 < 0 || i10 + i11 > iRemaining) {
            throw new StringIndexOutOfBoundsException("length must be valid");
        }
        int length = length();
        A0(length + i11);
        System.arraycopy(charBuffer.array(), charBuffer.arrayOffset() + charBuffer.position() + i10, this.f337290a, length, i11);
        this.f337291b += i11;
        return this;
    }

    public e q0(int i10, int i11) {
        int iG1 = G1(i10, i11);
        int i12 = iG1 - i10;
        if (i12 > 0) {
            y0(i10, iG1, i12);
        }
        return this;
    }

    public e q1() {
        int i10 = this.f337291b;
        if (i10 != 0) {
            int i11 = i10 / 2;
            char[] cArr = this.f337290a;
            int i12 = i10 - 1;
            int i13 = 0;
            while (i13 < i11) {
                char c10 = cArr[i13];
                cArr[i13] = cArr[i12];
                cArr[i12] = c10;
                i13++;
                i12--;
            }
        }
        return this;
    }

    public e r(e eVar) {
        if (eVar == null) {
            return E();
        }
        int length = eVar.length();
        if (length > 0) {
            int length2 = length();
            A0(length2 + length);
            System.arraycopy(eVar.f337290a, 0, this.f337290a, length2, length);
            this.f337291b += length;
        }
        return this;
    }

    public e r0(char c10) {
        int i10 = 0;
        while (i10 < this.f337291b) {
            if (this.f337290a[i10] == c10) {
                int i11 = i10;
                do {
                    i11++;
                    if (i11 >= this.f337291b) {
                        break;
                    }
                } while (this.f337290a[i11] == c10);
                int i12 = i11 - i10;
                y0(i10, i11, i12);
                i10 = i11 - i12;
            }
            i10++;
        }
        return this;
    }

    public String r1(int i10) {
        if (i10 <= 0) {
            return "";
        }
        int i11 = this.f337291b;
        return i10 >= i11 ? new String(this.f337290a, 0, i11) : new String(this.f337290a, i11 - i10, i10);
    }

    public e s(e eVar, int i10, int i11) {
        int i12;
        if (eVar == null) {
            return E();
        }
        if (i10 < 0 || i10 > eVar.length()) {
            throw new StringIndexOutOfBoundsException("startIndex must be valid");
        }
        if (i11 < 0 || (i12 = i10 + i11) > eVar.length()) {
            throw new StringIndexOutOfBoundsException("length must be valid");
        }
        if (i11 > 0) {
            int length = length();
            A0(length + i11);
            eVar.getChars(i10, i12, this.f337290a, length);
            this.f337291b += i11;
        }
        return this;
    }

    public e s0(String str) {
        int length = str == null ? 0 : str.length();
        if (length > 0) {
            int iJ0 = J0(str, 0);
            while (iJ0 >= 0) {
                y0(iJ0, iJ0 + length, length);
                iJ0 = J0(str, iJ0);
            }
        }
        return this;
    }

    public e s1(int i10, char c10) {
        if (i10 < 0 || i10 >= length()) {
            throw new StringIndexOutOfBoundsException(i10);
        }
        this.f337290a[i10] = c10;
        return this;
    }

    @Override // java.lang.CharSequence
    public CharSequence subSequence(int i10, int i11) {
        if (i10 < 0) {
            throw new StringIndexOutOfBoundsException(i10);
        }
        if (i11 > this.f337291b) {
            throw new StringIndexOutOfBoundsException(i11);
        }
        if (i10 <= i11) {
            return z1(i10, i11);
        }
        throw new StringIndexOutOfBoundsException(i11 - i10);
    }

    public e t(boolean z10) {
        if (z10) {
            A0(this.f337291b + 4);
            char[] cArr = this.f337290a;
            int i10 = this.f337291b;
            int i11 = i10 + 1;
            this.f337291b = i11;
            cArr[i10] = 't';
            int i12 = i10 + 2;
            this.f337291b = i12;
            cArr[i11] = 'r';
            int i13 = i10 + 3;
            this.f337291b = i13;
            cArr[i12] = AbstractJsonLexerKt.UNICODE_ESC;
            this.f337291b = i10 + 4;
            cArr[i13] = 'e';
            return this;
        }
        A0(this.f337291b + 5);
        char[] cArr2 = this.f337290a;
        int i14 = this.f337291b;
        int i15 = i14 + 1;
        this.f337291b = i15;
        cArr2[i14] = 'f';
        int i16 = i14 + 2;
        this.f337291b = i16;
        cArr2[i15] = 'a';
        int i17 = i14 + 3;
        this.f337291b = i17;
        cArr2[i16] = 'l';
        int i18 = i14 + 4;
        this.f337291b = i18;
        cArr2[i17] = ni.f.f333366c;
        this.f337291b = i14 + 5;
        cArr2[i18] = 'e';
        return this;
    }

    public e t0(g gVar) {
        int i10 = 6 & 0;
        return h1(gVar, null, 0, this.f337291b, -1);
    }

    public e t1(int i10) {
        if (i10 < 0) {
            throw new StringIndexOutOfBoundsException(i10);
        }
        int i11 = this.f337291b;
        if (i10 < i11) {
            this.f337291b = i10;
            return this;
        }
        if (i10 > i11) {
            A0(i10);
            this.f337291b = i10;
            for (int i12 = this.f337291b; i12 < i10; i12++) {
                this.f337290a[i12] = 0;
            }
        }
        return this;
    }

    @Override // java.lang.CharSequence
    public String toString() {
        return new String(this.f337290a, 0, this.f337291b);
    }

    public e u(char[] cArr) {
        if (cArr == null) {
            return E();
        }
        int length = cArr.length;
        if (length > 0) {
            int length2 = length();
            A0(length2 + length);
            System.arraycopy(cArr, 0, this.f337290a, length2, length);
            this.f337291b += length;
        }
        return this;
    }

    public e u0(int i10) {
        if (i10 < 0 || i10 >= this.f337291b) {
            throw new StringIndexOutOfBoundsException(i10);
        }
        y0(i10, i10 + 1, 1);
        return this;
    }

    public e u1(String str) {
        this.f337292c = str;
        return this;
    }

    public e v(char[] cArr, int i10, int i11) {
        if (cArr == null) {
            return E();
        }
        if (i10 < 0 || i10 > cArr.length) {
            throw new StringIndexOutOfBoundsException("Invalid startIndex: " + i11);
        }
        if (i11 < 0 || i10 + i11 > cArr.length) {
            throw new StringIndexOutOfBoundsException("Invalid length: " + i11);
        }
        if (i11 > 0) {
            int length = length();
            A0(length + i11);
            System.arraycopy(cArr, i10, this.f337290a, length, i11);
            this.f337291b += i11;
        }
        return this;
    }

    public e v0(char c10) {
        for (int i10 = 0; i10 < this.f337291b; i10++) {
            if (this.f337290a[i10] == c10) {
                y0(i10, i10 + 1, 1);
                return this;
            }
        }
        return this;
    }

    public e v1(String str) {
        if (str != null && str.isEmpty()) {
            str = null;
        }
        this.f337293d = str;
        return this;
    }

    public e w(Iterable<?> iterable) {
        if (iterable != null) {
            Iterator<?> it = iterable.iterator();
            while (it.hasNext()) {
                h(it.next());
            }
        }
        return this;
    }

    public e w0(String str) {
        int iJ0;
        int length = str == null ? 0 : str.length();
        if (length > 0 && (iJ0 = J0(str, 0)) >= 0) {
            y0(iJ0, iJ0 + length, length);
        }
        return this;
    }

    public int w1() {
        return this.f337291b;
    }

    public e x(Iterator<?> it) {
        if (it != null) {
            while (it.hasNext()) {
                h(it.next());
            }
        }
        return this;
    }

    public e x0(g gVar) {
        return h1(gVar, null, 0, this.f337291b, 1);
    }

    public boolean x1(String str) {
        if (str == null) {
            return false;
        }
        int length = str.length();
        if (length == 0) {
            return true;
        }
        if (length > this.f337291b) {
            return false;
        }
        for (int i10 = 0; i10 < length; i10++) {
            if (this.f337290a[i10] != str.charAt(i10)) {
                return false;
            }
        }
        return true;
    }

    public <T> e y(T... tArr) {
        if (tArr != null && tArr.length > 0) {
            for (T t10 : tArr) {
                h(t10);
            }
        }
        return this;
    }

    public String y1(int i10) {
        return z1(i10, this.f337291b);
    }

    public e z(int i10, int i11, char c10) {
        return A(String.valueOf(i10), i11, c10);
    }

    public boolean z0(String str) {
        if (str == null) {
            return false;
        }
        int length = str.length();
        if (length == 0) {
            return true;
        }
        int i10 = this.f337291b;
        if (length > i10) {
            return false;
        }
        int i11 = i10 - length;
        int i12 = 0;
        while (i12 < length) {
            if (this.f337290a[i11] != str.charAt(i12)) {
                return false;
            }
            i12++;
            i11++;
        }
        return true;
    }

    public String z1(int i10, int i11) {
        return new String(this.f337290a, i10, G1(i10, i11) - i10);
    }

    class a extends Reader {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private int f337294a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private int f337295b;

        a() {
        }

        @Override // java.io.Reader, java.io.Closeable, java.lang.AutoCloseable
        public void close() {
        }

        @Override // java.io.Reader
        public void mark(int i10) {
            this.f337295b = this.f337294a;
        }

        @Override // java.io.Reader
        public boolean markSupported() {
            return true;
        }

        @Override // java.io.Reader
        public int read() {
            if (!ready()) {
                return -1;
            }
            e eVar = e.this;
            int i10 = this.f337294a;
            this.f337294a = i10 + 1;
            return eVar.charAt(i10);
        }

        @Override // java.io.Reader
        public boolean ready() {
            return this.f337294a < e.this.w1();
        }

        @Override // java.io.Reader
        public void reset() {
            this.f337294a = this.f337295b;
        }

        @Override // java.io.Reader
        public long skip(long j10) {
            if (((long) this.f337294a) + j10 > e.this.w1()) {
                j10 = e.this.w1() - this.f337294a;
            }
            if (j10 < 0) {
                return 0L;
            }
            this.f337294a = (int) (((long) this.f337294a) + j10);
            return j10;
        }

        @Override // java.io.Reader
        public int read(char[] cArr, int i10, int i11) {
            int i12;
            if (i10 < 0 || i11 < 0 || i10 > cArr.length || (i12 = i10 + i11) > cArr.length || i12 < 0) {
                throw new IndexOutOfBoundsException();
            }
            if (i11 == 0) {
                return 0;
            }
            if (this.f337294a >= e.this.w1()) {
                return -1;
            }
            if (this.f337294a + i11 > e.this.w1()) {
                i11 = e.this.w1() - this.f337294a;
            }
            e eVar = e.this;
            int i13 = this.f337294a;
            eVar.getChars(i13, i13 + i11, cArr, i10);
            this.f337294a += i11;
            return i11;
        }
    }

    public e(int i10) {
        this.f337290a = new char[i10 <= 0 ? 32 : i10];
    }

    public e(String str) {
        if (str == null) {
            this.f337290a = new char[32];
        } else {
            this.f337290a = new char[str.length() + 32];
            i(str);
        }
    }
}
