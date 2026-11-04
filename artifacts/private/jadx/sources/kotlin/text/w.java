package kotlin.text;

import java.nio.ByteBuffer;
import java.nio.CharBuffer;
import java.nio.charset.CharacterCodingException;
import java.nio.charset.Charset;
import java.nio.charset.CharsetDecoder;
import java.nio.charset.CharsetEncoder;
import java.nio.charset.CodingErrorAction;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.Locale;
import java.util.regex.Pattern;
import kotlin.b1;
import kotlin.collections.AbstractList;
import kotlin.collections.ArraysKt;
import kotlin.e1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.jvm.internal.q1;
import kotlin.m2;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: Access modifiers changed from: package-private */
/* JADX INFO: loaded from: classes11.dex */
@SourceDebugExtension({"SMAP\nStringsJVM.kt\nKotlin\n*S Kotlin\n*F\n+ 1 StringsJVM.kt\nkotlin/text/StringsKt__StringsJVMKt\n+ 2 _Strings.kt\nkotlin/text/StringsKt___StringsKt\n+ 3 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,818:1\n1179#2,2:819\n1#3:821\n*S KotlinDebug\n*F\n+ 1 StringsJVM.kt\nkotlin/text/StringsKt__StringsJVMKt\n*L\n73#1:819,2\n*E\n"})
public class w extends StringsKt__StringNumberConversionsKt {
    @e1(version = "1.5")
    public static final boolean A1(@Nullable CharSequence charSequence, @Nullable CharSequence charSequence2, boolean z10) {
        return z10 ? StringsKt__StringsKt.W2(charSequence, charSequence2) : z1(charSequence, charSequence2);
    }

    @e1(version = "1.4")
    @NotNull
    public static final char[] A2(@NotNull String str, int i10, int i11) {
        Intrinsics.checkNotNullParameter(str, "<this>");
        AbstractList.Companion.checkBoundsIndexes$kotlin_stdlib(i10, i11, str.length());
        char[] cArr = new char[i11 - i10];
        str.getChars(i10, i11, cArr, 0);
        return cArr;
    }

    @kotlin.internal.f
    private static final boolean B1(String str, CharSequence charSequence) {
        Intrinsics.checkNotNullParameter(str, "<this>");
        Intrinsics.checkNotNullParameter(charSequence, "charSequence");
        return str.contentEquals(charSequence);
    }

    @kotlin.internal.f
    private static final char[] B2(String str, char[] destination, int i10, int i11, int i12) {
        Intrinsics.checkNotNullParameter(str, "<this>");
        Intrinsics.checkNotNullParameter(destination, "destination");
        str.getChars(i11, i12, destination, i10);
        return destination;
    }

    @kotlin.internal.f
    private static final boolean C1(String str, StringBuffer stringBuilder) {
        Intrinsics.checkNotNullParameter(str, "<this>");
        Intrinsics.checkNotNullParameter(stringBuilder, "stringBuilder");
        return str.contentEquals(stringBuilder);
    }

    public static /* synthetic */ char[] C2(String str, int i10, int i11, int i12, Object obj) {
        if ((i12 & 1) != 0) {
            i10 = 0;
        }
        if ((i12 & 2) != 0) {
            i11 = str.length();
        }
        return A2(str, i10, i11);
    }

