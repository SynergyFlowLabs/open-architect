package androidx.compose.material3;

import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes.dex */
@androidx.compose.runtime.o2
@SourceDebugExtension({"SMAP\nCheckbox.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Checkbox.kt\nandroidx/compose/material3/CheckboxColors\n+ 2 Color.kt\nandroidx/compose/ui/graphics/ColorKt\n*L\n1#1,739:1\n646#2:740\n635#2:741\n646#2:742\n635#2:743\n646#2:744\n635#2:745\n646#2:746\n635#2:747\n646#2:748\n635#2:749\n646#2:750\n635#2:751\n646#2:752\n635#2:753\n646#2:754\n635#2:755\n646#2:756\n635#2:757\n646#2:758\n635#2:759\n646#2:760\n635#2:761\n646#2:762\n635#2:763\n*S KotlinDebug\n*F\n+ 1 Checkbox.kt\nandroidx/compose/material3/CheckboxColors\n*L\n587#1:740\n587#1:741\n588#1:742\n588#1:743\n589#1:744\n589#1:745\n590#1:746\n590#1:747\n591#1:748\n591#1:749\n592#1:750\n592#1:751\n593#1:752\n593#1:753\n594#1:754\n594#1:755\n595#1:756\n595#1:757\n596#1:758\n596#1:759\n597#1:760\n597#1:761\n598#1:762\n598#1:763\n*E\n"})
public final class r4 {

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public static final int f32416m = 0;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final long f32417a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final long f32418b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final long f32419c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final long f32420d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final long f32421e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final long f32422f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private final long f32423g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private final long f32424h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private final long f32425i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private final long f32426j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private final long f32427k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private final long f32428l;

    public /* synthetic */ class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f32429a;

