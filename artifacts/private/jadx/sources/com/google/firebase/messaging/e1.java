package com.google.firebase.messaging;

import android.content.Context;
import android.content.SharedPreferences;
import android.text.TextUtils;
import android.util.Log;
import java.io.File;
import java.io.IOException;
import java.util.concurrent.TimeUnit;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes5.dex */
class e1 {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static final String f123552b = "|T|";

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static final String f123553c = "*";

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    static final String f123554d = "com.google.android.gms.appid";

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    static final String f123555e = "com.google.android.gms.appid-no-backup";

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    final SharedPreferences f123556a;

    static class a {

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private static final String f123557d = "token";

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        private static final String f123558e = "appVersion";

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        private static final String f123559f = "timestamp";

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        private static final long f123560g = TimeUnit.DAYS.toMillis(7);

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final String f123561a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final String f123562b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final long f123563c;

        private a(String str, String str2, long j10) {
            this.f123561a = str;
            this.f123562b = str2;
            this.f123563c = j10;
        }

        static String a(String str, String str2, long j10) {
            try {
                JSONObject jSONObject = new JSONObject();
                jSONObject.put("token", str);
                jSONObject.put("appVersion", str2);
                jSONObject.put("timestamp", j10);
                return jSONObject.toString();
            } catch (JSONException e10) {
                e10.toString();
                return null;
            }
        }

        static a c(String str) {
            if (TextUtils.isEmpty(str)) {
                return null;
            }
            if (!str.startsWith("{")) {
                return new a(str, null, 0L);
            }
            try {
                JSONObject jSONObject = new JSONObject(str);
                return new a(jSONObject.getString("token"), jSONObject.getString("appVersion"), jSONObject.getLong("timestamp"));
            } catch (JSONException e10) {
                e10.toString();
                return null;
            }
        }

        boolean b(String str) {
            return System.currentTimeMillis() > this.f123563c + f123560g || !str.equals(this.f123562b);
        }
    }

    public e1(Context context) {
        this.f123556a = context.getSharedPreferences(f123554d, 0);
        a(context, f123555e);
    }

    private void a(Context context, String str) {
        File file = new File(androidx.core.content.d.p(context), str);
        if (file.exists()) {
            return;
        }
        try {
            if (!file.createNewFile() || f()) {
                return;
            }
            c();
        } catch (IOException e10) {
            if (Log.isLoggable(e.f123469a, 3)) {
                e10.getMessage();
            }
        }
    }

    private String b(String str, String str2) {
        return str + f123552b + str2 + "|*";
    }

    public synchronized void c() {
        try {
            this.f123556a.edit().clear().commit();
        } catch (Throwable th2) {
            throw th2;
        }
    }

    public synchronized void d(String str, String str2) {
        try {
            String strB = b(str, str2);
            SharedPreferences.Editor editorEdit = this.f123556a.edit();
            editorEdit.remove(strB);
            editorEdit.commit();
        } catch (Throwable th2) {
            throw th2;
        }
    }

    public synchronized a e(String str, String str2) {
        return a.c(this.f123556a.getString(b(str, str2), null));
    }

    public synchronized boolean f() {
        try {
        } catch (Throwable th2) {
            throw th2;
        }
        return this.f123556a.getAll().isEmpty();
    }

    public synchronized void g(String str, String str2, String str3, String str4) {
        String strA = a.a(str3, str4, System.currentTimeMillis());
        if (strA == null) {
            return;
        }
        SharedPreferences.Editor editorEdit = this.f123556a.edit();
        editorEdit.putString(b(str, str2), strA);
        editorEdit.commit();
    }
}
