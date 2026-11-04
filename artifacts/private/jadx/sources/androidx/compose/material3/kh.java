package androidx.compose.material3;

import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes.dex */
@androidx.compose.runtime.internal.w0(parameters = 1)
@SourceDebugExtension({"SMAP\nIconButtonDefaults.kt\nKotlin\n*S Kotlin\n*F\n+ 1 IconButtonDefaults.kt\nandroidx/compose/material3/IconButtonDefaults\n+ 2 CompositionLocal.kt\nandroidx/compose/runtime/CompositionLocal\n+ 3 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 4 Composer.kt\nandroidx/compose/runtime/ComposerKt\n+ 5 Dp.kt\nandroidx/compose/ui/unit/Dp\n+ 6 Dp.kt\nandroidx/compose/ui/unit/DpKt\n*L\n1#1,916:1\n75#2:917\n75#2:918\n75#2:919\n75#2:921\n75#2:922\n75#2:923\n75#2:924\n75#2:925\n75#2:926\n75#2:927\n75#2:928\n75#2:929\n75#2:930\n1#3:920\n1282#4,6:931\n1282#4,6:937\n49#5:943\n49#5:944\n49#5:945\n49#5:947\n113#6:946\n*S KotlinDebug\n*F\n+ 1 IconButtonDefaults.kt\nandroidx/compose/material3/IconButtonDefaults\n*L\n44#1:917\n74#1:918\n80#1:919\n166#1:921\n197#1:922\n205#1:923\n515#1:924\n543#1:925\n549#1:926\n638#1:927\n669#1:928\n677#1:929\n820#1:930\n827#1:931,6\n845#1:937,6\n871#1:943\n874#1:944\n877#1:945\n881#1:947\n878#1:946\n*E\n"})
public final class kh {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    public static final kh f30051a = new kh();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final int f30052b = 0;

    @oj.g
    public static final class a {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        @NotNull
        public static final C0244a f30053b = new C0244a(null);

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private static final int f30054c = e(0);

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private static final int f30055d = e(1);

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        private static final int f30056e = e(2);

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final int f30057a;

        /* JADX INFO: renamed from: androidx.compose.material3.kh$a$a, reason: collision with other inner class name */
        public static final class C0244a {
            public /* synthetic */ C0244a(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }

            public final int a() {
                return a.f30054c;
            }

            public final int b() {
                return a.f30055d;
            }

            public final int c() {
                return a.f30056e;
            }

            private C0244a() {
            }
        }

        static {
            int i10 = 5 & 0;
            int i11 = 7 ^ 2;
        }

        private /* synthetic */ a(int i10) {
            this.f30057a = i10;
        }

        public static final /* synthetic */ a d(int i10) {
            return new a(i10);
        }

        private static int e(int i10) {
            return i10;
        }

        public static boolean f(int i10, Object obj) {
            return (obj instanceof a) && i10 == ((a) obj).j();
        }

        public static final boolean g(int i10, int i11) {
            return i10 == i11;
        }

        public static int h(int i10) {
            return Integer.hashCode(i10);
        }

        @NotNull
        public static String i(int i10) {
            if (g(i10, f30054c)) {
                return "Narrow";
            }
            if (g(i10, f30055d)) {
                return "Uniform";
            }
            return g(i10, f30056e) ? "Wide" : com.facebook.internal.a.f99697t;
        }

        public boolean equals(Object obj) {
            return f(this.f30057a, obj);
        }

        public int hashCode() {
            return h(this.f30057a);
        }

        public final /* synthetic */ int j() {
            return this.f30057a;
        }

        @NotNull
        public String toString() {
            return i(this.f30057a);
        }
    }

    private kh() {
    }

