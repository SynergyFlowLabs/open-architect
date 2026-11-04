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
@androidx.compose.runtime.k7
@SourceDebugExtension({"SMAP\nBackdropScaffold.kt\nKotlin\n*S Kotlin\n*F\n+ 1 BackdropScaffold.kt\nandroidx/compose/material/BackdropScaffoldState\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,695:1\n1#2:696\n*E\n"})
public final class v1 {

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    @NotNull
    public static final a f25202f = new a(null);

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static final int f25203g = 0;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    private final Function1<w1, Boolean> f25204a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NotNull
    private final ig f25205b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @NotNull
    private final u<w1> f25206c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @Nullable
    private androidx.compose.ui.unit.d f25207d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    @NotNull
    private final androidx.compose.ui.input.nestedscroll.a f25208e;

    public static final class a {
        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final w1 d(androidx.compose.runtime.saveable.g0 g0Var, v1 v1Var) {
            return v1Var.h().y();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final v1 e(androidx.compose.ui.unit.d dVar, androidx.compose.animation.core.o oVar, Function1 function1, ig igVar, w1 w1Var) {
            return n1.C(w1Var, dVar, oVar, function1, igVar);
        }

        @NotNull
        public final androidx.compose.runtime.saveable.c0<v1, ?> c(@NotNull final androidx.compose.animation.core.o<Float> oVar, @NotNull final Function1<? super w1, Boolean> function1, @NotNull final ig igVar, @NotNull final androidx.compose.ui.unit.d dVar) {
            return androidx.compose.runtime.saveable.f0.e(new Function2() { // from class: androidx.compose.material.t1
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    return v1.a.d((androidx.compose.runtime.saveable.g0) obj, (v1) obj2);
                }
            }, new Function1() { // from class: androidx.compose.material.u1
                @Override // kotlin.jvm.functions.Function1
                public final Object invoke(Object obj) {
                    return v1.a.e(dVar, oVar, function1, igVar, (w1) obj);
                }
            });
        }

        private a() {
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    @kotlin.l(message = "This constructor is deprecated. Density must be provided by the component. Please use the constructor that provides a [Density].", replaceWith = @kotlin.b1(expression = "\n            BackdropScaffoldState(\n                initialValue = initialValue,\n                density = LocalDensity.current,\n                animationSpec = animationSpec,\n                confirmValueChange = confirmValueChange\n            )\n            ", imports = {}))
    public v1(@NotNull w1 w1Var, @NotNull androidx.compose.animation.core.o<Float> oVar, @NotNull Function1<? super w1, Boolean> function1, @NotNull ig igVar) {
        this.f25204a = function1;
        this.f25205b = igVar;
        u<w1> uVar = new u<>(w1Var, new Function1() { // from class: androidx.compose.material.q1
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return Float.valueOf(v1.e(this.f24362a, ((Float) obj).floatValue()));
            }
        }, new Function0() { // from class: androidx.compose.material.r1
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return Float.valueOf(v1.f(this.f24591a));
            }
        }, oVar, function1);
        this.f25206c = uVar;
        this.f25208e = n1.M(uVar, androidx.compose.foundation.gestures.q3.Vertical);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean d(w1 w1Var) {
        return true;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final float e(v1 v1Var, float f10) {
        return v1Var.r().S7(n1.f23849c);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final float f(v1 v1Var) {
        return v1Var.r().S7(n1.f23848b);
    }

    private final androidx.compose.ui.unit.d r() {
        androidx.compose.ui.unit.d dVar = this.f25207d;
        if (dVar != null) {
            return dVar;
        }
        throw new IllegalArgumentException(("The density on BackdropScaffoldState (" + this + ") was not set. Did you use BackdropScaffoldState with the BackdropScaffold composable?").toString());
    }

    @Nullable
    public final Object g(@NotNull kotlin.coroutines.d<? super Unit> dVar) {
        int i10 = 6 ^ 0;
        Object objG = k.g(this.f25206c, w1.Concealed, 0.0f, dVar, 2, null);
        return objG == kotlin.coroutines.intrinsics.b.l() ? objG : Unit.f312394a;
    }

    @NotNull
    public final u<w1> h() {
        return this.f25206c;
    }

    @NotNull
    public final Function1<w1, Boolean> i() {
        return this.f25204a;
    }

    @NotNull
    public final w1 j() {
        return this.f25206c.y();
    }

    @Nullable
    public final androidx.compose.ui.unit.d k() {
        return this.f25207d;
    }

    @NotNull
    public final androidx.compose.ui.input.nestedscroll.a l() {
        return this.f25208e;
    }

    @NotNull
    public final ig m() {
        return this.f25205b;
    }

    @NotNull
    public final w1 n() {
        return this.f25206c.F();
    }

    public final boolean o() {
        return this.f25206c.y() == w1.Concealed;
    }

    public final boolean p() {
        return this.f25206c.y() == w1.Revealed;
    }

    @androidx.annotation.x(from = 0.0d, to = 1.0d)
    public final float q(@NotNull w1 w1Var, @NotNull w1 w1Var2) {
        float fC = this.f25206c.u().c(w1Var);
        float fC2 = this.f25206c.u().c(w1Var2);
        float fH = (kotlin.ranges.r.H(this.f25206c.C(), Math.min(fC, fC2), Math.max(fC, fC2)) - fC) / (fC2 - fC);
        if (Float.isNaN(fH)) {
            return 1.0f;
        }
        return Math.abs(fH);
    }

    public final float s() {
        return this.f25206c.K();
    }

    @Nullable
    public final Object t(@NotNull kotlin.coroutines.d<? super Unit> dVar) {
        Object objG = k.g(this.f25206c, w1.Revealed, 0.0f, dVar, 2, null);
        return objG == kotlin.coroutines.intrinsics.b.l() ? objG : Unit.f312394a;
    }

    public final void u(@Nullable androidx.compose.ui.unit.d dVar) {
        this.f25207d = dVar;
    }

    public /* synthetic */ v1(w1 w1Var, androidx.compose.animation.core.o oVar, Function1 function1, ig igVar, int i10, DefaultConstructorMarker defaultConstructorMarker) {
        this(w1Var, (i10 & 2) != 0 ? p0.f24133a.a() : oVar, (i10 & 4) != 0 ? new Function1() { // from class: androidx.compose.material.s1
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return Boolean.valueOf(v1.d((w1) obj));
            }
        } : function1, (i10 & 8) != 0 ? new ig() : igVar);
    }
}
