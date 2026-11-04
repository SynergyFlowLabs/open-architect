package androidx.paging;

import com.devtodev.core.data.metrics.MetricConsts;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.collections.IndexedValue;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes3.dex */
public final class i<T> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    private final b0<T> f72109a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NotNull
    private final kotlinx.coroutines.flow.j0<IndexedValue<g1<T>>> f72110b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @NotNull
    private final kotlinx.coroutines.flow.o0<IndexedValue<g1<T>>> f72111c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @NotNull
    private final kotlinx.coroutines.p2 f72112d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    @NotNull
    private final kotlinx.coroutines.flow.i<g1<T>> f72113e;

    @kotlin.coroutines.jvm.internal.f(c = "androidx.paging.CachedPageEventFlow$downstreamFlow$1", f = "CachedPageEventFlow.kt", i = {}, l = {102}, m = "invokeSuspend", n = {}, s = {})
    static final class a extends kotlin.coroutines.jvm.internal.o implements Function2<kotlinx.coroutines.flow.j<? super g1<T>>, kotlin.coroutines.d<? super Unit>, Object> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        int f72114a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private /* synthetic */ Object f72115b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ i<T> f72116c;

        /* JADX INFO: renamed from: androidx.paging.i$a$a, reason: collision with other inner class name */
        @kotlin.coroutines.jvm.internal.f(c = "androidx.paging.CachedPageEventFlow$downstreamFlow$1$1", f = "CachedPageEventFlow.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
        static final class C0664a extends kotlin.coroutines.jvm.internal.o implements Function2<IndexedValue<? extends g1<T>>, kotlin.coroutines.d<? super Boolean>, Object> {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            int f72117a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            /* synthetic */ Object f72118b;

            C0664a(kotlin.coroutines.d<? super C0664a> dVar) {
                super(2, dVar);
            }

            @Override // kotlin.coroutines.jvm.internal.a
            @NotNull
            public final kotlin.coroutines.d<Unit> create(@Nullable Object obj, @NotNull kotlin.coroutines.d<?> dVar) {
                C0664a c0664a = new C0664a(dVar);
                c0664a.f72118b = obj;
                return c0664a;
            }

            @Override // kotlin.coroutines.jvm.internal.a
            @Nullable
            public final Object invokeSuspend(@NotNull Object obj) {
                kotlin.coroutines.intrinsics.b.l();
                if (this.f72117a != 0) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.m(obj);
                return kotlin.coroutines.jvm.internal.b.a(((IndexedValue) this.f72118b) != null);
            }

            @Override // kotlin.jvm.functions.Function2
            @Nullable
            /* JADX INFO: renamed from: k, reason: merged with bridge method [inline-methods] */
            public final Object invoke(@Nullable IndexedValue<? extends g1<T>> indexedValue, @Nullable kotlin.coroutines.d<? super Boolean> dVar) {
                return ((C0664a) create(indexedValue, dVar)).invokeSuspend(Unit.f312394a);
            }
        }

        static final class b<T> implements kotlinx.coroutines.flow.j {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            final /* synthetic */ kotlin.jvm.internal.i1.f f72119a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            final /* synthetic */ kotlinx.coroutines.flow.j<g1<T>> f72120b;

            /* JADX INFO: renamed from: androidx.paging.i$a$b$a, reason: collision with other inner class name */
            @kotlin.coroutines.jvm.internal.f(c = "androidx.paging.CachedPageEventFlow$downstreamFlow$1$2", f = "CachedPageEventFlow.kt", i = {0, 0}, l = {105}, m = "emit", n = {"this", "indexedValue"}, s = {"L$0", "L$1"})
            static final class C0665a extends kotlin.coroutines.jvm.internal.d {

                /* JADX INFO: renamed from: a, reason: collision with root package name */
                Object f72121a;

                /* JADX INFO: renamed from: b, reason: collision with root package name */
                Object f72122b;

                /* JADX INFO: renamed from: c, reason: collision with root package name */
                /* synthetic */ Object f72123c;

                /* JADX INFO: renamed from: d, reason: collision with root package name */
                final /* synthetic */ b<T> f72124d;

                /* JADX INFO: renamed from: e, reason: collision with root package name */
                int f72125e;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                /* JADX WARN: Multi-variable type inference failed */
                C0665a(b<? super T> bVar, kotlin.coroutines.d<? super C0665a> dVar) {
                    super(dVar);
                    this.f72124d = bVar;
                }

                @Override // kotlin.coroutines.jvm.internal.a
                @Nullable
                public final Object invokeSuspend(@NotNull Object obj) {
                    this.f72123c = obj;
                    this.f72125e |= Integer.MIN_VALUE;
                    return this.f72124d.emit(null, this);
                }
            }

            /* JADX WARN: Multi-variable type inference failed */
            b(kotlin.jvm.internal.i1.f fVar, kotlinx.coroutines.flow.j<? super g1<T>> jVar) {
                this.f72119a = fVar;
                this.f72120b = jVar;
            }

            /* JADX WARN: Code duplicated, block: B:7:0x0016  */
            @Override // kotlinx.coroutines.flow.j
            @Nullable
            /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
            public final Object emit(@Nullable IndexedValue<? extends g1<T>> indexedValue, @NotNull kotlin.coroutines.d<? super Unit> dVar) {
                C0665a c0665a;
                if (dVar instanceof C0665a) {
                    c0665a = (C0665a) dVar;
                    int i10 = c0665a.f72125e;
                    if ((i10 & Integer.MIN_VALUE) != 0) {
                        c0665a.f72125e = i10 - Integer.MIN_VALUE;
                    } else {
                        c0665a = new C0665a(this, dVar);
                    }
                } else {
                    c0665a = new C0665a(this, dVar);
                }
                Object obj = c0665a.f72123c;
                Object objL = kotlin.coroutines.intrinsics.b.l();
                int i11 = c0665a.f72125e;
                if (i11 == 0) {
                    ResultKt.m(obj);
                    Intrinsics.checkNotNull(indexedValue);
                    if (indexedValue.getIndex() > this.f72119a.f312749a) {
                        kotlinx.coroutines.flow.j<g1<T>> jVar = this.f72120b;
                        g1<T> value = indexedValue.getValue();
                        c0665a.f72121a = this;
                        c0665a.f72122b = indexedValue;
                        c0665a.f72125e = 1;
                        if (jVar.emit(value, c0665a) == objL) {
                            return objL;
                        }
                    }
                    return Unit.f312394a;
                }
                if (i11 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                indexedValue = (IndexedValue) c0665a.f72122b;
                this = (b) c0665a.f72121a;
                ResultKt.m(obj);
                this.f72119a.f312749a = indexedValue.getIndex();
                return Unit.f312394a;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        a(i<T> iVar, kotlin.coroutines.d<? super a> dVar) {
            super(2, dVar);
            this.f72116c = iVar;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        @NotNull
        public final kotlin.coroutines.d<Unit> create(@Nullable Object obj, @NotNull kotlin.coroutines.d<?> dVar) {
            a aVar = new a(this.f72116c, dVar);
            aVar.f72115b = obj;
            return aVar;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            Object objL = kotlin.coroutines.intrinsics.b.l();
            int i10 = this.f72114a;
            if (i10 == 0) {
                ResultKt.m(obj);
                kotlinx.coroutines.flow.j jVar = (kotlinx.coroutines.flow.j) this.f72115b;
                kotlin.jvm.internal.i1.f fVar = new kotlin.jvm.internal.i1.f();
                fVar.f312749a = Integer.MIN_VALUE;
                kotlinx.coroutines.flow.i iVarX1 = kotlinx.coroutines.flow.k.X1(((i) this.f72116c).f72111c, new C0664a(null));
                b bVar = new b(fVar, jVar);
                this.f72114a = 1;
                if (iVarX1.collect(bVar, this) == objL) {
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
        public final Object invoke(@NotNull kotlinx.coroutines.flow.j<? super g1<T>> jVar, @Nullable kotlin.coroutines.d<? super Unit> dVar) {
            return ((a) create(jVar, dVar)).invokeSuspend(Unit.f312394a);
        }
    }

    @kotlin.coroutines.jvm.internal.f(c = "androidx.paging.CachedPageEventFlow$job$1", f = "CachedPageEventFlow.kt", i = {}, l = {76}, m = "invokeSuspend", n = {}, s = {})
    static final class b extends kotlin.coroutines.jvm.internal.o implements Function2<kotlinx.coroutines.s0, kotlin.coroutines.d<? super Unit>, Object> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        int f72126a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ kotlinx.coroutines.flow.i<g1<T>> f72127b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ i<T> f72128c;

        static final class a<T> implements kotlinx.coroutines.flow.j {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            final /* synthetic */ i<T> f72129a;

            /* JADX INFO: renamed from: androidx.paging.i$b$a$a, reason: collision with other inner class name */
            @kotlin.coroutines.jvm.internal.f(c = "androidx.paging.CachedPageEventFlow$job$1$1", f = "CachedPageEventFlow.kt", i = {0, 0}, l = {com.planner5d.library.engine.input.f.b.f160716p, 78}, m = "emit", n = {"this", MetricConsts.Install}, s = {"L$0", "L$1"})
            static final class C0666a extends kotlin.coroutines.jvm.internal.d {

                /* JADX INFO: renamed from: a, reason: collision with root package name */
                Object f72130a;

                /* JADX INFO: renamed from: b, reason: collision with root package name */
                Object f72131b;

                /* JADX INFO: renamed from: c, reason: collision with root package name */
                /* synthetic */ Object f72132c;

                /* JADX INFO: renamed from: d, reason: collision with root package name */
                final /* synthetic */ a<T> f72133d;

                /* JADX INFO: renamed from: e, reason: collision with root package name */
                int f72134e;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                /* JADX WARN: Multi-variable type inference failed */
                C0666a(a<? super T> aVar, kotlin.coroutines.d<? super C0666a> dVar) {
                    super(dVar);
                    this.f72133d = aVar;
                }

                @Override // kotlin.coroutines.jvm.internal.a
                @Nullable
                public final Object invokeSuspend(@NotNull Object obj) {
                    this.f72132c = obj;
                    this.f72134e |= Integer.MIN_VALUE;
                    return this.f72133d.emit(null, this);
                }
            }

            a(i<T> iVar) {
                this.f72129a = iVar;
            }

            /* JADX WARN: Code duplicated, block: B:7:0x0019  */
            /* JADX WARN: Code restructure failed: missing block: B:20:0x007a, code lost:
            
                if (r6.c(r7, r0) == r1) goto L21;
             */
            @Override // kotlinx.coroutines.flow.j
            @org.jetbrains.annotations.Nullable
            /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
            /*
                Code decompiled incorrectly, please refer to instructions dump.
                To view partially-correct add '--show-bad-code' argument
            */
            public final java.lang.Object emit(@org.jetbrains.annotations.NotNull kotlin.collections.IndexedValue<? extends androidx.paging.g1<T>> r7, @org.jetbrains.annotations.NotNull kotlin.coroutines.d<? super kotlin.Unit> r8) {
                /*
                    r6 = this;
                    java.lang.String r5 = "Androeed.ru"
                    boolean r0 = r8 instanceof androidx.paging.i.b.a.C0666a
                    r5 = 7
                    if (r0 == 0) goto L19
                    r0 = r8
                    r0 = r8
                    androidx.paging.i$b$a$a r0 = (androidx.paging.i.b.a.C0666a) r0
                    int r1 = r0.f72134e
                    r2 = -2147483648(0xffffffff80000000, float:-0.0)
                    r3 = r1 & r2
                    if (r3 == 0) goto L19
                    int r1 = r1 - r2
                    r5 = 1
                    r0.f72134e = r1
                    r5 = 4
                    goto L1f
                L19:
                    androidx.paging.i$b$a$a r0 = new androidx.paging.i$b$a$a
                    r5 = 5
                    r0.<init>(r6, r8)
                L1f:
                    r5 = 3
                    java.lang.Object r8 = r0.f72132c
                    java.lang.Object r1 = kotlin.coroutines.intrinsics.b.l()
                    r5 = 3
                    int r2 = r0.f72134e
                    r3 = 2
                    r4 = 1
                    if (r2 == 0) goto L4f
                    if (r2 == r4) goto L40
                    if (r2 != r3) goto L36
                    kotlin.ResultKt.m(r8)
                    r5 = 2
                    goto L7e
                L36:
                    r5 = 2
                    java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
                    java.lang.String r7 = "call to 'resume' before 'invoke' with coroutine"
                    r5 = 6
                    r6.<init>(r7)
                    throw r6
                L40:
                    r5 = 2
                    java.lang.Object r6 = r0.f72131b
                    r7 = r6
                    kotlin.collections.IndexedValue r7 = (kotlin.collections.IndexedValue) r7
                    java.lang.Object r6 = r0.f72130a
                    androidx.paging.i$b$a r6 = (androidx.paging.i.b.a) r6
                    r5 = 1
                    kotlin.ResultKt.m(r8)
                    goto L68
                L4f:
                    kotlin.ResultKt.m(r8)
                    androidx.paging.i<T> r8 = r6.f72129a
                    r5 = 4
                    kotlinx.coroutines.flow.j0 r8 = androidx.paging.i.b(r8)
                    r0.f72130a = r6
                    r5 = 2
                    r0.f72131b = r7
                    r0.f72134e = r4
                    java.lang.Object r8 = r8.emit(r7, r0)
                    if (r8 != r1) goto L68
                    r5 = 3
                    goto L7c
                L68:
                    androidx.paging.i<T> r6 = r6.f72129a
                    androidx.paging.b0 r6 = androidx.paging.i.c(r6)
                    r8 = 0
                    r0.f72130a = r8
                    r0.f72131b = r8
                    r0.f72134e = r3
                    java.lang.Object r6 = r6.c(r7, r0)
                    r5 = 6
                    if (r6 != r1) goto L7e
                L7c:
                    r5 = 3
                    return r1
                L7e:
                    kotlin.Unit r6 = kotlin.Unit.f312394a
                    r5 = 4
                    return r6
                */
                throw new UnsupportedOperationException("Method not decompiled: androidx.paging.i.b.a.emit(kotlin.collections.IndexedValue, kotlin.coroutines.d):java.lang.Object");
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        b(kotlinx.coroutines.flow.i<? extends g1<T>> iVar, i<T> iVar2, kotlin.coroutines.d<? super b> dVar) {
            super(2, dVar);
            this.f72127b = iVar;
            this.f72128c = iVar2;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        @NotNull
        public final kotlin.coroutines.d<Unit> create(@Nullable Object obj, @NotNull kotlin.coroutines.d<?> dVar) {
            return new b(this.f72127b, this.f72128c, dVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            Object objL = kotlin.coroutines.intrinsics.b.l();
            int i10 = this.f72126a;
            if (i10 == 0) {
                ResultKt.m(obj);
                kotlinx.coroutines.flow.i iVarI2 = kotlinx.coroutines.flow.k.i2(this.f72127b);
                a aVar = new a(this.f72128c);
                this.f72126a = 1;
                if (iVarI2.collect(aVar, this) == objL) {
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
            return ((b) create(s0Var, dVar)).invokeSuspend(Unit.f312394a);
        }
    }

    static final class c extends kotlin.jvm.internal.l0 implements Function1<Throwable, Unit> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ i<T> f72135a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        c(i<T> iVar) {
            super(1);
            this.f72135a = iVar;
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(Throwable th2) {
            invoke2(th2);
            return Unit.f312394a;
        }

        /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
        public final void invoke2(@Nullable Throwable th2) {
            ((i) this.f72135a).f72110b.f(null);
        }
    }

    @kotlin.coroutines.jvm.internal.f(c = "androidx.paging.CachedPageEventFlow$sharedForDownstream$1", f = "CachedPageEventFlow.kt", i = {0, 1}, l = {com.planner5d.library.engine.input.f.b.I0, 67}, m = "invokeSuspend", n = {"$this$onSubscription", "$this$onSubscription"}, s = {"L$0", "L$0"})
    @SourceDebugExtension({"SMAP\nCachedPageEventFlow.kt\nKotlin\n*S Kotlin\n*F\n+ 1 CachedPageEventFlow.kt\nandroidx/paging/CachedPageEventFlow$sharedForDownstream$1\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,281:1\n1855#2,2:282\n*S KotlinDebug\n*F\n+ 1 CachedPageEventFlow.kt\nandroidx/paging/CachedPageEventFlow$sharedForDownstream$1\n*L\n66#1:282,2\n*E\n"})
    static final class d extends kotlin.coroutines.jvm.internal.o implements Function2<kotlinx.coroutines.flow.j<? super IndexedValue<? extends g1<T>>>, kotlin.coroutines.d<? super Unit>, Object> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        Object f72136a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        int f72137b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private /* synthetic */ Object f72138c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        final /* synthetic */ i<T> f72139d;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        d(i<T> iVar, kotlin.coroutines.d<? super d> dVar) {
            super(2, dVar);
            this.f72139d = iVar;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        @NotNull
        public final kotlin.coroutines.d<Unit> create(@Nullable Object obj, @NotNull kotlin.coroutines.d<?> dVar) {
            d dVar2 = new d(this.f72139d, dVar);
            dVar2.f72138c = obj;
            return dVar2;
        }

        /* JADX WARN: Code duplicated, block: B:17:0x006f  */
        /* JADX WARN: Code duplicated, block: B:23:0x0083 A[SYNTHETIC] */
        /* JADX WARN: Code duplicated, block: B:25:? A[LOOP:0: B:15:0x0068->B:25:?, LOOP_END, SYNTHETIC] */
        /* JADX WARN: Code restructure failed: missing block: B:12:0x004e, code lost:
        
            if (r6 == r0) goto L19;
         */
        @Override // kotlin.coroutines.jvm.internal.a
        @org.jetbrains.annotations.Nullable
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public final java.lang.Object invokeSuspend(@org.jetbrains.annotations.NotNull java.lang.Object r6) {
            /*
                r5 = this;
                java.lang.Object r0 = kotlin.coroutines.intrinsics.b.l()
                int r1 = r5.f72137b
                r4 = 2
                r2 = 2
                r4 = 1
                r3 = 1
                if (r1 == 0) goto L33
                r4 = 7
                if (r1 == r3) goto L2b
                if (r1 != r2) goto L20
                r4 = 2
                java.lang.Object r1 = r5.f72136a
                r4 = 6
                java.util.Iterator r1 = (java.util.Iterator) r1
                java.lang.Object r3 = r5.f72138c
                kotlinx.coroutines.flow.j r3 = (kotlinx.coroutines.flow.j) r3
                kotlin.ResultKt.m(r6)
                r4 = 4
                goto L68
            L20:
                r4 = 4
                java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
                r4 = 0
                java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
                r5.<init>(r6)
                r4 = 6
                throw r5
            L2b:
                java.lang.Object r1 = r5.f72138c
                kotlinx.coroutines.flow.j r1 = (kotlinx.coroutines.flow.j) r1
                kotlin.ResultKt.m(r6)
                goto L51
            L33:
                r4 = 4
                kotlin.ResultKt.m(r6)
                r4 = 5
                java.lang.Object r6 = r5.f72138c
                r1 = r6
                kotlinx.coroutines.flow.j r1 = (kotlinx.coroutines.flow.j) r1
                androidx.paging.i<T> r6 = r5.f72139d
                r4 = 4
                androidx.paging.b0 r6 = androidx.paging.i.c(r6)
                r5.f72138c = r1
                r4 = 2
                r5.f72137b = r3
                r4 = 6
                java.lang.Object r6 = r6.b(r5)
                if (r6 != r0) goto L51
                goto L83
            L51:
                r4 = 2
                java.util.List r6 = (java.util.List) r6
                androidx.paging.i<T> r3 = r5.f72139d
                r4 = 4
                kotlinx.coroutines.p2 r3 = androidx.paging.i.a(r3)
                r3.start()
                r4 = 2
                java.lang.Iterable r6 = (java.lang.Iterable) r6
                java.util.Iterator r6 = r6.iterator()
                r3 = r1
                r3 = r1
                r1 = r6
            L68:
                r4 = 7
                boolean r6 = r1.hasNext()
                if (r6 == 0) goto L84
                java.lang.Object r6 = r1.next()
                r4 = 5
                kotlin.collections.IndexedValue r6 = (kotlin.collections.IndexedValue) r6
                r5.f72138c = r3
                r5.f72136a = r1
                r5.f72137b = r2
                r4 = 2
                java.lang.Object r6 = r3.emit(r6, r5)
                if (r6 != r0) goto L68
            L83:
                return r0
            L84:
                kotlin.Unit r5 = kotlin.Unit.f312394a
                return r5
            */
            throw new UnsupportedOperationException("Method not decompiled: androidx.paging.i.d.invokeSuspend(java.lang.Object):java.lang.Object");
        }

        @Override // kotlin.jvm.functions.Function2
        @Nullable
        public final Object invoke(@NotNull kotlinx.coroutines.flow.j<? super IndexedValue<? extends g1<T>>> jVar, @Nullable kotlin.coroutines.d<? super Unit> dVar) {
            return ((d) create(jVar, dVar)).invokeSuspend(Unit.f312394a);
        }
    }

    public i(@NotNull kotlinx.coroutines.flow.i<? extends g1<T>> src, @NotNull kotlinx.coroutines.s0 scope) {
        Intrinsics.checkNotNullParameter(src, "src");
        Intrinsics.checkNotNullParameter(scope, "scope");
        this.f72109a = new b0<>();
        kotlinx.coroutines.flow.j0<IndexedValue<g1<T>>> j0VarA = kotlinx.coroutines.flow.q0.a(1, Integer.MAX_VALUE, kotlinx.coroutines.channels.j.SUSPEND);
        this.f72110b = j0VarA;
        this.f72111c = kotlinx.coroutines.flow.k.p1(j0VarA, new d(this, null));
        int i10 = 5 << 1;
        kotlinx.coroutines.p2 p2VarF = kotlinx.coroutines.k.f(scope, null, kotlinx.coroutines.u0.LAZY, new b(src, this, null), 1, null);
        p2VarF.E(new c(this));
        this.f72112d = p2VarF;
        this.f72113e = kotlinx.coroutines.flow.k.K0(new a(this, null));
    }

    public final void e() {
        boolean z10 = true;
        kotlinx.coroutines.p2.a.b(this.f72112d, null, 1, null);
    }

    @Nullable
    public final g1.b<T> f() {
        return this.f72109a.a();
    }

    @NotNull
    public final kotlinx.coroutines.flow.i<g1<T>> g() {
        return this.f72113e;
    }
}
