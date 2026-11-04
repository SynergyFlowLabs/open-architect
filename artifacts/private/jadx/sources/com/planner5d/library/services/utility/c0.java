package com.planner5d.library.services.utility;

import com.google.android.gms.tasks.Task;
import java.util.concurrent.atomic.AtomicReference;
import java.util.function.BiFunction;
import java.util.function.Function;
import kotlin.Result;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.CoroutineContext;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.text.StringsKt;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import rx.Observable;
import rx.Observer;
import rx.Subscriber;
import rx.Subscription;
import rx.functions.Action0;
import rx.functions.Action1;

/* JADX INFO: loaded from: classes10.dex */
@SourceDebugExtension({"SMAP\nCoroutineUtils.kt\nKotlin\n*S Kotlin\n*F\n+ 1 CoroutineUtils.kt\ncom/planner5d/library/services/utility/CoroutineUtils\n+ 2 CancellableContinuation.kt\nkotlinx/coroutines/CancellableContinuationKt\n+ 3 _Arrays.kt\nkotlin/collections/ArraysKt___ArraysKt\n*L\n1#1,261:1\n221#1,11:262\n221#1,11:273\n221#1,11:284\n221#1,11:295\n318#2,11:306\n12574#3,2:317\n*S KotlinDebug\n*F\n+ 1 CoroutineUtils.kt\ncom/planner5d/library/services/utility/CoroutineUtils\n*L\n68#1:262,11\n75#1:273,11\n83#1:284,11\n91#1:295,11\n134#1:306,11\n210#1:317,2\n*E\n"})
public final class c0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    public static final c0 f225068a = new c0();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static boolean f225069b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @NotNull
    private static final kotlinx.coroutines.flow.j0<Exception> f225070c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @NotNull
    private static final kotlinx.coroutines.flow.i<Exception> f225071d;

    /* JADX INFO: Add missing generic type declarations: [T] */
    static final class a<T> implements Function1<T, Unit> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ kotlin.coroutines.d<T> f225072a;

        /* JADX WARN: Multi-variable type inference failed */
        a(kotlin.coroutines.d<? super T> dVar) {
            this.f225072a = dVar;
        }

        public final void c(T t10) {
            kotlin.coroutines.d<T> dVar = this.f225072a;
            Result.a aVar = Result.Companion;
            dVar.resumeWith(Result.m785constructorimpl(t10));
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(Object obj) {
            c(obj);
            return Unit.f312394a;
        }
    }

    static final class b implements com.google.android.gms.tasks.f {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ kotlin.coroutines.d<T> f225073a;

        /* JADX WARN: Multi-variable type inference failed */
        b(kotlin.coroutines.d<? super T> dVar) {
            this.f225073a = dVar;
        }

        @Override // com.google.android.gms.tasks.f
        public final void d(Exception it) {
            Intrinsics.checkNotNullParameter(it, "it");
            kotlin.coroutines.d<T> dVar = this.f225073a;
            Result.a aVar = Result.Companion;
            dVar.resumeWith(Result.m785constructorimpl(ResultKt.createFailure(it)));
        }
    }

    /* JADX INFO: Add missing generic type declarations: [R] */
    public static final class c<R> implements Function1<R, Unit> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ kotlin.coroutines.d<R> f225074a;

        /* JADX WARN: Multi-variable type inference failed */
        public c(kotlin.coroutines.d<? super R> dVar) {
            this.f225074a = dVar;
        }

        public final void c(R r10) {
            kotlin.coroutines.d<R> dVar = this.f225074a;
            Result.a aVar = Result.Companion;
            dVar.resumeWith(Result.m785constructorimpl(r10));
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(Object obj) {
            c(obj);
            return Unit.f312394a;
        }
    }

    /* JADX INFO: Add missing generic type declarations: [R] */
    @kotlin.coroutines.jvm.internal.f(c = "com.planner5d.library.services.utility.CoroutineUtils$executeAsBlocking$1", f = "CoroutineUtils.kt", i = {}, l = {214}, m = "invokeSuspend", n = {}, s = {})
    @SourceDebugExtension({"SMAP\nCoroutineUtils.kt\nKotlin\n*S Kotlin\n*F\n+ 1 CoroutineUtils.kt\ncom/planner5d/library/services/utility/CoroutineUtils$executeAsBlocking$1\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,261:1\n1#2:262\n*E\n"})
    public static final class d<R> extends kotlin.coroutines.jvm.internal.o implements Function2<kotlinx.coroutines.s0, kotlin.coroutines.d<? super R>, Object> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        Object f225075a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        int f225076b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ Function1<kotlin.coroutines.d<? super R>, Object> f225077c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public d(Function1<? super kotlin.coroutines.d<? super R>, ? extends Object> function1, kotlin.coroutines.d<? super d> dVar) {
            super(2, dVar);
            this.f225077c = function1;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final kotlin.coroutines.d<Unit> create(Object obj, kotlin.coroutines.d<?> dVar) {
            return new d(this.f225077c, dVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            Object objL = kotlin.coroutines.intrinsics.b.l();
            int i10 = this.f225076b;
            if (i10 != 0) {
                if (i10 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.m(obj);
                return obj;
            }
            ResultKt.m(obj);
            Function1<kotlin.coroutines.d<? super R>, Object> function1 = this.f225077c;
            this.f225075a = function1;
            this.f225076b = 1;
            kotlin.coroutines.j jVar = new kotlin.coroutines.j(kotlin.coroutines.intrinsics.b.e(this));
            Result.a aVar = Result.Companion;
            jVar.resumeWith(Result.m785constructorimpl(function1.invoke(jVar)));
            Object objA = jVar.a();
            if (objA == kotlin.coroutines.intrinsics.b.l()) {
                kotlin.coroutines.jvm.internal.h.c(this);
            }
            return objA == objL ? objL : objA;
        }

        public final Object invokeSuspend$$forInline(Object obj) {
            Function1<kotlin.coroutines.d<? super R>, Object> function1 = this.f225077c;
            kotlin.jvm.internal.h0.e(0);
            kotlin.coroutines.j jVar = new kotlin.coroutines.j(kotlin.coroutines.intrinsics.b.e(this));
            Result.a aVar = Result.Companion;
            jVar.resumeWith(Result.m785constructorimpl(function1.invoke(jVar)));
            Unit unit = Unit.f312394a;
            Object objA = jVar.a();
            if (objA == kotlin.coroutines.intrinsics.b.l()) {
                kotlin.coroutines.jvm.internal.h.c(this);
            }
            kotlin.jvm.internal.h0.e(1);
            return objA;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(kotlinx.coroutines.s0 s0Var, kotlin.coroutines.d<? super R> dVar) {
            return ((d) create(s0Var, dVar)).invokeSuspend(Unit.f312394a);
        }
    }

    @kotlin.coroutines.jvm.internal.f(c = "com.planner5d.library.services.utility.CoroutineUtils$executeOnMainThread$1", f = "CoroutineUtils.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
    public static final class e extends kotlin.coroutines.jvm.internal.o implements Function2<kotlinx.coroutines.s0, kotlin.coroutines.d<? super Unit>, Object> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        int f225078a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ Function0<Unit> f225079b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public e(Function0<Unit> function0, kotlin.coroutines.d<? super e> dVar) {
            super(2, dVar);
            this.f225079b = function0;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final kotlin.coroutines.d<Unit> create(Object obj, kotlin.coroutines.d<?> dVar) {
            return new e(this.f225079b, dVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            kotlin.coroutines.intrinsics.b.l();
            if (this.f225078a != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.m(obj);
            this.f225079b.invoke();
            return Unit.f312394a;
        }

        public final Object invokeSuspend$$forInline(Object obj) {
            this.f225079b.invoke();
            return Unit.f312394a;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(kotlinx.coroutines.s0 s0Var, kotlin.coroutines.d<? super Unit> dVar) {
            return ((e) create(s0Var, dVar)).invokeSuspend(Unit.f312394a);
        }
    }

    /* JADX INFO: Add missing generic type declarations: [T] */
    @kotlin.coroutines.jvm.internal.f(c = "com.planner5d.library.services.utility.CoroutineUtils$flowFromRxObservable$1", f = "CoroutineUtils.kt", i = {}, l = {167}, m = "invokeSuspend", n = {}, s = {})
    static final class f<T> extends kotlin.coroutines.jvm.internal.o implements Function2<kotlinx.coroutines.channels.l0<? super T>, kotlin.coroutines.d<? super Unit>, Object> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        int f225080a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private /* synthetic */ Object f225081b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ Observable<T> f225082c;

        public static final class a implements Observer<T> {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            final /* synthetic */ kotlinx.coroutines.channels.l0<T> f225083a;

            /* JADX WARN: Multi-variable type inference failed */
            a(kotlinx.coroutines.channels.l0<? super T> l0Var) {
                this.f225083a = l0Var;
            }

            @Override // rx.Observer
            public void onCompleted() {
                kotlinx.coroutines.channels.o0.a.a(this.f225083a, null, 1, null);
            }

            @Override // rx.Observer
            public void onError(Throwable th2) {
                this.f225083a.F(th2);
            }

            @Override // rx.Observer
            public void onNext(T t10) {
                try {
                    kotlinx.coroutines.channels.v.m0(this.f225083a, t10);
                } catch (InterruptedException unused) {
                }
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        f(Observable<T> observable, kotlin.coroutines.d<? super f> dVar) {
            super(2, dVar);
            this.f225082c = observable;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final Unit m(AtomicReference atomicReference) {
            Subscription subscription = (Subscription) atomicReference.get();
            if (subscription != null) {
                subscription.unsubscribe();
            }
            return Unit.f312394a;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final kotlin.coroutines.d<Unit> create(Object obj, kotlin.coroutines.d<?> dVar) {
            f fVar = new f(this.f225082c, dVar);
            fVar.f225081b = obj;
            return fVar;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            Object objL = kotlin.coroutines.intrinsics.b.l();
            int i10 = this.f225080a;
            int i11 = 2 ^ 1;
            if (i10 == 0) {
                ResultKt.m(obj);
                kotlinx.coroutines.channels.l0 l0Var = (kotlinx.coroutines.channels.l0) this.f225081b;
                final AtomicReference atomicReference = new AtomicReference();
                atomicReference.set(this.f225082c.subscribe(new a(l0Var)));
                Function0 function0 = new Function0() { // from class: com.planner5d.library.services.utility.d0
                    @Override // kotlin.jvm.functions.Function0
                    public final Object invoke() {
                        return c0.f.m(atomicReference);
                    }
                };
                this.f225080a = 1;
                if (kotlinx.coroutines.channels.j0.b(l0Var, function0, this) == objL) {
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
        public final Object invoke(kotlinx.coroutines.channels.l0<? super T> l0Var, kotlin.coroutines.d<? super Unit> dVar) {
            return ((f) create(l0Var, dVar)).invokeSuspend(Unit.f312394a);
        }
    }

    static final class g implements Function1<Throwable, Unit> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ Subscription f225084a;

        g(Subscription subscription) {
            this.f225084a = subscription;
        }

        public final void c(Throwable th2) {
            this.f225084a.unsubscribe();
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(Throwable th2) {
            c(th2);
            return Unit.f312394a;
        }
    }

    /* JADX INFO: Add missing generic type declarations: [T] */
    static final class h<T> implements Function1<T, Unit> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ kotlinx.coroutines.n<T> f225085a;

        /* JADX WARN: Multi-variable type inference failed */
        h(kotlinx.coroutines.n<? super T> nVar) {
            this.f225085a = nVar;
        }

        public final void c(T t10) {
            kotlinx.coroutines.n<T> nVar = this.f225085a;
            Result.a aVar = Result.Companion;
            nVar.resumeWith(Result.m785constructorimpl(t10));
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(Object obj) {
            c(obj);
            return Unit.f312394a;
        }
    }

    static final class i<T> implements Action1 {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ kotlinx.coroutines.n<T> f225086a;

        /* JADX WARN: Multi-variable type inference failed */
        i(kotlinx.coroutines.n<? super T> nVar) {
            this.f225086a = nVar;
        }

        @Override // rx.functions.Action1
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final void call(Throwable th2) {
            kotlinx.coroutines.n<T> nVar = this.f225086a;
            Result.a aVar = Result.Companion;
            Intrinsics.checkNotNull(th2);
            nVar.resumeWith(Result.m785constructorimpl(ResultKt.createFailure(th2)));
        }
    }

    /* JADX INFO: Add missing generic type declarations: [T] */
    @kotlin.coroutines.jvm.internal.f(c = "com.planner5d.library.services.utility.CoroutineUtils$runBlockingSafe$executionBlock$1", f = "CoroutineUtils.kt", i = {0}, l = {198, 200}, m = "invokeSuspend", n = {"<this>"}, s = {"L$0"})
    static final class j<T> extends kotlin.coroutines.jvm.internal.o implements Function2<kotlinx.coroutines.s0, kotlin.coroutines.d<? super T>, Object> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        int f225087a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private /* synthetic */ Object f225088b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ IllegalStateException f225089c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        final /* synthetic */ Function2<kotlinx.coroutines.s0, kotlin.coroutines.d<? super T>, Object> f225090d;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        j(IllegalStateException illegalStateException, Function2<? super kotlinx.coroutines.s0, ? super kotlin.coroutines.d<? super T>, ? extends Object> function2, kotlin.coroutines.d<? super j> dVar) {
            super(2, dVar);
            this.f225089c = illegalStateException;
            this.f225090d = function2;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final kotlin.coroutines.d<Unit> create(Object obj, kotlin.coroutines.d<?> dVar) {
            j jVar = new j(this.f225089c, this.f225090d, dVar);
            jVar.f225088b = obj;
            return jVar;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            kotlinx.coroutines.s0 s0Var;
            Object objL = kotlin.coroutines.intrinsics.b.l();
            int i10 = this.f225087a;
            if (i10 == 0) {
                ResultKt.m(obj);
                s0Var = (kotlinx.coroutines.s0) this.f225088b;
                if (this.f225089c != null) {
                    kotlinx.coroutines.flow.j0 j0Var = c0.f225070c;
                    IllegalStateException illegalStateException = this.f225089c;
                    this.f225088b = s0Var;
                    this.f225087a = 1;
                    if (j0Var.emit(illegalStateException, this) != objL) {
                    }
                }
                return objL;
            }
            if (i10 != 1) {
                if (i10 != 2) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.m(obj);
                return obj;
            }
            s0Var = (kotlinx.coroutines.s0) this.f225088b;
            ResultKt.m(obj);
            Function2<kotlinx.coroutines.s0, kotlin.coroutines.d<? super T>, Object> function2 = this.f225090d;
            this.f225088b = null;
            this.f225087a = 2;
            Object objInvoke = function2.invoke(s0Var, this);
            if (objInvoke != objL) {
                return objInvoke;
            }
            return objL;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(kotlinx.coroutines.s0 s0Var, kotlin.coroutines.d<? super T> dVar) {
            return ((j) create(s0Var, dVar)).invokeSuspend(Unit.f312394a);
        }
    }

    public static final class k<T> implements Observable.OnSubscribe {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ kotlin.jvm.internal.i1.h f225091a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ kotlinx.coroutines.s0 f225092b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ Function f225093c;

        @kotlin.coroutines.jvm.internal.f(c = "com.planner5d.library.services.utility.CoroutineUtils$rxObservable$$inlined$wrapIntoObservable$1$1", f = "CoroutineUtils.kt", i = {}, l = {225}, m = "invokeSuspend", n = {}, s = {})
        @SourceDebugExtension({"SMAP\nCoroutineUtils.kt\nKotlin\n*S Kotlin\n*F\n+ 1 CoroutineUtils.kt\ncom/planner5d/library/services/utility/CoroutineUtils$wrapIntoObservable$1$1\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 3 CoroutineUtils.kt\ncom/planner5d/library/services/utility/CoroutineUtils\n*L\n1#1,261:1\n1#2:262\n68#3:263\n*E\n"})
        public static final class a extends kotlin.coroutines.jvm.internal.o implements Function2<kotlinx.coroutines.s0, kotlin.coroutines.d<? super Unit>, Object> {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            Object f225094a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            Object f225095b;

            /* JADX INFO: renamed from: c, reason: collision with root package name */
            int f225096c;

            /* JADX INFO: renamed from: d, reason: collision with root package name */
            final /* synthetic */ Subscriber f225097d;

            /* JADX INFO: renamed from: e, reason: collision with root package name */
            final /* synthetic */ Function f225098e;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public a(Subscriber subscriber, kotlin.coroutines.d dVar, Function function) {
                super(2, dVar);
                this.f225097d = subscriber;
                this.f225098e = function;
            }

            @Override // kotlin.coroutines.jvm.internal.a
            public final kotlin.coroutines.d<Unit> create(Object obj, kotlin.coroutines.d<?> dVar) {
                return new a(this.f225097d, dVar, this.f225098e);
            }

            /* JADX WARN: Multi-variable type inference failed */
            @Override // kotlin.coroutines.jvm.internal.a
            public final Object invokeSuspend(Object obj) {
                Observer observer;
                Object objL = kotlin.coroutines.intrinsics.b.l();
                int i10 = this.f225096c;
                try {
                    if (i10 == 0) {
                        ResultKt.m(obj);
                        Subscriber subscriber = this.f225097d;
                        this.f225094a = subscriber;
                        this.f225096c = 1;
                        kotlin.coroutines.j jVar = new kotlin.coroutines.j(kotlin.coroutines.intrinsics.b.e(this));
                        Result.a aVar = Result.Companion;
                        jVar.resumeWith(Result.m785constructorimpl(this.f225098e.apply(jVar)));
                        Object objA = jVar.a();
                        if (objA == kotlin.coroutines.intrinsics.b.l()) {
                            kotlin.coroutines.jvm.internal.h.c(this);
                        }
                        if (objA == objL) {
                            return objL;
                        }
                        observer = subscriber;
                        obj = objA;
                    } else {
                        if (i10 != 1) {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        Subscriber subscriber2 = (Subscriber) this.f225094a;
                        ResultKt.m(obj);
                        observer = subscriber2;
                    }
                    observer.onNext(obj);
                    this.f225097d.onCompleted();
                } catch (Throwable th2) {
                    this.f225097d.onError(th2);
                }
                return Unit.f312394a;
            }

            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(kotlinx.coroutines.s0 s0Var, kotlin.coroutines.d<? super Unit> dVar) {
                return ((a) create(s0Var, dVar)).invokeSuspend(Unit.f312394a);
            }
        }

        public k(kotlin.jvm.internal.i1.h hVar, kotlinx.coroutines.s0 s0Var, Function function) {
            this.f225091a = hVar;
            this.f225092b = s0Var;
            this.f225093c = function;
        }

        @Override // rx.functions.Action1
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final void call(Subscriber<? super R> subscriber) {
            this.f225091a.f312751a = (T) kotlinx.coroutines.k.f(this.f225092b, null, null, new a(subscriber, null, this.f225093c), 3, null);
        }
    }

    public static final class l<T> implements Observable.OnSubscribe {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ kotlin.jvm.internal.i1.h f225099a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ kotlinx.coroutines.s0 f225100b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ BiFunction f225101c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        final /* synthetic */ Object f225102d;

        @kotlin.coroutines.jvm.internal.f(c = "com.planner5d.library.services.utility.CoroutineUtils$rxObservable$$inlined$wrapIntoObservable$2$1", f = "CoroutineUtils.kt", i = {}, l = {225}, m = "invokeSuspend", n = {}, s = {})
        @SourceDebugExtension({"SMAP\nCoroutineUtils.kt\nKotlin\n*S Kotlin\n*F\n+ 1 CoroutineUtils.kt\ncom/planner5d/library/services/utility/CoroutineUtils$wrapIntoObservable$1$1\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 3 CoroutineUtils.kt\ncom/planner5d/library/services/utility/CoroutineUtils\n*L\n1#1,261:1\n1#2:262\n75#3:263\n*E\n"})
        public static final class a extends kotlin.coroutines.jvm.internal.o implements Function2<kotlinx.coroutines.s0, kotlin.coroutines.d<? super Unit>, Object> {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            Object f225103a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            Object f225104b;

            /* JADX INFO: renamed from: c, reason: collision with root package name */
            int f225105c;

            /* JADX INFO: renamed from: d, reason: collision with root package name */
            final /* synthetic */ Subscriber f225106d;

            /* JADX INFO: renamed from: e, reason: collision with root package name */
            final /* synthetic */ BiFunction f225107e;

            /* JADX INFO: renamed from: f, reason: collision with root package name */
            final /* synthetic */ Object f225108f;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public a(Subscriber subscriber, kotlin.coroutines.d dVar, BiFunction biFunction, Object obj) {
                super(2, dVar);
                this.f225106d = subscriber;
                this.f225107e = biFunction;
                this.f225108f = obj;
            }

            @Override // kotlin.coroutines.jvm.internal.a
            public final kotlin.coroutines.d<Unit> create(Object obj, kotlin.coroutines.d<?> dVar) {
                return new a(this.f225106d, dVar, this.f225107e, this.f225108f);
            }

            /* JADX WARN: Multi-variable type inference failed */
            @Override // kotlin.coroutines.jvm.internal.a
            public final Object invokeSuspend(Object obj) {
                Observer observer;
                Object objL = kotlin.coroutines.intrinsics.b.l();
                int i10 = this.f225105c;
                try {
                    if (i10 == 0) {
                        ResultKt.m(obj);
                        Subscriber subscriber = this.f225106d;
                        this.f225103a = subscriber;
                        this.f225105c = 1;
                        kotlin.coroutines.j jVar = new kotlin.coroutines.j(kotlin.coroutines.intrinsics.b.e(this));
                        Result.a aVar = Result.Companion;
                        jVar.resumeWith(Result.m785constructorimpl(this.f225107e.apply(this.f225108f, jVar)));
                        Object objA = jVar.a();
                        if (objA == kotlin.coroutines.intrinsics.b.l()) {
                            kotlin.coroutines.jvm.internal.h.c(this);
                        }
                        if (objA == objL) {
                            return objL;
                        }
                        observer = subscriber;
                        obj = objA;
                    } else {
                        if (i10 != 1) {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        Subscriber subscriber2 = (Subscriber) this.f225103a;
                        ResultKt.m(obj);
                        observer = subscriber2;
                    }
                    observer.onNext(obj);
                    this.f225106d.onCompleted();
                } catch (Throwable th2) {
                    this.f225106d.onError(th2);
                }
                return Unit.f312394a;
            }

            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(kotlinx.coroutines.s0 s0Var, kotlin.coroutines.d<? super Unit> dVar) {
                return ((a) create(s0Var, dVar)).invokeSuspend(Unit.f312394a);
            }
        }

        public l(kotlin.jvm.internal.i1.h hVar, kotlinx.coroutines.s0 s0Var, BiFunction biFunction, Object obj) {
            this.f225099a = hVar;
            this.f225100b = s0Var;
            this.f225101c = biFunction;
            this.f225102d = obj;
        }

        @Override // rx.functions.Action1
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final void call(Subscriber<? super R> subscriber) {
            this.f225099a.f312751a = (T) kotlinx.coroutines.k.f(this.f225100b, null, null, new a(subscriber, null, this.f225101c, this.f225102d), 3, null);
        }
    }

    public static final class m<T> implements Observable.OnSubscribe {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ kotlin.jvm.internal.i1.h f225109a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ kotlinx.coroutines.s0 f225110b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ p3 f225111c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        final /* synthetic */ Object f225112d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        final /* synthetic */ Object f225113e;

        @kotlin.coroutines.jvm.internal.f(c = "com.planner5d.library.services.utility.CoroutineUtils$rxObservable$$inlined$wrapIntoObservable$3$1", f = "CoroutineUtils.kt", i = {}, l = {225}, m = "invokeSuspend", n = {}, s = {})
        @SourceDebugExtension({"SMAP\nCoroutineUtils.kt\nKotlin\n*S Kotlin\n*F\n+ 1 CoroutineUtils.kt\ncom/planner5d/library/services/utility/CoroutineUtils$wrapIntoObservable$1$1\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 3 CoroutineUtils.kt\ncom/planner5d/library/services/utility/CoroutineUtils\n*L\n1#1,261:1\n1#2:262\n83#3:263\n*E\n"})
        public static final class a extends kotlin.coroutines.jvm.internal.o implements Function2<kotlinx.coroutines.s0, kotlin.coroutines.d<? super Unit>, Object> {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            Object f225114a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            Object f225115b;

            /* JADX INFO: renamed from: c, reason: collision with root package name */
            int f225116c;

            /* JADX INFO: renamed from: d, reason: collision with root package name */
            final /* synthetic */ Subscriber f225117d;

            /* JADX INFO: renamed from: e, reason: collision with root package name */
            final /* synthetic */ p3 f225118e;

            /* JADX INFO: renamed from: f, reason: collision with root package name */
            final /* synthetic */ Object f225119f;

            /* JADX INFO: renamed from: g, reason: collision with root package name */
            final /* synthetic */ Object f225120g;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public a(Subscriber subscriber, kotlin.coroutines.d dVar, p3 p3Var, Object obj, Object obj2) {
                super(2, dVar);
                this.f225117d = subscriber;
                this.f225118e = p3Var;
                this.f225119f = obj;
                this.f225120g = obj2;
            }

            @Override // kotlin.coroutines.jvm.internal.a
            public final kotlin.coroutines.d<Unit> create(Object obj, kotlin.coroutines.d<?> dVar) {
                return new a(this.f225117d, dVar, this.f225118e, this.f225119f, this.f225120g);
            }

            /* JADX WARN: Multi-variable type inference failed */
            @Override // kotlin.coroutines.jvm.internal.a
            public final Object invokeSuspend(Object obj) {
                Observer observer;
                Object objL = kotlin.coroutines.intrinsics.b.l();
                int i10 = this.f225116c;
                try {
                    if (i10 == 0) {
                        ResultKt.m(obj);
                        Subscriber subscriber = this.f225117d;
                        this.f225114a = subscriber;
                        this.f225116c = 1;
                        kotlin.coroutines.j jVar = new kotlin.coroutines.j(kotlin.coroutines.intrinsics.b.e(this));
                        Result.a aVar = Result.Companion;
                        jVar.resumeWith(Result.m785constructorimpl(this.f225118e.a(this.f225119f, this.f225120g, jVar)));
                        Object objA = jVar.a();
                        if (objA == kotlin.coroutines.intrinsics.b.l()) {
                            kotlin.coroutines.jvm.internal.h.c(this);
                        }
                        if (objA == objL) {
                            return objL;
                        }
                        observer = subscriber;
                        obj = objA;
                    } else {
                        if (i10 != 1) {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        Subscriber subscriber2 = (Subscriber) this.f225114a;
                        ResultKt.m(obj);
                        observer = subscriber2;
                    }
                    observer.onNext(obj);
                    this.f225117d.onCompleted();
                } catch (Throwable th2) {
                    this.f225117d.onError(th2);
                }
                return Unit.f312394a;
            }

            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(kotlinx.coroutines.s0 s0Var, kotlin.coroutines.d<? super Unit> dVar) {
                return ((a) create(s0Var, dVar)).invokeSuspend(Unit.f312394a);
            }
        }

        public m(kotlin.jvm.internal.i1.h hVar, kotlinx.coroutines.s0 s0Var, p3 p3Var, Object obj, Object obj2) {
            this.f225109a = hVar;
            this.f225110b = s0Var;
            this.f225111c = p3Var;
            this.f225112d = obj;
            this.f225113e = obj2;
        }

        @Override // rx.functions.Action1
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final void call(Subscriber<? super R> subscriber) {
            this.f225109a.f312751a = (T) kotlinx.coroutines.k.f(this.f225110b, null, null, new a(subscriber, null, this.f225111c, this.f225112d, this.f225113e), 3, null);
        }
    }

    public static final class n<T> implements Observable.OnSubscribe {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ kotlin.jvm.internal.i1.h f225121a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ kotlinx.coroutines.s0 f225122b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ n2 f225123c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        final /* synthetic */ Object f225124d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        final /* synthetic */ Object f225125e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        final /* synthetic */ Object f225126f;

        @kotlin.coroutines.jvm.internal.f(c = "com.planner5d.library.services.utility.CoroutineUtils$rxObservable$$inlined$wrapIntoObservable$4$1", f = "CoroutineUtils.kt", i = {}, l = {225}, m = "invokeSuspend", n = {}, s = {})
        @SourceDebugExtension({"SMAP\nCoroutineUtils.kt\nKotlin\n*S Kotlin\n*F\n+ 1 CoroutineUtils.kt\ncom/planner5d/library/services/utility/CoroutineUtils$wrapIntoObservable$1$1\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 3 CoroutineUtils.kt\ncom/planner5d/library/services/utility/CoroutineUtils\n*L\n1#1,261:1\n1#2:262\n91#3:263\n*E\n"})
        public static final class a extends kotlin.coroutines.jvm.internal.o implements Function2<kotlinx.coroutines.s0, kotlin.coroutines.d<? super Unit>, Object> {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            Object f225127a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            Object f225128b;

            /* JADX INFO: renamed from: c, reason: collision with root package name */
            int f225129c;

            /* JADX INFO: renamed from: d, reason: collision with root package name */
            final /* synthetic */ Subscriber f225130d;

            /* JADX INFO: renamed from: e, reason: collision with root package name */
            final /* synthetic */ n2 f225131e;

            /* JADX INFO: renamed from: f, reason: collision with root package name */
            final /* synthetic */ Object f225132f;

            /* JADX INFO: renamed from: g, reason: collision with root package name */
            final /* synthetic */ Object f225133g;

            /* JADX INFO: renamed from: h, reason: collision with root package name */
            final /* synthetic */ Object f225134h;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public a(Subscriber subscriber, kotlin.coroutines.d dVar, n2 n2Var, Object obj, Object obj2, Object obj3) {
                super(2, dVar);
                this.f225130d = subscriber;
                this.f225131e = n2Var;
                this.f225132f = obj;
                this.f225133g = obj2;
                this.f225134h = obj3;
            }

            @Override // kotlin.coroutines.jvm.internal.a
            public final kotlin.coroutines.d<Unit> create(Object obj, kotlin.coroutines.d<?> dVar) {
                return new a(this.f225130d, dVar, this.f225131e, this.f225132f, this.f225133g, this.f225134h);
            }

            /* JADX WARN: Multi-variable type inference failed */
            @Override // kotlin.coroutines.jvm.internal.a
            public final Object invokeSuspend(Object obj) {
                Observer observer;
                Object objL = kotlin.coroutines.intrinsics.b.l();
                int i10 = this.f225129c;
                try {
                    if (i10 == 0) {
                        ResultKt.m(obj);
                        Subscriber subscriber = this.f225130d;
                        this.f225127a = subscriber;
                        this.f225129c = 1;
                        kotlin.coroutines.j jVar = new kotlin.coroutines.j(kotlin.coroutines.intrinsics.b.e(this));
                        Result.a aVar = Result.Companion;
                        jVar.resumeWith(Result.m785constructorimpl(this.f225131e.a(this.f225132f, this.f225133g, this.f225134h, jVar)));
                        Object objA = jVar.a();
                        if (objA == kotlin.coroutines.intrinsics.b.l()) {
                            kotlin.coroutines.jvm.internal.h.c(this);
                        }
                        if (objA == objL) {
                            return objL;
                        }
                        observer = subscriber;
                        obj = objA;
                    } else {
                        if (i10 != 1) {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        Subscriber subscriber2 = (Subscriber) this.f225127a;
                        ResultKt.m(obj);
                        observer = subscriber2;
                    }
                    observer.onNext(obj);
                    this.f225130d.onCompleted();
                } catch (Throwable th2) {
                    this.f225130d.onError(th2);
                }
                return Unit.f312394a;
            }

            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(kotlinx.coroutines.s0 s0Var, kotlin.coroutines.d<? super Unit> dVar) {
                return ((a) create(s0Var, dVar)).invokeSuspend(Unit.f312394a);
            }
        }

        public n(kotlin.jvm.internal.i1.h hVar, kotlinx.coroutines.s0 s0Var, n2 n2Var, Object obj, Object obj2, Object obj3) {
            this.f225121a = hVar;
            this.f225122b = s0Var;
            this.f225123c = n2Var;
            this.f225124d = obj;
            this.f225125e = obj2;
            this.f225126f = obj3;
        }

        @Override // rx.functions.Action1
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final void call(Subscriber<? super R> subscriber) {
            this.f225121a.f312751a = (T) kotlinx.coroutines.k.f(this.f225122b, null, null, new a(subscriber, null, this.f225123c, this.f225124d, this.f225125e, this.f225126f), 3, null);
        }
    }

    @kotlin.coroutines.jvm.internal.f(c = "com.planner5d.library.services.utility.CoroutineUtils$rxObservable$5$1", f = "CoroutineUtils.kt", i = {}, l = {101}, m = "invokeSuspend", n = {}, s = {})
    static final class o extends kotlin.coroutines.jvm.internal.o implements Function2<kotlinx.coroutines.s0, kotlin.coroutines.d<? super Unit>, Object> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        Object f225135a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        int f225136b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ Subscriber<? super R> f225137c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        final /* synthetic */ Function1<kotlin.coroutines.d<? super R>, Object> f225138d;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        o(Subscriber<? super R> subscriber, Function1<? super kotlin.coroutines.d<? super R>, ? extends Object> function1, kotlin.coroutines.d<? super o> dVar) {
            super(2, dVar);
            this.f225137c = subscriber;
            this.f225138d = function1;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final kotlin.coroutines.d<Unit> create(Object obj, kotlin.coroutines.d<?> dVar) {
            return new o(this.f225137c, this.f225138d, dVar);
        }

        /* JADX WARN: Type inference incomplete: some casts might be missing */
        /*  JADX ERROR: JadxRuntimeException in pass: ModVisitor
            jadx.core.utils.exceptions.JadxRuntimeException: Can't change immutable type java.lang.Object to com.planner5d.library.services.utility.c0$o for r4v4 'this'  java.lang.Object
            	at jadx.core.dex.instructions.args.SSAVar.setType(SSAVar.java:114)
            	at jadx.core.dex.instructions.args.RegisterArg.setType(RegisterArg.java:52)
            	at jadx.core.dex.visitors.ModVisitor.removeCheckCast(ModVisitor.java:417)
            	at jadx.core.dex.visitors.ModVisitor.replaceStep(ModVisitor.java:152)
            	at jadx.core.dex.visitors.ModVisitor.visit(ModVisitor.java:96)
            */
        @Override // kotlin.coroutines.jvm.internal.a
        public final java.lang.Object invokeSuspend(java.lang.Object r5) {
            /*
                r4 = this;
                java.lang.Object r0 = kotlin.coroutines.intrinsics.b.l()
                int r1 = r4.f225136b
                r2 = 1
                if (r1 == 0) goto L22
                if (r1 != r2) goto L18
                java.lang.Object r0 = r4.f225135a
                r3 = 4
                rx.Subscriber r0 = (rx.Subscriber) r0
                r3 = 0
                kotlin.ResultKt.m(r5)     // Catch: java.lang.Throwable -> L16
                r3 = 3
                goto L36
            L16:
                r5 = move-exception
                goto L3f
            L18:
                r3 = 0
                java.lang.IllegalStateException r4 = new java.lang.IllegalStateException
                r3 = 7
                java.lang.String r5 = "call to 'resume' before 'invoke' with coroutine"
                r4.<init>(r5)
                throw r4
            L22:
                kotlin.ResultKt.m(r5)
                rx.Subscriber<? super R> r5 = r4.f225137c     // Catch: java.lang.Throwable -> L16
                kotlin.jvm.functions.Function1<kotlin.coroutines.d<? super R>, java.lang.Object> r1 = r4.f225138d     // Catch: java.lang.Throwable -> L16
                r4.f225135a = r5     // Catch: java.lang.Throwable -> L16
                r4.f225136b = r2     // Catch: java.lang.Throwable -> L16
                java.lang.Object r1 = r1.invoke(r4)     // Catch: java.lang.Throwable -> L16
                if (r1 != r0) goto L34
                return r0
            L34:
                r0 = r5
                r5 = r1
            L36:
                r0.onNext(r5)     // Catch: java.lang.Throwable -> L16
                rx.Subscriber<? super R> r5 = r4.f225137c     // Catch: java.lang.Throwable -> L16
                r5.onCompleted()     // Catch: java.lang.Throwable -> L16
                goto L45
            L3f:
                rx.Subscriber<? super R> r4 = r4.f225137c
                r3 = 3
                r4.onError(r5)
            L45:
                kotlin.Unit r4 = kotlin.Unit.f312394a
                return r4
            */
            throw new UnsupportedOperationException("Method not decompiled: com.planner5d.library.services.utility.c0.o.invokeSuspend(java.lang.Object):java.lang.Object");
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(kotlinx.coroutines.s0 s0Var, kotlin.coroutines.d<? super Unit> dVar) {
            return ((o) create(s0Var, dVar)).invokeSuspend(Unit.f312394a);
        }
    }

    @kotlin.coroutines.jvm.internal.f(c = "com.planner5d.library.services.utility.CoroutineUtils$rxObservable$7$1", f = "CoroutineUtils.kt", i = {}, l = {122}, m = "invokeSuspend", n = {}, s = {})
    static final class p extends kotlin.coroutines.jvm.internal.o implements Function2<kotlinx.coroutines.s0, kotlin.coroutines.d<? super Unit>, Object> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        int f225139a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ kotlinx.coroutines.flow.i<T> f225140b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ Subscriber<? super T> f225141c;

        static final class a<T> implements kotlinx.coroutines.flow.j {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            final /* synthetic */ Subscriber<? super T> f225142a;

            a(Subscriber<? super T> subscriber) {
                this.f225142a = subscriber;
            }

            @Override // kotlinx.coroutines.flow.j
            public final Object emit(T t10, kotlin.coroutines.d<? super Unit> dVar) {
                this.f225142a.onNext(t10);
                return Unit.f312394a;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        p(kotlinx.coroutines.flow.i<? extends T> iVar, Subscriber<? super T> subscriber, kotlin.coroutines.d<? super p> dVar) {
            super(2, dVar);
            this.f225140b = iVar;
            this.f225141c = subscriber;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final kotlin.coroutines.d<Unit> create(Object obj, kotlin.coroutines.d<?> dVar) {
            return new p(this.f225140b, this.f225141c, dVar);
        }

        /* JADX WARN: Type inference incomplete: some casts might be missing */
        /*  JADX ERROR: JadxRuntimeException in pass: ModVisitor
            jadx.core.utils.exceptions.JadxRuntimeException: Can't change immutable type kotlin.coroutines.d to com.planner5d.library.services.utility.c0$p for r5v4 'this'  kotlin.coroutines.d
            	at jadx.core.dex.instructions.args.SSAVar.setType(SSAVar.java:114)
            	at jadx.core.dex.instructions.args.RegisterArg.setType(RegisterArg.java:52)
            	at jadx.core.dex.visitors.ModVisitor.removeCheckCast(ModVisitor.java:417)
            	at jadx.core.dex.visitors.ModVisitor.replaceStep(ModVisitor.java:152)
            	at jadx.core.dex.visitors.ModVisitor.visit(ModVisitor.java:96)
            */
        @Override // kotlin.coroutines.jvm.internal.a
        public final java.lang.Object invokeSuspend(java.lang.Object r6) {
            /*
                r5 = this;
                java.lang.Object r0 = kotlin.coroutines.intrinsics.b.l()
                int r1 = r5.f225139a
                r2 = 1
                r4 = 5
                if (r1 == 0) goto L1d
                if (r1 != r2) goto L13
                kotlin.ResultKt.m(r6)     // Catch: java.lang.Throwable -> L10
                goto L33
            L10:
                r6 = move-exception
                r4 = 7
                goto L3b
            L13:
                r4 = 0
                java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
                java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
                r5.<init>(r6)
                r4 = 3
                throw r5
            L1d:
                kotlin.ResultKt.m(r6)
                kotlinx.coroutines.flow.i<T> r6 = r5.f225140b     // Catch: java.lang.Throwable -> L10
                com.planner5d.library.services.utility.c0$p$a r1 = new com.planner5d.library.services.utility.c0$p$a     // Catch: java.lang.Throwable -> L10
                rx.Subscriber<? super T> r3 = r5.f225141c     // Catch: java.lang.Throwable -> L10
                r1.<init>(r3)     // Catch: java.lang.Throwable -> L10
                r4 = 6
                r5.f225139a = r2     // Catch: java.lang.Throwable -> L10
                java.lang.Object r6 = r6.collect(r1, r5)     // Catch: java.lang.Throwable -> L10
                if (r6 != r0) goto L33
                return r0
            L33:
                r4 = 4
                rx.Subscriber<? super T> r6 = r5.f225141c     // Catch: java.lang.Throwable -> L10
                r4 = 7
                r6.onCompleted()     // Catch: java.lang.Throwable -> L10
                goto L40
            L3b:
                rx.Subscriber<? super T> r5 = r5.f225141c
                r5.onError(r6)
            L40:
                kotlin.Unit r5 = kotlin.Unit.f312394a
                return r5
            */
            throw new UnsupportedOperationException("Method not decompiled: com.planner5d.library.services.utility.c0.p.invokeSuspend(java.lang.Object):java.lang.Object");
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(kotlinx.coroutines.s0 s0Var, kotlin.coroutines.d<? super Unit> dVar) {
            return ((p) create(s0Var, dVar)).invokeSuspend(Unit.f312394a);
        }
    }

    static final class q implements com.google.android.gms.tasks.g {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final /* synthetic */ Function1 f225143a;

        q(Function1 function) {
            Intrinsics.checkNotNullParameter(function, "function");
            this.f225143a = function;
        }

        @Override // com.google.android.gms.tasks.g
        public final /* synthetic */ void b(Object obj) {
            this.f225143a.invoke(obj);
        }
    }

    static final class r implements Action1 {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final /* synthetic */ Function1 f225144a;

        r(Function1 function) {
            Intrinsics.checkNotNullParameter(function, "function");
            this.f225144a = function;
        }

        @Override // rx.functions.Action1
        public final /* synthetic */ void call(Object obj) {
            this.f225144a.invoke(obj);
        }
    }

    @kotlin.coroutines.jvm.internal.f(c = "com.planner5d.library.services.utility.CoroutineUtils", f = "CoroutineUtils.kt", i = {0, 0, 0, 2, 2, 2}, l = {55, com.planner5d.library.engine.input.f.b.f160729t0, com.planner5d.library.engine.input.f.b.f160710n, com.planner5d.library.engine.input.f.b.f160710n}, m = "withReentrantLock", n = {"$this$withReentrantLock", "owner", com.facebook.internal.w0.f100156c1, "$this$withReentrantLock", "owner", com.facebook.internal.w0.f100156c1}, s = {"L$0", "L$1", "L$2", "L$0", "L$1", "L$2"})
    static final class s<T> extends kotlin.coroutines.jvm.internal.d {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        Object f225145a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        Object f225146b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        Object f225147c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        /* synthetic */ Object f225148d;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        int f225150f;

        s(kotlin.coroutines.d<? super s> dVar) {
            super(dVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            this.f225148d = obj;
            this.f225150f |= Integer.MIN_VALUE;
            return c0.this.Q(null, null, null, this);
        }
    }

    /* JADX INFO: Add missing generic type declarations: [T] */
    @kotlin.coroutines.jvm.internal.f(c = "com.planner5d.library.services.utility.CoroutineUtils$withReentrantLock$2", f = "CoroutineUtils.kt", i = {0, 0, 1, 1}, l = {265, com.planner5d.library.engine.input.f.b.D0}, m = "invokeSuspend", n = {"$this$withLock$iv", "owner$iv", "$this$withLock$iv", "owner$iv"}, s = {"L$0", "L$1", "L$0", "L$1"})
    @SourceDebugExtension({"SMAP\nCoroutineUtils.kt\nKotlin\n*S Kotlin\n*F\n+ 1 CoroutineUtils.kt\ncom/planner5d/library/services/utility/CoroutineUtils$withReentrantLock$2\n+ 2 Mutex.kt\nkotlinx/coroutines/sync/MutexKt\n*L\n1#1,261:1\n117#2,9:262\n*S KotlinDebug\n*F\n+ 1 CoroutineUtils.kt\ncom/planner5d/library/services/utility/CoroutineUtils$withReentrantLock$2\n*L\n59#1:262,9\n*E\n"})
    public static final class t<T> extends kotlin.coroutines.jvm.internal.o implements Function2<kotlinx.coroutines.s0, kotlin.coroutines.d<? super T>, Object> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        Object f225151a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        Object f225152b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        Object f225153c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        int f225154d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        final /* synthetic */ kotlinx.coroutines.sync.a f225155e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        final /* synthetic */ Object f225156f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        final /* synthetic */ Function1<kotlin.coroutines.d<? super T>, Object> f225157g;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public t(kotlinx.coroutines.sync.a aVar, Object obj, Function1<? super kotlin.coroutines.d<? super T>, ? extends Object> function1, kotlin.coroutines.d<? super t> dVar) {
            super(2, dVar);
            this.f225155e = aVar;
            this.f225156f = obj;
            this.f225157g = function1;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final kotlin.coroutines.d<Unit> create(Object obj, kotlin.coroutines.d<?> dVar) {
            return new t(this.f225155e, this.f225156f, this.f225157g, dVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) throws Throwable {
            kotlinx.coroutines.sync.a aVar;
            Object obj2;
            Function1<kotlin.coroutines.d<? super T>, Object> function1;
            Throwable th2;
            kotlinx.coroutines.sync.a aVar2;
            Object obj3;
            Object objL = kotlin.coroutines.intrinsics.b.l();
            int i10 = this.f225154d;
            try {
                if (i10 == 0) {
                    ResultKt.m(obj);
                    aVar = this.f225155e;
                    obj2 = this.f225156f;
                    function1 = this.f225157g;
                    this.f225151a = aVar;
                    this.f225152b = obj2;
                    this.f225153c = function1;
                    this.f225154d = 1;
                    if (aVar.h(obj2, this) != objL) {
                    }
                    return objL;
                }
                if (i10 != 1) {
                    if (i10 != 2) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    obj3 = this.f225152b;
                    aVar2 = (kotlinx.coroutines.sync.a) this.f225151a;
                    try {
                        ResultKt.m(obj);
                        aVar2.i(obj3);
                        return obj;
                    } catch (Throwable th3) {
                        th2 = th3;
                        aVar2.i(obj3);
                        throw th2;
                    }
                }
                Function1<kotlin.coroutines.d<? super T>, Object> function2 = (Function1) this.f225153c;
                Object obj4 = this.f225152b;
                kotlinx.coroutines.sync.a aVar3 = (kotlinx.coroutines.sync.a) this.f225151a;
                ResultKt.m(obj);
                aVar = aVar3;
                function1 = function2;
                obj2 = obj4;
                this.f225151a = aVar;
                this.f225152b = obj2;
                this.f225153c = null;
                this.f225154d = 2;
                Object objInvoke = function1.invoke(this);
                if (objInvoke != objL) {
                    kotlinx.coroutines.sync.a aVar4 = aVar;
                    obj = objInvoke;
                    aVar2 = aVar4;
                    obj3 = obj2;
                    aVar2.i(obj3);
                    return obj;
                }
                return objL;
            } catch (Throwable th4) {
                kotlinx.coroutines.sync.a aVar5 = aVar;
                th2 = th4;
                aVar2 = aVar5;
                obj3 = obj2;
                aVar2.i(obj3);
                throw th2;
            }
        }

        public final Object invokeSuspend$$forInline(Object obj) {
            kotlinx.coroutines.sync.a aVar = this.f225155e;
            Object obj2 = this.f225156f;
            Function1<kotlin.coroutines.d<? super T>, Object> function1 = this.f225157g;
            kotlin.jvm.internal.h0.e(0);
            aVar.h(obj2, this);
            kotlin.jvm.internal.h0.e(1);
            try {
                kotlin.jvm.internal.h0.e(3);
                return function1.invoke(null);
            } finally {
                aVar.i(obj2);
            }
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(kotlinx.coroutines.s0 s0Var, kotlin.coroutines.d<? super T> dVar) {
            return ((t) create(s0Var, dVar)).invokeSuspend(Unit.f312394a);
        }
    }

    public static final class u<T> implements Observable.OnSubscribe {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ kotlin.jvm.internal.i1.h<kotlinx.coroutines.p2> f225158a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ kotlinx.coroutines.s0 f225159b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ Function1<kotlin.coroutines.d<? super R>, Object> f225160c;

        @kotlin.coroutines.jvm.internal.f(c = "com.planner5d.library.services.utility.CoroutineUtils$wrapIntoObservable$1$1", f = "CoroutineUtils.kt", i = {}, l = {225}, m = "invokeSuspend", n = {}, s = {})
        @SourceDebugExtension({"SMAP\nCoroutineUtils.kt\nKotlin\n*S Kotlin\n*F\n+ 1 CoroutineUtils.kt\ncom/planner5d/library/services/utility/CoroutineUtils$wrapIntoObservable$1$1\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,261:1\n1#2:262\n*E\n"})
        public static final class a extends kotlin.coroutines.jvm.internal.o implements Function2<kotlinx.coroutines.s0, kotlin.coroutines.d<? super Unit>, Object> {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            Object f225161a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            Object f225162b;

            /* JADX INFO: renamed from: c, reason: collision with root package name */
            int f225163c;

            /* JADX INFO: renamed from: d, reason: collision with root package name */
            final /* synthetic */ Subscriber<? super R> f225164d;

            /* JADX INFO: renamed from: e, reason: collision with root package name */
            final /* synthetic */ Function1<kotlin.coroutines.d<? super R>, Object> f225165e;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            /* JADX WARN: Multi-variable type inference failed */
            public a(Subscriber<? super R> subscriber, Function1<? super kotlin.coroutines.d<? super R>, ? extends Object> function1, kotlin.coroutines.d<? super a> dVar) {
                super(2, dVar);
                this.f225164d = subscriber;
                this.f225165e = function1;
            }

            @Override // kotlin.coroutines.jvm.internal.a
            public final kotlin.coroutines.d<Unit> create(Object obj, kotlin.coroutines.d<?> dVar) {
                return new a(this.f225164d, this.f225165e, dVar);
            }

            /* JADX WARN: Multi-variable type inference failed */
            /* JADX WARN: Type inference failed for: r0v1 */
            /* JADX WARN: Type inference failed for: r0v2, types: [rx.Observer] */
            /* JADX WARN: Type inference failed for: r0v5 */
            /* JADX WARN: Type inference incomplete: some casts might be missing */
            @Override // kotlin.coroutines.jvm.internal.a
            public final Object invokeSuspend(Object obj) {
                ?? r10;
                Object objL = kotlin.coroutines.intrinsics.b.l();
                int i10 = this.f225163c;
                try {
                    if (i10 == 0) {
                        ResultKt.m(obj);
                        Object obj2 = this.f225164d;
                        Function1 function1 = this.f225165e;
                        this.f225161a = function1;
                        this.f225162b = obj2;
                        this.f225163c = 1;
                        kotlin.coroutines.j jVar = new kotlin.coroutines.j(kotlin.coroutines.intrinsics.b.e(this));
                        Result.a aVar = Result.Companion;
                        jVar.resumeWith(Result.m785constructorimpl(function1.invoke(jVar)));
                        Object objA = jVar.a();
                        if (objA == kotlin.coroutines.intrinsics.b.l()) {
                            kotlin.coroutines.jvm.internal.h.c(this);
                        }
                        if (objA == objL) {
                            return objL;
                        }
                        r10 = obj2;
                        obj = objA;
                    } else {
                        if (i10 != 1) {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        Subscriber subscriber = (Subscriber) this.f225162b;
                        ResultKt.m(obj);
                        r10 = subscriber;
                    }
                    r10.onNext(obj);
                    this.f225164d.onCompleted();
                } catch (Throwable th2) {
                    this.f225164d.onError(th2);
                }
                return Unit.f312394a;
            }

            /* JADX WARN: Type inference incomplete: some casts might be missing */
            public final Object invokeSuspend$$forInline(Object obj) {
                try {
                    Subscriber<? super R> subscriber = this.f225164d;
                    Function1<kotlin.coroutines.d<? super R>, Object> function1 = this.f225165e;
                    kotlin.jvm.internal.h0.e(0);
                    kotlin.coroutines.j jVar = new kotlin.coroutines.j(kotlin.coroutines.intrinsics.b.e(this));
                    Result.a aVar = Result.Companion;
                    jVar.resumeWith(Result.m785constructorimpl(function1.invoke(jVar)));
                    Unit unit = Unit.f312394a;
                    Object objA = jVar.a();
                    if (objA == kotlin.coroutines.intrinsics.b.l()) {
                        kotlin.coroutines.jvm.internal.h.c(this);
                    }
                    kotlin.jvm.internal.h0.e(1);
                    subscriber.onNext((Object) objA);
                    this.f225164d.onCompleted();
                } catch (Throwable th2) {
                    this.f225164d.onError(th2);
                }
                return Unit.f312394a;
            }

            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(kotlinx.coroutines.s0 s0Var, kotlin.coroutines.d<? super Unit> dVar) {
                return ((a) create(s0Var, dVar)).invokeSuspend(Unit.f312394a);
            }
        }

        /* JADX WARN: Multi-variable type inference failed */
        public u(kotlin.jvm.internal.i1.h<kotlinx.coroutines.p2> hVar, kotlinx.coroutines.s0 s0Var, Function1<? super kotlin.coroutines.d<? super R>, ? extends Object> function1) {
            this.f225158a = hVar;
            this.f225159b = s0Var;
            this.f225160c = function1;
        }

        @Override // rx.functions.Action1
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final void call(Subscriber<? super R> subscriber) {
            this.f225158a.f312751a = (T) kotlinx.coroutines.k.f(this.f225159b, null, null, new a(subscriber, this.f225160c, null), 3, null);
        }
    }

    public static final class v implements Action0 {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ kotlin.jvm.internal.i1.h<kotlinx.coroutines.p2> f225166a;

        public v(kotlin.jvm.internal.i1.h<kotlinx.coroutines.p2> hVar) {
            this.f225166a = hVar;
        }

        @Override // rx.functions.Action0
        public final void call() {
            kotlinx.coroutines.p2 p2Var = this.f225166a.f312751a;
            if (p2Var != null) {
                kotlinx.coroutines.p2.a.b(p2Var, null, 1, null);
            }
        }
    }

    static {
        kotlinx.coroutines.flow.j0<Exception> j0VarB = kotlinx.coroutines.flow.q0.b(1, 0, null, 6, null);
        f225070c = j0VarB;
        f225071d = j0VarB;
    }

    private c0() {
    }

    @oj.j
    @oj.n
    @NotNull
    public static final <R> Observable<R> A(@NotNull Function<kotlin.coroutines.d<R>, Object> suspendFun) {
        Intrinsics.checkNotNullParameter(suspendFun, "suspendFun");
        return J(suspendFun, null, 2, null);
    }

    @oj.j
    @oj.n
    @NotNull
    public static final <R> Observable<R> B(@NotNull Function<kotlin.coroutines.d<R>, Object> suspendFun, @NotNull kotlinx.coroutines.s0 coroutineScope) {
        Intrinsics.checkNotNullParameter(suspendFun, "suspendFun");
        Intrinsics.checkNotNullParameter(coroutineScope, "coroutineScope");
        kotlin.jvm.internal.i1.h hVar = new kotlin.jvm.internal.i1.h();
        Observable<R> observableDoOnUnsubscribe = Observable.create(new k(hVar, coroutineScope, suspendFun)).doOnUnsubscribe(new v(hVar));
        Intrinsics.checkNotNullExpressionValue(observableDoOnUnsubscribe, "doOnUnsubscribe(...)");
        return observableDoOnUnsubscribe;
    }

    @oj.j
    @oj.n
    @NotNull
    public static final <T> Observable<T> D(@NotNull kotlinx.coroutines.flow.i<? extends T> flow) {
        Intrinsics.checkNotNullParameter(flow, "flow");
        return K(flow, null, 2, null);
    }

    @oj.j
    @oj.n
    @NotNull
    public static final <T> Observable<T> E(@NotNull final kotlinx.coroutines.flow.i<? extends T> flow, @NotNull final kotlinx.coroutines.s0 coroutineScope) {
        Intrinsics.checkNotNullParameter(flow, "flow");
        Intrinsics.checkNotNullParameter(coroutineScope, "coroutineScope");
        final kotlin.jvm.internal.i1.h hVar = new kotlin.jvm.internal.i1.h();
        Observable<T> observableDoOnUnsubscribe = Observable.create(new Observable.OnSubscribe() { // from class: com.planner5d.library.services.utility.a0
            @Override // rx.functions.Action1
            public final void call(Object obj) {
                c0.N(hVar, coroutineScope, flow, (Subscriber) obj);
            }
        }).doOnUnsubscribe(new Action0() { // from class: com.planner5d.library.services.utility.b0
            @Override // rx.functions.Action0
            public final void call() {
                c0.O(hVar);
            }
        });
        Intrinsics.checkNotNullExpressionValue(observableDoOnUnsubscribe, "doOnUnsubscribe(...)");
        return observableDoOnUnsubscribe;
    }

    public static /* synthetic */ Observable F(c0 c0Var, kotlinx.coroutines.s0 s0Var, Function1 function1, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            s0Var = kotlinx.coroutines.t0.a(kotlinx.coroutines.u2.c(null, 1, null));
        }
        return c0Var.C(s0Var, function1);
    }

    public static /* synthetic */ Observable G(Object obj, Object obj2, p3 p3Var, kotlinx.coroutines.s0 s0Var, int i10, Object obj3) {
        if ((i10 & 8) != 0) {
            s0Var = kotlinx.coroutines.t0.a(kotlinx.coroutines.u2.c(null, 1, null));
        }
        return v(obj, obj2, p3Var, s0Var);
    }

    public static /* synthetic */ Observable H(Object obj, Object obj2, Object obj3, n2 n2Var, kotlinx.coroutines.s0 s0Var, int i10, Object obj4) {
        if ((i10 & 16) != 0) {
            s0Var = kotlinx.coroutines.t0.a(kotlinx.coroutines.u2.c(null, 1, null));
        }
        return x(obj, obj2, obj3, n2Var, s0Var);
    }

    public static /* synthetic */ Observable I(Object obj, BiFunction biFunction, kotlinx.coroutines.s0 s0Var, int i10, Object obj2) {
        if ((i10 & 4) != 0) {
            s0Var = kotlinx.coroutines.t0.a(kotlinx.coroutines.u2.c(null, 1, null));
        }
        return z(obj, biFunction, s0Var);
    }

    public static /* synthetic */ Observable J(Function function, kotlinx.coroutines.s0 s0Var, int i10, Object obj) {
        if ((i10 & 2) != 0) {
            s0Var = kotlinx.coroutines.t0.a(kotlinx.coroutines.u2.c(null, 1, null));
        }
        return B(function, s0Var);
    }

    public static /* synthetic */ Observable K(kotlinx.coroutines.flow.i iVar, kotlinx.coroutines.s0 s0Var, int i10, Object obj) {
        if ((i10 & 2) != 0) {
            s0Var = kotlinx.coroutines.t0.a(kotlinx.coroutines.u2.c(null, 1, null));
        }
        return E(iVar, s0Var);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Type inference failed for: r8v1, types: [T, kotlinx.coroutines.p2] */
    public static final void L(kotlin.jvm.internal.i1.h hVar, kotlinx.coroutines.s0 s0Var, Function1 function1, Subscriber subscriber) {
        hVar.f312751a = kotlinx.coroutines.k.f(s0Var, null, null, new o(subscriber, function1, null), 3, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void M(kotlin.jvm.internal.i1.h hVar) {
        kotlinx.coroutines.p2 p2Var = (kotlinx.coroutines.p2) hVar.f312751a;
        if (p2Var != null) {
            kotlinx.coroutines.p2.a.b(p2Var, null, 1, null);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Type inference failed for: r8v1, types: [T, kotlinx.coroutines.p2] */
    public static final void N(kotlin.jvm.internal.i1.h hVar, kotlinx.coroutines.s0 s0Var, kotlinx.coroutines.flow.i iVar, Subscriber subscriber) {
        hVar.f312751a = kotlinx.coroutines.k.f(s0Var, null, null, new p(iVar, subscriber, null), 3, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void O(kotlin.jvm.internal.i1.h hVar) {
        kotlinx.coroutines.p2 p2Var = (kotlinx.coroutines.p2) hVar.f312751a;
        if (p2Var != null) {
            kotlinx.coroutines.p2.a.b(p2Var, null, 1, null);
        }
    }

    private final <T> Object R(kotlinx.coroutines.sync.a aVar, Object obj, Function1<? super kotlin.coroutines.d<? super T>, ? extends Object> function1, kotlin.coroutines.d<? super T> dVar) {
        p2.a aVar2 = p2.f229701c;
        kotlin.jvm.internal.h0.e(0);
        Object objB = aVar2.b(aVar, dVar);
        kotlin.jvm.internal.h0.e(1);
        if (((Boolean) objB).booleanValue()) {
            return function1.invoke(dVar);
        }
        kotlin.jvm.internal.h0.e(0);
        Object objA = aVar2.a(aVar, dVar);
        kotlin.jvm.internal.h0.e(1);
        boolean z10 = false & false;
        t tVar = new t(aVar, obj, function1, null);
        kotlin.jvm.internal.h0.e(0);
        Object objH = kotlinx.coroutines.i.h((CoroutineContext) objA, tVar, dVar);
        kotlin.jvm.internal.h0.e(1);
        return objH;
    }

    public static /* synthetic */ Object S(c0 c0Var, kotlinx.coroutines.sync.a aVar, Object obj, Function1 function1, kotlin.coroutines.d dVar, int i10, Object obj2) {
        if ((i10 & 1) != 0) {
            obj = null;
        }
        p2.a aVar2 = p2.f229701c;
        kotlin.jvm.internal.h0.e(0);
        Object objB = aVar2.b(aVar, dVar);
        kotlin.jvm.internal.h0.e(1);
        if (((Boolean) objB).booleanValue()) {
            kotlin.jvm.internal.h0.e(0);
            Object objInvoke = function1.invoke(dVar);
            kotlin.jvm.internal.h0.e(1);
            return objInvoke;
        }
        kotlin.jvm.internal.h0.e(0);
        Object objA = aVar2.a(aVar, dVar);
        kotlin.jvm.internal.h0.e(1);
        t tVar = new t(aVar, obj, function1, null);
        kotlin.jvm.internal.h0.e(0);
        Object objH = kotlinx.coroutines.i.h((CoroutineContext) objA, tVar, dVar);
        kotlin.jvm.internal.h0.e(1);
        return objH;
    }

    private final <R> Observable<R> T(kotlinx.coroutines.s0 s0Var, Function1<? super kotlin.coroutines.d<? super R>, ? extends Object> function1) {
        kotlin.jvm.internal.i1.h hVar = new kotlin.jvm.internal.i1.h();
        Observable<R> observableDoOnUnsubscribe = Observable.create(new u(hVar, s0Var, function1)).doOnUnsubscribe(new v(hVar));
        Intrinsics.checkNotNullExpressionValue(observableDoOnUnsubscribe, "doOnUnsubscribe(...)");
        return observableDoOnUnsubscribe;
    }

    private final <R> Object h(Function1<? super Function1<? super R, Unit>, Unit> function1, kotlin.coroutines.d<? super R> dVar) {
        kotlin.jvm.internal.h0.e(0);
        kotlin.coroutines.j jVar = new kotlin.coroutines.j(kotlin.coroutines.intrinsics.b.e(dVar));
        try {
            function1.invoke(new c(jVar));
        } catch (Exception e10) {
            Result.a aVar = Result.Companion;
            jVar.resumeWith(Result.m785constructorimpl(ResultKt.createFailure(e10)));
        }
        Unit unit = Unit.f312394a;
        Object objA = jVar.a();
        if (objA == kotlin.coroutines.intrinsics.b.l()) {
            kotlin.coroutines.jvm.internal.h.c(dVar);
        }
        kotlin.jvm.internal.h0.e(1);
        return objA;
    }

    @androidx.annotation.m1
    private final <R> R i(Function1<? super kotlin.coroutines.d<? super R>, ? extends Object> function1) {
        return (R) t(this, null, false, new d(function1, null), 3, null);
    }

    @androidx.annotation.l1
    public static /* synthetic */ void o() {
    }

    private final boolean p() {
        StackTraceElement[] stackTrace = Thread.currentThread().getStackTrace();
        Intrinsics.checkNotNullExpressionValue(stackTrace, "getStackTrace(...)");
        for (StackTraceElement stackTraceElement : stackTrace) {
            String className = stackTraceElement.getClassName();
            Intrinsics.checkNotNullExpressionValue(className, "getClassName(...)");
            if (StringsKt.u2(className, "kotlinx.coroutines", false, 2, null)) {
                int i10 = 3 & 1;
                return true;
            }
        }
        return false;
    }

    public static /* synthetic */ Object t(c0 c0Var, CoroutineContext coroutineContext, boolean z10, Function2 function2, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            coroutineContext = null;
        }
        if ((i10 & 2) != 0) {
            z10 = false;
        }
        return c0Var.r(coroutineContext, z10, function2);
    }

    @oj.j
    @oj.n
    @NotNull
    public static final <T1, T2, R> Observable<R> u(T1 t10, T2 t11, @NotNull p3<T1, T2, kotlin.coroutines.d<R>, Object> suspendFun) {
        Intrinsics.checkNotNullParameter(suspendFun, "suspendFun");
        int i10 = 5 ^ 0;
        return G(t10, t11, suspendFun, null, 8, null);
    }

    @oj.j
    @oj.n
    @NotNull
    public static final <T1, T2, R> Observable<R> v(T1 t10, T2 t11, @NotNull p3<T1, T2, kotlin.coroutines.d<R>, Object> suspendFun, @NotNull kotlinx.coroutines.s0 coroutineScope) {
        Intrinsics.checkNotNullParameter(suspendFun, "suspendFun");
        Intrinsics.checkNotNullParameter(coroutineScope, "coroutineScope");
        kotlin.jvm.internal.i1.h hVar = new kotlin.jvm.internal.i1.h();
        Observable<R> observableDoOnUnsubscribe = Observable.create(new m(hVar, coroutineScope, suspendFun, t10, t11)).doOnUnsubscribe(new v(hVar));
        Intrinsics.checkNotNullExpressionValue(observableDoOnUnsubscribe, "doOnUnsubscribe(...)");
        return observableDoOnUnsubscribe;
    }

    @oj.j
    @oj.n
    @NotNull
    public static final <T1, T2, T3, R> Observable<R> w(T1 t10, T2 t11, T3 t12, @NotNull n2<T1, T2, T3, kotlin.coroutines.d<R>, Object> suspendFun) {
        Intrinsics.checkNotNullParameter(suspendFun, "suspendFun");
        return H(t10, t11, t12, suspendFun, null, 16, null);
    }

    @oj.j
    @oj.n
    @NotNull
    public static final <T1, T2, T3, R> Observable<R> x(T1 t10, T2 t11, T3 t12, @NotNull n2<T1, T2, T3, kotlin.coroutines.d<R>, Object> suspendFun, @NotNull kotlinx.coroutines.s0 coroutineScope) {
        Intrinsics.checkNotNullParameter(suspendFun, "suspendFun");
        Intrinsics.checkNotNullParameter(coroutineScope, "coroutineScope");
        kotlin.jvm.internal.i1.h hVar = new kotlin.jvm.internal.i1.h();
        Observable<R> observableDoOnUnsubscribe = Observable.create(new n(hVar, coroutineScope, suspendFun, t10, t11, t12)).doOnUnsubscribe(new v(hVar));
        Intrinsics.checkNotNullExpressionValue(observableDoOnUnsubscribe, "doOnUnsubscribe(...)");
        return observableDoOnUnsubscribe;
    }

    @oj.j
    @oj.n
    @NotNull
    public static final <T, R> Observable<R> y(T t10, @NotNull BiFunction<T, kotlin.coroutines.d<R>, Object> suspendFun) {
        Intrinsics.checkNotNullParameter(suspendFun, "suspendFun");
        return I(t10, suspendFun, null, 4, null);
    }

    @oj.j
    @oj.n
    @NotNull
    public static final <T, R> Observable<R> z(T t10, @NotNull BiFunction<T, kotlin.coroutines.d<R>, Object> suspendFun, @NotNull kotlinx.coroutines.s0 coroutineScope) {
        Intrinsics.checkNotNullParameter(suspendFun, "suspendFun");
        Intrinsics.checkNotNullParameter(coroutineScope, "coroutineScope");
        kotlin.jvm.internal.i1.h hVar = new kotlin.jvm.internal.i1.h();
        Observable<R> observableDoOnUnsubscribe = Observable.create(new l(hVar, coroutineScope, suspendFun, t10)).doOnUnsubscribe(new v(hVar));
        Intrinsics.checkNotNullExpressionValue(observableDoOnUnsubscribe, "doOnUnsubscribe(...)");
        return observableDoOnUnsubscribe;
    }

    @NotNull
    public final <R> Observable<R> C(@NotNull final kotlinx.coroutines.s0 coroutineScope, @NotNull final Function1<? super kotlin.coroutines.d<? super R>, ? extends Object> suspendAction) {
        Intrinsics.checkNotNullParameter(coroutineScope, "coroutineScope");
        Intrinsics.checkNotNullParameter(suspendAction, "suspendAction");
        final kotlin.jvm.internal.i1.h hVar = new kotlin.jvm.internal.i1.h();
        Observable<R> observableDoOnUnsubscribe = Observable.create(new Observable.OnSubscribe() { // from class: com.planner5d.library.services.utility.y
            @Override // rx.functions.Action1
            public final void call(Object obj) {
                c0.L(hVar, coroutineScope, suspendAction, (Subscriber) obj);
            }
        }).doOnUnsubscribe(new Action0() { // from class: com.planner5d.library.services.utility.z
            @Override // rx.functions.Action0
            public final void call() {
                c0.M(hVar);
            }
        });
        Intrinsics.checkNotNullExpressionValue(observableDoOnUnsubscribe, "doOnUnsubscribe(...)");
        return observableDoOnUnsubscribe;
    }

    public final void P(boolean z10) {
        f225069b = z10;
    }

    /* JADX WARN: Code duplicated, block: B:39:0x00cc A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:7:0x0014  */
    @Nullable
    public final <T> Object Q(@NotNull kotlinx.coroutines.sync.a aVar, @Nullable Object obj, @NotNull Function1<? super kotlin.coroutines.d<? super T>, ? extends Object> function1, @NotNull kotlin.coroutines.d<? super T> dVar) {
        s sVar;
        kotlinx.coroutines.sync.a aVar2;
        Function1<? super kotlin.coroutines.d<? super T>, ? extends Object> function2;
        Object objH;
        if (dVar instanceof s) {
            sVar = (s) dVar;
            int i10 = sVar.f225150f;
            if ((i10 & Integer.MIN_VALUE) != 0) {
                sVar.f225150f = i10 - Integer.MIN_VALUE;
            } else {
                sVar = new s(dVar);
            }
        } else {
            sVar = new s(dVar);
        }
        Object objB = sVar.f225148d;
        Object objL = kotlin.coroutines.intrinsics.b.l();
        int i11 = sVar.f225150f;
        if (i11 == 0) {
            ResultKt.m(objB);
            p2.a aVar3 = p2.f229701c;
            sVar.f225145a = aVar;
            sVar.f225146b = obj;
            sVar.f225147c = function1;
            sVar.f225150f = 1;
            objB = aVar3.b(aVar, sVar);
            if (objB == objL) {
            }
            return objL;
        }
        if (i11 == 1) {
            function1 = (Function1) sVar.f225147c;
            obj = sVar.f225146b;
            aVar = (kotlinx.coroutines.sync.a) sVar.f225145a;
            ResultKt.m(objB);
        } else {
            if (i11 == 2) {
                ResultKt.m(objB);
                return objB;
            }
            if (i11 != 3) {
                if (i11 != 4) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.m(objB);
                return objB;
            }
            function2 = (Function1) sVar.f225147c;
            obj = sVar.f225146b;
            aVar2 = (kotlinx.coroutines.sync.a) sVar.f225145a;
            ResultKt.m(objB);
        }
        t tVar = new t(aVar2, obj, function2, null);
        sVar.f225145a = null;
        sVar.f225146b = null;
        sVar.f225147c = null;
        sVar.f225150f = 4;
        objH = kotlinx.coroutines.i.h((CoroutineContext) objB, tVar, sVar);
        if (objH != objL) {
            return objH;
        }
        return objL;
        if (((Boolean) objB).booleanValue()) {
            sVar.f225145a = null;
            sVar.f225146b = null;
            sVar.f225147c = null;
            sVar.f225150f = 2;
            Object objInvoke = function1.invoke(sVar);
            if (objInvoke != objL) {
                return objInvoke;
            }
        } else {
            p2.a aVar4 = p2.f229701c;
            sVar.f225145a = aVar;
            sVar.f225146b = obj;
            sVar.f225147c = function1;
            sVar.f225150f = 3;
            objB = aVar4.a(aVar, sVar);
            if (objB != objL) {
                Function1<? super kotlin.coroutines.d<? super T>, ? extends Object> function3 = function1;
                aVar2 = aVar;
                function2 = function3;
                t tVar2 = new t(aVar2, obj, function2, null);
                sVar.f225145a = null;
                sVar.f225146b = null;
                sVar.f225147c = null;
                sVar.f225150f = 4;
                objH = kotlinx.coroutines.i.h((CoroutineContext) objB, tVar2, sVar);
                if (objH != objL) {
                    return objH;
                }
            }
        }
        return objL;
    }

    @Nullable
    public final <T> Object f(@NotNull Task<T> task, @NotNull kotlin.coroutines.d<? super T> dVar) throws Throwable {
        kotlin.coroutines.j jVar = new kotlin.coroutines.j(kotlin.coroutines.intrinsics.b.e(dVar));
        task.j(new q(new a(jVar)));
        task.g(new b(jVar));
        Object objA = jVar.a();
        if (objA == kotlin.coroutines.intrinsics.b.l()) {
            kotlin.coroutines.jvm.internal.h.c(dVar);
        }
        return objA;
    }

    @Nullable
    public final <R> Object g(@NotNull Function1<? super Function1<? super R, Unit>, Unit> function1, @NotNull kotlin.coroutines.d<? super R> dVar) {
        kotlin.coroutines.j jVar = new kotlin.coroutines.j(kotlin.coroutines.intrinsics.b.e(dVar));
        try {
            function1.invoke(new c(jVar));
        } catch (Exception e10) {
            Result.a aVar = Result.Companion;
            jVar.resumeWith(Result.m785constructorimpl(ResultKt.createFailure(e10)));
        }
        Object objA = jVar.a();
        if (objA == kotlin.coroutines.intrinsics.b.l()) {
            kotlin.coroutines.jvm.internal.h.c(dVar);
        }
        return objA;
    }

    public final void j(@NotNull Function0<Unit> executor) {
        Intrinsics.checkNotNullParameter(executor, "executor");
        if (o3.b()) {
            executor.invoke();
        } else {
            kotlinx.coroutines.k.f(kotlinx.coroutines.f2.f314023a, com.planner5d.library.services.utility.s.f229729a.a(), null, new e(executor, null), 2, null);
        }
    }

    @NotNull
    public final <T> kotlinx.coroutines.flow.i<T> k(@NotNull Observable<T> observable) {
        Intrinsics.checkNotNullParameter(observable, "observable");
        return kotlinx.coroutines.flow.k.t(new f(observable, null));
    }

    @Nullable
    public final <T> Object l(@NotNull Observable<T> observable, @NotNull kotlin.coroutines.d<? super T> dVar) throws Throwable {
        kotlinx.coroutines.p pVar = new kotlinx.coroutines.p(kotlin.coroutines.intrinsics.b.e(dVar), 1);
        pVar.p0();
        int i10 = 4 >> 0;
        pVar.e0(new g(observable.lastOrDefault(null).subscribe(new r(new h(pVar)), new i(pVar))));
        Object objU = pVar.u();
        if (objU == kotlin.coroutines.intrinsics.b.l()) {
            kotlin.coroutines.jvm.internal.h.c(dVar);
        }
        return objU;
    }

    @NotNull
    public final kotlinx.coroutines.flow.i<Exception> m() {
        return f225071d;
    }

    public final boolean n() {
        return f225069b;
    }

    @oj.j
    @kotlin.l(message = "Should be avoided at all in the ideal case")
    public final <T> T q(@Nullable CoroutineContext coroutineContext, @NotNull Function2<? super kotlinx.coroutines.s0, ? super kotlin.coroutines.d<? super T>, ? extends Object> block) {
        Intrinsics.checkNotNullParameter(block, "block");
        return (T) t(this, coroutineContext, false, block, 2, null);
    }

    @oj.j
    @kotlin.l(message = "Should be avoided at all in the ideal case")
    public final <T> T r(@Nullable CoroutineContext coroutineContext, boolean z10, @NotNull Function2<? super kotlinx.coroutines.s0, ? super kotlin.coroutines.d<? super T>, ? extends Object> block) {
        Intrinsics.checkNotNullParameter(block, "block");
        j jVar = new j((!z10 && f225069b && p()) ? new IllegalStateException("Do not use `runBlocking` inside coroutines") : null, block, null);
        return coroutineContext != null ? (T) kotlinx.coroutines.i.f(coroutineContext, jVar) : (T) kotlinx.coroutines.j.b(null, jVar, 1, null);
    }

    @oj.j
    @kotlin.l(message = "Should be avoided at all in the ideal case")
    public final <T> T s(@NotNull Function2<? super kotlinx.coroutines.s0, ? super kotlin.coroutines.d<? super T>, ? extends Object> block) {
        Intrinsics.checkNotNullParameter(block, "block");
        return (T) t(this, null, false, block, 3, null);
    }
}
