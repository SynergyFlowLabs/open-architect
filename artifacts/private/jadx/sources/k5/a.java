package k5;

import android.util.Patterns;
import com.facebook.appevents.internal.p;
import com.google.firebase.analytics.FirebaseAnalytics;
import io.intercom.android.sdk.NotificationStatuses;
import java.io.File;
import java.io.FileInputStream;
import java.util.Map;
import java.util.regex.Pattern;
import kotlin.TuplesKt;
import kotlin.collections.MapsKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.Charsets;
import kotlin.text.StringsKt;
import oj.n;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes4.dex */
public final class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    public static final a f307536a = new a();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static final int f307537b = 30;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @NotNull
    private static final String f307538c = "password";

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @NotNull
    private static final String f307539d = "(?i)(confirm.*password)|(password.*(confirmation|confirm)|confirmation)";

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    @NotNull
    private static final String f307540e = "(?i)(sign in)|login|signIn";

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    @NotNull
    private static final String f307541f = "(?i)(sign.*(up|now)|registration|register|(create|apply).*(profile|account)|open.*account|account.*(open|creation|application)|enroll|join.*now)";

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    @NotNull
    private static final String f307542g = "(?i)add to(\\s|\\Z)|update(\\s|\\Z)|cart";

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    @NotNull
    private static final String f307543h = "(?i)add to(\\s|\\Z)|update(\\s|\\Z)|cart|shop|buy";

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private static Map<String, String> f307544i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private static Map<String, String> f307545j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private static Map<String, String> f307546k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private static JSONObject f307547l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private static boolean f307548m;

    private a() {
    }

    @n
    @Nullable
    public static final float[] a(@NotNull JSONObject viewHierarchy, @NotNull String appName) {
        if (com.facebook.internal.instrument.crashshield.b.e(a.class)) {
            return null;
        }
        try {
            Intrinsics.checkNotNullParameter(viewHierarchy, "viewHierarchy");
            Intrinsics.checkNotNullParameter(appName, "appName");
            if (!f307548m) {
                return null;
            }
            float[] fArr = new float[30];
            for (int i10 = 0; i10 < 30; i10++) {
                fArr[i10] = 0.0f;
            }
            try {
                String lowerCase = appName.toLowerCase();
                Intrinsics.checkNotNullExpressionValue(lowerCase, "(this as java.lang.String).toLowerCase()");
                JSONObject jSONObject = new JSONObject(viewHierarchy.optJSONObject(p.A).toString());
                String screenName = viewHierarchy.optString(p.f99115z);
                JSONArray jSONArray = new JSONArray();
                a aVar = f307536a;
                aVar.j(jSONObject, jSONArray);
                aVar.m(fArr, aVar.i(jSONObject));
                JSONObject jSONObjectB = aVar.b(jSONObject);
                if (jSONObjectB == null) {
                    return null;
                }
                Intrinsics.checkNotNullExpressionValue(screenName, "screenName");
                String string = jSONObject.toString();
                Intrinsics.checkNotNullExpressionValue(string, "viewTree.toString()");
                aVar.m(fArr, aVar.h(jSONObjectB, jSONArray, screenName, string, lowerCase));
            } catch (JSONException unused) {
            }
            return fArr;
        } catch (Throwable th2) {
            com.facebook.internal.instrument.crashshield.b.c(th2, a.class);
            return null;
        }
    }

    private final JSONObject b(JSONObject jSONObject) {
        int length;
        if (com.facebook.internal.instrument.crashshield.b.e(this)) {
            return null;
        }
        try {
            if (jSONObject.optBoolean(p.f99114y)) {
                return jSONObject;
            }
            JSONArray jSONArrayOptJSONArray = jSONObject.optJSONArray(p.f99099j);
            if (jSONArrayOptJSONArray != null && (length = jSONArrayOptJSONArray.length()) > 0) {
                int i10 = 0;
                while (true) {
                    int i11 = i10 + 1;
                    JSONObject jSONObject2 = jSONArrayOptJSONArray.getJSONObject(i10);
                    Intrinsics.checkNotNullExpressionValue(jSONObject2, "children.getJSONObject(i)");
                    JSONObject jSONObjectB = b(jSONObject2);
                    if (jSONObjectB != null) {
                        return jSONObjectB;
                    }
                    if (i11 < length) {
                        i10 = i11;
                    }
                }
            }
        } catch (JSONException unused) {
        } catch (Throwable th2) {
            com.facebook.internal.instrument.crashshield.b.c(th2, this);
        }
        return null;
    }

    @n
    @NotNull
    public static final String c(@NotNull String buttonText, @NotNull String activityName, @NotNull String appName) {
        if (com.facebook.internal.instrument.crashshield.b.e(a.class)) {
            return null;
        }
        try {
            Intrinsics.checkNotNullParameter(buttonText, "buttonText");
            Intrinsics.checkNotNullParameter(activityName, "activityName");
            Intrinsics.checkNotNullParameter(appName, "appName");
            String str = appName + " | " + activityName + ", " + buttonText;
            if (str == null) {
                throw new NullPointerException("null cannot be cast to non-null type java.lang.String");
            }
            String lowerCase = str.toLowerCase();
            Intrinsics.checkNotNullExpressionValue(lowerCase, "(this as java.lang.String).toLowerCase()");
            return lowerCase;
        } catch (Throwable th2) {
            com.facebook.internal.instrument.crashshield.b.c(th2, a.class);
            return null;
        }
    }

    @n
    public static final void d(@Nullable File file) {
        if (com.facebook.internal.instrument.crashshield.b.e(a.class)) {
            return;
        }
        try {
            try {
                f307547l = new JSONObject();
                FileInputStream fileInputStream = new FileInputStream(file);
                byte[] bArr = new byte[fileInputStream.available()];
                fileInputStream.read(bArr);
                fileInputStream.close();
                f307547l = new JSONObject(new String(bArr, Charsets.UTF_8));
                f307544i = MapsKt.mapOf(TuplesKt.to(p.B, "1"), TuplesKt.to(p.C, "2"), TuplesKt.to(p.D, androidx.exifinterface.media.a.f51345a5), TuplesKt.to(p.E, "4"));
                f307545j = MapsKt.mapOf(TuplesKt.to(p.F, com.facebook.appevents.p.f99189d0), TuplesKt.to(p.G, "1"), TuplesKt.to(p.H, "2"), TuplesKt.to(p.I, androidx.exifinterface.media.a.f51345a5), TuplesKt.to(p.J, "4"), TuplesKt.to(p.K, "5"), TuplesKt.to(p.L, "6"), TuplesKt.to(p.M, "7"), TuplesKt.to(p.N, "8"));
                f307546k = MapsKt.mapOf(TuplesKt.to(p.O, "1"), TuplesKt.to(p.P, "2"), TuplesKt.to(p.Q, androidx.exifinterface.media.a.f51345a5), TuplesKt.to(p.R, "4"));
                f307548m = true;
            } catch (Throwable th2) {
                com.facebook.internal.instrument.crashshield.b.c(th2, a.class);
            }
        } catch (Exception unused) {
        }
    }

    private final boolean e(JSONObject jSONObject) {
        if (com.facebook.internal.instrument.crashshield.b.e(this)) {
            return false;
        }
        try {
            return ((jSONObject.optInt(p.f99091d) & 1) << 5) > 0;
        } catch (Throwable th2) {
            com.facebook.internal.instrument.crashshield.b.c(th2, this);
            return false;
        }
    }

    @n
    public static final boolean f() {
        if (com.facebook.internal.instrument.crashshield.b.e(a.class)) {
            return false;
        }
        try {
            return f307548m;
        } catch (Throwable th2) {
            com.facebook.internal.instrument.crashshield.b.c(th2, a.class);
            return false;
        }
    }

    private final boolean g(String[] strArr, String[] strArr2) {
        if (com.facebook.internal.instrument.crashshield.b.e(this)) {
            return false;
        }
        try {
            int length = strArr.length;
            int i10 = 0;
            while (i10 < length) {
                String str = strArr[i10];
                i10++;
                int length2 = strArr2.length;
                int i11 = 0;
                while (i11 < length2) {
                    String str2 = strArr2[i11];
                    i11++;
                    if (StringsKt.V2(str2, str, false, 2, null)) {
                        return true;
                    }
                }
            }
            return false;
        } catch (Throwable th2) {
            com.facebook.internal.instrument.crashshield.b.c(th2, this);
            return false;
        }
    }

    private final float[] h(JSONObject jSONObject, JSONArray jSONArray, String str, String str2, String str3) {
        float f10;
        if (com.facebook.internal.instrument.crashshield.b.e(this)) {
            return null;
        }
        try {
            float[] fArr = new float[30];
            for (int i10 = 0; i10 < 30; i10++) {
                fArr[i10] = 0.0f;
            }
            int length = jSONArray.length();
            float f11 = 1.0f;
            fArr[3] = length > 1 ? length - 1.0f : 0.0f;
            try {
                int length2 = jSONArray.length();
                if (length2 > 0) {
                    int i11 = 0;
                    while (true) {
                        int i12 = i11 + 1;
                        JSONObject jSONObject2 = jSONArray.getJSONObject(i11);
                        f10 = f11;
                        try {
                            Intrinsics.checkNotNullExpressionValue(jSONObject2, "siblings.getJSONObject(i)");
                            if (e(jSONObject2)) {
                                fArr[9] = fArr[9] + f10;
                            }
                            if (i12 >= length2) {
                                break;
                            }
                            i11 = i12;
                            f11 = f10;
                        } catch (JSONException unused) {
                        }
                    }
                } else {
                    f10 = f11;
                }
            } catch (JSONException unused2) {
            }
            fArr[13] = -1.0f;
            fArr[14] = -1.0f;
            String str4 = str + '|' + str3;
            StringBuilder sb2 = new StringBuilder();
            StringBuilder sb3 = new StringBuilder();
            n(jSONObject, sb3, sb2);
            String string = sb2.toString();
            Intrinsics.checkNotNullExpressionValue(string, "hintSB.toString()");
            String string2 = sb3.toString();
            Intrinsics.checkNotNullExpressionValue(string2, "textSB.toString()");
            fArr[15] = l(p.B, p.N, p.O, string2) ? f10 : 0.0f;
            fArr[16] = l(p.B, p.N, p.P, str4) ? f10 : 0.0f;
            fArr[17] = l(p.B, p.N, p.R, string) ? f10 : 0.0f;
            fArr[18] = StringsKt.V2(str2, "password", false, 2, null) ? f10 : 0.0f;
            fArr[19] = k(f307539d, str2) ? f10 : 0.0f;
            fArr[20] = k(f307540e, str2) ? f10 : 0.0f;
            fArr[21] = k(f307541f, str2) ? f10 : 0.0f;
            fArr[22] = l(p.B, p.L, p.O, string2) ? f10 : 0.0f;
            fArr[24] = l(p.B, p.L, p.P, str4) ? f10 : 0.0f;
            fArr[25] = k(f307542g, string2) ? f10 : 0.0f;
            fArr[27] = k(f307543h, str4) ? f10 : 0.0f;
            fArr[28] = l(p.B, p.M, p.O, string2) ? f10 : 0.0f;
            fArr[29] = l(p.B, p.M, p.P, str4) ? f10 : 0.0f;
            return fArr;
        } catch (Throwable th2) {
            com.facebook.internal.instrument.crashshield.b.c(th2, this);
            return null;
        }
    }

    private final float[] i(JSONObject jSONObject) {
        if (com.facebook.internal.instrument.crashshield.b.e(this)) {
            return null;
        }
        try {
            float[] fArr = new float[30];
            int i10 = 0;
            for (int i11 = 0; i11 < 30; i11++) {
                fArr[i11] = 0.0f;
            }
            String strOptString = jSONObject.optString("text");
            Intrinsics.checkNotNullExpressionValue(strOptString, "node.optString(TEXT_KEY)");
            String lowerCase = strOptString.toLowerCase();
            Intrinsics.checkNotNullExpressionValue(lowerCase, "(this as java.lang.String).toLowerCase()");
            String strOptString2 = jSONObject.optString(p.f99100k);
            Intrinsics.checkNotNullExpressionValue(strOptString2, "node.optString(HINT_KEY)");
            String lowerCase2 = strOptString2.toLowerCase();
            Intrinsics.checkNotNullExpressionValue(lowerCase2, "(this as java.lang.String).toLowerCase()");
            String strOptString3 = jSONObject.optString(p.f99089c);
            Intrinsics.checkNotNullExpressionValue(strOptString3, "node.optString(CLASS_NAME_KEY)");
            String lowerCase3 = strOptString3.toLowerCase();
            Intrinsics.checkNotNullExpressionValue(lowerCase3, "(this as java.lang.String).toLowerCase()");
            int iOptInt = jSONObject.optInt(p.f99113x, -1);
            String[] strArr = {lowerCase, lowerCase2};
            if (g(new String[]{"$", "amount", "price", "total"}, strArr)) {
                fArr[0] = fArr[0] + 1.0f;
            }
            if (g(new String[]{"password", "pwd"}, strArr)) {
                fArr[1] = fArr[1] + 1.0f;
            }
            if (g(new String[]{"tel", "phone"}, strArr)) {
                fArr[2] = fArr[2] + 1.0f;
            }
            if (g(new String[]{FirebaseAnalytics.c.f120629o}, strArr)) {
                fArr[4] = fArr[4] + 1.0f;
            }
            if (iOptInt >= 0) {
                fArr[5] = fArr[5] + 1.0f;
            }
            if (iOptInt == 3 || iOptInt == 2) {
                fArr[6] = fArr[6] + 1.0f;
            }
            if (iOptInt == 32 || Patterns.EMAIL_ADDRESS.matcher(lowerCase).matches()) {
                fArr[7] = fArr[7] + 1.0f;
            }
            if (StringsKt.V2(lowerCase3, "checkbox", false, 2, null)) {
                fArr[8] = fArr[8] + 1.0f;
            }
            if (g(new String[]{NotificationStatuses.COMPLETE_STATUS, "confirm", "done", "submit"}, new String[]{lowerCase})) {
                fArr[10] = fArr[10] + 1.0f;
            }
            if (StringsKt.V2(lowerCase3, "radio", false, 2, null) && StringsKt.V2(lowerCase3, "button", false, 2, null)) {
                fArr[12] = fArr[12] + 1.0f;
            }
            try {
                JSONArray jSONArrayOptJSONArray = jSONObject.optJSONArray(p.f99099j);
                int length = jSONArrayOptJSONArray.length();
                if (length > 0) {
                    while (true) {
                        int i12 = i10 + 1;
                        JSONObject jSONObject2 = jSONArrayOptJSONArray.getJSONObject(i10);
                        Intrinsics.checkNotNullExpressionValue(jSONObject2, "childViews.getJSONObject(i)");
                        m(fArr, i(jSONObject2));
                        if (i12 >= length) {
                            break;
                        }
                        i10 = i12;
                    }
                }
            } catch (JSONException unused) {
            }
            return fArr;
        } catch (Throwable th2) {
            com.facebook.internal.instrument.crashshield.b.c(th2, this);
            return null;
        }
    }

    private final boolean j(JSONObject jSONObject, JSONArray jSONArray) {
        boolean z10;
        if (com.facebook.internal.instrument.crashshield.b.e(this)) {
            return false;
        }
        try {
            if (jSONObject.optBoolean(p.f99114y)) {
                return true;
            }
            JSONArray jSONArrayOptJSONArray = jSONObject.optJSONArray(p.f99099j);
            int length = jSONArrayOptJSONArray.length();
            if (length <= 0) {
                z10 = false;
                break;
            }
            int i10 = 0;
            while (true) {
                int i11 = i10 + 1;
                if (jSONArrayOptJSONArray.getJSONObject(i10).optBoolean(p.f99114y)) {
                    z10 = true;
                    break;
                }
                if (i11 >= length) {
                    z10 = false;
                    break;
                }
                i10 = i11;
            }
            boolean z11 = z10;
            JSONArray jSONArray2 = new JSONArray();
            if (z10) {
                int length2 = jSONArrayOptJSONArray.length();
                if (length2 > 0) {
                    int i12 = 0;
                    while (true) {
                        int i13 = i12 + 1;
                        jSONArray.put(jSONArrayOptJSONArray.getJSONObject(i12));
                        if (i13 >= length2) {
                            break;
                        }
                        i12 = i13;
                    }
                }
                return z11;
            }
            int length3 = jSONArrayOptJSONArray.length();
            if (length3 > 0) {
                int i14 = 0;
                while (true) {
                    int i15 = i14 + 1;
                    JSONObject child = jSONArrayOptJSONArray.getJSONObject(i14);
                    Intrinsics.checkNotNullExpressionValue(child, "child");
                    if (j(child, jSONArray)) {
                        jSONArray2.put(child);
                        z11 = true;
                    }
                    if (i15 >= length3) {
                        break;
                    }
                    i14 = i15;
                }
            }
            jSONObject.put(p.f99099j, jSONArray2);
            return z11;
        } catch (JSONException unused) {
            return false;
        } catch (Throwable th2) {
            com.facebook.internal.instrument.crashshield.b.c(th2, this);
            return false;
        }
    }

    private final boolean k(String str, String str2) {
        int i10 = 2 | 0;
        if (com.facebook.internal.instrument.crashshield.b.e(this)) {
            return false;
        }
        try {
            return Pattern.compile(str).matcher(str2).find();
        } catch (Throwable th2) {
            com.facebook.internal.instrument.crashshield.b.c(th2, this);
            return false;
        }
    }

    private final boolean l(String str, String str2, String str3, String str4) {
        JSONObject jSONObjectOptJSONObject;
        JSONObject jSONObjectOptJSONObject2;
        JSONObject jSONObjectOptJSONObject3;
        JSONObject jSONObjectOptJSONObject4;
        if (com.facebook.internal.instrument.crashshield.b.e(this)) {
            return false;
        }
        try {
            JSONObject jSONObject = f307547l;
            String strOptString = null;
            if (jSONObject == null) {
                Intrinsics.throwUninitializedPropertyAccessException("rules");
                throw null;
            }
            JSONObject jSONObjectOptJSONObject5 = jSONObject.optJSONObject("rulesForLanguage");
            if (jSONObjectOptJSONObject5 == null) {
                jSONObjectOptJSONObject = null;
            } else {
                Map<String, String> map = f307544i;
                if (map == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("languageInfo");
                    throw null;
                }
                jSONObjectOptJSONObject = jSONObjectOptJSONObject5.optJSONObject(map.get(str));
            }
            if (jSONObjectOptJSONObject == null || (jSONObjectOptJSONObject2 = jSONObjectOptJSONObject.optJSONObject("rulesForEvent")) == null) {
                jSONObjectOptJSONObject3 = null;
            } else {
                Map<String, String> map2 = f307545j;
                if (map2 == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("eventInfo");
                    throw null;
                }
                jSONObjectOptJSONObject3 = jSONObjectOptJSONObject2.optJSONObject(map2.get(str2));
            }
            if (jSONObjectOptJSONObject3 != null && (jSONObjectOptJSONObject4 = jSONObjectOptJSONObject3.optJSONObject("positiveRules")) != null) {
                Map<String, String> map3 = f307546k;
                if (map3 == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("textTypeInfo");
                    throw null;
                }
                strOptString = jSONObjectOptJSONObject4.optString(map3.get(str3));
            }
            if (strOptString == null) {
                return false;
            }
            return k(strOptString, str4);
        } catch (Throwable th2) {
            com.facebook.internal.instrument.crashshield.b.c(th2, this);
            return false;
        }
    }

    private final void m(float[] fArr, float[] fArr2) {
        if (com.facebook.internal.instrument.crashshield.b.e(this)) {
            return;
        }
        try {
            int length = fArr.length - 1;
            if (length < 0) {
                return;
            }
            int i10 = 0;
            while (true) {
                int i11 = i10 + 1;
                fArr[i10] = fArr[i10] + fArr2[i10];
                if (i11 > length) {
                    return;
                } else {
                    i10 = i11;
                }
            }
        } catch (Throwable th2) {
            com.facebook.internal.instrument.crashshield.b.c(th2, this);
        }
    }

    private final void n(JSONObject jSONObject, StringBuilder sb2, StringBuilder sb3) {
        int length;
        if (!com.facebook.internal.instrument.crashshield.b.e(this)) {
            try {
                String strOptString = jSONObject.optString("text", "");
                Intrinsics.checkNotNullExpressionValue(strOptString, "view.optString(TEXT_KEY, \"\")");
                String lowerCase = strOptString.toLowerCase();
                Intrinsics.checkNotNullExpressionValue(lowerCase, "(this as java.lang.String).toLowerCase()");
                String strOptString2 = jSONObject.optString(p.f99100k, "");
                Intrinsics.checkNotNullExpressionValue(strOptString2, "view.optString(HINT_KEY, \"\")");
                String lowerCase2 = strOptString2.toLowerCase();
                Intrinsics.checkNotNullExpressionValue(lowerCase2, "(this as java.lang.String).toLowerCase()");
                if (lowerCase.length() > 0) {
                    sb2.append(lowerCase);
                    sb2.append(" ");
                }
                if (lowerCase2.length() > 0) {
                    sb3.append(lowerCase2);
                    sb3.append(" ");
                }
                JSONArray jSONArrayOptJSONArray = jSONObject.optJSONArray(p.f99099j);
                if (jSONArrayOptJSONArray != null && (length = jSONArrayOptJSONArray.length()) > 0) {
                    int i10 = 0;
                    while (true) {
                        int i11 = i10 + 1;
                        try {
                            JSONObject currentChildView = jSONArrayOptJSONArray.getJSONObject(i10);
                            Intrinsics.checkNotNullExpressionValue(currentChildView, "currentChildView");
                            n(currentChildView, sb2, sb3);
                        } catch (JSONException unused) {
                        }
                        if (i11 >= length) {
                            break;
                        } else {
                            i10 = i11;
                        }
                    }
                }
            } catch (Throwable th2) {
                com.facebook.internal.instrument.crashshield.b.c(th2, this);
            }
        }
    }
}
