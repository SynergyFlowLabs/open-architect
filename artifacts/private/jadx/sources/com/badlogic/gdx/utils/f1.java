package com.badlogic.gdx.utils;

import androidx.media3.exoplayer.c4;
import java.util.Arrays;
import kotlinx.serialization.json.internal.AbstractJsonLexerKt;

/* JADX INFO: loaded from: classes3.dex */
public class f1 implements Appendable, CharSequence {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    static final int f95491c = 16;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private static final char[] f95492d = {org.locationtech.jts.geom.l.f338160j, org.locationtech.jts.geom.l.f338161k, org.locationtech.jts.geom.l.f338162l, '3', '4', '5', '6', '7', '8', '9'};

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public char[] f95493a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public int f95494b;

    public f1() {
        this.f95493a = new char[16];
    }

    private void H(int i10) {
        char[] cArr = this.f95493a;
        int length = (cArr.length >> 1) + cArr.length + 2;
        if (i10 <= length) {
            i10 = length;
        }
        char[] cArr2 = new char[i10];
        System.arraycopy(cArr, 0, cArr2, 0, this.f95494b);
        this.f95493a = cArr2;
    }

    private void f0(int i10, int i11) {
        char[] cArr = this.f95493a;
        int length = cArr.length;
        int i12 = this.f95494b;
        if (length - i12 >= i10) {
            System.arraycopy(cArr, i11, cArr, i10 + i11, i12 - i11);
            return;
        }
        int i13 = i12 + i10;
        int length2 = (cArr.length << 1) + 2;
        if (i13 <= length2) {
            i13 = length2;
        }
        char[] cArr2 = new char[i13];
        System.arraycopy(cArr, 0, cArr2, 0, i11);
        System.arraycopy(this.f95493a, i11, cArr2, i10 + i11, this.f95494b - i11);
        this.f95493a = cArr2;
    }

    public static int g0(int i10, int i11) {
        int i12 = i10 < 0 ? 2 : 1;
        while (true) {
            i10 /= i11;
            if (i10 == 0) {
                return i12;
            }
            i12++;
        }
    }

    public static int h0(long j10, int i10) {
        int i11 = j10 < 0 ? 2 : 1;
        while (true) {
            j10 /= (long) i10;
            if (j10 == 0) {
                return i11;
            }
            i11++;
        }
    }

    public int A(int i10) {
        int i11;
        if (i10 < 0 || i10 >= (i11 = this.f95494b)) {
            throw new StringIndexOutOfBoundsException(i10);
        }
        return Character.codePointAt(this.f95493a, i10, i11);
    }

    public int B(int i10) {
        if (i10 < 1 || i10 > this.f95494b) {
            throw new StringIndexOutOfBoundsException(i10);
        }
        return Character.codePointBefore(this.f95493a, i10);
    }

    public int C(int i10, int i11) {
        if (i10 < 0 || i11 > this.f95494b || i10 > i11) {
            throw new StringIndexOutOfBoundsException();
        }
        return Character.codePointCount(this.f95493a, i10, i11 - i10);
    }

    public f1 D(int i10, int i11) {
        E(i10, i11);
        return this;
    }

    final void E(int i10, int i11) {
        if (i10 >= 0) {
            int i12 = this.f95494b;
            if (i11 > i12) {
                i11 = i12;
            }
            if (i11 == i10) {
                return;
            }
            if (i11 > i10) {
                int i13 = i12 - i11;
                if (i13 >= 0) {
                    char[] cArr = this.f95493a;
                    System.arraycopy(cArr, i11, cArr, i10, i13);
                }
                this.f95494b -= i11 - i10;
                return;
            }
        }
        throw new StringIndexOutOfBoundsException();
    }

    public f1 F(int i10) {
        G(i10);
        return this;
    }

    final void G(int i10) {
        int i11;
        if (i10 < 0 || i10 >= (i11 = this.f95494b)) {
            throw new StringIndexOutOfBoundsException(i10);
        }
        int i12 = (i11 - i10) - 1;
        if (i12 > 0) {
            char[] cArr = this.f95493a;
            System.arraycopy(cArr, i10 + 1, cArr, i10, i12);
        }
        this.f95494b--;
    }

    public void I(int i10) {
        char[] cArr = this.f95493a;
        if (i10 > cArr.length) {
            int length = (cArr.length << 1) + 2;
            if (length > i10) {
                i10 = length;
            }
            H(i10);
        }
    }

