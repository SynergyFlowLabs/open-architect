package com.planner5d.library.modules.user.user;

import com.planner5d.library.model.manager.statistics.events.k3;
import com.planner5d.library.model.manager.statistics.events.p3;
import com.planner5d.library.modules.user.auth.SocialAuthType;
import com.planner5d.library.services.exceptions.ErrorMessageException;
import com.planner5d.library.services.utility.c2;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlinx.coroutines.f2;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import org.json.JSONException;
import org.json.JSONObject;
import rx.Observable;
import rx.functions.Func1;

/* JADX INFO: loaded from: classes9.dex */
@androidx.compose.runtime.internal.w0(parameters = 0)
@ij.f
@SourceDebugExtension({"SMAP\nUserRemember.kt\nKotlin\n*S Kotlin\n*F\n+ 1 UserRemember.kt\ncom/planner5d/library/modules/user/user/UserRemember\n+ 2 _Arrays.kt\nkotlin/collections/ArraysKt___ArraysKt\n+ 3 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,210:1\n13409#2:211\n13410#2:213\n13409#2,2:214\n1#3:212\n*S KotlinDebug\n*F\n+ 1 UserRemember.kt\ncom/planner5d/library/modules/user/user/UserRemember\n*L\n83#1:211\n83#1:213\n100#1:214,2\n*E\n"})
public final class y0 {

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public static final int f223543l = 8;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    private final com.planner5d.library.application.b f223544a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NotNull
    private final com.planner5d.library.model.manager.config.p f223545b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @NotNull
    private final com.planner5d.library.application.d f223546c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @NotNull
    private final fg.e<t> f223547d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    @NotNull
    private final com.planner5d.library.modules.user.user.b f223548e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    @NotNull
    private final c2 f223549f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    @NotNull
    private final Object f223550g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    @NotNull
    private final Object f223551h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    @NotNull
    private final a[] f223552i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private boolean f223553j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    @Nullable
    private volatile d1 f223554k;

    public interface a {
        @Nullable
        Object a(@NotNull kotlin.coroutines.d<? super id.c> dVar);

        void b();
    }

    @kotlin.coroutines.jvm.internal.f(c = "com.planner5d.library.modules.user.user.UserRemember", f = "UserRemember.kt", i = {0}, l = {com.planner5d.library.engine.input.f.b.B0}, m = "get", n = {"$this$forEach$iv"}, s = {"L$0"})
    static final class b extends kotlin.coroutines.jvm.internal.d {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        Object f223555a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        int f223556b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        int f223557c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        /* synthetic */ Object f223558d;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        int f223560f;

        b(kotlin.coroutines.d<? super b> dVar) {
            super(dVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            this.f223558d = obj;
            this.f223560f |= Integer.MIN_VALUE;
            return y0.this.e(this);
        }
    }

    @kotlin.coroutines.jvm.internal.f(c = "com.planner5d.library.modules.user.user.UserRemember$getActive$1$1", f = "UserRemember.kt", i = {}, l = {108}, m = "invokeSuspend", n = {}, s = {})
    static final class c extends kotlin.coroutines.jvm.internal.o implements Function2<kotlinx.coroutines.s0, kotlin.coroutines.d<? super String>, Object> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        int f223561a;

