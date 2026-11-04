package androidx.media2.widget;

import android.text.SpannableStringBuilder;
import android.text.TextPaint;
import android.text.style.CharacterStyle;
import android.text.style.StyleSpan;
import android.text.style.UnderlineSpan;
import android.text.style.UpdateAppearance;
import android.util.Log;
import androidx.annotation.NonNull;
import java.util.ArrayList;
import java.util.Arrays;

/* JADX INFO: loaded from: classes.dex */
class d {
    private static final char A = 160;
    private static final int B = 1;
    private static final int C = 2;
    private static final int D = 3;
    private static final int E = 4;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public static final int f59608h = 15;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public static final int f59609i = 32;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private static final String f59610j = "Cea608CCParser";

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private static final boolean f59611k = Log.isLoggable(f59610j, 3);

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private static final int f59612l = -1;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private static final int f59613m = 32;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private static final int f59614n = 33;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    private static final int f59615o = 36;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    private static final int f59616p = 37;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    private static final int f59617q = 38;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    private static final int f59618r = 39;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    private static final int f59619s = 40;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    private static final int f59620t = 41;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    private static final int f59621u = 42;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    private static final int f59622v = 43;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    private static final int f59623w = 44;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    private static final int f59624x = 45;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    private static final int f59625y = 46;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    private static final int f59626z = 47;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final InterfaceC0558d f59627a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private int f59628b = 1;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private int f59629c = 4;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private int f59630d = -1;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private c f59631e = new c();

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private c f59632f = new c();

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private c f59633g = new c();

    private static class a {

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private static final String[] f59634d = {"RCL", "BS", "AOF", "AON", "DER", "RU2", "RU3", "RU4", "FON", "RDC", "TR", "RTD", "EDM", "CR", "ENM", "EOC"};

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        private static final String[] f59635e = {"®", "°", "½", "¿", "™", "¢", "£", "♪", "à", " ", "è", "â", "ê", "î", "ô", "û"};

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        private static final String[] f59636f = {"Á", "É", "Ó", "Ú", "Ü", "ü", "‘", "¡", "*", "'", "—", "©", "℠", "•", "“", "”", "À", "Â", "Ç", "È", "Ê", "Ë", "ë", "Î", "Ï", "ï", "Ô", "Ù", "ù", "Û", "«", "»"};

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        private static final String[] f59637g = {"Ã", "ã", "Í", "Ì", "ì", "Ò", "ò", "Õ", "õ", "{", "}", "\\", "^", "_", "|", "~", "Ä", "ä", "Ö", "ö", "ß", "¥", "¤", "│", "Å", "å", "Ø", "ø", "┌", "┐", "└", "┘"};

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final byte f59638a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private final byte f59639b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private final byte f59640c;

        a(byte b10, byte b11, byte b12) {
            this.f59638a = b10;
            this.f59639b = b11;
            this.f59640c = b12;
        }

        private String a(int i10) {
            return f59634d[i10 - 32];
        }

        static a[] b(byte[] bArr) {
            int length = bArr.length / 3;
            a[] aVarArr = new a[length];
            for (int i10 = 0; i10 < length; i10++) {
                int i11 = i10 * 3;
                aVarArr[i10] = new a(bArr[i11], bArr[i11 + 1], bArr[i11 + 2]);
            }
            return aVarArr;
        }

        private char c(byte b10) {
            if (b10 == 42) {
                return (char) 225;
            }
            if (b10 == 92) {
                return (char) 233;
            }
            switch (b10) {
                case com.planner5d.library.engine.input.f.b.f160703k1 /* 94 */:
                    return (char) 237;
                case com.planner5d.library.engine.input.f.b.f160706l1 /* 95 */:
                    return (char) 243;
                case 96:
                    return (char) 250;
                default:
                    switch (b10) {
                        case 123:
                            return (char) 231;
                        case 124:
                            return (char) 247;
                        case 125:
                            return (char) 209;
                        case okhttp3.internal.ws.g.f334652s /* 126 */:
                            return (char) 241;
                        case 127:
                            return (char) 9608;
                        default:
                            return (char) b10;
                    }
            }
        }

