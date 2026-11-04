package com.google.common.io;

import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.io.Reader;
import java.io.Writer;
import java.math.RoundingMode;
import java.util.Arrays;
import java.util.Objects;

/* JADX INFO: loaded from: classes5.dex */
@r
@com.google.common.annotations.b(emulated = true)
public abstract class b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final b f118935a = new h("base64()", "ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz0123456789+/", '=');

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static final b f118936b = new h("base64Url()", "ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz0123456789-_", '=');

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static final b f118937c = new k("base32()", "ABCDEFGHIJKLMNOPQRSTUVWXYZ234567", '=');

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private static final b f118938d = new k("base32Hex()", "0123456789ABCDEFGHIJKLMNOPQRSTUV", '=');

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private static final b f118939e = new g("base16()", "0123456789ABCDEF");

    class a extends com.google.common.io.f {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ com.google.common.io.j f118940a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ b f118941b;

        a(final b this$0, final com.google.common.io.j val$encodedSink) {
            this.f118940a = val$encodedSink;
            this.f118941b = this$0;
        }

        @Override // com.google.common.io.f
        public OutputStream c() throws IOException {
            return this.f118941b.p(this.f118940a.b());
        }
    }

    /* JADX INFO: renamed from: com.google.common.io.b$b, reason: collision with other inner class name */
    class C1086b extends com.google.common.io.g {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ com.google.common.io.k f118942a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ b f118943b;

        C1086b(final b this$0, final com.google.common.io.k val$encodedSource) {
            this.f118942a = val$encodedSource;
            this.f118943b = this$0;
        }

        @Override // com.google.common.io.g
        public InputStream m() throws IOException {
            return this.f118943b.k(this.f118942a.m());
        }
    }

    class e extends Writer {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ Appendable f118950a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ Writer f118951b;

        e(final Appendable val$separatingAppendable, final Writer val$delegate) {
            this.f118950a = val$separatingAppendable;
            this.f118951b = val$delegate;
        }

        @Override // java.io.Writer, java.io.Closeable, java.lang.AutoCloseable
        public void close() throws IOException {
            this.f118951b.close();
        }

        @Override // java.io.Writer, java.io.Flushable
        public void flush() throws IOException {
            this.f118951b.flush();
        }

        @Override // java.io.Writer
        public void write(int c10) throws IOException {
            this.f118950a.append((char) c10);
        }

        @Override // java.io.Writer
        public void write(char[] chars, int off, int len) throws IOException {
            throw new UnsupportedOperationException();
        }
    }

    static final class f {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final String f118952a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private final char[] f118953b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final int f118954c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        final int f118955d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        final int f118956e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        final int f118957f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        private final byte[] f118958g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        private final boolean[] f118959h;

        /* JADX INFO: renamed from: i, reason: collision with root package name */
        private final boolean f118960i;

        f(String name, char[] chars) {
            this(name, chars, c(chars), false);
        }

        private static byte[] c(char[] chars) {
            byte[] bArr = new byte[128];
            Arrays.fill(bArr, (byte) -1);
            for (int i10 = 0; i10 < chars.length; i10++) {
                char c10 = chars[i10];
                boolean z10 = true;
                com.google.common.base.j0.f(c10 < 128, "Non-ASCII character: %s", c10);
                if (bArr[c10] != -1) {
                    z10 = false;
                }
                com.google.common.base.j0.f(z10, "Duplicate character: %s", c10);
                bArr[c10] = (byte) i10;
            }
            return bArr;
        }

        private boolean f() {
            for (char c10 : this.f118953b) {
                if (com.google.common.base.c.c(c10)) {
                    return true;
                }
            }
            return false;
        }

        private boolean g() {
            for (char c10 : this.f118953b) {
                if (com.google.common.base.c.d(c10)) {
                    return true;
                }
            }
            return false;
        }

        boolean b(char ch2) {
            if (ch2 > 127 || this.f118958g[ch2] == -1) {
                return false;
            }
            int i10 = 7 ^ 1;
            return true;
        }

        int d(char ch2) throws i {
            if (ch2 > 127) {
                throw new i("Unrecognized character: 0x" + Integer.toHexString(ch2));
            }
            byte b10 = this.f118958g[ch2];
            if (b10 != -1) {
                return b10;
            }
            if (ch2 <= ' ' || ch2 == 127) {
                throw new i("Unrecognized character: 0x" + Integer.toHexString(ch2));
            }
            throw new i("Unrecognized character: " + ch2);
        }

        char e(int bits) {
            return this.f118953b[bits];
        }

        public boolean equals(@fj.a Object other) {
            if (other instanceof f) {
                f fVar = (f) other;
                if (this.f118960i == fVar.f118960i && Arrays.equals(this.f118953b, fVar.f118953b)) {
                    return true;
                }
            }
            return false;
        }

        f h() {
            if (this.f118960i) {
                return this;
            }
            byte[] bArr = this.f118958g;
            byte[] bArrCopyOf = Arrays.copyOf(bArr, bArr.length);
            int i10 = 65;
            while (true) {
                if (i10 > 90) {
                    return new f(this.f118952a + ".ignoreCase()", this.f118953b, bArrCopyOf, true);
                }
                int i11 = i10 | 32;
                byte[] bArr2 = this.f118958g;
                byte b10 = bArr2[i10];
                byte b11 = bArr2[i11];
                if (b10 == -1) {
                    bArrCopyOf[i10] = b11;
                } else {
                    com.google.common.base.j0.j0(b11 == -1, "Can't ignoreCase() since '%s' and '%s' encode different values", (char) i10, (char) i11);
                    bArrCopyOf[i11] = b10;
                }
                i10++;
            }
        }

        public int hashCode() {
            return Arrays.hashCode(this.f118953b) + (this.f118960i ? 1231 : 1237);
        }

        boolean i(int index) {
            return this.f118959h[index % this.f118956e];
        }

        f j() {
            if (!g()) {
                return this;
            }
            com.google.common.base.j0.h0(!f(), "Cannot call lowerCase() on a mixed-case alphabet");
            char[] cArr = new char[this.f118953b.length];
            int i10 = 0;
            while (true) {
                char[] cArr2 = this.f118953b;
                if (i10 >= cArr2.length) {
                    break;
                }
                cArr[i10] = com.google.common.base.c.e(cArr2[i10]);
                i10++;
            }
            f fVar = new f(this.f118952a + ".lowerCase()", cArr);
            return this.f118960i ? fVar.h() : fVar;
        }

        public boolean k(char c10) {
            byte[] bArr = this.f118958g;
            return c10 < bArr.length && bArr[c10] != -1;
        }

        f l() {
            if (!f()) {
                return this;
            }
            com.google.common.base.j0.h0(!g(), "Cannot call upperCase() on a mixed-case alphabet");
            char[] cArr = new char[this.f118953b.length];
            int i10 = 0;
            while (true) {
                char[] cArr2 = this.f118953b;
                if (i10 >= cArr2.length) {
                    break;
                }
                cArr[i10] = com.google.common.base.c.h(cArr2[i10]);
                i10++;
            }
            f fVar = new f(this.f118952a + ".upperCase()", cArr);
            return this.f118960i ? fVar.h() : fVar;
        }

        public String toString() {
            return this.f118952a;
        }

        private f(String name, char[] chars, byte[] decodabet, boolean ignoreCase) {
            this.f118952a = (String) com.google.common.base.j0.E(name);
            this.f118953b = (char[]) com.google.common.base.j0.E(chars);
            try {
                int iP = com.google.common.math.f.p(chars.length, RoundingMode.UNNECESSARY);
                this.f118955d = iP;
                int iNumberOfTrailingZeros = Integer.numberOfTrailingZeros(iP);
                int i10 = 1 << (3 - iNumberOfTrailingZeros);
                this.f118956e = i10;
                this.f118957f = iP >> iNumberOfTrailingZeros;
                this.f118954c = chars.length - 1;
                this.f118958g = decodabet;
                boolean[] zArr = new boolean[i10];
                for (int i11 = 0; i11 < this.f118957f; i11++) {
                    zArr[com.google.common.math.f.g(i11 * 8, this.f118955d, RoundingMode.CEILING)] = true;
                }
                this.f118959h = zArr;
                this.f118960i = ignoreCase;
            } catch (ArithmeticException e10) {
                throw new IllegalArgumentException("Illegal alphabet length " + chars.length, e10);
            }
        }
    }

    private static final class g extends k {

        /* JADX INFO: renamed from: k, reason: collision with root package name */
        final char[] f118961k;

        g(String name, String alphabetChars) {
            this(new f(name, alphabetChars.toCharArray()));
        }

        @Override // com.google.common.io.b.k
        b E(f alphabet, @fj.a Character paddingChar) {
            return new g(alphabet);
        }

        @Override // com.google.common.io.b.k, com.google.common.io.b
        int i(byte[] target, CharSequence chars) throws i {
            com.google.common.base.j0.E(target);
            if (chars.length() % 2 == 1) {
                throw new i("Invalid input length " + chars.length());
            }
            int i10 = 0;
            int i11 = 0;
            while (i10 < chars.length()) {
                target[i11] = (byte) ((this.f118965f.d(chars.charAt(i10)) << 4) | this.f118965f.d(chars.charAt(i10 + 1)));
                i10 += 2;
                i11++;
            }
            return i11;
        }

        @Override // com.google.common.io.b.k, com.google.common.io.b
        void n(Appendable target, byte[] bytes, int off, int len) throws IOException {
            com.google.common.base.j0.E(target);
            com.google.common.base.j0.f0(off, off + len, bytes.length);
            for (int i10 = 0; i10 < len; i10++) {
                int i11 = bytes[off + i10] & 255;
                target.append(this.f118961k[i11]);
                target.append(this.f118961k[i11 | 256]);
            }
        }

        private g(f alphabet) {
            super(alphabet, null);
            this.f118961k = new char[512];
            com.google.common.base.j0.d(alphabet.f118953b.length == 16);
            for (int i10 = 0; i10 < 256; i10++) {
                this.f118961k[i10] = alphabet.e(i10 >>> 4);
                this.f118961k[i10 | 256] = alphabet.e(i10 & 15);
            }
        }
    }

    private static final class h extends k {
        h(String name, String alphabetChars, @fj.a Character paddingChar) {
            this(new f(name, alphabetChars.toCharArray()), paddingChar);
        }

        @Override // com.google.common.io.b.k
        b E(f alphabet, @fj.a Character paddingChar) {
            return new h(alphabet, paddingChar);
        }

        @Override // com.google.common.io.b.k, com.google.common.io.b
        int i(byte[] target, CharSequence chars) throws i {
            com.google.common.base.j0.E(target);
            CharSequence charSequenceZ = z(chars);
            if (!this.f118965f.i(charSequenceZ.length())) {
                throw new i("Invalid input length " + charSequenceZ.length());
            }
            int i10 = 0;
            int i11 = 0;
            while (i10 < charSequenceZ.length()) {
                int i12 = i10 + 2;
                int iD = (this.f118965f.d(charSequenceZ.charAt(i10)) << 18) | (this.f118965f.d(charSequenceZ.charAt(i10 + 1)) << 12);
                int i13 = i11 + 1;
                target[i11] = (byte) (iD >>> 16);
                if (i12 < charSequenceZ.length()) {
                    int i14 = i10 + 3;
                    int iD2 = iD | (this.f118965f.d(charSequenceZ.charAt(i12)) << 6);
                    int i15 = i11 + 2;
                    target[i13] = (byte) ((iD2 >>> 8) & 255);
                    if (i14 < charSequenceZ.length()) {
                        i10 += 4;
                        i11 += 3;
                        target[i15] = (byte) ((iD2 | this.f118965f.d(charSequenceZ.charAt(i14))) & 255);
                    } else {
                        i11 = i15;
                        i10 = i14;
                    }
                } else {
                    i11 = i13;
                    i10 = i12;
                }
            }
            return i11;
        }

        @Override // com.google.common.io.b.k, com.google.common.io.b
        void n(Appendable target, byte[] bytes, int off, int len) throws IOException {
            com.google.common.base.j0.E(target);
            int i10 = off + len;
            com.google.common.base.j0.f0(off, i10, bytes.length);
            while (len >= 3) {
                int i11 = off + 2;
                int i12 = ((bytes[off + 1] & 255) << 8) | ((bytes[off] & 255) << 16);
                off += 3;
                int i13 = i12 | (bytes[i11] & 255);
                target.append(this.f118965f.e(i13 >>> 18));
                target.append(this.f118965f.e((i13 >>> 12) & 63));
                target.append(this.f118965f.e((i13 >>> 6) & 63));
                target.append(this.f118965f.e(i13 & 63));
                len -= 3;
            }
            if (off < i10) {
                D(target, bytes, off, i10 - off);
            }
        }

        private h(f alphabet, @fj.a Character paddingChar) {
            super(alphabet, paddingChar);
            com.google.common.base.j0.d(alphabet.f118953b.length == 64);
        }
    }

    public static final class i extends IOException {
        i(String message) {
            super(message);
        }
    }

    static final class j extends b {

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        private final b f118962f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        private final String f118963g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        private final int f118964h;

        j(b delegate, String separator, int afterEveryChars) {
            this.f118962f = (b) com.google.common.base.j0.E(delegate);
            this.f118963g = (String) com.google.common.base.j0.E(separator);
            this.f118964h = afterEveryChars;
            com.google.common.base.j0.k(afterEveryChars > 0, "Cannot add a separator after every %s chars", afterEveryChars);
        }

        @Override // com.google.common.io.b
        public b A() {
            return this.f118962f.A().C(this.f118963g, this.f118964h);
        }

        @Override // com.google.common.io.b
        public b B(char padChar) {
            return this.f118962f.B(padChar).C(this.f118963g, this.f118964h);
        }

        @Override // com.google.common.io.b
        public b C(String separator, int afterEveryChars) {
            throw new UnsupportedOperationException("Already have a separator");
        }

        @Override // com.google.common.io.b
        public boolean f(CharSequence chars) {
            StringBuilder sb2 = new StringBuilder();
            for (int i10 = 0; i10 < chars.length(); i10++) {
                char cCharAt = chars.charAt(i10);
                if (this.f118963g.indexOf(cCharAt) < 0) {
                    sb2.append(cCharAt);
                }
            }
            return this.f118962f.f(sb2);
        }

        @Override // com.google.common.io.b
        int i(byte[] target, CharSequence chars) throws i {
            StringBuilder sb2 = new StringBuilder(chars.length());
            for (int i10 = 0; i10 < chars.length(); i10++) {
                char cCharAt = chars.charAt(i10);
                if (this.f118963g.indexOf(cCharAt) < 0) {
                    sb2.append(cCharAt);
                }
            }
            return this.f118962f.i(target, sb2);
        }

        @Override // com.google.common.io.b
        @com.google.common.annotations.c
        @com.google.common.annotations.d
        public InputStream k(Reader reader) {
            return this.f118962f.k(b.s(reader, this.f118963g));
        }

        @Override // com.google.common.io.b
        void n(Appendable target, byte[] bytes, int off, int len) throws IOException {
            this.f118962f.n(b.x(target, this.f118963g, this.f118964h), bytes, off, len);
        }

        @Override // com.google.common.io.b
        @com.google.common.annotations.c
        @com.google.common.annotations.d
        public OutputStream p(Writer output) {
            return this.f118962f.p(b.y(output, this.f118963g, this.f118964h));
        }

        @Override // com.google.common.io.b
        public b r() {
            return this.f118962f.r().C(this.f118963g, this.f118964h);
        }

        @Override // com.google.common.io.b
        public b t() {
            return this.f118962f.t().C(this.f118963g, this.f118964h);
        }

        public String toString() {
            return this.f118962f + ".withSeparator(\"" + this.f118963g + "\", " + this.f118964h + ")";
        }

        @Override // com.google.common.io.b
        int u(int chars) {
            return this.f118962f.u(chars);
        }

        @Override // com.google.common.io.b
        int v(int bytes) {
            int iV = this.f118962f.v(bytes);
            return iV + (this.f118963g.length() * com.google.common.math.f.g(Math.max(0, iV - 1), this.f118964h, RoundingMode.FLOOR));
        }

        @Override // com.google.common.io.b
        public b w() {
            return this.f118962f.w().C(this.f118963g, this.f118964h);
        }

        @Override // com.google.common.io.b
        CharSequence z(CharSequence chars) {
            return this.f118962f.z(chars);
        }
    }

    private static class k extends b {

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        final f f118965f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        @fj.a
        final Character f118966g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        @a8.b
        @fj.a
        private volatile b f118967h;

        /* JADX INFO: renamed from: i, reason: collision with root package name */
        @a8.b
        @fj.a
        private volatile b f118968i;

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        @a8.b
        @fj.a
        private volatile b f118969j;

        class a extends OutputStream {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            int f118970a = 0;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            int f118971b = 0;

            /* JADX INFO: renamed from: c, reason: collision with root package name */
            int f118972c = 0;

            /* JADX INFO: renamed from: d, reason: collision with root package name */
            final /* synthetic */ Writer f118973d;

            /* JADX INFO: renamed from: e, reason: collision with root package name */
            final /* synthetic */ k f118974e;

            a(final k this$0, final Writer val$out) {
                this.f118973d = val$out;
                this.f118974e = this$0;
            }

            @Override // java.io.OutputStream, java.io.Closeable, java.lang.AutoCloseable
            public void close() throws IOException {
                int i10 = this.f118971b;
                if (i10 > 0) {
                    int i11 = this.f118970a;
                    f fVar = this.f118974e.f118965f;
                    this.f118973d.write(fVar.e((i11 << (fVar.f118955d - i10)) & fVar.f118954c));
                    this.f118972c++;
                    if (this.f118974e.f118966g != null) {
                        while (true) {
                            int i12 = this.f118972c;
                            k kVar = this.f118974e;
                            if (i12 % kVar.f118965f.f118956e == 0) {
                                break;
                            }
                            this.f118973d.write(kVar.f118966g.charValue());
                            this.f118972c++;
                        }
                    }
                }
                this.f118973d.close();
            }

            @Override // java.io.OutputStream, java.io.Flushable
            public void flush() throws IOException {
                this.f118973d.flush();
            }

            @Override // java.io.OutputStream
            public void write(int b10) throws IOException {
                this.f118970a = (b10 & 255) | (this.f118970a << 8);
                this.f118971b += 8;
                while (true) {
                    int i10 = this.f118971b;
                    f fVar = this.f118974e.f118965f;
                    int i11 = fVar.f118955d;
                    if (i10 < i11) {
                        return;
                    }
                    this.f118973d.write(fVar.e((this.f118970a >> (i10 - i11)) & fVar.f118954c));
                    this.f118972c++;
                    this.f118971b -= this.f118974e.f118965f.f118955d;
                }
            }
        }

        k(String name, String alphabetChars, @fj.a Character paddingChar) {
            this(new f(name, alphabetChars.toCharArray()), paddingChar);
        }

        @Override // com.google.common.io.b
        public b A() {
            b bVarE = this.f118967h;
            if (bVarE == null) {
                f fVarL = this.f118965f.l();
                bVarE = fVarL == this.f118965f ? this : E(fVarL, this.f118966g);
                this.f118967h = bVarE;
            }
            return bVarE;
        }

        /* JADX WARN: Multi-variable type inference failed */
        /* JADX WARN: Type inference failed for: r3v1, types: [com.google.common.io.b] */
        /* JADX WARN: Type inference failed for: r3v3 */
        /* JADX WARN: Type inference failed for: r3v4 */
        /* JADX WARN: Type inference failed for: r3v5 */
        @Override // com.google.common.io.b
        public b B(char c10) {
            Character ch2;
            int i10 = 8 % this.f118965f.f118955d;
            ?? E = this;
            if (i10 != 0 && ((ch2 = this.f118966g) == null || ch2.charValue() != c10)) {
                this = this;
                E = E(this.f118965f, Character.valueOf(c10));
            }
            this = this;
            return E;
        }

        @Override // com.google.common.io.b
        public b C(String separator, int afterEveryChars) {
            for (int i10 = 0; i10 < separator.length(); i10++) {
                com.google.common.base.j0.u(!this.f118965f.k(separator.charAt(i10)), "Separator (%s) cannot contain alphabet characters", separator);
            }
            Character ch2 = this.f118966g;
            if (ch2 != null) {
                com.google.common.base.j0.u(separator.indexOf(ch2.charValue()) < 0, "Separator (%s) cannot contain padding character", separator);
            }
            return new j(this, separator, afterEveryChars);
        }

        void D(Appendable target, byte[] bytes, int off, int len) throws IOException {
            com.google.common.base.j0.E(target);
            com.google.common.base.j0.f0(off, off + len, bytes.length);
            int i10 = 0;
            com.google.common.base.j0.d(len <= this.f118965f.f118957f);
            long j10 = 0;
            for (int i11 = 0; i11 < len; i11++) {
                j10 = (j10 | ((long) (bytes[off + i11] & 255))) << 8;
            }
            int i12 = ((len + 1) * 8) - this.f118965f.f118955d;
            while (i10 < len * 8) {
                f fVar = this.f118965f;
                target.append(fVar.e(((int) (j10 >>> (i12 - i10))) & fVar.f118954c));
                i10 += this.f118965f.f118955d;
            }
            if (this.f118966g != null) {
                while (i10 < this.f118965f.f118957f * 8) {
                    target.append(this.f118966g.charValue());
                    i10 += this.f118965f.f118955d;
                }
            }
        }

        b E(f alphabet, @fj.a Character paddingChar) {
            return new k(alphabet, paddingChar);
        }

        public boolean equals(@fj.a Object other) {
            if (other instanceof k) {
                k kVar = (k) other;
                if (this.f118965f.equals(kVar.f118965f) && Objects.equals(this.f118966g, kVar.f118966g)) {
                    return true;
                }
            }
            return false;
        }

        @Override // com.google.common.io.b
        public boolean f(CharSequence chars) {
            com.google.common.base.j0.E(chars);
            CharSequence charSequenceZ = z(chars);
            if (!this.f118965f.i(charSequenceZ.length())) {
                return false;
            }
            for (int i10 = 0; i10 < charSequenceZ.length(); i10++) {
                if (!this.f118965f.b(charSequenceZ.charAt(i10))) {
                    return false;
                }
            }
            return true;
        }

        public int hashCode() {
            return Objects.hashCode(this.f118966g) ^ this.f118965f.hashCode();
        }

        @Override // com.google.common.io.b
        int i(byte[] target, CharSequence chars) throws i {
            f fVar;
            com.google.common.base.j0.E(target);
            CharSequence charSequenceZ = z(chars);
            if (!this.f118965f.i(charSequenceZ.length())) {
                throw new i("Invalid input length " + charSequenceZ.length());
            }
            int i10 = 0;
            int i11 = 0;
            while (i10 < charSequenceZ.length()) {
                long jD = 0;
                int i12 = 0;
                int i13 = 0;
                while (true) {
                    fVar = this.f118965f;
                    if (i12 >= fVar.f118956e) {
                        break;
                    }
                    jD <<= fVar.f118955d;
                    if (i10 + i12 < charSequenceZ.length()) {
                        jD |= (long) this.f118965f.d(charSequenceZ.charAt(i13 + i10));
                        i13++;
                    }
                    i12++;
                }
                int i14 = fVar.f118957f;
                int i15 = (i14 * 8) - (i13 * fVar.f118955d);
                int i16 = (i14 - 1) * 8;
                while (i16 >= i15) {
                    target[i11] = (byte) ((jD >>> i16) & 255);
                    i16 -= 8;
                    i11++;
                }
                i10 += this.f118965f.f118956e;
            }
            return i11;
        }

        @Override // com.google.common.io.b
        @com.google.common.annotations.c
        @com.google.common.annotations.d
        public InputStream k(Reader reader) {
            com.google.common.base.j0.E(reader);
            return new C1087b(this, reader);
        }

        @Override // com.google.common.io.b
        void n(Appendable target, byte[] bytes, int off, int len) throws IOException {
            com.google.common.base.j0.E(target);
            com.google.common.base.j0.f0(off, off + len, bytes.length);
            int i10 = 0;
            while (i10 < len) {
                D(target, bytes, off + i10, Math.min(this.f118965f.f118957f, len - i10));
                i10 += this.f118965f.f118957f;
            }
        }

        @Override // com.google.common.io.b
        @com.google.common.annotations.c
        @com.google.common.annotations.d
        public OutputStream p(Writer out) {
            com.google.common.base.j0.E(out);
            return new a(this, out);
        }

        @Override // com.google.common.io.b
        public b r() {
            b bVarE = this.f118969j;
            if (bVarE == null) {
                f fVarH = this.f118965f.h();
                bVarE = fVarH == this.f118965f ? this : E(fVarH, this.f118966g);
                this.f118969j = bVarE;
            }
            return bVarE;
        }

        @Override // com.google.common.io.b
        public b t() {
            b bVarE = this.f118968i;
            if (bVarE == null) {
                f fVarJ = this.f118965f.j();
                bVarE = fVarJ == this.f118965f ? this : E(fVarJ, this.f118966g);
                this.f118968i = bVarE;
            }
            return bVarE;
        }

        public String toString() {
            StringBuilder sb2 = new StringBuilder("BaseEncoding.");
            sb2.append(this.f118965f);
            if (8 % this.f118965f.f118955d != 0) {
                if (this.f118966g == null) {
                    sb2.append(".omitPadding()");
                } else {
                    sb2.append(".withPadChar('");
                    sb2.append(this.f118966g);
                    sb2.append("')");
                }
            }
            return sb2.toString();
        }

        @Override // com.google.common.io.b
        int u(int chars) {
            return (int) (((((long) this.f118965f.f118955d) * ((long) chars)) + 7) / 8);
        }

        @Override // com.google.common.io.b
        int v(int bytes) {
            f fVar = this.f118965f;
            return fVar.f118956e * com.google.common.math.f.g(bytes, fVar.f118957f, RoundingMode.CEILING);
        }

        @Override // com.google.common.io.b
        public b w() {
            return this.f118966g == null ? this : E(this.f118965f, null);
        }

        @Override // com.google.common.io.b
        CharSequence z(CharSequence chars) {
            com.google.common.base.j0.E(chars);
            Character ch2 = this.f118966g;
            if (ch2 == null) {
                return chars;
            }
            char cCharValue = ch2.charValue();
            int length = chars.length() - 1;
            while (length >= 0 && chars.charAt(length) == cCharValue) {
                length--;
            }
            return chars.subSequence(0, length + 1);
        }

        k(f alphabet, @fj.a Character paddingChar) {
            this.f118965f = (f) com.google.common.base.j0.E(alphabet);
            com.google.common.base.j0.u(paddingChar == null || !alphabet.k(paddingChar.charValue()), "Padding character %s was already in alphabet", paddingChar);
            this.f118966g = paddingChar;
        }

        /* JADX INFO: renamed from: com.google.common.io.b$k$b, reason: collision with other inner class name */
        class C1087b extends InputStream {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            int f118975a = 0;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            int f118976b = 0;

            /* JADX INFO: renamed from: c, reason: collision with root package name */
            int f118977c = 0;

            /* JADX INFO: renamed from: d, reason: collision with root package name */
            boolean f118978d = false;

            /* JADX INFO: renamed from: e, reason: collision with root package name */
            final /* synthetic */ Reader f118979e;

            /* JADX INFO: renamed from: f, reason: collision with root package name */
            final /* synthetic */ k f118980f;

            C1087b(final k this$0, final Reader val$reader) {
                this.f118979e = val$reader;
                this.f118980f = this$0;
            }

            @Override // java.io.InputStream, java.io.Closeable, java.lang.AutoCloseable
            public void close() throws IOException {
                this.f118979e.close();
            }

            @Override // java.io.InputStream
            public int read() throws IOException {
                int i10;
                while (true) {
                    int i11 = this.f118979e.read();
                    if (i11 == -1) {
                        if (!this.f118978d && !this.f118980f.f118965f.i(this.f118977c)) {
                            throw new i("Invalid input length " + this.f118977c);
                        }
                        return -1;
                    }
                    this.f118977c++;
                    char c10 = (char) i11;
                    Character ch2 = this.f118980f.f118966g;
                    if (ch2 == null || ch2.charValue() != c10) {
                        if (this.f118978d) {
                            throw new i("Expected padding character but found '" + c10 + "' at index " + this.f118977c);
                        }
                        int i12 = this.f118975a;
                        f fVar = this.f118980f.f118965f;
                        int i13 = i12 << fVar.f118955d;
                        this.f118975a = i13;
                        int iD = fVar.d(c10) | i13;
                        this.f118975a = iD;
                        int i14 = this.f118976b + this.f118980f.f118965f.f118955d;
                        this.f118976b = i14;
                        if (i14 >= 8) {
                            int i15 = i14 - 8;
                            this.f118976b = i15;
                            return (iD >> i15) & 255;
                        }
                    } else {
                        if (!this.f118978d && ((i10 = this.f118977c) == 1 || !this.f118980f.f118965f.i(i10 - 1))) {
                            throw new i("Padding cannot start at index " + this.f118977c);
                        }
                        this.f118978d = true;
                    }
                }
            }

            @Override // java.io.InputStream
            public int read(byte[] buf, int off, int len) throws IOException {
                int i10 = len + off;
                com.google.common.base.j0.f0(off, i10, buf.length);
                int i11 = off;
                while (i11 < i10) {
                    int i12 = read();
                    if (i12 == -1) {
                        int i13 = i11 - off;
                        if (i13 == 0) {
                            return -1;
                        }
                        return i13;
                    }
                    buf[i11] = (byte) i12;
                    i11++;
                }
                return i11 - off;
            }
        }
    }

    b() {
    }

    public static b a() {
        return f118939e;
    }

    public static b b() {
        return f118937c;
    }

    public static b c() {
        return f118938d;
    }

    public static b d() {
        return f118935a;
    }

    public static b e() {
        return f118936b;
    }

    private static byte[] q(byte[] result, int length) {
        if (length == result.length) {
            return result;
        }
        byte[] bArr = new byte[length];
        System.arraycopy(result, 0, bArr, 0, length);
        return bArr;
    }

    @com.google.common.annotations.c
    @com.google.common.annotations.d
    static Reader s(Reader delegate, String toIgnore) {
        com.google.common.base.j0.E(delegate);
        com.google.common.base.j0.E(toIgnore);
        return new c(delegate, toIgnore);
    }

    static Appendable x(Appendable delegate, String separator, int afterEveryChars) {
        com.google.common.base.j0.E(delegate);
        com.google.common.base.j0.E(separator);
        com.google.common.base.j0.d(afterEveryChars > 0);
        return new d(afterEveryChars, delegate, separator);
    }

    @com.google.common.annotations.c
    @com.google.common.annotations.d
    static Writer y(Writer delegate, String separator, int afterEveryChars) {
        return new e(x(delegate, separator, afterEveryChars), delegate);
    }

    public abstract b A();

    public abstract b B(char padChar);

    public abstract b C(String separator, int n10);

    public abstract boolean f(CharSequence chars);

    public final byte[] g(CharSequence chars) {
        try {
            return h(chars);
        } catch (i e10) {
            throw new IllegalArgumentException(e10);
        }
    }

    final byte[] h(CharSequence chars) throws i {
        CharSequence charSequenceZ = z(chars);
        byte[] bArr = new byte[u(charSequenceZ.length())];
        return q(bArr, i(bArr, charSequenceZ));
    }

    abstract int i(byte[] target, CharSequence chars) throws i;

    @com.google.common.annotations.c
    @com.google.common.annotations.d
    public final com.google.common.io.g j(com.google.common.io.k encodedSource) {
        com.google.common.base.j0.E(encodedSource);
        return new C1086b(this, encodedSource);
    }

    @com.google.common.annotations.c
    @com.google.common.annotations.d
    public abstract InputStream k(Reader reader);

    public String l(byte[] bytes) {
        return m(bytes, 0, bytes.length);
    }

    public final String m(byte[] bytes, int off, int len) {
        com.google.common.base.j0.f0(off, off + len, bytes.length);
        StringBuilder sb2 = new StringBuilder(v(len));
        try {
            n(sb2, bytes, off, len);
            return sb2.toString();
        } catch (IOException e10) {
            throw new AssertionError(e10);
        }
    }

    abstract void n(Appendable target, byte[] bytes, int off, int len) throws IOException;

    @com.google.common.annotations.c
    @com.google.common.annotations.d
    public final com.google.common.io.f o(com.google.common.io.j encodedSink) {
        com.google.common.base.j0.E(encodedSink);
        return new a(this, encodedSink);
    }

    @com.google.common.annotations.c
    @com.google.common.annotations.d
    public abstract OutputStream p(Writer writer);

    public abstract b r();

    public abstract b t();

    abstract int u(int chars);

    abstract int v(int bytes);

    public abstract b w();

    CharSequence z(CharSequence chars) {
        return (CharSequence) com.google.common.base.j0.E(chars);
    }

    class c extends Reader {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ Reader f118944a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ String f118945b;

        c(final Reader val$delegate, final String val$toIgnore) {
            this.f118944a = val$delegate;
            this.f118945b = val$toIgnore;
        }

        @Override // java.io.Reader, java.io.Closeable, java.lang.AutoCloseable
        public void close() throws IOException {
            this.f118944a.close();
        }

        @Override // java.io.Reader
        public int read() throws IOException {
            int i10;
            do {
                i10 = this.f118944a.read();
                if (i10 == -1) {
                    break;
                }
            } while (this.f118945b.indexOf((char) i10) >= 0);
            return i10;
        }

        @Override // java.io.Reader
        public int read(char[] cbuf, int off, int len) throws IOException {
            throw new UnsupportedOperationException();
        }
    }

    class d implements Appendable {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        int f118946a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ int f118947b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ Appendable f118948c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        final /* synthetic */ String f118949d;

        d(final int val$afterEveryChars, final Appendable val$delegate, final String val$separator) {
            this.f118947b = val$afterEveryChars;
            this.f118948c = val$delegate;
            this.f118949d = val$separator;
            this.f118946a = val$afterEveryChars;
        }

        @Override // java.lang.Appendable
        public Appendable append(char c10) throws IOException {
            if (this.f118946a == 0) {
                this.f118948c.append(this.f118949d);
                this.f118946a = this.f118947b;
            }
            this.f118948c.append(c10);
            this.f118946a--;
            return this;
        }

        @Override // java.lang.Appendable
        public Appendable append(@fj.a CharSequence chars, int off, int len) {
            throw new UnsupportedOperationException();
        }

        @Override // java.lang.Appendable
        public Appendable append(@fj.a CharSequence chars) {
            throw new UnsupportedOperationException();
        }
    }
}
