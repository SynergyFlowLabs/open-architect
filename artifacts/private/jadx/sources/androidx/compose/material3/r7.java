package androidx.compose.material3;

import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes.dex */
@androidx.compose.runtime.o2
@SourceDebugExtension({"SMAP\nDatePicker.kt\nKotlin\n*S Kotlin\n*F\n+ 1 DatePicker.kt\nandroidx/compose/material3/DatePickerColors\n+ 2 Color.kt\nandroidx/compose/ui/graphics/ColorKt\n*L\n1#1,2305:1\n646#2:2306\n635#2:2307\n646#2:2308\n635#2:2309\n646#2:2310\n635#2:2311\n646#2:2312\n635#2:2313\n646#2:2314\n635#2:2315\n646#2:2316\n635#2:2317\n646#2:2318\n635#2:2319\n646#2:2320\n635#2:2321\n646#2:2322\n635#2:2323\n646#2:2324\n635#2:2325\n646#2:2326\n635#2:2327\n646#2:2328\n635#2:2329\n646#2:2330\n635#2:2331\n646#2:2332\n635#2:2333\n646#2:2334\n635#2:2335\n646#2:2336\n635#2:2337\n646#2:2338\n635#2:2339\n646#2:2340\n635#2:2341\n646#2:2342\n635#2:2343\n646#2:2344\n635#2:2345\n646#2:2346\n635#2:2347\n646#2:2348\n635#2:2349\n646#2:2350\n635#2:2351\n646#2:2352\n635#2:2353\n*S KotlinDebug\n*F\n+ 1 DatePicker.kt\nandroidx/compose/material3/DatePickerColors\n*L\n895#1:2306\n895#1:2307\n896#1:2308\n896#1:2309\n897#1:2310\n897#1:2311\n898#1:2312\n898#1:2313\n899#1:2314\n899#1:2315\n900#1:2316\n900#1:2317\n901#1:2318\n901#1:2319\n902#1:2320\n902#1:2321\n903#1:2322\n903#1:2323\n904#1:2324\n904#1:2325\n905#1:2326\n905#1:2327\n906#1:2328\n906#1:2329\n907#1:2330\n907#1:2331\n910#1:2332\n910#1:2333\n911#1:2334\n911#1:2335\n912#1:2336\n912#1:2337\n913#1:2338\n913#1:2339\n914#1:2340\n914#1:2341\n915#1:2342\n915#1:2343\n916#1:2344\n916#1:2345\n917#1:2346\n917#1:2347\n918#1:2348\n918#1:2349\n919#1:2350\n919#1:2351\n920#1:2352\n920#1:2353\n*E\n"})
public final class r7 {

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    public static final int f32460z = 0;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final long f32461a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final long f32462b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final long f32463c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final long f32464d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final long f32465e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final long f32466f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private final long f32467g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private final long f32468h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private final long f32469i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private final long f32470j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private final long f32471k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private final long f32472l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private final long f32473m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private final long f32474n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    private final long f32475o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    private final long f32476p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    private final long f32477q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    private final long f32478r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    private final long f32479s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    private final long f32480t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    private final long f32481u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    private final long f32482v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    private final long f32483w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    private final long f32484x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    @NotNull
    private final j40 f32485y;

