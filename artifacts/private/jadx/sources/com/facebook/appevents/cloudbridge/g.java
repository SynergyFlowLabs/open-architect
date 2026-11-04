package com.facebook.appevents.cloudbridge;

import com.facebook.GraphRequest;
import com.facebook.internal.e1;
import com.facebook.internal.t0;
import com.google.firebase.perf.network.FirebasePerfUrlConnection;
import java.io.BufferedOutputStream;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.net.HttpURLConnection;
import java.net.URL;
import java.net.URLConnection;
import java.net.UnknownHostException;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashSet;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;
import kotlin.TuplesKt;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.collections.MapsKt;
import kotlin.collections.SetsKt;
import kotlin.i2;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.l0;
import kotlin.jvm.internal.r1;
import kotlin.ranges.IntRange;
import kotlin.text.StringsKt;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes4.dex */
public final class g {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NotNull
    private static final String f98658b = "CAPITransformerWebRequests";

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final int f98659c = 1000;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private static final int f98660d = 10;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private static final int f98661e = 60000;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public static a f98664h = null;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public static List<Map<String, Object>> f98665i = null;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public static final int f98666j = 5;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private static int f98667k;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    public static final g f98657a = new g();

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    @NotNull
    private static final HashSet<Integer> f98662f = SetsKt.hashSetOf(200, 202);

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    @NotNull
    private static final HashSet<Integer> f98663g = SetsKt.hashSetOf(503, 504, 429);

    public static final class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        @NotNull
        private final String f98668a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        @NotNull
        private final String f98669b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        @NotNull
        private final String f98670c;

        public a(@NotNull String datasetID, @NotNull String cloudBridgeURL, @NotNull String accessKey) {
            Intrinsics.checkNotNullParameter(datasetID, "datasetID");
            Intrinsics.checkNotNullParameter(cloudBridgeURL, "cloudBridgeURL");
            Intrinsics.checkNotNullParameter(accessKey, "accessKey");
            this.f98668a = datasetID;
            this.f98669b = cloudBridgeURL;
            this.f98670c = accessKey;
        }

        public static /* synthetic */ a e(a aVar, String str, String str2, String str3, int i10, Object obj) {
            if ((i10 & 1) != 0) {
                str = aVar.f98668a;
            }
            if ((i10 & 2) != 0) {
                str2 = aVar.f98669b;
            }
            if ((i10 & 4) != 0) {
                str3 = aVar.f98670c;
            }
            return aVar.d(str, str2, str3);
        }

        @NotNull
        public final String a() {
            return this.f98668a;
        }

        @NotNull
        public final String b() {
            return this.f98669b;
        }

        @NotNull
        public final String c() {
            return this.f98670c;
        }

        @NotNull
        public final a d(@NotNull String datasetID, @NotNull String cloudBridgeURL, @NotNull String accessKey) {
            Intrinsics.checkNotNullParameter(datasetID, "datasetID");
            Intrinsics.checkNotNullParameter(cloudBridgeURL, "cloudBridgeURL");
            Intrinsics.checkNotNullParameter(accessKey, "accessKey");
            return new a(datasetID, cloudBridgeURL, accessKey);
        }

