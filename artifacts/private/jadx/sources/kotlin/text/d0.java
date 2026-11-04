package kotlin.text;

import com.rabbitmq.client.k0;
import kotlin.e1;
import kotlin.e2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.l2;
import kotlin.m2;
import kotlin.q1;
import kotlin.u1;
import kotlin.y1;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes11.dex */
@oj.i(name = "UStringsKt")
public final class d0 {
    @m2(markerClass = {kotlin.u.class})
    @e1(version = "1.5")
    @NotNull
    public static final String a(long j10, int i10) {
        return l2.t(j10, CharsKt__CharJVMKt.checkRadix(i10));
    }

    @m2(markerClass = {kotlin.u.class})
    @e1(version = "1.5")
    @NotNull
    public static final String b(byte b10, int i10) {
        String string = Integer.toString(b10 & 255, CharsKt__CharJVMKt.checkRadix(i10));
        Intrinsics.checkNotNullExpressionValue(string, "toString(...)");
        return string;
    }

    @m2(markerClass = {kotlin.u.class})
    @e1(version = "1.5")
    @NotNull
    public static final String c(int i10, int i11) {
        return l2.t(((long) i10) & k0.f265952a, CharsKt__CharJVMKt.checkRadix(i11));
    }

    @m2(markerClass = {kotlin.u.class})
    @e1(version = "1.5")
    @NotNull
    public static final String d(short s10, int i10) {
        String string = Integer.toString(s10 & e2.f312492d, CharsKt__CharJVMKt.checkRadix(i10));
        Intrinsics.checkNotNullExpressionValue(string, "toString(...)");
        return string;
    }

