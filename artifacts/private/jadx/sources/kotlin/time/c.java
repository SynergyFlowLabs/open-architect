package kotlin.time;

import androidx.collection.g3;
import kotlin.a1;
import kotlin.b1;
import kotlin.e1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.m2;
import kotlin.ranges.r;
import kotlin.text.StringsKt;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes11.dex */
@oj.g
@m2(markerClass = {j.class})
@e1(version = "1.6")
@SourceDebugExtension({"SMAP\nDuration.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Duration.kt\nkotlin/time/Duration\n+ 2 _Strings.kt\nkotlin/text/StringsKt___StringsKt\n+ 3 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,1494:1\n38#1:1495\n38#1:1496\n38#1:1497\n38#1:1498\n38#1:1499\n683#1,2:1500\n700#1,2:1509\n170#2,6:1502\n1#3:1508\n*S KotlinDebug\n*F\n+ 1 Duration.kt\nkotlin/time/Duration\n*L\n39#1:1495\n40#1:1496\n458#1:1497\n478#1:1498\n662#1:1499\n979#1:1500,2\n1070#1:1509,2\n1021#1:1502,6\n*E\n"})
public final class c implements Comparable<c> {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NotNull
    public static final a f313406b = new a(null);

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static final long f313407c = t(0);

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private static final long f313408d = e.j(4611686018427387903L);

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private static final long f313409e = e.j(-4611686018427387903L);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final long f313410a;

    public static final class a {
        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @kotlin.internal.f
        public static /* synthetic */ void A(double d10) {
        }

        @kotlin.internal.f
        public static /* synthetic */ void B(int i10) {
        }

        @kotlin.internal.f
        public static /* synthetic */ void C(long j10) {
        }

        private final long D(double d10) {
            return e.l0(d10, f.MINUTES);
        }

        private final long E(int i10) {
            return e.m0(i10, f.MINUTES);
        }

        private final long F(long j10) {
            return e.n0(j10, f.MINUTES);
        }

        @kotlin.internal.f
        public static /* synthetic */ void G(double d10) {
        }

        @kotlin.internal.f
        public static /* synthetic */ void H(int i10) {
        }

        @kotlin.internal.f
        public static /* synthetic */ void I(long j10) {
        }

        private final long K(double d10) {
            return e.l0(d10, f.NANOSECONDS);
        }

        private final long L(int i10) {
            return e.m0(i10, f.NANOSECONDS);
        }

        private final long M(long j10) {
            return e.n0(j10, f.NANOSECONDS);
        }

        @kotlin.internal.f
        public static /* synthetic */ void N(double d10) {
        }

        @kotlin.internal.f
        public static /* synthetic */ void O(int i10) {
        }

        @kotlin.internal.f
        public static /* synthetic */ void P(long j10) {
        }

        private final long Q(double d10) {
            return e.l0(d10, f.SECONDS);
        }

        private final long R(int i10) {
            return e.m0(i10, f.SECONDS);
        }

        private final long S(long j10) {
            return e.n0(j10, f.SECONDS);
        }

        @kotlin.internal.f
        public static /* synthetic */ void T(double d10) {
        }

        @kotlin.internal.f
        public static /* synthetic */ void U(int i10) {
        }

        @kotlin.internal.f
        public static /* synthetic */ void V(long j10) {
        }

        private final long e(double d10) {
            return e.l0(d10, f.DAYS);
        }

        private final long f(int i10) {
            return e.m0(i10, f.DAYS);
        }

        private final long g(long j10) {
            return e.n0(j10, f.DAYS);
        }

        @kotlin.internal.f
        public static /* synthetic */ void h(double d10) {
        }

        @kotlin.internal.f
        public static /* synthetic */ void i(int i10) {
        }

        @kotlin.internal.f
        public static /* synthetic */ void j(long j10) {
        }

        private final long k(double d10) {
            return e.l0(d10, f.HOURS);
        }

        private final long l(int i10) {
            return e.m0(i10, f.HOURS);
        }

        private final long m(long j10) {
            return e.n0(j10, f.HOURS);
        }

        @kotlin.internal.f
        public static /* synthetic */ void n(double d10) {
        }

        @kotlin.internal.f
        public static /* synthetic */ void o(int i10) {
        }

        @kotlin.internal.f
        public static /* synthetic */ void p(long j10) {
        }

        private final long r(double d10) {
            return e.l0(d10, f.MICROSECONDS);
        }

        private final long s(int i10) {
            return e.m0(i10, f.MICROSECONDS);
        }

        private final long t(long j10) {
            return e.n0(j10, f.MICROSECONDS);
        }

