package coil.compose;

import android.content.Context;
import androidx.compose.runtime.k7;
import androidx.compose.ui.platform.AndroidCompositionLocals_androidKt;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.k0;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes3.dex */
@SourceDebugExtension({"SMAP\nutils.kt\nKotlin\n*S Kotlin\n*F\n+ 1 utils.kt\ncoil/compose/UtilsKt\n+ 2 CompositionLocal.kt\nandroidx/compose/runtime/CompositionLocal\n+ 3 Composer.kt\nandroidx/compose/runtime/ComposerKt\n*L\n1#1,190:1\n74#2:191\n74#2:210\n1116#3,6:192\n1116#3,6:198\n1116#3,6:204\n1116#3,6:211\n*S KotlinDebug\n*F\n+ 1 utils.kt\ncoil/compose/UtilsKt\n*L\n36#1:191\n69#1:210\n37#1:192,6\n59#1:198,6\n63#1:204,6\n70#1:211,6\n*E\n"})
public final class g0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final long f87049a = androidx.compose.ui.unit.b.f42658b.c(0, 0);

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NotNull
    private static final coil.size.j f87050b = coil.size.k.a(coil.size.i.f87783d);

    public static final float d(long j10, float f10) {
        return kotlin.ranges.r.H(f10, androidx.compose.ui.unit.b.q(j10), androidx.compose.ui.unit.b.o(j10));
    }

    public static final float e(long j10, float f10) {
        return kotlin.ranges.r.H(f10, androidx.compose.ui.unit.b.r(j10), androidx.compose.ui.unit.b.p(j10));
    }

    @k7
    @NotNull
    public static final androidx.compose.ui.a0 f(@NotNull androidx.compose.ui.a0 a0Var, @Nullable final String str) {
        if (str != null) {
            a0Var = androidx.compose.ui.semantics.t.f(a0Var, false, new Function1() { // from class: coil.compose.e0
                @Override // kotlin.jvm.functions.Function1
                public final Object invoke(Object obj) {
                    return g0.g(str, (androidx.compose.ui.semantics.e0) obj);
                }
            }, 1, null);
        }
        return a0Var;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit g(String str, androidx.compose.ui.semantics.e0 e0Var) {
        androidx.compose.ui.semantics.b0.v1(e0Var, str);
        androidx.compose.ui.semantics.b0.K1(e0Var, androidx.compose.ui.semantics.j.f41124b.e());
        return Unit.f312394a;
    }

    @NotNull
    public static final coil.size.j h() {
        return f87050b;
    }

    public static final long i() {
        return f87049a;
    }

    public static final boolean j(long j10) {
        return ((double) n0.n.t(j10)) >= 0.5d && ((double) n0.n.m(j10)) >= 0.5d;
    }

    @k7
    @Nullable
    public static final Function1<AsyncImagePainter.State, Unit> k(@Nullable final Function1<? super AsyncImagePainter.State.Loading, Unit> function1, @Nullable final Function1<? super AsyncImagePainter.State.Success, Unit> function2, @Nullable final Function1<? super AsyncImagePainter.State.Error, Unit> function3) {
        if (function1 == null && function2 == null && function3 == null) {
            return null;
        }
        return new Function1() { // from class: coil.compose.d0
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return g0.l(function1, function2, function3, (AsyncImagePainter.State) obj);
            }
        };
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit l(Function1 function1, Function1 function2, Function1 function3, AsyncImagePainter.State state) {
        if (state instanceof AsyncImagePainter.State.Loading) {
            if (function1 != null) {
                function1.invoke(state);
            }
        } else if (state instanceof AsyncImagePainter.State.Success) {
            if (function2 != null) {
                function2.invoke(state);
            }
        } else if (state instanceof AsyncImagePainter.State.Error) {
            if (function3 != null) {
                function3.invoke(state);
            }
        } else if (!(state instanceof AsyncImagePainter.State.a)) {
            throw new k0();
        }
        return Unit.f312394a;
    }

    @androidx.compose.runtime.o
    @NotNull
    public static final coil.request.i m(@Nullable Object obj, @Nullable androidx.compose.runtime.c0 c0Var, int i10) {
        c0Var.h0(1087186730);
        if (obj instanceof coil.request.i) {
            coil.request.i iVar = (coil.request.i) obj;
            c0Var.w0();
            return iVar;
        }
        Context context = (Context) c0Var.W(AndroidCompositionLocals_androidKt.g());
        c0Var.h0(-1245195153);
        boolean zD = c0Var.D(context) | c0Var.D(obj);
        Object objI0 = c0Var.i0();
        if (zD || objI0 == androidx.compose.runtime.c0.f35327a.a()) {
            objI0 = new coil.request.i.a(context).j(obj).f();
            c0Var.Y(objI0);
        }
        coil.request.i iVar2 = (coil.request.i) objI0;
        c0Var.w0();
        c0Var.w0();
        return iVar2;
    }

    @androidx.compose.runtime.o
    @NotNull
    public static final coil.request.i n(@Nullable Object obj, @NotNull androidx.compose.ui.layout.l lVar, @Nullable androidx.compose.runtime.c0 c0Var, int i10) {
        coil.size.j jVar;
        c0Var.h0(1677680258);
        boolean z10 = obj instanceof coil.request.i;
        if (z10) {
            coil.request.i iVar = (coil.request.i) obj;
            if (iVar.q().o() != null) {
                c0Var.w0();
                return iVar;
            }
        }
        c0Var.h0(408306591);
        if (Intrinsics.areEqual(lVar, androidx.compose.ui.layout.l.f39405a.m())) {
            jVar = f87050b;
        } else {
            c0Var.h0(408309406);
            Object objI0 = c0Var.i0();
            if (objI0 == androidx.compose.runtime.c0.f35327a.a()) {
                objI0 = new k();
                c0Var.Y(objI0);
            }
            jVar = (k) objI0;
            c0Var.w0();
        }
        c0Var.w0();
        if (z10) {
            c0Var.h0(-227230258);
            coil.request.i iVar2 = (coil.request.i) obj;
            c0Var.h0(408312509);
            boolean zD = c0Var.D(iVar2) | c0Var.D(jVar);
            Object objI1 = c0Var.i0();
            if (zD || objI1 == androidx.compose.runtime.c0.f35327a.a()) {
                objI1 = coil.request.i.S(iVar2, null, 1, null).h0(jVar).f();
                c0Var.Y(objI1);
            }
            coil.request.i iVar3 = (coil.request.i) objI1;
            c0Var.w0();
            c0Var.w0();
            c0Var.w0();
            return iVar3;
        }
        c0Var.h0(-227066702);
        Context context = (Context) c0Var.W(AndroidCompositionLocals_androidKt.g());
        c0Var.h0(408319118);
        boolean zD2 = c0Var.D(context) | c0Var.D(obj) | c0Var.D(jVar);
        Object objI2 = c0Var.i0();
        if (zD2 || objI2 == androidx.compose.runtime.c0.f35327a.a()) {
            objI2 = new coil.request.i.a(context).j(obj).h0(jVar).f();
            c0Var.Y(objI2);
        }
        coil.request.i iVar4 = (coil.request.i) objI2;
        c0Var.w0();
        c0Var.w0();
        c0Var.w0();
        return iVar4;
    }

    public static final float o(float f10, @NotNull Function0<Float> function0) {
        return (Float.isInfinite(f10) || Float.isNaN(f10)) ? function0.invoke().floatValue() : f10;
    }

    public static final long p(long j10) {
        return androidx.compose.ui.unit.v.a(kotlin.math.b.L0(n0.n.t(j10)), kotlin.math.b.L0(n0.n.m(j10)));
    }

    @k7
    @NotNull
    public static final coil.size.h q(@NotNull androidx.compose.ui.layout.l lVar) {
        androidx.compose.ui.layout.l.a aVar = androidx.compose.ui.layout.l.f39405a;
        return (Intrinsics.areEqual(lVar, aVar.i()) || Intrinsics.areEqual(lVar, aVar.k())) ? coil.size.h.FIT : coil.size.h.FILL;
    }

    @k7
    @Nullable
    public static final coil.size.i r(long j10) {
        if (androidx.compose.ui.unit.b.v(j10)) {
            return null;
        }
        return new coil.size.i(androidx.compose.ui.unit.b.j(j10) ? coil.size.a.a(androidx.compose.ui.unit.b.p(j10)) : coil.size.c.b.f87768a, androidx.compose.ui.unit.b.i(j10) ? coil.size.a.a(androidx.compose.ui.unit.b.o(j10)) : coil.size.c.b.f87768a);
    }

    @k7
    @NotNull
    public static final Function1<AsyncImagePainter.State, AsyncImagePainter.State> s(@Nullable final androidx.compose.ui.graphics.painter.b bVar, @Nullable final androidx.compose.ui.graphics.painter.b bVar2, @Nullable final androidx.compose.ui.graphics.painter.b bVar3) {
        if (bVar == null && bVar2 == null && bVar3 == null) {
            return AsyncImagePainter.Z.a();
        }
        return new Function1() { // from class: coil.compose.f0
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return g0.t(bVar, bVar3, bVar2, (AsyncImagePainter.State) obj);
            }
        };
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final AsyncImagePainter.State t(androidx.compose.ui.graphics.painter.b bVar, androidx.compose.ui.graphics.painter.b bVar2, androidx.compose.ui.graphics.painter.b bVar3, AsyncImagePainter.State state) {
        AsyncImagePainter.State state2;
        AsyncImagePainter.State.Error error;
        if (state instanceof AsyncImagePainter.State.Loading) {
            AsyncImagePainter.State.Loading loading = (AsyncImagePainter.State.Loading) state;
            return bVar != null ? loading.c(bVar) : loading;
        }
        if (state instanceof AsyncImagePainter.State.Error) {
            error = (AsyncImagePainter.State.Error) state;
            if (error.f().e() instanceof coil.request.l) {
                if (bVar2 != null) {
                    return AsyncImagePainter.State.Error.e(error, bVar2, null, 2, null);
                }
            } else if (bVar3 != null) {
                state2 = state;
                state2 = error;
                state2 = error;
                return AsyncImagePainter.State.Error.e(error, bVar3, null, 2, null);
            }
        }
        state2 = state;
        state2 = error;
        state2 = error;
        state2 = state;
        return state2;
    }
}
