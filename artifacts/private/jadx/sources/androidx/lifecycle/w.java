package androidx.lifecycle;

import java.time.Duration;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.CoroutineContext;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.a3;
import kotlinx.coroutines.c3;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes2.dex */
@oj.i(name = "FlowLiveDataConversions")
public final class w {

    /* JADX INFO: Add missing generic type declarations: [T] */
    @kotlin.coroutines.jvm.internal.f(c = "androidx.lifecycle.FlowLiveDataConversions$asFlow$1", f = "FlowLiveData.kt", i = {0, 1}, l = {105, com.planner5d.library.engine.input.f.b.f160742x1, 108}, m = "invokeSuspend", n = {"observer", "observer"}, s = {"L$0", "L$0"})
    static final class a<T> extends kotlin.coroutines.jvm.internal.o implements Function2<kotlinx.coroutines.channels.l0<? super T>, kotlin.coroutines.d<? super Unit>, Object> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        int f52559a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private /* synthetic */ Object f52560b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ w0<T> f52561c;

        /* JADX INFO: renamed from: androidx.lifecycle.w$a$a, reason: collision with other inner class name */
        @kotlin.coroutines.jvm.internal.f(c = "androidx.lifecycle.FlowLiveDataConversions$asFlow$1$1", f = "FlowLiveData.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
        static final class C0483a extends kotlin.coroutines.jvm.internal.o implements Function2<kotlinx.coroutines.s0, kotlin.coroutines.d<? super Unit>, Object> {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            int f52562a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            final /* synthetic */ w0<T> f52563b;

            /* JADX INFO: renamed from: c, reason: collision with root package name */
            final /* synthetic */ d1<T> f52564c;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            C0483a(w0<T> w0Var, d1<T> d1Var, kotlin.coroutines.d<? super C0483a> dVar) {
                super(2, dVar);
                this.f52563b = w0Var;
                this.f52564c = d1Var;
            }

            @Override // kotlin.coroutines.jvm.internal.a
            public final kotlin.coroutines.d<Unit> create(Object obj, kotlin.coroutines.d<?> dVar) {
                return new C0483a(this.f52563b, this.f52564c, dVar);
            }

            /* JADX WARN: Type inference incomplete: some casts might be missing */
            @Override // kotlin.coroutines.jvm.internal.a
            public final Object invokeSuspend(Object obj) {
                kotlin.coroutines.intrinsics.b.l();
                if (this.f52562a != 0) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.m(obj);
                this.f52563b.l((d1<? super T>) this.f52564c);
                return Unit.f312394a;
            }

            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(kotlinx.coroutines.s0 s0Var, kotlin.coroutines.d<? super Unit> dVar) {
                return ((C0483a) create(s0Var, dVar)).invokeSuspend(Unit.f312394a);
            }
        }

        @kotlin.coroutines.jvm.internal.f(c = "androidx.lifecycle.FlowLiveDataConversions$asFlow$1$2", f = "FlowLiveData.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
        static final class b extends kotlin.coroutines.jvm.internal.o implements Function2<kotlinx.coroutines.s0, kotlin.coroutines.d<? super Unit>, Object> {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            int f52565a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            final /* synthetic */ w0<T> f52566b;

            /* JADX INFO: renamed from: c, reason: collision with root package name */
            final /* synthetic */ d1<T> f52567c;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            b(w0<T> w0Var, d1<T> d1Var, kotlin.coroutines.d<? super b> dVar) {
                super(2, dVar);
                this.f52566b = w0Var;
                this.f52567c = d1Var;
            }

            @Override // kotlin.coroutines.jvm.internal.a
            public final kotlin.coroutines.d<Unit> create(Object obj, kotlin.coroutines.d<?> dVar) {
                return new b(this.f52566b, this.f52567c, dVar);
            }

            /* JADX WARN: Type inference incomplete: some casts might be missing */
            @Override // kotlin.coroutines.jvm.internal.a
            public final Object invokeSuspend(Object obj) {
                kotlin.coroutines.intrinsics.b.l();
                if (this.f52565a != 0) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.m(obj);
                this.f52566b.p((d1<? super T>) this.f52567c);
                return Unit.f312394a;
            }

            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(kotlinx.coroutines.s0 s0Var, kotlin.coroutines.d<? super Unit> dVar) {
                return ((b) create(s0Var, dVar)).invokeSuspend(Unit.f312394a);
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        a(w0<T> w0Var, kotlin.coroutines.d<? super a> dVar) {
            super(2, dVar);
            this.f52561c = w0Var;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final void m(kotlinx.coroutines.channels.l0 l0Var, Object obj) {
            l0Var.p(obj);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final kotlin.coroutines.d<Unit> create(Object obj, kotlin.coroutines.d<?> dVar) {
            a aVar = new a(this.f52561c, dVar);
            aVar.f52560b = obj;
            return aVar;
        }

        /* JADX WARN: Multi-variable type inference failed */
        /* JADX WARN: Type inference failed for: r1v0, types: [int] */
        /* JADX WARN: Type inference failed for: r1v1, types: [androidx.lifecycle.d1] */
        /* JADX WARN: Type inference failed for: r1v10 */
        /* JADX WARN: Type inference failed for: r1v4 */
        /* JADX WARN: Type inference failed for: r1v9 */
        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) throws Throwable {
            Throwable th2;
            d1 d1Var;
            Object objL = kotlin.coroutines.intrinsics.b.l();
            ?? r10 = this.f52559a;
            try {
                if (r10 == 0) {
                    ResultKt.m(obj);
                    final kotlinx.coroutines.channels.l0 l0Var = (kotlinx.coroutines.channels.l0) this.f52560b;
                    d1 d1Var2 = new d1() { // from class: androidx.lifecycle.v
                        @Override // androidx.lifecycle.d1
                        public final void c(Object obj2) {
                            w.a.m(l0Var, obj2);
                        }
                    };
                    a3 a3VarM0 = kotlinx.coroutines.l1.e().R0();
                    C0483a c0483a = new C0483a(this.f52561c, d1Var2, null);
                    this.f52560b = d1Var2;
                    this.f52559a = 1;
                    d1Var = d1Var2;
                    if (kotlinx.coroutines.i.h(a3VarM0, c0483a, this) == objL) {
                    }
                    return objL;
                }
                if (r10 == 1) {
                    d1 d1Var3 = (d1) this.f52560b;
                    ResultKt.m(obj);
                    d1Var = d1Var3;
                } else {
                    if (r10 != 2) {
                        if (r10 != 3) {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        th2 = (Throwable) this.f52560b;
                        ResultKt.m(obj);
                        throw th2;
                    }
                    d1 d1Var4 = (d1) this.f52560b;
                    ResultKt.m(obj);
                    r10 = d1Var4;
                }
                throw new kotlin.a0();
                this.f52560b = d1Var;
                this.f52559a = 2;
                r10 = d1Var;
                if (kotlinx.coroutines.d1.a(this) == objL) {
                    return objL;
                }
                throw new kotlin.a0();
            } catch (Throwable th3) {
                CoroutineContext coroutineContextPlus = kotlinx.coroutines.l1.e().R0().plus(c3.f313552a);
                b bVar = new b(this.f52561c, r10, null);
                this.f52560b = th3;
                this.f52559a = 3;
                if (kotlinx.coroutines.i.h(coroutineContextPlus, bVar, this) != objL) {
                    th2 = th3;
                }
                return objL;
            }
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(kotlinx.coroutines.channels.l0<? super T> l0Var, kotlin.coroutines.d<? super Unit> dVar) {
            return ((a) create(l0Var, dVar)).invokeSuspend(Unit.f312394a);
        }
    }

    /* JADX INFO: Add missing generic type declarations: [T] */
    @kotlin.coroutines.jvm.internal.f(c = "androidx.lifecycle.FlowLiveDataConversions$asLiveData$1", f = "FlowLiveData.kt", i = {}, l = {78}, m = "invokeSuspend", n = {}, s = {})
    static final class b<T> extends kotlin.coroutines.jvm.internal.o implements Function2<y0<T>, kotlin.coroutines.d<? super Unit>, Object> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        int f52568a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private /* synthetic */ Object f52569b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ kotlinx.coroutines.flow.i<T> f52570c;

        static final class a<T> implements kotlinx.coroutines.flow.j {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            final /* synthetic */ y0<T> f52571a;

            a(y0<T> y0Var) {
                this.f52571a = y0Var;
            }

            @Override // kotlinx.coroutines.flow.j
            public final Object emit(T t10, kotlin.coroutines.d<? super Unit> dVar) {
                Object objEmit = this.f52571a.emit(t10, dVar);
                return objEmit == kotlin.coroutines.intrinsics.b.l() ? objEmit : Unit.f312394a;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        b(kotlinx.coroutines.flow.i<? extends T> iVar, kotlin.coroutines.d<? super b> dVar) {
            super(2, dVar);
            this.f52570c = iVar;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final kotlin.coroutines.d<Unit> create(Object obj, kotlin.coroutines.d<?> dVar) {
            b bVar = new b(this.f52570c, dVar);
            bVar.f52569b = obj;
            return bVar;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            Object objL = kotlin.coroutines.intrinsics.b.l();
            int i10 = this.f52568a;
            if (i10 == 0) {
                ResultKt.m(obj);
                y0 y0Var = (y0) this.f52569b;
                kotlinx.coroutines.flow.i<T> iVar = this.f52570c;
                a aVar = new a(y0Var);
                this.f52568a = 1;
                if (iVar.collect(aVar, this) == objL) {
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
        /* JADX INFO: renamed from: k, reason: merged with bridge method [inline-methods] */
        public final Object invoke(y0<T> y0Var, kotlin.coroutines.d<? super Unit> dVar) {
            return ((b) create(y0Var, dVar)).invokeSuspend(Unit.f312394a);
        }
    }

    @NotNull
    public static final <T> kotlinx.coroutines.flow.i<T> a(@NotNull w0<T> w0Var) {
        Intrinsics.checkNotNullParameter(w0Var, "<this>");
        return kotlinx.coroutines.flow.k.Y(kotlinx.coroutines.flow.k.t(new a(w0Var, null)));
    }

    @oj.j
    @NotNull
    public static final <T> w0<T> b(@NotNull kotlinx.coroutines.flow.i<? extends T> iVar) {
        Intrinsics.checkNotNullParameter(iVar, "<this>");
        return g(iVar, null, 0L, 3, null);
    }

    @androidx.annotation.w0(26)
    @NotNull
    public static final <T> w0<T> c(@NotNull kotlinx.coroutines.flow.i<? extends T> iVar, @NotNull Duration timeout, @NotNull CoroutineContext context) {
        Intrinsics.checkNotNullParameter(iVar, "<this>");
        Intrinsics.checkNotNullParameter(timeout, "timeout");
        Intrinsics.checkNotNullParameter(context, "context");
        return e(iVar, context, d.f52305a.a(timeout));
    }

    @oj.j
    @NotNull
    public static final <T> w0<T> d(@NotNull kotlinx.coroutines.flow.i<? extends T> iVar, @NotNull CoroutineContext context) {
        Intrinsics.checkNotNullParameter(iVar, "<this>");
        Intrinsics.checkNotNullParameter(context, "context");
        return g(iVar, context, 0L, 2, null);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @oj.j
    @NotNull
    public static final <T> w0<T> e(@NotNull kotlinx.coroutines.flow.i<? extends T> iVar, @NotNull CoroutineContext context, long j10) {
        Intrinsics.checkNotNullParameter(iVar, "<this>");
        Intrinsics.checkNotNullParameter(context, "context");
        com.planner5d.library.activity.fragment.snapshots.n0.a aVar = (w0<T>) o.d(context, j10, new b(iVar, null));
        if (iVar instanceof kotlinx.coroutines.flow.z0) {
            if (androidx.arch.core.executor.c.h().c()) {
                aVar.r(((kotlinx.coroutines.flow.z0) iVar).getValue());
                return aVar;
            }
            aVar.o(((kotlinx.coroutines.flow.z0) iVar).getValue());
        }
        return aVar;
    }

    public static /* synthetic */ w0 f(kotlinx.coroutines.flow.i iVar, Duration duration, CoroutineContext coroutineContext, int i10, Object obj) {
        if ((i10 & 2) != 0) {
            coroutineContext = kotlin.coroutines.h.f312451a;
        }
        return c(iVar, duration, coroutineContext);
    }

    public static /* synthetic */ w0 g(kotlinx.coroutines.flow.i iVar, CoroutineContext coroutineContext, long j10, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            coroutineContext = kotlin.coroutines.h.f312451a;
        }
        if ((i10 & 2) != 0) {
            j10 = 5000;
        }
        return e(iVar, coroutineContext, j10);
    }
}