    final char[] J() {
        return this.f95493a;
    }

    public int K(String str) {
        return L(str, 0);
    }

    public int L(String str, int i10) {
        if (i10 < 0) {
            i10 = 0;
        }
        int length = str.length();
        if (length <= 0) {
            int i11 = this.f95494b;
            return (i10 < i11 || i10 == 0) ? i10 : i11;
        }
        if (length + i10 > this.f95494b) {
            return -1;
        }
        char cCharAt = str.charAt(0);
        while (true) {
            int i12 = this.f95494b;
            if (i10 >= i12) {
                break;
            }
            if (this.f95493a[i10] == cCharAt) {
                if (length + i10 > i12) {
                    break;
                }
                int i13 = i10;
                int i14 = 0;
                do {
                    i14++;
                    if (i14 >= length) {
                        break;
                    }
                    i13++;
                } while (this.f95493a[i13] == str.charAt(i14));
                if (i14 == length) {
                    return i10;
                }
            }
            i10++;
        }
        return -1;
    }

    public f1 M(int i10, char c10) {
        Y(i10, c10);
        return this;
    }

    public f1 N(int i10, double d10) {
        a0(i10, Double.toString(d10));
        return this;
    }

    public f1 O(int i10, float f10) {
        a0(i10, Float.toString(f10));
        return this;
    }

    public f1 P(int i10, int i11) {
        a0(i10, Integer.toString(i11));
        return this;
    }

    public f1 Q(int i10, long j10) {
        a0(i10, Long.toString(j10));
        return this;
    }

    public f1 R(int i10, CharSequence charSequence) {
        a0(i10, charSequence == null ? AbstractJsonLexerKt.NULL : charSequence.toString());
        return this;
    }

    public f1 S(int i10, CharSequence charSequence, int i11, int i12) {
        Z(i10, charSequence, i11, i12);
        return this;
    }

    public f1 T(int i10, Object obj) {
        a0(i10, obj == null ? AbstractJsonLexerKt.NULL : obj.toString());
        return this;
    }

    public f1 U(int i10, String str) {
        a0(i10, str);
        return this;
    }

    public f1 V(int i10, boolean z10) {
        a0(i10, z10 ? com.facebook.internal.z0.P : "false");
        return this;
    }

    public f1 W(int i10, char[] cArr) {
        b0(i10, cArr);
        return this;
    }

    public f1 X(int i10, char[] cArr, int i11, int i12) {
        c0(i10, cArr, i11, i12);
        return this;
    }

    final void Y(int i10, char c10) {
        if (i10 < 0 || i10 > this.f95494b) {
            throw new ArrayIndexOutOfBoundsException(i10);
        }
        f0(1, i10);
        this.f95493a[i10] = c10;
        this.f95494b++;
    }

    final void Z(int i10, CharSequence charSequence, int i11, int i12) {
        if (charSequence == null) {
            charSequence = AbstractJsonLexerKt.NULL;
        }
        if (i10 < 0 || i10 > this.f95494b || i11 < 0 || i12 < 0 || i11 > i12 || i12 > charSequence.length()) {
            throw new IndexOutOfBoundsException();
        }
        a0(i10, charSequence.subSequence(i11, i12).toString());
    }

    @Override // java.lang.Appendable
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public f1 append(char c10) {
        s(c10);
        return this;
    }

    final void a0(int i10, String str) {
        if (i10 < 0 || i10 > this.f95494b) {
            throw new StringIndexOutOfBoundsException(i10);
        }
        if (str == null) {
            str = AbstractJsonLexerKt.NULL;
        }
        int length = str.length();
        if (length != 0) {
            f0(length, i10);
            str.getChars(0, length, this.f95493a, i10);
            this.f95494b += length;
        }
    }

    public f1 b(double d10) {
        u(Double.toString(d10));
        return this;
    }

    final void b0(int i10, char[] cArr) {
        if (i10 < 0 || i10 > this.f95494b) {
            throw new StringIndexOutOfBoundsException(i10);
        }
        if (cArr.length != 0) {
            f0(cArr.length, i10);
            System.arraycopy(cArr, 0, cArr, i10, cArr.length);
            this.f95494b += cArr.length;
        }
    }

    public f1 c(float f10) {
        u(Float.toString(f10));
        return this;
    }

