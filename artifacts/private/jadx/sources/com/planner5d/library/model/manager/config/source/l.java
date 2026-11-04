package com.planner5d.library.model.manager.config.source;

import android.app.Application;
import androidx.compose.runtime.internal.w0;
import com.planner5d.library.model.manager.config.p;
import com.planner5d.library.model.manager.t1;
import com.planner5d.library.modules.user.user.w;
import com.planner5d.library.services.r;
import com.planner5d.library.services.utility.h3;
import com.planner5d.library.services.utility.i0;
import com.planner5d.library.services.utility.s;
import java.util.Date;
import java.util.concurrent.CancellationException;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.CoroutineContext;
import kotlin.coroutines.jvm.internal.o;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.jvm.internal.c1;
import kotlin.jvm.internal.j1;
import kotlinx.coroutines.c3;
import kotlinx.coroutines.n0;
import kotlinx.coroutines.s0;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes8.dex */
@w0(parameters = 0)
@ij.f
@SourceDebugExtension({"SMAP\nServerConfigsSource.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ServerConfigsSource.kt\ncom/planner5d/library/model/manager/config/source/ServerConfigsSource\n+ 2 Mutex.kt\nkotlinx/coroutines/sync/MutexKt\n*L\n1#1,144:1\n116#2,11:145\n116#2,11:156\n116#2,11:167\n116#2,11:178\n116#2,11:189\n*S KotlinDebug\n*F\n+ 1 ServerConfigsSource.kt\ncom/planner5d/library/model/manager/config/source/ServerConfigsSource\n*L\n45#1:145,11\n57#1:156,11\n64#1:167,11\n108#1:178,11\n121#1:189,11\n*E\n"})
public final class l implements com.planner5d.library.model.manager.config.source.d, n {

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public static final int f190571j = 8;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    private final Application f190572a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NotNull
    private final com.planner5d.library.api.requests.c f190573b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @NotNull
    private final p f190574c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @NotNull
    private final t1 f190575d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    @NotNull
    private final fg.e<w> f190576e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    @Nullable
    private JSONObject f190577f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    @NotNull
    private Date f190578g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    @Nullable
    private Long f190579h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    @NotNull
    private final kotlinx.coroutines.sync.a f190580i;

    @kotlin.coroutines.jvm.internal.f(c = "com.planner5d.library.model.manager.config.source.ServerConfigsSource$activateFetched$2", f = "ServerConfigsSource.kt", i = {0, 1, 2}, l = {150, com.planner5d.library.engine.input.f.b.B0, 85}, m = "invokeSuspend", n = {"$this$withLock_u24default$iv", "$this$withLock_u24default$iv", "$this$withLock_u24default$iv"}, s = {"L$0", "L$0", "L$0"})
    @SourceDebugExtension({"SMAP\nServerConfigsSource.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ServerConfigsSource.kt\ncom/planner5d/library/model/manager/config/source/ServerConfigsSource$activateFetched$2\n+ 2 Mutex.kt\nkotlinx/coroutines/sync/MutexKt\n*L\n1#1,144:1\n116#2,11:145\n*S KotlinDebug\n*F\n+ 1 ServerConfigsSource.kt\ncom/planner5d/library/model/manager/config/source/ServerConfigsSource$activateFetched$2\n*L\n83#1:145,11\n*E\n"})
    static final class a extends o implements Function2<s0, kotlin.coroutines.d<? super Unit>, Object> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        Object f190581a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        Object f190582b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        int f190583c;

        /* JADX INFO: renamed from: com.planner5d.library.model.manager.config.source.l$a$a, reason: collision with other inner class name */
        @kotlin.coroutines.jvm.internal.f(c = "com.planner5d.library.model.manager.config.source.ServerConfigsSource$activateFetched$2$1$1", f = "ServerConfigsSource.kt", i = {0}, l = {89, 90}, m = "invokeSuspend", n = {"$this$invokeSuspend_u24lambda_u240"}, s = {"L$0"})
        static final class C1584a extends o implements Function2<s0, kotlin.coroutines.d<? super Unit>, Object> {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            Object f190585a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            int f190586b;

            /* JADX INFO: renamed from: c, reason: collision with root package name */
            final /* synthetic */ l f190587c;

            /* JADX INFO: renamed from: d, reason: collision with root package name */
            final /* synthetic */ String f190588d;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            C1584a(l lVar, String str, kotlin.coroutines.d<? super C1584a> dVar) {
                super(2, dVar);
                this.f190587c = lVar;
                this.f190588d = str;
            }

            @Override // kotlin.coroutines.jvm.internal.a
            public final kotlin.coroutines.d<Unit> create(Object obj, kotlin.coroutines.d<?> dVar) {
                return new C1584a(this.f190587c, this.f190588d, dVar);
            }

