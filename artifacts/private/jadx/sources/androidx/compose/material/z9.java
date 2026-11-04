package androidx.compose.material;

import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes.dex */
@SourceDebugExtension({"SMAP\nMaterialTheme.kt\nKotlin\n*S Kotlin\n*F\n+ 1 MaterialTheme.kt\nandroidx/compose/material/MaterialThemeKt\n+ 2 Composer.kt\nandroidx/compose/runtime/ComposerKt\n+ 3 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,112:1\n1282#2,6:113\n1#3:119\n*S KotlinDebug\n*F\n+ 1 MaterialTheme.kt\nandroidx/compose/material/MaterialThemeKt\n*L\n65#1:113,6\n*E\n"})
public final class z9 {

    static final class a implements Function2<androidx.compose.runtime.c0, Integer, Unit> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ cl f25821a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ Function2<androidx.compose.runtime.c0, Integer, Unit> f25822b;

        /* JADX INFO: renamed from: androidx.compose.material.z9$a$a, reason: collision with other inner class name */
        static final class C0207a implements Function2<androidx.compose.runtime.c0, Integer, Unit> {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            final /* synthetic */ Function2<androidx.compose.runtime.c0, Integer, Unit> f25823a;

            /* JADX WARN: Multi-variable type inference failed */
            C0207a(Function2<? super androidx.compose.runtime.c0, ? super Integer, Unit> function2) {
                this.f25823a = function2;
            }

