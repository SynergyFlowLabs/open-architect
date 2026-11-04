package androidx.compose.material3.carousel;

import androidx.compose.foundation.gestures.v4;
import androidx.compose.foundation.gestures.z3;
import androidx.compose.foundation.lazy.layout.m1;
import androidx.compose.foundation.q3;
import androidx.compose.material3.af;
import java.util.List;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes.dex */
@androidx.compose.runtime.internal.w0(parameters = 0)
@af
public final class j0 implements v4 {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NotNull
    public static final a f26583b = new a(null);

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final int f26584c = 8;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @NotNull
    private static final androidx.compose.runtime.saveable.c0<j0, ?> f26585d = androidx.compose.runtime.saveable.b.b(new Function2() { // from class: androidx.compose.material3.carousel.h0
        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(Object obj, Object obj2) {
            return j0.p((androidx.compose.runtime.saveable.g0) obj, (j0) obj2);
        }
    }, new Function1() { // from class: androidx.compose.material3.carousel.i0
        @Override // kotlin.jvm.functions.Function1
        public final Object invoke(Object obj) {
            return j0.q((List) obj);
        }
    });

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    private f0 f26586a;

    @af
    public static final class a {
        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @NotNull
        public final androidx.compose.runtime.saveable.c0<j0, ?> a() {
            return j0.f26585d;
        }

        private a() {
        }
    }