        @kotlin.internal.f
        public static /* synthetic */ void u(double d10) {
        }

        @kotlin.internal.f
        public static /* synthetic */ void v(int i10) {
        }

        @kotlin.internal.f
        public static /* synthetic */ void w(long j10) {
        }

        private final long x(double d10) {
            return e.l0(d10, f.MILLISECONDS);
        }

        private final long y(int i10) {
            return e.m0(i10, f.MILLISECONDS);
        }

        private final long z(long j10) {
            return e.n0(j10, f.MILLISECONDS);
        }

        public final long J() {
            return c.f313409e;
        }

        public final long W() {
            return c.f313407c;
        }

        @kotlin.l(message = "Use 'Double.hours' extension property from Duration.Companion instead.", replaceWith = @b1(expression = "value.hours", imports = {"kotlin.time.Duration.Companion.hours"}))
        @e1(version = "1.5")
        @kotlin.m(errorSince = "1.8", hiddenSince = "1.9", warningSince = "1.6")
        @j
        public final /* synthetic */ long X(double d10) {
            return e.l0(d10, f.HOURS);
        }

        @kotlin.l(message = "Use 'Int.hours' extension property from Duration.Companion instead.", replaceWith = @b1(expression = "value.hours", imports = {"kotlin.time.Duration.Companion.hours"}))
        @e1(version = "1.5")
        @kotlin.m(errorSince = "1.8", hiddenSince = "1.9", warningSince = "1.6")
        @j
        public final /* synthetic */ long Y(int i10) {
            return e.m0(i10, f.HOURS);
        }

        @kotlin.l(message = "Use 'Long.hours' extension property from Duration.Companion instead.", replaceWith = @b1(expression = "value.hours", imports = {"kotlin.time.Duration.Companion.hours"}))
        @e1(version = "1.5")
        @kotlin.m(errorSince = "1.8", hiddenSince = "1.9", warningSince = "1.6")
        @j
        public final /* synthetic */ long Z(long j10) {
            return e.n0(j10, f.HOURS);
        }

        @j
        public final double a(double d10, @NotNull f sourceUnit, @NotNull f targetUnit) {
            Intrinsics.checkNotNullParameter(sourceUnit, "sourceUnit");
            Intrinsics.checkNotNullParameter(targetUnit, "targetUnit");
            return h.a(d10, sourceUnit, targetUnit);
        }

        @kotlin.l(message = "Use 'Double.microseconds' extension property from Duration.Companion instead.", replaceWith = @b1(expression = "value.microseconds", imports = {"kotlin.time.Duration.Companion.microseconds"}))
        @e1(version = "1.5")
        @kotlin.m(errorSince = "1.8", hiddenSince = "1.9", warningSince = "1.6")
        @j
        public final /* synthetic */ long a0(double d10) {
            return e.l0(d10, f.MICROSECONDS);
        }

        @kotlin.l(message = "Use 'Double.days' extension property from Duration.Companion instead.", replaceWith = @b1(expression = "value.days", imports = {"kotlin.time.Duration.Companion.days"}))
        @e1(version = "1.5")
        @kotlin.m(errorSince = "1.8", hiddenSince = "1.9", warningSince = "1.6")
        @j
        public final /* synthetic */ long b(double d10) {
            return e.l0(d10, f.DAYS);
        }

        @kotlin.l(message = "Use 'Int.microseconds' extension property from Duration.Companion instead.", replaceWith = @b1(expression = "value.microseconds", imports = {"kotlin.time.Duration.Companion.microseconds"}))
        @e1(version = "1.5")
        @kotlin.m(errorSince = "1.8", hiddenSince = "1.9", warningSince = "1.6")
        @j
        public final /* synthetic */ long b0(int i10) {
            return e.m0(i10, f.MICROSECONDS);
        }

        @kotlin.l(message = "Use 'Int.days' extension property from Duration.Companion instead.", replaceWith = @b1(expression = "value.days", imports = {"kotlin.time.Duration.Companion.days"}))
        @e1(version = "1.5")
        @kotlin.m(errorSince = "1.8", hiddenSince = "1.9", warningSince = "1.6")
        @j
        public final /* synthetic */ long c(int i10) {
            return e.m0(i10, f.DAYS);
        }

        @kotlin.l(message = "Use 'Long.microseconds' extension property from Duration.Companion instead.", replaceWith = @b1(expression = "value.microseconds", imports = {"kotlin.time.Duration.Companion.microseconds"}))
        @e1(version = "1.5")
        @kotlin.m(errorSince = "1.8", hiddenSince = "1.9", warningSince = "1.6")
        @j
        public final /* synthetic */ long c0(long j10) {
            return e.n0(j10, f.MICROSECONDS);
        }

