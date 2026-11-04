package androidx.room;

import android.os.CancellationSignal;
import java.util.Set;
import java.util.concurrent.Callable;
import kotlin.Result;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes3.dex */
@androidx.annotation.b1({androidx.annotation.b1.a.LIBRARY_GROUP_PREFIX})
public final class j {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    public static final a f74892a = new a(null);

    @SourceDebugExtension({"SMAP\nCoroutinesRoom.kt\nKotlin\n*S Kotlin\n*F\n+ 1 CoroutinesRoom.kt\nandroidx/room/CoroutinesRoom$Companion\n+ 2 CancellableContinuation.kt\nkotlinx/coroutines/CancellableContinuationKt\n*L\n1#1,162:1\n314#2,11:163\n*S KotlinDebug\n*F\n+ 1 CoroutinesRoom.kt\nandroidx/room/CoroutinesRoom$Companion\n*L\n84#1:163,11\n*E\n"})
    public static final class a {

        /* JADX INFO: Add missing generic type declarations: [R] */
        /* JADX INFO: renamed from: androidx.room.j$a$a, reason: collision with other inner class name */
        @kotlin.coroutines.jvm.internal.f(c = "androidx.room.CoroutinesRoom$Companion$createFlow$1", f = "CoroutinesRoom.kt", i = {}, l = {com.rabbitmq.client.impl.k.b.p.f265340a}, m = "invokeSuspend", n = {}, s = {})
        static final class C0741a<R> extends kotlin.coroutines.jvm.internal.o implements Function2<kotlinx.coroutines.flow.j<R>, kotlin.coroutines.d<? super Unit>, Object> {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            int f74893a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            private /* synthetic */ Object f74894b;

            /* JADX INFO: renamed from: c, reason: collision with root package name */
            final /* synthetic */ boolean f74895c;

            /* JADX INFO: renamed from: d, reason: collision with root package name */
            final /* synthetic */ b2 f74896d;

            /* JADX INFO: renamed from: e, reason: collision with root package name */
            final /* synthetic */ String[] f74897e;

            /* JADX INFO: renamed from: f, reason: collision with root package name */
            final /* synthetic */ Callable<R> f74898f;

            /* JADX INFO: renamed from: androidx.room.j$a$a$a, reason: collision with other inner class name */
            @kotlin.coroutines.jvm.internal.f(c = "androidx.room.CoroutinesRoom$Companion$createFlow$1$1", f = "CoroutinesRoom.kt", i = {}, l = {androidx.media2.widget.f.i.f59767c0}, m = "invokeSuspend", n = {}, s = {})
            static final class C0742a extends kotlin.coroutines.jvm.internal.o implements Function2<kotlinx.coroutines.s0, kotlin.coroutines.d<? super Unit>, Object> {

                /* JADX INFO: renamed from: a, reason: collision with root package name */
                int f74899a;

                /* JADX INFO: renamed from: b, reason: collision with root package name */
                private /* synthetic */ Object f74900b;

                /* JADX INFO: renamed from: c, reason: collision with root package name */
                final /* synthetic */ boolean f74901c;

                /* JADX INFO: renamed from: d, reason: collision with root package name */
                final /* synthetic */ b2 f74902d;

                /* JADX INFO: renamed from: e, reason: collision with root package name */
                final /* synthetic */ kotlinx.coroutines.flow.j<R> f74903e;

                /* JADX INFO: renamed from: f, reason: collision with root package name */
                final /* synthetic */ String[] f74904f;

                /* JADX INFO: renamed from: g, reason: collision with root package name */
                final /* synthetic */ Callable<R> f74905g;

                /* JADX INFO: renamed from: androidx.room.j$a$a$a$a, reason: collision with other inner class name */
                @kotlin.coroutines.jvm.internal.f(c = "androidx.room.CoroutinesRoom$Companion$createFlow$1$1$1", f = "CoroutinesRoom.kt", i = {}, l = {128, 130}, m = "invokeSuspend", n = {}, s = {})
                static final class C0743a extends kotlin.coroutines.jvm.internal.o implements Function2<kotlinx.coroutines.s0, kotlin.coroutines.d<? super Unit>, Object> {

