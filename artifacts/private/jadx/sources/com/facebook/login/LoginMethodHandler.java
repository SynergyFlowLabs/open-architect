package com.facebook.login;

import android.content.Intent;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import android.util.Base64;
import androidx.annotation.l1;
import com.devtodev.core.data.metrics.MetricConsts;
import com.facebook.AccessToken;
import com.facebook.AuthenticationToken;
import com.facebook.FacebookRequestError;
import com.facebook.GraphRequest;
import com.facebook.internal.e1;
import com.facebook.internal.w0;
import com.facebook.j0;
import com.facebook.q0;
import java.io.UnsupportedEncodingException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Date;
import java.util.HashMap;
import java.util.Map;
import kotlin.collections.CollectionsKt;
import kotlin.collections.MapsKt;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.Charsets;
import kotlin.text.StringsKt;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes4.dex */
@l1(otherwise = 3)
public abstract class LoginMethodHandler implements Parcelable {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @NotNull
    public static final a f100410c = new a(null);

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @NotNull
    public static final String f100411d = "User canceled log in.";

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    @NotNull
    public static final String f100412e = "Authorization response does not contain the signed_request";

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    @NotNull
    public static final String f100413f = "Failed to retrieve user_id from signed_request";

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @Nullable
    private Map<String, String> f100414a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public LoginClient f100415b;

    public static final class a {
        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @oj.n
        @Nullable
        public final AccessToken a(@NotNull Bundle bundle, @Nullable com.facebook.g gVar, @NotNull String applicationId) {
            String string;
            Intrinsics.checkNotNullParameter(bundle, "bundle");
            Intrinsics.checkNotNullParameter(applicationId, "applicationId");
            e1 e1Var = e1.f99794a;
            Date dateW = e1.w(bundle, w0.f100216z0, new Date(0L));
            ArrayList<String> stringArrayList = bundle.getStringArrayList(w0.f100197q0);
            String string2 = bundle.getString(w0.f100214y0);
            Date dateW2 = e1.w(bundle, w0.A0, new Date(0L));
            if (string2 == null || string2.length() == 0 || (string = bundle.getString(w0.f100204t0)) == null || string.length() == 0) {
                return null;
            }
            return new AccessToken(string2, applicationId, string, stringArrayList, null, null, gVar, dateW, new Date(), dateW2, bundle.getString("graph_domain"));
        }

        @oj.n
        @Nullable
        public final AccessToken b(@Nullable Collection<String> collection, @NotNull Bundle bundle, @Nullable com.facebook.g gVar, @NotNull String applicationId) throws com.facebook.u {
            Collection<String> collectionArrayListOf;
            ArrayList arrayListArrayListOf;
            ArrayList arrayListArrayListOf2;
            Intrinsics.checkNotNullParameter(bundle, "bundle");
            Intrinsics.checkNotNullParameter(applicationId, "applicationId");
            e1 e1Var = e1.f99794a;
            Date dateW = e1.w(bundle, AccessToken.f98369n, new Date());
            String string = bundle.getString("access_token");
            if (string == null) {
                return null;
            }
            Date dateW2 = e1.w(bundle, AccessToken.f98374s, new Date(0L));
            String string2 = bundle.getString("granted_scopes");
            if (string2 == null || string2.length() <= 0) {
                collectionArrayListOf = collection;
            } else {
                Object[] array = StringsKt.split$default(string2, new String[]{","}, false, 0, 6, null).toArray(new String[0]);
                if (array == null) {
                    throw new NullPointerException("null cannot be cast to non-null type kotlin.Array<T>");
                }
                String[] strArr = (String[]) array;
                collectionArrayListOf = CollectionsKt.arrayListOf(Arrays.copyOf(strArr, strArr.length));
            }
            String string3 = bundle.getString("denied_scopes");
            if (string3 == null || string3.length() <= 0) {
                arrayListArrayListOf = null;
            } else {
                Object[] array2 = StringsKt.split$default(string3, new String[]{","}, false, 0, 6, null).toArray(new String[0]);
                if (array2 == null) {
                    throw new NullPointerException("null cannot be cast to non-null type kotlin.Array<T>");
                }
                String[] strArr2 = (String[]) array2;
                arrayListArrayListOf = CollectionsKt.arrayListOf(Arrays.copyOf(strArr2, strArr2.length));
            }
            String string4 = bundle.getString("expired_scopes");
            if (string4 == null || string4.length() <= 0) {
                arrayListArrayListOf2 = null;
            } else {
                Object[] array3 = StringsKt.split$default(string4, new String[]{","}, false, 0, 6, null).toArray(new String[0]);
                if (array3 == null) {
                    throw new NullPointerException("null cannot be cast to non-null type kotlin.Array<T>");
                }
                String[] strArr3 = (String[]) array3;
                arrayListArrayListOf2 = CollectionsKt.arrayListOf(Arrays.copyOf(strArr3, strArr3.length));
            }
            if (e1.Z(string)) {
                return null;
            }
            return new AccessToken(string, applicationId, e(bundle.getString("signed_request")), collectionArrayListOf, arrayListArrayListOf, arrayListArrayListOf2, gVar, dateW, new Date(), dateW2, bundle.getString("graph_domain"));
        }

