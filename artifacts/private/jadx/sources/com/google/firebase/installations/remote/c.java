package com.google.firebase.installations.remote;

import android.content.Context;
import android.content.pm.PackageManager;
import android.net.TrafficStats;
import android.text.TextUtils;
import android.util.JsonReader;
import androidx.annotation.NonNull;
import androidx.annotation.l1;
import androidx.annotation.p0;
import com.google.android.gms.common.internal.w;
import com.google.android.gms.common.util.n;
import com.google.firebase.heartbeatinfo.j;
import com.google.firebase.installations.l;
import com.google.firebase.remoteconfig.e0;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;
import java.net.URLConnection;
import java.nio.charset.Charset;
import java.util.concurrent.ExecutionException;
import java.util.regex.Pattern;
import java.util.zip.GZIPOutputStream;
import net.openid.appauth.x;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes5.dex */
public class c {
    private static final String A = "x-goog-api-key";
    private static final int B = 10000;
    private static final int D = 1;
    private static final String F = "a:";
    private static final String G = "Firebase-Installations";

    @l1
    static final String H = "Invalid Expiration Timestamp.";

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private static final int f123268e = 32768;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private static final int f123269f = 32769;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private static final int f123270g = 32770;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private static final int f123271h = 32771;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private static final String f123272i = "firebaseinstallations.googleapis.com";

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private static final String f123273j = "projects/%s/installations";

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private static final String f123274k = "projects/%s/installations/%s/authTokens:generate";

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private static final String f123275l = "projects/%s/installations/%s";

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private static final String f123276m = "v1";

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private static final String f123277n = "FIS_v2";

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    private static final String f123278o = "Content-Type";

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    private static final String f123279p = "Accept";

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    private static final String f123280q = "application/json";

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    private static final String f123281r = "Content-Encoding";

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    private static final String f123282s = "gzip";

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    private static final String f123283t = "Cache-Control";

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    private static final String f123284u = "no-cache";

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    private static final String f123285v = "fire-installations-id";

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    private static final String f123286w = "x-firebase-client";

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    private static final String f123287x = "X-Android-Package";

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    private static final String f123288y = "X-Android-Cert";

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    private static final String f123289z = "x-goog-fis-android-iid-migration-auth";

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private boolean f123290a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final Context f123291b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final z8.b<j> f123292c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final e f123293d = new e();
    private static final Pattern C = Pattern.compile("[0-9]+s");
    private static final Charset E = Charset.forName("UTF-8");

    public c(@NonNull Context context, @NonNull z8.b<j> bVar) {
        this.f123291b = context;
        this.f123292c = bVar;
    }

    private static String a(@p0 String str, @NonNull String str2, @NonNull String str3) {
        String str4;
        if (TextUtils.isEmpty(str)) {
            str4 = "";
        } else {
            str4 = ", " + str;
        }
        return String.format("Firebase options used while communicating with Firebase server APIs: %s, %s%s", str2, str3, str4);
    }

    private static JSONObject b(@p0 String str, @NonNull String str2) {
        try {
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("fid", str);
            jSONObject.put("appId", str2);
            jSONObject.put("authVersion", f123277n);
            jSONObject.put(e0.b.f124461v2, "a:18.0.0");
            return jSONObject;
        } catch (JSONException e10) {
            throw new IllegalStateException(e10);
        }
    }

    private static JSONObject c() {
        try {
            JSONObject jSONObject = new JSONObject();
            jSONObject.put(e0.b.f124461v2, "a:18.0.0");
            JSONObject jSONObject2 = new JSONObject();
            jSONObject2.put("installation", jSONObject);
            return jSONObject2;
        } catch (JSONException e10) {
            throw new IllegalStateException(e10);
        }
    }

    private String g() {
        try {
            Context context = this.f123291b;
            byte[] bArrA = com.google.android.gms.common.util.a.a(context, context.getPackageName());
            if (bArrA != null) {
                return n.c(bArrA, false);
            }
            this.f123291b.getPackageName();
            return null;
        } catch (PackageManager.NameNotFoundException unused) {
            this.f123291b.getPackageName();
            return null;
        }
    }