    final void c0(int i10, char[] cArr, int i11, int i12) {
        if (i10 < 0 || i10 > i12) {
            throw new StringIndexOutOfBoundsException(i10);
        }
        if (i11 >= 0 && i12 >= 0 && i12 <= cArr.length - i11) {
            if (i12 != 0) {
                f0(i12, i10);
                System.arraycopy(cArr, i11, this.f95493a, i10, i12);
                this.f95494b += i12;
                return;
            }
            return;
        }
        throw new StringIndexOutOfBoundsException("offset " + i11 + ", length " + i12 + ", char[].length " + cArr.length);
    }

    @Override // java.lang.CharSequence
    public char charAt(int i10) {
        if (i10 < 0 || i10 >= this.f95494b) {
            throw new StringIndexOutOfBoundsException(i10);
        }
        return this.f95493a[i10];
    }

    public f1 d(int i10) {
        return e(i10, 0);
    }

    public int d0(String str) {
        return e0(str, this.f95494b);
    }

    public f1 e(int i10, int i11) {
        return f(i10, i11, org.locationtech.jts.geom.l.f338160j);
    }

    public int e0(String str, int i10) {
        int length = str.length();
        int i11 = this.f95494b;
        if (length > i11 || i10 < 0) {
            return -1;
        }
        if (length <= 0) {
            return i10 < i11 ? i10 : i11;
        }
        if (i10 > i11 - length) {
            i10 = i11 - length;
        }
        char cCharAt = str.charAt(0);
        while (i10 >= 0) {
            if (this.f95493a[i10] == cCharAt) {
                int i12 = i10;
                int i13 = 0;
                do {
                    i13++;
                    if (i13 >= length) {
                        break;
                    }
                    i12++;
                } while (this.f95493a[i12] == str.charAt(i13));
                if (i13 == length) {
                    return i10;
                }
                i10--;
            } else {
                i10--;
            }
        }
        return -1;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && getClass() == obj.getClass()) {
            f1 f1Var = (f1) obj;
            int i10 = this.f95494b;
            if (i10 != f1Var.f95494b) {
                return false;
            }
            char[] cArr = this.f95493a;
            char[] cArr2 = f1Var.f95493a;
            if (cArr == cArr2) {
                return true;
            }
            if (cArr == null || cArr2 == null) {
                return false;
            }
            for (int i11 = 0; i11 < i10; i11++) {
                if (cArr[i11] != cArr2[i11]) {
                    return false;
                }
            }
            return true;
        }
        return false;
    }

    public f1 f(int i10, int i11, char c10) {
        if (i10 == Integer.MIN_VALUE) {
            u("-2147483648");
            return this;
        }
        if (i10 < 0) {
            s(org.apache.commons.codec.language.l.f335457d);
            i10 = -i10;
        }
        if (i11 > 1) {
            for (int iG0 = i11 - g0(i10, 10); iG0 > 0; iG0--) {
                append(c10);
            }
        }
        if (i10 >= 10000) {
            if (i10 >= 1000000000) {
                s(f95492d[(int) ((((long) i10) % okhttp3.internal.connection.f.f334128w) / 1000000000)]);
            }
            if (i10 >= 100000000) {
                s(f95492d[(i10 % 1000000000) / 100000000]);
            }
            if (i10 >= 10000000) {
                s(f95492d[(i10 % 100000000) / 10000000]);
            }
            if (i10 >= 1000000) {
                s(f95492d[(i10 % 10000000) / 1000000]);
            }
            if (i10 >= 100000) {
                s(f95492d[(i10 % 1000000) / 100000]);
            }
            s(f95492d[(i10 % 100000) / 10000]);
        }
        if (i10 >= 1000) {
            s(f95492d[(i10 % 10000) / 1000]);
        }
        if (i10 >= 100) {
            s(f95492d[(i10 % 1000) / 100]);
        }
        if (i10 >= 10) {
            s(f95492d[(i10 % 100) / 10]);
        }
        s(f95492d[i10 % 10]);
        return this;
    }

    public f1 g(long j10) {
        return h(j10, 0);
    }

    public void getChars(int i10, int i11, char[] cArr, int i12) {
        int i13 = this.f95494b;
        if (i10 > i13 || i11 > i13 || i10 > i11) {
            throw new StringIndexOutOfBoundsException();
        }
        System.arraycopy(this.f95493a, i10, cArr, i12, i11 - i10);
    }

    public f1 h(long j10, int i10) {
        return i(j10, i10, org.locationtech.jts.geom.l.f338160j);
    }

    public int hashCode() {
        return ((this.f95494b + 31) * 31) + Arrays.hashCode(this.f95493a);
    }

    public f1 i(long j10, int i10, char c10) {
        if (j10 == Long.MIN_VALUE) {
            u("-9223372036854775808");
            return this;
        }
        if (j10 < 0) {
            s(org.apache.commons.codec.language.l.f335457d);
            j10 = -j10;
        }
        if (i10 > 1) {
            for (int iH0 = i10 - h0(j10, 10); iH0 > 0; iH0--) {
                append(c10);
            }
        }
        if (j10 >= 10000) {
            if (j10 >= 1000000000000000000L) {
                s(f95492d[(int) ((j10 % 1.0E19d) / 1.0E18d)]);
            }
            if (j10 >= 100000000000000000L) {
                s(f95492d[(int) ((j10 % 1000000000000000000L) / 100000000000000000L)]);
            }
            if (j10 >= 10000000000000000L) {
                s(f95492d[(int) ((j10 % 100000000000000000L) / 10000000000000000L)]);
            }
            if (j10 >= 1000000000000000L) {
                s(f95492d[(int) ((j10 % 10000000000000000L) / 1000000000000000L)]);
            }
            if (j10 >= 100000000000000L) {
                s(f95492d[(int) ((j10 % 1000000000000000L) / 100000000000000L)]);
            }
            if (j10 >= 10000000000000L) {
                s(f95492d[(int) ((j10 % 100000000000000L) / 10000000000000L)]);
            }
            if (j10 >= c4.f63520s) {
                s(f95492d[(int) ((j10 % 10000000000000L) / c4.f63520s)]);
            }
            if (j10 >= 100000000000L) {
                s(f95492d[(int) ((j10 % c4.f63520s) / 100000000000L)]);
            }
            if (j10 >= okhttp3.internal.connection.f.f334128w) {
                s(f95492d[(int) ((j10 % 100000000000L) / okhttp3.internal.connection.f.f334128w)]);
            }
            if (j10 >= 1000000000) {
                s(f95492d[(int) ((j10 % okhttp3.internal.connection.f.f334128w) / 1000000000)]);
            }
            if (j10 >= 100000000) {
                s(f95492d[(int) ((j10 % 1000000000) / 100000000)]);
            }
            if (j10 >= 10000000) {
                s(f95492d[(int) ((j10 % 100000000) / 10000000)]);
            }
            if (j10 >= 1000000) {
                s(f95492d[(int) ((j10 % 10000000) / 1000000)]);
            }
            if (j10 >= androidx.media3.exoplayer.audio.s0.f63372z) {
                s(f95492d[(int) ((j10 % 1000000) / androidx.media3.exoplayer.audio.s0.f63372z)]);
            }
            s(f95492d[(int) ((j10 % androidx.media3.exoplayer.audio.s0.f63372z) / 10000)]);
        }
        if (j10 >= 1000) {
            s(f95492d[(int) ((j10 % 10000) / 1000)]);
        }
        if (j10 >= 100) {
            s(f95492d[(int) ((j10 % 1000) / 100)]);
        }
        if (j10 >= 10) {
            s(f95492d[(int) ((j10 % 100) / 10)]);
        }
        s(f95492d[(int) (j10 % 10)]);
        return this;
    }

    public int i0(int i10, int i11) {
        return Character.offsetByCodePoints(this.f95493a, 0, this.f95494b, i10, i11);
    }

    public f1 j(f1 f1Var) {
        if (f1Var == null) {
            y();
            return this;
        }
        w(f1Var.f95493a, 0, f1Var.f95494b);
        return this;
    }

    public f1 j0(int i10, int i11, String str) {
        k0(i10, i11, str);
        return this;
    }

    public f1 k(f1 f1Var, int i10, int i11) {
        if (f1Var == null) {
            y();
            return this;
        }
        w(f1Var.f95493a, i10, i11);
        return this;
    }

    final void k0(int i10, int i11, String str) {
        if (i10 >= 0) {
            int i12 = this.f95494b;
            if (i11 > i12) {
                i11 = i12;
            }
            if (i11 > i10) {
                int length = str.length();
                int i13 = (i11 - i10) - length;
                if (i13 > 0) {
                    char[] cArr = this.f95493a;
                    System.arraycopy(cArr, i11, cArr, i10 + length, this.f95494b - i11);
                } else if (i13 < 0) {
                    f0(-i13, i11);
                }
                str.getChars(0, length, this.f95493a, i10);
                this.f95494b -= i13;
                return;
            }
            if (i10 == i11) {
                str.getClass();
                a0(i10, str);
                return;
            }
        }
        throw new StringIndexOutOfBoundsException();
    }

    @Override // java.lang.Appendable
    /* JADX INFO: renamed from: l, reason: merged with bridge method [inline-methods] */
    public f1 append(CharSequence charSequence) {
        if (charSequence == null) {
            y();
            return this;
        }
        if (!(charSequence instanceof f1)) {
            u(charSequence.toString());
            return this;
        }
        f1 f1Var = (f1) charSequence;
        w(f1Var.f95493a, 0, f1Var.f95494b);
        return this;
    }

    public f1 l0() {
        m0();
        return this;
    }

    @Override // java.lang.CharSequence
    public int length() {
        return this.f95494b;
    }

    @Override // java.lang.Appendable
    /* JADX INFO: renamed from: m, reason: merged with bridge method [inline-methods] */
    public f1 append(CharSequence charSequence, int i10, int i11) {
        t(charSequence, i10, i11);
        return this;
    }

    final void m0() {
        int i10 = this.f95494b;
        if (i10 < 2) {
            return;
        }
        int i11 = i10 - 1;
        char[] cArr = this.f95493a;
        char c10 = cArr[0];
        char c11 = cArr[i11];
        int i12 = i10 / 2;
        int i13 = 0;
        boolean z10 = true;
        boolean z11 = true;
        while (i13 < i12) {
            char[] cArr2 = this.f95493a;
            int i14 = i13 + 1;
            char c12 = cArr2[i14];
            int i15 = i11 - 1;
            char c13 = cArr2[i15];
            boolean z12 = z10 && c12 >= 56320 && c12 <= 57343 && c10 >= 55296 && c10 <= 56319;
            if (z12 && this.f95494b < 3) {
                return;
            }
            if (z12 == (z11 && c13 >= 55296 && c13 <= 56319 && c11 >= 56320 && c11 <= 57343)) {
                if (z12) {
                    cArr2[i11] = c12;
                    cArr2[i15] = c10;
                    cArr2[i13] = c13;
                    cArr2[i14] = c11;
                    char c14 = cArr2[i13 + 2];
                    c11 = cArr2[i11 - 2];
                    i11--;
                    c10 = c14;
                    i13 = i14;
                } else {
                    cArr2[i11] = c10;
                    cArr2[i13] = c11;
                    c10 = c12;
                    c11 = c13;
                }
                z10 = true;
                z11 = true;
            } else if (z12) {
                cArr2[i11] = c12;
                cArr2[i13] = c11;
                c11 = c13;
                z11 = true;
                z10 = false;
            } else {
                cArr2[i11] = c10;
                cArr2[i13] = c13;
                c10 = c12;
                z10 = true;
                z11 = false;
            }
            i13++;
            i11--;
        }
        if ((this.f95494b & 1) == 1) {
            if (z10 && z11) {
                return;
            }
            char[] cArr3 = this.f95493a;
            if (!z10) {
                c11 = c10;
            }
            cArr3[i11] = c11;
        }
    }

    public f1 n(Object obj) {
        if (obj == null) {
            y();
            return this;
        }
        u(obj.toString());
        return this;
    }

    public void n0(int i10, char c10) {
        if (i10 < 0 || i10 >= this.f95494b) {
            throw new StringIndexOutOfBoundsException(i10);
        }
        this.f95493a[i10] = c10;
    }

    public f1 o(String str) {
        u(str);
        return this;
    }

    public void o0(int i10) {
        if (i10 < 0) {
            throw new StringIndexOutOfBoundsException(i10);
        }
        char[] cArr = this.f95493a;
        if (i10 > cArr.length) {
            H(i10);
        } else {
            int i11 = this.f95494b;
            if (i11 < i10) {
                Arrays.fill(cArr, i11, i10, (char) 0);
            }
        }
        this.f95494b = i10;
    }

    public f1 p(boolean z10) {
        u(z10 ? com.facebook.internal.z0.P : "false");
        return this;
    }

    public String p0(int i10) {
        int i11;
        if (i10 < 0 || i10 > (i11 = this.f95494b)) {
            throw new StringIndexOutOfBoundsException(i10);
        }
        return i10 == i11 ? "" : new String(this.f95493a, i10, i11 - i10);
    }

    public f1 q(char[] cArr) {
        v(cArr);
        return this;
    }

    public String q0(int i10, int i11) {
        if (i10 < 0 || i10 > i11 || i11 > this.f95494b) {
            throw new StringIndexOutOfBoundsException();
        }
        return i10 == i11 ? "" : new String(this.f95493a, i10, i11 - i10);
    }

    public f1 r(char[] cArr, int i10, int i11) {
        w(cArr, i10, i11);
        return this;
    }

    public void r0() {
        int i10 = this.f95494b;
        char[] cArr = this.f95493a;
        if (i10 < cArr.length) {
            char[] cArr2 = new char[i10];
            System.arraycopy(cArr, 0, cArr2, 0, i10);
            this.f95493a = cArr2;
        }
    }

    final void s(char c10) {
        int i10 = this.f95494b;
        if (i10 == this.f95493a.length) {
            H(i10 + 1);
        }
        char[] cArr = this.f95493a;
        int i11 = this.f95494b;
        this.f95494b = i11 + 1;
        cArr[i11] = c10;
    }

    @Override // java.lang.CharSequence
    public CharSequence subSequence(int i10, int i11) {
        return q0(i10, i11);
    }

    final void t(CharSequence charSequence, int i10, int i11) {
        if (charSequence == null) {
            charSequence = AbstractJsonLexerKt.NULL;
        }
        if (i10 < 0 || i11 < 0 || i10 > i11 || i11 > charSequence.length()) {
            throw new IndexOutOfBoundsException();
        }
        u(charSequence.subSequence(i10, i11).toString());
    }

    @Override // java.lang.CharSequence
    public String toString() {
        int i10 = this.f95494b;
        return i10 == 0 ? "" : new String(this.f95493a, 0, i10);
    }

    final void u(String str) {
        if (str == null) {
            y();
            return;
        }
        int length = str.length();
        int i10 = this.f95494b + length;
        if (i10 > this.f95493a.length) {
            H(i10);
        }
        str.getChars(0, length, this.f95493a, this.f95494b);
        this.f95494b = i10;
    }

    final void v(char[] cArr) {
        int length = this.f95494b + cArr.length;
        if (length > this.f95493a.length) {
            H(length);
        }
        System.arraycopy(cArr, 0, this.f95493a, this.f95494b, cArr.length);
        this.f95494b = length;
    }

    final void w(char[] cArr, int i10, int i11) {
        if (i10 > cArr.length || i10 < 0) {
            throw new ArrayIndexOutOfBoundsException("Offset out of bounds: " + i10);
        }
        if (i11 < 0 || cArr.length - i10 < i11) {
            throw new ArrayIndexOutOfBoundsException("Length out of bounds: " + i11);
        }
        int i12 = this.f95494b + i11;
        if (i12 > this.f95493a.length) {
            H(i12);
        }
        System.arraycopy(cArr, i10, this.f95493a, this.f95494b, i11);
        this.f95494b = i12;
    }

    public f1 x(int i10) {
        v(Character.toChars(i10));
        return this;
    }

    final void y() {
        int i10 = this.f95494b + 4;
        if (i10 > this.f95493a.length) {
            H(i10);
        }
        char[] cArr = this.f95493a;
        int i11 = this.f95494b;
        int i12 = i11 + 1;
        this.f95494b = i12;
        cArr[i11] = 'n';
        int i13 = i11 + 2;
        this.f95494b = i13;
        cArr[i12] = AbstractJsonLexerKt.UNICODE_ESC;
        int i14 = i11 + 3;
        this.f95494b = i14;
        cArr[i13] = 'l';
        this.f95494b = i11 + 4;
        cArr[i14] = 'l';
    }

    public int z() {
        return this.f95493a.length;
    }

    public f1(int i10) {
        if (i10 < 0) {
            throw new NegativeArraySizeException();
        }
        this.f95493a = new char[i10];
    }

    public f1(CharSequence charSequence) {
        this(charSequence.toString());
    }

    public f1(f1 f1Var) {
        int i10 = f1Var.f95494b;
        this.f95494b = i10;
        char[] cArr = new char[i10 + 16];
        this.f95493a = cArr;
        System.arraycopy(f1Var.f95493a, 0, cArr, 0, i10);
    }

    public f1(String str) {
        int length = str.length();
        this.f95494b = length;
        char[] cArr = new char[length + 16];
        this.f95493a = cArr;
        str.getChars(0, length, cArr, 0);
    }
}