        @kotlin.l(message = "Use 'Long.days' extension property from Duration.Companion instead.", replaceWith = @b1(expression = "value.days", imports = {"kotlin.time.Duration.Companion.days"}))
        @e1(version = "1.5")
        @kotlin.m(errorSince = "1.8", hiddenSince = "1.9", warningSince = "1.6")
        @j
        public final /* synthetic */ long d(long j10) {
            return e.n0(j10, f.DAYS);
        }

        @kotlin.l(message = "Use 'Double.milliseconds' extension property from Duration.Companion instead.", replaceWith = @b1(expression = "value.milliseconds", imports = {"kotlin.time.Duration.Companion.milliseconds"}))
        @e1(version = "1.5")
        @kotlin.m(errorSince = "1.8", hiddenSince = "1.9", warningSince = "1.6")
        @j
        public final /* synthetic */ long d0(double d10) {
            return e.l0(d10, f.MILLISECONDS);
        }

        @kotlin.l(message = "Use 'Int.milliseconds' extension property from Duration.Companion instead.", replaceWith = @b1(expression = "value.milliseconds", imports = {"kotlin.time.Duration.Companion.milliseconds"}))
        @e1(version = "1.5")
        @kotlin.m(errorSince = "1.8", hiddenSince = "1.9", warningSince = "1.6")
        @j
        public final /* synthetic */ long e0(int i10) {
            return e.m0(i10, f.MILLISECONDS);
        }

        @kotlin.l(message = "Use 'Long.milliseconds' extension property from Duration.Companion instead.", replaceWith = @b1(expression = "value.milliseconds", imports = {"kotlin.time.Duration.Companion.milliseconds"}))
        @e1(version = "1.5")
        @kotlin.m(errorSince = "1.8", hiddenSince = "1.9", warningSince = "1.6")
        @j
        public final /* synthetic */ long f0(long j10) {
            return e.n0(j10, f.MILLISECONDS);
        }

        @kotlin.l(message = "Use 'Double.minutes' extension property from Duration.Companion instead.", replaceWith = @b1(expression = "value.minutes", imports = {"kotlin.time.Duration.Companion.minutes"}))
        @e1(version = "1.5")
        @kotlin.m(errorSince = "1.8", hiddenSince = "1.9", warningSince = "1.6")
        @j
        public final /* synthetic */ long g0(double d10) {
            return e.l0(d10, f.MINUTES);
        }

        @kotlin.l(message = "Use 'Int.minutes' extension property from Duration.Companion instead.", replaceWith = @b1(expression = "value.minutes", imports = {"kotlin.time.Duration.Companion.minutes"}))
        @e1(version = "1.5")
        @kotlin.m(errorSince = "1.8", hiddenSince = "1.9", warningSince = "1.6")
        @j
        public final /* synthetic */ long h0(int i10) {
            return e.m0(i10, f.MINUTES);
        }

        @kotlin.l(message = "Use 'Long.minutes' extension property from Duration.Companion instead.", replaceWith = @b1(expression = "value.minutes", imports = {"kotlin.time.Duration.Companion.minutes"}))
        @e1(version = "1.5")
        @kotlin.m(errorSince = "1.8", hiddenSince = "1.9", warningSince = "1.6")
        @j
        public final /* synthetic */ long i0(long j10) {
            return e.n0(j10, f.MINUTES);
        }

        @kotlin.l(message = "Use 'Double.nanoseconds' extension property from Duration.Companion instead.", replaceWith = @b1(expression = "value.nanoseconds", imports = {"kotlin.time.Duration.Companion.nanoseconds"}))
        @e1(version = "1.5")
        @kotlin.m(errorSince = "1.8", hiddenSince = "1.9", warningSince = "1.6")
        @j
        public final /* synthetic */ long j0(double d10) {
            return e.l0(d10, f.NANOSECONDS);
        }

        @kotlin.l(message = "Use 'Int.nanoseconds' extension property from Duration.Companion instead.", replaceWith = @b1(expression = "value.nanoseconds", imports = {"kotlin.time.Duration.Companion.nanoseconds"}))
        @e1(version = "1.5")
        @kotlin.m(errorSince = "1.8", hiddenSince = "1.9", warningSince = "1.6")
        @j
        public final /* synthetic */ long k0(int i10) {
            return e.m0(i10, f.NANOSECONDS);
        }

