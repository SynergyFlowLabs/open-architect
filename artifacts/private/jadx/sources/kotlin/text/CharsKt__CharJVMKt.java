package kotlin.text;

import java.util.Locale;
import kotlin.a1;
import kotlin.b1;
import kotlin.e1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.m2;
import kotlin.ranges.IntRange;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: Access modifiers changed from: package-private */
/* JADX INFO: loaded from: classes11.dex */
public class CharsKt__CharJVMKt {
    @m2(markerClass = {kotlin.s.class})
    @e1(version = "1.5")
    @NotNull
    public static final String A(char c10, @NotNull Locale locale) {
        Intrinsics.checkNotNullParameter(locale, "locale");
        String strValueOf = String.valueOf(c10);
        Intrinsics.checkNotNull(strValueOf, "null cannot be cast to non-null type java.lang.String");
        String upperCase = strValueOf.toUpperCase(locale);
        Intrinsics.checkNotNullExpressionValue(upperCase, "toUpperCase(...)");
        return upperCase;
    }

    @m2(markerClass = {kotlin.s.class})
    @e1(version = "1.5")
    @kotlin.internal.f
    private static final char B(char c10) {
        return Character.toUpperCase(c10);
    }

    public static final int a(char c10, int i10) {
        return Character.digit((int) c10, i10);
    }

    @NotNull
    public static final a b(char c10) {
        return a.f313223c.a(Character.getType(c10));
    }

    @NotNull
    public static final b c(char c10) {
        return b.f313254b.b(Character.getDirectionality(c10));
    }

    @a1
    public static int checkRadix(int i10) {
        if (2 <= i10 && i10 < 37) {
            return i10;
        }
        throw new IllegalArgumentException("radix " + i10 + " was not in valid range " + new IntRange(2, 36));
    }

    @kotlin.internal.f
    private static final boolean d(char c10) {
        return Character.isDefined(c10);
    }

    @kotlin.internal.f
    private static final boolean e(char c10) {
        return Character.isDigit(c10);
    }

    @kotlin.internal.f
    private static final boolean f(char c10) {
        return Character.isHighSurrogate(c10);
    }

    @kotlin.internal.f
    private static final boolean g(char c10) {
        return Character.isISOControl(c10);
    }

    @kotlin.internal.f
    private static final boolean h(char c10) {
        return Character.isIdentifierIgnorable(c10);
    }

    @kotlin.internal.f
    private static final boolean i(char c10) {
        return Character.isJavaIdentifierPart(c10);
    }

    @kotlin.internal.f
    private static final boolean j(char c10) {
        return Character.isJavaIdentifierStart(c10);
    }

    @kotlin.internal.f
    private static final boolean k(char c10) {
        return Character.isLetter(c10);
    }

    @kotlin.internal.f
    private static final boolean l(char c10) {
        return Character.isLetterOrDigit(c10);
    }

    @kotlin.internal.f
    private static final boolean m(char c10) {
        return Character.isLowSurrogate(c10);
    }

    @kotlin.internal.f
    private static final boolean n(char c10) {
        return Character.isLowerCase(c10);
    }

    @kotlin.internal.f
    private static final boolean o(char c10) {
        return Character.isTitleCase(c10);
    }

    @kotlin.internal.f
    private static final boolean p(char c10) {
        return Character.isUpperCase(c10);
    }

    public static boolean q(char c10) {
        return Character.isWhitespace(c10) || Character.isSpaceChar(c10);
    }

    @m2(markerClass = {kotlin.s.class})
    @e1(version = "1.5")
    @kotlin.internal.f
    private static final String r(char c10) {
        String strValueOf = String.valueOf(c10);
        Intrinsics.checkNotNull(strValueOf, "null cannot be cast to non-null type java.lang.String");
        String lowerCase = strValueOf.toLowerCase(Locale.ROOT);
        Intrinsics.checkNotNullExpressionValue(lowerCase, "toLowerCase(...)");
        return lowerCase;
    }