                    /* JADX INFO: renamed from: a, reason: collision with root package name */
                    Object f74906a;

                    /* JADX INFO: renamed from: b, reason: collision with root package name */
                    int f74907b;

                    /* JADX INFO: renamed from: c, reason: collision with root package name */
                    final /* synthetic */ b2 f74908c;

                    /* JADX INFO: renamed from: d, reason: collision with root package name */
                    final /* synthetic */ b f74909d;

                    /* JADX INFO: renamed from: e, reason: collision with root package name */
                    final /* synthetic */ kotlinx.coroutines.channels.p<Unit> f74910e;

                    /* JADX INFO: renamed from: f, reason: collision with root package name */
                    final /* synthetic */ Callable<R> f74911f;

                    /* JADX INFO: renamed from: g, reason: collision with root package name */
                    final /* synthetic */ kotlinx.coroutines.channels.p<R> f74912g;

                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    C0743a(b2 b2Var, b bVar, kotlinx.coroutines.channels.p<Unit> pVar, Callable<R> callable, kotlinx.coroutines.channels.p<R> pVar2, kotlin.coroutines.d<? super C0743a> dVar) {
                        super(2, dVar);
                        this.f74908c = b2Var;
                        this.f74909d = bVar;
                        this.f74910e = pVar;
                        this.f74911f = callable;
                        this.f74912g = pVar2;
                    }

                    @Override // kotlin.coroutines.jvm.internal.a
                    @NotNull
                    public final kotlin.coroutines.d<Unit> create(@Nullable Object obj, @NotNull kotlin.coroutines.d<?> dVar) {
                        return new C0743a(this.f74908c, this.f74909d, this.f74910e, this.f74911f, this.f74912g, dVar);
                    }

