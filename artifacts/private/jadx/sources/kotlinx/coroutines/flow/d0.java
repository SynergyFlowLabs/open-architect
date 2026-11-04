package kotlinx.coroutines.flow;

import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.CoroutineContext;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes11.dex */
@SourceDebugExtension({"SMAP\nMigration.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Migration.kt\nkotlinx/coroutines/flow/FlowKt__MigrationKt\n+ 2 Merge.kt\nkotlinx/coroutines/flow/FlowKt__MergeKt\n*L\n1#1,492:1\n189#2:493\n*S KotlinDebug\n*F\n+ 1 Migration.kt\nkotlinx/coroutines/flow/FlowKt__MigrationKt\n*L\n431#1:493\n*E\n"})
final /* synthetic */ class d0 {

    /* JADX INFO: Add missing generic type declarations: [T] */
    @kotlin.coroutines.jvm.internal.f(c = "kotlinx.coroutines.flow.FlowKt__MigrationKt$delayEach$1", f = "Migration.kt", i = {}, l = {androidx.constraintlayout.core.motion.utils.v.c.f44020u}, m = "invokeSuspend", n = {}, s = {})
    static final class a<T> extends kotlin.coroutines.jvm.internal.o implements Function2<T, kotlin.coroutines.d<? super Unit>, Object> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        int f314103a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ long f314104b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        a(long j10, kotlin.coroutines.d<? super a> dVar) {
            super(2, dVar);
            this.f314104b = j10;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final kotlin.coroutines.d<Unit> create(Object obj, kotlin.coroutines.d<?> dVar) {
            return new a(this.f314104b, dVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            Object objL = kotlin.coroutines.intrinsics.b.l();
            int i10 = this.f314103a;
            if (i10 == 0) {
                ResultKt.m(obj);
                long j10 = this.f314104b;
                this.f314103a = 1;
                if (kotlinx.coroutines.d1.b(j10, this) == objL) {
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
        public final Object invoke(T t10, kotlin.coroutines.d<? super Unit> dVar) {
            return ((a) create(t10, dVar)).invokeSuspend(Unit.f312394a);
        }
    }

    /* JADX INFO: Add missing generic type declarations: [T] */
    @kotlin.coroutines.jvm.internal.f(c = "kotlinx.coroutines.flow.FlowKt__MigrationKt$delayFlow$1", f = "Migration.kt", i = {}, l = {411}, m = "invokeSuspend", n = {}, s = {})
    static final class b<T> extends kotlin.coroutines.jvm.internal.o implements Function2<j<? super T>, kotlin.coroutines.d<? super Unit>, Object> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        int f314105a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ long f314106b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        b(long j10, kotlin.coroutines.d<? super b> dVar) {
            super(2, dVar);
            this.f314106b = j10;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final kotlin.coroutines.d<Unit> create(Object obj, kotlin.coroutines.d<?> dVar) {
            return new b(this.f314106b, dVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            Object objL = kotlin.coroutines.intrinsics.b.l();
            int i10 = this.f314105a;
            if (i10 == 0) {
                ResultKt.m(obj);
                long j10 = this.f314106b;
                this.f314105a = 1;
                if (kotlinx.coroutines.d1.b(j10, this) == objL) {
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
        public final Object invoke(j<? super T> jVar, kotlin.coroutines.d<? super Unit> dVar) {
            return ((b) create(jVar, dVar)).invokeSuspend(Unit.f312394a);
        }
    }

    /* JADX INFO: Add missing generic type declarations: [T] */
    @kotlin.coroutines.jvm.internal.f(c = "kotlinx.coroutines.flow.FlowKt__MigrationKt$onErrorReturn$2", f = "Migration.kt", i = {}, l = {302}, m = "invokeSuspend", n = {}, s = {})
    static final class c<T> extends kotlin.coroutines.jvm.internal.o implements pj.n<j<? super T>, Throwable, kotlin.coroutines.d<? super Unit>, Object> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        int f314107a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private /* synthetic */ Object f314108b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        /* synthetic */ Object f314109c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        final /* synthetic */ Function1<Throwable, Boolean> f314110d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        final /* synthetic */ T f314111e;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        c(Function1<? super Throwable, Boolean> function1, T t10, kotlin.coroutines.d<? super c> dVar) {
            super(3, dVar);
            this.f314110d = function1;
            this.f314111e = t10;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) throws Throwable {
            Object objL = kotlin.coroutines.intrinsics.b.l();
            int i10 = this.f314107a;
            if (i10 == 0) {
                ResultKt.m(obj);
                j jVar = (j) this.f314108b;
                Throwable th2 = (Throwable) this.f314109c;
                if (!this.f314110d.invoke(th2).booleanValue()) {
                    throw th2;
                }
                T t10 = this.f314111e;
                this.f314108b = null;
                this.f314107a = 1;
                if (jVar.emit(t10, this) == objL) {
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

        @Override // pj.n
        /* JADX INFO: renamed from: k, reason: merged with bridge method [inline-methods] */
        public final Object invoke(j<? super T> jVar, Throwable th2, kotlin.coroutines.d<? super Unit> dVar) {
            c cVar = new c(this.f314110d, this.f314111e, dVar);
            cVar.f314108b = jVar;
            cVar.f314109c = th2;
            return cVar.invokeSuspend(Unit.f312394a);
        }
    }

    /* JADX INFO: Add missing generic type declarations: [R, T] */
    @kotlin.coroutines.jvm.internal.f(c = "kotlinx.coroutines.flow.FlowKt__MigrationKt$switchMap$$inlined$flatMapLatest$1", f = "Migration.kt", i = {}, l = {189, 189}, m = "invokeSuspend", n = {}, s = {})
    public static final class d<R, T> extends kotlin.coroutines.jvm.internal.o implements pj.n<j<? super R>, T, kotlin.coroutines.d<? super Unit>, Object> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        int f314112a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private /* synthetic */ Object f314113b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        /* synthetic */ Object f314114c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        final /* synthetic */ Function2 f314115d;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public d(Function2 function2, kotlin.coroutines.d dVar) {
            super(3, dVar);
            this.f314115d = function2;
        }

        /* JADX WARN: Code restructure failed: missing block: B:14:0x004c, code lost:
        
            if (kotlinx.coroutines.flow.k.o0(r1, (kotlinx.coroutines.flow.i) r7, r6) == r0) goto L15;
         */
        @Override // kotlin.coroutines.jvm.internal.a
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public final java.lang.Object invokeSuspend(java.lang.Object r7) {
            /*
                r6 = this;
                r5 = 5
                java.lang.Object r0 = kotlin.coroutines.intrinsics.b.l()
                int r1 = r6.f314112a
                r2 = 2
                r3 = 1
                if (r1 == 0) goto L25
                if (r1 == r3) goto L1d
                if (r1 != r2) goto L13
                kotlin.ResultKt.m(r7)
                goto L4f
            L13:
                java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
                java.lang.String r7 = "wes /koivri/bn/et  om rttsu //eeaf cnuhlloi///eoecr"
                java.lang.String r7 = "call to 'resume' before 'invoke' with coroutine"
                r6.<init>(r7)
                throw r6
            L1d:
                java.lang.Object r1 = r6.f314113b
                kotlinx.coroutines.flow.j r1 = (kotlinx.coroutines.flow.j) r1
                kotlin.ResultKt.m(r7)
                goto L3e
            L25:
                kotlin.ResultKt.m(r7)
                r5 = 2
                java.lang.Object r7 = r6.f314113b
                r1 = r7
                kotlinx.coroutines.flow.j r1 = (kotlinx.coroutines.flow.j) r1
                java.lang.Object r7 = r6.f314114c
                kotlin.jvm.functions.Function2 r4 = r6.f314115d
                r6.f314113b = r1
                r5 = 1
                r6.f314112a = r3
                java.lang.Object r7 = r4.invoke(r7, r6)
                if (r7 != r0) goto L3e
                goto L4e
            L3e:
                kotlinx.coroutines.flow.i r7 = (kotlinx.coroutines.flow.i) r7
                r5 = 2
                r3 = 0
                r6.f314113b = r3
                r5 = 7
                r6.f314112a = r2
                java.lang.Object r6 = kotlinx.coroutines.flow.k.o0(r1, r7, r6)
                r5 = 7
                if (r6 != r0) goto L4f
            L4e:
                return r0
            L4f:
                kotlin.Unit r6 = kotlin.Unit.f312394a
                return r6
            */
            throw new UnsupportedOperationException("Method not decompiled: kotlinx.coroutines.flow.d0.d.invokeSuspend(java.lang.Object):java.lang.Object");
        }

        @Override // pj.n
        public final Object invoke(j<? super R> jVar, T t10, kotlin.coroutines.d<? super Unit> dVar) {
            d dVar2 = new d(this.f314115d, dVar);
            dVar2.f314113b = jVar;
            dVar2.f314114c = t10;
            return dVar2.invokeSuspend(Unit.f312394a);
        }
    }

    @kotlin.l(level = kotlin.n.ERROR, message = "Collect flow in the desired context instead")
    @NotNull
    public static final <T> i<T> A(@NotNull i<? extends T> iVar, @NotNull CoroutineContext coroutineContext) {
        k.d1();
        throw new kotlin.a0();
    }

    @kotlin.l(level = kotlin.n.ERROR, message = "Flow analogue of 'replay()' is 'shareIn' with unlimited replay. \nreplay().connect() is the default strategy (no extra call is needed), \nreplay().autoConnect() translates to 'started = SharingStarted.Lazily' argument, \nreplay().refCount() translates to 'started = SharingStarted.WhileSubscribed()' argument.", replaceWith = @kotlin.b1(expression = "this.shareIn(scope, Int.MAX_VALUE)", imports = {}))
    @NotNull
    public static final <T> i<T> B(@NotNull i<? extends T> iVar) {
        k.d1();
        throw new kotlin.a0();
    }

    @kotlin.l(level = kotlin.n.ERROR, message = "Flow analogue of 'replay(bufferSize)' is 'shareIn' with the specified replay parameter. \nreplay().connect() is the default strategy (no extra call is needed), \nreplay().autoConnect() translates to 'started = SharingStarted.Lazily' argument, \nreplay().refCount() translates to 'started = SharingStarted.WhileSubscribed()' argument.", replaceWith = @kotlin.b1(expression = "this.shareIn(scope, bufferSize)", imports = {}))
    @NotNull
    public static final <T> i<T> C(@NotNull i<? extends T> iVar, int i10) {
        k.d1();
        throw new kotlin.a0();
    }

    @kotlin.l(level = kotlin.n.ERROR, message = "Flow has less verbose 'scan' shortcut", replaceWith = @kotlin.b1(expression = "scan(initial, operation)", imports = {}))
    @NotNull
    public static final <T, R> i<R> D(@NotNull i<? extends T> iVar, R r10, @kotlin.b @NotNull pj.n<? super R, ? super T, ? super kotlin.coroutines.d<? super R>, ? extends Object> nVar) {
        k.d1();
        throw new kotlin.a0();
    }

    @kotlin.l(level = kotlin.n.ERROR, message = "'scanReduce' was renamed to 'runningReduce' to be consistent with Kotlin standard library", replaceWith = @kotlin.b1(expression = "runningReduce(operation)", imports = {}))
    @NotNull
    public static final <T> i<T> E(@NotNull i<? extends T> iVar, @NotNull pj.n<? super T, ? super T, ? super kotlin.coroutines.d<? super T>, ? extends Object> nVar) {
        return k.C1(iVar, nVar);
    }

    @kotlin.l(level = kotlin.n.ERROR, message = "Flow analogue of 'skip' is 'drop'", replaceWith = @kotlin.b1(expression = "drop(count)", imports = {}))
    @NotNull
    public static final <T> i<T> F(@NotNull i<? extends T> iVar, int i10) {
        k.d1();
        throw new kotlin.a0();
    }

    @kotlin.l(level = kotlin.n.ERROR, message = "Flow analogue of 'startWith' is 'onStart'. Use 'onStart { emit(value) }'", replaceWith = @kotlin.b1(expression = "onStart { emit(value) }", imports = {}))
    @NotNull
    public static final <T> i<T> G(@NotNull i<? extends T> iVar, T t10) {
        k.d1();
        throw new kotlin.a0();
    }

    @kotlin.l(level = kotlin.n.ERROR, message = "Flow analogue of 'startWith' is 'onStart'. Use 'onStart { emitAll(other) }'", replaceWith = @kotlin.b1(expression = "onStart { emitAll(other) }", imports = {}))
    @NotNull
    public static final <T> i<T> H(@NotNull i<? extends T> iVar, @NotNull i<? extends T> iVar2) {
        k.d1();
        throw new kotlin.a0();
    }

    @kotlin.l(level = kotlin.n.ERROR, message = "Use 'launchIn' with 'onEach', 'onCompletion' and 'catch' instead")
    public static final <T> void I(@NotNull i<? extends T> iVar) {
        k.d1();
        throw new kotlin.a0();
    }

    @kotlin.l(level = kotlin.n.ERROR, message = "Use 'launchIn' with 'onEach', 'onCompletion' and 'catch' instead")
    public static final <T> void J(@NotNull i<? extends T> iVar, @NotNull Function2<? super T, ? super kotlin.coroutines.d<? super Unit>, ? extends Object> function2) {
        k.d1();
        throw new kotlin.a0();
    }

    @kotlin.l(level = kotlin.n.ERROR, message = "Use 'launchIn' with 'onEach', 'onCompletion' and 'catch' instead")
    public static final <T> void K(@NotNull i<? extends T> iVar, @NotNull Function2<? super T, ? super kotlin.coroutines.d<? super Unit>, ? extends Object> function2, @NotNull Function2<? super Throwable, ? super kotlin.coroutines.d<? super Unit>, ? extends Object> function3) {
        k.d1();
        throw new kotlin.a0();
    }

    @kotlin.l(level = kotlin.n.ERROR, message = "Use 'flowOn' instead")
    @NotNull
    public static final <T> i<T> L(@NotNull i<? extends T> iVar, @NotNull CoroutineContext coroutineContext) {
        k.d1();
        throw new kotlin.a0();
    }

    @kotlin.l(level = kotlin.n.ERROR, message = "Flow analogues of 'switchMap' are 'transformLatest', 'flatMapLatest' and 'mapLatest'", replaceWith = @kotlin.b1(expression = "this.flatMapLatest(transform)", imports = {}))
    @NotNull
    public static final <T, R> i<R> M(@NotNull i<? extends T> iVar, @NotNull Function2<? super T, ? super kotlin.coroutines.d<? super i<? extends R>>, ? extends Object> function2) {
        return k.f2(iVar, new d(function2, null));
    }

    @kotlin.l(level = kotlin.n.ERROR, message = "Flow analogue of 'cache()' is 'shareIn' with unlimited replay and 'started = SharingStarted.Lazily' argument'", replaceWith = @kotlin.b1(expression = "this.shareIn(scope, started = SharingStarted.Lazily, replay = Int.MAX_VALUE)", imports = {}))
    @NotNull
    public static final <T> i<T> b(@NotNull i<? extends T> iVar) {
        k.d1();
        throw new kotlin.a0();
    }

    @kotlin.l(level = kotlin.n.ERROR, message = "Flow analogue of 'combineLatest' is 'combine'", replaceWith = @kotlin.b1(expression = "combine(this, other, other2, other3, transform)", imports = {}))
    @NotNull
    public static final <T1, T2, T3, T4, T5, R> i<R> c(@NotNull i<? extends T1> iVar, @NotNull i<? extends T2> iVar2, @NotNull i<? extends T3> iVar3, @NotNull i<? extends T4> iVar4, @NotNull i<? extends T5> iVar5, @NotNull pj.q<? super T1, ? super T2, ? super T3, ? super T4, ? super T5, ? super kotlin.coroutines.d<? super R>, ? extends Object> qVar) {
        return k.F(iVar, iVar2, iVar3, iVar4, iVar5, qVar);
    }

    @kotlin.l(level = kotlin.n.ERROR, message = "Flow analogue of 'combineLatest' is 'combine'", replaceWith = @kotlin.b1(expression = "combine(this, other, other2, other3, transform)", imports = {}))
    @NotNull
    public static final <T1, T2, T3, T4, R> i<R> d(@NotNull i<? extends T1> iVar, @NotNull i<? extends T2> iVar2, @NotNull i<? extends T3> iVar3, @NotNull i<? extends T4> iVar4, @NotNull pj.p<? super T1, ? super T2, ? super T3, ? super T4, ? super kotlin.coroutines.d<? super R>, ? extends Object> pVar) {
        return k.G(iVar, iVar2, iVar3, iVar4, pVar);
    }

    @kotlin.l(level = kotlin.n.ERROR, message = "Flow analogue of 'combineLatest' is 'combine'", replaceWith = @kotlin.b1(expression = "combine(this, other, other2, transform)", imports = {}))
    @NotNull
    public static final <T1, T2, T3, R> i<R> e(@NotNull i<? extends T1> iVar, @NotNull i<? extends T2> iVar2, @NotNull i<? extends T3> iVar3, @NotNull pj.o<? super T1, ? super T2, ? super T3, ? super kotlin.coroutines.d<? super R>, ? extends Object> oVar) {
        return k.H(iVar, iVar2, iVar3, oVar);
    }

    @kotlin.l(level = kotlin.n.ERROR, message = "Flow analogue of 'combineLatest' is 'combine'", replaceWith = @kotlin.b1(expression = "this.combine(other, transform)", imports = {}))
    @NotNull
    public static final <T1, T2, R> i<R> f(@NotNull i<? extends T1> iVar, @NotNull i<? extends T2> iVar2, @NotNull pj.n<? super T1, ? super T2, ? super kotlin.coroutines.d<? super R>, ? extends Object> nVar) {
        return k.I(iVar, iVar2, nVar);
    }

    @kotlin.l(level = kotlin.n.ERROR, message = "Flow analogue of 'compose' is 'let'", replaceWith = @kotlin.b1(expression = "let(transformer)", imports = {}))
    @NotNull
    public static final <T, R> i<R> g(@NotNull i<? extends T> iVar, @NotNull Function1<? super i<? extends T>, ? extends i<? extends R>> function1) {
        k.d1();
        throw new kotlin.a0();
    }

    @kotlin.l(level = kotlin.n.ERROR, message = "Flow analogue of 'concatMap' is 'flatMapConcat'", replaceWith = @kotlin.b1(expression = "flatMapConcat(mapper)", imports = {}))
    @NotNull
    public static final <T, R> i<R> h(@NotNull i<? extends T> iVar, @NotNull Function1<? super T, ? extends i<? extends R>> function1) {
        k.d1();
        throw new kotlin.a0();
    }

    @kotlin.l(level = kotlin.n.ERROR, message = "Flow analogue of 'concatWith' is 'onCompletion'. Use 'onCompletion { emit(value) }'", replaceWith = @kotlin.b1(expression = "onCompletion { emit(value) }", imports = {}))
    @NotNull
    public static final <T> i<T> i(@NotNull i<? extends T> iVar, T t10) {
        k.d1();
        throw new kotlin.a0();
    }

    @kotlin.l(level = kotlin.n.ERROR, message = "Flow analogue of 'concatWith' is 'onCompletion'. Use 'onCompletion { if (it == null) emitAll(other) }'", replaceWith = @kotlin.b1(expression = "onCompletion { if (it == null) emitAll(other) }", imports = {}))
    @NotNull
    public static final <T> i<T> j(@NotNull i<? extends T> iVar, @NotNull i<? extends T> iVar2) {
        k.d1();
        throw new kotlin.a0();
    }

    @kotlin.l(level = kotlin.n.ERROR, message = "Use 'onEach { delay(timeMillis) }'", replaceWith = @kotlin.b1(expression = "onEach { delay(timeMillis) }", imports = {}))
    @NotNull
    public static final <T> i<T> k(@NotNull i<? extends T> iVar, long j10) {
        return k.h1(iVar, new a(j10, null));
    }

    @kotlin.l(level = kotlin.n.ERROR, message = "Use 'onStart { delay(timeMillis) }'", replaceWith = @kotlin.b1(expression = "onStart { delay(timeMillis) }", imports = {}))
    @NotNull
    public static final <T> i<T> l(@NotNull i<? extends T> iVar, long j10) {
        return k.o1(iVar, new b(j10, null));
    }

    @kotlin.l(level = kotlin.n.ERROR, message = "Flow analogue is 'flatMapConcat'", replaceWith = @kotlin.b1(expression = "flatMapConcat(mapper)", imports = {}))
    @NotNull
    public static final <T, R> i<R> m(@NotNull i<? extends T> iVar, @NotNull Function2<? super T, ? super kotlin.coroutines.d<? super i<? extends R>>, ? extends Object> function2) {
        k.d1();
        throw new kotlin.a0();
    }

    @kotlin.l(level = kotlin.n.ERROR, message = "Flow analogue of 'flatten' is 'flattenConcat'", replaceWith = @kotlin.b1(expression = "flattenConcat()", imports = {}))
    @NotNull
    public static final <T> i<T> n(@NotNull i<? extends i<? extends T>> iVar) {
        k.d1();
        throw new kotlin.a0();
    }

    @kotlin.l(level = kotlin.n.ERROR, message = "Flow analogue of 'forEach' is 'collect'", replaceWith = @kotlin.b1(expression = "collect(action)", imports = {}))
    public static final <T> void o(@NotNull i<? extends T> iVar, @NotNull Function2<? super T, ? super kotlin.coroutines.d<? super Unit>, ? extends Object> function2) {
        k.d1();
        throw new kotlin.a0();
    }

    @kotlin.l(level = kotlin.n.ERROR, message = "Flow analogue of 'merge' is 'flattenConcat'", replaceWith = @kotlin.b1(expression = "flattenConcat()", imports = {}))
    @NotNull
    public static final <T> i<T> p(@NotNull i<? extends i<? extends T>> iVar) {
        k.d1();
        throw new kotlin.a0();
    }

    @NotNull
    public static final Void q() {
        throw new UnsupportedOperationException("Not implemented, should not be called");
    }

    @kotlin.l(level = kotlin.n.ERROR, message = "Collect flow in the desired context instead")
    @NotNull
    public static final <T> i<T> r(@NotNull i<? extends T> iVar, @NotNull CoroutineContext coroutineContext) {
        k.d1();
        throw new kotlin.a0();
    }

    @kotlin.l(level = kotlin.n.ERROR, message = "Flow analogue of 'onErrorXxx' is 'catch'. Use 'catch { emitAll(fallback) }'", replaceWith = @kotlin.b1(expression = "catch { emitAll(fallback) }", imports = {}))
    @NotNull
    public static final <T> i<T> s(@NotNull i<? extends T> iVar, @NotNull i<? extends T> iVar2) {
        k.d1();
        throw new kotlin.a0();
    }

    @kotlin.l(level = kotlin.n.ERROR, message = "Flow analogue of 'onErrorXxx' is 'catch'. Use 'catch { emitAll(fallback) }'", replaceWith = @kotlin.b1(expression = "catch { emitAll(fallback) }", imports = {}))
    @NotNull
    public static final <T> i<T> t(@NotNull i<? extends T> iVar, @NotNull i<? extends T> iVar2) {
        k.d1();
        throw new kotlin.a0();
    }

    @kotlin.l(level = kotlin.n.ERROR, message = "Flow analogue of 'onErrorXxx' is 'catch'. Use 'catch { emit(fallback) }'", replaceWith = @kotlin.b1(expression = "catch { emit(fallback) }", imports = {}))
    @NotNull
    public static final <T> i<T> u(@NotNull i<? extends T> iVar, T t10) {
        k.d1();
        throw new kotlin.a0();
    }

    @kotlin.l(level = kotlin.n.ERROR, message = "Flow analogue of 'onErrorXxx' is 'catch'. Use 'catch { e -> if (predicate(e)) emit(fallback) else throw e }'", replaceWith = @kotlin.b1(expression = "catch { e -> if (predicate(e)) emit(fallback) else throw e }", imports = {}))
    @NotNull
    public static final <T> i<T> v(@NotNull i<? extends T> iVar, T t10, @NotNull Function1<? super Throwable, Boolean> function1) {
        return k.v(iVar, new c(function1, t10, null));
    }

    public static /* synthetic */ i w(i iVar, Object obj, Function1 function1, int i10, Object obj2) {
        if ((i10 & 2) != 0) {
            function1 = new Function1() { // from class: kotlinx.coroutines.flow.c0
                @Override // kotlin.jvm.functions.Function1
                public final Object invoke(Object obj3) {
                    return Boolean.valueOf(d0.x((Throwable) obj3));
                }
            };
        }
        return k.m1(iVar, obj, function1);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean x(Throwable th2) {
        return true;
    }

    @kotlin.l(level = kotlin.n.ERROR, message = "Flow analogue of 'publish()' is 'shareIn'. \npublish().connect() is the default strategy (no extra call is needed), \npublish().autoConnect() translates to 'started = SharingStarted.Lazily' argument, \npublish().refCount() translates to 'started = SharingStarted.WhileSubscribed()' argument.", replaceWith = @kotlin.b1(expression = "this.shareIn(scope, 0)", imports = {}))
    @NotNull
    public static final <T> i<T> y(@NotNull i<? extends T> iVar) {
        k.d1();
        throw new kotlin.a0();
    }

    @kotlin.l(level = kotlin.n.ERROR, message = "Flow analogue of 'publish(bufferSize)' is 'buffer' followed by 'shareIn'. \npublish().connect() is the default strategy (no extra call is needed), \npublish().autoConnect() translates to 'started = SharingStarted.Lazily' argument, \npublish().refCount() translates to 'started = SharingStarted.WhileSubscribed()' argument.", replaceWith = @kotlin.b1(expression = "this.buffer(bufferSize).shareIn(scope, 0)", imports = {}))
    @NotNull
    public static final <T> i<T> z(@NotNull i<? extends T> iVar, int i10) {
        k.d1();
        throw new kotlin.a0();
    }
}