        public boolean equals(@Nullable Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof a)) {
                return false;
            }
            a aVar = (a) obj;
            return Intrinsics.areEqual(this.f98668a, aVar.f98668a) && Intrinsics.areEqual(this.f98669b, aVar.f98669b) && Intrinsics.areEqual(this.f98670c, aVar.f98670c);
        }

        @NotNull
        public final String f() {
            return this.f98670c;
        }

        @NotNull
        public final String g() {
            return this.f98669b;
        }

        @NotNull
        public final String h() {
            return this.f98668a;
        }

        public int hashCode() {
            return (((this.f98668a.hashCode() * 31) + this.f98669b.hashCode()) * 31) + this.f98670c.hashCode();
        }

        @NotNull
        public String toString() {
            return "CloudBridgeCredentials(datasetID=" + this.f98668a + ", cloudBridgeURL=" + this.f98669b + ", accessKey=" + this.f98670c + ')';
        }
    }

    static final class b extends l0 implements Function2<String, Integer, Unit> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ List<Map<String, Object>> f98671a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        b(List<? extends Map<String, ? extends Object>> list) {
            super(2);
            this.f98671a = list;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final void f(Integer num, List processedEvents) {
            Intrinsics.checkNotNullParameter(processedEvents, "$processedEvents");
            if (CollectionsKt.contains(g.f98662f, num)) {
                return;
            }
            g.f98657a.i(num, processedEvents, 5);
        }

        public final void d(@Nullable String str, @Nullable final Integer num) {
            e1 e1Var = e1.f99794a;
            final List<Map<String, Object>> list = this.f98671a;
            e1.A0(new Runnable() { // from class: com.facebook.appevents.cloudbridge.h
                @Override // java.lang.Runnable
                public final void run() {
                    g.b.f(num, list);
                }
            });
        }

        @Override // kotlin.jvm.functions.Function2
        public /* bridge */ /* synthetic */ Unit invoke(String str, Integer num) {
            d(str, num);
            return Unit.f312394a;
        }
    }

    private g() {
    }

    @oj.n
    public static final void d(@NotNull String datasetID, @NotNull String url, @NotNull String accessKey) {
        Intrinsics.checkNotNullParameter(datasetID, "datasetID");
        Intrinsics.checkNotNullParameter(url, "url");
        Intrinsics.checkNotNullParameter(accessKey, "accessKey");
        t0.f100109e.e(com.facebook.t0.APP_EVENTS, f98658b, " \n\nCloudbridge Configured: \n================\ndatasetID: %s\nurl: %s\naccessKey: %s\n\n", datasetID, url, accessKey);
        g gVar = f98657a;
        gVar.m(new a(datasetID, url, accessKey));
        gVar.o(new ArrayList());
    }

    @oj.n
    @Nullable
    public static final String e() {
        try {
            a aVarF = f98657a.f();
            if (aVarF == null) {
                return null;
            }
            return aVarF.toString();
        } catch (i2 unused) {
            return null;
        }
    }

    public static /* synthetic */ void j(g gVar, Integer num, List list, int i10, int i11, Object obj) {
        if ((i11 & 4) != 0) {
            i10 = 5;
        }
        gVar.i(num, list, i10);
    }

    public static /* synthetic */ void l(g gVar, String str, String str2, String str3, Map map, int i10, Function2 function2, int i11, Object obj) {
        if ((i11 & 16) != 0) {
            i10 = 60000;
        }
        gVar.k(str, str2, str3, map, i10, function2);
    }

    private final List<Map<String, Object>> p(GraphRequest graphRequest) {
        JSONObject jSONObjectG = graphRequest.G();
        if (jSONObjectG == null) {
            return null;
        }
        e1 e1Var = e1.f99794a;
        Map<String, ? extends Object> mutableMap = MapsKt.toMutableMap(e1.n(jSONObjectG));
        Object objM = graphRequest.M();
        if (objM == null) {
            throw new NullPointerException("null cannot be cast to non-null type kotlin.Any");
        }
        mutableMap.put("custom_events", objM);
        StringBuilder sb2 = new StringBuilder();
        for (String str : mutableMap.keySet()) {
            sb2.append(str);
            sb2.append(" : ");
            sb2.append(mutableMap.get(str));
            sb2.append(System.getProperty("line.separator"));
        }
        t0.f100109e.e(com.facebook.t0.APP_EVENTS, f98658b, "\nGraph Request data: \n\n%s \n\n", sb2);
        return e.f98633a.e(mutableMap);
    }

    @oj.n
    public static final void q(@NotNull final GraphRequest request) {
        Intrinsics.checkNotNullParameter(request, "request");
        e1 e1Var = e1.f99794a;
        e1.A0(new Runnable() { // from class: com.facebook.appevents.cloudbridge.f
            @Override // java.lang.Runnable
            public final void run() throws JSONException {
                g.r(request);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void r(GraphRequest request) throws JSONException {
        Intrinsics.checkNotNullParameter(request, "$request");
        String strH = request.H();
        List listSplit$default = strH == null ? null : StringsKt.split$default(strH, new String[]{"/"}, false, 0, 6, null);
        if (listSplit$default != null && listSplit$default.size() == 2) {
            try {
                g gVar = f98657a;
                String str = gVar.f().g() + "/capi/" + gVar.f().h() + "/events";
                List<Map<String, Object>> listP = gVar.p(request);
                if (listP == null) {
                    return;
                }
                gVar.c(listP);
                int iMin = Math.min(gVar.h().size(), 10);
                List listSlice = CollectionsKt.slice((List) gVar.h(), new IntRange(0, iMin - 1));
                gVar.h().subList(0, iMin).clear();
                JSONArray jSONArray = new JSONArray((Collection) listSlice);
                LinkedHashMap linkedHashMap = new LinkedHashMap();
                linkedHashMap.put("data", jSONArray);
                linkedHashMap.put("accessKey", gVar.f().f());
                JSONObject jSONObject = new JSONObject(linkedHashMap);
                t0.a aVar = t0.f100109e;
                com.facebook.t0 t0Var = com.facebook.t0.APP_EVENTS;
                String string = jSONObject.toString(2);
                Intrinsics.checkNotNullExpressionValue(string, "jsonBodyStr.toString(2)");
                aVar.e(t0Var, f98658b, "\nTransformed_CAPI_JSON:\nURL: %s\nFROM=========\n%s\n>>>>>>TO>>>>>>\n%s\n=============\n", str, request, string);
                gVar.k(str, "POST", jSONObject.toString(), MapsKt.mapOf(TuplesKt.to("Content-Type", "application/json")), 60000, new b(listSlice));
                return;
            } catch (i2 e10) {
                t0.f100109e.e(com.facebook.t0.DEVELOPER_ERRORS, f98658b, "\n Credentials not initialized Error when logging: \n%s", e10);
                return;
            }
        }
        t0.f100109e.e(com.facebook.t0.DEVELOPER_ERRORS, f98658b, "\n GraphPathComponents Error when logging: \n%s", request);
    }

    public final void c(@Nullable List<? extends Map<String, ? extends Object>> list) {
        if (list != null) {
            h().addAll(list);
        }
        int i10 = 7 >> 0;
        int iMax = Math.max(0, h().size() - 1000);
        if (iMax > 0) {
            o(r1.g(CollectionsKt.drop(h(), iMax)));
        }
    }

    @NotNull
    public final a f() {
        a aVar = f98664h;
        if (aVar != null) {
            return aVar;
        }
        Intrinsics.throwUninitializedPropertyAccessException("credentials");
        throw null;
    }

    public final int g() {
        return f98667k;
    }

    @NotNull
    public final List<Map<String, Object>> h() {
        List<Map<String, Object>> list = f98665i;
        if (list != null) {
            return list;
        }
        Intrinsics.throwUninitializedPropertyAccessException("transformedEvents");
        throw null;
    }

    public final void i(@Nullable Integer num, @NotNull List<? extends Map<String, ? extends Object>> processedEvents, int i10) {
        Intrinsics.checkNotNullParameter(processedEvents, "processedEvents");
        if (CollectionsKt.contains(f98663g, num)) {
            if (f98667k >= i10) {
                h().clear();
                f98667k = 0;
            } else {
                h().addAll(0, processedEvents);
                f98667k++;
            }
        }
    }

    /* JADX WARN: Code duplicated, block: B:50:0x014e  */
    public final void k(@NotNull String urlStr, @NotNull String requestMethod, @Nullable String str, @Nullable Map<String, String> map, int i10, @Nullable Function2<? super String, ? super Integer, Unit> function2) {
        Set<String> setKeySet;
        Intrinsics.checkNotNullParameter(urlStr, "urlStr");
        Intrinsics.checkNotNullParameter(requestMethod, "requestMethod");
        try {
            URLConnection uRLConnection = (URLConnection) FirebasePerfUrlConnection.instrument(new URL(urlStr).openConnection());
            if (uRLConnection == null) {
                throw new NullPointerException("null cannot be cast to non-null type java.net.HttpURLConnection");
            }
            HttpURLConnection httpURLConnection = (HttpURLConnection) uRLConnection;
            httpURLConnection.setRequestMethod(requestMethod);
            if (map != null && (setKeySet = map.keySet()) != null) {
                for (String str2 : setKeySet) {
                    httpURLConnection.setRequestProperty(str2, map.get(str2));
                }
            }
            httpURLConnection.setDoOutput(httpURLConnection.getRequestMethod().equals("POST") || httpURLConnection.getRequestMethod().equals("PUT"));
            httpURLConnection.setConnectTimeout(i10);
            BufferedOutputStream bufferedOutputStream = new BufferedOutputStream(httpURLConnection.getOutputStream());
            BufferedWriter bufferedWriter = new BufferedWriter(new OutputStreamWriter(bufferedOutputStream, "UTF-8"));
            bufferedWriter.write(str);
            bufferedWriter.flush();
            bufferedWriter.close();
            bufferedOutputStream.close();
            StringBuilder sb2 = new StringBuilder();
            if (f98662f.contains(Integer.valueOf(httpURLConnection.getResponseCode()))) {
                BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(httpURLConnection.getInputStream(), "UTF-8"));
                while (true) {
                    try {
                        String line = bufferedReader.readLine();
                        if (line == null) {
                            break;
                        } else {
                            sb2.append(line);
                        }
                    } catch (Throwable th2) {
                        try {
                            throw th2;
                        } catch (Throwable th3) {
                            kotlin.io.c.a(bufferedReader, th2);
                            throw th3;
                        }
                    }
                    t0.f100109e.e(com.facebook.t0.APP_EVENTS, f98658b, "Connection failed, retrying: \n%s", e.toString());
                    if (function2 != null) {
                        function2.invoke(null, 503);
                    }
                }
                Unit unit = Unit.f312394a;
                kotlin.io.c.a(bufferedReader, null);
            }
            String string = sb2.toString();
            Intrinsics.checkNotNullExpressionValue(string, "connResponseSB.toString()");
            t0.f100109e.e(com.facebook.t0.APP_EVENTS, f98658b, "\nResponse Received: \n%s\n%s", string, Integer.valueOf(httpURLConnection.getResponseCode()));
            if (function2 != null) {
                function2.invoke(string, Integer.valueOf(httpURLConnection.getResponseCode()));
            }
        } catch (UnknownHostException e10) {
            t0.f100109e.e(com.facebook.t0.APP_EVENTS, f98658b, "Connection failed, retrying: \n%s", e10.toString());
            if (function2 != null) {
                function2.invoke(null, 503);
            }
        } catch (IOException e11) {
            t0.f100109e.e(com.facebook.t0.DEVELOPER_ERRORS, f98658b, "Send to server failed: \n%s", e11.toString());
        }
    }

    public final void m(@NotNull a aVar) {
        Intrinsics.checkNotNullParameter(aVar, "<set-?>");
        f98664h = aVar;
    }

    public final void n(int i10) {
        f98667k = i10;
    }

    public final void o(@NotNull List<Map<String, Object>> list) {
        Intrinsics.checkNotNullParameter(list, "<set-?>");
        f98665i = list;
    }
}
