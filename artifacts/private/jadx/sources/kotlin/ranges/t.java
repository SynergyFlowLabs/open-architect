package kotlin.ranges;

import android.support.v4.media.session.PlaybackStateCompat;
import androidx.collection.g3;
import java.util.NoSuchElementException;
import kotlin.e1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.m2;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: Access modifiers changed from: package-private */
/* JADX INFO: loaded from: classes11.dex */
@SourceDebugExtension({"SMAP\n_Ranges.kt\nKotlin\n*S Kotlin\n*F\n+ 1 _Ranges.kt\nkotlin/ranges/RangesKt___RangesKt\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,1538:1\n1#2:1539\n*E\n"})
public class t extends s {
    public static float A(float f10, float f11) {
        return f10 > f11 ? f11 : f10;
    }

    @e1(version = "1.7")
    @Nullable
    public static final Integer A0(@NotNull j jVar) {
        Intrinsics.checkNotNullParameter(jVar, "<this>");
        if (jVar.isEmpty()) {
            return null;
        }
        return Integer.valueOf(jVar.l());
    }

    @NotNull
    public static final a A1(@NotNull a aVar, int i10) {
        Intrinsics.checkNotNullParameter(aVar, "<this>");
        s.a(i10 > 0, Integer.valueOf(i10));
        a.C2262a c2262a = a.f312909d;
        char cL = aVar.l();
        char cM = aVar.m();
        if (aVar.n() <= 0) {
            i10 = -i10;
        }
        return c2262a.a(cL, cM, i10);
    }

    public static int B(int i10, int i11) {
        return i10 > i11 ? i11 : i10;
    }

    @e1(version = "1.7")
    @Nullable
    public static final Long B0(@NotNull l lVar) {
        Intrinsics.checkNotNullParameter(lVar, "<this>");
        if (!lVar.isEmpty()) {
            return Long.valueOf(lVar.l());
        }
        int i10 = 6 ^ 0;
        return null;
    }

    @NotNull
    public static j B1(@NotNull j jVar, int i10) {
        Intrinsics.checkNotNullParameter(jVar, "<this>");
        s.a(i10 > 0, Integer.valueOf(i10));
        j.a aVar = j.f312927d;
        int iL = jVar.l();
        int iM = jVar.m();
        if (jVar.n() <= 0) {
            i10 = -i10;
        }
        return aVar.a(iL, iM, i10);
    }

    public static long C(long j10, long j11) {
        return j10 > j11 ? j11 : j10;
    }

    @kotlin.l(message = "This `contains` operation mixing integer and floating point arguments has ambiguous semantics and is going to be removed.")
    @kotlin.m(errorSince = "1.4", hiddenSince = "1.5", warningSince = "1.3")
    @oj.i(name = "floatRangeContains")
    public static final /* synthetic */ boolean C0(g gVar, byte b10) {
        Intrinsics.checkNotNullParameter(gVar, "<this>");
        return gVar.c(Float.valueOf(b10));
    }

    @NotNull
    public static l C1(@NotNull l lVar, long j10) {
        Intrinsics.checkNotNullParameter(lVar, "<this>");
        s.a(j10 > 0, Long.valueOf(j10));
        l.a aVar = l.f312935d;
        long jL = lVar.l();
        long jM = lVar.m();
        if (lVar.n() <= 0) {
            j10 = -j10;
        }
        return aVar.a(jL, jM, j10);
    }

    @NotNull
    public static <T extends Comparable<? super T>> T D(@NotNull T t10, @NotNull T maximumValue) {
        Intrinsics.checkNotNullParameter(t10, "<this>");
        Intrinsics.checkNotNullParameter(maximumValue, "maximumValue");
        return t10.compareTo(maximumValue) > 0 ? maximumValue : t10;
    }

    @oj.i(name = "floatRangeContains")
    public static final boolean D0(@NotNull g<Float> gVar, double d10) {
        Intrinsics.checkNotNullParameter(gVar, "<this>");
        return gVar.c(Float.valueOf((float) d10));
    }

    @Nullable
    public static final Byte D1(double d10) {
        if (-128.0d > d10 || d10 > 127.0d) {
            return null;
        }
        return Byte.valueOf((byte) d10);
    }

    public static final short E(short s10, short s11) {
        return s10 > s11 ? s11 : s10;
    }

    @kotlin.l(message = "This `contains` operation mixing integer and floating point arguments has ambiguous semantics and is going to be removed.")
    @kotlin.m(errorSince = "1.4", hiddenSince = "1.5", warningSince = "1.3")
    @oj.i(name = "floatRangeContains")
    public static final /* synthetic */ boolean E0(g gVar, int i10) {
        Intrinsics.checkNotNullParameter(gVar, "<this>");
        return gVar.c(Float.valueOf(i10));
    }

    @Nullable
    public static final Byte E1(float f10) {
        if (-128.0f > f10 || f10 > 127.0f) {
            return null;
        }
        return Byte.valueOf((byte) f10);
    }

    public static final byte F(byte b10, byte b11, byte b12) {
        if (b11 <= b12) {
            if (b10 < b11) {
                return b11;
            }
            return b10 > b12 ? b12 : b10;
        }
        throw new IllegalArgumentException("Cannot coerce value to an empty range: maximum " + ((int) b12) + " is less than minimum " + ((int) b11) + '.');
    }

