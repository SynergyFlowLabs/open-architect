package com.planner5d.library.model.manager;

import android.provider.Settings;
import com.google.android.gms.ads.identifier.AdvertisingIdClient;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.nio.charset.Charset;
import java.util.Arrays;
import java.util.Date;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes7.dex */
@androidx.compose.runtime.internal.w0(parameters = 0)
@ij.f
@SourceDebugExtension({"SMAP\nInstallationManager.kt\nKotlin\n*S Kotlin\n*F\n+ 1 InstallationManager.kt\ncom/planner5d/library/model/manager/InstallationManager\n+ 2 Mutex.kt\nkotlinx/coroutines/sync/MutexKt\n+ 3 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,301:1\n116#2,11:302\n116#2,8:313\n125#2,2:322\n116#2,11:324\n116#2,11:335\n116#2,11:346\n1#3:321\n*S KotlinDebug\n*F\n+ 1 InstallationManager.kt\ncom/planner5d/library/model/manager/InstallationManager\n*L\n110#1:302,11\n131#1:313,8\n131#1:322,2\n158#1:324,11\n186#1:335,11\n266#1:346,11\n*E\n"})
public final class c1 implements x1, e1 {

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    @NotNull
    public static final a f181311s = new a(null);

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public static final int f181312t = 8;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    @NotNull
    private static final String f181313u = "?";

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @NotNull
    private final fg.e<com.planner5d.library.model.manager.builtin.i> f181314c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @NotNull
    private final fg.e<com.planner5d.library.services.utility.p0> f181315d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    @NotNull
    private final com.planner5d.library.application.b f181316e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    @NotNull
    private final com.planner5d.library.api.requests.c f181317f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    @NotNull
    private final com.planner5d.library.model.manager.config.p f181318g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    @NotNull
    private final fg.e<com.planner5d.library.modules.user.user.t> f181319h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    @NotNull
    private final com.planner5d.library.modules.user.user.z0 f181320i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    @NotNull
    private final fg.e<com.planner5d.library.model.manager.crashreporting.l> f181321j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    @NotNull
    private final fg.e<sd.b> f181322k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    @NotNull
    private final fg.e<t1> f181323l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    @NotNull
    private final com.planner5d.library.services.utility.t f181324m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    @NotNull
    private final kotlinx.coroutines.sync.a f181325n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    @NotNull
    private final kotlinx.coroutines.sync.a f181326o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    @NotNull
    private final kotlinx.coroutines.sync.a f181327p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    private boolean f181328q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    @NotNull
    private String f181329r;

    public static final class a {
        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private a() {
        }
    }

    @kotlin.coroutines.jvm.internal.f(c = "com.planner5d.library.model.manager.InstallationManager", f = "InstallationManager.kt", i = {0, 0, 1, 1, 2, 2, 3, 4, 4, 4, 5}, l = {307, 132, 133, 144, androidx.constraintlayout.core.motion.utils.v.a.f43976s, 159}, m = "createOrGetInstallationHash", n = {"this", "$this$withLock_u24default$iv", "this", "$this$withLock_u24default$iv", "this", "$this$withLock_u24default$iv", "this", "this", "$this$createOrGetInstallationHash_u24lambda_u245", "$this$withLock_u24default$iv", "$this$withLock_u24default$iv"}, s = {"L$0", "L$1", "L$0", "L$1", "L$0", "L$1", "L$0", "L$0", "L$2", "L$3", "L$1"})
    static final class b extends kotlin.coroutines.jvm.internal.d {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        Object f181330a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        Object f181331b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        Object f181332c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        Object f181333d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        /* synthetic */ Object f181334e;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        int f181336g;

        b(kotlin.coroutines.d<? super b> dVar) {
            super(dVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            this.f181334e = obj;
            this.f181336g |= Integer.MIN_VALUE;
            return c1.this.B(this);
        }
    }