    @m2(markerClass = {kotlin.u.class})
    @e1(version = "1.5")
    public static final byte e(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "<this>");
        q1 q1VarG = g(str);
        if (q1VarG != null) {
            return q1VarG.x0();
        }
        StringsKt__StringNumberConversionsKt.Y0(str);
        throw new kotlin.a0();
    }

    @m2(markerClass = {kotlin.u.class})
    @e1(version = "1.5")
    public static final byte f(@NotNull String str, int i10) {
        Intrinsics.checkNotNullParameter(str, "<this>");
        q1 q1VarH = h(str, i10);
        if (q1VarH != null) {
            return q1VarH.x0();
        }
        StringsKt__StringNumberConversionsKt.Y0(str);
        throw new kotlin.a0();
    }

    @m2(markerClass = {kotlin.u.class})
    @e1(version = "1.5")
    @Nullable
    public static final q1 g(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "<this>");
        return h(str, 10);
    }

    @m2(markerClass = {kotlin.u.class})
    @e1(version = "1.5")
    @Nullable
    public static final q1 h(@NotNull String str, int i10) {
        Intrinsics.checkNotNullParameter(str, "<this>");
        u1 u1VarL = l(str, i10);
        if (u1VarL == null) {
            return null;
        }
        int iZ0 = u1VarL.z0();
        if (Integer.compareUnsigned(iZ0, u1.n(255)) > 0) {
            return null;
        }
        return q1.c(q1.n((byte) iZ0));
    }

    @m2(markerClass = {kotlin.u.class})
    @e1(version = "1.5")
    public static final int i(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "<this>");
        u1 u1VarK = k(str);
        if (u1VarK != null) {
            return u1VarK.z0();
        }
        StringsKt__StringNumberConversionsKt.Y0(str);
        throw new kotlin.a0();
    }

    @m2(markerClass = {kotlin.u.class})
    @e1(version = "1.5")
    public static final int j(@NotNull String str, int i10) {
        Intrinsics.checkNotNullParameter(str, "<this>");
        u1 u1VarL = l(str, i10);
        if (u1VarL != null) {
            return u1VarL.z0();
        }
        StringsKt__StringNumberConversionsKt.Y0(str);
        throw new kotlin.a0();
    }

    @m2(markerClass = {kotlin.u.class})
    @e1(version = "1.5")
    @Nullable
    public static final u1 k(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "<this>");
        return l(str, 10);
    }

    @m2(markerClass = {kotlin.u.class})
    @e1(version = "1.5")
    @Nullable
    public static final u1 l(@NotNull String str, int i10) {
        int i11;
        Intrinsics.checkNotNullParameter(str, "<this>");
        CharsKt__CharJVMKt.checkRadix(i10);
        int length = str.length();
        if (length == 0) {
            return null;
        }
        int i12 = 0;
        char cCharAt = str.charAt(0);
        if (Intrinsics.compare((int) cCharAt, 48) < 0) {
            i11 = 1;
            if (length == 1 || cCharAt != '+') {
                return null;
            }
        } else {
            i11 = 0;
        }
        int iN = u1.n(i10);
        int iDivideUnsigned = 119304647;
        while (i11 < length) {
            int iA = CharsKt__CharJVMKt.a(str.charAt(i11), i10);
            if (iA < 0) {
                return null;
            }
            if (Integer.compareUnsigned(i12, iDivideUnsigned) > 0) {
                if (iDivideUnsigned == 119304647) {
                    iDivideUnsigned = Integer.divideUnsigned(-1, iN);
                    if (Integer.compareUnsigned(i12, iDivideUnsigned) > 0) {
                    }
                }
                return null;
            }
            int iN2 = u1.n(i12 * iN);
            int iN3 = u1.n(u1.n(iA) + iN2);
            if (Integer.compareUnsigned(iN3, iN2) < 0) {
                return null;
            }
            i11++;
            i12 = iN3;
        }
        return u1.c(i12);
    }

    @m2(markerClass = {kotlin.u.class})
    @e1(version = "1.5")
    public static final long m(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "<this>");
        y1 y1VarO = o(str);
        if (y1VarO != null) {
            return y1VarO.z0();
        }
        StringsKt__StringNumberConversionsKt.Y0(str);
        throw new kotlin.a0();
    }

    @m2(markerClass = {kotlin.u.class})
    @e1(version = "1.5")
    public static final long n(@NotNull String str, int i10) {
        Intrinsics.checkNotNullParameter(str, "<this>");
        y1 y1VarP = p(str, i10);
        if (y1VarP != null) {
            return y1VarP.z0();
        }
        StringsKt__StringNumberConversionsKt.Y0(str);
        throw new kotlin.a0();
    }

    @m2(markerClass = {kotlin.u.class})
    @e1(version = "1.5")
    @Nullable
    public static final y1 o(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "<this>");
        return p(str, 10);
    }

    @m2(markerClass = {kotlin.u.class})
    @e1(version = "1.5")
    @Nullable
    public static final y1 p(@NotNull String str, int i10) {
        Intrinsics.checkNotNullParameter(str, "<this>");
        CharsKt__CharJVMKt.checkRadix(i10);
        int length = str.length();
        if (length == 0) {
            return null;
        }
        int i11 = 0;
        char cCharAt = str.charAt(0);
        if (Intrinsics.compare((int) cCharAt, 48) < 0) {
            i11 = 1;
            if (length == 1 || cCharAt != '+') {
                return null;
            }
        }
        long jN = y1.n(i10);
        long j10 = 0;
        long jDivideUnsigned = 512409557603043100L;
        while (i11 < length) {
            int iA = CharsKt__CharJVMKt.a(str.charAt(i11), i10);
            if (iA < 0) {
                return null;
            }
            if (Long.compareUnsigned(j10, jDivideUnsigned) > 0) {
                if (jDivideUnsigned == 512409557603043100L) {
                    jDivideUnsigned = Long.divideUnsigned(-1L, jN);
                    if (Long.compareUnsigned(j10, jDivideUnsigned) > 0) {
                    }
                }
                return null;
            }
            long jN2 = y1.n(j10 * jN);
            long jN3 = y1.n(y1.n(((long) u1.n(iA)) & k0.f265952a) + jN2);
            if (Long.compareUnsigned(jN3, jN2) < 0) {
                return null;
            }
            i11++;
            j10 = jN3;
        }
        return y1.c(j10);
    }

    @m2(markerClass = {kotlin.u.class})
    @e1(version = "1.5")
    public static final short q(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "<this>");
        e2 e2VarS = s(str);
        if (e2VarS != null) {
            return e2VarS.x0();
        }
        StringsKt__StringNumberConversionsKt.Y0(str);
        throw new kotlin.a0();
    }

    @m2(markerClass = {kotlin.u.class})
    @e1(version = "1.5")
    public static final short r(@NotNull String str, int i10) {
        Intrinsics.checkNotNullParameter(str, "<this>");
        e2 e2VarT = t(str, i10);
        if (e2VarT != null) {
            return e2VarT.x0();
        }
        StringsKt__StringNumberConversionsKt.Y0(str);
        throw new kotlin.a0();
    }

    @m2(markerClass = {kotlin.u.class})
    @e1(version = "1.5")
    @Nullable
    public static final e2 s(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "<this>");
        return t(str, 10);
    }

    @m2(markerClass = {kotlin.u.class})
    @e1(version = "1.5")
    @Nullable
    public static final e2 t(@NotNull String str, int i10) {
        Intrinsics.checkNotNullParameter(str, "<this>");
        u1 u1VarL = l(str, i10);
        if (u1VarL == null) {
            return null;
        }
        int iZ0 = u1VarL.z0();
        if (Integer.compareUnsigned(iZ0, u1.n(65535)) > 0) {
            return null;
        }
        return e2.c(e2.n((short) iZ0));
    }
}