                    /* JADX WARN: Code duplicated, block: B:20:0x0050  */
                    /* JADX WARN: Code duplicated, block: B:21:0x0052  */
                    /* JADX WARN: Code duplicated, block: B:24:0x005f A[Catch: all -> 0x001a, TRY_LEAVE, TryCatch #0 {all -> 0x001a, blocks: (B:7:0x0015, B:18:0x0046, B:22:0x0056, B:24:0x005f, B:14:0x002b, B:17:0x0040), top: B:31:0x000b }] */
                    /* JADX WARN: Code duplicated, block: B:27:0x0077  */
                    /* JADX WARN: Code restructure failed: missing block: B:25:0x0074, code lost:
                    
                        if (r4.G(r8, r7) == r0) goto L26;
                     */
                    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:25:0x0074 -> B:8:0x0018). Please report as a decompilation issue!!! */
                    @Override // kotlin.coroutines.jvm.internal.a
                    @org.jetbrains.annotations.Nullable
                    /*
                        Code decompiled incorrectly, please refer to instructions dump.
                        To view partially-correct add '--show-bad-code' argument
                    */
                    public final java.lang.Object invokeSuspend(@org.jetbrains.annotations.NotNull java.lang.Object r8) {
                        /*
                            r7 = this;
                            java.lang.Object r0 = kotlin.coroutines.intrinsics.b.l()
                            r6 = 5
                            int r1 = r7.f74907b
                            r2 = 2
                            r3 = 7
                            r3 = 1
                            r6 = 4
                            if (r1 == 0) goto L30
                            if (r1 == r3) goto L26
                            if (r1 != r2) goto L1c
                            java.lang.Object r1 = r7.f74906a
                            kotlinx.coroutines.channels.r r1 = (kotlinx.coroutines.channels.r) r1
                            kotlin.ResultKt.m(r8)     // Catch: java.lang.Throwable -> L1a
                        L18:
                            r8 = r1
                            goto L46
                        L1a:
                            r8 = move-exception
                            goto L89
                        L1c:
                            java.lang.IllegalStateException r7 = new java.lang.IllegalStateException
                            java.lang.String r8 = "e/s i /ouoeun h bee/rkmlei/o v/ctnlooseia/r t/cr/wf"
                            java.lang.String r8 = "call to 'resume' before 'invoke' with coroutine"
                            r7.<init>(r8)
                            throw r7
                        L26:
                            r6 = 3
                            java.lang.Object r1 = r7.f74906a
                            kotlinx.coroutines.channels.r r1 = (kotlinx.coroutines.channels.r) r1
                            r6 = 1
                            kotlin.ResultKt.m(r8)     // Catch: java.lang.Throwable -> L1a
                            goto L56
                        L30:
                            kotlin.ResultKt.m(r8)
                            r6 = 1
                            androidx.room.b2 r8 = r7.f74908c
                            androidx.room.l0 r8 = r8.getInvalidationTracker()
                            androidx.room.j$a$a$a$b r1 = r7.f74909d
                            r6 = 2
                            r8.c(r1)
                            kotlinx.coroutines.channels.p<kotlin.Unit> r8 = r7.f74910e     // Catch: java.lang.Throwable -> L1a
                            kotlinx.coroutines.channels.r r8 = r8.iterator()     // Catch: java.lang.Throwable -> L1a
                        L46:
                            r7.f74906a = r8     // Catch: java.lang.Throwable -> L1a
                            r7.f74907b = r3     // Catch: java.lang.Throwable -> L1a
                            java.lang.Object r1 = r8.c(r7)     // Catch: java.lang.Throwable -> L1a
                            if (r1 != r0) goto L52
                            r6 = 7
                            goto L76
                        L52:
                            r5 = r1
                            r1 = r8
                            r8 = r5
                            r8 = r5
                        L56:
                            java.lang.Boolean r8 = (java.lang.Boolean) r8     // Catch: java.lang.Throwable -> L1a
                            boolean r8 = r8.booleanValue()     // Catch: java.lang.Throwable -> L1a
                            r6 = 0
                            if (r8 == 0) goto L77
                            r1.next()     // Catch: java.lang.Throwable -> L1a
                            java.util.concurrent.Callable<R> r8 = r7.f74911f     // Catch: java.lang.Throwable -> L1a
                            java.lang.Object r8 = r8.call()     // Catch: java.lang.Throwable -> L1a
                            r6 = 6
                            kotlinx.coroutines.channels.p<R> r4 = r7.f74912g     // Catch: java.lang.Throwable -> L1a
                            r6 = 2
                            r7.f74906a = r1     // Catch: java.lang.Throwable -> L1a
                            r7.f74907b = r2     // Catch: java.lang.Throwable -> L1a
                            java.lang.Object r8 = r4.G(r8, r7)     // Catch: java.lang.Throwable -> L1a
                            if (r8 != r0) goto L18
                        L76:
                            return r0
                        L77:
                            androidx.room.b2 r8 = r7.f74908c
                            r6 = 4
                            androidx.room.l0 r8 = r8.getInvalidationTracker()
                            r6 = 7
                            androidx.room.j$a$a$a$b r7 = r7.f74909d
                            r6 = 7
                            r8.t(r7)
                            r6 = 2
                            kotlin.Unit r7 = kotlin.Unit.f312394a
                            return r7
                        L89:
                            r6 = 5
                            androidx.room.b2 r0 = r7.f74908c
                            androidx.room.l0 r0 = r0.getInvalidationTracker()
                            r6 = 7
                            androidx.room.j$a$a$a$b r7 = r7.f74909d
                            r0.t(r7)
                            r6 = 4
                            throw r8
                        */
                        throw new UnsupportedOperationException("Method not decompiled: androidx.room.j.a.C0741a.C0742a.C0743a.invokeSuspend(java.lang.Object):java.lang.Object");
                    }

                    @Override // kotlin.jvm.functions.Function2
                    @Nullable
                    public final Object invoke(@NotNull kotlinx.coroutines.s0 s0Var, @Nullable kotlin.coroutines.d<? super Unit> dVar) {
                        return ((C0743a) create(s0Var, dVar)).invokeSuspend(Unit.f312394a);
                    }
                }

                /* JADX INFO: renamed from: androidx.room.j$a$a$a$b */
                public static final class b extends l0.c {

                    /* JADX INFO: renamed from: b, reason: collision with root package name */
                    final /* synthetic */ kotlinx.coroutines.channels.p<Unit> f74913b;

                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    b(String[] strArr, kotlinx.coroutines.channels.p<Unit> pVar) {
                        super(strArr);
                        this.f74913b = pVar;
                    }

