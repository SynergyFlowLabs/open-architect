package com.planner5d.library.modules.user.auth;

import android.app.Activity;
import android.app.Application;
import android.content.Intent;
import androidx.annotation.l0;
import androidx.compose.runtime.internal.w0;
import androidx.lifecycle.c1;
import com.planner5d.library.model.manager.statistics.events.k3;
import com.planner5d.library.model.manager.statistics.events.p3;
import com.planner5d.library.services.utility.c2;
import com.planner5d.library.services.utility.f1;
import com.planner5d.library.services.utility.h3;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.Pair;
import kotlin.Result;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.jvm.internal.j1;
import kotlin.n1;
import kotlinx.coroutines.p2;
import kotlinx.coroutines.s0;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes9.dex */
@w0(parameters = 0)
@ij.f
@SourceDebugExtension({"SMAP\nSocialServiceAuthorization.kt\nKotlin\n*S Kotlin\n*F\n+ 1 SocialServiceAuthorization.kt\ncom/planner5d/library/modules/user/auth/SocialServiceAuthorization\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,145:1\n1863#2,2:146\n1863#2,2:148\n*S KotlinDebug\n*F\n+ 1 SocialServiceAuthorization.kt\ncom/planner5d/library/modules/user/auth/SocialServiceAuthorization\n*L\n93#1:146,2\n141#1:148,2\n*E\n"})
public final class r {

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public static final int f222934k = 8;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    private final Application f222935a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NotNull
    private final fg.e<com.planner5d.library.model.manager.config.j> f222936b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @NotNull
    private final f1 f222937c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @NotNull
    private final fg.e<c2> f222938d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    @NotNull
    private final c1<com.planner5d.library.services.utility.o<Pair<SocialAuthType, Result<k>>>> f222939e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private boolean f222940f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    @Nullable
    private n1<Integer, Integer, ? extends Intent> f222941g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    @Nullable
    private k3.a f222942h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    @NotNull
    private final Map<SocialAuthType, l> f222943i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    @NotNull
    private final Map<Class<l>, p2> f222944j;

    @kotlin.coroutines.jvm.internal.f(c = "com.planner5d.library.modules.user.auth.SocialServiceAuthorization$observeLoginResultForService$1", f = "SocialServiceAuthorization.kt", i = {}, l = {androidx.media3.extractor.metadata.dvbsi.b.f67479d}, m = "invokeSuspend", n = {}, s = {})
    static final class a extends kotlin.coroutines.jvm.internal.o implements Function2<s0, kotlin.coroutines.d<? super Unit>, Object> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        int f222945a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ l f222946b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ r f222947c;

        /* JADX INFO: renamed from: com.planner5d.library.modules.user.auth.r$a$a, reason: collision with other inner class name */
        static final class C1645a<T> implements kotlinx.coroutines.flow.j {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            final /* synthetic */ r f222948a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            final /* synthetic */ l f222949b;

            C1645a(r rVar, l lVar) {
                this.f222948a = rVar;
                this.f222949b = lVar;
            }

