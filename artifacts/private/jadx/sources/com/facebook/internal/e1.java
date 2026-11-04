package com.facebook.internal;

import android.content.Context;
import android.content.Intent;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.content.pm.ResolveInfo;
import android.database.Cursor;
import android.hardware.display.DisplayManager;
import android.net.Uri;
import android.os.Build;
import android.os.Bundle;
import android.os.Environment;
import android.os.Parcel;
import android.os.StatFs;
import android.telephony.TelephonyManager;
import android.text.TextUtils;
import android.util.DisplayMetrics;
import android.view.Display;
import android.view.autofill.AutofillManager;
import android.webkit.CookieManager;
import android.webkit.CookieSyncManager;
import com.facebook.AccessToken;
import com.facebook.GraphRequest;
import com.google.firebase.analytics.FirebaseAnalytics;
import java.io.BufferedInputStream;
import java.io.Closeable;
import java.io.File;
import java.io.FilenameFilter;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.io.UnsupportedEncodingException;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.math.BigInteger;
import java.net.HttpURLConnection;
import java.net.URLConnection;
import java.net.URLDecoder;
import java.nio.charset.Charset;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.text.DecimalFormat;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Date;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.Random;
import java.util.Set;
import java.util.TimeZone;
import java.util.regex.Pattern;
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
import org.json.JSONTokener;

/* JADX INFO: loaded from: classes4.dex */
public final class e1 {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NotNull
    public static final String f99795b = "FacebookSDK";

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @NotNull
    private static final String f99796c = "MD5";

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @NotNull
    private static final String f99797d = "SHA-1";

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    @NotNull
    private static final String f99798e = "SHA-256";

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    @NotNull
    private static final String f99799f = "https";

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    @NotNull
    private static final String f99800g = "a2";

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    @NotNull
    private static final String f99801h = "UTF-8";

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public static final int f99802i = 8192;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private static final int f99803j = 1800000;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private static int f99805l = 0;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    @NotNull
    private static final String f99812s = ".+_cheets|cheets_.+";

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    @NotNull
    private static final String f99813t = "id,name,first_name,middle_name,last_name";

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    @NotNull
    private static final String f99814u = "id,name,profile_picture";

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    public static final e1 f99794a = new e1();

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private static long f99806m = -1;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private static long f99807n = -1;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    private static long f99808o = -1;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    @NotNull
    private static String f99809p = "";

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    @NotNull
    private static String f99810q = "";

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    @NotNull
    private static final String f99804k = "NoCarrier";

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    @NotNull
    private static String f99811r = f99804k;

    /* JADX INFO: loaded from: classes3.dex */
    public interface a {
        void a(@Nullable JSONObject jSONObject);

        void b(@Nullable com.facebook.u uVar);
    }

    private e1() {
    }

    @oj.n
    @Nullable
    public static final JSONObject A() {
        if (com.facebook.internal.instrument.crashshield.b.e(e1.class)) {
            return null;
        }
        try {
            com.facebook.g0 g0Var = com.facebook.g0.f99617a;
            String string = com.facebook.g0.n().getSharedPreferences(com.facebook.g0.f99640x, 0).getString(com.facebook.g0.I, null);
            if (string != null) {
                try {
                    return new JSONObject(string);
                } catch (JSONException unused) {
                }
            }
            return null;
        } catch (Throwable th2) {
            com.facebook.internal.instrument.crashshield.b.c(th2, e1.class);
            return null;
        }
    }

    @oj.n
    public static final void A0(@Nullable Runnable runnable) {
        try {
            com.facebook.g0 g0Var = com.facebook.g0.f99617a;
            com.facebook.g0.y().execute(runnable);
        } catch (Exception unused) {
        }
    }

    @oj.n
    @NotNull
    public static final String B(@Nullable String str) {
        com.facebook.g0 g0Var = com.facebook.g0.f99617a;
        String strZ = com.facebook.g0.z();
        if (str != null) {
            if (Intrinsics.areEqual(str, com.facebook.g0.P)) {
                return StringsKt.k2(strZ, com.facebook.g0.Q, com.facebook.g0.R, false, 4, null);
            }
            if (Intrinsics.areEqual(str, com.facebook.g0.O)) {
                return StringsKt.k2(strZ, com.facebook.g0.Q, com.facebook.g0.S, false, 4, null);
            }
        }
        return strZ;
    }

    @oj.n
    @NotNull
    public static final String B0(@Nullable JSONObject jSONObject, @Nullable String str) {
        if (jSONObject == null) {
            return "";
        }
        String strOptString = jSONObject.optString(str, "");
        Intrinsics.checkNotNullExpressionValue(strOptString, "response.optString(propertyName, \"\")");
        return strOptString;
    }

    private final GraphRequest C(String str) {
        Bundle bundle = new Bundle();
        bundle.putString(GraphRequest.f98513a0, I(z()));
        bundle.putString("access_token", str);
        GraphRequest graphRequestI = GraphRequest.f98518n.I(null, null);
        graphRequestI.r0(bundle);
        graphRequestI.q0(com.facebook.r0.GET);
        return graphRequestI;
    }

    @oj.n
    public static final void C0(@NotNull JSONObject params, @Nullable c cVar, @Nullable String str, boolean z10, @NotNull Context context) throws JSONException {
        Intrinsics.checkNotNullParameter(params, "params");
        Intrinsics.checkNotNullParameter(context, "context");
        t tVar = t.f100072a;
        t.b bVar = t.b.ServiceUpdateCompliance;
        if (!t.g(bVar)) {
            params.put("anon_id", str);
        }
        params.put("application_tracking_enabled", !z10);
        com.facebook.g0 g0Var = com.facebook.g0.f99617a;
        params.put("advertiser_id_collection_enabled", com.facebook.g0.m());
        if (cVar != null) {
            if (t.g(bVar)) {
                f99794a.c(params, cVar, str, context);
            }
            if (cVar.j() != null) {
                if (t.g(bVar)) {
                    f99794a.d(params, cVar, context);
                } else {
                    params.put("attribution", cVar.j());
                }
            }
            if (cVar.h() != null) {
                params.put("advertiser_id", cVar.h());
                params.put("advertiser_tracking_enabled", !cVar.l());
            }
            if (!cVar.l()) {
                com.facebook.appevents.l0 l0Var = com.facebook.appevents.l0.f99122a;
                String strF = com.facebook.appevents.l0.f();
                if (strF.length() != 0) {
                    params.put("ud", strF);
                }
            }
            if (cVar.i() != null) {
                params.put("installer_package", cVar.i());
            }
        }
    }

