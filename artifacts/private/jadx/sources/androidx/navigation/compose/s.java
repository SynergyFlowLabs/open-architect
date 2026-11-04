package androidx.navigation.compose;

import androidx.compose.runtime.n4;
import androidx.compose.runtime.s5;
import androidx.compose.runtime.t4;
import androidx.lifecycle.m2;
import androidx.lifecycle.o1;
import androidx.media3.exoplayer.a5;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.jvm.internal.j1;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes3.dex */
@SourceDebugExtension({"SMAP\nNavBackStackEntryProvider.kt\nKotlin\n*S Kotlin\n*F\n+ 1 NavBackStackEntryProvider.kt\nandroidx/navigation/compose/NavBackStackEntryProviderKt\n+ 2 Composer.kt\nandroidx/compose/runtime/ComposerKt\n+ 3 ViewModel.kt\nandroidx/lifecycle/viewmodel/compose/ViewModelKt__ViewModelKt\n+ 4 InitializerViewModelFactory.kt\nandroidx/lifecycle/viewmodel/InitializerViewModelFactoryKt\n*L\n1#1,91:1\n1225#2,6:92\n134#3:98\n128#3,11:99\n139#3,4:113\n32#4:110\n69#4,2:111\n*S KotlinDebug\n*F\n+ 1 NavBackStackEntryProvider.kt\nandroidx/navigation/compose/NavBackStackEntryProviderKt\n*L\n62#1:92,6\n62#1:98\n62#1:99,11\n62#1:113,4\n62#1:110\n62#1:111,2\n*E\n"})
@oj.i(name = "NavBackStackEntryProviderKt")
public final class s {

    static final class a implements Function2<androidx.compose.runtime.c0, Integer, Unit> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ androidx.compose.runtime.saveable.m f70838a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ Function2<androidx.compose.runtime.c0, Integer, Unit> f70839b;

        /* JADX WARN: Multi-variable type inference failed */
        a(androidx.compose.runtime.saveable.m mVar, Function2<? super androidx.compose.runtime.c0, ? super Integer, Unit> function2) {
            this.f70838a = mVar;
            this.f70839b = function2;
        }

