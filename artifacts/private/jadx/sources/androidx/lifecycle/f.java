package androidx.lifecycle;

import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes2.dex */
public final class f<T> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    private final m<T> f52314a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NotNull
    private final Function2<y0<T>, kotlin.coroutines.d<? super Unit>, Object> f52315b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final long f52316c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @NotNull
    private final kotlinx.coroutines.s0 f52317d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    @NotNull
    private final Function0<Unit> f52318e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    @Nullable
    private kotlinx.coroutines.p2 f52319f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    @Nullable
    private kotlinx.coroutines.p2 f52320g;

    @kotlin.coroutines.jvm.internal.f(c = "androidx.lifecycle.BlockRunner$cancel$1", f = "CoroutineLiveData.kt", i = {}, l = {180}, m = "invokeSuspend", n = {}, s = {})
    static final class a extends kotlin.coroutines.jvm.internal.o implements Function2<kotlinx.coroutines.s0, kotlin.coroutines.d<? super Unit>, Object> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        int f52321a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ f<T> f52322b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        a(f<T> fVar, kotlin.coroutines.d<? super a> dVar) {
            super(2, dVar);
            this.f52322b = fVar;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final kotlin.coroutines.d<Unit> create(Object obj, kotlin.coroutines.d<?> dVar) {
            return new a(this.f52322b, dVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            Object objL = kotlin.coroutines.intrinsics.b.l();
            int i10 = this.f52321a;
            if (i10 == 0) {
                ResultKt.m(obj);
                long j10 = ((f) this.f52322b).f52316c;
                this.f52321a = 1;
                if (kotlinx.coroutines.d1.b(j10, this) == objL) {
                    return objL;
                }
            } else {
                if (i10 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.m(obj);
            }
            if (!((f) this.f52322b).f52314a.h()) {
                kotlinx.coroutines.p2 p2Var = ((f) this.f52322b).f52319f;
                if (p2Var != null) {
                    kotlinx.coroutines.p2.a.b(p2Var, null, 1, null);
                }
                ((f) this.f52322b).f52319f = null;
            }
            return Unit.f312394a;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(kotlinx.coroutines.s0 s0Var, kotlin.coroutines.d<? super Unit> dVar) {
            return ((a) create(s0Var, dVar)).invokeSuspend(Unit.f312394a);
        }
    }

    @kotlin.coroutines.jvm.internal.f(c = "androidx.lifecycle.BlockRunner$maybeRun$1", f = "CoroutineLiveData.kt", i = {}, l = {168}, m = "invokeSuspend", n = {}, s = {})
    static final class b extends kotlin.coroutines.jvm.internal.o implements Function2<kotlinx.coroutines.s0, kotlin.coroutines.d<? super Unit>, Object> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        int f52323a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private /* synthetic */ Object f52324b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ f<T> f52325c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        b(f<T> fVar, kotlin.coroutines.d<? super b> dVar) {
            super(2, dVar);
            this.f52325c = fVar;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final kotlin.coroutines.d<Unit> create(Object obj, kotlin.coroutines.d<?> dVar) {
            b bVar = new b(this.f52325c, dVar);
            bVar.f52324b = obj;
            return bVar;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            Object objL = kotlin.coroutines.intrinsics.b.l();
            int i10 = this.f52323a;
            if (i10 == 0) {
                ResultKt.m(obj);
                z0 z0Var = new z0(((f) this.f52325c).f52314a, ((kotlinx.coroutines.s0) this.f52324b).getCoroutineContext());
                Function2 function2 = ((f) this.f52325c).f52315b;
                this.f52323a = 1;
                if (function2.invoke(z0Var, this) == objL) {
                    return objL;
                }
            } else {
                if (i10 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.m(obj);
            }
            ((f) this.f52325c).f52318e.invoke();
            return Unit.f312394a;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(kotlinx.coroutines.s0 s0Var, kotlin.coroutines.d<? super Unit> dVar) {
            return ((b) create(s0Var, dVar)).invokeSuspend(Unit.f312394a);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public f(@NotNull m<T> liveData, @NotNull Function2<? super y0<T>, ? super kotlin.coroutines.d<? super Unit>, ? extends Object> block, long j10, @NotNull kotlinx.coroutines.s0 scope, @NotNull Function0<Unit> onDone) {
        Intrinsics.checkNotNullParameter(liveData, "liveData");
        Intrinsics.checkNotNullParameter(block, "block");
        Intrinsics.checkNotNullParameter(scope, "scope");
        Intrinsics.checkNotNullParameter(onDone, "onDone");
        this.f52314a = liveData;
        this.f52315b = block;
        this.f52316c = j10;
        this.f52317d = scope;
        this.f52318e = onDone;
    }

    @androidx.annotation.l0
    public final void g() {
        if (this.f52320g != null) {
            throw new IllegalStateException("Cancel call cannot happen without a maybeRun");
        }
        int i10 = 6 << 0;
        this.f52320g = kotlinx.coroutines.k.f(this.f52317d, kotlinx.coroutines.l1.e().R0(), null, new a(this, null), 2, null);
    }

    @androidx.annotation.l0
    public final void h() {
        kotlinx.coroutines.p2 p2Var = this.f52320g;
        if (p2Var != null) {
            kotlinx.coroutines.p2.a.b(p2Var, null, 1, null);
        }
        this.f52320g = null;
        if (this.f52319f != null) {
            return;
        }
        boolean z10 = false;
        this.f52319f = kotlinx.coroutines.k.f(this.f52317d, null, null, new b(this, null), 3, null);
    }
}
