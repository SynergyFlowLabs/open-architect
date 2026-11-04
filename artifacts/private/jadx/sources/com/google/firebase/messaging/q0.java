package com.google.firebase.messaging;

import android.content.res.Resources;
import android.graphics.Color;
import android.net.Uri;
import android.os.Bundle;
import android.text.TextUtils;
import androidx.annotation.NonNull;
import java.util.Arrays;
import java.util.MissingFormatArgumentException;
import org.json.JSONArray;
import org.json.JSONException;

/* JADX INFO: loaded from: classes5.dex */
public class q0 {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static final int f123708b = -16777216;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static final int f123709c = 1;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private static final int f123710d = -1;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private static final int f123711e = 1;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private static final String f123712f = "NotificationParams";

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NonNull
    private final Bundle f123713a;

    public q0(@NonNull Bundle bundle) {
        if (bundle == null) {
            throw new NullPointerException("data");
        }
        this.f123713a = new Bundle(bundle);
    }

    private static String B(String str) {
        if (str.startsWith(e.c.f123485b)) {
            str = str.substring(6);
        }
        return str;
    }

    private static int d(String str) {
        int color = Color.parseColor(str);
        if (color != -16777216) {
            return color;
        }
        throw new IllegalArgumentException("Transparent color is invalid");
    }

    private static boolean t(String str) {
        return str.startsWith(e.a.f123473a) || str.equals("from");
    }

    public static boolean v(Bundle bundle) {
        return "1".equals(bundle.getString(e.c.f123487d)) || "1".equals(bundle.getString(x(e.c.f123487d)));
    }

    private static boolean w(String str) {
        return str.startsWith(e.d.f123525p) || str.startsWith(e.c.f123485b) || str.startsWith(e.c.f123486c);
    }

    private static String x(String str) {
        return !str.startsWith(e.c.f123485b) ? str : str.replace(e.c.f123485b, e.c.f123486c);
    }

    private String y(String str) {
        if (!this.f123713a.containsKey(str) && str.startsWith(e.c.f123485b)) {
            String strX = x(str);
            if (this.f123713a.containsKey(strX)) {
                return strX;
            }
        }
        return str;
    }

    public Bundle A() {
        Bundle bundle = new Bundle(this.f123713a);
        for (String str : this.f123713a.keySet()) {
            if (w(str)) {
                bundle.remove(str);
            }
        }
        return bundle;
    }

    public boolean a(String str) {
        String strP = p(str);
        if (!"1".equals(strP) && !Boolean.parseBoolean(strP)) {
            return false;
        }
        return true;
    }

    public Integer b(String str) {
        String strP = p(str);
        if (!TextUtils.isEmpty(strP)) {
            try {
                return Integer.valueOf(Integer.parseInt(strP));
            } catch (NumberFormatException unused) {
                B(str);
            }
        }
        return null;
    }

    @androidx.annotation.p0
    public JSONArray c(String str) {
        String strP = p(str);
        if (!TextUtils.isEmpty(strP)) {
            try {
                return new JSONArray(strP);
            } catch (JSONException unused) {
                B(str);
            }
        }
        return null;
    }

    @androidx.annotation.p0
    int[] e() {
        JSONArray jSONArrayC = c(e.c.f123506w);
        if (jSONArrayC == null) {
            return null;
        }
        int[] iArr = new int[3];
        try {
            if (jSONArrayC.length() != 3) {
                throw new JSONException("lightSettings don't have all three fields");
            }
            iArr[0] = d(jSONArrayC.optString(0));
            iArr[1] = jSONArrayC.optInt(1);
            iArr[2] = jSONArrayC.optInt(2);
            return iArr;
        } catch (IllegalArgumentException e10) {
            jSONArrayC.toString();
            e10.getMessage();
            return null;
        } catch (JSONException unused) {
            jSONArrayC.toString();
            return null;
        }
    }

