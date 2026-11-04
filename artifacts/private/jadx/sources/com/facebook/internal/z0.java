package com.facebook.internal;

import android.os.Bundle;
import java.util.Arrays;
import java.util.Collection;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.q1;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes4.dex */
public final class z0 {

    @NotNull
    public static final String A = "sso";

    @NotNull
    public static final String B = "default_audience";

    @NotNull
    public static final String C = "sdk";

    @NotNull
    public static final String D = "state";

    @NotNull
    public static final String E = "fail_on_logged_out";

    @NotNull
    public static final String F = "cct_over_app_switch";

    @NotNull
    public static final String G = "messenger_page_id";

    @NotNull
    public static final String H = "reset_messenger_state";

    @NotNull
    public static final String I = "rerequest";

    @NotNull
    public static final String J = "fx_app";

    @NotNull
    public static final String K = "skip_dedupe";

    @NotNull
    public static final String L = "code,signed_request,graph_domain";

    @NotNull
    public static final String M = "token,signed_request,graph_domain,granted_scopes";

    @NotNull
    public static final String N = "token,signed_request,graph_domain";

    @NotNull
    public static final String O = "id_token,token,signed_request,graph_domain";

    @NotNull
    public static final String P = "true";

    @NotNull
    public static final String Q = "fbconnect://success";

    @NotNull
    public static final String R = "fbconnect://chrome_os_success";

    @NotNull
    public static final String S = "fbconnect://cancel";

    @NotNull
    public static final String T = "app_id";

    @NotNull
    public static final String U = "bridge_args";

    @NotNull
    public static final String V = "android_key_hash";

    @NotNull
    public static final String W = "method_args";

    @NotNull
    public static final String X = "method_results";

    @NotNull
    public static final String Y = "version";

    @NotNull
    public static final String Z = "touch";

    /* JADX INFO: renamed from: a0, reason: collision with root package name */
    @NotNull
    public static final String f100268a0 = "oauth/authorize";

    /* JADX INFO: renamed from: b0, reason: collision with root package name */
    @NotNull
    private static final String f100270b0 = "https://graph-video.%s";

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @NotNull
    private static final String f100271c = "m.%s";

    /* JADX INFO: renamed from: c0, reason: collision with root package name */
    @NotNull
    private static final String f100272c0 = "https://graph.%s";

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @NotNull
    private static final String f100273d = "%s";

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    @NotNull
    public static final String f100274e = "dialog/";

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    @NotNull
    public static final String f100275f = "access_token";

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    @NotNull
    public static final String f100276g = "app_id";

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    @NotNull
    public static final String f100277h = "auth_type";

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    @NotNull
    public static final String f100278i = "cbt";

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    @NotNull
    public static final String f100279j = "client_id";

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    @NotNull
    public static final String f100280k = "code_challenge";

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    @NotNull
    public static final String f100281l = "code_challenge_method";

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    @NotNull
    public static final String f100282m = "code_redirect_uri";

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    @NotNull
    public static final String f100283n = "cct_prefetching";

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    @NotNull
    public static final String f100284o = "display";

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    @NotNull
    public static final String f100285p = "touch";

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    @NotNull
    public static final String f100286q = "e2e";

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    @NotNull
    public static final String f100287r = "id_token";

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    @NotNull
    public static final String f100288s = "ies";

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    @NotNull
    public static final String f100289t = "legacy_override";

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    @NotNull
    public static final String f100290u = "login_behavior";

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    @NotNull
    public static final String f100291v = "nonce";

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    @NotNull
    public static final String f100292w = "redirect_uri";

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    @NotNull
    public static final String f100293x = "response_type";

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    @NotNull
    public static final String f100294y = "return_scopes";

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    @NotNull
    public static final String f100295z = "scope";

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    public static final z0 f100267a = new z0();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static final String f100269b = z0.class.getName();

    private z0() {
    }

    @oj.n
    @NotNull
    public static final String a() {
        return "v15.0";
    }

    @oj.n
    @NotNull
    public static final String b() {
        q1 q1Var = q1.f312784a;
        com.facebook.g0 g0Var = com.facebook.g0.f99617a;
        String str = String.format(f100271c, Arrays.copyOf(new Object[]{com.facebook.g0.z()}, 1));
        Intrinsics.checkNotNullExpressionValue(str, "java.lang.String.format(format, *args)");
        return str;
    }

    @oj.n
    @NotNull
    public static final String c() {
        return "CONNECTION_FAILURE";
    }

    @oj.n
    @NotNull
    public static final Collection<String> d() {
        return CollectionsKt.listOf((Object[]) new String[]{"service_disabled", "AndroidAuthKillSwitchException"});
    }

