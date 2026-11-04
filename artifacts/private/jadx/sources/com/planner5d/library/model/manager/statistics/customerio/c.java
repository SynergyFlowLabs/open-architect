package com.planner5d.library.model.manager.statistics.customerio;

import android.app.Activity;
import android.app.Application;
import android.content.Intent;
import android.icu.util.TimeZone;
import com.planner5d.library.model.manager.statistics.g0;
import com.planner5d.library.model.manager.statistics.m;
import com.planner5d.library.modules.user.user.u0;
import com.planner5d.library.modules.user.user.w;
import com.planner5d.library.services.e0;
import com.planner5d.library.services.utility.f1;
import com.planner5d.library.services.utility.h3;
import com.planner5d.library.services.utility.t;
import io.customer.messaginginapp.MessagingInAppModuleConfig;
import io.customer.messaginginapp.ModuleMessagingInApp;
import io.customer.messagingpush.e;
import io.customer.sdk.g;
import io.customer.sdk.l;
import java.util.Map;
import kotlin.Pair;
import kotlin.Result;
import kotlin.ResultKt;
import kotlin.TuplesKt;
import kotlin.Unit;
import kotlin.a0;
import kotlin.collections.MapsKt;
import kotlin.coroutines.d;
import kotlin.coroutines.jvm.internal.f;
import kotlin.coroutines.jvm.internal.o;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlinx.coroutines.flow.b1;
import kotlinx.coroutines.flow.j;
import kotlinx.coroutines.flow.k0;
import kotlinx.coroutines.flow.o0;
import kotlinx.coroutines.flow.z0;
import kotlinx.coroutines.k;
import kotlinx.coroutines.s0;
import kotlinx.serialization.json.internal.AbstractJsonLexerKt;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes9.dex */
@SourceDebugExtension({"SMAP\nStatisticsBackendCustomerIo.kt\nKotlin\n*S Kotlin\n*F\n+ 1 StatisticsBackendCustomerIo.kt\ncom/planner5d/library/model/manager/statistics/customerio/StatisticsBackendCustomerIo\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,173:1\n1#2:174\n*E\n"})
public final class c implements m {

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    @NotNull
    public static final a f207484l = new a(null);

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    @NotNull
    private static final jh.b.C2241b f207485m = jh.b.C2241b.f307439c;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    private final Application f207486a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NotNull
    private final w f207487b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @NotNull
    private final u0 f207488c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @NotNull
    private final e0 f207489d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    @NotNull
    private final f1 f207490e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    @NotNull
    private final t f207491f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    @NotNull
    private final String f207492g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    @NotNull
    private final String f207493h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    @NotNull
    private final Object f207494i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    @NotNull
    private final k0<Boolean> f207495j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    @Nullable
    private Map<String, ? extends Object> f207496k;

    public static final class a {
        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private a() {
        }
    }

    @f(c = "com.planner5d.library.model.manager.statistics.customerio.StatisticsBackendCustomerIo$subscribeUserChanges$1", f = "StatisticsBackendCustomerIo.kt", i = {}, l = {80}, m = "invokeSuspend", n = {}, s = {})
    static final class b extends o implements Function2<s0, d<? super Unit>, Object> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        int f207497a;

        static final class a<T> implements j {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            final /* synthetic */ c f207499a;

            a(c cVar) {
                this.f207499a = cVar;
            }

            @Override // kotlinx.coroutines.flow.j
            /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
            public final Object emit(id.a aVar, d<? super Unit> dVar) {
                this.f207499a.u();
                return Unit.f312394a;
            }
        }

