package androidx.compose.material3;

import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes.dex */
@androidx.compose.runtime.internal.w0(parameters = 1)
@SourceDebugExtension({"SMAP\nAppBarDsl.kt\nKotlin\n*S Kotlin\n*F\n+ 1 AppBarDsl.kt\nandroidx/compose/material3/ClickableAppBarItem\n+ 2 Composer.kt\nandroidx/compose/runtime/ComposerKt\n*L\n1#1,403:1\n1282#2,6:404\n*S KotlinDebug\n*F\n+ 1 AppBarDsl.kt\nandroidx/compose/material3/ClickableAppBarItem\n*L\n176#1:404,6\n*E\n"})
public final class d6 implements b0 {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final int f27027e = 0;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    private final Function0<Unit> f27028a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NotNull
    private final Function2<androidx.compose.runtime.c0, Integer, Unit> f27029b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final boolean f27030c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @NotNull
    private final String f27031d;

    static final class a implements pj.n<k90, androidx.compose.runtime.c0, Integer, Unit> {

        /* JADX INFO: renamed from: androidx.compose.material3.d6$a$a, reason: collision with other inner class name */
        static final class C0214a implements Function2<androidx.compose.runtime.c0, Integer, Unit> {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            final /* synthetic */ d6 f27033a;

            C0214a(d6 d6Var) {
                this.f27033a = d6Var;
            }

            @androidx.compose.runtime.o
            @androidx.compose.runtime.t(applier = "androidx.compose.ui.UiComposable")
            public final void c(androidx.compose.runtime.c0 c0Var, int i10) {
                if (!c0Var.h((i10 & 3) != 2, i10 & 1)) {
                    c0Var.u();
                    return;
                }
                if (androidx.compose.runtime.m0.l0()) {
                    androidx.compose.runtime.m0.A0(837175745, i10, -1, "androidx.compose.material3.ClickableAppBarItem.AppbarContent.<anonymous>.<anonymous> (AppBarDsl.kt:163)");
                }
                q50.t(this.f27033a.f27031d, null, 0L, null, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, null, c0Var, 0, 0, 262142);
                if (androidx.compose.runtime.m0.l0()) {
                    androidx.compose.runtime.m0.z0();
                }
            }

            @Override // kotlin.jvm.functions.Function2
            public /* bridge */ /* synthetic */ Unit invoke(androidx.compose.runtime.c0 c0Var, Integer num) {
                c(c0Var, num.intValue());
                return Unit.f312394a;
            }
        }

        a() {
        }

        @androidx.compose.runtime.o
        @androidx.compose.runtime.t(applier = "androidx.compose.ui.UiComposable")
        public final void c(k90 k90Var, androidx.compose.runtime.c0 c0Var, int i10) {
            int i11;
            if ((i10 & 6) == 0) {
                i11 = i10 | ((i10 & 8) == 0 ? c0Var.D(k90Var) : c0Var.k0(k90Var) ? 4 : 2);
            } else {
                i11 = i10;
            }
            if (!c0Var.h((i11 & 19) != 18, i11 & 1)) {
                c0Var.u();
                return;
            }
            if (androidx.compose.runtime.m0.l0()) {
                androidx.compose.runtime.m0.A0(-816691117, i11, -1, "androidx.compose.material3.ClickableAppBarItem.AppbarContent.<anonymous> (AppBarDsl.kt:163)");
            }
            h90.m(k90Var, null, null, 0.0f, null, 0L, 0L, 0.0f, 0.0f, androidx.compose.runtime.internal.w.e(837175745, true, new C0214a(d6.this), c0Var, 54), c0Var, (i11 & 14) | 805306368, 255);
            if (androidx.compose.runtime.m0.l0()) {
                androidx.compose.runtime.m0.z0();
            }
        }

        @Override // pj.n
        public /* bridge */ /* synthetic */ Unit invoke(k90 k90Var, androidx.compose.runtime.c0 c0Var, Integer num) {
            c(k90Var, c0Var, num.intValue());
            return Unit.f312394a;
        }
    }

