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
@SourceDebugExtension({"SMAP\nDrawer.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Drawer.kt\nandroidx/compose/material/DrawerState\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,838:1\n1#2:839\n*E\n"})
public final class k7 {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @NotNull
    public static final a f23499c = new a(null);

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final int f23500d = 0;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    private final u<l7> f23501a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @Nullable
    private androidx.compose.ui.unit.d f23502b;

    public static final class a {
        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final l7 d(androidx.compose.runtime.saveable.g0 g0Var, k7 k7Var) {
            return k7Var.j();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final k7 e(Function1 function1, l7 l7Var) {
            return new k7(l7Var, function1);
        }

        @NotNull
        public final androidx.compose.runtime.saveable.c0<k7, l7> c(@NotNull final Function1<? super l7, Boolean> function1) {
            return androidx.compose.runtime.saveable.f0.e(new Function2() { // from class: androidx.compose.material.i7
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    return k7.a.d((androidx.compose.runtime.saveable.g0) obj, (k7) obj2);
                }
            }, new Function1() { // from class: androidx.compose.material.j7
                @Override // kotlin.jvm.functions.Function1
                public final Object invoke(Object obj) {
                    return k7.a.e(function1, (l7) obj);
                }
            });
        }

        private a() {
        }
    }

    public k7(@NotNull l7 l7Var, @NotNull Function1<? super l7, Boolean> function1) {
        this.f23501a = new u<>(l7Var, new Function1() { // from class: androidx.compose.material.g7
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return Float.valueOf(k7.e(this.f22870a, ((Float) obj).floatValue()));
            }
        }, new Function0() { // from class: androidx.compose.material.h7
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return Float.valueOf(k7.f(this.f23018a));
            }
        }, v6.f25230d, function1);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean d(l7 l7Var) {
        return true;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final float e(k7 k7Var, float f10) {
        return k7Var.t().S7(v6.f25228b);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final float f(k7 k7Var) {
        return k7Var.t().S7(v6.f25229c);
    }

    @u7
    public static /* synthetic */ void m() {
    }

    @u7
    public static /* synthetic */ void o() {
    }

    private final androidx.compose.ui.unit.d t() {
        androidx.compose.ui.unit.d dVar = this.f23502b;
        if (dVar != null) {
            return dVar;
        }
        throw new IllegalArgumentException(("The density on DrawerState (" + this + ") was not set. Did you use DrawerState with the Drawer composable?").toString());
    }

    @u7
    @kotlin.l(level = kotlin.n.ERROR, message = "This method has been replaced by the open and close methods. The animation spec is now an implementation detail of ModalDrawer.")
    @Nullable
    public final Object g(@NotNull l7 l7Var, @NotNull androidx.compose.animation.core.o<Float> oVar, @NotNull kotlin.coroutines.d<? super Unit> dVar) {
        Object objG = k.g(this.f23501a, l7Var, 0.0f, dVar, 2, null);
        return objG == kotlin.coroutines.intrinsics.b.l() ? objG : Unit.f312394a;
    }

    @Nullable
    public final Object h(@NotNull kotlin.coroutines.d<? super Unit> dVar) {
        int i10 = 2 & 0;
        Object objG = k.g(this.f23501a, l7.Closed, 0.0f, dVar, 2, null);
        return objG == kotlin.coroutines.intrinsics.b.l() ? objG : Unit.f312394a;
    }

    @NotNull
    public final u<l7> i() {
        return this.f23501a;
    }

    @NotNull
    public final l7 j() {
        return this.f23501a.y();
    }

    @Nullable
    public final androidx.compose.ui.unit.d k() {
        return this.f23502b;
    }

    public final float l() {
        return this.f23501a.C();
    }

    @NotNull
    public final l7 n() {
        return this.f23501a.F();
    }

    public final boolean p() {
        return this.f23501a.H();
    }

    public final boolean q() {
        return j() == l7.Closed;
    }

    public final boolean r() {
        return j() == l7.Open;
    }

    @Nullable
    public final Object s(@NotNull kotlin.coroutines.d<? super Unit> dVar) {
        Object objG = k.g(this.f23501a, l7.Open, 0.0f, dVar, 2, null);
        return objG == kotlin.coroutines.intrinsics.b.l() ? objG : Unit.f312394a;
    }

    public final float u() {
        return this.f23501a.K();
    }

    public final void v(@Nullable androidx.compose.ui.unit.d dVar) {
        this.f23502b = dVar;
    }

    @Nullable
    public final Object w(@NotNull l7 l7Var, @NotNull kotlin.coroutines.d<? super Unit> dVar) {
        Object objK = k.k(this.f23501a, l7Var, dVar);
        return objK == kotlin.coroutines.intrinsics.b.l() ? objK : Unit.f312394a;
    }

    public /* synthetic */ k7(l7 l7Var, Function1 function1, int i10, DefaultConstructorMarker defaultConstructorMarker) {
        this(l7Var, (i10 & 2) != 0 ? new Function1() { // from class: androidx.compose.material.f7
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return Boolean.valueOf(k7.d((l7) obj));
            }
        } : function1);
    }
}