        b(d<? super b> dVar) {
            super(2, dVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final d<Unit> create(Object obj, d<?> dVar) {
            return c.this.new b(dVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            Object objL = kotlin.coroutines.intrinsics.b.l();
            int i10 = this.f207497a;
            if (i10 == 0) {
                ResultKt.m(obj);
                o0<id.a> o0VarD = c.this.f207487b.d();
                a aVar = new a(c.this);
                this.f207497a = 1;
                if (o0VarD.collect(aVar, this) == objL) {
                    return objL;
                }
            } else {
                if (i10 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.m(obj);
            }
            throw new a0();
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(s0 s0Var, d<? super Unit> dVar) {
            return ((b) create(s0Var, dVar)).invokeSuspend(Unit.f312394a);
        }
    }

    public c(@NotNull Application application, @NotNull w userAuthorizationService, @NotNull u0 userPurchaseService, @NotNull e0 regionProvider, @NotNull f1 coroutineScope, @NotNull t coroutineDispatchers) {
        Intrinsics.checkNotNullParameter(application, "application");
        Intrinsics.checkNotNullParameter(userAuthorizationService, "userAuthorizationService");
        Intrinsics.checkNotNullParameter(userPurchaseService, "userPurchaseService");
        Intrinsics.checkNotNullParameter(regionProvider, "regionProvider");
        Intrinsics.checkNotNullParameter(coroutineScope, "coroutineScope");
        Intrinsics.checkNotNullParameter(coroutineDispatchers, "coroutineDispatchers");
        this.f207486a = application;
        this.f207487b = userAuthorizationService;
        this.f207488c = userPurchaseService;
        this.f207489d = regionProvider;
        this.f207490e = coroutineScope;
        this.f207491f = coroutineDispatchers;
        String string = application.getString(com.planner5d.library.model.manager.statistics.customerio.b.q.G4);
        Intrinsics.checkNotNullExpressionValue(string, "getString(...)");
        this.f207492g = string;
        String string2 = application.getString(com.planner5d.library.model.manager.statistics.customerio.b.q.H4);
        Intrinsics.checkNotNullExpressionValue(string2, "getString(...)");
        this.f207493h = string2;
        this.f207494i = new Object();
        this.f207495j = b1.a(Boolean.FALSE);
    }

    private final ModuleMessagingInApp o() {
        return new ModuleMessagingInApp(new MessagingInAppModuleConfig.Builder(this.f207493h, f207485m).build());
    }

    private final String r() {
        return g.f288542m.d().k();
    }

    private final Map<String, String> s() {
        Pair pair = TuplesKt.to("os", h3.w());
        Pair pair2 = TuplesKt.to("application", h3.h(this.f207486a));
        Pair pair3 = TuplesKt.to("language", h3.g(this.f207486a));
        Pair pair4 = TuplesKt.to("locale", h3.q());
        String strA = this.f207489d.a();
        if (strA == null) {
            strA = h3.o();
        }
        return MapsKt.mapOf(pair, pair2, pair3, pair4, TuplesKt.to("country", strA));
    }

    private final Map<String, Object> t(String str, boolean z10) {
        if (str == null) {
            str = AbstractJsonLexerKt.NULL;
        }
        return MapsKt.mapOf(TuplesKt.to("email", str), TuplesKt.to("paid", Boolean.valueOf(z10)), TuplesKt.to("platform_android", s()), TuplesKt.to("timezone", TimeZone.getDefault().getID()));
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Code restructure failed: missing block: B:23:0x0062, code lost:
    
        if (r3 != false) goto L24;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void u() {
        /*
            r7 = this;
            kotlinx.coroutines.flow.k0<java.lang.Boolean> r0 = r7.f207495j
            java.lang.Object r0 = r0.getValue()
            java.lang.Boolean r0 = (java.lang.Boolean) r0
            boolean r0 = r0.booleanValue()
            r6 = 1
            if (r0 != 0) goto L10
            goto L64
        L10:
            com.planner5d.library.modules.user.user.w r0 = r7.f207487b
            r6 = 5
            id.a r0 = r0.a()
            r6 = 5
            r1 = 0
            if (r0 == 0) goto L26
            r6 = 6
            long r2 = r0.f287075a
            r4 = 0
            int r2 = (r2 > r4 ? 1 : (r2 == r4 ? 0 : -1))
            if (r2 != 0) goto L26
            r6 = 1
            r1 = 1
        L26:
            if (r1 != 0) goto L29
            goto L2a
        L29:
            r0 = 0
        L2a:
            if (r0 != 0) goto L2d
            goto L64
        L2d:
            long r1 = r0.f287075a
            java.lang.String r1 = java.lang.String.valueOf(r1)
            java.lang.String r0 = r0.f287079e
            r6 = 6
            com.planner5d.library.modules.user.user.u0 r2 = r7.f207488c
            r6 = 7
            boolean r2 = r2.j()
            r6 = 7
            java.util.Map r0 = r7.t(r0, r2)
            r6 = 5
            java.lang.String r2 = r7.r()
            r6 = 6
            boolean r2 = kotlin.jvm.internal.Intrinsics.areEqual(r1, r2)
            if (r2 != 0) goto L54
            com.planner5d.library.model.manager.push.f r2 = com.planner5d.library.model.manager.push.f.f193303a
            r2.c()
            goto L66
        L54:
            r6 = 1
            java.lang.Object r2 = r7.f207494i
            r6 = 0
            monitor-enter(r2)
            java.util.Map<java.lang.String, ? extends java.lang.Object> r3 = r7.f207496k     // Catch: java.lang.Throwable -> L7f
            r6 = 6
            boolean r3 = kotlin.jvm.internal.Intrinsics.areEqual(r3, r0)     // Catch: java.lang.Throwable -> L7f
            r6 = 2
            monitor-exit(r2)
            if (r3 == 0) goto L66
        L64:
            r6 = 5
            return
        L66:
            java.lang.Object r2 = r7.f207494i
            r6 = 4
            monitor-enter(r2)
            r7.f207496k = r0     // Catch: java.lang.Throwable -> L7b
            kotlin.Unit r7 = kotlin.Unit.f312394a     // Catch: java.lang.Throwable -> L7b
            monitor-exit(r2)
            io.customer.sdk.g$a r7 = io.customer.sdk.g.f288542m
            io.customer.sdk.g r7 = r7.d()
            r6 = 7
            r7.o(r1, r0)
            r6 = 1
            return
        L7b:
            r7 = move-exception
            monitor-exit(r2)
            r6 = 3
            throw r7
        L7f:
            r7 = move-exception
            monitor-exit(r2)
            r6 = 0
            throw r7
        */
        throw new UnsupportedOperationException("Method not decompiled: com.planner5d.library.model.manager.statistics.customerio.c.u():void");
    }

    /* JADX WARN: Multi-variable type inference failed */
    private final void v() {
        if (isEnabled()) {
            io.customer.sdk.j jVar = new io.customer.sdk.j(this.f207486a, this.f207492g);
            jVar.o(o());
            int i10 = 6 >> 0;
            jVar.o(new e(null, 1, 0 == true ? 1 : 0));
            jVar.A(f207485m);
            g.f288542m.c(jVar.t());
            this.f207495j.setValue(Boolean.TRUE);
            u();
            x();
        }
    }

    private final void x() {
        k.f(this.f207490e, this.f207491f.h(), null, new b(null), 2, null);
    }

    @Override // com.planner5d.library.model.manager.statistics.m
    public void a() {
    }

    @Override // com.planner5d.library.model.manager.statistics.m
    public void b(@NotNull g0 user) {
        Intrinsics.checkNotNullParameter(user, "user");
        id.a aVarA = this.f207487b.a();
        if (aVarA != null) {
            long j10 = aVarA.f287075a;
            Long lA = user.a();
            if (lA != null && j10 == lA.longValue()) {
                u();
            }
        }
    }

    @Override // com.planner5d.library.model.manager.statistics.m
    public void c(@Nullable Intent intent) {
    }

    @Override // com.planner5d.library.model.manager.statistics.m
    public void d(@NotNull com.planner5d.library.model.manager.statistics.events.h3 event) {
        Intrinsics.checkNotNullParameter(event, "event");
        if (this.f207495j.getValue().booleanValue()) {
            g.f288542m.d().H(event.b().n(), event.c());
        }
    }

    @Override // com.planner5d.library.model.manager.statistics.m
    public void e(@Nullable Activity activity) {
        synchronized (this.f207494i) {
            try {
                if (this.f207495j.getValue().booleanValue()) {
                    g.f288542m.d().a();
                    this.f207496k = null;
                }
                Unit unit = Unit.f312394a;
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    @Override // com.planner5d.library.model.manager.statistics.m
    public void f(@Nullable Activity activity) {
        synchronized (this.f207494i) {
            try {
                if (!this.f207495j.getValue().booleanValue()) {
                    v();
                }
                Unit unit = Unit.f312394a;
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    @Override // com.planner5d.library.model.manager.statistics.m
    public void g(@Nullable Activity activity, @NotNull com.planner5d.library.model.manager.statistics.j purchase, @NotNull String paymentMethod, @NotNull String placement) {
        Intrinsics.checkNotNullParameter(purchase, "purchase");
        Intrinsics.checkNotNullParameter(paymentMethod, "paymentMethod");
        Intrinsics.checkNotNullParameter(placement, "placement");
        if (purchase.x()) {
            u();
        }
    }

    @Override // com.planner5d.library.model.manager.statistics.m
    public void h(@NotNull String screenName) {
        Intrinsics.checkNotNullParameter(screenName, "screenName");
        if (this.f207495j.getValue().booleanValue()) {
            l.z(g.f288542m.d(), screenName, null, 2, null);
        }
    }

    @Override // com.planner5d.library.model.manager.statistics.m
    public void i(@NotNull Activity activity) {
        Intrinsics.checkNotNullParameter(activity, "activity");
    }

    @Override // com.planner5d.library.model.manager.statistics.m
    public boolean isEnabled() {
        return this.f207492g.length() > 0;
    }

    @Override // com.planner5d.library.model.manager.statistics.m
    public void k(@NotNull Activity activity) {
        Intrinsics.checkNotNullParameter(activity, "activity");
    }

    @Override // com.planner5d.library.model.manager.statistics.m
    public void m() {
    }

    @NotNull
    /* JADX INFO: renamed from: q, reason: merged with bridge method [inline-methods] */
    public Object p() {
        Result.a aVar = Result.Companion;
        return Result.m785constructorimpl(new JSONObject());
    }

    @NotNull
    public final z0<Boolean> w() {
        return this.f207495j;
    }
}