    @kotlin.coroutines.jvm.internal.f(c = "com.planner5d.library.model.manager.InstallationManager$createOrGetInstallationHash$response$1", f = "InstallationManager.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
    static final class c extends kotlin.coroutines.jvm.internal.o implements Function2<kotlinx.coroutines.s0, kotlin.coroutines.d<? super com.planner5d.library.api.c>, Object> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        int f181337a;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ JSONObject f181339c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        c(JSONObject jSONObject, kotlin.coroutines.d<? super c> dVar) {
            super(2, dVar);
            this.f181339c = jSONObject;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final com.planner5d.library.api.c m(JSONObject jSONObject, com.planner5d.library.api.b bVar, id.a aVar) {
            return bVar.e0(aVar, jSONObject);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final kotlin.coroutines.d<Unit> create(Object obj, kotlin.coroutines.d<?> dVar) {
            return c1.this.new c(this.f181339c, dVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) throws JSONException {
            String strD;
            kotlin.coroutines.intrinsics.b.l();
            if (this.f181337a != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.m(obj);
            try {
                com.planner5d.library.services.utility.l lVar = com.planner5d.library.services.utility.l.f225301a;
                byte[] bArrI = com.planner5d.library.services.utility.h3.i(c1.this.f181316e);
                Intrinsics.checkNotNullExpressionValue(bArrI, "getApplicationShaSignature(...)");
                strD = com.planner5d.library.services.utility.l.d(lVar, bArrI, 0, 2, null);
            } catch (Throwable th2) {
                timber.log.b.f381052a.e(th2);
                strD = "?";
            }
            this.f181339c.put(com.planner5d.library.services.r.keyHash.f224891a, strD);
            com.planner5d.library.api.requests.c cVar = c1.this.f181317f;
            id.a aVarA = ((com.planner5d.library.modules.user.user.t) c1.this.f181319h.get()).a();
            final JSONObject jSONObject = this.f181339c;
            return cVar.j(aVarA, new Function2() { // from class: com.planner5d.library.model.manager.d1
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj2, Object obj3) {
                    return c1.c.m(jSONObject, (com.planner5d.library.api.b) obj2, (id.a) obj3);
                }
            });
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(kotlinx.coroutines.s0 s0Var, kotlin.coroutines.d<? super com.planner5d.library.api.c> dVar) {
            return ((c) create(s0Var, dVar)).invokeSuspend(Unit.f312394a);
        }
    }

    @kotlin.coroutines.jvm.internal.f(c = "com.planner5d.library.model.manager.InstallationManager", f = "InstallationManager.kt", i = {}, l = {123}, m = "getInstallationHash", n = {}, s = {})
    static final class d extends kotlin.coroutines.jvm.internal.d {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        /* synthetic */ Object f181340a;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        int f181342c;

        d(kotlin.coroutines.d<? super d> dVar) {
            super(dVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            this.f181340a = obj;
            this.f181342c |= Integer.MIN_VALUE;
            return c1.this.c(this);
        }
    }

    @kotlin.coroutines.jvm.internal.f(c = "com.planner5d.library.model.manager.InstallationManager$getInstallationHashInstant$1", f = "InstallationManager.kt", i = {}, l = {99}, m = "invokeSuspend", n = {}, s = {})
    static final class e extends kotlin.coroutines.jvm.internal.o implements Function2<kotlinx.coroutines.s0, kotlin.coroutines.d<? super String>, Object> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        int f181343a;

        e(kotlin.coroutines.d<? super e> dVar) {
            super(2, dVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final kotlin.coroutines.d<Unit> create(Object obj, kotlin.coroutines.d<?> dVar) {
            return c1.this.new e(dVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) throws Throwable {
            Object objL = kotlin.coroutines.intrinsics.b.l();
            int i10 = this.f181343a;
            try {
                if (i10 == 0) {
                    ResultKt.m(obj);
                    c1 c1Var = c1.this;
                    this.f181343a = 1;
                    obj = c1Var.D(this);
                    if (obj == objL) {
                        return objL;
                    }
                } else {
                    if (i10 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    ResultKt.m(obj);
                }
                return (String) obj;
            } catch (Exception unused) {
                return "?";
            }
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(kotlinx.coroutines.s0 s0Var, kotlin.coroutines.d<? super String> dVar) {
            return ((e) create(s0Var, dVar)).invokeSuspend(Unit.f312394a);
        }
    }

    @kotlin.coroutines.jvm.internal.f(c = "com.planner5d.library.model.manager.InstallationManager", f = "InstallationManager.kt", i = {0, 0, 0, 1, 1, 1}, l = {307, 110}, m = "getInstallationHashInternal", n = {"this", "oldHash", "$this$withLock_u24default$iv", "this", "oldHash", "$this$withLock_u24default$iv"}, s = {"L$0", "L$1", "L$2", "L$0", "L$1", "L$2"})
    static final class f extends kotlin.coroutines.jvm.internal.d {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        Object f181345a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        Object f181346b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        Object f181347c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        /* synthetic */ Object f181348d;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        int f181350f;

        f(kotlin.coroutines.d<? super f> dVar) {
            super(dVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            this.f181348d = obj;
            this.f181350f |= Integer.MIN_VALUE;
            return c1.this.D(this);
        }
    }

    @kotlin.coroutines.jvm.internal.f(c = "com.planner5d.library.model.manager.InstallationManager$getInstallationHashInternal$2", f = "InstallationManager.kt", i = {}, l = {androidx.media3.extractor.metadata.dvbsi.b.f67479d}, m = "invokeSuspend", n = {}, s = {})
    static final class g extends kotlin.coroutines.jvm.internal.o implements Function2<kotlinx.coroutines.s0, kotlin.coroutines.d<? super Unit>, Object> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        int f181351a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ String f181352b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ String f181353c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        final /* synthetic */ c1 f181354d;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        g(String str, String str2, c1 c1Var, kotlin.coroutines.d<? super g> dVar) {
            super(2, dVar);
            this.f181352b = str;
            this.f181353c = str2;
            this.f181354d = c1Var;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final kotlin.coroutines.d<Unit> create(Object obj, kotlin.coroutines.d<?> dVar) {
            return new g(this.f181352b, this.f181353c, this.f181354d, dVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            Object objL = kotlin.coroutines.intrinsics.b.l();
            int i10 = this.f181351a;
            if (i10 == 0) {
                ResultKt.m(obj);
                if (!Intrinsics.areEqual(this.f181352b, this.f181353c)) {
                    com.planner5d.library.services.m0.f224434g.t();
                }
                c1 c1Var = this.f181354d;
                this.f181351a = 1;
                if (c1Var.J(this) == objL) {
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
            return ((g) create(s0Var, dVar)).invokeSuspend(Unit.f312394a);
        }
    }

    @kotlin.coroutines.jvm.internal.f(c = "com.planner5d.library.model.manager.InstallationManager$getLaunchFirst$1", f = "InstallationManager.kt", i = {}, l = {182}, m = "invokeSuspend", n = {}, s = {})
    static final class h extends kotlin.coroutines.jvm.internal.o implements Function2<kotlinx.coroutines.s0, kotlin.coroutines.d<? super Date>, Object> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        int f181355a;

        h(kotlin.coroutines.d<? super h> dVar) {
            super(2, dVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final kotlin.coroutines.d<Unit> create(Object obj, kotlin.coroutines.d<?> dVar) {
            return c1.this.new h(dVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) throws Throwable {
            Object objL = kotlin.coroutines.intrinsics.b.l();
            int i10 = this.f181355a;
            if (i10 != 0) {
                if (i10 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.m(obj);
                return obj;
            }
            ResultKt.m(obj);
            c1 c1Var = c1.this;
            this.f181355a = 1;
            Object objE = c1Var.E(this);
            return objE == objL ? objL : objE;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(kotlinx.coroutines.s0 s0Var, kotlin.coroutines.d<? super Date> dVar) {
            return ((h) create(s0Var, dVar)).invokeSuspend(Unit.f312394a);
        }
    }

    @kotlin.coroutines.jvm.internal.f(c = "com.planner5d.library.model.manager.InstallationManager", f = "InstallationManager.kt", i = {0, 0, 1, 1, 2, 3}, l = {307, 187, 188, 191}, m = "getLaunchFirstInternal", n = {"this", "$this$withLock_u24default$iv", "this", "$this$withLock_u24default$iv", "$this$withLock_u24default$iv", "$this$withLock_u24default$iv"}, s = {"L$0", "L$1", "L$0", "L$1", "L$0", "L$0"})
    static final class i extends kotlin.coroutines.jvm.internal.d {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        Object f181357a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        Object f181358b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        /* synthetic */ Object f181359c;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int f181361e;

        i(kotlin.coroutines.d<? super i> dVar) {
            super(dVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            this.f181359c = obj;
            this.f181361e |= Integer.MIN_VALUE;
            return c1.this.E(this);
        }
    }

    @kotlin.coroutines.jvm.internal.f(c = "com.planner5d.library.model.manager.InstallationManager$getLaunchTotal$1", f = "InstallationManager.kt", i = {0, 1}, l = {307, 200}, m = "invokeSuspend", n = {"$this$withLock_u24default$iv", "$this$withLock_u24default$iv"}, s = {"L$0", "L$0"})
    @SourceDebugExtension({"SMAP\nInstallationManager.kt\nKotlin\n*S Kotlin\n*F\n+ 1 InstallationManager.kt\ncom/planner5d/library/model/manager/InstallationManager$getLaunchTotal$1\n+ 2 Mutex.kt\nkotlinx/coroutines/sync/MutexKt\n*L\n1#1,301:1\n116#2,11:302\n*S KotlinDebug\n*F\n+ 1 InstallationManager.kt\ncom/planner5d/library/model/manager/InstallationManager$getLaunchTotal$1\n*L\n199#1:302,11\n*E\n"})
    static final class j extends kotlin.coroutines.jvm.internal.o implements Function2<kotlinx.coroutines.s0, kotlin.coroutines.d<? super Long>, Object> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        Object f181362a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        Object f181363b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        int f181364c;

        j(kotlin.coroutines.d<? super j> dVar) {
            super(2, dVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final kotlin.coroutines.d<Unit> create(Object obj, kotlin.coroutines.d<?> dVar) {
            return c1.this.new j(dVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) throws Throwable {
            kotlinx.coroutines.sync.a aVar;
            c1 c1Var;
            Throwable th2;
            kotlinx.coroutines.sync.a aVar2;
            Object objL = kotlin.coroutines.intrinsics.b.l();
            int i10 = this.f181364c;
            try {
                if (i10 == 0) {
                    ResultKt.m(obj);
                    aVar = c1.this.f181325n;
                    c1Var = c1.this;
                    this.f181362a = aVar;
                    this.f181363b = c1Var;
                    this.f181364c = 1;
                    if (aVar.h(null, this) == objL) {
                    }
                    return objL;
                }
                if (i10 != 1) {
                    if (i10 != 2) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    aVar2 = (kotlinx.coroutines.sync.a) this.f181362a;
                    try {
                        ResultKt.m(obj);
                        Long lG = kotlin.coroutines.jvm.internal.b.g(((Number) obj).longValue());
                        aVar2.i(null);
                        return lG;
                    } catch (Throwable th3) {
                        th2 = th3;
                        aVar2.i(null);
                        throw th2;
                    }
                }
                c1Var = (c1) this.f181363b;
                kotlinx.coroutines.sync.a aVar3 = (kotlinx.coroutines.sync.a) this.f181362a;
                ResultKt.m(obj);
                aVar = aVar3;
                com.planner5d.library.model.manager.config.p pVar = c1Var.f181318g;
                com.planner5d.library.services.r rVar = com.planner5d.library.services.r.launchTotal;
                this.f181362a = aVar;
                this.f181363b = null;
                this.f181364c = 2;
                Object objO = pVar.o(rVar, 1L, this);
                if (objO != objL) {
                    kotlinx.coroutines.sync.a aVar4 = aVar;
                    obj = objO;
                    aVar2 = aVar4;
                    Long lG2 = kotlin.coroutines.jvm.internal.b.g(((Number) obj).longValue());
                    aVar2.i(null);
                    return lG2;
                }
                return objL;
            } catch (Throwable th4) {
                kotlinx.coroutines.sync.a aVar5 = aVar;
                th2 = th4;
                aVar2 = aVar5;
                aVar2.i(null);
                throw th2;
            }
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(kotlinx.coroutines.s0 s0Var, kotlin.coroutines.d<? super Long> dVar) {
            return ((j) create(s0Var, dVar)).invokeSuspend(Unit.f312394a);
        }
    }

    @kotlin.coroutines.jvm.internal.f(c = "com.planner5d.library.model.manager.InstallationManager$initialize$2", f = "InstallationManager.kt", i = {0, 1, 2}, l = {307, com.planner5d.library.engine.input.f.b.X, com.planner5d.library.engine.input.f.b.X, com.planner5d.library.engine.input.f.b.f160732u0, 85}, m = "invokeSuspend", n = {"$this$withLock_u24default$iv", "$this$withLock_u24default$iv", "$this$withLock_u24default$iv"}, s = {"L$0", "L$0", "L$0"})
    @SourceDebugExtension({"SMAP\nInstallationManager.kt\nKotlin\n*S Kotlin\n*F\n+ 1 InstallationManager.kt\ncom/planner5d/library/model/manager/InstallationManager$initialize$2\n+ 2 Mutex.kt\nkotlinx/coroutines/sync/MutexKt\n*L\n1#1,301:1\n116#2,11:302\n*S KotlinDebug\n*F\n+ 1 InstallationManager.kt\ncom/planner5d/library/model/manager/InstallationManager$initialize$2\n*L\n78#1:302,11\n*E\n"})
    static final class k extends kotlin.coroutines.jvm.internal.o implements Function2<kotlinx.coroutines.s0, kotlin.coroutines.d<? super Object>, Object> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        Object f181366a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        Object f181367b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        Object f181368c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        int f181369d;

        k(kotlin.coroutines.d<? super k> dVar) {
            super(2, dVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final kotlin.coroutines.d<Unit> create(Object obj, kotlin.coroutines.d<?> dVar) {
            return c1.this.new k(dVar);
        }

        @Override // kotlin.jvm.functions.Function2
        public /* bridge */ /* synthetic */ Object invoke(kotlinx.coroutines.s0 s0Var, kotlin.coroutines.d<? super Object> dVar) {
            return invoke2(s0Var, (kotlin.coroutines.d<Object>) dVar);
        }

        /* JADX WARN: Code duplicated, block: B:38:0x00c6  */
        /* JADX WARN: Code duplicated, block: B:43:0x00db  */
        /* JADX WARN: Code duplicated, block: B:47:0x0102  */
        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) throws Throwable {
            kotlinx.coroutines.sync.a aVar;
            c1 c1Var;
            kotlinx.coroutines.sync.a aVar2;
            kotlinx.coroutines.sync.a aVar3;
            com.planner5d.library.model.manager.config.p pVar;
            com.planner5d.library.services.r rVar;
            long jLongValue;
            c1 c1Var2;
            Object obj2;
            com.planner5d.library.model.manager.crashreporting.l lVar;
            Object objD;
            Object obj3;
            com.planner5d.library.model.manager.crashreporting.l lVar2;
            Object objL = kotlin.coroutines.intrinsics.b.l();
            int i10 = this.f181369d;
            try {
                try {
                    if (i10 == 0) {
                        ResultKt.m(obj);
                        aVar = c1.this.f181325n;
                        c1Var = c1.this;
                        this.f181366a = aVar;
                        this.f181367b = c1Var;
                        this.f181369d = 1;
                        if (aVar.h(null, this) == objL) {
                        }
                        return objL;
                    }
                    if (i10 != 1) {
                        if (i10 == 2) {
                            pVar = (com.planner5d.library.model.manager.config.p) this.f181368c;
                            rVar = (com.planner5d.library.services.r) this.f181367b;
                            aVar3 = (kotlinx.coroutines.sync.a) this.f181366a;
                            try {
                                ResultKt.m(obj);
                                jLongValue = ((Number) obj).longValue() + 1;
                                this.f181366a = aVar3;
                                this.f181367b = null;
                                this.f181368c = null;
                                this.f181369d = 3;
                                if (pVar.r(rVar, jLongValue, this) != objL) {
                                    aVar2 = aVar3;
                                    Unit unit = Unit.f312394a;
                                    aVar2.i(null);
                                    c1Var2 = c1.this;
                                    this.f181366a = null;
                                    this.f181369d = 4;
                                    if (c1Var2.E(this) != objL) {
                                        c1.this.m();
                                        obj2 = c1.this.f181321j.get();
                                        c1 c1Var3 = c1.this;
                                        lVar = (com.planner5d.library.model.manager.crashreporting.l) obj2;
                                        this.f181366a = obj2;
                                        this.f181367b = lVar;
                                        this.f181369d = 5;
                                        objD = c1Var3.D(this);
                                        if (objD != objL) {
                                            obj = objD;
                                            obj3 = obj2;
                                            lVar2 = lVar;
                                            lVar2.J((String) obj);
                                            return obj3;
                                        }
                                    }
                                }
                                return objL;
                            } catch (Throwable th2) {
                                th = th2;
                                aVar2 = aVar3;
                                aVar2.i(null);
                                throw th;
                            }
                        }
                        if (i10 == 3) {
                            aVar2 = (kotlinx.coroutines.sync.a) this.f181366a;
                            try {
                                ResultKt.m(obj);
                                Unit unit2 = Unit.f312394a;
                                aVar2.i(null);
                                c1Var2 = c1.this;
                                this.f181366a = null;
                                this.f181369d = 4;
                                if (c1Var2.E(this) != objL) {
                                    c1.this.m();
                                    obj2 = c1.this.f181321j.get();
                                    c1 c1Var4 = c1.this;
                                    lVar = (com.planner5d.library.model.manager.crashreporting.l) obj2;
                                    this.f181366a = obj2;
                                    this.f181367b = lVar;
                                    this.f181369d = 5;
                                    objD = c1Var4.D(this);
                                    if (objD != objL) {
                                        obj = objD;
                                        obj3 = obj2;
                                        lVar2 = lVar;
                                    }
                                }
                                return objL;
                            } catch (Throwable th3) {
                                th = th3;
                                aVar2.i(null);
                                throw th;
                            }
                        }
                        if (i10 == 4) {
                            ResultKt.m(obj);
                            c1.this.m();
                            obj2 = c1.this.f181321j.get();
                            c1 c1Var5 = c1.this;
                            lVar = (com.planner5d.library.model.manager.crashreporting.l) obj2;
                            this.f181366a = obj2;
                            this.f181367b = lVar;
                            this.f181369d = 5;
                            objD = c1Var5.D(this);
                            if (objD != objL) {
                                obj = objD;
                                obj3 = obj2;
                                lVar2 = lVar;
                            }
                            return objL;
                        }
                        if (i10 != 5) {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        lVar2 = (com.planner5d.library.model.manager.crashreporting.l) this.f181367b;
                        obj3 = this.f181366a;
                        ResultKt.m(obj);
                        lVar2.J((String) obj);
                        return obj3;
                    }
                    c1Var = (c1) this.f181367b;
                    kotlinx.coroutines.sync.a aVar4 = (kotlinx.coroutines.sync.a) this.f181366a;
                    ResultKt.m(obj);
                    aVar = aVar4;
                    com.planner5d.library.model.manager.config.p pVar2 = c1Var.f181318g;
                    com.planner5d.library.services.r rVar2 = com.planner5d.library.services.r.launchTotal;
                    com.planner5d.library.model.manager.config.p pVar3 = c1Var.f181318g;
                    this.f181366a = aVar;
                    this.f181367b = rVar2;
                    this.f181368c = pVar2;
                    this.f181369d = 2;
                    Object objO = pVar3.o(rVar2, 0L, this);
                    if (objO != objL) {
                        aVar3 = aVar;
                        obj = objO;
                        pVar = pVar2;
                        rVar = rVar2;
                        jLongValue = ((Number) obj).longValue() + 1;
                        this.f181366a = aVar3;
                        this.f181367b = null;
                        this.f181368c = null;
                        this.f181369d = 3;
                        if (pVar.r(rVar, jLongValue, this) != objL) {
                            aVar2 = aVar3;
                            Unit unit3 = Unit.f312394a;
                            aVar2.i(null);
                            c1Var2 = c1.this;
                            this.f181366a = null;
                            this.f181369d = 4;
                            if (c1Var2.E(this) != objL) {
                                c1.this.m();
                                obj2 = c1.this.f181321j.get();
                                c1 c1Var6 = c1.this;
                                lVar = (com.planner5d.library.model.manager.crashreporting.l) obj2;
                                this.f181366a = obj2;
                                this.f181367b = lVar;
                                this.f181369d = 5;
                                objD = c1Var6.D(this);
                                if (objD != objL) {
                                    obj = objD;
                                    obj3 = obj2;
                                    lVar2 = lVar;
                                    lVar2.J((String) obj);
                                    return obj3;
                                }
                            }
                        }
                    }
                    return objL;
                } catch (Throwable th4) {
                    th = th4;
                    aVar2 = aVar;
                    aVar2.i(null);
                    throw th;
                }
            } catch (Exception e10) {
                timber.log.b.f381052a.e(e10);
                return Unit.f312394a;
            }
        }

        /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
        public final Object invoke2(kotlinx.coroutines.s0 s0Var, kotlin.coroutines.d<Object> dVar) {
            return ((k) create(s0Var, dVar)).invokeSuspend(Unit.f312394a);
        }
    }

    @kotlin.coroutines.jvm.internal.f(c = "com.planner5d.library.model.manager.InstallationManager$updateInstallation$1", f = "InstallationManager.kt", i = {}, l = {com.planner5d.library.engine.input.b.f160571z3}, m = "invokeSuspend", n = {}, s = {})
    static final class l extends kotlin.coroutines.jvm.internal.o implements Function2<kotlinx.coroutines.s0, kotlin.coroutines.d<? super Unit>, Object> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        int f181371a;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ String f181373c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        final /* synthetic */ ij.c<Object> f181374d;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        l(String str, ij.c<Object> cVar, kotlin.coroutines.d<? super l> dVar) {
            super(2, dVar);
            this.f181373c = str;
            this.f181374d = cVar;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final kotlin.coroutines.d<Unit> create(Object obj, kotlin.coroutines.d<?> dVar) {
            return c1.this.new l(this.f181373c, this.f181374d, dVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            Object objL = kotlin.coroutines.intrinsics.b.l();
            int i10 = this.f181371a;
            if (i10 == 0) {
                ResultKt.m(obj);
                c1 c1Var = c1.this;
                String str = this.f181373c;
                ij.c<Object> cVar = this.f181374d;
                this.f181371a = 1;
                if (c1Var.I(str, cVar, this) == objL) {
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
            return ((l) create(s0Var, dVar)).invokeSuspend(Unit.f312394a);
        }
    }

    @kotlin.coroutines.jvm.internal.f(c = "com.planner5d.library.model.manager.InstallationManager", f = "InstallationManager.kt", i = {0, 0, 0, 1, 1, 1, 2, 2, 2, 3, 3}, l = {279, 280, 285, 286, 290}, m = "updateInstallationInternal", n = {"this", "field", "data", "this", "field", "value", "this", "saveJson", "saveValue", "this", "saveValue"}, s = {"L$0", "L$1", "L$2", "L$0", "L$1", "L$2", "L$0", "L$1", "L$2", "L$0", "L$1"})
    static final class m extends kotlin.coroutines.jvm.internal.d {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        Object f181375a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        Object f181376b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        Object f181377c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        /* synthetic */ Object f181378d;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        int f181380f;

        m(kotlin.coroutines.d<? super m> dVar) {
            super(dVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            this.f181378d = obj;
            this.f181380f |= Integer.MIN_VALUE;
            return c1.this.H(null, null, this);
        }
    }

    @kotlin.coroutines.jvm.internal.f(c = "com.planner5d.library.model.manager.InstallationManager$updateInstallationInternal$dataValue$1", f = "InstallationManager.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
    static final class n extends kotlin.coroutines.jvm.internal.o implements Function2<kotlinx.coroutines.s0, kotlin.coroutines.d<? super Object>, Object> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        int f181381a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ ij.c<Object> f181382b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        n(ij.c<Object> cVar, kotlin.coroutines.d<? super n> dVar) {
            super(2, dVar);
            this.f181382b = cVar;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final kotlin.coroutines.d<Unit> create(Object obj, kotlin.coroutines.d<?> dVar) {
            return new n(this.f181382b, dVar);
        }

        @Override // kotlin.jvm.functions.Function2
        public /* bridge */ /* synthetic */ Object invoke(kotlinx.coroutines.s0 s0Var, kotlin.coroutines.d<? super Object> dVar) {
            return invoke2(s0Var, (kotlin.coroutines.d<Object>) dVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            kotlin.coroutines.intrinsics.b.l();
            if (this.f181381a != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.m(obj);
            return this.f181382b.get();
        }

        /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
        public final Object invoke2(kotlinx.coroutines.s0 s0Var, kotlin.coroutines.d<Object> dVar) {
            return ((n) create(s0Var, dVar)).invokeSuspend(Unit.f312394a);
        }
    }

    @kotlin.coroutines.jvm.internal.f(c = "com.planner5d.library.model.manager.InstallationManager$updateInstallationInternal$response$1", f = "InstallationManager.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
    static final class o extends kotlin.coroutines.jvm.internal.o implements pj.n<com.planner5d.library.api.b, id.a, kotlin.coroutines.d<? super com.planner5d.library.api.c>, Object> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        int f181383a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private /* synthetic */ Object f181384b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        /* synthetic */ Object f181385c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        final /* synthetic */ String f181386d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        final /* synthetic */ JSONObject f181387e;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        o(String str, JSONObject jSONObject, kotlin.coroutines.d<? super o> dVar) {
            super(3, dVar);
            this.f181386d = str;
            this.f181387e = jSONObject;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            kotlin.coroutines.intrinsics.b.l();
            if (this.f181383a != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.m(obj);
            return ((com.planner5d.library.api.b) this.f181384b).f0((id.a) this.f181385c, this.f181386d, this.f181387e);
        }

        @Override // pj.n
        /* JADX INFO: renamed from: k, reason: merged with bridge method [inline-methods] */
        public final Object invoke(com.planner5d.library.api.b bVar, id.a aVar, kotlin.coroutines.d<? super com.planner5d.library.api.c> dVar) {
            o oVar = new o(this.f181386d, this.f181387e, dVar);
            oVar.f181384b = bVar;
            oVar.f181385c = aVar;
            return oVar.invokeSuspend(Unit.f312394a);
        }
    }

    @kotlin.coroutines.jvm.internal.f(c = "com.planner5d.library.model.manager.InstallationManager", f = "InstallationManager.kt", i = {0, 0, 0, 0, 1, 1}, l = {307, 267}, m = "updateInstallationSafeUnderLock", n = {"this", "field", "data", "$this$withLock_u24default$iv", "this", "$this$withLock_u24default$iv"}, s = {"L$0", "L$1", "L$2", "L$3", "L$0", "L$1"})
    static final class p extends kotlin.coroutines.jvm.internal.d {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        Object f181388a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        Object f181389b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        Object f181390c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        Object f181391d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        /* synthetic */ Object f181392e;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        int f181394g;

        p(kotlin.coroutines.d<? super p> dVar) {
            super(dVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            this.f181392e = obj;
            this.f181394g |= Integer.MIN_VALUE;
            return c1.this.I(null, null, this);
        }
    }

    @kotlin.coroutines.jvm.internal.f(c = "com.planner5d.library.model.manager.InstallationManager", f = "InstallationManager.kt", i = {0}, l = {166}, m = "updateInstallationWithAdvertisingId", n = {"this"}, s = {"L$0"})
    static final class q extends kotlin.coroutines.jvm.internal.d {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        Object f181395a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        /* synthetic */ Object f181396b;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        int f181398d;

        q(kotlin.coroutines.d<? super q> dVar) {
            super(dVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            this.f181396b = obj;
            this.f181398d |= Integer.MIN_VALUE;
            return c1.this.J(this);
        }
    }

    @ij.a
    public c1(@NotNull fg.e<com.planner5d.library.model.manager.builtin.i> builtInDataManager, @NotNull fg.e<com.planner5d.library.services.utility.p0> formatter, @NotNull com.planner5d.library.application.b application, @NotNull com.planner5d.library.api.requests.c userApiRequester, @NotNull com.planner5d.library.model.manager.config.p preferences, @NotNull fg.e<com.planner5d.library.modules.user.user.t> userAuthorization, @NotNull com.planner5d.library.modules.user.user.z0 userRememberUsingBackups, @NotNull fg.e<com.planner5d.library.model.manager.crashreporting.l> crashReporter, @NotNull fg.e<sd.b> firebaseAvailability, @NotNull fg.e<t1> logRecordManager, @NotNull com.planner5d.library.services.utility.t coroutineDispatchersProvider) {
        Intrinsics.checkNotNullParameter(builtInDataManager, "builtInDataManager");
        Intrinsics.checkNotNullParameter(formatter, "formatter");
        Intrinsics.checkNotNullParameter(application, "application");
        Intrinsics.checkNotNullParameter(userApiRequester, "userApiRequester");
        Intrinsics.checkNotNullParameter(preferences, "preferences");
        Intrinsics.checkNotNullParameter(userAuthorization, "userAuthorization");
        Intrinsics.checkNotNullParameter(userRememberUsingBackups, "userRememberUsingBackups");
        Intrinsics.checkNotNullParameter(crashReporter, "crashReporter");
        Intrinsics.checkNotNullParameter(firebaseAvailability, "firebaseAvailability");
        Intrinsics.checkNotNullParameter(logRecordManager, "logRecordManager");
        Intrinsics.checkNotNullParameter(coroutineDispatchersProvider, "coroutineDispatchersProvider");
        this.f181314c = builtInDataManager;
        this.f181315d = formatter;
        this.f181316e = application;
        this.f181317f = userApiRequester;
        this.f181318g = preferences;
        this.f181319h = userAuthorization;
        this.f181320i = userRememberUsingBackups;
        this.f181321j = crashReporter;
        this.f181322k = firebaseAvailability;
        this.f181323l = logRecordManager;
        this.f181324m = coroutineDispatchersProvider;
        int i10 = 3 | 0;
        this.f181325n = kotlinx.coroutines.sync.g.b(false, 1, null);
        this.f181326o = kotlinx.coroutines.sync.g.b(false, 1, null);
        this.f181327p = kotlinx.coroutines.sync.g.b(false, 1, null);
        this.f181329r = "?";
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Code duplicated, block: B:33:0x00cd  */
    /* JADX WARN: Code duplicated, block: B:34:0x00d0  */
    /* JADX WARN: Code duplicated, block: B:37:0x00dd A[Catch: all -> 0x0080, TryCatch #0 {all -> 0x0080, blocks: (B:20:0x007b, B:40:0x00f1, B:44:0x00fa, B:25:0x008c, B:35:0x00d4, B:37:0x00dd), top: B:70:0x002c }] */
    /* JADX WARN: Code duplicated, block: B:39:0x00ef  */
    /* JADX WARN: Code duplicated, block: B:40:0x00f1 A[Catch: all -> 0x0080, PHI: r2 r10 r11
      0x00f1: PHI (r2v12 ??) = (r2v20 ??), (r2v21 ??) binds: [B:38:0x00ed, B:20:0x007b] A[DONT_GENERATE, DONT_INLINE]
      0x00f1: PHI (r10v25 kotlinx.coroutines.sync.a) = (r10v47 kotlinx.coroutines.sync.a), (r10v48 kotlinx.coroutines.sync.a) binds: [B:38:0x00ed, B:20:0x007b] A[DONT_GENERATE, DONT_INLINE]
      0x00f1: PHI (r11v19 java.lang.Object) = (r11v14 java.lang.Object), (r11v1 java.lang.Object) binds: [B:38:0x00ed, B:20:0x007b] A[DONT_GENERATE, DONT_INLINE], TRY_LEAVE, TryCatch #0 {all -> 0x0080, blocks: (B:20:0x007b, B:40:0x00f1, B:44:0x00fa, B:25:0x008c, B:35:0x00d4, B:37:0x00dd), top: B:70:0x002c }] */
    /* JADX WARN: Code duplicated, block: B:42:0x00f5  */
    /* JADX WARN: Code duplicated, block: B:44:0x00fa A[Catch: all -> 0x0080, PHI: r2 r10
      0x00fa: PHI (r2v11 ??) = (r2v22 ??), (r2v23 ??) binds: [B:36:0x00db, B:41:0x00f3] A[DONT_GENERATE, DONT_INLINE]
      0x00fa: PHI (r10v14 'this' ??) = (r10v49 'this' ??), (r10v50 'this' ??) binds: [B:36:0x00db, B:41:0x00f3] A[DONT_GENERATE, DONT_INLINE], TRY_ENTER, TRY_LEAVE, TryCatch #0 {all -> 0x0080, blocks: (B:20:0x007b, B:40:0x00f1, B:44:0x00fa, B:25:0x008c, B:35:0x00d4, B:37:0x00dd), top: B:70:0x002c }] */
    /* JADX WARN: Code duplicated, block: B:48:0x0169  */
    /* JADX WARN: Code duplicated, block: B:51:0x0174  */
    /* JADX WARN: Code duplicated, block: B:53:0x019a  */
    /* JADX WARN: Code duplicated, block: B:54:0x019c  */
    /* JADX WARN: Code duplicated, block: B:58:0x01b5  */
    /* JADX WARN: Code duplicated, block: B:64:0x01c7  */
    /* JADX WARN: Code duplicated, block: B:7:0x0018  */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r10v0, types: [com.planner5d.library.model.manager.c1, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r10v1, types: [kotlinx.coroutines.sync.a] */
    /* JADX WARN: Type inference failed for: r10v10 */
    /* JADX WARN: Type inference failed for: r10v14, types: [kotlinx.coroutines.sync.a] */
    /* JADX WARN: Type inference failed for: r10v2 */
    /* JADX WARN: Type inference failed for: r10v3, types: [kotlinx.coroutines.sync.a] */
    /* JADX WARN: Type inference failed for: r10v37, types: [kotlinx.coroutines.sync.a] */
    /* JADX WARN: Type inference failed for: r10v4, types: [com.planner5d.library.model.manager.c1, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r10v43 */
    /* JADX WARN: Type inference failed for: r10v44 */
    /* JADX WARN: Type inference failed for: r10v49 */
    /* JADX WARN: Type inference failed for: r10v50 */
    /* JADX WARN: Type inference failed for: r10v52 */
    /* JADX WARN: Type inference failed for: r10v53 */
    /* JADX WARN: Type inference failed for: r10v6 */
    /* JADX WARN: Type inference failed for: r2v11, types: [com.planner5d.library.model.manager.c1, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r2v12 */
    /* JADX WARN: Type inference failed for: r2v20 */
    /* JADX WARN: Type inference failed for: r2v21 */
    /* JADX WARN: Type inference failed for: r2v22 */
    /* JADX WARN: Type inference failed for: r2v23 */
    /* JADX WARN: Type inference failed for: r2v24 */
    /* JADX WARN: Type inference failed for: r2v5 */
    /* JADX WARN: Type inference failed for: r2v8, types: [com.planner5d.library.model.manager.c1, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r6v10 */
    /* JADX WARN: Type inference failed for: r6v11 */
    /* JADX WARN: Type inference failed for: r6v3 */
    /* JADX WARN: Type inference failed for: r6v4, types: [com.planner5d.library.model.manager.c1, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r6v5 */
    /* JADX WARN: Type inference failed for: r6v6, types: [com.planner5d.library.model.manager.c1] */
    public final Object B(kotlin.coroutines.d<? super String> dVar) throws Exception {
        b bVar;
        ?? r10;
        kotlinx.coroutines.sync.a aVar;
        ?? r11;
        Object objJ;
        ?? r12;
        kotlinx.coroutines.sync.a aVar2;
        ?? r13;
        ?? r14;
        kotlinx.coroutines.sync.a aVar3;
        ?? r15;
        String str;
        com.planner5d.library.api.c cVar;
        String string;
        kotlinx.coroutines.sync.a aVar4;
        String str2;
        kotlinx.coroutines.sync.a aVar5;
        ?? r16;
        com.planner5d.library.model.manager.config.p pVar;
        String str3;
        if (dVar instanceof b) {
            bVar = (b) dVar;
            int i10 = bVar.f181336g;
            if ((i10 & Integer.MIN_VALUE) != 0) {
                bVar.f181336g = i10 - Integer.MIN_VALUE;
            } else {
                bVar = new b(dVar);
            }
        } else {
            bVar = new b(dVar);
        }
        Object objN = bVar.f181334e;
        Object objL = kotlin.coroutines.intrinsics.b.l();
        try {
            try {
                switch (bVar.f181336g) {
                    case 0:
                        ResultKt.m(objN);
                        aVar = this.f181325n;
                        bVar.f181330a = this;
                        bVar.f181331b = aVar;
                        bVar.f181336g = 1;
                        this = this;
                        if (aVar.h(null, bVar) != objL) {
                            try {
                                com.planner5d.library.model.manager.config.p pVar2 = r11.f181318g;
                                bVar.f181330a = r11;
                                bVar.f181331b = aVar;
                                bVar.f181336g = 2;
                                objJ = pVar2.J("installationHash", bVar);
                                if (objJ == objL) {
                                    r12 = r11;
                                    aVar2 = aVar;
                                    objN = objJ;
                                    r13 = r12;
                                    this = aVar2;
                                    if (((Boolean) objN).booleanValue()) {
                                        com.planner5d.library.model.manager.config.p pVar3 = r12.f181318g;
                                        bVar.f181330a = r12;
                                        bVar.f181331b = aVar2;
                                        bVar.f181336g = 3;
                                        objN = pVar3.n("installationHash", null, bVar);
                                        if (objN == objL) {
                                            r15 = r12;
                                            aVar3 = aVar2;
                                        } else {
                                            r15 = r12;
                                            aVar3 = aVar2;
                                            str = (String) objN;
                                            r13 = r15;
                                            this = aVar3;
                                            if (str != null) {
                                                aVar3.i(null);
                                                return str;
                                            }
                                            Unit unit = Unit.f312394a;
                                            this.i(null);
                                            String packageName = r13.f181316e.getPackageName();
                                            JSONObject jSONObject = new JSONObject();
                                            jSONObject.put(com.planner5d.library.services.r.id.f224891a, Settings.Secure.getString(r13.f181316e.getContentResolver(), "android_id"));
                                            jSONObject.put(com.planner5d.library.services.r.application.f224891a, packageName);
                                            jSONObject.put(com.planner5d.library.services.r.applicationVersion.f224891a, com.planner5d.library.services.utility.h3.j(r13.f181316e));
                                            jSONObject.put(com.planner5d.library.services.r.operatingSystem.f224891a, com.planner5d.library.services.utility.h3.a());
                                            jSONObject.put(com.planner5d.library.services.r.device.f224891a, com.planner5d.library.services.utility.h3.c());
                                            kotlinx.coroutines.n0 n0VarD = r13.f181324m.d();
                                            c cVar2 = new c(jSONObject, null);
                                            bVar.f181330a = r13;
                                            bVar.f181331b = null;
                                            bVar.f181336g = 4;
                                            objN = kotlinx.coroutines.i.h(n0VarD, cVar2, bVar);
                                            if (objN != objL) {
                                                r14 = r13;
                                                cVar = (com.planner5d.library.api.c) objN;
                                                if (!cVar.h()) {
                                                    throw new Exception("Failed to obtain installation");
                                                }
                                                string = cVar.a().getString(com.planner5d.library.services.r.installationHash.f224891a);
                                                aVar4 = r14.f181325n;
                                                bVar.f181330a = r14;
                                                bVar.f181331b = string;
                                                bVar.f181332c = string;
                                                bVar.f181333d = aVar4;
                                                bVar.f181336g = 5;
                                                if (aVar4.h(null, bVar) == objL) {
                                                    str2 = string;
                                                    r16 = r14;
                                                    aVar5 = aVar4;
                                                    pVar = r16.f181318g;
                                                    bVar.f181330a = string;
                                                    bVar.f181331b = aVar5;
                                                    bVar.f181332c = null;
                                                    bVar.f181333d = null;
                                                    bVar.f181336g = 6;
                                                    if (pVar.v("installationHash", str2, bVar) != objL) {
                                                        str3 = string;
                                                        this = aVar5;
                                                        Unit unit2 = Unit.f312394a;
                                                        this.i(null);
                                                        Intrinsics.checkNotNullExpressionValue(str3, "apply(...)");
                                                        return str3;
                                                    }
                                                }
                                            }
                                        }
                                    } else {
                                        Unit unit3 = Unit.f312394a;
                                        this.i(null);
                                        String packageName2 = r13.f181316e.getPackageName();
                                        JSONObject jSONObject2 = new JSONObject();
                                        jSONObject2.put(com.planner5d.library.services.r.id.f224891a, Settings.Secure.getString(r13.f181316e.getContentResolver(), "android_id"));
                                        jSONObject2.put(com.planner5d.library.services.r.application.f224891a, packageName2);
                                        jSONObject2.put(com.planner5d.library.services.r.applicationVersion.f224891a, com.planner5d.library.services.utility.h3.j(r13.f181316e));
                                        jSONObject2.put(com.planner5d.library.services.r.operatingSystem.f224891a, com.planner5d.library.services.utility.h3.a());
                                        jSONObject2.put(com.planner5d.library.services.r.device.f224891a, com.planner5d.library.services.utility.h3.c());
                                        kotlinx.coroutines.n0 n0VarD2 = r13.f181324m.d();
                                        c cVar3 = new c(jSONObject2, null);
                                        bVar.f181330a = r13;
                                        bVar.f181331b = null;
                                        bVar.f181336g = 4;
                                        objN = kotlinx.coroutines.i.h(n0VarD2, cVar3, bVar);
                                        if (objN != objL) {
                                            r14 = r13;
                                            cVar = (com.planner5d.library.api.c) objN;
                                            if (!cVar.h()) {
                                                throw new Exception("Failed to obtain installation");
                                            }
                                            string = cVar.a().getString(com.planner5d.library.services.r.installationHash.f224891a);
                                            aVar4 = r14.f181325n;
                                            bVar.f181330a = r14;
                                            bVar.f181331b = string;
                                            bVar.f181332c = string;
                                            bVar.f181333d = aVar4;
                                            bVar.f181336g = 5;
                                            if (aVar4.h(null, bVar) == objL) {
                                                str2 = string;
                                                r16 = r14;
                                                aVar5 = aVar4;
                                                pVar = r16.f181318g;
                                                bVar.f181330a = string;
                                                bVar.f181331b = aVar5;
                                                bVar.f181332c = null;
                                                bVar.f181333d = null;
                                                bVar.f181336g = 6;
                                                if (pVar.v("installationHash", str2, bVar) != objL) {
                                                    str3 = string;
                                                    this = aVar5;
                                                    Unit unit4 = Unit.f312394a;
                                                    this.i(null);
                                                    Intrinsics.checkNotNullExpressionValue(str3, "apply(...)");
                                                    return str3;
                                                }
                                            }
                                        }
                                    }
                                }
                            } catch (Throwable th2) {
                                kotlinx.coroutines.sync.a aVar6 = aVar;
                                th = th2;
                                r10 = aVar6;
                                r10.i(null);
                                throw th;
                            }
                        }
                        return objL;
                    case 1:
                        kotlinx.coroutines.sync.a aVar7 = (kotlinx.coroutines.sync.a) bVar.f181331b;
                        c1 c1Var = (c1) bVar.f181330a;
                        ResultKt.m(objN);
                        aVar = aVar7;
                        r11 = c1Var;
                        com.planner5d.library.model.manager.config.p pVar4 = r11.f181318g;
                        bVar.f181330a = r11;
                        bVar.f181331b = aVar;
                        bVar.f181336g = 2;
                        objJ = pVar4.J("installationHash", bVar);
                        if (objJ == objL) {
                            r12 = r11;
                            aVar2 = aVar;
                            objN = objJ;
                            r13 = r12;
                            this = aVar2;
                            if (((Boolean) objN).booleanValue()) {
                                com.planner5d.library.model.manager.config.p pVar5 = r12.f181318g;
                                bVar.f181330a = r12;
                                bVar.f181331b = aVar2;
                                bVar.f181336g = 3;
                                objN = pVar5.n("installationHash", null, bVar);
                                if (objN == objL) {
                                    r15 = r12;
                                    aVar3 = aVar2;
                                } else {
                                    r15 = r12;
                                    aVar3 = aVar2;
                                    str = (String) objN;
                                    r13 = r15;
                                    this = aVar3;
                                    if (str != null) {
                                        aVar3.i(null);
                                        return str;
                                    }
                                    Unit unit5 = Unit.f312394a;
                                    this.i(null);
                                    String packageName3 = r13.f181316e.getPackageName();
                                    JSONObject jSONObject3 = new JSONObject();
                                    jSONObject3.put(com.planner5d.library.services.r.id.f224891a, Settings.Secure.getString(r13.f181316e.getContentResolver(), "android_id"));
                                    jSONObject3.put(com.planner5d.library.services.r.application.f224891a, packageName3);
                                    jSONObject3.put(com.planner5d.library.services.r.applicationVersion.f224891a, com.planner5d.library.services.utility.h3.j(r13.f181316e));
                                    jSONObject3.put(com.planner5d.library.services.r.operatingSystem.f224891a, com.planner5d.library.services.utility.h3.a());
                                    jSONObject3.put(com.planner5d.library.services.r.device.f224891a, com.planner5d.library.services.utility.h3.c());
                                    kotlinx.coroutines.n0 n0VarD3 = r13.f181324m.d();
                                    c cVar4 = new c(jSONObject3, null);
                                    bVar.f181330a = r13;
                                    bVar.f181331b = null;
                                    bVar.f181336g = 4;
                                    objN = kotlinx.coroutines.i.h(n0VarD3, cVar4, bVar);
                                    if (objN != objL) {
                                        r14 = r13;
                                        cVar = (com.planner5d.library.api.c) objN;
                                        if (!cVar.h()) {
                                            throw new Exception("Failed to obtain installation");
                                        }
                                        string = cVar.a().getString(com.planner5d.library.services.r.installationHash.f224891a);
                                        aVar4 = r14.f181325n;
                                        bVar.f181330a = r14;
                                        bVar.f181331b = string;
                                        bVar.f181332c = string;
                                        bVar.f181333d = aVar4;
                                        bVar.f181336g = 5;
                                        if (aVar4.h(null, bVar) == objL) {
                                            str2 = string;
                                            r16 = r14;
                                            aVar5 = aVar4;
                                            pVar = r16.f181318g;
                                            bVar.f181330a = string;
                                            bVar.f181331b = aVar5;
                                            bVar.f181332c = null;
                                            bVar.f181333d = null;
                                            bVar.f181336g = 6;
                                            if (pVar.v("installationHash", str2, bVar) != objL) {
                                                str3 = string;
                                                this = aVar5;
                                                Unit unit6 = Unit.f312394a;
                                                this.i(null);
                                                Intrinsics.checkNotNullExpressionValue(str3, "apply(...)");
                                                return str3;
                                            }
                                        }
                                    }
                                }
                            } else {
                                Unit unit7 = Unit.f312394a;
                                this.i(null);
                                String packageName4 = r13.f181316e.getPackageName();
                                JSONObject jSONObject4 = new JSONObject();
                                jSONObject4.put(com.planner5d.library.services.r.id.f224891a, Settings.Secure.getString(r13.f181316e.getContentResolver(), "android_id"));
                                jSONObject4.put(com.planner5d.library.services.r.application.f224891a, packageName4);
                                jSONObject4.put(com.planner5d.library.services.r.applicationVersion.f224891a, com.planner5d.library.services.utility.h3.j(r13.f181316e));
                                jSONObject4.put(com.planner5d.library.services.r.operatingSystem.f224891a, com.planner5d.library.services.utility.h3.a());
                                jSONObject4.put(com.planner5d.library.services.r.device.f224891a, com.planner5d.library.services.utility.h3.c());
                                kotlinx.coroutines.n0 n0VarD4 = r13.f181324m.d();
                                c cVar5 = new c(jSONObject4, null);
                                bVar.f181330a = r13;
                                bVar.f181331b = null;
                                bVar.f181336g = 4;
                                objN = kotlinx.coroutines.i.h(n0VarD4, cVar5, bVar);
                                if (objN != objL) {
                                    r14 = r13;
                                    cVar = (com.planner5d.library.api.c) objN;
                                    if (!cVar.h()) {
                                        throw new Exception("Failed to obtain installation");
                                    }
                                    string = cVar.a().getString(com.planner5d.library.services.r.installationHash.f224891a);
                                    aVar4 = r14.f181325n;
                                    bVar.f181330a = r14;
                                    bVar.f181331b = string;
                                    bVar.f181332c = string;
                                    bVar.f181333d = aVar4;
                                    bVar.f181336g = 5;
                                    if (aVar4.h(null, bVar) == objL) {
                                        str2 = string;
                                        r16 = r14;
                                        aVar5 = aVar4;
                                        pVar = r16.f181318g;
                                        bVar.f181330a = string;
                                        bVar.f181331b = aVar5;
                                        bVar.f181332c = null;
                                        bVar.f181333d = null;
                                        bVar.f181336g = 6;
                                        if (pVar.v("installationHash", str2, bVar) != objL) {
                                            str3 = string;
                                            this = aVar5;
                                            Unit unit8 = Unit.f312394a;
                                            this.i(null);
                                            Intrinsics.checkNotNullExpressionValue(str3, "apply(...)");
                                            return str3;
                                        }
                                    }
                                }
                            }
                        }
                        return objL;
                    case 2:
                        kotlinx.coroutines.sync.a aVar8 = (kotlinx.coroutines.sync.a) bVar.f181331b;
                        c1 c1Var2 = (c1) bVar.f181330a;
                        ResultKt.m(objN);
                        r12 = c1Var2;
                        aVar2 = aVar8;
                        r13 = r12;
                        this = aVar2;
                        if (((Boolean) objN).booleanValue()) {
                            com.planner5d.library.model.manager.config.p pVar6 = r12.f181318g;
                            bVar.f181330a = r12;
                            bVar.f181331b = aVar2;
                            bVar.f181336g = 3;
                            objN = pVar6.n("installationHash", null, bVar);
                            if (objN == objL) {
                                r15 = r12;
                                aVar3 = aVar2;
                            } else {
                                r15 = r12;
                                aVar3 = aVar2;
                                str = (String) objN;
                                r13 = r15;
                                this = aVar3;
                                if (str != null) {
                                    aVar3.i(null);
                                    return str;
                                }
                                Unit unit9 = Unit.f312394a;
                                this.i(null);
                                String packageName5 = r13.f181316e.getPackageName();
                                JSONObject jSONObject5 = new JSONObject();
                                jSONObject5.put(com.planner5d.library.services.r.id.f224891a, Settings.Secure.getString(r13.f181316e.getContentResolver(), "android_id"));
                                jSONObject5.put(com.planner5d.library.services.r.application.f224891a, packageName5);
                                jSONObject5.put(com.planner5d.library.services.r.applicationVersion.f224891a, com.planner5d.library.services.utility.h3.j(r13.f181316e));
                                jSONObject5.put(com.planner5d.library.services.r.operatingSystem.f224891a, com.planner5d.library.services.utility.h3.a());
                                jSONObject5.put(com.planner5d.library.services.r.device.f224891a, com.planner5d.library.services.utility.h3.c());
                                kotlinx.coroutines.n0 n0VarD5 = r13.f181324m.d();
                                c cVar6 = new c(jSONObject5, null);
                                bVar.f181330a = r13;
                                bVar.f181331b = null;
                                bVar.f181336g = 4;
                                objN = kotlinx.coroutines.i.h(n0VarD5, cVar6, bVar);
                                if (objN != objL) {
                                    r14 = r13;
                                    cVar = (com.planner5d.library.api.c) objN;
                                    if (!cVar.h()) {
                                        throw new Exception("Failed to obtain installation");
                                    }
                                    string = cVar.a().getString(com.planner5d.library.services.r.installationHash.f224891a);
                                    aVar4 = r14.f181325n;
                                    bVar.f181330a = r14;
                                    bVar.f181331b = string;
                                    bVar.f181332c = string;
                                    bVar.f181333d = aVar4;
                                    bVar.f181336g = 5;
                                    if (aVar4.h(null, bVar) == objL) {
                                        str2 = string;
                                        r16 = r14;
                                        aVar5 = aVar4;
                                        pVar = r16.f181318g;
                                        bVar.f181330a = string;
                                        bVar.f181331b = aVar5;
                                        bVar.f181332c = null;
                                        bVar.f181333d = null;
                                        bVar.f181336g = 6;
                                        if (pVar.v("installationHash", str2, bVar) != objL) {
                                            str3 = string;
                                            this = aVar5;
                                            Unit unit10 = Unit.f312394a;
                                            this.i(null);
                                            Intrinsics.checkNotNullExpressionValue(str3, "apply(...)");
                                            return str3;
                                        }
                                    }
                                }
                            }
                        } else {
                            Unit unit11 = Unit.f312394a;
                            this.i(null);
                            String packageName6 = r13.f181316e.getPackageName();
                            JSONObject jSONObject6 = new JSONObject();
                            jSONObject6.put(com.planner5d.library.services.r.id.f224891a, Settings.Secure.getString(r13.f181316e.getContentResolver(), "android_id"));
                            jSONObject6.put(com.planner5d.library.services.r.application.f224891a, packageName6);
                            jSONObject6.put(com.planner5d.library.services.r.applicationVersion.f224891a, com.planner5d.library.services.utility.h3.j(r13.f181316e));
                            jSONObject6.put(com.planner5d.library.services.r.operatingSystem.f224891a, com.planner5d.library.services.utility.h3.a());
                            jSONObject6.put(com.planner5d.library.services.r.device.f224891a, com.planner5d.library.services.utility.h3.c());
                            kotlinx.coroutines.n0 n0VarD6 = r13.f181324m.d();
                            c cVar7 = new c(jSONObject6, null);
                            bVar.f181330a = r13;
                            bVar.f181331b = null;
                            bVar.f181336g = 4;
                            objN = kotlinx.coroutines.i.h(n0VarD6, cVar7, bVar);
                            if (objN != objL) {
                                r14 = r13;
                                cVar = (com.planner5d.library.api.c) objN;
                                if (!cVar.h()) {
                                    throw new Exception("Failed to obtain installation");
                                }
                                string = cVar.a().getString(com.planner5d.library.services.r.installationHash.f224891a);
                                aVar4 = r14.f181325n;
                                bVar.f181330a = r14;
                                bVar.f181331b = string;
                                bVar.f181332c = string;
                                bVar.f181333d = aVar4;
                                bVar.f181336g = 5;
                                if (aVar4.h(null, bVar) == objL) {
                                    str2 = string;
                                    r16 = r14;
                                    aVar5 = aVar4;
                                    pVar = r16.f181318g;
                                    bVar.f181330a = string;
                                    bVar.f181331b = aVar5;
                                    bVar.f181332c = null;
                                    bVar.f181333d = null;
                                    bVar.f181336g = 6;
                                    if (pVar.v("installationHash", str2, bVar) != objL) {
                                        str3 = string;
                                        this = aVar5;
                                        Unit unit12 = Unit.f312394a;
                                        this.i(null);
                                        Intrinsics.checkNotNullExpressionValue(str3, "apply(...)");
                                        return str3;
                                    }
                                }
                            }
                        }
                        return objL;
                    case 3:
                        kotlinx.coroutines.sync.a aVar9 = (kotlinx.coroutines.sync.a) bVar.f181331b;
                        c1 c1Var3 = (c1) bVar.f181330a;
                        ResultKt.m(objN);
                        r15 = c1Var3;
                        aVar3 = aVar9;
                        r15 = r12;
                        aVar3 = aVar2;
                        str = (String) objN;
                        r13 = r15;
                        this = aVar3;
                        if (str != null) {
                            aVar3.i(null);
                            return str;
                        }
                        Unit unit13 = Unit.f312394a;
                        this.i(null);
                        String packageName7 = r13.f181316e.getPackageName();
                        JSONObject jSONObject7 = new JSONObject();
                        jSONObject7.put(com.planner5d.library.services.r.id.f224891a, Settings.Secure.getString(r13.f181316e.getContentResolver(), "android_id"));
                        jSONObject7.put(com.planner5d.library.services.r.application.f224891a, packageName7);
                        jSONObject7.put(com.planner5d.library.services.r.applicationVersion.f224891a, com.planner5d.library.services.utility.h3.j(r13.f181316e));
                        jSONObject7.put(com.planner5d.library.services.r.operatingSystem.f224891a, com.planner5d.library.services.utility.h3.a());
                        jSONObject7.put(com.planner5d.library.services.r.device.f224891a, com.planner5d.library.services.utility.h3.c());
                        kotlinx.coroutines.n0 n0VarD7 = r13.f181324m.d();
                        c cVar8 = new c(jSONObject7, null);
                        bVar.f181330a = r13;
                        bVar.f181331b = null;
                        bVar.f181336g = 4;
                        objN = kotlinx.coroutines.i.h(n0VarD7, cVar8, bVar);
                        if (objN != objL) {
                            r14 = r13;
                            cVar = (com.planner5d.library.api.c) objN;
                            if (!cVar.h()) {
                                throw new Exception("Failed to obtain installation");
                            }
                            string = cVar.a().getString(com.planner5d.library.services.r.installationHash.f224891a);
                            aVar4 = r14.f181325n;
                            bVar.f181330a = r14;
                            bVar.f181331b = string;
                            bVar.f181332c = string;
                            bVar.f181333d = aVar4;
                            bVar.f181336g = 5;
                            if (aVar4.h(null, bVar) == objL) {
                                str2 = string;
                                r16 = r14;
                                aVar5 = aVar4;
                                pVar = r16.f181318g;
                                bVar.f181330a = string;
                                bVar.f181331b = aVar5;
                                bVar.f181332c = null;
                                bVar.f181333d = null;
                                bVar.f181336g = 6;
                                if (pVar.v("installationHash", str2, bVar) != objL) {
                                    str3 = string;
                                    this = aVar5;
                                    Unit unit14 = Unit.f312394a;
                                    this.i(null);
                                    Intrinsics.checkNotNullExpressionValue(str3, "apply(...)");
                                    return str3;
                                }
                            }
                        }
                        return objL;
                    case 4:
                        c1 c1Var4 = (c1) bVar.f181330a;
                        ResultKt.m(objN);
                        r14 = c1Var4;
                        cVar = (com.planner5d.library.api.c) objN;
                        if (!cVar.h()) {
                            throw new Exception("Failed to obtain installation");
                        }
                        string = cVar.a().getString(com.planner5d.library.services.r.installationHash.f224891a);
                        aVar4 = r14.f181325n;
                        bVar.f181330a = r14;
                        bVar.f181331b = string;
                        bVar.f181332c = string;
                        bVar.f181333d = aVar4;
                        bVar.f181336g = 5;
                        if (aVar4.h(null, bVar) == objL) {
                            str2 = string;
                            r16 = r14;
                            aVar5 = aVar4;
                            pVar = r16.f181318g;
                            bVar.f181330a = string;
                            bVar.f181331b = aVar5;
                            bVar.f181332c = null;
                            bVar.f181333d = null;
                            bVar.f181336g = 6;
                            if (pVar.v("installationHash", str2, bVar) != objL) {
                                str3 = string;
                                this = aVar5;
                                Unit unit15 = Unit.f312394a;
                                this.i(null);
                                Intrinsics.checkNotNullExpressionValue(str3, "apply(...)");
                                return str3;
                            }
                        }
                        return objL;
                    case 5:
                        kotlinx.coroutines.sync.a aVar10 = (kotlinx.coroutines.sync.a) bVar.f181333d;
                        String str4 = (String) bVar.f181332c;
                        String str5 = (String) bVar.f181331b;
                        c1 c1Var5 = (c1) bVar.f181330a;
                        ResultKt.m(objN);
                        str2 = str4;
                        string = str5;
                        r16 = c1Var5;
                        aVar5 = aVar10;
                        pVar = r16.f181318g;
                        bVar.f181330a = string;
                        bVar.f181331b = aVar5;
                        bVar.f181332c = null;
                        bVar.f181333d = null;
                        bVar.f181336g = 6;
                        if (pVar.v("installationHash", str2, bVar) != objL) {
                            str3 = string;
                            this = aVar5;
                            Unit unit16 = Unit.f312394a;
                            this.i(null);
                            Intrinsics.checkNotNullExpressionValue(str3, "apply(...)");
                            return str3;
                        }
                        return objL;
                    case 6:
                        kotlinx.coroutines.sync.a aVar11 = (kotlinx.coroutines.sync.a) bVar.f181331b;
                        str3 = (String) bVar.f181330a;
                        ResultKt.m(objN);
                        this = aVar11;
                        Unit unit17 = Unit.f312394a;
                        this.i(null);
                        Intrinsics.checkNotNullExpressionValue(str3, "apply(...)");
                        return str3;
                    default:
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
            } catch (Throwable th3) {
                th = th3;
                r10 = this;
            }
        } catch (Throwable th4) {
            this.i(null);
            throw th4;
        }
    }

    private final String C() {
        try {
            AdvertisingIdClient.Info advertisingIdInfo = AdvertisingIdClient.getAdvertisingIdInfo(this.f181316e);
            if (advertisingIdInfo != null) {
                return advertisingIdInfo.getId();
            }
        } catch (Throwable unused) {
        }
        return null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Code duplicated, block: B:7:0x0016  */
    public final Object D(kotlin.coroutines.d<? super String> dVar) throws Throwable {
        f fVar;
        String str;
        kotlinx.coroutines.sync.a aVar;
        Throwable th2;
        kotlinx.coroutines.sync.a aVar2;
        String str2;
        c1 c1Var;
        if (dVar instanceof f) {
            fVar = (f) dVar;
            int i10 = fVar.f181350f;
            if ((i10 & Integer.MIN_VALUE) != 0) {
                fVar.f181350f = i10 - Integer.MIN_VALUE;
            } else {
                fVar = new f(dVar);
            }
        } else {
            fVar = new f(dVar);
        }
        Object obj = fVar.f181348d;
        Object objL = kotlin.coroutines.intrinsics.b.l();
        int i11 = fVar.f181350f;
        try {
            if (i11 == 0) {
                ResultKt.m(obj);
                str = this.f181329r;
                aVar = this.f181326o;
                fVar.f181345a = this;
                fVar.f181346b = str;
                fVar.f181347c = aVar;
                fVar.f181350f = 1;
                if (aVar.h(null, fVar) == objL) {
                }
                return objL;
            }
            if (i11 != 1) {
                if (i11 != 2) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                aVar2 = (kotlinx.coroutines.sync.a) fVar.f181347c;
                str2 = (String) fVar.f181346b;
                c1Var = (c1) fVar.f181345a;
                try {
                    ResultKt.m(obj);
                    String str3 = (String) obj;
                    aVar2.i(null);
                    c1Var.f181329r = str3;
                    kotlinx.coroutines.k.f(c1Var.f181324m.g(), c1Var.f181324m.d(), null, new g(str3, str2, c1Var, null), 2, null);
                    return str3;
                } catch (Throwable th3) {
                    th2 = th3;
                    aVar2.i(null);
                    throw th2;
                }
            }
            kotlinx.coroutines.sync.a aVar3 = (kotlinx.coroutines.sync.a) fVar.f181347c;
            String str4 = (String) fVar.f181346b;
            c1 c1Var2 = (c1) fVar.f181345a;
            ResultKt.m(obj);
            str = str4;
            aVar = aVar3;
            this = c1Var2;
            fVar.f181345a = this;
            fVar.f181346b = str;
            fVar.f181347c = aVar;
            fVar.f181350f = 2;
            Object objB = this.B(fVar);
            if (objB != objL) {
                str2 = str;
                obj = objB;
                c1Var = this;
                aVar2 = aVar;
                String str5 = (String) obj;
                aVar2.i(null);
                c1Var.f181329r = str5;
                kotlinx.coroutines.k.f(c1Var.f181324m.g(), c1Var.f181324m.d(), null, new g(str5, str2, c1Var, null), 2, null);
                return str5;
            }
            return objL;
        } catch (Throwable th4) {
            th2 = th4;
            aVar2 = aVar;
            aVar2.i(null);
            throw th2;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Code duplicated, block: B:41:0x00b7 A[Catch: all -> 0x006c, TRY_LEAVE, TryCatch #1 {all -> 0x006c, blocks: (B:26:0x0068, B:39:0x00ad, B:41:0x00b7, B:47:0x00d7), top: B:59:0x0068 }] */
    /* JADX WARN: Code duplicated, block: B:44:0x00cd  */
    /* JADX WARN: Code duplicated, block: B:47:0x00d7 A[Catch: all -> 0x006c, TRY_ENTER, TRY_LEAVE, TryCatch #1 {all -> 0x006c, blocks: (B:26:0x0068, B:39:0x00ad, B:41:0x00b7, B:47:0x00d7), top: B:59:0x0068 }] */
    /* JADX WARN: Code duplicated, block: B:50:0x00fe  */
    /* JADX WARN: Code duplicated, block: B:7:0x0016  */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v12 */
    /* JADX WARN: Type inference failed for: r0v26 */
    /* JADX WARN: Type inference failed for: r0v3, types: [kotlinx.coroutines.sync.a] */
    /* JADX WARN: Type inference failed for: r0v4 */
    /* JADX WARN: Type inference fix 'apply assigned field type' failed
    java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$UnknownArg
    	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:596)
    	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
    	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
     */
    public final Object E(kotlin.coroutines.d<? super Date> dVar) throws Throwable {
        i iVar;
        ?? r10;
        kotlinx.coroutines.sync.a aVar;
        kotlinx.coroutines.sync.a aVar2;
        c1 c1Var;
        kotlinx.coroutines.sync.a aVar3;
        Long lG;
        long jLongValue;
        com.planner5d.library.model.manager.config.p pVar;
        com.planner5d.library.services.r rVar;
        kotlinx.coroutines.sync.a aVar4;
        Long l10;
        kotlinx.coroutines.sync.a aVar5;
        long jLongValue2;
        kotlinx.coroutines.sync.a aVar6;
        if (dVar instanceof i) {
            i iVar2 = (i) dVar;
            int i10 = iVar2.f181361e;
            if ((i10 & Integer.MIN_VALUE) != 0) {
                iVar2.f181361e = i10 - Integer.MIN_VALUE;
                iVar = iVar2;
            } else {
                iVar = new i(dVar);
            }
        } else {
            iVar = new i(dVar);
        }
        Object objO = iVar.f181359c;
        Object objL = kotlin.coroutines.intrinsics.b.l();
        int i11 = iVar.f181361e;
        int i12 = 5 << 2;
        try {
            try {
                if (i11 == 0) {
                    ResultKt.m(objO);
                    aVar = this.f181325n;
                    iVar.f181357a = this;
                    iVar.f181358b = aVar;
                    iVar.f181361e = 1;
                    if (aVar.h(null, iVar) == objL) {
                        aVar2 = aVar;
                    }
                    return objL;
                }
                if (i11 != 1) {
                    if (i11 != 2) {
                        if (i11 == 3) {
                            kotlinx.coroutines.sync.a aVar7 = (kotlinx.coroutines.sync.a) iVar.f181357a;
                            ResultKt.m(objO);
                            aVar5 = aVar7;
                            jLongValue2 = ((Number) objO).longValue();
                            aVar6 = aVar5;
                            aVar6.i(null);
                            return new Date(jLongValue2);
                        }
                        if (i11 != 4) {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        l10 = (Long) iVar.f181358b;
                        kotlinx.coroutines.sync.a aVar8 = (kotlinx.coroutines.sync.a) iVar.f181357a;
                        ResultKt.m(objO);
                        aVar4 = aVar8;
                        jLongValue2 = l10.longValue();
                        aVar6 = aVar4;
                        aVar6.i(null);
                        return new Date(jLongValue2);
                    }
                    kotlinx.coroutines.sync.a aVar9 = (kotlinx.coroutines.sync.a) iVar.f181358b;
                    c1Var = (c1) iVar.f181357a;
                    try {
                        ResultKt.m(objO);
                        aVar3 = aVar9;
                        if (((Boolean) objO).booleanValue()) {
                            com.planner5d.library.model.manager.config.p pVar2 = c1Var.f181318g;
                            com.planner5d.library.services.r rVar2 = com.planner5d.library.services.r.launchFirst;
                            iVar.f181357a = aVar3;
                            iVar.f181358b = null;
                            iVar.f181361e = 3;
                            objO = pVar2.o(rVar2, 0L, iVar);
                            if (objO != objL) {
                                aVar5 = aVar3;
                                jLongValue2 = ((Number) objO).longValue();
                                aVar6 = aVar5;
                                aVar6.i(null);
                                return new Date(jLongValue2);
                            }
                        } else {
                            lG = kotlin.coroutines.jvm.internal.b.g(new Date().getTime());
                            jLongValue = lG.longValue();
                            pVar = c1Var.f181318g;
                            rVar = com.planner5d.library.services.r.launchFirst;
                            iVar.f181357a = aVar3;
                            iVar.f181358b = lG;
                            iVar.f181361e = 4;
                            if (pVar.r(rVar, jLongValue, iVar) != objL) {
                                aVar4 = aVar3;
                                l10 = lG;
                                jLongValue2 = l10.longValue();
                                aVar6 = aVar4;
                                aVar6.i(null);
                                return new Date(jLongValue2);
                            }
                        }
                        return objL;
                    } catch (Throwable th2) {
                        r10 = aVar9;
                        th = th2;
                        r10.i(null);
                        throw th;
                    }
                }
                kotlinx.coroutines.sync.a aVar10 = (kotlinx.coroutines.sync.a) iVar.f181358b;
                c1 c1Var2 = (c1) iVar.f181357a;
                ResultKt.m(objO);
                aVar2 = aVar10;
                this = c1Var2;
                aVar2 = aVar;
                com.planner5d.library.model.manager.config.p pVar3 = this.f181318g;
                com.planner5d.library.services.r rVar3 = com.planner5d.library.services.r.launchFirst;
                iVar.f181357a = this;
                iVar.f181358b = aVar2;
                iVar.f181361e = 2;
                Object objY = pVar3.y(rVar3, iVar);
                if (objY != objL) {
                    c1Var = this;
                    aVar3 = aVar2;
                    objO = objY;
                    if (((Boolean) objO).booleanValue()) {
                        com.planner5d.library.model.manager.config.p pVar4 = c1Var.f181318g;
                        com.planner5d.library.services.r rVar4 = com.planner5d.library.services.r.launchFirst;
                        iVar.f181357a = aVar3;
                        iVar.f181358b = null;
                        iVar.f181361e = 3;
                        objO = pVar4.o(rVar4, 0L, iVar);
                        if (objO != objL) {
                            aVar5 = aVar3;
                            jLongValue2 = ((Number) objO).longValue();
                            aVar6 = aVar5;
                            aVar6.i(null);
                            return new Date(jLongValue2);
                        }
                    } else {
                        lG = kotlin.coroutines.jvm.internal.b.g(new Date().getTime());
                        jLongValue = lG.longValue();
                        pVar = c1Var.f181318g;
                        rVar = com.planner5d.library.services.r.launchFirst;
                        iVar.f181357a = aVar3;
                        iVar.f181358b = lG;
                        iVar.f181361e = 4;
                        if (pVar.r(rVar, jLongValue, iVar) != objL) {
                            aVar4 = aVar3;
                            l10 = lG;
                            jLongValue2 = l10.longValue();
                            aVar6 = aVar4;
                            aVar6.i(null);
                            return new Date(jLongValue2);
                        }
                    }
                }
                return objL;
            } catch (Throwable th3) {
                th = th3;
                r10 = aVar2;
                r10.i(null);
                throw th;
            }
        } catch (Throwable th4) {
            th = th4;
            r10 = iVar;
        }
    }

    private final long F() {
        return ((Number) com.planner5d.library.services.utility.c0.t(com.planner5d.library.services.utility.c0.f225068a, null, false, new j(null), 3, null)).longValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Code duplicated, block: B:34:0x00d9  */
    /* JADX WARN: Code duplicated, block: B:36:0x00dc  */
    /* JADX WARN: Code duplicated, block: B:42:0x00ec  */
    /* JADX WARN: Code duplicated, block: B:50:0x011e  */
    /* JADX WARN: Code duplicated, block: B:54:0x014e A[PHI: r12 r13 r15
      0x014e: PHI (r12v9 java.lang.String) = (r12v7 java.lang.String), (r12v21 java.lang.String) binds: [B:52:0x014b, B:20:0x004b] A[DONT_GENERATE, DONT_INLINE]
      0x014e: PHI (r13v5 com.planner5d.library.model.manager.c1) = (r13v4 com.planner5d.library.model.manager.c1), (r13v15 com.planner5d.library.model.manager.c1) binds: [B:52:0x014b, B:20:0x004b] A[DONT_GENERATE, DONT_INLINE]
      0x014e: PHI (r15v16 java.lang.Object) = (r15v15 java.lang.Object), (r15v1 java.lang.Object) binds: [B:52:0x014b, B:20:0x004b] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:56:0x0157  */
    /* JADX WARN: Code duplicated, block: B:8:0x0016  */
    /* JADX WARN: Code restructure failed: missing block: B:57:0x0169, code lost:
    
        if (r13.d(r14, r12, r5) == r0) goto L58;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object H(java.lang.String r13, ij.c<java.lang.Object> r14, kotlin.coroutines.d<? super kotlin.Unit> r15) throws java.lang.Throwable {
        /*
            Method dump skipped, instruction units count: 372
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.planner5d.library.model.manager.c1.H(java.lang.String, ij.c, kotlin.coroutines.d):java.lang.Object");
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Code duplicated, block: B:34:0x0099  */
    /* JADX WARN: Code duplicated, block: B:47:0x00bf  */
    /* JADX WARN: Code duplicated, block: B:7:0x0017  */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r8v20 */
    public final Object I(String str, ij.c<Object> cVar, kotlin.coroutines.d<? super Unit> dVar) {
        p pVar;
        c1 c1Var;
        kotlinx.coroutines.sync.a aVar;
        String str2;
        ?? r10;
        kotlinx.coroutines.sync.a aVar2;
        if (dVar instanceof p) {
            pVar = (p) dVar;
            int i10 = pVar.f181394g;
            if ((i10 & Integer.MIN_VALUE) != 0) {
                pVar.f181394g = i10 - Integer.MIN_VALUE;
            } else {
                pVar = new p(dVar);
            }
        } else {
            pVar = new p(dVar);
        }
        Object obj = pVar.f181392e;
        Object objL = kotlin.coroutines.intrinsics.b.l();
        int i11 = pVar.f181394g;
        try {
            if (i11 == 0) {
                ResultKt.m(obj);
                try {
                    aVar = this.f181327p;
                    pVar.f181388a = this;
                    pVar.f181389b = str;
                    pVar.f181390c = cVar;
                    pVar.f181391d = aVar;
                    pVar.f181394g = 1;
                    this = this;
                    str2 = str;
                    if (aVar.h(null, pVar) != objL) {
                        pVar.f181388a = r10;
                        pVar.f181389b = aVar;
                        pVar.f181390c = null;
                        pVar.f181391d = null;
                        pVar.f181394g = 2;
                        if (r10.H(str2, cVar, pVar) != objL) {
                            aVar2 = aVar;
                            Unit unit = Unit.f312394a;
                            aVar2.i(null);
                        }
                    }
                    return objL;
                } catch (Throwable th2) {
                    c1Var = this;
                    th = th2;
                    timber.log.b.f381052a.e(th);
                    if (!(th instanceof com.planner5d.library.api.e)) {
                        c1Var.f181323l.get().b("update_installation", null, th);
                    }
                }
            } else if (i11 == 1) {
                kotlinx.coroutines.sync.a aVar3 = (kotlinx.coroutines.sync.a) pVar.f181391d;
                cVar = (ij.c) pVar.f181390c;
                String str3 = (String) pVar.f181389b;
                c1 c1Var2 = (c1) pVar.f181388a;
                try {
                    ResultKt.m(obj);
                    aVar = aVar3;
                    r10 = c1Var2;
                    str2 = str3;
                    try {
                        pVar.f181388a = r10;
                        pVar.f181389b = aVar;
                        pVar.f181390c = null;
                        pVar.f181391d = null;
                        pVar.f181394g = 2;
                        if (r10.H(str2, cVar, pVar) != objL) {
                            aVar2 = aVar;
                            Unit unit2 = Unit.f312394a;
                            aVar2.i(null);
                        }
                        return objL;
                    } catch (Throwable th3) {
                        th = th3;
                        aVar2 = aVar;
                        aVar2.i(null);
                        throw th;
                    }
                } catch (Throwable th4) {
                    th = th4;
                    c1Var = c1Var2;
                    timber.log.b.f381052a.e(th);
                    if (!(th instanceof com.planner5d.library.api.e)) {
                        c1Var.f181323l.get().b("update_installation", null, th);
                    }
                }
            } else {
                if (i11 != 2) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                aVar2 = (kotlinx.coroutines.sync.a) pVar.f181389b;
                try {
                    ResultKt.m(obj);
                    Unit unit3 = Unit.f312394a;
                    aVar2.i(null);
                } catch (Throwable th5) {
                    th = th5;
                    aVar2.i(null);
                    throw th;
                }
            }
        } catch (Throwable th6) {
            th = th6;
            c1Var = str;
        }
        return Unit.f312394a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Code duplicated, block: B:7:0x0015  */
    public final Object J(kotlin.coroutines.d<? super Unit> dVar) {
        q qVar;
        if (dVar instanceof q) {
            qVar = (q) dVar;
            int i10 = qVar.f181398d;
            if ((i10 & Integer.MIN_VALUE) != 0) {
                qVar.f181398d = i10 - Integer.MIN_VALUE;
            } else {
                qVar = new q(dVar);
            }
        } else {
            qVar = new q(dVar);
        }
        Object obj = qVar.f181396b;
        Object objL = kotlin.coroutines.intrinsics.b.l();
        int i11 = qVar.f181398d;
        if (i11 == 0) {
            ResultKt.m(obj);
            if (!this.f181328q) {
                String str = com.planner5d.library.services.r.advertisingId.f224891a;
                ij.c<Object> cVar = new ij.c() { // from class: com.planner5d.library.model.manager.b1
                    @Override // ij.c
                    public final Object get() {
                        return c1.K(this.f180880a);
                    }
                };
                qVar.f181395a = this;
                qVar.f181398d = 1;
                if (I(str, cVar, qVar) == objL) {
                    return objL;
                }
            }
            return Unit.f312394a;
        }
        if (i11 != 1) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        this = (c1) qVar.f181395a;
        ResultKt.m(obj);
        this.f181328q = true;
        return Unit.f312394a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Object K(c1 c1Var) {
        return c1Var.C();
    }

    @Nullable
    public final Object G(@NotNull kotlin.coroutines.d<? super Unit> dVar) {
        Object objH = kotlinx.coroutines.i.h(this.f181324m.h(), new k(null), dVar);
        return objH == kotlin.coroutines.intrinsics.b.l() ? objH : Unit.f312394a;
    }

    @Override // com.planner5d.library.model.manager.e1
    @androidx.annotation.m1
    @NotNull
    public String a() {
        String strF;
        kotlin.jvm.internal.q1 q1Var = kotlin.jvm.internal.q1.f312784a;
        Long lValueOf = Long.valueOf(F());
        String strF2 = this.f181315d.get().f(j());
        String strF3 = this.f181315d.get().f(m());
        String strQ = this.f181314c.get().Q(com.planner5d.library.model.manager.builtin.i.a.Active);
        String strQ2 = this.f181314c.get().Q(com.planner5d.library.model.manager.builtin.i.a.BuiltIn);
        String strK = com.planner5d.library.services.utility.h3.k(this.f181316e);
        Date dateD = this.f181320i.d();
        String str = (dateD == null || (strF = this.f181315d.get().f(dateD)) == null) ? "?" : strF;
        Long lValueOf2 = Long.valueOf(this.f181319h.get().e());
        String strD = this.f181322k.get().d();
        String str2 = String.format("<b>Installation information</b><br />\nLaunches: %1$s, %2$s<br />\nCache: %3$s<br />\nDatabase: %4$s (%5$s)<br />\nVersion: %6$s<br />\nBackup: %7$s<br />\nUser: %8$d<br />\nToken: <small>%9$s</small>", Arrays.copyOf(new Object[]{lValueOf, strF2, strF3, strQ, strQ2, strK, str, lValueOf2, strD == null ? "?" : strD}, 9));
        Intrinsics.checkNotNullExpressionValue(str2, "format(...)");
        return str2;
    }

    @Override // com.planner5d.library.model.manager.e1
    @androidx.annotation.m1
    @NotNull
    public String b() {
        return (String) com.planner5d.library.services.utility.c0.t(com.planner5d.library.services.utility.c0.f225068a, null, true, new e(null), 1, null);
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0018  */
    @Override // com.planner5d.library.model.manager.e1
    @Nullable
    public Object c(@NotNull kotlin.coroutines.d<? super String> dVar) {
        d dVar2;
        if (dVar instanceof d) {
            dVar2 = (d) dVar;
            int i10 = dVar2.f181342c;
            if ((i10 & Integer.MIN_VALUE) != 0) {
                dVar2.f181342c = i10 - Integer.MIN_VALUE;
            } else {
                dVar2 = new d(dVar);
            }
        } else {
            dVar2 = new d(dVar);
        }
        Object objD = dVar2.f181340a;
        Object objL = kotlin.coroutines.intrinsics.b.l();
        int i11 = dVar2.f181342c;
        try {
            if (i11 == 0) {
                ResultKt.m(objD);
                dVar2.f181342c = 1;
                objD = D(dVar2);
                if (objD == objL) {
                    return objL;
                }
            } else {
                if (i11 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.m(objD);
            }
            return (String) objD;
        } catch (Exception unused) {
            return "?";
        }
    }

    @Override // com.planner5d.library.model.manager.e1
    public int d() {
        return (int) ((new Date().getTime() - j().getTime()) / 86400000);
    }

    @Override // com.planner5d.library.model.manager.e1
    public boolean f(@NotNull String hash) {
        Intrinsics.checkNotNullParameter(hash, "hash");
        return hash.length() == 0 || Intrinsics.areEqual(hash, "?");
    }

    @Override // com.planner5d.library.model.manager.e1
    @NotNull
    public String h() {
        return com.planner5d.library.services.utility.h3.a() + ":" + com.planner5d.library.services.utility.h3.j(this.f181316e) + ":" + this.f181316e.getPackageName() + ", device: " + com.planner5d.library.services.utility.h3.c();
    }

    @Override // com.planner5d.library.model.manager.e1
    @NotNull
    public String i() {
        return String.valueOf(this.f181319h.get().e());
    }

    @Override // com.planner5d.library.model.manager.e1
    @NotNull
    public Date j() {
        return (Date) com.planner5d.library.services.utility.c0.t(com.planner5d.library.services.utility.c0.f225068a, null, true, new h(null), 1, null);
    }

    @Override // com.planner5d.library.model.manager.e1
    @NotNull
    public String k() {
        return this.f181329r;
    }

    @Override // com.planner5d.library.model.manager.e1
    public void l(@NotNull String field, @NotNull ij.c<Object> data) {
        Intrinsics.checkNotNullParameter(field, "field");
        Intrinsics.checkNotNullParameter(data, "data");
        kotlinx.coroutines.k.f(this.f181324m.g(), this.f181324m.h(), null, new l(field, data, null), 2, null);
    }

    @Override // com.planner5d.library.model.manager.e1
    @androidx.annotation.m1
    @NotNull
    public Date m() {
        File fileA = com.planner5d.library.services.w.f229889a.a(this.f181316e, "__create__");
        if (fileA == null) {
            return new Date();
        }
        if (fileA.isFile()) {
            try {
                FileInputStream fileInputStream = new FileInputStream(fileA);
                try {
                    String strK0 = org.apache.commons.io.p.K0(fileInputStream, Charset.defaultCharset());
                    Intrinsics.checkNotNullExpressionValue(strK0, "toString(...)");
                    long j10 = Long.parseLong(strK0);
                    if (j10 > 0) {
                        Date date = new Date(j10);
                        kotlin.io.c.a(fileInputStream, null);
                        return date;
                    }
                    Unit unit = Unit.f312394a;
                    kotlin.io.c.a(fileInputStream, null);
                } catch (Throwable th2) {
                    try {
                        throw th2;
                    } catch (Throwable th3) {
                        kotlin.io.c.a(fileInputStream, th2);
                        throw th3;
                    }
                }
            } catch (IOException | NumberFormatException unused) {
            }
        }
        Date date2 = new Date();
        try {
            FileOutputStream fileOutputStream = new FileOutputStream(fileA);
            try {
                org.apache.commons.io.p.a1(String.valueOf(date2.getTime()), fileOutputStream, Charset.defaultCharset());
                Unit unit2 = Unit.f312394a;
                kotlin.io.c.a(fileOutputStream, null);
            } catch (Throwable th4) {
                try {
                    throw th4;
                } catch (Throwable th5) {
                    kotlin.io.c.a(fileOutputStream, th4);
                    throw th5;
                }
            }
        } catch (IOException e10) {
            timber.log.b.f381052a.e(e10);
        }
        return date2;
    }
}