    @oj.n
    public static final void D(@NotNull final String accessToken, @NotNull final a callback) {
        Intrinsics.checkNotNullParameter(accessToken, "accessToken");
        Intrinsics.checkNotNullParameter(callback, "callback");
        y0 y0Var = y0.f100264a;
        JSONObject jSONObjectA = y0.a(accessToken);
        if (jSONObjectA != null) {
            callback.a(jSONObjectA);
            return;
        }
        GraphRequest.b bVar = new GraphRequest.b() { // from class: com.facebook.internal.c1
            @Override // com.facebook.GraphRequest.b
            public final void a(com.facebook.q0 q0Var) {
                e1.E(callback, accessToken, q0Var);
            }
        };
        GraphRequest graphRequestC = f99794a.C(accessToken);
        graphRequestC.l0(bVar);
        graphRequestC.n();
    }

    @oj.n
    public static final void D0(@NotNull JSONObject params, @NotNull Context appContext) throws JSONException {
        String str;
        Locale locale;
        int i10;
        Intrinsics.checkNotNullParameter(params, "params");
        Intrinsics.checkNotNullParameter(appContext, "appContext");
        JSONArray jSONArray = new JSONArray();
        jSONArray.put(f99800g);
        f99794a.x0(appContext);
        String packageName = appContext.getPackageName();
        int i11 = 0;
        int i12 = -1;
        try {
            PackageInfo packageInfo = appContext.getPackageManager().getPackageInfo(packageName, 0);
            if (packageInfo == null) {
                return;
            }
            i12 = packageInfo.versionCode;
            str = packageInfo.versionName;
        } catch (PackageManager.NameNotFoundException unused) {
            str = "";
        }
        jSONArray.put(packageName);
        jSONArray.put(i12);
        jSONArray.put(str);
        jSONArray.put(Build.VERSION.RELEASE);
        jSONArray.put(Build.MODEL);
        try {
            locale = appContext.getResources().getConfiguration().locale;
        } catch (Exception unused2) {
            locale = Locale.getDefault();
        }
        jSONArray.put(locale.getLanguage() + '_' + ((Object) locale.getCountry()));
        jSONArray.put(f99809p);
        jSONArray.put(f99811r);
        double d10 = 0.0d;
        try {
            Object systemService = appContext.getSystemService("display");
            Display display = null;
            DisplayManager displayManager = systemService instanceof DisplayManager ? (DisplayManager) systemService : null;
            if (displayManager != null) {
                display = displayManager.getDisplay(0);
            }
            if (display != null) {
                DisplayMetrics displayMetrics = new DisplayMetrics();
                display.getMetrics(displayMetrics);
                int i13 = displayMetrics.widthPixels;
                try {
                    i11 = displayMetrics.heightPixels;
                    d10 = displayMetrics.density;
                } catch (Exception unused3) {
                }
                i10 = i11;
                i11 = i13;
            } else {
                i10 = 0;
            }
        } catch (Exception unused4) {
        }
        jSONArray.put(i11);
        jSONArray.put(i10);
        jSONArray.put(new DecimalFormat("#.##").format(d10));
        jSONArray.put(f99794a.u0());
        jSONArray.put(f99807n);
        jSONArray.put(f99808o);
        jSONArray.put(f99810q);
        params.put(f5.a.f274949k, jSONArray.toString());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void E(a callback, String accessToken, com.facebook.q0 response) {
        Intrinsics.checkNotNullParameter(callback, "$callback");
        Intrinsics.checkNotNullParameter(accessToken, "$accessToken");
        Intrinsics.checkNotNullParameter(response, "response");
        if (response.g() != null) {
            callback.b(response.g().n());
            return;
        }
        y0 y0Var = y0.f100264a;
        JSONObject jSONObjectK = response.k();
        if (jSONObjectK == null) {
            throw new IllegalStateException("Required value was null.");
        }
        y0.b(accessToken, jSONObjectK);
        callback.a(response.k());
    }

    @oj.n
    @Nullable
    public static final String E0(@NotNull String key) {
        Intrinsics.checkNotNullParameter(key, "key");
        return f99794a.N("SHA-1", key);
    }

    @oj.n
    @NotNull
    public static final String F(@Nullable Context context) {
        f1 f1Var = f1.f99837a;
        f1.s(context, "context");
        com.facebook.g0 g0Var = com.facebook.g0.f99617a;
        return com.facebook.g0.o();
    }

    @oj.n
    @Nullable
    public static final String F0(@NotNull byte[] bytes) {
        Intrinsics.checkNotNullParameter(bytes, "bytes");
        return f99794a.O("SHA-1", bytes);
    }

    @oj.n
    @Nullable
    public static final Method G(@NotNull Class<?> clazz, @NotNull String methodName, @NotNull Class<?>... parameterTypes) {
        Intrinsics.checkNotNullParameter(clazz, "clazz");
        Intrinsics.checkNotNullParameter(methodName, "methodName");
        Intrinsics.checkNotNullParameter(parameterTypes, "parameterTypes");
        try {
            return clazz.getMethod(methodName, (Class[]) Arrays.copyOf(parameterTypes, parameterTypes.length));
        } catch (NoSuchMethodException unused) {
            return null;
        }
    }

    @oj.n
    @Nullable
    public static final String G0(@Nullable String str) {
        if (str == null) {
            return null;
        }
        return f99794a.N("SHA-256", str);
    }

    @oj.n
    @Nullable
    public static final Method H(@NotNull String className, @NotNull String methodName, @NotNull Class<?>... parameterTypes) {
        Intrinsics.checkNotNullParameter(className, "className");
        Intrinsics.checkNotNullParameter(methodName, "methodName");
        Intrinsics.checkNotNullParameter(parameterTypes, "parameterTypes");
        try {
            Class<?> clazz = Class.forName(className);
            Intrinsics.checkNotNullExpressionValue(clazz, "clazz");
            return G(clazz, methodName, (Class[]) Arrays.copyOf(parameterTypes, parameterTypes.length));
        } catch (ClassNotFoundException unused) {
            return null;
        }
    }

    @oj.n
    @Nullable
    public static final String H0(@Nullable byte[] bArr) {
        if (bArr == null) {
            return null;
        }
        return f99794a.O("SHA-256", bArr);
    }

    private final String I(String str) {
        return Intrinsics.areEqual(str, com.facebook.g0.O) ? f99814u : f99813t;
    }

    @oj.n
    public static final boolean I0(@Nullable String str, @Nullable String str2) {
        boolean z10 = true | false;
        boolean z11 = str == null || str.length() == 0;
        boolean z12 = str2 == null || str2.length() == 0;
        if (z11 && z12) {
            return true;
        }
        if (z11 || z12) {
            return false;
        }
        return Intrinsics.areEqual(str, str2);
    }

    @oj.n
    @Nullable
    public static final Locale J() {
        try {
            com.facebook.g0 g0Var = com.facebook.g0.f99617a;
            return com.facebook.g0.n().getResources().getConfiguration().locale;
        } catch (Exception unused) {
            return null;
        }
    }

    @oj.n
    @Nullable
    public static final JSONArray J0(@Nullable JSONObject jSONObject, @Nullable String str) {
        if (jSONObject == null) {
            return null;
        }
        return jSONObject.optJSONArray(str);
    }

    @oj.n
    @Nullable
    public static final Object K(@NotNull JSONObject jsonObject, @Nullable String str, @Nullable String str2) throws JSONException {
        Intrinsics.checkNotNullParameter(jsonObject, "jsonObject");
        Object objOpt = jsonObject.opt(str);
        if (objOpt != null && (objOpt instanceof String)) {
            objOpt = new JSONTokener((String) objOpt).nextValue();
        }
        if (objOpt == null || (objOpt instanceof JSONObject) || (objOpt instanceof JSONArray)) {
            return objOpt;
        }
        if (str2 == null) {
            throw new com.facebook.u("Got an unexpected non-JSON object.");
        }
        JSONObject jSONObject = new JSONObject();
        jSONObject.putOpt(str2, objOpt);
        return jSONObject;
    }

    @oj.n
    @Nullable
    public static final JSONObject K0(@Nullable JSONObject jSONObject, @Nullable String str) {
        if (jSONObject == null) {
            return null;
        }
        return jSONObject.optJSONObject(str);
    }

    @oj.n
    @Nullable
    public static final String L(@Nullable Uri uri) {
        if (uri == null) {
            return null;
        }
        return uri.toString();
    }

    @oj.n
    public static final void L0(@NotNull Parcel parcel, @Nullable Map<String, String> map) {
        Intrinsics.checkNotNullParameter(parcel, "parcel");
        if (map == null) {
            parcel.writeInt(-1);
            return;
        }
        parcel.writeInt(map.size());
        for (Map.Entry<String, String> entry : map.entrySet()) {
            String key = entry.getKey();
            String value = entry.getValue();
            parcel.writeString(key);
            parcel.writeString(value);
        }
    }

    private final String M(MessageDigest messageDigest, byte[] bArr) {
        messageDigest.update(bArr);
        byte[] digest = messageDigest.digest();
        StringBuilder sb2 = new StringBuilder();
        Intrinsics.checkNotNullExpressionValue(digest, "digest");
        int length = digest.length;
        int i10 = 0;
        while (i10 < length) {
            byte b10 = digest[i10];
            i10++;
            sb2.append(Integer.toHexString((b10 >> 4) & 15));
            sb2.append(Integer.toHexString(b10 & com.google.common.base.c.f116464q));
        }
        String string = sb2.toString();
        Intrinsics.checkNotNullExpressionValue(string, "builder.toString()");
        return string;
    }

    @oj.n
    public static final void M0(@NotNull Parcel parcel, @Nullable Map<String, String> map) {
        Intrinsics.checkNotNullParameter(parcel, "parcel");
        if (map == null) {
            parcel.writeInt(-1);
            return;
        }
        parcel.writeInt(map.size());
        for (Map.Entry<String, String> entry : map.entrySet()) {
            String key = entry.getKey();
            String value = entry.getValue();
            parcel.writeString(key);
            parcel.writeString(value);
        }
    }

    private final String N(String str, String str2) {
        Charset charset = Charsets.UTF_8;
        if (str2 == null) {
            throw new NullPointerException("null cannot be cast to non-null type java.lang.String");
        }
        byte[] bytes = str2.getBytes(charset);
        Intrinsics.checkNotNullExpressionValue(bytes, "(this as java.lang.String).getBytes(charset)");
        return O(str, bytes);
    }

    private final String O(String str, byte[] bArr) {
        try {
            MessageDigest hash = MessageDigest.getInstance(str);
            Intrinsics.checkNotNullExpressionValue(hash, "hash");
            return M(hash, bArr);
        } catch (NoSuchAlgorithmException unused) {
            return null;
        }
    }

    @oj.n
    @Nullable
    public static final Object P(@Nullable Object obj, @NotNull Method method, @NotNull Object... args) {
        Intrinsics.checkNotNullParameter(method, "method");
        Intrinsics.checkNotNullParameter(args, "args");
        try {
            return method.invoke(obj, Arrays.copyOf(args, args.length));
        } catch (IllegalAccessException | InvocationTargetException unused) {
            return null;
        }
    }

    public static final boolean Q() {
        try {
            Intent intent = new Intent("android.intent.action.VIEW");
            q1 q1Var = q1.f312784a;
            com.facebook.g0 g0Var = com.facebook.g0.f99617a;
            String str = String.format("fb%s://applinks", Arrays.copyOf(new Object[]{com.facebook.g0.o()}, 1));
            Intrinsics.checkNotNullExpressionValue(str, "java.lang.String.format(format, *args)");
            intent.setData(Uri.parse(str));
            Context contextN = com.facebook.g0.n();
            PackageManager packageManager = contextN.getPackageManager();
            String packageName = contextN.getPackageName();
            List<ResolveInfo> listQueryIntentActivities = packageManager.queryIntentActivities(intent, 65536);
            Intrinsics.checkNotNullExpressionValue(listQueryIntentActivities, "packageManager.queryIntentActivities(intent, PackageManager.MATCH_DEFAULT_ONLY)");
            Iterator<ResolveInfo> it = listQueryIntentActivities.iterator();
            while (it.hasNext()) {
                if (Intrinsics.areEqual(packageName, it.next().activityInfo.packageName)) {
                    return true;
                }
            }
            return false;
        } catch (Exception unused) {
            return false;
        }
    }

    @oj.n
    public static /* synthetic */ void R() {
    }

    @oj.n
    public static final boolean S(@NotNull Context context) {
        Intrinsics.checkNotNullParameter(context, "context");
        AutofillManager autofillManager = (AutofillManager) context.getSystemService(AutofillManager.class);
        return autofillManager != null && autofillManager.isAutofillSupported() && autofillManager.isEnabled();
    }

    @oj.n
    public static final boolean T(@NotNull Context context) {
        Intrinsics.checkNotNullParameter(context, "context");
        return context.getPackageManager().hasSystemFeature("android.hardware.type.pc");
    }

    @oj.n
    public static final boolean U(@Nullable Uri uri) {
        return uri != null && StringsKt.N1(FirebaseAnalytics.d.P, uri.getScheme(), true);
    }

    @oj.n
    public static final boolean V(@Nullable AccessToken accessToken) {
        return accessToken != null && Intrinsics.areEqual(accessToken, AccessToken.f98366l.i());
    }

    @oj.n
    public static final boolean W() {
        if (com.facebook.internal.instrument.crashshield.b.e(e1.class)) {
            return false;
        }
        try {
            JSONObject jSONObjectA = A();
            if (jSONObjectA == null) {
                return false;
            }
            try {
                JSONArray jSONArray = jSONObjectA.getJSONArray(com.facebook.g0.I);
                int length = jSONArray.length();
                if (length > 0) {
                    int i10 = 0;
                    while (true) {
                        int i11 = i10 + 1;
                        String string = jSONArray.getString(i10);
                        Intrinsics.checkNotNullExpressionValue(string, "options.getString(i)");
                        String lowerCase = string.toLowerCase();
                        Intrinsics.checkNotNullExpressionValue(lowerCase, "(this as java.lang.String).toLowerCase()");
                        if (Intrinsics.areEqual(lowerCase, "ldu")) {
                            return true;
                        }
                        if (i11 < length) {
                            i10 = i11;
                        }
                    }
                }
            } catch (Exception unused) {
            }
            return false;
        } catch (Throwable th2) {
            com.facebook.internal.instrument.crashshield.b.c(th2, e1.class);
            return false;
        }
    }

    @oj.n
    public static final boolean X(@Nullable Uri uri) {
        return uri != null && StringsKt.N1(com.facebook.share.internal.k.f101891c, uri.getScheme(), true);
    }

    private final boolean Y(Context context) {
        Method methodH = H("com.google.android.gms.common.GooglePlayServicesUtil", "isGooglePlayServicesAvailable", Context.class);
        if (methodH == null) {
            return false;
        }
        Object objP = P(null, methodH, context);
        return (objP instanceof Integer) && Intrinsics.areEqual(objP, (Object) 0);
    }

    @oj.n
    public static final boolean Z(@Nullable String str) {
        return str == null || str.length() == 0;
    }

    @oj.n
    public static final boolean a0(@Nullable Collection<?> collection) {
        return collection == null || collection.isEmpty();
    }

    @oj.n
    public static final boolean b0(@Nullable Uri uri) {
        if (uri != null) {
            return StringsKt.N1("http", uri.getScheme(), true) || StringsKt.N1("https", uri.getScheme(), true) || StringsKt.N1("fbstaging", uri.getScheme(), true);
        }
        return false;
    }

    private final void c(JSONObject jSONObject, c cVar, String str, Context context) throws JSONException {
        if (Build.VERSION.SDK_INT < 31 || !Y(context)) {
            jSONObject.put("anon_id", str);
        } else {
            if (cVar.l()) {
                return;
            }
            jSONObject.put("anon_id", str);
        }
    }

    @oj.n
    @NotNull
    public static final Set<String> c0(@NotNull JSONArray jsonArray) throws JSONException {
        Intrinsics.checkNotNullParameter(jsonArray, "jsonArray");
        HashSet hashSet = new HashSet();
        int length = jsonArray.length();
        if (length > 0) {
            int i10 = 0;
            while (true) {
                int i11 = i10 + 1;
                String string = jsonArray.getString(i10);
                Intrinsics.checkNotNullExpressionValue(string, "jsonArray.getString(i)");
                hashSet.add(string);
                if (i11 >= length) {
                    break;
                }
                i10 = i11;
            }
        }
        return hashSet;
    }

    private final void d(JSONObject jSONObject, c cVar, Context context) throws JSONException {
        if (Build.VERSION.SDK_INT < 31 || !Y(context)) {
            jSONObject.put("attribution", cVar.j());
        } else {
            if (cVar.l()) {
                return;
            }
            jSONObject.put("attribution", cVar.j());
        }
    }

    @oj.n
    @NotNull
    public static final List<String> d0(@NotNull JSONArray jsonArray) throws JSONException {
        Intrinsics.checkNotNullParameter(jsonArray, "jsonArray");
        ArrayList arrayList = new ArrayList();
        int length = jsonArray.length();
        if (length > 0) {
            int i10 = 0;
            while (true) {
                int i11 = i10 + 1;
                arrayList.add(jsonArray.getString(i10));
                if (i11 >= length) {
                    break;
                }
                i10 = i11;
            }
        }
        return arrayList;
    }

    @oj.n
    public static final <T> boolean e(@Nullable T t10, @Nullable T t11) {
        if (t10 == null) {
            return t11 == null;
        }
        return Intrinsics.areEqual(t10, t11);
    }

    @oj.n
    @NotNull
    public static final Map<String, String> e0(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "str");
        if (str.length() == 0) {
            return new HashMap();
        }
        try {
            HashMap map = new HashMap();
            JSONObject jSONObject = new JSONObject(str);
            Iterator<String> itKeys = jSONObject.keys();
            while (itKeys.hasNext()) {
                String key = itKeys.next();
                Intrinsics.checkNotNullExpressionValue(key, "key");
                String string = jSONObject.getString(key);
                Intrinsics.checkNotNullExpressionValue(string, "jsonObject.getString(key)");
                map.put(key, string);
            }
            return map;
        } catch (JSONException unused) {
            return new HashMap();
        }
    }

