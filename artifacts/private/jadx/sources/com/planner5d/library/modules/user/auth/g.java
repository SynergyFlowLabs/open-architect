package com.planner5d.library.modules.user.auth;

import android.app.Activity;
import android.content.Intent;
import androidx.annotation.m1;
import androidx.compose.runtime.internal.w0;
import com.facebook.AccessToken;
import com.facebook.GraphRequest;
import com.facebook.login.b0;
import com.facebook.login.z;
import com.facebook.q0;
import com.facebook.u;
import com.facebook.w;
import java.util.Set;
import kotlin.Result;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.jvm.internal.c1;
import kotlin.jvm.internal.j1;
import kotlinx.coroutines.channels.n0;
import kotlinx.coroutines.channels.t;
import kotlinx.coroutines.f2;
import kotlinx.coroutines.s0;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes9.dex */
@w0(parameters = 0)
@SourceDebugExtension({"SMAP\nSocialAuthFacebook.kt\nKotlin\n*S Kotlin\n*F\n+ 1 SocialAuthFacebook.kt\ncom/planner5d/library/modules/user/auth/SocialAuthFacebook\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,101:1\n1#2:102\n*E\n"})
public final class g extends com.planner5d.library.modules.user.auth.a {

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final int f222872f = 8;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @NotNull
    private final SocialAuthType f222873c = SocialAuthType.Facebook;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @NotNull
    private final kotlinx.coroutines.channels.p<Result<k>> f222874d = kotlinx.coroutines.channels.s.d(Integer.MAX_VALUE, null, null, 6, null);

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    @NotNull
    private final com.facebook.k f222875e;

    public static final class a implements com.facebook.p<b0> {

        /* JADX INFO: renamed from: com.planner5d.library.modules.user.auth.g$a$a, reason: collision with other inner class name */
        @kotlin.coroutines.jvm.internal.f(c = "com.planner5d.library.modules.user.auth.SocialAuthFacebook$callbackManager$1$1$onSuccess$1", f = "SocialAuthFacebook.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
        @SourceDebugExtension({"SMAP\nSocialAuthFacebook.kt\nKotlin\n*S Kotlin\n*F\n+ 1 SocialAuthFacebook.kt\ncom/planner5d/library/modules/user/auth/SocialAuthFacebook$callbackManager$1$1$onSuccess$1\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,101:1\n1#2:102\n*E\n"})
        static final class C1643a extends kotlin.coroutines.jvm.internal.o implements Function2<s0, kotlin.coroutines.d<? super Unit>, Object> {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            int f222877a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            final /* synthetic */ g f222878b;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            C1643a(g gVar, kotlin.coroutines.d<? super C1643a> dVar) {
                super(2, dVar);
                this.f222878b = gVar;
            }

            @Override // kotlin.coroutines.jvm.internal.a
            public final kotlin.coroutines.d<Unit> create(Object obj, kotlin.coroutines.d<?> dVar) {
                return new C1643a(this.f222878b, dVar);
            }

            @Override // kotlin.coroutines.jvm.internal.a
            public final Object invokeSuspend(Object obj) {
                kotlin.coroutines.intrinsics.b.l();
                if (this.f222877a != 0) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.m(obj);
                kotlinx.coroutines.channels.p pVar = this.f222878b.f222874d;
                Object objM = this.f222878b.m();
                if (objM != null) {
                    Result.a aVar = Result.Companion;
                } else {
                    Result.a aVar2 = Result.Companion;
                    objM = ResultKt.createFailure(new b());
                }
                pVar.p(Result.a(Result.m785constructorimpl(objM)));
                return Unit.f312394a;
            }

            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(s0 s0Var, kotlin.coroutines.d<? super Unit> dVar) {
                return ((C1643a) create(s0Var, dVar)).invokeSuspend(Unit.f312394a);
            }
        }

        a() {
        }

        @Override // com.facebook.p
        public void a(u error) {
            Intrinsics.checkNotNullParameter(error, "error");
            kotlinx.coroutines.channels.p pVar = g.this.f222874d;
            Result.a aVar = Result.Companion;
            pVar.p(Result.a(Result.m785constructorimpl(ResultKt.createFailure(error instanceof w ? new b() : new c()))));
        }

        @Override // com.facebook.p
        /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
        public void b(b0 result) {
            Intrinsics.checkNotNullParameter(result, "result");
            if (g.this.n()) {
                kotlinx.coroutines.k.f(f2.f314023a, com.planner5d.library.services.utility.s.f229729a.b(), null, new C1643a(g.this, null), 2, null);
                return;
            }
            kotlinx.coroutines.channels.p pVar = g.this.f222874d;
            Result.a aVar = Result.Companion;
            t.b(pVar.p(Result.a(Result.m785constructorimpl(ResultKt.createFailure(new b())))));
        }

        @Override // com.facebook.p
        public void onCancel() {
            kotlinx.coroutines.channels.p pVar = g.this.f222874d;
            Result.a aVar = Result.Companion;
            pVar.p(Result.a(Result.m785constructorimpl(ResultKt.createFailure(new b()))));
        }
    }

    public g() {
        com.facebook.k kVarA = com.facebook.k.b.a();
        z.f101684j.e().p0(kVarA, new a());
        this.f222875e = kVarA;
    }

    private static Object l(g gVar) {
        return j1.t(new c1(gVar, g.class, "loginResultInternal", "getLoginResultInternal()Lkotlinx/coroutines/channels/Channel;", 0));
    }

    /* JADX INFO: Access modifiers changed from: private */
    @m1
    public final k m() {
        JSONObject jSONObjectI;
        AccessToken accessTokenI = AccessToken.f98366l.i();
        if (accessTokenI == null) {
            return null;
        }
        q0 q0VarL = GraphRequest.f98518n.I(accessTokenI, null).l();
        if (q0VarL.g() != null) {
            q0VarL = null;
        }
        if (q0VarL != null && (jSONObjectI = q0VarL.i()) != null) {
            try {
                return new k(g(), jSONObjectI.getString(com.planner5d.library.services.r.id.f224891a), accessTokenI.t(), jSONObjectI.getString(com.planner5d.library.services.r.uName.f224891a));
            } catch (JSONException e10) {
                timber.log.b.f381052a.e(e10);
            }
        }
        return null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final boolean n() {
        Set<String> setQ;
        AccessToken accessTokenI = AccessToken.f98366l.i();
        if (accessTokenI == null || (setQ = accessTokenI.q()) == null) {
            return false;
        }
        return setQ.contains("email");
    }

    @Override // com.planner5d.library.modules.user.auth.l
    public void a() {
        z.f101684j.e().f0();
    }

    @Override // com.planner5d.library.modules.user.auth.l
    public boolean b() {
        return n();
    }

    @Override // com.planner5d.library.modules.user.auth.l
    @NotNull
    public SocialAuthType c() {
        return this.f222873c;
    }

    @Override // com.planner5d.library.modules.user.auth.l
    @NotNull
    public n0<Result<k>> d() {
        return this.f222874d;
    }

    @Override // com.planner5d.library.modules.user.auth.l
    public void e(int i10, int i11, @Nullable Intent intent) {
        this.f222875e.e(i10, i11, intent);
    }

    @Override // com.planner5d.library.modules.user.auth.a, com.planner5d.library.modules.user.auth.l
    public void f(@NotNull Activity activity, boolean z10) {
        Intrinsics.checkNotNullParameter(activity, "activity");
        super.f(activity, z10);
        z.f101684j.e().Z(activity, CollectionsKt.listOf("email"));
    }
}
