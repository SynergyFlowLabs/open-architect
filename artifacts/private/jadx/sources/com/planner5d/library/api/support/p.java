package com.planner5d.library.api.support;

import android.app.Application;
import androidx.annotation.m1;
import androidx.lifecycle.d1;
import com.planner5d.library.model.manager.e1;
import com.planner5d.library.services.e0;
import com.planner5d.library.services.m0;
import com.planner5d.library.services.utility.h3;
import com.planner5d.library.services.utility.k1;
import com.planner5d.library.services.utility.p0;
import java.io.IOException;
import java.util.concurrent.Callable;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.jvm.internal.c0;
import kotlin.x;
import okhttp3.d0;
import okhttp3.f0;
import okhttp3.g0;
import okhttp3.u;
import okhttp3.v;
import okhttp3.w;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import org.json.JSONObject;
import rx.Subscriber;

/* JADX INFO: loaded from: classes6.dex */
@SourceDebugExtension({"SMAP\nSessionProcessingInterceptor.kt\nKotlin\n*S Kotlin\n*F\n+ 1 SessionProcessingInterceptor.kt\ncom/planner5d/library/api/support/SessionProcessingInterceptor\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,248:1\n1#2:249\n*E\n"})
public final class p implements w {

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    @NotNull
    public static final String f142412r = "P5D: newSession";

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NotNull
    private final fg.e<com.planner5d.library.modules.user.user.w> f142414b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @NotNull
    private final com.planner5d.library.model.manager.config.p f142415c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @NotNull
    private final p0 f142416d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    @NotNull
    private final fg.e<com.planner5d.library.api.b> f142417e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    @NotNull
    private final Application f142418f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    @NotNull
    private final fg.e<e1> f142419g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    @NotNull
    private final e0 f142420h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    @NotNull
    private final l f142421i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    @NotNull
    private final Object f142422j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private boolean f142423k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    @NotNull
    private final i f142424l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    @Nullable
    private e f142425m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    @NotNull
    private final Object f142426n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    @NotNull
    public static final a f142409o = new a(null);

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    @NotNull
    private static final String f142410p = "P5D";

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    @NotNull
    private static final String f142411q = "newSession";

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    @NotNull
    private static final Pair<String, String> f142413s = new Pair<>(f142410p, f142411q);

    public static final class a {
        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @NotNull
        public final Pair<String, String> a() {
            return p.f142413s;
        }

        private a() {
        }
    }

    static final class b implements d1, c0 {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final /* synthetic */ Function1 f142427a;

        b(Function1 function) {
            Intrinsics.checkNotNullParameter(function, "function");
            this.f142427a = function;
        }

        @Override // kotlin.jvm.internal.c0
        @NotNull
        public final x<?> b() {
            return this.f142427a;
        }

        @Override // androidx.lifecycle.d1
        public final /* synthetic */ void c(Object obj) {
            this.f142427a.invoke(obj);
        }

        public final boolean equals(@Nullable Object obj) {
            if ((obj instanceof d1) && (obj instanceof c0)) {
                return Intrinsics.areEqual(b(), ((c0) obj).b());
            }
            return false;
        }

        public final int hashCode() {
            return b().hashCode();
        }
    }

    @ij.a
    public p(@NotNull fg.e<com.planner5d.library.modules.user.user.w> userAuthorization, @NotNull com.planner5d.library.model.manager.config.p preferences, @NotNull p0 formatter, @NotNull fg.e<com.planner5d.library.api.b> api, @NotNull Application application, @NotNull fg.e<e1> installationManagerService, @NotNull e0 regionProvider, @NotNull l sessionIdStorage) {
        Intrinsics.checkNotNullParameter(userAuthorization, "userAuthorization");
        Intrinsics.checkNotNullParameter(preferences, "preferences");
        Intrinsics.checkNotNullParameter(formatter, "formatter");
        Intrinsics.checkNotNullParameter(api, "api");
        Intrinsics.checkNotNullParameter(application, "application");
        Intrinsics.checkNotNullParameter(installationManagerService, "installationManagerService");
        Intrinsics.checkNotNullParameter(regionProvider, "regionProvider");
        Intrinsics.checkNotNullParameter(sessionIdStorage, "sessionIdStorage");
        this.f142414b = userAuthorization;
        this.f142415c = preferences;
        this.f142416d = formatter;
        this.f142417e = api;
        this.f142418f = application;
        this.f142419g = installationManagerService;
        this.f142420h = regionProvider;
        this.f142421i = sessionIdStorage;
        this.f142422j = new Object();
        this.f142424l = new i();
        this.f142426n = new Object();
        m0.f224434g.l(new b(new Function1() { // from class: com.planner5d.library.api.support.o
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return p.c(this.f142408a, (Integer) obj);
            }
        }));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit c(p pVar, Integer num) {
        pVar.p();
        return Unit.f312394a;
    }