    @oj.n
    @Nullable
    public static final JSONObject f(@NotNull String accessToken) {
        Intrinsics.checkNotNullParameter(accessToken, "accessToken");
        y0 y0Var = y0.f100264a;
        JSONObject jSONObjectA = y0.a(accessToken);
        if (jSONObjectA != null) {
            return jSONObjectA;
        }
        com.facebook.q0 q0VarL = f99794a.C(accessToken).l();
        if (q0VarL.g() != null) {
            return null;
        }
        return q0VarL.k();
    }

    @oj.n
    public static final void f0(@Nullable String str, @Nullable Exception exc) {
        com.facebook.g0 g0Var = com.facebook.g0.f99617a;
        if (!com.facebook.g0.K() || str == null || exc == null) {
            return;
        }
        exc.getMessage();
    }

    @oj.n
    @NotNull
    public static final Uri g(@Nullable String str, @Nullable String str2, @Nullable Bundle bundle) {
        Uri.Builder builder = new Uri.Builder();
        builder.scheme("https");
        builder.authority(str);
        builder.path(str2);
        if (bundle != null) {
            for (String str3 : bundle.keySet()) {
                Object obj = bundle.get(str3);
                if (obj instanceof String) {
                    builder.appendQueryParameter(str3, (String) obj);
                }
            }
        }
        Uri uriBuild = builder.build();
        Intrinsics.checkNotNullExpressionValue(uriBuild, "builder.build()");
        return uriBuild;
    }

