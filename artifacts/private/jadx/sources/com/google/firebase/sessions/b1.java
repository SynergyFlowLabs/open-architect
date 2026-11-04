package com.google.firebase.sessions;

import com.devtodev.analytics.internal.storage.sqlite.UserEntry;
import java.util.Map;
import java.util.Objects;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.CoroutineContext;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes5.dex */
@ij.f
@SourceDebugExtension({"SMAP\nSharedSessionRepository.kt\nKotlin\n*S Kotlin\n*F\n+ 1 SharedSessionRepository.kt\ncom/google/firebase/sessions/SharedSessionRepositoryImpl\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,257:1\n1863#2,2:258\n*S KotlinDebug\n*F\n+ 1 SharedSessionRepository.kt\ncom/google/firebase/sessions/SharedSessionRepositoryImpl\n*L\n199#1:258,2\n*E\n"})
public final class b1 implements a1 {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NotNull
    private final com.google.firebase.sessions.settings.i f124885b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @NotNull
    private final v0 f124886c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @NotNull
    private final s0 f124887d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    @NotNull
    private final d1 f124888e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    @NotNull
    private final androidx.datastore.core.l<SessionData> f124889f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    @NotNull
    private final e0 f124890g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    @NotNull
    private final CoroutineContext f124891h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public SessionData f124892i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private boolean f124893j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    @NotNull
    private b f124894k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    @NotNull
    private String f124895l;

    @kotlin.coroutines.jvm.internal.f(c = "com.google.firebase.sessions.SharedSessionRepositoryImpl$1", f = "SharedSessionRepository.kt", i = {}, l = {com.planner5d.library.engine.input.f.b.f160703k1}, m = "invokeSuspend", n = {}, s = {})
    static final class a extends kotlin.coroutines.jvm.internal.o implements Function2<kotlinx.coroutines.s0, kotlin.coroutines.d<? super Unit>, Object> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        int f124896a;

        /* JADX INFO: renamed from: com.google.firebase.sessions.b1$a$a, reason: collision with other inner class name */
        @kotlin.coroutines.jvm.internal.f(c = "com.google.firebase.sessions.SharedSessionRepositoryImpl$1$1", f = "SharedSessionRepository.kt", i = {}, l = {com.planner5d.library.engine.input.f.b.f160697i1}, m = "invokeSuspend", n = {}, s = {})
        static final class C1189a extends kotlin.coroutines.jvm.internal.o implements pj.n<kotlinx.coroutines.flow.j<? super SessionData>, Throwable, kotlin.coroutines.d<? super Unit>, Object> {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            int f124898a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            private /* synthetic */ Object f124899b;

            /* JADX INFO: renamed from: c, reason: collision with root package name */
            /* synthetic */ Object f124900c;

            /* JADX INFO: renamed from: d, reason: collision with root package name */
            final /* synthetic */ b1 f124901d;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            C1189a(b1 b1Var, kotlin.coroutines.d<? super C1189a> dVar) {
                super(3, dVar);
                this.f124901d = b1Var;
            }