        c(kotlin.coroutines.d<? super c> dVar) {
            super(2, dVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final kotlin.coroutines.d<Unit> create(Object obj, kotlin.coroutines.d<?> dVar) {
            return y0.this.new c(dVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            Object objL = kotlin.coroutines.intrinsics.b.l();
            int i10 = this.f223561a;
            if (i10 != 0) {
                if (i10 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.m(obj);
                return obj;
            }
            ResultKt.m(obj);
            com.planner5d.library.model.manager.config.p pVar = y0.this.f223545b;
            com.planner5d.library.services.r rVar = com.planner5d.library.services.r.userRememberedActive;
            this.f223561a = 1;
            Object objU = pVar.u(rVar, null, this);
            return objU == objL ? objL : objU;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(kotlinx.coroutines.s0 s0Var, kotlin.coroutines.d<? super String> dVar) {
            return ((c) create(s0Var, dVar)).invokeSuspend(Unit.f312394a);
        }
    }

    @kotlin.coroutines.jvm.internal.f(c = "com.planner5d.library.modules.user.user.UserRemember$isRememberComplete$1", f = "UserRemember.kt", i = {}, l = {76}, m = "invokeSuspend", n = {}, s = {})
    static final class d extends kotlin.coroutines.jvm.internal.o implements Function2<kotlinx.coroutines.s0, kotlin.coroutines.d<? super Boolean>, Object> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        int f223563a;

        d(kotlin.coroutines.d<? super d> dVar) {
            super(2, dVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final kotlin.coroutines.d<Unit> create(Object obj, kotlin.coroutines.d<?> dVar) {
            return y0.this.new d(dVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            Object objL = kotlin.coroutines.intrinsics.b.l();
            int i10 = this.f223563a;
            if (i10 != 0) {
                if (i10 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.m(obj);
                return obj;
            }
            ResultKt.m(obj);
            com.planner5d.library.model.manager.config.p pVar = y0.this.f223545b;
            com.planner5d.library.services.r rVar = com.planner5d.library.services.r.userRememberedComplete;
            this.f223563a = 1;
            Object objG = pVar.G(rVar, false, this);
            return objG == objL ? objL : objG;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(kotlinx.coroutines.s0 s0Var, kotlin.coroutines.d<? super Boolean> dVar) {
            return ((d) create(s0Var, dVar)).invokeSuspend(Unit.f312394a);
        }
    }

    @kotlin.coroutines.jvm.internal.f(c = "com.planner5d.library.modules.user.user.UserRemember$rememberBackground$1", f = "UserRemember.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
    static final class e extends kotlin.coroutines.jvm.internal.o implements Function2<kotlinx.coroutines.s0, kotlin.coroutines.d<? super Unit>, Object> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        int f223565a;

        e(kotlin.coroutines.d<? super e> dVar) {
            super(2, dVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final kotlin.coroutines.d<Unit> create(Object obj, kotlin.coroutines.d<?> dVar) {
            return y0.this.new e(dVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) throws JSONException {
            kotlin.coroutines.intrinsics.b.l();
            if (this.f223565a != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.m(obj);
            if (!y0.this.i()) {
                y0.this.t();
            }
            return Unit.f312394a;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(kotlinx.coroutines.s0 s0Var, kotlin.coroutines.d<? super Unit> dVar) {
            return ((e) create(s0Var, dVar)).invokeSuspend(Unit.f312394a);
        }
    }

    @kotlin.coroutines.jvm.internal.f(c = "com.planner5d.library.modules.user.user.UserRemember$rememberRetryBackground$1", f = "UserRemember.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
    static final class f extends kotlin.coroutines.jvm.internal.o implements Function2<kotlinx.coroutines.s0, kotlin.coroutines.d<? super Unit>, Object> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        int f223567a;

        f(kotlin.coroutines.d<? super f> dVar) {
            super(2, dVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final kotlin.coroutines.d<Unit> create(Object obj, kotlin.coroutines.d<?> dVar) {
            return y0.this.new f(dVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            kotlin.coroutines.intrinsics.b.l();
            if (this.f223567a != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.m(obj);
            if (!y0.this.i()) {
                y0.this.l();
            }
            return Unit.f312394a;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(kotlinx.coroutines.s0 s0Var, kotlin.coroutines.d<? super Unit> dVar) {
            return ((f) create(s0Var, dVar)).invokeSuspend(Unit.f312394a);
        }
    }

    @kotlin.coroutines.jvm.internal.f(c = "com.planner5d.library.modules.user.user.UserRemember$setActive$1$1", f = "UserRemember.kt", i = {}, l = {com.planner5d.library.engine.input.f.b.f160703k1}, m = "invokeSuspend", n = {}, s = {})
    static final class g extends kotlin.coroutines.jvm.internal.o implements Function2<kotlinx.coroutines.s0, kotlin.coroutines.d<? super Unit>, Object> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        int f223569a;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ id.a f223571c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        g(id.a aVar, kotlin.coroutines.d<? super g> dVar) {
            super(2, dVar);
            this.f223571c = aVar;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final kotlin.coroutines.d<Unit> create(Object obj, kotlin.coroutines.d<?> dVar) {
            return y0.this.new g(this.f223571c, dVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            Object objL = kotlin.coroutines.intrinsics.b.l();
            int i10 = this.f223569a;
            if (i10 == 0) {
                ResultKt.m(obj);
                com.planner5d.library.model.manager.config.p pVar = y0.this.f223545b;
                com.planner5d.library.services.r rVar = com.planner5d.library.services.r.userRememberedActive;
                String string = new id.c(this.f223571c).toString();
                this.f223569a = 1;
                if (pVar.d(rVar, string, this) == objL) {
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

    @kotlin.coroutines.jvm.internal.f(c = "com.planner5d.library.modules.user.user.UserRemember$setActive$2", f = "UserRemember.kt", i = {}, l = {com.planner5d.library.engine.input.f.b.f160718p1}, m = "invokeSuspend", n = {}, s = {})
    static final class h extends kotlin.coroutines.jvm.internal.o implements Function2<kotlinx.coroutines.s0, kotlin.coroutines.d<? super Unit>, Object> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        int f223572a;

        h(kotlin.coroutines.d<? super h> dVar) {
            super(2, dVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final kotlin.coroutines.d<Unit> create(Object obj, kotlin.coroutines.d<?> dVar) {
            return y0.this.new h(dVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            Object objL = kotlin.coroutines.intrinsics.b.l();
            int i10 = this.f223572a;
            if (i10 == 0) {
                ResultKt.m(obj);
                com.planner5d.library.model.manager.config.p pVar = y0.this.f223545b;
                com.planner5d.library.services.r rVar = com.planner5d.library.services.r.userRememberedComplete;
                this.f223572a = 1;
                if (pVar.L(rVar, true, this) == objL) {
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
            return ((h) create(s0Var, dVar)).invokeSuspend(Unit.f312394a);
        }
    }

    @kotlin.coroutines.jvm.internal.f(c = "com.planner5d.library.modules.user.user.UserRemember$waitForRemember$1", f = "UserRemember.kt", i = {}, l = {71}, m = "invokeSuspend", n = {}, s = {})
    static final class i extends kotlin.coroutines.jvm.internal.o implements Function2<kotlinx.coroutines.s0, kotlin.coroutines.d<? super id.c>, Object> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        int f223574a;

        i(kotlin.coroutines.d<? super i> dVar) {
            super(2, dVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final kotlin.coroutines.d<Unit> create(Object obj, kotlin.coroutines.d<?> dVar) {
            return y0.this.new i(dVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) throws JSONException {
            Object objL = kotlin.coroutines.intrinsics.b.l();
            int i10 = this.f223574a;
            if (i10 == 0) {
                ResultKt.m(obj);
                if (y0.this.i()) {
                    return null;
                }
                y0 y0Var = y0.this;
                this.f223574a = 1;
                obj = y0Var.e(this);
                if (obj == objL) {
                    return objL;
                }
            } else {
                if (i10 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.m(obj);
            }
            return (id.c) obj;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(kotlinx.coroutines.s0 s0Var, kotlin.coroutines.d<? super id.c> dVar) {
            return ((i) create(s0Var, dVar)).invokeSuspend(Unit.f312394a);
        }
    }

    @ij.a
    public y0(@NotNull com.planner5d.library.application.b application, @NotNull com.planner5d.library.model.manager.config.p preferences, @NotNull z0 rememberAdapterBackups, @NotNull b1 rememberAdapterPayments, @NotNull com.planner5d.library.application.d configuration, @NotNull fg.e<t> userAuthorization, @NotNull com.planner5d.library.modules.user.user.b actionAfterLogInStandard, @NotNull c2 networkStateUtility) {
        Intrinsics.checkNotNullParameter(application, "application");
        Intrinsics.checkNotNullParameter(preferences, "preferences");
        Intrinsics.checkNotNullParameter(rememberAdapterBackups, "rememberAdapterBackups");
        Intrinsics.checkNotNullParameter(rememberAdapterPayments, "rememberAdapterPayments");
        Intrinsics.checkNotNullParameter(configuration, "configuration");
        Intrinsics.checkNotNullParameter(userAuthorization, "userAuthorization");
        Intrinsics.checkNotNullParameter(actionAfterLogInStandard, "actionAfterLogInStandard");
        Intrinsics.checkNotNullParameter(networkStateUtility, "networkStateUtility");
        this.f223544a = application;
        this.f223545b = preferences;
        this.f223546c = configuration;
        this.f223547d = userAuthorization;
        this.f223548e = actionAfterLogInStandard;
        this.f223549f = networkStateUtility;
        this.f223550g = new Object();
        this.f223551h = new Object();
        int i10 = 1 >> 2;
        this.f223552i = new a[]{rememberAdapterBackups, rememberAdapterPayments};
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Code duplicated, block: B:16:0x0051  */
    /* JADX WARN: Code duplicated, block: B:18:0x0062 A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:22:0x0070  */
    /* JADX WARN: Code duplicated, block: B:25:0x0077 A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:26:0x0078  */
    /* JADX WARN: Code duplicated, block: B:7:0x0017  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:17:0x0060 -> B:19:0x0063). Please report as a decompilation issue!!! */
    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions stack size limit reached
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    @androidx.annotation.m1
    public final java.lang.Object e(kotlin.coroutines.d<? super id.c> r9) throws org.json.JSONException {
        /*
            r8 = this;
            r7 = 1
            boolean r0 = r9 instanceof com.planner5d.library.modules.user.user.y0.b
            if (r0 == 0) goto L17
            r0 = r9
            r7 = 1
            com.planner5d.library.modules.user.user.y0$b r0 = (com.planner5d.library.modules.user.user.y0.b) r0
            int r1 = r0.f223560f
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            r7 = 0
            if (r3 == 0) goto L17
            int r1 = r1 - r2
            r0.f223560f = r1
            r7 = 7
            goto L1c
        L17:
            com.planner5d.library.modules.user.user.y0$b r0 = new com.planner5d.library.modules.user.user.y0$b
            r0.<init>(r9)
        L1c:
            java.lang.Object r9 = r0.f223558d
            java.lang.Object r1 = kotlin.coroutines.intrinsics.b.l()
            int r2 = r0.f223560f
            r3 = 0
            r4 = 7
            r4 = 1
            if (r2 == 0) goto L44
            if (r2 != r4) goto L39
            int r8 = r0.f223557c
            r7 = 5
            int r2 = r0.f223556b
            java.lang.Object r5 = r0.f223555a
            com.planner5d.library.modules.user.user.y0$a[] r5 = (com.planner5d.library.modules.user.user.y0.a[]) r5
            kotlin.ResultKt.m(r9)
            r7 = 2
            goto L63
        L39:
            java.lang.IllegalStateException r8 = new java.lang.IllegalStateException
            r7 = 0
            java.lang.String r9 = "/lohnbecurr li/oik /o//oete  umb/vwn  trs/c/eioftea"
            java.lang.String r9 = "call to 'resume' before 'invoke' with coroutine"
            r8.<init>(r9)
            throw r8
        L44:
            kotlin.ResultKt.m(r9)
            r7 = 6
            com.planner5d.library.modules.user.user.y0$a[] r8 = r8.f223552i
            int r9 = r8.length
            r2 = 0
            r5 = r8
            r8 = r9
            r8 = r9
        L4f:
            if (r2 >= r8) goto L7c
            r9 = r5[r2]
            r7 = 0
            r0.f223555a = r5
            r0.f223556b = r2
            r0.f223557c = r8
            r0.f223560f = r4
            java.lang.Object r9 = r9.a(r0)
            if (r9 != r1) goto L63
            return r1
        L63:
            r6 = r9
            r6 = r9
            r7 = 1
            id.c r6 = (id.c) r6
            r7 = 6
            boolean r6 = r6.e()
            if (r6 != 0) goto L70
            goto L72
        L70:
            r9 = r3
            r9 = r3
        L72:
            id.c r9 = (id.c) r9
            r7 = 0
            if (r9 == 0) goto L78
            return r9
        L78:
            r7 = 0
            int r2 = r2 + r4
            r7 = 5
            goto L4f
        L7c:
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: com.planner5d.library.modules.user.user.y0.e(kotlin.coroutines.d):java.lang.Object");
    }

    @fj.g
    private final d1 g() {
        d1 d1Var;
        d1 d1Var2 = this.f223554k;
        if (d1Var2 != null) {
            return d1Var2;
        }
        synchronized (this.f223551h) {
            try {
                d1Var = this.f223554k;
                if (d1Var == null) {
                    d1Var = new d1(this, this.f223549f);
                    this.f223554k = d1Var;
                }
                Unit unit = Unit.f312394a;
            } catch (Throwable th2) {
                throw th2;
            }
        }
        return d1Var;
    }

    private final boolean j() {
        return this.f223553j;
    }

    private final id.a p(id.c cVar) throws Throwable {
        Observable map;
        if (cVar == null || cVar.e()) {
            throw new jd.a();
        }
        if (!this.f223549f.d(this.f223544a)) {
            throw new ErrorMessageException(com.planner5d.library.f.s.I9, new String[0]);
        }
        SocialAuthType socialAuthTypeC = cVar.c();
        if (socialAuthTypeC == null) {
            map = this.f223547d.get().e0(cVar.d());
        } else {
            Observable<id.d> observableD0 = this.f223547d.get().d0(socialAuthTypeC, cVar.b(), cVar.d(), null);
            final Function1 function1 = new Function1() { // from class: com.planner5d.library.modules.user.user.w0
                @Override // kotlin.jvm.functions.Function1
                public final Object invoke(Object obj) {
                    return y0.q((id.d) obj);
                }
            };
            map = observableD0.map(new Func1() { // from class: com.planner5d.library.modules.user.user.x0
                @Override // rx.functions.Func1
                public final Object call(Object obj) {
                    return y0.r(function1, obj);
                }
            });
        }
        Object objK = com.planner5d.library.services.rx.i.k(map);
        Intrinsics.checkNotNullExpressionValue(objK, "toResultOrThrow(...)");
        return (id.a) objK;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final id.a q(id.d dVar) {
        return dVar.f287101a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final id.a r(Function1 function1, Object obj) {
        return (id.a) function1.invoke(obj);
    }

    @androidx.annotation.m1
    @NotNull
    public final id.c f() throws JSONException {
        id.c cVar;
        synchronized (this.f223550g) {
            try {
                String str = (String) com.planner5d.library.services.utility.c0.t(com.planner5d.library.services.utility.c0.f225068a, null, false, new c(null), 3, null);
                cVar = str != null ? new id.c(new JSONObject(str)) : new id.c((id.a) null);
            } catch (Throwable th2) {
                throw th2;
            }
        }
        return cVar;
    }

    @androidx.annotation.m1
    @NotNull
    public final id.c h() throws JSONException {
        return f();
    }

    @androidx.annotation.m1
    public final boolean i() {
        if (!this.f223546c.t() && !((Boolean) com.planner5d.library.services.utility.c0.t(com.planner5d.library.services.utility.c0.f225068a, null, true, new d(null), 1, null)).booleanValue()) {
            return false;
        }
        return true;
    }

    @androidx.annotation.m1
    public final void k() {
        this.f223547d.get().E0();
    }

    @androidx.annotation.m1
    public final void l() {
        id.c cVarT;
        d1 d1VarG;
        if (this.f223546c.t() || j()) {
            return;
        }
        if (i()) {
            this.f223547d.get().E0();
            return;
        }
        try {
            cVarT = t();
        } catch (Throwable th2) {
            timber.log.b.f381052a.e(th2);
            cVarT = null;
        }
        try {
            if (!this.f223547d.get().b()) {
                p(cVarT);
                this.f223548e.a();
                com.planner5d.library.model.manager.statistics.events.n.f217157b.L1(k3.a.sign_in, p3.b.success, null, k3.c.anonymous, true, true);
            }
        } catch (jd.a unused) {
            k();
        } catch (jd.b unused2) {
            k();
        } catch (jd.c unused3) {
            k();
        } catch (Throwable th3) {
            timber.log.b.f381052a.e(th3);
        }
        if (i() || this.f223549f.d(this.f223544a) || (d1VarG = g()) == null) {
            return;
        }
        d1VarG.a(this.f223544a);
    }

    public final void m() {
        kotlinx.coroutines.k.f(f2.f314023a, com.planner5d.library.services.utility.s.f229729a.h(), null, new e(null), 2, null);
    }

    public final void n() {
        kotlinx.coroutines.k.f(f2.f314023a, com.planner5d.library.services.utility.s.f229729a.h(), null, new f(null), 2, null);
    }

    @androidx.annotation.m1
    public final void o(@Nullable id.a aVar) throws JSONException {
        com.planner5d.library.services.utility.c0 c0Var;
        synchronized (this.f223550g) {
            try {
                c0Var = com.planner5d.library.services.utility.c0.f225068a;
                boolean z10 = false & false;
                com.planner5d.library.services.utility.c0.t(c0Var, null, true, new g(aVar, null), 1, null);
                Unit unit = Unit.f312394a;
            } catch (Throwable th2) {
                throw th2;
            }
        }
        if (aVar != null) {
            com.planner5d.library.services.utility.c0.t(c0Var, null, true, new h(null), 1, null);
        }
        for (a aVar2 : this.f223552i) {
            aVar2.b();
        }
    }

    public final void s() {
        d1 d1Var = this.f223554k;
        if (d1Var != null) {
            d1Var.b(this.f223544a);
        }
    }

    @androidx.annotation.m1
    @Nullable
    public final id.c t() throws JSONException {
        return (id.c) com.planner5d.library.services.utility.c0.t(com.planner5d.library.services.utility.c0.f225068a, com.planner5d.library.services.utility.s.f229729a.d(), false, new i(null), 2, null);
    }
}