    @kotlin.l(message = "This `contains` operation mixing integer and floating point arguments has ambiguous semantics and is going to be removed.")
    @kotlin.m(errorSince = "1.4", hiddenSince = "1.5", warningSince = "1.3")
    @oj.i(name = "floatRangeContains")
    public static final /* synthetic */ boolean F0(g gVar, long j10) {
        Intrinsics.checkNotNullParameter(gVar, "<this>");
        return gVar.c(Float.valueOf(j10));
    }

    @Nullable
    public static final Byte F1(int i10) {
        if (-128 > i10 || i10 >= 128) {
            return null;
        }
        return Byte.valueOf((byte) i10);
    }

    public static double G(double d10, double d11, double d12) {
        if (d11 <= d12) {
            if (d10 < d11) {
                return d11;
            }
            return d10 > d12 ? d12 : d10;
        }
        throw new IllegalArgumentException("Cannot coerce value to an empty range: maximum " + d12 + " is less than minimum " + d11 + '.');
    }

    @kotlin.l(message = "This `contains` operation mixing integer and floating point arguments has ambiguous semantics and is going to be removed.")
    @kotlin.m(errorSince = "1.4", hiddenSince = "1.5", warningSince = "1.3")
    @oj.i(name = "floatRangeContains")
    public static final /* synthetic */ boolean G0(g gVar, short s10) {
        Intrinsics.checkNotNullParameter(gVar, "<this>");
        return gVar.c(Float.valueOf(s10));
    }

    @Nullable
    public static final Byte G1(long j10) {
        if (-128 > j10 || j10 >= 128) {
            return null;
        }
        return Byte.valueOf((byte) j10);
    }

    public static float H(float f10, float f11, float f12) {
        if (f11 <= f12) {
            if (f10 < f11) {
                return f11;
            }
            return f10 > f12 ? f12 : f10;
        }
        throw new IllegalArgumentException("Cannot coerce value to an empty range: maximum " + f12 + " is less than minimum " + f11 + '.');
    }

    @oj.i(name = "intRangeContains")
    public static final boolean H0(@NotNull g<Integer> gVar, byte b10) {
        Intrinsics.checkNotNullParameter(gVar, "<this>");
        return gVar.c(Integer.valueOf(b10));
    }

    @Nullable
    public static final Byte H1(short s10) {
        if (-128 > s10 || s10 >= 128) {
            return null;
        }
        return Byte.valueOf((byte) s10);
    }

    public static int I(int i10, int i11, int i12) {
        if (i11 <= i12) {
            if (i10 < i11) {
                return i11;
            }
            return i10 > i12 ? i12 : i10;
        }
        throw new IllegalArgumentException("Cannot coerce value to an empty range: maximum " + i12 + " is less than minimum " + i11 + '.');
    }

    @kotlin.l(message = "This `contains` operation mixing integer and floating point arguments has ambiguous semantics and is going to be removed.")
    @kotlin.m(errorSince = "1.4", hiddenSince = "1.5", warningSince = "1.3")
    @oj.i(name = "intRangeContains")
    public static final /* synthetic */ boolean I0(g gVar, double d10) {
        Intrinsics.checkNotNullParameter(gVar, "<this>");
        Integer numI1 = I1(d10);
        if (numI1 != null) {
            return gVar.c(numI1);
        }
        return false;
    }

    @Nullable
    public static final Integer I1(double d10) {
        if (-2.147483648E9d > d10 || d10 > 2.147483647E9d) {
            return null;
        }
        return Integer.valueOf((int) d10);
    }

    public static int J(int i10, @NotNull g<Integer> range) {
        Intrinsics.checkNotNullParameter(range, "range");
        if (range instanceof f) {
            return ((Number) N(Integer.valueOf(i10), (f) range)).intValue();
        }
        if (!range.isEmpty()) {
            if (i10 < ((Number) range.u()).intValue()) {
                return ((Number) range.u()).intValue();
            }
            return i10 > ((Number) range.i()).intValue() ? ((Number) range.i()).intValue() : i10;
        }
        throw new IllegalArgumentException("Cannot coerce value to an empty range: " + range + '.');
    }

    @kotlin.l(message = "This `contains` operation mixing integer and floating point arguments has ambiguous semantics and is going to be removed.")
    @kotlin.m(errorSince = "1.4", hiddenSince = "1.5", warningSince = "1.3")
    @oj.i(name = "intRangeContains")
    public static final /* synthetic */ boolean J0(g gVar, float f10) {
        Intrinsics.checkNotNullParameter(gVar, "<this>");
        Integer numJ1 = J1(f10);
        if (numJ1 != null) {
            return gVar.c(numJ1);
        }
        return false;
    }

    @Nullable
    public static final Integer J1(float f10) {
        if (-2.1474836E9f > f10 || f10 > 2.1474836E9f) {
            return null;
        }
        return Integer.valueOf((int) f10);
    }

    public static long K(long j10, long j11, long j12) {
        if (j11 <= j12) {
            if (j10 < j11) {
                return j11;
            }
            return j10 > j12 ? j12 : j10;
        }
        throw new IllegalArgumentException("Cannot coerce value to an empty range: maximum " + j12 + " is less than minimum " + j11 + '.');
    }

    @oj.i(name = "intRangeContains")
    public static final boolean K0(@NotNull g<Integer> gVar, long j10) {
        Intrinsics.checkNotNullParameter(gVar, "<this>");
        Integer numK1 = K1(j10);
        if (numK1 != null) {
            return gVar.c(numK1);
        }
        return false;
    }

    @Nullable
    public static final Integer K1(long j10) {
        if (g3.f12261h > j10 || j10 >= 2147483648L) {
            return null;
        }
        return Integer.valueOf((int) j10);
    }