        @kotlin.l(message = "Use 'Long.nanoseconds' extension property from Duration.Companion instead.", replaceWith = @b1(expression = "value.nanoseconds", imports = {"kotlin.time.Duration.Companion.nanoseconds"}))
        @e1(version = "1.5")
        @kotlin.m(errorSince = "1.8", hiddenSince = "1.9", warningSince = "1.6")
        @j
        public final /* synthetic */ long l0(long j10) {
            return e.n0(j10, f.NANOSECONDS);
        }

        public final long m0(@NotNull String value) {
            Intrinsics.checkNotNullParameter(value, "value");
            try {
                return e.f0(value, false);
            } catch (IllegalArgumentException e10) {
                throw new IllegalArgumentException("Invalid duration string format: '" + value + "'.", e10);
            }
        }

        public final long n0(@NotNull String value) {
            Intrinsics.checkNotNullParameter(value, "value");
            try {
                return e.f0(value, true);
            } catch (IllegalArgumentException e10) {
                throw new IllegalArgumentException("Invalid ISO duration string format: '" + value + "'.", e10);
            }
        }

        @Nullable
        public final c o0(@NotNull String value) {
            Intrinsics.checkNotNullParameter(value, "value");
            try {
                return c.q(e.f0(value, true));
            } catch (IllegalArgumentException unused) {
                return null;
            }
        }

        @Nullable
        public final c p0(@NotNull String value) {
            Intrinsics.checkNotNullParameter(value, "value");
            try {
                return c.q(e.f0(value, false));
            } catch (IllegalArgumentException unused) {
                return null;
            }
        }

        public final long q() {
            return c.f313408d;
        }

        @kotlin.l(message = "Use 'Double.seconds' extension property from Duration.Companion instead.", replaceWith = @b1(expression = "value.seconds", imports = {"kotlin.time.Duration.Companion.seconds"}))
        @e1(version = "1.5")
        @kotlin.m(errorSince = "1.8", hiddenSince = "1.9", warningSince = "1.6")
        @j
        public final /* synthetic */ long q0(double d10) {
            return e.l0(d10, f.SECONDS);
        }

        @kotlin.l(message = "Use 'Int.seconds' extension property from Duration.Companion instead.", replaceWith = @b1(expression = "value.seconds", imports = {"kotlin.time.Duration.Companion.seconds"}))
        @e1(version = "1.5")
        @kotlin.m(errorSince = "1.8", hiddenSince = "1.9", warningSince = "1.6")
        @j
        public final /* synthetic */ long r0(int i10) {
            return e.m0(i10, f.SECONDS);
        }

        @kotlin.l(message = "Use 'Long.seconds' extension property from Duration.Companion instead.", replaceWith = @b1(expression = "value.seconds", imports = {"kotlin.time.Duration.Companion.seconds"}))
        @e1(version = "1.5")
        @kotlin.m(errorSince = "1.8", hiddenSince = "1.9", warningSince = "1.6")
        @j
        public final /* synthetic */ long s0(long j10) {
            return e.n0(j10, f.SECONDS);
        }

        private a() {
        }
    }

    private /* synthetic */ c(long j10) {
        this.f313410a = j10;
    }

    public static final long A0(long j10, long j11) {
        if (w0(j10)) {
            if (t0(j11) || (j11 ^ j10) >= 0) {
                return j10;
            }
            throw new IllegalArgumentException("Summing infinite durations of different signs yields an undefined result.");
        }
        if (w0(j11)) {
            return j11;
        }
        if ((((int) j10) & 1) != (((int) j11) & 1)) {
            return u0(j10) ? o(j10, r0(j10), r0(j11)) : o(j10, r0(j11), r0(j10));
        }
        long jR0 = r0(j10) + r0(j11);
        return v0(j10) ? e.m(jR0) : e.k(jR0);
    }

    public static final long B0(long j10, double d10) {
        int iK0 = kotlin.math.b.K0(d10);
        if (iK0 == d10) {
            return C0(j10, iK0);
        }
        f fVarP0 = p0(j10);
        return e.l0(H0(j10, fVarP0) * d10, fVarP0);
    }