        @androidx.compose.runtime.o
        public final void c(androidx.compose.runtime.c0 c0Var, int i10) {
            if ((i10 & 3) == 2 && c0Var.d()) {
                c0Var.u();
                return;
            }
            if (androidx.compose.runtime.m0.l0()) {
                androidx.compose.runtime.m0.A0(1808964477, i10, -1, "androidx.navigation.compose.LocalOwnersProvider.<anonymous> (NavBackStackEntryProvider.kt:55)");
            }
            s.f(this.f70838a, this.f70839b, c0Var, 0);
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
    public static final void d(@NotNull final androidx.navigation.n0 n0Var, @NotNull final androidx.compose.runtime.saveable.m mVar, @NotNull final Function2<? super androidx.compose.runtime.c0, ? super Integer, Unit> function2, @Nullable androidx.compose.runtime.c0 c0Var, final int i10) {
        int i11;
        int i12;
        androidx.compose.runtime.c0 c0VarR = c0Var.R(233973821);
        if ((i10 & 6) == 0) {
            if (c0VarR.k0(n0Var)) {
                i12 = 4;
                int i13 = 7 ^ 4;
            } else {
                i12 = 2;
            }
            i11 = i12 | i10;
        } else {
            i11 = i10;
        }
        if ((i10 & 48) == 0) {
            i11 |= c0VarR.k0(mVar) ? 32 : 16;
        }
        if ((i10 & a5.S0) == 0) {
            i11 |= c0VarR.k0(function2) ? 256 : 128;
        }
        if ((i11 & com.planner5d.library.engine.input.f.b.F1) == 146 && c0VarR.d()) {
            c0VarR.u();
        } else {
            if (androidx.compose.runtime.m0.l0()) {
                androidx.compose.runtime.m0.A0(233973821, i11, -1, "androidx.navigation.compose.LocalOwnersProvider (NavBackStackEntryProvider.kt:49)");
            }
            androidx.compose.runtime.a1.f(new n4[]{androidx.lifecycle.viewmodel.compose.b.f52543a.d(n0Var), androidx.lifecycle.compose.d0.c().f(n0Var), s3.b.c().f(n0Var)}, androidx.compose.runtime.internal.w.e(1808964477, true, new a(mVar, function2), c0VarR, 54), c0VarR, n4.f36267i | 48);
            if (androidx.compose.runtime.m0.l0()) {
                androidx.compose.runtime.m0.z0();
            }
        }
        s5 s5VarT = c0VarR.T();
        if (s5VarT != null) {
            s5VarT.a(new Function2() { // from class: androidx.navigation.compose.r
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    return s.e(n0Var, mVar, function2, i10, (androidx.compose.runtime.c0) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit e(androidx.navigation.n0 n0Var, androidx.compose.runtime.saveable.m mVar, Function2 function2, int i10, androidx.compose.runtime.c0 c0Var, int i11) {
        d(n0Var, mVar, function2, c0Var, t4.a(i10 | 1));
        return Unit.f312394a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    @androidx.compose.runtime.o
    public static final void f(final androidx.compose.runtime.saveable.m mVar, final Function2<? super androidx.compose.runtime.c0, ? super Integer, Unit> function2, androidx.compose.runtime.c0 c0Var, final int i10) {
        int i11;
        androidx.compose.runtime.c0 c0VarR = c0Var.R(832919318);
        if ((i10 & 6) == 0) {
            i11 = (c0VarR.k0(mVar) ? 4 : 2) | i10;
        } else {
            i11 = i10;
        }
        if ((i10 & 48) == 0) {
            i11 |= c0VarR.k0(function2) ? 32 : 16;
        }
        if ((i11 & 19) == 18 && c0VarR.d()) {
            c0VarR.u();
        } else {
            if (androidx.compose.runtime.m0.l0()) {
                androidx.compose.runtime.m0.A0(832919318, i11, -1, "androidx.navigation.compose.SaveableStateProvider (NavBackStackEntryProvider.kt:60)");
            }
            Object objI0 = c0VarR.i0();
            if (objI0 == androidx.compose.runtime.c0.f35327a.a()) {
                objI0 = new Function1() { // from class: androidx.navigation.compose.p
                    @Override // kotlin.jvm.functions.Function1
                    public final Object invoke(Object obj) {
                        return s.g((v2.a) obj);
                    }
                };
                c0VarR.Y(objI0);
            }
            Function1 function1 = (Function1) objI0;
            m2 m2VarC = androidx.lifecycle.viewmodel.compose.b.f52543a.c(c0VarR, 6);
            if (m2VarC == null) {
                throw new IllegalStateException("No ViewModelStoreOwner was provided via LocalViewModelStoreOwner");
            }
            kotlin.reflect.d dVarD = j1.d(androidx.navigation.compose.a.class);
            v2.d dVar = new v2.d();
            dVar.a(j1.d(androidx.navigation.compose.a.class), function1);
            androidx.navigation.compose.a aVar = (androidx.navigation.compose.a) androidx.lifecycle.viewmodel.compose.l.h(dVarD, m2VarC, null, dVar.b(), m2VarC instanceof androidx.lifecycle.z ? ((androidx.lifecycle.z) m2VarC).getDefaultViewModelCreationExtras() : v2.a.b.f381327c, c0VarR, 0, 0);
            aVar.W(new e3.c<>(mVar));
            mVar.e(aVar.U(), function2, c0VarR, ((i11 << 6) & 896) | (i11 & com.planner5d.library.engine.input.f.b.B));
            if (androidx.compose.runtime.m0.l0()) {
                androidx.compose.runtime.m0.z0();
            }
        }
        s5 s5VarT = c0VarR.T();
        if (s5VarT != null) {
            s5VarT.a(new Function2() { // from class: androidx.navigation.compose.q
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    return s.h(mVar, function2, i10, (androidx.compose.runtime.c0) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final androidx.navigation.compose.a g(v2.a aVar) {
        return new androidx.navigation.compose.a(o1.b(aVar));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit h(androidx.compose.runtime.saveable.m mVar, Function2 function2, int i10, androidx.compose.runtime.c0 c0Var, int i11) {
        f(mVar, function2, c0Var, t4.a(i10 | 1));
        return Unit.f312394a;
    }
}