    public static long L(long j10, @NotNull g<Long> range) {
        Intrinsics.checkNotNullParameter(range, "range");
        if (range instanceof f) {
            return ((Number) N(Long.valueOf(j10), (f) range)).longValue();
        }
        if (range.isEmpty()) {
            throw new IllegalArgumentException("Cannot coerce value to an empty range: " + range + '.');
        }
        if (j10 < ((Number) range.u()).longValue()) {
            return ((Number) range.u()).longValue();
        }
        if (j10 > ((Number) range.i()).longValue()) {
            j10 = ((Number) range.i()).longValue();
        }
        return j10;
    }

    @oj.i(name = "intRangeContains")
    public static final boolean L0(@NotNull g<Integer> gVar, short s10) {
        Intrinsics.checkNotNullParameter(gVar, "<this>");
        return gVar.c(Integer.valueOf(s10));
    }

    @Nullable
    public static final Long L1(double d10) {
        if (-9.223372036854776E18d > d10 || d10 > 9.223372036854776E18d) {
            return null;
        }
        return Long.valueOf((long) d10);
    }

    @NotNull
    public static final <T extends Comparable<? super T>> T M(@NotNull T t10, @Nullable T t11, @Nullable T t12) {
        Intrinsics.checkNotNullParameter(t10, "<this>");
        if (t11 == null || t12 == null) {
            if (t11 != null && t10.compareTo(t11) < 0) {
                return t11;
            }
            if (t12 != null && t10.compareTo(t12) > 0) {
                return t12;
            }
        } else {
            if (t11.compareTo(t12) > 0) {
                throw new IllegalArgumentException("Cannot coerce value to an empty range: maximum " + t12 + " is less than minimum " + t11 + '.');
            }
            if (t10.compareTo(t11) < 0) {
                return t11;
            }
            if (t10.compareTo(t12) > 0) {
                return t12;
            }
        }
        return t10;
    }

    @m2(markerClass = {kotlin.s.class})
    @e1(version = "1.9")
    @oj.i(name = "intRangeContains")
    public static final boolean M0(@NotNull q<Integer> qVar, byte b10) {
        Intrinsics.checkNotNullParameter(qVar, "<this>");
        return qVar.c(Integer.valueOf(b10));
    }

    @Nullable
    public static final Long M1(float f10) {
        if (-9.223372E18f > f10 || f10 > 9.223372E18f) {
            return null;
        }
        return Long.valueOf((long) f10);
    }

    @e1(version = com.rabbitmq.tools.jsonrpc.j.f266120g)
    @NotNull
    public static <T extends Comparable<? super T>> T N(@NotNull T t10, @NotNull f<T> range) {
        Intrinsics.checkNotNullParameter(t10, "<this>");
        Intrinsics.checkNotNullParameter(range, "range");
        if (!range.isEmpty()) {
            if (!range.d(t10, range.u()) || range.d(range.u(), t10)) {
                return (!range.d(range.i(), t10) || range.d(t10, range.i())) ? t10 : range.i();
            }
            return range.u();
        }
        throw new IllegalArgumentException("Cannot coerce value to an empty range: " + range + '.');
    }

    @m2(markerClass = {kotlin.s.class})
    @e1(version = "1.9")
    @oj.i(name = "intRangeContains")
    public static final boolean N0(@NotNull q<Integer> qVar, long j10) {
        Intrinsics.checkNotNullParameter(qVar, "<this>");
        Integer numK1 = K1(j10);
        if (numK1 != null) {
            return qVar.c(numK1);
        }
        return false;
    }

    @Nullable
    public static final Short N1(double d10) {
        if (-32768.0d > d10 || d10 > 32767.0d) {
            return null;
        }
        return Short.valueOf((short) d10);
    }

    @NotNull
    public static final <T extends Comparable<? super T>> T O(@NotNull T t10, @NotNull g<T> range) {
        Intrinsics.checkNotNullParameter(t10, "<this>");
        Intrinsics.checkNotNullParameter(range, "range");
        if (range instanceof f) {
            return (T) N(t10, (f) range);
        }
        if (!range.isEmpty()) {
            if (t10.compareTo(range.u()) < 0) {
                return (T) range.u();
            }
            return t10.compareTo(range.i()) > 0 ? (T) range.i() : t10;
        }
        throw new IllegalArgumentException("Cannot coerce value to an empty range: " + range + '.');
    }

    @m2(markerClass = {kotlin.s.class})
    @e1(version = "1.9")
    @oj.i(name = "intRangeContains")
    public static final boolean O0(@NotNull q<Integer> qVar, short s10) {
        Intrinsics.checkNotNullParameter(qVar, "<this>");
        return qVar.c(Integer.valueOf(s10));
    }

    @Nullable
    public static final Short O1(float f10) {
        if (-32768.0f > f10 || f10 > 32767.0f) {
            return null;
        }
        return Short.valueOf((short) f10);
    }

    public static final short P(short s10, short s11, short s12) {
        if (s11 <= s12) {
            if (s10 < s11) {
                return s11;
            }
            return s10 > s12 ? s12 : s10;
        }
        throw new IllegalArgumentException("Cannot coerce value to an empty range: maximum " + ((int) s12) + " is less than minimum " + ((int) s11) + '.');
    }

    @e1(version = "1.7")
    public static final char P0(@NotNull a aVar) {
        Intrinsics.checkNotNullParameter(aVar, "<this>");
        if (!aVar.isEmpty()) {
            return aVar.m();
        }
        throw new NoSuchElementException("Progression " + aVar + " is empty.");
    }