    private final f0 e(f0 f0Var, j jVar) {
        return new f0.a().E(f0Var.x0()).B(f0Var.r0()).y(f0Var.f0()).g(f0Var.E()).w(f0Var.Y()).b(jVar).c();
    }

    private final f0 f(f0 f0Var, String str) throws IOException {
        g0 g0VarR = f0Var.r();
        if (g0VarR == null) {
            throw new IOException();
        }
        IOException iOException = new IOException("[" + this.f142414b.get().e() + "] " + str);
        Integer numL = l(f0Var);
        return e(f0Var, new j(g0VarR, new com.planner5d.library.api.c(iOException, numL != null ? numL.intValue() : 100001)));
    }

    private final f0 g(f0 f0Var) throws IOException {
        g0 g0VarR = f0Var.r();
        if (g0VarR != null) {
            return e(f0Var, new j(g0VarR, this.f142416d, f0Var.E()));
        }
        throw new IOException();
    }

    private final d0 h(d0 d0Var) {
        v vVarQ = d0Var.q();
        id.a aVar = (id.a) d0Var.p(id.a.class);
        if (aVar != null) {
            vVarQ = vVarQ.H().g("hash", aVar.f287077c).h();
        }
        return this.f142424l.c(new d0.a().p(d0Var.m(), d0Var.f()).D(vVarQ).o(u.f334769b.j(new String[0])).b(), k());
    }

    private final f0 i(w.a aVar, d0 d0Var) throws IOException {
        if (o(d0Var)) {
            d0Var = h(d0Var);
        }
        return g(aVar.c(d0Var));
    }

    private final Long j(d0 d0Var, f0 f0Var) {
        com.planner5d.library.api.c cVarC;
        JSONObject jSONObjectA;
        int i10 = 3 & 0;
        if (o(d0Var)) {
            g0 g0VarR = f0Var.r();
            j jVar = g0VarR instanceof j ? (j) g0VarR : null;
            if (jVar != null && (cVarC = jVar.c()) != null && (jSONObjectA = cVarC.a()) != null) {
                return k1.v(jSONObjectA, com.planner5d.library.services.r.uid);
            }
        }
        return null;
    }