            @Override // kotlin.coroutines.jvm.internal.a
            public final Object invokeSuspend(Object obj) {
                Object objL = kotlin.coroutines.intrinsics.b.l();
                int i10 = this.f124898a;
                if (i10 == 0) {
                    ResultKt.m(obj);
                    kotlinx.coroutines.flow.j jVar = (kotlinx.coroutines.flow.j) this.f124899b;
                    Throwable th2 = (Throwable) this.f124900c;
                    SessionData sessionData = new SessionData(this.f124901d.f124886c.a(null), (Time) null, (Map) null, 4, (DefaultConstructorMarker) null);
                    th2.getMessage();
                    sessionData.i().h();
                    this.f124899b = null;
                    this.f124898a = 1;
                    if (jVar.emit(sessionData, this) == objL) {
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
            public final Object invoke(kotlinx.coroutines.flow.j<? super SessionData> jVar, Throwable th2, kotlin.coroutines.d<? super Unit> dVar) {
                C1189a c1189a = new C1189a(this.f124901d, dVar);
                c1189a.f124899b = jVar;
                c1189a.f124900c = th2;
                return c1189a.invokeSuspend(Unit.f312394a);
            }
        }

        static final class b<T> implements kotlinx.coroutines.flow.j {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            final /* synthetic */ b1 f124902a;

            b(b1 b1Var) {
                this.f124902a = b1Var;
            }

            @Override // kotlinx.coroutines.flow.j
            /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
            public final Object emit(SessionData sessionData, kotlin.coroutines.d<? super Unit> dVar) {
                this.f124902a.s(sessionData);
                Object objR = this.f124902a.r(sessionData.i().h(), b.GENERAL, dVar);
                return objR == kotlin.coroutines.intrinsics.b.l() ? objR : Unit.f312394a;
            }
        }

        a(kotlin.coroutines.d<? super a> dVar) {
            super(2, dVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final kotlin.coroutines.d<Unit> create(Object obj, kotlin.coroutines.d<?> dVar) {
            return b1.this.new a(dVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            Object objL = kotlin.coroutines.intrinsics.b.l();
            int i10 = this.f124896a;
            if (i10 == 0) {
                ResultKt.m(obj);
                kotlinx.coroutines.flow.i iVarV = kotlinx.coroutines.flow.k.v(b1.this.f124889f.getData(), new C1189a(b1.this, null));
                b bVar = new b(b1.this);
                this.f124896a = 1;
                if (iVarV.collect(bVar, this) == objL) {
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
        public final Object invoke(kotlinx.coroutines.s0 s0Var, kotlin.coroutines.d<? super Unit> dVar) {
            return ((a) create(s0Var, dVar)).invokeSuspend(Unit.f312394a);
        }
    }

    public enum b {
        GENERAL,
        FALLBACK;


        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private static final /* synthetic */ kotlin.enums.a f124906d = kotlin.enums.c.c(k());

        @NotNull
        public static kotlin.enums.a<b> l() {
            return f124906d;
        }
    }

    public /* synthetic */ class c {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f124907a;

        static {
            int[] iArr = new int[b.values().length];
            try {
                iArr[b.GENERAL.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[b.FALLBACK.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            f124907a = iArr;
        }
    }

    @kotlin.coroutines.jvm.internal.f(c = "com.google.firebase.sessions.SharedSessionRepositoryImpl$appBackground$1", f = "SharedSessionRepository.kt", i = {}, l = {com.planner5d.library.engine.input.f.b.B}, m = "invokeSuspend", n = {}, s = {})
    static final class d extends kotlin.coroutines.jvm.internal.o implements Function2<kotlinx.coroutines.s0, kotlin.coroutines.d<? super Unit>, Object> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        int f124908a;

        @kotlin.coroutines.jvm.internal.f(c = "com.google.firebase.sessions.SharedSessionRepositoryImpl$appBackground$1$1", f = "SharedSessionRepository.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
        static final class a extends kotlin.coroutines.jvm.internal.o implements Function2<SessionData, kotlin.coroutines.d<? super SessionData>, Object> {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            int f124910a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            /* synthetic */ Object f124911b;

            /* JADX INFO: renamed from: c, reason: collision with root package name */
            final /* synthetic */ b1 f124912c;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            a(b1 b1Var, kotlin.coroutines.d<? super a> dVar) {
                super(2, dVar);
                this.f124912c = b1Var;
            }

            @Override // kotlin.coroutines.jvm.internal.a
            public final kotlin.coroutines.d<Unit> create(Object obj, kotlin.coroutines.d<?> dVar) {
                a aVar = new a(this.f124912c, dVar);
                aVar.f124911b = obj;
                return aVar;
            }

            @Override // kotlin.coroutines.jvm.internal.a
            public final Object invokeSuspend(Object obj) {
                kotlin.coroutines.intrinsics.b.l();
                if (this.f124910a != 0) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.m(obj);
                return SessionData.f((SessionData) this.f124911b, null, this.f124912c.f124888e.b(), null, 5, null);
            }

            @Override // kotlin.jvm.functions.Function2
            /* JADX INFO: renamed from: k, reason: merged with bridge method [inline-methods] */
            public final Object invoke(SessionData sessionData, kotlin.coroutines.d<? super SessionData> dVar) {
                return ((a) create(sessionData, dVar)).invokeSuspend(Unit.f312394a);
            }
        }

        d(kotlin.coroutines.d<? super d> dVar) {
            super(2, dVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final kotlin.coroutines.d<Unit> create(Object obj, kotlin.coroutines.d<?> dVar) {
            return b1.this.new d(dVar);
        }

        /* JADX WARN: Multi-variable type inference failed */
        /* JADX WARN: Type inference failed for: r7v10 */
        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            Object objL = kotlin.coroutines.intrinsics.b.l();
            int i10 = this.f124908a;
            try {
                if (i10 == 0) {
                    ResultKt.m(obj);
                    androidx.datastore.core.l lVar = b1.this.f124889f;
                    a aVar = new a(b1.this, null);
                    this.f124908a = 1;
                    Object objA = lVar.a(aVar, this);
                    this = objA;
                    if (objA == objL) {
                        return objL;
                    }
                } else {
                    if (i10 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    ResultKt.m(obj);
                    this = this;
                }
            } catch (Exception e10) {
                e10.getMessage();
                b1 b1Var = b1.this;
                b1Var.s(SessionData.f(b1Var.m(), null, b1.this.f124888e.b(), null, 5, null));
            }
            return Unit.f312394a;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(kotlinx.coroutines.s0 s0Var, kotlin.coroutines.d<? super Unit> dVar) {
            return ((d) create(s0Var, dVar)).invokeSuspend(Unit.f312394a);
        }
    }

    @kotlin.coroutines.jvm.internal.f(c = "com.google.firebase.sessions.SharedSessionRepositoryImpl$appForeground$1", f = "SharedSessionRepository.kt", i = {}, l = {135, 186}, m = "invokeSuspend", n = {}, s = {})
    static final class e extends kotlin.coroutines.jvm.internal.o implements Function2<kotlinx.coroutines.s0, kotlin.coroutines.d<? super Unit>, Object> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        int f124913a;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ SessionData f124915c;

        @kotlin.coroutines.jvm.internal.f(c = "com.google.firebase.sessions.SharedSessionRepositoryImpl$appForeground$1$1", f = "SharedSessionRepository.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
        static final class a extends kotlin.coroutines.jvm.internal.o implements Function2<SessionData, kotlin.coroutines.d<? super SessionData>, Object> {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            int f124916a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            /* synthetic */ Object f124917b;

            /* JADX INFO: renamed from: c, reason: collision with root package name */
            final /* synthetic */ b1 f124918c;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            a(b1 b1Var, kotlin.coroutines.d<? super a> dVar) {
                super(2, dVar);
                this.f124918c = b1Var;
            }

            @Override // kotlin.coroutines.jvm.internal.a
            public final kotlin.coroutines.d<Unit> create(Object obj, kotlin.coroutines.d<?> dVar) {
                a aVar = new a(this.f124918c, dVar);
                aVar.f124917b = obj;
                return aVar;
            }

            @Override // kotlin.coroutines.jvm.internal.a
            public final Object invokeSuspend(Object obj) {
                Map<String, ProcessData> mapG;
                kotlin.coroutines.intrinsics.b.l();
                if (this.f124916a != 0) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.m(obj);
                SessionData sessionData = (SessionData) this.f124917b;
                boolean zQ = this.f124918c.q(sessionData);
                boolean zO = this.f124918c.o(sessionData);
                boolean zP = this.f124918c.p(sessionData);
                if (zO) {
                    mapG = this.f124918c.f124890g.e();
                } else {
                    mapG = zP ? this.f124918c.f124890g.g(sessionData.h()) : sessionData.h();
                }
                SessionDetails sessionDetailsI = zO ? null : sessionData.i();
                if (!zQ && !zO) {
                    return zP ? SessionData.f(sessionData, null, null, this.f124918c.f124890g.g(mapG), 3, null) : sessionData;
                }
                SessionDetails sessionDetailsA = this.f124918c.f124886c.a(sessionDetailsI);
                this.f124918c.f124887d.a(sessionDetailsA);
                this.f124918c.f124890g.h();
                return sessionData.e(sessionDetailsA, null, mapG);
            }

            @Override // kotlin.jvm.functions.Function2
            /* JADX INFO: renamed from: k, reason: merged with bridge method [inline-methods] */
            public final Object invoke(SessionData sessionData, kotlin.coroutines.d<? super SessionData> dVar) {
                return ((a) create(sessionData, dVar)).invokeSuspend(Unit.f312394a);
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        e(SessionData sessionData, kotlin.coroutines.d<? super e> dVar) {
            super(2, dVar);
            this.f124915c = sessionData;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final kotlin.coroutines.d<Unit> create(Object obj, kotlin.coroutines.d<?> dVar) {
            return b1.this.new e(this.f124915c, dVar);
        }

        /* JADX WARN: Code restructure failed: missing block: B:17:0x0043, code lost:
        
            if (r10 == r1) goto L23;
         */
        /* JADX WARN: Code restructure failed: missing block: B:22:0x0094, code lost:
        
            if (r11.r(r0, r3, r10) == r1) goto L23;
         */
        /* JADX WARN: Code restructure failed: missing block: B:24:0x0097, code lost:
        
            return r1;
         */
        /* JADX WARN: Multi-variable type inference failed */
        /* JADX WARN: Type inference failed for: r10v8 */
        @Override // kotlin.coroutines.jvm.internal.a
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public final java.lang.Object invokeSuspend(java.lang.Object r11) {
            /*
                r10 = this;
                java.lang.Object r1 = kotlin.coroutines.intrinsics.b.l()
                int r0 = r10.f124913a
                r2 = 2
                r3 = 1
                if (r0 == 0) goto L27
                if (r0 == r3) goto L1f
                r9 = 2
                if (r0 != r2) goto L15
                r9 = 4
                kotlin.ResultKt.m(r11)
                goto L98
            L15:
                java.lang.IllegalStateException r10 = new java.lang.IllegalStateException
                r9 = 1
                java.lang.String r11 = "call to 'resume' before 'invoke' with coroutine"
                r9 = 0
                r10.<init>(r11)
                throw r10
            L1f:
                kotlin.ResultKt.m(r11)     // Catch: java.lang.Exception -> L23
                goto L98
            L23:
                r0 = move-exception
                r11 = r0
                r9 = 5
                goto L46
            L27:
                r9 = 3
                kotlin.ResultKt.m(r11)
                com.google.firebase.sessions.b1 r11 = com.google.firebase.sessions.b1.this     // Catch: java.lang.Exception -> L23
                r9 = 5
                androidx.datastore.core.l r11 = com.google.firebase.sessions.b1.e(r11)     // Catch: java.lang.Exception -> L23
                com.google.firebase.sessions.b1$e$a r0 = new com.google.firebase.sessions.b1$e$a     // Catch: java.lang.Exception -> L23
                com.google.firebase.sessions.b1 r4 = com.google.firebase.sessions.b1.this     // Catch: java.lang.Exception -> L23
                r9 = 6
                r5 = 0
                r0.<init>(r4, r5)     // Catch: java.lang.Exception -> L23
                r10.f124913a = r3     // Catch: java.lang.Exception -> L23
                r9 = 0
                java.lang.Object r10 = r11.a(r0, r10)     // Catch: java.lang.Exception -> L23
                r9 = 1
                if (r10 != r1) goto L98
                goto L96
            L46:
                r9 = 7
                r11.getMessage()
                com.google.firebase.sessions.b1 r11 = com.google.firebase.sessions.b1.this
                r9 = 5
                com.google.firebase.sessions.SessionData r0 = r10.f124915c
                r9 = 5
                boolean r11 = com.google.firebase.sessions.b1.k(r11, r0)
                if (r11 == 0) goto L98
                com.google.firebase.sessions.b1 r11 = com.google.firebase.sessions.b1.this
                com.google.firebase.sessions.v0 r11 = com.google.firebase.sessions.b1.g(r11)
                com.google.firebase.sessions.SessionData r0 = r10.f124915c
                com.google.firebase.sessions.SessionDetails r0 = r0.i()
                r9 = 1
                com.google.firebase.sessions.SessionDetails r4 = r11.a(r0)
                r9 = 5
                com.google.firebase.sessions.b1 r11 = com.google.firebase.sessions.b1.this
                com.google.firebase.sessions.SessionData r3 = r10.f124915c
                r7 = 4
                r9 = 6
                r8 = 0
                r5 = 0
                r6 = 0
                com.google.firebase.sessions.SessionData r0 = com.google.firebase.sessions.SessionData.f(r3, r4, r5, r6, r7, r8)
                r9 = 2
                r11.s(r0)
                com.google.firebase.sessions.b1 r11 = com.google.firebase.sessions.b1.this
                r9 = 2
                com.google.firebase.sessions.s0 r11 = com.google.firebase.sessions.b1.f(r11)
                r11.a(r4)
                com.google.firebase.sessions.b1 r11 = com.google.firebase.sessions.b1.this
                r9 = 7
                java.lang.String r0 = r4.h()
                com.google.firebase.sessions.b1$b r3 = com.google.firebase.sessions.b1.b.FALLBACK
                r10.f124913a = r2
                r9 = 7
                java.lang.Object r10 = com.google.firebase.sessions.b1.l(r11, r0, r3, r10)
                r9 = 3
                if (r10 != r1) goto L98
            L96:
                r9 = 7
                return r1
            L98:
                kotlin.Unit r10 = kotlin.Unit.f312394a
                r9 = 7
                return r10
            */
            throw new UnsupportedOperationException("Method not decompiled: com.google.firebase.sessions.b1.e.invokeSuspend(java.lang.Object):java.lang.Object");
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(kotlinx.coroutines.s0 s0Var, kotlin.coroutines.d<? super Unit> dVar) {
            return ((e) create(s0Var, dVar)).invokeSuspend(Unit.f312394a);
        }
    }

    @kotlin.coroutines.jvm.internal.f(c = "com.google.firebase.sessions.SharedSessionRepositoryImpl", f = "SharedSessionRepository.kt", i = {0, 0}, l = {199}, m = "notifySubscribers", n = {UserEntry.sessionId, "type"}, s = {"L$0", "L$1"})
    static final class f extends kotlin.coroutines.jvm.internal.d {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        Object f124919a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        Object f124920b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        /* synthetic */ Object f124921c;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int f124923e;

        f(kotlin.coroutines.d<? super f> dVar) {
            super(dVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            this.f124921c = obj;
            this.f124923e |= Integer.MIN_VALUE;
            return b1.this.r(null, null, this);
        }
    }

    @ij.a
    public b1(@NotNull com.google.firebase.sessions.settings.i sessionsSettings, @NotNull v0 sessionGenerator, @NotNull s0 sessionFirelogPublisher, @NotNull d1 timeProvider, @NotNull androidx.datastore.core.l<SessionData> sessionDataStore, @NotNull e0 processDataManager, @d8.a @NotNull CoroutineContext backgroundDispatcher) {
        Intrinsics.checkNotNullParameter(sessionsSettings, "sessionsSettings");
        Intrinsics.checkNotNullParameter(sessionGenerator, "sessionGenerator");
        Intrinsics.checkNotNullParameter(sessionFirelogPublisher, "sessionFirelogPublisher");
        Intrinsics.checkNotNullParameter(timeProvider, "timeProvider");
        Intrinsics.checkNotNullParameter(sessionDataStore, "sessionDataStore");
        Intrinsics.checkNotNullParameter(processDataManager, "processDataManager");
        Intrinsics.checkNotNullParameter(backgroundDispatcher, "backgroundDispatcher");
        this.f124885b = sessionsSettings;
        this.f124886c = sessionGenerator;
        this.f124887d = sessionFirelogPublisher;
        this.f124888e = timeProvider;
        this.f124889f = sessionDataStore;
        this.f124890g = processDataManager;
        this.f124891h = backgroundDispatcher;
        this.f124894k = b.GENERAL;
        this.f124895l = "";
        kotlinx.coroutines.k.f(kotlinx.coroutines.t0.a(backgroundDispatcher), null, null, new a(null), 3, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final boolean o(SessionData sessionData) {
        Map<String, ProcessData> mapH = sessionData.h();
        if (mapH != null) {
            return this.f124890g.c(mapH);
        }
        return true;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final boolean p(SessionData sessionData) {
        Map<String, ProcessData> mapH = sessionData.h();
        if (mapH == null) {
            this.f124890g.a();
            return true;
        }
        boolean zB = this.f124890g.b(mapH);
        if (zB) {
            this.f124890g.a();
        }
        return zB;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final boolean q(SessionData sessionData) {
        Time timeG = sessionData.g();
        if (timeG == null) {
            sessionData.i().h();
            return false;
        }
        boolean z10 = kotlin.time.c.s(this.f124888e.b().g(timeG), this.f124885b.b()) > 0;
        if (z10) {
            sessionData.i().h();
        }
        return z10;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Code duplicated, block: B:7:0x0017  */
    public final Object r(String str, b bVar, kotlin.coroutines.d<? super Unit> dVar) {
        f fVar;
        if (dVar instanceof f) {
            fVar = (f) dVar;
            int i10 = fVar.f124923e;
            if ((i10 & Integer.MIN_VALUE) != 0) {
                fVar.f124923e = i10 - Integer.MIN_VALUE;
            } else {
                fVar = new f(dVar);
            }
        } else {
            fVar = new f(dVar);
        }
        Object objC = fVar.f124921c;
        Object objL = kotlin.coroutines.intrinsics.b.l();
        int i11 = fVar.f124923e;
        if (i11 == 0) {
            ResultKt.m(objC);
            this.f124894k = bVar;
            if (Intrinsics.areEqual(this.f124895l, str)) {
                return Unit.f312394a;
            }
            this.f124895l = str;
            com.google.firebase.sessions.api.b bVar2 = com.google.firebase.sessions.api.b.f124853a;
            fVar.f124919a = str;
            fVar.f124920b = bVar;
            fVar.f124923e = 1;
            objC = bVar2.c(fVar);
            if (objC == objL) {
                return objL;
            }
        } else {
            if (i11 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            bVar = (b) fVar.f124920b;
            str = (String) fVar.f124919a;
            ResultKt.m(objC);
        }
        for (com.google.firebase.sessions.api.c cVar : ((Map) objC).values()) {
            cVar.c(new com.google.firebase.sessions.api.c.b(str));
            int i12 = c.f124907a[bVar.ordinal()];
            if (i12 == 1) {
                Objects.toString(cVar.b());
            } else {
                if (i12 != 2) {
                    throw new kotlin.k0();
                }
                Objects.toString(cVar.b());
            }
        }
        return Unit.f312394a;
    }

    @Override // com.google.firebase.sessions.a1
    public void a() {
        this.f124893j = true;
        if (this.f124892i == null) {
            return;
        }
        SessionData sessionDataM = m();
        this.f124890g.a();
        if (q(sessionDataM) || p(sessionDataM)) {
            boolean z10 = false & false;
            kotlinx.coroutines.k.f(kotlinx.coroutines.t0.a(this.f124891h), null, null, new e(sessionDataM, null), 3, null);
        }
    }

    @Override // com.google.firebase.sessions.a1
    public boolean b() {
        return this.f124893j;
    }

    @Override // com.google.firebase.sessions.a1
    public void c() {
        this.f124893j = false;
        if (this.f124892i == null) {
            return;
        }
        this.f124890g.a();
        kotlinx.coroutines.k.f(kotlinx.coroutines.t0.a(this.f124891h), null, null, new d(null), 3, null);
    }

    @NotNull
    public final SessionData m() {
        SessionData sessionData = this.f124892i;
        if (sessionData != null) {
            return sessionData;
        }
        Intrinsics.throwUninitializedPropertyAccessException("localSessionData");
        return null;
    }

    @NotNull
    public final b n() {
        return this.f124894k;
    }

    public final void s(@NotNull SessionData sessionData) {
        Intrinsics.checkNotNullParameter(sessionData, "<set-?>");
        this.f124892i = sessionData;
    }

    public final void t(@NotNull b bVar) {
        Intrinsics.checkNotNullParameter(bVar, "<set-?>");
        this.f124894k = bVar;
    }
}