    @Nullable
    public static final Short P1(int i10) {
        if (-32768 > i10 || i10 >= 32768) {
            return null;
        }
        return Short.valueOf((short) i10);
    }

    @e1(version = "1.3")
    @kotlin.internal.f
    private static final boolean Q(c cVar, Character ch2) {
        Intrinsics.checkNotNullParameter(cVar, "<this>");
        return ch2 != null && cVar.t(ch2.charValue());
    }

    @e1(version = "1.7")
    public static final int Q0(@NotNull j jVar) {
        Intrinsics.checkNotNullParameter(jVar, "<this>");
        if (!jVar.isEmpty()) {
            return jVar.m();
        }
        throw new NoSuchElementException("Progression " + jVar + " is empty.");
    }

    @Nullable
    public static final Short Q1(long j10) {
        if (-32768 > j10 || j10 >= PlaybackStateCompat.f9652h3) {
            return null;
        }
        return Short.valueOf((short) j10);
    }

    @kotlin.internal.f
    private static final boolean R(IntRange intRange, byte b10) {
        Intrinsics.checkNotNullParameter(intRange, "<this>");
        return H0(intRange, b10);
    }

    @e1(version = "1.7")
    public static final long R0(@NotNull l lVar) {
        Intrinsics.checkNotNullParameter(lVar, "<this>");
        if (!lVar.isEmpty()) {
            return lVar.m();
        }
        throw new NoSuchElementException("Progression " + lVar + " is empty.");
    }

    @NotNull
    public static final c R1(char c10, char c11) {
        return Intrinsics.compare((int) c11, 0) <= 0 ? c.f312917e.a() : new c(c10, (char) (c11 - 1));
    }

    @kotlin.internal.f
    private static final boolean S(IntRange intRange, long j10) {
        Intrinsics.checkNotNullParameter(intRange, "<this>");
        return K0(intRange, j10);
    }

    @e1(version = "1.7")
    @Nullable
    public static final Character S0(@NotNull a aVar) {
        Intrinsics.checkNotNullParameter(aVar, "<this>");
        if (aVar.isEmpty()) {
            return null;
        }
        return Character.valueOf(aVar.m());
    }

    @NotNull
    public static final IntRange S1(byte b10, byte b11) {
        return new IntRange(b10, b11 - 1);
    }

    @e1(version = "1.3")
    @kotlin.internal.f
    private static final boolean T(IntRange intRange, Integer num) {
        Intrinsics.checkNotNullParameter(intRange, "<this>");
        return num != null && intRange.t(num.intValue());
    }

    @e1(version = "1.7")
    @Nullable
    public static final Integer T0(@NotNull j jVar) {
        Intrinsics.checkNotNullParameter(jVar, "<this>");
        if (jVar.isEmpty()) {
            return null;
        }
        return Integer.valueOf(jVar.m());
    }

    @NotNull
    public static final IntRange T1(byte b10, int i10) {
        return i10 <= Integer.MIN_VALUE ? IntRange.f312907e.a() : new IntRange(b10, i10 - 1);
    }

    @kotlin.internal.f
    private static final boolean U(IntRange intRange, short s10) {
        Intrinsics.checkNotNullParameter(intRange, "<this>");
        return L0(intRange, s10);
    }

    @e1(version = "1.7")
    @Nullable
    public static final Long U0(@NotNull l lVar) {
        Intrinsics.checkNotNullParameter(lVar, "<this>");
        if (lVar.isEmpty()) {
            return null;
        }
        return Long.valueOf(lVar.m());
    }

    @NotNull
    public static final IntRange U1(byte b10, short s10) {
        return new IntRange(b10, s10 - 1);
    }

    @kotlin.internal.f
    private static final boolean V(n nVar, byte b10) {
        Intrinsics.checkNotNullParameter(nVar, "<this>");
        return V0(nVar, b10);
    }

    @oj.i(name = "longRangeContains")
    public static final boolean V0(@NotNull g<Long> gVar, byte b10) {
        Intrinsics.checkNotNullParameter(gVar, "<this>");
        return gVar.c(Long.valueOf(b10));
    }

    @NotNull
    public static final IntRange V1(int i10, byte b10) {
        return new IntRange(i10, b10 - 1);
    }

    @kotlin.internal.f
    private static final boolean W(n nVar, int i10) {
        Intrinsics.checkNotNullParameter(nVar, "<this>");
        return Y0(nVar, i10);
    }

    @kotlin.l(message = "This `contains` operation mixing integer and floating point arguments has ambiguous semantics and is going to be removed.")
    @kotlin.m(errorSince = "1.4", hiddenSince = "1.5", warningSince = "1.3")
    @oj.i(name = "longRangeContains")
    public static final /* synthetic */ boolean W0(g gVar, double d10) {
        Intrinsics.checkNotNullParameter(gVar, "<this>");
        Long lL1 = L1(d10);
        if (lL1 != null) {
            return gVar.c(lL1);
        }
        return false;
    }

    @NotNull
    public static IntRange W1(int i10, int i11) {
        return i11 <= Integer.MIN_VALUE ? IntRange.f312907e.a() : new IntRange(i10, i11 - 1);
    }

    @e1(version = "1.3")
    @kotlin.internal.f
    private static final boolean X(n nVar, Long l10) {
        Intrinsics.checkNotNullParameter(nVar, "<this>");
        return l10 != null && nVar.t(l10.longValue());
    }

