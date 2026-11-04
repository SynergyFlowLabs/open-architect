package com.facebook;

import android.content.Context;
import android.graphics.Bitmap;
import android.location.Location;
import android.net.Uri;
import android.os.Bundle;
import android.os.Handler;
import android.os.Parcel;
import android.os.ParcelFileDescriptor;
import android.os.Parcelable;
import android.text.TextUtils;
import android.util.Pair;
import androidx.annotation.l1;
import com.activeandroid.annotation.Table;
import com.devtodev.core.network.Request;
import com.google.firebase.perf.network.FirebasePerfUrlConnection;
import java.io.BufferedOutputStream;
import java.io.Closeable;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;
import java.net.URLConnection;
import java.net.URLEncoder;
import java.nio.charset.Charset;
import java.security.SecureRandom;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Date;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import java.util.zip.GZIPOutputStream;
import kotlin.collections.ArraysKt;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.q1;
import kotlin.text.Charsets;
import kotlin.text.StringsKt;
import kotlinx.serialization.json.internal.AbstractJsonLexerKt;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes4.dex */
public final class GraphRequest {

    @NotNull
    private static final String A = "format";

    @NotNull
    private static final String B = "json";

    @NotNull
    private static final String C = "sdk";

    @NotNull
    private static final String D = "android";

    @NotNull
    public static final String E = "access_token";

    @NotNull
    private static final String F = "name";

    @NotNull
    private static final String G = "omit_response_on_success";

    @NotNull
    private static final String H = "depends_on";

    @NotNull
    private static final String I = "batch_app_id";

    @NotNull
    private static final String J = "relative_url";

    @NotNull
    private static final String K = "body";

    @NotNull
    private static final String L = "method";

    @NotNull
    private static final String M = "batch";

    @NotNull
    private static final String N = "file";

    @NotNull
    private static final String O = "attached_files";

    @NotNull
    private static final String P = "yyyy-MM-dd'T'HH:mm:ssZ";

    @NotNull
    private static final String Q = "debug";

    @NotNull
    private static final String R = "info";

    @NotNull
    private static final String S = "warning";

    @NotNull
    private static final String T = "__debug__";

    @NotNull
    private static final String U = "messages";

    @NotNull
    private static final String V = "message";

    @NotNull
    private static final String W = "type";

    @NotNull
    private static final String X = "link";

    @NotNull
    private static final String Y = "picture";

    @NotNull
    private static final String Z = "caption";

    /* JADX INFO: renamed from: a0, reason: collision with root package name */
    @NotNull
    public static final String f98513a0 = "fields";

    /* JADX INFO: renamed from: b0, reason: collision with root package name */
    @NotNull
    private static final String f98514b0;

    /* JADX INFO: renamed from: c0, reason: collision with root package name */
    @Nullable
    private static String f98515c0 = null;

    /* JADX INFO: renamed from: d0, reason: collision with root package name */
    private static final Pattern f98516d0;

    /* JADX INFO: renamed from: e0, reason: collision with root package name */
    @Nullable
    private static volatile String f98517e0 = null;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public static final int f98519o = 50;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    @NotNull
    private static final String f98521q = "/videos";

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    @NotNull
    private static final String f98522r = "me";

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    @NotNull
    private static final String f98523s = "me/friends";

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    @NotNull
    private static final String f98524t = "me/photos";

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    @NotNull
    private static final String f98525u = "search";

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    @NotNull
    private static final String f98526v = "FBAndroidSDK";

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    @NotNull
    private static final String f98527w = "User-Agent";

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    @NotNull
    private static final String f98528x = "Content-Type";

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    @NotNull
    private static final String f98529y = "Accept-Language";

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    @NotNull
    private static final String f98530z = "Content-Encoding";

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @Nullable
    private AccessToken f98531a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @Nullable
    private String f98532b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @Nullable
    private JSONObject f98533c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @Nullable
    private String f98534d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    @Nullable
    private String f98535e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private boolean f98536f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    @NotNull
    private Bundle f98537g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    @Nullable
    private Object f98538h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    @Nullable
    private String f98539i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    @Nullable
    private b f98540j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    @Nullable
    private r0 f98541k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private boolean f98542l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    @Nullable
    private String f98543m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    @NotNull
    public static final c f98518n = new c(null);

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    @oj.f
    public static final String f98520p = GraphRequest.class.getSimpleName();

    public static final class ParcelableResourceWithMimeType<RESOURCE extends Parcelable> implements Parcelable {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        @Nullable
        private final String f98545a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        @Nullable
        private final RESOURCE f98546b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        @NotNull
        public static final b f98544c = new b(null);

        @oj.f
        @NotNull
        public static final Parcelable.Creator<ParcelableResourceWithMimeType<?>> CREATOR = new a();

        public static final class a implements Parcelable.Creator<ParcelableResourceWithMimeType<?>> {
            a() {
            }

            @Override // android.os.Parcelable.Creator
            @NotNull
            /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
            public ParcelableResourceWithMimeType<?> createFromParcel(@NotNull Parcel source) {
                Intrinsics.checkNotNullParameter(source, "source");
                return new ParcelableResourceWithMimeType<>(source, (DefaultConstructorMarker) null);
            }

            @Override // android.os.Parcelable.Creator
            @NotNull
            /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
            public ParcelableResourceWithMimeType<?>[] newArray(int i10) {
                return new ParcelableResourceWithMimeType[i10];
            }
        }

        public static final class b {
            public /* synthetic */ b(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }

            private b() {
            }
        }

        public /* synthetic */ ParcelableResourceWithMimeType(Parcel parcel, DefaultConstructorMarker defaultConstructorMarker) {
            this(parcel);
        }

        @Nullable
        public final RESOURCE a() {
            return this.f98546b;
        }

        @Override // android.os.Parcelable
        public int describeContents() {
            return 1;
        }

        @Nullable
        public final String getMimeType() {
            return this.f98545a;
        }

        @Override // android.os.Parcelable
        public void writeToParcel(@NotNull Parcel out, int i10) {
            Intrinsics.checkNotNullParameter(out, "out");
            out.writeString(this.f98545a);
            out.writeParcelable(this.f98546b, i10);
        }

        public ParcelableResourceWithMimeType(RESOURCE resource, @Nullable String str) {
            this.f98545a = str;
            this.f98546b = resource;
        }

        private ParcelableResourceWithMimeType(Parcel parcel) {
            this.f98545a = parcel.readString();
            g0 g0Var = g0.f99617a;
            this.f98546b = (RESOURCE) parcel.readParcelable(g0.n().getClassLoader());
        }
    }

    private static final class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        @NotNull
        private final GraphRequest f98547a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        @Nullable
        private final Object f98548b;

        public a(@NotNull GraphRequest request, @Nullable Object obj) {
            Intrinsics.checkNotNullParameter(request, "request");
            this.f98547a = request;
            this.f98548b = obj;
        }

        @NotNull
        public final GraphRequest a() {
            return this.f98547a;
        }

