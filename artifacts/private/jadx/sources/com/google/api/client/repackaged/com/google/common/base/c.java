package com.google.api.client.repackaged.com.google.common.base;

import java.util.Arrays;
import java.util.BitSet;
import kotlinx.serialization.json.internal.AbstractJsonLexerKt;

/* JADX INFO: loaded from: classes4.dex */
@r7.b(emulated = true)
public abstract class c implements com.google.api.client.repackaged.com.google.common.base.r<Character> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @Deprecated
    public static final c f115805a = X();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @Deprecated
    public static final c f115806b = g();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @Deprecated
    public static final c f115807c = f();

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @Deprecated
    public static final c f115808d = j();

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    @Deprecated
    public static final c f115809e = u();

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    @Deprecated
    public static final c f115810f = w();

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    @Deprecated
    public static final c f115811g = x();

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    @Deprecated
    public static final c f115812h = z();

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    @Deprecated
    public static final c f115813i = y();

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    @Deprecated
    public static final c f115814j = v();

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    @Deprecated
    public static final c f115815k = p();

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    @Deprecated
    public static final c f115816l = S();

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    @Deprecated
    public static final c f115817m = c();

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    @Deprecated
    public static final c f115818n = G();

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    private static final int f115819o = 65536;

    class a extends x {

        /* JADX INFO: renamed from: q, reason: collision with root package name */
        final /* synthetic */ String f115820q;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        a(c cVar, String str) {
            super(cVar);
            this.f115820q = str;
        }

        @Override // com.google.api.client.repackaged.com.google.common.base.c.w, com.google.api.client.repackaged.com.google.common.base.c
        public String toString() {
            return this.f115820q;
        }
    }

    private static class a0 extends c {

        /* JADX INFO: renamed from: p, reason: collision with root package name */
        private final String f115822p;

        /* JADX INFO: renamed from: q, reason: collision with root package name */
        private final char[] f115823q;

        /* JADX INFO: renamed from: r, reason: collision with root package name */
        private final char[] f115824r;

        a0(String str, char[] cArr, char[] cArr2) {
            this.f115822p = str;
            this.f115823q = cArr;
            this.f115824r = cArr2;
            com.google.api.client.repackaged.com.google.common.base.q.d(cArr.length == cArr2.length);
            int i10 = 0;
            while (i10 < cArr.length) {
                com.google.api.client.repackaged.com.google.common.base.q.d(cArr[i10] <= cArr2[i10]);
                int i11 = i10 + 1;
                if (i11 < cArr.length) {
                    com.google.api.client.repackaged.com.google.common.base.q.d(cArr2[i10] < cArr[i11]);
                }
                i10 = i11;
            }
        }

        @Override // com.google.api.client.repackaged.com.google.common.base.c
        public boolean B(char c10) {
            int iBinarySearch = Arrays.binarySearch(this.f115823q, c10);
            if (iBinarySearch >= 0) {
                return true;
            }
            int i10 = (~iBinarySearch) - 1;
            return i10 >= 0 && c10 <= this.f115824r[i10];
        }

        @Override // com.google.api.client.repackaged.com.google.common.base.c, com.google.api.client.repackaged.com.google.common.base.r
        public /* bridge */ /* synthetic */ boolean apply(Character ch2) {
            return super.apply(ch2);
        }

        @Override // com.google.api.client.repackaged.com.google.common.base.c
        public String toString() {
            return this.f115822p;
        }
    }

    private static final class b extends c {

        /* JADX INFO: renamed from: p, reason: collision with root package name */
        final c f115825p;

        /* JADX INFO: renamed from: q, reason: collision with root package name */
        final c f115826q;

        b(c cVar, c cVar2) {
            this.f115825p = (c) com.google.api.client.repackaged.com.google.common.base.q.E(cVar);
            this.f115826q = (c) com.google.api.client.repackaged.com.google.common.base.q.E(cVar2);
        }

        @Override // com.google.api.client.repackaged.com.google.common.base.c
        public boolean B(char c10) {
            return this.f115825p.B(c10) && this.f115826q.B(c10);
        }

        @Override // com.google.api.client.repackaged.com.google.common.base.c
        @r7.c
        void Q(BitSet bitSet) {
            BitSet bitSet2 = new BitSet();
            this.f115825p.Q(bitSet2);
            BitSet bitSet3 = new BitSet();
            this.f115826q.Q(bitSet3);
            bitSet2.and(bitSet3);
            bitSet.or(bitSet2);
        }

        @Override // com.google.api.client.repackaged.com.google.common.base.c, com.google.api.client.repackaged.com.google.common.base.r
        public /* bridge */ /* synthetic */ boolean apply(Character ch2) {
            return super.apply(ch2);
        }

        @Override // com.google.api.client.repackaged.com.google.common.base.c
        public String toString() {
            return "CharMatcher.and(" + this.f115825p + ", " + this.f115826q + ")";
        }
    }

    private static final class b0 extends a0 {

        /* JADX INFO: renamed from: s, reason: collision with root package name */
        static final b0 f115827s = new b0();

        private b0() {
            super("CharMatcher.singleWidth()", "\u0000־א׳\u0600ݐ\u0e00Ḁ℀ﭐﹰ｡".toCharArray(), "ӹ־ת״ۿݿ\u0e7f₯℺﷿\ufeffￜ".toCharArray());
        }
    }

    /* JADX INFO: renamed from: com.google.api.client.repackaged.com.google.common.base.c$c, reason: collision with other inner class name */
    private static final class C1028c extends v {

        /* JADX INFO: renamed from: q, reason: collision with root package name */
        static final C1028c f115828q = new C1028c();

        private C1028c() {
            super("CharMatcher.any()");
        }

        @Override // com.google.api.client.repackaged.com.google.common.base.c
        public int A(CharSequence charSequence) {
            return charSequence.length() - 1;
        }

        @Override // com.google.api.client.repackaged.com.google.common.base.c
        public boolean B(char c10) {
            return true;
        }

        @Override // com.google.api.client.repackaged.com.google.common.base.c
        public boolean C(CharSequence charSequence) {
            com.google.api.client.repackaged.com.google.common.base.q.E(charSequence);
            return true;
        }

        @Override // com.google.api.client.repackaged.com.google.common.base.c
        public boolean E(CharSequence charSequence) {
            return charSequence.length() == 0;
        }

        @Override // com.google.api.client.repackaged.com.google.common.base.c.i, com.google.api.client.repackaged.com.google.common.base.c
        public c F() {
            return c.G();
        }

        @Override // com.google.api.client.repackaged.com.google.common.base.c
        public c I(c cVar) {
            com.google.api.client.repackaged.com.google.common.base.q.E(cVar);
            return this;
        }

        @Override // com.google.api.client.repackaged.com.google.common.base.c
        public String M(CharSequence charSequence) {
            com.google.api.client.repackaged.com.google.common.base.q.E(charSequence);
            return "";
        }

        @Override // com.google.api.client.repackaged.com.google.common.base.c
        public String N(CharSequence charSequence, char c10) {
            char[] cArr = new char[charSequence.length()];
            Arrays.fill(cArr, c10);
            return new String(cArr);
        }

        @Override // com.google.api.client.repackaged.com.google.common.base.c
        public String O(CharSequence charSequence, CharSequence charSequence2) {
            StringBuilder sb2 = new StringBuilder(charSequence.length() * charSequence2.length());
            for (int i10 = 0; i10 < charSequence.length(); i10++) {
                sb2.append(charSequence2);
            }
            return sb2.toString();
        }

        @Override // com.google.api.client.repackaged.com.google.common.base.c
        public String U(CharSequence charSequence) {
            com.google.api.client.repackaged.com.google.common.base.q.E(charSequence);
            return "";
        }

        @Override // com.google.api.client.repackaged.com.google.common.base.c
        public c b(c cVar) {
            return (c) com.google.api.client.repackaged.com.google.common.base.q.E(cVar);
        }

        @Override // com.google.api.client.repackaged.com.google.common.base.c
        public String h(CharSequence charSequence, char c10) {
            return charSequence.length() == 0 ? "" : String.valueOf(c10);
        }

        @Override // com.google.api.client.repackaged.com.google.common.base.c
        public int i(CharSequence charSequence) {
            return charSequence.length();
        }

        @Override // com.google.api.client.repackaged.com.google.common.base.c
        public int n(CharSequence charSequence) {
            return charSequence.length() == 0 ? -1 : 0;
        }

        @Override // com.google.api.client.repackaged.com.google.common.base.c
        public int o(CharSequence charSequence, int i10) {
            int length = charSequence.length();
            com.google.api.client.repackaged.com.google.common.base.q.d0(i10, length);
            if (i10 == length) {
                return -1;
            }
            return i10;
        }
    }

    @r7.d
    static final class c0 extends v {

        /* JADX INFO: renamed from: q, reason: collision with root package name */
        static final String f115829q = "\u2002\u3000\r\u0085\u200a\u2005\u2000\u3000\u2029\u000b\u3000\u2008\u2003\u205f\u3000\u1680\t \u2006\u2001  \f\u2009\u3000\u2004\u3000\u3000\u2028\n \u3000";

        /* JADX INFO: renamed from: r, reason: collision with root package name */
        static final int f115830r = 1682554634;

        /* JADX INFO: renamed from: s, reason: collision with root package name */
        static final int f115831s = Integer.numberOfLeadingZeros(31);

        /* JADX INFO: renamed from: t, reason: collision with root package name */
        static final c0 f115832t = new c0();

        c0() {
            super("CharMatcher.whitespace()");
        }

        @Override // com.google.api.client.repackaged.com.google.common.base.c
        public boolean B(char c10) {
            return f115829q.charAt((f115830r * c10) >>> f115831s) == c10;
        }

        @Override // com.google.api.client.repackaged.com.google.common.base.c
        @r7.c
        void Q(BitSet bitSet) {
            for (int i10 = 0; i10 < 32; i10++) {
                bitSet.set(f115829q.charAt(i10));
            }
        }
    }

    private static final class d extends c {

        /* JADX INFO: renamed from: p, reason: collision with root package name */
        private final char[] f115833p;

        public d(CharSequence charSequence) {
            char[] charArray = charSequence.toString().toCharArray();
            this.f115833p = charArray;
            Arrays.sort(charArray);
        }

        @Override // com.google.api.client.repackaged.com.google.common.base.c
        public boolean B(char c10) {
            return Arrays.binarySearch(this.f115833p, c10) >= 0;
        }

        @Override // com.google.api.client.repackaged.com.google.common.base.c
        @r7.c
        void Q(BitSet bitSet) {
            for (char c10 : this.f115833p) {
                bitSet.set(c10);
            }
        }

        @Override // com.google.api.client.repackaged.com.google.common.base.c, com.google.api.client.repackaged.com.google.common.base.r
        public /* bridge */ /* synthetic */ boolean apply(Character ch2) {
            return super.apply(ch2);
        }

        @Override // com.google.api.client.repackaged.com.google.common.base.c
        public String toString() {
            StringBuilder sb2 = new StringBuilder("CharMatcher.anyOf(\"");
            for (char c10 : this.f115833p) {
                sb2.append(c.R(c10));
            }
            sb2.append("\")");
            return sb2.toString();
        }
    }

    private static final class e extends v {

        /* JADX INFO: renamed from: q, reason: collision with root package name */
        static final e f115834q = new e();

        e() {
            super("CharMatcher.ascii()");
        }

        @Override // com.google.api.client.repackaged.com.google.common.base.c
        public boolean B(char c10) {
            return c10 <= 127;
        }
    }

    @r7.c
    private static final class f extends v {

        /* JADX INFO: renamed from: q, reason: collision with root package name */
        private final BitSet f115835q;

        /* synthetic */ f(BitSet bitSet, String str, a aVar) {
            this(bitSet, str);
        }

        @Override // com.google.api.client.repackaged.com.google.common.base.c
        public boolean B(char c10) {
            return this.f115835q.get(c10);
        }

        @Override // com.google.api.client.repackaged.com.google.common.base.c
        void Q(BitSet bitSet) {
            bitSet.or(this.f115835q);
        }

        private f(BitSet bitSet, String str) {
            super(str);
            this.f115835q = bitSet.length() + 64 < bitSet.size() ? (BitSet) bitSet.clone() : bitSet;
        }
    }

    private static final class g extends c {

        /* JADX INFO: renamed from: p, reason: collision with root package name */
        static final c f115836p = new g();

        private g() {
        }

        @Override // com.google.api.client.repackaged.com.google.common.base.c
        public boolean B(char c10) {
            if (c10 != ' ' && c10 != 133 && c10 != 5760) {
                if (c10 != 8199) {
                    if (c10 != 8287 && c10 != 12288 && c10 != 8232 && c10 != 8233) {
                        switch (c10) {
                            case '\t':
                            case '\n':
                            case 11:
                            case '\f':
                            case '\r':
                                break;
                            default:
                                if (c10 >= 8192 && c10 <= 8202) {
                                    return true;
                                }
                                break;
                        }
                    }
                }
                return false;
            }
            return true;
        }

        @Override // com.google.api.client.repackaged.com.google.common.base.c, com.google.api.client.repackaged.com.google.common.base.r
        public /* bridge */ /* synthetic */ boolean apply(Character ch2) {
            return super.apply(ch2);
        }

        @Override // com.google.api.client.repackaged.com.google.common.base.c
        public String toString() {
            return "CharMatcher.breakingWhitespace()";
        }
    }

    private static final class h extends a0 {

        /* JADX INFO: renamed from: s, reason: collision with root package name */
        private static final String f115837s = "0٠۰߀०০੦૦୦௦౦೦൦๐໐༠၀႐០᠐᥆᧐᭐᮰᱀᱐꘠꣐꤀꩐０";

        /* JADX INFO: renamed from: t, reason: collision with root package name */
        static final h f115838t = new h();

        private h() {
            super("CharMatcher.digit()", Z(), Y());
        }

        private static char[] Y() {
            char[] cArr = new char[31];
            for (int i10 = 0; i10 < 31; i10++) {
                cArr[i10] = (char) (f115837s.charAt(i10) + '\t');
            }
            return cArr;
        }

        private static char[] Z() {
            return f115837s.toCharArray();
        }
    }

    static abstract class i extends c {
        i() {
        }

        @Override // com.google.api.client.repackaged.com.google.common.base.c
        public c F() {
            return new x(this);
        }

        @Override // com.google.api.client.repackaged.com.google.common.base.c
        public final c J() {
            return this;
        }

        @Override // com.google.api.client.repackaged.com.google.common.base.c, com.google.api.client.repackaged.com.google.common.base.r
        public /* bridge */ /* synthetic */ boolean apply(Character ch2) {
            return super.apply(ch2);
        }
    }

    private static final class j extends c {

        /* JADX INFO: renamed from: p, reason: collision with root package name */
        private final com.google.api.client.repackaged.com.google.common.base.r<? super Character> f115839p;

        j(com.google.api.client.repackaged.com.google.common.base.r<? super Character> rVar) {
            this.f115839p = (com.google.api.client.repackaged.com.google.common.base.r) com.google.api.client.repackaged.com.google.common.base.q.E(rVar);
        }

        @Override // com.google.api.client.repackaged.com.google.common.base.c
        public boolean B(char c10) {
            return this.f115839p.apply(Character.valueOf(c10));
        }

        @Override // com.google.api.client.repackaged.com.google.common.base.c, com.google.api.client.repackaged.com.google.common.base.r
        /* JADX INFO: renamed from: e, reason: merged with bridge method [inline-methods] */
        public boolean apply(Character ch2) {
            return this.f115839p.apply(com.google.api.client.repackaged.com.google.common.base.q.E(ch2));
        }

        @Override // com.google.api.client.repackaged.com.google.common.base.c
        public String toString() {
            return "CharMatcher.forPredicate(" + this.f115839p + ")";
        }
    }

    private static final class k extends i {

        /* JADX INFO: renamed from: p, reason: collision with root package name */
        private final char f115840p;

        /* JADX INFO: renamed from: q, reason: collision with root package name */
        private final char f115841q;

        k(char c10, char c11) {
            com.google.api.client.repackaged.com.google.common.base.q.d(c11 >= c10);
            this.f115840p = c10;
            this.f115841q = c11;
        }

        @Override // com.google.api.client.repackaged.com.google.common.base.c
        public boolean B(char c10) {
            return this.f115840p <= c10 && c10 <= this.f115841q;
        }

        @Override // com.google.api.client.repackaged.com.google.common.base.c
        @r7.c
        void Q(BitSet bitSet) {
            bitSet.set(this.f115840p, this.f115841q + 1);
        }

        @Override // com.google.api.client.repackaged.com.google.common.base.c
        public String toString() {
            return "CharMatcher.inRange('" + c.R(this.f115840p) + "', '" + c.R(this.f115841q) + "')";
        }
    }

    private static final class l extends a0 {

        /* JADX INFO: renamed from: s, reason: collision with root package name */
        private static final String f115842s = "\u0000\u007f\u00ad\u0600\u061c\u06dd\u070f\u1680\u180e\u2000\u2028\u205f\u2066\u2067\u2068\u2069\u206a\u3000\ud800\ufeff\ufff9\ufffa";

        /* JADX INFO: renamed from: t, reason: collision with root package name */
        private static final String f115843t = "  \u00ad\u0604\u061c\u06dd\u070f\u1680\u180e\u200f \u2064\u2066\u2067\u2068\u2069\u206f\u3000\uf8ff\ufeff\ufff9\ufffb";

        /* JADX INFO: renamed from: u, reason: collision with root package name */
        static final l f115844u = new l();

        private l() {
            super("CharMatcher.invisible()", f115842s.toCharArray(), f115843t.toCharArray());
        }
    }

    private static final class m extends i {

        /* JADX INFO: renamed from: p, reason: collision with root package name */
        private final char f115845p;

        m(char c10) {
            this.f115845p = c10;
        }

        @Override // com.google.api.client.repackaged.com.google.common.base.c
        public boolean B(char c10) {
            return c10 == this.f115845p;
        }

        @Override // com.google.api.client.repackaged.com.google.common.base.c.i, com.google.api.client.repackaged.com.google.common.base.c
        public c F() {
            return c.s(this.f115845p);
        }

        @Override // com.google.api.client.repackaged.com.google.common.base.c
        public c I(c cVar) {
            return cVar.B(this.f115845p) ? cVar : super.I(cVar);
        }

        @Override // com.google.api.client.repackaged.com.google.common.base.c
        public String N(CharSequence charSequence, char c10) {
            return charSequence.toString().replace(this.f115845p, c10);
        }

        @Override // com.google.api.client.repackaged.com.google.common.base.c
        @r7.c
        void Q(BitSet bitSet) {
            bitSet.set(this.f115845p);
        }

        @Override // com.google.api.client.repackaged.com.google.common.base.c
        public c b(c cVar) {
            return cVar.B(this.f115845p) ? this : c.G();
        }

        @Override // com.google.api.client.repackaged.com.google.common.base.c
        public String toString() {
            return "CharMatcher.is('" + c.R(this.f115845p) + "')";
        }
    }

    private static final class n extends i {

        /* JADX INFO: renamed from: p, reason: collision with root package name */
        private final char f115846p;

        /* JADX INFO: renamed from: q, reason: collision with root package name */
        private final char f115847q;

        n(char c10, char c11) {
            this.f115846p = c10;
            this.f115847q = c11;
        }

        @Override // com.google.api.client.repackaged.com.google.common.base.c
        public boolean B(char c10) {
            return c10 == this.f115846p || c10 == this.f115847q;
        }

        @Override // com.google.api.client.repackaged.com.google.common.base.c
        @r7.c
        void Q(BitSet bitSet) {
            bitSet.set(this.f115846p);
            bitSet.set(this.f115847q);
        }

        @Override // com.google.api.client.repackaged.com.google.common.base.c
        public String toString() {
            return "CharMatcher.anyOf(\"" + c.R(this.f115846p) + c.R(this.f115847q) + "\")";
        }
    }

    private static final class o extends i {

        /* JADX INFO: renamed from: p, reason: collision with root package name */
        private final char f115848p;

        o(char c10) {
            this.f115848p = c10;
        }

        @Override // com.google.api.client.repackaged.com.google.common.base.c
        public boolean B(char c10) {
            return c10 != this.f115848p;
        }

        @Override // com.google.api.client.repackaged.com.google.common.base.c.i, com.google.api.client.repackaged.com.google.common.base.c
        public c F() {
            return c.q(this.f115848p);
        }

        @Override // com.google.api.client.repackaged.com.google.common.base.c
        public c I(c cVar) {
            return cVar.B(this.f115848p) ? c.c() : this;
        }

        @Override // com.google.api.client.repackaged.com.google.common.base.c
        @r7.c
        void Q(BitSet bitSet) {
            bitSet.set(0, this.f115848p);
            bitSet.set(this.f115848p + 1, 65536);
        }

        @Override // com.google.api.client.repackaged.com.google.common.base.c
        public c b(c cVar) {
            return cVar.B(this.f115848p) ? super.b(cVar) : cVar;
        }

        @Override // com.google.api.client.repackaged.com.google.common.base.c
        public String toString() {
            return "CharMatcher.isNot('" + c.R(this.f115848p) + "')";
        }
    }

    private static final class p extends c {

        /* JADX INFO: renamed from: p, reason: collision with root package name */
        static final p f115849p = new p();

        private p() {
        }

        @Override // com.google.api.client.repackaged.com.google.common.base.c
        public boolean B(char c10) {
            return Character.isDigit(c10);
        }

        @Override // com.google.api.client.repackaged.com.google.common.base.c, com.google.api.client.repackaged.com.google.common.base.r
        public /* bridge */ /* synthetic */ boolean apply(Character ch2) {
            return super.apply(ch2);
        }

        @Override // com.google.api.client.repackaged.com.google.common.base.c
        public String toString() {
            return "CharMatcher.javaDigit()";
        }
    }

    private static final class q extends v {

        /* JADX INFO: renamed from: q, reason: collision with root package name */
        static final q f115850q = new q();

        private q() {
            super("CharMatcher.javaIsoControl()");
        }

        @Override // com.google.api.client.repackaged.com.google.common.base.c
        public boolean B(char c10) {
            if (c10 > 31) {
                return c10 >= 127 && c10 <= 159;
            }
            return true;
        }
    }

    private static final class r extends c {

        /* JADX INFO: renamed from: p, reason: collision with root package name */
        static final r f115851p = new r();

        private r() {
        }

        @Override // com.google.api.client.repackaged.com.google.common.base.c
        public boolean B(char c10) {
            return Character.isLetter(c10);
        }

        @Override // com.google.api.client.repackaged.com.google.common.base.c, com.google.api.client.repackaged.com.google.common.base.r
        public /* bridge */ /* synthetic */ boolean apply(Character ch2) {
            return super.apply(ch2);
        }

        @Override // com.google.api.client.repackaged.com.google.common.base.c
        public String toString() {
            return "CharMatcher.javaLetter()";
        }
    }

    private static final class s extends c {

        /* JADX INFO: renamed from: p, reason: collision with root package name */
        static final s f115852p = new s();

        private s() {
        }

        @Override // com.google.api.client.repackaged.com.google.common.base.c
        public boolean B(char c10) {
            return Character.isLetterOrDigit(c10);
        }

        @Override // com.google.api.client.repackaged.com.google.common.base.c, com.google.api.client.repackaged.com.google.common.base.r
        public /* bridge */ /* synthetic */ boolean apply(Character ch2) {
            return super.apply(ch2);
        }

        @Override // com.google.api.client.repackaged.com.google.common.base.c
        public String toString() {
            return "CharMatcher.javaLetterOrDigit()";
        }
    }

    private static final class t extends c {

        /* JADX INFO: renamed from: p, reason: collision with root package name */
        static final t f115853p = new t();

        private t() {
        }

        @Override // com.google.api.client.repackaged.com.google.common.base.c
        public boolean B(char c10) {
            return Character.isLowerCase(c10);
        }

        @Override // com.google.api.client.repackaged.com.google.common.base.c, com.google.api.client.repackaged.com.google.common.base.r
        public /* bridge */ /* synthetic */ boolean apply(Character ch2) {
            return super.apply(ch2);
        }

        @Override // com.google.api.client.repackaged.com.google.common.base.c
        public String toString() {
            return "CharMatcher.javaLowerCase()";
        }
    }

    private static final class u extends c {

        /* JADX INFO: renamed from: p, reason: collision with root package name */
        static final u f115854p = new u();

        private u() {
        }

        @Override // com.google.api.client.repackaged.com.google.common.base.c
        public boolean B(char c10) {
            return Character.isUpperCase(c10);
        }

        @Override // com.google.api.client.repackaged.com.google.common.base.c, com.google.api.client.repackaged.com.google.common.base.r
        public /* bridge */ /* synthetic */ boolean apply(Character ch2) {
            return super.apply(ch2);
        }

        @Override // com.google.api.client.repackaged.com.google.common.base.c
        public String toString() {
            return "CharMatcher.javaUpperCase()";
        }
    }

    static abstract class v extends i {

        /* JADX INFO: renamed from: p, reason: collision with root package name */
        private final String f115855p;

        v(String str) {
            this.f115855p = (String) com.google.api.client.repackaged.com.google.common.base.q.E(str);
        }

        @Override // com.google.api.client.repackaged.com.google.common.base.c
        public final String toString() {
            return this.f115855p;
        }
    }

    private static class w extends c {

        /* JADX INFO: renamed from: p, reason: collision with root package name */
        final c f115856p;

        w(c cVar) {
            this.f115856p = (c) com.google.api.client.repackaged.com.google.common.base.q.E(cVar);
        }

        @Override // com.google.api.client.repackaged.com.google.common.base.c
        public boolean B(char c10) {
            return !this.f115856p.B(c10);
        }

        @Override // com.google.api.client.repackaged.com.google.common.base.c
        public boolean C(CharSequence charSequence) {
            return this.f115856p.E(charSequence);
        }

        @Override // com.google.api.client.repackaged.com.google.common.base.c
        public boolean E(CharSequence charSequence) {
            return this.f115856p.C(charSequence);
        }

        @Override // com.google.api.client.repackaged.com.google.common.base.c
        public c F() {
            return this.f115856p;
        }

        @Override // com.google.api.client.repackaged.com.google.common.base.c
        @r7.c
        void Q(BitSet bitSet) {
            BitSet bitSet2 = new BitSet();
            this.f115856p.Q(bitSet2);
            bitSet2.flip(0, 65536);
            bitSet.or(bitSet2);
        }

        @Override // com.google.api.client.repackaged.com.google.common.base.c, com.google.api.client.repackaged.com.google.common.base.r
        public /* bridge */ /* synthetic */ boolean apply(Character ch2) {
            return super.apply(ch2);
        }

        @Override // com.google.api.client.repackaged.com.google.common.base.c
        public int i(CharSequence charSequence) {
            return charSequence.length() - this.f115856p.i(charSequence);
        }

        @Override // com.google.api.client.repackaged.com.google.common.base.c
        public String toString() {
            return this.f115856p + ".negate()";
        }
    }

    static class x extends w {
        x(c cVar) {
            super(cVar);
        }

        @Override // com.google.api.client.repackaged.com.google.common.base.c
        public final c J() {
            return this;
        }
    }

    private static final class y extends v {

        /* JADX INFO: renamed from: q, reason: collision with root package name */
        static final y f115857q = new y();

        private y() {
            super("CharMatcher.none()");
        }

        @Override // com.google.api.client.repackaged.com.google.common.base.c
        public int A(CharSequence charSequence) {
            com.google.api.client.repackaged.com.google.common.base.q.E(charSequence);
            return -1;
        }

        @Override // com.google.api.client.repackaged.com.google.common.base.c
        public boolean B(char c10) {
            return false;
        }

        @Override // com.google.api.client.repackaged.com.google.common.base.c
        public boolean C(CharSequence charSequence) {
            return charSequence.length() == 0;
        }

        @Override // com.google.api.client.repackaged.com.google.common.base.c
        public boolean E(CharSequence charSequence) {
            com.google.api.client.repackaged.com.google.common.base.q.E(charSequence);
            return true;
        }

        @Override // com.google.api.client.repackaged.com.google.common.base.c.i, com.google.api.client.repackaged.com.google.common.base.c
        public c F() {
            return c.c();
        }

        @Override // com.google.api.client.repackaged.com.google.common.base.c
        public c I(c cVar) {
            return (c) com.google.api.client.repackaged.com.google.common.base.q.E(cVar);
        }

        @Override // com.google.api.client.repackaged.com.google.common.base.c
        public String M(CharSequence charSequence) {
            return charSequence.toString();
        }

        @Override // com.google.api.client.repackaged.com.google.common.base.c
        public String N(CharSequence charSequence, char c10) {
            return charSequence.toString();
        }

        @Override // com.google.api.client.repackaged.com.google.common.base.c
        public String O(CharSequence charSequence, CharSequence charSequence2) {
            com.google.api.client.repackaged.com.google.common.base.q.E(charSequence2);
            return charSequence.toString();
        }

        @Override // com.google.api.client.repackaged.com.google.common.base.c
        public String U(CharSequence charSequence) {
            return charSequence.toString();
        }

        @Override // com.google.api.client.repackaged.com.google.common.base.c
        public String V(CharSequence charSequence) {
            return charSequence.toString();
        }

        @Override // com.google.api.client.repackaged.com.google.common.base.c
        public String W(CharSequence charSequence) {
            return charSequence.toString();
        }

        @Override // com.google.api.client.repackaged.com.google.common.base.c
        public c b(c cVar) {
            com.google.api.client.repackaged.com.google.common.base.q.E(cVar);
            return this;
        }

        @Override // com.google.api.client.repackaged.com.google.common.base.c
        public String h(CharSequence charSequence, char c10) {
            return charSequence.toString();
        }

        @Override // com.google.api.client.repackaged.com.google.common.base.c
        public int i(CharSequence charSequence) {
            com.google.api.client.repackaged.com.google.common.base.q.E(charSequence);
            return 0;
        }

        @Override // com.google.api.client.repackaged.com.google.common.base.c
        public int n(CharSequence charSequence) {
            com.google.api.client.repackaged.com.google.common.base.q.E(charSequence);
            return -1;
        }

        @Override // com.google.api.client.repackaged.com.google.common.base.c
        public int o(CharSequence charSequence, int i10) {
            com.google.api.client.repackaged.com.google.common.base.q.d0(i10, charSequence.length());
            return -1;
        }
    }

    private static final class z extends c {

        /* JADX INFO: renamed from: p, reason: collision with root package name */
        final c f115858p;

        /* JADX INFO: renamed from: q, reason: collision with root package name */
        final c f115859q;

        z(c cVar, c cVar2) {
            this.f115858p = (c) com.google.api.client.repackaged.com.google.common.base.q.E(cVar);
            this.f115859q = (c) com.google.api.client.repackaged.com.google.common.base.q.E(cVar2);
        }

        @Override // com.google.api.client.repackaged.com.google.common.base.c
        public boolean B(char c10) {
            return this.f115858p.B(c10) || this.f115859q.B(c10);
        }

        @Override // com.google.api.client.repackaged.com.google.common.base.c
        @r7.c
        void Q(BitSet bitSet) {
            this.f115858p.Q(bitSet);
            this.f115859q.Q(bitSet);
        }

        @Override // com.google.api.client.repackaged.com.google.common.base.c, com.google.api.client.repackaged.com.google.common.base.r
        public /* bridge */ /* synthetic */ boolean apply(Character ch2) {
            return super.apply(ch2);
        }

        @Override // com.google.api.client.repackaged.com.google.common.base.c
        public String toString() {
            return "CharMatcher.or(" + this.f115858p + ", " + this.f115859q + ")";
        }
    }

    protected c() {
    }

    public static c G() {
        return y.f115857q;
    }

    public static c H(CharSequence charSequence) {
        return d(charSequence).F();
    }

    @r7.c
    private static c L(int i10, BitSet bitSet, String str) {
        if (i10 == 0) {
            return G();
        }
        if (i10 == 1) {
            return q((char) bitSet.nextSetBit(0));
        }
        if (i10 != 2) {
            return t(i10, bitSet.length()) ? com.google.api.client.repackaged.com.google.common.base.t.a0(bitSet, str) : new f(bitSet, str, null);
        }
        char cNextSetBit = (char) bitSet.nextSetBit(0);
        return r(cNextSetBit, (char) bitSet.nextSetBit(cNextSetBit + 1));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static String R(char c10) {
        char[] cArr = new char[6];
        cArr[0] = '\\';
        cArr[1] = AbstractJsonLexerKt.UNICODE_ESC;
        cArr[2] = 0;
        cArr[3] = 0;
        cArr[4] = 0;
        cArr[5] = 0;
        for (int i10 = 0; i10 < 4; i10++) {
            cArr[5 - i10] = "0123456789ABCDEF".charAt(c10 & 15);
            c10 = (char) (c10 >> 4);
        }
        return String.copyValueOf(cArr);
    }

    public static c S() {
        return b0.f115827s;
    }

    public static c X() {
        return c0.f115832t;
    }

    public static c c() {
        return C1028c.f115828q;
    }

    public static c d(CharSequence charSequence) {
        int length = charSequence.length();
        if (length == 0) {
            return G();
        }
        if (length != 1) {
            return length != 2 ? new d(charSequence) : r(charSequence.charAt(0), charSequence.charAt(1));
        }
        return q(charSequence.charAt(0));
    }

    public static c f() {
        return e.f115834q;
    }

    public static c g() {
        return g.f115836p;
    }

    public static c j() {
        return h.f115838t;
    }

    private String k(CharSequence charSequence, int i10, int i11, char c10, StringBuilder sb2, boolean z10) {
        while (i10 < i11) {
            char cCharAt = charSequence.charAt(i10);
            if (!B(cCharAt)) {
                sb2.append(cCharAt);
                z10 = false;
            } else if (!z10) {
                sb2.append(c10);
                z10 = true;
            }
            i10++;
        }
        return sb2.toString();
    }

    public static c l(com.google.api.client.repackaged.com.google.common.base.r<? super Character> rVar) {
        return rVar instanceof c ? (c) rVar : new j(rVar);
    }

    public static c m(char c10, char c11) {
        return new k(c10, c11);
    }

    public static c p() {
        return l.f115844u;
    }

    public static c q(char c10) {
        return new m(c10);
    }

    private static n r(char c10, char c11) {
        return new n(c10, c11);
    }

    public static c s(char c10) {
        return new o(c10);
    }

    @r7.c
    private static boolean t(int i10, int i11) {
        return i10 <= 1023 && i11 > i10 * 64;
    }

    public static c u() {
        return p.f115849p;
    }

    public static c v() {
        return q.f115850q;
    }

    public static c w() {
        return r.f115851p;
    }

    public static c x() {
        return s.f115852p;
    }

    public static c y() {
        return t.f115853p;
    }

    public static c z() {
        return u.f115854p;
    }

    public int A(CharSequence charSequence) {
        int length = charSequence.length();
        do {
            length--;
            if (length < 0) {
                return -1;
            }
        } while (!B(charSequence.charAt(length)));
        return length;
    }

    public abstract boolean B(char c10);

    public boolean C(CharSequence charSequence) {
        for (int length = charSequence.length() - 1; length >= 0; length--) {
            if (!B(charSequence.charAt(length))) {
                return false;
            }
        }
        return true;
    }

    public boolean D(CharSequence charSequence) {
        return !E(charSequence);
    }

    public boolean E(CharSequence charSequence) {
        return n(charSequence) == -1;
    }

    public c F() {
        return new w(this);
    }

    public c I(c cVar) {
        return new z(this, cVar);
    }

    public c J() {
        return com.google.api.client.repackaged.com.google.common.base.p.f(this);
    }

    @r7.c
    c K() {
        String strSubstring;
        BitSet bitSet = new BitSet();
        Q(bitSet);
        int iCardinality = bitSet.cardinality();
        if (iCardinality * 2 <= 65536) {
            return L(iCardinality, bitSet, toString());
        }
        bitSet.flip(0, 65536);
        int i10 = 65536 - iCardinality;
        String string = toString();
        if (string.endsWith(".negate()")) {
            strSubstring = string.substring(0, string.length() - 9);
        } else {
            strSubstring = string + ".negate()";
        }
        return new a(L(i10, bitSet, strSubstring), string);
    }

    public String M(CharSequence charSequence) {
        String string = charSequence.toString();
        int iN = n(string);
        if (iN == -1) {
            return string;
        }
        char[] charArray = string.toCharArray();
        int i10 = 1;
        while (true) {
            iN++;
            while (iN != charArray.length) {
                if (B(charArray[iN])) {
                    i10++;
                } else {
                    charArray[iN - i10] = charArray[iN];
                    iN++;
                }
            }
            return new String(charArray, 0, iN - i10);
        }
    }

    public String N(CharSequence charSequence, char c10) {
        String string = charSequence.toString();
        int iN = n(string);
        if (iN == -1) {
            return string;
        }
        char[] charArray = string.toCharArray();
        charArray[iN] = c10;
        while (true) {
            iN++;
            if (iN >= charArray.length) {
                return new String(charArray);
            }
            if (B(charArray[iN])) {
                charArray[iN] = c10;
            }
        }
    }

    public String O(CharSequence charSequence, CharSequence charSequence2) {
        int length = charSequence2.length();
        if (length == 0) {
            return M(charSequence);
        }
        int i10 = 0;
        if (length == 1) {
            return N(charSequence, charSequence2.charAt(0));
        }
        String string = charSequence.toString();
        int iN = n(string);
        if (iN == -1) {
            return string;
        }
        int length2 = string.length();
        StringBuilder sb2 = new StringBuilder(((length2 * 3) / 2) + 16);
        do {
            sb2.append((CharSequence) string, i10, iN);
            sb2.append(charSequence2);
            i10 = iN + 1;
            iN = o(string, i10);
        } while (iN != -1);
        sb2.append((CharSequence) string, i10, length2);
        return sb2.toString();
    }

    public String P(CharSequence charSequence) {
        return F().M(charSequence);
    }

    @r7.c
    void Q(BitSet bitSet) {
        for (int i10 = 65535; i10 >= 0; i10--) {
            if (B((char) i10)) {
                bitSet.set(i10);
            }
        }
    }

    public String T(CharSequence charSequence, char c10) {
        int length = charSequence.length();
        int i10 = length - 1;
        int i11 = 0;
        while (i11 < length && B(charSequence.charAt(i11))) {
            i11++;
        }
        int i12 = i10;
        while (i12 > i11 && B(charSequence.charAt(i12))) {
            i12--;
        }
        if (i11 == 0 && i12 == i10) {
            return h(charSequence, c10);
        }
        int i13 = i12 + 1;
        return k(charSequence, i11, i13, c10, new StringBuilder(i13 - i11), false);
    }

    public String U(CharSequence charSequence) {
        int length = charSequence.length();
        int i10 = 0;
        while (i10 < length && B(charSequence.charAt(i10))) {
            i10++;
        }
        int i11 = length - 1;
        while (i11 > i10 && B(charSequence.charAt(i11))) {
            i11--;
        }
        return charSequence.subSequence(i10, i11 + 1).toString();
    }

    public String V(CharSequence charSequence) {
        int length = charSequence.length();
        for (int i10 = 0; i10 < length; i10++) {
            if (!B(charSequence.charAt(i10))) {
                return charSequence.subSequence(i10, length).toString();
            }
        }
        return "";
    }

    public String W(CharSequence charSequence) {
        for (int length = charSequence.length() - 1; length >= 0; length--) {
            if (!B(charSequence.charAt(length))) {
                return charSequence.subSequence(0, length + 1).toString();
            }
        }
        return "";
    }

    public c b(c cVar) {
        return new b(this, cVar);
    }

    @Override // com.google.api.client.repackaged.com.google.common.base.r
    @Deprecated
    /* JADX INFO: renamed from: e */
    public boolean apply(Character ch2) {
        return B(ch2.charValue());
    }

    public String h(CharSequence charSequence, char c10) {
        int length = charSequence.length();
        int i10 = 0;
        while (i10 < length) {
            char cCharAt = charSequence.charAt(i10);
            if (B(cCharAt)) {
                if (cCharAt != c10 || (i10 != length - 1 && B(charSequence.charAt(i10 + 1)))) {
                    StringBuilder sb2 = new StringBuilder(length);
                    sb2.append(charSequence, 0, i10);
                    sb2.append(c10);
                    return k(charSequence, i10 + 1, length, c10, sb2, true);
                }
                i10++;
            }
            i10++;
            c10 = c10;
        }
        return charSequence.toString();
    }

    public int i(CharSequence charSequence) {
        int i10 = 0;
        for (int i11 = 0; i11 < charSequence.length(); i11++) {
            if (B(charSequence.charAt(i11))) {
                i10++;
            }
        }
        return i10;
    }

    public int n(CharSequence charSequence) {
        return o(charSequence, 0);
    }

    public int o(CharSequence charSequence, int i10) {
        int length = charSequence.length();
        com.google.api.client.repackaged.com.google.common.base.q.d0(i10, length);
        while (i10 < length) {
            if (B(charSequence.charAt(i10))) {
                return i10;
            }
            i10++;
        }
        return -1;
    }

    public String toString() {
        return super.toString();
    }
}