    @kotlin.l(message = "This `contains` operation mixing integer and floating point arguments has ambiguous semantics and is going to be removed.")
    @kotlin.m(errorSince = "1.4", hiddenSince = "1.5", warningSince = "1.3")
    @oj.i(name = "longRangeContains")
    public static final /* synthetic */ boolean X0(g gVar, float f10) {
        Intrinsics.checkNotNullParameter(gVar, "<this>");
        Long lM1 = M1(f10);
        if (lM1 != null) {
            return gVar.c(lM1);
        }
        return false;
    }

    @NotNull
    public static final IntRange X1(int i10, short s10) {
        return new IntRange(i10, s10 - 1);
    }

    @kotlin.internal.f
    private static final boolean Y(n nVar, short s10) {
        Intrinsics.checkNotNullParameter(nVar, "<this>");
        return Z0(nVar, s10);
    }

    @oj.i(name = "longRangeContains")
    public static final boolean Y0(@NotNull g<Long> gVar, int i10) {
        Intrinsics.checkNotNullParameter(gVar, "<this>");
        return gVar.c(Long.valueOf(i10));
    }

    @NotNull
    public static final IntRange Y1(short s10, byte b10) {
        return new IntRange(s10, b10 - 1);
    }

    @kotlin.l(message = "This `contains` operation mixing integer and floating point arguments has ambiguous semantics and is going to be removed.")
    @kotlin.m(errorSince = "1.4", hiddenSince = "1.5", warningSince = "1.3")
    @oj.i(name = "doubleRangeContains")
    public static final /* synthetic */ boolean Z(g gVar, byte b10) {
        Intrinsics.checkNotNullParameter(gVar, "<this>");
        return gVar.c(Double.valueOf(b10));
    }

    @oj.i(name = "longRangeContains")
    public static final boolean Z0(@NotNull g<Long> gVar, short s10) {
        Intrinsics.checkNotNullParameter(gVar, "<this>");
        return gVar.c(Long.valueOf(s10));
    }

    @NotNull
    public static final IntRange Z1(short s10, int i10) {
        return i10 <= Integer.MIN_VALUE ? IntRange.f312907e.a() : new IntRange(s10, i10 - 1);
    }

    @oj.i(name = "doubleRangeContains")
    public static final boolean a0(@NotNull g<Double> gVar, float f10) {
        Intrinsics.checkNotNullParameter(gVar, "<this>");
        return gVar.c(Double.valueOf(f10));
    }

    @m2(markerClass = {kotlin.s.class})
    @e1(version = "1.9")
    @oj.i(name = "longRangeContains")
    public static final boolean a1(@NotNull q<Long> qVar, byte b10) {
        Intrinsics.checkNotNullParameter(qVar, "<this>");
        return qVar.c(Long.valueOf(b10));
    }

    @NotNull
    public static final IntRange a2(short s10, short s11) {
        return new IntRange(s10, s11 - 1);
    }

    @kotlin.l(message = "This `contains` operation mixing integer and floating point arguments has ambiguous semantics and is going to be removed.")
    @kotlin.m(errorSince = "1.4", hiddenSince = "1.5", warningSince = "1.3")
    @oj.i(name = "doubleRangeContains")
    public static final /* synthetic */ boolean b0(g gVar, int i10) {
        Intrinsics.checkNotNullParameter(gVar, "<this>");
        return gVar.c(Double.valueOf(i10));
    }

    @m2(markerClass = {kotlin.s.class})
    @e1(version = "1.9")
    @oj.i(name = "longRangeContains")
    public static final boolean b1(@NotNull q<Long> qVar, int i10) {
        Intrinsics.checkNotNullParameter(qVar, "<this>");
        return qVar.c(Long.valueOf(i10));
    }

    @NotNull
    public static final n b2(byte b10, long j10) {
        return j10 <= Long.MIN_VALUE ? n.f312943e.a() : new n(b10, j10 - 1);
    }

    @kotlin.l(message = "This `contains` operation mixing integer and floating point arguments has ambiguous semantics and is going to be removed.")
    @kotlin.m(errorSince = "1.4", hiddenSince = "1.5", warningSince = "1.3")
    @oj.i(name = "doubleRangeContains")
    public static final /* synthetic */ boolean c0(g gVar, long j10) {
        Intrinsics.checkNotNullParameter(gVar, "<this>");
        return gVar.c(Double.valueOf(j10));
    }

    @m2(markerClass = {kotlin.s.class})
    @e1(version = "1.9")
    @oj.i(name = "longRangeContains")
    public static final boolean c1(@NotNull q<Long> qVar, short s10) {
        Intrinsics.checkNotNullParameter(qVar, "<this>");
        return qVar.c(Long.valueOf(s10));
    }

    @NotNull
    public static final n c2(int i10, long j10) {
        return j10 <= Long.MIN_VALUE ? n.f312943e.a() : new n(i10, j10 - 1);
    }

    @kotlin.l(message = "This `contains` operation mixing integer and floating point arguments has ambiguous semantics and is going to be removed.")
    @kotlin.m(errorSince = "1.4", hiddenSince = "1.5", warningSince = "1.3")
    @oj.i(name = "doubleRangeContains")
    public static final /* synthetic */ boolean d0(g gVar, short s10) {
        Intrinsics.checkNotNullParameter(gVar, "<this>");
        return gVar.c(Double.valueOf(s10));
    }

    @e1(version = "1.3")
    @kotlin.internal.f
    private static final char d1(c cVar) {
        Intrinsics.checkNotNullParameter(cVar, "<this>");
        return e1(cVar, kotlin.random.f.f312895a);
    }