        private String d() {
            byte b10 = this.f59639b;
            if (b10 < 32 || b10 > 127) {
                return null;
            }
            StringBuilder sb2 = new StringBuilder(2);
            sb2.append(c(this.f59639b));
            byte b11 = this.f59640c;
            if (b11 >= 32 && b11 <= 127) {
                sb2.append(c(b11));
            }
            return sb2.toString();
        }

        private String g() {
            byte b10;
            byte b11;
            byte b12 = this.f59639b;
            if ((b12 == 18 || b12 == 26) && (b10 = this.f59640c) >= 32 && b10 <= 63) {
                return f59636f[b10 - 32];
            }
            if ((b12 == 19 || b12 == 27) && (b11 = this.f59640c) >= 32 && b11 <= 63) {
                return f59637g[b11 - 32];
            }
            return null;
        }

        private String j() {
            byte b10;
            byte b11 = this.f59639b;
            if ((b11 == 17 || b11 == 25) && (b10 = this.f59640c) >= 48 && b10 <= 63) {
                return f59635e[b10 - 48];
            }
            return null;
        }

        private boolean l() {
            byte b10 = this.f59639b;
            return b10 >= 32 && b10 <= 127;
        }

        private boolean o() {
            byte b10;
            byte b11 = this.f59639b;
            return (b11 == 17 || b11 == 25) && (b10 = this.f59640c) >= 48 && b10 <= 63;
        }

        int e() {
            byte b10;
            byte b11 = this.f59639b;
            if ((b11 == 20 || b11 == 28) && (b10 = this.f59640c) >= 32 && b10 <= 47) {
                return b10;
            }
            return -1;
        }

        String f() {
            String strD = d();
            return (strD == null && (strD = j()) == null) ? g() : strD;
        }

        g h() {
            byte b10;
            byte b11 = this.f59639b;
            if ((b11 == 17 || b11 == 25) && (b10 = this.f59640c) >= 32 && b10 <= 47) {
                return g.a(b10);
            }
            return null;
        }

        f i() {
            byte b10 = this.f59639b;
            if ((b10 & 112) != 16) {
                return null;
            }
            byte b11 = this.f59640c;
            if ((b11 & com.google.common.primitives.t.f119782a) != 64) {
                return null;
            }
            if ((b10 & 7) != 0 || (b11 & 32) == 0) {
                return f.e(b10, b11);
            }
            return null;
        }

        int k() {
            byte b10;
            byte b11 = this.f59639b;
            if ((b11 == 23 || b11 == 31) && (b10 = this.f59640c) >= 33 && b10 <= 35) {
                return b10 & 3;
            }
            return 0;
        }

        boolean m() {
            return l() || o() || n();
        }

        boolean n() {
            byte b10;
            byte b11 = this.f59639b;
            return (b11 == 18 || b11 == 26 || b11 == 19 || b11 == 27) && (b10 = this.f59640c) >= 32 && b10 <= 63;
        }

        public String toString() {
            if (this.f59639b < 16 && this.f59640c < 16) {
                return String.format("[%d]Null: %02x %02x", Byte.valueOf(this.f59638a), Byte.valueOf(this.f59639b), Byte.valueOf(this.f59640c));
            }
            int iE = e();
            if (iE != -1) {
                return String.format("[%d]%s", Byte.valueOf(this.f59638a), a(iE));
            }
            int iK = k();
            if (iK > 0) {
                return String.format("[%d]Tab%d", Byte.valueOf(this.f59638a), Integer.valueOf(iK));
            }
            f fVarI = i();
            if (fVarI != null) {
                return String.format("[%d]PAC: %s", Byte.valueOf(this.f59638a), fVarI.toString());
            }
            g gVarH = h();
            if (gVarH != null) {
                return String.format("[%d]Mid-row: %s", Byte.valueOf(this.f59638a), gVarH.toString());
            }
            return m() ? String.format("[%d]Displayable: %s (%02x %02x)", Byte.valueOf(this.f59638a), f(), Byte.valueOf(this.f59639b), Byte.valueOf(this.f59640c)) : String.format("[%d]Invalid: %02x %02x", Byte.valueOf(this.f59638a), Byte.valueOf(this.f59639b), Byte.valueOf(this.f59640c));
        }
    }