    @oj.n
    public static final void g0(@Nullable String str, @Nullable String str2) {
        com.facebook.g0 g0Var = com.facebook.g0.f99617a;
        com.facebook.g0.K();
    }

    private final void h(Context context, String str) {
        CookieSyncManager.createInstance(context).sync();
        CookieManager cookieManager = CookieManager.getInstance();
        String cookie = cookieManager.getCookie(str);
        if (cookie == null) {
            return;
        }
        Object[] array = StringsKt.split$default(cookie, new String[]{";"}, false, 0, 6, null).toArray(new String[0]);
        if (array == null) {
            throw new NullPointerException("null cannot be cast to non-null type kotlin.Array<T>");
        }
        String[] strArr = (String[]) array;
        int length = strArr.length;
        int i10 = 0;
        while (i10 < length) {
            String str2 = strArr[i10];
            i10++;
            int i11 = 4 ^ 0;
            Object[] array2 = StringsKt.split$default(str2, new String[]{"="}, false, 0, 6, null).toArray(new String[0]);
            if (array2 == null) {
                throw new NullPointerException("null cannot be cast to non-null type kotlin.Array<T>");
            }
            String[] strArr2 = (String[]) array2;
            if (strArr2.length > 0) {
                String str3 = strArr2[0];
                int length2 = str3.length() - 1;
                int i12 = 0;
                boolean z10 = false;
                while (i12 <= length2) {
                    boolean z11 = Intrinsics.compare((int) str3.charAt(!z10 ? i12 : length2), 32) <= 0;
                    if (z10) {
                        if (!z11) {
                            break;
                        } else {
                            length2--;
                        }
                    } else if (z11) {
                        i12++;
                    } else {
                        z10 = true;
                    }
                }
                cookieManager.setCookie(str, Intrinsics.stringPlus(str3.subSequence(i12, length2 + 1).toString(), "=;expires=Sat, 1 Jan 2000 00:00:01 UTC;"));
            }
        }
        cookieManager.removeExpiredCookie();
    }

