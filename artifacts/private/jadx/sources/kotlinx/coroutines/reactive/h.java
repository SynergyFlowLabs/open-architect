package kotlinx.coroutines.reactive;

import java.util.concurrent.atomic.AtomicLongFieldUpdater;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
import kotlin.Result;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.CoroutineContext;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.jvm.internal.g0;
import kotlinx.coroutines.k2;
import kotlinx.coroutines.p0;
import kotlinx.coroutines.s2;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import org.reactivestreams.v;
import org.reactivestreams.w;

/* JADX INFO: loaded from: classes12.dex */
@k2
@SourceDebugExtension({"SMAP\nReactiveFlow.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ReactiveFlow.kt\nkotlinx/coroutines/reactive/FlowSubscription\n+ 2 StackTraceRecovery.kt\nkotlinx/coroutines/internal/StackTraceRecoveryKt\n*L\n1#1,270:1\n159#2:271\n*S KotlinDebug\n*F\n+ 1 ReactiveFlow.kt\nkotlinx/coroutines/reactive/FlowSubscription\n*L\n208#1:271\n*E\n"})
public final class h<T> extends kotlinx.coroutines.a<Unit> implements w {

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private static final /* synthetic */ AtomicLongFieldUpdater f315243f = AtomicLongFieldUpdater.newUpdater(h.class, "requested$volatile");

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private static final /* synthetic */ AtomicReferenceFieldUpdater f315244g = AtomicReferenceFieldUpdater.newUpdater(h.class, Object.class, "producer$volatile");
    private volatile boolean cancellationRequested;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @oj.f
    @NotNull
    public final kotlinx.coroutines.flow.i<T> f315245d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    @oj.f
    @NotNull
    public final v<? super T> f315246e;
    private volatile /* synthetic */ Object producer$volatile;
    private volatile /* synthetic */ long requested$volatile;

    @SourceDebugExtension({"SMAP\nReactiveFlow.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ReactiveFlow.kt\nkotlinx/coroutines/reactive/FlowSubscription$consumeFlow$2\n+ 2 CancellableContinuation.kt\nkotlinx/coroutines/CancellableContinuationKt\n*L\n1#1,270:1\n426#2,11:271\n*S KotlinDebug\n*F\n+ 1 ReactiveFlow.kt\nkotlinx/coroutines/reactive/FlowSubscription$consumeFlow$2\n*L\n237#1:271,11\n*E\n"})
    static final class a<T> implements kotlinx.coroutines.flow.j {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ h<T> f315247a;

        a(h<T> hVar) {
            this.f315247a = hVar;
        }

        @Override // kotlinx.coroutines.flow.j
        public final Object emit(T t10, kotlin.coroutines.d<? super Unit> dVar) {
            this.f315247a.f315246e.onNext(t10);
            if (h.t2().decrementAndGet(this.f315247a) > 0) {
                s2.y(this.f315247a.getCoroutineContext());
                return Unit.f312394a;
            }
            h<T> hVar = this.f315247a;
            kotlinx.coroutines.p pVar = new kotlinx.coroutines.p(kotlin.coroutines.intrinsics.b.e(dVar), 1);
            pVar.p0();
            h.r2().set(hVar, pVar);
            Object objU = pVar.u();
            if (objU == kotlin.coroutines.intrinsics.b.l()) {
                kotlin.coroutines.jvm.internal.h.c(dVar);
            }
            return objU == kotlin.coroutines.intrinsics.b.l() ? objU : Unit.f312394a;
        }
    }

    @SourceDebugExtension({"SMAP\nContinuation.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Continuation.kt\nkotlin/coroutines/ContinuationKt$Continuation$1\n+ 2 ReactiveFlow.kt\nkotlinx/coroutines/reactive/FlowSubscription\n*L\n1#1,71:1\n200#2,2:72\n*E\n"})
    public static final class b implements kotlin.coroutines.d<Unit> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ CoroutineContext f315248a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ h f315249b;

        public b(CoroutineContext coroutineContext, h hVar) {
            this.f315248a = coroutineContext;
            this.f315249b = hVar;
        }

        @Override // kotlin.coroutines.d
        public CoroutineContext getContext() {
            return this.f315248a;
        }

