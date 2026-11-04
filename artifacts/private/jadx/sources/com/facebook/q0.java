package com.facebook;

import com.google.android.material.timepicker.TimeModel;
import io.ktor.http.t1;
import java.io.IOException;
import java.io.InputStream;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.q1;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;
import org.json.JSONTokener;

/* JADX INFO: loaded from: classes4.dex */
public final class q0 {

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    @NotNull
    public static final a f101746i = new a(null);

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    @Nullable
    private static final String f101747j = q0.class.getCanonicalName();

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    @NotNull
    public static final String f101748k = "FACEBOOK_NON_JSON_RESULT";

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    @NotNull
    public static final String f101749l = "success";

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    @NotNull
    private static final String f101750m = "code";

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    @NotNull
    private static final String f101751n = "body";

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    @NotNull
    private static final String f101752o = "Response";

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    private final GraphRequest f101753a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @Nullable
    private final HttpURLConnection f101754b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @Nullable
    private final String f101755c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @Nullable
    private final JSONObject f101756d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    @Nullable
    private final JSONArray f101757e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    @Nullable
    private final FacebookRequestError f101758f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    @Nullable
    private final JSONObject f101759g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    @Nullable
    private final JSONArray f101760h;

    public static final class a {
        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private final q0 b(GraphRequest graphRequest, HttpURLConnection httpURLConnection, Object NULL, Object obj) throws JSONException {
            Boolean boolValueOf = null;
            if (NULL instanceof JSONObject) {
                JSONObject jSONObject = (JSONObject) NULL;
                FacebookRequestError facebookRequestErrorA = FacebookRequestError.f98485o.a(jSONObject, obj, httpURLConnection);
                if (facebookRequestErrorA != null) {
                    String unused = q0.f101747j;
                    facebookRequestErrorA.toString();
                    if (facebookRequestErrorA.h() == 190) {
                        com.facebook.internal.e1 e1Var = com.facebook.internal.e1.f99794a;
                        if (com.facebook.internal.e1.V(graphRequest.y())) {
                            if (facebookRequestErrorA.r() != 493) {
                                AccessToken.f98366l.p(null);
                            } else {
                                AccessToken.d dVar = AccessToken.f98366l;
                                AccessToken accessTokenI = dVar.i();
                                if (accessTokenI != null) {
                                    boolValueOf = Boolean.valueOf(accessTokenI.y());
                                }
                                if (Intrinsics.areEqual(boolValueOf, Boolean.FALSE)) {
                                    dVar.h();
                                }
                            }
                        }
                    }
                    return new q0(graphRequest, httpURLConnection, facebookRequestErrorA);
                }
                com.facebook.internal.e1 e1Var2 = com.facebook.internal.e1.f99794a;
                Object objK = com.facebook.internal.e1.K(jSONObject, "body", q0.f101748k);
                if (objK instanceof JSONObject) {
                    JSONObject jSONObject2 = (JSONObject) objK;
                    return new q0(graphRequest, httpURLConnection, jSONObject2.toString(), jSONObject2);
                }
                if (objK instanceof JSONArray) {
                    JSONArray jSONArray = (JSONArray) objK;
                    return new q0(graphRequest, httpURLConnection, jSONArray.toString(), jSONArray);
                }
                NULL = JSONObject.NULL;
                Intrinsics.checkNotNullExpressionValue(NULL, "NULL");
            }
            if (NULL == JSONObject.NULL) {
                return new q0(graphRequest, httpURLConnection, NULL.toString(), (JSONObject) null);
            }
            throw new u(Intrinsics.stringPlus("Got unexpected object type in response, class: ", NULL.getClass().getSimpleName()));
        }