            @Override // kotlinx.coroutines.flow.j
            public final Object emit(Object obj, kotlin.coroutines.d<? super Unit> dVar) {
                this.f222948a.r(((Result) obj).j(), this.f222949b.c());
                this.f222948a.f222939e.r(new com.planner5d.library.services.utility.o(new Pair(this.f222949b.c(), obj)));
                return Unit.f312394a;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        a(l lVar, r rVar, kotlin.coroutines.d<? super a> dVar) {
            super(2, dVar);
            this.f222946b = lVar;
            this.f222947c = rVar;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final kotlin.coroutines.d<Unit> create(Object obj, kotlin.coroutines.d<?> dVar) {
            return new a(this.f222946b, this.f222947c, dVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            Object objL = kotlin.coroutines.intrinsics.b.l();
            int i10 = this.f222945a;
            if (i10 == 0) {
                ResultKt.m(obj);
                kotlinx.coroutines.flow.i iVarZ = kotlinx.coroutines.flow.k.Z(this.f222946b.d());
                C1645a c1645a = new C1645a(this.f222947c, this.f222946b);
                this.f222945a = 1;
                if (iVarZ.collect(c1645a, this) == objL) {
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
        public final Object invoke(s0 s0Var, kotlin.coroutines.d<? super Unit> dVar) {
            return ((a) create(s0Var, dVar)).invokeSuspend(Unit.f312394a);
        }
    }

    @ij.a
    public r(@NotNull Application application, @NotNull fg.e<com.planner5d.library.model.manager.config.j> featureConfigManager, @NotNull f1 coroutineScope, @NotNull fg.e<c2> networkStateUtility) {
        Intrinsics.checkNotNullParameter(application, "application");
        Intrinsics.checkNotNullParameter(featureConfigManager, "featureConfigManager");
        Intrinsics.checkNotNullParameter(coroutineScope, "coroutineScope");
        Intrinsics.checkNotNullParameter(networkStateUtility, "networkStateUtility");
        this.f222935a = application;
        this.f222936b = featureConfigManager;
        this.f222937c = coroutineScope;
        this.f222938d = networkStateUtility;
        this.f222939e = new c1<>();
        this.f222943i = new LinkedHashMap();
        this.f222944j = new LinkedHashMap();
    }

    private final void g(int i10, int i11, Intent intent) {
        Iterator<T> it = this.f222943i.values().iterator();
        while (it.hasNext()) {
            ((l) it.next()).e(i10, i11, intent);
        }
    }

    private static Object i(r rVar) {
        return j1.t(new kotlin.jvm.internal.c1(rVar, r.class, "internalAuthResult", "getInternalAuthResult()Landroidx/lifecycle/MutableLiveData;", 0));
    }

    private final void k(l lVar) {
        int i10 = 0 << 0;
        this.f222944j.put((Class<l>) lVar.getClass(), kotlinx.coroutines.k.f(this.f222937c, com.planner5d.library.services.utility.s.f229729a.a(), null, new a(lVar, this, null), 2, null));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final g n() {
        return new g();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final h o(r rVar) {
        return new h(rVar.f222935a);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final j p(r rVar) {
        return new j(rVar.f222935a, rVar.f222937c);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void r(Object obj, SocialAuthType socialAuthType) {
        p3.a aVar;
        p3.b bVar;
        if (Result.h(obj)) {
            bVar = p3.b.success;
            aVar = null;
        } else {
            aVar = p3.a.other;
            bVar = p3.b.error;
        }
        p3.b bVar2 = bVar;
        p3.a aVar2 = aVar;
        com.planner5d.library.model.manager.statistics.events.n nVar = com.planner5d.library.model.manager.statistics.events.n.f217157b;
        k3.a aVar3 = this.f222942h;
        if (aVar3 == null) {
            aVar3 = k3.a.authenticate;
        }
        nVar.L1(aVar3, bVar2, aVar2, socialAuthType.getMethod(), false, false);
    }

    private final void s(Class<? extends l> cls) {
        p2 p2Var = this.f222944j.get(cls);
        if (p2Var != null) {
            p2.a.b(p2Var, null, 1, null);
        }
    }

    private final <T extends l> void t(Class<T> cls, boolean z10, Function0<? extends T> function0) {
        com.planner5d.library.services.utility.m mVar = com.planner5d.library.services.utility.m.f225326a;
        boolean zC = mVar.c(this.f222943i, cls);
        if (z10 && !zC) {
            T tInvoke = function0.invoke();
            this.f222943i.put(tInvoke.c(), tInvoke);
            k(tInvoke);
        } else {
            if (z10 || !zC) {
                return;
            }
            mVar.e(this.f222943i, cls);
            s(cls);
        }
    }

    public final void f() {
        Iterator<T> it = this.f222943i.values().iterator();
        while (it.hasNext()) {
            ((l) it.next()).a();
        }
    }

    @NotNull
    public final androidx.lifecycle.w0<com.planner5d.library.services.utility.o<Pair<SocialAuthType, Result<k>>>> h() {
        return this.f222939e;
    }

    @l0
    public final void j(@NotNull Activity activity, @NotNull SocialAuthType type, @NotNull k3.a form) {
        Intrinsics.checkNotNullParameter(activity, "activity");
        Intrinsics.checkNotNullParameter(type, "type");
        Intrinsics.checkNotNullParameter(form, "form");
        l lVar = this.f222943i.get(type);
        if (lVar == null) {
            c1<com.planner5d.library.services.utility.o<Pair<SocialAuthType, Result<k>>>> c1Var = this.f222939e;
            Result.a aVar = Result.Companion;
            c1Var.r(new com.planner5d.library.services.utility.o<>(new Pair(type, Result.a(Result.m785constructorimpl(ResultKt.createFailure(new e()))))));
        } else if (this.f222938d.get().d(this.f222935a)) {
            this.f222942h = form;
            lVar.f(activity, form == k3.a.sign_up);
        } else {
            c1<com.planner5d.library.services.utility.o<Pair<SocialAuthType, Result<k>>>> c1Var2 = this.f222939e;
            Result.a aVar2 = Result.Companion;
            c1Var2.r(new com.planner5d.library.services.utility.o<>(new Pair(type, Result.a(Result.m785constructorimpl(ResultKt.createFailure(new c()))))));
        }
    }

    @l0
    public final void l(int i10, int i11, @Nullable Intent intent) {
        if (this.f222940f) {
            g(i10, i11, intent);
        } else {
            this.f222941g = new n1<>(Integer.valueOf(i10), Integer.valueOf(i11), intent);
        }
    }

    @l0
    public final void m() {
        this.f222940f = true;
        t(g.class, this.f222936b.get().a(com.planner5d.library.model.manager.config.f.Facebook), new Function0() { // from class: com.planner5d.library.modules.user.auth.o
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return r.n();
            }
        });
        boolean zS = h3.S(this.f222935a);
        t(h.class, zS, new Function0() { // from class: com.planner5d.library.modules.user.auth.p
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return r.o(this.f222932a);
            }
        });
        t(j.class, true ^ zS, new Function0() { // from class: com.planner5d.library.modules.user.auth.q
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return r.p(this.f222933a);
            }
        });
        n1<Integer, Integer, ? extends Intent> n1Var = this.f222941g;
        if (n1Var != null) {
            g(n1Var.f().intValue(), n1Var.g().intValue(), n1Var.h());
            this.f222941g = null;
        }
    }

    @l0
    public final void q() {
        this.f222940f = false;
    }
}