    static final class b implements Function2<androidx.compose.runtime.c0, Integer, Unit> {
        b() {
        }

        @androidx.compose.runtime.o
        @androidx.compose.runtime.t(applier = "androidx.compose.ui.UiComposable")
        public final void c(androidx.compose.runtime.c0 c0Var, int i10) {
            boolean z10;
            if ((i10 & 3) != 2) {
                z10 = true;
                int i11 = 3 & 1;
            } else {
                z10 = false;
            }
            if (!c0Var.h(z10, i10 & 1)) {
                c0Var.u();
                return;
            }
            if (androidx.compose.runtime.m0.l0()) {
                androidx.compose.runtime.m0.A0(-592360853, i10, -1, "androidx.compose.material3.ClickableAppBarItem.AppbarContent.<anonymous> (AppBarDsl.kt:166)");
            }
            ei.D(d6.this.f27028a, null, d6.this.f27030c, null, null, null, d6.this.f27029b, c0Var, 0, 58);
            if (androidx.compose.runtime.m0.l0()) {
                androidx.compose.runtime.m0.z0();
            }
        }

        @Override // kotlin.jvm.functions.Function2
        public /* bridge */ /* synthetic */ Unit invoke(androidx.compose.runtime.c0 c0Var, Integer num) {
            c(c0Var, num.intValue());
            return Unit.f312394a;
        }
    }

    static final class c implements Function2<androidx.compose.runtime.c0, Integer, Unit> {
        c() {
        }

        @androidx.compose.runtime.o
        @androidx.compose.runtime.t(applier = "androidx.compose.ui.UiComposable")
        public final void c(androidx.compose.runtime.c0 c0Var, int i10) {
            if (!c0Var.h((i10 & 3) != 2, i10 & 1)) {
                c0Var.u();
                return;
            }
            if (androidx.compose.runtime.m0.l0()) {
                androidx.compose.runtime.m0.A0(900574477, i10, -1, "androidx.compose.material3.ClickableAppBarItem.MenuContent.<anonymous> (AppBarDsl.kt:174)");
            }
            q50.t(d6.this.f27031d, null, 0L, null, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, null, c0Var, 0, 0, 262142);
            if (androidx.compose.runtime.m0.l0()) {
                androidx.compose.runtime.m0.z0();
            }
        }

