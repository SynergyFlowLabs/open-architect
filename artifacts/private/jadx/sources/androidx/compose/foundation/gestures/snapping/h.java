package androidx.compose.foundation.gestures.snapping;

import androidx.compose.animation.core.g0;
import androidx.compose.animation.core.i0;
import androidx.compose.animation.core.r;
import androidx.compose.animation.core.s;
import androidx.compose.foundation.gestures.e5;
import androidx.compose.foundation.gestures.n4;
import androidx.compose.foundation.gestures.z3;
import androidx.compose.runtime.internal.w0;
import androidx.compose.ui.c0;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.jvm.internal.i1;
import kotlinx.coroutines.s0;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes.dex */
@w0(parameters = 1)
@SourceDebugExtension({"SMAP\nSnapFlingBehavior.kt\nKotlin\n*S Kotlin\n*F\n+ 1 SnapFlingBehavior.kt\nandroidx/compose/foundation/gestures/snapping/SnapFlingBehavior\n+ 2 SnapFlingBehavior.kt\nandroidx/compose/foundation/gestures/snapping/SnapFlingBehaviorKt\n+ 3 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,476:1\n472#2,4:477\n472#2,4:481\n472#2,4:485\n472#2,4:489\n1#3:493\n*S KotlinDebug\n*F\n+ 1 SnapFlingBehavior.kt\nandroidx/compose/foundation/gestures/snapping/SnapFlingBehavior\n*L\n102#1:477,4\n186#1:481,4\n189#1:485,4\n199#1:489,4\n*E\n"})
public final class h implements e5 {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final int f15051e = 0;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    private final n f15052a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NotNull
    private final g0<Float> f15053b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @NotNull
    private final androidx.compose.animation.core.o<Float> f15054c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @NotNull
    private c0 f15055d = n4.g();

    @kotlin.coroutines.jvm.internal.f(c = "androidx.compose.foundation.gestures.snapping.SnapFlingBehavior", f = "SnapFlingBehavior.kt", i = {0}, l = {114}, m = "fling", n = {"onRemainingScrollOffsetUpdate"}, s = {"L$0"})
    static final class a extends kotlin.coroutines.jvm.internal.d {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        Object f15056a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        /* synthetic */ Object f15057b;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        int f15059d;

        a(kotlin.coroutines.d<? super a> dVar) {
            super(dVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            this.f15057b = obj;
            this.f15059d |= Integer.MIN_VALUE;
            int i10 = 4 & 0;
            return h.this.k(null, 0.0f, null, this);
        }
    }