    public /* synthetic */ r7(long j10, long j11, long j12, long j13, long j14, long j15, long j16, long j17, long j18, long j19, long j20, long j21, long j22, long j23, long j24, long j25, long j26, long j27, long j28, long j29, long j30, long j31, long j32, long j33, j40 j40Var, DefaultConstructorMarker defaultConstructorMarker) {
        this(j10, j11, j12, j13, j14, j15, j16, j17, j18, j19, j20, j21, j22, j23, j24, j25, j26, j27, j28, j29, j30, j31, j32, j33, j40Var);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final j40 d(r7 r7Var) {
        return r7Var.f32485y;
    }

    public final long A() {
        return this.f32462b;
    }

    public final long B() {
        return this.f32480t;
    }

    public final long C() {
        return this.f32481u;
    }

    public final long D() {
        return this.f32464d;
    }

    public final long E() {
        return this.f32467g;
    }

    @NotNull
    public final j40 F(@Nullable j40 j40Var, @NotNull Function0<j40> function0) {
        return j40Var == null ? function0.invoke() : j40Var;
    }

    @androidx.compose.runtime.o
    @NotNull
    public final androidx.compose.runtime.n7<androidx.compose.ui.graphics.q0> G(boolean z10, boolean z11, @Nullable androidx.compose.runtime.c0 c0Var, int i10) {
        long jS;
        if (androidx.compose.runtime.m0.l0()) {
            androidx.compose.runtime.m0.A0(-1306331107, i10, -1, "androidx.compose.material3.DatePickerColors.yearContainerColor (DatePicker.kt:1030)");
        }
        if (z10) {
            jS = z11 ? this.f32472l : this.f32473m;
        } else {
            jS = androidx.compose.ui.graphics.q0.f38131b.s();
        }
        androidx.compose.runtime.n7<androidx.compose.ui.graphics.q0> n7VarC = androidx.compose.animation.e1.c(jS, hm.b(d0.h1.DefaultEffects, c0Var, 6), null, null, c0Var, 0, 12);
        if (androidx.compose.runtime.m0.l0()) {
            androidx.compose.runtime.m0.z0();
        }
        return n7VarC;
    }

    @androidx.compose.runtime.o
    @NotNull
    public final androidx.compose.runtime.n7<androidx.compose.ui.graphics.q0> H(boolean z10, boolean z11, boolean z12, @Nullable androidx.compose.runtime.c0 c0Var, int i10) {
        long j10;
        if (androidx.compose.runtime.m0.l0()) {
            int i11 = 2 | (-1);
            androidx.compose.runtime.m0.A0(874111097, i10, -1, "androidx.compose.material3.DatePickerColors.yearContentColor (DatePicker.kt:1006)");
        }
        if (z11 && z12) {
            j10 = this.f32470j;
        } else if (z11 && !z12) {
            j10 = this.f32471k;
        } else if (z10 && z12) {
            j10 = this.f32469i;
        } else {
            j10 = z12 ? this.f32467g : this.f32468h;
        }
        int i12 = 0 << 0;
        androidx.compose.runtime.n7<androidx.compose.ui.graphics.q0> n7VarC = androidx.compose.animation.e1.c(j10, hm.b(d0.h1.DefaultEffects, c0Var, 6), null, null, c0Var, 0, 12);
        if (androidx.compose.runtime.m0.l0()) {
            androidx.compose.runtime.m0.z0();
        }
        return n7VarC;
    }

    @NotNull
    public final r7 b(long j10, long j11, long j12, long j13, long j14, long j15, long j16, long j17, long j18, long j19, long j20, long j21, long j22, long j23, long j24, long j25, long j26, long j27, long j28, long j29, long j30, long j31, long j32, long j33, @Nullable j40 j40Var) {
        return new r7(j10 != 16 ? j10 : this.f32461a, j11 != 16 ? j11 : this.f32462b, j12 != 16 ? j12 : this.f32463c, j13 != 16 ? j13 : this.f32464d, j14 != 16 ? j14 : this.f32465e, j15 != 16 ? j15 : this.f32466f, j16 != 16 ? j16 : this.f32467g, j17 != 16 ? j17 : this.f32468h, j18 != 16 ? j18 : this.f32469i, j19 != 16 ? j19 : this.f32470j, j20 != 16 ? j20 : this.f32471k, j21 != 16 ? j21 : this.f32472l, j22 != 16 ? j22 : this.f32473m, j23 != 16 ? j23 : this.f32474n, j24 != 16 ? j24 : this.f32475o, j25 != 16 ? j25 : this.f32476p, j26 != 16 ? j26 : this.f32477q, j27 != 16 ? j27 : this.f32478r, j28 != 16 ? j28 : this.f32479s, j29 != 16 ? j29 : this.f32480t, j30 != 16 ? j30 : this.f32481u, j31 != 16 ? j31 : this.f32482v, j32 != 16 ? j32 : this.f32483w, j33 != 16 ? j33 : this.f32484x, F(j40Var, new Function0() { // from class: androidx.compose.material3.q7
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return r7.d(this.f32127a);
            }
        }), null);
    }