    @oj.n
    public static final void h0(@Nullable String str, @Nullable String str2, @Nullable Throwable th2) {
        com.facebook.g0 g0Var = com.facebook.g0.f99617a;
        if (com.facebook.g0.K()) {
            Z(str);
        }
    }

    @oj.n
    public static final void i(@NotNull Context context) {
        Intrinsics.checkNotNullParameter(context, "context");
        try {
            e1 e1Var = f99794a;
            e1Var.h(context, com.facebook.g0.Q);
            e1Var.h(context, ".facebook.com");
            e1Var.h(context, "https://facebook.com");
            e1Var.h(context, "https://.facebook.com");
        } catch (Exception unused) {
        }
    }

    @oj.n
    @NotNull
    public static final String i0(@NotNull Map<String, String> map) {
        Intrinsics.checkNotNullParameter(map, "map");
        String string = "";
        if (map.isEmpty()) {
            return "";
        }
        try {
            JSONObject jSONObject = new JSONObject();
            for (Map.Entry<String, String> entry : map.entrySet()) {
                jSONObject.put(entry.getKey(), entry.getValue());
            }
            string = jSONObject.toString();
        } catch (JSONException unused) {
        }
        Intrinsics.checkNotNullExpressionValue(string, "{\n      try {\n        val jsonObject = JSONObject()\n        for ((key, value) in map) {\n          jsonObject.put(key, value)\n        }\n        jsonObject.toString()\n      } catch (_e: JSONException) {\n        \"\"\n      }\n    }");
        return string;
    }