    public static final long C0(long j10, int i10) {
        if (w0(j10)) {
            if (i10 != 0) {
                return i10 > 0 ? j10 : R0(j10);
            }
            throw new IllegalArgumentException("Multiplying infinite duration by zero yields an undefined result.");
        }
        if (i10 == 0) {
            return f313407c;
        }
        long jR0 = r0(j10);
        long j11 = i10;
        long j12 = jR0 * j11;
        if (!v0(j10)) {
            if (j12 / j11 == jR0) {
                return e.j(r.L(j12, new kotlin.ranges.n(-4611686018427387903L, 4611686018427387903L)));
            }
            return kotlin.math.b.V(jR0) * kotlin.math.b.U(i10) > 0 ? f313408d : f313409e;
        }
        if (-2147483647L <= jR0 && jR0 < 2147483648L) {
            return e.l(j12);
        }
        if (j12 / j11 == jR0) {
            return e.m(j12);
        }
        long jE0 = e.e0(jR0);
        long j13 = jE0 * j11;
        long jE1 = e.e0((jR0 - e.d0(jE0)) * j11) + j13;
        if (j13 / j11 != jE0 || (jE1 ^ j13) < 0) {
            return kotlin.math.b.V(jR0) * kotlin.math.b.U(i10) > 0 ? f313408d : f313409e;
        }
        return e.j(r.L(jE1, new kotlin.ranges.n(-4611686018427387903L, 4611686018427387903L)));
    }

    public static final boolean D(long j10, long j11) {
        return j10 == j11;
    }

    public static final <T> T D0(long j10, @NotNull Function2<? super Long, ? super Integer, ? extends T> action) {
        Intrinsics.checkNotNullParameter(action, "action");
        return action.invoke(Long.valueOf(i0(j10)), Integer.valueOf(m0(j10)));
    }

    public static final long E(long j10) {
        return x0(j10) ? R0(j10) : j10;
    }

    public static final <T> T E0(long j10, @NotNull pj.n<? super Long, ? super Integer, ? super Integer, ? extends T> action) {
        Intrinsics.checkNotNullParameter(action, "action");
        return action.invoke(Long.valueOf(g0(j10)), Integer.valueOf(o0(j10)), Integer.valueOf(m0(j10)));
    }

    public static final <T> T F0(long j10, @NotNull pj.o<? super Long, ? super Integer, ? super Integer, ? super Integer, ? extends T> action) {
        Intrinsics.checkNotNullParameter(action, "action");
        return action.invoke(Long.valueOf(d0(j10)), Integer.valueOf(k0(j10)), Integer.valueOf(o0(j10)), Integer.valueOf(m0(j10)));
    }

    public static final <T> T G0(long j10, @NotNull pj.p<? super Long, ? super Integer, ? super Integer, ? super Integer, ? super Integer, ? extends T> action) {
        Intrinsics.checkNotNullParameter(action, "action");
        return action.invoke(Long.valueOf(c0(j10)), Integer.valueOf(I(j10)), Integer.valueOf(k0(j10)), Integer.valueOf(o0(j10)), Integer.valueOf(m0(j10)));
    }

    @a1
    public static /* synthetic */ void H() {
    }

    public static final double H0(long j10, @NotNull f unit) {
        Intrinsics.checkNotNullParameter(unit, "unit");
        if (j10 == f313408d) {
            return Double.POSITIVE_INFINITY;
        }
        if (j10 == f313409e) {
            return Double.NEGATIVE_INFINITY;
        }
        return h.a(r0(j10), p0(j10), unit);
    }

    public static final int I(long j10) {
        if (w0(j10)) {
            return 0;
        }
        return (int) (d0(j10) % ((long) 24));
    }

    public static final int I0(long j10, @NotNull f unit) {
        Intrinsics.checkNotNullParameter(unit, "unit");
        return (int) r.K(K0(j10, unit), g3.f12261h, g3.f12256c);
    }

    @NotNull
    public static final String J0(long j10) {
        StringBuilder sb2 = new StringBuilder();
        if (x0(j10)) {
            sb2.append(org.apache.commons.codec.language.l.f335457d);
        }
        sb2.append("PT");
        long jE = E(j10);
        long jD0 = d0(jE);
        int iK0 = k0(jE);
        int iO0 = o0(jE);
        int iM0 = m0(jE);
        long j11 = w0(j10) ? 9999999999999L : jD0;
        boolean z10 = false;
        boolean z11 = j11 != 0;
        boolean z12 = (iO0 == 0 && iM0 == 0) ? false : true;
        if (iK0 != 0 || (z12 && z11)) {
            z10 = true;
        }
        if (z11) {
            sb2.append(j11);
            sb2.append('H');
        }
        if (z10) {
            sb2.append(iK0);
            sb2.append(ni.f.f333370g);
        }
        if (z12 || (!z11 && !z10)) {
            p(j10, sb2, iO0, iM0, 9, androidx.exifinterface.media.a.S4, true);
        }
        String string = sb2.toString();
        Intrinsics.checkNotNullExpressionValue(string, "toString(...)");
        return string;
    }