    @kotlin.coroutines.jvm.internal.f(c = "androidx.compose.material3.carousel.CarouselState$animateScrollToItem$2$1", f = "CarouselState.kt", i = {}, l = {com.rabbitmq.client.impl.k.b.p.f265340a}, m = "invokeSuspend", n = {}, s = {})
    static final class b extends kotlin.coroutines.jvm.internal.o implements Function2<z3, kotlin.coroutines.d<? super Unit>, Object> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        int f26587a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private /* synthetic */ Object f26588b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ f0 f26589c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        final /* synthetic */ int f26590d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        final /* synthetic */ androidx.compose.animation.core.o<Float> f26591e;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        b(f0 f0Var, int i10, androidx.compose.animation.core.o<Float> oVar, kotlin.coroutines.d<? super b> dVar) {
            super(2, dVar);
            this.f26589c = f0Var;
            this.f26590d = i10;
            this.f26591e = oVar;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final Unit n(f0 f0Var, z3 z3Var, int i10) {
            f0Var.Q0(z3Var, i10);
            return Unit.f312394a;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final kotlin.coroutines.d<Unit> create(Object obj, kotlin.coroutines.d<?> dVar) {
            b bVar = new b(this.f26589c, this.f26590d, this.f26591e, dVar);
            bVar.f26588b = obj;
            return bVar;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            Object objL = kotlin.coroutines.intrinsics.b.l();
            int i10 = this.f26587a;
            if (i10 == 0) {
                ResultKt.m(obj);
                m1 m1VarA = androidx.compose.foundation.pager.z0.a(this.f26589c, (z3) this.f26588b);
                final f0 f0Var = this.f26589c;
                int i11 = this.f26590d;
                androidx.compose.animation.core.o<Float> oVar = this.f26591e;
                Function2 function2 = new Function2() { // from class: androidx.compose.material3.carousel.k0
                    @Override // kotlin.jvm.functions.Function2
                    public final Object invoke(Object obj2, Object obj3) {
                        return j0.b.n(f0Var, (z3) obj2, ((Integer) obj3).intValue());
                    }
                };
                this.f26587a = 1;
                int i12 = 6 & 0;
                if (n0.d(m1VarA, f0Var, i11, 0.0f, oVar, function2, this) == objL) {
                    return objL;
                }
            } else {
                if (i10 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.m(obj);
            }
            return Unit.f312394a;
        }

        @Override // kotlin.jvm.functions.Function2
        /* JADX INFO: renamed from: m, reason: merged with bridge method [inline-methods] */
        public final Object invoke(z3 z3Var, kotlin.coroutines.d<? super Unit> dVar) {
            return ((b) create(z3Var, dVar)).invokeSuspend(Unit.f312394a);
        }
    }

    public j0(int i10, @androidx.annotation.x(from = -0.5d, to = 0.5d) float f10, @NotNull Function0<Integer> function0) {
        this.f26586a = new f0(i10, f10, function0);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final List p(androidx.compose.runtime.saveable.g0 g0Var, j0 j0Var) {
        return CollectionsKt.listOf(Integer.valueOf(j0Var.f26586a.E()), Float.valueOf(j0Var.f26586a.F()), Integer.valueOf(j0Var.f26586a.V()));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final j0 q(final List list) {
        Object obj = list.get(0);
        Intrinsics.checkNotNull(obj, "null cannot be cast to non-null type kotlin.Int");
        int iIntValue = ((Integer) obj).intValue();
        Object obj2 = list.get(1);
        Intrinsics.checkNotNull(obj2, "null cannot be cast to non-null type kotlin.Float");
        return new j0(iIntValue, ((Float) obj2).floatValue(), new Function0() { // from class: androidx.compose.material3.carousel.g0
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return Integer.valueOf(j0.r(list));
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final int r(List list) {
        Object obj = list.get(2);
        Intrinsics.checkNotNull(obj, "null cannot be cast to non-null type kotlin.Int");
        return ((Integer) obj).intValue();
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ Object u(j0 j0Var, int i10, androidx.compose.animation.core.o oVar, kotlin.coroutines.d dVar, int i11, Object obj) {
        if ((i11 & 2) != 0) {
            oVar = androidx.compose.animation.core.p.r(0.0f, 0.0f, null, 7, null);
        }
        return j0Var.t(i10, oVar, dVar);
    }

    @Override // androidx.compose.foundation.gestures.v4
    public boolean a() {
        return this.f26586a.a();
    }

    @Override // androidx.compose.foundation.gestures.v4
    public float b(float f10) {
        return this.f26586a.b(f10);
    }

    @Override // androidx.compose.foundation.gestures.v4
    @Nullable
    public Object c(@NotNull q3 q3Var, @NotNull Function2<? super z3, ? super kotlin.coroutines.d<? super Unit>, ? extends Object> function2, @NotNull kotlin.coroutines.d<? super Unit> dVar) {
        Object objC = this.f26586a.c(q3Var, function2, dVar);
        return objC == kotlin.coroutines.intrinsics.b.l() ? objC : Unit.f312394a;
    }

    @Nullable
    public final Object t(int i10, @NotNull androidx.compose.animation.core.o<Float> oVar, @NotNull kotlin.coroutines.d<? super Unit> dVar) {
        f0 f0Var = this.f26586a;
        if ((i10 != f0Var.E() || f0Var.F() != 0.0f) && f0Var.V() != 0) {
            Object objH = v4.h(f0Var, null, new b(f0Var, f0Var.V() > 0 ? kotlin.ranges.r.I(i10, 0, f0Var.V() - 1) : 0, oVar, null), dVar, 1, null);
            return objH == kotlin.coroutines.intrinsics.b.l() ? objH : Unit.f312394a;
        }
        return Unit.f312394a;
    }

    public final int v() {
        return this.f26586a.E();
    }

    @NotNull
    public final f0 w() {
        return this.f26586a;
    }

    @Nullable
    public final Object x(int i10, @NotNull kotlin.coroutines.d<? super Unit> dVar) {
        Object objW0 = this.f26586a.w0(i10, 0.0f, dVar);
        return objW0 == kotlin.coroutines.intrinsics.b.l() ? objW0 : Unit.f312394a;
    }

    public final void y(@NotNull f0 f0Var) {
        this.f26586a = f0Var;
    }

    public /* synthetic */ j0(int i10, float f10, Function0 function0, int i11, DefaultConstructorMarker defaultConstructorMarker) {
        this((i11 & 1) != 0 ? 0 : i10, (i11 & 2) != 0 ? 0.0f : f10, function0);
    }
}