    @oj.n
    public static final void j(@Nullable Closeable closeable) {
        if (closeable == null) {
            return;
        }
        try {
            closeable.close();
        } catch (IOException unused) {
        }
    }

    @oj.n
    @Nullable
    public static final String j0(@NotNull String key) {
        Intrinsics.checkNotNullParameter(key, "key");
        return f99794a.N("MD5", key);
    }

    @oj.n
    @Nullable
    public static final String k(@Nullable String str, @Nullable String str2) {
        return Z(str) ? str2 : str;
    }

    @oj.n
    public static final boolean k0(@NotNull Context context) {
        Intrinsics.checkNotNullParameter(context, "context");
        return S(context);
    }

    private final long l(double d10) {
        return Math.round(d10 / 1.073741824E9d);
    }

    @oj.n
    @NotNull
    public static final Bundle l0(@Nullable String str) {
        Bundle bundle = new Bundle();
        if (!Z(str)) {
            if (str == null) {
                throw new IllegalStateException("Required value was null.");
            }
            Object[] array = StringsKt.split$default(str, new String[]{"&"}, false, 0, 6, null).toArray(new String[0]);
            if (array == null) {
                throw new NullPointerException("null cannot be cast to non-null type kotlin.Array<T>");
            }
            String[] strArr = (String[]) array;
            int length = strArr.length;
            int i10 = 0;
            while (i10 < length) {
                int i11 = i10 + 1;
                Object[] array2 = StringsKt.split$default(strArr[i10], new String[]{"="}, false, 0, 6, null).toArray(new String[0]);
                if (array2 == null) {
                    throw new NullPointerException("null cannot be cast to non-null type kotlin.Array<T>");
                }
                String[] strArr2 = (String[]) array2;
                try {
                    if (strArr2.length == 2) {
                        bundle.putString(URLDecoder.decode(strArr2[0], "UTF-8"), URLDecoder.decode(strArr2[1], "UTF-8"));
                    } else if (strArr2.length == 1) {
                        bundle.putString(URLDecoder.decode(strArr2[0], "UTF-8"), "");
                    }
                } catch (UnsupportedEncodingException e10) {
                    f0(f99795b, e10);
                }
                i10 = i11;
            }
        }
        return bundle;
    }

    @oj.n
    @NotNull
    public static final List<String> m(@NotNull JSONArray jsonArray) {
        Intrinsics.checkNotNullParameter(jsonArray, "jsonArray");
        try {
            ArrayList arrayList = new ArrayList();
            int length = jsonArray.length();
            if (length > 0) {
                int i10 = 0;
                while (true) {
                    int i11 = i10 + 1;
                    String string = jsonArray.getString(i10);
                    Intrinsics.checkNotNullExpressionValue(string, "jsonArray.getString(i)");
                    arrayList.add(string);
                    if (i11 >= length) {
                        break;
                    }
                    i10 = i11;
                }
            }
            return arrayList;
        } catch (JSONException unused) {
            return new ArrayList();
        }
    }

    @oj.n
    public static final void m0(@NotNull Bundle b10, @Nullable String str, @Nullable List<String> list) {
        Intrinsics.checkNotNullParameter(b10, "b");
        if (list != null) {
            b10.putString(str, TextUtils.join(",", list));
        }
    }

    @oj.n
    @NotNull
    public static final Map<String, Object> n(@NotNull JSONObject jsonObject) {
        int length;
        Intrinsics.checkNotNullParameter(jsonObject, "jsonObject");
        HashMap map = new HashMap();
        JSONArray jSONArrayNames = jsonObject.names();
        if (jSONArrayNames != null && (length = jSONArrayNames.length()) > 0) {
            int i10 = 0;
            while (true) {
                int i11 = i10 + 1;
                try {
                    String string = jSONArrayNames.getString(i10);
                    Intrinsics.checkNotNullExpressionValue(string, "keys.getString(i)");
                    Object value = jsonObject.get(string);
                    if (value instanceof JSONObject) {
                        value = n((JSONObject) value);
                    }
                    Intrinsics.checkNotNullExpressionValue(value, "value");
                    map.put(string, value);
                } catch (JSONException unused) {
                }
                if (i11 >= length) {
                    break;
                }
                i10 = i11;
            }
        }
        return map;
    }

    @oj.n
    public static final boolean n0(@NotNull Bundle bundle, @Nullable String str, @Nullable Object obj) {
        Intrinsics.checkNotNullParameter(bundle, "bundle");
        if (obj == null) {
            bundle.remove(str);
        } else if (obj instanceof Boolean) {
            bundle.putBoolean(str, ((Boolean) obj).booleanValue());
        } else if (obj instanceof boolean[]) {
            bundle.putBooleanArray(str, (boolean[]) obj);
        } else if (obj instanceof Double) {
            bundle.putDouble(str, ((Number) obj).doubleValue());
        } else if (obj instanceof double[]) {
            bundle.putDoubleArray(str, (double[]) obj);
        } else if (obj instanceof Integer) {
            bundle.putInt(str, ((Number) obj).intValue());
        } else if (obj instanceof int[]) {
            bundle.putIntArray(str, (int[]) obj);
        } else if (obj instanceof Long) {
            bundle.putLong(str, ((Number) obj).longValue());
        } else if (obj instanceof long[]) {
            bundle.putLongArray(str, (long[]) obj);
        } else if (obj instanceof String) {
            bundle.putString(str, (String) obj);
        } else if (obj instanceof JSONArray) {
            bundle.putString(str, ((JSONArray) obj).toString());
        } else {
            if (!(obj instanceof JSONObject)) {
                return false;
            }
            bundle.putString(str, ((JSONObject) obj).toString());
        }
        return true;
    }