    @oj.n
    @NotNull
    public static final Collection<String> e() {
        return CollectionsKt.listOf((Object[]) new String[]{"access_denied", "OAuthAccessDeniedException"});
    }

    @oj.n
    @NotNull
    public static final String f() {
        q1 q1Var = q1.f312784a;
        com.facebook.g0 g0Var = com.facebook.g0.f99617a;
        String str = String.format(f100272c0, Arrays.copyOf(new Object[]{com.facebook.g0.z()}, 1));
        Intrinsics.checkNotNullExpressionValue(str, "java.lang.String.format(format, *args)");
        return str;
    }

    @oj.n
    @NotNull
    public static final String g() {
        q1 q1Var = q1.f312784a;
        com.facebook.g0 g0Var = com.facebook.g0.f99617a;
        String str = String.format(f100273d, Arrays.copyOf(new Object[]{com.facebook.g0.A()}, 1));
        Intrinsics.checkNotNullExpressionValue(str, "java.lang.String.format(format, *args)");
        return str;
    }

    @oj.n
    @NotNull
    public static final String h() {
        q1 q1Var = q1.f312784a;
        com.facebook.g0 g0Var = com.facebook.g0.f99617a;
        String str = String.format(f100272c0, Arrays.copyOf(new Object[]{com.facebook.g0.C()}, 1));
        Intrinsics.checkNotNullExpressionValue(str, "java.lang.String.format(format, *args)");
        return str;
    }

    @oj.n
    @NotNull
    public static final String i(@NotNull String subdomain) {
        Intrinsics.checkNotNullParameter(subdomain, "subdomain");
        q1 q1Var = q1.f312784a;
        String str = String.format(f100272c0, Arrays.copyOf(new Object[]{subdomain}, 1));
        Intrinsics.checkNotNullExpressionValue(str, "java.lang.String.format(format, *args)");
        return str;
    }

    @oj.n
    @NotNull
    public static final String j() {
        q1 q1Var = q1.f312784a;
        com.facebook.g0 g0Var = com.facebook.g0.f99617a;
        String str = String.format(f100270b0, Arrays.copyOf(new Object[]{com.facebook.g0.C()}, 1));
        Intrinsics.checkNotNullExpressionValue(str, "java.lang.String.format(format, *args)");
        return str;
    }

    @oj.n
    @NotNull
    public static final String k() {
        q1 q1Var = q1.f312784a;
        com.facebook.g0 g0Var = com.facebook.g0.f99617a;
        String str = String.format(f100271c, Arrays.copyOf(new Object[]{com.facebook.g0.D()}, 1));
        Intrinsics.checkNotNullExpressionValue(str, "java.lang.String.format(format, *args)");
        return str;
    }

    @oj.n
    @Nullable
    public static final Bundle l(@NotNull String callId, int i10, @Nullable Bundle bundle) {
        Intrinsics.checkNotNullParameter(callId, "callId");
        com.facebook.g0 g0Var = com.facebook.g0.f99617a;
        String strQ = com.facebook.g0.q(com.facebook.g0.n());
        e1 e1Var = e1.f99794a;
        if (e1.Z(strQ)) {
            return null;
        }
        Bundle bundle2 = new Bundle();
        bundle2.putString(V, strQ);
        bundle2.putString("app_id", com.facebook.g0.o());
        bundle2.putInt("version", i10);
        bundle2.putString("display", "touch");
        Bundle bundle3 = new Bundle();
        bundle3.putString("action_id", callId);
        try {
            e eVar = e.f99792a;
            JSONObject jSONObjectB = e.b(bundle3);
            if (bundle == null) {
                bundle = new Bundle();
            }
            JSONObject jSONObjectB2 = e.b(bundle);
            if (jSONObjectB != null && jSONObjectB2 != null) {
                bundle2.putString(U, jSONObjectB.toString());
                bundle2.putString(W, jSONObjectB2.toString());
                return bundle2;
            }
            return null;
        } catch (IllegalArgumentException e10) {
            t0.a aVar = t0.f100109e;
            com.facebook.t0 t0Var = com.facebook.t0.DEVELOPER_ERRORS;
            String TAG = f100269b;
            Intrinsics.checkNotNullExpressionValue(TAG, "TAG");
            aVar.b(t0Var, 6, TAG, Intrinsics.stringPlus("Error creating Url -- ", e10));
            return null;
        } catch (JSONException e11) {
            t0.a aVar2 = t0.f100109e;
            com.facebook.t0 t0Var2 = com.facebook.t0.DEVELOPER_ERRORS;
            String TAG2 = f100269b;
            Intrinsics.checkNotNullExpressionValue(TAG2, "TAG");
            aVar2.b(t0Var2, 6, TAG2, Intrinsics.stringPlus("Error creating Url -- ", e11));
            return null;
        }
    }
}