    private URL h(String str) throws l {
        try {
            return new URL(String.format("https://%s/%s/%s", f123272i, f123276m, str));
        } catch (MalformedURLException e10) {
            throw new l(e10.getMessage(), l.a.UNAVAILABLE);
        }
    }

    private static byte[] i(JSONObject jSONObject) throws IOException {
        return jSONObject.toString().getBytes("UTF-8");
    }

    private static boolean j(int i10) {
        return i10 >= 200 && i10 < 300;
    }

    private static void k() {
    }

    private static void l(HttpURLConnection httpURLConnection, @p0 String str, @NonNull String str2, @NonNull String str3) {
        if (TextUtils.isEmpty(p(httpURLConnection))) {
            return;
        }
        a(str, str2, str3);
    }

    private HttpURLConnection m(URL url, String str) throws l {
        try {
            HttpURLConnection httpURLConnection = (HttpURLConnection) url.openConnection();
            httpURLConnection.setConnectTimeout(10000);
            httpURLConnection.setUseCaches(false);
            httpURLConnection.setReadTimeout(10000);
            httpURLConnection.addRequestProperty("Content-Type", "application/json");
            httpURLConnection.addRequestProperty("Accept", "application/json");
            httpURLConnection.addRequestProperty("Content-Encoding", f123282s);
            httpURLConnection.addRequestProperty("Cache-Control", "no-cache");
            httpURLConnection.addRequestProperty(f123287x, this.f123291b.getPackageName());
            j jVar = this.f123292c.get();
            if (jVar != null) {
                try {
                    httpURLConnection.addRequestProperty(f123286w, (String) com.google.android.gms.tasks.n.a(jVar.b()));
                } catch (InterruptedException unused) {
                    Thread.currentThread().interrupt();
                } catch (ExecutionException unused2) {
                }
            }
            httpURLConnection.addRequestProperty(f123288y, g());
            httpURLConnection.addRequestProperty(A, str);
            return httpURLConnection;
        } catch (IOException unused3) {
            throw new l("Firebase Installations Service is unavailable. Please try again later.", l.a.UNAVAILABLE);
        }
    }

    @l1
    static long n(String str) {
        w.b(C.matcher(str).matches(), H);
        if (str == null || str.length() == 0) {
            return 0L;
        }
        return Long.parseLong(str.substring(0, str.length() - 1));
    }

    private d o(HttpURLConnection httpURLConnection) throws IOException, AssertionError {
        InputStream inputStream = httpURLConnection.getInputStream();
        JsonReader jsonReader = new JsonReader(new InputStreamReader(inputStream, E));
        f.a aVarA = f.a();
        d.a aVarA2 = d.a();
        jsonReader.beginObject();
        while (jsonReader.hasNext()) {
            String strNextName = jsonReader.nextName();
            if (strNextName.equals("name")) {
                aVarA2.f(jsonReader.nextString());
            } else if (strNextName.equals("fid")) {
                aVarA2.c(jsonReader.nextString());
            } else if (strNextName.equals("refreshToken")) {
                aVarA2.d(jsonReader.nextString());
            } else if (strNextName.equals("authToken")) {
                jsonReader.beginObject();
                while (jsonReader.hasNext()) {
                    String strNextName2 = jsonReader.nextName();
                    if (strNextName2.equals(x.f333313b)) {
                        aVarA.c(jsonReader.nextString());
                    } else if (strNextName2.equals("expiresIn")) {
                        aVarA.d(n(jsonReader.nextString()));
                    } else {
                        jsonReader.skipValue();
                    }
                }
                aVarA2.b(aVarA.a());
                jsonReader.endObject();
            } else {
                jsonReader.skipValue();
            }
        }
        jsonReader.endObject();
        jsonReader.close();
        inputStream.close();
        return aVarA2.e(d.b.OK).a();
    }

