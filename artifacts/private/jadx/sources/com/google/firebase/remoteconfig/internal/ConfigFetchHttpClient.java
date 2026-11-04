package com.google.firebase.remoteconfig.internal;

import android.content.Context;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.os.Build;
import androidx.annotation.Keep;
import androidx.annotation.l1;
import com.google.firebase.remoteconfig.e0;
import java.io.BufferedOutputStream;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.URL;
import java.net.URLConnection;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.HashMap;
import java.util.Locale;
import java.util.Map;
import java.util.Objects;
import java.util.TimeZone;
import java.util.concurrent.TimeUnit;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes5.dex */
public class ConfigFetchHttpClient {

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private static final String f124480h = "X-Goog-Api-Key";

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private static final String f124481i = "ETag";

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private static final String f124482j = "If-None-Match";

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private static final String f124483k = "X-Android-Package";

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private static final String f124484l = "X-Android-Cert";

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private static final String f124485m = "X-Google-GFE-Can-Retry";

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private static final String f124486n = "X-Goog-Firebase-Installations-Auth";

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    private static final String f124487o = "yyyy-MM-dd'T'HH:mm:ss.SSS'Z'";

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    private static final Pattern f124488p = Pattern.compile("^[^:]+:([0-9]+):(android|ios|web):([0-9a-f]+)");

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final Context f124489a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final String f124490b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final String f124491c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final String f124492d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final String f124493e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final long f124494f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private final long f124495g;

    public ConfigFetchHttpClient(Context context, String str, String str2, String str3, long j10, long j11) {
        this.f124489a = context;
        this.f124490b = str;
        this.f124491c = str2;
        this.f124492d = f(str);
        this.f124493e = str3;
        this.f124494f = j10;
        this.f124495g = j11;
    }

    private boolean a(JSONObject jSONObject) {
        try {
            return true ^ jSONObject.get("state").equals("NO_CHANGE");
        } catch (JSONException unused) {
            return true;
        }
    }

    private String b(long j10) {
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat(f124487o, Locale.US);
        simpleDateFormat.setTimeZone(TimeZone.getTimeZone("UTC"));
        return simpleDateFormat.format(Long.valueOf(j10));
    }

    private JSONObject c(String str, String str2, Map<String, String> map, Long l10, Map<String, String> map2) throws com.google.firebase.remoteconfig.s {
        HashMap map3 = new HashMap();
        if (str == null) {
            throw new com.google.firebase.remoteconfig.s("Fetch failed: Firebase installation id is null.");
        }
        map3.put(e0.b.f124451l2, str);
        map3.put(e0.b.f124452m2, str2);
        map3.put("appId", this.f124490b);
        Locale locale = this.f124489a.getResources().getConfiguration().locale;
        map3.put(e0.b.f124454o2, locale.getCountry());
        int i10 = Build.VERSION.SDK_INT;
        map3.put(e0.b.f124455p2, locale.toLanguageTag());
        map3.put(e0.b.f124456q2, Integer.toString(i10));
        map3.put(e0.b.f124457r2, TimeZone.getDefault().getID());
        try {
            PackageInfo packageInfo = this.f124489a.getPackageManager().getPackageInfo(this.f124489a.getPackageName(), 0);
            if (packageInfo != null) {
                map3.put(e0.b.f124458s2, packageInfo.versionName);
                map3.put(e0.b.f124459t2, Long.toString(androidx.core.content.pm.b.c(packageInfo)));
            }
        } catch (PackageManager.NameNotFoundException unused) {
        }
        map3.put(e0.b.f124460u2, this.f124489a.getPackageName());
        map3.put(e0.b.f124461v2, com.google.firebase.remoteconfig.b.f124425d);
        map3.put(e0.b.f124462w2, new JSONObject(map));
        if (!map2.isEmpty()) {
            map3.put(e0.b.f124464y2, new JSONObject(map2));
            Objects.toString(map2.keySet());
        }
        if (l10 != null) {
            map3.put(e0.b.f124463x2, b(l10.longValue()));
        }
        return new JSONObject(map3);
    }

    private static h e(JSONObject jSONObject, Date date) throws com.google.firebase.remoteconfig.s {
        JSONObject jSONObject2;
        JSONArray jSONArray;
        JSONObject jSONObject3;
        try {
            h.b bVarE = h.l().e(date);
            JSONArray jSONArray2 = null;
            try {
                jSONObject2 = jSONObject.getJSONObject("entries");
            } catch (JSONException unused) {
                jSONObject2 = null;
            }
            if (jSONObject2 != null) {
                bVarE = bVarE.c(jSONObject2);
            }
            try {
                jSONArray = jSONObject.getJSONArray(e0.c.A2);
            } catch (JSONException unused2) {
                jSONArray = null;
            }
            if (jSONArray != null) {
                bVarE = bVarE.d(jSONArray);
            }
            try {
                jSONObject3 = jSONObject.getJSONObject(e0.c.B2);
            } catch (JSONException unused3) {
                jSONObject3 = null;
            }
            if (jSONObject3 != null) {
                bVarE = bVarE.f(jSONObject3);
            }
            String string = jSONObject.has(e0.c.D2) ? jSONObject.getString(e0.c.D2) : null;
            if (string != null) {
                bVarE.h(Long.parseLong(string));
            }
            try {
                jSONArray2 = jSONObject.getJSONArray(e0.c.E2);
            } catch (JSONException unused4) {
            }
            if (jSONArray2 != null) {
                bVarE = bVarE.g(jSONArray2);
            }
            return bVarE.a();
        } catch (JSONException e10) {
            throw new com.google.firebase.remoteconfig.s("Fetch failed: fetch response could not be parsed.", e10);
        }
    }