    @NotNull
    public static final n d2(long j10, byte b10) {
        return new n(j10, ((long) b10) - 1);
    }

    @m2(markerClass = {kotlin.s.class})
    @e1(version = "1.9")
    @oj.i(name = "doubleRangeContains")
    public static final boolean e0(@NotNull q<Double> qVar, float f10) {
        Intrinsics.checkNotNullParameter(qVar, "<this>");
        return qVar.c(Double.valueOf(f10));
    }

    @e1(version = "1.3")
    public static final char e1(@NotNull c cVar, @NotNull kotlin.random.f random) {
        Intrinsics.checkNotNullParameter(cVar, "<this>");
        Intrinsics.checkNotNullParameter(random, "random");
        try {
            return (char) random.n(cVar.l(), cVar.m() + 1);
        } catch (IllegalArgumentException e10) {
            throw new NoSuchElementException(e10.getMessage());
        }
    }

    @NotNull
    public static final n e2(long j10, int i10) {
        return new n(j10, ((long) i10) - 1);
    }

    @NotNull
    public static final a f0(char c10, char c11) {
        return a.f312909d.a(c10, c11, -1);
    }

    @e1(version = "1.3")
    @kotlin.internal.f
    private static final int f1(IntRange intRange) {
        Intrinsics.checkNotNullParameter(intRange, "<this>");
        return g1(intRange, kotlin.random.f.f312895a);
    }

    @NotNull
    public static n f2(long j10, long j11) {
        return j11 <= Long.MIN_VALUE ? n.f312943e.a() : new n(j10, j11 - 1);
    }

    @NotNull
    public static final j g0(byte b10, byte b11) {
        return j.f312927d.a(b10, b11, -1);
    }

    @e1(version = "1.3")
    public static int g1(@NotNull IntRange intRange, @NotNull kotlin.random.f random) {
        Intrinsics.checkNotNullParameter(intRange, "<this>");
        Intrinsics.checkNotNullParameter(random, "random");
        try {
            return kotlin.random.g.h(random, intRange);
        } catch (IllegalArgumentException e10) {
            throw new NoSuchElementException(e10.getMessage());
        }
    }

    @NotNull
    public static final n g2(long j10, short s10) {
        return new n(j10, ((long) s10) - 1);
    }

    @NotNull
    public static final j h0(byte b10, int i10) {
        return j.f312927d.a(b10, i10, -1);
    }

    @e1(version = "1.3")
    @kotlin.internal.f
    private static final long h1(n nVar) {
        Intrinsics.checkNotNullParameter(nVar, "<this>");
        return i1(nVar, kotlin.random.f.f312895a);
    }

    @NotNull
    public static final n h2(short s10, long j10) {
        return j10 <= Long.MIN_VALUE ? n.f312943e.a() : new n(s10, j10 - 1);
    }

    @NotNull
    public static final j i0(byte b10, short s10) {
        return j.f312927d.a(b10, s10, -1);
    }

    @e1(version = "1.3")
    public static final long i1(@NotNull n nVar, @NotNull kotlin.random.f random) {
        Intrinsics.checkNotNullParameter(nVar, "<this>");
        Intrinsics.checkNotNullParameter(random, "random");
        try {
            return kotlin.random.g.i(random, nVar);
        } catch (IllegalArgumentException e10) {
            throw new NoSuchElementException(e10.getMessage());
        }
    }

    @kotlin.l(message = "This `contains` operation mixing integer and floating point arguments has ambiguous semantics and is going to be removed.")
    @kotlin.m(errorSince = "1.4", hiddenSince = "1.5", warningSince = "1.3")
    @oj.i(name = "byteRangeContains")
    public static final /* synthetic */ boolean j(g gVar, double d10) {
        Intrinsics.checkNotNullParameter(gVar, "<this>");
        Byte bD1 = D1(d10);
        if (bD1 != null) {
            return gVar.c(bD1);
        }
        return false;
    }

    @NotNull
    public static final j j0(int i10, byte b10) {
        return j.f312927d.a(i10, b10, -1);
    }

    @e1(version = "1.4")
    @kotlin.internal.f
    private static final Character j1(c cVar) {
        Intrinsics.checkNotNullParameter(cVar, "<this>");
        return k1(cVar, kotlin.random.f.f312895a);
    }

    @kotlin.l(message = "This `contains` operation mixing integer and floating point arguments has ambiguous semantics and is going to be removed.")
    @kotlin.m(errorSince = "1.4", hiddenSince = "1.5", warningSince = "1.3")
    @oj.i(name = "byteRangeContains")
    public static final /* synthetic */ boolean k(g gVar, float f10) {
        Intrinsics.checkNotNullParameter(gVar, "<this>");
        Byte bE1 = E1(f10);
        if (bE1 != null) {
            return gVar.c(bE1);
        }
        return false;
    }

    @NotNull
    public static j k0(int i10, int i11) {
        return j.f312927d.a(i10, i11, -1);
    }

    @e1(version = "1.4")
    @Nullable
    public static final Character k1(@NotNull c cVar, @NotNull kotlin.random.f random) {
        Intrinsics.checkNotNullParameter(cVar, "<this>");
        Intrinsics.checkNotNullParameter(random, "random");
        if (cVar.isEmpty()) {
            return null;
        }
        return Character.valueOf((char) random.n(cVar.l(), cVar.m() + 1));
    }

