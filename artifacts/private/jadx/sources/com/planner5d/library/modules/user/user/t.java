package com.planner5d.library.modules.user.user;

import com.devtodev.core.data.metrics.MetricConsts;
import com.planner5d.library.model.LogRecord;
import com.planner5d.library.model.manager.k5;
import com.planner5d.library.model.manager.statistics.events.y3;
import com.planner5d.library.model.manager.t1;
import com.planner5d.library.modules.user.auth.SocialAuthType;
import com.planner5d.library.services.exceptions.ErrorMessageException;
import com.planner5d.library.services.exceptions.ErrorMessageParser;
import java.util.concurrent.Callable;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.text.StringsKt;
import kotlinx.coroutines.z1;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import org.json.JSONException;
import org.json.JSONObject;
import retrofit2.Response;
import rx.Observable;
import rx.Subscriber;
import rx.functions.Func1;

/* JADX INFO: loaded from: classes9.dex */
@androidx.compose.runtime.internal.w0(parameters = 0)
@ij.f
@SourceDebugExtension({"SMAP\nUserAuthorization.kt\nKotlin\n*S Kotlin\n*F\n+ 1 UserAuthorization.kt\ncom/planner5d/library/modules/user/user/UserAuthorization\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,634:1\n1#2:635\n*E\n"})
public final class t implements com.planner5d.library.modules.user.user.w {
    public static final int N = 8;

    @NotNull
    private final ErrorMessageParser A;

    @NotNull
    private final fg.e<com.planner5d.library.model.manager.n1> B;

    @NotNull
    private final com.planner5d.library.services.utility.f1 C;

    @Nullable
    private fd.k D;

    @NotNull
    private final com.planner5d.library.model.converter.json.from.f0 E;

    @NotNull
    private final Object F;

    @NotNull
    private final Object G;
    private boolean H;

    @NotNull
    private final com.planner5d.library.model.converter.json.from.f0 I;

    @NotNull
    private final com.planner5d.library.model.converter.json.from.g0 J;

    @Nullable
    private id.a K;

    @NotNull
    private final kotlinx.coroutines.flow.j0<id.a> L;

    @NotNull
    private final kotlinx.coroutines.flow.o0<id.a> M;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    private final com.planner5d.library.api.b f223283a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NotNull
    private final com.planner5d.library.model.manager.c1 f223284b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @NotNull
    private final com.planner5d.library.application.b f223285c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @NotNull
    private final com.planner5d.library.application.d f223286d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    @NotNull
    private final fg.e<com.planner5d.library.model.manager.config.j> f223287e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    @NotNull
    private final com.planner5d.library.model.manager.config.p f223288f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    @NotNull
    private final g1 f223289g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    @NotNull
    private final t1 f223290h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    @NotNull
    private final fg.e<y0> f223291i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    @NotNull
    private final com.planner5d.library.model.manager.project.d0 f223292j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    @NotNull
    private final com.planner5d.library.model.manager.c0 f223293k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    @NotNull
    private final fg.e<com.planner5d.library.model.manager.synchronization.i> f223294l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    @NotNull
    private final fg.e<com.planner5d.library.model.manager.statistics.b0> f223295m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    @NotNull
    private final fg.e<com.planner5d.library.model.manager.managedfiles.a0> f223296n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    @NotNull
    private final com.planner5d.library.modules.user.user.b f223297o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    @NotNull
    private final com.planner5d.library.modules.user.user.d f223298p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    @NotNull
    private final q0 f223299q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    @NotNull
    private final fg.e<com.planner5d.library.legal.model.manager.a> f223300r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    @NotNull
    private final fg.e<com.planner5d.library.model.manager.crashreporting.l> f223301s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    @NotNull
    private final fg.e<com.planner5d.library.model.manager.contest.g> f223302t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    @NotNull
    private final com.planner5d.library.model.manager.i1 f223303u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    @NotNull
    private m1 f223304v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    @NotNull
    private final com.planner5d.library.api.requests.c f223305w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    @NotNull
    private final fg.e<com.planner5d.library.model.manager.payments.p> f223306x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    @NotNull
    private final fg.e<t0> f223307y;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    @NotNull
    private final fg.e<g0> f223308z;

    /* JADX INFO: Access modifiers changed from: private */
    static final class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        @NotNull
        private final com.planner5d.library.api.c f223309a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        @NotNull
        private final com.planner5d.library.api.c f223310b;

        public a(@NotNull com.planner5d.library.api.c info, @NotNull com.planner5d.library.api.c infoProfile) {
            Intrinsics.checkNotNullParameter(info, "info");
            Intrinsics.checkNotNullParameter(infoProfile, "infoProfile");
            this.f223309a = info;
            this.f223310b = infoProfile;
        }

        @NotNull
        public final com.planner5d.library.api.c a() {
            return this.f223309a;
        }