    @androidx.compose.runtime.o
    @NotNull
    public final androidx.compose.runtime.n7<androidx.compose.ui.graphics.q0> e(boolean z10, boolean z11, boolean z12, @Nullable androidx.compose.runtime.c0 c0Var, int i10) {
        long jS;
        androidx.compose.runtime.n7<androidx.compose.ui.graphics.q0> n7VarW;
        if (androidx.compose.runtime.m0.l0()) {
            androidx.compose.runtime.m0.A0(-1240482658, i10, -1, "androidx.compose.material3.DatePickerColors.dayContainerColor (DatePicker.kt:976)");
        }
        if (z10) {
            jS = z11 ? this.f32478r : this.f32479s;
        } else {
            jS = androidx.compose.ui.graphics.q0.f38131b.s();
        }
        long j10 = jS;
        if (z12) {
            c0Var.E(-1319856736);
            n7VarW = androidx.compose.animation.e1.c(j10, hm.b(d0.h1.DefaultEffects, c0Var, 6), null, null, c0Var, 0, 12);
            c0Var.A();
        } else {
            c0Var.E(-1319630064);
            n7VarW = androidx.compose.runtime.w6.w(androidx.compose.ui.graphics.q0.n(j10), c0Var, 0);
            c0Var.A();
        }
        if (androidx.compose.runtime.m0.l0()) {
            androidx.compose.runtime.m0.z0();
        }
        return n7VarW;
    }

    public boolean equals(@Nullable Object obj) {
        if (!(obj instanceof r7)) {
            return false;
        }
        r7 r7Var = (r7) obj;
        return androidx.compose.ui.graphics.q0.y(this.f32461a, r7Var.f32461a) && androidx.compose.ui.graphics.q0.y(this.f32462b, r7Var.f32462b) && androidx.compose.ui.graphics.q0.y(this.f32463c, r7Var.f32463c) && androidx.compose.ui.graphics.q0.y(this.f32464d, r7Var.f32464d) && androidx.compose.ui.graphics.q0.y(this.f32465e, r7Var.f32465e) && androidx.compose.ui.graphics.q0.y(this.f32467g, r7Var.f32467g) && androidx.compose.ui.graphics.q0.y(this.f32468h, r7Var.f32468h) && androidx.compose.ui.graphics.q0.y(this.f32469i, r7Var.f32469i) && androidx.compose.ui.graphics.q0.y(this.f32470j, r7Var.f32470j) && androidx.compose.ui.graphics.q0.y(this.f32471k, r7Var.f32471k) && androidx.compose.ui.graphics.q0.y(this.f32472l, r7Var.f32472l) && androidx.compose.ui.graphics.q0.y(this.f32473m, r7Var.f32473m) && androidx.compose.ui.graphics.q0.y(this.f32474n, r7Var.f32474n) && androidx.compose.ui.graphics.q0.y(this.f32475o, r7Var.f32475o) && androidx.compose.ui.graphics.q0.y(this.f32476p, r7Var.f32476p) && androidx.compose.ui.graphics.q0.y(this.f32477q, r7Var.f32477q) && androidx.compose.ui.graphics.q0.y(this.f32478r, r7Var.f32478r) && androidx.compose.ui.graphics.q0.y(this.f32479s, r7Var.f32479s) && androidx.compose.ui.graphics.q0.y(this.f32480t, r7Var.f32480t) && androidx.compose.ui.graphics.q0.y(this.f32481u, r7Var.f32481u) && androidx.compose.ui.graphics.q0.y(this.f32482v, r7Var.f32482v) && androidx.compose.ui.graphics.q0.y(this.f32483w, r7Var.f32483w);
    }

    @androidx.compose.runtime.o
    @NotNull
    public final androidx.compose.runtime.n7<androidx.compose.ui.graphics.q0> f(boolean z10, boolean z11, boolean z12, boolean z13, @Nullable androidx.compose.runtime.c0 c0Var, int i10) {
        long j10;
        androidx.compose.runtime.n7<androidx.compose.ui.graphics.q0> n7VarC;
        if (androidx.compose.runtime.m0.l0()) {
            androidx.compose.runtime.m0.A0(-1233694918, i10, -1, "androidx.compose.material3.DatePickerColors.dayContentColor (DatePicker.kt:940)");
        }
        if (z11 && z13) {
            j10 = this.f32476p;
        } else if (z11 && !z13) {
            j10 = this.f32477q;
        } else if (z12 && z13) {
            j10 = this.f32483w;
        } else if (z12 && !z13) {
            j10 = this.f32475o;
        } else if (z10 && z13) {
            j10 = this.f32480t;
        } else {
            j10 = z13 ? this.f32474n : this.f32475o;
        }
        long j11 = j10;
        if (z12) {
            c0Var.E(-969483020);
            n7VarC = androidx.compose.runtime.w6.w(androidx.compose.ui.graphics.q0.n(j11), c0Var, 0);
            c0Var.A();
        } else {
            c0Var.E(-969417610);
            n7VarC = androidx.compose.animation.e1.c(j11, hm.b(d0.h1.DefaultEffects, c0Var, 6), null, null, c0Var, 0, 12);
            c0Var.A();
        }
        if (androidx.compose.runtime.m0.l0()) {
            androidx.compose.runtime.m0.z0();
        }
        return n7VarC;
    }