        private final List<q0> c(HttpURLConnection httpURLConnection, List<GraphRequest> list, Object obj) throws JSONException, u {
            Object obj2;
            int size = list.size();
            ArrayList arrayList = new ArrayList(size);
            int i10 = 0;
            if (size == 1) {
                GraphRequest graphRequest = list.get(0);
                try {
                    JSONObject jSONObject = new JSONObject();
                    jSONObject.put("body", obj);
                    jSONObject.put("code", httpURLConnection == null ? 200 : httpURLConnection.getResponseCode());
                    JSONArray jSONArray = new JSONArray();
                    jSONArray.put(jSONObject);
                    obj2 = jSONArray;
                } catch (IOException e10) {
                    arrayList.add(new q0(graphRequest, httpURLConnection, new FacebookRequestError(httpURLConnection, e10)));
                    obj2 = obj;
                } catch (JSONException e11) {
                    arrayList.add(new q0(graphRequest, httpURLConnection, new FacebookRequestError(httpURLConnection, e11)));
                    obj2 = obj;
                }
            } else {
                obj2 = obj;
            }
            if (obj2 instanceof JSONArray) {
                JSONArray jSONArray2 = (JSONArray) obj2;
                if (jSONArray2.length() == size) {
                    int length = jSONArray2.length();
                    if (length > 0) {
                        while (true) {
                            int i11 = i10 + 1;
                            GraphRequest graphRequest2 = list.get(i10);
                            try {
                                Object obj3 = ((JSONArray) obj2).get(i10);
                                Intrinsics.checkNotNullExpressionValue(obj3, "obj");
                                arrayList.add(b(graphRequest2, httpURLConnection, obj3, obj));
                            } catch (u e12) {
                                arrayList.add(new q0(graphRequest2, httpURLConnection, new FacebookRequestError(httpURLConnection, e12)));
                            } catch (JSONException e13) {
                                arrayList.add(new q0(graphRequest2, httpURLConnection, new FacebookRequestError(httpURLConnection, e13)));
                            }
                            if (i11 >= length) {
                                break;
                            }
                            i10 = i11;
                        }
                    }
                    return arrayList;
                }
            }
            throw new u("Unexpected number of results");
        }

        @oj.n
        @NotNull
        public final List<q0> a(@NotNull List<GraphRequest> requests, @Nullable HttpURLConnection httpURLConnection, @Nullable u uVar) {
            Intrinsics.checkNotNullParameter(requests, "requests");
            List<GraphRequest> list = requests;
            ArrayList arrayList = new ArrayList(CollectionsKt.collectionSizeOrDefault(list, 10));
            Iterator<T> it = list.iterator();
            while (it.hasNext()) {
                arrayList.add(new q0((GraphRequest) it.next(), httpURLConnection, new FacebookRequestError(httpURLConnection, uVar)));
            }
            return arrayList;
        }

        @oj.n
        @NotNull
        public final List<q0> d(@Nullable InputStream inputStream, @Nullable HttpURLConnection httpURLConnection, @NotNull p0 requests) throws Throwable {
            Intrinsics.checkNotNullParameter(requests, "requests");
            com.facebook.internal.e1 e1Var = com.facebook.internal.e1.f99794a;
            String strR0 = com.facebook.internal.e1.r0(inputStream);
            com.facebook.internal.t0.f100109e.e(t0.INCLUDE_RAW_RESPONSES, "Response", "Response (raw)\n  Size: %d\n  Response:\n%s\n", Integer.valueOf(strR0.length()), strR0);
            return e(strR0, httpURLConnection, requests);
        }

        @oj.n
        @NotNull
        public final List<q0> e(@NotNull String responseString, @Nullable HttpURLConnection httpURLConnection, @NotNull p0 requests) throws JSONException, IOException, u {
            Intrinsics.checkNotNullParameter(responseString, "responseString");
            Intrinsics.checkNotNullParameter(requests, "requests");
            Object resultObject = new JSONTokener(responseString).nextValue();
            Intrinsics.checkNotNullExpressionValue(resultObject, "resultObject");
            List<q0> listC = c(httpURLConnection, requests, resultObject);
            com.facebook.internal.t0.f100109e.e(t0.REQUESTS, "Response", "Response\n  Id: %s\n  Size: %d\n  Responses:\n%s\n", requests.v(), Integer.valueOf(responseString.length()), listC);
            return listC;
        }