        @NotNull
        public final com.planner5d.library.api.c b() {
            return this.f223310b;
        }
    }

    @kotlin.coroutines.jvm.internal.f(c = "com.planner5d.library.modules.user.user.UserAuthorization$doPostSignInResets$2", f = "UserAuthorization.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
    static final class b extends kotlin.coroutines.jvm.internal.o implements Function2<kotlinx.coroutines.s0, kotlin.coroutines.d<? super Unit>, Object> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        int f223311a;

        b(kotlin.coroutines.d<? super b> dVar) {
            super(2, dVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final kotlin.coroutines.d<Unit> create(Object obj, kotlin.coroutines.d<?> dVar) {
            return t.this.new b(dVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            kotlin.coroutines.intrinsics.b.l();
            if (this.f223311a != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.m(obj);
            ((com.planner5d.library.model.manager.synchronization.i) t.this.f223294l.get()).f((kb.b) t.this.f223302t.get());
            return Unit.f312394a;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(kotlinx.coroutines.s0 s0Var, kotlin.coroutines.d<? super Unit> dVar) {
            return ((b) create(s0Var, dVar)).invokeSuspend(Unit.f312394a);
        }
    }

    /* JADX INFO: Add missing generic type declarations: [T] */
    @kotlin.coroutines.jvm.internal.f(c = "com.planner5d.library.modules.user.user.UserAuthorization$executeWithBlockingSynchronization$2", f = "UserAuthorization.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
    static final class c<T> extends kotlin.coroutines.jvm.internal.o implements Function2<kotlinx.coroutines.s0, kotlin.coroutines.d<? super T>, Object> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        int f223313a;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ Function1<kotlin.coroutines.d<? super T>, Object> f223315c;

        @kotlin.coroutines.jvm.internal.f(c = "com.planner5d.library.modules.user.user.UserAuthorization$executeWithBlockingSynchronization$2$1$1", f = "UserAuthorization.kt", i = {}, l = {630}, m = "invokeSuspend", n = {}, s = {})
        static final class a extends kotlin.coroutines.jvm.internal.o implements Function2<kotlinx.coroutines.s0, kotlin.coroutines.d<? super T>, Object> {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            int f223316a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            final /* synthetic */ Function1<kotlin.coroutines.d<? super T>, Object> f223317b;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            /* JADX WARN: Multi-variable type inference failed */
            a(Function1<? super kotlin.coroutines.d<? super T>, ? extends Object> function1, kotlin.coroutines.d<? super a> dVar) {
                super(2, dVar);
                this.f223317b = function1;
            }

            @Override // kotlin.coroutines.jvm.internal.a
            public final kotlin.coroutines.d<Unit> create(Object obj, kotlin.coroutines.d<?> dVar) {
                return new a(this.f223317b, dVar);
            }

            @Override // kotlin.coroutines.jvm.internal.a
            public final Object invokeSuspend(Object obj) {
                Object objL = kotlin.coroutines.intrinsics.b.l();
                int i10 = this.f223316a;
                if (i10 != 0) {
                    if (i10 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    ResultKt.m(obj);
                    return obj;
                }
                ResultKt.m(obj);
                Function1<kotlin.coroutines.d<? super T>, Object> function1 = this.f223317b;
                this.f223316a = 1;
                Object objInvoke = function1.invoke(this);
                return objInvoke == objL ? objL : objInvoke;
            }

            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(kotlinx.coroutines.s0 s0Var, kotlin.coroutines.d<? super T> dVar) {
                return ((a) create(s0Var, dVar)).invokeSuspend(Unit.f312394a);
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        c(Function1<? super kotlin.coroutines.d<? super T>, ? extends Object> function1, kotlin.coroutines.d<? super c> dVar) {
            super(2, dVar);
            this.f223315c = function1;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final Object m(Function1 function1) {
            return com.planner5d.library.services.utility.c0.t(com.planner5d.library.services.utility.c0.f225068a, null, true, new a(function1, null), 1, null);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final kotlin.coroutines.d<Unit> create(Object obj, kotlin.coroutines.d<?> dVar) {
            return t.this.new c(this.f223315c, dVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            kotlin.coroutines.intrinsics.b.l();
            if (this.f223313a != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.m(obj);
            com.planner5d.library.model.manager.synchronization.i iVar = (com.planner5d.library.model.manager.synchronization.i) t.this.f223294l.get();
            final Function1<kotlin.coroutines.d<? super T>, Object> function1 = this.f223315c;
            return iVar.g(new Callable() { // from class: com.planner5d.library.modules.user.user.u
                @Override // java.util.concurrent.Callable
                public final Object call() {
                    return t.c.m(function1);
                }
            });
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(kotlinx.coroutines.s0 s0Var, kotlin.coroutines.d<? super T> dVar) {
            return ((c) create(s0Var, dVar)).invokeSuspend(Unit.f312394a);
        }
    }

    @kotlin.coroutines.jvm.internal.f(c = "com.planner5d.library.modules.user.user.UserAuthorization", f = "UserAuthorization.kt", i = {0}, l = {308}, m = "hashIfAutomerge", n = {MetricConsts.Install}, s = {"L$0"})
    static final class d extends kotlin.coroutines.jvm.internal.d {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        Object f223318a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        /* synthetic */ Object f223319b;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        int f223321d;

        d(kotlin.coroutines.d<? super d> dVar) {
            super(dVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            this.f223319b = obj;
            this.f223321d |= Integer.MIN_VALUE;
            return t.this.V(this);
        }
    }

    @kotlin.coroutines.jvm.internal.f(c = "com.planner5d.library.modules.user.user.UserAuthorization$initialize$1", f = "UserAuthorization.kt", i = {}, l = {139}, m = "invokeSuspend", n = {}, s = {})
    static final class e extends kotlin.coroutines.jvm.internal.o implements Function2<kotlinx.coroutines.s0, kotlin.coroutines.d<? super Unit>, Object> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        int f223322a;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ id.a f223324c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        e(id.a aVar, kotlin.coroutines.d<? super e> dVar) {
            super(2, dVar);
            this.f223324c = aVar;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final kotlin.coroutines.d<Unit> create(Object obj, kotlin.coroutines.d<?> dVar) {
            return t.this.new e(this.f223324c, dVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            Object objL = kotlin.coroutines.intrinsics.b.l();
            int i10 = this.f223322a;
            if (i10 == 0) {
                ResultKt.m(obj);
                u0 u0Var = (u0) t.this.f223307y.get();
                id.a aVar = this.f223324c;
                this.f223322a = 1;
                if (u0.b.a(u0Var, aVar, false, this, 2, null) == objL) {
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
            return ((e) create(s0Var, dVar)).invokeSuspend(Unit.f312394a);
        }
    }

    @kotlin.coroutines.jvm.internal.f(c = "com.planner5d.library.modules.user.user.UserAuthorization", f = "UserAuthorization.kt", i = {}, l = {androidx.constraintlayout.core.motion.utils.v.e.f44055x}, m = "isCurrentUserFilled", n = {}, s = {})
    static final class f extends kotlin.coroutines.jvm.internal.d {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        /* synthetic */ Object f223325a;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        int f223327c;

        f(kotlin.coroutines.d<? super f> dVar) {
            super(dVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            this.f223325a = obj;
            this.f223327c |= Integer.MIN_VALUE;
            return t.this.c(this);
        }
    }

    @kotlin.coroutines.jvm.internal.f(c = "com.planner5d.library.modules.user.user.UserAuthorization", f = "UserAuthorization.kt", i = {}, l = {624}, m = "isFilled", n = {}, s = {})
    static final class g extends kotlin.coroutines.jvm.internal.d {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        /* synthetic */ Object f223328a;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        int f223330c;

        g(kotlin.coroutines.d<? super g> dVar) {
            super(dVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            this.f223328a = obj;
            this.f223330c |= Integer.MIN_VALUE;
            return t.this.X(null, this);
        }
    }

    @kotlin.coroutines.jvm.internal.f(c = "com.planner5d.library.modules.user.user.UserAuthorization", f = "UserAuthorization.kt", i = {}, l = {618}, m = "isFilledQuiet", n = {}, s = {})
    static final class h extends kotlin.coroutines.jvm.internal.d {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        /* synthetic */ Object f223331a;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        int f223333c;

        h(kotlin.coroutines.d<? super h> dVar) {
            super(dVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            this.f223331a = obj;
            this.f223333c |= Integer.MIN_VALUE;
            return t.this.a0(null, this);
        }
    }

    @kotlin.coroutines.jvm.internal.f(c = "com.planner5d.library.modules.user.user.UserAuthorization$login$1", f = "UserAuthorization.kt", i = {}, l = {269}, m = "invokeSuspend", n = {}, s = {})
    static final class i extends kotlin.coroutines.jvm.internal.o implements Function1<kotlin.coroutines.d<? super id.a>, Object> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        int f223334a;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ String f223336c;

        @kotlin.coroutines.jvm.internal.f(c = "com.planner5d.library.modules.user.user.UserAuthorization$login$1$1", f = "UserAuthorization.kt", i = {}, l = {270}, m = "invokeSuspend", n = {}, s = {})
        static final class a extends kotlin.coroutines.jvm.internal.o implements Function2<kotlinx.coroutines.s0, kotlin.coroutines.d<? super id.a>, Object> {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            int f223337a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            final /* synthetic */ t f223338b;

            /* JADX INFO: renamed from: c, reason: collision with root package name */
            final /* synthetic */ String f223339c;

            /* JADX INFO: renamed from: com.planner5d.library.modules.user.user.t$i$a$a, reason: collision with other inner class name */
            @kotlin.coroutines.jvm.internal.f(c = "com.planner5d.library.modules.user.user.UserAuthorization$login$1$1$1", f = "UserAuthorization.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
            static final class C1648a extends kotlin.coroutines.jvm.internal.o implements Function1<kotlin.coroutines.d<? super com.planner5d.library.api.c>, Object> {

                /* JADX INFO: renamed from: a, reason: collision with root package name */
                int f223340a;

                /* JADX INFO: renamed from: b, reason: collision with root package name */
                final /* synthetic */ t f223341b;

                /* JADX INFO: renamed from: c, reason: collision with root package name */
                final /* synthetic */ String f223342c;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                C1648a(t tVar, String str, kotlin.coroutines.d<? super C1648a> dVar) {
                    super(1, dVar);
                    this.f223341b = tVar;
                    this.f223342c = str;
                }

                @Override // kotlin.coroutines.jvm.internal.a
                public final kotlin.coroutines.d<Unit> create(kotlin.coroutines.d<?> dVar) {
                    return new C1648a(this.f223341b, this.f223342c, dVar);
                }

                @Override // kotlin.coroutines.jvm.internal.a
                public final Object invokeSuspend(Object obj) throws JSONException {
                    kotlin.coroutines.intrinsics.b.l();
                    if (this.f223340a != 0) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    ResultKt.m(obj);
                    com.planner5d.library.api.c cVarE = this.f223341b.f223283a.E(null, this.f223342c, com.planner5d.library.api.f.a().f142267e, 1);
                    if (!cVarE.h()) {
                        com.planner5d.library.services.utility.k1 k1Var = com.planner5d.library.services.utility.k1.f225294a;
                        JSONObject jSONObjectA = cVarE.a();
                        com.planner5d.library.services.r rVar = com.planner5d.library.services.r.info;
                        if (k1Var.B(jSONObjectA, rVar)) {
                            cVarE.a().getJSONObject(rVar.f224891a).put(com.planner5d.library.services.r.hash.f224891a, this.f223342c);
                        }
                    }
                    Intrinsics.checkNotNull(cVarE);
                    return cVarE;
                }

                @Override // kotlin.jvm.functions.Function1
                public final Object invoke(kotlin.coroutines.d<? super com.planner5d.library.api.c> dVar) {
                    return ((C1648a) create(dVar)).invokeSuspend(Unit.f312394a);
                }
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            a(t tVar, String str, kotlin.coroutines.d<? super a> dVar) {
                super(2, dVar);
                this.f223338b = tVar;
                this.f223339c = str;
            }

            @Override // kotlin.coroutines.jvm.internal.a
            public final kotlin.coroutines.d<Unit> create(Object obj, kotlin.coroutines.d<?> dVar) {
                return new a(this.f223338b, this.f223339c, dVar);
            }

            @Override // kotlin.coroutines.jvm.internal.a
            public final Object invokeSuspend(Object obj) throws Exception {
                Object objL = kotlin.coroutines.intrinsics.b.l();
                int i10 = this.f223337a;
                if (i10 == 0) {
                    ResultKt.m(obj);
                    t tVar = this.f223338b;
                    C1648a c1648a = new C1648a(tVar, this.f223339c, null);
                    this.f223337a = 1;
                    obj = tVar.z0(c1648a, this);
                    if (obj == objL) {
                        return objL;
                    }
                } else {
                    if (i10 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    ResultKt.m(obj);
                }
                return ((id.d) obj).f287101a;
            }

            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(kotlinx.coroutines.s0 s0Var, kotlin.coroutines.d<? super id.a> dVar) {
                return ((a) create(s0Var, dVar)).invokeSuspend(Unit.f312394a);
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        i(String str, kotlin.coroutines.d<? super i> dVar) {
            super(1, dVar);
            this.f223336c = str;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final kotlin.coroutines.d<Unit> create(kotlin.coroutines.d<?> dVar) {
            return t.this.new i(this.f223336c, dVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            Object objL = kotlin.coroutines.intrinsics.b.l();
            int i10 = this.f223334a;
            if (i10 != 0) {
                if (i10 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.m(obj);
                return obj;
            }
            ResultKt.m(obj);
            z1 z1VarH = com.planner5d.library.services.utility.s.f229729a.h();
            a aVar = new a(t.this, this.f223336c, null);
            this.f223334a = 1;
            Object objH = kotlinx.coroutines.i.h(z1VarH, aVar, this);
            return objH == objL ? objL : objH;
        }

        @Override // kotlin.jvm.functions.Function1
        public final Object invoke(kotlin.coroutines.d<? super id.a> dVar) {
            return ((i) create(dVar)).invokeSuspend(Unit.f312394a);
        }
    }

    @kotlin.coroutines.jvm.internal.f(c = "com.planner5d.library.modules.user.user.UserAuthorization$login$2", f = "UserAuthorization.kt", i = {}, l = {283}, m = "invokeSuspend", n = {}, s = {})
    static final class j extends kotlin.coroutines.jvm.internal.o implements Function1<kotlin.coroutines.d<? super id.d>, Object> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        int f223343a;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ SocialAuthType f223345c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        final /* synthetic */ String f223346d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        final /* synthetic */ String f223347e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        final /* synthetic */ String f223348f;

        @kotlin.coroutines.jvm.internal.f(c = "com.planner5d.library.modules.user.user.UserAuthorization$login$2$1", f = "UserAuthorization.kt", i = {}, l = {284}, m = "invokeSuspend", n = {}, s = {})
        static final class a extends kotlin.coroutines.jvm.internal.o implements Function2<kotlinx.coroutines.s0, kotlin.coroutines.d<? super id.d>, Object> {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            int f223349a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            final /* synthetic */ t f223350b;

            /* JADX INFO: renamed from: c, reason: collision with root package name */
            final /* synthetic */ SocialAuthType f223351c;

            /* JADX INFO: renamed from: d, reason: collision with root package name */
            final /* synthetic */ String f223352d;

            /* JADX INFO: renamed from: e, reason: collision with root package name */
            final /* synthetic */ String f223353e;

            /* JADX INFO: renamed from: f, reason: collision with root package name */
            final /* synthetic */ String f223354f;

            /* JADX INFO: renamed from: com.planner5d.library.modules.user.user.t$j$a$a, reason: collision with other inner class name */
            @kotlin.coroutines.jvm.internal.f(c = "com.planner5d.library.modules.user.user.UserAuthorization$login$2$1$1", f = "UserAuthorization.kt", i = {}, l = {284}, m = "invokeSuspend", n = {}, s = {})
            static final class C1649a extends kotlin.coroutines.jvm.internal.o implements Function1<kotlin.coroutines.d<? super com.planner5d.library.api.c>, Object> {

                /* JADX INFO: renamed from: a, reason: collision with root package name */
                int f223355a;

                /* JADX INFO: renamed from: b, reason: collision with root package name */
                final /* synthetic */ t f223356b;

                /* JADX INFO: renamed from: c, reason: collision with root package name */
                final /* synthetic */ SocialAuthType f223357c;

                /* JADX INFO: renamed from: d, reason: collision with root package name */
                final /* synthetic */ String f223358d;

                /* JADX INFO: renamed from: e, reason: collision with root package name */
                final /* synthetic */ String f223359e;

                /* JADX INFO: renamed from: f, reason: collision with root package name */
                final /* synthetic */ String f223360f;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                C1649a(t tVar, SocialAuthType socialAuthType, String str, String str2, String str3, kotlin.coroutines.d<? super C1649a> dVar) {
                    super(1, dVar);
                    this.f223356b = tVar;
                    this.f223357c = socialAuthType;
                    this.f223358d = str;
                    this.f223359e = str2;
                    this.f223360f = str3;
                }

                @Override // kotlin.coroutines.jvm.internal.a
                public final kotlin.coroutines.d<Unit> create(kotlin.coroutines.d<?> dVar) {
                    return new C1649a(this.f223356b, this.f223357c, this.f223358d, this.f223359e, this.f223360f, dVar);
                }

                @Override // kotlin.coroutines.jvm.internal.a
                public final Object invokeSuspend(Object obj) throws Exception {
                    Object objL = kotlin.coroutines.intrinsics.b.l();
                    int i10 = this.f223355a;
                    if (i10 != 0) {
                        if (i10 != 1) {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        ResultKt.m(obj);
                        return obj;
                    }
                    ResultKt.m(obj);
                    g1 g1Var = this.f223356b.f223289g;
                    SocialAuthType socialAuthType = this.f223357c;
                    String str = this.f223358d;
                    String str2 = this.f223359e;
                    String str3 = this.f223360f;
                    this.f223355a = 1;
                    Object objI = g1Var.i(socialAuthType, str, str2, str3, this);
                    return objI == objL ? objL : objI;
                }

                @Override // kotlin.jvm.functions.Function1
                public final Object invoke(kotlin.coroutines.d<? super com.planner5d.library.api.c> dVar) {
                    return ((C1649a) create(dVar)).invokeSuspend(Unit.f312394a);
                }
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            a(t tVar, SocialAuthType socialAuthType, String str, String str2, String str3, kotlin.coroutines.d<? super a> dVar) {
                super(2, dVar);
                this.f223350b = tVar;
                this.f223351c = socialAuthType;
                this.f223352d = str;
                this.f223353e = str2;
                this.f223354f = str3;
                int i10 = 4 << 2;
            }

            @Override // kotlin.coroutines.jvm.internal.a
            public final kotlin.coroutines.d<Unit> create(Object obj, kotlin.coroutines.d<?> dVar) {
                return new a(this.f223350b, this.f223351c, this.f223352d, this.f223353e, this.f223354f, dVar);
            }

            @Override // kotlin.coroutines.jvm.internal.a
            public final Object invokeSuspend(Object obj) throws Exception {
                Object objL = kotlin.coroutines.intrinsics.b.l();
                int i10 = this.f223349a;
                if (i10 != 0) {
                    if (i10 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    ResultKt.m(obj);
                    return obj;
                }
                ResultKt.m(obj);
                t tVar = this.f223350b;
                C1649a c1649a = new C1649a(tVar, this.f223351c, this.f223352d, this.f223353e, this.f223354f, null);
                this.f223349a = 1;
                Object objZ0 = tVar.z0(c1649a, this);
                return objZ0 == objL ? objL : objZ0;
            }

            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(kotlinx.coroutines.s0 s0Var, kotlin.coroutines.d<? super id.d> dVar) {
                return ((a) create(s0Var, dVar)).invokeSuspend(Unit.f312394a);
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        j(SocialAuthType socialAuthType, String str, String str2, String str3, kotlin.coroutines.d<? super j> dVar) {
            super(1, dVar);
            this.f223345c = socialAuthType;
            this.f223346d = str;
            this.f223347e = str2;
            this.f223348f = str3;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final kotlin.coroutines.d<Unit> create(kotlin.coroutines.d<?> dVar) {
            return t.this.new j(this.f223345c, this.f223346d, this.f223347e, this.f223348f, dVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            Object objL = kotlin.coroutines.intrinsics.b.l();
            int i10 = this.f223343a;
            if (i10 != 0) {
                if (i10 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.m(obj);
                return obj;
            }
            ResultKt.m(obj);
            z1 z1VarH = com.planner5d.library.services.utility.s.f229729a.h();
            a aVar = new a(t.this, this.f223345c, this.f223346d, this.f223347e, this.f223348f, null);
            this.f223343a = 1;
            Object objH = kotlinx.coroutines.i.h(z1VarH, aVar, this);
            return objH == objL ? objL : objH;
        }

        @Override // kotlin.jvm.functions.Function1
        public final Object invoke(kotlin.coroutines.d<? super id.d> dVar) {
            return ((j) create(dVar)).invokeSuspend(Unit.f312394a);
        }
    }

    @kotlin.coroutines.jvm.internal.f(c = "com.planner5d.library.modules.user.user.UserAuthorization$loginCompleteBackground$2", f = "UserAuthorization.kt", i = {}, l = {392}, m = "invokeSuspend", n = {}, s = {})
    static final class k extends kotlin.coroutines.jvm.internal.o implements Function2<kotlinx.coroutines.s0, kotlin.coroutines.d<? super Unit>, Object> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        int f223361a;

        k(kotlin.coroutines.d<? super k> dVar) {
            super(2, dVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final kotlin.coroutines.d<Unit> create(Object obj, kotlin.coroutines.d<?> dVar) {
            return t.this.new k(dVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            Object objL = kotlin.coroutines.intrinsics.b.l();
            int i10 = this.f223361a;
            if (i10 == 0) {
                ResultKt.m(obj);
                com.planner5d.library.model.manager.config.j jVar = (com.planner5d.library.model.manager.config.j) t.this.f223287e.get();
                this.f223361a = 1;
                if (com.planner5d.library.model.manager.config.j.v(jVar, null, this, 1, null) == objL) {
                    return objL;
                }
            } else {
                if (i10 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.m(obj);
            }
            ((com.planner5d.library.model.manager.crashreporting.l) t.this.f223301s.get()).z();
            return Unit.f312394a;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(kotlinx.coroutines.s0 s0Var, kotlin.coroutines.d<? super Unit> dVar) {
            return ((k) create(s0Var, dVar)).invokeSuspend(Unit.f312394a);
        }
    }

    @kotlin.coroutines.jvm.internal.f(c = "com.planner5d.library.modules.user.user.UserAuthorization", f = "UserAuthorization.kt", i = {0}, l = {597, 598}, m = "loginWithLink", n = {"this"}, s = {"L$0"})
    static final class l extends kotlin.coroutines.jvm.internal.d {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        Object f223363a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        /* synthetic */ Object f223364b;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        int f223366d;

        l(kotlin.coroutines.d<? super l> dVar) {
            super(dVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            this.f223364b = obj;
            this.f223366d |= Integer.MIN_VALUE;
            boolean z10 = false | false;
            return t.this.h0(null, this);
        }
    }

    @kotlin.coroutines.jvm.internal.f(c = "com.planner5d.library.modules.user.user.UserAuthorization$loginWithLink$2", f = "UserAuthorization.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
    static final class m extends kotlin.coroutines.jvm.internal.o implements Function1<kotlin.coroutines.d<? super com.planner5d.library.api.c>, Object> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        int f223367a;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ JSONObject f223369c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        m(JSONObject jSONObject, kotlin.coroutines.d<? super m> dVar) {
            super(1, dVar);
            this.f223369c = jSONObject;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final kotlin.coroutines.d<Unit> create(kotlin.coroutines.d<?> dVar) {
            return t.this.new m(this.f223369c, dVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            kotlin.coroutines.intrinsics.b.l();
            if (this.f223367a != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.m(obj);
            com.planner5d.library.api.c cVarJ = t.this.f223283a.J(this.f223369c);
            Intrinsics.checkNotNullExpressionValue(cVarJ, "logInWitLink(...)");
            return cVarJ;
        }

        @Override // kotlin.jvm.functions.Function1
        public final Object invoke(kotlin.coroutines.d<? super com.planner5d.library.api.c> dVar) {
            return ((m) create(dVar)).invokeSuspend(Unit.f312394a);
        }
    }

    @kotlin.coroutines.jvm.internal.f(c = "com.planner5d.library.modules.user.user.UserAuthorization", f = "UserAuthorization.kt", i = {}, l = {464}, m = io.customer.messagingpush.b.f288399l, n = {}, s = {})
    static final class n extends kotlin.coroutines.jvm.internal.d {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        /* synthetic */ Object f223370a;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        int f223372c;

        n(kotlin.coroutines.d<? super n> dVar) {
            super(dVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            this.f223370a = obj;
            this.f223372c |= Integer.MIN_VALUE;
            return t.this.o0(null, this);
        }
    }

    @kotlin.coroutines.jvm.internal.f(c = "com.planner5d.library.modules.user.user.UserAuthorization", f = "UserAuthorization.kt", i = {}, l = {562}, m = "resetPassword", n = {}, s = {})
    static final class o extends kotlin.coroutines.jvm.internal.d {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        /* synthetic */ Object f223373a;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        int f223375c;

        o(kotlin.coroutines.d<? super o> dVar) {
            super(dVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            this.f223373a = obj;
            this.f223375c |= Integer.MIN_VALUE;
            return t.this.q0(null, this);
        }
    }

    @kotlin.coroutines.jvm.internal.f(c = "com.planner5d.library.modules.user.user.UserAuthorization$setLoggedIn$2", f = "UserAuthorization.kt", i = {}, l = {426}, m = "invokeSuspend", n = {}, s = {})
    static final class p extends kotlin.coroutines.jvm.internal.o implements Function2<kotlinx.coroutines.s0, kotlin.coroutines.d<? super Unit>, Object> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        int f223376a;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ id.a f223378c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        p(id.a aVar, kotlin.coroutines.d<? super p> dVar) {
            super(2, dVar);
            this.f223378c = aVar;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final kotlin.coroutines.d<Unit> create(Object obj, kotlin.coroutines.d<?> dVar) {
            return t.this.new p(this.f223378c, dVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            Object objL = kotlin.coroutines.intrinsics.b.l();
            int i10 = this.f223376a;
            if (i10 == 0) {
                ResultKt.m(obj);
                t0 t0Var = (t0) t.this.f223307y.get();
                id.a aVar = this.f223378c;
                this.f223376a = 1;
                if (t0Var.b0(aVar, this) == objL) {
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
            return ((p) create(s0Var, dVar)).invokeSuspend(Unit.f312394a);
        }
    }

    @kotlin.coroutines.jvm.internal.f(c = "com.planner5d.library.modules.user.user.UserAuthorization", f = "UserAuthorization.kt", i = {0, 0}, l = {299, 301}, m = "signIn", n = {"this", "data"}, s = {"L$0", "L$1"})
    static final class q extends kotlin.coroutines.jvm.internal.d {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        Object f223379a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        Object f223380b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        Object f223381c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        Object f223382d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        /* synthetic */ Object f223383e;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        int f223385g;

        q(kotlin.coroutines.d<? super q> dVar) {
            super(dVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            this.f223383e = obj;
            this.f223385g |= Integer.MIN_VALUE;
            return t.this.y0(null, null, this);
        }
    }

    @kotlin.coroutines.jvm.internal.f(c = "com.planner5d.library.modules.user.user.UserAuthorization$signIn$3", f = "UserAuthorization.kt", i = {}, l = {301}, m = "invokeSuspend", n = {}, s = {})
    static final class r extends kotlin.coroutines.jvm.internal.o implements Function1<kotlin.coroutines.d<? super com.planner5d.library.api.c>, Object> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        Object f223386a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        int f223387b;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        final /* synthetic */ JSONObject f223389d;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        r(JSONObject jSONObject, kotlin.coroutines.d<? super r> dVar) {
            super(1, dVar);
            this.f223389d = jSONObject;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final kotlin.coroutines.d<Unit> create(kotlin.coroutines.d<?> dVar) {
            return t.this.new r(this.f223389d, dVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) throws Exception {
            com.planner5d.library.api.b bVar;
            Object objL = kotlin.coroutines.intrinsics.b.l();
            int i10 = this.f223387b;
            if (i10 == 0) {
                ResultKt.m(obj);
                com.planner5d.library.api.b bVar2 = t.this.f223283a;
                t tVar = t.this;
                this.f223386a = bVar2;
                this.f223387b = 1;
                Object objV = tVar.V(this);
                if (objV == objL) {
                    return objL;
                }
                bVar = bVar2;
                obj = objV;
            } else {
                if (i10 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                bVar = (com.planner5d.library.api.b) this.f223386a;
                ResultKt.m(obj);
            }
            com.planner5d.library.api.c cVarU0 = bVar.U0((String) obj, this.f223389d);
            Intrinsics.checkNotNullExpressionValue(cVarU0, "signIn(...)");
            return cVarU0;
        }

        @Override // kotlin.jvm.functions.Function1
        public final Object invoke(kotlin.coroutines.d<? super com.planner5d.library.api.c> dVar) {
            return ((r) create(dVar)).invokeSuspend(Unit.f312394a);
        }
    }

    @kotlin.coroutines.jvm.internal.f(c = "com.planner5d.library.modules.user.user.UserAuthorization$signIn$5", f = "UserAuthorization.kt", i = {1, 1, 2, 2}, l = {315, 337, 348}, m = "invokeSuspend", n = {"userCreated", "user", "userCreated", "user"}, s = {"L$0", "L$1", "L$0", "L$1"})
    static final class s extends kotlin.coroutines.jvm.internal.o implements Function1<kotlin.coroutines.d<? super id.d>, Object> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        Object f223390a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        Object f223391b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        int f223392c;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        final /* synthetic */ Function1<kotlin.coroutines.d<? super com.planner5d.library.api.c>, Object> f223394e;

        @kotlin.coroutines.jvm.internal.f(c = "com.planner5d.library.modules.user.user.UserAuthorization$signIn$5$2", f = "UserAuthorization.kt", i = {}, l = {338}, m = "invokeSuspend", n = {}, s = {})
        static final class a extends kotlin.coroutines.jvm.internal.o implements Function1<kotlin.coroutines.d<? super Unit>, Object> {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            int f223395a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            final /* synthetic */ t f223396b;

            /* JADX INFO: renamed from: c, reason: collision with root package name */
            final /* synthetic */ id.a f223397c;

            /* JADX INFO: renamed from: d, reason: collision with root package name */
            final /* synthetic */ id.a f223398d;

            /* JADX INFO: renamed from: e, reason: collision with root package name */
            final /* synthetic */ Boolean f223399e;

            /* JADX INFO: renamed from: com.planner5d.library.modules.user.user.t$s$a$a, reason: collision with other inner class name */
            @kotlin.coroutines.jvm.internal.f(c = "com.planner5d.library.modules.user.user.UserAuthorization$signIn$5$2$1", f = "UserAuthorization.kt", i = {}, l = {342}, m = "invokeSuspend", n = {}, s = {})
            static final class C1650a extends kotlin.coroutines.jvm.internal.o implements Function2<kotlinx.coroutines.s0, kotlin.coroutines.d<? super Unit>, Object> {

                /* JADX INFO: renamed from: a, reason: collision with root package name */
                int f223400a;

                /* JADX INFO: renamed from: b, reason: collision with root package name */
                final /* synthetic */ t f223401b;

                /* JADX INFO: renamed from: c, reason: collision with root package name */
                final /* synthetic */ id.a f223402c;

                /* JADX INFO: renamed from: d, reason: collision with root package name */
                final /* synthetic */ id.a f223403d;

                /* JADX INFO: renamed from: e, reason: collision with root package name */
                final /* synthetic */ Boolean f223404e;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                C1650a(t tVar, id.a aVar, id.a aVar2, Boolean bool, kotlin.coroutines.d<? super C1650a> dVar) {
                    super(2, dVar);
                    this.f223401b = tVar;
                    this.f223402c = aVar;
                    this.f223403d = aVar2;
                    this.f223404e = bool;
                }

                @Override // kotlin.coroutines.jvm.internal.a
                public final kotlin.coroutines.d<Unit> create(Object obj, kotlin.coroutines.d<?> dVar) {
                    return new C1650a(this.f223401b, this.f223402c, this.f223403d, this.f223404e, dVar);
                }

                @Override // kotlin.coroutines.jvm.internal.a
                public final Object invokeSuspend(Object obj) {
                    C1650a c1650a;
                    Object objL = kotlin.coroutines.intrinsics.b.l();
                    int i10 = this.f223400a;
                    if (i10 == 0) {
                        ResultKt.m(obj);
                        this.f223401b.f0(this.f223402c, false, this.f223403d == null);
                        if (Intrinsics.areEqual(this.f223404e, kotlin.coroutines.jvm.internal.b.a(true))) {
                            if (((com.planner5d.library.model.manager.config.j) this.f223401b.f223287e.get()).a(com.planner5d.library.model.manager.config.f.SignInWithCode)) {
                                com.planner5d.library.legal.model.manager.a aVar = (com.planner5d.library.legal.model.manager.a) this.f223401b.f223300r.get();
                                id.a aVar2 = this.f223402c;
                                this.f223400a = 1;
                                c1650a = this;
                                if (com.planner5d.library.legal.model.manager.a.I(aVar, aVar2, null, c1650a, 2, null) == objL) {
                                    return objL;
                                }
                            }
                            c1650a.f223401b.f223292j.M(c1650a.f223402c.f287075a);
                        }
                        return Unit.f312394a;
                    }
                    if (i10 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    ResultKt.m(obj);
                    c1650a = this;
                    c1650a.f223401b.f223292j.M(c1650a.f223402c.f287075a);
                    return Unit.f312394a;
                }

                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(kotlinx.coroutines.s0 s0Var, kotlin.coroutines.d<? super Unit> dVar) {
                    return ((C1650a) create(s0Var, dVar)).invokeSuspend(Unit.f312394a);
                }
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            a(t tVar, id.a aVar, id.a aVar2, Boolean bool, kotlin.coroutines.d<? super a> dVar) {
                super(1, dVar);
                this.f223396b = tVar;
                this.f223397c = aVar;
                this.f223398d = aVar2;
                this.f223399e = bool;
            }

            @Override // kotlin.coroutines.jvm.internal.a
            public final kotlin.coroutines.d<Unit> create(kotlin.coroutines.d<?> dVar) {
                return new a(this.f223396b, this.f223397c, this.f223398d, this.f223399e, dVar);
            }

            @Override // kotlin.coroutines.jvm.internal.a
            public final Object invokeSuspend(Object obj) {
                Object objL = kotlin.coroutines.intrinsics.b.l();
                int i10 = this.f223395a;
                int i11 = 5 | 1;
                if (i10 == 0) {
                    ResultKt.m(obj);
                    z1 z1VarD = com.planner5d.library.services.utility.s.f229729a.d();
                    C1650a c1650a = new C1650a(this.f223396b, this.f223397c, this.f223398d, this.f223399e, null);
                    this.f223395a = 1;
                    if (kotlinx.coroutines.i.h(z1VarD, c1650a, this) == objL) {
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

            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(kotlin.coroutines.d<? super Unit> dVar) {
                return ((a) create(dVar)).invokeSuspend(Unit.f312394a);
            }
        }

        @kotlin.coroutines.jvm.internal.f(c = "com.planner5d.library.modules.user.user.UserAuthorization$signIn$5$response$1", f = "UserAuthorization.kt", i = {}, l = {androidx.constraintlayout.core.motion.utils.v.a.f43974q}, m = "invokeSuspend", n = {}, s = {})
        static final class b extends kotlin.coroutines.jvm.internal.o implements Function2<kotlinx.coroutines.s0, kotlin.coroutines.d<? super com.planner5d.library.api.c>, Object> {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            int f223405a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            final /* synthetic */ Function1<kotlin.coroutines.d<? super com.planner5d.library.api.c>, Object> f223406b;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            /* JADX WARN: Multi-variable type inference failed */
            b(Function1<? super kotlin.coroutines.d<? super com.planner5d.library.api.c>, ? extends Object> function1, kotlin.coroutines.d<? super b> dVar) {
                super(2, dVar);
                this.f223406b = function1;
            }

            @Override // kotlin.coroutines.jvm.internal.a
            public final kotlin.coroutines.d<Unit> create(Object obj, kotlin.coroutines.d<?> dVar) {
                return new b(this.f223406b, dVar);
            }

            @Override // kotlin.coroutines.jvm.internal.a
            public final Object invokeSuspend(Object obj) {
                Object objL = kotlin.coroutines.intrinsics.b.l();
                int i10 = this.f223405a;
                if (i10 != 0) {
                    if (i10 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    ResultKt.m(obj);
                    return obj;
                }
                ResultKt.m(obj);
                Function1<kotlin.coroutines.d<? super com.planner5d.library.api.c>, Object> function1 = this.f223406b;
                this.f223405a = 1;
                Object objInvoke = function1.invoke(this);
                return objInvoke == objL ? objL : objInvoke;
            }

            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(kotlinx.coroutines.s0 s0Var, kotlin.coroutines.d<? super com.planner5d.library.api.c> dVar) {
                return ((b) create(s0Var, dVar)).invokeSuspend(Unit.f312394a);
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        s(Function1<? super kotlin.coroutines.d<? super com.planner5d.library.api.c>, ? extends Object> function1, kotlin.coroutines.d<? super s> dVar) {
            super(1, dVar);
            this.f223394e = function1;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final LogRecord m(JSONObject jSONObject, Exception exc) {
            return new LogRecord("login", jSONObject.toString(), exc);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final kotlin.coroutines.d<Unit> create(kotlin.coroutines.d<?> dVar) {
            return t.this.new s(this.f223394e, dVar);
        }

        /* JADX WARN: Code restructure failed: missing block: B:52:0x0128, code lost:
        
            if (r2.R(r18) == r6) goto L53;
         */
        @Override // kotlin.coroutines.jvm.internal.a
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public final java.lang.Object invokeSuspend(java.lang.Object r19) throws java.lang.Throwable {
            /*
                Method dump skipped, instruction units count: 434
                To view this dump add '--comments-level debug' option
            */
            throw new UnsupportedOperationException("Method not decompiled: com.planner5d.library.modules.user.user.t.s.invokeSuspend(java.lang.Object):java.lang.Object");
        }

        @Override // kotlin.jvm.functions.Function1
        public final Object invoke(kotlin.coroutines.d<? super id.d> dVar) {
            return ((s) create(dVar)).invokeSuspend(Unit.f312394a);
        }
    }

    /* JADX INFO: renamed from: com.planner5d.library.modules.user.user.t$t, reason: collision with other inner class name */
    @kotlin.coroutines.jvm.internal.f(c = "com.planner5d.library.modules.user.user.UserAuthorization", f = "UserAuthorization.kt", i = {}, l = {490}, m = "signInWithCode", n = {}, s = {})
    static final class C1651t extends kotlin.coroutines.jvm.internal.d {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        /* synthetic */ Object f223407a;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        int f223409c;

        C1651t(kotlin.coroutines.d<? super C1651t> dVar) {
            super(dVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            this.f223407a = obj;
            this.f223409c |= Integer.MIN_VALUE;
            return t.this.A0(0, null, this);
        }
    }

    @kotlin.coroutines.jvm.internal.f(c = "com.planner5d.library.modules.user.user.UserAuthorization$signInWithCode$2", f = "UserAuthorization.kt", i = {}, l = {491}, m = "invokeSuspend", n = {}, s = {})
    static final class u extends kotlin.coroutines.jvm.internal.o implements Function2<kotlinx.coroutines.s0, kotlin.coroutines.d<? super id.d>, Object> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        int f223410a;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ JSONObject f223412c;

        @kotlin.coroutines.jvm.internal.f(c = "com.planner5d.library.modules.user.user.UserAuthorization$signInWithCode$2$1", f = "UserAuthorization.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
        static final class a extends kotlin.coroutines.jvm.internal.o implements Function1<kotlin.coroutines.d<? super com.planner5d.library.api.c>, Object> {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            int f223413a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            final /* synthetic */ t f223414b;

            /* JADX INFO: renamed from: c, reason: collision with root package name */
            final /* synthetic */ JSONObject f223415c;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            a(t tVar, JSONObject jSONObject, kotlin.coroutines.d<? super a> dVar) {
                super(1, dVar);
                this.f223414b = tVar;
                this.f223415c = jSONObject;
            }

            @Override // kotlin.coroutines.jvm.internal.a
            public final kotlin.coroutines.d<Unit> create(kotlin.coroutines.d<?> dVar) {
                return new a(this.f223414b, this.f223415c, dVar);
            }

            @Override // kotlin.coroutines.jvm.internal.a
            public final Object invokeSuspend(Object obj) {
                kotlin.coroutines.intrinsics.b.l();
                if (this.f223413a != 0) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.m(obj);
                com.planner5d.library.api.c cVarD = this.f223414b.f223283a.d(this.f223415c);
                Intrinsics.checkNotNullExpressionValue(cVarD, "signInWithCode(...)");
                return cVarD;
            }

            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(kotlin.coroutines.d<? super com.planner5d.library.api.c> dVar) {
                return ((a) create(dVar)).invokeSuspend(Unit.f312394a);
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        u(JSONObject jSONObject, kotlin.coroutines.d<? super u> dVar) {
            super(2, dVar);
            this.f223412c = jSONObject;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final kotlin.coroutines.d<Unit> create(Object obj, kotlin.coroutines.d<?> dVar) {
            return t.this.new u(this.f223412c, dVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) throws Exception {
            Object objL = kotlin.coroutines.intrinsics.b.l();
            int i10 = this.f223410a;
            if (i10 != 0) {
                if (i10 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.m(obj);
                return obj;
            }
            ResultKt.m(obj);
            t tVar = t.this;
            a aVar = new a(tVar, this.f223412c, null);
            this.f223410a = 1;
            Object objZ0 = tVar.z0(aVar, this);
            return objZ0 == objL ? objL : objZ0;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(kotlinx.coroutines.s0 s0Var, kotlin.coroutines.d<? super id.d> dVar) {
            return ((u) create(s0Var, dVar)).invokeSuspend(Unit.f312394a);
        }
    }

    @kotlin.coroutines.jvm.internal.f(c = "com.planner5d.library.modules.user.user.UserAuthorization", f = "UserAuthorization.kt", i = {0, 0, 1, 1, 2, 2}, l = {449, 450, 453, 455}, m = "signUp", n = {"this", "data", "this", "data", "this", "data"}, s = {"L$0", "L$1", "L$0", "L$1", "L$0", "L$1"})
    static final class v extends kotlin.coroutines.jvm.internal.d {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        Object f223416a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        Object f223417b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        Object f223418c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        Object f223419d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        /* synthetic */ Object f223420e;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        int f223422g;

        v(kotlin.coroutines.d<? super v> dVar) {
            super(dVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            this.f223420e = obj;
            this.f223422g |= Integer.MIN_VALUE;
            return t.this.B0(null, null, this);
        }
    }

    @kotlin.coroutines.jvm.internal.f(c = "com.planner5d.library.modules.user.user.UserAuthorization", f = "UserAuthorization.kt", i = {0, 0, 1, 2, 2, 3, 3, 4}, l = {528, 529, 533, 536, 545}, m = "signUp", n = {"this", "data", "this", "this", "user", "this", "user", "user"}, s = {"L$0", "L$1", "L$0", "L$0", "L$1", "L$0", "L$1", "L$0"})
    static final class w extends kotlin.coroutines.jvm.internal.d {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        Object f223423a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        Object f223424b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        /* synthetic */ Object f223425c;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int f223427e;

        w(kotlin.coroutines.d<? super w> dVar) {
            super(dVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            this.f223425c = obj;
            this.f223427e |= Integer.MIN_VALUE;
            return t.this.C0(null, this);
        }
    }

    @kotlin.coroutines.jvm.internal.f(c = "com.planner5d.library.modules.user.user.UserAuthorization$signUp$4", f = "UserAuthorization.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
    static final class x extends kotlin.coroutines.jvm.internal.o implements Function2<kotlinx.coroutines.s0, kotlin.coroutines.d<? super Unit>, Object> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        int f223428a;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ id.a f223430c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        x(id.a aVar, kotlin.coroutines.d<? super x> dVar) {
            super(2, dVar);
            this.f223430c = aVar;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final kotlin.coroutines.d<Unit> create(Object obj, kotlin.coroutines.d<?> dVar) {
            return t.this.new x(this.f223430c, dVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            boolean z10;
            kotlin.coroutines.intrinsics.b.l();
            if (this.f223428a != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.m(obj);
            if (t.this.K != null) {
                t.this.f223292j.M(this.f223430c.f287075a);
                z10 = false;
            } else {
                z10 = true;
            }
            t.this.f0(this.f223430c, true, z10);
            return Unit.f312394a;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(kotlinx.coroutines.s0 s0Var, kotlin.coroutines.d<? super Unit> dVar) {
            return ((x) create(s0Var, dVar)).invokeSuspend(Unit.f312394a);
        }
    }

    @kotlin.coroutines.jvm.internal.f(c = "com.planner5d.library.modules.user.user.UserAuthorization$signUpAutomatic$1", f = "UserAuthorization.kt", i = {0}, l = {511, androidx.core.view.f0.f48707j, 518}, m = "invokeSuspend", n = {"data"}, s = {"L$0"})
    static final class y extends kotlin.coroutines.jvm.internal.o implements Function2<kotlinx.coroutines.s0, kotlin.coroutines.d<? super Unit>, Object> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        Object f223431a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        Object f223432b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        Object f223433c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        int f223434d;

        y(kotlin.coroutines.d<? super y> dVar) {
            super(2, dVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final kotlin.coroutines.d<Unit> create(Object obj, kotlin.coroutines.d<?> dVar) {
            return t.this.new y(dVar);
        }

        /* JADX WARN: Code duplicated, block: B:30:0x00ac  */
        /* JADX WARN: Code duplicated, block: B:31:0x00ad A[Catch: all -> 0x001b, PHI: r15
          0x00ad: PHI (r15v20 java.lang.Object) = (r15v19 java.lang.Object), (r15v0 java.lang.Object) binds: [B:29:0x00aa, B:14:0x0027] A[DONT_GENERATE, DONT_INLINE], TRY_LEAVE, TryCatch #0 {all -> 0x001b, blocks: (B:8:0x0015, B:14:0x0027, B:31:0x00ad, B:17:0x003a, B:28:0x008f, B:20:0x0042, B:22:0x004b, B:24:0x0058), top: B:38:0x000c }] */
        /* JADX WARN: Code restructure failed: missing block: B:33:0x00ce, code lost:
        
            if (r1.f((id.a) r15, r4, true, r14) == r0) goto L34;
         */
        @Override // kotlin.coroutines.jvm.internal.a
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public final java.lang.Object invokeSuspend(java.lang.Object r15) {
            /*
                Method dump skipped, instruction units count: 226
                To view this dump add '--comments-level debug' option
            */
            throw new UnsupportedOperationException("Method not decompiled: com.planner5d.library.modules.user.user.t.y.invokeSuspend(java.lang.Object):java.lang.Object");
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(kotlinx.coroutines.s0 s0Var, kotlin.coroutines.d<? super Unit> dVar) {
            return ((y) create(s0Var, dVar)).invokeSuspend(Unit.f312394a);
        }
    }

    @kotlin.coroutines.jvm.internal.f(c = "com.planner5d.library.modules.user.user.UserAuthorization$trySetLoggedIn$1$1", f = "UserAuthorization.kt", i = {}, l = {170}, m = "invokeSuspend", n = {}, s = {})
    static final class z extends kotlin.coroutines.jvm.internal.o implements Function2<kotlinx.coroutines.s0, kotlin.coroutines.d<? super fd.o>, Object> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        int f223436a;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ id.a f223438c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        z(id.a aVar, kotlin.coroutines.d<? super z> dVar) {
            super(2, dVar);
            this.f223438c = aVar;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final kotlin.coroutines.d<Unit> create(Object obj, kotlin.coroutines.d<?> dVar) {
            return t.this.new z(this.f223438c, dVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            Object objL = kotlin.coroutines.intrinsics.b.l();
            int i10 = this.f223436a;
            if (i10 != 0) {
                if (i10 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.m(obj);
                return obj;
            }
            ResultKt.m(obj);
            com.planner5d.library.model.manager.payments.p pVar = (com.planner5d.library.model.manager.payments.p) t.this.f223306x.get();
            id.a aVar = this.f223438c;
            this.f223436a = 1;
            Object objB = pVar.B(aVar, this);
            return objB == objL ? objL : objB;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(kotlinx.coroutines.s0 s0Var, kotlin.coroutines.d<? super fd.o> dVar) {
            return ((z) create(s0Var, dVar)).invokeSuspend(Unit.f312394a);
        }
    }

    @ij.a
    public t(@NotNull com.planner5d.library.api.b api, @NotNull com.planner5d.library.model.manager.c1 installationManager, @NotNull com.planner5d.library.application.b application, @NotNull com.planner5d.library.application.d configuration, @NotNull fg.e<com.planner5d.library.model.manager.config.j> featureConfigManager, @NotNull com.planner5d.library.model.manager.config.p preferences, @NotNull g1 userSocial, @NotNull t1 logRecordManager, @NotNull fg.e<y0> userRemember, @NotNull com.planner5d.library.model.manager.project.d0 projectManager, @NotNull com.planner5d.library.model.manager.c0 folderManager, @NotNull fg.e<com.planner5d.library.model.manager.synchronization.i> synchronizationManager, @NotNull fg.e<com.planner5d.library.model.manager.statistics.b0> statisticsManager, @NotNull fg.e<com.planner5d.library.model.manager.managedfiles.a0> managedFileManager, @NotNull com.planner5d.library.modules.user.user.b actionAfterLogInStandard, @NotNull com.planner5d.library.modules.user.user.d actionAfterLogInStandardNoRedirect, @NotNull q0 userProperties, @NotNull fg.e<com.planner5d.library.legal.model.manager.a> privacyManager, @NotNull fg.e<com.planner5d.library.model.manager.crashreporting.l> crashReporter, @NotNull fg.e<com.planner5d.library.model.manager.contest.g> contestManager, @NotNull com.planner5d.library.model.manager.i1 intercomManager, @NotNull m1 userStorage, @NotNull com.planner5d.library.api.requests.c userApiRequester, @NotNull fg.e<com.planner5d.library.model.manager.payments.p> paymentsRepository, @NotNull fg.e<t0> userPurchases, @NotNull fg.e<g0> userPaymentsSynchronizer, @NotNull ErrorMessageParser errorMessageParser, @NotNull fg.e<com.planner5d.library.model.manager.n1> languageManager, @NotNull com.planner5d.library.services.utility.f1 coroutineScope) {
        Intrinsics.checkNotNullParameter(api, "api");
        Intrinsics.checkNotNullParameter(installationManager, "installationManager");
        Intrinsics.checkNotNullParameter(application, "application");
        Intrinsics.checkNotNullParameter(configuration, "configuration");
        Intrinsics.checkNotNullParameter(featureConfigManager, "featureConfigManager");
        Intrinsics.checkNotNullParameter(preferences, "preferences");
        Intrinsics.checkNotNullParameter(userSocial, "userSocial");
        Intrinsics.checkNotNullParameter(logRecordManager, "logRecordManager");
        Intrinsics.checkNotNullParameter(userRemember, "userRemember");
        Intrinsics.checkNotNullParameter(projectManager, "projectManager");
        Intrinsics.checkNotNullParameter(folderManager, "folderManager");
        Intrinsics.checkNotNullParameter(synchronizationManager, "synchronizationManager");
        Intrinsics.checkNotNullParameter(statisticsManager, "statisticsManager");
        Intrinsics.checkNotNullParameter(managedFileManager, "managedFileManager");
        Intrinsics.checkNotNullParameter(actionAfterLogInStandard, "actionAfterLogInStandard");
        Intrinsics.checkNotNullParameter(actionAfterLogInStandardNoRedirect, "actionAfterLogInStandardNoRedirect");
        Intrinsics.checkNotNullParameter(userProperties, "userProperties");
        Intrinsics.checkNotNullParameter(privacyManager, "privacyManager");
        Intrinsics.checkNotNullParameter(crashReporter, "crashReporter");
        Intrinsics.checkNotNullParameter(contestManager, "contestManager");
        Intrinsics.checkNotNullParameter(intercomManager, "intercomManager");
        Intrinsics.checkNotNullParameter(userStorage, "userStorage");
        Intrinsics.checkNotNullParameter(userApiRequester, "userApiRequester");
        Intrinsics.checkNotNullParameter(paymentsRepository, "paymentsRepository");
        Intrinsics.checkNotNullParameter(userPurchases, "userPurchases");
        Intrinsics.checkNotNullParameter(userPaymentsSynchronizer, "userPaymentsSynchronizer");
        Intrinsics.checkNotNullParameter(errorMessageParser, "errorMessageParser");
        Intrinsics.checkNotNullParameter(languageManager, "languageManager");
        Intrinsics.checkNotNullParameter(coroutineScope, "coroutineScope");
        this.f223283a = api;
        this.f223284b = installationManager;
        this.f223285c = application;
        this.f223286d = configuration;
        this.f223287e = featureConfigManager;
        this.f223288f = preferences;
        this.f223289g = userSocial;
        this.f223290h = logRecordManager;
        this.f223291i = userRemember;
        this.f223292j = projectManager;
        this.f223293k = folderManager;
        this.f223294l = synchronizationManager;
        this.f223295m = statisticsManager;
        this.f223296n = managedFileManager;
        this.f223297o = actionAfterLogInStandard;
        this.f223298p = actionAfterLogInStandardNoRedirect;
        this.f223299q = userProperties;
        this.f223300r = privacyManager;
        this.f223301s = crashReporter;
        this.f223302t = contestManager;
        this.f223303u = intercomManager;
        this.f223304v = userStorage;
        this.f223305w = userApiRequester;
        this.f223306x = paymentsRepository;
        this.f223307y = userPurchases;
        this.f223308z = userPaymentsSynchronizer;
        this.A = errorMessageParser;
        this.B = languageManager;
        this.C = coroutineScope;
        this.E = new com.planner5d.library.model.converter.json.from.f0();
        this.F = new Object();
        this.G = new Object();
        this.I = new com.planner5d.library.model.converter.json.from.f0();
        this.J = new com.planner5d.library.model.converter.json.from.g0();
        kotlinx.coroutines.flow.j0<id.a> j0VarB = kotlinx.coroutines.flow.q0.b(1, 0, kotlinx.coroutines.channels.j.DROP_OLDEST, 2, null);
        this.L = j0VarB;
        this.M = kotlinx.coroutines.flow.k.m(j0VarB);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Code duplicated, block: B:47:0x00e5  */
    /* JADX WARN: Code duplicated, block: B:48:0x00e6  */
    /* JADX WARN: Code duplicated, block: B:51:0x0103  */
    /* JADX WARN: Code duplicated, block: B:55:0x0112 A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:8:0x0015  */
    public final Object C0(final JSONObject jSONObject, kotlin.coroutines.d<? super id.a> dVar) throws Exception {
        w wVar;
        id.a aVarA;
        com.planner5d.library.legal.model.manager.a aVar;
        t tVar;
        id.a aVar2;
        z1 z1VarD;
        x xVar;
        if (dVar instanceof w) {
            wVar = (w) dVar;
            int i10 = wVar.f223427e;
            if ((i10 & Integer.MIN_VALUE) != 0) {
                wVar.f223427e = i10 - Integer.MIN_VALUE;
            } else {
                wVar = new w(dVar);
            }
        } else {
            wVar = new w(dVar);
        }
        w wVar2 = wVar;
        Object objV = wVar2.f223425c;
        Object objL = kotlin.coroutines.intrinsics.b.l();
        int i11 = wVar2.f223427e;
        int i12 = 7 >> 5;
        try {
            if (i11 == 0) {
                ResultKt.m(objV);
                wVar2.f223423a = this;
                wVar2.f223424b = jSONObject;
                wVar2.f223427e = 1;
                objV = V(wVar2);
                if (objV == objL) {
                }
                return objL;
            }
            if (i11 == 1) {
                jSONObject = (JSONObject) wVar2.f223424b;
                this = (t) wVar2.f223423a;
                ResultKt.m(objV);
            } else {
                if (i11 == 2) {
                    this = (t) wVar2.f223423a;
                    ResultKt.m(objV);
                    aVarA = this.E.convert(new com.planner5d.library.model.converter.json.from.f0.a((com.planner5d.library.api.c) objV, (id.a) null));
                    aVar = this.f223300r.get();
                    wVar2.f223423a = this;
                    wVar2.f223424b = aVarA;
                    wVar2.f223427e = 3;
                    if (com.planner5d.library.legal.model.manager.a.I(aVar, aVarA, null, wVar2, 2, null) == objL) {
                        tVar = this;
                        aVar2 = aVarA;
                        z1VarD = com.planner5d.library.services.utility.s.f229729a.d();
                        xVar = tVar.new x(aVar2, null);
                        wVar2.f223423a = tVar;
                        wVar2.f223424b = aVar2;
                        wVar2.f223427e = 4;
                        if (kotlinx.coroutines.i.h(z1VarD, xVar, wVar2) != objL) {
                        }
                    }
                    return objL;
                }
                if (i11 == 3) {
                    aVar2 = (id.a) wVar2.f223424b;
                    tVar = (t) wVar2.f223423a;
                    ResultKt.m(objV);
                    z1VarD = com.planner5d.library.services.utility.s.f229729a.d();
                    xVar = tVar.new x(aVar2, null);
                    wVar2.f223423a = tVar;
                    wVar2.f223424b = aVar2;
                    wVar2.f223427e = 4;
                    if (kotlinx.coroutines.i.h(z1VarD, xVar, wVar2) != objL) {
                    }
                    return objL;
                }
                if (i11 != 4) {
                    if (i11 != 5) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    id.a aVar3 = (id.a) wVar2.f223423a;
                    ResultKt.m(objV);
                    return aVar3;
                }
                aVar2 = (id.a) wVar2.f223424b;
                tVar = (t) wVar2.f223423a;
                ResultKt.m(objV);
            }
            wVar2.f223423a = aVar2;
            wVar2.f223424b = null;
            wVar2.f223427e = 5;
            if (tVar.R(wVar2) != objL) {
                return objL;
            }
            return aVar2;
            final String str = (String) objV;
            com.planner5d.library.services.utility.b bVar = com.planner5d.library.services.utility.b.f225044a;
            com.planner5d.library.api.b bVar2 = this.f223283a;
            Function1<? super com.planner5d.library.api.b, com.planner5d.library.api.c> function1 = new Function1() { // from class: com.planner5d.library.modules.user.user.g
                @Override // kotlin.jvm.functions.Function1
                public final Object invoke(Object obj) {
                    return t.D0(this.f223050a, str, jSONObject, (com.planner5d.library.api.b) obj);
                }
            };
            wVar2.f223423a = this;
            wVar2.f223424b = null;
            wVar2.f223427e = 2;
            objV = bVar.c(bVar2, function1, wVar2);
            if (objV != objL) {
                aVarA = this.E.convert(new com.planner5d.library.model.converter.json.from.f0.a((com.planner5d.library.api.c) objV, (id.a) null));
                aVar = this.f223300r.get();
                wVar2.f223423a = this;
                wVar2.f223424b = aVarA;
                wVar2.f223427e = 3;
                if (com.planner5d.library.legal.model.manager.a.I(aVar, aVarA, null, wVar2, 2, null) == objL) {
                    tVar = this;
                    aVar2 = aVarA;
                    z1VarD = com.planner5d.library.services.utility.s.f229729a.d();
                    xVar = tVar.new x(aVar2, null);
                    wVar2.f223423a = tVar;
                    wVar2.f223424b = aVar2;
                    wVar2.f223427e = 4;
                    if (kotlinx.coroutines.i.h(z1VarD, xVar, wVar2) != objL) {
                        wVar2.f223423a = aVar2;
                        wVar2.f223424b = null;
                        wVar2.f223427e = 5;
                        if (tVar.R(wVar2) != objL) {
                            return aVar2;
                        }
                    }
                }
            }
            return objL;
        } catch (Exception e10) {
            timber.log.b.f381052a.e(e10);
            String message = e10.getMessage();
            if (message == null || !StringsKt.S2(message, "Forbidden", true)) {
                throw e10;
            }
            throw new Exception("Other error: Forbidden");
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final com.planner5d.library.api.c D0(t tVar, String str, JSONObject jSONObject, com.planner5d.library.api.b call) {
        Intrinsics.checkNotNullParameter(call, "$this$call");
        com.planner5d.library.api.c cVarQ0 = tVar.f223283a.Q0(str, jSONObject);
        Intrinsics.checkNotNullExpressionValue(cVarQ0, "signUp(...)");
        return cVarQ0;
    }

    private final void F0(Subscriber<?> subscriber, Throwable th2, @androidx.annotation.f1 int i10) {
        subscriber.onError(this.A.parse(th2, Integer.valueOf(i10)));
    }

    @androidx.annotation.m1
    private final fd.o G0(id.a aVar, boolean z10, boolean z11, boolean z12) {
        fd.o oVar;
        synchronized (this.G) {
            try {
                w0(aVar, z10, z11);
                oVar = null;
                if (!z12) {
                    oVar = (fd.o) com.planner5d.library.services.utility.c0.t(com.planner5d.library.services.utility.c0.f225068a, null, true, new z(aVar, null), 1, null);
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
        return oVar;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final Object R(kotlin.coroutines.d<? super Unit> dVar) {
        Object objH = kotlinx.coroutines.i.h(com.planner5d.library.services.utility.s.f229729a.h(), new b(null), dVar);
        return objH == kotlin.coroutines.intrinsics.b.l() ? objH : Unit.f312394a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final <T> Object U(Function1<? super kotlin.coroutines.d<? super T>, ? extends Object> function1, kotlin.coroutines.d<? super T> dVar) {
        return kotlinx.coroutines.i.h(com.planner5d.library.services.utility.s.f229729a.d(), new c(function1, null), dVar);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final id.a Y(Throwable th2) {
        return null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final id.a Z(Function1 function1, Object obj) {
        return (id.a) function1.invoke(obj);
    }

    private final boolean b0(id.a aVar) {
        Long lValueOf = aVar != null ? Long.valueOf(aVar.f287075a) : null;
        id.a aVar2 = this.K;
        return Intrinsics.areEqual(lValueOf, aVar2 != null ? Long.valueOf(aVar2.f287075a) : null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final Boolean c0(JSONObject jSONObject) throws JSONException {
        com.planner5d.library.services.r rVar = com.planner5d.library.services.r.isNewUser;
        if (jSONObject.has(rVar.f224891a)) {
            return Boolean.valueOf(com.planner5d.library.services.utility.k1.b(jSONObject, rVar.f224891a));
        }
        com.planner5d.library.services.r rVar2 = com.planner5d.library.services.r.isNew;
        if (jSONObject.has(rVar2.f224891a)) {
            return Boolean.valueOf(com.planner5d.library.services.utility.k1.b(jSONObject, rVar2.f224891a));
        }
        return null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Object g0(id.a aVar) {
        return Long.valueOf(aVar.f287075a);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void j0(final t tVar, Subscriber subscriber) {
        Intrinsics.checkNotNullParameter(subscriber, "subscriber");
        final id.a aVar = tVar.K;
        if (aVar == null) {
            subscriber.onNext(null);
            subscriber.onCompleted();
        }
        try {
            tVar.T(aVar, new Function0() { // from class: com.planner5d.library.modules.user.user.s
                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    return t.k0(this.f223279a, aVar);
                }
            });
            subscriber.onNext(null);
            subscriber.onCompleted();
        } catch (Throwable th2) {
            subscriber.onError(th2);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final com.planner5d.library.api.c k0(t tVar, id.a aVar) {
        com.planner5d.library.api.c cVarD0 = tVar.f223283a.D0(aVar);
        tVar.w0(null, false, false);
        tVar.f223298p.a();
        Intrinsics.checkNotNull(cVarD0);
        return cVarD0;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final a l0(com.planner5d.library.api.b requestAsObservable, id.a aVar) {
        Intrinsics.checkNotNullParameter(requestAsObservable, "$this$requestAsObservable");
        com.planner5d.library.api.c cVarV = requestAsObservable.v(aVar);
        Intrinsics.checkNotNullExpressionValue(cVarV, "userInfo(...)");
        com.planner5d.library.api.c cVarX = requestAsObservable.x(aVar);
        Intrinsics.checkNotNullExpressionValue(cVarX, "userProfileInfo(...)");
        return new a(cVarV, cVarX);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Observable m0(t tVar, id.a aVar, a aVar2) {
        id.a aVarA;
        try {
            synchronized (tVar.F) {
                try {
                    aVarA = tVar.I.convert(new com.planner5d.library.model.converter.json.from.f0.a(aVar2.a(), aVar));
                    tVar.I.convert(new com.planner5d.library.model.converter.json.from.f0.a(aVar2.b(), aVarA));
                    aVar.f287085k = tVar.J.convert(aVar2.a().a());
                    tVar.f(aVar);
                    Unit unit = Unit.f312394a;
                } catch (Throwable th2) {
                    throw th2;
                }
            }
            return Observable.just(aVarA);
        } catch (Throwable th3) {
            return Observable.error(th3);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Observable n0(Function1 function1, Object obj) {
        return (Observable) function1.invoke(obj);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final com.planner5d.library.api.c p0(t tVar, JSONObject jSONObject, com.planner5d.library.api.b call) {
        Intrinsics.checkNotNullParameter(call, "$this$call");
        com.planner5d.library.api.c cVarG0 = tVar.f223283a.g0(jSONObject);
        Intrinsics.checkNotNullExpressionValue(cVarG0, "requestCode(...)");
        return cVarG0;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final com.planner5d.library.api.c r0(t tVar, JSONObject jSONObject, com.planner5d.library.api.b call) {
        Intrinsics.checkNotNullParameter(call, "$this$call");
        com.planner5d.library.api.c cVarA0 = tVar.f223283a.A0(jSONObject);
        Intrinsics.checkNotNullExpressionValue(cVarA0, "remind(...)");
        return cVarA0;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void t0(String str, String str2, String str3, t tVar, id.a aVar, String str4, Subscriber subscriber) {
        Intrinsics.checkNotNullParameter(subscriber, "subscriber");
        try {
            final JSONObject jSONObject = new JSONObject();
            com.planner5d.library.services.r rVar = com.planner5d.library.services.r.uName;
            jSONObject.put(rVar.f224891a, str);
            if (str2 != null) {
                jSONObject.put(com.planner5d.library.services.r.passnew.f224891a, str2);
                jSONObject.put(com.planner5d.library.services.r.passold.f224891a, str3);
            }
            com.planner5d.library.api.c cVar = (com.planner5d.library.api.c) tVar.f223305w.j(aVar, new Function2() { // from class: com.planner5d.library.modules.user.user.q
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    return t.u0((com.planner5d.library.api.b) obj, (id.a) obj2);
                }
            });
            JSONObject jSONObjectA = cVar.a();
            com.planner5d.library.services.r rVar2 = com.planner5d.library.services.r.email;
            String string = jSONObjectA.getString(rVar2.f224891a);
            Intrinsics.checkNotNullExpressionValue(string, "getString(...)");
            boolean z10 = str4 == null || str4.length() == 0;
            boolean zN1 = StringsKt.N1(string, str4, true);
            if (!z10 && !zN1) {
                jSONObject.put(rVar2.f224891a, str4);
            }
            com.planner5d.library.services.r rVar3 = com.planner5d.library.services.r.about;
            jSONObject.put(rVar3.f224891a, cVar.a().getString(rVar3.f224891a));
            com.planner5d.library.services.r rVar4 = com.planner5d.library.services.r.location;
            jSONObject.put(rVar4.f224891a, cVar.a().getString(rVar4.f224891a));
            com.planner5d.library.api.c cVar2 = (com.planner5d.library.api.c) tVar.f223305w.j(aVar, new Function2() { // from class: com.planner5d.library.modules.user.user.r
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    return t.v0(jSONObject, (com.planner5d.library.api.b) obj, (id.a) obj2);
                }
            });
            if (cVar2.h() || aVar == null) {
                throw new JSONException("Response error");
            }
            aVar.f287076b = cVar2.a().getString(rVar.f224891a);
            if (com.planner5d.library.services.utility.k1.f225294a.B(cVar2.a(), rVar2)) {
                aVar.f287079e = cVar2.a().getString(rVar2.f224891a);
            } else if (!z10 && zN1) {
                aVar.f287079e = str4;
            }
            tVar.f(aVar);
            subscriber.onNext(aVar);
            subscriber.onCompleted();
        } catch (Throwable th2) {
            tVar.F0(subscriber, th2, com.planner5d.library.f.s.f169513w9);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final com.planner5d.library.api.c u0(com.planner5d.library.api.b requestBlocking, id.a aVar) {
        Intrinsics.checkNotNullParameter(requestBlocking, "$this$requestBlocking");
        return requestBlocking.u(aVar);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final com.planner5d.library.api.c v0(JSONObject jSONObject, com.planner5d.library.api.b requestBlocking, id.a aVar) {
        Intrinsics.checkNotNullParameter(requestBlocking, "$this$requestBlocking");
        return requestBlocking.i(aVar, jSONObject);
    }

    @androidx.annotation.m1
    private final void x0(id.a aVar) {
        synchronized (this.F) {
            try {
                this.K = aVar;
                f(aVar);
                this.f223300r.get().C();
                Unit unit = Unit.f312394a;
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0017  */
    @Nullable
    public final Object A0(int i10, @NotNull String str, @NotNull kotlin.coroutines.d<? super id.d> dVar) throws Exception {
        C1651t c1651t;
        if (dVar instanceof C1651t) {
            c1651t = (C1651t) dVar;
            int i11 = c1651t.f223409c;
            if ((i11 & Integer.MIN_VALUE) != 0) {
                c1651t.f223409c = i11 - Integer.MIN_VALUE;
            } else {
                c1651t = new C1651t(dVar);
            }
        } else {
            c1651t = new C1651t(dVar);
        }
        Object objH = c1651t.f223407a;
        Object objL = kotlin.coroutines.intrinsics.b.l();
        int i12 = c1651t.f223409c;
        try {
            if (i12 == 0) {
                ResultKt.m(objH);
                JSONObject jSONObject = new JSONObject();
                jSONObject.put(com.planner5d.library.services.r.code.f224891a, str);
                jSONObject.put(com.planner5d.library.services.r.action.f224891a, com.planner5d.library.services.r.loginLink.f224891a);
                jSONObject.put(com.planner5d.library.services.r.id.f224891a, i10);
                jSONObject.put(com.planner5d.library.services.r.from.f224891a, com.planner5d.library.api.f.a().f142267e);
                z1 z1VarH = com.planner5d.library.services.utility.s.f229729a.h();
                u uVar = new u(jSONObject, null);
                c1651t.f223409c = 1;
                objH = kotlinx.coroutines.i.h(z1VarH, uVar, c1651t);
                if (objH == objL) {
                    return objL;
                }
            } else {
                if (i12 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.m(objH);
            }
            return (id.d) objH;
        } catch (Exception e10) {
            timber.log.b.f381052a.e(e10);
            String message = e10.getMessage();
            if (message == null || !StringsKt.S2(message, "Forbidden", true)) {
                throw e10;
            }
            throw new Exception("Other error: Forbidden");
        }
    }

    /* JADX WARN: Code duplicated, block: B:37:0x00fd  */
    /* JADX WARN: Code duplicated, block: B:40:0x0114  */
    /* JADX WARN: Code duplicated, block: B:42:0x0124 A[PHI: r2 r9
      0x0124: PHI (r2v10 com.planner5d.library.modules.user.user.t) = (r2v8 com.planner5d.library.modules.user.user.t), (r2v11 com.planner5d.library.modules.user.user.t) binds: [B:36:0x00fb, B:41:0x0116] A[DONT_GENERATE, DONT_INLINE]
      0x0124: PHI (r9v8 org.json.JSONObject) = (r9v5 org.json.JSONObject), (r9v12 org.json.JSONObject) binds: [B:36:0x00fb, B:41:0x0116] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:45:0x0138 A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:7:0x0016  */
    @Nullable
    public final Object B0(@NotNull String str, @NotNull String str2, @NotNull kotlin.coroutines.d<? super id.a> dVar) throws Exception {
        v vVar;
        JSONObject jSONObject;
        t tVar;
        JSONObject jSONObject2;
        String str3;
        JSONObject jSONObject3;
        id.a aVar;
        String str4;
        String str5;
        JSONObject jSONObject4;
        Object objC0;
        if (dVar instanceof v) {
            vVar = (v) dVar;
            int i10 = vVar.f223422g;
            if ((i10 & Integer.MIN_VALUE) != 0) {
                vVar.f223422g = i10 - Integer.MIN_VALUE;
            } else {
                vVar = new v(dVar);
            }
        } else {
            vVar = new v(dVar);
        }
        Object objC = vVar.f223420e;
        Object objL = kotlin.coroutines.intrinsics.b.l();
        int i11 = vVar.f223422g;
        if (i11 == 0) {
            ResultKt.m(objC);
            JSONObject jSONObject5 = new JSONObject();
            jSONObject5.put(com.planner5d.library.services.r.email.f224891a, str);
            jSONObject5.put(com.planner5d.library.services.r.pass.f224891a, str2);
            jSONObject5.put(com.planner5d.library.services.r.automatic.f224891a, false);
            jSONObject5.put(com.planner5d.library.services.r.from.f224891a, com.planner5d.library.api.f.a().f142267e);
            com.planner5d.library.model.manager.config.p pVar = this.f223288f;
            com.planner5d.library.services.r rVar = com.planner5d.library.services.r.useStagingDomain;
            vVar.f223416a = this;
            vVar.f223417b = jSONObject5;
            vVar.f223422g = 1;
            Object objG = pVar.G(rVar, false, vVar);
            if (objG != objL) {
                objC = objG;
                jSONObject = jSONObject5;
            }
            return objL;
        }
        if (i11 == 1) {
            JSONObject jSONObject6 = (JSONObject) vVar.f223417b;
            t tVar2 = (t) vVar.f223416a;
            ResultKt.m(objC);
            jSONObject = jSONObject6;
            this = tVar2;
        } else {
            if (i11 == 2) {
                str3 = (String) vVar.f223419d;
                jSONObject = (JSONObject) vVar.f223418c;
                jSONObject3 = (JSONObject) vVar.f223417b;
                tVar = (t) vVar.f223416a;
                ResultKt.m(objC);
                jSONObject.put(str3, objC);
                jSONObject2 = jSONObject3;
                aVar = tVar.K;
                if (aVar != null) {
                    str4 = com.planner5d.library.services.r.automerge.f224891a;
                    vVar.f223416a = tVar;
                    vVar.f223417b = jSONObject2;
                    vVar.f223418c = str4;
                    vVar.f223419d = jSONObject2;
                    vVar.f223422g = 3;
                    objC = tVar.X(aVar, vVar);
                    if (objC != objL) {
                        str5 = str4;
                        jSONObject4 = jSONObject2;
                    }
                } else {
                    vVar.f223416a = null;
                    vVar.f223417b = null;
                    vVar.f223418c = null;
                    vVar.f223419d = null;
                    vVar.f223422g = 4;
                    objC0 = tVar.C0(jSONObject2, vVar);
                    if (objC0 != objL) {
                        return objC0;
                    }
                }
                return objL;
            }
            if (i11 != 3) {
                if (i11 != 4) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.m(objC);
                return objC;
            }
            jSONObject2 = (JSONObject) vVar.f223419d;
            str5 = (String) vVar.f223418c;
            jSONObject4 = (JSONObject) vVar.f223417b;
            tVar = (t) vVar.f223416a;
            ResultKt.m(objC);
        }
        jSONObject2.put(str5, !((Boolean) objC).booleanValue());
        jSONObject2 = jSONObject4;
        vVar.f223416a = null;
        vVar.f223417b = null;
        vVar.f223418c = null;
        vVar.f223419d = null;
        vVar.f223422g = 4;
        objC0 = tVar.C0(jSONObject2, vVar);
        if (objC0 != objL) {
            return objL;
        }
        return objC0;
        if (((Boolean) objC).booleanValue()) {
            tVar = this;
            jSONObject2 = jSONObject;
            aVar = tVar.K;
            if (aVar != null) {
                str4 = com.planner5d.library.services.r.automerge.f224891a;
                vVar.f223416a = tVar;
                vVar.f223417b = jSONObject2;
                vVar.f223418c = str4;
                vVar.f223419d = jSONObject2;
                vVar.f223422g = 3;
                objC = tVar.X(aVar, vVar);
                if (objC != objL) {
                    str5 = str4;
                    jSONObject4 = jSONObject2;
                    jSONObject2.put(str5, !((Boolean) objC).booleanValue());
                    jSONObject2 = jSONObject4;
                    vVar.f223416a = null;
                    vVar.f223417b = null;
                    vVar.f223418c = null;
                    vVar.f223419d = null;
                    vVar.f223422g = 4;
                    objC0 = tVar.C0(jSONObject2, vVar);
                    if (objC0 != objL) {
                        return objC0;
                    }
                }
            } else {
                vVar.f223416a = null;
                vVar.f223417b = null;
                vVar.f223418c = null;
                vVar.f223419d = null;
                vVar.f223422g = 4;
                objC0 = tVar.C0(jSONObject2, vVar);
                if (objC0 != objL) {
                    return objC0;
                }
            }
        } else {
            String str6 = com.planner5d.library.services.r.installation.f224891a;
            com.planner5d.library.model.manager.c1 c1Var = this.f223284b;
            vVar.f223416a = this;
            vVar.f223417b = jSONObject;
            vVar.f223418c = jSONObject;
            vVar.f223419d = str6;
            vVar.f223422g = 2;
            objC = c1Var.c(vVar);
            if (objC != objL) {
                tVar = this;
                str3 = str6;
                jSONObject3 = jSONObject;
                jSONObject.put(str3, objC);
                jSONObject2 = jSONObject3;
                aVar = tVar.K;
                if (aVar != null) {
                    str4 = com.planner5d.library.services.r.automerge.f224891a;
                    vVar.f223416a = tVar;
                    vVar.f223417b = jSONObject2;
                    vVar.f223418c = str4;
                    vVar.f223419d = jSONObject2;
                    vVar.f223422g = 3;
                    objC = tVar.X(aVar, vVar);
                    if (objC != objL) {
                        str5 = str4;
                        jSONObject4 = jSONObject2;
                        jSONObject2.put(str5, !((Boolean) objC).booleanValue());
                        jSONObject2 = jSONObject4;
                        vVar.f223416a = null;
                        vVar.f223417b = null;
                        vVar.f223418c = null;
                        vVar.f223419d = null;
                        vVar.f223422g = 4;
                        objC0 = tVar.C0(jSONObject2, vVar);
                        if (objC0 != objL) {
                            return objC0;
                        }
                    }
                } else {
                    vVar.f223416a = null;
                    vVar.f223417b = null;
                    vVar.f223418c = null;
                    vVar.f223419d = null;
                    vVar.f223422g = 4;
                    objC0 = tVar.C0(jSONObject2, vVar);
                    if (objC0 != objL) {
                        return objC0;
                    }
                }
            }
        }
        return objL;
    }

    @androidx.annotation.m1
    public final void E0() {
        com.planner5d.library.services.utility.c0.f225068a.r(com.planner5d.library.services.utility.s.f229729a.d(), true, new y(null));
    }

    @NotNull
    public final com.planner5d.library.api.c S(@NotNull Function0<com.planner5d.library.api.c> request) throws Throwable {
        com.planner5d.library.api.c cVarInvoke;
        Intrinsics.checkNotNullParameter(request, "request");
        synchronized (this.G) {
            try {
                cVarInvoke = request.invoke();
            } catch (Throwable th2) {
                throw th2;
            }
        }
        return cVarInvoke;
    }

    @NotNull
    public final com.planner5d.library.api.c T(@Nullable id.a aVar, @NotNull Function0<com.planner5d.library.api.c> request) throws Exception {
        com.planner5d.library.api.c cVarS;
        Intrinsics.checkNotNullParameter(request, "request");
        if (aVar == null) {
            throw new Exception("User is not logged in");
        }
        synchronized (this.G) {
            if (!b0(aVar)) {
                throw new Exception("Other user is logged in");
            }
            cVarS = S(request);
        }
        return cVarS;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0015  */
    @Nullable
    public final Object V(@NotNull kotlin.coroutines.d<? super String> dVar) throws Exception {
        d dVar2;
        id.a aVar;
        if (dVar instanceof d) {
            dVar2 = (d) dVar;
            int i10 = dVar2.f223321d;
            if ((i10 & Integer.MIN_VALUE) != 0) {
                dVar2.f223321d = i10 - Integer.MIN_VALUE;
            } else {
                dVar2 = new d(dVar);
            }
        } else {
            dVar2 = new d(dVar);
        }
        Object obj = dVar2.f223319b;
        Object objL = kotlin.coroutines.intrinsics.b.l();
        int i11 = dVar2.f223321d;
        if (i11 == 0) {
            ResultKt.m(obj);
            id.a aVar2 = this.K;
            if (aVar2 != null) {
                dVar2.f223318a = aVar2;
                dVar2.f223321d = 1;
                Object objX = X(aVar2, dVar2);
                if (objX == objL) {
                    return objL;
                }
                obj = objX;
                aVar = aVar2;
            }
            return null;
        }
        if (i11 != 1) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        aVar = (id.a) dVar2.f223318a;
        ResultKt.m(obj);
        if (!((Boolean) obj).booleanValue()) {
            return aVar.f287077c;
        }
        return null;
    }

    @androidx.annotation.m1
    public final void W() {
        if (this.H) {
            return;
        }
        id.a aVarH = this.f223304v.h();
        if (aVarH != null) {
            w0(aVarH, false, false);
            this.f223298p.a();
            kotlinx.coroutines.k.f(this.C, com.planner5d.library.services.utility.s.f229729a.h(), null, new e(aVarH, null), 2, null);
        } else {
            this.f223292j.M(0L);
        }
        this.H = true;
        this.L.f(aVarH);
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0017  */
    @Nullable
    public final Object X(@NotNull id.a aVar, @NotNull kotlin.coroutines.d<? super Boolean> dVar) throws Exception {
        g gVar;
        boolean zBooleanValue;
        if (dVar instanceof g) {
            gVar = (g) dVar;
            int i10 = gVar.f223330c;
            if ((i10 & Integer.MIN_VALUE) != 0) {
                gVar.f223330c = i10 - Integer.MIN_VALUE;
            } else {
                gVar = new g(dVar);
            }
        } else {
            gVar = new g(dVar);
        }
        Object objL = gVar.f223328a;
        Object objL2 = kotlin.coroutines.intrinsics.b.l();
        int i11 = gVar.f223330c;
        if (i11 == 0) {
            ResultKt.m(objL);
            Boolean bool = aVar.f287082h;
            if (bool != null) {
                zBooleanValue = bool.booleanValue();
            } else {
                com.planner5d.library.services.utility.c0 c0Var = com.planner5d.library.services.utility.c0.f225068a;
                Observable<id.a> observableG = g(aVar);
                final Function1 function1 = new Function1() { // from class: com.planner5d.library.modules.user.user.l
                    @Override // kotlin.jvm.functions.Function1
                    public final Object invoke(Object obj) {
                        return t.Y((Throwable) obj);
                    }
                };
                Observable<id.a> observableOnErrorReturn = observableG.onErrorReturn(new Func1() { // from class: com.planner5d.library.modules.user.user.m
                    @Override // rx.functions.Func1
                    public final Object call(Object obj) {
                        return t.Z(function1, obj);
                    }
                });
                Intrinsics.checkNotNullExpressionValue(observableOnErrorReturn, "onErrorReturn(...)");
                gVar.f223330c = 1;
                objL = c0Var.l(observableOnErrorReturn, gVar);
                if (objL == objL2) {
                    return objL2;
                }
            }
            return kotlin.coroutines.jvm.internal.b.a(zBooleanValue);
        }
        if (i11 != 1) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        ResultKt.m(objL);
        id.a aVar2 = (id.a) objL;
        Boolean bool2 = aVar2 != null ? aVar2.f287082h : null;
        if (bool2 == null) {
            throw new Exception("Failed to obtain filled status");
        }
        zBooleanValue = bool2.booleanValue();
        return kotlin.coroutines.jvm.internal.b.a(zBooleanValue);
    }

    @Override // com.planner5d.library.modules.user.user.w
    @Nullable
    public id.a a() {
        id.a aVar;
        synchronized (this.F) {
            aVar = this.K;
        }
        return aVar;
    }

    /* JADX WARN: Code duplicated, block: B:24:0x0059  */
    /* JADX WARN: Code duplicated, block: B:25:0x005e  */
    /* JADX WARN: Code duplicated, block: B:7:0x0017  */
    @Nullable
    public final Object a0(@Nullable id.a aVar, @NotNull kotlin.coroutines.d<? super Boolean> dVar) {
        h hVar;
        boolean zBooleanValue;
        if (dVar instanceof h) {
            hVar = (h) dVar;
            int i10 = hVar.f223333c;
            if ((i10 & Integer.MIN_VALUE) != 0) {
                hVar.f223333c = i10 - Integer.MIN_VALUE;
            } else {
                hVar = new h(dVar);
            }
        } else {
            hVar = new h(dVar);
        }
        Object objX = hVar.f223331a;
        Object objL = kotlin.coroutines.intrinsics.b.l();
        int i11 = hVar.f223333c;
        Boolean boolA = null;
        try {
            if (i11 == 0) {
                ResultKt.m(objX);
                if (aVar != null) {
                    hVar.f223333c = 1;
                    objX = X(aVar, hVar);
                    if (objX == objL) {
                        return objL;
                    }
                }
                if (boolA != null) {
                    zBooleanValue = boolA.booleanValue();
                } else {
                    zBooleanValue = false;
                }
                return kotlin.coroutines.jvm.internal.b.a(zBooleanValue);
            }
            if (i11 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.m(objX);
            boolA = kotlin.coroutines.jvm.internal.b.a(((Boolean) objX).booleanValue());
        } catch (Throwable unused) {
        }
        if (boolA != null) {
            zBooleanValue = boolA.booleanValue();
        } else {
            zBooleanValue = false;
        }
        return kotlin.coroutines.jvm.internal.b.a(zBooleanValue);
    }

    @Override // com.planner5d.library.modules.user.user.w
    public boolean b() {
        return a() != null;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0015  */
    @Override // com.planner5d.library.modules.user.user.w
    @Nullable
    public Object c(@NotNull kotlin.coroutines.d<? super Boolean> dVar) throws Exception {
        f fVar;
        boolean zBooleanValue;
        if (dVar instanceof f) {
            fVar = (f) dVar;
            int i10 = fVar.f223327c;
            if ((i10 & Integer.MIN_VALUE) != 0) {
                fVar.f223327c = i10 - Integer.MIN_VALUE;
            } else {
                fVar = new f(dVar);
            }
        } else {
            fVar = new f(dVar);
        }
        Object objX = fVar.f223325a;
        Object objL = kotlin.coroutines.intrinsics.b.l();
        int i11 = fVar.f223327c;
        if (i11 == 0) {
            ResultKt.m(objX);
            id.a aVarA = a();
            if (aVarA != null) {
                fVar.f223327c = 1;
                objX = X(aVarA, fVar);
                if (objX == objL) {
                    return objL;
                }
            } else {
                zBooleanValue = false;
            }
            return kotlin.coroutines.jvm.internal.b.a(zBooleanValue);
        }
        if (i11 != 1) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        ResultKt.m(objX);
        zBooleanValue = ((Boolean) objX).booleanValue();
        return kotlin.coroutines.jvm.internal.b.a(zBooleanValue);
    }

    @Override // com.planner5d.library.modules.user.user.w
    @NotNull
    public kotlinx.coroutines.flow.o0<id.a> d() {
        return this.M;
    }

    @NotNull
    public final Observable<id.d> d0(@NotNull SocialAuthType service, @Nullable String str, @Nullable String str2, @Nullable String str3) {
        Intrinsics.checkNotNullParameter(service, "service");
        return com.planner5d.library.services.utility.c0.F(com.planner5d.library.services.utility.c0.f225068a, null, new j(service, str, str2, str3, null), 1, null);
    }

    @Override // com.planner5d.library.modules.user.user.w
    public long e() {
        return com.planner5d.library.modules.user.user.x.a(a());
    }

    @NotNull
    public final Observable<id.a> e0(@Nullable String str) {
        return com.planner5d.library.services.utility.c0.F(com.planner5d.library.services.utility.c0.f225068a, null, new i(str, null), 1, null);
    }

    @Override // com.planner5d.library.modules.user.user.w
    @androidx.annotation.m1
    public void f(@Nullable id.a aVar) {
        synchronized (this.F) {
            try {
                if (b0(aVar)) {
                    this.f223304v.m(aVar);
                }
                this.L.f(aVar);
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    @androidx.annotation.m1
    public final void f0(@NotNull final id.a user, boolean z10, boolean z11) {
        Intrinsics.checkNotNullParameter(user, "user");
        try {
            fd.o oVarG0 = G0(user, z10, z11, false);
            if (this.f223291i.get().i()) {
                this.f223291i.get().s();
            }
            com.planner5d.library.model.manager.config.p pVar = this.f223288f;
            com.planner5d.library.services.r rVar = com.planner5d.library.services.r.authentications;
            pVar.g(rVar, pVar.l(rVar, 0) + 1);
            this.f223307y.get().g0(user, oVarG0, true);
            this.f223284b.l("user_id", new ij.c() { // from class: com.planner5d.library.modules.user.user.k
                @Override // ij.c
                public final Object get() {
                    return t.g0(user);
                }
            });
            this.f223308z.get().n(user, true);
            kotlinx.coroutines.k.f(this.C, null, null, new k(null), 3, null);
        } catch (Throwable th2) {
            G0(user, z10, z11, true);
            throw th2;
        }
    }

    @Override // com.planner5d.library.modules.user.user.w
    @NotNull
    public Observable<id.a> g(@NotNull final id.a user) {
        Intrinsics.checkNotNullParameter(user, "user");
        Observable observableObserveOn = com.planner5d.library.api.requests.c.i(this.f223305w, user, null, new Function2() { // from class: com.planner5d.library.modules.user.user.h
            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(Object obj, Object obj2) {
                return t.l0((com.planner5d.library.api.b) obj, (id.a) obj2);
            }
        }, 2, null).observeOn(com.planner5d.library.services.rx.c.f224933c);
        final Function1 function1 = new Function1() { // from class: com.planner5d.library.modules.user.user.i
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return t.m0(this.f223153a, user, (t.a) obj);
            }
        };
        Observable<id.a> observableObserveOn2 = observableObserveOn.flatMap(new Func1() { // from class: com.planner5d.library.modules.user.user.j
            @Override // rx.functions.Func1
            public final Object call(Object obj) {
                return t.n0(function1, obj);
            }
        }).observeOn(com.planner5d.library.services.rx.c.f224934d);
        Intrinsics.checkNotNullExpressionValue(observableObserveOn2, "observeOn(...)");
        return observableObserveOn2;
    }

    @Override // com.planner5d.library.modules.user.user.w
    @NotNull
    public String h() {
        String strM = this.B.get().m();
        Intrinsics.checkNotNullExpressionValue(strM, "getLanguageSupport(...)");
        return strM;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0018  */
    /* JADX WARN: Code restructure failed: missing block: B:27:0x0087, code lost:
    
        if (r8.e(true, r0) == r1) goto L28;
     */
    @org.jetbrains.annotations.Nullable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object h0(@org.jetbrains.annotations.NotNull java.lang.String r9, @org.jetbrains.annotations.NotNull kotlin.coroutines.d<? super kotlin.Unit> r10) throws com.planner5d.library.services.exceptions.ErrorMessageException {
        /*
            r8 = this;
            r7 = 3
            boolean r0 = r10 instanceof com.planner5d.library.modules.user.user.t.l
            if (r0 == 0) goto L18
            r0 = r10
            r0 = r10
            r7 = 5
            com.planner5d.library.modules.user.user.t$l r0 = (com.planner5d.library.modules.user.user.t.l) r0
            int r1 = r0.f223366d
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r7 = 7
            r3 = r1 & r2
            r7 = 6
            if (r3 == 0) goto L18
            int r1 = r1 - r2
            r0.f223366d = r1
            goto L1d
        L18:
            com.planner5d.library.modules.user.user.t$l r0 = new com.planner5d.library.modules.user.user.t$l
            r0.<init>(r10)
        L1d:
            r7 = 6
            java.lang.Object r10 = r0.f223364b
            java.lang.Object r1 = kotlin.coroutines.intrinsics.b.l()
            int r2 = r0.f223366d
            r3 = 0
            r7 = 7
            r4 = 2
            r5 = 1
            r7 = r7 | r5
            if (r2 == 0) goto L49
            r7 = 0
            if (r2 == r5) goto L40
            r7 = 4
            if (r2 != r4) goto L38
            r7 = 3
            kotlin.ResultKt.m(r10)     // Catch: java.lang.Exception -> L8e
            goto L8b
        L38:
            java.lang.IllegalStateException r8 = new java.lang.IllegalStateException
            java.lang.String r9 = "call to 'resume' before 'invoke' with coroutine"
            r8.<init>(r9)
            throw r8
        L40:
            r7 = 7
            java.lang.Object r8 = r0.f223363a
            com.planner5d.library.modules.user.user.t r8 = (com.planner5d.library.modules.user.user.t) r8
            kotlin.ResultKt.m(r10)     // Catch: java.lang.Exception -> L8e
            goto L7a
        L49:
            kotlin.ResultKt.m(r10)
            org.json.JSONObject r10 = new org.json.JSONObject     // Catch: java.lang.Exception -> L8e
            r7 = 1
            r10.<init>()     // Catch: java.lang.Exception -> L8e
            r7 = 4
            com.planner5d.library.services.r r2 = com.planner5d.library.services.r.action     // Catch: java.lang.Exception -> L8e
            r7 = 7
            java.lang.String r2 = r2.f224891a     // Catch: java.lang.Exception -> L8e
            r7 = 1
            java.lang.String r6 = "login_link"
            r7 = 1
            r10.put(r2, r6)     // Catch: java.lang.Exception -> L8e
            com.planner5d.library.services.r r2 = com.planner5d.library.services.r.link     // Catch: java.lang.Exception -> L8e
            java.lang.String r2 = r2.f224891a     // Catch: java.lang.Exception -> L8e
            r7 = 2
            r10.put(r2, r9)     // Catch: java.lang.Exception -> L8e
            r7 = 2
            com.planner5d.library.modules.user.user.t$m r9 = new com.planner5d.library.modules.user.user.t$m     // Catch: java.lang.Exception -> L8e
            r9.<init>(r10, r3)     // Catch: java.lang.Exception -> L8e
            r0.f223363a = r8     // Catch: java.lang.Exception -> L8e
            r0.f223366d = r5     // Catch: java.lang.Exception -> L8e
            r7 = 3
            java.lang.Object r9 = r8.z0(r9, r0)     // Catch: java.lang.Exception -> L8e
            r7 = 4
            if (r9 != r1) goto L7a
            goto L89
        L7a:
            r7 = 7
            com.planner5d.library.modules.user.user.b r8 = r8.f223297o     // Catch: java.lang.Exception -> L8e
            r0.f223363a = r3     // Catch: java.lang.Exception -> L8e
            r0.f223366d = r4     // Catch: java.lang.Exception -> L8e
            r7 = 4
            java.lang.Object r8 = r8.e(r5, r0)     // Catch: java.lang.Exception -> L8e
            r7 = 3
            if (r8 != r1) goto L8b
        L89:
            r7 = 1
            return r1
        L8b:
            kotlin.Unit r8 = kotlin.Unit.f312394a
            return r8
        L8e:
            r8 = move-exception
            r7 = 7
            timber.log.b$b r9 = timber.log.b.f381052a
            r7 = 5
            r9.e(r8)
            com.planner5d.library.services.exceptions.ErrorMessageException r9 = new com.planner5d.library.services.exceptions.ErrorMessageException
            int r10 = com.planner5d.library.f.s.Ma
            java.lang.String r8 = r8.getMessage()
            java.lang.String[] r8 = new java.lang.String[]{r8}
            r9.<init>(r10, r8)
            throw r9
        */
        throw new UnsupportedOperationException("Method not decompiled: com.planner5d.library.modules.user.user.t.h0(java.lang.String, kotlin.coroutines.d):java.lang.Object");
    }

    @NotNull
    public final Observable<Void> i0() {
        Observable<Void> observableD = com.planner5d.library.services.rx.i.d(new Observable.OnSubscribe() { // from class: com.planner5d.library.modules.user.user.p
            @Override // rx.functions.Action1
            public final void call(Object obj) {
                t.j0(this.f223245a, (Subscriber) obj);
            }
        });
        Intrinsics.checkNotNullExpressionValue(observableD, "background(...)");
        return observableD;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0018  */
    @Nullable
    public final Object o0(@NotNull String str, @NotNull kotlin.coroutines.d<? super Integer> dVar) throws Exception {
        n nVar;
        okhttp3.f0 f0VarRaw;
        if (dVar instanceof n) {
            nVar = (n) dVar;
            int i10 = nVar.f223372c;
            if ((i10 & Integer.MIN_VALUE) != 0) {
                nVar.f223372c = i10 - Integer.MIN_VALUE;
            } else {
                nVar = new n(dVar);
            }
        } else {
            nVar = new n(dVar);
        }
        Object objC = nVar.f223370a;
        Object objL = kotlin.coroutines.intrinsics.b.l();
        int i11 = nVar.f223372c;
        try {
            if (i11 == 0) {
                ResultKt.m(objC);
                final JSONObject jSONObject = new JSONObject();
                jSONObject.put(com.planner5d.library.services.r.email.f224891a, str);
                jSONObject.put(com.planner5d.library.services.r.action.f224891a, com.planner5d.library.services.r.loginLink.f224891a);
                com.planner5d.library.services.utility.b bVar = com.planner5d.library.services.utility.b.f225044a;
                com.planner5d.library.api.b bVar2 = this.f223283a;
                Function1<? super com.planner5d.library.api.b, com.planner5d.library.api.c> function1 = new Function1() { // from class: com.planner5d.library.modules.user.user.o
                    @Override // kotlin.jvm.functions.Function1
                    public final Object invoke(Object obj) {
                        return t.p0(this.f223230a, jSONObject, (com.planner5d.library.api.b) obj);
                    }
                };
                nVar.f223372c = 1;
                objC = bVar.c(bVar2, function1, nVar);
                if (objC == objL) {
                    return objL;
                }
            } else {
                if (i11 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.m(objC);
            }
            com.planner5d.library.api.c cVar = (com.planner5d.library.api.c) objC;
            if (cVar.h()) {
                throw new Exception("Other error: Forbidden");
            }
            return kotlin.coroutines.jvm.internal.b.f(cVar.a().getInt(com.planner5d.library.services.r.id.f224891a));
        } catch (com.planner5d.library.api.e e10) {
            Response<com.planner5d.library.api.c> responseB = e10.b();
            if (responseB == null || (f0VarRaw = responseB.raw()) == null || pe.d.b.TooManyRequests.l() != f0VarRaw.E()) {
                throw e10;
            }
            throw new ErrorMessageException(com.planner5d.library.f.s.Uv, new String[0]);
        }
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0016  */
    @Nullable
    public final Object q0(@NotNull String str, @NotNull kotlin.coroutines.d<? super Unit> dVar) throws Exception {
        o oVar;
        if (dVar instanceof o) {
            oVar = (o) dVar;
            int i10 = oVar.f223375c;
            if ((i10 & Integer.MIN_VALUE) != 0) {
                oVar.f223375c = i10 - Integer.MIN_VALUE;
            } else {
                oVar = new o(dVar);
            }
        } else {
            oVar = new o(dVar);
        }
        Object objC = oVar.f223373a;
        Object objL = kotlin.coroutines.intrinsics.b.l();
        int i11 = oVar.f223375c;
        try {
            if (i11 == 0) {
                ResultKt.m(objC);
                final JSONObject jSONObject = new JSONObject();
                jSONObject.put(com.planner5d.library.services.r.action.f224891a, "forgot");
                jSONObject.put(com.planner5d.library.services.r.email.f224891a, str);
                com.planner5d.library.services.utility.b bVar = com.planner5d.library.services.utility.b.f225044a;
                com.planner5d.library.api.b bVar2 = this.f223283a;
                Function1<? super com.planner5d.library.api.b, com.planner5d.library.api.c> function1 = new Function1() { // from class: com.planner5d.library.modules.user.user.n
                    @Override // kotlin.jvm.functions.Function1
                    public final Object invoke(Object obj) {
                        return t.r0(this.f223210a, jSONObject, (com.planner5d.library.api.b) obj);
                    }
                };
                oVar.f223375c = 1;
                objC = bVar.c(bVar2, function1, oVar);
                if (objC == objL) {
                    return objL;
                }
            } else {
                if (i11 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.m(objC);
            }
            return Unit.f312394a;
        } catch (Exception e10) {
            timber.log.b.f381052a.e(e10);
            throw e10;
        }
    }

    @NotNull
    public final Observable<id.a> s0(@Nullable final id.a aVar, @Nullable final String str, @Nullable final String str2, @Nullable final String str3, @Nullable final String str4) {
        Observable<id.a> observableD = com.planner5d.library.services.rx.i.d(new Observable.OnSubscribe() { // from class: com.planner5d.library.modules.user.user.f
            @Override // rx.functions.Action1
            public final void call(Object obj) {
                t.t0(str, str3, str4, this, aVar, str2, (Subscriber) obj);
            }
        });
        Intrinsics.checkNotNullExpressionValue(observableD, "background(...)");
        return observableD;
    }

    @androidx.annotation.m1
    public final void w0(@Nullable id.a aVar, boolean z10, boolean z11) {
        this.f223301s.get().L(aVar != null ? aVar.f287075a : 0L);
        x0(aVar);
        try {
            this.f223291i.get().o(aVar);
        } catch (JSONException e10) {
            timber.log.b.f381052a.e(e10);
        }
        if (!z11) {
            this.f223303u.a();
        } else if (aVar != null) {
            this.f223292j.L0(aVar.f287075a, !z10);
        }
        if (aVar == null) {
            this.f223293k.o();
            this.f223292j.K();
        } else {
            this.f223294l.get().u();
        }
        k5.S().subscribe((Subscriber<? super Void>) new com.planner5d.library.services.rx.e());
        com.planner5d.library.services.utility.c0.t(com.planner5d.library.services.utility.c0.f225068a, null, true, new p(aVar, null), 1, null);
        this.f223296n.get().e(true);
        this.f223303u.b(aVar);
        this.f223295m.get().v(aVar != null ? Long.valueOf(aVar.f287075a) : null);
        com.planner5d.library.services.m0.f224436i.t();
        fd.k kVar = this.D;
        this.D = null;
        if (kVar != null) {
            com.planner5d.library.services.b0.f223959b.o(new com.planner5d.library.services.b0.a(kVar, null, com.planner5d.library.model.manager.config.purchaseplacement.b.a.profile, y3.c.profile));
        }
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0017  */
    /* JADX WARN: Code restructure failed: missing block: B:25:0x00d8, code lost:
    
        if (r9 == r1) goto L26;
     */
    @org.jetbrains.annotations.Nullable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object y0(@org.jetbrains.annotations.NotNull java.lang.String r7, @org.jetbrains.annotations.NotNull java.lang.String r8, @org.jetbrains.annotations.NotNull kotlin.coroutines.d<? super id.a> r9) throws java.lang.Exception {
        /*
            Method dump skipped, instruction units count: 224
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.planner5d.library.modules.user.user.t.y0(java.lang.String, java.lang.String, kotlin.coroutines.d):java.lang.Object");
    }

    @Nullable
    public final Object z0(@NotNull Function1<? super kotlin.coroutines.d<? super com.planner5d.library.api.c>, ? extends Object> function1, @NotNull kotlin.coroutines.d<? super id.d> dVar) throws Exception {
        return U(new s(function1, null), dVar);
    }
}
