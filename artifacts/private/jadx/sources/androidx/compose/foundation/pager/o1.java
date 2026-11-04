package androidx.compose.foundation.pager;

import androidx.compose.foundation.gestures.c3;
import androidx.compose.foundation.gestures.e5;
import androidx.compose.foundation.gestures.z3;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes.dex */
@SourceDebugExtension({"SMAP\nLazyLayoutPager.kt\nKotlin\n*S Kotlin\n*F\n+ 1 LazyLayoutPager.kt\nandroidx/compose/foundation/pager/PagerWrapperFlingBehavior\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,410:1\n1#2:411\n*E\n"})
final class o1 implements c3 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    private final e5 f18410a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NotNull
    private final i1 f18411b;

    @kotlin.coroutines.jvm.internal.f(c = "androidx.compose.foundation.pager.PagerWrapperFlingBehavior", f = "LazyLayoutPager.kt", i = {}, l = {385}, m = "performFling", n = {}, s = {})
    static final class a extends kotlin.coroutines.jvm.internal.d {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        /* synthetic */ Object f18412a;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        int f18414c;

        a(kotlin.coroutines.d<? super a> dVar) {
            super(dVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            this.f18412a = obj;
            this.f18414c |= Integer.MIN_VALUE;
            return o1.this.a(null, 0.0f, this);
        }
    }

    public o1(@NotNull e5 e5Var, @NotNull i1 i1Var) {
        this.f18410a = e5Var;
        this.f18411b = i1Var;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit h(o1 o1Var, z3 z3Var, float f10) {
        o1Var.f18411b.Q0(z3Var, kotlin.math.b.L0(o1Var.f18411b.X() != 0 ? f10 / o1Var.f18411b.X() : 0.0f) + o1Var.f18411b.E());
        return Unit.f312394a;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0017  */
    @Override // androidx.compose.foundation.gestures.c3
    @Nullable
    public Object a(@NotNull final z3 z3Var, float f10, @NotNull kotlin.coroutines.d<? super Float> dVar) {
        a aVar;
        if (dVar instanceof a) {
            aVar = (a) dVar;
            int i10 = aVar.f18414c;
            if ((i10 & Integer.MIN_VALUE) != 0) {
                aVar.f18414c = i10 - Integer.MIN_VALUE;
            } else {
                aVar = new a(dVar);
            }
        } else {
            aVar = new a(dVar);
        }
        Object objB = aVar.f18412a;
        Object objL = kotlin.coroutines.intrinsics.b.l();
        int i11 = aVar.f18414c;
        if (i11 == 0) {
            ResultKt.m(objB);
            e5 e5Var = this.f18410a;
            Function1<? super Float, Unit> function1 = new Function1() { // from class: androidx.compose.foundation.pager.n1
                @Override // kotlin.jvm.functions.Function1
                public final Object invoke(Object obj) {
                    return o1.h(this.f18398a, z3Var, ((Float) obj).floatValue());
                }
            };
            aVar.f18414c = 1;
            objB = e5Var.b(z3Var, f10, function1, aVar);
            if (objB == objL) {
                return objL;
            }
        } else {
            if (i11 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.m(objB);
        }
        float fFloatValue = ((Number) objB).floatValue();
        if (this.f18411b.F() != 0.0f && Math.abs(this.f18411b.F()) < 0.001d) {
            i1 i1Var = this.f18411b;
            i1.u0(i1Var, i1Var.E(), 0.0f, 2, null);
        } else {
            kotlin.coroutines.jvm.internal.b.e(this.f18411b.F());
        }
        return kotlin.coroutines.jvm.internal.b.e(fFloatValue);
    }

    @NotNull
    public final e5 f() {
        return this.f18410a;
    }

    @NotNull
    public final i1 g() {
        return this.f18411b;
    }
}
