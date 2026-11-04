package androidx.compose.foundation.lazy.layout;

import androidx.compose.runtime.n4;
import androidx.compose.runtime.s5;
import androidx.compose.runtime.t4;
import androidx.media3.exoplayer.a5;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes.dex */
@SourceDebugExtension({"SMAP\nLazyLayoutPinnableItem.kt\nKotlin\n*S Kotlin\n*F\n+ 1 LazyLayoutPinnableItem.kt\nandroidx/compose/foundation/lazy/layout/LazyLayoutPinnableItemKt\n+ 2 Composer.kt\nandroidx/compose/runtime/ComposerKt\n+ 3 CompositionLocal.kt\nandroidx/compose/runtime/CompositionLocal\n+ 4 Effects.kt\nandroidx/compose/runtime/DisposableEffectScope\n*L\n1#1,161:1\n1282#2,6:162\n1282#2,6:169\n75#3:168\n66#4,5:175\n*S KotlinDebug\n*F\n+ 1 LazyLayoutPinnableItem.kt\nandroidx/compose/foundation/lazy/layout/LazyLayoutPinnableItemKt\n*L\n52#1:162,6\n55#1:169,6\n54#1:168\n55#1:175,5\n*E\n"})
public final class g1 {

    @SourceDebugExtension({"SMAP\nEffects.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Effects.kt\nandroidx/compose/runtime/DisposableEffectScope$onDispose$1\n+ 2 LazyLayoutPinnableItem.kt\nandroidx/compose/foundation/lazy/layout/LazyLayoutPinnableItemKt\n*L\n1#1,69:1\n55#2:70\n*E\n"})
    public static final class a implements androidx.compose.runtime.u1 {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ d1 f17404a;

        public a(d1 d1Var) {
            this.f17404a = d1Var;
        }

        @Override // androidx.compose.runtime.u1
        public void dispose() {
            this.f17404a.d();
        }
    }

    @androidx.compose.runtime.o
    public static final void c(@Nullable final Object obj, final int i10, @NotNull final h1 h1Var, @NotNull final Function2<? super androidx.compose.runtime.c0, ? super Integer, Unit> function2, @Nullable androidx.compose.runtime.c0 c0Var, final int i11) {
        int i12;
        androidx.compose.runtime.c0 c0VarR = c0Var.R(872548579);
        if ((i11 & 6) == 0) {
            i12 = (c0VarR.k0(obj) ? 4 : 2) | i11;
        } else {
            i12 = i11;
        }
        if ((i11 & 48) == 0) {
            i12 |= c0VarR.K(i10) ? 32 : 16;
        }
        if ((i11 & a5.S0) == 0) {
            i12 |= c0VarR.k0(h1Var) ? 256 : 128;
        }
        if ((i11 & 3072) == 0) {
            i12 |= c0VarR.k0(function2) ? 2048 : 1024;
        }
        if (c0VarR.h((i12 & 1171) != 1170, i12 & 1)) {
            if (androidx.compose.runtime.m0.l0()) {
                androidx.compose.runtime.m0.A0(872548579, i12, -1, "androidx.compose.foundation.lazy.layout.LazyLayoutPinnableItem (LazyLayoutPinnableItem.kt:50)");
            }
            boolean zD = c0VarR.D(obj) | c0VarR.D(h1Var);
            Object objI0 = c0VarR.i0();
            if (zD || objI0 == androidx.compose.runtime.c0.f35327a.a()) {
                objI0 = new d1(obj, h1Var);
                c0VarR.Y(objI0);
            }
            final d1 d1Var = (d1) objI0;
            d1Var.e(i10);
            d1Var.f((androidx.compose.ui.layout.g2) c0VarR.W(androidx.compose.ui.layout.h2.a()));
            boolean zD2 = c0VarR.D(d1Var);
            Object objI1 = c0VarR.i0();
            if (zD2 || objI1 == androidx.compose.runtime.c0.f35327a.a()) {
                objI1 = new Function1() { // from class: androidx.compose.foundation.lazy.layout.e1
                    @Override // kotlin.jvm.functions.Function1
                    public final Object invoke(Object obj2) {
                        return g1.d(d1Var, (androidx.compose.runtime.v1) obj2);
                    }
                };
                c0VarR.Y(objI1);
            }
            androidx.compose.runtime.b2.d(d1Var, (Function1) objI1, c0VarR, 0);
            androidx.compose.runtime.a1.e(androidx.compose.ui.layout.h2.a().f(d1Var), function2, c0VarR, ((i12 >> 6) & com.planner5d.library.engine.input.f.b.B) | n4.f36267i);
            if (androidx.compose.runtime.m0.l0()) {
                androidx.compose.runtime.m0.z0();
            }
        } else {
            c0VarR.u();
        }
        s5 s5VarT = c0VarR.T();
        if (s5VarT != null) {
            s5VarT.a(new Function2() { // from class: androidx.compose.foundation.lazy.layout.f1
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj2, Object obj3) {
                    return g1.e(obj, i10, h1Var, function2, i11, (androidx.compose.runtime.c0) obj2, ((Integer) obj3).intValue());
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final androidx.compose.runtime.u1 d(d1 d1Var, androidx.compose.runtime.v1 v1Var) {
        return new a(d1Var);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit e(Object obj, int i10, h1 h1Var, Function2 function2, int i11, androidx.compose.runtime.c0 c0Var, int i12) {
        c(obj, i10, h1Var, function2, c0Var, t4.a(i11 | 1));
        return Unit.f312394a;
    }
}