        @Override // kotlin.jvm.functions.Function2
        public /* bridge */ /* synthetic */ Unit invoke(androidx.compose.runtime.c0 c0Var, Integer num) {
            c(c0Var, num.intValue());
            return Unit.f312394a;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public d6(@NotNull Function0<Unit> function0, @NotNull Function2<? super androidx.compose.runtime.c0, ? super Integer, Unit> function2, boolean z10, @NotNull String str) {
        this.f27028a = function0;
        this.f27029b = function2;
        this.f27030c = z10;
        this.f27031d = str;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit f(d6 d6Var, int i10, androidx.compose.runtime.c0 c0Var, int i11) {
        d6Var.b(c0Var, androidx.compose.runtime.t4.a(i10 | 1));
        return Unit.f312394a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit g(d6 d6Var, p1 p1Var) {
        d6Var.f27028a.invoke();
        p1Var.a();
        return Unit.f312394a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit h(d6 d6Var, p1 p1Var, int i10, androidx.compose.runtime.c0 c0Var, int i11) {
        d6Var.a(p1Var, c0Var, androidx.compose.runtime.t4.a(i10 | 1));
        return Unit.f312394a;
    }

    @Override // androidx.compose.material3.b0
    @androidx.compose.runtime.o
    @androidx.compose.runtime.t(applier = "androidx.compose.ui.UiComposable")
    public void a(@NotNull final p1 p1Var, @Nullable androidx.compose.runtime.c0 c0Var, final int i10) {
        int i11;
        androidx.compose.runtime.c0 c0VarR = c0Var.R(-791598787);
        if ((i10 & 6) == 0) {
            i11 = (c0VarR.D(p1Var) ? 4 : 2) | i10;
        } else {
            i11 = i10;
        }
        if ((i10 & 48) == 0) {
            i11 |= c0VarR.D(this) ? 32 : 16;
        }
        if (c0VarR.h((i11 & 19) != 18, i11 & 1)) {
            if (androidx.compose.runtime.m0.l0()) {
                androidx.compose.runtime.m0.A0(-791598787, i11, -1, "androidx.compose.material3.ClickableAppBarItem.MenuContent (AppBarDsl.kt:171)");
            }
            boolean z10 = false;
            boolean z11 = this.f27030c;
            androidx.compose.runtime.internal.c cVarE = androidx.compose.runtime.internal.w.e(900574477, true, new c(), c0VarR, 54);
            boolean z12 = (i11 & com.planner5d.library.engine.input.f.b.B) == 32;
            if ((i11 & 14) == 4) {
                z10 = true;
            }
            boolean z13 = z10 | z12;
            Object objI0 = c0VarR.i0();
            if (z13 || objI0 == androidx.compose.runtime.c0.f35327a.a()) {
                objI0 = new Function0() { // from class: androidx.compose.material3.a6
                    @Override // kotlin.jvm.functions.Function0
                    public final Object invoke() {
                        return d6.g(this.f25974a, p1Var);
                    }
                };
                c0VarR.Y(objI0);
            }
            r.i(cVarE, (Function0) objI0, null, null, null, z11, null, null, null, c0VarR, 6, 476);
            if (androidx.compose.runtime.m0.l0()) {
                androidx.compose.runtime.m0.z0();
            }
        } else {
            c0VarR.u();
        }
        androidx.compose.runtime.s5 s5VarT = c0VarR.T();
        if (s5VarT != null) {
            s5VarT.a(new Function2() { // from class: androidx.compose.material3.b6
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    return d6.h(this.f26204a, p1Var, i10, (androidx.compose.runtime.c0) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    @Override // androidx.compose.material3.b0
    @androidx.compose.runtime.o
    @androidx.compose.runtime.t(applier = "androidx.compose.ui.UiComposable")
    public void b(@Nullable androidx.compose.runtime.c0 c0Var, final int i10) {
        int i11;
        androidx.compose.runtime.c0 c0VarR = c0Var.R(-1170649368);
        if ((i10 & 6) == 0) {
            i11 = (c0VarR.D(this) ? 4 : 2) | i10;
        } else {
            i11 = i10;
        }
        if (c0VarR.h((i11 & 3) != 2, i11 & 1)) {
            if (androidx.compose.runtime.m0.l0()) {
                androidx.compose.runtime.m0.A0(-1170649368, i11, -1, "androidx.compose.material3.ClickableAppBarItem.AppbarContent (AppBarDsl.kt:158)");
            }
            h90.x(u80.f33535a.o(s80.f32838b.a(), 0.0f, c0VarR, 390, 2), androidx.compose.runtime.internal.w.e(-816691117, true, new a(), c0VarR, 54), h90.S(false, false, null, c0VarR, 0, 7), null, null, false, false, false, androidx.compose.runtime.internal.w.e(-592360853, true, new b(), c0VarR, 54), c0VarR, 100663344, com.planner5d.library.engine.input.f.b.R1);
            c0VarR = c0VarR;
            if (androidx.compose.runtime.m0.l0()) {
                androidx.compose.runtime.m0.z0();
            }
        } else {
            c0VarR.u();
        }
        androidx.compose.runtime.s5 s5VarT = c0VarR.T();
        if (s5VarT != null) {
            s5VarT.a(new Function2() { // from class: androidx.compose.material3.c6
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    return d6.f(this.f26479a, i10, (androidx.compose.runtime.c0) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }
}
