package androidx.compose.material3;

import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes.dex */
@androidx.compose.runtime.internal.w0(parameters = 1)
@SourceDebugExtension({"SMAP\nAppBarDsl.kt\nKotlin\n*S Kotlin\n*F\n+ 1 AppBarDsl.kt\nandroidx/compose/material3/ToggleableAppBarItem\n+ 2 Composer.kt\nandroidx/compose/runtime/ComposerKt\n*L\n1#1,403:1\n1282#2,6:404\n*S KotlinDebug\n*F\n+ 1 AppBarDsl.kt\nandroidx/compose/material3/ToggleableAppBarItem\n*L\n216#1:404,6\n*E\n"})
public final class p80 implements b0 {

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final int f31694f = 0;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final boolean f31695a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NotNull
    private final Function1<Boolean, Unit> f31696b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @NotNull
    private final Function2<androidx.compose.runtime.c0, Integer, Unit> f31697c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final boolean f31698d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    @NotNull
    private final String f31699e;

    static final class a implements pj.n<k90, androidx.compose.runtime.c0, Integer, Unit> {

        /* JADX INFO: renamed from: androidx.compose.material3.p80$a$a, reason: collision with other inner class name */
        static final class C0249a implements Function2<androidx.compose.runtime.c0, Integer, Unit> {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            final /* synthetic */ p80 f31701a;

            C0249a(p80 p80Var) {
                this.f31701a = p80Var;
            }

