package androidx.compose.foundation.lazy.layout;

import androidx.compose.runtime.n4;
import androidx.compose.runtime.s5;
import androidx.compose.runtime.t4;
import java.util.List;
import java.util.Map;
import kotlin.Unit;
import kotlin.collections.MapsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes.dex */
@SourceDebugExtension({"SMAP\nLazySaveableStateHolder.kt\nKotlin\n*S Kotlin\n*F\n+ 1 LazySaveableStateHolder.kt\nandroidx/compose/foundation/lazy/layout/LazySaveableStateHolderKt\n+ 2 CompositionLocal.kt\nandroidx/compose/runtime/CompositionLocal\n+ 3 Composer.kt\nandroidx/compose/runtime/ComposerKt\n*L\n1#1,97:1\n75#2:98\n1282#3,6:99\n*S KotlinDebug\n*F\n+ 1 LazySaveableStateHolder.kt\nandroidx/compose/foundation/lazy/layout/LazySaveableStateHolderKt\n*L\n41#1:98\n47#1:99,6\n*E\n"})
public final class h2 {

    static final class a implements Function2<androidx.compose.runtime.c0, Integer, Unit> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ pj.n<androidx.compose.runtime.saveable.m, androidx.compose.runtime.c0, Integer, Unit> f17413a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ e2 f17414b;

        /* JADX WARN: Multi-variable type inference failed */
        a(pj.n<? super androidx.compose.runtime.saveable.m, ? super androidx.compose.runtime.c0, ? super Integer, Unit> nVar, e2 e2Var) {
            this.f17413a = nVar;
            this.f17414b = e2Var;
        }

        @androidx.compose.runtime.o
        public final void c(androidx.compose.runtime.c0 c0Var, int i10) {
            if (!c0Var.h((i10 & 3) != 2, i10 & 1)) {
                c0Var.u();
                return;
            }
            if (androidx.compose.runtime.m0.l0()) {
                androidx.compose.runtime.m0.A0(-412824043, i10, -1, "androidx.compose.foundation.lazy.layout.LazySaveableStateHolderProvider.<anonymous> (LazySaveableStateHolder.kt:49)");
            }
            this.f17413a.invoke(this.f17414b, c0Var, 0);
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
    public static final void c(@NotNull final pj.n<? super androidx.compose.runtime.saveable.m, ? super androidx.compose.runtime.c0, ? super Integer, Unit> nVar, @Nullable androidx.compose.runtime.c0 c0Var, final int i10) {
        int i11;
        androidx.compose.runtime.c0 c0VarR = c0Var.R(-709502251);
        if ((i10 & 6) == 0) {
            i11 = (c0VarR.k0(nVar) ? 4 : 2) | i10;
        } else {
            i11 = i10;
        }
        if (c0VarR.h((i11 & 3) != 2, i11 & 1)) {
            if (androidx.compose.runtime.m0.l0()) {
                androidx.compose.runtime.m0.A0(-709502251, i11, -1, "androidx.compose.foundation.lazy.layout.LazySaveableStateHolderProvider (LazySaveableStateHolder.kt:39)");
            }
            final androidx.compose.runtime.saveable.v vVar = (androidx.compose.runtime.saveable.v) c0VarR.W(androidx.compose.runtime.saveable.y.g());
            final androidx.compose.runtime.saveable.m mVarB = androidx.compose.runtime.saveable.u.b(c0VarR, 0);
            Object[] objArr = {vVar};
            androidx.compose.runtime.saveable.c0<e2, Map<String, List<Object>>> c0VarC = e2.f17373d.c(vVar, mVarB);
            boolean zK0 = c0VarR.k0(vVar) | c0VarR.k0(mVarB);
            Object objI0 = c0VarR.i0();
            if (zK0 || objI0 == androidx.compose.runtime.c0.f35327a.a()) {
                objI0 = new Function0() { // from class: androidx.compose.foundation.lazy.layout.f2
                    @Override // kotlin.jvm.functions.Function0
                    public final Object invoke() {
                        return h2.d(vVar, mVarB);
                    }
                };
                c0VarR.Y(objI0);
            }
            e2 e2Var = (e2) androidx.compose.runtime.saveable.i.j(objArr, c0VarC, (Function0) objI0, c0VarR, 0);
            androidx.compose.runtime.a1.e(androidx.compose.runtime.saveable.y.g().f(e2Var), androidx.compose.runtime.internal.w.e(-412824043, true, new a(nVar, e2Var), c0VarR, 54), c0VarR, n4.f36267i | 48);
            if (androidx.compose.runtime.m0.l0()) {
                androidx.compose.runtime.m0.z0();
            }
        } else {
            c0VarR.u();
        }
        s5 s5VarT = c0VarR.T();
        if (s5VarT != null) {
            s5VarT.a(new Function2() { // from class: androidx.compose.foundation.lazy.layout.g2
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    return h2.e(nVar, i10, (androidx.compose.runtime.c0) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final e2 d(androidx.compose.runtime.saveable.v vVar, androidx.compose.runtime.saveable.m mVar) {
        return new e2(vVar, MapsKt.emptyMap(), mVar);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit e(pj.n nVar, int i10, androidx.compose.runtime.c0 c0Var, int i11) {
        c(nVar, c0Var, t4.a(i10 | 1));
        return Unit.f312394a;
    }
}