        @oj.n
        @NotNull
        public final List<q0> f(@NotNull HttpURLConnection connection, @NotNull p0 requests) {
            List<q0> listA;
            Intrinsics.checkNotNullParameter(connection, "connection");
            Intrinsics.checkNotNullParameter(requests, "requests");
            try {
                try {
                    g0 g0Var = g0.f99617a;
                    if (!g0.M()) {
                        String unused = q0.f101747j;
                        throw new u("GraphRequest can't be used when Facebook SDK isn't fully initialized");
                    }
                    InputStream errorStream = connection.getResponseCode() >= 400 ? connection.getErrorStream() : connection.getInputStream();
                    List<q0> listD = d(errorStream, connection, requests);
                    com.facebook.internal.e1 e1Var = com.facebook.internal.e1.f99794a;
                    com.facebook.internal.e1.j(errorStream);
                    return listD;
                } catch (u e10) {
                    com.facebook.internal.t0.f100109e.e(t0.REQUESTS, "Response", "Response <Error>: %s", e10);
                    listA = a(requests, connection, e10);
                    com.facebook.internal.e1 e1Var2 = com.facebook.internal.e1.f99794a;
                    com.facebook.internal.e1.j(null);
                    return listA;
                } catch (Exception e11) {
                    com.facebook.internal.t0.f100109e.e(t0.REQUESTS, "Response", "Response <Error>: %s", e11);
                    listA = a(requests, connection, new u(e11));
                    com.facebook.internal.e1 e1Var3 = com.facebook.internal.e1.f99794a;
                    com.facebook.internal.e1.j(null);
                    return listA;
                }
            } catch (Throwable th2) {
                com.facebook.internal.e1 e1Var4 = com.facebook.internal.e1.f99794a;
                com.facebook.internal.e1.j(null);
                throw th2;
            }
        }

        private a() {
        }
    }

    public enum b {
        NEXT,
        PREVIOUS;

        /* JADX INFO: renamed from: values, reason: to resolve conflict with enum method */
        public static b[] valuesCustom() {
            b[] bVarArrValuesCustom = values();
            return (b[]) Arrays.copyOf(bVarArrValuesCustom, bVarArrValuesCustom.length);
        }
    }

    public q0(@NotNull GraphRequest request, @Nullable HttpURLConnection httpURLConnection, @Nullable String str, @Nullable JSONObject jSONObject, @Nullable JSONArray jSONArray, @Nullable FacebookRequestError facebookRequestError) {
        Intrinsics.checkNotNullParameter(request, "request");
        this.f101753a = request;
        this.f101754b = httpURLConnection;
        this.f101755c = str;
        this.f101756d = jSONObject;
        this.f101757e = jSONArray;
        this.f101758f = facebookRequestError;
        this.f101759g = jSONObject;
        this.f101760h = jSONArray;
    }

    @oj.n
    @NotNull
    public static final List<q0> b(@NotNull List<GraphRequest> list, @Nullable HttpURLConnection httpURLConnection, @Nullable u uVar) {
        return f101746i.a(list, httpURLConnection, uVar);
    }

    @oj.n
    @NotNull
    public static final List<q0> c(@Nullable InputStream inputStream, @Nullable HttpURLConnection httpURLConnection, @NotNull p0 p0Var) throws JSONException, IOException, u {
        return f101746i.d(inputStream, httpURLConnection, p0Var);
    }

    @oj.n
    @NotNull
    public static final List<q0> d(@NotNull String str, @Nullable HttpURLConnection httpURLConnection, @NotNull p0 p0Var) throws JSONException, IOException, u {
        return f101746i.e(str, httpURLConnection, p0Var);
    }

    @oj.n
    @NotNull
    public static final List<q0> e(@NotNull HttpURLConnection httpURLConnection, @NotNull p0 p0Var) {
        return f101746i.f(httpURLConnection, p0Var);
    }