        @Override // kotlin.coroutines.d
        public void resumeWith(Object obj) {
            bk.a.d(new c(this.f315249b), this.f315249b);
        }
    }

    /* synthetic */ class c extends g0 implements Function1<kotlin.coroutines.d<? super Unit>, Object>, kotlin.coroutines.jvm.internal.n {
        c(Object obj) {
            super(1, obj, h.class, "flowProcessing", "flowProcessing(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", 0);
        }

        @Override // kotlin.jvm.functions.Function1
        public final Object invoke(kotlin.coroutines.d<? super Unit> dVar) {
            return ((h) this.receiver).o2(dVar);
        }
    }

    @kotlin.coroutines.jvm.internal.f(c = "kotlinx.coroutines.reactive.FlowSubscription", f = "ReactiveFlow.kt", i = {0}, l = {205}, m = "flowProcessing", n = {"this"}, s = {"L$0"})
    static final class d extends kotlin.coroutines.jvm.internal.d {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        Object f315250a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        /* synthetic */ Object f315251b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ h<T> f315252c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        int f315253d;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        d(h<T> hVar, kotlin.coroutines.d<? super d> dVar) {
            super(dVar);
            this.f315252c = hVar;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            this.f315251b = obj;
            this.f315253d |= Integer.MIN_VALUE;
            return this.f315252c.o2(this);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public h(@NotNull kotlinx.coroutines.flow.i<? extends T> iVar, @NotNull v<? super T> vVar, @NotNull CoroutineContext coroutineContext) {
        super(coroutineContext, false, true);
        this.f315245d = iVar;
        this.f315246e = vVar;
        this.producer$volatile = n2();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final Object m2(kotlin.coroutines.d<? super Unit> dVar) {
        Object objCollect = this.f315245d.collect(new a(this), dVar);
        return objCollect == kotlin.coroutines.intrinsics.b.l() ? objCollect : Unit.f312394a;
    }

    private final kotlin.coroutines.d<Unit> n2() {
        return new b(getCoroutineContext(), this);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Code duplicated, block: B:7:0x0017  */
    public final Object o2(kotlin.coroutines.d<? super Unit> dVar) {
        d dVar2;
        if (dVar instanceof d) {
            dVar2 = (d) dVar;
            int i10 = dVar2.f315253d;
            if ((i10 & Integer.MIN_VALUE) != 0) {
                dVar2.f315253d = i10 - Integer.MIN_VALUE;
            } else {
                dVar2 = new d(this, dVar);
            }
        } else {
            dVar2 = new d(this, dVar);
        }
        Object obj = dVar2.f315251b;
        Object objL = kotlin.coroutines.intrinsics.b.l();
        int i11 = dVar2.f315253d;
        try {
            if (i11 == 0) {
                ResultKt.m(obj);
                dVar2.f315250a = this;
                dVar2.f315253d = 1;
                if (m2(dVar2) == objL) {
                    return objL;
                }
            } else {
                if (i11 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                this = (h) dVar2.f315250a;
                ResultKt.m(obj);
            }
            try {
                this.f315246e.onComplete();
            } catch (Throwable th2) {
                p0.b(this.getCoroutineContext(), th2);
            }
            return Unit.f312394a;
        } catch (Throwable th3) {
            if (!this.cancellationRequested || this.isActive() || th3 != this.y0()) {
                try {
                    this.f315246e.onError(th3);
                } catch (Throwable th4) {
                    kotlin.p.a(th3, th4);
                    p0.b(this.getCoroutineContext(), th3);
                }
            }
            return Unit.f312394a;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    private final /* synthetic */ long p2(AtomicLongFieldUpdater atomicLongFieldUpdater, Object obj, Function1<? super Long, Long> function1) {
        AtomicLongFieldUpdater atomicLongFieldUpdater2 = atomicLongFieldUpdater;
        while (true) {
            long j10 = atomicLongFieldUpdater2.get(obj);
            AtomicLongFieldUpdater atomicLongFieldUpdater3 = atomicLongFieldUpdater2;
            Object obj2 = obj;
            if (atomicLongFieldUpdater3.compareAndSet(obj2, j10, function1.invoke(Long.valueOf(j10)).longValue())) {
                return j10;
            }
            atomicLongFieldUpdater2 = atomicLongFieldUpdater3;
            obj = obj2;
        }
    }

    private final /* synthetic */ Object q2() {
        return this.producer$volatile;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final /* synthetic */ AtomicReferenceFieldUpdater r2() {
        return f315244g;
    }

    private final /* synthetic */ long s2() {
        return this.requested$volatile;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final /* synthetic */ AtomicLongFieldUpdater t2() {
        return f315243f;
    }

    private final /* synthetic */ void u2(Object obj) {
        this.producer$volatile = obj;
    }

    private final /* synthetic */ void v2(long j10) {
        this.requested$volatile = j10;
    }

    @Override // kotlinx.coroutines.w2, kotlinx.coroutines.p2
    @kotlin.l(level = kotlin.n.HIDDEN, message = "Since 1.2.0, binary compatibility with versions <= 1.1.x")
    public /* synthetic */ void cancel() throws Throwable {
        this.cancellationRequested = true;
        e(null);
    }

    @Override // org.reactivestreams.w
    public void request(long j10) {
        long j11;
        h<T> hVar;
        kotlin.coroutines.d dVar;
        if (j10 > 0) {
            AtomicLongFieldUpdater atomicLongFieldUpdater = f315243f;
            while (true) {
                j11 = atomicLongFieldUpdater.get(this);
                long j12 = j11 + j10;
                if (j12 <= 0) {
                    j12 = Long.MAX_VALUE;
                }
                hVar = this;
                if (atomicLongFieldUpdater.compareAndSet(hVar, j11, j12)) {
                    break;
                } else {
                    this = hVar;
                }
            }
            if (j11 <= 0) {
                do {
                    dVar = (kotlin.coroutines.d) f315244g.getAndSet(hVar, null);
                } while (dVar == null);
                Result.a aVar = Result.Companion;
                dVar.resumeWith(Result.m785constructorimpl(Unit.f312394a));
            }
        }
    }
}