    public static final long K0(long j10, @NotNull f unit) {
        Intrinsics.checkNotNullParameter(unit, "unit");
        if (j10 == f313408d) {
            return Long.MAX_VALUE;
        }
        if (j10 == f313409e) {
            return Long.MIN_VALUE;
        }
        return h.b(r0(j10), p0(j10), unit);
    }

    @j
    @kotlin.l(message = "Use inWholeDays property instead or convert toDouble(DAYS) if a double value is required.", replaceWith = @b1(expression = "toDouble(DurationUnit.DAYS)", imports = {}))
    @kotlin.m(errorSince = "1.8", hiddenSince = "1.9", warningSince = "1.5")
    public static /* synthetic */ void L() {
    }

    @j
    @kotlin.l(message = "Use inWholeHours property instead or convert toDouble(HOURS) if a double value is required.", replaceWith = @b1(expression = "toDouble(DurationUnit.HOURS)", imports = {}))
    @kotlin.m(errorSince = "1.8", hiddenSince = "1.9", warningSince = "1.5")
    public static /* synthetic */ void N() {
    }

    @NotNull
    public static String N0(long j10) {
        if (j10 == 0) {
            return "0s";
        }
        if (j10 == f313408d) {
            return "Infinity";
        }
        if (j10 == f313409e) {
            return "-Infinity";
        }
        boolean zX0 = x0(j10);
        StringBuilder sb2 = new StringBuilder();
        if (zX0) {
            sb2.append(org.apache.commons.codec.language.l.f335457d);
        }
        long jE = E(j10);
        long jC0 = c0(jE);
        int I = I(jE);
        int iK0 = k0(jE);
        int iO0 = o0(jE);
        int iM0 = m0(jE);
        int i10 = 0;
        boolean z10 = jC0 != 0;
        boolean z11 = I != 0;
        boolean z12 = iK0 != 0;
        boolean z13 = (iO0 == 0 && iM0 == 0) ? false : true;
        if (z10) {
            sb2.append(jC0);
            sb2.append(ni.f.f333369f);
            i10 = 1;
        }
        if (z11 || (z10 && (z12 || z13))) {
            int i11 = i10 + 1;
            if (i10 > 0) {
                sb2.append(' ');
            }
            sb2.append(I);
            sb2.append(ni.f.f333368e);
            i10 = i11;
        }
        if (z12 || (z13 && (z11 || z10))) {
            int i12 = i10 + 1;
            if (i10 > 0) {
                sb2.append(' ');
            }
            sb2.append(iK0);
            sb2.append(ni.f.f333367d);
            i10 = i12;
        }
        if (z13) {
            int i13 = i10 + 1;
            if (i10 > 0) {
                sb2.append(' ');
            }
            if (iO0 != 0 || z10 || z11 || z12) {
                p(j10, sb2, iO0, iM0, 9, "s", false);
            } else if (iM0 >= 1000000) {
                p(j10, sb2, iM0 / 1000000, iM0 % 1000000, 6, "ms", false);
            } else if (iM0 >= 1000) {
                p(j10, sb2, iM0 / 1000, iM0 % 1000, 3, "us", false);
            } else {
                sb2.append(iM0);
                sb2.append("ns");
            }
            i10 = i13;
        }
        if (zX0 && i10 > 1) {
            sb2.insert(1, '(').append(')');
        }
        String string = sb2.toString();
        Intrinsics.checkNotNullExpressionValue(string, "toString(...)");
        return string;
    }

    @NotNull
    public static final String O0(long j10, @NotNull f unit, int i10) {
        Intrinsics.checkNotNullParameter(unit, "unit");
        if (i10 < 0) {
            throw new IllegalArgumentException(("decimals must be not negative, but was " + i10).toString());
        }
        double dH0 = H0(j10, unit);
        if (Double.isInfinite(dH0)) {
            return String.valueOf(dH0);
        }
        return d.b(dH0, r.B(i10, 12)) + i.h(unit);
    }

    public static /* synthetic */ String P0(long j10, f fVar, int i10, int i11, Object obj) {
        if ((i11 & 2) != 0) {
            i10 = 0;
        }
        return O0(j10, fVar, i10);
    }

    public static final long Q0(long j10, @NotNull f unit) {
        Intrinsics.checkNotNullParameter(unit, "unit");
        f fVarP0 = p0(j10);
        if (unit.compareTo(fVarP0) > 0 && !w0(j10)) {
            j10 = e.n0(r0(j10) - (r0(j10) % h.b(1L, unit, fVarP0)), fVarP0);
        }
        return j10;
    }