        @oj.n
        @Nullable
        public final AuthenticationToken c(@NotNull Bundle bundle, @Nullable String str) throws com.facebook.u {
            Intrinsics.checkNotNullParameter(bundle, "bundle");
            String string = bundle.getString(w0.B0);
            if (string == null || string.length() == 0 || str == null || str.length() == 0) {
                return null;
            }
            try {
                return new AuthenticationToken(string, str);
            } catch (Exception e10) {
                throw new com.facebook.u(e10.getMessage());
            }
        }

        @oj.n
        @Nullable
        public final AuthenticationToken d(@NotNull Bundle bundle, @Nullable String str) throws com.facebook.u {
            Intrinsics.checkNotNullParameter(bundle, "bundle");
            String string = bundle.getString("id_token");
            if (string != null && string.length() != 0 && str != null && str.length() != 0) {
                try {
                    return new AuthenticationToken(string, str);
                } catch (Exception e10) {
                    throw new com.facebook.u(e10.getMessage(), e10);
                }
            }
            return null;
        }

        @oj.n
        @NotNull
        public final String e(@Nullable String str) throws com.facebook.u {
            if (str == null || str.length() == 0) {
                throw new com.facebook.u(LoginMethodHandler.f100412e);
            }
            try {
                Object[] array = StringsKt.split$default(str, new String[]{"."}, false, 0, 6, null).toArray(new String[0]);
                if (array == null) {
                    throw new NullPointerException("null cannot be cast to non-null type kotlin.Array<T>");
                }
                String[] strArr = (String[]) array;
                if (strArr.length == 2) {
                    byte[] data = Base64.decode(strArr[1], 0);
                    Intrinsics.checkNotNullExpressionValue(data, "data");
                    String string = new JSONObject(new String(data, Charsets.UTF_8)).getString("user_id");
                    Intrinsics.checkNotNullExpressionValue(string, "jsonObject.getString(\"user_id\")");
                    return string;
                }
                throw new com.facebook.u(LoginMethodHandler.f100413f);
            } catch (UnsupportedEncodingException | JSONException unused) {
            }
        }

        private a() {
        }
    }

    public LoginMethodHandler(@NotNull LoginClient loginClient) {
        Intrinsics.checkNotNullParameter(loginClient, "loginClient");
        s(loginClient);
    }

    @oj.n
    @Nullable
    public static final AccessToken c(@NotNull Bundle bundle, @Nullable com.facebook.g gVar, @NotNull String str) {
        return f100410c.a(bundle, gVar, str);
    }

    @oj.n
    @Nullable
    public static final AccessToken e(@Nullable Collection<String> collection, @NotNull Bundle bundle, @Nullable com.facebook.g gVar, @NotNull String str) throws com.facebook.u {
        return f100410c.b(collection, bundle, gVar, str);
    }

    @oj.n
    @Nullable
    public static final AuthenticationToken f(@NotNull Bundle bundle, @Nullable String str) throws com.facebook.u {
        return f100410c.c(bundle, str);
    }

    @oj.n
    @Nullable
    public static final AuthenticationToken g(@NotNull Bundle bundle, @Nullable String str) throws com.facebook.u {
        return f100410c.d(bundle, str);
    }

    @oj.n
    @NotNull
    public static final String m(@Nullable String str) throws com.facebook.u {
        return f100410c.e(str);
    }

    protected void a(@Nullable String str, @Nullable Object obj) {
        if (this.f100414a == null) {
            this.f100414a = new HashMap();
        }
        Map<String, String> map = this.f100414a;
        if (map == null) {
            return;
        }
        map.put(str, obj == null ? null : obj.toString());
    }

    public void b() {
    }

