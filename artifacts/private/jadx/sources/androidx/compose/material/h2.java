package androidx.compose.material;

import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes.dex */
@androidx.compose.runtime.internal.w0(parameters = 0)
@SourceDebugExtension({"SMAP\nDrawer.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Drawer.kt\nandroidx/compose/material/BottomDrawerState\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,838:1\n1#2:839\n*E\n"})
public final class h2 {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @NotNull
    public static final a f22986d = new a(null);

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final int f22987e = 8;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    private final u<i2> f22988a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NotNull
    private final androidx.compose.ui.input.nestedscroll.a f22989b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @Nullable
    private androidx.compose.ui.unit.d f22990c;

    public static final class a {
        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final i2 d(androidx.compose.runtime.saveable.g0 g0Var, h2 h2Var) {
            return h2Var.l().y();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final h2 e(androidx.compose.ui.unit.d dVar, Function1 function1, androidx.compose.animation.core.o oVar, i2 i2Var) {
            return new h2(i2Var, dVar, function1, oVar);
        }

        @NotNull
        public final androidx.compose.runtime.saveable.c0<h2, i2> c(@NotNull final androidx.compose.ui.unit.d dVar, @NotNull final Function1<? super i2, Boolean> function1, @NotNull final androidx.compose.animation.core.o<Float> oVar) {
            return androidx.compose.runtime.saveable.f0.e(new Function2() { // from class: androidx.compose.material.f2
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    return h2.a.d((androidx.compose.runtime.saveable.g0) obj, (h2) obj2);
                }
            }, new Function1() { // from class: androidx.compose.material.g2
                @Override // kotlin.jvm.functions.Function1
                public final Object invoke(Object obj) {
                    return h2.a.e(dVar, function1, oVar, (i2) obj);
                }
            });
        }

        private a() {
        }
    }

    public h2(@NotNull i2 i2Var, @NotNull final androidx.compose.ui.unit.d dVar, @NotNull Function1<? super i2, Boolean> function1, @NotNull androidx.compose.animation.core.o<Float> oVar) {
        u<i2> uVar = new u<>(i2Var, new Function1() { // from class: androidx.compose.material.c2
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return Float.valueOf(h2.e(dVar, ((Float) obj).floatValue()));
            }
        }, new Function0() { // from class: androidx.compose.material.d2
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return Float.valueOf(h2.f(dVar));
            }
        }, oVar, function1);
        this.f22988a = uVar;
        this.f22989b = v6.w(uVar);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean d(i2 i2Var) {
        return true;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final float e(androidx.compose.ui.unit.d dVar, float f10) {
        return dVar.S7(v6.f25228b);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final float f(androidx.compose.ui.unit.d dVar) {
        return dVar.S7(v6.f25229c);
    }

    public static /* synthetic */ Object h(h2 h2Var, i2 i2Var, float f10, kotlin.coroutines.d dVar, int i10, Object obj) {
        if ((i10 & 2) != 0) {
            f10 = h2Var.f22988a.B();
        }
        return h2Var.g(i2Var, f10, dVar);
    }

    @u7
    @kotlin.l(message = "Please use the progress function to query progress explicitly between targets.", replaceWith = @kotlin.b1(expression = "progress(from = , to = )", imports = {}))
    public static /* synthetic */ void r() {
    }

    private final boolean w() {
        return this.f22988a.u().d(i2.Open);
    }

    public final void A(@Nullable androidx.compose.ui.unit.d dVar) {
        this.f22990c = dVar;
    }

    @Nullable
    public final Object B(@NotNull i2 i2Var, @NotNull kotlin.coroutines.d<? super Unit> dVar) {
        Object objK = k.k(this.f22988a, i2Var, dVar);
        return objK == kotlin.coroutines.intrinsics.b.l() ? objK : Unit.f312394a;
    }

    @Nullable
    public final Object g(@NotNull i2 i2Var, float f10, @NotNull kotlin.coroutines.d<? super Unit> dVar) {
        Object objF = k.f(this.f22988a, i2Var, f10, dVar);
        return objF == kotlin.coroutines.intrinsics.b.l() ? objF : Unit.f312394a;
    }

    @Nullable
    public final Object i(@NotNull kotlin.coroutines.d<? super Unit> dVar) {
        Object objG = k.g(this.f22988a, i2.Closed, 0.0f, dVar, 2, null);
        return objG == kotlin.coroutines.intrinsics.b.l() ? objG : Unit.f312394a;
    }

    public final boolean j(@NotNull i2 i2Var) {
        return this.f22988a.x().invoke(i2Var).booleanValue();
    }

    @Nullable
    public final Object k(@NotNull kotlin.coroutines.d<? super Unit> dVar) {
        Object objG = k.g(this.f22988a, i2.Expanded, 0.0f, dVar, 2, null);
        return objG == kotlin.coroutines.intrinsics.b.l() ? objG : Unit.f312394a;
    }

    @NotNull
    public final u<i2> l() {
        return this.f22988a;
    }

    @NotNull
    public final i2 m() {
        return this.f22988a.y();
    }

    @Nullable
    public final androidx.compose.ui.unit.d n() {
        return this.f22990c;
    }

    @NotNull
    public final androidx.compose.ui.input.nestedscroll.a o() {
        return this.f22989b;
    }

    public final float p() {
        return this.f22988a.C();
    }

    @androidx.annotation.x(from = 0.0d, to = 1.0d)
    public final float q() {
        return this.f22988a.E();
    }

    @NotNull
    public final i2 s() {
        return this.f22988a.F();
    }

    public final boolean t() {
        if (this.f22988a.y() != i2.Closed) {
            return false;
        }
        int i10 = 4 << 1;
        return true;
    }

    public final boolean u() {
        return this.f22988a.y() == i2.Expanded;
    }

    public final boolean v() {
        return this.f22988a.y() != i2.Closed;
    }

    @Nullable
    public final Object x(@NotNull kotlin.coroutines.d<? super Unit> dVar) {
        Object objG = k.g(this.f22988a, w() ? i2.Open : i2.Expanded, 0.0f, dVar, 2, null);
        return objG == kotlin.coroutines.intrinsics.b.l() ? objG : Unit.f312394a;
    }

    @androidx.annotation.x(from = 0.0d, to = 1.0d)
    public final float y(@NotNull i2 i2Var, @NotNull i2 i2Var2) {
        float fC = this.f22988a.u().c(i2Var);
        float fC2 = this.f22988a.u().c(i2Var2);
        float fH = (kotlin.ranges.r.H(this.f22988a.C(), Math.min(fC, fC2), Math.max(fC, fC2)) - fC) / (fC2 - fC);
        if (Float.isNaN(fH)) {
            return 1.0f;
        }
        return Math.abs(fH);
    }

    public final float z() {
        return this.f22988a.K();
    }

    public /* synthetic */ h2(i2 i2Var, androidx.compose.ui.unit.d dVar, Function1 function1, androidx.compose.animation.core.o oVar, int i10, DefaultConstructorMarker defaultConstructorMarker) {
        this(i2Var, dVar, (i10 & 4) != 0 ? new Function1() { // from class: androidx.compose.material.e2
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return Boolean.valueOf(h2.d((i2) obj));
            }
        } : function1, (i10 & 8) != 0 ? a6.f21970a.a() : oVar);
    }
}
