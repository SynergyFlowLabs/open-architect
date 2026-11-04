package androidx.compose.foundation.lazy.layout;

import androidx.compose.runtime.n7;
import androidx.compose.runtime.s5;
import androidx.compose.runtime.t4;
import androidx.compose.runtime.w6;
import androidx.compose.ui.layout.b3;
import androidx.media3.exoplayer.a5;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes.dex */
public final class u0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final int f17593a = 7;

    @SourceDebugExtension({"SMAP\nLazyLayout.kt\nKotlin\n*S Kotlin\n*F\n+ 1 LazyLayout.kt\nandroidx/compose/foundation/lazy/layout/LazyLayoutKt$LazyLayout$2\n+ 2 Composer.kt\nandroidx/compose/runtime/ComposerKt\n+ 3 Effects.kt\nandroidx/compose/runtime/DisposableEffectScope\n+ 4 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,174:1\n1282#2,6:175\n1282#2,6:181\n1282#2,6:187\n1282#2,6:193\n66#3,5:199\n1#4:204\n*S KotlinDebug\n*F\n+ 1 LazyLayout.kt\nandroidx/compose/foundation/lazy/layout/LazyLayoutKt$LazyLayout$2\n*L\n116#1:175,6\n119#1:181,6\n124#1:187,6\n138#1:193,6\n127#1:199,5\n*E\n"})
    static final class a implements pj.n<androidx.compose.runtime.saveable.m, androidx.compose.runtime.c0, Integer, Unit> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ i1 f17594a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ androidx.compose.ui.a0 f17595b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ v0 f17596c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        final /* synthetic */ n7<Function0<l0>> f17597d;

        /* JADX INFO: renamed from: androidx.compose.foundation.lazy.layout.u0$a$a, reason: collision with other inner class name */
        @SourceDebugExtension({"SMAP\nEffects.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Effects.kt\nandroidx/compose/runtime/DisposableEffectScope$onDispose$1\n+ 2 LazyLayout.kt\nandroidx/compose/foundation/lazy/layout/LazyLayoutKt$LazyLayout$2\n*L\n1#1,69:1\n129#2,3:70\n*E\n"})
        public static final class C0113a implements androidx.compose.runtime.u1 {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            final /* synthetic */ i1 f17598a;

            public C0113a(i1 i1Var) {
                this.f17598a = i1Var;
            }

            @Override // androidx.compose.runtime.u1
            public void dispose() {
                q2 q2VarF = this.f17598a.f();
                if (q2VarF != null) {
                    q2VarF.i();
                }
                this.f17598a.s(null);
            }
        }

        /* JADX WARN: Multi-variable type inference failed */
        a(i1 i1Var, androidx.compose.ui.a0 a0Var, v0 v0Var, n7<? extends Function0<? extends l0>> n7Var) {
            this.f17594a = i1Var;
            this.f17595b = a0Var;
            this.f17596c = v0Var;
            this.f17597d = n7Var;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final l0 k(n7 n7Var) {
            return (l0) ((Function0) n7Var.getValue()).invoke();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final androidx.compose.runtime.u1 m(i1 i1Var, i0 i0Var, androidx.compose.ui.layout.a3 a3Var, u2 u2Var, androidx.compose.runtime.v1 v1Var) {
            i1Var.s(new q2(i0Var, a3Var, u2Var));
            return new C0113a(i1Var);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final androidx.compose.ui.layout.b1 n(i0 i0Var, v0 v0Var, b3 b3Var, androidx.compose.ui.unit.b bVar) {
            return v0Var.a(new x0(i0Var, b3Var), bVar.x());
        }

        @androidx.compose.runtime.o
        @androidx.compose.runtime.t(applier = "androidx.compose.ui.UiComposable")
        public final void i(androidx.compose.runtime.saveable.m mVar, androidx.compose.runtime.c0 c0Var, int i10) {
            if (androidx.compose.runtime.m0.l0()) {
                androidx.compose.runtime.m0.A0(-933153643, i10, -1, "androidx.compose.foundation.lazy.layout.LazyLayout.<anonymous> (LazyLayout.kt:115)");
            }
            final n7<Function0<l0>> n7Var = this.f17597d;
            Object objI0 = c0Var.i0();
            androidx.compose.runtime.c0.a aVar = androidx.compose.runtime.c0.f35327a;
            if (objI0 == aVar.a()) {
                objI0 = new i0(mVar, new Function0() { // from class: androidx.compose.foundation.lazy.layout.r0
                    @Override // kotlin.jvm.functions.Function0
                    public final Object invoke() {
                        return u0.a.k(n7Var);
                    }
                });
                c0Var.Y(objI0);
            }
            final i0 i0Var = (i0) objI0;
            Object objI1 = c0Var.i0();
            if (objI1 == aVar.a()) {
                objI1 = new androidx.compose.ui.layout.a3(new n0(i0Var));
                c0Var.Y(objI1);
            }
            final androidx.compose.ui.layout.a3 a3Var = (androidx.compose.ui.layout.a3) objI1;
            if (this.f17594a != null) {
                c0Var.E(1743490539);
                final u2 u2VarH = this.f17594a.h();
                if (u2VarH == null) {
                    c0Var.E(887527095);
                    u2VarH = v2.b(c0Var, 0);
                } else {
                    c0Var.E(887526010);
                }
                c0Var.A();
                Object obj = this.f17594a;
                Object[] objArr = {obj, i0Var, a3Var, u2VarH};
                boolean zD = c0Var.D(obj) | c0Var.k0(i0Var) | c0Var.k0(a3Var) | c0Var.k0(u2VarH);
                final i1 i1Var = this.f17594a;
                Object objI2 = c0Var.i0();
                if (zD || objI2 == aVar.a()) {
                    objI2 = new Function1() { // from class: androidx.compose.foundation.lazy.layout.s0
                        @Override // kotlin.jvm.functions.Function1
                        public final Object invoke(Object obj2) {
                            return u0.a.m(i1Var, i0Var, a3Var, u2VarH, (androidx.compose.runtime.v1) obj2);
                        }
                    };
                    c0Var.Y(objI2);
                }
                androidx.compose.runtime.b2.f(objArr, (Function1) objI2, c0Var, 0);
                c0Var.A();
            } else {
                c0Var.E(1744076749);
                c0Var.A();
            }
            androidx.compose.ui.a0 a0VarA = j1.a(this.f17595b, this.f17594a);
            boolean zD2 = c0Var.D(i0Var) | c0Var.D(this.f17596c);
            final v0 v0Var = this.f17596c;
            Object objI3 = c0Var.i0();
            if (zD2 || objI3 == aVar.a()) {
                objI3 = new Function2() { // from class: androidx.compose.foundation.lazy.layout.t0
                    @Override // kotlin.jvm.functions.Function2
                    public final Object invoke(Object obj2, Object obj3) {
                        return u0.a.n(i0Var, v0Var, (b3) obj2, (androidx.compose.ui.unit.b) obj3);
                    }
                };
                c0Var.Y(objI3);
            }
            androidx.compose.ui.layout.z2.b(a3Var, a0VarA, (Function2) objI3, c0Var, androidx.compose.ui.layout.a3.f39244f, 0);
            if (androidx.compose.runtime.m0.l0()) {
                androidx.compose.runtime.m0.z0();
            }
        }

        @Override // pj.n
        public /* bridge */ /* synthetic */ Unit invoke(androidx.compose.runtime.saveable.m mVar, androidx.compose.runtime.c0 c0Var, Integer num) {
            i(mVar, c0Var, num.intValue());
            return Unit.f312394a;
        }
    }

    static final class b implements v0, kotlin.jvm.internal.c0 {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final /* synthetic */ Function2 f17599a;

        b(Function2 function2) {
            this.f17599a = function2;
        }

        @Override // androidx.compose.foundation.lazy.layout.v0
        public final /* synthetic */ androidx.compose.ui.layout.b1 a(w0 w0Var, long j10) {
            return (androidx.compose.ui.layout.b1) this.f17599a.invoke(w0Var, androidx.compose.ui.unit.b.a(j10));
        }

        @Override // kotlin.jvm.internal.c0
        @NotNull
        public final kotlin.x<?> b() {
            return this.f17599a;
        }

        public final boolean equals(@Nullable Object obj) {
            if ((obj instanceof v0) && (obj instanceof kotlin.jvm.internal.c0)) {
                return Intrinsics.areEqual(b(), ((kotlin.jvm.internal.c0) obj).b());
            }
            return false;
        }

        public final int hashCode() {
            return b().hashCode();
        }
    }

    @androidx.compose.runtime.o
    @androidx.compose.runtime.p(scheme = "[androidx.compose.ui.UiComposable[androidx.compose.ui.UiComposable:[androidx.compose.ui.UiComposable]]]")
    public static final void c(@NotNull final Function0<? extends l0> function0, @Nullable androidx.compose.ui.a0 a0Var, @Nullable i1 i1Var, @NotNull final v0 v0Var, @Nullable androidx.compose.runtime.c0 c0Var, final int i10, final int i11) {
        int i12;
        androidx.compose.runtime.c0 c0VarR = c0Var.R(1055276397);
        if ((i11 & 1) != 0) {
            i12 = i10 | 6;
        } else if ((i10 & 6) == 0) {
            i12 = (c0VarR.k0(function0) ? 4 : 2) | i10;
        } else {
            i12 = i10;
        }
        int i13 = i11 & 2;
        if (i13 != 0) {
            i12 |= 48;
        } else if ((i10 & 48) == 0) {
            i12 |= c0VarR.D(a0Var) ? 32 : 16;
        }
        int i14 = i11 & 4;
        if (i14 != 0) {
            i12 |= a5.S0;
        } else if ((i10 & a5.S0) == 0) {
            i12 |= c0VarR.D(i1Var) ? 256 : 128;
        }
        if ((i11 & 8) != 0) {
            i12 |= 3072;
        } else if ((i10 & 3072) == 0) {
            i12 |= (i10 & 4096) == 0 ? c0VarR.D(v0Var) : c0VarR.k0(v0Var) ? 2048 : 1024;
        }
        if (c0VarR.h((i12 & 1171) != 1170, i12 & 1)) {
            if (i13 != 0) {
                a0Var = androidx.compose.ui.a0.E;
            }
            if (i14 != 0) {
                i1Var = null;
            }
            if (androidx.compose.runtime.m0.l0()) {
                androidx.compose.runtime.m0.A0(1055276397, i12, -1, "androidx.compose.foundation.lazy.layout.LazyLayout (LazyLayout.kt:111)");
            }
            h2.c(androidx.compose.runtime.internal.w.e(-933153643, true, new a(i1Var, a0Var, v0Var, w6.w(function0, c0VarR, i12 & 14)), c0VarR, 54), c0VarR, 6);
            if (androidx.compose.runtime.m0.l0()) {
                androidx.compose.runtime.m0.z0();
            }
        } else {
            c0VarR.u();
        }
        final androidx.compose.ui.a0 a0Var2 = a0Var;
        final i1 i1Var2 = i1Var;
        s5 s5VarT = c0VarR.T();
        if (s5VarT != null) {
            s5VarT.a(new Function2() { // from class: androidx.compose.foundation.lazy.layout.q0
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    return u0.f(function0, a0Var2, i1Var2, v0Var, i10, i11, (androidx.compose.runtime.c0) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    @kotlin.l(level = kotlin.n.HIDDEN, message = "Please use overload with LazyLayoutMeasurePolicy")
    @androidx.compose.runtime.o
    @androidx.compose.foundation.b2
    @androidx.compose.runtime.p(scheme = "[androidx.compose.ui.UiComposable[androidx.compose.ui.UiComposable:[androidx.compose.ui.UiComposable]]]")
    public static final /* synthetic */ void d(final Function0 function0, androidx.compose.ui.a0 a0Var, i1 i1Var, final Function2 function2, androidx.compose.runtime.c0 c0Var, final int i10, final int i11) {
        int i12;
        final androidx.compose.ui.a0 a0Var2;
        final i1 i1Var2;
        androidx.compose.runtime.c0 c0VarR = c0Var.R(2002163445);
        if ((i11 & 1) != 0) {
            i12 = i10 | 6;
        } else if ((i10 & 6) == 0) {
            i12 = (c0VarR.k0(function0) ? 4 : 2) | i10;
        } else {
            i12 = i10;
        }
        int i13 = i11 & 2;
        if (i13 != 0) {
            i12 |= 48;
        } else if ((i10 & 48) == 0) {
            i12 |= c0VarR.D(a0Var) ? 32 : 16;
        }
        int i14 = i11 & 4;
        if (i14 != 0) {
            i12 |= a5.S0;
        } else if ((i10 & a5.S0) == 0) {
            i12 |= c0VarR.D(i1Var) ? 256 : 128;
        }
        if ((i11 & 8) != 0) {
            i12 |= 3072;
        } else if ((i10 & 3072) == 0) {
            i12 |= c0VarR.k0(function2) ? 2048 : 1024;
        }
        if (c0VarR.h((i12 & 1171) != 1170, i12 & 1)) {
            if (i13 != 0) {
                a0Var = androidx.compose.ui.a0.E;
            }
            androidx.compose.ui.a0 a0Var3 = a0Var;
            i1 i1Var3 = i14 != 0 ? null : i1Var;
            if (androidx.compose.runtime.m0.l0()) {
                androidx.compose.runtime.m0.A0(2002163445, i12, -1, "androidx.compose.foundation.lazy.layout.LazyLayout (LazyLayout.kt:68)");
            }
            c(function0, a0Var3, i1Var3, new b(function2), c0VarR, i12 & androidx.media3.exoplayer.analytics.b.f62802b0, 0);
            if (androidx.compose.runtime.m0.l0()) {
                androidx.compose.runtime.m0.z0();
            }
            a0Var2 = a0Var3;
            i1Var2 = i1Var3;
        } else {
            c0VarR.u();
            a0Var2 = a0Var;
            i1Var2 = i1Var;
        }
        s5 s5VarT = c0VarR.T();
        if (s5VarT != null) {
            s5VarT.a(new Function2() { // from class: androidx.compose.foundation.lazy.layout.p0
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    return u0.e(function0, a0Var2, i1Var2, function2, i10, i11, (androidx.compose.runtime.c0) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit e(Function0 function0, androidx.compose.ui.a0 a0Var, i1 i1Var, Function2 function2, int i10, int i11, androidx.compose.runtime.c0 c0Var, int i12) {
        d(function0, a0Var, i1Var, function2, c0Var, t4.a(i10 | 1), i11);
        return Unit.f312394a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit f(Function0 function0, androidx.compose.ui.a0 a0Var, i1 i1Var, v0 v0Var, int i10, int i11, androidx.compose.runtime.c0 c0Var, int i12) {
        c(function0, a0Var, i1Var, v0Var, c0Var, t4.a(i10 | 1), i11);
        return Unit.f312394a;
    }
}
