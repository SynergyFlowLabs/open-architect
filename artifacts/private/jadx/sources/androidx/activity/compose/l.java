package androidx.activity.compose;

import androidx.activity.i0;
import io.intercom.android.sdk.metrics.MetricTracker;
import java.util.concurrent.CancellationException;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.jvm.internal.i1;
import kotlinx.coroutines.channels.o0;
import kotlinx.coroutines.channels.s;
import kotlinx.coroutines.p2;
import kotlinx.coroutines.s0;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes.dex */
final class l {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private boolean f9833a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NotNull
    private final kotlinx.coroutines.channels.p<androidx.activity.d> f9834b = s.d(-2, kotlinx.coroutines.channels.j.SUSPEND, null, 4, null);

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @NotNull
    private final p2 f9835c;

    @kotlin.coroutines.jvm.internal.f(c = "androidx.activity.compose.OnBackInstance$job$1", f = "PredictiveBackHandler.kt", i = {0}, l = {121}, m = "invokeSuspend", n = {MetricTracker.Action.COMPLETED}, s = {"L$0"})
    @SourceDebugExtension({"SMAP\nPredictiveBackHandler.kt\nKotlin\n*S Kotlin\n*F\n+ 1 PredictiveBackHandler.kt\nandroidx/activity/compose/OnBackInstance$job$1\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,200:1\n1#2:201\n*E\n"})
    static final class a extends kotlin.coroutines.jvm.internal.o implements Function2<s0, kotlin.coroutines.d<? super Unit>, Object> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        Object f9836a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        int f9837b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ i0 f9838c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        final /* synthetic */ Function2<kotlinx.coroutines.flow.i<androidx.activity.d>, kotlin.coroutines.d<? super Unit>, Object> f9839d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        final /* synthetic */ l f9840e;

        /* JADX INFO: renamed from: androidx.activity.compose.l$a$a, reason: collision with other inner class name */
        @kotlin.coroutines.jvm.internal.f(c = "androidx.activity.compose.OnBackInstance$job$1$1", f = "PredictiveBackHandler.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
        static final class C0024a extends kotlin.coroutines.jvm.internal.o implements pj.n<kotlinx.coroutines.flow.j<? super androidx.activity.d>, Throwable, kotlin.coroutines.d<? super Unit>, Object> {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            int f9841a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            final /* synthetic */ i1.a f9842b;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            C0024a(i1.a aVar, kotlin.coroutines.d<? super C0024a> dVar) {
                super(3, dVar);
                this.f9842b = aVar;
            }

            @Override // kotlin.coroutines.jvm.internal.a
            public final Object invokeSuspend(Object obj) {
                kotlin.coroutines.intrinsics.b.l();
                if (this.f9841a != 0) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.m(obj);
                this.f9842b.f312744a = true;
                return Unit.f312394a;
            }

            @Override // pj.n
            /* JADX INFO: renamed from: k, reason: merged with bridge method [inline-methods] */
            public final Object invoke(kotlinx.coroutines.flow.j<? super androidx.activity.d> jVar, Throwable th2, kotlin.coroutines.d<? super Unit> dVar) {
                return new C0024a(this.f9842b, dVar).invokeSuspend(Unit.f312394a);
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        a(i0 i0Var, Function2<? super kotlinx.coroutines.flow.i<androidx.activity.d>, ? super kotlin.coroutines.d<? super Unit>, ? extends Object> function2, l lVar, kotlin.coroutines.d<? super a> dVar) {
            super(2, dVar);
            this.f9838c = i0Var;
            this.f9839d = function2;
            this.f9840e = lVar;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final kotlin.coroutines.d<Unit> create(Object obj, kotlin.coroutines.d<?> dVar) {
            return new a(this.f9838c, this.f9839d, this.f9840e, dVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            i1.a aVar;
            Object objL = kotlin.coroutines.intrinsics.b.l();
            int i10 = this.f9837b;
            if (i10 == 0) {
                ResultKt.m(obj);
                if (this.f9838c.isEnabled()) {
                    i1.a aVar2 = new i1.a();
                    Function2<kotlinx.coroutines.flow.i<androidx.activity.d>, kotlin.coroutines.d<? super Unit>, Object> function2 = this.f9839d;
                    kotlinx.coroutines.flow.i<androidx.activity.d> iVarG1 = kotlinx.coroutines.flow.k.g1(kotlinx.coroutines.flow.k.Z(this.f9840e.c()), new C0024a(aVar2, null));
                    this.f9836a = aVar2;
                    this.f9837b = 1;
                    if (function2.invoke(iVarG1, this) == objL) {
                        return objL;
                    }
                    aVar = aVar2;
                }
                return Unit.f312394a;
            }
            if (i10 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            aVar = (i1.a) this.f9836a;
            ResultKt.m(obj);
            if (!aVar.f312744a) {
                throw new IllegalStateException("You must collect the progress flow");
            }
            return Unit.f312394a;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(s0 s0Var, kotlin.coroutines.d<? super Unit> dVar) {
            return ((a) create(s0Var, dVar)).invokeSuspend(Unit.f312394a);
        }
    }

    public l(@NotNull s0 s0Var, boolean z10, @NotNull Function2<? super kotlinx.coroutines.flow.i<androidx.activity.d>, ? super kotlin.coroutines.d<? super Unit>, ? extends Object> function2, @NotNull i0 i0Var) {
        this.f9833a = z10;
        this.f9835c = kotlinx.coroutines.k.f(s0Var, null, null, new a(i0Var, function2, this, null), 3, null);
    }

    public final void a() {
        this.f9834b.e(new CancellationException("onBack cancelled"));
        p2.a.b(this.f9835c, null, 1, null);
    }

    public final boolean b() {
        return o0.a.a(this.f9834b, null, 1, null);
    }

    @NotNull
    public final kotlinx.coroutines.channels.p<androidx.activity.d> c() {
        return this.f9834b;
    }

    @NotNull
    public final p2 d() {
        return this.f9835c;
    }

    public final boolean e() {
        return this.f9833a;
    }

    @NotNull
    public final Object f(@NotNull androidx.activity.d dVar) {
        return this.f9834b.p(dVar);
    }

    public final void g(boolean z10) {
        this.f9833a = z10;
    }
}