    public static /* synthetic */ long S(kh khVar, int i10, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            i10 = a.f30053b.b();
        }
        return khVar.R(i10);
    }

    @androidx.compose.runtime.o
    @NotNull
    public final jh A(long j10, long j11, long j12, long j13, @Nullable androidx.compose.runtime.c0 c0Var, int i10, int i11) {
        if ((i11 & 1) != 0) {
            j10 = androidx.compose.ui.graphics.q0.f38131b.u();
        }
        long jU = (i11 & 2) != 0 ? androidx.compose.ui.graphics.q0.f38131b.u() : j11;
        long jU2 = (i11 & 4) != 0 ? androidx.compose.ui.graphics.q0.f38131b.u() : j12;
        long jW = (i11 & 8) != 0 ? androidx.compose.ui.graphics.q0.w(jU, d0.u2.f269054a.c(), 0.0f, 0.0f, 0.0f, 14, null) : j13;
        if (androidx.compose.runtime.m0.l0()) {
            androidx.compose.runtime.m0.A0(1036440437, i10, -1, "androidx.compose.material3.IconButtonDefaults.iconButtonVibrantColors (IconButtonDefaults.kt:132)");
        }
        jh jhVarC = b(pj.f31758a.a(c0Var, 6)).c(j10, jU, jU2, jW);
        if (androidx.compose.runtime.m0.l0()) {
            androidx.compose.runtime.m0.z0();
        }
        return jhVarC;
    }

    @androidx.compose.runtime.o
    @NotNull
    public final oi B(@Nullable androidx.compose.runtime.c0 c0Var, int i10) {
        c0Var.E(-1355771567);
        if (androidx.compose.runtime.m0.l0()) {
            androidx.compose.runtime.m0.A0(-1355771567, i10, -1, "androidx.compose.material3.IconButtonDefaults.iconToggleButtonColors (IconButtonDefaults.kt:164)");
        }
        long jM = ((androidx.compose.ui.graphics.q0) c0Var.W(c7.a())).M();
        oi oiVarC = c(pj.f31758a.a(c0Var, 6), jM);
        if (androidx.compose.ui.graphics.q0.y(oiVarC.h(), jM)) {
            if (androidx.compose.runtime.m0.l0()) {
                androidx.compose.runtime.m0.z0();
            }
            c0Var.A();
            return oiVarC;
        }
        oi oiVarD = oi.d(oiVarC, 0L, jM, 0L, androidx.compose.ui.graphics.q0.w(jM, d0.u2.f269054a.c(), 0.0f, 0.0f, 0.0f, 14, null), 0L, 0L, 53, null);
        if (androidx.compose.runtime.m0.l0()) {
            androidx.compose.runtime.m0.z0();
        }
        c0Var.A();
        return oiVarD;
    }

    @androidx.compose.runtime.o
    @NotNull
    public final oi C(long j10, long j11, long j12, long j13, long j14, long j15, @Nullable androidx.compose.runtime.c0 c0Var, int i10, int i11) {
        long j16;
        long jW;
        long jU = (i11 & 1) != 0 ? androidx.compose.ui.graphics.q0.f38131b.u() : j10;
        long jM = (i11 & 2) != 0 ? ((androidx.compose.ui.graphics.q0) c0Var.W(c7.a())).M() : j11;
        long jU2 = (i11 & 4) != 0 ? androidx.compose.ui.graphics.q0.f38131b.u() : j12;
        if ((i11 & 8) != 0) {
            long j17 = jM;
            jW = androidx.compose.ui.graphics.q0.w(j17, d0.u2.f269054a.c(), 0.0f, 0.0f, 0.0f, 14, null);
            j16 = j17;
        } else {
            j16 = jM;
            jW = j13;
        }
        long jU3 = (i11 & 16) != 0 ? androidx.compose.ui.graphics.q0.f38131b.u() : j14;
        long jU4 = (i11 & 32) != 0 ? androidx.compose.ui.graphics.q0.f38131b.u() : j15;
        if (androidx.compose.runtime.m0.l0()) {
            androidx.compose.runtime.m0.A0(1402082449, i10, -1, "androidx.compose.material3.IconButtonDefaults.iconToggleButtonColors (IconButtonDefaults.kt:203)");
        }
        oi oiVarC = c(pj.f31758a.a(c0Var, 6), ((androidx.compose.ui.graphics.q0) c0Var.W(c7.a())).M()).c(jU, j16, jU2, jW, jU3, jU4);
        if (androidx.compose.runtime.m0.l0()) {
            androidx.compose.runtime.m0.z0();
        }
        return oiVarC;
    }

    @androidx.compose.runtime.o
    @NotNull
    public final oi D(@Nullable androidx.compose.runtime.c0 c0Var, int i10) {
        if (androidx.compose.runtime.m0.l0()) {
            androidx.compose.runtime.m0.A0(1755001127, i10, -1, "androidx.compose.material3.IconButtonDefaults.iconToggleButtonVibrantColors (IconButtonDefaults.kt:241)");
        }
        oi oiVarD = d(pj.f31758a.a(c0Var, 6));
        if (androidx.compose.runtime.m0.l0()) {
            androidx.compose.runtime.m0.z0();
        }
        return oiVarD;
    }

    @androidx.compose.runtime.o
    @NotNull
    public final oi E(long j10, long j11, long j12, long j13, long j14, long j15, @Nullable androidx.compose.runtime.c0 c0Var, int i10, int i11) {
        long j16;
        long jW;
        long jU = (i11 & 1) != 0 ? androidx.compose.ui.graphics.q0.f38131b.u() : j10;
        long jU2 = (i11 & 2) != 0 ? androidx.compose.ui.graphics.q0.f38131b.u() : j11;
        long jU3 = (i11 & 4) != 0 ? androidx.compose.ui.graphics.q0.f38131b.u() : j12;
        if ((i11 & 8) != 0) {
            long j17 = jU2;
            jW = androidx.compose.ui.graphics.q0.w(j17, d0.u2.f269054a.c(), 0.0f, 0.0f, 0.0f, 14, null);
            j16 = j17;
        } else {
            j16 = jU2;
            jW = j13;
        }
        long jU4 = (i11 & 16) != 0 ? androidx.compose.ui.graphics.q0.f38131b.u() : j14;
        long jU5 = (i11 & 32) != 0 ? androidx.compose.ui.graphics.q0.f38131b.u() : j15;
        if (androidx.compose.runtime.m0.l0()) {
            androidx.compose.runtime.m0.A0(-1027328773, i10, -1, "androidx.compose.material3.IconButtonDefaults.iconToggleButtonVibrantColors (IconButtonDefaults.kt:267)");
        }
        oi oiVarC = d(pj.f31758a.a(c0Var, 6)).c(jU, j16, jU3, jW, jU4, jU5);
        if (androidx.compose.runtime.m0.l0()) {
            androidx.compose.runtime.m0.z0();
        }
        return oiVarC;
    }

    @androidx.compose.runtime.o
    @NotNull
    public final androidx.compose.foundation.a1 F(boolean z10, @Nullable androidx.compose.runtime.c0 c0Var, int i10) {
        if (androidx.compose.runtime.m0.l0()) {
            androidx.compose.runtime.m0.A0(-1270640488, i10, -1, "androidx.compose.material3.IconButtonDefaults.outlinedIconButtonBorder (IconButtonDefaults.kt:818)");
        }
        long jM = ((androidx.compose.ui.graphics.q0) c0Var.W(c7.a())).M();
        if (!z10) {
            jM = androidx.compose.ui.graphics.q0.w(jM, d0.w1.f269194a.c(), 0.0f, 0.0f, 0.0f, 14, null);
        }
        boolean zL = c0Var.L(jM);
        Object objI0 = c0Var.i0();
        if (zL || objI0 == androidx.compose.runtime.c0.f35327a.a()) {
            objI0 = androidx.compose.foundation.b1.a(d0.n2.f268546a.i(), jM);
            c0Var.Y(objI0);
        }
        androidx.compose.foundation.a1 a1Var = (androidx.compose.foundation.a1) objI0;
        if (androidx.compose.runtime.m0.l0()) {
            androidx.compose.runtime.m0.z0();
        }
        return a1Var;
    }

    @androidx.compose.runtime.o
    @NotNull
    public final jh G(@Nullable androidx.compose.runtime.c0 c0Var, int i10) {
        c0Var.E(1591384183);
        if (androidx.compose.runtime.m0.l0()) {
            androidx.compose.runtime.m0.A0(1591384183, i10, -1, "androidx.compose.material3.IconButtonDefaults.outlinedIconButtonColors (IconButtonDefaults.kt:513)");
        }
        long jM = ((androidx.compose.ui.graphics.q0) c0Var.W(c7.a())).M();
        jh jhVarE = e(pj.f31758a.a(c0Var, 6), jM);
        if (androidx.compose.ui.graphics.q0.y(jhVarE.f(), jM)) {
            if (androidx.compose.runtime.m0.l0()) {
                androidx.compose.runtime.m0.z0();
            }
            c0Var.A();
            return jhVarE;
        }
        jh jhVarD = jh.d(jhVarE, 0L, jM, 0L, androidx.compose.ui.graphics.q0.w(jM, d0.w1.f269194a.c(), 0.0f, 0.0f, 0.0f, 14, null), 5, null);
        if (androidx.compose.runtime.m0.l0()) {
            androidx.compose.runtime.m0.z0();
        }
        c0Var.A();
        return jhVarD;
    }

    @androidx.compose.runtime.o
    @NotNull
    public final jh H(long j10, long j11, long j12, long j13, @Nullable androidx.compose.runtime.c0 c0Var, int i10, int i11) {
        if ((i11 & 1) != 0) {
            j10 = androidx.compose.ui.graphics.q0.f38131b.u();
        }
        long jM = (i11 & 2) != 0 ? ((androidx.compose.ui.graphics.q0) c0Var.W(c7.a())).M() : j11;
        long jU = (i11 & 4) != 0 ? androidx.compose.ui.graphics.q0.f38131b.u() : j12;
        long jW = (i11 & 8) != 0 ? androidx.compose.ui.graphics.q0.w(jM, d0.w1.f269194a.c(), 0.0f, 0.0f, 0.0f, 14, null) : j13;
        if (androidx.compose.runtime.m0.l0()) {
            androidx.compose.runtime.m0.A0(-1335916251, i10, -1, "androidx.compose.material3.IconButtonDefaults.outlinedIconButtonColors (IconButtonDefaults.kt:547)");
        }
        jh jhVarC = e(pj.f31758a.a(c0Var, 6), ((androidx.compose.ui.graphics.q0) c0Var.W(c7.a())).M()).c(j10, jM, jU, jW);
        if (androidx.compose.runtime.m0.l0()) {
            androidx.compose.runtime.m0.z0();
        }
        return jhVarC;
    }

    @androidx.compose.runtime.o
    @NotNull
    public final androidx.compose.foundation.a1 I(boolean z10, @Nullable androidx.compose.runtime.c0 c0Var, int i10) {
        if (androidx.compose.runtime.m0.l0()) {
            androidx.compose.runtime.m0.A0(-2139728858, i10, -1, "androidx.compose.material3.IconButtonDefaults.outlinedIconButtonVibrantBorder (IconButtonDefaults.kt:836)");
        }
        d0.w1 w1Var = d0.w1.f269194a;
        long jR = o6.r(w1Var.g(), c0Var, 6);
        if (!z10) {
            jR = androidx.compose.ui.graphics.q0.w(jR, w1Var.c(), 0.0f, 0.0f, 0.0f, 14, null);
        }
        boolean zL = c0Var.L(jR);
        Object objI0 = c0Var.i0();
        if (zL || objI0 == androidx.compose.runtime.c0.f35327a.a()) {
            objI0 = androidx.compose.foundation.b1.a(d0.n2.f268546a.i(), jR);
            c0Var.Y(objI0);
        }
        androidx.compose.foundation.a1 a1Var = (androidx.compose.foundation.a1) objI0;
        if (androidx.compose.runtime.m0.l0()) {
            androidx.compose.runtime.m0.z0();
        }
        return a1Var;
    }

    @androidx.compose.runtime.o
    @NotNull
    public final jh J(@Nullable androidx.compose.runtime.c0 c0Var, int i10) {
        if (androidx.compose.runtime.m0.l0()) {
            androidx.compose.runtime.m0.A0(-899469399, i10, -1, "androidx.compose.material3.IconButtonDefaults.outlinedIconButtonVibrantColors (IconButtonDefaults.kt:581)");
        }
        jh jhVarF = f(pj.f31758a.a(c0Var, 6));
        if (androidx.compose.runtime.m0.l0()) {
            androidx.compose.runtime.m0.z0();
        }
        return jhVarF;
    }

    @androidx.compose.runtime.o
    @NotNull
    public final jh K(long j10, long j11, long j12, long j13, @Nullable androidx.compose.runtime.c0 c0Var, int i10, int i11) {
        if ((i11 & 1) != 0) {
            j10 = androidx.compose.ui.graphics.q0.f38131b.u();
        }
        long jU = (i11 & 2) != 0 ? androidx.compose.ui.graphics.q0.f38131b.u() : j11;
        long jU2 = (i11 & 4) != 0 ? androidx.compose.ui.graphics.q0.f38131b.u() : j12;
        long jW = (i11 & 8) != 0 ? androidx.compose.ui.graphics.q0.w(jU, d0.w1.f269194a.c(), 0.0f, 0.0f, 0.0f, 14, null) : j13;
        if (androidx.compose.runtime.m0.l0()) {
            androidx.compose.runtime.m0.A0(-278201933, i10, -1, "androidx.compose.material3.IconButtonDefaults.outlinedIconButtonVibrantColors (IconButtonDefaults.kt:603)");
        }
        jh jhVarC = f(pj.f31758a.a(c0Var, 6)).c(j10, jU, jU2, jW);
        if (androidx.compose.runtime.m0.l0()) {
            androidx.compose.runtime.m0.z0();
        }
        return jhVarC;
    }

    @androidx.compose.runtime.o
    @Nullable
    public final androidx.compose.foundation.a1 L(boolean z10, boolean z11, @Nullable androidx.compose.runtime.c0 c0Var, int i10) {
        c0Var.E(1933433512);
        if (androidx.compose.runtime.m0.l0()) {
            androidx.compose.runtime.m0.A0(1933433512, i10, -1, "androidx.compose.material3.IconButtonDefaults.outlinedIconToggleButtonBorder (IconButtonDefaults.kt:786)");
        }
        if (z11) {
            if (androidx.compose.runtime.m0.l0()) {
                androidx.compose.runtime.m0.z0();
            }
            c0Var.A();
            return null;
        }
        androidx.compose.foundation.a1 a1VarF = F(z10, c0Var, (i10 & 14) | ((i10 >> 3) & com.planner5d.library.engine.input.f.b.B));
        if (androidx.compose.runtime.m0.l0()) {
            androidx.compose.runtime.m0.z0();
        }
        c0Var.A();
        return a1VarF;
    }

    @androidx.compose.runtime.o
    @NotNull
    public final oi M(@Nullable androidx.compose.runtime.c0 c0Var, int i10) {
        c0Var.E(-834376945);
        if (androidx.compose.runtime.m0.l0()) {
            androidx.compose.runtime.m0.A0(-834376945, i10, -1, "androidx.compose.material3.IconButtonDefaults.outlinedIconToggleButtonColors (IconButtonDefaults.kt:636)");
        }
        long jM = ((androidx.compose.ui.graphics.q0) c0Var.W(c7.a())).M();
        oi oiVarG = g(pj.f31758a.a(c0Var, 6), jM);
        if (androidx.compose.ui.graphics.q0.y(oiVarG.h(), jM)) {
            if (androidx.compose.runtime.m0.l0()) {
                androidx.compose.runtime.m0.z0();
            }
            c0Var.A();
            return oiVarG;
        }
        oi oiVarD = oi.d(oiVarG, 0L, jM, 0L, androidx.compose.ui.graphics.q0.w(jM, d0.w1.f269194a.c(), 0.0f, 0.0f, 0.0f, 14, null), 0L, 0L, 53, null);
        if (androidx.compose.runtime.m0.l0()) {
            androidx.compose.runtime.m0.z0();
        }
        c0Var.A();
        return oiVarD;
    }

    @androidx.compose.runtime.o
    @NotNull
    public final oi N(long j10, long j11, long j12, long j13, long j14, long j15, @Nullable androidx.compose.runtime.c0 c0Var, int i10, int i11) {
        long j16;
        long jW;
        long jU = (i11 & 1) != 0 ? androidx.compose.ui.graphics.q0.f38131b.u() : j10;
        long jM = (i11 & 2) != 0 ? ((androidx.compose.ui.graphics.q0) c0Var.W(c7.a())).M() : j11;
        long jU2 = (i11 & 4) != 0 ? androidx.compose.ui.graphics.q0.f38131b.u() : j12;
        if ((i11 & 8) != 0) {
            long j17 = jM;
            jW = androidx.compose.ui.graphics.q0.w(j17, d0.w1.f269194a.c(), 0.0f, 0.0f, 0.0f, 14, null);
            j16 = j17;
        } else {
            j16 = jM;
            jW = j13;
        }
        long jU3 = (i11 & 16) != 0 ? androidx.compose.ui.graphics.q0.f38131b.u() : j14;
        long jG = (i11 & 32) != 0 ? o6.g(jU3, c0Var, (i10 >> 12) & 14) : j15;
        if (androidx.compose.runtime.m0.l0()) {
            androidx.compose.runtime.m0.A0(-514625005, i10, -1, "androidx.compose.material3.IconButtonDefaults.outlinedIconToggleButtonColors (IconButtonDefaults.kt:675)");
        }
        oi oiVarC = g(pj.f31758a.a(c0Var, 6), ((androidx.compose.ui.graphics.q0) c0Var.W(c7.a())).M()).c(jU, j16, jU2, jW, jU3, jG);
        if (androidx.compose.runtime.m0.l0()) {
            androidx.compose.runtime.m0.z0();
        }
        return oiVarC;
    }

    @androidx.compose.runtime.o
    @Nullable
    public final androidx.compose.foundation.a1 O(boolean z10, boolean z11, @Nullable androidx.compose.runtime.c0 c0Var, int i10) {
        c0Var.E(394022990);
        if (androidx.compose.runtime.m0.l0()) {
            androidx.compose.runtime.m0.A0(394022990, i10, -1, "androidx.compose.material3.IconButtonDefaults.outlinedIconToggleButtonVibrantBorder (IconButtonDefaults.kt:801)");
        }
        if (z11) {
            if (androidx.compose.runtime.m0.l0()) {
                androidx.compose.runtime.m0.z0();
            }
            c0Var.A();
            return null;
        }
        androidx.compose.foundation.a1 a1VarI = I(z10, c0Var, (i10 & 14) | ((i10 >> 3) & com.planner5d.library.engine.input.f.b.B));
        if (androidx.compose.runtime.m0.l0()) {
            androidx.compose.runtime.m0.z0();
        }
        c0Var.A();
        return a1VarI;
    }

    @androidx.compose.runtime.o
    @NotNull
    public final oi P(@Nullable androidx.compose.runtime.c0 c0Var, int i10) {
        if (androidx.compose.runtime.m0.l0()) {
            androidx.compose.runtime.m0.A0(-1236236887, i10, -1, "androidx.compose.material3.IconButtonDefaults.outlinedIconToggleButtonVibrantColors (IconButtonDefaults.kt:719)");
        }
        oi oiVarH = h(pj.f31758a.a(c0Var, 6));
        if (androidx.compose.runtime.m0.l0()) {
            androidx.compose.runtime.m0.z0();
        }
        return oiVarH;
    }

    @androidx.compose.runtime.o
    @NotNull
    public final oi Q(long j10, long j11, long j12, long j13, long j14, long j15, @Nullable androidx.compose.runtime.c0 c0Var, int i10, int i11) {
        long j16;
        long jW;
        long jU = (i11 & 1) != 0 ? androidx.compose.ui.graphics.q0.f38131b.u() : j10;
        long jU2 = (i11 & 2) != 0 ? androidx.compose.ui.graphics.q0.f38131b.u() : j11;
        long jU3 = (i11 & 4) != 0 ? androidx.compose.ui.graphics.q0.f38131b.u() : j12;
        if ((i11 & 8) != 0) {
            long j17 = jU2;
            jW = androidx.compose.ui.graphics.q0.w(j17, d0.w1.f269194a.c(), 0.0f, 0.0f, 0.0f, 14, null);
            j16 = j17;
        } else {
            j16 = jU2;
            jW = j13;
        }
        long jU4 = (i11 & 16) != 0 ? androidx.compose.ui.graphics.q0.f38131b.u() : j14;
        long jG = (i11 & 32) != 0 ? o6.g(jU4, c0Var, (i10 >> 12) & 14) : j15;
        if (androidx.compose.runtime.m0.l0()) {
            androidx.compose.runtime.m0.A0(-142016199, i10, -1, "androidx.compose.material3.IconButtonDefaults.outlinedIconToggleButtonVibrantColors (IconButtonDefaults.kt:745)");
        }
        oi oiVarC = h(pj.f31758a.a(c0Var, 6)).c(jU, j16, jU3, jW, jU4, jG);
        if (androidx.compose.runtime.m0.l0()) {
            androidx.compose.runtime.m0.z0();
        }
        return oiVarC;
    }

    public final long R(int i10) {
        float fR;
        a.C0244a c0244a = a.f30053b;
        if (a.g(i10, c0244a.a())) {
            d0.n2 n2Var = d0.n2.f268546a;
            fR = androidx.compose.ui.unit.h.r(n2Var.g() + n2Var.h());
        } else if (a.g(i10, c0244a.b())) {
            d0.n2 n2Var2 = d0.n2.f268546a;
            fR = androidx.compose.ui.unit.h.r(n2Var2.d() + n2Var2.d());
        } else if (a.g(i10, c0244a.c())) {
            d0.n2 n2Var3 = d0.n2.f268546a;
            fR = androidx.compose.ui.unit.h.r(n2Var3.m() + n2Var3.n());
        } else {
            fR = androidx.compose.ui.unit.h.r(0);
        }
        d0.n2 n2Var4 = d0.n2.f268546a;
        return androidx.compose.ui.unit.i.b(androidx.compose.ui.unit.h.r(n2Var4.f() + fR), n2Var4.a());
    }

    @NotNull
    public final jh a(@NotNull l6 l6Var, long j10) {
        jh jhVarY = l6Var.y();
        if (jhVarY != null) {
            return jhVarY;
        }
        androidx.compose.ui.graphics.q0.a aVar = androidx.compose.ui.graphics.q0.f38131b;
        jh jhVar = new jh(aVar.s(), j10, aVar.s(), androidx.compose.ui.graphics.q0.w(j10, d0.u2.f269054a.c(), 0.0f, 0.0f, 0.0f, 14, null), null);
        l6Var.q1(jhVar);
        return jhVar;
    }

    @NotNull
    public final jh b(@NotNull l6 l6Var) {
        jh jhVarZ = l6Var.z();
        if (jhVarZ != null) {
            return jhVarZ;
        }
        androidx.compose.ui.graphics.q0.a aVar = androidx.compose.ui.graphics.q0.f38131b;
        long jS = aVar.s();
        d0.u2 u2Var = d0.u2.f269054a;
        jh jhVar = new jh(jS, o6.o(l6Var, u2Var.a()), aVar.s(), androidx.compose.ui.graphics.q0.w(o6.o(l6Var, u2Var.b()), u2Var.c(), 0.0f, 0.0f, 0.0f, 14, null), null);
        l6Var.r1(jhVar);
        return jhVar;
    }

    @NotNull
    public final oi c(@NotNull l6 l6Var, long j10) {
        oi oiVarA = l6Var.A();
        if (oiVarA != null) {
            return oiVarA;
        }
        androidx.compose.ui.graphics.q0.a aVar = androidx.compose.ui.graphics.q0.f38131b;
        long jS = aVar.s();
        long jS2 = aVar.s();
        d0.u2 u2Var = d0.u2.f269054a;
        oi oiVar = new oi(jS, j10, jS2, androidx.compose.ui.graphics.q0.w(j10, u2Var.c(), 0.0f, 0.0f, 0.0f, 14, null), aVar.s(), o6.o(l6Var, u2Var.g()), null);
        l6Var.s1(oiVar);
        return oiVar;
    }

    @NotNull
    public final oi d(@NotNull l6 l6Var) {
        oi oiVarB = l6Var.B();
        if (oiVarB != null) {
            return oiVarB;
        }
        androidx.compose.ui.graphics.q0.a aVar = androidx.compose.ui.graphics.q0.f38131b;
        long jS = aVar.s();
        d0.u2 u2Var = d0.u2.f269054a;
        oi oiVar = new oi(jS, o6.o(l6Var, u2Var.k()), aVar.s(), androidx.compose.ui.graphics.q0.w(o6.o(l6Var, u2Var.b()), u2Var.c(), 0.0f, 0.0f, 0.0f, 14, null), aVar.s(), o6.o(l6Var, u2Var.g()), null);
        l6Var.t1(oiVar);
        return oiVar;
    }

    @NotNull
    public final jh e(@NotNull l6 l6Var, long j10) {
        jh jhVarJ = l6Var.J();
        if (jhVarJ != null) {
            return jhVarJ;
        }
        androidx.compose.ui.graphics.q0.a aVar = androidx.compose.ui.graphics.q0.f38131b;
        jh jhVar = new jh(aVar.s(), j10, aVar.s(), androidx.compose.ui.graphics.q0.w(j10, d0.w1.f269194a.c(), 0.0f, 0.0f, 0.0f, 14, null), null);
        l6Var.B1(jhVar);
        return jhVar;
    }

    @NotNull
    public final jh f(@NotNull l6 l6Var) {
        jh jhVarK = l6Var.K();
        if (jhVarK != null) {
            return jhVarK;
        }
        androidx.compose.ui.graphics.q0.a aVar = androidx.compose.ui.graphics.q0.f38131b;
        long jS = aVar.s();
        d0.w1 w1Var = d0.w1.f269194a;
        jh jhVar = new jh(jS, o6.o(l6Var, w1Var.a()), aVar.s(), androidx.compose.ui.graphics.q0.w(o6.o(l6Var, w1Var.b()), w1Var.c(), 0.0f, 0.0f, 0.0f, 14, null), null);
        l6Var.C1(jhVar);
        return jhVar;
    }

    @NotNull
    public final oi g(@NotNull l6 l6Var, long j10) {
        oi oiVarA = l6Var.A();
        if (oiVarA != null) {
            return oiVarA;
        }
        androidx.compose.ui.graphics.q0.a aVar = androidx.compose.ui.graphics.q0.f38131b;
        long jS = aVar.s();
        long jS2 = aVar.s();
        d0.w1 w1Var = d0.w1.f269194a;
        oi oiVar = new oi(jS, j10, jS2, androidx.compose.ui.graphics.q0.w(j10, w1Var.c(), 0.0f, 0.0f, 0.0f, 14, null), o6.o(l6Var, w1Var.j()), o6.f(l6Var, o6.o(l6Var, w1Var.j())), null);
        l6Var.D1(oiVar);
        return oiVar;
    }

    @NotNull
    public final oi h(@NotNull l6 l6Var) {
        oi oiVarM = l6Var.M();
        if (oiVarM != null) {
            return oiVarM;
        }
        androidx.compose.ui.graphics.q0.a aVar = androidx.compose.ui.graphics.q0.f38131b;
        long jS = aVar.s();
        d0.w1 w1Var = d0.w1.f269194a;
        oi oiVar = new oi(jS, o6.o(l6Var, w1Var.p()), aVar.s(), androidx.compose.ui.graphics.q0.w(o6.o(l6Var, w1Var.b()), w1Var.c(), 0.0f, 0.0f, 0.0f, 14, null), o6.o(l6Var, w1Var.j()), o6.o(l6Var, w1Var.i()), null);
        l6Var.D1(oiVar);
        return oiVar;
    }

    @androidx.compose.runtime.o
    @NotNull
    public final jh i(@Nullable androidx.compose.runtime.c0 c0Var, int i10) {
        if (androidx.compose.runtime.m0.l0()) {
            androidx.compose.runtime.m0.A0(-958304265, i10, -1, "androidx.compose.material3.IconButtonDefaults.filledIconButtonColors (IconButtonDefaults.kt:300)");
        }
        jh jhVarQ = q(pj.f31758a.a(c0Var, 6));
        if (androidx.compose.runtime.m0.l0()) {
            androidx.compose.runtime.m0.z0();
        }
        return jhVarQ;
    }

    @androidx.compose.runtime.o
    @NotNull
    public final jh j(long j10, long j11, long j12, long j13, @Nullable androidx.compose.runtime.c0 c0Var, int i10, int i11) {
        if ((i11 & 1) != 0) {
            j10 = androidx.compose.ui.graphics.q0.f38131b.u();
        }
        if ((i11 & 2) != 0) {
            j11 = o6.g(j10, c0Var, i10 & 14);
        }
        if ((i11 & 4) != 0) {
            j12 = androidx.compose.ui.graphics.q0.f38131b.u();
        }
        if ((i11 & 8) != 0) {
            j13 = androidx.compose.ui.graphics.q0.f38131b.u();
        }
        if (androidx.compose.runtime.m0.l0()) {
            androidx.compose.runtime.m0.A0(-245481051, i10, -1, "androidx.compose.material3.IconButtonDefaults.filledIconButtonColors (IconButtonDefaults.kt:317)");
        }
        long j14 = j11;
        long j15 = j10;
        jh jhVarC = q(pj.f31758a.a(c0Var, 6)).c(j15, j14, j12, j13);
        if (androidx.compose.runtime.m0.l0()) {
            androidx.compose.runtime.m0.z0();
        }
        return jhVarC;
    }

    @androidx.compose.runtime.o
    @NotNull
    public final oi k(@Nullable androidx.compose.runtime.c0 c0Var, int i10) {
        if (androidx.compose.runtime.m0.l0()) {
            androidx.compose.runtime.m0.A0(-1455160689, i10, -1, "androidx.compose.material3.IconButtonDefaults.filledIconToggleButtonColors (IconButtonDefaults.kt:346)");
        }
        oi oiVarR = r(pj.f31758a.a(c0Var, 6));
        if (androidx.compose.runtime.m0.l0()) {
            androidx.compose.runtime.m0.z0();
        }
        return oiVarR;
    }

    @androidx.compose.runtime.o
    @NotNull
    public final oi l(long j10, long j11, long j12, long j13, long j14, long j15, @Nullable androidx.compose.runtime.c0 c0Var, int i10, int i11) {
        long jU = (i11 & 1) != 0 ? androidx.compose.ui.graphics.q0.f38131b.u() : j10;
        long jU2 = (i11 & 2) != 0 ? androidx.compose.ui.graphics.q0.f38131b.u() : j11;
        long jU3 = (i11 & 4) != 0 ? androidx.compose.ui.graphics.q0.f38131b.u() : j12;
        long jU4 = (i11 & 8) != 0 ? androidx.compose.ui.graphics.q0.f38131b.u() : j13;
        long jU5 = (i11 & 16) != 0 ? androidx.compose.ui.graphics.q0.f38131b.u() : j14;
        long jG = (i11 & 32) != 0 ? o6.g(jU5, c0Var, (i10 >> 12) & 14) : j15;
        if (androidx.compose.runtime.m0.l0()) {
            androidx.compose.runtime.m0.A0(1473292947, i10, -1, "androidx.compose.material3.IconButtonDefaults.filledIconToggleButtonColors (IconButtonDefaults.kt:370)");
        }
        oi oiVarC = r(pj.f31758a.a(c0Var, 6)).c(jU, jU2, jU3, jU4, jU5, jG);
        if (androidx.compose.runtime.m0.l0()) {
            androidx.compose.runtime.m0.z0();
        }
        return oiVarC;
    }

    @androidx.compose.runtime.o
    @NotNull
    public final jh m(@Nullable androidx.compose.runtime.c0 c0Var, int i10) {
        if (androidx.compose.runtime.m0.l0()) {
            androidx.compose.runtime.m0.A0(1145002745, i10, -1, "androidx.compose.material3.IconButtonDefaults.filledTonalIconButtonColors (IconButtonDefaults.kt:407)");
        }
        jh jhVarS = s(pj.f31758a.a(c0Var, 6));
        if (androidx.compose.runtime.m0.l0()) {
            androidx.compose.runtime.m0.z0();
        }
        return jhVarS;
    }

    @androidx.compose.runtime.o
    @NotNull
    public final jh n(long j10, long j11, long j12, long j13, @Nullable androidx.compose.runtime.c0 c0Var, int i10, int i11) {
        if ((i11 & 1) != 0) {
            j10 = androidx.compose.ui.graphics.q0.f38131b.u();
        }
        if ((i11 & 2) != 0) {
            j11 = o6.g(j10, c0Var, i10 & 14);
        }
        if ((i11 & 4) != 0) {
            j12 = androidx.compose.ui.graphics.q0.f38131b.u();
        }
        if ((i11 & 8) != 0) {
            j13 = androidx.compose.ui.graphics.q0.f38131b.u();
        }
        if (androidx.compose.runtime.m0.l0()) {
            androidx.compose.runtime.m0.A0(562762851, i10, -1, "androidx.compose.material3.IconButtonDefaults.filledTonalIconButtonColors (IconButtonDefaults.kt:425)");
        }
        long j14 = j11;
        long j15 = j10;
        jh jhVarC = s(pj.f31758a.a(c0Var, 6)).c(j15, j14, j12, j13);
        if (androidx.compose.runtime.m0.l0()) {
            androidx.compose.runtime.m0.z0();
        }
        return jhVarC;
    }

    @androidx.compose.runtime.o
    @NotNull
    public final oi o(@Nullable androidx.compose.runtime.c0 c0Var, int i10) {
        if (androidx.compose.runtime.m0.l0()) {
            androidx.compose.runtime.m0.A0(656374417, i10, -1, "androidx.compose.material3.IconButtonDefaults.filledTonalIconToggleButtonColors (IconButtonDefaults.kt:454)");
        }
        oi oiVarT = t(pj.f31758a.a(c0Var, 6));
        if (androidx.compose.runtime.m0.l0()) {
            androidx.compose.runtime.m0.z0();
        }
        return oiVarT;
    }

    @androidx.compose.runtime.o
    @NotNull
    public final oi p(long j10, long j11, long j12, long j13, long j14, long j15, @Nullable androidx.compose.runtime.c0 c0Var, int i10, int i11) {
        long jU = (i11 & 1) != 0 ? androidx.compose.ui.graphics.q0.f38131b.u() : j10;
        long jG = (i11 & 2) != 0 ? o6.g(jU, c0Var, i10 & 14) : j11;
        long jU2 = (i11 & 4) != 0 ? androidx.compose.ui.graphics.q0.f38131b.u() : j12;
        long jU3 = (i11 & 8) != 0 ? androidx.compose.ui.graphics.q0.f38131b.u() : j13;
        long jU4 = (i11 & 16) != 0 ? androidx.compose.ui.graphics.q0.f38131b.u() : j14;
        long jG2 = (i11 & 32) != 0 ? o6.g(jU4, c0Var, (i10 >> 12) & 14) : j15;
        if (androidx.compose.runtime.m0.l0()) {
            androidx.compose.runtime.m0.A0(2130748241, i10, -1, "androidx.compose.material3.IconButtonDefaults.filledTonalIconToggleButtonColors (IconButtonDefaults.kt:476)");
        }
        oi oiVarC = t(pj.f31758a.a(c0Var, 6)).c(jU, jG, jU2, jU3, jU4, jG2);
        if (androidx.compose.runtime.m0.l0()) {
            androidx.compose.runtime.m0.z0();
        }
        return oiVarC;
    }

    @NotNull
    public final jh q(@NotNull l6 l6Var) {
        jh jhVarS = l6Var.s();
        if (jhVarS != null) {
            return jhVarS;
        }
        d0.u0 u0Var = d0.u0.f269007a;
        jh jhVar = new jh(o6.o(l6Var, u0Var.b()), o6.o(l6Var, u0Var.a()), androidx.compose.ui.graphics.q0.w(o6.o(l6Var, u0Var.d()), u0Var.e(), 0.0f, 0.0f, 0.0f, 14, null), androidx.compose.ui.graphics.q0.w(o6.o(l6Var, u0Var.c()), u0Var.f(), 0.0f, 0.0f, 0.0f, 14, null), null);
        l6Var.k1(jhVar);
        return jhVar;
    }

    @NotNull
    public final oi r(@NotNull l6 l6Var) {
        oi oiVarT = l6Var.t();
        if (oiVarT != null) {
            return oiVarT;
        }
        d0.u0 u0Var = d0.u0.f269007a;
        oi oiVar = new oi(o6.o(l6Var, u0Var.p()), o6.o(l6Var, u0Var.o()), androidx.compose.ui.graphics.q0.w(o6.o(l6Var, u0Var.d()), u0Var.e(), 0.0f, 0.0f, 0.0f, 14, null), androidx.compose.ui.graphics.q0.w(o6.o(l6Var, u0Var.c()), u0Var.f(), 0.0f, 0.0f, 0.0f, 14, null), o6.o(l6Var, u0Var.k()), o6.o(l6Var, u0Var.j()), null);
        l6Var.l1(oiVar);
        return oiVar;
    }

    @NotNull
    public final jh s(@NotNull l6 l6Var) {
        jh jhVarV = l6Var.v();
        if (jhVarV != null) {
            return jhVarV;
        }
        d0.x0 x0Var = d0.x0.f269249a;
        jh jhVar = new jh(o6.o(l6Var, x0Var.b()), o6.o(l6Var, x0Var.a()), androidx.compose.ui.graphics.q0.w(o6.o(l6Var, x0Var.d()), x0Var.e(), 0.0f, 0.0f, 0.0f, 14, null), androidx.compose.ui.graphics.q0.w(o6.o(l6Var, x0Var.c()), x0Var.f(), 0.0f, 0.0f, 0.0f, 14, null), null);
        l6Var.n1(jhVar);
        return jhVar;
    }

    @NotNull
    public final oi t(@NotNull l6 l6Var) {
        oi oiVarW = l6Var.w();
        if (oiVarW != null) {
            return oiVarW;
        }
        d0.x0 x0Var = d0.x0.f269249a;
        oi oiVar = new oi(o6.o(l6Var, x0Var.p()), o6.o(l6Var, x0Var.o()), androidx.compose.ui.graphics.q0.w(o6.o(l6Var, x0Var.d()), x0Var.e(), 0.0f, 0.0f, 0.0f, 14, null), androidx.compose.ui.graphics.q0.w(o6.o(l6Var, x0Var.c()), x0Var.f(), 0.0f, 0.0f, 0.0f, 14, null), o6.o(l6Var, x0Var.k()), o6.o(l6Var, x0Var.j()), null);
        l6Var.o1(oiVar);
        return oiVar;
    }

    @androidx.compose.runtime.o
    @oj.i(name = "getFilledShape")
    @NotNull
    public final androidx.compose.ui.graphics.q3 u(@Nullable androidx.compose.runtime.c0 c0Var, int i10) {
        if (androidx.compose.runtime.m0.l0()) {
            androidx.compose.runtime.m0.A0(1542796069, i10, -1, "androidx.compose.material3.IconButtonDefaults.<get-filledShape> (IconButtonDefaults.kt:853)");
        }
        androidx.compose.ui.graphics.q3 q3VarI = cx.i(d0.n2.f268546a.b(), c0Var, 6);
        if (androidx.compose.runtime.m0.l0()) {
            androidx.compose.runtime.m0.z0();
        }
        return q3VarI;
    }

    @androidx.compose.runtime.o
    @oj.i(name = "getOutlinedShape")
    @NotNull
    public final androidx.compose.ui.graphics.q3 v(@Nullable androidx.compose.runtime.c0 c0Var, int i10) {
        if (androidx.compose.runtime.m0.l0()) {
            int i11 = 2 | (-1);
            androidx.compose.runtime.m0.A0(-1706356635, i10, -1, "androidx.compose.material3.IconButtonDefaults.<get-outlinedShape> (IconButtonDefaults.kt:857)");
        }
        androidx.compose.ui.graphics.q3 q3VarI = cx.i(d0.n2.f268546a.b(), c0Var, 6);
        if (androidx.compose.runtime.m0.l0()) {
            androidx.compose.runtime.m0.z0();
        }
        return q3VarI;
    }

    @androidx.compose.runtime.o
    @oj.i(name = "getStandardShape")
    @NotNull
    public final androidx.compose.ui.graphics.q3 w(@Nullable androidx.compose.runtime.c0 c0Var, int i10) {
        if (androidx.compose.runtime.m0.l0()) {
            androidx.compose.runtime.m0.A0(-377108005, i10, -1, "androidx.compose.material3.IconButtonDefaults.<get-standardShape> (IconButtonDefaults.kt:849)");
        }
        androidx.compose.ui.graphics.q3 q3VarI = cx.i(d0.n2.f268546a.b(), c0Var, 6);
        if (androidx.compose.runtime.m0.l0()) {
            androidx.compose.runtime.m0.z0();
        }
        return q3VarI;
    }

    @androidx.compose.runtime.o
    @NotNull
    public final jh x(@Nullable androidx.compose.runtime.c0 c0Var, int i10) {
        if (androidx.compose.runtime.m0.l0()) {
            androidx.compose.runtime.m0.A0(-1037266503, i10, -1, "androidx.compose.material3.IconButtonDefaults.iconButtonColors (IconButtonDefaults.kt:42)");
        }
        long jM = ((androidx.compose.ui.graphics.q0) c0Var.W(c7.a())).M();
        int i11 = 2 << 6;
        jh jhVarA = a(pj.f31758a.a(c0Var, 6), jM);
        if (!androidx.compose.ui.graphics.q0.y(jhVarA.f(), jM)) {
            jhVarA = jh.d(jhVarA, 0L, jM, 0L, androidx.compose.ui.graphics.q0.w(jM, d0.u2.f269054a.c(), 0.0f, 0.0f, 0.0f, 14, null), 5, null);
        }
        if (androidx.compose.runtime.m0.l0()) {
            androidx.compose.runtime.m0.z0();
        }
        return jhVarA;
    }

    @androidx.compose.runtime.o
    @NotNull
    public final jh y(long j10, long j11, long j12, long j13, @Nullable androidx.compose.runtime.c0 c0Var, int i10, int i11) {
        if ((i11 & 1) != 0) {
            j10 = androidx.compose.ui.graphics.q0.f38131b.u();
        }
        long jM = (i11 & 2) != 0 ? ((androidx.compose.ui.graphics.q0) c0Var.W(c7.a())).M() : j11;
        long jU = (i11 & 4) != 0 ? androidx.compose.ui.graphics.q0.f38131b.u() : j12;
        long jW = (i11 & 8) != 0 ? androidx.compose.ui.graphics.q0.w(jM, d0.u2.f269054a.c(), 0.0f, 0.0f, 0.0f, 14, null) : j13;
        if (androidx.compose.runtime.m0.l0()) {
            androidx.compose.runtime.m0.A0(-1639168605, i10, -1, "androidx.compose.material3.IconButtonDefaults.iconButtonColors (IconButtonDefaults.kt:78)");
        }
        jh jhVarC = a(pj.f31758a.a(c0Var, 6), ((androidx.compose.ui.graphics.q0) c0Var.W(c7.a())).M()).c(j10, jM, jU, jW);
        if (androidx.compose.runtime.m0.l0()) {
            androidx.compose.runtime.m0.z0();
        }
        return jhVarC;
    }

    @androidx.compose.runtime.o
    @NotNull
    public final jh z(@Nullable androidx.compose.runtime.c0 c0Var, int i10) {
        if (androidx.compose.runtime.m0.l0()) {
            androidx.compose.runtime.m0.A0(111454247, i10, -1, "androidx.compose.material3.IconButtonDefaults.iconButtonVibrantColors (IconButtonDefaults.kt:110)");
        }
        jh jhVarB = b(pj.f31758a.a(c0Var, 6));
        if (androidx.compose.runtime.m0.l0()) {
            androidx.compose.runtime.m0.z0();
        }
        return jhVarB;
    }
}
