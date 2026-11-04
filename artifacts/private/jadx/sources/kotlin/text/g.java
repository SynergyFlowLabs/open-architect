package kotlin.text;

import androidx.collection.g3;
import java.util.Arrays;
import kotlin.collections.AbstractList;
import kotlin.collections.ArraysKt;
import kotlin.e1;
import kotlin.e2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.y1;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes11.dex */
@SourceDebugExtension({"SMAP\nHexExtensions.kt\nKotlin\n*S Kotlin\n*F\n+ 1 HexExtensions.kt\nkotlin/text/HexExtensionsKt\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 3 _Strings.kt\nkotlin/text/StringsKt___StringsKt\n*L\n1#1,1249:1\n1198#1,7:1251\n1198#1,7:1258\n1198#1,7:1265\n1198#1,7:1272\n1198#1,7:1279\n1198#1,7:1286\n1198#1,7:1293\n1198#1,7:1300\n1209#1,5:1307\n1209#1,5:1312\n1198#1,7:1317\n1198#1,7:1324\n1209#1,5:1331\n1218#1,5:1336\n1#2:1250\n1188#3,3:1341\n1188#3,3:1344\n1188#3,3:1347\n1188#3,3:1350\n*S KotlinDebug\n*F\n+ 1 HexExtensions.kt\nkotlin/text/HexExtensionsKt\n*L\n457#1:1251,7\n490#1:1258,7\n494#1:1265,7\n497#1:1272,7\n538#1:1279,7\n541#1:1286,7\n546#1:1293,7\n551#1:1300,7\n558#1:1307,5\n559#1:1312,5\n1153#1:1317,7\n1155#1:1324,7\n1183#1:1331,5\n1191#1:1336,5\n43#1:1341,3\n44#1:1344,3\n55#1:1347,3\n56#1:1350,3\n*E\n"})
public final class g {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    private static final String f313312a = "0123456789abcdef";

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NotNull
    private static final String f313313b = "0123456789ABCDEF";

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @NotNull
    private static final int[] f313314c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @NotNull
    private static final int[] f313315d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    @NotNull
    private static final int[] f313316e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    @NotNull
    private static final long[] f313317f;

    static {
        int[] iArr = new int[256];
        int i10 = 0;
        for (int i11 = 0; i11 < 256; i11++) {
            iArr[i11] = f313312a.charAt(i11 & 15) | (f313312a.charAt(i11 >> 4) << '\b');
        }
        f313314c = iArr;
        int[] iArr2 = new int[256];
        for (int i12 = 0; i12 < 256; i12++) {
            iArr2[i12] = f313313b.charAt(i12 & 15) | (f313313b.charAt(i12 >> 4) << '\b');
        }
        f313315d = iArr2;
        int[] iArr3 = new int[256];
        for (int i13 = 0; i13 < 256; i13++) {
            iArr3[i13] = -1;
        }
        int i14 = 0;
        int i15 = 0;
        while (i14 < f313312a.length()) {
            iArr3[f313312a.charAt(i14)] = i15;
            i14++;
            i15++;
        }
        int i16 = 0;
        int i17 = 0;
        while (i16 < f313313b.length()) {
            iArr3[f313313b.charAt(i16)] = i17;
            i16++;
            i17++;
        }
        f313316e = iArr3;
        long[] jArr = new long[256];
        for (int i18 = 0; i18 < 256; i18++) {
            jArr[i18] = -1;
        }
        int i19 = 0;
        int i20 = 0;
        while (i19 < f313312a.length()) {
            jArr[f313312a.charAt(i19)] = i20;
            i19++;
            i20++;
        }
        int i21 = 0;
        while (i10 < f313313b.length()) {
            jArr[f313313b.charAt(i10)] = i21;
            i10++;
            i21++;
        }
        f313317f = jArr;
    }

    @kotlin.s
    private static final int A(String str, int i10, int i11, h hVar) {
        return E(str, i10, i11, hVar, 8);
    }

    @kotlin.s
    @e1(version = "1.9")
    public static final int B(@NotNull String str, @NotNull h format) {
        Intrinsics.checkNotNullParameter(str, "<this>");
        Intrinsics.checkNotNullParameter(format, "format");
        return A(str, 0, str.length(), format);
    }

    static /* synthetic */ int C(String str, int i10, int i11, h hVar, int i12, Object obj) {
        if ((i12 & 1) != 0) {
            i10 = 0;
        }
        if ((i12 & 2) != 0) {
            i11 = str.length();
        }
        if ((i12 & 4) != 0) {
            hVar = h.f313318d.a();
        }
        return A(str, i10, i11, hVar);
    }

