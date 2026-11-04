package com.facebook.login;

import android.content.Context;
import android.os.Bundle;
import android.os.Parcel;
import android.text.TextUtils;
import android.webkit.CookieSyncManager;
import androidx.annotation.b1;
import androidx.annotation.l1;
import com.facebook.AccessToken;
import com.facebook.FacebookRequestError;
import com.facebook.internal.e1;
import com.facebook.internal.z0;
import com.facebook.j0;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes4.dex */
@b1({b1.a.LIBRARY_GROUP})
public abstract class WebLoginMethodHandler extends LoginMethodHandler {

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    @NotNull
    public static final a f100417h = new a(null);

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    @NotNull
    private static final String f100418i = "com.facebook.login.AuthorizationClient.WebViewAuthHandler.TOKEN_STORE_KEY";

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    @NotNull
    private static final String f100419j = "TOKEN";

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    @Nullable
    private String f100420g;

    public static final class a {
        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private a() {
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public WebLoginMethodHandler(@NotNull LoginClient loginClient) {
        super(loginClient);
        Intrinsics.checkNotNullParameter(loginClient, "loginClient");
    }

    private final String A() {
        Context contextK = i().k();
        if (contextK == null) {
            com.facebook.g0 g0Var = com.facebook.g0.f99617a;
            contextK = com.facebook.g0.n();
        }
        return contextK.getSharedPreferences(f100418i, 0).getString(f100419j, "");
    }

    private final void C(String str) {
        Context contextK = i().k();
        if (contextK == null) {
            com.facebook.g0 g0Var = com.facebook.g0.f99617a;
            contextK = com.facebook.g0.n();
        }
        contextK.getSharedPreferences(f100418i, 0).edit().putString(f100419j, str).apply();
    }

    @l1(otherwise = 4)
    public void B(@NotNull LoginClient.Request request, @Nullable Bundle bundle, @Nullable com.facebook.u uVar) {
        String strValueOf;
        LoginClient.Result resultD;
        Intrinsics.checkNotNullParameter(request, "request");
        LoginClient loginClientI = i();
        this.f100420g = null;
        if (bundle != null) {
            if (bundle.containsKey("e2e")) {
                this.f100420g = bundle.getString("e2e");
            }
            try {
                LoginMethodHandler.a aVar = LoginMethodHandler.f100410c;
                AccessToken accessTokenB = aVar.b(request.o(), bundle, z(), request.a());
                resultD = LoginClient.Result.f100396i.b(loginClientI.y(), accessTokenB, aVar.d(bundle, request.n()));
                if (loginClientI.k() != null) {
                    try {
                        CookieSyncManager.createInstance(loginClientI.k()).sync();
                    } catch (Exception unused) {
                    }
                    if (accessTokenB != null) {
                        C(accessTokenB.t());
                    }
                }
            } catch (com.facebook.u e10) {
                resultD = LoginClient.Result.c.e(LoginClient.Result.f100396i, loginClientI.y(), null, e10.getMessage(), null, 8, null);
            }
        } else if (uVar instanceof com.facebook.w) {
            resultD = LoginClient.Result.f100396i.a(loginClientI.y(), LoginMethodHandler.f100411d);
        } else {
            this.f100420g = null;
            String message = uVar == null ? null : uVar.getMessage();
            if (uVar instanceof j0) {
                FacebookRequestError facebookRequestErrorC = ((j0) uVar).c();
                strValueOf = String.valueOf(facebookRequestErrorC.h());
                message = facebookRequestErrorC.toString();
            } else {
                strValueOf = null;
            }
            resultD = LoginClient.Result.f100396i.d(loginClientI.y(), null, message, strValueOf);
        }
        e1 e1Var = e1.f99794a;
        if (!e1.Z(this.f100420g)) {
            n(this.f100420g);
        }
        loginClientI.i(resultD);
    }

    @NotNull
    protected Bundle w(@NotNull Bundle parameters, @NotNull LoginClient.Request request) {
        Intrinsics.checkNotNullParameter(parameters, "parameters");
        Intrinsics.checkNotNullParameter(request, "request");
        parameters.putString(z0.f100292w, l());
        if (request.s()) {
            parameters.putString("app_id", request.a());
        } else {
            parameters.putString("client_id", request.a());
        }
        parameters.putString("e2e", LoginClient.f100364m.a());
        if (request.s()) {
            parameters.putString(z0.f100293x, z0.M);
        } else {
            if (request.o().contains("openid")) {
                parameters.putString("nonce", request.n());
            }
            parameters.putString(z0.f100293x, z0.O);
        }
        parameters.putString(z0.f100280k, request.e());
        b bVarF = request.f();
        parameters.putString(z0.f100281l, bVarF == null ? null : bVarF.name());
        parameters.putString(z0.f100294y, z0.P);
        parameters.putString(z0.f100277h, request.c());
        parameters.putString("login_behavior", request.k().name());
        com.facebook.g0 g0Var = com.facebook.g0.f99617a;
        parameters.putString("sdk", Intrinsics.stringPlus("android-", com.facebook.g0.I()));
        if (y() != null) {
            parameters.putString(z0.A, y());
        }
        boolean z10 = com.facebook.g0.L;
        String str = com.facebook.appevents.p.f99189d0;
        parameters.putString(z0.f100283n, z10 ? "1" : com.facebook.appevents.p.f99189d0);
        if (request.r()) {
            parameters.putString(z0.J, request.l().toString());
        }
        if (request.E()) {
            parameters.putString(z0.K, z0.P);
        }
        if (request.m() != null) {
            parameters.putString(z0.G, request.m());
            if (request.p()) {
                str = "1";
            }
            parameters.putString(z0.H, str);
        }
        return parameters;
    }

    @NotNull
    protected Bundle x(@NotNull LoginClient.Request request) {
        Intrinsics.checkNotNullParameter(request, "request");
        Bundle bundle = new Bundle();
        e1 e1Var = e1.f99794a;
        if (!e1.a0(request.o())) {
            String strJoin = TextUtils.join(",", request.o());
            bundle.putString("scope", strJoin);
            a("scope", strJoin);
        }
        e eVarH = request.h();
        if (eVarH == null) {
            eVarH = e.NONE;
        }
        bundle.putString("default_audience", eVarH.l());
        bundle.putString("state", h(request.b()));
        AccessToken accessTokenI = AccessToken.f98366l.i();
        String strT = accessTokenI == null ? null : accessTokenI.t();
        String str = com.facebook.appevents.p.f99189d0;
        if (strT == null || !Intrinsics.areEqual(strT, A())) {
            androidx.fragment.app.s sVarK = i().k();
            if (sVarK != null) {
                e1.i(sVarK);
            }
            a("access_token", com.facebook.appevents.p.f99189d0);
        } else {
            bundle.putString("access_token", strT);
            a("access_token", "1");
        }
        bundle.putString(z0.f100278i, String.valueOf(System.currentTimeMillis()));
        com.facebook.g0 g0Var = com.facebook.g0.f99617a;
        if (com.facebook.g0.s()) {
            str = "1";
        }
        bundle.putString(z0.f100288s, str);
        return bundle;
    }

    @Nullable
    protected String y() {
        return null;
    }

    @NotNull
    public abstract com.facebook.g z();

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public WebLoginMethodHandler(@NotNull Parcel source) {
        super(source);
        Intrinsics.checkNotNullParameter(source, "source");
    }
}