    private static class b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final StringBuilder f59641a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private final g[] f59642b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private final g[] f59643c;

        b(String str) {
            StringBuilder sb2 = new StringBuilder(str);
            this.f59641a = sb2;
            this.f59642b = new g[sb2.length()];
            this.f59643c = new g[sb2.length()];
        }

        void a(SpannableStringBuilder spannableStringBuilder, g gVar, int i10, int i11) {
            if (gVar.c()) {
                spannableStringBuilder.setSpan(new StyleSpan(2), i10, i11, 33);
            }
            if (gVar.d()) {
                spannableStringBuilder.setSpan(new UnderlineSpan(), i10, i11, 33);
            }
        }

        char b(int i10) {
            return this.f59641a.charAt(i10);
        }

        SpannableStringBuilder c(androidx.media2.widget.b bVar) {
            SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(this.f59641a);
            boolean z10 = true | false;
            int i10 = -1;
            int i11 = -1;
            g gVar = null;
            for (int i12 = 0; i12 < this.f59641a.length(); i12++) {
                g gVar2 = this.f59642b[i12];
                if (gVar2 == null && ((gVar2 = this.f59643c[i12]) == null || (i10 >= 0 && i11 >= 0))) {
                    gVar2 = null;
                }
                if (gVar2 != null) {
                    if (i10 >= 0 && i11 >= 0) {
                        a(spannableStringBuilder, gVar2, i10, i12);
                    }
                    i10 = i12;
                    gVar = gVar2;
                }
                if (this.f59641a.charAt(i12) != 160) {
                    if (i11 < 0) {
                        i11 = i12;
                    }
                } else if (i11 >= 0) {
                    if (this.f59641a.charAt(i11) != ' ') {
                        i11--;
                    }
                    int i13 = this.f59641a.charAt(i12 + (-1)) == ' ' ? i12 : i12 + 1;
                    spannableStringBuilder.setSpan(new e(bVar.f59598b), i11, i13, 33);
                    if (i10 >= 0) {
                        a(spannableStringBuilder, gVar, i10, i13);
                    }
                    i11 = -1;
                }
            }
            return spannableStringBuilder;
        }

        int d() {
            return this.f59641a.length();
        }

        void e(int i10, char c10) {
            this.f59641a.setCharAt(i10, c10);
            this.f59642b[i10] = null;
        }

        void f(int i10, g gVar) {
            this.f59641a.setCharAt(i10, ' ');
            this.f59642b[i10] = gVar;
        }