    @oj.n
    @NotNull
    public static final Map<String, String> o(@NotNull JSONObject jsonObject) {
        Intrinsics.checkNotNullParameter(jsonObject, "jsonObject");
        HashMap map = new HashMap();
        Iterator<String> itKeys = jsonObject.keys();
        while (itKeys.hasNext()) {
            String key = itKeys.next();
            String strOptString = jsonObject.optString(key);
            if (strOptString != null) {
                Intrinsics.checkNotNullExpressionValue(key, "key");
                map.put(key, strOptString);
            }
        }
        return map;
    }

    @oj.n
    public static final void o0(@NotNull Bundle b10, @Nullable String str, @Nullable String str2) {
        Intrinsics.checkNotNullParameter(b10, "b");
        if (Z(str2)) {
            return;
        }
        b10.putString(str, str2);
    }

    @oj.n
    public static final int p(@Nullable InputStream inputStream, @NotNull OutputStream outputStream) throws Throwable {
        Intrinsics.checkNotNullParameter(outputStream, "outputStream");
        BufferedInputStream bufferedInputStream = null;
        try {
            BufferedInputStream bufferedInputStream2 = new BufferedInputStream(inputStream);
            try {
                byte[] bArr = new byte[8192];
                int i10 = 0;
                while (true) {
                    int i11 = bufferedInputStream2.read(bArr);
                    if (i11 == -1) {
                        break;
                    }
                    outputStream.write(bArr, 0, i11);
                    i10 += i11;
                }
                bufferedInputStream2.close();
                if (inputStream == null) {
                    return i10;
                }
                inputStream.close();
                return i10;
            } catch (Throwable th2) {
                th = th2;
                bufferedInputStream = bufferedInputStream2;
                if (bufferedInputStream != null) {
                    bufferedInputStream.close();
                }
                if (inputStream != null) {
                    inputStream.close();
                }
                throw th;
            }
        } catch (Throwable th3) {
            th = th3;
        }
    }

    @oj.n
    public static final void p0(@NotNull Bundle b10, @Nullable String str, @Nullable Uri uri) {
        Intrinsics.checkNotNullParameter(b10, "b");
        if (uri != null) {
            o0(b10, str, uri.toString());
        }
    }

    @oj.n
    public static final void q(@Nullable URLConnection uRLConnection) {
        if (uRLConnection == null || !(uRLConnection instanceof HttpURLConnection)) {
            return;
        }
        ((HttpURLConnection) uRLConnection).disconnect();
    }

    @oj.n
    @Nullable
    public static final Map<String, String> q0(@NotNull Parcel parcel) {
        Intrinsics.checkNotNullParameter(parcel, "parcel");
        int i10 = parcel.readInt();
        if (i10 < 0) {
            return null;
        }
        HashMap map = new HashMap();
        if (i10 > 0) {
            int i11 = 0;
            do {
                i11++;
                String string = parcel.readString();
                String string2 = parcel.readString();
                if (string != null && string2 != null) {
                    map.put(string, string2);
                }
            } while (i11 < i10);
        }
        return map;
    }

    private final boolean r() {
        return Intrinsics.areEqual("mounted", Environment.getExternalStorageState());
    }

    @oj.n
    @NotNull
    public static final String r0(@Nullable InputStream inputStream) throws Throwable {
        BufferedInputStream bufferedInputStream;
        Throwable th2;
        InputStreamReader inputStreamReader;
        try {
            bufferedInputStream = new BufferedInputStream(inputStream);
            try {
                inputStreamReader = new InputStreamReader(bufferedInputStream);
                try {
                    StringBuilder sb2 = new StringBuilder();
                    char[] cArr = new char[2048];
                    while (true) {
                        int i10 = inputStreamReader.read(cArr);
                        if (i10 == -1) {
                            String string = sb2.toString();
                            Intrinsics.checkNotNullExpressionValue(string, "{\n      bufferedInputStream = BufferedInputStream(inputStream)\n      reader = InputStreamReader(bufferedInputStream)\n      val stringBuilder = StringBuilder()\n      val bufferSize = 1024 * 2\n      val buffer = CharArray(bufferSize)\n      var n = 0\n      while (reader.read(buffer).also { n = it } != -1) {\n        stringBuilder.append(buffer, 0, n)\n      }\n      stringBuilder.toString()\n    }");
                            j(bufferedInputStream);
                            j(inputStreamReader);
                            return string;
                        }
                        sb2.append(cArr, 0, i10);
                    }
                } catch (Throwable th3) {
                    th2 = th3;
                    j(bufferedInputStream);
                    j(inputStreamReader);
                    throw th2;
                }
            } catch (Throwable th4) {
                th2 = th4;
                inputStreamReader = null;
            }
        } catch (Throwable th5) {
            bufferedInputStream = null;
            th2 = th5;
            inputStreamReader = null;
        }
    }

    @oj.n
    @NotNull
    public static final String s(int i10) {
        String string = new BigInteger(i10 * 5, new Random()).toString(32);
        Intrinsics.checkNotNullExpressionValue(string, "BigInteger(length * 5, r).toString(32)");
        return string;
    }

    @oj.n
    @Nullable
    public static final Map<String, String> s0(@NotNull Parcel parcel) {
        Intrinsics.checkNotNullParameter(parcel, "parcel");
        int i10 = parcel.readInt();
        if (i10 < 0) {
            return null;
        }
        HashMap map = new HashMap();
        if (i10 > 0) {
            int i11 = 0;
            do {
                i11++;
                map.put(parcel.readString(), parcel.readString());
            } while (i11 < i10);
        }
        return map;
    }

    @oj.n
    @NotNull
    public static final String t(@Nullable Context context) {
        if (context == null) {
            return AbstractJsonLexerKt.NULL;
        }
        if (context == context.getApplicationContext()) {
            return "unknown";
        }
        String simpleName = context.getClass().getSimpleName();
        Intrinsics.checkNotNullExpressionValue(simpleName, "{\n      context.javaClass.simpleName\n    }");
        return simpleName;
    }

    private final void t0() {
        try {
            if (r()) {
                StatFs statFs = new StatFs(Environment.getExternalStorageDirectory().getPath());
                f99808o = ((long) statFs.getAvailableBlocks()) * ((long) statFs.getBlockSize());
            }
            f99808o = l(f99808o);
        } catch (Exception unused) {
        }
    }