    @j
    @kotlin.l(message = "Use inWholeMicroseconds property instead or convert toDouble(MICROSECONDS) if a double value is required.", replaceWith = @b1(expression = "toDouble(DurationUnit.MICROSECONDS)", imports = {}))
    @kotlin.m(errorSince = "1.8", hiddenSince = "1.9", warningSince = "1.5")
    public static /* synthetic */ void R() {
    }

    public static final long R0(long j10) {
        return e.i(-r0(j10), ((int) j10) & 1);
    }

    @j
    @kotlin.l(message = "Use inWholeMilliseconds property instead or convert toDouble(MILLISECONDS) if a double value is required.", replaceWith = @b1(expression = "toDouble(DurationUnit.MILLISECONDS)", imports = {}))
    @kotlin.m(errorSince = "1.8", hiddenSince = "1.9", warningSince = "1.5")
    public static /* synthetic */ void T() {
    }

    @j
    @kotlin.l(message = "Use inWholeMinutes property instead or convert toDouble(MINUTES) if a double value is required.", replaceWith = @b1(expression = "toDouble(DurationUnit.MINUTES)", imports = {}))
    @kotlin.m(errorSince = "1.8", hiddenSince = "1.9", warningSince = "1.5")
    public static /* synthetic */ void V() {
    }

    @j
    @kotlin.l(message = "Use inWholeNanoseconds property instead or convert toDouble(NANOSECONDS) if a double value is required.", replaceWith = @b1(expression = "toDouble(DurationUnit.NANOSECONDS)", imports = {}))
    @kotlin.m(errorSince = "1.8", hiddenSince = "1.9", warningSince = "1.5")
    public static /* synthetic */ void X() {
    }

    @j
    @kotlin.l(message = "Use inWholeSeconds property instead or convert toDouble(SECONDS) if a double value is required.", replaceWith = @b1(expression = "toDouble(DurationUnit.SECONDS)", imports = {}))
    @kotlin.m(errorSince = "1.8", hiddenSince = "1.9", warningSince = "1.5")
    public static /* synthetic */ void Z() {
    }

    public static final long c0(long j10) {
        return K0(j10, f.DAYS);
    }

    public static final long d0(long j10) {
        return K0(j10, f.HOURS);
    }

    public static final long e0(long j10) {
        return K0(j10, f.MICROSECONDS);
    }

    public static final long f0(long j10) {
        return (u0(j10) && t0(j10)) ? r0(j10) : K0(j10, f.MILLISECONDS);
    }

    public static final long g0(long j10) {
        return K0(j10, f.MINUTES);
    }

    public static final long h0(long j10) {
        long jR0 = r0(j10);
        if (v0(j10)) {
            return jR0;
        }
        if (jR0 > 9223372036854L) {
            return Long.MAX_VALUE;
        }
        if (jR0 < -9223372036854L) {
            return Long.MIN_VALUE;
        }
        return e.d0(jR0);
    }

    public static final long i0(long j10) {
        return K0(j10, f.SECONDS);
    }

    @a1
    public static /* synthetic */ void j0() {
    }

    public static final int k0(long j10) {
        if (w0(j10)) {
            return 0;
        }
        return (int) (g0(j10) % ((long) 60));
    }

    @a1
    public static /* synthetic */ void l0() {
    }

    public static final int m0(long j10) {
        if (w0(j10)) {
            return 0;
        }
        return (int) (u0(j10) ? e.d0(r0(j10) % ((long) 1000)) : r0(j10) % ((long) 1000000000));
    }

    @a1
    public static /* synthetic */ void n0() {
    }

    private static final long o(long j10, long j11, long j12) {
        long jE0 = e.e0(j12);
        long j13 = j11 + jE0;
        if (-4611686018426L > j13 || j13 >= 4611686018427L) {
            return e.j(r.K(j13, -4611686018427387903L, 4611686018427387903L));
        }
        return e.l(e.d0(j13) + (j12 - e.d0(jE0)));
    }

    public static final int o0(long j10) {
        if (w0(j10)) {
            return 0;
        }
        return (int) (i0(j10) % ((long) 60));
    }

    private static final void p(long j10, StringBuilder sb2, int i10, int i11, int i12, String str, boolean z10) {
        sb2.append(i10);
        if (i11 != 0) {
            sb2.append('.');
            String strU3 = StringsKt.U3(String.valueOf(i11), i12, org.locationtech.jts.geom.l.f338160j);
            int i13 = -1;
            int length = strU3.length() - 1;
            if (length >= 0) {
                while (true) {
                    int i14 = length - 1;
                    if (strU3.charAt(length) != '0') {
                        i13 = length;
                        break;
                    } else if (i14 < 0) {
                        break;
                    } else {
                        length = i14;
                    }
                }
            }
            int i15 = i13 + 1;
            if (z10 || i15 >= 3) {
                sb2.append((CharSequence) strU3, 0, ((i13 + 3) / 3) * 3);
                Intrinsics.checkNotNullExpressionValue(sb2, "append(...)");
            } else {
                sb2.append((CharSequence) strU3, 0, i15);
                Intrinsics.checkNotNullExpressionValue(sb2, "append(...)");
            }
        }
        sb2.append(str);
    }