    public final long g() {
        return this.f32461a;
    }

    public final long h() {
        return this.f32469i;
    }

    public int hashCode() {
        return (((((((((((((((((((((((((((((((((((((((((androidx.compose.ui.graphics.q0.K(this.f32461a) * 31) + androidx.compose.ui.graphics.q0.K(this.f32462b)) * 31) + androidx.compose.ui.graphics.q0.K(this.f32463c)) * 31) + androidx.compose.ui.graphics.q0.K(this.f32464d)) * 31) + androidx.compose.ui.graphics.q0.K(this.f32465e)) * 31) + androidx.compose.ui.graphics.q0.K(this.f32467g)) * 31) + androidx.compose.ui.graphics.q0.K(this.f32468h)) * 31) + androidx.compose.ui.graphics.q0.K(this.f32469i)) * 31) + androidx.compose.ui.graphics.q0.K(this.f32470j)) * 31) + androidx.compose.ui.graphics.q0.K(this.f32471k)) * 31) + androidx.compose.ui.graphics.q0.K(this.f32472l)) * 31) + androidx.compose.ui.graphics.q0.K(this.f32473m)) * 31) + androidx.compose.ui.graphics.q0.K(this.f32474n)) * 31) + androidx.compose.ui.graphics.q0.K(this.f32475o)) * 31) + androidx.compose.ui.graphics.q0.K(this.f32476p)) * 31) + androidx.compose.ui.graphics.q0.K(this.f32477q)) * 31) + androidx.compose.ui.graphics.q0.K(this.f32478r)) * 31) + androidx.compose.ui.graphics.q0.K(this.f32479s)) * 31) + androidx.compose.ui.graphics.q0.K(this.f32480t)) * 31) + androidx.compose.ui.graphics.q0.K(this.f32481u)) * 31) + androidx.compose.ui.graphics.q0.K(this.f32482v)) * 31) + androidx.compose.ui.graphics.q0.K(this.f32483w);
    }

    @NotNull
    public final j40 i() {
        return this.f32485y;
    }

    public final long j() {
        return this.f32474n;
    }

    public final long k() {
        return this.f32482v;
    }

    public final long l() {
        return this.f32483w;
    }

    public final long m() {
        return this.f32475o;
    }

    public final long n() {
        return this.f32479s;
    }

    public final long o() {
        return this.f32477q;
    }

    public final long p() {
        return this.f32473m;
    }

    public final long q() {
        return this.f32471k;
    }

    public final long r() {
        return this.f32468h;
    }

    public final long s() {
        return this.f32484x;
    }

    public final long t() {
        return this.f32463c;
    }

    public final long u() {
        return this.f32466f;
    }

    public final long v() {
        return this.f32478r;
    }

    public final long w() {
        return this.f32476p;
    }

    public final long x() {
        return this.f32472l;
    }

    public final long y() {
        return this.f32470j;
    }

    public final long z() {
        return this.f32465e;
    }

    private r7(long j10, long j11, long j12, long j13, long j14, long j15, long j16, long j17, long j18, long j19, long j20, long j21, long j22, long j23, long j24, long j25, long j26, long j27, long j28, long j29, long j30, long j31, long j32, long j33, j40 j40Var) {
        this.f32461a = j10;
        this.f32462b = j11;
        this.f32463c = j12;
        this.f32464d = j13;
        this.f32465e = j14;
        this.f32466f = j15;
        this.f32467g = j16;
        this.f32468h = j17;
        this.f32469i = j18;
        this.f32470j = j19;
        this.f32471k = j20;
        this.f32472l = j21;
        this.f32473m = j22;
        this.f32474n = j23;
        this.f32475o = j24;
        this.f32476p = j25;
        this.f32477q = j26;
        this.f32478r = j27;
        this.f32479s = j28;
        this.f32480t = j29;
        this.f32481u = j30;
        this.f32482v = j31;
        this.f32483w = j32;
        this.f32484x = j33;
        this.f32485y = j40Var;
    }
}
