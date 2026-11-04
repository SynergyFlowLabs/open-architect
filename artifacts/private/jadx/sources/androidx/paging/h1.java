package androidx.paging;

import java.util.List;
import java.util.concurrent.atomic.AtomicInteger;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes3.dex */
@SourceDebugExtension({"SMAP\nPageFetcher.kt\nKotlin\n*S Kotlin\n*F\n+ 1 PageFetcher.kt\nandroidx/paging/PageFetcher\n+ 2 PagingLogger.kt\nandroidx/paging/PagingLoggerKt\n*L\n1#1,256:1\n32#2,10:257\n*S KotlinDebug\n*F\n+ 1 PageFetcher.kt\nandroidx/paging/PageFetcher\n*L\n227#1:257,10\n*E\n"})
public final class h1<Key, Value> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    private final Function1<kotlin.coroutines.d<? super h2<Key, Value>>, Object> f72024a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @Nullable
    private final Key f72025b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @NotNull
    private final w1 f72026c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @NotNull
    private final q<Boolean> f72027d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    @NotNull
    private final q<Unit> f72028e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    @NotNull
    private final kotlinx.coroutines.flow.i<x1<Value>> f72029f;

    private static final class a<Key, Value> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        @NotNull
        private final i1<Key, Value> f72030a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        @Nullable
        private final j2<Key, Value> f72031b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        @NotNull
        private final kotlinx.coroutines.p2 f72032c;

        public a(@NotNull i1<Key, Value> snapshot, @Nullable j2<Key, Value> j2Var, @NotNull kotlinx.coroutines.p2 job) {
            Intrinsics.checkNotNullParameter(snapshot, "snapshot");
            Intrinsics.checkNotNullParameter(job, "job");
            this.f72030a = snapshot;
            this.f72031b = j2Var;
            this.f72032c = job;
        }

        @NotNull
        public final kotlinx.coroutines.p2 a() {
            return this.f72032c;
        }

        @NotNull
        public final i1<Key, Value> b() {
            return this.f72030a;
        }

        @Nullable
        public final j2<Key, Value> c() {
            return this.f72031b;
        }
    }

    public final class b<Key, Value> implements h0 {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        @NotNull
        private final i1<Key, Value> f72033a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ h1<Key, Value> f72034b;

        public b(@NotNull h1 h1Var, i1<Key, Value> pageFetcherSnapshot) {
            Intrinsics.checkNotNullParameter(pageFetcherSnapshot, "pageFetcherSnapshot");
            this.f72034b = h1Var;
            this.f72033a = pageFetcherSnapshot;
        }

        @Override // androidx.paging.h0
        public void a(@NotNull j3 viewportHint) {
            Intrinsics.checkNotNullParameter(viewportHint, "viewportHint");
            this.f72033a.p(viewportHint);
        }

        @androidx.annotation.l1
        @NotNull
        public final i1<Key, Value> b() {
            return this.f72033a;
        }
    }

    public final class c implements h3 {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        @NotNull
        private final q<Unit> f72035a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ h1<Key, Value> f72036b;

        public c(@NotNull h1 h1Var, q<Unit> retryEventBus) {
            Intrinsics.checkNotNullParameter(retryEventBus, "retryEventBus");
            this.f72036b = h1Var;
            this.f72035a = retryEventBus;
        }

        @Override // androidx.paging.h3
        public void Z() {
            this.f72035a.b(Unit.f312394a);
        }

        @Override // androidx.paging.h3
        public void a() {
            this.f72036b.l();
        }
    }

    @kotlin.coroutines.jvm.internal.f(c = "androidx.paging.PageFetcher$flow$1", f = "PageFetcher.kt", i = {}, l = {136}, m = "invokeSuspend", n = {}, s = {})
    @SourceDebugExtension({"SMAP\nPageFetcher.kt\nKotlin\n*S Kotlin\n*F\n+ 1 PageFetcher.kt\nandroidx/paging/PageFetcher$flow$1\n+ 2 FlowExt.kt\nandroidx/paging/FlowExtKt\n*L\n1#1,256:1\n105#2:257\n*S KotlinDebug\n*F\n+ 1 PageFetcher.kt\nandroidx/paging/PageFetcher$flow$1\n*L\n125#1:257\n*E\n"})
    static final class d extends kotlin.coroutines.jvm.internal.o implements Function2<a3<x1<Value>>, kotlin.coroutines.d<? super Unit>, Object> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        int f72037a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private /* synthetic */ Object f72038b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ s2<Key, Value> f72039c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        final /* synthetic */ h1<Key, Value> f72040d;

        @kotlin.coroutines.jvm.internal.f(c = "androidx.paging.PageFetcher$flow$1$1", f = "PageFetcher.kt", i = {}, l = {63, 63}, m = "invokeSuspend", n = {}, s = {})
        static final class a extends kotlin.coroutines.jvm.internal.o implements Function2<kotlinx.coroutines.flow.j<? super Boolean>, kotlin.coroutines.d<? super Unit>, Object> {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            int f72041a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            private /* synthetic */ Object f72042b;

            /* JADX INFO: renamed from: c, reason: collision with root package name */
            final /* synthetic */ u2<Key, Value> f72043c;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            a(u2<Key, Value> u2Var, kotlin.coroutines.d<? super a> dVar) {
                super(2, dVar);
                this.f72043c = u2Var;
            }

            @Override // kotlin.coroutines.jvm.internal.a
            @NotNull
            public final kotlin.coroutines.d<Unit> create(@Nullable Object obj, @NotNull kotlin.coroutines.d<?> dVar) {
                a aVar = new a(this.f72043c, dVar);
                aVar.f72042b = obj;
                return aVar;
            }

            /* JADX WARN: Code duplicated, block: B:20:0x0049  */
            /* JADX WARN: Code restructure failed: missing block: B:13:0x003d, code lost:
            
                if (r8 == r0) goto L23;
             */
            /* JADX WARN: Code restructure failed: missing block: B:22:0x0057, code lost:
            
                if (r1.emit(r8, r7) == r0) goto L23;
             */
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
                    int r1 = r7.f72041a
                    r2 = 0
                    r6 = r2
                    r3 = 2
                    r4 = 4
                    r4 = 1
                    if (r1 == 0) goto L28
                    if (r1 == r4) goto L20
                    if (r1 != r3) goto L15
                    kotlin.ResultKt.m(r8)
                    goto L5a
                L15:
                    java.lang.IllegalStateException r7 = new java.lang.IllegalStateException
                    r6 = 4
                    java.lang.String r8 = "rssro  eucoi/oae/t/urievlf eekneow// c/ihn// m botl"
                    java.lang.String r8 = "call to 'resume' before 'invoke' with coroutine"
                    r7.<init>(r8)
                    throw r7
                L20:
                    java.lang.Object r1 = r7.f72042b
                    kotlinx.coroutines.flow.j r1 = (kotlinx.coroutines.flow.j) r1
                    kotlin.ResultKt.m(r8)
                    goto L40
                L28:
                    r6 = 1
                    kotlin.ResultKt.m(r8)
                    java.lang.Object r8 = r7.f72042b
                    r1 = r8
                    kotlinx.coroutines.flow.j r1 = (kotlinx.coroutines.flow.j) r1
                    androidx.paging.u2<Key, Value> r8 = r7.f72043c
                    if (r8 == 0) goto L43
                    r7.f72042b = r1
                    r7.f72041a = r4
                    java.lang.Object r8 = r8.a(r7)
                    if (r8 != r0) goto L40
                    goto L59
                L40:
                    androidx.paging.s2$a r8 = (androidx.paging.s2.a) r8
                    goto L44
                L43:
                    r8 = r2
                L44:
                    androidx.paging.s2$a r5 = androidx.paging.s2.a.LAUNCH_INITIAL_REFRESH
                    if (r8 != r5) goto L49
                    goto L4b
                L49:
                    r6 = 4
                    r4 = 0
                L4b:
                    java.lang.Boolean r8 = kotlin.coroutines.jvm.internal.b.a(r4)
                    r7.f72042b = r2
                    r7.f72041a = r3
                    java.lang.Object r7 = r1.emit(r8, r7)
                    if (r7 != r0) goto L5a
                L59:
                    return r0
                L5a:
                    r6 = 6
                    kotlin.Unit r7 = kotlin.Unit.f312394a
                    return r7
                */
                throw new UnsupportedOperationException("Method not decompiled: androidx.paging.h1.d.a.invokeSuspend(java.lang.Object):java.lang.Object");
            }

            @Override // kotlin.jvm.functions.Function2
            @Nullable
            public final Object invoke(@NotNull kotlinx.coroutines.flow.j<? super Boolean> jVar, @Nullable kotlin.coroutines.d<? super Unit> dVar) {
                return ((a) create(jVar, dVar)).invokeSuspend(Unit.f312394a);
            }
        }

        @kotlin.coroutines.jvm.internal.f(c = "androidx.paging.PageFetcher$flow$1$2", f = "PageFetcher.kt", i = {0, 1, 1}, l = {com.planner5d.library.engine.input.f.b.f160725s, com.planner5d.library.engine.input.f.b.f160716p}, m = "invokeSuspend", n = {"previousGeneration", "previousGeneration", "pagingSource"}, s = {"L$0", "L$0", "L$1"})
        @SourceDebugExtension({"SMAP\nPageFetcher.kt\nKotlin\n*S Kotlin\n*F\n+ 1 PageFetcher.kt\nandroidx/paging/PageFetcher$flow$1$2\n+ 2 PagingLogger.kt\nandroidx/paging/PagingLoggerKt\n*L\n1#1,256:1\n32#2,10:257\n*S KotlinDebug\n*F\n+ 1 PageFetcher.kt\nandroidx/paging/PageFetcher$flow$1$2\n*L\n101#1:257,10\n*E\n"})
        static final class b extends kotlin.coroutines.jvm.internal.o implements pj.n<a<Key, Value>, Boolean, kotlin.coroutines.d<? super a<Key, Value>>, Object> {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            Object f72044a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            int f72045b;

            /* JADX INFO: renamed from: c, reason: collision with root package name */
            /* synthetic */ Object f72046c;

            /* JADX INFO: renamed from: d, reason: collision with root package name */
            /* synthetic */ boolean f72047d;

            /* JADX INFO: renamed from: e, reason: collision with root package name */
            final /* synthetic */ u2<Key, Value> f72048e;

            /* JADX INFO: renamed from: f, reason: collision with root package name */
            final /* synthetic */ h1<Key, Value> f72049f;

            /* synthetic */ class a extends kotlin.jvm.internal.g0 implements Function0<Unit> {
                a(Object obj) {
                    super(0, obj, h1.class, "refresh", "refresh()V", 0);
                }

                @Override // kotlin.jvm.functions.Function0
                public /* bridge */ /* synthetic */ Unit invoke() {
                    invoke2();
                    return Unit.f312394a;
                }

                /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
                public final void invoke2() {
                    ((h1) this.receiver).l();
                }
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            b(u2<Key, Value> u2Var, h1<Key, Value> h1Var, kotlin.coroutines.d<? super b> dVar) {
                super(3, dVar);
                this.f72048e = u2Var;
                this.f72049f = h1Var;
            }

            @Override // pj.n
            public /* bridge */ /* synthetic */ Object invoke(Object obj, Boolean bool, Object obj2) {
                return k((a) obj, bool.booleanValue(), (kotlin.coroutines.d) obj2);
            }

            /* JADX WARN: Code duplicated, block: B:36:0x0080  */
            /* JADX WARN: Code duplicated, block: B:37:0x0085  */
            /* JADX WARN: Code duplicated, block: B:51:0x00ad  */
            /* JADX WARN: Code duplicated, block: B:52:0x00b2  */
            /* JADX WARN: Code duplicated, block: B:54:0x00b5  */
            /* JADX WARN: Code duplicated, block: B:58:0x00c2  */
            /* JADX WARN: Code duplicated, block: B:60:0x00c5  */
            /* JADX WARN: Code duplicated, block: B:63:0x00cd  */
            /* JADX WARN: Code duplicated, block: B:65:0x00d6  */
            /* JADX WARN: Code duplicated, block: B:67:0x00e3  */
            /* JADX WARN: Instruction removed from duplicated block: B:67:0x00e3, please report this as an issue */
            @Override // kotlin.coroutines.jvm.internal.a
            @Nullable
            public final Object invokeSuspend(@NotNull Object obj) {
                a aVar;
                i1<Key, Value> i1VarB;
                u2<Key, Value> u2Var;
                h2 h2Var;
                j2<Key, Value> j2VarC;
                i1<Key, Value> i1VarB2;
                h2 h2Var2;
                List<h2.b.c<Key, Value>> listH;
                List<h2.b.c<Key, Value>> list;
                j2<Key, Value> j2VarC2;
                List<h2.b.c<Key, Value>> listH2;
                Integer numF;
                j2<Key, Value> j2Var;
                Object refreshKey;
                f2 f2Var;
                kotlinx.coroutines.p2 p2VarA;
                i1<Key, Value> i1VarB3;
                Integer numF2;
                j2<Key, Value> j2VarC3;
                Object objL = kotlin.coroutines.intrinsics.b.l();
                int i10 = this.f72045b;
                if (i10 == 0) {
                    ResultKt.m(obj);
                    a aVar2 = (a) this.f72046c;
                    if (this.f72047d && (u2Var = this.f72048e) != null) {
                        u2Var.b();
                    }
                    h1<Key, Value> h1Var = this.f72049f;
                    h2<Key, Value> h2VarX = (aVar2 == null || (i1VarB = aVar2.b()) == null) ? null : i1VarB.x();
                    this.f72046c = aVar2;
                    this.f72045b = 1;
                    Object objH = h1Var.h(h2VarX, this);
                    if (objH != objL) {
                        aVar = aVar2;
                        obj = objH;
                    }
                    return objL;
                }
                if (i10 == 1) {
                    aVar = (a) this.f72046c;
                    ResultKt.m(obj);
                } else {
                    if (i10 != 2) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    h2Var2 = (h2) this.f72044a;
                    aVar = (a) this.f72046c;
                    ResultKt.m(obj);
                }
                j2VarC = (j2) obj;
                h2Var = h2Var2;
                if (j2VarC != null) {
                    listH = j2VarC.h();
                } else {
                    listH = null;
                }
                list = listH;
                if ((list != null || list.isEmpty()) && aVar != null && (j2VarC2 = aVar.c()) != null && (listH2 = j2VarC2.h()) != null && (!listH2.isEmpty())) {
                }
                if (j2VarC != null) {
                    numF = j2VarC.f();
                } else {
                    numF = null;
                }
                if (numF == null) {
                    if (aVar != null || (j2VarC3 = aVar.c()) == null) {
                        numF2 = null;
                    } else {
                        numF2 = j2VarC3.f();
                    }
                    if (numF2 != null) {
                        j2VarC = aVar.c();
                    }
                }
                j2Var = j2VarC;
                if (j2Var == null) {
                    refreshKey = ((h1) this.f72049f).f72025b;
                } else {
                    refreshKey = h2Var.getRefreshKey(j2Var);
                    f2Var = f2.f71875a;
                    if (f2Var.a(3)) {
                        f2Var.b(3, "Refresh key " + refreshKey + " returned from PagingSource " + h2Var, null);
                    }
                }
                Object obj2 = refreshKey;
                if (aVar != null && (i1VarB3 = aVar.b()) != null) {
                    i1VarB3.q();
                }
                if (aVar != null && (p2VarA = aVar.a()) != null) {
                    kotlinx.coroutines.p2.a.b(p2VarA, null, 1, null);
                }
                return new a(new i1(obj2, h2Var, ((h1) this.f72049f).f72026c, ((h1) this.f72049f).f72028e.a(), this.f72048e, j2Var, new a(this.f72049f)), j2Var, kotlinx.coroutines.u2.c(null, 1, null));
                h2 h2Var3 = (h2) obj;
                if (aVar != null && (i1VarB2 = aVar.b()) != null) {
                    this.f72046c = aVar;
                    this.f72044a = h2Var3;
                    this.f72045b = 2;
                    Object objS = i1VarB2.s(this);
                    if (objS != objL) {
                        h2Var2 = h2Var3;
                        obj = objS;
                        j2VarC = (j2) obj;
                        h2Var = h2Var2;
                    }
                    return objL;
                }
                h2Var = h2Var3;
                j2VarC = null;
                if (j2VarC != null) {
                    listH = j2VarC.h();
                } else {
                    listH = null;
                }
                list = listH;
                j2VarC = list != null ? aVar.c() : aVar.c();
                if (j2VarC != null) {
                    numF = j2VarC.f();
                } else {
                    numF = null;
                }
                if (numF == null) {
                    if (aVar != null) {
                        numF2 = null;
                    } else {
                        numF2 = null;
                    }
                    if (numF2 != null) {
                        j2VarC = aVar.c();
                    }
                }
                j2Var = j2VarC;
                if (j2Var == null) {
                    refreshKey = ((h1) this.f72049f).f72025b;
                } else {
                    refreshKey = h2Var.getRefreshKey(j2Var);
                    f2Var = f2.f71875a;
                    if (f2Var.a(3)) {
                        f2Var.b(3, "Refresh key " + refreshKey + " returned from PagingSource " + h2Var, null);
                    }
                }
                Object obj3 = refreshKey;
                if (aVar != null) {
                    i1VarB3.q();
                }
                if (aVar != null) {
                    kotlinx.coroutines.p2.a.b(p2VarA, null, 1, null);
                }
                return new a(new i1(obj3, h2Var, ((h1) this.f72049f).f72026c, ((h1) this.f72049f).f72028e.a(), this.f72048e, j2Var, new a(this.f72049f)), j2Var, kotlinx.coroutines.u2.c(null, 1, null));
            }

            @Nullable
            public final Object k(@Nullable a<Key, Value> aVar, boolean z10, @Nullable kotlin.coroutines.d<? super a<Key, Value>> dVar) {
                b bVar = new b(this.f72048e, this.f72049f, dVar);
                bVar.f72046c = aVar;
                bVar.f72047d = z10;
                return bVar.invokeSuspend(Unit.f312394a);
            }
        }

        @kotlin.coroutines.jvm.internal.f(c = "androidx.paging.PageFetcher$flow$1$3$downstreamFlow$1", f = "PageFetcher.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
        @SourceDebugExtension({"SMAP\nPageFetcher.kt\nKotlin\n*S Kotlin\n*F\n+ 1 PageFetcher.kt\nandroidx/paging/PageFetcher$flow$1$3$downstreamFlow$1\n+ 2 PagingLogger.kt\nandroidx/paging/PagingLoggerKt\n*L\n1#1,256:1\n32#2,10:257\n*S KotlinDebug\n*F\n+ 1 PageFetcher.kt\nandroidx/paging/PageFetcher$flow$1$3$downstreamFlow$1\n*L\n128#1:257,10\n*E\n"})
        static final class c extends kotlin.coroutines.jvm.internal.o implements Function2<g1<Value>, kotlin.coroutines.d<? super Unit>, Object> {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            int f72050a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            /* synthetic */ Object f72051b;

            c(kotlin.coroutines.d<? super c> dVar) {
                super(2, dVar);
            }

            @Override // kotlin.coroutines.jvm.internal.a
            @NotNull
            public final kotlin.coroutines.d<Unit> create(@Nullable Object obj, @NotNull kotlin.coroutines.d<?> dVar) {
                c cVar = new c(dVar);
                cVar.f72051b = obj;
                return cVar;
            }

            @Override // kotlin.coroutines.jvm.internal.a
            @Nullable
            public final Object invokeSuspend(@NotNull Object obj) {
                kotlin.coroutines.intrinsics.b.l();
                if (this.f72050a != 0) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.m(obj);
                g1 g1Var = (g1) this.f72051b;
                f2 f2Var = f2.f71875a;
                if (f2Var.a(2)) {
                    f2Var.b(2, "Sent " + g1Var, null);
                }
                return Unit.f312394a;
            }

            @Override // kotlin.jvm.functions.Function2
            @Nullable
            /* JADX INFO: renamed from: k, reason: merged with bridge method [inline-methods] */
            public final Object invoke(@NotNull g1<Value> g1Var, @Nullable kotlin.coroutines.d<? super Unit> dVar) {
                return ((c) create(g1Var, dVar)).invokeSuspend(Unit.f312394a);
            }
        }

        /* JADX INFO: renamed from: androidx.paging.h1$d$d, reason: collision with other inner class name */
        /* synthetic */ class C0658d implements kotlinx.coroutines.flow.j, kotlin.jvm.internal.c0 {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            final /* synthetic */ a3<x1<Value>> f72052a;

            C0658d(a3<x1<Value>> a3Var) {
                this.f72052a = a3Var;
            }

            @Override // kotlinx.coroutines.flow.j
            @Nullable
            /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
            public final Object emit(@NotNull x1<Value> x1Var, @NotNull kotlin.coroutines.d<? super Unit> dVar) {
                Object objG = this.f72052a.G(x1Var, dVar);
                return objG == kotlin.coroutines.intrinsics.b.l() ? objG : Unit.f312394a;
            }

            @Override // kotlin.jvm.internal.c0
            @NotNull
            public final kotlin.x<?> b() {
                return new kotlin.jvm.internal.g0(2, this.f72052a, a3.class, "send", "send(Ljava/lang/Object;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", 0);
            }

            public final boolean equals(@Nullable Object obj) {
                if ((obj instanceof kotlinx.coroutines.flow.j) && (obj instanceof kotlin.jvm.internal.c0)) {
                    return Intrinsics.areEqual(b(), ((kotlin.jvm.internal.c0) obj).b());
                }
                return false;
            }

            public final int hashCode() {
                return b().hashCode();
            }
        }

        @kotlin.coroutines.jvm.internal.f(c = "androidx.paging.PageFetcher$flow$1$invokeSuspend$$inlined$simpleMapLatest$1", f = "PageFetcher.kt", i = {}, l = {105}, m = "invokeSuspend", n = {}, s = {})
        @SourceDebugExtension({"SMAP\nFlowExt.kt\nKotlin\n*S Kotlin\n*F\n+ 1 FlowExt.kt\nandroidx/paging/FlowExtKt$simpleMapLatest$1\n+ 2 PageFetcher.kt\nandroidx/paging/PageFetcher$flow$1\n*L\n1#1,224:1\n127#2:225\n126#2,8:226\n*E\n"})
        public static final class e extends kotlin.coroutines.jvm.internal.o implements pj.n<kotlinx.coroutines.flow.j<? super x1<Value>>, a<Key, Value>, kotlin.coroutines.d<? super Unit>, Object> {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            int f72053a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            private /* synthetic */ Object f72054b;

            /* JADX INFO: renamed from: c, reason: collision with root package name */
            /* synthetic */ Object f72055c;

            /* JADX INFO: renamed from: d, reason: collision with root package name */
            final /* synthetic */ h1 f72056d;

            /* JADX INFO: renamed from: e, reason: collision with root package name */
            final /* synthetic */ u2 f72057e;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public e(kotlin.coroutines.d dVar, h1 h1Var, u2 u2Var) {
                super(3, dVar);
                this.f72056d = h1Var;
                this.f72057e = u2Var;
            }

            @Override // kotlin.coroutines.jvm.internal.a
            @Nullable
            public final Object invokeSuspend(@NotNull Object obj) {
                Object objL = kotlin.coroutines.intrinsics.b.l();
                int i10 = this.f72053a;
                if (i10 == 0) {
                    ResultKt.m(obj);
                    kotlinx.coroutines.flow.j jVar = (kotlinx.coroutines.flow.j) this.f72054b;
                    a aVar = (a) this.f72055c;
                    kotlinx.coroutines.flow.i iVarH1 = kotlinx.coroutines.flow.k.h1(this.f72056d.j(aVar.b(), aVar.a(), this.f72057e), new c(null));
                    h1 h1Var = this.f72056d;
                    x1 x1Var = new x1(iVarH1, new c(h1Var, h1Var.f72028e), new b(this.f72056d, aVar.b()), null, 8, null);
                    this.f72053a = 1;
                    if (jVar.emit(x1Var, this) == objL) {
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
            @Nullable
            public final Object invoke(@NotNull kotlinx.coroutines.flow.j<? super x1<Value>> jVar, a<Key, Value> aVar, @Nullable kotlin.coroutines.d<? super Unit> dVar) {
                e eVar = new e(dVar, this.f72056d, this.f72057e);
                eVar.f72054b = jVar;
                eVar.f72055c = aVar;
                return eVar.invokeSuspend(Unit.f312394a);
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        d(s2<Key, Value> s2Var, h1<Key, Value> h1Var, kotlin.coroutines.d<? super d> dVar) {
            super(2, dVar);
            this.f72039c = s2Var;
            this.f72040d = h1Var;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        @NotNull
        public final kotlin.coroutines.d<Unit> create(@Nullable Object obj, @NotNull kotlin.coroutines.d<?> dVar) {
            d dVar2 = new d(this.f72039c, this.f72040d, dVar);
            dVar2.f72038b = obj;
            return dVar2;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            Object objL = kotlin.coroutines.intrinsics.b.l();
            int i10 = this.f72037a;
            int i11 = 6 << 1;
            if (i10 == 0) {
                ResultKt.m(obj);
                a3 a3Var = (a3) this.f72038b;
                s2<Key, Value> s2Var = this.f72039c;
                u2 u2VarA = s2Var != null ? v2.a(a3Var, s2Var) : null;
                kotlinx.coroutines.flow.i iVarH = d0.h(kotlinx.coroutines.flow.k.v0(d0.g(kotlinx.coroutines.flow.k.o1(((h1) this.f72040d).f72027d.a(), new a(u2VarA, null)), null, new b(u2VarA, this.f72040d, null))), new e(null, this.f72040d, u2VarA));
                C0658d c0658d = new C0658d(a3Var);
                this.f72037a = 1;
                if (iVarH.collect(c0658d, this) == objL) {
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
        /* JADX INFO: renamed from: k, reason: merged with bridge method [inline-methods] */
        public final Object invoke(@NotNull a3<x1<Value>> a3Var, @Nullable kotlin.coroutines.d<? super Unit> dVar) {
            return ((d) create(a3Var, dVar)).invokeSuspend(Unit.f312394a);
        }
    }

    @kotlin.coroutines.jvm.internal.f(c = "androidx.paging.PageFetcher", f = "PageFetcher.kt", i = {0, 0}, l = {210}, m = "generateNewPagingSource", n = {"this", "previousPagingSource"}, s = {"L$0", "L$1"})
    static final class e extends kotlin.coroutines.jvm.internal.d {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        Object f72058a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        Object f72059b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        /* synthetic */ Object f72060c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        final /* synthetic */ h1<Key, Value> f72061d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int f72062e;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        e(h1<Key, Value> h1Var, kotlin.coroutines.d<? super e> dVar) {
            super(dVar);
            this.f72061d = h1Var;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            this.f72060c = obj;
            this.f72062e |= Integer.MIN_VALUE;
            return this.f72061d.h(null, this);
        }
    }

    /* synthetic */ class f extends kotlin.jvm.internal.g0 implements Function0<Unit> {
        f(Object obj) {
            super(0, obj, h1.class, "invalidate", "invalidate()V", 0);
        }

        @Override // kotlin.jvm.functions.Function0
        public /* bridge */ /* synthetic */ Unit invoke() {
            invoke2();
            return Unit.f312394a;
        }

        /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
        public final void invoke2() {
            ((h1) this.receiver).k();
        }
    }

    /* synthetic */ class g extends kotlin.jvm.internal.g0 implements Function0<Unit> {
        g(Object obj) {
            super(0, obj, h1.class, "invalidate", "invalidate()V", 0);
        }

        @Override // kotlin.jvm.functions.Function0
        public /* bridge */ /* synthetic */ Unit invoke() {
            invoke2();
            return Unit.f312394a;
        }

        /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
        public final void invoke2() {
            ((h1) this.receiver).k();
        }
    }

    @kotlin.coroutines.jvm.internal.f(c = "androidx.paging.PageFetcher$injectRemoteEvents$1", f = "PageFetcher.kt", i = {}, l = {203}, m = "invokeSuspend", n = {}, s = {})
    @SourceDebugExtension({"SMAP\nPageFetcher.kt\nKotlin\n*S Kotlin\n*F\n+ 1 PageFetcher.kt\nandroidx/paging/PageFetcher$injectRemoteEvents$1\n+ 2 FlowExt.kt\nandroidx/paging/FlowExtKt\n*L\n1#1,256:1\n138#2:257\n*S KotlinDebug\n*F\n+ 1 PageFetcher.kt\nandroidx/paging/PageFetcher$injectRemoteEvents$1\n*L\n161#1:257\n*E\n"})
    static final class h extends kotlin.coroutines.jvm.internal.o implements Function2<a3<g1<Value>>, kotlin.coroutines.d<? super Unit>, Object> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        int f72063a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private /* synthetic */ Object f72064b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ u2<Key, Value> f72065c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        final /* synthetic */ i1<Key, Value> f72066d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        final /* synthetic */ e1 f72067e;

        static final class a<T> implements kotlinx.coroutines.flow.j {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            final /* synthetic */ a3<g1<Value>> f72068a;

            a(a3<g1<Value>> a3Var) {
                this.f72068a = a3Var;
            }

            @Override // kotlinx.coroutines.flow.j
            @Nullable
            /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
            public final Object emit(@NotNull g1<Value> g1Var, @NotNull kotlin.coroutines.d<? super Unit> dVar) {
                Object objG = this.f72068a.G(g1Var, dVar);
                return objG == kotlin.coroutines.intrinsics.b.l() ? objG : Unit.f312394a;
            }
        }

        @kotlin.coroutines.jvm.internal.f(c = "androidx.paging.PageFetcher$injectRemoteEvents$1$invokeSuspend$$inlined$combineWithoutBatching$1", f = "PageFetcher.kt", i = {}, l = {161}, m = "invokeSuspend", n = {}, s = {})
        @SourceDebugExtension({"SMAP\nFlowExt.kt\nKotlin\n*S Kotlin\n*F\n+ 1 FlowExt.kt\nandroidx/paging/FlowExtKt$combineWithoutBatching$2\n+ 2 _Arrays.kt\nkotlin/collections/ArraysKt___ArraysKt\n*L\n1#1,224:1\n13644#2,3:225\n*S KotlinDebug\n*F\n+ 1 FlowExt.kt\nandroidx/paging/FlowExtKt$combineWithoutBatching$2\n*L\n144#1:225,3\n*E\n"})
        public static final class b extends kotlin.coroutines.jvm.internal.o implements Function2<a3<g1<Value>>, kotlin.coroutines.d<? super Unit>, Object> {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            int f72069a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            private /* synthetic */ Object f72070b;

            /* JADX INFO: renamed from: c, reason: collision with root package name */
            final /* synthetic */ kotlinx.coroutines.flow.i f72071c;

            /* JADX INFO: renamed from: d, reason: collision with root package name */
            final /* synthetic */ kotlinx.coroutines.flow.i f72072d;

            /* JADX INFO: renamed from: e, reason: collision with root package name */
            final /* synthetic */ e1 f72073e;

            @kotlin.coroutines.jvm.internal.f(c = "androidx.paging.PageFetcher$injectRemoteEvents$1$invokeSuspend$$inlined$combineWithoutBatching$1$1", f = "PageFetcher.kt", i = {}, l = {androidx.media2.widget.f.i.f59775g0}, m = "invokeSuspend", n = {}, s = {})
            @SourceDebugExtension({"SMAP\nFlowExt.kt\nKotlin\n*S Kotlin\n*F\n+ 1 FlowExt.kt\nandroidx/paging/FlowExtKt$combineWithoutBatching$2$unbatchedFlowCombiner$1\n+ 2 PageFetcher.kt\nandroidx/paging/PageFetcher$injectRemoteEvents$1\n*L\n1#1,224:1\n162#2,38:225\n*E\n"})
            public static final class a extends kotlin.coroutines.jvm.internal.o implements pj.o<z0, g1<Value>, m, kotlin.coroutines.d<? super Unit>, Object> {

                /* JADX INFO: renamed from: a, reason: collision with root package name */
                int f72074a;

                /* JADX INFO: renamed from: b, reason: collision with root package name */
                /* synthetic */ Object f72075b;

                /* JADX INFO: renamed from: c, reason: collision with root package name */
                /* synthetic */ Object f72076c;

                /* JADX INFO: renamed from: d, reason: collision with root package name */
                /* synthetic */ Object f72077d;

                /* JADX INFO: renamed from: e, reason: collision with root package name */
                final /* synthetic */ a3<g1<Value>> f72078e;

                /* JADX INFO: renamed from: f, reason: collision with root package name */
                final /* synthetic */ e1 f72079f;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                public a(a3 a3Var, kotlin.coroutines.d dVar, e1 e1Var) {
                    super(4, dVar);
                    this.f72079f = e1Var;
                    this.f72078e = a3Var;
                }

                @Override // kotlin.coroutines.jvm.internal.a
                @Nullable
                public final Object invokeSuspend(@NotNull Object obj) {
                    Object objL = kotlin.coroutines.intrinsics.b.l();
                    int i10 = this.f72074a;
                    if (i10 == 0) {
                        ResultKt.m(obj);
                        Object obj2 = this.f72075b;
                        Object obj3 = this.f72076c;
                        m mVar = (m) this.f72077d;
                        a3<g1<Value>> a3Var = this.f72078e;
                        Object cVar = (g1) obj3;
                        z0 z0Var = (z0) obj2;
                        if (mVar == m.RECEIVER) {
                            cVar = new g1.c(this.f72079f.j(), z0Var);
                        } else if (cVar instanceof g1.b) {
                            g1.b bVar = (g1.b) cVar;
                            this.f72079f.e(bVar.u());
                            cVar = g1.b.o(bVar, null, null, 0, 0, bVar.u(), z0Var, 15, null);
                        } else if (cVar instanceof g1.a) {
                            this.f72079f.f(((g1.a) cVar).m(), x0.c.f72693b.b());
                        } else {
                            if (!(cVar instanceof g1.c)) {
                                if (cVar instanceof g1.d) {
                                    throw new IllegalStateException("Paging generated an event to display a static list that\n originated from a paginated source. If you see this\n exception, it is most likely a bug in the library.\n Please file a bug so we can fix it at:\n https://issuetracker.google.com/issues/new?component=413106");
                                }
                                throw new kotlin.k0();
                            }
                            g1.c cVar2 = (g1.c) cVar;
                            this.f72079f.e(cVar2.l());
                            cVar = new g1.c(cVar2.l(), z0Var);
                        }
                        this.f72074a = 1;
                        if (a3Var.G(cVar, this) == objL) {
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

                @Override // pj.o
                @Nullable
                /* JADX INFO: renamed from: k, reason: merged with bridge method [inline-methods] */
                public final Object invoke(z0 z0Var, g1<Value> g1Var, @NotNull m mVar, @Nullable kotlin.coroutines.d<? super Unit> dVar) {
                    a aVar = new a(this.f72078e, dVar, this.f72079f);
                    aVar.f72075b = z0Var;
                    aVar.f72076c = g1Var;
                    aVar.f72077d = mVar;
                    return aVar.invokeSuspend(Unit.f312394a);
                }
            }

            /* JADX INFO: renamed from: androidx.paging.h1$h$b$b, reason: collision with other inner class name */
            @kotlin.coroutines.jvm.internal.f(c = "androidx.paging.FlowExtKt$combineWithoutBatching$2$1$1", f = "FlowExt.kt", i = {}, l = {com.planner5d.library.engine.input.f.b.F1}, m = "invokeSuspend", n = {}, s = {})
            @SourceDebugExtension({"SMAP\nFlowExt.kt\nKotlin\n*S Kotlin\n*F\n+ 1 FlowExt.kt\nandroidx/paging/FlowExtKt$combineWithoutBatching$2$1$1\n*L\n1#1,224:1\n*E\n"})
            public static final class C0659b extends kotlin.coroutines.jvm.internal.o implements Function2<kotlinx.coroutines.s0, kotlin.coroutines.d<? super Unit>, Object> {

                /* JADX INFO: renamed from: a, reason: collision with root package name */
                int f72080a;

                /* JADX INFO: renamed from: b, reason: collision with root package name */
                final /* synthetic */ a3<g1<Value>> f72081b;

                /* JADX INFO: renamed from: c, reason: collision with root package name */
                final /* synthetic */ kotlinx.coroutines.flow.i f72082c;

                /* JADX INFO: renamed from: d, reason: collision with root package name */
                final /* synthetic */ AtomicInteger f72083d;

                /* JADX INFO: renamed from: e, reason: collision with root package name */
                final /* synthetic */ i3 f72084e;

                /* JADX INFO: renamed from: f, reason: collision with root package name */
                final /* synthetic */ int f72085f;

                /* JADX INFO: renamed from: androidx.paging.h1$h$b$b$a */
                @SourceDebugExtension({"SMAP\nFlowExt.kt\nKotlin\n*S Kotlin\n*F\n+ 1 FlowExt.kt\nandroidx/paging/FlowExtKt$combineWithoutBatching$2$1$1$1\n*L\n1#1,224:1\n*E\n"})
                public static final class a<T> implements kotlinx.coroutines.flow.j {

                    /* JADX INFO: renamed from: a, reason: collision with root package name */
                    final /* synthetic */ i3 f72086a;

                    /* JADX INFO: renamed from: b, reason: collision with root package name */
                    final /* synthetic */ int f72087b;

                    /* JADX INFO: renamed from: androidx.paging.h1$h$b$b$a$a, reason: collision with other inner class name */
                    @SourceDebugExtension({"SMAP\nFlowExt.kt\nKotlin\n*S Kotlin\n*F\n+ 1 FlowExt.kt\nandroidx/paging/FlowExtKt$combineWithoutBatching$2$1$1$1$emit$1\n*L\n1#1,224:1\n*E\n"})
                    static final class C0660a extends kotlin.coroutines.jvm.internal.d {

                        /* JADX INFO: renamed from: a, reason: collision with root package name */
                        /* synthetic */ Object f72088a;

                        /* JADX INFO: renamed from: b, reason: collision with root package name */
                        int f72089b;

                        C0660a(kotlin.coroutines.d dVar) {
                            super(dVar);
                        }

                        @Override // kotlin.coroutines.jvm.internal.a
                        @Nullable
                        public final Object invokeSuspend(@NotNull Object obj) {
                            this.f72088a = obj;
                            this.f72089b |= Integer.MIN_VALUE;
                            return a.this.emit(null, this);
                        }
                    }

                    public a(i3 i3Var, int i10) {
                        this.f72086a = i3Var;
                        this.f72087b = i10;
                    }

                    /* JADX WARN: Code duplicated, block: B:7:0x0016  */
                    /* JADX WARN: Code restructure failed: missing block: B:21:0x005a, code lost:
                    
                        if (kotlinx.coroutines.h4.a(r0) == r1) goto L22;
                     */
                    @Override // kotlinx.coroutines.flow.j
                    @org.jetbrains.annotations.Nullable
                    /*
                        Code decompiled incorrectly, please refer to instructions dump.
                        To view partially-correct add '--show-bad-code' argument
                    */
                    public final java.lang.Object emit(@org.jetbrains.annotations.Nullable java.lang.Object r7, @org.jetbrains.annotations.NotNull kotlin.coroutines.d<? super kotlin.Unit> r8) {
                        /*
                            r6 = this;
                            java.lang.String r5 = "Androeed.ru"
                            boolean r0 = r8 instanceof androidx.paging.h1.h.b.C0659b.a.C0660a
                            if (r0 == 0) goto L16
                            r0 = r8
                            r5 = 6
                            androidx.paging.h1$h$b$b$a$a r0 = (androidx.paging.h1.h.b.C0659b.a.C0660a) r0
                            int r1 = r0.f72089b
                            r2 = -2147483648(0xffffffff80000000, float:-0.0)
                            r3 = r1 & r2
                            if (r3 == 0) goto L16
                            int r1 = r1 - r2
                            r0.f72089b = r1
                            goto L1b
                        L16:
                            androidx.paging.h1$h$b$b$a$a r0 = new androidx.paging.h1$h$b$b$a$a
                            r0.<init>(r8)
                        L1b:
                            java.lang.Object r8 = r0.f72088a
                            java.lang.Object r1 = kotlin.coroutines.intrinsics.b.l()
                            r5 = 3
                            int r2 = r0.f72089b
                            r5 = 1
                            r3 = 2
                            r5 = 1
                            r4 = 1
                            r5 = 4
                            if (r2 == 0) goto L41
                            if (r2 == r4) goto L3d
                            r5 = 1
                            if (r2 != r3) goto L35
                            r5 = 3
                            kotlin.ResultKt.m(r8)
                            goto L5d
                        L35:
                            java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
                            java.lang.String r7 = "call to 'resume' before 'invoke' with coroutine"
                            r6.<init>(r7)
                            throw r6
                        L3d:
                            kotlin.ResultKt.m(r8)
                            goto L54
                        L41:
                            r5 = 4
                            kotlin.ResultKt.m(r8)
                            androidx.paging.i3 r8 = r6.f72086a
                            int r6 = r6.f72087b
                            r0.f72089b = r4
                            r5 = 3
                            java.lang.Object r6 = r8.a(r6, r7, r0)
                            r5 = 6
                            if (r6 != r1) goto L54
                            goto L5c
                        L54:
                            r0.f72089b = r3
                            java.lang.Object r6 = kotlinx.coroutines.h4.a(r0)
                            if (r6 != r1) goto L5d
                        L5c:
                            return r1
                        L5d:
                            kotlin.Unit r6 = kotlin.Unit.f312394a
                            return r6
                        */
                        throw new UnsupportedOperationException("Method not decompiled: androidx.paging.h1.h.b.C0659b.a.emit(java.lang.Object, kotlin.coroutines.d):java.lang.Object");
                    }
                }

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                public C0659b(kotlinx.coroutines.flow.i iVar, AtomicInteger atomicInteger, a3 a3Var, i3 i3Var, int i10, kotlin.coroutines.d dVar) {
                    super(2, dVar);
                    this.f72082c = iVar;
                    this.f72083d = atomicInteger;
                    this.f72084e = i3Var;
                    this.f72085f = i10;
                    this.f72081b = a3Var;
                }

                @Override // kotlin.coroutines.jvm.internal.a
                @NotNull
                public final kotlin.coroutines.d<Unit> create(@Nullable Object obj, @NotNull kotlin.coroutines.d<?> dVar) {
                    return new C0659b(this.f72082c, this.f72083d, this.f72081b, this.f72084e, this.f72085f, dVar);
                }

                @Override // kotlin.coroutines.jvm.internal.a
                @Nullable
                public final Object invokeSuspend(@NotNull Object obj) {
                    Object objL = kotlin.coroutines.intrinsics.b.l();
                    int i10 = this.f72080a;
                    try {
                        if (i10 == 0) {
                            ResultKt.m(obj);
                            kotlinx.coroutines.flow.i iVar = this.f72082c;
                            a aVar = new a(this.f72084e, this.f72085f);
                            this.f72080a = 1;
                            if (iVar.collect(aVar, this) == objL) {
                                return objL;
                            }
                        } else {
                            if (i10 != 1) {
                                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                            }
                            ResultKt.m(obj);
                        }
                        if (this.f72083d.decrementAndGet() == 0) {
                            kotlinx.coroutines.channels.o0.a.a(this.f72081b, null, 1, null);
                        }
                        return Unit.f312394a;
                    } catch (Throwable th2) {
                        if (this.f72083d.decrementAndGet() == 0) {
                            kotlinx.coroutines.channels.o0.a.a(this.f72081b, null, 1, null);
                        }
                        throw th2;
                    }
                }

                @Override // kotlin.jvm.functions.Function2
                @Nullable
                public final Object invoke(@NotNull kotlinx.coroutines.s0 s0Var, @Nullable kotlin.coroutines.d<? super Unit> dVar) {
                    return ((C0659b) create(s0Var, dVar)).invokeSuspend(Unit.f312394a);
                }
            }

            @SourceDebugExtension({"SMAP\nFlowExt.kt\nKotlin\n*S Kotlin\n*F\n+ 1 FlowExt.kt\nandroidx/paging/FlowExtKt$combineWithoutBatching$2$2\n*L\n1#1,224:1\n*E\n"})
            public static final class c extends kotlin.jvm.internal.l0 implements Function0<Unit> {

                /* JADX INFO: renamed from: a, reason: collision with root package name */
                final /* synthetic */ kotlinx.coroutines.a0 f72091a;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                public c(kotlinx.coroutines.a0 a0Var) {
                    super(0);
                    this.f72091a = a0Var;
                }

                @Override // kotlin.jvm.functions.Function0
                public /* bridge */ /* synthetic */ Unit invoke() {
                    invoke2();
                    return Unit.f312394a;
                }

                /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
                public final void invoke2() {
                    kotlinx.coroutines.p2.a.b(this.f72091a, null, 1, null);
                }
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public b(kotlinx.coroutines.flow.i iVar, kotlinx.coroutines.flow.i iVar2, kotlin.coroutines.d dVar, e1 e1Var) {
                super(2, dVar);
                this.f72071c = iVar;
                this.f72072d = iVar2;
                this.f72073e = e1Var;
            }

            @Override // kotlin.coroutines.jvm.internal.a
            @NotNull
            public final kotlin.coroutines.d<Unit> create(@Nullable Object obj, @NotNull kotlin.coroutines.d<?> dVar) {
                b bVar = new b(this.f72071c, this.f72072d, dVar, this.f72073e);
                bVar.f72070b = obj;
                return bVar;
            }

            @Override // kotlin.coroutines.jvm.internal.a
            @Nullable
            public final Object invokeSuspend(@NotNull Object obj) {
                Object objL = kotlin.coroutines.intrinsics.b.l();
                int i10 = this.f72069a;
                if (i10 == 0) {
                    ResultKt.m(obj);
                    a3 a3Var = (a3) this.f72070b;
                    AtomicInteger atomicInteger = new AtomicInteger(2);
                    i3 i3Var = new i3(new a(a3Var, null, this.f72073e));
                    kotlinx.coroutines.a0 a0VarC = kotlinx.coroutines.u2.c(null, 1, null);
                    int i11 = 0;
                    kotlinx.coroutines.flow.i[] iVarArr = {this.f72071c, this.f72072d};
                    int i12 = 0;
                    while (i12 < 2) {
                        a3 a3Var2 = a3Var;
                        a3Var = a3Var2;
                        kotlinx.coroutines.k.f(a3Var, a0VarC, null, new C0659b(iVarArr[i12], atomicInteger, a3Var2, i3Var, i11, null), 2, null);
                        i12++;
                        atomicInteger = atomicInteger;
                        i11++;
                        i3Var = i3Var;
                    }
                    c cVar = new c(a0VarC);
                    this.f72069a = 1;
                    if (a3Var.U0(cVar, this) == objL) {
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
            /* JADX INFO: renamed from: k, reason: merged with bridge method [inline-methods] */
            public final Object invoke(@NotNull a3<g1<Value>> a3Var, @Nullable kotlin.coroutines.d<? super Unit> dVar) {
                return ((b) create(a3Var, dVar)).invokeSuspend(Unit.f312394a);
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        h(u2<Key, Value> u2Var, i1<Key, Value> i1Var, e1 e1Var, kotlin.coroutines.d<? super h> dVar) {
            super(2, dVar);
            this.f72065c = u2Var;
            this.f72066d = i1Var;
            this.f72067e = e1Var;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        @NotNull
        public final kotlin.coroutines.d<Unit> create(@Nullable Object obj, @NotNull kotlin.coroutines.d<?> dVar) {
            h hVar = new h(this.f72065c, this.f72066d, this.f72067e, dVar);
            hVar.f72064b = obj;
            return hVar;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            Object objL = kotlin.coroutines.intrinsics.b.l();
            int i10 = this.f72063a;
            if (i10 == 0) {
                ResultKt.m(obj);
                a3 a3Var = (a3) this.f72064b;
                kotlinx.coroutines.flow.i iVarA = z2.a(new b(this.f72065c.getState(), this.f72066d.w(), null, this.f72067e));
                a aVar = new a(a3Var);
                this.f72063a = 1;
                if (iVarA.collect(aVar, this) == objL) {
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
        /* JADX INFO: renamed from: k, reason: merged with bridge method [inline-methods] */
        public final Object invoke(@NotNull a3<g1<Value>> a3Var, @Nullable kotlin.coroutines.d<? super Unit> dVar) {
            return ((h) create(a3Var, dVar)).invokeSuspend(Unit.f312394a);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public h1(@NotNull Function1<? super kotlin.coroutines.d<? super h2<Key, Value>>, ? extends Object> pagingSourceFactory, @Nullable Key key, @NotNull w1 config, @Nullable s2<Key, Value> s2Var) {
        Intrinsics.checkNotNullParameter(pagingSourceFactory, "pagingSourceFactory");
        Intrinsics.checkNotNullParameter(config, "config");
        this.f72024a = pagingSourceFactory;
        this.f72025b = key;
        this.f72026c = config;
        this.f72027d = new q<>(null, 1, null);
        this.f72028e = new q<>(null, 1, null);
        this.f72029f = z2.a(new d(s2Var, this, null));
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Code duplicated, block: B:7:0x0017  */
    /* JADX WARN: Multi-variable type inference failed */
    public final Object h(h2<Key, Value> h2Var, kotlin.coroutines.d<? super h2<Key, Value>> dVar) {
        e eVar;
        if (dVar instanceof e) {
            eVar = (e) dVar;
            int i10 = eVar.f72062e;
            if ((i10 & Integer.MIN_VALUE) != 0) {
                eVar.f72062e = i10 - Integer.MIN_VALUE;
            } else {
                eVar = new e(this, dVar);
            }
        } else {
            eVar = new e(this, dVar);
        }
        Object objInvoke = eVar.f72060c;
        Object objL = kotlin.coroutines.intrinsics.b.l();
        int i11 = eVar.f72062e;
        if (i11 == 0) {
            ResultKt.m(objInvoke);
            Function1<kotlin.coroutines.d<? super h2<Key, Value>>, Object> function1 = this.f72024a;
            eVar.f72058a = this;
            eVar.f72059b = h2Var;
            eVar.f72062e = 1;
            objInvoke = function1.invoke(eVar);
            if (objInvoke == objL) {
                return objL;
            }
        } else {
            if (i11 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            h2Var = (h2) eVar.f72059b;
            this = (h1) eVar.f72058a;
            ResultKt.m(objInvoke);
        }
        h2 h2Var2 = (h2) objInvoke;
        if (h2Var2 instanceof p) {
            ((p) h2Var2).a(this.f72026c.f72683a);
        }
        if (h2Var2 == h2Var) {
            throw new IllegalStateException("An instance of PagingSource was re-used when Pager expected to create a new\ninstance. Ensure that the pagingSourceFactory passed to Pager always returns a\nnew instance of PagingSource.");
        }
        h2Var2.registerInvalidatedCallback(new f(this));
        if (h2Var != null) {
            h2Var.unregisterInvalidatedCallback(new g(this));
        }
        if (h2Var != null) {
            h2Var.invalidate();
        }
        f2 f2Var = f2.f71875a;
        if (f2Var.a(3)) {
            f2Var.b(3, "Generated new PagingSource " + h2Var2, null);
        }
        return h2Var2;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final kotlinx.coroutines.flow.i<g1<Value>> j(i1<Key, Value> i1Var, kotlinx.coroutines.p2 p2Var, u2<Key, Value> u2Var) {
        return u2Var == null ? i1Var.w() : k.a(p2Var, new h(u2Var, i1Var, new e1(), null));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void k() {
        this.f72027d.b(Boolean.FALSE);
    }

    @NotNull
    public final kotlinx.coroutines.flow.i<x1<Value>> i() {
        return this.f72029f;
    }

    public final void l() {
        this.f72027d.b(Boolean.TRUE);
    }

    public /* synthetic */ h1(Function1 function1, Object obj, w1 w1Var, s2 s2Var, int i10, DefaultConstructorMarker defaultConstructorMarker) {
        this(function1, obj, w1Var, (i10 & 8) != 0 ? null : s2Var);
    }
}
