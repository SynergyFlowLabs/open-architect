package kotlin.time;

import java.util.Collection;
import java.util.Iterator;
import kotlin.b1;
import kotlin.collections.IntIterator;
import kotlin.e1;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.m2;
import kotlin.ranges.IntRange;
import kotlin.ranges.r;
import kotlin.text.StringsKt;
import kotlinx.serialization.json.internal.AbstractJsonLexerKt;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes11.dex */
@SourceDebugExtension({"SMAP\nDuration.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Duration.kt\nkotlin/time/DurationKt\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 3 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,1494:1\n1447#1,6:1496\n1450#1,3:1502\n1447#1,6:1505\n1447#1,6:1511\n1450#1,3:1520\n1#2:1495\n1734#3,3:1517\n*S KotlinDebug\n*F\n+ 1 Duration.kt\nkotlin/time/DurationKt\n*L\n1371#1:1496,6\n1405#1:1502,3\n1408#1:1505,6\n1411#1:1511,6\n1447#1:1520,3\n1436#1:1517,3\n*E\n"})
public final class e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final int f313413a = 1000000;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final long f313414b = 4611686018426999999L;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final long f313415c = 4611686018427387903L;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private static final long f313416d = 4611686018426L;

    @kotlin.l(message = "Use 'Double.microseconds' extension property from Duration.Companion instead.", replaceWith = @b1(expression = "this.microseconds", imports = {"kotlin.time.Duration.Companion.microseconds"}))
    @e1(version = "1.3")
    @kotlin.m(errorSince = "1.8", hiddenSince = "1.9", warningSince = "1.5")
    @j
    public static /* synthetic */ void C(double d10) {
    }

    @kotlin.l(message = "Use 'Int.microseconds' extension property from Duration.Companion instead.", replaceWith = @b1(expression = "this.microseconds", imports = {"kotlin.time.Duration.Companion.microseconds"}))
    @e1(version = "1.3")
    @kotlin.m(errorSince = "1.8", hiddenSince = "1.9", warningSince = "1.5")
    @j
    public static /* synthetic */ void D(int i10) {
    }

    @kotlin.l(message = "Use 'Long.microseconds' extension property from Duration.Companion instead.", replaceWith = @b1(expression = "this.microseconds", imports = {"kotlin.time.Duration.Companion.microseconds"}))
    @e1(version = "1.3")
    @kotlin.m(errorSince = "1.8", hiddenSince = "1.9", warningSince = "1.5")
    @j
    public static /* synthetic */ void E(long j10) {
    }

    @kotlin.l(message = "Use 'Double.milliseconds' extension property from Duration.Companion instead.", replaceWith = @b1(expression = "this.milliseconds", imports = {"kotlin.time.Duration.Companion.milliseconds"}))
    @e1(version = "1.3")
    @kotlin.m(errorSince = "1.8", hiddenSince = "1.9", warningSince = "1.5")
    @j
    public static /* synthetic */ void I(double d10) {
    }

    @kotlin.l(message = "Use 'Int.milliseconds' extension property from Duration.Companion instead.", replaceWith = @b1(expression = "this.milliseconds", imports = {"kotlin.time.Duration.Companion.milliseconds"}))
    @e1(version = "1.3")
    @kotlin.m(errorSince = "1.8", hiddenSince = "1.9", warningSince = "1.5")
    @j
    public static /* synthetic */ void J(int i10) {
    }

    @kotlin.l(message = "Use 'Long.milliseconds' extension property from Duration.Companion instead.", replaceWith = @b1(expression = "this.milliseconds", imports = {"kotlin.time.Duration.Companion.milliseconds"}))
    @e1(version = "1.3")
    @kotlin.m(errorSince = "1.8", hiddenSince = "1.9", warningSince = "1.5")
    @j
    public static /* synthetic */ void K(long j10) {
    }

    @kotlin.l(message = "Use 'Double.minutes' extension property from Duration.Companion instead.", replaceWith = @b1(expression = "this.minutes", imports = {"kotlin.time.Duration.Companion.minutes"}))
    @e1(version = "1.3")
    @kotlin.m(errorSince = "1.8", hiddenSince = "1.9", warningSince = "1.5")
    @j
    public static /* synthetic */ void O(double d10) {
    }

    @kotlin.l(message = "Use 'Int.minutes' extension property from Duration.Companion instead.", replaceWith = @b1(expression = "this.minutes", imports = {"kotlin.time.Duration.Companion.minutes"}))
    @e1(version = "1.3")
    @kotlin.m(errorSince = "1.8", hiddenSince = "1.9", warningSince = "1.5")
    @j
    public static /* synthetic */ void P(int i10) {
    }

    @kotlin.l(message = "Use 'Long.minutes' extension property from Duration.Companion instead.", replaceWith = @b1(expression = "this.minutes", imports = {"kotlin.time.Duration.Companion.minutes"}))
    @e1(version = "1.3")
    @kotlin.m(errorSince = "1.8", hiddenSince = "1.9", warningSince = "1.5")
    @j
    public static /* synthetic */ void Q(long j10) {
    }

    @kotlin.l(message = "Use 'Double.nanoseconds' extension property from Duration.Companion instead.", replaceWith = @b1(expression = "this.nanoseconds", imports = {"kotlin.time.Duration.Companion.nanoseconds"}))
    @e1(version = "1.3")
    @kotlin.m(errorSince = "1.8", hiddenSince = "1.9", warningSince = "1.5")
    @j
    public static /* synthetic */ void U(double d10) {
    }

    @kotlin.l(message = "Use 'Int.nanoseconds' extension property from Duration.Companion instead.", replaceWith = @b1(expression = "this.nanoseconds", imports = {"kotlin.time.Duration.Companion.nanoseconds"}))
    @e1(version = "1.3")
    @kotlin.m(errorSince = "1.8", hiddenSince = "1.9", warningSince = "1.5")
    @j
    public static /* synthetic */ void V(int i10) {
    }

    @kotlin.l(message = "Use 'Long.nanoseconds' extension property from Duration.Companion instead.", replaceWith = @b1(expression = "this.nanoseconds", imports = {"kotlin.time.Duration.Companion.nanoseconds"}))
    @e1(version = "1.3")
    @kotlin.m(errorSince = "1.8", hiddenSince = "1.9", warningSince = "1.5")
    @j
    public static /* synthetic */ void W(long j10) {
    }

    @kotlin.l(message = "Use 'Double.seconds' extension property from Duration.Companion instead.", replaceWith = @b1(expression = "this.seconds", imports = {"kotlin.time.Duration.Companion.seconds"}))
    @e1(version = "1.3")
    @kotlin.m(errorSince = "1.8", hiddenSince = "1.9", warningSince = "1.5")
    @j
    public static /* synthetic */ void a0(double d10) {
    }

    @kotlin.l(message = "Use 'Int.seconds' extension property from Duration.Companion instead.", replaceWith = @b1(expression = "this.seconds", imports = {"kotlin.time.Duration.Companion.seconds"}))
    @e1(version = "1.3")
    @kotlin.m(errorSince = "1.8", hiddenSince = "1.9", warningSince = "1.5")
    @j
    public static /* synthetic */ void b0(int i10) {
    }

    @kotlin.l(message = "Use 'Long.seconds' extension property from Duration.Companion instead.", replaceWith = @b1(expression = "this.seconds", imports = {"kotlin.time.Duration.Companion.seconds"}))
    @e1(version = "1.3")
    @kotlin.m(errorSince = "1.8", hiddenSince = "1.9", warningSince = "1.5")
    @j
    public static /* synthetic */ void c0(long j10) {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final long d0(long j10) {
        return j10 * ((long) 1000000);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final long e0(long j10) {
        return j10 / ((long) 1000000);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final long f0(String str, boolean z10) {
        int i10;
        char cCharAt;
        char cCharAt2;
        int i11;
        int length = str.length();
        if (length == 0) {
            throw new IllegalArgumentException("The string is empty");
        }
        c.a aVar = c.f313406b;
        long jW = aVar.W();
        char cCharAt3 = str.charAt(0);
        int length2 = (cCharAt3 == '+' || cCharAt3 == '-') ? 1 : 0;
        boolean z11 = length2 > 0;
        boolean z12 = z11 && StringsKt.d5(str, org.apache.commons.codec.language.l.f335457d, false, 2, null);
        if (length <= length2) {
            throw new IllegalArgumentException("No components");
        }
        char cCharAt4 = str.charAt(length2);
        char c10 = AbstractJsonLexerKt.COLON;
        char c11 = org.locationtech.jts.geom.l.f338160j;
        if (cCharAt4 == 'P') {
            int i12 = length2 + 1;
            if (i12 == length) {
                throw new IllegalArgumentException();
            }
            boolean z13 = false;
            f fVar = null;
            while (i12 < length) {
                if (str.charAt(i12) != 'T') {
                    int i13 = i12;
                    while (true) {
                        if (i13 >= str.length()) {
                            i11 = length;
                            break;
                        }
                        char cCharAt5 = str.charAt(i13);
                        if (c11 > cCharAt5 || cCharAt5 >= c10) {
                            i11 = length;
                            if (!StringsKt.U2("+-.", cCharAt5, false, 2, null)) {
                                break;
                            }
                        } else {
                            i11 = length;
                        }
                        i13++;
                        length = i11;
                        c11 = org.locationtech.jts.geom.l.f338160j;
                        c10 = AbstractJsonLexerKt.COLON;
                    }
                    Intrinsics.checkNotNull(str, "null cannot be cast to non-null type java.lang.String");
                    String strSubstring = str.substring(i12, i13);
                    Intrinsics.checkNotNullExpressionValue(strSubstring, "substring(...)");
                    if (strSubstring.length() == 0) {
                        throw new IllegalArgumentException();
                    }
                    int length3 = i12 + strSubstring.length();
                    if (length3 < 0 || length3 >= str.length()) {
                        throw new IllegalArgumentException("Missing unit for value " + strSubstring);
                    }
                    char cCharAt6 = str.charAt(length3);
                    i12 = length3 + 1;
                    f fVarF = i.f(cCharAt6, z13);
                    if (fVar != null && fVar.compareTo(fVarF) <= 0) {
                        throw new IllegalArgumentException("Unexpected order of duration components");
                    }
                    int iQ3 = StringsKt.q3(strSubstring, '.', 0, false, 6, null);
                    if (fVarF != f.SECONDS || iQ3 <= 0) {
                        jW = c.A0(jW, n0(g0(strSubstring), fVarF));
                    } else {
                        Intrinsics.checkNotNull(strSubstring, "null cannot be cast to non-null type java.lang.String");
                        String strSubstring2 = strSubstring.substring(0, iQ3);
                        Intrinsics.checkNotNullExpressionValue(strSubstring2, "substring(...)");
                        long jA0 = c.A0(jW, n0(g0(strSubstring2), fVarF));
                        Intrinsics.checkNotNull(strSubstring, "null cannot be cast to non-null type java.lang.String");
                        String strSubstring3 = strSubstring.substring(iQ3);
                        Intrinsics.checkNotNullExpressionValue(strSubstring3, "substring(...)");
                        jW = c.A0(jA0, l0(Double.parseDouble(strSubstring3), fVarF));
                    }
                    z13 = z13;
                    fVar = fVarF;
                    length = i11;
                    c11 = org.locationtech.jts.geom.l.f338160j;
                    c10 = AbstractJsonLexerKt.COLON;
                } else {
                    if (z13 || (i12 = i12 + 1) == length) {
                        throw new IllegalArgumentException();
                    }
                    z13 = true;
                }
            }
        } else {
            if (z10) {
                throw new IllegalArgumentException();
            }
            int iMax = Math.max(length - length2, 8);
            char c12 = org.locationtech.jts.geom.l.f338160j;
            if (StringsKt.d2(str, length2, "Infinity", 0, iMax, true)) {
                jW = aVar.q();
            } else {
                boolean z14 = !z11;
                if (z11 && str.charAt(length2) == '(' && StringsKt.t7(str) == ')') {
                    length2++;
                    int i14 = length - 1;
                    if (length2 == i14) {
                        throw new IllegalArgumentException("No components");
                    }
                    i10 = i14;
                    z14 = true;
                } else {
                    i10 = length;
                }
                boolean z15 = false;
                f fVar2 = null;
                while (length2 < i10) {
                    if (z15 && z14) {
                        while (length2 < str.length() && str.charAt(length2) == ' ') {
                            length2++;
                        }
                    }
                    int i15 = length2;
                    while (i15 < str.length() && ((c12 <= (cCharAt2 = str.charAt(i15)) && cCharAt2 < ':') || cCharAt2 == '.')) {
                        i15++;
                    }
                    Intrinsics.checkNotNull(str, "null cannot be cast to non-null type java.lang.String");
                    String strSubstring4 = str.substring(length2, i15);
                    Intrinsics.checkNotNullExpressionValue(strSubstring4, "substring(...)");
                    if (strSubstring4.length() == 0) {
                        throw new IllegalArgumentException();
                    }
                    int length4 = length2 + strSubstring4.length();
                    int i16 = length4;
                    while (i16 < str.length() && 'a' <= (cCharAt = str.charAt(i16)) && cCharAt < '{') {
                        i16++;
                    }
                    Intrinsics.checkNotNull(str, "null cannot be cast to non-null type java.lang.String");
                    String strSubstring5 = str.substring(length4, i16);
                    Intrinsics.checkNotNullExpressionValue(strSubstring5, "substring(...)");
                    length2 = length4 + strSubstring5.length();
                    f fVarG = i.g(strSubstring5);
                    if (fVar2 != null && fVar2.compareTo(fVarG) <= 0) {
                        throw new IllegalArgumentException("Unexpected order of duration components");
                    }
                    int iQ4 = StringsKt.q3(strSubstring4, '.', 0, false, 6, null);
                    if (iQ4 > 0) {
                        Intrinsics.checkNotNull(strSubstring4, "null cannot be cast to non-null type java.lang.String");
                        String strSubstring6 = strSubstring4.substring(0, iQ4);
                        Intrinsics.checkNotNullExpressionValue(strSubstring6, "substring(...)");
                        long jA1 = c.A0(jW, n0(Long.parseLong(strSubstring6), fVarG));
                        Intrinsics.checkNotNull(strSubstring4, "null cannot be cast to non-null type java.lang.String");
                        String strSubstring7 = strSubstring4.substring(iQ4);
                        Intrinsics.checkNotNullExpressionValue(strSubstring7, "substring(...)");
                        jW = c.A0(jA1, l0(Double.parseDouble(strSubstring7), fVarG));
                        if (length2 < i10) {
                            throw new IllegalArgumentException("Fractional component must be last");
                        }
                    } else {
                        jW = c.A0(jW, n0(Long.parseLong(strSubstring4), fVarG));
                    }
                    fVar2 = fVarG;
                    z15 = true;
                    c12 = org.locationtech.jts.geom.l.f338160j;
                }
            }
        }
        return z12 ? c.R0(jW) : jW;
    }

    private static final long g0(String str) {
        int length = str.length();
        int i10 = (length <= 0 || !StringsKt.U2("+-", str.charAt(0), false, 2, null)) ? 0 : 1;
        if (length - i10 > 16) {
            Iterable intRange = new IntRange(i10, StringsKt.i3(str));
            if (!(intRange instanceof Collection) || !((Collection) intRange).isEmpty()) {
                Iterator it = intRange.iterator();
                while (true) {
                    if (it.hasNext()) {
                        char cCharAt = str.charAt(((IntIterator) it).nextInt());
                        if ('0' > cCharAt || cCharAt >= ':') {
                        }
                    }
                }
            }
            return str.charAt(0) == '-' ? Long.MIN_VALUE : Long.MAX_VALUE;
        }
        return StringsKt.u2(str, org.slf4j.h.f339615a3, false, 2, null) ? Long.parseLong(StringsKt.A6(str, 1)) : Long.parseLong(str);
    }

    private static final int h0(String str, int i10, Function1<? super Character, Boolean> function1) {
        while (i10 < str.length() && function1.invoke(Character.valueOf(str.charAt(i10))).booleanValue()) {
            i10++;
        }
        return i10;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final long i(long j10, int i10) {
        return c.t((j10 << 1) + ((long) i10));
    }

    private static final String i0(String str, int i10, Function1<? super Character, Boolean> function1) {
        int i11 = i10;
        while (i11 < str.length() && function1.invoke(Character.valueOf(str.charAt(i11))).booleanValue()) {
            i11++;
        }
        Intrinsics.checkNotNull(str, "null cannot be cast to non-null type java.lang.String");
        String strSubstring = str.substring(i10, i11);
        Intrinsics.checkNotNullExpressionValue(strSubstring, "substring(...)");
        return strSubstring;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final long j(long j10) {
        return c.t((j10 << 1) + 1);
    }

    @m2(markerClass = {j.class})
    @e1(version = "1.6")
    @kotlin.internal.f
    private static final long j0(double d10, long j10) {
        return c.B0(j10, d10);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final long k(long j10) {
        return (-4611686018426L > j10 || j10 >= 4611686018427L) ? j(r.K(j10, -4611686018427387903L, 4611686018427387903L)) : l(d0(j10));
    }

    @m2(markerClass = {j.class})
    @e1(version = "1.6")
    @kotlin.internal.f
    private static final long k0(int i10, long j10) {
        return c.C0(j10, i10);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final long l(long j10) {
        return c.t(j10 << 1);
    }

    @m2(markerClass = {j.class})
    @e1(version = "1.6")
    public static final long l0(double d10, @NotNull f unit) {
        Intrinsics.checkNotNullParameter(unit, "unit");
        double dA = h.a(d10, unit, f.NANOSECONDS);
        if (Double.isNaN(dA)) {
            throw new IllegalArgumentException("Duration value cannot be NaN.");
        }
        long jM0 = kotlin.math.b.M0(dA);
        return (-4611686018426999999L > jM0 || jM0 >= 4611686018427000000L) ? k(kotlin.math.b.M0(h.a(d10, unit, f.MILLISECONDS))) : l(jM0);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final long m(long j10) {
        return (-4611686018426999999L > j10 || j10 >= 4611686018427000000L) ? j(e0(j10)) : l(j10);
    }

    @m2(markerClass = {j.class})
    @e1(version = "1.6")
    public static final long m0(int i10, @NotNull f unit) {
        Intrinsics.checkNotNullParameter(unit, "unit");
        return unit.compareTo(f.SECONDS) <= 0 ? l(h.c(i10, unit, f.NANOSECONDS)) : n0(i10, unit);
    }

    @m2(markerClass = {j.class})
    @e1(version = "1.6")
    public static final long n0(long j10, @NotNull f unit) {
        Intrinsics.checkNotNullParameter(unit, "unit");
        f fVar = f.NANOSECONDS;
        long jC = h.c(f313414b, fVar, unit);
        return ((-jC) > j10 || j10 > jC) ? j(r.K(h.b(j10, unit, f.MILLISECONDS), -4611686018427387903L, 4611686018427387903L)) : l(h.c(j10, unit, fVar));
    }

    @kotlin.l(message = "Use 'Double.days' extension property from Duration.Companion instead.", replaceWith = @b1(expression = "this.days", imports = {"kotlin.time.Duration.Companion.days"}))
    @e1(version = "1.3")
    @kotlin.m(errorSince = "1.8", hiddenSince = "1.9", warningSince = "1.5")
    @j
    public static /* synthetic */ void q(double d10) {
    }

    @kotlin.l(message = "Use 'Int.days' extension property from Duration.Companion instead.", replaceWith = @b1(expression = "this.days", imports = {"kotlin.time.Duration.Companion.days"}))
    @e1(version = "1.3")
    @kotlin.m(errorSince = "1.8", hiddenSince = "1.9", warningSince = "1.5")
    @j
    public static /* synthetic */ void r(int i10) {
    }

    @kotlin.l(message = "Use 'Long.days' extension property from Duration.Companion instead.", replaceWith = @b1(expression = "this.days", imports = {"kotlin.time.Duration.Companion.days"}))
    @e1(version = "1.3")
    @kotlin.m(errorSince = "1.8", hiddenSince = "1.9", warningSince = "1.5")
    @j
    public static /* synthetic */ void s(long j10) {
    }

    @kotlin.l(message = "Use 'Double.hours' extension property from Duration.Companion instead.", replaceWith = @b1(expression = "this.hours", imports = {"kotlin.time.Duration.Companion.hours"}))
    @e1(version = "1.3")
    @kotlin.m(errorSince = "1.8", hiddenSince = "1.9", warningSince = "1.5")
    @j
    public static /* synthetic */ void w(double d10) {
    }

    @kotlin.l(message = "Use 'Int.hours' extension property from Duration.Companion instead.", replaceWith = @b1(expression = "this.hours", imports = {"kotlin.time.Duration.Companion.hours"}))
    @e1(version = "1.3")
    @kotlin.m(errorSince = "1.8", hiddenSince = "1.9", warningSince = "1.5")
    @j
    public static /* synthetic */ void x(int i10) {
    }

    @kotlin.l(message = "Use 'Long.hours' extension property from Duration.Companion instead.", replaceWith = @b1(expression = "this.hours", imports = {"kotlin.time.Duration.Companion.hours"}))
    @e1(version = "1.3")
    @kotlin.m(errorSince = "1.8", hiddenSince = "1.9", warningSince = "1.5")
    @j
    public static /* synthetic */ void y(long j10) {
    }
}
