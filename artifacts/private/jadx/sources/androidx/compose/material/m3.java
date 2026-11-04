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
@SourceDebugExtension({"SMAP\nBottomSheetScaffold.kt\nKotlin\n*S Kotlin\n*F\n+ 1 BottomSheetScaffold.kt\nandroidx/compose/material/BottomSheetState\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,601:1\n1#2:602\n*E\n"})
public final class m3 {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NotNull
    public static final a f23741b = new a(null);

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final int f23742c = 0;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    private final u<n3> f23743a;

    public static final class a {
        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final n3 d(androidx.compose.runtime.saveable.g0 g0Var, m3 m3Var) {
            return m3Var.k().y();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final m3 e(androidx.compose.ui.unit.d dVar, androidx.compose.animation.core.o oVar, Function1 function1, n3 n3Var) {
            return new m3(n3Var, dVar, oVar, function1);
        }

        @NotNull
        public final androidx.compose.runtime.saveable.c0<m3, ?> c(@NotNull final androidx.compose.animation.core.o<Float> oVar, @NotNull final Function1<? super n3, Boolean> function1, @NotNull final androidx.compose.ui.unit.d dVar) {
            return androidx.compose.runtime.saveable.f0.e(new Function2() { // from class: androidx.compose.material.k3
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    return m3.a.d((androidx.compose.runtime.saveable.g0) obj, (m3) obj2);
                }
            }, new Function1() { // from class: androidx.compose.material.l3
                @Override // kotlin.jvm.functions.Function1
                public final Object invoke(Object obj) {
                    return m3.a.e(dVar, oVar, function1, (n3) obj);
                }
            });
        }

        private a() {
        }
    }

    public m3(@NotNull n3 n3Var, @NotNull final androidx.compose.ui.unit.d dVar, @NotNull androidx.compose.animation.core.o<Float> oVar, @NotNull Function1<? super n3, Boolean> function1) {
        this.f23743a = new u<>(n3Var, new Function1() { // from class: androidx.compose.material.i3
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return Float.valueOf(m3.e(dVar, ((Float) obj).floatValue()));
            }
        }, new Function0() { // from class: androidx.compose.material.j3
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return Float.valueOf(m3.f(dVar));
            }
        }, oVar, function1);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean d(n3 n3Var) {
        return true;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final float e(androidx.compose.ui.unit.d dVar, float f10) {
        return dVar.S7(d3.f22434b);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final float f(androidx.compose.ui.unit.d dVar) {
        return dVar.S7(d3.f22435c);
    }

    public static /* synthetic */ Object h(m3 m3Var, n3 n3Var, float f10, kotlin.coroutines.d dVar, int i10, Object obj) {
        if ((i10 & 2) != 0) {
            f10 = m3Var.f23743a.B();
        }
        return m3Var.g(n3Var, f10, dVar);
    }

    @u7
    @kotlin.l(message = "Please use the progress function to query progress explicitly between targets.", replaceWith = @kotlin.b1(expression = "progress(from = , to = )", imports = {}))
    public static /* synthetic */ void n() {
    }

    @Nullable
    public final Object g(@NotNull n3 n3Var, float f10, @NotNull kotlin.coroutines.d<? super Unit> dVar) {
        Object objF = k.f(this.f23743a, n3Var, f10, dVar);
        return objF == kotlin.coroutines.intrinsics.b.l() ? objF : Unit.f312394a;
    }

    @Nullable
    public final Object i(@NotNull kotlin.coroutines.d<? super Unit> dVar) {
        Object objG = k.g(this.f23743a, n3.Collapsed, 0.0f, dVar, 2, null);
        return objG == kotlin.coroutines.intrinsics.b.l() ? objG : Unit.f312394a;
    }

    @Nullable
    public final Object j(@NotNull kotlin.coroutines.d<? super Unit> dVar) {
        w5<n3> w5VarU = this.f23743a.u();
        n3 n3Var = n3.Expanded;
        if (!w5VarU.d(n3Var)) {
            n3Var = n3.Collapsed;
        }
        int i10 = 6 ^ 0;
        Object objG = k.g(this.f23743a, n3Var, 0.0f, dVar, 2, null);
        return objG == kotlin.coroutines.intrinsics.b.l() ? objG : Unit.f312394a;
    }

    @NotNull
    public final u<n3> k() {
        return this.f23743a;
    }

    @NotNull
    public final n3 l() {
        return this.f23743a.y();
    }

    @androidx.annotation.x(from = 0.0d, to = 1.0d)
    public final float m() {
        return this.f23743a.E();
    }

    @NotNull
    public final n3 o() {
        return this.f23743a.F();
    }

    public final boolean p() {
        return this.f23743a.y() == n3.Collapsed;
    }

    public final boolean q() {
        return this.f23743a.y() == n3.Expanded;
    }

    @androidx.annotation.x(from = 0.0d, to = 1.0d)
    public final float r(@NotNull n3 n3Var, @NotNull n3 n3Var2) {
        float fC = this.f23743a.u().c(n3Var);
        float fC2 = this.f23743a.u().c(n3Var2);
        float fH = (kotlin.ranges.r.H(this.f23743a.C(), Math.min(fC, fC2), Math.max(fC, fC2)) - fC) / (fC2 - fC);
        if (Float.isNaN(fH)) {
            return 1.0f;
        }
        return Math.abs(fH);
    }

    public final float s() {
        return this.f23743a.K();
    }

    @Nullable
    public final Object t(@NotNull n3 n3Var, @NotNull kotlin.coroutines.d<? super Unit> dVar) {
        Object objK = k.k(this.f23743a, n3Var, dVar);
        return objK == kotlin.coroutines.intrinsics.b.l() ? objK : Unit.f312394a;
    }

    public /* synthetic */ m3(n3 n3Var, androidx.compose.ui.unit.d dVar, androidx.compose.animation.core.o oVar, Function1 function1, int i10, DefaultConstructorMarker defaultConstructorMarker) {
        this(n3Var, dVar, (i10 & 4) != 0 ? s2.f24875a.a() : oVar, (i10 & 8) != 0 ? new Function1() { // from class: androidx.compose.material.h3
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return Boolean.valueOf(m3.d((n3) obj));
            }
        } : function1);
    }
}
