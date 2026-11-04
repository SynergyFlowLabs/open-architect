package com.planner5d.library.services.utility;

import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.CoroutineContext;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import rx.subjects.ReplaySubject;

/* JADX INFO: loaded from: classes10.dex */
public final class q3<T> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    private a<T> f229712a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NotNull
    private final Object f229713b;

    private static abstract class a<T> {

        /* JADX INFO: renamed from: com.planner5d.library.services.utility.q3$a$a, reason: collision with other inner class name */
        public static final class C1690a<T> extends a<T> {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            private final T f229714a;

            public C1690a(T t10) {
                super(null);
                this.f229714a = t10;
            }

            public final T a() {
                return this.f229714a;
            }
        }

        public static final class b<T> extends a<T> {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            @NotNull
            private final ReplaySubject<T> f229715a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            @NotNull
            private final kotlinx.coroutines.flow.j0<T> f229716b;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public b(@NotNull ReplaySubject<T> subject, @NotNull kotlinx.coroutines.flow.j0<T> flow) {
                super(null);
                Intrinsics.checkNotNullParameter(subject, "subject");
                Intrinsics.checkNotNullParameter(flow, "flow");
                this.f229715a = subject;
                this.f229716b = flow;
            }

            @NotNull
            public final kotlinx.coroutines.flow.j0<T> a() {
                return this.f229716b;
            }

            @NotNull
            public final ReplaySubject<T> b() {
                return this.f229715a;
            }
        }

        public static final class c<T> extends a<T> {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            @NotNull
            private final Function0<T> f229717a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            @NotNull
            private final ReplaySubject<T> f229718b;

            /* JADX INFO: renamed from: c, reason: collision with root package name */
            @NotNull
            private final kotlinx.coroutines.flow.j0<T> f229719c;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            /* JADX WARN: Multi-variable type inference failed */
            public c(@NotNull Function0<? extends T> initializer, @NotNull ReplaySubject<T> subject, @NotNull kotlinx.coroutines.flow.j0<T> flow) {
                super(null);
                Intrinsics.checkNotNullParameter(initializer, "initializer");
                Intrinsics.checkNotNullParameter(subject, "subject");
                Intrinsics.checkNotNullParameter(flow, "flow");
                this.f229717a = initializer;
                this.f229718b = subject;
                this.f229719c = flow;
            }

            @NotNull
            public final kotlinx.coroutines.flow.j0<T> a() {
                return this.f229719c;
            }

            @NotNull
            public final Function0<T> b() {
                return this.f229717a;
            }

            @NotNull
            public final ReplaySubject<T> c() {
                return this.f229718b;
            }
        }

        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private a() {
        }
    }

    @kotlin.coroutines.jvm.internal.f(c = "com.planner5d.library.services.utility.UniversalLazy$getSuspending$2", f = "UniversalLazy.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
    static final class b extends kotlin.coroutines.jvm.internal.o implements Function2<kotlinx.coroutines.s0, kotlin.coroutines.d<? super T>, Object> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        int f229720a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ q3<T> f229721b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ a<T> f229722c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        b(q3<T> q3Var, a<T> aVar, kotlin.coroutines.d<? super b> dVar) {
            super(2, dVar);
            this.f229721b = q3Var;
            this.f229722c = aVar;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final kotlin.coroutines.d<Unit> create(Object obj, kotlin.coroutines.d<?> dVar) {
            return new b(this.f229721b, this.f229722c, dVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            kotlin.coroutines.intrinsics.b.l();
            if (this.f229720a != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.m(obj);
            return this.f229721b.f((a.c) this.f229722c);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(kotlinx.coroutines.s0 s0Var, kotlin.coroutines.d<? super T> dVar) {
            return ((b) create(s0Var, dVar)).invokeSuspend(Unit.f312394a);
        }
    }

    public q3(@NotNull Function0<? extends T> initializer) {
        Intrinsics.checkNotNullParameter(initializer, "initializer");
        ReplaySubject replaySubjectCreate = ReplaySubject.create(1);
        Intrinsics.checkNotNullExpressionValue(replaySubjectCreate, "create(...)");
        this.f229712a = new a.c(initializer, replaySubjectCreate, kotlinx.coroutines.flow.q0.b(1, 0, null, 6, null));
        this.f229713b = new Object();
    }

    private final a<T> c() {
        a<T> aVar;
        synchronized (this.f229713b) {
            try {
                aVar = this.f229712a;
                if (aVar instanceof a.c) {
                    this.f229712a = new a.b(((a.c) aVar).c(), ((a.c) aVar).a());
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
        return aVar;
    }

    public static /* synthetic */ Object e(q3 q3Var, CoroutineContext coroutineContext, kotlin.coroutines.d dVar, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            coroutineContext = kotlin.coroutines.h.f312451a;
        }
        return q3Var.d(coroutineContext, dVar);
    }

    /* JADX INFO: Access modifiers changed from: private */
    @androidx.annotation.m1
    public final T f(a.c<T> cVar) {
        T tInvoke = cVar.b().invoke();
        synchronized (this.f229713b) {
            this.f229712a = new a.C1690a(tInvoke);
            Unit unit = Unit.f312394a;
        }
        cVar.c().onNext(tInvoke);
        cVar.c().onCompleted();
        cVar.a().f(tInvoke);
        return tInvoke;
    }

    @androidx.annotation.m1
    public final T b() {
        a<T> aVarC = c();
        if (aVarC instanceof a.c) {
            return f((a.c) aVarC);
        }
        if (aVarC instanceof a.b) {
            return ((a.b) aVarC).b().toBlocking().first();
        }
        if (aVarC instanceof a.C1690a) {
            return (T) ((a.C1690a) aVarC).a();
        }
        throw new kotlin.k0();
    }

    @Nullable
    public final Object d(@NotNull CoroutineContext coroutineContext, @NotNull kotlin.coroutines.d<? super T> dVar) {
        a<T> aVarC = c();
        if (aVarC instanceof a.c) {
            return kotlinx.coroutines.i.h(coroutineContext, new b(this, aVarC, null), dVar);
        }
        if (aVarC instanceof a.b) {
            return kotlinx.coroutines.flow.k.w0(((a.b) aVarC).a(), dVar);
        }
        if (aVarC instanceof a.C1690a) {
            return ((a.C1690a) aVarC).a();
        }
        throw new kotlin.k0();
    }
}