            /* JADX WARN: Code restructure failed: missing block: B:20:0x0061, code lost:
            
                if (r1.d(r7, null, r6) == r0) goto L21;
             */
            @Override // kotlin.coroutines.jvm.internal.a
            /*
                Code decompiled incorrectly, please refer to instructions dump.
                To view partially-correct add '--show-bad-code' argument
            */
            public final java.lang.Object invokeSuspend(java.lang.Object r7) {
                /*
                    r6 = this;
                    java.lang.Object r0 = kotlin.coroutines.intrinsics.b.l()
                    int r1 = r6.f190586b
                    r2 = 5
                    r2 = 2
                    r3 = 1
                    if (r1 == 0) goto L29
                    r5 = 1
                    if (r1 == r3) goto L20
                    if (r1 != r2) goto L15
                    kotlin.ResultKt.m(r7)     // Catch: org.json.JSONException -> L64
                    r5 = 5
                    goto L64
                L15:
                    java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
                    r5 = 3
                    java.lang.String r7 = "cisi//owrsnoon ue/l otktefi rreb/v/ce l/e/o e/uamt "
                    java.lang.String r7 = "call to 'resume' before 'invoke' with coroutine"
                    r6.<init>(r7)
                    throw r6
                L20:
                    java.lang.Object r1 = r6.f190585a
                    com.planner5d.library.model.manager.config.p r1 = (com.planner5d.library.model.manager.config.p) r1
                    kotlin.ResultKt.m(r7)     // Catch: org.json.JSONException -> L64
                    r5 = 1
                    goto L53
                L29:
                    kotlin.ResultKt.m(r7)
                    com.planner5d.library.model.manager.config.source.l r7 = r6.f190587c     // Catch: org.json.JSONException -> L64
                    org.json.JSONObject r1 = new org.json.JSONObject     // Catch: org.json.JSONException -> L64
                    java.lang.String r4 = r6.f190588d     // Catch: org.json.JSONException -> L64
                    r5 = 1
                    r1.<init>(r4)     // Catch: org.json.JSONException -> L64
                    r5 = 7
                    com.planner5d.library.model.manager.config.source.l.k(r7, r1)     // Catch: org.json.JSONException -> L64
                    com.planner5d.library.model.manager.config.source.l r7 = r6.f190587c     // Catch: org.json.JSONException -> L64
                    r5 = 5
                    com.planner5d.library.model.manager.config.p r1 = com.planner5d.library.model.manager.config.source.l.j(r7)     // Catch: org.json.JSONException -> L64
                    r5 = 4
                    java.lang.String r7 = r6.f190588d     // Catch: org.json.JSONException -> L64
                    com.planner5d.library.services.r r4 = com.planner5d.library.services.r.remoteConfig     // Catch: org.json.JSONException -> L64
                    r5 = 4
                    r6.f190585a = r1     // Catch: org.json.JSONException -> L64
                    r6.f190586b = r3     // Catch: org.json.JSONException -> L64
                    r5 = 0
                    java.lang.Object r7 = r1.d(r4, r7, r6)     // Catch: org.json.JSONException -> L64
                    if (r7 != r0) goto L53
                    goto L63
                L53:
                    com.planner5d.library.services.r r7 = com.planner5d.library.services.r.pendingRemoteConfig     // Catch: org.json.JSONException -> L64
                    r5 = 5
                    r3 = 0
                    r6.f190585a = r3     // Catch: org.json.JSONException -> L64
                    r6.f190586b = r2     // Catch: org.json.JSONException -> L64
                    r5 = 1
                    java.lang.Object r6 = r1.d(r7, r3, r6)     // Catch: org.json.JSONException -> L64
                    r5 = 6
                    if (r6 != r0) goto L64
                L63:
                    return r0
                L64:
                    r5 = 4
                    kotlin.Unit r6 = kotlin.Unit.f312394a
                    r5 = 1
                    return r6
                */
                throw new UnsupportedOperationException("Method not decompiled: com.planner5d.library.model.manager.config.source.l.a.C1584a.invokeSuspend(java.lang.Object):java.lang.Object");
            }

            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(s0 s0Var, kotlin.coroutines.d<? super Unit> dVar) {
                return ((C1584a) create(s0Var, dVar)).invokeSuspend(Unit.f312394a);
            }
        }