    @oj.i(name = "byteRangeContains")
    public static final boolean l(@NotNull g<Byte> gVar, int i10) {
        Intrinsics.checkNotNullParameter(gVar, "<this>");
        Byte bF1 = F1(i10);
        if (bF1 != null) {
            return gVar.c(bF1);
        }
        return false;
    }

    @NotNull
    public static final j l0(int i10, short s10) {
        return j.f312927d.a(i10, s10, -1);
    }

    @e1(version = "1.4")
    @kotlin.internal.f
    private static final Integer l1(IntRange intRange) {
        Intrinsics.checkNotNullParameter(intRange, "<this>");
        return m1(intRange, kotlin.random.f.f312895a);
    }

    @oj.i(name = "byteRangeContains")
    public static final boolean m(@NotNull g<Byte> gVar, long j10) {
        Intrinsics.checkNotNullParameter(gVar, "<this>");
        Byte bG1 = G1(j10);
        if (bG1 != null) {
            return gVar.c(bG1);
        }
        return false;
    }

    @NotNull
    public static final j m0(short s10, byte b10) {
        return j.f312927d.a(s10, b10, -1);
    }

    @e1(version = "1.4")
    @Nullable
    public static final Integer m1(@NotNull IntRange intRange, @NotNull kotlin.random.f random) {
        Intrinsics.checkNotNullParameter(intRange, "<this>");
        Intrinsics.checkNotNullParameter(random, "random");
        if (intRange.isEmpty()) {
            return null;
        }
        return Integer.valueOf(kotlin.random.g.h(random, intRange));
    }

    @oj.i(name = "byteRangeContains")
    public static final boolean n(@NotNull g<Byte> gVar, short s10) {
        Intrinsics.checkNotNullParameter(gVar, "<this>");
        Byte bH1 = H1(s10);
        if (bH1 != null) {
            return gVar.c(bH1);
        }
        return false;
    }

    @NotNull
    public static final j n0(short s10, int i10) {
        return j.f312927d.a(s10, i10, -1);
    }

    @e1(version = "1.4")
    @kotlin.internal.f
    private static final Long n1(n nVar) {
        Intrinsics.checkNotNullParameter(nVar, "<this>");
        return o1(nVar, kotlin.random.f.f312895a);
    }

    @m2(markerClass = {kotlin.s.class})
    @e1(version = "1.9")
    @oj.i(name = "byteRangeContains")
    public static final boolean o(@NotNull q<Byte> qVar, int i10) {
        Intrinsics.checkNotNullParameter(qVar, "<this>");
        Byte bF1 = F1(i10);
        if (bF1 != null) {
            return qVar.c(bF1);
        }
        return false;
    }

    @NotNull
    public static final j o0(short s10, short s11) {
        return j.f312927d.a(s10, s11, -1);
    }

    @e1(version = "1.4")
    @Nullable
    public static final Long o1(@NotNull n nVar, @NotNull kotlin.random.f random) {
        Intrinsics.checkNotNullParameter(nVar, "<this>");
        Intrinsics.checkNotNullParameter(random, "random");
        if (nVar.isEmpty()) {
            return null;
        }
        return Long.valueOf(kotlin.random.g.i(random, nVar));
    }

    @m2(markerClass = {kotlin.s.class})
    @e1(version = "1.9")
    @oj.i(name = "byteRangeContains")
    public static final boolean p(@NotNull q<Byte> qVar, long j10) {
        Intrinsics.checkNotNullParameter(qVar, "<this>");
        Byte bG1 = G1(j10);
        if (bG1 != null) {
            return qVar.c(bG1);
        }
        return false;
    }

    @NotNull
    public static final l p0(byte b10, long j10) {
        return l.f312935d.a(b10, j10, -1L);
    }

    @NotNull
    public static final a p1(@NotNull a aVar) {
        Intrinsics.checkNotNullParameter(aVar, "<this>");
        return a.f312909d.a(aVar.m(), aVar.l(), -aVar.n());
    }

    @m2(markerClass = {kotlin.s.class})
    @e1(version = "1.9")
    @oj.i(name = "byteRangeContains")
    public static final boolean q(@NotNull q<Byte> qVar, short s10) {
        Intrinsics.checkNotNullParameter(qVar, "<this>");
        Byte bH1 = H1(s10);
        if (bH1 != null) {
            return qVar.c(bH1);
        }
        return false;
    }

    @NotNull
    public static final l q0(int i10, long j10) {
        return l.f312935d.a(i10, j10, -1L);
    }

    @NotNull
    public static j q1(@NotNull j jVar) {
        Intrinsics.checkNotNullParameter(jVar, "<this>");
        return j.f312927d.a(jVar.m(), jVar.l(), -jVar.n());
    }

    public static final byte r(byte b10, byte b11) {
        return b10 < b11 ? b11 : b10;
    }

    @NotNull
    public static final l r0(long j10, byte b10) {
        return l.f312935d.a(j10, b10, -1L);
    }

    @NotNull
    public static final l r1(@NotNull l lVar) {
        Intrinsics.checkNotNullParameter(lVar, "<this>");
        return l.f312935d.a(lVar.m(), lVar.l(), -lVar.n());
    }

    public static double s(double d10, double d11) {
        return d10 < d11 ? d11 : d10;
    }

    @NotNull
    public static final l s0(long j10, int i10) {
        return l.f312935d.a(j10, i10, -1L);
    }

    @oj.i(name = "shortRangeContains")
    public static final boolean s1(@NotNull g<Short> gVar, byte b10) {
        Intrinsics.checkNotNullParameter(gVar, "<this>");
        return gVar.c(Short.valueOf(b10));
    }