    @kotlin.coroutines.jvm.internal.f(c = "androidx.compose.foundation.gestures.snapping.SnapFlingBehavior$fling$result$1", f = "SnapFlingBehavior.kt", i = {0}, l = {134, 150}, m = "invokeSuspend", n = {"remainingScrollOffset"}, s = {"L$0"})
    @SourceDebugExtension({"SMAP\nSnapFlingBehavior.kt\nKotlin\n*S Kotlin\n*F\n+ 1 SnapFlingBehavior.kt\nandroidx/compose/foundation/gestures/snapping/SnapFlingBehavior$fling$result$1\n+ 2 InlineClassHelper.kt\nandroidx/compose/foundation/internal/InlineClassHelperKt\n+ 3 SnapFlingBehavior.kt\nandroidx/compose/foundation/gestures/snapping/SnapFlingBehaviorKt\n*L\n1#1,476:1\n51#2,4:477\n51#2,4:481\n472#3,4:485\n*S KotlinDebug\n*F\n+ 1 SnapFlingBehavior.kt\nandroidx/compose/foundation/gestures/snapping/SnapFlingBehavior$fling$result$1\n*L\n124#1:477,4\n142#1:481,4\n148#1:485,4\n*E\n"})
    static final class b extends kotlin.coroutines.jvm.internal.o implements Function2<s0, kotlin.coroutines.d<? super androidx.compose.foundation.gestures.snapping.a<Float, s>>, Object> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        Object f15060a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        int f15061b;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        final /* synthetic */ float f15063d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        final /* synthetic */ Function1<Float, Unit> f15064e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        final /* synthetic */ z3 f15065f;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        b(float f10, Function1<? super Float, Unit> function1, z3 z3Var, kotlin.coroutines.d<? super b> dVar) {
            super(2, dVar);
            this.f15063d = f10;
            this.f15064e = function1;
            this.f15065f = z3Var;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final Unit n(i1.e eVar, Function1 function1, float f10) {
            float f11 = eVar.f312748a - f10;
            eVar.f312748a = f11;
            function1.invoke(Float.valueOf(f11));
            return Unit.f312394a;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final Unit s(i1.e eVar, Function1 function1, float f10) {
            float f11 = eVar.f312748a - f10;
            eVar.f312748a = f11;
            function1.invoke(Float.valueOf(f11));
            return Unit.f312394a;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final kotlin.coroutines.d<Unit> create(Object obj, kotlin.coroutines.d<?> dVar) {
            return h.this.new b(this.f15063d, this.f15064e, this.f15065f, dVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            final i1.e eVar;
            Object objP;
            Object objL = kotlin.coroutines.intrinsics.b.l();
            int i10 = this.f15061b;
            if (i10 == 0) {
                ResultKt.m(obj);
                float fB = h.this.f15052a.b(this.f15063d, i0.a(h.this.f15053b, 0.0f, this.f15063d));
                if (Float.isNaN(fB)) {
                    androidx.compose.foundation.internal.e.i("calculateApproachOffset returned NaN. Please use a valid value.");
                }
                eVar = new i1.e();
                float fAbs = Math.abs(fB) * Math.signum(this.f15063d);
                eVar.f312748a = fAbs;
                this.f15064e.invoke(kotlin.coroutines.jvm.internal.b.e(fAbs));
                h hVar = h.this;
                z3 z3Var = this.f15065f;
                float f10 = eVar.f312748a;
                float f11 = this.f15063d;
                final Function1<Float, Unit> function1 = this.f15064e;
                Function1 function2 = new Function1() { // from class: androidx.compose.foundation.gestures.snapping.i
                    @Override // kotlin.jvm.functions.Function1
                    public final Object invoke(Object obj2) {
                        return h.b.n(eVar, function1, ((Float) obj2).floatValue());
                    }
                };
                this.f15060a = eVar;
                this.f15061b = 1;
                objP = hVar.p(z3Var, f10, f11, function2, this);
                if (objP != objL) {
                }
            }
            if (i10 != 1) {
                if (i10 != 2) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.m(obj);
                return obj;
            }
            i1.e eVar2 = (i1.e) this.f15060a;
            ResultKt.m(obj);
            eVar = eVar2;
            objP = obj;
            androidx.compose.animation.core.q qVar = (androidx.compose.animation.core.q) objP;
            float fA = h.this.f15052a.a(((Number) qVar.g()).floatValue());
            if (Float.isNaN(fA)) {
                androidx.compose.foundation.internal.e.i("calculateSnapOffset returned NaN. Please use a valid value.");
            }
            eVar.f312748a = fA;
            z3 z3Var2 = this.f15065f;
            androidx.compose.animation.core.q qVarG = r.g(qVar, 0.0f, 0.0f, 0L, 0L, false, 30, null);
            androidx.compose.animation.core.o oVar = h.this.f15054c;
            final Function1<Float, Unit> function3 = this.f15064e;
            Function1 function4 = new Function1() { // from class: androidx.compose.foundation.gestures.snapping.j
                @Override // kotlin.jvm.functions.Function1
                public final Object invoke(Object obj2) {
                    return h.b.s(eVar, function3, ((Float) obj2).floatValue());
                }
            };
            this.f15060a = null;
            this.f15061b = 2;
            Object objI = m.i(z3Var2, fA, fA, qVarG, oVar, function4, this);
            return objI == objL ? objL : objI;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(s0 s0Var, kotlin.coroutines.d<? super androidx.compose.foundation.gestures.snapping.a<Float, s>> dVar) {
            return ((b) create(s0Var, dVar)).invokeSuspend(Unit.f312394a);
        }
    }

    @kotlin.coroutines.jvm.internal.f(c = "androidx.compose.foundation.gestures.snapping.SnapFlingBehavior", f = "SnapFlingBehavior.kt", i = {}, l = {100}, m = "performFling", n = {}, s = {})
    static final class c extends kotlin.coroutines.jvm.internal.d {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        /* synthetic */ Object f15066a;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        int f15068c;

        c(kotlin.coroutines.d<? super c> dVar) {
            super(dVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            this.f15066a = obj;
            this.f15068c |= Integer.MIN_VALUE;
            return h.this.b(null, 0.0f, null, this);
        }
    }

    @kotlin.coroutines.jvm.internal.f(c = "androidx.compose.foundation.gestures.snapping.SnapFlingBehavior", f = "SnapFlingBehavior.kt", i = {}, l = {174}, m = "tryApproach", n = {}, s = {})
    static final class d extends kotlin.coroutines.jvm.internal.d {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        /* synthetic */ Object f15069a;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        int f15071c;

        d(kotlin.coroutines.d<? super d> dVar) {
            super(dVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            this.f15069a = obj;
            this.f15071c |= Integer.MIN_VALUE;
            boolean z10 = false | false;
            return h.this.p(null, 0.0f, 0.0f, null, this);
        }
    }

    public h(@NotNull n nVar, @NotNull g0<Float> g0Var, @NotNull androidx.compose.animation.core.o<Float> oVar) {
        this.f15052a = nVar;
        this.f15053b = g0Var;
        this.f15054c = oVar;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Code duplicated, block: B:7:0x0015  */
    public final Object k(z3 z3Var, float f10, Function1<? super Float, Unit> function1, kotlin.coroutines.d<? super androidx.compose.foundation.gestures.snapping.a<Float, s>> dVar) {
        a aVar;
        Function1<? super Float, Unit> function2;
        if (dVar instanceof a) {
            aVar = (a) dVar;
            int i10 = aVar.f15059d;
            if ((i10 & Integer.MIN_VALUE) != 0) {
                aVar.f15059d = i10 - Integer.MIN_VALUE;
            } else {
                aVar = new a(dVar);
            }
        } else {
            aVar = new a(dVar);
        }
        Object objH = aVar.f15057b;
        Object objL = kotlin.coroutines.intrinsics.b.l();
        int i11 = aVar.f15059d;
        if (i11 == 0) {
            ResultKt.m(objH);
            c0 c0Var = this.f15055d;
            b bVar = new b(f10, function1, z3Var, null);
            aVar.f15056a = function1;
            aVar.f15059d = 1;
            objH = kotlinx.coroutines.i.h(c0Var, bVar, aVar);
            if (objH == objL) {
                return objL;
            }
            function2 = function1;
        } else {
            if (i11 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            function2 = (Function1) aVar.f15056a;
            ResultKt.m(objH);
        }
        androidx.compose.foundation.gestures.snapping.a aVar2 = (androidx.compose.foundation.gestures.snapping.a) objH;
        function2.invoke(kotlin.coroutines.jvm.internal.b.e(0.0f));
        return aVar2;
    }

    private final boolean m(float f10, float f11) {
        return Math.abs(i0.a(this.f15053b, 0.0f, f11)) >= Math.abs(f10);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final Object n(z3 z3Var, float f10, float f11, Function1<? super Float, Unit> function1, kotlin.coroutines.d<? super androidx.compose.foundation.gestures.snapping.a<Float, s>> dVar) {
        return m.k(z3Var, f10, f11, m(f10, f11) ? new androidx.compose.foundation.gestures.snapping.c(this.f15053b) : new q(this.f15054c), function1, dVar);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Code duplicated, block: B:8:0x001a  */
    public final Object p(z3 z3Var, float f10, float f11, Function1<? super Float, Unit> function1, kotlin.coroutines.d<? super androidx.compose.animation.core.q<Float, s>> dVar) {
        d dVar2;
        h hVar;
        if (dVar instanceof d) {
            dVar2 = (d) dVar;
            int i10 = dVar2.f15071c;
            if ((i10 & Integer.MIN_VALUE) != 0) {
                dVar2.f15071c = i10 - Integer.MIN_VALUE;
                hVar = this;
            } else {
                hVar = this;
                dVar2 = hVar.new d(dVar);
            }
        } else {
            hVar = this;
            dVar2 = hVar.new d(dVar);
        }
        d dVar3 = dVar2;
        Object objN = dVar3.f15069a;
        Object objL = kotlin.coroutines.intrinsics.b.l();
        int i11 = dVar3.f15071c;
        if (i11 == 0) {
            ResultKt.m(objN);
            if (Math.abs(f10) == 0.0f || Math.abs(f11) == 0.0f) {
                return r.c(f10, f11, 0L, 0L, false, 28, null);
            }
            dVar3.f15071c = 1;
            objN = hVar.n(z3Var, f10, f11, function1, dVar3);
            if (objN == objL) {
                return objL;
            }
        } else {
            if (i11 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.m(objN);
        }
        return ((androidx.compose.foundation.gestures.snapping.a) objN).c();
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0014  */
    @Override // androidx.compose.foundation.gestures.e5
    @Nullable
    public Object b(@NotNull z3 z3Var, float f10, @NotNull Function1<? super Float, Unit> function1, @NotNull kotlin.coroutines.d<? super Float> dVar) {
        c cVar;
        if (dVar instanceof c) {
            cVar = (c) dVar;
            int i10 = cVar.f15068c;
            if ((i10 & Integer.MIN_VALUE) != 0) {
                cVar.f15068c = i10 - Integer.MIN_VALUE;
            } else {
                cVar = new c(dVar);
            }
        } else {
            cVar = new c(dVar);
        }
        Object objK = cVar.f15066a;
        Object objL = kotlin.coroutines.intrinsics.b.l();
        int i11 = cVar.f15068c;
        if (i11 == 0) {
            ResultKt.m(objK);
            cVar.f15068c = 1;
            objK = k(z3Var, f10, function1, cVar);
            if (objK == objL) {
                return objL;
            }
        } else {
            if (i11 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.m(objK);
        }
        androidx.compose.foundation.gestures.snapping.a aVar = (androidx.compose.foundation.gestures.snapping.a) objK;
        return kotlin.coroutines.jvm.internal.b.e(((Number) aVar.a()).floatValue() != 0.0f ? ((Number) aVar.b().g()).floatValue() : 0.0f);
    }

    public boolean equals(@Nullable Object obj) {
        if (obj instanceof h) {
            h hVar = (h) obj;
            if (Intrinsics.areEqual(hVar.f15054c, this.f15054c) && Intrinsics.areEqual(hVar.f15053b, this.f15053b) && Intrinsics.areEqual(hVar.f15052a, this.f15052a)) {
                return true;
            }
        }
        return false;
    }

    public int hashCode() {
        return (((this.f15054c.hashCode() * 31) + this.f15053b.hashCode()) * 31) + this.f15052a.hashCode();
    }

    @NotNull
    public final c0 l() {
        return this.f15055d;
    }

    public final void o(@NotNull c0 c0Var) {
        this.f15055d = c0Var;
    }
}
