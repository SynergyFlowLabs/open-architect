package androidx.compose.material3;

import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes.dex */
@androidx.compose.runtime.internal.w0(parameters = 0)
public final class ub0 implements qb0 {

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    @NotNull
    public static final a f33558f = new a(null);

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static final int f33559g = 8;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private static final float f33560h = 0.0f;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private static final float f33561i = 1.0f;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    private xb0 f33562a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NotNull
    private final androidx.compose.animation.core.o<Float> f33563b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final float f33564c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @NotNull
    private final androidx.compose.animation.core.c<Float, androidx.compose.animation.core.s> f33565d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    @NotNull
    private final androidx.compose.runtime.n7<xb0> f33566e;

    public static final class a {
        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final xb0 d(androidx.compose.runtime.saveable.g0 g0Var, qb0 qb0Var) {
            return qb0Var.c();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final qb0 e(androidx.compose.animation.core.o oVar, xb0 xb0Var) {
            return new ub0(xb0Var, oVar);
        }

        @NotNull
        public final androidx.compose.runtime.saveable.c0<qb0, xb0> c(@NotNull final androidx.compose.animation.core.o<Float> oVar) {
            return androidx.compose.runtime.saveable.f0.e(new Function2() { // from class: androidx.compose.material3.sb0
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    return ub0.a.d((androidx.compose.runtime.saveable.g0) obj, (qb0) obj2);
                }
            }, new Function1() { // from class: androidx.compose.material3.tb0
                @Override // kotlin.jvm.functions.Function1
                public final Object invoke(Object obj) {
                    return ub0.a.e(oVar, (xb0) obj);
                }
            });
        }

        private a() {
        }
    }

    public ub0(@NotNull xb0 xb0Var, @NotNull androidx.compose.animation.core.o<Float> oVar) {
        this.f33562a = xb0Var;
        this.f33563b = oVar;
        float f10 = wb0.b(xb0Var) ? 1.0f : 0.0f;
        this.f33564c = f10;
        this.f33565d = new androidx.compose.animation.core.c<>(Float.valueOf(f10), androidx.compose.animation.core.t4.P(kotlin.jvm.internal.z.f312833a), null, null, 12, null);
        this.f33566e = androidx.compose.runtime.w6.e(new Function0() { // from class: androidx.compose.material3.rb0
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return ub0.i(this.f32516a);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final xb0 i(ub0 ub0Var) {
        return ub0Var.f33565d.v().floatValue() == 1.0f ? xb0.Expanded : xb0.Collapsed;
    }

    @Override // androidx.compose.material3.qb0
    public boolean b() {
        return this.f33565d.y();
    }

    @Override // androidx.compose.material3.qb0
    @NotNull
    public xb0 c() {
        return this.f33565d.s().floatValue() == 1.0f ? xb0.Expanded : xb0.Collapsed;
    }

    @Override // androidx.compose.material3.qb0
    @NotNull
    public xb0 d() {
        return this.f33566e.getValue();
    }

    @Override // androidx.compose.material3.qb0
    @Nullable
    public Object e(@NotNull kotlin.coroutines.d<? super Unit> dVar) {
        int i10 = 0 << 0;
        Object objI = androidx.compose.animation.core.c.i(this.f33565d, kotlin.coroutines.jvm.internal.b.e(1.0f), this.f33563b, null, null, dVar, 12, null);
        return objI == kotlin.coroutines.intrinsics.b.l() ? objI : Unit.f312394a;
    }

    @Override // androidx.compose.material3.qb0
    @Nullable
    public Object f(@NotNull kotlin.coroutines.d<? super Unit> dVar) {
        Object objI = androidx.compose.animation.core.c.i(this.f33565d, kotlin.coroutines.jvm.internal.b.e(wb0.b(c()) ? 0.0f : 1.0f), this.f33563b, null, null, dVar, 12, null);
        return objI == kotlin.coroutines.intrinsics.b.l() ? objI : Unit.f312394a;
    }

    @Override // androidx.compose.material3.qb0
    @Nullable
    public Object g(@NotNull kotlin.coroutines.d<? super Unit> dVar) {
        Object objI = androidx.compose.animation.core.c.i(this.f33565d, kotlin.coroutines.jvm.internal.b.e(0.0f), this.f33563b, null, null, dVar, 12, null);
        return objI == kotlin.coroutines.intrinsics.b.l() ? objI : Unit.f312394a;
    }

    @Override // androidx.compose.material3.qb0
    @Nullable
    public Object h(@NotNull xb0 xb0Var, @NotNull kotlin.coroutines.d<? super Unit> dVar) {
        Object objC = this.f33565d.C(kotlin.coroutines.jvm.internal.b.e(wb0.b(xb0Var) ? 1.0f : 0.0f), dVar);
        return objC == kotlin.coroutines.intrinsics.b.l() ? objC : Unit.f312394a;
    }

    @NotNull
    public final xb0 j() {
        return this.f33562a;
    }

    public final void k(@NotNull xb0 xb0Var) {
        this.f33562a = xb0Var;
    }
}