    public static /* synthetic */ int D(String str, h hVar, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            hVar = h.f313318d.a();
        }
        return B(str, hVar);
    }

    @kotlin.s
    private static final int E(String str, int i10, int i11, h hVar, int i12) {
        AbstractList.Companion.checkBoundsIndexes$kotlin_stdlib(i10, i11, str.length());
        h.d dVarD = hVar.d();
        if (dVarD.i()) {
            e(str, i10, i11, i12);
            return Q(str, i10, i11);
        }
        String strF = dVarD.f();
        String strH = dVarD.h();
        f(str, i10, i11, strF, strH, dVarD.c(), i12);
        return Q(str, i10 + strF.length(), i11 - strH.length());
    }

    @kotlin.s
    public static final long F(@NotNull String str, int i10, int i11, @NotNull h format) {
        Intrinsics.checkNotNullParameter(str, "<this>");
        Intrinsics.checkNotNullParameter(format, "format");
        return J(str, i10, i11, format, 16);
    }

    @kotlin.s
    @e1(version = "1.9")
    public static final long G(@NotNull String str, @NotNull h format) {
        Intrinsics.checkNotNullParameter(str, "<this>");
        Intrinsics.checkNotNullParameter(format, "format");
        return F(str, 0, str.length(), format);
    }

    public static /* synthetic */ long H(String str, int i10, int i11, h hVar, int i12, Object obj) {
        if ((i12 & 1) != 0) {
            i10 = 0;
        }
        if ((i12 & 2) != 0) {
            i11 = str.length();
        }
        if ((i12 & 4) != 0) {
            hVar = h.f313318d.a();
        }
        return F(str, i10, i11, hVar);
    }

    public static /* synthetic */ long I(String str, h hVar, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            hVar = h.f313318d.a();
        }
        return G(str, hVar);
    }

    @kotlin.s
    private static final long J(String str, int i10, int i11, h hVar, int i12) {
        AbstractList.Companion.checkBoundsIndexes$kotlin_stdlib(i10, i11, str.length());
        h.d dVarD = hVar.d();
        if (dVarD.i()) {
            e(str, i10, i11, i12);
            return R(str, i10, i11);
        }
        String strF = dVarD.f();
        String strH = dVarD.h();
        f(str, i10, i11, strF, strH, dVarD.c(), i12);
        return R(str, i10 + strF.length(), i11 - strH.length());
    }

    @kotlin.s
    private static final short K(String str, int i10, int i11, h hVar) {
        return (short) E(str, i10, i11, hVar, 4);
    }

    @kotlin.s
    @e1(version = "1.9")
    public static final short L(@NotNull String str, @NotNull h format) {
        Intrinsics.checkNotNullParameter(str, "<this>");
        Intrinsics.checkNotNullParameter(format, "format");
        return K(str, 0, str.length(), format);
    }

    static /* synthetic */ short M(String str, int i10, int i11, h hVar, int i12, Object obj) {
        if ((i12 & 1) != 0) {
            i10 = 0;
        }
        if ((i12 & 2) != 0) {
            i11 = str.length();
        }
        if ((i12 & 4) != 0) {
            hVar = h.f313318d.a();
        }
        return K(str, i10, i11, hVar);
    }

    public static /* synthetic */ short N(String str, h hVar, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            hVar = h.f313318d.a();
        }
        return L(str, hVar);
    }

    private static final long O(String str, int i10) {
        char cCharAt = str.charAt(i10);
        if ((cCharAt >>> '\b') == 0) {
            long j10 = f313317f[cCharAt];
            if (j10 >= 0) {
                return j10;
            }
        }
        T(str, i10);
        throw new kotlin.a0();
    }

    private static final byte P(String str, int i10) {
        int[] iArr;
        int i11;
        int i12;
        char cCharAt = str.charAt(i10);
        if ((cCharAt >>> '\b') != 0 || (i11 = (iArr = f313316e)[cCharAt]) < 0) {
            T(str, i10);
            throw new kotlin.a0();
        }
        int i13 = i10 + 1;
        char cCharAt2 = str.charAt(i13);
        if ((cCharAt2 >>> '\b') == 0 && (i12 = iArr[cCharAt2]) >= 0) {
            return (byte) ((i11 << 4) | i12);
        }
        T(str, i13);
        throw new kotlin.a0();
    }

    private static final int Q(String str, int i10, int i11) {
        int i12;
        int i13 = 0;
        while (i10 < i11) {
            int i14 = i13 << 4;
            char cCharAt = str.charAt(i10);
            if ((cCharAt >>> '\b') != 0 || (i12 = f313316e[cCharAt]) < 0) {
                T(str, i10);
                throw new kotlin.a0();
            }
            i13 = i14 | i12;
            i10++;
        }
        return i13;
    }

    private static final long R(String str, int i10, int i11) {
        long j10 = 0;
        while (i10 < i11) {
            long j11 = j10 << 4;
            char cCharAt = str.charAt(i10);
            if ((cCharAt >>> '\b') == 0) {
                long j12 = f313317f[cCharAt];
                if (j12 >= 0) {
                    j10 = j11 | j12;
                    i10++;
                }
            }
            T(str, i10);
            throw new kotlin.a0();
        }
        return j10;
    }

    public static final int S(int i10, int i11, int i12, int i13, int i14, int i15, int i16) {
        long jA;
        if (i10 <= 0) {
            throw new IllegalArgumentException("Failed requirement.");
        }
        long j10 = ((long) i15) + 2 + ((long) i16);
        long jA2 = a(j10, i12, i14);
        if (i11 <= i12) {
            jA = a(j10, i11, i14);
        } else {
            jA = a(jA2, i11 / i12, i13);
            int i17 = i11 % i12;
            if (i17 != 0) {
                jA = jA + ((long) i13) + a(j10, i17, i14);
            }
        }
        long j11 = i10;
        long jP0 = p0(j11, jA, 1);
        long j12 = j11 - ((jA + 1) * jP0);
        long jP1 = p0(j12, jA2, i13);
        long j13 = j12 - ((jA2 + ((long) i13)) * jP1);
        long jP2 = p0(j13, j10, i14);
        return (int) ((jP0 * ((long) i11)) + (jP1 * ((long) i12)) + jP2 + ((long) (j13 - ((j10 + ((long) i14)) * jP2) > 0 ? 1 : 0)));
    }

    private static final Void T(String str, int i10) {
        throw new NumberFormatException("Expected a hexadecimal digit at index " + i10 + ", but was " + str.charAt(i10));
    }

    private static final void U(String str, int i10, int i11, String str2, int i12) {
        Intrinsics.checkNotNull(str, "null cannot be cast to non-null type java.lang.String");
        String strSubstring = str.substring(i10, i11);
        Intrinsics.checkNotNullExpressionValue(strSubstring, "substring(...)");
        throw new NumberFormatException("Expected " + str2 + ' ' + i12 + " hexadecimal digits at index " + i10 + ", but was \"" + strSubstring + "\" of length " + (i11 - i10));
    }

    private static final void V(String str, int i10, int i11, String str2, String str3) {
        Intrinsics.checkNotNull(str, "null cannot be cast to non-null type java.lang.String");
        String strSubstring = str.substring(i10, i11);
        Intrinsics.checkNotNullExpressionValue(strSubstring, "substring(...)");
        throw new NumberFormatException("Expected a hexadecimal number with prefix \"" + str2 + "\" and suffix \"" + str3 + "\", but was " + strSubstring);
    }

    private static final void W(String str, int i10, int i11, String str2, String str3) {
        int iB = kotlin.ranges.r.B(str2.length() + i10, i11);
        Intrinsics.checkNotNull(str, "null cannot be cast to non-null type java.lang.String");
        String strSubstring = str.substring(i10, iB);
        Intrinsics.checkNotNullExpressionValue(strSubstring, "substring(...)");
        throw new NumberFormatException("Expected " + str3 + " \"" + str2 + "\" at index " + i10 + ", but was " + strSubstring);
    }

    private static final int X(String str, char[] cArr, int i10) {
        int length = str.length();
        if (length != 0) {
            if (length != 1) {
                int length2 = str.length();
                Intrinsics.checkNotNull(str, "null cannot be cast to non-null type java.lang.String");
                str.getChars(0, length2, cArr, i10);
            } else {
                cArr[i10] = str.charAt(0);
            }
        }
        return i10 + str.length();
    }

    @kotlin.s
    @e1(version = "1.9")
    @NotNull
    public static final String Y(byte b10, @NotNull h format) {
        Intrinsics.checkNotNullParameter(format, "format");
        String str = format.e() ? f313313b : f313312a;
        h.d dVarD = format.d();
        if (!dVarD.j()) {
            return k0(b10, dVarD, str, 8);
        }
        char[] cArr = {str.charAt((b10 >> 4) & 15), str.charAt(b10 & com.google.common.base.c.f116464q)};
        if (!dVarD.g()) {
            return w.w1(cArr);
        }
        int i10 = 3 >> 0;
        return w.y1(cArr, kotlin.ranges.r.B((Integer.numberOfLeadingZeros(b10 & 255) - 24) >> 2, 1), 0, 2, null);
    }

    @kotlin.s
    @e1(version = "1.9")
    @NotNull
    public static final String Z(int i10, @NotNull h format) {
        Intrinsics.checkNotNullParameter(format, "format");
        String str = format.e() ? f313313b : f313312a;
        h.d dVarD = format.d();
        if (!dVarD.j()) {
            return k0(i10, dVarD, str, 32);
        }
        int i11 = 1 << 7;
        char[] cArr = {str.charAt((i10 >> 28) & 15), str.charAt((i10 >> 24) & 15), str.charAt((i10 >> 20) & 15), str.charAt((i10 >> 16) & 15), str.charAt((i10 >> 12) & 15), str.charAt((i10 >> 8) & 15), str.charAt((i10 >> 4) & 15), str.charAt(i10 & 15)};
        return dVarD.g() ? w.y1(cArr, kotlin.ranges.r.B(Integer.numberOfLeadingZeros(i10) >> 2, 7), 0, 2, null) : w.w1(cArr);
    }

    private static final long a(long j10, int i10, int i11) {
        if (i10 <= 0) {
            throw new IllegalArgumentException("Failed requirement.");
        }
        long j11 = i10;
        return (j10 * j11) + (((long) i11) * (j11 - 1));
    }

    @kotlin.s
    @e1(version = "1.9")
    @NotNull
    public static final String a0(long j10, @NotNull h format) {
        Intrinsics.checkNotNullParameter(format, "format");
        String str = format.e() ? f313313b : f313312a;
        h.d dVarD = format.d();
        if (!dVarD.j()) {
            return k0(j10, dVarD, str, 64);
        }
        char[] cArr = {str.charAt((int) ((j10 >> 60) & 15)), str.charAt((int) ((j10 >> 56) & 15)), str.charAt((int) ((j10 >> 52) & 15)), str.charAt((int) ((j10 >> 48) & 15)), str.charAt((int) ((j10 >> 44) & 15)), str.charAt((int) ((j10 >> 40) & 15)), str.charAt((int) ((j10 >> 36) & 15)), str.charAt((int) ((j10 >> 32) & 15)), str.charAt((int) ((j10 >> 28) & 15)), str.charAt((int) ((j10 >> 24) & 15)), str.charAt((int) ((j10 >> 20) & 15)), str.charAt((int) ((j10 >> 16) & 15)), str.charAt((int) ((j10 >> 12) & 15)), str.charAt((int) ((j10 >> 8) & 15)), str.charAt((int) ((j10 >> 4) & 15)), str.charAt((int) (j10 & 15))};
        return dVarD.g() ? w.y1(cArr, kotlin.ranges.r.B(Long.numberOfLeadingZeros(j10) >> 2, 15), 0, 2, null) : w.w1(cArr);
    }

    private static final int b(String str, int i10, int i11, String str2, boolean z10, String str3) {
        if (str2.length() == 0) {
            return i10;
        }
        int length = str2.length();
        for (int i12 = 0; i12 < length; i12++) {
            if (!c.I(str2.charAt(i12), str.charAt(i10 + i12), z10)) {
                W(str, i10, i11, str2, str3);
            }
        }
        return i10 + str2.length();
    }

    @kotlin.s
    @e1(version = "1.9")
    @NotNull
    public static final String b0(short s10, @NotNull h format) {
        Intrinsics.checkNotNullParameter(format, "format");
        String str = format.e() ? f313313b : f313312a;
        h.d dVarD = format.d();
        if (!dVarD.j()) {
            return k0(s10, dVarD, str, 16);
        }
        char[] cArr = {str.charAt((s10 >> 12) & 15), str.charAt((s10 >> 8) & 15), str.charAt((s10 >> 4) & 15), str.charAt(s10 & 15)};
        return dVarD.g() ? w.y1(cArr, kotlin.ranges.r.B((Integer.numberOfLeadingZeros(s10 & e2.f312492d) - 16) >> 2, 3), 0, 2, null) : w.w1(cArr);
    }

    private static final int c(long j10) {
        if (0 <= j10 && j10 <= g3.f12256c) {
            return (int) j10;
        }
        throw new IllegalArgumentException("The resulting string length is too big: " + ((Object) y1.u0(y1.n(j10))));
    }

    @kotlin.s
    @e1(version = "1.9")
    @NotNull
    public static final String c0(@NotNull byte[] bArr, int i10, int i11, @NotNull h format) {
        Intrinsics.checkNotNullParameter(bArr, "<this>");
        Intrinsics.checkNotNullParameter(format, "format");
        AbstractList.Companion.checkBoundsIndexes$kotlin_stdlib(i10, i11, bArr.length);
        if (i10 == i11) {
            return "";
        }
        int[] iArr = format.e() ? f313315d : f313314c;
        h.b bVarC = format.c();
        return bVarC.j() ? l0(bArr, i10, i11, bVarC, iArr) : o0(bArr, i10, i11, bVarC, iArr);
    }

    private static final int d(String str, int i10, int i11) {
        if (str.charAt(i10) == '\r') {
            int i12 = i10 + 1;
            return (i12 >= i11 || str.charAt(i12) != '\n') ? i12 : i10 + 2;
        }
        if (str.charAt(i10) == '\n') {
            return i10 + 1;
        }
        throw new NumberFormatException("Expected a new line at index " + i10 + ", but was " + str.charAt(i10));
    }

    @kotlin.s
    @e1(version = "1.9")
    @NotNull
    public static final String d0(@NotNull byte[] bArr, @NotNull h format) {
        Intrinsics.checkNotNullParameter(bArr, "<this>");
        Intrinsics.checkNotNullParameter(format, "format");
        return c0(bArr, 0, bArr.length, format);
    }

    private static final void e(String str, int i10, int i11, int i12) {
        int i13 = i11 - i10;
        if (i13 < 1) {
            U(str, i10, i11, "at least", 1);
        } else if (i13 > i12) {
            g(str, i10, (i13 + i10) - i12);
        }
    }

    public static /* synthetic */ String e0(byte b10, h hVar, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            hVar = h.f313318d.a();
        }
        return Y(b10, hVar);
    }

    private static final void f(String str, int i10, int i11, String str2, String str3, boolean z10, int i12) {
        if ((i11 - i10) - str2.length() <= str3.length()) {
            V(str, i10, i11, str2, str3);
        }
        if (str2.length() != 0) {
            int length = str2.length();
            for (int i13 = 0; i13 < length; i13++) {
                if (!c.I(str2.charAt(i13), str.charAt(i10 + i13), z10)) {
                    W(str, i10, i11, str2, "prefix");
                }
            }
            i10 += str2.length();
        }
        int length2 = i11 - str3.length();
        if (str3.length() != 0) {
            int length3 = str3.length();
            for (int i14 = 0; i14 < length3; i14++) {
                if (!c.I(str3.charAt(i14), str.charAt(length2 + i14), z10)) {
                    W(str, length2, i11, str3, "suffix");
                }
            }
        }
        e(str, i10, length2, i12);
    }

    public static /* synthetic */ String f0(int i10, h hVar, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            hVar = h.f313318d.a();
        }
        return Z(i10, hVar);
    }

    private static final void g(String str, int i10, int i11) {
        while (i10 < i11) {
            if (str.charAt(i10) != '0') {
                throw new NumberFormatException("Expected the hexadecimal digit '0' at index " + i10 + ", but was '" + str.charAt(i10) + "'.\nThe result won't fit the type being parsed.");
            }
            i10++;
        }
    }

    public static /* synthetic */ String g0(long j10, h hVar, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            hVar = h.f313318d.a();
        }
        return a0(j10, hVar);
    }

    private static final int h(String str, int i10) {
        int i11;
        char cCharAt = str.charAt(i10);
        if ((cCharAt >>> '\b') == 0 && (i11 = f313316e[cCharAt]) >= 0) {
            return i11;
        }
        T(str, i10);
        throw new kotlin.a0();
    }

    public static /* synthetic */ String h0(short s10, h hVar, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            hVar = h.f313318d.a();
        }
        return b0(s10, hVar);
    }

    private static final int i(byte[] bArr, int i10, String str, String str2, int[] iArr, char[] cArr, int i11) {
        return X(str2, cArr, j(bArr, i10, iArr, cArr, X(str, cArr, i11)));
    }

    public static /* synthetic */ String i0(byte[] bArr, int i10, int i11, h hVar, int i12, Object obj) {
        if ((i12 & 1) != 0) {
            i10 = 0;
        }
        if ((i12 & 2) != 0) {
            i11 = bArr.length;
        }
        if ((i12 & 4) != 0) {
            hVar = h.f313318d.a();
        }
        return c0(bArr, i10, i11, hVar);
    }

    private static final int j(byte[] bArr, int i10, int[] iArr, char[] cArr, int i11) {
        int i12 = iArr[bArr[i10] & 255];
        cArr[i11] = (char) (i12 >> 8);
        cArr[i11 + 1] = (char) (i12 & 255);
        return i11 + 2;
    }

    public static /* synthetic */ String j0(byte[] bArr, h hVar, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            hVar = h.f313318d.a();
        }
        return d0(bArr, hVar);
    }

    private static final int k(int i10, int i11, int i12, int i13) {
        if (i10 <= 0) {
            throw new IllegalArgumentException("Failed requirement.");
        }
        long j10 = i11;
        return c((((long) i10) * (((((long) i12) + 2) + ((long) i13)) + j10)) - j10);
    }

    @kotlin.s
    private static final String k0(long j10, h.d dVar, String str, int i10) {
        if ((i10 & 3) != 0) {
            throw new IllegalArgumentException("Failed requirement.");
        }
        int i11 = i10 >> 2;
        int iD = dVar.d();
        int iU = kotlin.ranges.r.u(iD - i11, 0);
        String strF = dVar.f();
        String strH = dVar.h();
        boolean zG = dVar.g();
        int iC = c(((long) strF.length()) + ((long) iU) + ((long) i11) + ((long) strH.length()));
        char[] cArr = new char[iC];
        int iX = X(strF, cArr, 0);
        if (iU > 0) {
            int i12 = iU + iX;
            ArraysKt.fill(cArr, str.charAt(0), iX, i12);
            iX = i12;
        }
        int i13 = i10;
        for (int i14 = 0; i14 < i11; i14++) {
            i13 -= 4;
            int i15 = (int) ((j10 >> i13) & 15);
            zG = zG && i15 == 0 && (i13 >> 2) >= iD;
            if (!zG) {
                cArr[iX] = str.charAt(i15);
                iX++;
            }
        }
        int iX2 = X(strH, cArr, iX);
        return iX2 == iC ? w.w1(cArr) : w.y1(cArr, 0, iX2, 1, null);
    }

    public static final int l(int i10, int i11, int i12, int i13, int i14, int i15, int i16) {
        if (i10 <= 0) {
            throw new IllegalArgumentException("Failed requirement.");
        }
        int i17 = i10 - 1;
        int i18 = i17 / i11;
        int i19 = (i11 - 1) / i12;
        int i20 = i10 % i11;
        if (i20 != 0) {
            i11 = i20;
        }
        int i21 = (i19 * i18) + ((i11 - 1) / i12);
        return c(((long) i18) + (((long) i21) * ((long) i13)) + (((long) ((i17 - i18) - i21)) * ((long) i14)) + (((long) i10) * (((long) i15) + 2 + ((long) i16))));
    }

    @kotlin.s
    private static final String l0(byte[] bArr, int i10, int i11, h.b bVar, int[] iArr) {
        return bVar.k() ? n0(bArr, i10, i11, bVar, iArr) : m0(bArr, i10, i11, bVar, iArr);
    }

    @NotNull
    public static final int[] m() {
        return f313314c;
    }

    @kotlin.s
    private static final String m0(byte[] bArr, int i10, int i11, h.b bVar, int[] iArr) {
        String strC = bVar.c();
        String strE = bVar.e();
        String strD = bVar.d();
        char[] cArr = new char[k(i11 - i10, strD.length(), strC.length(), strE.length())];
        int i12 = i(bArr, i10, strC, strE, iArr, cArr, 0);
        for (int i13 = i10 + 1; i13 < i11; i13++) {
            i12 = i(bArr, i13, strC, strE, iArr, cArr, X(strD, cArr, i12));
        }
        return w.w1(cArr);
    }

    @kotlin.s
    public static /* synthetic */ void n() {
    }

    @kotlin.s
    private static final String n0(byte[] bArr, int i10, int i11, h.b bVar, int[] iArr) {
        int length = bVar.d().length();
        if (length > 1) {
            throw new IllegalArgumentException("Failed requirement.");
        }
        int i12 = i11 - i10;
        int iJ = 0;
        if (length == 0) {
            char[] cArr = new char[c(((long) i12) * 2)];
            while (i10 < i11) {
                iJ = j(bArr, i10, iArr, cArr, iJ);
                i10++;
            }
            return w.w1(cArr);
        }
        char[] cArr2 = new char[c((((long) i12) * 3) - 1)];
        char cCharAt = bVar.d().charAt(0);
        int iJ2 = j(bArr, i10, iArr, cArr2, 0);
        for (int i13 = i10 + 1; i13 < i11; i13++) {
            cArr2[iJ2] = cCharAt;
            iJ2 = j(bArr, i13, iArr, cArr2, iJ2 + 1);
        }
        return w.w1(cArr2);
    }

    @kotlin.s
    private static final byte o(String str, int i10, int i11, h hVar) {
        return (byte) E(str, i10, i11, hVar, 2);
    }

    @kotlin.s
    private static final String o0(byte[] bArr, int i10, int i11, h.b bVar, int[] iArr) {
        int i12;
        int i13;
        int iG = bVar.g();
        int iF = bVar.f();
        String strC = bVar.c();
        String strE = bVar.e();
        String strD = bVar.d();
        String strH = bVar.h();
        int iL = l(i11 - i10, iG, iF, strH.length(), strD.length(), strC.length(), strE.length());
        char[] cArr = new char[iL];
        int i14 = i10;
        int iX = 0;
        int i15 = 0;
        int i16 = 0;
        while (i14 < i11) {
            if (i15 == iG) {
                cArr[iX] = '\n';
                iX++;
                i12 = 0;
                i13 = 0;
            } else if (i16 == iF) {
                iX = X(strH, cArr, iX);
                i12 = i15;
                i13 = 0;
            } else {
                i12 = i15;
                i13 = i16;
            }
            if (i13 != 0) {
                iX = X(strD, cArr, iX);
            }
            String str = strC;
            int i17 = i(bArr, i14, str, strE, iArr, cArr, iX);
            i14++;
            i16 = i13 + 1;
            iX = i17;
            strC = str;
            i15 = i12 + 1;
        }
        if (iX == iL) {
            return w.w1(cArr);
        }
        throw new IllegalStateException("Check failed.");
    }

    @kotlin.s
    @e1(version = "1.9")
    public static final byte p(@NotNull String str, @NotNull h format) {
        Intrinsics.checkNotNullParameter(str, "<this>");
        Intrinsics.checkNotNullParameter(format, "format");
        return o(str, 0, str.length(), format);
    }

    private static final long p0(long j10, long j11, int i10) {
        if (j10 > 0 && j11 > 0) {
            long j12 = i10;
            return (j10 + j12) / (j11 + j12);
        }
        return 0L;
    }

    static /* synthetic */ byte q(String str, int i10, int i11, h hVar, int i12, Object obj) {
        if ((i12 & 1) != 0) {
            i10 = 0;
        }
        if ((i12 & 2) != 0) {
            i11 = str.length();
        }
        if ((i12 & 4) != 0) {
            hVar = h.f313318d.a();
        }
        return o(str, i10, i11, hVar);
    }

    public static /* synthetic */ byte r(String str, h hVar, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            hVar = h.f313318d.a();
        }
        return p(str, hVar);
    }

    @kotlin.s
    private static final byte[] s(String str, int i10, int i11, h hVar) {
        byte[] bArrW;
        AbstractList.Companion.checkBoundsIndexes$kotlin_stdlib(i10, i11, str.length());
        if (i10 == i11) {
            return new byte[0];
        }
        h.b bVarC = hVar.c();
        return (!bVarC.j() || (bArrW = w(str, i10, i11, bVarC)) == null) ? z(str, i10, i11, bVarC) : bArrW;
    }

    @kotlin.s
    @e1(version = "1.9")
    @NotNull
    public static final byte[] t(@NotNull String str, @NotNull h format) {
        Intrinsics.checkNotNullParameter(str, "<this>");
        Intrinsics.checkNotNullParameter(format, "format");
        return s(str, 0, str.length(), format);
    }

    static /* synthetic */ byte[] u(String str, int i10, int i11, h hVar, int i12, Object obj) {
        if ((i12 & 1) != 0) {
            i10 = 0;
        }
        if ((i12 & 2) != 0) {
            i11 = str.length();
        }
        if ((i12 & 4) != 0) {
            hVar = h.f313318d.a();
        }
        return s(str, i10, i11, hVar);
    }

    public static /* synthetic */ byte[] v(String str, h hVar, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            hVar = h.f313318d.a();
        }
        return t(str, hVar);
    }

    @kotlin.s
    private static final byte[] w(String str, int i10, int i11, h.b bVar) {
        return bVar.k() ? y(str, i10, i11, bVar) : x(str, i10, i11, bVar);
    }

    @kotlin.s
    private static final byte[] x(String str, int i10, int i11, h.b bVar) {
        String strC = bVar.c();
        String strE = bVar.e();
        String strD = bVar.d();
        long length = strD.length();
        long length2 = ((long) strC.length()) + 2 + ((long) strE.length()) + length;
        long j10 = i11 - i10;
        int i12 = (int) ((j10 + length) / length2);
        if ((((long) i12) * length2) - length != j10) {
            return null;
        }
        boolean zI = bVar.i();
        byte[] bArr = new byte[i12];
        if (strC.length() != 0) {
            int length3 = strC.length();
            for (int i13 = 0; i13 < length3; i13++) {
                if (!c.I(strC.charAt(i13), str.charAt(i10 + i13), zI)) {
                    W(str, i10, i11, strC, "byte prefix");
                }
            }
            i10 += strC.length();
        }
        String str2 = strE + strD + strC;
        int i14 = i12 - 1;
        for (int i15 = 0; i15 < i14; i15++) {
            bArr[i15] = P(str, i10);
            i10 += 2;
            if (str2.length() != 0) {
                int length4 = str2.length();
                for (int i16 = 0; i16 < length4; i16++) {
                    if (!c.I(str2.charAt(i16), str.charAt(i10 + i16), zI)) {
                        W(str, i10, i11, str2, "byte suffix + byte separator + byte prefix");
                    }
                }
                i10 += str2.length();
            }
        }
        bArr[i14] = P(str, i10);
        int i17 = i10 + 2;
        if (strE.length() == 0) {
            return bArr;
        }
        int length5 = strE.length();
        for (int i18 = 0; i18 < length5; i18++) {
            if (!c.I(strE.charAt(i18), str.charAt(i17 + i18), zI)) {
                W(str, i17, i11, strE, "byte suffix");
            }
        }
        return bArr;
    }

    @kotlin.s
    private static final byte[] y(String str, int i10, int i11, h.b bVar) {
        int length = bVar.d().length();
        if (length > 1) {
            throw new IllegalArgumentException("Failed requirement.");
        }
        int i12 = i11 - i10;
        int i13 = 2;
        if (length == 0) {
            if ((i12 & 1) != 0) {
                return null;
            }
            int i14 = i12 >> 1;
            byte[] bArr = new byte[i14];
            int i15 = 0;
            for (int i16 = 0; i16 < i14; i16++) {
                bArr[i16] = P(str, i15);
                i15 += 2;
            }
            return bArr;
        }
        if (i12 % 3 != 2) {
            return null;
        }
        int i17 = (i12 / 3) + 1;
        byte[] bArr2 = new byte[i17];
        char cCharAt = bVar.d().charAt(0);
        bArr2[0] = P(str, 0);
        for (int i18 = 1; i18 < i17; i18++) {
            if (str.charAt(i13) != cCharAt) {
                String strD = bVar.d();
                boolean zI = bVar.i();
                if (strD.length() != 0) {
                    int length2 = strD.length();
                    for (int i19 = 0; i19 < length2; i19++) {
                        if (!c.I(strD.charAt(i19), str.charAt(i13 + i19), zI)) {
                            W(str, i13, i11, strD, "byte separator");
                        }
                    }
                    strD.length();
                }
            }
            bArr2[i18] = P(str, i13 + 1);
            i13 += 3;
        }
        return bArr2;
    }

    /* JADX WARN: Code duplicated, block: B:33:0x00d9  */
    /* JADX WARN: Code duplicated, block: B:35:0x00e0  */
    /* JADX WARN: Code duplicated, block: B:37:0x00f4  */
    /* JADX WARN: Code duplicated, block: B:42:0x0107  */
    /* JADX WARN: Code duplicated, block: B:45:0x011d  */
    /* JADX WARN: Code duplicated, block: B:46:0x0120  */
    /* JADX WARN: Code duplicated, block: B:48:0x0127  */
    /* JADX WARN: Code duplicated, block: B:50:0x013b  */
    /* JADX WARN: Code duplicated, block: B:63:0x00f9 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:66:0x0142 A[SYNTHETIC] */
    @kotlin.s
    private static final byte[] z(String str, int i10, int i11, h.b bVar) {
        int i12;
        int i13;
        int i14;
        int length;
        int i15;
        int i16;
        int length2;
        int i17;
        int iG = bVar.g();
        int iF = bVar.f();
        String strC = bVar.c();
        String strE = bVar.e();
        String strD = bVar.d();
        String strH = bVar.h();
        boolean zI = bVar.i();
        int iS = S(i11 - i10, iG, iF, strH.length(), strD.length(), strC.length(), strE.length());
        byte[] bArr = new byte[iS];
        int length3 = i10;
        int i18 = 0;
        int i19 = 0;
        int i20 = 0;
        while (length3 < i11) {
            if (i19 == iG) {
                length3 = d(str, length3, i11);
                i12 = iG;
                i13 = iF;
                i19 = 0;
            } else {
                if (i20 != iF) {
                    i12 = iG;
                    i13 = iF;
                    if (i20 != 0 && strD.length() != 0) {
                        int length4 = strD.length();
                        int i21 = 0;
                        while (i21 < length4) {
                            int i22 = length4;
                            if (!c.I(strD.charAt(i21), str.charAt(length3 + i21), zI)) {
                                W(str, length3, i11, strD, "byte separator");
                            }
                            i21++;
                            length4 = i22;
                        }
                        length3 += strD.length();
                    }
                } else if (strH.length() == 0) {
                    i12 = iG;
                    i13 = iF;
                } else {
                    int length5 = strH.length();
                    int i23 = 0;
                    while (i23 < length5) {
                        int i24 = iG;
                        int i25 = iF;
                        if (!c.I(strH.charAt(i23), str.charAt(length3 + i23), zI)) {
                            W(str, length3, i11, strH, "group separator");
                        }
                        i23++;
                        iG = i24;
                        iF = i25;
                    }
                    i12 = iG;
                    i13 = iF;
                    length3 += strH.length();
                }
                i19++;
                i20++;
                if (strC.length() != 0) {
                    length2 = strC.length();
                    i17 = 0;
                    while (i17 < length2) {
                        int i26 = length2;
                        if (!c.I(strC.charAt(i17), str.charAt(length3 + i17), zI)) {
                            W(str, length3, i11, strC, "byte prefix");
                        }
                        i17++;
                        length2 = i26;
                    }
                    length3 += strC.length();
                }
                if (i11 - 2 < length3) {
                    U(str, length3, i11, "exactly", 2);
                }
                i14 = i18 + 1;
                bArr[i18] = P(str, length3);
                length3 += 2;
                if (strE.length() == 0) {
                    i16 = i14;
                } else {
                    length = strE.length();
                    i15 = 0;
                    while (i15 < length) {
                        int i27 = i14;
                        if (!c.I(strE.charAt(i15), str.charAt(length3 + i15), zI)) {
                            W(str, length3, i11, strE, "byte suffix");
                        }
                        i15++;
                        i14 = i27;
                    }
                    i16 = i14;
                    length3 += strE.length();
                }
                i18 = i16;
                iG = i12;
                iF = i13;
            }
            i20 = 0;
            i19++;
            i20++;
            if (strC.length() != 0) {
                length2 = strC.length();
                i17 = 0;
                while (i17 < length2) {
                    int i28 = length2;
                    if (!c.I(strC.charAt(i17), str.charAt(length3 + i17), zI)) {
                        W(str, length3, i11, strC, "byte prefix");
                    }
                    i17++;
                    length2 = i28;
                }
                length3 += strC.length();
            }
            if (i11 - 2 < length3) {
                U(str, length3, i11, "exactly", 2);
            }
            i14 = i18 + 1;
            bArr[i18] = P(str, length3);
            length3 += 2;
            if (strE.length() == 0) {
                i16 = i14;
            } else {
                length = strE.length();
                i15 = 0;
                while (i15 < length) {
                    int i29 = i14;
                    if (!c.I(strE.charAt(i15), str.charAt(length3 + i15), zI)) {
                        W(str, length3, i11, strE, "byte suffix");
                    }
                    i15++;
                    i14 = i29;
                }
                i16 = i14;
                length3 += strE.length();
            }
            i18 = i16;
            iG = i12;
            iF = i13;
        }
        if (i18 == iS) {
            return bArr;
        }
        byte[] bArrCopyOf = Arrays.copyOf(bArr, i18);
        Intrinsics.checkNotNullExpressionValue(bArrCopyOf, "copyOf(...)");
        return bArrCopyOf;
    }
}
