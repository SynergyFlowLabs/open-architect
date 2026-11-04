package kotlinx.coroutines.rx2;

import androidx.compose.animation.core.z1;
import io.reactivex.i0;
import io.reactivex.k0;
import java.util.concurrent.atomic.AtomicReference;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.CoroutineContext;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.a1;
import kotlinx.coroutines.channels.j0;
import kotlinx.coroutines.channels.l0;
import kotlinx.coroutines.channels.n0;
import kotlinx.coroutines.channels.o0;
import kotlinx.coroutines.f2;
import kotlinx.coroutines.l1;
import kotlinx.coroutines.p2;
import kotlinx.coroutines.s0;
import kotlinx.coroutines.u0;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes12.dex */
public final class p {

    @kotlin.coroutines.jvm.internal.f(c = "kotlinx.coroutines.rx2.RxConvertKt$asCompletable$1", f = "RxConvert.kt", i = {}, l = {26}, m = "invokeSuspend", n = {}, s = {})
    static final class a extends kotlin.coroutines.jvm.internal.o implements Function2<s0, kotlin.coroutines.d<? super Unit>, Object> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        int f315385a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ p2 f315386b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        a(p2 p2Var, kotlin.coroutines.d<? super a> dVar) {
            super(2, dVar);
            this.f315386b = p2Var;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final kotlin.coroutines.d<Unit> create(Object obj, kotlin.coroutines.d<?> dVar) {
            return new a(this.f315386b, dVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            Object objL = kotlin.coroutines.intrinsics.b.l();
            int i10 = this.f315385a;
            if (i10 == 0) {
                ResultKt.m(obj);
                p2 p2Var = this.f315386b;
                this.f315385a = 1;
                if (p2Var.d1(this) == objL) {
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
        public final Object invoke(s0 s0Var, kotlin.coroutines.d<? super Unit> dVar) {
            return ((a) create(s0Var, dVar)).invokeSuspend(Unit.f312394a);
        }
    }

    /* JADX INFO: Add missing generic type declarations: [T] */
    @kotlin.coroutines.jvm.internal.f(c = "kotlinx.coroutines.rx2.RxConvertKt$asFlow$1", f = "RxConvert.kt", i = {}, l = {com.planner5d.library.engine.input.f.b.f160711n0}, m = "invokeSuspend", n = {}, s = {})
    static final class b<T> extends kotlin.coroutines.jvm.internal.o implements Function2<l0<? super T>, kotlin.coroutines.d<? super Unit>, Object> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        int f315387a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private /* synthetic */ Object f315388b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ io.reactivex.g0<T> f315389c;

        public static final class a implements i0<T> {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            final /* synthetic */ l0<T> f315390a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            final /* synthetic */ AtomicReference<io.reactivex.disposables.c> f315391b;

            /* JADX WARN: Multi-variable type inference failed */
            a(l0<? super T> l0Var, AtomicReference<io.reactivex.disposables.c> atomicReference) {
                this.f315390a = l0Var;
                this.f315391b = atomicReference;
            }

            @Override // io.reactivex.i0
            public void d(io.reactivex.disposables.c cVar) {
                if (z1.a(this.f315391b, null, cVar)) {
                    return;
                }
                cVar.dispose();
            }

            @Override // io.reactivex.i0
            public void onComplete() {
                int i10 = (6 >> 0) << 1;
                o0.a.a(this.f315390a, null, 1, null);
            }

            @Override // io.reactivex.i0
            public void onError(Throwable th2) {
                this.f315390a.F(th2);
            }

            @Override // io.reactivex.i0
            public void onNext(T t10) {
                try {
                    kotlinx.coroutines.channels.v.m0(this.f315390a, t10);
                } catch (InterruptedException unused) {
                }
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        b(io.reactivex.g0<T> g0Var, kotlin.coroutines.d<? super b> dVar) {
            super(2, dVar);
            this.f315389c = g0Var;
            int i10 = 7 & 2;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final Unit m(AtomicReference atomicReference) {
            io.reactivex.disposables.c cVar = (io.reactivex.disposables.c) atomicReference.getAndSet(io.reactivex.disposables.d.a());
            if (cVar != null) {
                cVar.dispose();
            }
            return Unit.f312394a;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final kotlin.coroutines.d<Unit> create(Object obj, kotlin.coroutines.d<?> dVar) {
            b bVar = new b(this.f315389c, dVar);
            bVar.f315388b = obj;
            return bVar;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            Object objL = kotlin.coroutines.intrinsics.b.l();
            int i10 = this.f315387a;
            if (i10 == 0) {
                ResultKt.m(obj);
                l0 l0Var = (l0) this.f315388b;
                final AtomicReference atomicReference = new AtomicReference();
                this.f315389c.a(new a(l0Var, atomicReference));
                Function0 function0 = new Function0() { // from class: kotlinx.coroutines.rx2.q
                    @Override // kotlin.jvm.functions.Function0
                    public final Object invoke() {
                        return p.b.m(atomicReference);
                    }
                };
                this.f315387a = 1;
                if (j0.b(l0Var, function0, this) == objL) {
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
        public final Object invoke(l0<? super T> l0Var, kotlin.coroutines.d<? super Unit> dVar) {
            return ((b) create(l0Var, dVar)).invokeSuspend(Unit.f312394a);
        }
    }

    /* JADX INFO: Add missing generic type declarations: [T] */
    @kotlin.coroutines.jvm.internal.f(c = "kotlinx.coroutines.rx2.RxConvertKt$asMaybe$1", f = "RxConvert.kt", i = {}, l = {42}, m = "invokeSuspend", n = {}, s = {})
    static final class c<T> extends kotlin.coroutines.jvm.internal.o implements Function2<s0, kotlin.coroutines.d<? super T>, Object> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        int f315392a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ a1<T> f315393b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        c(a1<? extends T> a1Var, kotlin.coroutines.d<? super c> dVar) {
            super(2, dVar);
            this.f315393b = a1Var;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final kotlin.coroutines.d<Unit> create(Object obj, kotlin.coroutines.d<?> dVar) {
            return new c(this.f315393b, dVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            Object objL = kotlin.coroutines.intrinsics.b.l();
            int i10 = this.f315392a;
            if (i10 != 0) {
                if (i10 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.m(obj);
                return obj;
            }
            ResultKt.m(obj);
            a1<T> a1Var = this.f315393b;
            this.f315392a = 1;
            Object objQ = a1Var.q(this);
            return objQ == objL ? objL : objQ;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(s0 s0Var, kotlin.coroutines.d<? super T> dVar) {
            return ((c) create(s0Var, dVar)).invokeSuspend(Unit.f312394a);
        }
    }

    @kotlin.coroutines.jvm.internal.f(c = "kotlinx.coroutines.rx2.RxConvertKt$asObservable$1$job$1", f = "RxConvert.kt", i = {0}, l = {110}, m = "invokeSuspend", n = {"$this$launch"}, s = {"L$0"})
    static final class d extends kotlin.coroutines.jvm.internal.o implements Function2<s0, kotlin.coroutines.d<? super Unit>, Object> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        int f315394a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private /* synthetic */ Object f315395b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ kotlinx.coroutines.flow.i<T> f315396c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        final /* synthetic */ io.reactivex.d0<T> f315397d;

        static final class a<T> implements kotlinx.coroutines.flow.j {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            final /* synthetic */ io.reactivex.d0<T> f315398a;

            a(io.reactivex.d0<T> d0Var) {
                this.f315398a = d0Var;
            }

            @Override // kotlinx.coroutines.flow.j
            public final Object emit(T t10, kotlin.coroutines.d<? super Unit> dVar) {
                this.f315398a.onNext(t10);
                return Unit.f312394a;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        d(kotlinx.coroutines.flow.i<? extends T> iVar, io.reactivex.d0<T> d0Var, kotlin.coroutines.d<? super d> dVar) {
            super(2, dVar);
            this.f315396c = iVar;
            this.f315397d = d0Var;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final kotlin.coroutines.d<Unit> create(Object obj, kotlin.coroutines.d<?> dVar) {
            d dVar2 = new d(this.f315396c, this.f315397d, dVar);
            dVar2.f315395b = obj;
            return dVar2;
        }

        /* JADX WARN: Type inference incomplete: some casts might be missing */
        /*  JADX ERROR: JadxRuntimeException in pass: ModVisitor
            jadx.core.utils.exceptions.JadxRuntimeException: Can't change immutable type kotlin.coroutines.d to kotlinx.coroutines.rx2.p$d for r7v7 'this'  kotlin.coroutines.d
            	at jadx.core.dex.instructions.args.SSAVar.setType(SSAVar.java:114)
            	at jadx.core.dex.instructions.args.RegisterArg.setType(RegisterArg.java:52)
            	at jadx.core.dex.visitors.ModVisitor.removeCheckCast(ModVisitor.java:417)
            	at jadx.core.dex.visitors.ModVisitor.replaceStep(ModVisitor.java:152)
            	at jadx.core.dex.visitors.ModVisitor.visit(ModVisitor.java:96)
            */
        @Override // kotlin.coroutines.jvm.internal.a
        public final java.lang.Object invokeSuspend(java.lang.Object r8) {
            /*
                r7 = this;
                r6 = 1
                java.lang.Object r0 = kotlin.coroutines.intrinsics.b.l()
                int r1 = r7.f315394a
                r2 = 1
                if (r1 == 0) goto L21
                if (r1 != r2) goto L19
                r6 = 0
                java.lang.Object r0 = r7.f315395b
                r6 = 3
                kotlinx.coroutines.s0 r0 = (kotlinx.coroutines.s0) r0
                kotlin.ResultKt.m(r8)     // Catch: java.lang.Throwable -> L17
                r6 = 7
                goto L42
            L17:
                r8 = move-exception
                goto L4f
            L19:
                java.lang.IllegalStateException r7 = new java.lang.IllegalStateException
                java.lang.String r8 = "call to 'resume' before 'invoke' with coroutine"
                r7.<init>(r8)
                throw r7
            L21:
                r6 = 1
                kotlin.ResultKt.m(r8)
                java.lang.Object r8 = r7.f315395b
                r6 = 5
                kotlinx.coroutines.s0 r8 = (kotlinx.coroutines.s0) r8
                kotlinx.coroutines.flow.i<T> r1 = r7.f315396c     // Catch: java.lang.Throwable -> L49
                kotlinx.coroutines.rx2.p$d$a r3 = new kotlinx.coroutines.rx2.p$d$a     // Catch: java.lang.Throwable -> L49
                io.reactivex.d0<T> r4 = r7.f315397d     // Catch: java.lang.Throwable -> L49
                r3.<init>(r4)     // Catch: java.lang.Throwable -> L49
                r7.f315395b = r8     // Catch: java.lang.Throwable -> L49
                r7.f315394a = r2     // Catch: java.lang.Throwable -> L49
                r6 = 6
                java.lang.Object r1 = r1.collect(r3, r7)     // Catch: java.lang.Throwable -> L49
                r6 = 7
                if (r1 != r0) goto L41
                r6 = 0
                return r0
            L41:
                r0 = r8
            L42:
                io.reactivex.d0<T> r8 = r7.f315397d     // Catch: java.lang.Throwable -> L17
                r8.onComplete()     // Catch: java.lang.Throwable -> L17
                r6 = 2
                goto L6e
            L49:
                r0 = move-exception
                r5 = r0
                r0 = r8
                r0 = r8
                r8 = r5
                r8 = r5
            L4f:
                r6 = 4
                boolean r1 = r8 instanceof java.util.concurrent.CancellationException
                r6 = 3
                if (r1 != 0) goto L67
                io.reactivex.d0<T> r7 = r7.f315397d
                boolean r7 = r7.a(r8)
                if (r7 != 0) goto L6e
                r6 = 5
                kotlin.coroutines.CoroutineContext r7 = r0.getCoroutineContext()
                r6 = 3
                kotlinx.coroutines.rx2.j.a(r8, r7)
                goto L6e
            L67:
                r6 = 5
                io.reactivex.d0<T> r7 = r7.f315397d
                r6 = 1
                r7.onComplete()
            L6e:
                kotlin.Unit r7 = kotlin.Unit.f312394a
                r6 = 2
                return r7
            */
            throw new UnsupportedOperationException("Method not decompiled: kotlinx.coroutines.rx2.p.d.invokeSuspend(java.lang.Object):java.lang.Object");
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(s0 s0Var, kotlin.coroutines.d<? super Unit> dVar) {
            return ((d) create(s0Var, dVar)).invokeSuspend(Unit.f312394a);
        }
    }

    @kotlin.coroutines.jvm.internal.f(c = "kotlinx.coroutines.rx2.RxConvertKt$asObservable$2", f = "RxConvert.kt", i = {0, 1}, l = {144, 145}, m = "invokeSuspend", n = {"$this$rxObservable", "$this$rxObservable"}, s = {"L$0", "L$0"})
    static final class e extends kotlin.coroutines.jvm.internal.o implements Function2<l0<Object>, kotlin.coroutines.d<? super Unit>, Object> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        Object f315399a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        int f315400b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private /* synthetic */ Object f315401c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        final /* synthetic */ n0<Object> f315402d;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        e(n0<Object> n0Var, kotlin.coroutines.d<? super e> dVar) {
            super(2, dVar);
            this.f315402d = n0Var;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final kotlin.coroutines.d<Unit> create(Object obj, kotlin.coroutines.d<?> dVar) {
            e eVar = new e(this.f315402d, dVar);
            eVar.f315401c = obj;
            return eVar;
        }

        /* JADX WARN: Code duplicated, block: B:16:0x0053  */
        /* JADX WARN: Code duplicated, block: B:19:0x0061  */
        /* JADX WARN: Code duplicated, block: B:22:0x0074  */
        /* JADX WARN: Code restructure failed: missing block: B:20:0x0071, code lost:
        
            if (r4.G(r8, r7) == r0) goto L21;
         */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:20:0x0071 -> B:8:0x001c). Please report as a decompilation issue!!! */
        @Override // kotlin.coroutines.jvm.internal.a
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public final java.lang.Object invokeSuspend(java.lang.Object r8) {
            /*
                r7 = this;
                r6 = 5
                java.lang.Object r0 = kotlin.coroutines.intrinsics.b.l()
                int r1 = r7.f315400b
                r2 = 2
                r3 = 1
                if (r1 == 0) goto L34
                r6 = 6
                if (r1 == r3) goto L28
                if (r1 != r2) goto L1f
                r6 = 5
                java.lang.Object r1 = r7.f315399a
                kotlinx.coroutines.channels.r r1 = (kotlinx.coroutines.channels.r) r1
                java.lang.Object r4 = r7.f315401c
                kotlinx.coroutines.channels.l0 r4 = (kotlinx.coroutines.channels.l0) r4
                kotlin.ResultKt.m(r8)
            L1c:
                r8 = r4
                r6 = 4
                goto L43
            L1f:
                java.lang.IllegalStateException r7 = new java.lang.IllegalStateException
                java.lang.String r8 = "call to 'resume' before 'invoke' with coroutine"
                r7.<init>(r8)
                r6 = 6
                throw r7
            L28:
                java.lang.Object r1 = r7.f315399a
                kotlinx.coroutines.channels.r r1 = (kotlinx.coroutines.channels.r) r1
                java.lang.Object r4 = r7.f315401c
                kotlinx.coroutines.channels.l0 r4 = (kotlinx.coroutines.channels.l0) r4
                kotlin.ResultKt.m(r8)
                goto L57
            L34:
                kotlin.ResultKt.m(r8)
                r6 = 3
                java.lang.Object r8 = r7.f315401c
                kotlinx.coroutines.channels.l0 r8 = (kotlinx.coroutines.channels.l0) r8
                kotlinx.coroutines.channels.n0<java.lang.Object> r1 = r7.f315402d
                r6 = 2
                kotlinx.coroutines.channels.r r1 = r1.iterator()
            L43:
                r7.f315401c = r8
                r6 = 3
                r7.f315399a = r1
                r6 = 2
                r7.f315400b = r3
                java.lang.Object r4 = r1.c(r7)
                r6 = 5
                if (r4 != r0) goto L53
                goto L73
            L53:
                r5 = r4
                r5 = r4
                r4 = r8
                r8 = r5
            L57:
                r6 = 3
                java.lang.Boolean r8 = (java.lang.Boolean) r8
                boolean r8 = r8.booleanValue()
                r6 = 5
                if (r8 == 0) goto L74
                r6 = 2
                java.lang.Object r8 = r1.next()
                r6 = 7
                r7.f315401c = r4
                r7.f315399a = r1
                r7.f315400b = r2
                java.lang.Object r8 = r4.G(r8, r7)
                if (r8 != r0) goto L1c
            L73:
                return r0
            L74:
                kotlin.Unit r7 = kotlin.Unit.f312394a
                r6 = 4
                return r7
            */
            throw new UnsupportedOperationException("Method not decompiled: kotlinx.coroutines.rx2.p.e.invokeSuspend(java.lang.Object):java.lang.Object");
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(l0<Object> l0Var, kotlin.coroutines.d<? super Unit> dVar) {
            return ((e) create(l0Var, dVar)).invokeSuspend(Unit.f312394a);
        }
    }

    /* JADX INFO: Add missing generic type declarations: [T] */
    @kotlin.coroutines.jvm.internal.f(c = "kotlinx.coroutines.rx2.RxConvertKt$asSingle$1", f = "RxConvert.kt", i = {}, l = {com.planner5d.library.engine.input.f.b.f160710n}, m = "invokeSuspend", n = {}, s = {})
    static final class f<T> extends kotlin.coroutines.jvm.internal.o implements Function2<s0, kotlin.coroutines.d<? super T>, Object> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        int f315403a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ a1<T> f315404b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        f(a1<? extends T> a1Var, kotlin.coroutines.d<? super f> dVar) {
            super(2, dVar);
            this.f315404b = a1Var;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final kotlin.coroutines.d<Unit> create(Object obj, kotlin.coroutines.d<?> dVar) {
            return new f(this.f315404b, dVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            Object objL = kotlin.coroutines.intrinsics.b.l();
            int i10 = this.f315403a;
            if (i10 != 0) {
                if (i10 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.m(obj);
                return obj;
            }
            ResultKt.m(obj);
            a1<T> a1Var = this.f315404b;
            this.f315403a = 1;
            Object objQ = a1Var.q(this);
            return objQ == objL ? objL : objQ;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(s0 s0Var, kotlin.coroutines.d<? super T> dVar) {
            return ((f) create(s0Var, dVar)).invokeSuspend(Unit.f312394a);
        }
    }

    @NotNull
    public static final io.reactivex.c b(@NotNull p2 p2Var, @NotNull CoroutineContext coroutineContext) {
        return n.b(coroutineContext, new a(p2Var, null));
    }

    @NotNull
    public static final <T> kotlinx.coroutines.flow.i<T> c(@NotNull io.reactivex.g0<T> g0Var) {
        return kotlinx.coroutines.flow.k.t(new b(g0Var, null));
    }

    @NotNull
    public static final <T> io.reactivex.l<T> d(@NotNull kotlinx.coroutines.flow.i<? extends T> iVar, @NotNull CoroutineContext coroutineContext) {
        return io.reactivex.l.Y2(kotlinx.coroutines.reactive.o.c(iVar, coroutineContext));
    }

    public static /* synthetic */ io.reactivex.l e(kotlinx.coroutines.flow.i iVar, CoroutineContext coroutineContext, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            coroutineContext = kotlin.coroutines.h.f312451a;
        }
        return d(iVar, coroutineContext);
    }

    @NotNull
    public static final <T> io.reactivex.s<T> f(@NotNull a1<? extends T> a1Var, @NotNull CoroutineContext coroutineContext) {
        return u.b(coroutineContext, new c(a1Var, null));
    }

    @NotNull
    public static final <T> io.reactivex.b0<T> h(@NotNull final kotlinx.coroutines.flow.i<? extends T> iVar, @NotNull final CoroutineContext coroutineContext) {
        return io.reactivex.b0.q1(new io.reactivex.e0() { // from class: kotlinx.coroutines.rx2.o
            @Override // io.reactivex.e0
            public final void a(io.reactivex.d0 d0Var) {
                p.j(coroutineContext, iVar, d0Var);
            }
        });
    }

    public static /* synthetic */ io.reactivex.b0 i(kotlinx.coroutines.flow.i iVar, CoroutineContext coroutineContext, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            coroutineContext = kotlin.coroutines.h.f312451a;
        }
        return h(iVar, coroutineContext);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void j(CoroutineContext coroutineContext, kotlinx.coroutines.flow.i iVar, io.reactivex.d0 d0Var) {
        d0Var.c(new i(kotlinx.coroutines.i.d(f2.f314023a, l1.g().plus(coroutineContext), u0.ATOMIC, new d(iVar, d0Var, null))));
    }

    @NotNull
    public static final <T> k0<T> k(@NotNull a1<? extends T> a1Var, @NotNull CoroutineContext coroutineContext) {
        return d0.b(coroutineContext, new f(a1Var, null));
    }

    public static /* synthetic */ io.reactivex.l p(kotlinx.coroutines.flow.i iVar, CoroutineContext coroutineContext, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            coroutineContext = kotlin.coroutines.h.f312451a;
        }
        return d(iVar, coroutineContext);
    }

    public static /* synthetic */ io.reactivex.b0 q(kotlinx.coroutines.flow.i iVar, CoroutineContext coroutineContext, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            coroutineContext = kotlin.coroutines.h.f312451a;
        }
        return h(iVar, coroutineContext);
    }
}