    @NotNull
    protected String h(@NotNull String authId) {
        Intrinsics.checkNotNullParameter(authId, "authId");
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put(v.f101572t, authId);
            jSONObject.put(v.f101575w, k());
            r(jSONObject);
        } catch (JSONException e10) {
            Intrinsics.stringPlus("Error creating client state json: ", e10.getMessage());
        }
        String string = jSONObject.toString();
        Intrinsics.checkNotNullExpressionValue(string, "param.toString()");
        return string;
    }

    @NotNull
    public final LoginClient i() {
        LoginClient loginClient = this.f100415b;
        if (loginClient != null) {
            return loginClient;
        }
        Intrinsics.throwUninitializedPropertyAccessException("loginClient");
        throw null;
    }

    @Nullable
    public final Map<String, String> j() {
        return this.f100414a;
    }

    @NotNull
    public abstract String k();

    @NotNull
    protected String l() {
        StringBuilder sb2 = new StringBuilder();
        sb2.append(MetricConsts.FacebookInfo);
        com.facebook.g0 g0Var = com.facebook.g0.f99617a;
        sb2.append(com.facebook.g0.o());
        sb2.append("://authorize/");
        return sb2.toString();
    }

    protected void n(@Nullable String str) {
        LoginClient.Request requestY = i().y();
        String strA = requestY == null ? null : requestY.a();
        if (strA == null) {
            com.facebook.g0 g0Var = com.facebook.g0.f99617a;
            strA = com.facebook.g0.o();
        }
        com.facebook.appevents.f0 f0Var = new com.facebook.appevents.f0(i().k(), strA);
        Bundle bundle = new Bundle();
        bundle.putString(com.facebook.internal.a.f99679k, str);
        bundle.putLong(com.facebook.internal.a.f99681l, System.currentTimeMillis());
        bundle.putString("app_id", strA);
        f0Var.n(com.facebook.internal.a.f99665d, null, bundle);
    }

    public boolean o() {
        return false;
    }

    public boolean p(int i10, int i11, @Nullable Intent intent) {
        return false;
    }

    @NotNull
    protected Bundle q(@NotNull LoginClient.Request request, @NotNull Bundle values) throws com.facebook.u {
        GraphRequest graphRequestA;
        Intrinsics.checkNotNullParameter(request, "request");
        Intrinsics.checkNotNullParameter(values, "values");
        String string = values.getString("code");
        e1 e1Var = e1.f99794a;
        if (e1.Z(string)) {
            throw new com.facebook.u("No code param found from the request");
        }
        if (string == null) {
            graphRequestA = null;
        } else {
            g0 g0Var = g0.f100483a;
            String strL = l();
            String strG = request.g();
            if (strG == null) {
                strG = "";
            }
            graphRequestA = g0.a(string, strL, strG);
        }
        if (graphRequestA == null) {
            throw new com.facebook.u("Failed to create code exchange request");
        }
        q0 q0VarL = graphRequestA.l();
        FacebookRequestError facebookRequestErrorG = q0VarL.g();
        if (facebookRequestErrorG != null) {
            throw new j0(facebookRequestErrorG, facebookRequestErrorG.i());
        }
        try {
            JSONObject jSONObjectI = q0VarL.i();
            String string2 = jSONObjectI != null ? jSONObjectI.getString("access_token") : null;
            if (jSONObjectI == null || e1.Z(string2)) {
                throw new com.facebook.u("No access token found from result");
            }
            values.putString("access_token", string2);
            if (jSONObjectI.has("id_token")) {
                values.putString("id_token", jSONObjectI.getString("id_token"));
            }
            return values;
        } catch (JSONException e10) {
            throw new com.facebook.u(Intrinsics.stringPlus("Fail to process code exchange response: ", e10.getMessage()));
        }
    }

    public void r(@NotNull JSONObject param) throws JSONException {
        Intrinsics.checkNotNullParameter(param, "param");
    }

    public final void s(@NotNull LoginClient loginClient) {
        Intrinsics.checkNotNullParameter(loginClient, "<set-?>");
        this.f100415b = loginClient;
    }

    public final void t(@Nullable Map<String, String> map) {
        this.f100414a = map;
    }

    public boolean u() {
        return false;
    }

    public abstract int v(@NotNull LoginClient.Request request);

    @Override // android.os.Parcelable
    public void writeToParcel(@NotNull Parcel dest, int i10) {
        Intrinsics.checkNotNullParameter(dest, "dest");
        e1 e1Var = e1.f99794a;
        e1.M0(dest, this.f100414a);
    }

    protected LoginMethodHandler(@NotNull Parcel source) {
        Intrinsics.checkNotNullParameter(source, "source");
        e1 e1Var = e1.f99794a;
        Map<String, String> mapS0 = e1.s0(source);
        this.f100414a = mapS0 == null ? null : MapsKt.toMutableMap(mapS0);
    }
}