    private static final f p0(long j10) {
        return v0(j10) ? f.NANOSECONDS : f.MILLISECONDS;
    }

    public static final /* synthetic */ c q(long j10) {
        return new c(j10);
    }

    private static final int q0(long j10) {
        return ((int) j10) & 1;
    }

    private static final long r0(long j10) {
        return j10 >> 1;
    }

    public static int s(long j10, long j11) {
        long j12 = j10 ^ j11;
        if (j12 < 0 || (((int) j12) & 1) == 0) {
            return Intrinsics.compare(j10, j11);
        }
        int i10 = (((int) j10) & 1) - (((int) j11) & 1);
        return x0(j10) ? -i10 : i10;
    }

    public static int s0(long j10) {
        return Long.hashCode(j10);
    }

    public static long t(long j10) {
        if (!d.c()) {
            return j10;
        }
        if (v0(j10)) {
            long jR0 = r0(j10);
            if (-4611686018426999999L <= jR0 && jR0 < 4611686018427000000L) {
                return j10;
            }
            throw new AssertionError(r0(j10) + " ns is out of nanoseconds range");
        }
        long jR1 = r0(j10);
        if (-4611686018427387903L > jR1 || jR1 >= 4611686018427387904L) {
            throw new AssertionError(r0(j10) + " ms is out of milliseconds range");
        }
        long jR2 = r0(j10);
        if (-4611686018426L > jR2 || jR2 >= 4611686018427L) {
            return j10;
        }
        throw new AssertionError(r0(j10) + " ms is denormalized");
    }

    public static final boolean t0(long j10) {
        return !w0(j10);
    }

    private static final boolean u0(long j10) {
        return (((int) j10) & 1) == 1;
    }

    public static final double v(long j10, long j11) {
        f fVar = (f) kotlin.comparisons.a.X(p0(j10), p0(j11));
        return H0(j10, fVar) / H0(j11, fVar);
    }

    private static final boolean v0(long j10) {
        return (((int) j10) & 1) == 0;
    }

    public static final long w(long j10, double d10) {
        int iK0 = kotlin.math.b.K0(d10);
        if (iK0 == d10 && iK0 != 0) {
            return x(j10, iK0);
        }
        f fVarP0 = p0(j10);
        return e.l0(H0(j10, fVarP0) / d10, fVarP0);
    }

    public static final boolean w0(long j10) {
        if (j10 != f313408d && j10 != f313409e) {
            return false;
        }
        return true;
    }

    public static final long x(long j10, int i10) {
        if (i10 == 0) {
            if (y0(j10)) {
                return f313408d;
            }
            if (x0(j10)) {
                return f313409e;
            }
            throw new IllegalArgumentException("Dividing zero duration by zero yields an undefined result.");
        }
        if (v0(j10)) {
            return e.l(r0(j10) / ((long) i10));
        }
        if (w0(j10)) {
            return C0(j10, kotlin.math.b.U(i10));
        }
        long j11 = i10;
        long jR0 = r0(j10) / j11;
        if (-4611686018426L > jR0 || jR0 >= 4611686018427L) {
            return e.j(jR0);
        }
        return e.l(e.d0(jR0) + (e.d0(r0(j10) - (jR0 * j11)) / j11));
    }

    public static final boolean x0(long j10) {
        return j10 < 0;
    }

    public static final boolean y0(long j10) {
        return j10 > 0;
    }

    public static boolean z(long j10, Object obj) {
        return (obj instanceof c) && j10 == ((c) obj).S0();
    }

    public static final long z0(long j10, long j11) {
        return A0(j10, R0(j11));
    }

    public final /* synthetic */ long S0() {
        return this.f313410a;
    }

    @Override // java.lang.Comparable
    public /* bridge */ /* synthetic */ int compareTo(c cVar) {
        return r(cVar.S0());
    }

    public boolean equals(Object obj) {
        return z(this.f313410a, obj);
    }

    public int hashCode() {
        return s0(this.f313410a);
    }

    public int r(long j10) {
        return s(this.f313410a, j10);
    }

    @NotNull
    public String toString() {
        return N0(this.f313410a);
    }
}