    public static float t(float f10, float f11) {
        return f10 < f11 ? f11 : f10;
    }

    @NotNull
    public static final l t0(long j10, long j11) {
        return l.f312935d.a(j10, j11, -1L);
    }

    @kotlin.l(message = "This `contains` operation mixing integer and floating point arguments has ambiguous semantics and is going to be removed.")
    @kotlin.m(errorSince = "1.4", hiddenSince = "1.5", warningSince = "1.3")
    @oj.i(name = "shortRangeContains")
    public static final /* synthetic */ boolean t1(g gVar, double d10) {
        Intrinsics.checkNotNullParameter(gVar, "<this>");
        Short shN1 = N1(d10);
        if (shN1 != null) {
            return gVar.c(shN1);
        }
        return false;
    }

    public static int u(int i10, int i11) {
        return i10 < i11 ? i11 : i10;
    }

    @NotNull
    public static final l u0(long j10, short s10) {
        return l.f312935d.a(j10, s10, -1L);
    }

    @kotlin.l(message = "This `contains` operation mixing integer and floating point arguments has ambiguous semantics and is going to be removed.")
    @kotlin.m(errorSince = "1.4", hiddenSince = "1.5", warningSince = "1.3")
    @oj.i(name = "shortRangeContains")
    public static final /* synthetic */ boolean u1(g gVar, float f10) {
        Intrinsics.checkNotNullParameter(gVar, "<this>");
        Short shO1 = O1(f10);
        if (shO1 != null) {
            return gVar.c(shO1);
        }
        return false;
    }

    public static long v(long j10, long j11) {
        return j10 < j11 ? j11 : j10;
    }

    @NotNull
    public static final l v0(short s10, long j10) {
        return l.f312935d.a(s10, j10, -1L);
    }

    @oj.i(name = "shortRangeContains")
    public static final boolean v1(@NotNull g<Short> gVar, int i10) {
        Intrinsics.checkNotNullParameter(gVar, "<this>");
        Short shP1 = P1(i10);
        if (shP1 != null) {
            return gVar.c(shP1);
        }
        return false;
    }

    @NotNull
    public static <T extends Comparable<? super T>> T w(@NotNull T t10, @NotNull T minimumValue) {
        Intrinsics.checkNotNullParameter(t10, "<this>");
        Intrinsics.checkNotNullParameter(minimumValue, "minimumValue");
        return t10.compareTo(minimumValue) < 0 ? minimumValue : t10;
    }

    @e1(version = "1.7")
    public static final char w0(@NotNull a aVar) {
        Intrinsics.checkNotNullParameter(aVar, "<this>");
        if (!aVar.isEmpty()) {
            return aVar.l();
        }
        throw new NoSuchElementException("Progression " + aVar + " is empty.");
    }

    @oj.i(name = "shortRangeContains")
    public static final boolean w1(@NotNull g<Short> gVar, long j10) {
        Intrinsics.checkNotNullParameter(gVar, "<this>");
        Short shQ1 = Q1(j10);
        if (shQ1 != null) {
            return gVar.c(shQ1);
        }
        return false;
    }

    public static final short x(short s10, short s11) {
        return s10 < s11 ? s11 : s10;
    }

    @e1(version = "1.7")
    public static final int x0(@NotNull j jVar) {
        Intrinsics.checkNotNullParameter(jVar, "<this>");
        if (!jVar.isEmpty()) {
            return jVar.l();
        }
        throw new NoSuchElementException("Progression " + jVar + " is empty.");
    }

    @m2(markerClass = {kotlin.s.class})
    @e1(version = "1.9")
    @oj.i(name = "shortRangeContains")
    public static final boolean x1(@NotNull q<Short> qVar, byte b10) {
        Intrinsics.checkNotNullParameter(qVar, "<this>");
        return qVar.c(Short.valueOf(b10));
    }

    public static final byte y(byte b10, byte b11) {
        return b10 > b11 ? b11 : b10;
    }

    @e1(version = "1.7")
    public static final long y0(@NotNull l lVar) {
        Intrinsics.checkNotNullParameter(lVar, "<this>");
        if (!lVar.isEmpty()) {
            return lVar.l();
        }
        throw new NoSuchElementException("Progression " + lVar + " is empty.");
    }

    @m2(markerClass = {kotlin.s.class})
    @e1(version = "1.9")
    @oj.i(name = "shortRangeContains")
    public static final boolean y1(@NotNull q<Short> qVar, int i10) {
        Intrinsics.checkNotNullParameter(qVar, "<this>");
        Short shP1 = P1(i10);
        if (shP1 != null) {
            return qVar.c(shP1);
        }
        return false;
    }

    public static double z(double d10, double d11) {
        return d10 > d11 ? d11 : d10;
    }

    @e1(version = "1.7")
    @Nullable
    public static final Character z0(@NotNull a aVar) {
        Intrinsics.checkNotNullParameter(aVar, "<this>");
        if (aVar.isEmpty()) {
            return null;
        }
        return Character.valueOf(aVar.l());
    }

    @m2(markerClass = {kotlin.s.class})
    @e1(version = "1.9")
    @oj.i(name = "shortRangeContains")
    public static final boolean z1(@NotNull q<Short> qVar, long j10) {
        Intrinsics.checkNotNullParameter(qVar, "<this>");
        Short shQ1 = Q1(j10);
        if (shQ1 != null) {
            return qVar.c(shQ1);
        }
        return false;
    }
}