        @Nullable
        public final Object b() {
            return this.f98548b;
        }
    }

    public interface b {
        void a(@NotNull q0 q0Var);
    }

    public static final class c {

        public static final class a implements b {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            final /* synthetic */ d f98549a;

            a(d dVar) {
                this.f98549a = dVar;
            }

            @Override // com.facebook.GraphRequest.b
            public void a(@NotNull q0 response) {
                JSONArray jSONArrayOptJSONArray;
                Intrinsics.checkNotNullParameter(response, "response");
                if (this.f98549a != null) {
                    JSONObject jSONObjectI = response.i();
                    if (jSONObjectI == null) {
                        jSONArrayOptJSONArray = null;
                        int i10 = 3 << 0;
                    } else {
                        jSONArrayOptJSONArray = jSONObjectI.optJSONArray("data");
                    }
                    this.f98549a.a(jSONArrayOptJSONArray, response);
                }
            }
        }

        public /* synthetic */ c(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private final boolean A(p0 p0Var) {
            for (GraphRequest graphRequest : p0Var) {
                Iterator<String> it = graphRequest.K().keySet().iterator();
                while (it.hasNext()) {
                    if (C(graphRequest.K().get(it.next()))) {
                        return false;
                    }
                }
            }
            return true;
        }

        private final boolean B(String str) {
            Matcher matcher = GraphRequest.f98516d0.matcher(str);
            if (matcher.matches()) {
                str = matcher.group(1);
                Intrinsics.checkNotNullExpressionValue(str, "matcher.group(1)");
            }
            if (!StringsKt.u2(str, "me/", false, 2, null) && !StringsKt.u2(str, "/me/", false, 2, null)) {
                return false;
            }
            return true;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public final boolean C(Object obj) {
            return (obj instanceof Bitmap) || (obj instanceof byte[]) || (obj instanceof Uri) || (obj instanceof ParcelFileDescriptor) || (obj instanceof ParcelableResourceWithMimeType);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public final boolean D(Object obj) {
            return (obj instanceof String) || (obj instanceof Boolean) || (obj instanceof Number) || (obj instanceof Date);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final void J(e eVar, q0 response) {
            Intrinsics.checkNotNullParameter(response, "response");
            if (eVar == null) {
                return;
            }
            eVar.a(response.i(), response);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final void M(d dVar, q0 response) {
            Intrinsics.checkNotNullParameter(response, "response");
            if (dVar != null) {
                JSONObject jSONObjectI = response.i();
                dVar.a(jSONObjectI == null ? null : jSONObjectI.optJSONArray("data"), response);
            }
        }

        /* JADX INFO: Access modifiers changed from: private */
        public final String S(Object obj) {
            if (obj instanceof String) {
                return (String) obj;
            }
            if (!(obj instanceof Boolean) && !(obj instanceof Number)) {
                if (!(obj instanceof Date)) {
                    throw new IllegalArgumentException("Unsupported parameter type.");
                }
                String str = new SimpleDateFormat(GraphRequest.P, Locale.US).format((Date) obj);
                Intrinsics.checkNotNullExpressionValue(str, "iso8601DateFormat.format(value)");
                return str;
            }
            return obj.toString();
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* JADX WARN: Code duplicated, block: B:10:0x002a  */
        public final void T(JSONObject jSONObject, String str, f fVar) {
            boolean z10;
            if (B(str)) {
                int iR3 = StringsKt.r3(str, ":", 0, false, 6, null);
                int iR4 = StringsKt.r3(str, com.planner5d.library.model.payments.a.f222474i, 0, false, 6, null);
                if (iR3 <= 3 || (iR4 != -1 && iR3 >= iR4)) {
                    z10 = false;
                } else {
                    z10 = true;
                }
            } else {
                z10 = false;
            }
            Iterator<String> itKeys = jSONObject.keys();
            while (itKeys.hasNext()) {
                String key = itKeys.next();
                Object value = jSONObject.opt(key);
                boolean z11 = z10 && StringsKt.N1(key, "image", true);
                Intrinsics.checkNotNullExpressionValue(key, "key");
                Intrinsics.checkNotNullExpressionValue(value, "value");
                U(key, value, fVar, z11);
            }
        }

        private final void U(String str, Object obj, f fVar, boolean z10) {
            Class<?> cls = obj.getClass();
            if (JSONObject.class.isAssignableFrom(cls)) {
                JSONObject jSONObject = (JSONObject) obj;
                if (z10) {
                    Iterator<String> itKeys = jSONObject.keys();
                    while (itKeys.hasNext()) {
                        String next = itKeys.next();
                        q1 q1Var = q1.f312784a;
                        String str2 = String.format("%s[%s]", Arrays.copyOf(new Object[]{str, next}, 2));
                        Intrinsics.checkNotNullExpressionValue(str2, "java.lang.String.format(format, *args)");
                        Object objOpt = jSONObject.opt(next);
                        Intrinsics.checkNotNullExpressionValue(objOpt, "jsonObject.opt(propertyName)");
                        U(str2, objOpt, fVar, z10);
                    }
                    return;
                }
                if (jSONObject.has("id")) {
                    String strOptString = jSONObject.optString("id");
                    Intrinsics.checkNotNullExpressionValue(strOptString, "jsonObject.optString(\"id\")");
                    U(str, strOptString, fVar, z10);
                    return;
                } else if (jSONObject.has("url")) {
                    String strOptString2 = jSONObject.optString("url");
                    Intrinsics.checkNotNullExpressionValue(strOptString2, "jsonObject.optString(\"url\")");
                    U(str, strOptString2, fVar, z10);
                    return;
                } else {
                    if (jSONObject.has(com.facebook.internal.w0.H0)) {
                        String string = jSONObject.toString();
                        Intrinsics.checkNotNullExpressionValue(string, "jsonObject.toString()");
                        U(str, string, fVar, z10);
                        return;
                    }
                    return;
                }
            }
            if (!JSONArray.class.isAssignableFrom(cls)) {
                if (String.class.isAssignableFrom(cls) || Number.class.isAssignableFrom(cls) || Boolean.class.isAssignableFrom(cls)) {
                    fVar.a(str, obj.toString());
                    return;
                }
                if (Date.class.isAssignableFrom(cls)) {
                    String str3 = new SimpleDateFormat(GraphRequest.P, Locale.US).format((Date) obj);
                    Intrinsics.checkNotNullExpressionValue(str3, "iso8601DateFormat.format(date)");
                    fVar.a(str, str3);
                    return;
                }
                com.facebook.internal.e1 e1Var = com.facebook.internal.e1.f99794a;
                com.facebook.internal.e1.g0(GraphRequest.f98520p, "The type of property " + str + " in the graph object is unknown. It won't be sent in the request.");
                return;
            }
            JSONArray jSONArray = (JSONArray) obj;
            int length = jSONArray.length();
            if (length <= 0) {
                return;
            }
            int i10 = 0;
            while (true) {
                int i11 = i10 + 1;
                q1 q1Var2 = q1.f312784a;
                String str4 = String.format(Locale.ROOT, "%s[%d]", Arrays.copyOf(new Object[]{str, Integer.valueOf(i10)}, 2));
                Intrinsics.checkNotNullExpressionValue(str4, "java.lang.String.format(locale, format, *args)");
                Object objOpt2 = jSONArray.opt(i10);
                Intrinsics.checkNotNullExpressionValue(objOpt2, "jsonArray.opt(i)");
                U(str4, objOpt2, fVar, z10);
                if (i11 >= length) {
                    return;
                } else {
                    i10 = i11;
                }
            }
        }

        private final void V(p0 p0Var, com.facebook.internal.t0 t0Var, int i10, URL url, OutputStream outputStream, boolean z10) throws Throwable {
            h hVar = new h(outputStream, t0Var, z10);
            if (i10 != 1) {
                String strT = t(p0Var);
                if (strT.length() == 0) {
                    throw new u("App ID was not specified at the request or Settings.");
                }
                hVar.a(GraphRequest.I, strT);
                HashMap map = new HashMap();
                a0(hVar, p0Var, map);
                if (t0Var != null) {
                    t0Var.b("  Attachments:\n");
                }
                Y(map, hVar);
                return;
            }
            GraphRequest graphRequestR = p0Var.get(0);
            HashMap map2 = new HashMap();
            for (String key : graphRequestR.K().keySet()) {
                Object obj = graphRequestR.K().get(key);
                if (C(obj)) {
                    Intrinsics.checkNotNullExpressionValue(key, "key");
                    map2.put(key, new a(graphRequestR, obj));
                }
            }
            if (t0Var != null) {
                t0Var.b("  Parameters:\n");
            }
            Z(graphRequestR.K(), hVar, graphRequestR);
            if (t0Var != null) {
                t0Var.b("  Attachments:\n");
            }
            Y(map2, hVar);
            JSONObject jSONObjectG = graphRequestR.G();
            if (jSONObjectG != null) {
                String path = url.getPath();
                Intrinsics.checkNotNullExpressionValue(path, "url.path");
                T(jSONObjectG, path, hVar);
            }
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final void X(ArrayList callbacks, p0 requests) {
            Intrinsics.checkNotNullParameter(callbacks, "$callbacks");
            Intrinsics.checkNotNullParameter(requests, "$requests");
            Iterator it = callbacks.iterator();
            while (it.hasNext()) {
                Pair pair = (Pair) it.next();
                b bVar = (b) pair.first;
                Object obj = pair.second;
                Intrinsics.checkNotNullExpressionValue(obj, "pair.second");
                bVar.a((q0) obj);
            }
            Iterator<p0.a> it2 = requests.u().iterator();
            while (it2.hasNext()) {
                it2.next().a(requests);
            }
        }

        private final void Y(Map<String, a> map, h hVar) throws Throwable {
            for (Map.Entry<String, a> entry : map.entrySet()) {
                if (GraphRequest.f98518n.C(entry.getValue().b())) {
                    hVar.j(entry.getKey(), entry.getValue().b(), entry.getValue().a());
                }
            }
        }

        private final void Z(Bundle bundle, h hVar, GraphRequest graphRequest) throws Throwable {
            for (String key : bundle.keySet()) {
                Object obj = bundle.get(key);
                if (D(obj)) {
                    Intrinsics.checkNotNullExpressionValue(key, "key");
                    hVar.j(key, obj, graphRequest);
                }
            }
        }

        private final void a0(h hVar, Collection<GraphRequest> collection, Map<String, a> map) throws JSONException, IOException {
            JSONArray jSONArray = new JSONArray();
            Iterator<GraphRequest> it = collection.iterator();
            while (it.hasNext()) {
                it.next().f0(jSONArray, map);
            }
            hVar.l(GraphRequest.M, jSONArray, collection);
        }

        private final void c0(HttpURLConnection httpURLConnection, boolean z10) {
            if (!z10) {
                httpURLConnection.setRequestProperty("Content-Type", w());
            } else {
                httpURLConnection.setRequestProperty("Content-Type", "application/x-www-form-urlencoded");
                httpURLConnection.setRequestProperty("Content-Encoding", "gzip");
            }
        }

        private final HttpURLConnection h(URL url) throws IOException {
            URLConnection uRLConnection = (URLConnection) FirebasePerfUrlConnection.instrument(url.openConnection());
            if (uRLConnection == null) {
                throw new NullPointerException("null cannot be cast to non-null type java.net.HttpURLConnection");
            }
            HttpURLConnection httpURLConnection = (HttpURLConnection) uRLConnection;
            httpURLConnection.setRequestProperty("User-Agent", y());
            httpURLConnection.setRequestProperty("Accept-Language", Locale.getDefault().toString());
            httpURLConnection.setChunkedStreamingMode(0);
            return httpURLConnection;
        }

        private final String t(p0 p0Var) {
            String strS = p0Var.s();
            if (strS != null && !p0Var.isEmpty()) {
                return strS;
            }
            Iterator<GraphRequest> it = p0Var.iterator();
            while (it.hasNext()) {
                AccessToken accessTokenY = it.next().y();
                if (accessTokenY != null) {
                    return accessTokenY.i();
                }
            }
            String str = GraphRequest.f98515c0;
            if (str != null && str.length() > 0) {
                return str;
            }
            g0 g0Var = g0.f99617a;
            return g0.o();
        }

        private final String v(String str) {
            return str == null ? GraphRequest.f98524t : str;
        }

        private final String w() {
            q1 q1Var = q1.f312784a;
            String str = String.format("multipart/form-data; boundary=%s", Arrays.copyOf(new Object[]{GraphRequest.f98514b0}, 1));
            Intrinsics.checkNotNullExpressionValue(str, "java.lang.String.format(format, *args)");
            return str;
        }

        @l1(otherwise = 2)
        public static /* synthetic */ void x() {
        }

        private final String y() {
            if (GraphRequest.f98517e0 == null) {
                q1 q1Var = q1.f312784a;
                String str = String.format("%s.%s", Arrays.copyOf(new Object[]{GraphRequest.f98526v, i0.f99656b}, 2));
                Intrinsics.checkNotNullExpressionValue(str, "java.lang.String.format(format, *args)");
                GraphRequest.f98517e0 = str;
                com.facebook.internal.q0 q0Var = com.facebook.internal.q0.f100060a;
                String strA = com.facebook.internal.q0.a();
                com.facebook.internal.e1 e1Var = com.facebook.internal.e1.f99794a;
                if (!com.facebook.internal.e1.Z(strA)) {
                    String str2 = String.format(Locale.ROOT, "%s/%s", Arrays.copyOf(new Object[]{GraphRequest.f98517e0, strA}, 2));
                    Intrinsics.checkNotNullExpressionValue(str2, "java.lang.String.format(locale, format, *args)");
                    GraphRequest.f98517e0 = str2;
                }
            }
            return GraphRequest.f98517e0;
        }

        private final boolean z(p0 p0Var) {
            Iterator<p0.a> it = p0Var.u().iterator();
            while (it.hasNext()) {
                if (it.next() instanceof p0.c) {
                    return true;
                }
            }
            Iterator<GraphRequest> it2 = p0Var.iterator();
            while (it2.hasNext()) {
                if (it2.next().D() instanceof g) {
                    return true;
                }
            }
            return false;
        }

        @oj.n
        @NotNull
        public final GraphRequest E(@Nullable AccessToken accessToken, @NotNull Context context, @Nullable b bVar) {
            Intrinsics.checkNotNullParameter(context, "context");
            return F(accessToken, context, null, bVar);
        }

        @oj.n
        @NotNull
        public final GraphRequest F(@Nullable AccessToken accessToken, @NotNull Context context, @Nullable String str, @Nullable b bVar) {
            Intrinsics.checkNotNullParameter(context, "context");
            if (str == null && accessToken != null) {
                str = accessToken.i();
            }
            if (str == null) {
                com.facebook.internal.e1 e1Var = com.facebook.internal.e1.f99794a;
                str = com.facebook.internal.e1.F(context);
            }
            if (str == null) {
                throw new u("Facebook App ID cannot be determined");
            }
            String strStringPlus = Intrinsics.stringPlus(str, "/custom_audience_third_party_id");
            com.facebook.internal.c cVarF = com.facebook.internal.c.f99760f.f(context);
            Bundle bundle = new Bundle();
            if (accessToken == null) {
                if (cVarF == null) {
                    throw new u("There is no access token and attribution identifiers could not be retrieved");
                }
                String strJ = cVarF.j() != null ? cVarF.j() : cVarF.h();
                if (strJ != null) {
                    bundle.putString("udid", strJ);
                }
            }
            g0 g0Var = g0.f99617a;
            if (g0.E(context) || (cVarF != null && cVarF.l())) {
                bundle.putString("limit_event_usage", "1");
            }
            return new GraphRequest(accessToken, strStringPlus, bundle, r0.GET, bVar, null, 32, null);
        }

        @oj.n
        @NotNull
        public final GraphRequest G(@Nullable AccessToken accessToken, @Nullable String str, @Nullable b bVar) {
            return new GraphRequest(accessToken, str, null, r0.DELETE, bVar, null, 32, null);
        }

        @oj.n
        @NotNull
        public final GraphRequest H(@Nullable AccessToken accessToken, @Nullable String str, @Nullable b bVar) {
            return new GraphRequest(accessToken, str, null, null, bVar, null, 32, null);
        }

        @oj.n
        @NotNull
        public final GraphRequest I(@Nullable AccessToken accessToken, @Nullable final e eVar) {
            return new GraphRequest(accessToken, GraphRequest.f98522r, null, null, new b() { // from class: com.facebook.m0
                @Override // com.facebook.GraphRequest.b
                public final void a(q0 q0Var) {
                    GraphRequest.c.J(eVar, q0Var);
                }
            }, null, 32, null);
        }

        @oj.n
        @NotNull
        public final GraphRequest K(@Nullable AccessToken accessToken, @Nullable d dVar) {
            return new GraphRequest(accessToken, GraphRequest.f98523s, null, null, new a(dVar), null, 32, null);
        }

        @oj.n
        @NotNull
        public final GraphRequest L(@Nullable AccessToken accessToken, @Nullable Location location, int i10, int i11, @Nullable String str, @Nullable final d dVar) {
            if (location == null) {
                com.facebook.internal.e1 e1Var = com.facebook.internal.e1.f99794a;
                if (com.facebook.internal.e1.Z(str)) {
                    throw new u("Either location or searchText must be specified.");
                }
            }
            Bundle bundle = new Bundle(5);
            bundle.putString("type", "place");
            bundle.putInt("limit", i11);
            if (location != null) {
                q1 q1Var = q1.f312784a;
                String str2 = String.format(Locale.US, "%f,%f", Arrays.copyOf(new Object[]{Double.valueOf(location.getLatitude()), Double.valueOf(location.getLongitude())}, 2));
                Intrinsics.checkNotNullExpressionValue(str2, "java.lang.String.format(locale, format, *args)");
                bundle.putString("center", str2);
                bundle.putInt("distance", i10);
            }
            com.facebook.internal.e1 e1Var2 = com.facebook.internal.e1.f99794a;
            if (!com.facebook.internal.e1.Z(str)) {
                bundle.putString("q", str);
            }
            return new GraphRequest(accessToken, "search", bundle, r0.GET, new b() { // from class: com.facebook.l0
                @Override // com.facebook.GraphRequest.b
                public final void a(q0 q0Var) {
                    GraphRequest.c.M(dVar, q0Var);
                }
            }, null, 32, null);
        }

        @oj.n
        @NotNull
        public final GraphRequest N(@Nullable AccessToken accessToken, @Nullable String str, @Nullable JSONObject jSONObject, @Nullable b bVar) {
            GraphRequest graphRequest = new GraphRequest(accessToken, str, null, r0.POST, bVar, null, 32, null);
            graphRequest.o0(jSONObject);
            return graphRequest;
        }

        @oj.n
        @NotNull
        public final GraphRequest O(@Nullable AccessToken accessToken, @Nullable String str, @Nullable Bundle bundle, @Nullable b bVar) {
            return new GraphRequest(accessToken, str, bundle, r0.POST, bVar, null, 32, null);
        }

        @oj.n
        @NotNull
        public final GraphRequest P(@Nullable AccessToken accessToken, @Nullable String str, @NotNull Bitmap image, @Nullable String str2, @Nullable Bundle bundle, @Nullable b bVar) {
            Intrinsics.checkNotNullParameter(image, "image");
            Bundle bundle2 = new Bundle();
            if (bundle != null) {
                bundle2.putAll(bundle);
            }
            bundle2.putParcelable("picture", image);
            if (str2 != null && str2.length() > 0) {
                bundle2.putString("caption", str2);
            }
            return new GraphRequest(accessToken, v(str), bundle2, r0.POST, bVar, null, 32, null);
        }

        @oj.n
        @NotNull
        public final GraphRequest Q(@Nullable AccessToken accessToken, @Nullable String str, @NotNull Uri photoUri, @Nullable String str2, @Nullable Bundle bundle, @Nullable b bVar) throws u, FileNotFoundException {
            Intrinsics.checkNotNullParameter(photoUri, "photoUri");
            com.facebook.internal.e1 e1Var = com.facebook.internal.e1.f99794a;
            if (com.facebook.internal.e1.X(photoUri)) {
                return R(accessToken, str, new File(photoUri.getPath()), str2, bundle, bVar);
            }
            if (!com.facebook.internal.e1.U(photoUri)) {
                throw new u("The photo Uri must be either a file:// or content:// Uri");
            }
            Bundle bundle2 = new Bundle();
            if (bundle != null) {
                bundle2.putAll(bundle);
            }
            bundle2.putParcelable("picture", photoUri);
            if (str2 != null && str2.length() > 0) {
                bundle2.putString("caption", str2);
            }
            return new GraphRequest(accessToken, v(str), bundle2, r0.POST, bVar, null, 32, null);
        }

        @oj.n
        @NotNull
        public final GraphRequest R(@Nullable AccessToken accessToken, @Nullable String str, @NotNull File file, @Nullable String str2, @Nullable Bundle bundle, @Nullable b bVar) throws FileNotFoundException {
            Intrinsics.checkNotNullParameter(file, "file");
            ParcelFileDescriptor parcelFileDescriptorOpen = ParcelFileDescriptor.open(file, 268435456);
            Bundle bundle2 = new Bundle();
            if (bundle != null) {
                bundle2.putAll(bundle);
            }
            bundle2.putParcelable("picture", parcelFileDescriptorOpen);
            if (str2 != null && str2.length() > 0) {
                bundle2.putString("caption", str2);
            }
            return new GraphRequest(accessToken, v(str), bundle2, r0.POST, bVar, null, 32, null);
        }

        @oj.n
        public final void W(@NotNull final p0 requests, @NotNull List<q0> responses) {
            Intrinsics.checkNotNullParameter(requests, "requests");
            Intrinsics.checkNotNullParameter(responses, "responses");
            int size = requests.size();
            final ArrayList arrayList = new ArrayList();
            if (size > 0) {
                int i10 = 0;
                while (true) {
                    int i11 = i10 + 1;
                    GraphRequest graphRequestR = requests.get(i10);
                    if (graphRequestR.D() != null) {
                        arrayList.add(new Pair(graphRequestR.D(), responses.get(i10)));
                    }
                    if (i11 >= size) {
                        break;
                    } else {
                        i10 = i11;
                    }
                }
            }
            if (arrayList.size() > 0) {
                Runnable runnable = new Runnable() { // from class: com.facebook.n0
                    @Override // java.lang.Runnable
                    public final void run() {
                        GraphRequest.c.X(arrayList, requests);
                    }
                };
                Handler handlerT = requests.t();
                if ((handlerT == null ? null : Boolean.valueOf(handlerT.post(runnable))) == null) {
                    runnable.run();
                }
            }
        }

        /* JADX WARN: Code duplicated, block: B:42:0x012e  */
        /* JADX WARN: Code duplicated, block: B:56:? A[SYNTHETIC] */
        @oj.n
        public final void b0(@NotNull p0 requests, @NotNull HttpURLConnection connection) throws Throwable {
            Throwable th2;
            OutputStream outputStream;
            URL url;
            c cVar;
            OutputStream a1Var;
            p0 p0Var;
            Intrinsics.checkNotNullParameter(requests, "requests");
            Intrinsics.checkNotNullParameter(connection, "connection");
            com.facebook.internal.t0 t0Var = new com.facebook.internal.t0(t0.REQUESTS, Request.TAG);
            int size = requests.size();
            boolean zA = A(requests);
            OutputStream outputStream2 = null;
            r0 r0VarJ = size == 1 ? requests.get(0).J() : null;
            if (r0VarJ == null) {
                r0VarJ = r0.POST;
            }
            connection.setRequestMethod(r0VarJ.name());
            c0(connection, zA);
            URL url2 = connection.getURL();
            t0Var.b("Request:\n");
            t0Var.e(Table.DEFAULT_ID_NAME, requests.v());
            Intrinsics.checkNotNullExpressionValue(url2, "url");
            t0Var.e("URL", url2);
            String requestMethod = connection.getRequestMethod();
            Intrinsics.checkNotNullExpressionValue(requestMethod, "connection.requestMethod");
            t0Var.e("Method", requestMethod);
            String requestProperty = connection.getRequestProperty("User-Agent");
            Intrinsics.checkNotNullExpressionValue(requestProperty, "connection.getRequestProperty(\"User-Agent\")");
            t0Var.e("User-Agent", requestProperty);
            String requestProperty2 = connection.getRequestProperty("Content-Type");
            Intrinsics.checkNotNullExpressionValue(requestProperty2, "connection.getRequestProperty(\"Content-Type\")");
            t0Var.e("Content-Type", requestProperty2);
            connection.setConnectTimeout(requests.B());
            connection.setReadTimeout(requests.B());
            if (r0VarJ != r0.POST) {
                t0Var.h();
                return;
            }
            connection.setDoOutput(true);
            try {
                OutputStream bufferedOutputStream = new BufferedOutputStream(connection.getOutputStream());
                if (zA) {
                    try {
                        bufferedOutputStream = new GZIPOutputStream(bufferedOutputStream);
                    } catch (Throwable th3) {
                        th2 = th3;
                        outputStream2 = bufferedOutputStream;
                        if (outputStream2 == null) {
                            throw th2;
                        }
                        outputStream2.close();
                        throw th2;
                    }
                }
                try {
                    if (z(requests)) {
                        y0 y0Var = new y0(requests.t());
                        V(requests, null, size, url2, y0Var, zA);
                        cVar = this;
                        url = url2;
                        OutputStream outputStream3 = bufferedOutputStream;
                        try {
                            a1Var = new a1(outputStream3, requests, y0Var.d(), y0Var.c());
                            p0Var = requests;
                            zA = zA;
                            size = size;
                        } catch (Throwable th4) {
                            th = th4;
                            outputStream = outputStream3;
                            th2 = th;
                            outputStream2 = outputStream;
                            if (outputStream2 == null) {
                                throw th2;
                            }
                            outputStream2.close();
                            throw th2;
                        }
                    } else {
                        url = url2;
                        cVar = this;
                        a1Var = bufferedOutputStream;
                        p0Var = requests;
                    }
                    try {
                        cVar.V(p0Var, t0Var, size, url, a1Var, zA);
                        a1Var.close();
                        t0Var.h();
                    } catch (Throwable th5) {
                        th = th5;
                        outputStream2 = a1Var;
                        th2 = th;
                        if (outputStream2 == null) {
                            throw th2;
                        }
                        outputStream2.close();
                        throw th2;
                    }
                } catch (Throwable th6) {
                    th = th6;
                    outputStream = bufferedOutputStream;
                }
            } catch (Throwable th7) {
                th = th7;
            }
        }

        @oj.n
        public final void d0(@Nullable String str) {
            GraphRequest.f98515c0 = str;
        }

        @oj.n
        @NotNull
        public final HttpURLConnection e0(@NotNull p0 requests) throws Throwable {
            URL url;
            Intrinsics.checkNotNullParameter(requests, "requests");
            h0(requests);
            try {
                if (requests.size() == 1) {
                    url = new URL(requests.get(0).N());
                } else {
                    com.facebook.internal.z0 z0Var = com.facebook.internal.z0.f100267a;
                    url = new URL(com.facebook.internal.z0.h());
                }
                HttpURLConnection httpURLConnectionH = null;
                try {
                    httpURLConnectionH = h(url);
                    b0(requests, httpURLConnectionH);
                    return httpURLConnectionH;
                } catch (IOException e10) {
                    com.facebook.internal.e1 e1Var = com.facebook.internal.e1.f99794a;
                    com.facebook.internal.e1.q(httpURLConnectionH);
                    throw new u("could not construct request body", e10);
                } catch (JSONException e11) {
                    com.facebook.internal.e1 e1Var2 = com.facebook.internal.e1.f99794a;
                    com.facebook.internal.e1.q(httpURLConnectionH);
                    throw new u("could not construct request body", e11);
                }
            } catch (MalformedURLException e12) {
                throw new u("could not construct URL for request", e12);
            }
        }

        @oj.n
        @NotNull
        public final HttpURLConnection f0(@NotNull Collection<GraphRequest> requests) {
            Intrinsics.checkNotNullParameter(requests, "requests");
            com.facebook.internal.f1 f1Var = com.facebook.internal.f1.f99837a;
            com.facebook.internal.f1.q(requests, "requests");
            return e0(new p0(requests));
        }

        @oj.n
        @NotNull
        public final HttpURLConnection g0(@NotNull GraphRequest... requests) {
            Intrinsics.checkNotNullParameter(requests, "requests");
            return f0(ArraysKt.toList(requests));
        }

        @oj.n
        public final void h0(@NotNull p0 requests) {
            Intrinsics.checkNotNullParameter(requests, "requests");
            for (GraphRequest graphRequest : requests) {
                if (r0.GET == graphRequest.J()) {
                    com.facebook.internal.e1 e1Var = com.facebook.internal.e1.f99794a;
                    if (com.facebook.internal.e1.Z(graphRequest.K().getString(GraphRequest.f98513a0))) {
                        com.facebook.internal.t0.a aVar = com.facebook.internal.t0.f100109e;
                        t0 t0Var = t0.DEVELOPER_ERRORS;
                        StringBuilder sb2 = new StringBuilder();
                        sb2.append("GET requests for /");
                        String strH = graphRequest.H();
                        if (strH == null) {
                            strH = "";
                        }
                        sb2.append(strH);
                        sb2.append(" should contain an explicit \"fields\" parameter.");
                        aVar.b(t0Var, 5, Request.TAG, sb2.toString());
                    }
                }
            }
        }

        @oj.n
        @NotNull
        public final q0 i(@NotNull GraphRequest request) {
            Intrinsics.checkNotNullParameter(request, "request");
            List<q0> listL = l(request);
            if (listL.size() == 1) {
                return listL.get(0);
            }
            throw new u("invalid state: expected a single response");
        }

        @oj.n
        @NotNull
        public final List<q0> j(@NotNull p0 requests) throws Throwable {
            Exception exc;
            HttpURLConnection httpURLConnectionE0;
            List<q0> listP;
            Intrinsics.checkNotNullParameter(requests, "requests");
            com.facebook.internal.f1 f1Var = com.facebook.internal.f1.f99837a;
            com.facebook.internal.f1.r(requests, "requests");
            HttpURLConnection httpURLConnection = null;
            try {
                httpURLConnectionE0 = e0(requests);
                exc = null;
            } catch (Exception e10) {
                exc = e10;
                httpURLConnectionE0 = null;
            } catch (Throwable th2) {
                th = th2;
                com.facebook.internal.e1 e1Var = com.facebook.internal.e1.f99794a;
                com.facebook.internal.e1.q(httpURLConnection);
                throw th;
            }
            try {
                if (httpURLConnectionE0 != null) {
                    listP = p(httpURLConnectionE0, requests);
                } else {
                    List<q0> listA = q0.f101746i.a(requests.w(), null, new u(exc));
                    W(requests, listA);
                    listP = listA;
                }
                com.facebook.internal.e1 e1Var2 = com.facebook.internal.e1.f99794a;
                com.facebook.internal.e1.q(httpURLConnectionE0);
                return listP;
            } catch (Throwable th3) {
                th = th3;
                httpURLConnection = httpURLConnectionE0;
                com.facebook.internal.e1 e1Var3 = com.facebook.internal.e1.f99794a;
                com.facebook.internal.e1.q(httpURLConnection);
                throw th;
            }
        }

        @oj.n
        @NotNull
        public final List<q0> k(@NotNull Collection<GraphRequest> requests) {
            Intrinsics.checkNotNullParameter(requests, "requests");
            return j(new p0(requests));
        }

        @oj.n
        @NotNull
        public final List<q0> l(@NotNull GraphRequest... requests) {
            Intrinsics.checkNotNullParameter(requests, "requests");
            return k(ArraysKt.toList(requests));
        }

        @oj.n
        @NotNull
        public final o0 m(@NotNull p0 requests) {
            Intrinsics.checkNotNullParameter(requests, "requests");
            com.facebook.internal.f1 f1Var = com.facebook.internal.f1.f99837a;
            com.facebook.internal.f1.r(requests, "requests");
            o0 o0Var = new o0(requests);
            g0 g0Var = g0.f99617a;
            o0Var.executeOnExecutor(g0.y(), new Void[0]);
            return o0Var;
        }

        @oj.n
        @NotNull
        public final o0 n(@NotNull Collection<GraphRequest> requests) {
            Intrinsics.checkNotNullParameter(requests, "requests");
            return m(new p0(requests));
        }

        @oj.n
        @NotNull
        public final o0 o(@NotNull GraphRequest... requests) {
            Intrinsics.checkNotNullParameter(requests, "requests");
            return n(ArraysKt.toList(requests));
        }

        @oj.n
        @NotNull
        public final List<q0> p(@NotNull HttpURLConnection connection, @NotNull p0 requests) {
            Intrinsics.checkNotNullParameter(connection, "connection");
            Intrinsics.checkNotNullParameter(requests, "requests");
            List<q0> listF = q0.f101746i.f(connection, requests);
            com.facebook.internal.e1 e1Var = com.facebook.internal.e1.f99794a;
            com.facebook.internal.e1.q(connection);
            int size = requests.size();
            if (size == listF.size()) {
                W(requests, listF);
                com.facebook.f.f99550f.e().h();
                return listF;
            }
            q1 q1Var = q1.f312784a;
            String str = String.format(Locale.US, "Received %d responses while expecting %d", Arrays.copyOf(new Object[]{Integer.valueOf(listF.size()), Integer.valueOf(size)}, 2));
            Intrinsics.checkNotNullExpressionValue(str, "java.lang.String.format(locale, format, *args)");
            throw new u(str);
        }

        @oj.n
        @NotNull
        public final List<q0> q(@NotNull HttpURLConnection connection, @NotNull Collection<GraphRequest> requests) {
            Intrinsics.checkNotNullParameter(connection, "connection");
            Intrinsics.checkNotNullParameter(requests, "requests");
            return p(connection, new p0(requests));
        }

        @oj.n
        @NotNull
        public final o0 r(@Nullable Handler handler, @NotNull HttpURLConnection connection, @NotNull p0 requests) {
            Intrinsics.checkNotNullParameter(connection, "connection");
            Intrinsics.checkNotNullParameter(requests, "requests");
            o0 o0Var = new o0(connection, requests);
            requests.N(handler);
            g0 g0Var = g0.f99617a;
            o0Var.executeOnExecutor(g0.y(), new Void[0]);
            return o0Var;
        }

        @oj.n
        @NotNull
        public final o0 s(@NotNull HttpURLConnection connection, @NotNull p0 requests) {
            Intrinsics.checkNotNullParameter(connection, "connection");
            Intrinsics.checkNotNullParameter(requests, "requests");
            return r(null, connection, requests);
        }

        @oj.n
        @Nullable
        public final String u() {
            return GraphRequest.f98515c0;
        }

        private c() {
        }
    }

    public interface d {
        void a(@Nullable JSONArray jSONArray, @Nullable q0 q0Var);
    }

    public interface e {
        void a(@Nullable JSONObject jSONObject, @Nullable q0 q0Var);
    }

    private interface f {
        void a(@NotNull String str, @NotNull String str2);
    }

    public interface g extends b {
        void b(long j10, long j11);
    }

    private static final class h implements f {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        @NotNull
        private final OutputStream f98550a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        @Nullable
        private final com.facebook.internal.t0 f98551b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private boolean f98552c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private final boolean f98553d;

        public h(@NotNull OutputStream outputStream, @Nullable com.facebook.internal.t0 t0Var, boolean z10) {
            Intrinsics.checkNotNullParameter(outputStream, "outputStream");
            this.f98550a = outputStream;
            this.f98551b = t0Var;
            this.f98552c = true;
            this.f98553d = z10;
        }

        private final RuntimeException b() {
            return new IllegalArgumentException("value is not a supported type.");
        }

        @Override // com.facebook.GraphRequest.f
        public void a(@NotNull String key, @NotNull String value) throws IOException {
            Intrinsics.checkNotNullParameter(key, "key");
            Intrinsics.checkNotNullParameter(value, "value");
            f(key, null, null);
            i("%s", value);
            k();
            com.facebook.internal.t0 t0Var = this.f98551b;
            if (t0Var == null) {
                return;
            }
            t0Var.e(Intrinsics.stringPlus("    ", key), value);
        }

        public final void c(@NotNull String format, @NotNull Object... args) throws IOException {
            Intrinsics.checkNotNullParameter(format, "format");
            Intrinsics.checkNotNullParameter(args, "args");
            if (this.f98553d) {
                OutputStream outputStream = this.f98550a;
                q1 q1Var = q1.f312784a;
                Locale locale = Locale.US;
                Object[] objArrCopyOf = Arrays.copyOf(args, args.length);
                String str = String.format(locale, format, Arrays.copyOf(objArrCopyOf, objArrCopyOf.length));
                Intrinsics.checkNotNullExpressionValue(str, "java.lang.String.format(locale, format, *args)");
                String strEncode = URLEncoder.encode(str, "UTF-8");
                Intrinsics.checkNotNullExpressionValue(strEncode, "encode(String.format(Locale.US, format, *args), \"UTF-8\")");
                byte[] bytes = strEncode.getBytes(Charsets.UTF_8);
                Intrinsics.checkNotNullExpressionValue(bytes, "(this as java.lang.String).getBytes(charset)");
                outputStream.write(bytes);
                return;
            }
            if (this.f98552c) {
                OutputStream outputStream2 = this.f98550a;
                Charset charset = Charsets.UTF_8;
                byte[] bytes2 = "--".getBytes(charset);
                Intrinsics.checkNotNullExpressionValue(bytes2, "(this as java.lang.String).getBytes(charset)");
                outputStream2.write(bytes2);
                OutputStream outputStream3 = this.f98550a;
                String str2 = GraphRequest.f98514b0;
                if (str2 == null) {
                    throw new NullPointerException("null cannot be cast to non-null type java.lang.String");
                }
                byte[] bytes3 = str2.getBytes(charset);
                Intrinsics.checkNotNullExpressionValue(bytes3, "(this as java.lang.String).getBytes(charset)");
                outputStream3.write(bytes3);
                OutputStream outputStream4 = this.f98550a;
                byte[] bytes4 = "\r\n".getBytes(charset);
                Intrinsics.checkNotNullExpressionValue(bytes4, "(this as java.lang.String).getBytes(charset)");
                outputStream4.write(bytes4);
                this.f98552c = false;
            }
            OutputStream outputStream5 = this.f98550a;
            q1 q1Var2 = q1.f312784a;
            Object[] objArrCopyOf2 = Arrays.copyOf(args, args.length);
            String str3 = String.format(format, Arrays.copyOf(objArrCopyOf2, objArrCopyOf2.length));
            Intrinsics.checkNotNullExpressionValue(str3, "java.lang.String.format(format, *args)");
            byte[] bytes5 = str3.getBytes(Charsets.UTF_8);
            Intrinsics.checkNotNullExpressionValue(bytes5, "(this as java.lang.String).getBytes(charset)");
            outputStream5.write(bytes5);
        }

        public final void d(@NotNull String key, @NotNull Bitmap bitmap) throws IOException {
            Intrinsics.checkNotNullParameter(key, "key");
            Intrinsics.checkNotNullParameter(bitmap, "bitmap");
            f(key, key, androidx.media3.common.s0.X0);
            bitmap.compress(Bitmap.CompressFormat.PNG, 100, this.f98550a);
            i("", new Object[0]);
            k();
            com.facebook.internal.t0 t0Var = this.f98551b;
            if (t0Var == null) {
                return;
            }
            t0Var.e(Intrinsics.stringPlus("    ", key), "<Image>");
        }

        public final void e(@NotNull String key, @NotNull byte[] bytes) throws IOException {
            Intrinsics.checkNotNullParameter(key, "key");
            Intrinsics.checkNotNullParameter(bytes, "bytes");
            f(key, key, "content/unknown");
            this.f98550a.write(bytes);
            i("", new Object[0]);
            k();
            com.facebook.internal.t0 t0Var = this.f98551b;
            if (t0Var == null) {
                return;
            }
            String strStringPlus = Intrinsics.stringPlus("    ", key);
            q1 q1Var = q1.f312784a;
            String str = String.format(Locale.ROOT, "<Data: %d>", Arrays.copyOf(new Object[]{Integer.valueOf(bytes.length)}, 1));
            Intrinsics.checkNotNullExpressionValue(str, "java.lang.String.format(locale, format, *args)");
            t0Var.e(strStringPlus, str);
        }

        public final void f(@Nullable String str, @Nullable String str2, @Nullable String str3) throws IOException {
            if (this.f98553d) {
                OutputStream outputStream = this.f98550a;
                q1 q1Var = q1.f312784a;
                String str4 = String.format("%s=", Arrays.copyOf(new Object[]{str}, 1));
                Intrinsics.checkNotNullExpressionValue(str4, "java.lang.String.format(format, *args)");
                byte[] bytes = str4.getBytes(Charsets.UTF_8);
                Intrinsics.checkNotNullExpressionValue(bytes, "(this as java.lang.String).getBytes(charset)");
                outputStream.write(bytes);
                return;
            }
            c("Content-Disposition: form-data; name=\"%s\"", str);
            if (str2 != null) {
                c("; filename=\"%s\"", str2);
            }
            i("", new Object[0]);
            if (str3 != null) {
                i("%s: %s", "Content-Type", str3);
            }
            i("", new Object[0]);
        }

        public final void g(@NotNull String key, @NotNull Uri contentUri, @Nullable String str) throws Throwable {
            int iP;
            Intrinsics.checkNotNullParameter(key, "key");
            Intrinsics.checkNotNullParameter(contentUri, "contentUri");
            if (str == null) {
                str = "content/unknown";
            }
            f(key, key, str);
            if (this.f98550a instanceof y0) {
                com.facebook.internal.e1 e1Var = com.facebook.internal.e1.f99794a;
                ((y0) this.f98550a).b(com.facebook.internal.e1.x(contentUri));
                iP = 0;
            } else {
                g0 g0Var = g0.f99617a;
                InputStream inputStreamOpenInputStream = g0.n().getContentResolver().openInputStream(contentUri);
                com.facebook.internal.e1 e1Var2 = com.facebook.internal.e1.f99794a;
                iP = com.facebook.internal.e1.p(inputStreamOpenInputStream, this.f98550a);
            }
            i("", new Object[0]);
            k();
            com.facebook.internal.t0 t0Var = this.f98551b;
            if (t0Var == null) {
                return;
            }
            String strStringPlus = Intrinsics.stringPlus("    ", key);
            q1 q1Var = q1.f312784a;
            String str2 = String.format(Locale.ROOT, "<Data: %d>", Arrays.copyOf(new Object[]{Integer.valueOf(iP)}, 1));
            Intrinsics.checkNotNullExpressionValue(str2, "java.lang.String.format(locale, format, *args)");
            t0Var.e(strStringPlus, str2);
        }

        public final void h(@NotNull String key, @NotNull ParcelFileDescriptor descriptor, @Nullable String str) throws Throwable {
            int iP;
            Intrinsics.checkNotNullParameter(key, "key");
            Intrinsics.checkNotNullParameter(descriptor, "descriptor");
            if (str == null) {
                str = "content/unknown";
            }
            f(key, key, str);
            OutputStream outputStream = this.f98550a;
            if (outputStream instanceof y0) {
                ((y0) outputStream).b(descriptor.getStatSize());
                iP = 0;
            } else {
                ParcelFileDescriptor.AutoCloseInputStream autoCloseInputStream = new ParcelFileDescriptor.AutoCloseInputStream(descriptor);
                com.facebook.internal.e1 e1Var = com.facebook.internal.e1.f99794a;
                iP = com.facebook.internal.e1.p(autoCloseInputStream, this.f98550a);
            }
            i("", new Object[0]);
            k();
            com.facebook.internal.t0 t0Var = this.f98551b;
            if (t0Var == null) {
                return;
            }
            String strStringPlus = Intrinsics.stringPlus("    ", key);
            q1 q1Var = q1.f312784a;
            int i10 = 7 << 1;
            String str2 = String.format(Locale.ROOT, "<Data: %d>", Arrays.copyOf(new Object[]{Integer.valueOf(iP)}, 1));
            Intrinsics.checkNotNullExpressionValue(str2, "java.lang.String.format(locale, format, *args)");
            t0Var.e(strStringPlus, str2);
        }

        public final void i(@NotNull String format, @NotNull Object... args) throws IOException {
            Intrinsics.checkNotNullParameter(format, "format");
            Intrinsics.checkNotNullParameter(args, "args");
            c(format, Arrays.copyOf(args, args.length));
            if (this.f98553d) {
                return;
            }
            c("\r\n", new Object[0]);
        }

        public final void j(@NotNull String key, @Nullable Object obj, @Nullable GraphRequest graphRequest) throws Throwable {
            Intrinsics.checkNotNullParameter(key, "key");
            Closeable closeable = this.f98550a;
            if (closeable instanceof b1) {
                ((b1) closeable).a(graphRequest);
            }
            c cVar = GraphRequest.f98518n;
            if (cVar.D(obj)) {
                a(key, cVar.S(obj));
                return;
            }
            if (obj instanceof Bitmap) {
                d(key, (Bitmap) obj);
                return;
            }
            if (obj instanceof byte[]) {
                e(key, (byte[]) obj);
                return;
            }
            if (obj instanceof Uri) {
                g(key, (Uri) obj, null);
                return;
            }
            if (obj instanceof ParcelFileDescriptor) {
                h(key, (ParcelFileDescriptor) obj, null);
                return;
            }
            if (!(obj instanceof ParcelableResourceWithMimeType)) {
                throw b();
            }
            ParcelableResourceWithMimeType parcelableResourceWithMimeType = (ParcelableResourceWithMimeType) obj;
            Parcelable parcelableA = parcelableResourceWithMimeType.a();
            String mimeType = parcelableResourceWithMimeType.getMimeType();
            if (parcelableA instanceof ParcelFileDescriptor) {
                h(key, (ParcelFileDescriptor) parcelableA, mimeType);
            } else {
                if (!(parcelableA instanceof Uri)) {
                    throw b();
                }
                g(key, (Uri) parcelableA, mimeType);
            }
        }

        public final void k() throws IOException {
            if (!this.f98553d) {
                i("--%s", GraphRequest.f98514b0);
                return;
            }
            OutputStream outputStream = this.f98550a;
            byte[] bytes = "&".getBytes(Charsets.UTF_8);
            Intrinsics.checkNotNullExpressionValue(bytes, "(this as java.lang.String).getBytes(charset)");
            outputStream.write(bytes);
        }

        public final void l(@NotNull String key, @NotNull JSONArray requestJsonArray, @NotNull Collection<GraphRequest> requests) throws JSONException, IOException {
            Intrinsics.checkNotNullParameter(key, "key");
            Intrinsics.checkNotNullParameter(requestJsonArray, "requestJsonArray");
            Intrinsics.checkNotNullParameter(requests, "requests");
            Closeable closeable = this.f98550a;
            if (!(closeable instanceof b1)) {
                String string = requestJsonArray.toString();
                Intrinsics.checkNotNullExpressionValue(string, "requestJsonArray.toString()");
                a(key, string);
                return;
            }
            b1 b1Var = (b1) closeable;
            f(key, null, null);
            c("[", new Object[0]);
            int i10 = 0;
            for (GraphRequest graphRequest : requests) {
                int i11 = i10 + 1;
                JSONObject jSONObject = requestJsonArray.getJSONObject(i10);
                b1Var.a(graphRequest);
                if (i10 > 0) {
                    c(",%s", jSONObject.toString());
                } else {
                    c("%s", jSONObject.toString());
                }
                i10 = i11;
            }
            c("]", new Object[0]);
            com.facebook.internal.t0 t0Var = this.f98551b;
            if (t0Var == null) {
                return;
            }
            String strStringPlus = Intrinsics.stringPlus("    ", key);
            String string2 = requestJsonArray.toString();
            Intrinsics.checkNotNullExpressionValue(string2, "requestJsonArray.toString()");
            t0Var.e(strStringPlus, string2);
        }
    }

    public static final class i implements f {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ ArrayList<String> f98554a;

        i(ArrayList<String> arrayList) {
            this.f98554a = arrayList;
        }

        @Override // com.facebook.GraphRequest.f
        public void a(@NotNull String key, @NotNull String value) throws IOException {
            Intrinsics.checkNotNullParameter(key, "key");
            Intrinsics.checkNotNullParameter(value, "value");
            ArrayList<String> arrayList = this.f98554a;
            q1 q1Var = q1.f312784a;
            String str = String.format(Locale.US, "%s=%s", Arrays.copyOf(new Object[]{key, URLEncoder.encode(value, "UTF-8")}, 2));
            Intrinsics.checkNotNullExpressionValue(str, "java.lang.String.format(locale, format, *args)");
            arrayList.add(str);
        }
    }

    static {
        char[] charArray = "-_1234567890abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ".toCharArray();
        Intrinsics.checkNotNullExpressionValue(charArray, "(this as java.lang.String).toCharArray()");
        StringBuilder sb2 = new StringBuilder();
        SecureRandom secureRandom = new SecureRandom();
        int iNextInt = secureRandom.nextInt(11) + 30;
        if (iNextInt > 0) {
            int i10 = 0;
            do {
                i10++;
                sb2.append(charArray[secureRandom.nextInt(charArray.length)]);
            } while (i10 < iNextInt);
        }
        String string = sb2.toString();
        Intrinsics.checkNotNullExpressionValue(string, "buffer.toString()");
        f98514b0 = string;
        f98516d0 = Pattern.compile("^/?v\\d+\\.\\d+/(.*)");
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    @oj.j
    public GraphRequest() {
        this(null, null, null, null, null, null, 63, null);
        boolean z10 = false | false;
    }

    private final String E() {
        g0 g0Var = g0.f99617a;
        String strO = g0.o();
        String strV = g0.v();
        if (strO.length() <= 0 || strV.length() <= 0) {
            com.facebook.internal.e1 e1Var = com.facebook.internal.e1.f99794a;
            com.facebook.internal.e1.g0(f98520p, "Warning: Request without access token missing application ID or client token.");
            return null;
        }
        return strO + '|' + strV;
    }

    @oj.n
    @Nullable
    public static final String F() {
        return f98518n.u();
    }

    private final String I() {
        if (f98516d0.matcher(this.f98532b).matches()) {
            return this.f98532b;
        }
        q1 q1Var = q1.f312784a;
        String str = String.format("%s/%s", Arrays.copyOf(new Object[]{this.f98539i, this.f98532b}, 2));
        Intrinsics.checkNotNullExpressionValue(str, "java.lang.String.format(format, *args)");
        return str;
    }

    private final String O(String str) {
        if (!R()) {
            com.facebook.internal.z0 z0Var = com.facebook.internal.z0.f100267a;
            str = com.facebook.internal.z0.f();
        }
        q1 q1Var = q1.f312784a;
        String str2 = String.format("%s/%s", Arrays.copyOf(new Object[]{str, I()}, 2));
        Intrinsics.checkNotNullExpressionValue(str2, "java.lang.String.format(format, *args)");
        return str2;
    }

    private final boolean Q() {
        if (this.f98532b == null) {
            return false;
        }
        StringBuilder sb2 = new StringBuilder();
        sb2.append("^/?");
        g0 g0Var = g0.f99617a;
        sb2.append(g0.o());
        sb2.append("/?.*");
        return this.f98542l || Pattern.matches(sb2.toString(), this.f98532b) || Pattern.matches("^/?app/?.*", this.f98532b);
    }

    private final boolean R() {
        g0 g0Var = g0.f99617a;
        if (Intrinsics.areEqual(g0.C(), g0.S)) {
            return !Q();
        }
        return true;
    }

    @oj.n
    @NotNull
    public static final GraphRequest S(@Nullable AccessToken accessToken, @NotNull Context context, @Nullable b bVar) {
        return f98518n.E(accessToken, context, bVar);
    }

    @oj.n
    @NotNull
    public static final GraphRequest T(@Nullable AccessToken accessToken, @NotNull Context context, @Nullable String str, @Nullable b bVar) {
        return f98518n.F(accessToken, context, str, bVar);
    }

    @oj.n
    @NotNull
    public static final GraphRequest U(@Nullable AccessToken accessToken, @Nullable String str, @Nullable b bVar) {
        return f98518n.G(accessToken, str, bVar);
    }

    @oj.n
    @NotNull
    public static final GraphRequest V(@Nullable AccessToken accessToken, @Nullable String str, @Nullable b bVar) {
        return f98518n.H(accessToken, str, bVar);
    }

    @oj.n
    @NotNull
    public static final GraphRequest W(@Nullable AccessToken accessToken, @Nullable e eVar) {
        return f98518n.I(accessToken, eVar);
    }

    @oj.n
    @NotNull
    public static final GraphRequest X(@Nullable AccessToken accessToken, @Nullable d dVar) {
        return f98518n.K(accessToken, dVar);
    }

    @oj.n
    @NotNull
    public static final GraphRequest Y(@Nullable AccessToken accessToken, @Nullable Location location, int i10, int i11, @Nullable String str, @Nullable d dVar) {
        return f98518n.L(accessToken, location, i10, i11, str, dVar);
    }

    @oj.n
    @NotNull
    public static final GraphRequest Z(@Nullable AccessToken accessToken, @Nullable String str, @Nullable JSONObject jSONObject, @Nullable b bVar) {
        return f98518n.N(accessToken, str, jSONObject, bVar);
    }

    @oj.n
    @NotNull
    public static final GraphRequest a0(@Nullable AccessToken accessToken, @Nullable String str, @Nullable Bundle bundle, @Nullable b bVar) {
        return f98518n.O(accessToken, str, bundle, bVar);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void b(b bVar, q0 response) {
        int length;
        Intrinsics.checkNotNullParameter(response, "response");
        JSONObject jSONObjectI = response.i();
        JSONObject jSONObjectOptJSONObject = jSONObjectI == null ? null : jSONObjectI.optJSONObject(T);
        JSONArray jSONArrayOptJSONArray = jSONObjectOptJSONObject == null ? null : jSONObjectOptJSONObject.optJSONArray("messages");
        if (jSONArrayOptJSONArray != null && (length = jSONArrayOptJSONArray.length()) > 0) {
            int i10 = 0;
            while (true) {
                int i11 = i10 + 1;
                JSONObject jSONObjectOptJSONObject2 = jSONArrayOptJSONArray.optJSONObject(i10);
                String strOptString = jSONObjectOptJSONObject2 == null ? null : jSONObjectOptJSONObject2.optString("message");
                String strOptString2 = jSONObjectOptJSONObject2 == null ? null : jSONObjectOptJSONObject2.optString("type");
                String strOptString3 = jSONObjectOptJSONObject2 == null ? null : jSONObjectOptJSONObject2.optString("link");
                if (strOptString != null && strOptString2 != null) {
                    t0 t0Var = t0.GRAPH_API_DEBUG_INFO;
                    if (Intrinsics.areEqual(strOptString2, S)) {
                        t0Var = t0.GRAPH_API_DEBUG_WARNING;
                    }
                    com.facebook.internal.e1 e1Var = com.facebook.internal.e1.f99794a;
                    if (!com.facebook.internal.e1.Z(strOptString3)) {
                        strOptString = ((Object) strOptString) + " Link: " + ((Object) strOptString3);
                    }
                    com.facebook.internal.t0.a aVar = com.facebook.internal.t0.f100109e;
                    String TAG = f98520p;
                    Intrinsics.checkNotNullExpressionValue(TAG, "TAG");
                    aVar.d(t0Var, TAG, strOptString);
                }
                if (i11 >= length) {
                    break;
                } else {
                    i10 = i11;
                }
            }
        }
        if (bVar == null) {
            return;
        }
        bVar.a(response);
    }

    @oj.n
    @NotNull
    public static final GraphRequest b0(@Nullable AccessToken accessToken, @Nullable String str, @NotNull Bitmap bitmap, @Nullable String str2, @Nullable Bundle bundle, @Nullable b bVar) {
        return f98518n.P(accessToken, str, bitmap, str2, bundle, bVar);
    }

    @oj.n
    @NotNull
    public static final GraphRequest c0(@Nullable AccessToken accessToken, @Nullable String str, @NotNull Uri uri, @Nullable String str2, @Nullable Bundle bundle, @Nullable b bVar) throws u, FileNotFoundException {
        return f98518n.Q(accessToken, str, uri, str2, bundle, bVar);
    }

    @oj.n
    @NotNull
    public static final GraphRequest d0(@Nullable AccessToken accessToken, @Nullable String str, @NotNull File file, @Nullable String str2, @Nullable Bundle bundle, @Nullable b bVar) throws FileNotFoundException {
        return f98518n.R(accessToken, str, file, str2, bundle, bVar);
    }

    @oj.n
    public static final void e0(@NotNull p0 p0Var, @NotNull List<q0> list) {
        f98518n.W(p0Var, list);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void f0(JSONArray jSONArray, Map<String, a> map) throws JSONException, IOException {
        JSONObject jSONObject = new JSONObject();
        String str = this.f98534d;
        if (str != null) {
            jSONObject.put("name", str);
            jSONObject.put(G, this.f98536f);
        }
        String str2 = this.f98535e;
        if (str2 != null) {
            jSONObject.put(H, str2);
        }
        String strL = L();
        jSONObject.put(J, strL);
        jSONObject.put("method", this.f98541k);
        AccessToken accessToken = this.f98531a;
        if (accessToken != null) {
            com.facebook.internal.t0.f100109e.f(accessToken.t());
        }
        ArrayList arrayList = new ArrayList();
        Iterator<String> it = this.f98537g.keySet().iterator();
        while (it.hasNext()) {
            Object obj = this.f98537g.get(it.next());
            if (f98518n.C(obj)) {
                q1 q1Var = q1.f312784a;
                String str3 = String.format(Locale.ROOT, "%s%d", Arrays.copyOf(new Object[]{"file", Integer.valueOf(map.size())}, 2));
                Intrinsics.checkNotNullExpressionValue(str3, "java.lang.String.format(locale, format, *args)");
                arrayList.add(str3);
                map.put(str3, new a(this, obj));
            }
        }
        if (!arrayList.isEmpty()) {
            jSONObject.put(O, TextUtils.join(",", arrayList));
        }
        JSONObject jSONObject2 = this.f98533c;
        if (jSONObject2 != null) {
            ArrayList arrayList2 = new ArrayList();
            f98518n.T(jSONObject2, strL, new i(arrayList2));
            jSONObject.put("body", TextUtils.join("&", arrayList2));
        }
        jSONArray.put(jSONObject);
    }

    @oj.n
    public static final void g0(@NotNull p0 p0Var, @NotNull HttpURLConnection httpURLConnection) throws Throwable {
        f98518n.b0(p0Var, httpURLConnection);
    }

    private final void j() {
        Bundle bundle = this.f98537g;
        if (u0()) {
            bundle.putString("access_token", E());
        } else {
            String strZ = z();
            if (strZ != null) {
                bundle.putString("access_token", strZ);
            }
        }
        if (!bundle.containsKey("access_token")) {
            com.facebook.internal.e1 e1Var = com.facebook.internal.e1.f99794a;
            g0 g0Var = g0.f99617a;
            com.facebook.internal.e1.Z(g0.v());
        }
        bundle.putString("sdk", "android");
        bundle.putString(A, "json");
        g0 g0Var2 = g0.f99617a;
        if (g0.P(t0.GRAPH_API_DEBUG_INFO)) {
            bundle.putString("debug", R);
        } else {
            if (g0.P(t0.GRAPH_API_DEBUG_WARNING)) {
                bundle.putString("debug", S);
            }
        }
    }

    private final String k(String str, boolean z10) {
        if (!z10 && this.f98541k == r0.POST) {
            return str;
        }
        Uri.Builder builderBuildUpon = Uri.parse(str).buildUpon();
        for (String str2 : this.f98537g.keySet()) {
            Object obj = this.f98537g.get(str2);
            if (obj == null) {
                obj = "";
            }
            c cVar = f98518n;
            if (cVar.D(obj)) {
                builderBuildUpon.appendQueryParameter(str2, cVar.S(obj).toString());
            } else if (this.f98541k != r0.GET) {
                q1 q1Var = q1.f312784a;
                String str3 = String.format(Locale.US, "Unsupported parameter type for GET request: %s", Arrays.copyOf(new Object[]{obj.getClass().getSimpleName()}, 1));
                Intrinsics.checkNotNullExpressionValue(str3, "java.lang.String.format(locale, format, *args)");
                throw new IllegalArgumentException(str3);
            }
        }
        String string = builderBuildUpon.toString();
        Intrinsics.checkNotNullExpressionValue(string, "uriBuilder.toString()");
        return string;
    }

    @oj.n
    @NotNull
    public static final q0 m(@NotNull GraphRequest graphRequest) {
        return f98518n.i(graphRequest);
    }

    @oj.n
    public static final void m0(@Nullable String str) {
        f98518n.d0(str);
    }

    @oj.n
    @NotNull
    public static final List<q0> o(@NotNull p0 p0Var) {
        return f98518n.j(p0Var);
    }

    @oj.n
    @NotNull
    public static final List<q0> p(@NotNull Collection<GraphRequest> collection) {
        return f98518n.k(collection);
    }

    @oj.n
    @NotNull
    public static final List<q0> q(@NotNull GraphRequest... graphRequestArr) {
        return f98518n.l(graphRequestArr);
    }

    @oj.n
    @NotNull
    public static final o0 r(@NotNull p0 p0Var) {
        return f98518n.m(p0Var);
    }

    @oj.n
    @NotNull
    public static final o0 s(@NotNull Collection<GraphRequest> collection) {
        return f98518n.n(collection);
    }

    @oj.n
    @NotNull
    public static final o0 t(@NotNull GraphRequest... graphRequestArr) {
        return f98518n.o(graphRequestArr);
    }

    @oj.n
    @NotNull
    public static final List<q0> u(@NotNull HttpURLConnection httpURLConnection, @NotNull p0 p0Var) {
        return f98518n.p(httpURLConnection, p0Var);
    }

    private final boolean u0() {
        String strZ = z();
        boolean zV2 = strZ == null ? false : StringsKt.V2(strZ, "|", false, 2, null);
        if (strZ == null || !StringsKt.u2(strZ, "IG", false, 2, null) || zV2 || !Q()) {
            return (R() || zV2) ? false : true;
        }
        return true;
    }

    @oj.n
    @NotNull
    public static final List<q0> v(@NotNull HttpURLConnection httpURLConnection, @NotNull Collection<GraphRequest> collection) {
        return f98518n.q(httpURLConnection, collection);
    }

    @oj.n
    @NotNull
    public static final HttpURLConnection v0(@NotNull p0 p0Var) {
        return f98518n.e0(p0Var);
    }

    @oj.n
    @NotNull
    public static final o0 w(@Nullable Handler handler, @NotNull HttpURLConnection httpURLConnection, @NotNull p0 p0Var) {
        return f98518n.r(handler, httpURLConnection, p0Var);
    }

    @oj.n
    @NotNull
    public static final HttpURLConnection w0(@NotNull Collection<GraphRequest> collection) {
        return f98518n.f0(collection);
    }

    @oj.n
    @NotNull
    public static final o0 x(@NotNull HttpURLConnection httpURLConnection, @NotNull p0 p0Var) {
        return f98518n.s(httpURLConnection, p0Var);
    }

    @oj.n
    @NotNull
    public static final HttpURLConnection x0(@NotNull GraphRequest... graphRequestArr) {
        return f98518n.g0(graphRequestArr);
    }

    @oj.n
    public static final void y0(@NotNull p0 p0Var) {
        f98518n.h0(p0Var);
    }

    private final String z() {
        AccessToken accessToken = this.f98531a;
        if (accessToken != null) {
            if (!this.f98537g.containsKey("access_token")) {
                String strT = accessToken.t();
                com.facebook.internal.t0.f100109e.f(strT);
                return strT;
            }
        } else if (!this.f98537g.containsKey("access_token")) {
            return E();
        }
        return this.f98537g.getString("access_token");
    }

    @Nullable
    public final String A() {
        return this.f98535e;
    }

    @Nullable
    public final String B() {
        return this.f98534d;
    }

    public final boolean C() {
        return this.f98536f;
    }

    @Nullable
    public final b D() {
        return this.f98540j;
    }

    @Nullable
    public final JSONObject G() {
        return this.f98533c;
    }

    @Nullable
    public final String H() {
        return this.f98532b;
    }

    @Nullable
    public final r0 J() {
        return this.f98541k;
    }

    @NotNull
    public final Bundle K() {
        return this.f98537g;
    }

    @NotNull
    public final String L() {
        if (this.f98543m != null) {
            throw new u("Can't override URL for a batch request");
        }
        com.facebook.internal.z0 z0Var = com.facebook.internal.z0.f100267a;
        String strO = O(com.facebook.internal.z0.h());
        j();
        Uri uri = Uri.parse(k(strO, true));
        q1 q1Var = q1.f312784a;
        String str = String.format("%s?%s", Arrays.copyOf(new Object[]{uri.getPath(), uri.getQuery()}, 2));
        Intrinsics.checkNotNullExpressionValue(str, "java.lang.String.format(format, *args)");
        return str;
    }

    @Nullable
    public final Object M() {
        return this.f98538h;
    }

    @NotNull
    public final String N() {
        String strI;
        String str = this.f98543m;
        if (str != null) {
            return String.valueOf(str);
        }
        String str2 = this.f98532b;
        if (this.f98541k == r0.POST && str2 != null && StringsKt.M1(str2, f98521q, false, 2, null)) {
            com.facebook.internal.z0 z0Var = com.facebook.internal.z0.f100267a;
            strI = com.facebook.internal.z0.j();
        } else {
            com.facebook.internal.z0 z0Var2 = com.facebook.internal.z0.f100267a;
            g0 g0Var = g0.f99617a;
            strI = com.facebook.internal.z0.i(g0.C());
        }
        String strO = O(strI);
        j();
        return k(strO, false);
    }

    @Nullable
    public final String P() {
        return this.f98539i;
    }

    public final void h0(@Nullable AccessToken accessToken) {
        this.f98531a = accessToken;
    }

    public final void i0(@Nullable String str) {
        this.f98535e = str;
    }

    public final void j0(@Nullable String str) {
        this.f98534d = str;
    }

    public final void k0(boolean z10) {
        this.f98536f = z10;
    }

    @NotNull
    public final q0 l() {
        return f98518n.i(this);
    }

    public final void l0(@Nullable final b bVar) {
        g0 g0Var = g0.f99617a;
        if (g0.P(t0.GRAPH_API_DEBUG_INFO) || g0.P(t0.GRAPH_API_DEBUG_WARNING)) {
            this.f98540j = new b() { // from class: com.facebook.k0
                @Override // com.facebook.GraphRequest.b
                public final void a(q0 q0Var) {
                    GraphRequest.b(bVar, q0Var);
                }
            };
        } else {
            this.f98540j = bVar;
        }
    }

    @NotNull
    public final o0 n() {
        return f98518n.o(this);
    }

    public final void n0(boolean z10) {
        this.f98542l = z10;
    }

    public final void o0(@Nullable JSONObject jSONObject) {
        this.f98533c = jSONObject;
    }

    public final void p0(@Nullable String str) {
        this.f98532b = str;
    }

    public final void q0(@Nullable r0 r0Var) {
        if (this.f98543m != null && r0Var != r0.GET) {
            throw new u("Can't change HTTP method on request with overridden URL.");
        }
        if (r0Var == null) {
            r0Var = r0.GET;
        }
        this.f98541k = r0Var;
    }

    public final void r0(@NotNull Bundle bundle) {
        Intrinsics.checkNotNullParameter(bundle, "<set-?>");
        this.f98537g = bundle;
    }

    public final void s0(@Nullable Object obj) {
        this.f98538h = obj;
    }

    public final void t0(@Nullable String str) {
        this.f98539i = str;
    }

    @NotNull
    public String toString() {
        StringBuilder sb2 = new StringBuilder();
        sb2.append("{Request: ");
        sb2.append(" accessToken: ");
        Object obj = this.f98531a;
        if (obj == null) {
            obj = AbstractJsonLexerKt.NULL;
        }
        sb2.append(obj);
        sb2.append(", graphPath: ");
        sb2.append(this.f98532b);
        sb2.append(", graphObject: ");
        sb2.append(this.f98533c);
        sb2.append(", httpMethod: ");
        sb2.append(this.f98541k);
        sb2.append(", parameters: ");
        sb2.append(this.f98537g);
        sb2.append("}");
        String string = sb2.toString();
        Intrinsics.checkNotNullExpressionValue(string, "StringBuilder()\n        .append(\"{Request: \")\n        .append(\" accessToken: \")\n        .append(if (accessToken == null) \"null\" else accessToken)\n        .append(\", graphPath: \")\n        .append(graphPath)\n        .append(\", graphObject: \")\n        .append(graphObject)\n        .append(\", httpMethod: \")\n        .append(httpMethod)\n        .append(\", parameters: \")\n        .append(parameters)\n        .append(\"}\")\n        .toString()");
        return string;
    }

    @Nullable
    public final AccessToken y() {
        return this.f98531a;
    }

    @oj.j
    public GraphRequest(@Nullable AccessToken accessToken) {
        this(accessToken, null, null, null, null, null, 62, null);
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    @oj.j
    public GraphRequest(@Nullable AccessToken accessToken, @Nullable String str) {
        this(accessToken, str, null, null, null, null, 60, null);
        int i10 = (7 ^ 0) >> 0;
    }

    @oj.j
    public GraphRequest(@Nullable AccessToken accessToken, @Nullable String str, @Nullable Bundle bundle) {
        this(accessToken, str, bundle, null, null, null, 56, null);
    }

    @oj.j
    public GraphRequest(@Nullable AccessToken accessToken, @Nullable String str, @Nullable Bundle bundle, @Nullable r0 r0Var) {
        this(accessToken, str, bundle, r0Var, null, null, 48, null);
    }

    @oj.j
    public GraphRequest(@Nullable AccessToken accessToken, @Nullable String str, @Nullable Bundle bundle, @Nullable r0 r0Var, @Nullable b bVar) {
        this(accessToken, str, bundle, r0Var, bVar, null, 32, null);
    }

    public /* synthetic */ GraphRequest(AccessToken accessToken, String str, Bundle bundle, r0 r0Var, b bVar, String str2, int i10, DefaultConstructorMarker defaultConstructorMarker) {
        this((i10 & 1) != 0 ? null : accessToken, (i10 & 2) != 0 ? null : str, (i10 & 4) != 0 ? null : bundle, (i10 & 8) != 0 ? null : r0Var, (i10 & 16) != 0 ? null : bVar, (i10 & 32) != 0 ? null : str2);
    }

    @oj.j
    public GraphRequest(@Nullable AccessToken accessToken, @Nullable String str, @Nullable Bundle bundle, @Nullable r0 r0Var, @Nullable b bVar, @Nullable String str2) {
        this.f98536f = true;
        this.f98531a = accessToken;
        this.f98532b = str;
        this.f98539i = str2;
        l0(bVar);
        q0(r0Var);
        if (bundle != null) {
            this.f98537g = new Bundle(bundle);
        } else {
            this.f98537g = new Bundle();
        }
        if (this.f98539i == null) {
            g0 g0Var = g0.f99617a;
            this.f98539i = g0.B();
        }
    }

    public GraphRequest(@Nullable AccessToken accessToken, @NotNull URL overriddenURL) {
        Intrinsics.checkNotNullParameter(overriddenURL, "overriddenURL");
        this.f98536f = true;
        this.f98531a = accessToken;
        this.f98543m = overriddenURL.toString();
        q0(r0.GET);
        this.f98537g = new Bundle();
    }
}