        static {
            int[] iArr = new int[v0.a.values().length];
            try {
                iArr[v0.a.On.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[v0.a.Indeterminate.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[v0.a.Off.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            f32429a = iArr;
        }
    }

    public /* synthetic */ r4(long j10, long j11, long j12, long j13, long j14, long j15, long j16, long j17, long j18, long j19, long j20, long j21, DefaultConstructorMarker defaultConstructorMarker) {
        this(j10, j11, j12, j13, j14, j15, j16, j17, j18, j19, j20, j21);
    }

    @androidx.compose.runtime.o
    private final androidx.compose.animation.core.o<androidx.compose.ui.graphics.q0> d(v0.a aVar, androidx.compose.runtime.c0 c0Var, int i10) {
        androidx.compose.animation.core.y0 y0VarB;
        if (androidx.compose.runtime.m0.l0()) {
            androidx.compose.runtime.m0.A0(-1075456245, i10, -1, "androidx.compose.material3.CheckboxColors.colorAnimationSpecForState (Checkbox.kt:684)");
        }
        if (aVar == v0.a.Off) {
            c0Var.E(1539262271);
            y0VarB = hm.b(d0.h1.FastEffects, c0Var, 6);
            c0Var.A();
        } else {
            c0Var.E(1539355581);
            y0VarB = hm.b(d0.h1.DefaultEffects, c0Var, 6);
            c0Var.A();
        }
        if (androidx.compose.runtime.m0.l0()) {
            androidx.compose.runtime.m0.z0();
        }
        return y0VarB;
    }

    public static /* synthetic */ r4 f(r4 r4Var, long j10, long j11, long j12, long j13, long j14, long j15, long j16, long j17, long j18, long j19, long j20, long j21, int i10, Object obj) {
        long j22;
        long j23;
        long j24 = (i10 & 1) != 0 ? r4Var.f32417a : j10;
        long j25 = (i10 & 2) != 0 ? r4Var.f32418b : j11;
        long j26 = (i10 & 4) != 0 ? r4Var.f32419c : j12;
        long j27 = (i10 & 8) != 0 ? r4Var.f32420d : j13;
        long j28 = (i10 & 16) != 0 ? r4Var.f32421e : j14;
        long j29 = (i10 & 32) != 0 ? r4Var.f32422f : j15;
        long j30 = (i10 & 64) != 0 ? r4Var.f32423g : j16;
        long j31 = j24;
        long j32 = (i10 & 128) != 0 ? r4Var.f32424h : j17;
        long j33 = (i10 & 256) != 0 ? r4Var.f32425i : j18;
        long j34 = (i10 & 512) != 0 ? r4Var.f32426j : j19;
        long j35 = (i10 & 1024) != 0 ? r4Var.f32427k : j20;
        if ((i10 & 2048) != 0) {
            j23 = j35;
            j22 = r4Var.f32428l;
        } else {
            j22 = j21;
            j23 = j35;
        }
        return r4Var.e(j31, j25, j26, j27, j28, j29, j30, j32, j33, j34, j23, j22);
    }

    @androidx.compose.runtime.o
    @NotNull
    public final androidx.compose.runtime.n7<androidx.compose.ui.graphics.q0> a(boolean z10, @NotNull v0.a aVar, @Nullable androidx.compose.runtime.c0 c0Var, int i10) {
        long j10;
        androidx.compose.runtime.n7<androidx.compose.ui.graphics.q0> n7VarW;
        if (androidx.compose.runtime.m0.l0()) {
            androidx.compose.runtime.m0.A0(1009643462, i10, -1, "androidx.compose.material3.CheckboxColors.borderColor (Checkbox.kt:657)");
        }
        if (z10) {
            int i11 = a.f32429a[aVar.ordinal()];
            if (i11 == 1 || i11 == 2) {
                j10 = this.f32424h;
            } else {
                if (i11 != 3) {
                    throw new kotlin.k0();
                }
                j10 = this.f32425i;
            }
        } else {
            int i12 = a.f32429a[aVar.ordinal()];
            if (i12 == 1) {
                j10 = this.f32426j;
            } else if (i12 == 2) {
                j10 = this.f32428l;
            } else {
                if (i12 != 3) {
                    throw new kotlin.k0();
                }
                j10 = this.f32427k;
            }
        }
        long j11 = j10;
        if (z10) {
            c0Var.E(633231558);
            n7VarW = androidx.compose.animation.e1.c(j11, d(aVar, c0Var, (i10 >> 3) & okhttp3.internal.ws.g.f334652s), null, null, c0Var, 0, 12);
            c0Var.A();
        } else {
            c0Var.E(633321768);
            n7VarW = androidx.compose.runtime.w6.w(androidx.compose.ui.graphics.q0.n(j11), c0Var, 0);
            c0Var.A();
        }
        if (androidx.compose.runtime.m0.l0()) {
            androidx.compose.runtime.m0.z0();
        }
        return n7VarW;
    }

    @androidx.compose.runtime.o
    @NotNull
    public final androidx.compose.runtime.n7<androidx.compose.ui.graphics.q0> b(boolean z10, @NotNull v0.a aVar, @Nullable androidx.compose.runtime.c0 c0Var, int i10) {
        long j10;
        androidx.compose.runtime.n7<androidx.compose.ui.graphics.q0> n7VarW;
        if (androidx.compose.runtime.m0.l0()) {
            androidx.compose.runtime.m0.A0(360729865, i10, -1, "androidx.compose.material3.CheckboxColors.boxColor (Checkbox.kt:625)");
        }
        if (z10) {
            int i11 = a.f32429a[aVar.ordinal()];
            if (i11 == 1 || i11 == 2) {
                j10 = this.f32419c;
            } else {
                if (i11 != 3) {
                    throw new kotlin.k0();
                }
                j10 = this.f32420d;
            }
        } else {
            int i12 = a.f32429a[aVar.ordinal()];
            if (i12 == 1) {
                j10 = this.f32421e;
            } else if (i12 == 2) {
                j10 = this.f32423g;
            } else {
                if (i12 != 3) {
                    throw new kotlin.k0();
                }
                j10 = this.f32422f;
            }
        }
        long j11 = j10;
        if (z10) {
            c0Var.E(496051715);
            n7VarW = androidx.compose.animation.e1.c(j11, d(aVar, c0Var, (i10 >> 3) & okhttp3.internal.ws.g.f334652s), null, null, c0Var, 0, 12);
            c0Var.A();
        } else {
            c0Var.E(496141925);
            n7VarW = androidx.compose.runtime.w6.w(androidx.compose.ui.graphics.q0.n(j11), c0Var, 0);
            c0Var.A();
        }
        if (androidx.compose.runtime.m0.l0()) {
            androidx.compose.runtime.m0.z0();
        }
        return n7VarW;
    }

    @androidx.compose.runtime.o
    @NotNull
    public final androidx.compose.runtime.n7<androidx.compose.ui.graphics.q0> c(@NotNull v0.a aVar, @Nullable androidx.compose.runtime.c0 c0Var, int i10) {
        if (androidx.compose.runtime.m0.l0()) {
            androidx.compose.runtime.m0.A0(-507585681, i10, -1, "androidx.compose.material3.CheckboxColors.checkmarkColor (Checkbox.kt:606)");
        }
        androidx.compose.runtime.n7<androidx.compose.ui.graphics.q0> n7VarC = androidx.compose.animation.e1.c(aVar == v0.a.Off ? this.f32418b : this.f32417a, d(aVar, c0Var, i10 & okhttp3.internal.ws.g.f334652s), null, null, c0Var, 0, 12);
        if (androidx.compose.runtime.m0.l0()) {
            androidx.compose.runtime.m0.z0();
        }
        return n7VarC;
    }

    @NotNull
    public final r4 e(long j10, long j11, long j12, long j13, long j14, long j15, long j16, long j17, long j18, long j19, long j20, long j21) {
        return new r4(j10 != 16 ? j10 : this.f32417a, j11 != 16 ? j11 : this.f32418b, j12 != 16 ? j12 : this.f32419c, j13 != 16 ? j13 : this.f32420d, j14 != 16 ? j14 : this.f32421e, j15 != 16 ? j15 : this.f32422f, j16 != 16 ? j16 : this.f32423g, j17 != 16 ? j17 : this.f32424h, j18 != 16 ? j18 : this.f32425i, j19 != 16 ? j19 : this.f32426j, j20 != 16 ? j20 : this.f32427k, j21 != 16 ? j21 : this.f32428l, null);
    }

    public boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || !(obj instanceof r4)) {
            return false;
        }
        r4 r4Var = (r4) obj;
        return androidx.compose.ui.graphics.q0.y(this.f32417a, r4Var.f32417a) && androidx.compose.ui.graphics.q0.y(this.f32418b, r4Var.f32418b) && androidx.compose.ui.graphics.q0.y(this.f32419c, r4Var.f32419c) && androidx.compose.ui.graphics.q0.y(this.f32420d, r4Var.f32420d) && androidx.compose.ui.graphics.q0.y(this.f32421e, r4Var.f32421e) && androidx.compose.ui.graphics.q0.y(this.f32422f, r4Var.f32422f) && androidx.compose.ui.graphics.q0.y(this.f32423g, r4Var.f32423g) && androidx.compose.ui.graphics.q0.y(this.f32424h, r4Var.f32424h) && androidx.compose.ui.graphics.q0.y(this.f32425i, r4Var.f32425i) && androidx.compose.ui.graphics.q0.y(this.f32426j, r4Var.f32426j) && androidx.compose.ui.graphics.q0.y(this.f32427k, r4Var.f32427k) && androidx.compose.ui.graphics.q0.y(this.f32428l, r4Var.f32428l);
    }

    public final long g() {
        return this.f32424h;
    }

    public final long h() {
        return this.f32419c;
    }

    public int hashCode() {
        return (((((((((((((((((((((androidx.compose.ui.graphics.q0.K(this.f32417a) * 31) + androidx.compose.ui.graphics.q0.K(this.f32418b)) * 31) + androidx.compose.ui.graphics.q0.K(this.f32419c)) * 31) + androidx.compose.ui.graphics.q0.K(this.f32420d)) * 31) + androidx.compose.ui.graphics.q0.K(this.f32421e)) * 31) + androidx.compose.ui.graphics.q0.K(this.f32422f)) * 31) + androidx.compose.ui.graphics.q0.K(this.f32423g)) * 31) + androidx.compose.ui.graphics.q0.K(this.f32424h)) * 31) + androidx.compose.ui.graphics.q0.K(this.f32425i)) * 31) + androidx.compose.ui.graphics.q0.K(this.f32426j)) * 31) + androidx.compose.ui.graphics.q0.K(this.f32427k)) * 31) + androidx.compose.ui.graphics.q0.K(this.f32428l);
    }

    public final long i() {
        return this.f32417a;
    }

    public final long j() {
        return this.f32426j;
    }

    public final long k() {
        return this.f32421e;
    }

    public final long l() {
        return this.f32428l;
    }

    public final long m() {
        return this.f32423g;
    }

    public final long n() {
        return this.f32427k;
    }

    public final long o() {
        return this.f32422f;
    }

    public final long p() {
        return this.f32425i;
    }

    public final long q() {
        return this.f32420d;
    }

    public final long r() {
        return this.f32418b;
    }

    private r4(long j10, long j11, long j12, long j13, long j14, long j15, long j16, long j17, long j18, long j19, long j20, long j21) {
        this.f32417a = j10;
        this.f32418b = j11;
        this.f32419c = j12;
        this.f32420d = j13;
        this.f32421e = j14;
        this.f32422f = j15;
        this.f32423g = j16;
        this.f32424h = j17;
        this.f32425i = j18;
        this.f32426j = j19;
        this.f32427k = j20;
        this.f32428l = j21;
    }
}