    @androidx.annotation.p0
    public Uri f() {
        String strP = p(e.c.C);
        if (TextUtils.isEmpty(strP)) {
            strP = p(e.c.B);
        }
        if (TextUtils.isEmpty(strP)) {
            return null;
        }
        return Uri.parse(strP);
    }

    @androidx.annotation.p0
    public Object[] g(String str) {
        JSONArray jSONArrayC = c(str + e.c.G);
        if (jSONArrayC == null) {
            return null;
        }
        int length = jSONArrayC.length();
        String[] strArr = new String[length];
        for (int i10 = 0; i10 < length; i10++) {
            strArr[i10] = jSONArrayC.optString(i10);
        }
        return strArr;
    }

    @androidx.annotation.p0
    public String h(String str) {
        return p(str + e.c.F);
    }

    @androidx.annotation.p0
    public String i(Resources resources, String str, String str2) {
        String strH = h(str2);
        if (TextUtils.isEmpty(strH)) {
            return null;
        }
        int identifier = resources.getIdentifier(strH, androidx.constraintlayout.core.motion.utils.v.b.f43988e, str);
        if (identifier == 0) {
            B(str2 + e.c.F);
            return null;
        }
        Object[] objArrG = g(str2);
        if (objArrG == null) {
            return resources.getString(identifier);
        }
        try {
            return resources.getString(identifier, objArrG);
        } catch (MissingFormatArgumentException unused) {
            B(str2);
            Arrays.toString(objArrG);
            return null;
        }
    }

    public Long j(String str) {
        String strP = p(str);
        if (TextUtils.isEmpty(strP)) {
            return null;
        }
        try {
            return Long.valueOf(Long.parseLong(strP));
        } catch (NumberFormatException unused) {
            B(str);
            return null;
        }
    }

    public String k() {
        return p(e.c.D);
    }

    @androidx.annotation.p0
    Integer l() {
        Integer numB = b(e.c.f123503t);
        if (numB != null && numB.intValue() >= 0) {
            return numB;
        }
        return null;
    }

    @androidx.annotation.p0
    Integer m() {
        Integer numB = b(e.c.f123499p);
        if (numB == null) {
            return null;
        }
        if (numB.intValue() < -2 || numB.intValue() > 2) {
            return null;
        }
        return numB;
    }

    public String n(Resources resources, String str, String str2) {
        String strP = p(str2);
        return !TextUtils.isEmpty(strP) ? strP : i(resources, str, str2);
    }

    @androidx.annotation.p0
    public String o() {
        String strP = p(e.c.f123508y);
        return TextUtils.isEmpty(strP) ? p(e.c.f123509z) : strP;
    }

    public String p(String str) {
        return this.f123713a.getString(y(str));
    }

    @androidx.annotation.p0
    public long[] q() {
        JSONArray jSONArrayC = c(e.c.f123505v);
        if (jSONArrayC == null) {
            return null;
        }
        try {
            if (jSONArrayC.length() <= 1) {
                throw new JSONException("vibrateTimings have invalid length");
            }
            int length = jSONArrayC.length();
            long[] jArr = new long[length];
            for (int i10 = 0; i10 < length; i10++) {
                jArr[i10] = jSONArrayC.optLong(i10);
            }
            return jArr;
        } catch (NumberFormatException | JSONException unused) {
            jSONArrayC.toString();
            return null;
        }
    }

    Integer r() {
        Integer numB = b(e.c.f123504u);
        if (numB != null && numB.intValue() >= -1 && numB.intValue() <= 1) {
            return numB;
        }
        return null;
    }

    public boolean s() {
        return !TextUtils.isEmpty(p(e.c.f123493j));
    }

    public boolean u() {
        return a(e.c.f123487d);
    }

    public Bundle z() {
        Bundle bundle = new Bundle(this.f123713a);
        for (String str : this.f123713a.keySet()) {
            if (!t(str)) {
                bundle.remove(str);
            }
        }
        return bundle;
    }
}