        a(kotlin.coroutines.d<? super a> dVar) {
            super(2, dVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final kotlin.coroutines.d<Unit> create(Object obj, kotlin.coroutines.d<?> dVar) {
            return l.this.new a(dVar);
        }

        /* JADX WARN: Code duplicated, block: B:29:0x0089 A[Catch: all -> 0x008f, TRY_LEAVE, TryCatch #1 {all -> 0x008f, blocks: (B:27:0x0085, B:29:0x0089, B:34:0x0096, B:24:0x0070), top: B:45:0x0070 }] */
        /* JADX WARN: Code duplicated, block: B:34:0x0096 A[Catch: all -> 0x008f, TRY_ENTER, TRY_LEAVE, TryCatch #1 {all -> 0x008f, blocks: (B:27:0x0085, B:29:0x0089, B:34:0x0096, B:24:0x0070), top: B:45:0x0070 }] */
        /* JADX WARN: Code duplicated, block: B:37:0x00ac  */
        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) throws Throwable {
            kotlinx.coroutines.sync.a aVar;
            l lVar;
            Throwable th2;
            kotlinx.coroutines.sync.a aVar2;
            Object objU;
            String str;
            c3 c3Var;
            C1584a c1584a;
            Object objL = kotlin.coroutines.intrinsics.b.l();
            int i10 = this.f190583c;
            try {
                if (i10 == 0) {
                    ResultKt.m(obj);
                    aVar = l.this.f190580i;
                    lVar = l.this;
                    this.f190581a = aVar;
                    this.f190582b = lVar;
                    this.f190583c = 1;
                    if (aVar.h(null, this) == objL) {
                    }
                    return objL;
                }
                if (i10 != 1) {
                    if (i10 != 2) {
                        if (i10 != 3) {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        aVar2 = (kotlinx.coroutines.sync.a) this.f190581a;
                        try {
                            ResultKt.m(obj);
                            Unit unit = Unit.f312394a;
                            aVar2.i(null);
                            return unit;
                        } catch (Throwable th3) {
                            th2 = th3;
                            aVar2.i(null);
                            throw th2;
                        }
                    }
                    lVar = (l) this.f190582b;
                    kotlinx.coroutines.sync.a aVar3 = (kotlinx.coroutines.sync.a) this.f190581a;
                    try {
                        ResultKt.m(obj);
                        objU = obj;
                        aVar = aVar3;
                        str = (String) objU;
                        if (str == null) {
                            Unit unit2 = Unit.f312394a;
                            aVar.i(null);
                            return unit2;
                        }
                        c3Var = c3.f313552a;
                        c1584a = new C1584a(lVar, str, null);
                        this.f190581a = aVar;
                        this.f190582b = null;
                        this.f190583c = 3;
                        if (kotlinx.coroutines.i.h(c3Var, c1584a, this) != objL) {
                            aVar2 = aVar;
                            Unit unit3 = Unit.f312394a;
                            aVar2.i(null);
                            return unit3;
                        }
                        return objL;
                    } catch (Throwable th4) {
                        th2 = th4;
                        aVar2 = aVar3;
                        aVar2.i(null);
                        throw th2;
                    }
                }
                lVar = (l) this.f190582b;
                kotlinx.coroutines.sync.a aVar4 = (kotlinx.coroutines.sync.a) this.f190581a;
                ResultKt.m(obj);
                aVar = aVar4;
                p pVar = lVar.f190574c;
                r rVar = r.pendingRemoteConfig;
                this.f190581a = aVar;
                this.f190582b = lVar;
                this.f190583c = 2;
                objU = pVar.u(rVar, null, this);
                if (objU != objL) {
                    str = (String) objU;
                    if (str == null) {
                        Unit unit4 = Unit.f312394a;
                        aVar.i(null);
                        return unit4;
                    }
                    c3Var = c3.f313552a;
                    c1584a = new C1584a(lVar, str, null);
                    this.f190581a = aVar;
                    this.f190582b = null;
                    this.f190583c = 3;
                    if (kotlinx.coroutines.i.h(c3Var, c1584a, this) != objL) {
                        aVar2 = aVar;
                        Unit unit5 = Unit.f312394a;
                        aVar2.i(null);
                        return unit5;
                    }
                }
                return objL;
            } catch (Throwable th5) {
                kotlinx.coroutines.sync.a aVar5 = aVar;
                th2 = th5;
                aVar2 = aVar5;
                aVar2.i(null);
                throw th2;
            }
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(s0 s0Var, kotlin.coroutines.d<? super Unit> dVar) {
            return ((a) create(s0Var, dVar)).invokeSuspend(Unit.f312394a);
        }
    }

    @kotlin.coroutines.jvm.internal.f(c = "com.planner5d.library.model.manager.config.source.ServerConfigsSource$downloadConfigs$2", f = "ServerConfigsSource.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
    static final class b extends o implements pj.n<com.planner5d.library.api.b, id.a, kotlin.coroutines.d<? super com.planner5d.library.api.c>, Object> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        int f190589a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private /* synthetic */ Object f190590b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        /* synthetic */ Object f190591c;

        b(kotlin.coroutines.d<? super b> dVar) {
            super(3, dVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            kotlin.coroutines.intrinsics.b.l();
            if (this.f190589a != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.m(obj);
            return ((com.planner5d.library.api.b) this.f190590b).n((id.a) this.f190591c, l.this.f190572a.getPackageName(), h3.j(l.this.f190572a), h3.c(), h3.a(), h3.n());
        }

        @Override // pj.n
        /* JADX INFO: renamed from: k, reason: merged with bridge method [inline-methods] */
        public final Object invoke(com.planner5d.library.api.b bVar, id.a aVar, kotlin.coroutines.d<? super com.planner5d.library.api.c> dVar) {
            b bVar2 = l.this.new b(dVar);
            bVar2.f190590b = bVar;
            bVar2.f190591c = aVar;
            return bVar2.invokeSuspend(Unit.f312394a);
        }
    }

    @kotlin.coroutines.jvm.internal.f(c = "com.planner5d.library.model.manager.config.source.ServerConfigsSource", f = "ServerConfigsSource.kt", i = {0, 0, 1}, l = {150, 109}, m = "dropFetchedAndActivated", n = {"this", "$this$withLock_u24default$iv", "$this$withLock_u24default$iv"}, s = {"L$0", "L$1", "L$0"})
    static final class c extends kotlin.coroutines.jvm.internal.d {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        Object f190593a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        Object f190594b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        /* synthetic */ Object f190595c;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int f190597e;

        c(kotlin.coroutines.d<? super c> dVar) {
            super(dVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            this.f190595c = obj;
            this.f190597e |= Integer.MIN_VALUE;
            return l.this.c(this);
        }
    }

    @kotlin.coroutines.jvm.internal.f(c = "com.planner5d.library.model.manager.config.source.ServerConfigsSource$dropFetchedAndActivated$2$1", f = "ServerConfigsSource.kt", i = {0}, l = {114, 115}, m = "invokeSuspend", n = {"$this$invokeSuspend_u24lambda_u240"}, s = {"L$0"})
    static final class d extends o implements Function2<s0, kotlin.coroutines.d<? super Unit>, Object> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        Object f190598a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        int f190599b;

        d(kotlin.coroutines.d<? super d> dVar) {
            super(2, dVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final kotlin.coroutines.d<Unit> create(Object obj, kotlin.coroutines.d<?> dVar) {
            return l.this.new d(dVar);
        }

        /* JADX WARN: Code restructure failed: missing block: B:14:0x005e, code lost:
        
            if (r1.d(r7, null, r6) == r0) goto L15;
         */
        @Override // kotlin.coroutines.jvm.internal.a
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public final java.lang.Object invokeSuspend(java.lang.Object r7) {
            /*
                r6 = this;
                java.lang.Object r0 = kotlin.coroutines.intrinsics.b.l()
                r5 = 7
                int r1 = r6.f190599b
                r5 = 0
                r2 = 2
                r3 = 1
                r5 = r3
                r4 = 0
                if (r1 == 0) goto L26
                if (r1 == r3) goto L1e
                if (r1 != r2) goto L16
                kotlin.ResultKt.m(r7)
                goto L62
            L16:
                java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
                java.lang.String r7 = "call to 'resume' before 'invoke' with coroutine"
                r6.<init>(r7)
                throw r6
            L1e:
                java.lang.Object r1 = r6.f190598a
                com.planner5d.library.model.manager.config.p r1 = (com.planner5d.library.model.manager.config.p) r1
                kotlin.ResultKt.m(r7)
                goto L54
            L26:
                kotlin.ResultKt.m(r7)
                com.planner5d.library.model.manager.config.source.l r7 = com.planner5d.library.model.manager.config.source.l.this
                r5 = 4
                com.planner5d.library.model.manager.config.source.l.k(r7, r4)
                r5 = 1
                com.planner5d.library.model.manager.config.source.l r7 = com.planner5d.library.model.manager.config.source.l.this
                java.util.Date r1 = new java.util.Date
                r1.<init>()
                com.planner5d.library.model.manager.config.source.l.l(r7, r1)
                com.planner5d.library.model.manager.config.source.l r7 = com.planner5d.library.model.manager.config.source.l.this
                com.planner5d.library.model.manager.config.source.l.m(r7, r4)
                com.planner5d.library.model.manager.config.source.l r7 = com.planner5d.library.model.manager.config.source.l.this
                com.planner5d.library.model.manager.config.p r1 = com.planner5d.library.model.manager.config.source.l.j(r7)
                com.planner5d.library.services.r r7 = com.planner5d.library.services.r.pendingRemoteConfig
                r6.f190598a = r1
                r6.f190599b = r3
                java.lang.Object r7 = r1.d(r7, r4, r6)
                r5 = 5
                if (r7 != r0) goto L54
                r5 = 1
                goto L60
            L54:
                com.planner5d.library.services.r r7 = com.planner5d.library.services.r.remoteConfig
                r6.f190598a = r4
                r6.f190599b = r2
                java.lang.Object r6 = r1.d(r7, r4, r6)
                if (r6 != r0) goto L62
            L60:
                r5 = 0
                return r0
            L62:
                kotlin.Unit r6 = kotlin.Unit.f312394a
                r5 = 2
                return r6
            */
            throw new UnsupportedOperationException("Method not decompiled: com.planner5d.library.model.manager.config.source.l.d.invokeSuspend(java.lang.Object):java.lang.Object");
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(s0 s0Var, kotlin.coroutines.d<? super Unit> dVar) {
            return ((d) create(s0Var, dVar)).invokeSuspend(Unit.f312394a);
        }
    }

    @kotlin.coroutines.jvm.internal.f(c = "com.planner5d.library.model.manager.config.source.ServerConfigsSource", f = "ServerConfigsSource.kt", i = {0, 0, 0, 1, 1, 2, 2, 2, 2, 3, 3}, l = {150, 63, 161, 65}, m = "fetchLatest", n = {"this", "$this$withLock_u24default$iv", "currentUserId", "this", "currentUserId", "this", "$this$fetchLatest_u24lambda_u244", "$this$withLock_u24default$iv", "currentUserId", "this", "$this$withLock_u24default$iv"}, s = {"L$0", "L$1", "J$0", "L$0", "J$0", "L$0", "L$2", "L$3", "J$0", "L$0", "L$2"})
    static final class e extends kotlin.coroutines.jvm.internal.d {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        Object f190601a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        Object f190602b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        Object f190603c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        Object f190604d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        long f190605e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        /* synthetic */ Object f190606f;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        int f190608h;

        e(kotlin.coroutines.d<? super e> dVar) {
            super(dVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            this.f190606f = obj;
            this.f190608h |= Integer.MIN_VALUE;
            return l.this.b(this);
        }
    }

    @kotlin.coroutines.jvm.internal.f(c = "com.planner5d.library.model.manager.config.source.ServerConfigsSource$fetchLatest$3$1$1", f = "ServerConfigsSource.kt", i = {}, l = {66}, m = "invokeSuspend", n = {}, s = {})
    @SourceDebugExtension({"SMAP\nServerConfigsSource.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ServerConfigsSource.kt\ncom/planner5d/library/model/manager/config/source/ServerConfigsSource$fetchLatest$3$1$1\n+ 2 ServerConfigsSource.kt\ncom/planner5d/library/model/manager/config/source/ServerConfigsSource\n*L\n1#1,144:1\n40#2:145\n*S KotlinDebug\n*F\n+ 1 ServerConfigsSource.kt\ncom/planner5d/library/model/manager/config/source/ServerConfigsSource$fetchLatest$3$1$1\n*L\n67#1:145\n*E\n"})
    static final class f extends o implements Function2<s0, kotlin.coroutines.d<? super Unit>, Object> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        int f190609a;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ JSONObject f190611c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        final /* synthetic */ long f190612d;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        f(JSONObject jSONObject, long j10, kotlin.coroutines.d<? super f> dVar) {
            super(2, dVar);
            this.f190611c = jSONObject;
            this.f190612d = j10;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final kotlin.coroutines.d<Unit> create(Object obj, kotlin.coroutines.d<?> dVar) {
            return l.this.new f(this.f190611c, this.f190612d, dVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            Object objL = kotlin.coroutines.intrinsics.b.l();
            int i10 = this.f190609a;
            if (i10 == 0) {
                ResultKt.m(obj);
                p pVar = l.this.f190574c;
                r rVar = r.pendingRemoteConfig;
                String string = this.f190611c.toString();
                this.f190609a = 1;
                if (pVar.d(rVar, string, this) == objL) {
                    return objL;
                }
            } else {
                if (i10 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.m(obj);
            }
            l.this.f190578g = new Date(new Date().getTime() + i0.d(6L));
            l.this.f190579h = kotlin.coroutines.jvm.internal.b.g(this.f190612d);
            return Unit.f312394a;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(s0 s0Var, kotlin.coroutines.d<? super Unit> dVar) {
            return ((f) create(s0Var, dVar)).invokeSuspend(Unit.f312394a);
        }
    }

    @kotlin.coroutines.jvm.internal.f(c = "com.planner5d.library.model.manager.config.source.ServerConfigsSource", f = "ServerConfigsSource.kt", i = {0, 0, 1}, l = {150, 123}, m = "getAllConfigs", n = {"this", "$this$withLock_u24default$iv", "$this$withLock_u24default$iv"}, s = {"L$0", "L$1", "L$0"})
    static final class g extends kotlin.coroutines.jvm.internal.d {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        Object f190613a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        Object f190614b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        /* synthetic */ Object f190615c;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int f190617e;

        g(kotlin.coroutines.d<? super g> dVar) {
            super(dVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            this.f190615c = obj;
            this.f190617e |= Integer.MIN_VALUE;
            return l.this.o(this);
        }
    }

    @kotlin.coroutines.jvm.internal.f(c = "com.planner5d.library.model.manager.config.source.ServerConfigsSource$getAllConfigs$2$1", f = "ServerConfigsSource.kt", i = {}, l = {124}, m = "invokeSuspend", n = {}, s = {})
    @SourceDebugExtension({"SMAP\nServerConfigsSource.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ServerConfigsSource.kt\ncom/planner5d/library/model/manager/config/source/ServerConfigsSource$getAllConfigs$2$1\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,144:1\n1#2:145\n*E\n"})
    static final class h extends o implements Function2<s0, kotlin.coroutines.d<? super JSONObject>, Object> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        int f190618a;

        h(kotlin.coroutines.d<? super h> dVar) {
            super(2, dVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final kotlin.coroutines.d<Unit> create(Object obj, kotlin.coroutines.d<?> dVar) {
            return l.this.new h(dVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) throws JSONException {
            Object objL = kotlin.coroutines.intrinsics.b.l();
            int i10 = this.f190618a;
            if (i10 == 0) {
                ResultKt.m(obj);
                p pVar = l.this.f190574c;
                r rVar = r.remoteConfig;
                this.f190618a = 1;
                obj = pVar.u(rVar, null, this);
                if (obj == objL) {
                    return objL;
                }
            } else {
                if (i10 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.m(obj);
            }
            String str = (String) obj;
            if (str == null) {
                return null;
            }
            JSONObject jSONObject = new JSONObject(str);
            l lVar = l.this;
            if (!jSONObject.has("features")) {
                jSONObject.put("features", new JSONArray());
            }
            lVar.f190577f = jSONObject;
            return jSONObject;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(s0 s0Var, kotlin.coroutines.d<? super JSONObject> dVar) {
            return ((h) create(s0Var, dVar)).invokeSuspend(Unit.f312394a);
        }
    }

    @kotlin.coroutines.jvm.internal.f(c = "com.planner5d.library.model.manager.config.source.ServerConfigsSource$getFeatureConfig$2", f = "ServerConfigsSource.kt", i = {}, l = {101}, m = "invokeSuspend", n = {}, s = {})
    @SourceDebugExtension({"SMAP\nServerConfigsSource.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ServerConfigsSource.kt\ncom/planner5d/library/model/manager/config/source/ServerConfigsSource$getFeatureConfig$2\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,144:1\n1#2:145\n*E\n"})
    static final class i extends o implements Function2<s0, kotlin.coroutines.d<? super com.planner5d.library.model.manager.config.g>, Object> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        int f190620a;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ com.planner5d.library.model.manager.config.f f190622c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        i(com.planner5d.library.model.manager.config.f fVar, kotlin.coroutines.d<? super i> dVar) {
            super(2, dVar);
            this.f190622c = fVar;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final kotlin.coroutines.d<Unit> create(Object obj, kotlin.coroutines.d<?> dVar) {
            return l.this.new i(this.f190622c, dVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) throws Throwable {
            JSONObject jSONObject;
            Object objL = kotlin.coroutines.intrinsics.b.l();
            int i10 = this.f190620a;
            try {
                if (i10 == 0) {
                    ResultKt.m(obj);
                    l lVar = l.this;
                    this.f190620a = 1;
                    obj = lVar.o(this);
                    if (obj == objL) {
                        return objL;
                    }
                } else {
                    if (i10 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    ResultKt.m(obj);
                }
                JSONObject jSONObject2 = (JSONObject) obj;
                if (jSONObject2 != null && (jSONObject = jSONObject2.getJSONObject("features")) != null) {
                    JSONObject jSONObject3 = jSONObject.getJSONObject("feature_" + this.f190622c.getId());
                    if (jSONObject3 != null) {
                        return new com.planner5d.library.model.manager.config.g(jSONObject3);
                    }
                }
            } catch (JSONException unused) {
            }
            return null;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(s0 s0Var, kotlin.coroutines.d<? super com.planner5d.library.model.manager.config.g> dVar) {
            return ((i) create(s0Var, dVar)).invokeSuspend(Unit.f312394a);
        }
    }

    @kotlin.coroutines.jvm.internal.f(c = "com.planner5d.library.model.manager.config.source.ServerConfigsSource", f = "ServerConfigsSource.kt", i = {0, 0, 1, 1, 2}, l = {150, 50, 50}, m = "hasFetchedOrActivated", n = {"this", "$this$withLock_u24default$iv", "$this$withLock_u24default$iv", "$this$hasFetchedOrActivated_u24lambda_u241_u24lambda_u240", "$this$withLock_u24default$iv"}, s = {"L$0", "L$1", "L$0", "L$1", "L$0"})
    static final class j extends kotlin.coroutines.jvm.internal.d {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        Object f190623a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        Object f190624b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        /* synthetic */ Object f190625c;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int f190627e;

        j(kotlin.coroutines.d<? super j> dVar) {
            super(dVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            this.f190625c = obj;
            this.f190627e |= Integer.MIN_VALUE;
            return l.this.e(this);
        }
    }

    @ij.a
    public l(@NotNull Application application, @NotNull com.planner5d.library.api.requests.c api, @NotNull p preferences, @NotNull t1 logRecordManager, @NotNull fg.e<w> userAuthorizationService) {
        Intrinsics.checkNotNullParameter(application, "application");
        Intrinsics.checkNotNullParameter(api, "api");
        Intrinsics.checkNotNullParameter(preferences, "preferences");
        Intrinsics.checkNotNullParameter(logRecordManager, "logRecordManager");
        Intrinsics.checkNotNullParameter(userAuthorizationService, "userAuthorizationService");
        this.f190572a = application;
        this.f190573b = api;
        this.f190574c = preferences;
        this.f190575d = logRecordManager;
        this.f190576e = userAuthorizationService;
        this.f190578g = new Date();
        this.f190580i = kotlinx.coroutines.sync.g.b(false, 1, null);
        s sVar = s.f229729a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final Object n(kotlin.coroutines.d<? super com.planner5d.library.api.c> dVar) {
        return com.planner5d.library.api.requests.c.g(this.f190573b, this.f190576e.get().a(), null, new b(null), dVar, 2, null);
    }

    private final long p() {
        return i0.d(6L);
    }

    private final n0 q() {
        return s.f229729a.h();
    }

    private static Object r(l lVar) {
        return j1.t(new c1(s.f229729a, s.class, "DispatcherBackground", "getDispatcherBackground()Lkotlinx/coroutines/ExecutorCoroutineDispatcher;", 0));
    }

    @Override // com.planner5d.library.model.manager.config.source.d
    @Nullable
    public Object a(@NotNull com.planner5d.library.model.manager.config.f fVar, @NotNull kotlin.coroutines.d<? super com.planner5d.library.model.manager.config.g> dVar) {
        return kotlinx.coroutines.i.h(q(), new i(fVar, null), dVar);
    }

    /* JADX WARN: Code duplicated, block: B:59:0x0102  */
    /* JADX WARN: Code duplicated, block: B:63:0x0128  */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.planner5d.library.model.manager.config.source.n
    @Nullable
    public Object b(@NotNull kotlin.coroutines.d<? super Unit> dVar) throws Exception {
        e eVar;
        Exception exc;
        l lVar;
        long jE;
        kotlinx.coroutines.sync.a aVar;
        long j10;
        l lVar2;
        Long l10;
        com.planner5d.library.api.c cVar;
        JSONObject jSONObjectA;
        kotlinx.coroutines.sync.a aVar2;
        JSONObject jSONObject;
        long j11;
        JSONObject jSONObject2;
        Throwable th2;
        CoroutineContext coroutineContextPlus;
        f fVar;
        if (dVar instanceof e) {
            eVar = (e) dVar;
            int i10 = eVar.f190608h;
            if ((i10 & Integer.MIN_VALUE) != 0) {
                eVar.f190608h = i10 - Integer.MIN_VALUE;
            } else {
                eVar = new e(dVar);
            }
        } else {
            eVar = new e(dVar);
        }
        Object objN = eVar.f190606f;
        Object objL = kotlin.coroutines.intrinsics.b.l();
        int i11 = eVar.f190608h;
        try {
            try {
                try {
                    try {
                        if (i11 == 0) {
                            ResultKt.m(objN);
                            jE = this.f190576e.get().e();
                            aVar = this.f190580i;
                            eVar.f190601a = this;
                            eVar.f190602b = aVar;
                            eVar.f190605e = jE;
                            eVar.f190608h = 1;
                            if (aVar.h(null, eVar) != objL) {
                            }
                            return objL;
                        }
                        if (i11 != 1) {
                            if (i11 == 2) {
                                j10 = eVar.f190605e;
                                lVar2 = (l) eVar.f190601a;
                                ResultKt.m(objN);
                                cVar = (com.planner5d.library.api.c) objN;
                                if (cVar != null && (jSONObjectA = cVar.a()) != null) {
                                    aVar2 = lVar2.f190580i;
                                    eVar.f190601a = lVar2;
                                    eVar.f190602b = jSONObjectA;
                                    eVar.f190603c = jSONObjectA;
                                    eVar.f190604d = aVar2;
                                    eVar.f190605e = j10;
                                    eVar.f190608h = 3;
                                    if (aVar2.h(null, eVar) != objL) {
                                        jSONObject = jSONObjectA;
                                        j11 = j10;
                                        jSONObject2 = jSONObject;
                                        l lVar3 = lVar2;
                                        coroutineContextPlus = lVar3.q().plus(c3.f313552a);
                                        fVar = lVar3.new f(jSONObject, j11, null);
                                        eVar.f190601a = lVar3;
                                        eVar.f190602b = jSONObject2;
                                        eVar.f190603c = aVar2;
                                        eVar.f190604d = null;
                                        eVar.f190608h = 4;
                                        if (kotlinx.coroutines.i.h(coroutineContextPlus, fVar, eVar) != objL) {
                                            Unit unit = Unit.f312394a;
                                            aVar2.i(null);
                                        }
                                    }
                                    return objL;
                                }
                                return Unit.f312394a;
                            }
                            if (i11 != 3) {
                                if (i11 != 4) {
                                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                                }
                                aVar2 = (kotlinx.coroutines.sync.a) eVar.f190603c;
                                try {
                                    ResultKt.m(objN);
                                    Unit unit2 = Unit.f312394a;
                                    aVar2.i(null);
                                    return Unit.f312394a;
                                } catch (Throwable th3) {
                                    th2 = th3;
                                    aVar2.i(null);
                                    throw th2;
                                }
                            }
                            long j12 = eVar.f190605e;
                            aVar2 = (kotlinx.coroutines.sync.a) eVar.f190604d;
                            JSONObject jSONObject3 = (JSONObject) eVar.f190603c;
                            jSONObject2 = (JSONObject) eVar.f190602b;
                            lVar2 = (l) eVar.f190601a;
                            ResultKt.m(objN);
                            jSONObject = jSONObject3;
                            j11 = j12;
                            l lVar4 = lVar2;
                            try {
                                coroutineContextPlus = lVar4.q().plus(c3.f313552a);
                                fVar = lVar4.new f(jSONObject, j11, null);
                                eVar.f190601a = lVar4;
                                eVar.f190602b = jSONObject2;
                                eVar.f190603c = aVar2;
                                eVar.f190604d = null;
                                eVar.f190608h = 4;
                                if (kotlinx.coroutines.i.h(coroutineContextPlus, fVar, eVar) != objL) {
                                    Unit unit3 = Unit.f312394a;
                                    aVar2.i(null);
                                    return Unit.f312394a;
                                }
                                return objL;
                            } catch (Throwable th4) {
                                th2 = th4;
                                aVar2.i(null);
                                throw th2;
                            }
                        }
                        jE = eVar.f190605e;
                        kotlinx.coroutines.sync.a aVar3 = (kotlinx.coroutines.sync.a) eVar.f190602b;
                        l lVar5 = (l) eVar.f190601a;
                        ResultKt.m(objN);
                        aVar = aVar3;
                        this = lVar5;
                        eVar.f190601a = this;
                        eVar.f190602b = null;
                        eVar.f190605e = jE;
                        eVar.f190608h = 2;
                        objN = this.n(eVar);
                        if (objN != objL) {
                            j10 = jE;
                            lVar2 = this;
                            cVar = (com.planner5d.library.api.c) objN;
                            if (cVar != null) {
                                aVar2 = lVar2.f190580i;
                                eVar.f190601a = lVar2;
                                eVar.f190602b = jSONObjectA;
                                eVar.f190603c = jSONObjectA;
                                eVar.f190604d = aVar2;
                                eVar.f190605e = j10;
                                eVar.f190608h = 3;
                                if (aVar2.h(null, eVar) != objL) {
                                    jSONObject = jSONObjectA;
                                    j11 = j10;
                                    jSONObject2 = jSONObject;
                                    l lVar6 = lVar2;
                                    coroutineContextPlus = lVar6.q().plus(c3.f313552a);
                                    fVar = lVar6.new f(jSONObject, j11, null);
                                    eVar.f190601a = lVar6;
                                    eVar.f190602b = jSONObject2;
                                    eVar.f190603c = aVar2;
                                    eVar.f190604d = null;
                                    eVar.f190608h = 4;
                                    if (kotlinx.coroutines.i.h(coroutineContextPlus, fVar, eVar) != objL) {
                                        Unit unit4 = Unit.f312394a;
                                        aVar2.i(null);
                                    }
                                }
                            }
                            return Unit.f312394a;
                        }
                        return objL;
                    } catch (Exception e10) {
                        lVar = this;
                        exc = e10;
                        if (exc instanceof CancellationException) {
                            throw exc;
                        }
                        timber.log.b.f381052a.e(exc);
                        lVar.f190575d.b("fetch_config", null, exc);
                    }
                    if (this.f190578g.compareTo(new Date()) > 0 && (l10 = this.f190579h) != null && jE == l10.longValue()) {
                        Unit unit5 = Unit.f312394a;
                        aVar.i(null);
                        return unit5;
                    }
                    Unit unit6 = Unit.f312394a;
                    aVar.i(null);
                } catch (Throwable th5) {
                    aVar.i(null);
                    throw th5;
                }
            } catch (Exception e11) {
                exc = e11;
                lVar = objL;
            }
        } catch (Exception e12) {
            exc = e12;
        }
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0016  */
    @Override // com.planner5d.library.model.manager.config.source.n
    @Nullable
    public Object c(@NotNull kotlin.coroutines.d<? super Unit> dVar) throws Throwable {
        c cVar;
        kotlinx.coroutines.sync.a aVar;
        Throwable th2;
        kotlinx.coroutines.sync.a aVar2;
        if (dVar instanceof c) {
            cVar = (c) dVar;
            int i10 = cVar.f190597e;
            if ((i10 & Integer.MIN_VALUE) != 0) {
                cVar.f190597e = i10 - Integer.MIN_VALUE;
            } else {
                cVar = new c(dVar);
            }
        } else {
            cVar = new c(dVar);
        }
        Object obj = cVar.f190595c;
        Object objL = kotlin.coroutines.intrinsics.b.l();
        int i11 = cVar.f190597e;
        try {
            if (i11 == 0) {
                ResultKt.m(obj);
                aVar = this.f190580i;
                cVar.f190593a = this;
                cVar.f190594b = aVar;
                cVar.f190597e = 1;
                if (aVar.h(null, cVar) != objL) {
                }
                return objL;
            }
            if (i11 != 1) {
                if (i11 != 2) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                aVar2 = (kotlinx.coroutines.sync.a) cVar.f190593a;
                try {
                    ResultKt.m(obj);
                    Unit unit = Unit.f312394a;
                    aVar2.i(null);
                    return unit;
                } catch (Throwable th3) {
                    th2 = th3;
                    aVar2.i(null);
                    throw th2;
                }
            }
            kotlinx.coroutines.sync.a aVar3 = (kotlinx.coroutines.sync.a) cVar.f190594b;
            l lVar = (l) cVar.f190593a;
            ResultKt.m(obj);
            aVar = aVar3;
            this = lVar;
            c3 c3Var = c3.f313552a;
            d dVar2 = this.new d(null);
            cVar.f190593a = aVar;
            cVar.f190594b = null;
            cVar.f190597e = 2;
            if (kotlinx.coroutines.i.h(c3Var, dVar2, cVar) != objL) {
                aVar2 = aVar;
                Unit unit2 = Unit.f312394a;
                aVar2.i(null);
                return unit2;
            }
            return objL;
        } catch (Throwable th4) {
            kotlinx.coroutines.sync.a aVar4 = aVar;
            th2 = th4;
            aVar2 = aVar4;
            aVar2.i(null);
            throw th2;
        }
    }

    /* JADX WARN: Code duplicated, block: B:33:0x008c A[PHI: r10
      0x008c: PHI (r10v11 kotlinx.coroutines.sync.a) = (r10v3 kotlinx.coroutines.sync.a), (r10v6 kotlinx.coroutines.sync.a), (r10v13 kotlinx.coroutines.sync.a) binds: [B:32:0x008a, B:38:0x00a4, B:44:0x00bd] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:39:0x00a6 A[Catch: all -> 0x00c2, TRY_LEAVE, TryCatch #0 {all -> 0x00c2, blocks: (B:39:0x00a6, B:31:0x0088, B:34:0x008f), top: B:53:0x0088 }] */
    /* JADX WARN: Code duplicated, block: B:42:0x00b6  */
    /* JADX WARN: Code duplicated, block: B:44:0x00bd  */
    /* JADX WARN: Code duplicated, block: B:45:0x00c0  */
    /* JADX WARN: Code duplicated, block: B:7:0x0016  */
    @Override // com.planner5d.library.model.manager.config.source.n
    @Nullable
    public Object e(@NotNull kotlin.coroutines.d<? super Boolean> dVar) throws Throwable {
        j jVar;
        kotlinx.coroutines.sync.a aVar;
        p pVar;
        Object objU;
        Throwable th2;
        kotlinx.coroutines.sync.a aVar2;
        Object objU2;
        if (dVar instanceof j) {
            jVar = (j) dVar;
            int i10 = jVar.f190627e;
            if ((i10 & Integer.MIN_VALUE) != 0) {
                jVar.f190627e = i10 - Integer.MIN_VALUE;
            } else {
                jVar = new j(dVar);
            }
        } else {
            jVar = new j(dVar);
        }
        Object obj = jVar.f190625c;
        Object objL = kotlin.coroutines.intrinsics.b.l();
        int i11 = jVar.f190627e;
        boolean z10 = true;
        try {
            if (i11 == 0) {
                ResultKt.m(obj);
                aVar = this.f190580i;
                jVar.f190623a = this;
                jVar.f190624b = aVar;
                jVar.f190627e = 1;
                if (aVar.h(null, jVar) == objL) {
                }
                return objL;
            }
            if (i11 != 1) {
                if (i11 != 2) {
                    if (i11 != 3) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    aVar2 = (kotlinx.coroutines.sync.a) jVar.f190623a;
                    try {
                        ResultKt.m(obj);
                        if (obj != null) {
                            aVar = aVar2;
                            aVar2 = aVar;
                        } else {
                            z10 = false;
                        }
                        Boolean boolA = kotlin.coroutines.jvm.internal.b.a(z10);
                        aVar2.i(null);
                        return boolA;
                    } catch (Throwable th3) {
                        th2 = th3;
                        aVar2.i(null);
                        throw th2;
                    }
                }
                pVar = (p) jVar.f190624b;
                kotlinx.coroutines.sync.a aVar3 = (kotlinx.coroutines.sync.a) jVar.f190623a;
                try {
                    ResultKt.m(obj);
                    objU = obj;
                    aVar = aVar3;
                    if (objU == null) {
                        r rVar = r.pendingRemoteConfig;
                        jVar.f190623a = aVar;
                        jVar.f190624b = null;
                        jVar.f190627e = 3;
                        objU2 = pVar.u(rVar, null, jVar);
                        if (objU2 != objL) {
                            kotlinx.coroutines.sync.a aVar4 = aVar;
                            obj = objU2;
                            aVar2 = aVar4;
                            if (obj != null) {
                                aVar = aVar2;
                                aVar2 = aVar;
                            } else {
                                z10 = false;
                            }
                        }
                        return objL;
                    }
                    aVar2 = aVar;
                    Boolean boolA2 = kotlin.coroutines.jvm.internal.b.a(z10);
                    aVar2.i(null);
                    return boolA2;
                } catch (Throwable th4) {
                    th2 = th4;
                    aVar2 = aVar3;
                    aVar2.i(null);
                    throw th2;
                }
            }
            kotlinx.coroutines.sync.a aVar5 = (kotlinx.coroutines.sync.a) jVar.f190624b;
            l lVar = (l) jVar.f190623a;
            ResultKt.m(obj);
            aVar = aVar5;
            this = lVar;
            if (this.f190577f == null) {
                pVar = this.f190574c;
                r rVar2 = r.remoteConfig;
                jVar.f190623a = aVar;
                jVar.f190624b = pVar;
                jVar.f190627e = 2;
                objU = pVar.u(rVar2, null, jVar);
                if (objU != objL) {
                    if (objU == null) {
                        r rVar3 = r.pendingRemoteConfig;
                        jVar.f190623a = aVar;
                        jVar.f190624b = null;
                        jVar.f190627e = 3;
                        objU2 = pVar.u(rVar3, null, jVar);
                        if (objU2 != objL) {
                            kotlinx.coroutines.sync.a aVar6 = aVar;
                            obj = objU2;
                            aVar2 = aVar6;
                            if (obj != null) {
                                aVar = aVar2;
                                aVar2 = aVar;
                            } else {
                                z10 = false;
                            }
                        }
                    } else {
                        aVar2 = aVar;
                    }
                }
                return objL;
            }
            aVar2 = aVar;
            Boolean boolA3 = kotlin.coroutines.jvm.internal.b.a(z10);
            aVar2.i(null);
            return boolA3;
        } catch (Throwable th5) {
            kotlinx.coroutines.sync.a aVar7 = aVar;
            th2 = th5;
            aVar2 = aVar7;
            aVar2.i(null);
            throw th2;
        }
    }

    @Override // com.planner5d.library.model.manager.config.source.n
    @Nullable
    public Object f(@NotNull kotlin.coroutines.d<? super Unit> dVar) {
        Object objH = kotlinx.coroutines.i.h(q(), new a(null), dVar);
        return objH == kotlin.coroutines.intrinsics.b.l() ? objH : Unit.f312394a;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0017  */
    @Nullable
    public final Object o(@NotNull kotlin.coroutines.d<? super JSONObject> dVar) throws Throwable {
        g gVar;
        kotlinx.coroutines.sync.a aVar;
        Throwable th2;
        kotlinx.coroutines.sync.a aVar2;
        JSONObject jSONObject;
        if (dVar instanceof g) {
            gVar = (g) dVar;
            int i10 = gVar.f190617e;
            if ((i10 & Integer.MIN_VALUE) != 0) {
                gVar.f190617e = i10 - Integer.MIN_VALUE;
            } else {
                gVar = new g(dVar);
            }
        } else {
            gVar = new g(dVar);
        }
        Object obj = gVar.f190615c;
        Object objL = kotlin.coroutines.intrinsics.b.l();
        int i11 = gVar.f190617e;
        try {
            if (i11 == 0) {
                ResultKt.m(obj);
                aVar = this.f190580i;
                gVar.f190613a = this;
                gVar.f190614b = aVar;
                gVar.f190617e = 1;
                if (aVar.h(null, gVar) != objL) {
                }
                return objL;
            }
            if (i11 != 1) {
                if (i11 != 2) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                aVar2 = (kotlinx.coroutines.sync.a) gVar.f190613a;
                try {
                    ResultKt.m(obj);
                    jSONObject = (JSONObject) obj;
                    aVar = aVar2;
                } catch (JSONException unused) {
                    aVar = aVar2;
                    jSONObject = null;
                } catch (Throwable th3) {
                    th2 = th3;
                    aVar2.i(null);
                    throw th2;
                }
                aVar.i(null);
                return jSONObject;
            }
            kotlinx.coroutines.sync.a aVar3 = (kotlinx.coroutines.sync.a) gVar.f190614b;
            l lVar = (l) gVar.f190613a;
            ResultKt.m(obj);
            aVar = aVar3;
            this = lVar;
            jSONObject = this.f190577f;
            if (jSONObject == null) {
                n0 n0VarQ = this.q();
                h hVar = this.new h(null);
                gVar.f190613a = aVar;
                gVar.f190614b = null;
                gVar.f190617e = 2;
                Object objH = kotlinx.coroutines.i.h(n0VarQ, hVar, gVar);
                if (objH != objL) {
                    kotlinx.coroutines.sync.a aVar4 = aVar;
                    obj = objH;
                    aVar2 = aVar4;
                    jSONObject = (JSONObject) obj;
                    aVar = aVar2;
                }
                return objL;
            }
        } catch (JSONException unused2) {
            aVar2 = aVar;
            aVar = aVar2;
            jSONObject = null;
        } catch (Throwable th4) {
            kotlinx.coroutines.sync.a aVar5 = aVar;
            th2 = th4;
            aVar2 = aVar5;
            aVar2.i(null);
            throw th2;
        }
        aVar.i(null);
        return jSONObject;
    }
}