    private static String f(String str) {
        Matcher matcher = f124488p.matcher(str);
        if (matcher.matches()) {
            return matcher.group(1);
        }
        return null;
    }

    private JSONObject h(URLConnection uRLConnection) throws JSONException, IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(uRLConnection.getInputStream(), "utf-8"));
        StringBuilder sb2 = new StringBuilder();
        while (true) {
            int i10 = bufferedReader.read();
            if (i10 == -1) {
                return new JSONObject(sb2.toString());
            }
            sb2.append((char) i10);
        }
    }

    private String i(String str, String str2) {
        return String.format(e0.f124447a, str, str2);
    }

    private String j() {
        try {
            Context context = this.f124489a;
            byte[] bArrA = com.google.android.gms.common.util.a.a(context, context.getPackageName());
            if (bArrA != null) {
                return com.google.android.gms.common.util.n.c(bArrA, false);
            }
            this.f124489a.getPackageName();
            return null;
        } catch (PackageManager.NameNotFoundException unused) {
            this.f124489a.getPackageName();
            return null;
        }
    }

    private void l(HttpURLConnection httpURLConnection, String str) {
        httpURLConnection.setRequestProperty(f124480h, this.f124491c);
        httpURLConnection.setRequestProperty(f124483k, this.f124489a.getPackageName());
        httpURLConnection.setRequestProperty(f124484l, j());
        httpURLConnection.setRequestProperty(f124485m, "yes");
        httpURLConnection.setRequestProperty(f124486n, str);
        httpURLConnection.setRequestProperty("Content-Type", "application/json");
        httpURLConnection.setRequestProperty("Accept", "application/json");
    }

    private void m(HttpURLConnection httpURLConnection, Map<String, String> map) {
        for (Map.Entry<String, String> entry : map.entrySet()) {
            httpURLConnection.setRequestProperty(entry.getKey(), entry.getValue());
        }
    }

    private void n(HttpURLConnection httpURLConnection, byte[] bArr) throws IOException {
        httpURLConnection.setFixedLengthStreamingMode(bArr.length);
        BufferedOutputStream bufferedOutputStream = new BufferedOutputStream(httpURLConnection.getOutputStream());
        bufferedOutputStream.write(bArr);
        bufferedOutputStream.flush();
        bufferedOutputStream.close();
    }

    private void o(HttpURLConnection httpURLConnection, String str, String str2, Map<String, String> map) {
        httpURLConnection.setDoOutput(true);
        TimeUnit timeUnit = TimeUnit.SECONDS;
        httpURLConnection.setConnectTimeout((int) timeUnit.toMillis(this.f124494f));
        httpURLConnection.setReadTimeout((int) timeUnit.toMillis(this.f124495g));
        httpURLConnection.setRequestProperty("If-None-Match", str);
        l(httpURLConnection, str2);
        m(httpURLConnection, map);
    }

    HttpURLConnection d() throws com.google.firebase.remoteconfig.t {
        try {
            return (HttpURLConnection) new URL(i(this.f124492d, this.f124493e)).openConnection();
        } catch (IOException e10) {
            throw new com.google.firebase.remoteconfig.t(e10.getMessage());
        }
    }

    @Keep
    n.a fetch(HttpURLConnection httpURLConnection, String str, String str2, Map<String, String> map, String str3, Map<String, String> map2, Long l10, Date date, Map<String, String> map3) throws com.google.firebase.remoteconfig.t {
        o(httpURLConnection, str3, str2, map2);
        try {
            try {
                n(httpURLConnection, c(str, str2, map, l10, map3).toString().getBytes("utf-8"));
                httpURLConnection.connect();
                int responseCode = httpURLConnection.getResponseCode();
                if (responseCode != 200) {
                    throw new com.google.firebase.remoteconfig.w(responseCode, httpURLConnection.getResponseMessage());
                }
                String headerField = httpURLConnection.getHeaderField("ETag");
                JSONObject jSONObjectH = h(httpURLConnection);
                httpURLConnection.disconnect();
                try {
                    httpURLConnection.getInputStream().close();
                } catch (IOException unused) {
                }
                h hVarE = e(jSONObjectH, date);
                return !a(jSONObjectH) ? n.a.a(date, hVarE) : n.a.b(hVarE, headerField);
            } catch (IOException | JSONException e10) {
                throw new com.google.firebase.remoteconfig.s("The client had an error while calling the backend!", e10);
            }
        } catch (Throwable th2) {
            httpURLConnection.disconnect();
            try {
                httpURLConnection.getInputStream().close();
                throw th2;
            } catch (IOException unused2) {
                throw th2;
            }
        }
    }

    @l1
    public long g() {
        return this.f124494f;
    }

    @l1
    public long k() {
        return this.f124495g;
    }
}
