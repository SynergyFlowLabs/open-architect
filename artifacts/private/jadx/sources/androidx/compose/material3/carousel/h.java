package androidx.compose.material3.carousel;

import androidx.compose.material3.af;
import androidx.compose.ui.graphics.g2;
import androidx.compose.ui.graphics.k2;
import androidx.compose.ui.graphics.q3;
import androidx.compose.ui.platform.q1;
import kotlin.Unit;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes.dex */
@androidx.compose.runtime.internal.w0(parameters = 0)
@af
@SourceDebugExtension({"SMAP\nCarouselItemScope.kt\nKotlin\n*S Kotlin\n*F\n+ 1 CarouselItemScope.kt\nandroidx/compose/material3/carousel/CarouselItemScopeImpl\n+ 2 CompositionLocal.kt\nandroidx/compose/runtime/CompositionLocal\n+ 3 Composer.kt\nandroidx/compose/runtime/ComposerKt\n+ 4 Offset.kt\nandroidx/compose/ui/geometry/OffsetKt\n+ 5 InlineClassHelper.kt\nandroidx/compose/ui/util/InlineClassHelperKt\n*L\n1#1,100:1\n75#2:101\n1282#3,6:102\n30#4:108\n53#5,3:109\n*S KotlinDebug\n*F\n+ 1 CarouselItemScope.kt\nandroidx/compose/material3/carousel/CarouselItemScopeImpl\n*L\n90#1:101\n91#1:102,6\n95#1:108\n95#1:109,3\n*E\n"})
public final class h implements f {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final int f26562b = 8;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    private final d f26563a;

    public h(@NotNull d dVar) {
        this.f26563a = dVar;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit f(h hVar, q3 q3Var, androidx.compose.ui.unit.d dVar, k2 k2Var, n0.n nVar, androidx.compose.ui.unit.w wVar) {
        n0.j jVarK = hVar.c().c().K(n0.o.m(nVar.y()));
        g2.a(k2Var, q3Var.mo0createOutlinePq9zytI(jVarK.z(), wVar, dVar));
        float fT = jVarK.t();
        float fB = jVarK.B();
        k2Var.m(n0.g.g((((long) Float.floatToRawIntBits(fT)) << 32) | (((long) Float.floatToRawIntBits(fB)) & com.rabbitmq.client.k0.f265952a)));
        return Unit.f312394a;
    }

    @Override // androidx.compose.material3.carousel.f
    @androidx.compose.runtime.o
    @NotNull
    public androidx.compose.ui.a0 a(@NotNull androidx.compose.ui.a0 a0Var, @NotNull q3 q3Var, @Nullable androidx.compose.runtime.c0 c0Var, int i10) {
        c0Var.E(440683050);
        if (androidx.compose.runtime.m0.l0()) {
            androidx.compose.runtime.m0.A0(440683050, i10, -1, "androidx.compose.material3.carousel.CarouselItemScopeImpl.maskClip (CarouselItemScope.kt:81)");
        }
        androidx.compose.ui.a0 a0VarA = androidx.compose.ui.draw.j.a(a0Var, b(q3Var, c0Var, (i10 >> 3) & okhttp3.internal.ws.g.f334652s));
        if (androidx.compose.runtime.m0.l0()) {
            androidx.compose.runtime.m0.z0();
        }
        c0Var.A();
        return a0VarA;
    }

    @Override // androidx.compose.material3.carousel.f
    @androidx.compose.runtime.o
    @NotNull
    public androidx.compose.foundation.shape.k b(@NotNull final q3 q3Var, @Nullable androidx.compose.runtime.c0 c0Var, int i10) {
        c0Var.E(152582312);
        if (androidx.compose.runtime.m0.l0()) {
            androidx.compose.runtime.m0.A0(152582312, i10, -1, "androidx.compose.material3.carousel.CarouselItemScopeImpl.rememberMaskShape (CarouselItemScope.kt:88)");
        }
        final androidx.compose.ui.unit.d dVar = (androidx.compose.ui.unit.d) c0Var.W(q1.m());
        boolean zD = c0Var.D(c()) | c0Var.D(dVar);
        Object objI0 = c0Var.i0();
        if (zD || objI0 == androidx.compose.runtime.c0.f35327a.a()) {
            objI0 = new androidx.compose.foundation.shape.k(new pj.n() { // from class: androidx.compose.material3.carousel.g
                @Override // pj.n
                public final Object invoke(Object obj, Object obj2, Object obj3) {
                    return h.f(this.f26558a, q3Var, dVar, (k2) obj, (n0.n) obj2, (androidx.compose.ui.unit.w) obj3);
                }
            });
            c0Var.Y(objI0);
        }
        androidx.compose.foundation.shape.k kVar = (androidx.compose.foundation.shape.k) objI0;
        if (androidx.compose.runtime.m0.l0()) {
            androidx.compose.runtime.m0.z0();
        }
        c0Var.A();
        return kVar;
    }

    @Override // androidx.compose.material3.carousel.f
    @NotNull
    public d c() {
        return this.f26563a;
    }

    @Override // androidx.compose.material3.carousel.f
    @androidx.compose.runtime.o
    @NotNull
    public androidx.compose.ui.a0 d(@NotNull androidx.compose.ui.a0 a0Var, @NotNull androidx.compose.foundation.a1 a1Var, @NotNull q3 q3Var, @Nullable androidx.compose.runtime.c0 c0Var, int i10) {
        c0Var.E(610897768);
        if (androidx.compose.runtime.m0.l0()) {
            int i11 = 3 | (-1);
            androidx.compose.runtime.m0.A0(610897768, i10, -1, "androidx.compose.material3.carousel.CarouselItemScopeImpl.maskBorder (CarouselItemScope.kt:85)");
        }
        androidx.compose.ui.a0 a0VarG = androidx.compose.foundation.t0.g(a0Var, a1Var, b(q3Var, c0Var, (i10 >> 6) & okhttp3.internal.ws.g.f334652s));
        if (androidx.compose.runtime.m0.l0()) {
            androidx.compose.runtime.m0.z0();
        }
        c0Var.A();
        return a0VarG;
    }
}