                    @Override // androidx.room.l0.c
                    public void c(@NotNull Set<String> set) {
                        this.f74913b.p(Unit.f312394a);
                    }
                }

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                C0742a(boolean z10, b2 b2Var, kotlinx.coroutines.flow.j<R> jVar, String[] strArr, Callable<R> callable, kotlin.coroutines.d<? super C0742a> dVar) {
                    super(2, dVar);
                    this.f74901c = z10;
                    this.f74902d = b2Var;
                    this.f74903e = jVar;
                    this.f74904f = strArr;
                    this.f74905g = callable;
                }

                @Override // kotlin.coroutines.jvm.internal.a
                @NotNull
                public final kotlin.coroutines.d<Unit> create(@Nullable Object obj, @NotNull kotlin.coroutines.d<?> dVar) {
                    C0742a c0742a = new C0742a(this.f74901c, this.f74902d, this.f74903e, this.f74904f, this.f74905g, dVar);
                    c0742a.f74900b = obj;
                    return c0742a;
                }

                @Override // kotlin.coroutines.jvm.internal.a
                @Nullable
                public final Object invokeSuspend(@NotNull Object obj) {
                    kotlin.coroutines.e eVarB;
                    Object objL = kotlin.coroutines.intrinsics.b.l();
                    int i10 = this.f74899a;
                    if (i10 == 0) {
                        ResultKt.m(obj);
                        kotlinx.coroutines.s0 s0Var = (kotlinx.coroutines.s0) this.f74900b;
                        kotlinx.coroutines.channels.p pVarD = kotlinx.coroutines.channels.s.d(-1, null, null, 6, null);
                        b bVar = new b(this.f74904f, pVarD);
                        pVarD.p(Unit.f312394a);
                        p2 p2Var = (p2) s0Var.getCoroutineContext().get(p2.f75037c);
                        if (p2Var == null || (eVarB = p2Var.b()) == null) {
                            eVarB = this.f74901c ? k.b(this.f74902d) : k.a(this.f74902d);
                        }
                        kotlinx.coroutines.channels.p pVarD2 = kotlinx.coroutines.channels.s.d(0, null, null, 7, null);
                        kotlinx.coroutines.k.f(s0Var, eVarB, null, new C0743a(this.f74902d, bVar, pVarD, this.f74905g, pVarD2, null), 2, null);
                        kotlinx.coroutines.flow.j<R> jVar = this.f74903e;
                        this.f74899a = 1;
                        if (kotlinx.coroutines.flow.k.n0(jVar, pVarD2, this) == objL) {
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
                @Nullable
                public final Object invoke(@NotNull kotlinx.coroutines.s0 s0Var, @Nullable kotlin.coroutines.d<? super Unit> dVar) {
                    return ((C0742a) create(s0Var, dVar)).invokeSuspend(Unit.f312394a);
                }
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            C0741a(boolean z10, b2 b2Var, String[] strArr, Callable<R> callable, kotlin.coroutines.d<? super C0741a> dVar) {
                super(2, dVar);
                this.f74895c = z10;
                this.f74896d = b2Var;
                this.f74897e = strArr;
                this.f74898f = callable;
            }

            @Override // kotlin.coroutines.jvm.internal.a
            @NotNull
            public final kotlin.coroutines.d<Unit> create(@Nullable Object obj, @NotNull kotlin.coroutines.d<?> dVar) {
                C0741a c0741a = new C0741a(this.f74895c, this.f74896d, this.f74897e, this.f74898f, dVar);
                c0741a.f74894b = obj;
                return c0741a;
            }

            @Override // kotlin.coroutines.jvm.internal.a
            @Nullable
            public final Object invokeSuspend(@NotNull Object obj) {
                Object objL = kotlin.coroutines.intrinsics.b.l();
                int i10 = this.f74893a;
                if (i10 == 0) {
                    ResultKt.m(obj);
                    C0742a c0742a = new C0742a(this.f74895c, this.f74896d, (kotlinx.coroutines.flow.j) this.f74894b, this.f74897e, this.f74898f, null);
                    this.f74893a = 1;
                    if (kotlinx.coroutines.t0.g(c0742a, this) == objL) {
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
            @Nullable
            public final Object invoke(@NotNull kotlinx.coroutines.flow.j<R> jVar, @Nullable kotlin.coroutines.d<? super Unit> dVar) {
                return ((C0741a) create(jVar, dVar)).invokeSuspend(Unit.f312394a);
            }
        }

        /* JADX INFO: Add missing generic type declarations: [R] */
        @kotlin.coroutines.jvm.internal.f(c = "androidx.room.CoroutinesRoom$Companion$execute$2", f = "CoroutinesRoom.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
        static final class b<R> extends kotlin.coroutines.jvm.internal.o implements Function2<kotlinx.coroutines.s0, kotlin.coroutines.d<? super R>, Object> {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            int f74914a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            final /* synthetic */ Callable<R> f74915b;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            b(Callable<R> callable, kotlin.coroutines.d<? super b> dVar) {
                super(2, dVar);
                this.f74915b = callable;
            }

            @Override // kotlin.coroutines.jvm.internal.a
            @NotNull
            public final kotlin.coroutines.d<Unit> create(@Nullable Object obj, @NotNull kotlin.coroutines.d<?> dVar) {
                return new b(this.f74915b, dVar);
            }

            @Override // kotlin.coroutines.jvm.internal.a
            @Nullable
            public final Object invokeSuspend(@NotNull Object obj) {
                kotlin.coroutines.intrinsics.b.l();
                if (this.f74914a != 0) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.m(obj);
                return this.f74915b.call();
            }

            @Override // kotlin.jvm.functions.Function2
            @Nullable
            public final Object invoke(@NotNull kotlinx.coroutines.s0 s0Var, @Nullable kotlin.coroutines.d<? super R> dVar) {
                return ((b) create(s0Var, dVar)).invokeSuspend(Unit.f312394a);
            }
        }

        static final class c extends kotlin.jvm.internal.l0 implements Function1<Throwable, Unit> {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            final /* synthetic */ CancellationSignal f74916a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            final /* synthetic */ kotlinx.coroutines.p2 f74917b;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            c(CancellationSignal cancellationSignal, kotlinx.coroutines.p2 p2Var) {
                super(1);
                this.f74916a = cancellationSignal;
                this.f74917b = p2Var;
            }

            @Override // kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ Unit invoke(Throwable th2) {
                invoke2(th2);
                return Unit.f312394a;
            }

            /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
            public final void invoke2(@Nullable Throwable th2) {
                CancellationSignal cancellationSignal = this.f74916a;
                if (cancellationSignal != null) {
                    w3.c.a.a(cancellationSignal);
                }
                kotlinx.coroutines.p2.a.b(this.f74917b, null, 1, null);
            }
        }

        @kotlin.coroutines.jvm.internal.f(c = "androidx.room.CoroutinesRoom$Companion$execute$4$job$1", f = "CoroutinesRoom.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
        static final class d extends kotlin.coroutines.jvm.internal.o implements Function2<kotlinx.coroutines.s0, kotlin.coroutines.d<? super Unit>, Object> {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            int f74918a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            final /* synthetic */ Callable<R> f74919b;

            /* JADX INFO: renamed from: c, reason: collision with root package name */
            final /* synthetic */ kotlinx.coroutines.n<R> f74920c;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            /* JADX WARN: Multi-variable type inference failed */
            d(Callable<R> callable, kotlinx.coroutines.n<? super R> nVar, kotlin.coroutines.d<? super d> dVar) {
                super(2, dVar);
                this.f74919b = callable;
                this.f74920c = nVar;
            }

            @Override // kotlin.coroutines.jvm.internal.a
            @NotNull
            public final kotlin.coroutines.d<Unit> create(@Nullable Object obj, @NotNull kotlin.coroutines.d<?> dVar) {
                return new d(this.f74919b, this.f74920c, dVar);
            }

            @Override // kotlin.coroutines.jvm.internal.a
            @Nullable
            public final Object invokeSuspend(@NotNull Object obj) {
                kotlin.coroutines.intrinsics.b.l();
                if (this.f74918a != 0) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.m(obj);
                try {
                    Object objCall = this.f74919b.call();
                    kotlin.coroutines.d dVar = this.f74920c;
                    Result.a aVar = Result.Companion;
                    dVar.resumeWith(Result.m785constructorimpl(objCall));
                } catch (Throwable th2) {
                    kotlin.coroutines.d dVar2 = this.f74920c;
                    Result.a aVar2 = Result.Companion;
                    dVar2.resumeWith(Result.m785constructorimpl(ResultKt.createFailure(th2)));
                }
                return Unit.f312394a;
            }

            @Override // kotlin.jvm.functions.Function2
            @Nullable
            public final Object invoke(@NotNull kotlinx.coroutines.s0 s0Var, @Nullable kotlin.coroutines.d<? super Unit> dVar) {
                return ((d) create(s0Var, dVar)).invokeSuspend(Unit.f312394a);
            }
        }

        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @oj.n
        @NotNull
        public final <R> kotlinx.coroutines.flow.i<R> a(@NotNull b2 b2Var, boolean z10, @NotNull String[] strArr, @NotNull Callable<R> callable) {
            return kotlinx.coroutines.flow.k.K0(new C0741a(z10, b2Var, strArr, callable, null));
        }

        @oj.n
        @Nullable
        public final <R> Object b(@NotNull b2 b2Var, boolean z10, @Nullable CancellationSignal cancellationSignal, @NotNull Callable<R> callable, @NotNull kotlin.coroutines.d<? super R> dVar) {
            kotlin.coroutines.e eVarB;
            if (b2Var.isOpenInternal() && b2Var.inTransaction()) {
                return callable.call();
            }
            p2 p2Var = (p2) dVar.getContext().get(p2.f75037c);
            if (p2Var == null || (eVarB = p2Var.b()) == null) {
                eVarB = z10 ? k.b(b2Var) : k.a(b2Var);
            }
            kotlin.coroutines.e eVar = eVarB;
            kotlinx.coroutines.p pVar = new kotlinx.coroutines.p(kotlin.coroutines.intrinsics.b.e(dVar), 1);
            pVar.p0();
            pVar.e0(new c(cancellationSignal, kotlinx.coroutines.k.f(kotlinx.coroutines.f2.f314023a, eVar, null, new d(callable, pVar, null), 2, null)));
            Object objU = pVar.u();
            if (objU == kotlin.coroutines.intrinsics.b.l()) {
                kotlin.coroutines.jvm.internal.h.c(dVar);
            }
            return objU;
        }

        @oj.n
        @Nullable
        public final <R> Object c(@NotNull b2 b2Var, boolean z10, @NotNull Callable<R> callable, @NotNull kotlin.coroutines.d<? super R> dVar) {
            kotlin.coroutines.e eVarB;
            if (b2Var.isOpenInternal() && b2Var.inTransaction()) {
                return callable.call();
            }
            p2 p2Var = (p2) dVar.getContext().get(p2.f75037c);
            if (p2Var == null || (eVarB = p2Var.b()) == null) {
                eVarB = z10 ? k.b(b2Var) : k.a(b2Var);
            }
            return kotlinx.coroutines.i.h(eVarB, new b(callable, null), dVar);
        }

        private a() {
        }
    }

    private j() {
    }

    @oj.n
    @NotNull
    public static final <R> kotlinx.coroutines.flow.i<R> a(@NotNull b2 b2Var, boolean z10, @NotNull String[] strArr, @NotNull Callable<R> callable) {
        return f74892a.a(b2Var, z10, strArr, callable);
    }

    @oj.n
    @Nullable
    public static final <R> Object b(@NotNull b2 b2Var, boolean z10, @Nullable CancellationSignal cancellationSignal, @NotNull Callable<R> callable, @NotNull kotlin.coroutines.d<? super R> dVar) {
        return f74892a.b(b2Var, z10, cancellationSignal, callable, dVar);
    }

    @oj.n
    @Nullable
    public static final <R> Object c(@NotNull b2 b2Var, boolean z10, @NotNull Callable<R> callable, @NotNull kotlin.coroutines.d<? super R> dVar) {
        return f74892a.c(b2Var, z10, callable, dVar);
    }
}