            @androidx.compose.runtime.o
            public final void c(androidx.compose.runtime.c0 c0Var, int i10) {
                if (!c0Var.h((i10 & 3) != 2, i10 & 1)) {
                    c0Var.u();
                    return;
                }
                if (androidx.compose.runtime.m0.l0()) {
                    androidx.compose.runtime.m0.A0(905505767, i10, -1, "androidx.compose.material.MaterialTheme.<anonymous>.<anonymous> (MaterialTheme.kt:80)");
                }
                ba.b(this.f25823a, c0Var, 0);
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
        a(cl clVar, Function2<? super androidx.compose.runtime.c0, ? super Integer, Unit> function2) {
            this.f25821a = clVar;
            this.f25822b = function2;
        }

        @androidx.compose.runtime.o
        public final void c(androidx.compose.runtime.c0 c0Var, int i10) {
            if (!c0Var.h((i10 & 3) != 2, i10 & 1)) {
                c0Var.u();
                return;
            }
            if (androidx.compose.runtime.m0.l0()) {
                androidx.compose.runtime.m0.A0(496803446, i10, -1, "androidx.compose.material.MaterialTheme.<anonymous> (MaterialTheme.kt:80)");
            }
            wk.l(this.f25821a.c(), androidx.compose.runtime.internal.w.e(905505767, true, new C0207a(this.f25822b), c0Var, 54), c0Var, 48);
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

    @androidx.compose.runtime.o
    @androidx.compose.runtime.p(scheme = "[0[0]]")
    public static final void b(@Nullable l4 l4Var, @Nullable cl clVar, @Nullable re reVar, @NotNull final Function2<? super androidx.compose.runtime.c0, ? super Integer, Unit> function2, @Nullable androidx.compose.runtime.c0 c0Var, final int i10, final int i11) {
        l4 l4VarA;
        int i12;
        cl clVarC;
        re reVarB;
        l4 l4Var2;
        androidx.compose.runtime.c0 c0VarR = c0Var.R(53836214);
        if ((i10 & 6) == 0) {
            if ((i11 & 1) == 0) {
                l4VarA = l4Var;
                int i13 = c0VarR.D(l4VarA) ? 4 : 2;
                i12 = i13 | i10;
            } else {
                l4VarA = l4Var;
            }
            i12 = i13 | i10;
        } else {
            l4VarA = l4Var;
            i12 = i10;
        }
        if ((i10 & 48) == 0) {
            if ((i11 & 2) == 0) {
                clVarC = clVar;
                int i14 = c0VarR.D(clVarC) ? 32 : 16;
                i12 |= i14;
            } else {
                clVarC = clVar;
            }
            i12 |= i14;
        } else {
            clVarC = clVar;
        }
        if ((i10 & androidx.media3.exoplayer.a5.S0) == 0) {
            if ((i11 & 4) == 0) {
                reVarB = reVar;
                int i15 = c0VarR.D(reVarB) ? 256 : 128;
                i12 |= i15;
            } else {
                reVarB = reVar;
            }
            i12 |= i15;
        } else {
            reVarB = reVar;
        }
        if ((i11 & 8) != 0) {
            i12 |= 3072;
        } else if ((i10 & 3072) == 0) {
            i12 |= c0VarR.k0(function2) ? 2048 : 1024;
        }
        if (c0VarR.h((i12 & 1171) != 1170, i12 & 1)) {
            c0VarR.l0();
            if ((i10 & 1) == 0 || c0VarR.y()) {
                if ((i11 & 1) != 0) {
                    l4VarA = x9.f25488a.a(c0VarR, 6);
                    i12 &= -15;
                }
                if ((i11 & 2) != 0) {
                    clVarC = x9.f25488a.c(c0VarR, 6);
                    i12 &= -113;
                }
                if ((i11 & 4) != 0) {
                    reVarB = x9.f25488a.b(c0VarR, 6);
                    i12 &= -897;
                }
            } else {
                c0VarR.u();
                if ((i11 & 1) != 0) {
                    i12 &= -15;
                }
                if ((i11 & 2) != 0) {
                    i12 &= -113;
                }
                if ((i11 & 4) != 0) {
                    i12 &= -897;
                }
            }
            l4Var2 = l4VarA;
            c0VarR.Z();
            if (androidx.compose.runtime.m0.l0()) {
                androidx.compose.runtime.m0.A0(53836214, i12, -1, "androidx.compose.material.MaterialTheme (MaterialTheme.kt:62)");
            }
            Object objI0 = c0VarR.i0();
            if (objI0 == androidx.compose.runtime.c0.f35327a.a()) {
                objI0 = l4Var2.a((8191 & 1) != 0 ? l4Var2.j() : 0L, (8191 & 2) != 0 ? l4Var2.k() : 0L, (8191 & 4) != 0 ? l4Var2.l() : 0L, (8191 & 8) != 0 ? l4Var2.m() : 0L, (8191 & 16) != 0 ? l4Var2.c() : 0L, (8191 & 32) != 0 ? l4Var2.n() : 0L, (8191 & 64) != 0 ? l4Var2.d() : 0L, (8191 & 128) != 0 ? l4Var2.g() : 0L, (8191 & 256) != 0 ? l4Var2.h() : 0L, (8191 & 512) != 0 ? l4Var2.e() : 0L, (8191 & 1024) != 0 ? l4Var2.i() : 0L, (8191 & 2048) != 0 ? l4Var2.f() : 0L, (8191 & 4096) != 0 ? l4Var2.o() : false);
                c0VarR.Y(objI0);
            }
            l4 l4Var3 = (l4) objI0;
            n4.k(l4Var3, l4Var2);
            androidx.compose.runtime.a1.f(new androidx.compose.runtime.n4[]{n4.g().f(l4Var3), w4.c().f(Float.valueOf(u4.f25148a.c(c0VarR, 6))), androidx.compose.foundation.w2.c().f(wd.h(false, 0.0f, 0L, 7, null)), te.c().f(reVarB), androidx.compose.foundation.text.selection.y4.d().f(w9.e(l4Var3, c0VarR, 0)), el.f().f(clVarC)}, androidx.compose.runtime.internal.w.e(496803446, true, new a(clVarC, function2), c0VarR, 54), c0VarR, androidx.compose.runtime.n4.f36267i | 48);
            if (androidx.compose.runtime.m0.l0()) {
                androidx.compose.runtime.m0.z0();
            }
        } else {
            c0VarR.u();
            l4Var2 = l4VarA;
        }
        final cl clVar2 = clVarC;
        final re reVar2 = reVarB;
        androidx.compose.runtime.s5 s5VarT = c0VarR.T();
        if (s5VarT != null) {
            final l4 l4Var4 = l4Var2;
            s5VarT.a(new Function2() { // from class: androidx.compose.material.y9
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    return z9.c(l4Var4, clVar2, reVar2, function2, i10, i11, (androidx.compose.runtime.c0) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit c(l4 l4Var, cl clVar, re reVar, Function2 function2, int i10, int i11, androidx.compose.runtime.c0 c0Var, int i12) {
        b(l4Var, clVar, reVar, function2, c0Var, androidx.compose.runtime.t4.a(i10 | 1), i11);
        return Unit.f312394a;
    }
}