    @oj.n
    @NotNull
    public static final String u(@NotNull Context context) {
        Intrinsics.checkNotNullParameter(context, "context");
        try {
            com.facebook.g0 g0Var = com.facebook.g0.f99617a;
            String strP = com.facebook.g0.p();
            if (strP != null) {
                return strP;
            }
            ApplicationInfo applicationInfo = context.getApplicationInfo();
            int i10 = applicationInfo.labelRes;
            if (i10 == 0) {
                return applicationInfo.nonLocalizedLabel.toString();
            }
            String string = context.getString(i10);
            Intrinsics.checkNotNullExpressionValue(string, "context.getString(stringId)");
            return string;
        } catch (Exception unused) {
            return "";
        }
    }

    private final int u0() {
        int i10 = f99805l;
        if (i10 > 0) {
            return i10;
        }
        try {
            File[] fileArrListFiles = new File("/sys/devices/system/cpu/").listFiles(new FilenameFilter() { // from class: com.facebook.internal.d1
                @Override // java.io.FilenameFilter
                public final boolean accept(File file, String str) {
                    return e1.v0(file, str);
                }
            });
            if (fileArrListFiles != null) {
                f99805l = fileArrListFiles.length;
            }
        } catch (Exception unused) {
        }
        if (f99805l <= 0) {
            f99805l = Math.max(Runtime.getRuntime().availableProcessors(), 1);
        }
        return f99805l;
    }

    @oj.n
    @Nullable
    public static final String v() {
        com.facebook.g0 g0Var = com.facebook.g0.f99617a;
        Context contextN = com.facebook.g0.n();
        if (contextN == null) {
            return null;
        }
        try {
            PackageInfo packageInfo = contextN.getPackageManager().getPackageInfo(contextN.getPackageName(), 0);
            if (packageInfo == null) {
                return null;
            }
            return packageInfo.versionName;
        } catch (PackageManager.NameNotFoundException unused) {
            return null;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean v0(File file, String str) {
        return Pattern.matches("cpu[0-9]+", str);
    }

    @oj.n
    @Nullable
    public static final Date w(@Nullable Bundle bundle, @Nullable String str, @NotNull Date dateBase) {
        long jLongValue;
        Intrinsics.checkNotNullParameter(dateBase, "dateBase");
        Date date = null;
        if (bundle == null) {
            return null;
        }
        Object obj = bundle.get(str);
        if (!(obj instanceof Long)) {
            if (obj instanceof String) {
                try {
                    jLongValue = Long.parseLong((String) obj);
                } catch (NumberFormatException unused) {
                }
            }
            return date;
        }
        jLongValue = ((Number) obj).longValue();
        if (jLongValue == 0) {
            return new Date(Long.MAX_VALUE);
        }
        date = new Date(dateBase.getTime() + (jLongValue * 1000));
        return date;
    }

    private final void w0(Context context) {
        if (Intrinsics.areEqual(f99811r, f99804k)) {
            try {
                Object systemService = context.getSystemService("phone");
                if (systemService == null) {
                    throw new NullPointerException("null cannot be cast to non-null type android.telephony.TelephonyManager");
                }
                String networkOperatorName = ((TelephonyManager) systemService).getNetworkOperatorName();
                Intrinsics.checkNotNullExpressionValue(networkOperatorName, "telephonyManager.networkOperatorName");
                f99811r = networkOperatorName;
            } catch (Exception unused) {
            }
        }
    }

    @oj.n
    public static final long x(@NotNull Uri contentUri) {
        Intrinsics.checkNotNullParameter(contentUri, "contentUri");
        Cursor cursorQuery = null;
        try {
            com.facebook.g0 g0Var = com.facebook.g0.f99617a;
            cursorQuery = com.facebook.g0.n().getContentResolver().query(contentUri, null, null, null, null);
            if (cursorQuery == null) {
                return 0L;
            }
            int columnIndex = cursorQuery.getColumnIndex("_size");
            cursorQuery.moveToFirst();
            long j10 = cursorQuery.getLong(columnIndex);
            cursorQuery.close();
            return j10;
        } catch (Throwable th2) {
            if (cursorQuery == null) {
                throw th2;
            }
            cursorQuery.close();
            throw th2;
        }
    }

    private final void x0(Context context) {
        if (f99806m == -1 || System.currentTimeMillis() - f99806m >= 1800000) {
            f99806m = System.currentTimeMillis();
            y0();
            w0(context);
            z0();
            t0();
        }
    }

    @oj.n
    @NotNull
    public static final Locale y() {
        Locale localeJ = J();
        if (localeJ != null) {
            return localeJ;
        }
        Locale locale = Locale.getDefault();
        Intrinsics.checkNotNullExpressionValue(locale, "getDefault()");
        return locale;
    }

    private final void y0() {
        try {
            TimeZone timeZone = TimeZone.getDefault();
            String displayName = timeZone.getDisplayName(timeZone.inDaylightTime(new Date()), 0);
            Intrinsics.checkNotNullExpressionValue(displayName, "tz.getDisplayName(tz.inDaylightTime(Date()), TimeZone.SHORT)");
            f99809p = displayName;
            String id2 = timeZone.getID();
            Intrinsics.checkNotNullExpressionValue(id2, "tz.id");
            f99810q = id2;
        } catch (AssertionError | Exception unused) {
        }
    }

    private final String z() {
        AccessToken accessTokenI = AccessToken.f98366l.i();
        return (accessTokenI == null || accessTokenI.o() == null) ? AccessToken.f98376v : accessTokenI.o();
    }

    private final void z0() {
        try {
            if (r()) {
                StatFs statFs = new StatFs(Environment.getExternalStorageDirectory().getPath());
                f99807n = ((long) statFs.getBlockCount()) * ((long) statFs.getBlockSize());
            }
            f99807n = l(f99807n);
        } catch (Exception unused) {
        }
    }
}
