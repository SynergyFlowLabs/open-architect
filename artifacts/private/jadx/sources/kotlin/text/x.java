package kotlin.text;

import java.math.BigDecimal;
import java.math.BigInteger;
import java.util.Comparator;
import java.util.SortedSet;
import java.util.TreeSet;
import kotlin.b1;
import kotlin.e1;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.u0;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes11.dex */
@SourceDebugExtension({"SMAP\n_StringsJvm.kt\nKotlin\n*S Kotlin\n*F\n+ 1 _StringsJvm.kt\nkotlin/text/StringsKt___StringsJvmKt\n+ 2 _Strings.kt\nkotlin/text/StringsKt___StringsKt\n*L\n1#1,108:1\n1244#2,14:109\n1526#2,14:123\n*S KotlinDebug\n*F\n+ 1 _StringsJvm.kt\nkotlin/text/StringsKt___StringsJvmKt\n*L\n45#1:109,14\n66#1:123,14\n*E\n"})
class x extends StringsKt__StringsKt {
    @kotlin.internal.f
    private static final char W5(CharSequence charSequence, int i10) {
        Intrinsics.checkNotNullParameter(charSequence, "<this>");
        return charSequence.charAt(i10);
    }

    @kotlin.l(message = "Use maxOrNull instead.", replaceWith = @b1(expression = "this.maxOrNull()", imports = {}))
    @kotlin.m(errorSince = "1.5", hiddenSince = "1.6", warningSince = "1.4")
    public static final /* synthetic */ Character X5(CharSequence charSequence) {
        Intrinsics.checkNotNullParameter(charSequence, "<this>");
        return y.P7(charSequence);
    }

    @kotlin.l(message = "Use maxByOrNull instead.", replaceWith = @b1(expression = "this.maxByOrNull(selector)", imports = {}))
    @kotlin.m(errorSince = "1.5", hiddenSince = "1.6", warningSince = "1.4")
    public static final /* synthetic */ <R extends Comparable<? super R>> Character Y5(CharSequence charSequence, Function1<? super Character, ? extends R> selector) {
        Intrinsics.checkNotNullParameter(charSequence, "<this>");
        Intrinsics.checkNotNullParameter(selector, "selector");
        if (charSequence.length() == 0) {
            return null;
        }
        char cCharAt = charSequence.charAt(0);
        int iI3 = StringsKt__StringsKt.i3(charSequence);
        if (iI3 == 0) {
            return Character.valueOf(cCharAt);
        }
        R rInvoke = selector.invoke(Character.valueOf(cCharAt));
        int i10 = 1;
        if (1 <= iI3) {
            while (true) {
                char cCharAt2 = charSequence.charAt(i10);
                R rInvoke2 = selector.invoke(Character.valueOf(cCharAt2));
                if (rInvoke.compareTo(rInvoke2) < 0) {
                    cCharAt = cCharAt2;
                    rInvoke = rInvoke2;
                }
                if (i10 == iI3) {
                    break;
                }
                i10++;
            }
        }
        return Character.valueOf(cCharAt);
    }

    @kotlin.l(message = "Use maxWithOrNull instead.", replaceWith = @b1(expression = "this.maxWithOrNull(comparator)", imports = {}))
    @kotlin.m(errorSince = "1.5", hiddenSince = "1.6", warningSince = "1.4")
    public static final /* synthetic */ Character Z5(CharSequence charSequence, Comparator comparator) {
        Intrinsics.checkNotNullParameter(charSequence, "<this>");
        Intrinsics.checkNotNullParameter(comparator, "comparator");
        return y.R7(charSequence, comparator);
    }

    @kotlin.l(message = "Use minOrNull instead.", replaceWith = @b1(expression = "this.minOrNull()", imports = {}))
    @kotlin.m(errorSince = "1.5", hiddenSince = "1.6", warningSince = "1.4")
    public static final /* synthetic */ Character a6(CharSequence charSequence) {
        Intrinsics.checkNotNullParameter(charSequence, "<this>");
        return y.d8(charSequence);
    }

