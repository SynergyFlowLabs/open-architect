package com.planner5d.library.modules.user.auth;

import android.app.Activity;
import android.app.PendingIntent;
import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import androidx.annotation.m1;
import androidx.compose.runtime.internal.w0;
import com.planner5d.library.activity.GooglePlusAppAuthResponse;
import com.planner5d.library.services.utility.f1;
import com.planner5d.library.services.utility.h3;
import java.nio.charset.Charset;
import java.util.concurrent.CancellationException;
import kotlin.Result;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.jvm.internal.c1;
import kotlin.jvm.internal.j1;
import kotlinx.coroutines.channels.n0;
import kotlinx.coroutines.p2;
import kotlinx.coroutines.s0;
import net.openid.appauth.a0;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes9.dex */
@w0(parameters = 0)
@SourceDebugExtension({"SMAP\nSocialAuthGooglePlusWithoutPlayServices.kt\nKotlin\n*S Kotlin\n*F\n+ 1 SocialAuthGooglePlusWithoutPlayServices.kt\ncom/planner5d/library/modules/user/auth/SocialAuthGooglePlusWithoutPlayServices\n+ 2 Uri.kt\nandroidx/core/net/UriKt\n*L\n1#1,165:1\n29#2:166\n29#2:167\n29#2:168\n*S KotlinDebug\n*F\n+ 1 SocialAuthGooglePlusWithoutPlayServices.kt\ncom/planner5d/library/modules/user/auth/SocialAuthGooglePlusWithoutPlayServices\n*L\n97#1:166\n98#1:167\n102#1:168\n*E\n"})
public final class j extends com.planner5d.library.modules.user.auth.a {

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public static final int f222888h = 8;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @NotNull
    private final Context f222889c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @NotNull
    private final f1 f222890d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    @Nullable
    private p2 f222891e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    @NotNull
    private final SocialAuthType f222892f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    @NotNull
    private final kotlinx.coroutines.channels.p<Result<k>> f222893g;

    static final class a implements Function1<net.openid.appauth.h, Unit> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ net.openid.appauth.g f222894a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ kotlin.coroutines.d<net.openid.appauth.d> f222895b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ net.openid.appauth.e f222896c;

        /* JADX INFO: renamed from: com.planner5d.library.modules.user.auth.j$a$a, reason: collision with other inner class name */
        @SourceDebugExtension({"SMAP\nSocialAuthGooglePlusWithoutPlayServices.kt\nKotlin\n*S Kotlin\n*F\n+ 1 SocialAuthGooglePlusWithoutPlayServices.kt\ncom/planner5d/library/modules/user/auth/SocialAuthGooglePlusWithoutPlayServices$loadAuthState$2$1$1\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,165:1\n1#2:166\n*E\n"})
        static final class C1644a implements net.openid.appauth.h.d {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            final /* synthetic */ kotlin.coroutines.d<net.openid.appauth.d> f222897a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            final /* synthetic */ net.openid.appauth.g f222898b;

            /* JADX INFO: renamed from: c, reason: collision with root package name */
            final /* synthetic */ net.openid.appauth.e f222899c;

            /* JADX WARN: Multi-variable type inference failed */
            C1644a(kotlin.coroutines.d<? super net.openid.appauth.d> dVar, net.openid.appauth.g gVar, net.openid.appauth.e eVar) {
                this.f222897a = dVar;
                this.f222898b = gVar;
                this.f222899c = eVar;
            }

            @Override // net.openid.appauth.h.d
            public final void a(a0 a0Var, net.openid.appauth.e eVar) {
                if (a0Var == null) {
                    kotlin.coroutines.d<net.openid.appauth.d> dVar = this.f222897a;
                    Result.a aVar = Result.Companion;
                    dVar.resumeWith(Result.m785constructorimpl(null));
                } else {
                    kotlin.coroutines.d<net.openid.appauth.d> dVar2 = this.f222897a;
                    net.openid.appauth.d dVar3 = new net.openid.appauth.d(this.f222898b, this.f222899c);
                    dVar3.L(a0Var, eVar);
                    Result.a aVar2 = Result.Companion;
                    dVar2.resumeWith(Result.m785constructorimpl(dVar3));
                }
            }
        }

        /* JADX WARN: Multi-variable type inference failed */
        a(net.openid.appauth.g gVar, kotlin.coroutines.d<? super net.openid.appauth.d> dVar, net.openid.appauth.e eVar) {
            this.f222894a = gVar;
            this.f222895b = dVar;
            this.f222896c = eVar;
        }