    @Nullable
    public final HttpURLConnection f() {
        return this.f101754b;
    }

    @Nullable
    public final FacebookRequestError g() {
        return this.f101758f;
    }

    @Nullable
    public final JSONArray h() {
        return this.f101757e;
    }

    @Nullable
    public final JSONObject i() {
        return this.f101756d;
    }

    @Nullable
    public final JSONArray j() {
        return this.f101760h;
    }

    @Nullable
    public final JSONObject k() {
        return this.f101759g;
    }

    @Nullable
    public final String l() {
        return this.f101755c;
    }

    @NotNull
    public final GraphRequest m() {
        return this.f101753a;
    }

    @Nullable
    public final GraphRequest n(@NotNull b direction) {
        String strOptString;
        JSONObject jSONObjectOptJSONObject;
        Intrinsics.checkNotNullParameter(direction, "direction");
        JSONObject jSONObject = this.f101756d;
        if (jSONObject == null || (jSONObjectOptJSONObject = jSONObject.optJSONObject("paging")) == null) {
            strOptString = null;
        } else {
            strOptString = direction == b.NEXT ? jSONObjectOptJSONObject.optString(t1.b.f296120h) : jSONObjectOptJSONObject.optString("previous");
        }
        com.facebook.internal.e1 e1Var = com.facebook.internal.e1.f99794a;
        if (com.facebook.internal.e1.Z(strOptString)) {
            return null;
        }
        if (strOptString != null && Intrinsics.areEqual(strOptString, this.f101753a.N())) {
            return null;
        }
        try {
            return new GraphRequest(this.f101753a.y(), new URL(strOptString));
        } catch (MalformedURLException unused) {
            return null;
        }
    }

    @NotNull
    public String toString() {
        String str;
        try {
            q1 q1Var = q1.f312784a;
            Locale locale = Locale.US;
            HttpURLConnection httpURLConnection = this.f101754b;
            str = String.format(locale, TimeModel.f114319i, Arrays.copyOf(new Object[]{Integer.valueOf(httpURLConnection == null ? 200 : httpURLConnection.getResponseCode())}, 1));
            Intrinsics.checkNotNullExpressionValue(str, "java.lang.String.format(locale, format, *args)");
        } catch (IOException unused) {
            str = "unknown";
        }
        String str2 = "{Response:  responseCode: " + str + ", graphObject: " + this.f101756d + ", error: " + this.f101758f + "}";
        Intrinsics.checkNotNullExpressionValue(str2, "StringBuilder()\n        .append(\"{Response: \")\n        .append(\" responseCode: \")\n        .append(responseCode)\n        .append(\", graphObject: \")\n        .append(graphObject)\n        .append(\", error: \")\n        .append(error)\n        .append(\"}\")\n        .toString()");
        return str2;
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public q0(@NotNull GraphRequest request, @Nullable HttpURLConnection httpURLConnection, @NotNull String rawResponse, @Nullable JSONObject jSONObject) {
        this(request, httpURLConnection, rawResponse, jSONObject, null, null);
        Intrinsics.checkNotNullParameter(request, "request");
        Intrinsics.checkNotNullParameter(rawResponse, "rawResponse");
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public q0(@NotNull GraphRequest request, @Nullable HttpURLConnection httpURLConnection, @NotNull String rawResponse, @NotNull JSONArray graphObjects) {
        this(request, httpURLConnection, rawResponse, null, graphObjects, null);
        Intrinsics.checkNotNullParameter(request, "request");
        Intrinsics.checkNotNullParameter(rawResponse, "rawResponse");
        Intrinsics.checkNotNullParameter(graphObjects, "graphObjects");
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public q0(@NotNull GraphRequest request, @Nullable HttpURLConnection httpURLConnection, @NotNull FacebookRequestError error) {
        this(request, httpURLConnection, null, null, null, error);
        Intrinsics.checkNotNullParameter(request, "request");
        Intrinsics.checkNotNullParameter(error, "error");
    }
}