    @m2(markerClass = {kotlin.s.class})
    @e1(version = "1.5")
    @NotNull
    public static String s(char c10, @NotNull Locale locale) {
        Intrinsics.checkNotNullParameter(locale, "locale");
        String strValueOf = String.valueOf(c10);
        Intrinsics.checkNotNull(strValueOf, "null cannot be cast to non-null type java.lang.String");
        String lowerCase = strValueOf.toLowerCase(locale);
        Intrinsics.checkNotNullExpressionValue(lowerCase, "toLowerCase(...)");
        return lowerCase;
    }

    @m2(markerClass = {kotlin.s.class})
    @e1(version = "1.5")
    @kotlin.internal.f
    private static final char t(char c10) {
        return Character.toLowerCase(c10);
    }

    @m2(markerClass = {kotlin.s.class})
    @e1(version = "1.5")
    @NotNull
    public static String u(char c10, @NotNull Locale locale) {
        Intrinsics.checkNotNullParameter(locale, "locale");
        String strA = A(c10, locale);
        if (strA.length() <= 1) {
            String strValueOf = String.valueOf(c10);
            Intrinsics.checkNotNull(strValueOf, "null cannot be cast to non-null type java.lang.String");
            String upperCase = strValueOf.toUpperCase(Locale.ROOT);
            Intrinsics.checkNotNullExpressionValue(upperCase, "toUpperCase(...)");
            if (Intrinsics.areEqual(strA, upperCase)) {
                return String.valueOf(Character.toTitleCase(c10));
            }
        } else if (c10 != 329) {
            char cCharAt = strA.charAt(0);
            Intrinsics.checkNotNull(strA, "null cannot be cast to non-null type java.lang.String");
            String strSubstring = strA.substring(1);
            Intrinsics.checkNotNullExpressionValue(strSubstring, "substring(...)");
            Intrinsics.checkNotNull(strSubstring, "null cannot be cast to non-null type java.lang.String");
            String lowerCase = strSubstring.toLowerCase(Locale.ROOT);
            Intrinsics.checkNotNullExpressionValue(lowerCase, "toLowerCase(...)");
            return cCharAt + lowerCase;
        }
        return strA;
    }

    @m2(markerClass = {kotlin.s.class})
    @e1(version = "1.5")
    @kotlin.internal.f
    private static final char v(char c10) {
        return Character.toTitleCase(c10);
    }

    @kotlin.l(message = "Use lowercaseChar() instead.", replaceWith = @b1(expression = "lowercaseChar()", imports = {}))
    @kotlin.internal.f
    @kotlin.m(warningSince = "1.5")
    private static final char w(char c10) {
        return Character.toLowerCase(c10);
    }

    @kotlin.l(message = "Use titlecaseChar() instead.", replaceWith = @b1(expression = "titlecaseChar()", imports = {}))
    @kotlin.internal.f
    @kotlin.m(warningSince = "1.5")
    private static final char x(char c10) {
        return Character.toTitleCase(c10);
    }

    @kotlin.l(message = "Use uppercaseChar() instead.", replaceWith = @b1(expression = "uppercaseChar()", imports = {}))
    @kotlin.internal.f
    @kotlin.m(warningSince = "1.5")
    private static final char y(char c10) {
        return Character.toUpperCase(c10);
    }

    @m2(markerClass = {kotlin.s.class})
    @e1(version = "1.5")
    @kotlin.internal.f
    private static final String z(char c10) {
        String strValueOf = String.valueOf(c10);
        Intrinsics.checkNotNull(strValueOf, "null cannot be cast to non-null type java.lang.String");
        String upperCase = strValueOf.toUpperCase(Locale.ROOT);
        Intrinsics.checkNotNullExpressionValue(upperCase, "toUpperCase(...)");
        return upperCase;
    }
}