        void g(int i10, f fVar) {
            this.f59643c[i10] = fVar;
        }
    }

    private static class c {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final String f59644a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private final b[] f59645b = new b[17];

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private int f59646c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private int f59647d;

        c() {
            char[] cArr = new char[34];
            Arrays.fill(cArr, (char) 160);
            this.f59644a = new String(cArr);
        }

        private static int b(int i10, int i11, int i12) {
            if (i10 < i11) {
                return i11;
            }
            return i10 > i12 ? i12 : i10;
        }

        private b f(int i10) {
            b[] bVarArr = this.f59645b;
            if (bVarArr[i10] == null) {
                bVarArr[i10] = new b(this.f59644a);
            }
            return this.f59645b[i10];
        }

        private void i(int i10) {
            this.f59647d = b(this.f59647d + i10, 1, 32);
        }

        private void j(int i10, int i11) {
            this.f59646c = b(i10, 1, 15);
            this.f59647d = b(i11, 1, 32);
        }

        void a() {
            i(-1);
            b bVar = this.f59645b[this.f59646c];
            if (bVar != null) {
                bVar.e(this.f59647d, (char) 160);
                if (this.f59647d == 31) {
                    this.f59645b[this.f59646c].e(32, (char) 160);
                }
            }
        }

        void c() {
            j(this.f59646c + 1, 1);
        }

        void d() {
            if (this.f59645b[this.f59646c] != null) {
                for (int i10 = 0; i10 < this.f59647d; i10++) {
                    if (this.f59645b[this.f59646c].b(i10) != 160) {
                        for (int i11 = this.f59647d; i11 < this.f59645b[this.f59646c].d(); i11++) {
                            this.f59645b[i11].e(i11, (char) 160);
                        }
                    }
                }
                this.f59645b[this.f59646c] = null;
            }
        }

        void e() {
            int i10 = 0;
            while (true) {
                b[] bVarArr = this.f59645b;
                if (i10 >= bVarArr.length) {
                    this.f59646c = 15;
                    this.f59647d = 1;
                    return;
                } else {
                    bVarArr[i10] = null;
                    i10++;
                }
            }
        }

        SpannableStringBuilder[] g(androidx.media2.widget.b bVar) {
            ArrayList arrayList = new ArrayList(15);
            for (int i10 = 1; i10 <= 15; i10++) {
                b bVar2 = this.f59645b[i10];
                arrayList.add(bVar2 != null ? bVar2.c(bVar) : null);
            }
            return (SpannableStringBuilder[]) arrayList.toArray(new SpannableStringBuilder[15]);
        }

        void h(int i10, int i11) {
            int i12 = this.f59646c;
            if (i12 == i10) {
                return;
            }
            int i13 = i10 < i11 ? i10 : i11;
            if (i12 < i13) {
                i13 = i12;
            }
            if (i10 < i12) {
                for (int i14 = i13 - 1; i14 >= 0; i14--) {
                    b[] bVarArr = this.f59645b;
                    bVarArr[i10 - i14] = bVarArr[this.f59646c - i14];
                }
            } else {
                for (int i15 = 0; i15 < i13; i15++) {
                    b[] bVarArr2 = this.f59645b;
                    bVarArr2[i10 - i15] = bVarArr2[this.f59646c - i15];
                }
            }
            for (int i16 = 0; i16 <= i10 - i11; i16++) {
                this.f59645b[i16] = null;
            }
            while (true) {
                i10++;
                b[] bVarArr3 = this.f59645b;
                if (i10 >= bVarArr3.length) {
                    return;
                } else {
                    bVarArr3[i10] = null;
                }
            }
        }

        void k(int i10) {
            int i11;
            int i12;
            int i13 = 0;
            while (true) {
                i11 = this.f59646c;
                if (i13 > i11 - i10) {
                    break;
                }
                this.f59645b[i13] = null;
                i13++;
            }
            int i14 = (i11 - i10) + 1;
            if (i14 < 1) {
                i14 = 1;
            }
            while (true) {
                i12 = this.f59646c;
                if (i14 >= i12) {
                    break;
                }
                b[] bVarArr = this.f59645b;
                int i15 = i14 + 1;
                bVarArr[i14] = bVarArr[i15];
                i14 = i15;
            }
            while (true) {
                b[] bVarArr2 = this.f59645b;
                if (i12 >= bVarArr2.length) {
                    this.f59647d = 1;
                    return;
                } else {
                    bVarArr2[i12] = null;
                    i12++;
                }
            }
        }

        void l(int i10) {
            i(i10);
        }

        void m(g gVar) {
            f(this.f59646c).f(this.f59647d, gVar);
            i(1);
        }

        void n(f fVar) {
            if (fVar.h()) {
                j(fVar.g(), fVar.f());
            } else {
                j(fVar.g(), 1);
            }
            f(this.f59646c).g(this.f59647d, fVar);
        }

        void o(String str) {
            for (int i10 = 0; i10 < str.length(); i10++) {
                f(this.f59646c).e(this.f59647d, str.charAt(i10));
                i(1);
            }
        }
    }

    /* JADX INFO: renamed from: androidx.media2.widget.d$d, reason: collision with other inner class name */
    interface InterfaceC0558d {
        androidx.media2.widget.b a();

        void e(SpannableStringBuilder[] spannableStringBuilderArr);
    }

    public static class e extends CharacterStyle implements UpdateAppearance {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private int f59648a;

        e(int i10) {
            this.f59648a = i10;
        }

        public int a() {
            return this.f59648a;
        }

        public void b(int i10) {
            this.f59648a = i10;
        }

        @Override // android.text.style.CharacterStyle
        public void updateDrawState(@NonNull TextPaint textPaint) {
            textPaint.bgColor = this.f59648a;
        }
    }

    private static class f extends g {

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        final int f59649n;

        /* JADX INFO: renamed from: o, reason: collision with root package name */
        final int f59650o;

        f(int i10, int i11, int i12, int i13) {
            super(i12, i13);
            this.f59649n = i10;
            this.f59650o = i11;
        }

        static f e(byte b10, byte b11) {
            int i10 = new int[]{11, 1, 3, 12, 14, 5, 7, 9}[b10 & 7] + ((b11 & 32) >> 5);
            int i11 = 0;
            int i12 = (b11 & 1) != 0 ? 2 : 0;
            if ((b11 & com.google.common.base.c.f116465r) != 0) {
                return new f(i10, ((b11 >> 1) & 7) * 4, i12, 0);
            }
            int i13 = (b11 >> 1) & 7;
            if (i13 == 7) {
                i12 |= 1;
            } else {
                i11 = i13;
            }
            return new f(i10, -1, i12, i11);
        }

        int f() {
            return this.f59650o;
        }

        int g() {
            return this.f59649n;
        }

        boolean h() {
            return this.f59650o >= 0;
        }

        @Override // androidx.media2.widget.d.g
        public String toString() {
            return String.format("{%d, %d}, %s", Integer.valueOf(this.f59649n), Integer.valueOf(this.f59650o), super.toString());
        }
    }

    private static class g {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        static final int f59651c = 0;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        static final int f59652d = 1;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        static final int f59653e = 2;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        static final int f59654f = 3;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        static final int f59655g = 4;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        static final int f59656h = 5;

        /* JADX INFO: renamed from: i, reason: collision with root package name */
        static final int f59657i = 6;

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        static final int f59658j = 7;

        /* JADX INFO: renamed from: k, reason: collision with root package name */
        static final int f59659k = 1;

        /* JADX INFO: renamed from: l, reason: collision with root package name */
        static final int f59660l = 2;

        /* JADX INFO: renamed from: m, reason: collision with root package name */
        static final String[] f59661m = {"WHITE", "GREEN", "BLUE", "CYAN", "RED", "YELLOW", "MAGENTA", "INVALID"};

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final int f59662a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final int f59663b;

        g(int i10, int i11) {
            this.f59662a = i10;
            this.f59663b = i11;
        }

        static g a(byte b10) {
            int i10 = (b10 >> 1) & 7;
            int i11 = (b10 & 1) != 0 ? 2 : 0;
            if (i10 == 7) {
                i11 |= 1;
                i10 = 0;
            }
            return new g(i11, i10);
        }

        int b() {
            return this.f59663b;
        }

        boolean c() {
            return (this.f59662a & 1) != 0;
        }

        boolean d() {
            return (this.f59662a & 2) != 0;
        }

        public String toString() {
            StringBuilder sb2 = new StringBuilder();
            sb2.append("{");
            sb2.append(f59661m[this.f59663b]);
            if ((this.f59662a & 1) != 0) {
                sb2.append(", ITALICS");
            }
            if ((this.f59662a & 2) != 0) {
                sb2.append(", UNDERLINE");
            }
            sb2.append("}");
            return sb2.toString();
        }
    }

    d(InterfaceC0558d interfaceC0558d) {
        this.f59627a = interfaceC0558d;
    }

    private c a() {
        int i10 = this.f59628b;
        if (i10 == 1 || i10 == 2) {
            return this.f59631e;
        }
        if (i10 != 3) {
            return i10 != 4 ? this.f59631e : this.f59633g;
        }
        return this.f59632f;
    }

    private boolean b(a aVar) {
        int iE = aVar.e();
        int i10 = this.f59630d;
        if (i10 != -1 && i10 == iE) {
            this.f59630d = -1;
            return true;
        }
        switch (iE) {
            case 32:
                this.f59628b = 3;
                break;
            case 33:
                a().a();
                break;
            case 34:
            case 35:
            default:
                this.f59630d = -1;
                return false;
            case 36:
                a().d();
                break;
            case 37:
            case 38:
            case 39:
                this.f59629c = iE - 35;
                if (this.f59628b != 2) {
                    this.f59631e.e();
                    this.f59632f.e();
                }
                this.f59628b = 2;
                break;
            case 40:
                break;
            case 41:
                this.f59628b = 1;
                break;
            case 42:
                this.f59628b = 4;
                this.f59633g.e();
                break;
            case 43:
                this.f59628b = 4;
                break;
            case 44:
                this.f59631e.e();
                i();
                break;
            case 45:
                if (this.f59628b == 2) {
                    a().k(this.f59629c);
                } else {
                    a().c();
                }
                if (this.f59628b == 2) {
                    i();
                }
                break;
            case 46:
                this.f59632f.e();
                break;
            case 47:
                h();
                this.f59628b = 3;
                i();
                break;
        }
        this.f59630d = iE;
        return true;
    }

    private boolean c(a aVar) {
        if (!aVar.m()) {
            return false;
        }
        if (aVar.n()) {
            a().a();
        }
        a().o(aVar.f());
        int i10 = this.f59628b;
        if (i10 == 1 || i10 == 2) {
            i();
        }
        return true;
    }

    private boolean d(a aVar) {
        g gVarH = aVar.h();
        if (gVarH == null) {
            return false;
        }
        a().m(gVarH);
        int i10 = 3 | 1;
        return true;
    }

    private boolean e(a aVar) {
        f fVarI = aVar.i();
        if (fVarI == null) {
            return false;
        }
        if (this.f59628b == 2) {
            a().h(fVarI.g(), this.f59629c);
        }
        a().n(fVarI);
        return true;
    }

    private boolean f(a aVar) {
        int iK = aVar.k();
        if (iK <= 0) {
            return false;
        }
        a().l(iK);
        return true;
    }

    private void h() {
        c cVar = this.f59631e;
        this.f59631e = this.f59632f;
        this.f59632f = cVar;
    }

    private void i() {
        InterfaceC0558d interfaceC0558d = this.f59627a;
        if (interfaceC0558d != null) {
            this.f59627a.e(this.f59631e.g(interfaceC0558d.a()));
        }
    }

    public void g(byte[] bArr) {
        a[] aVarArrB = a.b(bArr);
        for (int i10 = 0; i10 < aVarArrB.length; i10++) {
            if (f59611k) {
                aVarArrB[i10].toString();
            }
            if (!b(aVarArrB[i10]) && !f(aVarArrB[i10]) && !e(aVarArrB[i10]) && !d(aVarArrB[i10])) {
                c(aVarArrB[i10]);
            }
        }
    }
}