    @m1
    private final e k() {
        e eVar;
        synchronized (this.f142426n) {
            try {
                eVar = this.f142425m;
                if (eVar == null) {
                    String strH = h3.h(this.f142418f);
                    if (strH == null) {
                        strH = com.planner5d.library.model.payments.a.f222474i;
                    }
                    String str = strH;
                    int iJ = h3.j(this.f142418f);
                    String strL = h3.l(this.f142418f);
                    if (strL == null) {
                        strL = com.planner5d.library.model.payments.a.f222474i;
                    }
                    String str2 = strL;
                    String strN = h3.n();
                    if (strN == null) {
                        strN = "unknown";
                    }
                    String str3 = strN;
                    String str4 = h3.a0(this.f142418f) ? "tablet" : "phone";
                    String strC = h3.c();
                    if (strC == null) {
                        strC = com.planner5d.library.model.payments.a.f222474i;
                    }
                    String str5 = strC;
                    String str6 = com.planner5d.library.services.r.android.f224891a;
                    String strL0 = h3.l0();
                    if (strL0 == null) {
                        strL0 = com.planner5d.library.model.payments.a.f222474i;
                    }
                    String str7 = strL0;
                    String strW = this.f142415c.w(com.planner5d.library.services.r.installationHash, null);
                    if (strW == null) {
                        strW = com.planner5d.library.model.payments.a.f222474i;
                    }
                    String str8 = strW;
                    String strF = h3.f(this.f142418f);
                    Intrinsics.checkNotNullExpressionValue(strF, "getAppLanguage(...)");
                    String strA = this.f142420h.a();
                    if (strA == null) {
                        strA = com.planner5d.library.model.payments.a.f222474i;
                    }
                    e eVar2 = new e(str, iJ, str2, str3, str4, str5, str6, str7, str8, strF, strA);
                    this.f142425m = eVar2;
                    eVar = eVar2;
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
        return eVar;
    }

    private final Integer l(f0 f0Var) {
        com.planner5d.library.api.c cVarC;
        g0 g0VarR = f0Var.r();
        j jVar = g0VarR instanceof j ? (j) g0VarR : null;
        if (jVar == null || (cVarC = jVar.c()) == null) {
            return null;
        }
        return Integer.valueOf(cVarC.c());
    }

    private final boolean m(f0 f0Var) {
        com.planner5d.library.api.c cVarC;
        g0 g0VarR = f0Var.r();
        j jVar = g0VarR instanceof j ? (j) g0VarR : null;
        return (jVar == null || (cVarC = jVar.c()) == null || !cVarC.h()) ? false : true;
    }

    private final boolean n(f0 f0Var) {
        com.planner5d.library.api.c cVarC;
        g0 g0VarR = f0Var.r();
        j jVar = g0VarR instanceof j ? (j) g0VarR : null;
        if (jVar != null && (cVarC = jVar.c()) != null) {
            com.planner5d.library.modules.user.user.w wVar = this.f142414b.get();
            Intrinsics.checkNotNullExpressionValue(wVar, "get(...)");
            if (cVarC.i(wVar)) {
                return true;
            }
        }
        return false;
    }

    private final boolean o(d0 d0Var) {
        return CollectionsKt.contains(d0Var.k(), f142413s);
    }

    @androidx.annotation.d
    private final void p() {
        com.planner5d.library.services.rx.i.f(new Callable() { // from class: com.planner5d.library.api.support.n
            @Override // java.util.concurrent.Callable
            public final Object call() {
                return p.q(this.f142407a);
            }
        }).subscribeOn(com.planner5d.library.services.rx.c.f224933c).subscribe((Subscriber) new com.planner5d.library.services.rx.e());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit q(p pVar) {
        Unit unit;
        synchronized (pVar.f142426n) {
            try {
                e eVarK = pVar.k();
                e1 e1Var = pVar.f142419g.get();
                e eVarM = null;
                String strK = e1Var != null ? e1Var.k() : null;
                if (!Intrinsics.areEqual(strK, eVarK.q())) {
                    e eVar = pVar.f142425m;
                    if (eVar != null) {
                        if (strK == null) {
                            strK = com.planner5d.library.model.payments.a.f222474i;
                        }
                        eVarM = e.m(eVar, null, 0, null, null, null, null, null, null, strK, null, null, 1791, null);
                    }
                    pVar.f142425m = eVarM;
                }
                unit = Unit.f312394a;
            } catch (Throwable th2) {
                throw th2;
            }
        }
        return unit;
    }

    private final boolean r(id.a aVar, String str) {
        com.planner5d.library.api.b bVar = this.f142417e.get();
        if (bVar == null) {
            return false;
        }
        synchronized (this.f142422j) {
            try {
                this.f142423k = true;
                if (!bVar.E(aVar, str, com.planner5d.library.api.f.a().f142267e, 0).h()) {
                    this.f142423k = false;
                    return true;
                }
                this.f142421i.f(aVar.f287075a, null);
                this.f142423k = false;
                return false;
            } catch (Throwable th2) {
                this.f142423k = false;
                throw th2;
            }
        }
    }

    private final f0 s(w.a aVar, id.a aVar2, d0 d0Var, f0 f0Var) {
        try {
            synchronized (this.f142422j) {
                if (this.f142423k) {
                    return f0Var;
                }
                Unit unit = Unit.f312394a;
                id.a aVarA = this.f142414b.get().a();
                if (aVarA != null && com.planner5d.library.modules.user.user.x.a(aVarA) == aVar2.f287075a) {
                    String hash = aVarA.f287077c;
                    Intrinsics.checkNotNullExpressionValue(hash, "hash");
                    if (r(aVar2, hash)) {
                        f0 f0VarG = g(aVar.c(this.f142424l.k(d0Var, this.f142421i.d(aVar2.f287075a))));
                        if (!n(f0VarG)) {
                            return f0VarG;
                        }
                        f(f0VarG, "Forbidden, resetSessionAndTryAgain did not help");
                        return f0Var;
                    }
                }
                return f0Var;
            }
        } catch (Exception e10) {
            return f(f0Var, "Forbidden, throw: " + e10.getMessage());
        }
    }

    @Override // okhttp3.w
    @m1
    @NotNull
    public f0 intercept(@NotNull w.a chain) throws InterruptedException, IOException {
        String strJ;
        Intrinsics.checkNotNullParameter(chain, "chain");
        synchronized (this.f142422j) {
            Unit unit = Unit.f312394a;
        }
        d0 d0VarRequest = chain.request();
        id.a aVar = (id.a) d0VarRequest.p(id.a.class);
        long jA = com.planner5d.library.modules.user.user.x.a(aVar);
        d0 d0VarC = this.f142424l.c(this.f142424l.k(d0VarRequest, this.f142421i.d(jA)), k());
        f0 f0VarI = i(chain, d0VarC);
        f0 f0VarS = (m(f0VarI) && n(f0VarI) && aVar != null) ? s(chain, aVar, d0VarC, f0VarI) : f0VarI;
        Long lJ = j(d0VarC, f0VarI);
        if ((aVar != null || !o(d0VarC) || lJ != null) && (strJ = this.f142424l.j(f0VarS.x0().q(), f0VarS.Y())) != null) {
            l lVar = this.f142421i;
            if (lJ != null) {
                jA = lJ.longValue();
            }
            lVar.f(jA, strJ);
        }
        return f0VarS;
    }
}