        public final void c(net.openid.appauth.h it) {
            Intrinsics.checkNotNullParameter(it, "it");
            it.m(this.f222894a.b(), new C1644a(this.f222895b, this.f222894a, this.f222896c));
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(net.openid.appauth.h hVar) {
            c(hVar);
            return Unit.f312394a;
        }
    }

    @kotlin.coroutines.jvm.internal.f(c = "com.planner5d.library.modules.user.auth.SocialAuthGooglePlusWithoutPlayServices$onActivityResult$1", f = "SocialAuthGooglePlusWithoutPlayServices.kt", i = {0}, l = {com.planner5d.library.engine.input.f.b.f160725s}, m = "invokeSuspend", n = {"error"}, s = {"L$0"})
    static final class b extends kotlin.coroutines.jvm.internal.o implements Function2<s0, kotlin.coroutines.d<? super Unit>, Object> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        Object f222900a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        int f222901b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ Intent f222902c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        final /* synthetic */ j f222903d;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        b(Intent intent, j jVar, kotlin.coroutines.d<? super b> dVar) {
            super(2, dVar);
            this.f222902c = intent;
            this.f222903d = jVar;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final kotlin.coroutines.d<Unit> create(Object obj, kotlin.coroutines.d<?> dVar) {
            return new b(this.f222902c, this.f222903d, dVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            net.openid.appauth.e eVar;
            Object objL = kotlin.coroutines.intrinsics.b.l();
            int i10 = this.f222901b;
            try {
                if (i10 == 0) {
                    ResultKt.m(obj);
                    net.openid.appauth.g gVarD = net.openid.appauth.g.d(this.f222902c);
                    net.openid.appauth.e eVarH = net.openid.appauth.e.h(this.f222902c);
                    if (gVarD == null) {
                        this.f222903d.o(null, eVarH != null ? eVarH : new Exception("Empty auth result or no service"));
                        return Unit.f312394a;
                    }
                    j jVar = this.f222903d;
                    this.f222900a = eVarH;
                    this.f222901b = 1;
                    obj = jVar.q(gVarD, eVarH, this);
                    if (obj == objL) {
                        return objL;
                    }
                    eVar = eVarH;
                } else {
                    if (i10 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    net.openid.appauth.e eVar2 = (net.openid.appauth.e) this.f222900a;
                    ResultKt.m(obj);
                    eVar = eVar2;
                }
                net.openid.appauth.d dVar = (net.openid.appauth.d) obj;
                if (dVar == null) {
                    this.f222903d.o(null, eVar);
                    return Unit.f312394a;
                }
                j jVar2 = this.f222903d;
                jVar2.o(jVar2.r(dVar.g(), dVar.n()), null);
                return Unit.f312394a;
            } catch (Throwable th2) {
                if (!(th2 instanceof CancellationException)) {
                    this.f222903d.o(null, th2);
                }
            }
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(s0 s0Var, kotlin.coroutines.d<? super Unit> dVar) {
            return ((b) create(s0Var, dVar)).invokeSuspend(Unit.f312394a);
        }
    }

    public j(@NotNull Context context, @NotNull f1 coroutineScope) {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(coroutineScope, "coroutineScope");
        this.f222889c = context;
        this.f222890d = coroutineScope;
        this.f222892f = SocialAuthType.Google;
        this.f222893g = kotlinx.coroutines.channels.s.d(Integer.MAX_VALUE, null, null, 6, null);
    }

    private final net.openid.appauth.f m() {
        net.openid.appauth.f.b bVar = new net.openid.appauth.f.b(new net.openid.appauth.i(Uri.parse("https://accounts.google.com/o/oauth2/v2/auth"), Uri.parse("https://www.googleapis.com/oauth2/v4/token")), this.f222889c.getString(com.planner5d.library.f.s.f169108fd), "code", Uri.parse(this.f222889c.getPackageName() + ":/oauth2redirect"));
        bVar.q("email", "profile");
        net.openid.appauth.f fVarA = bVar.a();
        Intrinsics.checkNotNullExpressionValue(fVarA, "build(...)");
        return fVarA;
    }

    private final PendingIntent n() {
        PendingIntent activity = PendingIntent.getActivity(this.f222889c, 7, new Intent(this.f222889c, (Class<?>) GooglePlusAppAuthResponse.class), com.google.api.client.googleapis.media.a.f115410j);
        Intrinsics.checkNotNullExpressionValue(activity, "getActivity(...)");
        return activity;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void o(k kVar, Throwable th2) {
        Object objM785constructorimpl;
        kotlinx.coroutines.channels.p<Result<k>> pVar = this.f222893g;
        if (kVar == null || th2 != null) {
            Result.a aVar = Result.Companion;
            objM785constructorimpl = Result.m785constructorimpl(ResultKt.createFailure(new com.planner5d.library.modules.user.auth.b()));
        } else {
            Result.a aVar2 = Result.Companion;
            objM785constructorimpl = Result.m785constructorimpl(kVar);
        }
        pVar.p(Result.a(objM785constructorimpl));
    }

    private static Object p(j jVar) {
        return j1.t(new c1(jVar, j.class, "loginResultInternal", "getLoginResultInternal()Lkotlinx/coroutines/channels/Channel;", 0));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final Object q(net.openid.appauth.g gVar, net.openid.appauth.e eVar, kotlin.coroutines.d<? super net.openid.appauth.d> dVar) throws Throwable {
        kotlin.coroutines.j jVar = new kotlin.coroutines.j(kotlin.coroutines.intrinsics.b.e(dVar));
        t(this.f222889c, new a(gVar, jVar, eVar));
        Object objA = jVar.a();
        if (objA == kotlin.coroutines.intrinsics.b.l()) {
            kotlin.coroutines.jvm.internal.h.c(dVar);
        }
        return objA;
    }

    /* JADX INFO: Access modifiers changed from: private */
    @m1
    public final k r(String str, String str2) {
        try {
            JSONObject jSONObject = new JSONObject(org.apache.commons.io.p.K0(h3.e0("https://www.googleapis.com/oauth2/v3/userinfo?access_token=" + str).getInputStream(), Charset.defaultCharset()));
            com.planner5d.library.services.r rVar = com.planner5d.library.services.r.sub;
            if (jSONObject.has(rVar.f224891a)) {
                return new k(g(), jSONObject.getString(rVar.f224891a), str2, jSONObject.getString(com.planner5d.library.services.r.uName.f224891a));
            }
        } catch (Throwable th2) {
            timber.log.b.f381052a.e(th2);
        }
        return null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit s(j jVar, PendingIntent pendingIntent, net.openid.appauth.h it) {
        Intrinsics.checkNotNullParameter(it, "it");
        it.i(jVar.m(), pendingIntent, pendingIntent);
        return Unit.f312394a;
    }

    private final void t(Context context, Function1<? super net.openid.appauth.h, Unit> function1) {
        net.openid.appauth.h hVar = new net.openid.appauth.h(context);
        function1.invoke(hVar);
        hVar.c();
    }

    @Override // com.planner5d.library.modules.user.auth.l
    public void a() {
        p2 p2Var = this.f222891e;
        if (p2Var != null) {
            p2.a.b(p2Var, null, 1, null);
        }
    }

    @Override // com.planner5d.library.modules.user.auth.l
    public boolean b() {
        return false;
    }

    @Override // com.planner5d.library.modules.user.auth.l
    @NotNull
    public SocialAuthType c() {
        return this.f222892f;
    }

    @Override // com.planner5d.library.modules.user.auth.l
    @NotNull
    public n0<Result<k>> d() {
        return this.f222893g;
    }

    @Override // com.planner5d.library.modules.user.auth.l
    public void e(int i10, int i11, @Nullable Intent intent) {
        if (i10 == 7 && i11 == -1 && intent != null) {
            p2 p2Var = this.f222891e;
            if (p2Var != null) {
                p2.a.b(p2Var, null, 1, null);
            }
            this.f222891e = kotlinx.coroutines.k.f(this.f222890d, com.planner5d.library.services.utility.s.f229729a.d(), null, new b(intent, this, null), 2, null);
        }
    }

    @Override // com.planner5d.library.modules.user.auth.a, com.planner5d.library.modules.user.auth.l
    public void f(@NotNull Activity activity, boolean z10) {
        Intrinsics.checkNotNullParameter(activity, "activity");
        super.f(activity, z10);
        p2 p2Var = this.f222891e;
        if (p2Var != null) {
            p2.a.b(p2Var, null, 1, null);
        }
        final PendingIntent pendingIntentN = n();
        t(activity, new Function1() { // from class: com.planner5d.library.modules.user.auth.i
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return j.s(this.f222886a, pendingIntentN, (net.openid.appauth.h) obj);
            }
        });
    }
}