            @androidx.compose.runtime.o
            @androidx.compose.runtime.t(applier = "androidx.compose.ui.UiComposable")
            public final void c(androidx.compose.runtime.c0 c0Var, int i10) {
                if (!c0Var.h((i10 & 3) != 2, i10 & 1)) {
                    c0Var.u();
                    return;
                }
                if (androidx.compose.runtime.m0.l0()) {
                    androidx.compose.runtime.m0.A0(2059984663, i10, -1, "androidx.compose.material3.ToggleableAppBarItem.AppbarContent.<anonymous>.<anonymous> (AppBarDsl.kt:198)");
                }
                q50.t(this.f31701a.f31699e, null, 0L, null, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, null, c0Var, 0, 0, 262142);
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
                androidx.compose.runtime.m0.A0(-1965247803, i11, -1, "androidx.compose.material3.ToggleableAppBarItem.AppbarContent.<anonymous> (AppBarDsl.kt:198)");
            }
            h90.m(k90Var, null, null, 0.0f, null, 0L, 0L, 0.0f, 0.0f, androidx.compose.runtime.internal.w.e(2059984663, true, new C0249a(p80.this), c0Var, 54), c0Var, (i11 & 14) | 805306368, 255);
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
            if (!c0Var.h((i10 & 3) != 2, i10 & 1)) {
                c0Var.u();
                return;
            }
            if (androidx.compose.runtime.m0.l0()) {
                androidx.compose.runtime.m0.A0(694023085, i10, -1, "androidx.compose.material3.ToggleableAppBarItem.AppbarContent.<anonymous> (AppBarDsl.kt:201)");
            }
            ei.J(p80.this.f31695a, p80.this.f31696b, null, p80.this.f31698d, null, null, null, p80.this.f31697c, c0Var, 0, androidx.media3.extractor.metadata.dvbsi.b.f67479d);
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
                androidx.compose.runtime.m0.A0(-269621941, i10, -1, "androidx.compose.material3.ToggleableAppBarItem.MenuContent.<anonymous> (AppBarDsl.kt:214)");
            }
            q50.t(p80.this.f31699e, null, 0L, null, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, null, c0Var, 0, 0, 262142);
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
    public p80(boolean z10, @NotNull Function1<? super Boolean, Unit> function1, @NotNull Function2<? super androidx.compose.runtime.c0, ? super Integer, Unit> function2, boolean z11, @NotNull String str) {
        this.f31695a = z10;
        this.f31696b = function1;
        this.f31697c = function2;
        this.f31698d = z11;
        this.f31699e = str;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit f(p80 p80Var, int i10, androidx.compose.runtime.c0 c0Var, int i11) {
        p80Var.b(c0Var, androidx.compose.runtime.t4.a(i10 | 1));
        return Unit.f312394a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit g(p80 p80Var, p1 p1Var) {
        p80Var.f31696b.invoke(Boolean.valueOf(!p80Var.f31695a));
        p1Var.a();
        return Unit.f312394a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit h(p80 p80Var, p1 p1Var, int i10, androidx.compose.runtime.c0 c0Var, int i11) {
        p80Var.a(p1Var, c0Var, androidx.compose.runtime.t4.a(i10 | 1));
        return Unit.f312394a;
    }

    @Override // androidx.compose.material3.b0
    @androidx.compose.runtime.o
    @androidx.compose.runtime.t(applier = "androidx.compose.ui.UiComposable")
    public void a(@NotNull final p1 p1Var, @Nullable androidx.compose.runtime.c0 c0Var, final int i10) {
        int i11;
        androidx.compose.runtime.c0 c0VarR = c0Var.R(-1187385573);
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
                androidx.compose.runtime.m0.A0(-1187385573, i11, -1, "androidx.compose.material3.ToggleableAppBarItem.MenuContent (AppBarDsl.kt:211)");
            }
            boolean z10 = false;
            boolean z11 = this.f31698d;
            androidx.compose.runtime.internal.c cVarE = androidx.compose.runtime.internal.w.e(-269621941, true, new c(), c0VarR, 54);
            boolean z12 = (i11 & com.planner5d.library.engine.input.f.b.B) == 32;
            if ((i11 & 14) == 4) {
                z10 = true;
            }
            boolean z13 = z10 | z12;
            Object objI0 = c0VarR.i0();
            if (z13 || objI0 == androidx.compose.runtime.c0.f35327a.a()) {
                objI0 = new Function0() { // from class: androidx.compose.material3.m80
                    @Override // kotlin.jvm.functions.Function0
                    public final Object invoke() {
                        return p80.g(this.f30585a, p1Var);
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
            s5VarT.a(new Function2() { // from class: androidx.compose.material3.n80
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    return p80.h(this.f30976a, p1Var, i10, (androidx.compose.runtime.c0) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    @Override // androidx.compose.material3.b0
    @androidx.compose.runtime.o
    @androidx.compose.runtime.t(applier = "androidx.compose.ui.UiComposable")
    public void b(@Nullable androidx.compose.runtime.c0 c0Var, final int i10) {
        int i11;
        androidx.compose.runtime.c0 c0VarR = c0Var.R(-53051696);
        if ((i10 & 6) == 0) {
            i11 = (c0VarR.D(this) ? 4 : 2) | i10;
        } else {
            i11 = i10;
        }
        if (c0VarR.h((i11 & 3) != 2, i11 & 1)) {
            if (androidx.compose.runtime.m0.l0()) {
                androidx.compose.runtime.m0.A0(-53051696, i11, -1, "androidx.compose.material3.ToggleableAppBarItem.AppbarContent (AppBarDsl.kt:193)");
            }
            h90.x(u80.f33535a.o(s80.f32838b.a(), 0.0f, c0VarR, 390, 2), androidx.compose.runtime.internal.w.e(-1965247803, true, new a(), c0VarR, 54), h90.S(false, false, null, c0VarR, 0, 7), null, null, false, false, false, androidx.compose.runtime.internal.w.e(694023085, true, new b(), c0VarR, 54), c0VarR, 100663344, com.planner5d.library.engine.input.f.b.R1);
            c0VarR = c0VarR;
            if (androidx.compose.runtime.m0.l0()) {
                androidx.compose.runtime.m0.z0();
            }
        } else {
            c0VarR.u();
        }
        androidx.compose.runtime.s5 s5VarT = c0VarR.T();
        if (s5VarT != null) {
            s5VarT.a(new Function2() { // from class: androidx.compose.material3.o80
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    return p80.f(this.f31318a, i10, (androidx.compose.runtime.c0) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }
}