    @kotlin.l(message = "Use replaceFirstChar instead.", replaceWith = @b1(expression = "replaceFirstChar { it.lowercase(Locale.getDefault()) }", imports = {"java.util.Locale"}))
    @kotlin.m(warningSince = "1.5")
    @NotNull
    public static final String D1(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "<this>");
        if (str.length() <= 0 || Character.isLowerCase(str.charAt(0))) {
            return str;
        }
        StringBuilder sb2 = new StringBuilder();
        String strSubstring = str.substring(0, 1);
        Intrinsics.checkNotNullExpressionValue(strSubstring, "substring(...)");
        Intrinsics.checkNotNull(strSubstring, "null cannot be cast to non-null type java.lang.String");
        String lowerCase = strSubstring.toLowerCase();
        Intrinsics.checkNotNullExpressionValue(lowerCase, "toLowerCase(...)");
        sb2.append(lowerCase);
        String strSubstring2 = str.substring(1);
        Intrinsics.checkNotNullExpressionValue(strSubstring2, "substring(...)");
        sb2.append(strSubstring2);
        return sb2.toString();
    }

    static /* synthetic */ char[] D2(String str, char[] destination, int i10, int i11, int i12, int i13, Object obj) {
        if ((i13 & 2) != 0) {
            i10 = 0;
        }
        if ((i13 & 4) != 0) {
            i11 = 0;
        }
        if ((i13 & 8) != 0) {
            i12 = str.length();
        }
        Intrinsics.checkNotNullParameter(str, "<this>");
        Intrinsics.checkNotNullParameter(destination, "destination");
        str.getChars(i11, i12, destination, i10);
        return destination;
    }

    @kotlin.internal.h
    @kotlin.l(message = "Use replaceFirstChar instead.", replaceWith = @b1(expression = "replaceFirstChar { it.lowercase(locale) }", imports = {}))
    @e1(version = "1.4")
    @kotlin.m(warningSince = "1.5")
    @NotNull
    public static final String E1(@NotNull String str, @NotNull Locale locale) {
        Intrinsics.checkNotNullParameter(str, "<this>");
        Intrinsics.checkNotNullParameter(locale, "locale");
        if (str.length() <= 0 || Character.isLowerCase(str.charAt(0))) {
            return str;
        }
        StringBuilder sb2 = new StringBuilder();
        String strSubstring = str.substring(0, 1);
        Intrinsics.checkNotNullExpressionValue(strSubstring, "substring(...)");
        Intrinsics.checkNotNull(strSubstring, "null cannot be cast to non-null type java.lang.String");
        String lowerCase = strSubstring.toLowerCase(locale);
        Intrinsics.checkNotNullExpressionValue(lowerCase, "toLowerCase(...)");
        sb2.append(lowerCase);
        String strSubstring2 = str.substring(1);
        Intrinsics.checkNotNullExpressionValue(strSubstring2, "substring(...)");
        sb2.append(strSubstring2);
        return sb2.toString();
    }

    @kotlin.l(message = "Use lowercase() instead.", replaceWith = @b1(expression = "lowercase(Locale.getDefault())", imports = {"java.util.Locale"}))
    @kotlin.internal.f
    @kotlin.m(warningSince = "1.5")
    private static final String E2(String str) {
        Intrinsics.checkNotNullParameter(str, "<this>");
        String lowerCase = str.toLowerCase();
        Intrinsics.checkNotNullExpressionValue(lowerCase, "toLowerCase(...)");
        return lowerCase;
    }

    @e1(version = "1.4")
    @NotNull
    public static String F1(@NotNull byte[] bArr) {
        Intrinsics.checkNotNullParameter(bArr, "<this>");
        return new String(bArr, Charsets.UTF_8);
    }

    @kotlin.l(message = "Use lowercase() instead.", replaceWith = @b1(expression = "lowercase(locale)", imports = {}))
    @kotlin.internal.f
    @kotlin.m(warningSince = "1.5")
    private static final String F2(String str, Locale locale) {
        Intrinsics.checkNotNullParameter(str, "<this>");
        Intrinsics.checkNotNullParameter(locale, "locale");
        String lowerCase = str.toLowerCase(locale);
        Intrinsics.checkNotNullExpressionValue(lowerCase, "toLowerCase(...)");
        return lowerCase;
    }

    @e1(version = "1.4")
    @NotNull
    public static final String G1(@NotNull byte[] bArr, int i10, int i11, boolean z10) {
        Intrinsics.checkNotNullParameter(bArr, "<this>");
        AbstractList.Companion.checkBoundsIndexes$kotlin_stdlib(i10, i11, bArr.length);
        if (!z10) {
            return new String(bArr, i10, i11 - i10, Charsets.UTF_8);
        }
        CharsetDecoder charsetDecoderNewDecoder = Charsets.UTF_8.newDecoder();
        CodingErrorAction codingErrorAction = CodingErrorAction.REPORT;
        String string = charsetDecoderNewDecoder.onMalformedInput(codingErrorAction).onUnmappableCharacter(codingErrorAction).decode(ByteBuffer.wrap(bArr, i10, i11 - i10)).toString();
        Intrinsics.checkNotNullExpressionValue(string, "toString(...)");
        return string;
    }

    @kotlin.internal.f
    private static final Pattern G2(String str, int i10) {
        Intrinsics.checkNotNullParameter(str, "<this>");
        Pattern patternCompile = Pattern.compile(str, i10);
        Intrinsics.checkNotNullExpressionValue(patternCompile, "compile(...)");
        return patternCompile;
    }

    public static /* synthetic */ String H1(byte[] bArr, int i10, int i11, boolean z10, int i12, Object obj) {
        if ((i12 & 1) != 0) {
            i10 = 0;
        }
        if ((i12 & 2) != 0) {
            i11 = bArr.length;
        }
        if ((i12 & 4) != 0) {
            z10 = false;
        }
        return G1(bArr, i10, i11, z10);
    }

    static /* synthetic */ Pattern H2(String str, int i10, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            i10 = 0;
        }
        Intrinsics.checkNotNullParameter(str, "<this>");
        Pattern patternCompile = Pattern.compile(str, i10);
        Intrinsics.checkNotNullExpressionValue(patternCompile, "compile(...)");
        return patternCompile;
    }

    @e1(version = "1.4")
    @NotNull
    public static byte[] I1(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "<this>");
        byte[] bytes = str.getBytes(Charsets.UTF_8);
        Intrinsics.checkNotNullExpressionValue(bytes, "getBytes(...)");
        return bytes;
    }

    @kotlin.l(message = "Use uppercase() instead.", replaceWith = @b1(expression = "uppercase(Locale.getDefault())", imports = {"java.util.Locale"}))
    @kotlin.internal.f
    @kotlin.m(warningSince = "1.5")
    private static final String I2(String str) {
        Intrinsics.checkNotNullParameter(str, "<this>");
        String upperCase = str.toUpperCase();
        Intrinsics.checkNotNullExpressionValue(upperCase, "toUpperCase(...)");
        return upperCase;
    }

    @e1(version = "1.4")
    @NotNull
    public static final byte[] J1(@NotNull String str, int i10, int i11, boolean z10) throws CharacterCodingException {
        Intrinsics.checkNotNullParameter(str, "<this>");
        AbstractList.Companion.checkBoundsIndexes$kotlin_stdlib(i10, i11, str.length());
        if (!z10) {
            String strSubstring = str.substring(i10, i11);
            Intrinsics.checkNotNullExpressionValue(strSubstring, "substring(...)");
            Charset charset = Charsets.UTF_8;
            Intrinsics.checkNotNull(strSubstring, "null cannot be cast to non-null type java.lang.String");
            byte[] bytes = strSubstring.getBytes(charset);
            Intrinsics.checkNotNullExpressionValue(bytes, "getBytes(...)");
            return bytes;
        }
        CharsetEncoder charsetEncoderNewEncoder = Charsets.UTF_8.newEncoder();
        CodingErrorAction codingErrorAction = CodingErrorAction.REPORT;
        ByteBuffer byteBufferEncode = charsetEncoderNewEncoder.onMalformedInput(codingErrorAction).onUnmappableCharacter(codingErrorAction).encode(CharBuffer.wrap(str, i10, i11));
        if (byteBufferEncode.hasArray() && byteBufferEncode.arrayOffset() == 0) {
            int iRemaining = byteBufferEncode.remaining();
            byte[] bArrArray = byteBufferEncode.array();
            Intrinsics.checkNotNull(bArrArray);
            if (iRemaining == bArrArray.length) {
                byte[] bArrArray2 = byteBufferEncode.array();
                Intrinsics.checkNotNull(bArrArray2);
                return bArrArray2;
            }
        }
        byte[] bArr = new byte[byteBufferEncode.remaining()];
        byteBufferEncode.get(bArr);
        return bArr;
    }

    @kotlin.l(message = "Use uppercase() instead.", replaceWith = @b1(expression = "uppercase(locale)", imports = {}))
    @kotlin.internal.f
    @kotlin.m(warningSince = "1.5")
    private static final String J2(String str, Locale locale) {
        Intrinsics.checkNotNullParameter(str, "<this>");
        Intrinsics.checkNotNullParameter(locale, "locale");
        String upperCase = str.toUpperCase(locale);
        Intrinsics.checkNotNullExpressionValue(upperCase, "toUpperCase(...)");
        return upperCase;
    }

    public static /* synthetic */ byte[] K1(String str, int i10, int i11, boolean z10, int i12, Object obj) {
        if ((i12 & 1) != 0) {
            i10 = 0;
        }
        if ((i12 & 2) != 0) {
            i11 = str.length();
        }
        if ((i12 & 4) != 0) {
            z10 = false;
        }
        return J1(str, i10, i11, z10);
    }

    @m2(markerClass = {kotlin.s.class})
    @e1(version = "1.5")
    @kotlin.internal.f
    private static final String K2(String str) {
        Intrinsics.checkNotNullParameter(str, "<this>");
        String upperCase = str.toUpperCase(Locale.ROOT);
        Intrinsics.checkNotNullExpressionValue(upperCase, "toUpperCase(...)");
        return upperCase;
    }

    public static boolean L1(@NotNull String str, @NotNull String suffix, boolean z10) {
        Intrinsics.checkNotNullParameter(str, "<this>");
        Intrinsics.checkNotNullParameter(suffix, "suffix");
        if (!z10) {
            return str.endsWith(suffix);
        }
        int i10 = 3 ^ 0;
        return d2(str, str.length() - suffix.length(), suffix, 0, suffix.length(), true);
    }

    @m2(markerClass = {kotlin.s.class})
    @e1(version = "1.5")
    @kotlin.internal.f
    private static final String L2(String str, Locale locale) {
        Intrinsics.checkNotNullParameter(str, "<this>");
        Intrinsics.checkNotNullParameter(locale, "locale");
        String upperCase = str.toUpperCase(locale);
        Intrinsics.checkNotNullExpressionValue(upperCase, "toUpperCase(...)");
        return upperCase;
    }

    public static /* synthetic */ boolean M1(String str, String str2, boolean z10, int i10, Object obj) {
        if ((i10 & 2) != 0) {
            z10 = false;
            int i11 = 2 | 0;
        }
        return L1(str, str2, z10);
    }

    public static boolean N1(@Nullable String str, @Nullable String str2, boolean z10) {
        if (str == null) {
            return str2 == null;
        }
        return !z10 ? str.equals(str2) : str.equalsIgnoreCase(str2);
    }

    public static /* synthetic */ boolean O1(String str, String str2, boolean z10, int i10, Object obj) {
        if ((i10 & 2) != 0) {
            z10 = false;
        }
        return N1(str, str2, z10);
    }

    @e1(version = "1.4")
    @kotlin.internal.f
    private static final String P1(String str, Locale locale, Object... args) {
        Intrinsics.checkNotNullParameter(str, "<this>");
        Intrinsics.checkNotNullParameter(args, "args");
        String str2 = String.format(locale, str, Arrays.copyOf(args, args.length));
        Intrinsics.checkNotNullExpressionValue(str2, "format(...)");
        return str2;
    }

    @kotlin.internal.f
    private static final String Q1(String str, Object... args) {
        Intrinsics.checkNotNullParameter(str, "<this>");
        Intrinsics.checkNotNullParameter(args, "args");
        String str2 = String.format(str, Arrays.copyOf(args, args.length));
        Intrinsics.checkNotNullExpressionValue(str2, "format(...)");
        return str2;
    }

    @kotlin.internal.f
    private static final String R1(q1 q1Var, String format, Object... args) {
        Intrinsics.checkNotNullParameter(q1Var, "<this>");
        Intrinsics.checkNotNullParameter(format, "format");
        Intrinsics.checkNotNullParameter(args, "args");
        String str = String.format(format, Arrays.copyOf(args, args.length));
        Intrinsics.checkNotNullExpressionValue(str, "format(...)");
        return str;
    }

    @e1(version = "1.4")
    @kotlin.internal.f
    private static final String S1(q1 q1Var, Locale locale, String format, Object... args) {
        Intrinsics.checkNotNullParameter(q1Var, "<this>");
        Intrinsics.checkNotNullParameter(format, "format");
        Intrinsics.checkNotNullParameter(args, "args");
        String str = String.format(locale, format, Arrays.copyOf(args, args.length));
        Intrinsics.checkNotNullExpressionValue(str, "format(...)");
        return str;
    }

    @NotNull
    public static Comparator<String> T1(@NotNull q1 q1Var) {
        Intrinsics.checkNotNullParameter(q1Var, "<this>");
        Comparator<String> CASE_INSENSITIVE_ORDER = String.CASE_INSENSITIVE_ORDER;
        Intrinsics.checkNotNullExpressionValue(CASE_INSENSITIVE_ORDER, "CASE_INSENSITIVE_ORDER");
        return CASE_INSENSITIVE_ORDER;
    }

    @kotlin.internal.f
    private static final String U1(String str) {
        Intrinsics.checkNotNullParameter(str, "<this>");
        String strIntern = str.intern();
        Intrinsics.checkNotNullExpressionValue(strIntern, "intern(...)");
        return strIntern;
    }

    @m2(markerClass = {kotlin.s.class})
    @e1(version = "1.5")
    @kotlin.internal.f
    private static final String V1(String str) {
        Intrinsics.checkNotNullParameter(str, "<this>");
        String lowerCase = str.toLowerCase(Locale.ROOT);
        Intrinsics.checkNotNullExpressionValue(lowerCase, "toLowerCase(...)");
        return lowerCase;
    }

    @m2(markerClass = {kotlin.s.class})
    @e1(version = "1.5")
    @kotlin.internal.f
    private static final String W1(String str, Locale locale) {
        Intrinsics.checkNotNullParameter(str, "<this>");
        Intrinsics.checkNotNullParameter(locale, "locale");
        String lowerCase = str.toLowerCase(locale);
        Intrinsics.checkNotNullExpressionValue(lowerCase, "toLowerCase(...)");
        return lowerCase;
    }

    @kotlin.internal.f
    private static final int X1(String str, char c10, int i10) {
        Intrinsics.checkNotNullParameter(str, "<this>");
        return str.indexOf(c10, i10);
    }

    @kotlin.internal.f
    private static final int Y1(String str, String str2, int i10) {
        Intrinsics.checkNotNullParameter(str, "<this>");
        Intrinsics.checkNotNullParameter(str2, "str");
        return str.indexOf(str2, i10);
    }

    @kotlin.internal.f
    private static final int Z1(String str, char c10, int i10) {
        Intrinsics.checkNotNullParameter(str, "<this>");
        return str.lastIndexOf(c10, i10);
    }

    @kotlin.internal.f
    private static final int a2(String str, String str2, int i10) {
        Intrinsics.checkNotNullParameter(str, "<this>");
        Intrinsics.checkNotNullParameter(str2, "str");
        return str.lastIndexOf(str2, i10);
    }

    @kotlin.internal.f
    private static final int b2(String str, int i10, int i11) {
        Intrinsics.checkNotNullParameter(str, "<this>");
        return str.offsetByCodePoints(i10, i11);
    }

    public static final boolean c2(@NotNull CharSequence charSequence, int i10, @NotNull CharSequence other, int i11, int i12, boolean z10) {
        Intrinsics.checkNotNullParameter(charSequence, "<this>");
        Intrinsics.checkNotNullParameter(other, "other");
        return ((charSequence instanceof String) && (other instanceof String)) ? d2((String) charSequence, i10, (String) other, i11, i12, z10) : StringsKt__StringsKt.b4(charSequence, i10, other, i11, i12, z10);
    }

    public static boolean d2(@NotNull String str, int i10, @NotNull String other, int i11, int i12, boolean z10) {
        Intrinsics.checkNotNullParameter(str, "<this>");
        Intrinsics.checkNotNullParameter(other, "other");
        return !z10 ? str.regionMatches(i10, other, i11, i12) : str.regionMatches(z10, i10, other, i11, i12);
    }

    public static /* synthetic */ boolean e2(CharSequence charSequence, int i10, CharSequence charSequence2, int i11, int i12, boolean z10, int i13, Object obj) {
        if ((i13 & 16) != 0) {
            z10 = false;
        }
        return c2(charSequence, i10, charSequence2, i11, i12, z10);
    }

    public static /* synthetic */ boolean f2(String str, int i10, String str2, int i11, int i12, boolean z10, int i13, Object obj) {
        if ((i13 & 16) != 0) {
            z10 = false;
        }
        return d2(str, i10, str2, i11, i12, z10);
    }

    @kotlin.internal.f
    private static final String g1(StringBuffer stringBuffer) {
        Intrinsics.checkNotNullParameter(stringBuffer, "stringBuffer");
        return new String(stringBuffer);
    }

    @NotNull
    public static String g2(@NotNull CharSequence charSequence, int i10) {
        Intrinsics.checkNotNullParameter(charSequence, "<this>");
        if (i10 < 0) {
            throw new IllegalArgumentException(("Count 'n' must be non-negative, but was " + i10 + '.').toString());
        }
        if (i10 == 0) {
            return "";
        }
        int i11 = 1;
        if (i10 == 1) {
            return charSequence.toString();
        }
        int length = charSequence.length();
        if (length == 0) {
            return "";
        }
        if (length == 1) {
            char cCharAt = charSequence.charAt(0);
            char[] cArr = new char[i10];
            for (int i12 = 0; i12 < i10; i12++) {
                cArr[i12] = cCharAt;
            }
            return new String(cArr);
        }
        StringBuilder sb2 = new StringBuilder(charSequence.length() * i10);
        if (1 <= i10) {
            while (true) {
                sb2.append(charSequence);
                if (i11 == i10) {
                    break;
                }
                i11++;
            }
        }
        String string = sb2.toString();
        Intrinsics.checkNotNull(string);
        return string;
    }

    @kotlin.internal.f
    private static final String h1(StringBuilder stringBuilder) {
        Intrinsics.checkNotNullParameter(stringBuilder, "stringBuilder");
        return new String(stringBuilder);
    }

    @NotNull
    public static final String h2(@NotNull String str, char c10, char c11, boolean z10) {
        Intrinsics.checkNotNullParameter(str, "<this>");
        if (!z10) {
            String strReplace = str.replace(c10, c11);
            Intrinsics.checkNotNullExpressionValue(strReplace, "replace(...)");
            return strReplace;
        }
        StringBuilder sb2 = new StringBuilder(str.length());
        for (int i10 = 0; i10 < str.length(); i10++) {
            char cCharAt = str.charAt(i10);
            if (c.I(cCharAt, c10, z10)) {
                cCharAt = c11;
            }
            sb2.append(cCharAt);
        }
        String string = sb2.toString();
        Intrinsics.checkNotNullExpressionValue(string, "toString(...)");
        return string;
    }

    @kotlin.internal.f
    private static final String i1(byte[] bytes) {
        Intrinsics.checkNotNullParameter(bytes, "bytes");
        return new String(bytes, Charsets.UTF_8);
    }

    @NotNull
    public static final String i2(@NotNull String str, @NotNull String oldValue, @NotNull String newValue, boolean z10) {
        Intrinsics.checkNotNullParameter(str, "<this>");
        Intrinsics.checkNotNullParameter(oldValue, "oldValue");
        Intrinsics.checkNotNullParameter(newValue, "newValue");
        int i10 = 0;
        int iN3 = StringsKt__StringsKt.n3(str, oldValue, 0, z10);
        if (iN3 < 0) {
            return str;
        }
        int length = oldValue.length();
        int iU = kotlin.ranges.r.u(length, 1);
        int length2 = (str.length() - length) + newValue.length();
        if (length2 < 0) {
            throw new OutOfMemoryError();
        }
        StringBuilder sb2 = new StringBuilder(length2);
        do {
            sb2.append((CharSequence) str, i10, iN3);
            sb2.append(newValue);
            i10 = iN3 + length;
            if (iN3 >= str.length()) {
                break;
            }
            iN3 = StringsKt__StringsKt.n3(str, oldValue, iN3 + iU, z10);
        } while (iN3 > 0);
        sb2.append((CharSequence) str, i10, str.length());
        String string = sb2.toString();
        Intrinsics.checkNotNullExpressionValue(string, "toString(...)");
        return string;
    }

    @kotlin.internal.f
    private static final String j1(byte[] bytes, int i10, int i11) {
        Intrinsics.checkNotNullParameter(bytes, "bytes");
        return new String(bytes, i10, i11, Charsets.UTF_8);
    }

    public static /* synthetic */ String j2(String str, char c10, char c11, boolean z10, int i10, Object obj) {
        if ((i10 & 4) != 0) {
            z10 = false;
        }
        return h2(str, c10, c11, z10);
    }

    @kotlin.internal.f
    private static final String k1(byte[] bytes, int i10, int i11, Charset charset) {
        Intrinsics.checkNotNullParameter(bytes, "bytes");
        Intrinsics.checkNotNullParameter(charset, "charset");
        return new String(bytes, i10, i11, charset);
    }

    public static /* synthetic */ String k2(String str, String str2, String str3, boolean z10, int i10, Object obj) {
        if ((i10 & 4) != 0) {
            z10 = false;
        }
        return i2(str, str2, str3, z10);
    }

    @kotlin.internal.f
    private static final String l1(byte[] bytes, Charset charset) {
        Intrinsics.checkNotNullParameter(bytes, "bytes");
        Intrinsics.checkNotNullParameter(charset, "charset");
        return new String(bytes, charset);
    }

    @NotNull
    public static final String l2(@NotNull String str, char c10, char c11, boolean z10) {
        Intrinsics.checkNotNullParameter(str, "<this>");
        int iQ3 = StringsKt__StringsKt.q3(str, c10, 0, z10, 2, null);
        return iQ3 < 0 ? str : StringsKt__StringsKt.J4(str, iQ3, iQ3 + 1, String.valueOf(c11)).toString();
    }

    @kotlin.internal.f
    private static final String m1(char[] chars) {
        Intrinsics.checkNotNullParameter(chars, "chars");
        return new String(chars);
    }

    @NotNull
    public static final String m2(@NotNull String str, @NotNull String oldValue, @NotNull String newValue, boolean z10) {
        Intrinsics.checkNotNullParameter(str, "<this>");
        Intrinsics.checkNotNullParameter(oldValue, "oldValue");
        Intrinsics.checkNotNullParameter(newValue, "newValue");
        int iR3 = StringsKt__StringsKt.r3(str, oldValue, 0, z10, 2, null);
        return iR3 < 0 ? str : StringsKt__StringsKt.J4(str, iR3, oldValue.length() + iR3, newValue).toString();
    }

    @kotlin.internal.f
    private static final String n1(char[] chars, int i10, int i11) {
        Intrinsics.checkNotNullParameter(chars, "chars");
        return new String(chars, i10, i11);
    }

    public static /* synthetic */ String n2(String str, char c10, char c11, boolean z10, int i10, Object obj) {
        if ((i10 & 4) != 0) {
            z10 = false;
        }
        return l2(str, c10, c11, z10);
    }

    @kotlin.internal.f
    private static final String o1(int[] codePoints, int i10, int i11) {
        Intrinsics.checkNotNullParameter(codePoints, "codePoints");
        return new String(codePoints, i10, i11);
    }

    public static /* synthetic */ String o2(String str, String str2, String str3, boolean z10, int i10, Object obj) {
        if ((i10 & 4) != 0) {
            z10 = false;
        }
        return m2(str, str2, str3, z10);
    }

    @kotlin.l(message = "Use replaceFirstChar instead.", replaceWith = @b1(expression = "replaceFirstChar { if (it.isLowerCase()) it.titlecase(Locale.getDefault()) else it.toString() }", imports = {"java.util.Locale"}))
    @kotlin.m(warningSince = "1.5")
    @NotNull
    public static final String p1(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "<this>");
        Locale locale = Locale.getDefault();
        Intrinsics.checkNotNullExpressionValue(locale, "getDefault(...)");
        return q1(str, locale);
    }

    @NotNull
    public static final List<String> p2(@NotNull CharSequence charSequence, @NotNull Pattern regex, int i10) {
        Intrinsics.checkNotNullParameter(charSequence, "<this>");
        Intrinsics.checkNotNullParameter(regex, "regex");
        StringsKt__StringsKt.N4(i10);
        if (i10 == 0) {
            i10 = -1;
        }
        String[] strArrSplit = regex.split(charSequence, i10);
        Intrinsics.checkNotNullExpressionValue(strArrSplit, "split(...)");
        return ArraysKt.asList(strArrSplit);
    }

    @kotlin.internal.h
    @kotlin.l(message = "Use replaceFirstChar instead.", replaceWith = @b1(expression = "replaceFirstChar { if (it.isLowerCase()) it.titlecase(locale) else it.toString() }", imports = {}))
    @e1(version = "1.4")
    @kotlin.m(warningSince = "1.5")
    @NotNull
    public static final String q1(@NotNull String str, @NotNull Locale locale) {
        Intrinsics.checkNotNullParameter(str, "<this>");
        Intrinsics.checkNotNullParameter(locale, "locale");
        if (str.length() <= 0) {
            return str;
        }
        char cCharAt = str.charAt(0);
        if (!Character.isLowerCase(cCharAt)) {
            return str;
        }
        StringBuilder sb2 = new StringBuilder();
        char titleCase = Character.toTitleCase(cCharAt);
        if (titleCase != Character.toUpperCase(cCharAt)) {
            sb2.append(titleCase);
        } else {
            String strSubstring = str.substring(0, 1);
            Intrinsics.checkNotNullExpressionValue(strSubstring, "substring(...)");
            Intrinsics.checkNotNull(strSubstring, "null cannot be cast to non-null type java.lang.String");
            String upperCase = strSubstring.toUpperCase(locale);
            Intrinsics.checkNotNullExpressionValue(upperCase, "toUpperCase(...)");
            sb2.append(upperCase);
        }
        String strSubstring2 = str.substring(1);
        Intrinsics.checkNotNullExpressionValue(strSubstring2, "substring(...)");
        sb2.append(strSubstring2);
        String string = sb2.toString();
        Intrinsics.checkNotNullExpressionValue(string, "toString(...)");
        return string;
    }

    public static /* synthetic */ List q2(CharSequence charSequence, Pattern pattern, int i10, int i11, Object obj) {
        if ((i11 & 2) != 0) {
            i10 = 0;
        }
        return p2(charSequence, pattern, i10);
    }

    @kotlin.internal.f
    private static final int r1(String str, int i10) {
        Intrinsics.checkNotNullParameter(str, "<this>");
        return str.codePointAt(i10);
    }

    public static boolean r2(@NotNull String str, @NotNull String prefix, int i10, boolean z10) {
        Intrinsics.checkNotNullParameter(str, "<this>");
        Intrinsics.checkNotNullParameter(prefix, "prefix");
        return !z10 ? str.startsWith(prefix, i10) : d2(str, i10, prefix, 0, prefix.length(), z10);
    }

    @kotlin.internal.f
    private static final int s1(String str, int i10) {
        Intrinsics.checkNotNullParameter(str, "<this>");
        return str.codePointBefore(i10);
    }

    public static boolean s2(@NotNull String str, @NotNull String prefix, boolean z10) {
        Intrinsics.checkNotNullParameter(str, "<this>");
        Intrinsics.checkNotNullParameter(prefix, "prefix");
        return !z10 ? str.startsWith(prefix) : d2(str, 0, prefix, 0, prefix.length(), z10);
    }

    @kotlin.internal.f
    private static final int t1(String str, int i10, int i11) {
        Intrinsics.checkNotNullParameter(str, "<this>");
        return str.codePointCount(i10, i11);
    }

    public static /* synthetic */ boolean t2(String str, String str2, int i10, boolean z10, int i11, Object obj) {
        if ((i11 & 4) != 0) {
            z10 = false;
        }
        return r2(str, str2, i10, z10);
    }

    public static int u1(@NotNull String str, @NotNull String other, boolean z10) {
        Intrinsics.checkNotNullParameter(str, "<this>");
        Intrinsics.checkNotNullParameter(other, "other");
        return z10 ? str.compareToIgnoreCase(other) : str.compareTo(other);
    }

    public static /* synthetic */ boolean u2(String str, String str2, boolean z10, int i10, Object obj) {
        if ((i10 & 2) != 0) {
            z10 = false;
        }
        return s2(str, str2, z10);
    }

    public static /* synthetic */ int v1(String str, String str2, boolean z10, int i10, Object obj) {
        if ((i10 & 2) != 0) {
            z10 = false;
        }
        return u1(str, str2, z10);
    }

    @kotlin.internal.f
    private static final String v2(String str, int i10) {
        Intrinsics.checkNotNullParameter(str, "<this>");
        String strSubstring = str.substring(i10);
        Intrinsics.checkNotNullExpressionValue(strSubstring, "substring(...)");
        return strSubstring;
    }

    @e1(version = "1.4")
    @NotNull
    public static String w1(@NotNull char[] cArr) {
        Intrinsics.checkNotNullParameter(cArr, "<this>");
        return new String(cArr);
    }

    @kotlin.internal.f
    private static final String w2(String str, int i10, int i11) {
        Intrinsics.checkNotNullParameter(str, "<this>");
        String strSubstring = str.substring(i10, i11);
        Intrinsics.checkNotNullExpressionValue(strSubstring, "substring(...)");
        return strSubstring;
    }

    @e1(version = "1.4")
    @NotNull
    public static String x1(@NotNull char[] cArr, int i10, int i11) {
        Intrinsics.checkNotNullParameter(cArr, "<this>");
        AbstractList.Companion.checkBoundsIndexes$kotlin_stdlib(i10, i11, cArr.length);
        return new String(cArr, i10, i11 - i10);
    }

    @kotlin.internal.f
    private static final byte[] x2(String str, Charset charset) {
        Intrinsics.checkNotNullParameter(str, "<this>");
        Intrinsics.checkNotNullParameter(charset, "charset");
        byte[] bytes = str.getBytes(charset);
        Intrinsics.checkNotNullExpressionValue(bytes, "getBytes(...)");
        return bytes;
    }

    public static /* synthetic */ String y1(char[] cArr, int i10, int i11, int i12, Object obj) {
        if ((i12 & 1) != 0) {
            i10 = 0;
        }
        if ((i12 & 2) != 0) {
            i11 = cArr.length;
        }
        return x1(cArr, i10, i11);
    }

    static /* synthetic */ byte[] y2(String str, Charset charset, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            charset = Charsets.UTF_8;
        }
        Intrinsics.checkNotNullParameter(str, "<this>");
        Intrinsics.checkNotNullParameter(charset, "charset");
        byte[] bytes = str.getBytes(charset);
        Intrinsics.checkNotNullExpressionValue(bytes, "getBytes(...)");
        return bytes;
    }

    @e1(version = "1.5")
    public static boolean z1(@Nullable CharSequence charSequence, @Nullable CharSequence charSequence2) {
        return (!(charSequence instanceof String) || charSequence2 == null) ? StringsKt__StringsKt.X2(charSequence, charSequence2) : ((String) charSequence).contentEquals(charSequence2);
    }

    @kotlin.internal.f
    private static final char[] z2(String str) {
        Intrinsics.checkNotNullParameter(str, "<this>");
        char[] charArray = str.toCharArray();
        Intrinsics.checkNotNullExpressionValue(charArray, "toCharArray(...)");
        return charArray;
    }
}
