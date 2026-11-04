package com.google.common.base;

import java.util.Arrays;
import java.util.BitSet;
import kotlinx.serialization.json.internal.AbstractJsonLexerKt;

/* JADX INFO: loaded from: classes4.dex */
@com.google.common.annotations.b(emulated = true)
@com.google.common.base.k
public abstract class e implements k0<Character> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final int f116485a = 65536;

    class a extends x {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ String f116486c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        final /* synthetic */ e f116487d;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        a(final e this$0, e original, final String val$description) {
            super(original);
            this.f116486c = val$description;
            this.f116487d = this$0;
        }

        @Override // com.google.common.base.e.w, com.google.common.base.e
        public String toString() {
            return this.f116486c;
        }
    }

    private static class a0 extends e {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private final String f116488b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private final char[] f116489c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private final char[] f116490d;

        a0(String description, char[] rangeStarts, char[] rangeEnds) {
            this.f116488b = description;
            this.f116489c = rangeStarts;
            this.f116490d = rangeEnds;
            j0.d(rangeStarts.length == rangeEnds.length);
            int i10 = 0;
            while (i10 < rangeStarts.length) {
                j0.d(rangeStarts[i10] <= rangeEnds[i10]);
                int i11 = i10 + 1;
                if (i11 < rangeStarts.length) {
                    j0.d(rangeEnds[i10] < rangeStarts[i11]);
                }
                i10 = i11;
            }
        }

        @Override // com.google.common.base.e
        public boolean B(char c10) {
            int iBinarySearch = Arrays.binarySearch(this.f116489c, c10);
            if (iBinarySearch >= 0) {
                return true;
            }
            int i10 = (~iBinarySearch) - 1;
            return i10 >= 0 && c10 <= this.f116490d[i10];
        }

        @Override // com.google.common.base.e, com.google.common.base.k0
        @Deprecated
        public /* bridge */ /* synthetic */ boolean apply(Character character) {
            return super.apply(character);
        }

        @Override // com.google.common.base.e
        public String toString() {
            return this.f116488b;
        }
    }

    private static final class b extends e {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final e f116491b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final e f116492c;

        b(e a10, e b10) {
            this.f116491b = (e) j0.E(a10);
            this.f116492c = (e) j0.E(b10);
        }

        @Override // com.google.common.base.e
        public boolean B(char c10) {
            return this.f116491b.B(c10) && this.f116492c.B(c10);
        }

        @Override // com.google.common.base.e
        @com.google.common.annotations.c
        void Q(BitSet table) {
            BitSet bitSet = new BitSet();
            this.f116491b.Q(bitSet);
            BitSet bitSet2 = new BitSet();
            this.f116492c.Q(bitSet2);
            bitSet.and(bitSet2);
            table.or(bitSet);
        }

        @Override // com.google.common.base.e, com.google.common.base.k0
        @Deprecated
        public /* bridge */ /* synthetic */ boolean apply(Character character) {
            return super.apply(character);
        }

        @Override // com.google.common.base.e
        public String toString() {
            return "CharMatcher.and(" + this.f116491b + ", " + this.f116492c + ")";
        }
    }

    private static final class b0 extends a0 {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        static final e f116493e = new b0();

        private b0() {
            super("CharMatcher.singleWidth()", "\u0000־א׳\u0600ݐ\u0e00Ḁ℀ﭐﹰ｡".toCharArray(), "ӹ־ת״ۿݿ\u0e7f₯℺﷿\ufeffￜ".toCharArray());
        }
    }

    private static final class c extends v {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        static final e f116494c = new c();

        private c() {
            super("CharMatcher.any()");
        }

        @Override // com.google.common.base.e
        public int A(CharSequence sequence) {
            return sequence.length() - 1;
        }

        @Override // com.google.common.base.e
        public boolean B(char c10) {
            return true;
        }

        @Override // com.google.common.base.e
        public boolean C(CharSequence sequence) {
            j0.E(sequence);
            return true;
        }

        @Override // com.google.common.base.e
        public boolean E(CharSequence sequence) {
            return sequence.length() == 0;
        }

        @Override // com.google.common.base.e.i, com.google.common.base.e
        public e F() {
            return e.G();
        }

        @Override // com.google.common.base.e
        public e I(e other) {
            j0.E(other);
            return this;
        }

        @Override // com.google.common.base.e
        public String M(CharSequence sequence) {
            j0.E(sequence);
            return "";
        }

        @Override // com.google.common.base.e
        public String N(CharSequence sequence, char replacement) {
            char[] cArr = new char[sequence.length()];
            Arrays.fill(cArr, replacement);
            return new String(cArr);
        }

        @Override // com.google.common.base.e
        public String O(CharSequence sequence, CharSequence replacement) {
            StringBuilder sb2 = new StringBuilder(sequence.length() * replacement.length());
            for (int i10 = 0; i10 < sequence.length(); i10++) {
                sb2.append(replacement);
            }
            return sb2.toString();
        }

        @Override // com.google.common.base.e
        public String U(CharSequence sequence) {
            j0.E(sequence);
            return "";
        }

        @Override // com.google.common.base.e
        public e b(e other) {
            return (e) j0.E(other);
        }

        @Override // com.google.common.base.e
        public String h(CharSequence sequence, char replacement) {
            return sequence.length() == 0 ? "" : String.valueOf(replacement);
        }

        @Override // com.google.common.base.e
        public int i(CharSequence sequence) {
            return sequence.length();
        }

        @Override // com.google.common.base.e
        public int n(CharSequence sequence) {
            return sequence.length() == 0 ? -1 : 0;
        }

        @Override // com.google.common.base.e
        public int o(CharSequence sequence, int start) {
            int length = sequence.length();
            j0.d0(start, length);
            if (start == length) {
                return -1;
            }
            return start;
        }
    }

    @com.google.common.annotations.e
    static final class c0 extends v {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        static final String f116495c = "\u2002\u3000\r\u0085\u200a\u2005\u2000\u3000\u2029\u000b\u3000\u2008\u2003\u205f\u3000\u1680\t \u2006\u2001  \f\u2009\u3000\u2004\u3000\u3000\u2028\n \u3000";

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        static final int f116496d = 1682554634;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        static final int f116497e = Integer.numberOfLeadingZeros(31);

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        static final e f116498f = new c0();

        c0() {
            super("CharMatcher.whitespace()");
        }

        @Override // com.google.common.base.e
        public boolean B(char c10) {
            return f116495c.charAt((f116496d * c10) >>> f116497e) == c10;
        }

        @Override // com.google.common.base.e
        @com.google.common.annotations.c
        void Q(BitSet table) {
            for (int i10 = 0; i10 < 32; i10++) {
                table.set(f116495c.charAt(i10));
            }
        }
    }

    private static final class d extends e {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private final char[] f116499b;

        public d(CharSequence chars) {
            char[] charArray = chars.toString().toCharArray();
            this.f116499b = charArray;
            Arrays.sort(charArray);
        }

        @Override // com.google.common.base.e
        public boolean B(char c10) {
            return Arrays.binarySearch(this.f116499b, c10) >= 0;
        }

        @Override // com.google.common.base.e
        @com.google.common.annotations.c
        void Q(BitSet table) {
            for (char c10 : this.f116499b) {
                table.set(c10);
            }
        }

        @Override // com.google.common.base.e, com.google.common.base.k0
        @Deprecated
        public /* bridge */ /* synthetic */ boolean apply(Character character) {
            return super.apply(character);
        }

        @Override // com.google.common.base.e
        public String toString() {
            StringBuilder sb2 = new StringBuilder("CharMatcher.anyOf(\"");
            for (char c10 : this.f116499b) {
                sb2.append(e.R(c10));
            }
            sb2.append("\")");
            return sb2.toString();
        }
    }

    /* JADX INFO: renamed from: com.google.common.base.e$e, reason: collision with other inner class name */
    private static final class C1044e extends v {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        static final e f116500c = new C1044e();

        C1044e() {
            super("CharMatcher.ascii()");
        }

        @Override // com.google.common.base.e
        public boolean B(char c10) {
            return c10 <= 127;
        }
    }

    @com.google.common.annotations.c
    private static final class f extends v {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private final BitSet f116501c;

        /* synthetic */ f(BitSet bitSet, String str, a aVar) {
            this(bitSet, str);
        }

        @Override // com.google.common.base.e
        public boolean B(char c10) {
            return this.f116501c.get(c10);
        }

        @Override // com.google.common.base.e
        void Q(BitSet bitSet) {
            bitSet.or(this.f116501c);
        }

        private f(BitSet table, String description) {
            super(description);
            this.f116501c = table.length() + 64 < table.size() ? (BitSet) table.clone() : table;
        }
    }

    private static final class g extends e {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        static final e f116502b = new g();

        private g() {
        }

        @Override // com.google.common.base.e
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

        @Override // com.google.common.base.e, com.google.common.base.k0
        @Deprecated
        public /* bridge */ /* synthetic */ boolean apply(Character character) {
            return super.apply(character);
        }

        @Override // com.google.common.base.e
        public String toString() {
            return "CharMatcher.breakingWhitespace()";
        }
    }

    private static final class h extends a0 {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        private static final String f116503e = "0٠۰߀०০੦૦୦௦౦೦൦෦๐໐༠၀႐០᠐᥆᧐᪀᪐᭐᮰᱀᱐꘠꣐꤀꧐꧰꩐꯰０";

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        static final e f116504f = new h();

        private h() {
            super("CharMatcher.digit()", Z(), Y());
        }

        private static char[] Y() {
            char[] cArr = new char[37];
            for (int i10 = 0; i10 < 37; i10++) {
                cArr[i10] = (char) (f116503e.charAt(i10) + '\t');
            }
            return cArr;
        }

        private static char[] Z() {
            return f116503e.toCharArray();
        }
    }

    static abstract class i extends e {
        i() {
        }

        @Override // com.google.common.base.e
        public e F() {
            return new x(this);
        }

        @Override // com.google.common.base.e
        public final e J() {
            return this;
        }

        @Override // com.google.common.base.e, com.google.common.base.k0
        @Deprecated
        public /* bridge */ /* synthetic */ boolean apply(Character character) {
            return super.apply(character);
        }
    }

    private static final class j extends e {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private final k0<? super Character> f116505b;

        j(k0<? super Character> predicate) {
            this.f116505b = (k0) j0.E(predicate);
        }

        @Override // com.google.common.base.e
        public boolean B(char c10) {
            return this.f116505b.apply(Character.valueOf(c10));
        }

        @Override // com.google.common.base.e, com.google.common.base.k0
        /* JADX INFO: renamed from: e, reason: merged with bridge method [inline-methods] */
        public boolean apply(Character character) {
            return this.f116505b.apply(j0.E(character));
        }

        @Override // com.google.common.base.e
        public String toString() {
            return "CharMatcher.forPredicate(" + this.f116505b + ")";
        }
    }

    private static final class k extends i {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private final char f116506b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private final char f116507c;

        k(char startInclusive, char endInclusive) {
            j0.d(endInclusive >= startInclusive);
            this.f116506b = startInclusive;
            this.f116507c = endInclusive;
        }

        @Override // com.google.common.base.e
        public boolean B(char c10) {
            return this.f116506b <= c10 && c10 <= this.f116507c;
        }

        @Override // com.google.common.base.e
        @com.google.common.annotations.c
        void Q(BitSet table) {
            table.set(this.f116506b, this.f116507c + 1);
        }

        @Override // com.google.common.base.e
        public String toString() {
            return "CharMatcher.inRange('" + e.R(this.f116506b) + "', '" + e.R(this.f116507c) + "')";
        }
    }

    private static final class l extends a0 {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        private static final String f116508e = "\u0000\u007f\u00ad\u0600\u061c\u06dd\u070f\u0890\u08e2\u1680\u180e\u2000\u2028\u205f\u2066\u3000\ud800\ufeff\ufff9";

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        private static final String f116509f = "  \u00ad\u0605\u061c\u06dd\u070f\u0891\u08e2\u1680\u180e\u200f \u2064\u206f\u3000\uf8ff\ufeff\ufffb";

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        static final e f116510g = new l();

        private l() {
            super("CharMatcher.invisible()", f116508e.toCharArray(), f116509f.toCharArray());
        }
    }

    private static final class m extends i {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private final char f116511b;

        m(char match) {
            this.f116511b = match;
        }

        @Override // com.google.common.base.e
        public boolean B(char c10) {
            return c10 == this.f116511b;
        }

        @Override // com.google.common.base.e.i, com.google.common.base.e
        public e F() {
            return e.s(this.f116511b);
        }

        @Override // com.google.common.base.e
        public e I(e other) {
            return other.B(this.f116511b) ? other : super.I(other);
        }

        @Override // com.google.common.base.e
        public String N(CharSequence sequence, char replacement) {
            return sequence.toString().replace(this.f116511b, replacement);
        }

        @Override // com.google.common.base.e
        @com.google.common.annotations.c
        void Q(BitSet table) {
            table.set(this.f116511b);
        }

        @Override // com.google.common.base.e
        public e b(e other) {
            return other.B(this.f116511b) ? this : e.G();
        }

        @Override // com.google.common.base.e
        public String toString() {
            return "CharMatcher.is('" + e.R(this.f116511b) + "')";
        }
    }

    private static final class n extends i {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private final char f116512b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private final char f116513c;

        n(char match1, char match2) {
            this.f116512b = match1;
            this.f116513c = match2;
        }

        @Override // com.google.common.base.e
        public boolean B(char c10) {
            return c10 == this.f116512b || c10 == this.f116513c;
        }

        @Override // com.google.common.base.e
        @com.google.common.annotations.c
        void Q(BitSet table) {
            table.set(this.f116512b);
            table.set(this.f116513c);
        }

        @Override // com.google.common.base.e
        public String toString() {
            return "CharMatcher.anyOf(\"" + e.R(this.f116512b) + e.R(this.f116513c) + "\")";
        }
    }

    private static final class o extends i {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private final char f116514b;

        o(char match) {
            this.f116514b = match;
        }

        @Override // com.google.common.base.e
        public boolean B(char c10) {
            return c10 != this.f116514b;
        }

        @Override // com.google.common.base.e.i, com.google.common.base.e
        public e F() {
            return e.q(this.f116514b);
        }

        @Override // com.google.common.base.e
        public e I(e other) {
            return other.B(this.f116514b) ? e.c() : this;
        }

        @Override // com.google.common.base.e
        @com.google.common.annotations.c
        void Q(BitSet table) {
            table.set(0, this.f116514b);
            table.set(this.f116514b + 1, 65536);
        }

        @Override // com.google.common.base.e
        public e b(e other) {
            return other.B(this.f116514b) ? super.b(other) : other;
        }

        @Override // com.google.common.base.e
        public String toString() {
            return "CharMatcher.isNot('" + e.R(this.f116514b) + "')";
        }
    }

    private static final class p extends e {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        static final e f116515b = new p();

        private p() {
        }

        @Override // com.google.common.base.e
        public boolean B(char c10) {
            return Character.isDigit(c10);
        }

        @Override // com.google.common.base.e, com.google.common.base.k0
        @Deprecated
        public /* bridge */ /* synthetic */ boolean apply(Character character) {
            return super.apply(character);
        }

        @Override // com.google.common.base.e
        public String toString() {
            return "CharMatcher.javaDigit()";
        }
    }

    private static final class q extends v {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        static final e f116516c = new q();

        private q() {
            super("CharMatcher.javaIsoControl()");
        }

        @Override // com.google.common.base.e
        public boolean B(char c10) {
            if (c10 > 31) {
                return c10 >= 127 && c10 <= 159;
            }
            return true;
        }
    }

    private static final class r extends e {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        static final e f116517b = new r();

        private r() {
        }

        @Override // com.google.common.base.e
        public boolean B(char c10) {
            return Character.isLetter(c10);
        }

        @Override // com.google.common.base.e, com.google.common.base.k0
        @Deprecated
        public /* bridge */ /* synthetic */ boolean apply(Character character) {
            return super.apply(character);
        }

        @Override // com.google.common.base.e
        public String toString() {
            return "CharMatcher.javaLetter()";
        }
    }

    private static final class s extends e {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        static final e f116518b = new s();

        private s() {
        }

        @Override // com.google.common.base.e
        public boolean B(char c10) {
            return Character.isLetterOrDigit(c10);
        }

        @Override // com.google.common.base.e, com.google.common.base.k0
        @Deprecated
        public /* bridge */ /* synthetic */ boolean apply(Character character) {
            return super.apply(character);
        }

        @Override // com.google.common.base.e
        public String toString() {
            return "CharMatcher.javaLetterOrDigit()";
        }
    }

    private static final class t extends e {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        static final e f116519b = new t();

        private t() {
        }

        @Override // com.google.common.base.e
        public boolean B(char c10) {
            return Character.isLowerCase(c10);
        }

        @Override // com.google.common.base.e, com.google.common.base.k0
        @Deprecated
        public /* bridge */ /* synthetic */ boolean apply(Character character) {
            return super.apply(character);
        }

        @Override // com.google.common.base.e
        public String toString() {
            return "CharMatcher.javaLowerCase()";
        }
    }

    private static final class u extends e {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        static final e f116520b = new u();

        private u() {
        }

        @Override // com.google.common.base.e
        public boolean B(char c10) {
            return Character.isUpperCase(c10);
        }

        @Override // com.google.common.base.e, com.google.common.base.k0
        @Deprecated
        public /* bridge */ /* synthetic */ boolean apply(Character character) {
            return super.apply(character);
        }

        @Override // com.google.common.base.e
        public String toString() {
            return "CharMatcher.javaUpperCase()";
        }
    }

    static abstract class v extends i {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private final String f116521b;

        v(String description) {
            this.f116521b = (String) j0.E(description);
        }

        @Override // com.google.common.base.e
        public final String toString() {
            return this.f116521b;
        }
    }

    private static class w extends e {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final e f116522b;

        w(e original) {
            this.f116522b = (e) j0.E(original);
        }

        @Override // com.google.common.base.e
        public boolean B(char c10) {
            return !this.f116522b.B(c10);
        }

        @Override // com.google.common.base.e
        public boolean C(CharSequence sequence) {
            return this.f116522b.E(sequence);
        }

        @Override // com.google.common.base.e
        public boolean E(CharSequence sequence) {
            return this.f116522b.C(sequence);
        }

        @Override // com.google.common.base.e
        public e F() {
            return this.f116522b;
        }

        @Override // com.google.common.base.e
        @com.google.common.annotations.c
        void Q(BitSet table) {
            BitSet bitSet = new BitSet();
            this.f116522b.Q(bitSet);
            bitSet.flip(0, 65536);
            table.or(bitSet);
        }

        @Override // com.google.common.base.e, com.google.common.base.k0
        @Deprecated
        public /* bridge */ /* synthetic */ boolean apply(Character character) {
            return super.apply(character);
        }

        @Override // com.google.common.base.e
        public int i(CharSequence sequence) {
            return sequence.length() - this.f116522b.i(sequence);
        }

        @Override // com.google.common.base.e
        public String toString() {
            return this.f116522b + ".negate()";
        }
    }

    private static class x extends w {
        x(e original) {
            super(original);
        }

        @Override // com.google.common.base.e
        public final e J() {
            return this;
        }
    }

    private static final class y extends v {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        static final e f116523c = new y();

        private y() {
            super("CharMatcher.none()");
        }

        @Override // com.google.common.base.e
        public int A(CharSequence sequence) {
            j0.E(sequence);
            return -1;
        }

        @Override // com.google.common.base.e
        public boolean B(char c10) {
            return false;
        }

        @Override // com.google.common.base.e
        public boolean C(CharSequence sequence) {
            return sequence.length() == 0;
        }

        @Override // com.google.common.base.e
        public boolean E(CharSequence sequence) {
            j0.E(sequence);
            return true;
        }

        @Override // com.google.common.base.e.i, com.google.common.base.e
        public e F() {
            return e.c();
        }

        @Override // com.google.common.base.e
        public e I(e other) {
            return (e) j0.E(other);
        }

        @Override // com.google.common.base.e
        public String M(CharSequence sequence) {
            return sequence.toString();
        }

        @Override // com.google.common.base.e
        public String N(CharSequence sequence, char replacement) {
            return sequence.toString();
        }

        @Override // com.google.common.base.e
        public String O(CharSequence sequence, CharSequence replacement) {
            j0.E(replacement);
            return sequence.toString();
        }

        @Override // com.google.common.base.e
        public String U(CharSequence sequence) {
            return sequence.toString();
        }

        @Override // com.google.common.base.e
        public String V(CharSequence sequence) {
            return sequence.toString();
        }

        @Override // com.google.common.base.e
        public String W(CharSequence sequence) {
            return sequence.toString();
        }

        @Override // com.google.common.base.e
        public e b(e other) {
            j0.E(other);
            return this;
        }

        @Override // com.google.common.base.e
        public String h(CharSequence sequence, char replacement) {
            return sequence.toString();
        }

        @Override // com.google.common.base.e
        public int i(CharSequence sequence) {
            j0.E(sequence);
            return 0;
        }

        @Override // com.google.common.base.e
        public int n(CharSequence sequence) {
            j0.E(sequence);
            return -1;
        }

        @Override // com.google.common.base.e
        public int o(CharSequence sequence, int start) {
            j0.d0(start, sequence.length());
            return -1;
        }
    }

    private static final class z extends e {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final e f116524b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final e f116525c;

        z(e a10, e b10) {
            this.f116524b = (e) j0.E(a10);
            this.f116525c = (e) j0.E(b10);
        }

        @Override // com.google.common.base.e
        public boolean B(char c10) {
            return this.f116524b.B(c10) || this.f116525c.B(c10);
        }

        @Override // com.google.common.base.e
        @com.google.common.annotations.c
        void Q(BitSet table) {
            this.f116524b.Q(table);
            this.f116525c.Q(table);
        }

        @Override // com.google.common.base.e, com.google.common.base.k0
        @Deprecated
        public /* bridge */ /* synthetic */ boolean apply(Character character) {
            return super.apply(character);
        }

        @Override // com.google.common.base.e
        public String toString() {
            return "CharMatcher.or(" + this.f116524b + ", " + this.f116525c + ")";
        }
    }

    protected e() {
    }

    public static e G() {
        return y.f116523c;
    }

    public static e H(CharSequence sequence) {
        return d(sequence).F();
    }

    @com.google.common.annotations.c
    private static e L(int totalCharacters, BitSet table, String description) {
        if (totalCharacters == 0) {
            return G();
        }
        if (totalCharacters == 1) {
            return q((char) table.nextSetBit(0));
        }
        int i10 = 3 >> 2;
        if (totalCharacters != 2) {
            return t(totalCharacters, table.length()) ? n0.a0(table, description) : new f(table, description, null);
        }
        char cNextSetBit = (char) table.nextSetBit(0);
        return r(cNextSetBit, (char) table.nextSetBit(cNextSetBit + 1));
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

    @Deprecated
    public static e S() {
        return b0.f116493e;
    }

    public static e X() {
        return c0.f116498f;
    }

    public static e c() {
        return c.f116494c;
    }

    public static e d(final CharSequence sequence) {
        int length = sequence.length();
        if (length == 0) {
            return G();
        }
        if (length != 1) {
            return length != 2 ? new d(sequence) : r(sequence.charAt(0), sequence.charAt(1));
        }
        return q(sequence.charAt(0));
    }

    public static e f() {
        return C1044e.f116500c;
    }

    public static e g() {
        return g.f116502b;
    }

    @Deprecated
    public static e j() {
        return h.f116504f;
    }

    private String k(CharSequence sequence, int start, int end, char replacement, StringBuilder builder, boolean inMatchingGroup) {
        while (start < end) {
            char cCharAt = sequence.charAt(start);
            if (!B(cCharAt)) {
                builder.append(cCharAt);
                inMatchingGroup = false;
            } else if (!inMatchingGroup) {
                builder.append(replacement);
                inMatchingGroup = true;
            }
            start++;
        }
        return builder.toString();
    }

    public static e l(final k0<? super Character> predicate) {
        return predicate instanceof e ? (e) predicate : new j(predicate);
    }

    public static e m(final char startInclusive, final char endInclusive) {
        return new k(startInclusive, endInclusive);
    }

    @Deprecated
    public static e p() {
        return l.f116510g;
    }

    public static e q(final char match) {
        return new m(match);
    }

    private static n r(char c10, char c11) {
        return new n(c10, c11);
    }

    public static e s(final char match) {
        return new o(match);
    }

    @com.google.common.annotations.c
    private static boolean t(int totalCharacters, int tableLength) {
        return totalCharacters <= 1023 && tableLength > totalCharacters * 64;
    }

    @Deprecated
    public static e u() {
        return p.f116515b;
    }

    public static e v() {
        return q.f116516c;
    }

    @Deprecated
    public static e w() {
        return r.f116517b;
    }

    @Deprecated
    public static e x() {
        return s.f116518b;
    }

    @Deprecated
    public static e y() {
        return t.f116519b;
    }

    @Deprecated
    public static e z() {
        return u.f116520b;
    }

    public int A(CharSequence sequence) {
        for (int length = sequence.length() - 1; length >= 0; length--) {
            if (B(sequence.charAt(length))) {
                return length;
            }
        }
        return -1;
    }

    public abstract boolean B(char c10);

    public boolean C(CharSequence sequence) {
        for (int length = sequence.length() - 1; length >= 0; length--) {
            if (!B(sequence.charAt(length))) {
                return false;
            }
        }
        return true;
    }

    public boolean D(CharSequence sequence) {
        return !E(sequence);
    }

    public boolean E(CharSequence sequence) {
        return n(sequence) == -1;
    }

    public e F() {
        return new w(this);
    }

    public e I(e other) {
        return new z(this, other);
    }

    public e J() {
        return i0.h(this);
    }

    @com.google.common.annotations.c
    e K() {
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
        return new a(this, L(i10, bitSet, strSubstring), string);
    }

    public String M(CharSequence sequence) {
        String string = sequence.toString();
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

    public String N(CharSequence sequence, char replacement) {
        String string = sequence.toString();
        int iN = n(string);
        if (iN == -1) {
            return string;
        }
        char[] charArray = string.toCharArray();
        charArray[iN] = replacement;
        while (true) {
            iN++;
            if (iN >= charArray.length) {
                return new String(charArray);
            }
            if (B(charArray[iN])) {
                charArray[iN] = replacement;
            }
        }
    }

    public String O(CharSequence sequence, CharSequence replacement) {
        int length = replacement.length();
        if (length == 0) {
            return M(sequence);
        }
        int i10 = 0;
        if (length == 1) {
            return N(sequence, replacement.charAt(0));
        }
        String string = sequence.toString();
        int iN = n(string);
        if (iN == -1) {
            return string;
        }
        int length2 = string.length();
        StringBuilder sb2 = new StringBuilder(((length2 * 3) / 2) + 16);
        do {
            sb2.append((CharSequence) string, i10, iN);
            sb2.append(replacement);
            i10 = iN + 1;
            iN = o(string, i10);
        } while (iN != -1);
        sb2.append((CharSequence) string, i10, length2);
        return sb2.toString();
    }

    public String P(CharSequence sequence) {
        return F().M(sequence);
    }

    @com.google.common.annotations.c
    void Q(BitSet table) {
        for (int i10 = 65535; i10 >= 0; i10--) {
            if (B((char) i10)) {
                table.set(i10);
            }
        }
    }

    public String T(CharSequence sequence, char replacement) {
        int length = sequence.length();
        int i10 = length - 1;
        int i11 = 0;
        while (i11 < length && B(sequence.charAt(i11))) {
            i11++;
        }
        int i12 = i10;
        while (i12 > i11 && B(sequence.charAt(i12))) {
            i12--;
        }
        if (i11 == 0 && i12 == i10) {
            return h(sequence, replacement);
        }
        int i13 = i12 + 1;
        return k(sequence, i11, i13, replacement, new StringBuilder(i13 - i11), false);
    }

    public String U(CharSequence sequence) {
        int length = sequence.length();
        int i10 = 0;
        while (i10 < length && B(sequence.charAt(i10))) {
            i10++;
        }
        int i11 = length - 1;
        while (i11 > i10 && B(sequence.charAt(i11))) {
            i11--;
        }
        return sequence.subSequence(i10, i11 + 1).toString();
    }

    public String V(CharSequence sequence) {
        int length = sequence.length();
        for (int i10 = 0; i10 < length; i10++) {
            if (!B(sequence.charAt(i10))) {
                return sequence.subSequence(i10, length).toString();
            }
        }
        return "";
    }

    public String W(CharSequence sequence) {
        int length = sequence.length();
        do {
            length--;
            if (length < 0) {
                return "";
            }
        } while (B(sequence.charAt(length)));
        int i10 = 6 >> 0;
        return sequence.subSequence(0, length + 1).toString();
    }

    public e b(e other) {
        return new b(this, other);
    }

    @Override // com.google.common.base.k0
    @Deprecated
    /* JADX INFO: renamed from: e */
    public boolean apply(Character character) {
        return B(character.charValue());
    }

    public String h(CharSequence sequence, char replacement) {
        int length = sequence.length();
        int i10 = 0;
        while (i10 < length) {
            char cCharAt = sequence.charAt(i10);
            if (B(cCharAt)) {
                if (cCharAt != replacement || (i10 != length - 1 && B(sequence.charAt(i10 + 1)))) {
                    StringBuilder sb2 = new StringBuilder(length);
                    sb2.append(sequence, 0, i10);
                    sb2.append(replacement);
                    return k(sequence, i10 + 1, length, replacement, sb2, true);
                }
                i10++;
            }
            i10++;
            replacement = replacement;
        }
        return sequence.toString();
    }

    public int i(CharSequence sequence) {
        int i10 = 0;
        for (int i11 = 0; i11 < sequence.length(); i11++) {
            if (B(sequence.charAt(i11))) {
                i10++;
            }
        }
        return i10;
    }

    public int n(CharSequence sequence) {
        return o(sequence, 0);
    }

    public int o(CharSequence sequence, int start) {
        int length = sequence.length();
        j0.d0(start, length);
        while (start < length) {
            if (B(sequence.charAt(start))) {
                return start;
            }
            start++;
        }
        return -1;
    }

    public String toString() {
        return super.toString();
    }
}