    @kotlin.l(message = "Use minByOrNull instead.", replaceWith = @b1(expression = "this.minByOrNull(selector)", imports = {}))
    @kotlin.m(errorSince = "1.5", hiddenSince = "1.6", warningSince = "1.4")
    public static final /* synthetic */ <R extends Comparable<? super R>> Character b6(CharSequence charSequence, Function1<? super Character, ? extends R> selector) {
        Intrinsics.checkNotNullParameter(charSequence, "<this>");
        Intrinsics.checkNotNullParameter(selector, "selector");
        if (charSequence.length() == 0) {
            return null;
        }
        char cCharAt = charSequence.charAt(0);
        int iI3 = StringsKt__StringsKt.i3(charSequence);
        if (iI3 == 0) {
            return Character.valueOf(cCharAt);
        }
        R rInvoke = selector.invoke(Character.valueOf(cCharAt));
        int i10 = 1;
        if (1 <= iI3) {
            while (true) {
                char cCharAt2 = charSequence.charAt(i10);
                R rInvoke2 = selector.invoke(Character.valueOf(cCharAt2));
                if (rInvoke.compareTo(rInvoke2) > 0) {
                    cCharAt = cCharAt2;
                    rInvoke = rInvoke2;
                }
                if (i10 == iI3) {
                    break;
                }
                i10++;
            }
        }
        return Character.valueOf(cCharAt);
    }

    @kotlin.l(message = "Use minWithOrNull instead.", replaceWith = @b1(expression = "this.minWithOrNull(comparator)", imports = {}))
    @kotlin.m(errorSince = "1.5", hiddenSince = "1.6", warningSince = "1.4")
    public static final /* synthetic */ Character c6(CharSequence charSequence, Comparator comparator) {
        Intrinsics.checkNotNullParameter(charSequence, "<this>");
        Intrinsics.checkNotNullParameter(comparator, "comparator");
        return y.f8(charSequence, comparator);
    }

    @u0
    @e1(version = "1.4")
    @kotlin.internal.f
    @oj.i(name = "sumOfBigDecimal")
    private static final BigDecimal d6(CharSequence charSequence, Function1<? super Character, ? extends BigDecimal> selector) {
        Intrinsics.checkNotNullParameter(charSequence, "<this>");
        Intrinsics.checkNotNullParameter(selector, "selector");
        BigDecimal bigDecimalValueOf = BigDecimal.valueOf(0L);
        Intrinsics.checkNotNullExpressionValue(bigDecimalValueOf, "valueOf(...)");
        for (int i10 = 0; i10 < charSequence.length(); i10++) {
            bigDecimalValueOf = bigDecimalValueOf.add(selector.invoke(Character.valueOf(charSequence.charAt(i10))));
            Intrinsics.checkNotNullExpressionValue(bigDecimalValueOf, "add(...)");
        }
        return bigDecimalValueOf;
    }

    @u0
    @e1(version = "1.4")
    @kotlin.internal.f
    @oj.i(name = "sumOfBigInteger")
    private static final BigInteger e6(CharSequence charSequence, Function1<? super Character, ? extends BigInteger> selector) {
        Intrinsics.checkNotNullParameter(charSequence, "<this>");
        Intrinsics.checkNotNullParameter(selector, "selector");
        BigInteger bigIntegerValueOf = BigInteger.valueOf(0L);
        Intrinsics.checkNotNullExpressionValue(bigIntegerValueOf, "valueOf(...)");
        for (int i10 = 0; i10 < charSequence.length(); i10++) {
            bigIntegerValueOf = bigIntegerValueOf.add(selector.invoke(Character.valueOf(charSequence.charAt(i10))));
            Intrinsics.checkNotNullExpressionValue(bigIntegerValueOf, "add(...)");
        }
        return bigIntegerValueOf;
    }

    @NotNull
    public static final SortedSet<Character> f6(@NotNull CharSequence charSequence) {
        Intrinsics.checkNotNullParameter(charSequence, "<this>");
        return (SortedSet) y.e9(charSequence, new TreeSet());
    }
}