    @p0
    private static String p(HttpURLConnection httpURLConnection) {
        InputStream errorStream = httpURLConnection.getErrorStream();
        if (errorStream == null) {
            return null;
        }
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(errorStream, E));
        try {
            try {
                StringBuilder sb2 = new StringBuilder();
                while (true) {
                    String line = bufferedReader.readLine();
                    if (line == null) {
                        break;
                    }
                    sb2.append(line);
                    sb2.append('\n');
                    return null;
                }
                String str = String.format("Error when communicating with the Firebase Installations server API. HTTP response: [%d %s: %s]", Integer.valueOf(httpURLConnection.getResponseCode()), httpURLConnection.getResponseMessage(), sb2);
                try {
                    bufferedReader.close();
                } catch (IOException unused) {
                }
                return str;
            } catch (IOException unused2) {
            }
        } catch (IOException unused3) {
            bufferedReader.close();
            return null;
        } catch (Throwable th2) {
            try {
                bufferedReader.close();
            } catch (IOException unused4) {
            }
            throw th2;
        }
    }

    private f q(HttpURLConnection httpURLConnection) throws IOException, AssertionError {
        InputStream inputStream = httpURLConnection.getInputStream();
        JsonReader jsonReader = new JsonReader(new InputStreamReader(inputStream, E));
        f.a aVarA = f.a();
        jsonReader.beginObject();
        while (jsonReader.hasNext()) {
            String strNextName = jsonReader.nextName();
            if (strNextName.equals(x.f333313b)) {
                aVarA.c(jsonReader.nextString());
            } else if (strNextName.equals("expiresIn")) {
                aVarA.d(n(jsonReader.nextString()));
            } else {
                jsonReader.skipValue();
            }
        }
        jsonReader.endObject();
        jsonReader.close();
        inputStream.close();
        return aVarA.b(f.b.OK).a();
    }

    private void r(HttpURLConnection httpURLConnection, @p0 String str, @NonNull String str2) throws IOException {
        t(httpURLConnection, i(b(str, str2)));
    }

    private void s(HttpURLConnection httpURLConnection) throws IOException {
        t(httpURLConnection, i(c()));
    }

    private static void t(URLConnection uRLConnection, byte[] bArr) throws IOException {
        OutputStream outputStream = uRLConnection.getOutputStream();
        if (outputStream == null) {
            throw new IOException("Cannot send request to FIS servers. No OutputStream available.");
        }
        GZIPOutputStream gZIPOutputStream = new GZIPOutputStream(outputStream);
        try {
            gZIPOutputStream.write(bArr);
            try {
                gZIPOutputStream.close();
                outputStream.close();
            } catch (IOException unused) {
            }
        } catch (Throwable th2) {
            try {
                gZIPOutputStream.close();
                outputStream.close();
            } catch (IOException unused2) {
            }
            throw th2;
        }
    }

    @NonNull
    public d d(@NonNull String str, @p0 String str2, @NonNull String str3, @NonNull String str4, @p0 String str5) throws l {
        d dVarO;
        if (!this.f123293d.b()) {
            throw new l("Firebase Installations Service is unavailable. Please try again later.", l.a.UNAVAILABLE);
        }
        URL urlH = h(String.format(f123273j, str3));
        for (int i10 = 0; i10 <= 1; i10++) {
            TrafficStats.setThreadStatsTag(f123269f);
            HttpURLConnection httpURLConnectionM = m(urlH, str);
            try {
                try {
                    httpURLConnectionM.setRequestMethod("POST");
                    httpURLConnectionM.setDoOutput(true);
                    if (str5 != null) {
                        httpURLConnectionM.addRequestProperty(f123289z, str5);
                    }
                    r(httpURLConnectionM, str2, str4);
                    int responseCode = httpURLConnectionM.getResponseCode();
                    this.f123293d.f(responseCode);
                    if (j(responseCode)) {
                        dVarO = o(httpURLConnectionM);
                    } else {
                        l(httpURLConnectionM, str4, str, str3);
                        if (responseCode == 429) {
                            throw new l("Firebase servers have received too many requests from this client in a short period of time. Please try again later.", l.a.TOO_MANY_REQUESTS);
                        }
                        if (responseCode < 500 || responseCode >= 600) {
                            k();
                            dVarO = d.a().e(d.b.BAD_CONFIG).a();
                        }
                        httpURLConnectionM.disconnect();
                        TrafficStats.clearThreadStatsTag();
                    }
                    httpURLConnectionM.disconnect();
                    TrafficStats.clearThreadStatsTag();
                    return dVarO;
                } catch (IOException | AssertionError unused) {
                }
            } catch (Throwable th2) {
                httpURLConnectionM.disconnect();
                TrafficStats.clearThreadStatsTag();
                throw th2;
            }
        }
        throw new l("Firebase Installations Service is unavailable. Please try again later.", l.a.UNAVAILABLE);
    }

    @NonNull
    public void e(@NonNull String str, @NonNull String str2, @NonNull String str3, @NonNull String str4) throws l {
        URL urlH = h(String.format(f123275l, str3, str2));
        int i10 = 0;
        while (i10 <= 1) {
            TrafficStats.setThreadStatsTag(f123270g);
            HttpURLConnection httpURLConnectionM = m(urlH, str);
            try {
                httpURLConnectionM.setRequestMethod("DELETE");
                httpURLConnectionM.addRequestProperty("Authorization", "FIS_v2 " + str4);
                int responseCode = httpURLConnectionM.getResponseCode();
                if (responseCode != 200 && responseCode != 401 && responseCode != 404) {
                    l(httpURLConnectionM, null, str, str3);
                    if (responseCode != 429 && (responseCode < 500 || responseCode >= 600)) {
                        k();
                        throw new l("Bad config while trying to delete FID", l.a.BAD_CONFIG);
                    }
                    i10++;
                    httpURLConnectionM.disconnect();
                    TrafficStats.clearThreadStatsTag();
                }
                httpURLConnectionM.disconnect();
                TrafficStats.clearThreadStatsTag();
                return;
            } catch (IOException unused) {
            } catch (Throwable th2) {
                httpURLConnectionM.disconnect();
                TrafficStats.clearThreadStatsTag();
                throw th2;
            }
        }
        throw new l("Firebase Installations Service is unavailable. Please try again later.", l.a.UNAVAILABLE);
    }

    @NonNull
    public f f(@NonNull String str, @NonNull String str2, @NonNull String str3, @NonNull String str4) throws l {
        f fVarQ;
        if (!this.f123293d.b()) {
            throw new l("Firebase Installations Service is unavailable. Please try again later.", l.a.UNAVAILABLE);
        }
        URL urlH = h(String.format(f123274k, str3, str2));
        for (int i10 = 0; i10 <= 1; i10++) {
            TrafficStats.setThreadStatsTag(f123271h);
            HttpURLConnection httpURLConnectionM = m(urlH, str);
            try {
                try {
                    httpURLConnectionM.setRequestMethod("POST");
                    httpURLConnectionM.addRequestProperty("Authorization", "FIS_v2 " + str4);
                    httpURLConnectionM.setDoOutput(true);
                    s(httpURLConnectionM);
                    int responseCode = httpURLConnectionM.getResponseCode();
                    this.f123293d.f(responseCode);
                    if (j(responseCode)) {
                        fVarQ = q(httpURLConnectionM);
                    } else {
                        l(httpURLConnectionM, null, str, str3);
                        if (responseCode == 401 || responseCode == 404) {
                            fVarQ = f.a().b(f.b.AUTH_ERROR).a();
                        } else {
                            if (responseCode == 429) {
                                throw new l("Firebase servers have received too many requests from this client in a short period of time. Please try again later.", l.a.TOO_MANY_REQUESTS);
                            }
                            if (responseCode < 500 || responseCode >= 600) {
                                k();
                                fVarQ = f.a().b(f.b.BAD_CONFIG).a();
                            }
                            httpURLConnectionM.disconnect();
                            TrafficStats.clearThreadStatsTag();
                        }
                    }
                    httpURLConnectionM.disconnect();
                    TrafficStats.clearThreadStatsTag();
                    return fVarQ;
                } catch (IOException | AssertionError unused) {
                }
            } catch (Throwable th2) {
                httpURLConnectionM.disconnect();
                TrafficStats.clearThreadStatsTag();
                throw th2;
            }
        }
        throw new l("Firebase Installations Service is unavailable. Please try again later.", l.a.UNAVAILABLE);
    }
}
