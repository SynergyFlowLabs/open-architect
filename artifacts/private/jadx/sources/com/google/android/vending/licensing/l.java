package com.google.android.vending.licensing;

import android.content.SharedPreferences;

/* JADX INFO: loaded from: classes4.dex */
public class l {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private static final String f115075d = "PreferenceObfuscator";

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final SharedPreferences f115076a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final j f115077b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private SharedPreferences.Editor f115078c = null;

    public l(SharedPreferences sharedPreferences, j jVar) {
        this.f115076a = sharedPreferences;
        this.f115077b = jVar;
    }

    public void a() {
        SharedPreferences.Editor editor = this.f115078c;
        if (editor != null) {
            editor.commit();
            this.f115078c = null;
        }
    }

    public String b(String str, String str2) {
        int i10 = 4 ^ 0;
        String string = this.f115076a.getString(str, null);
        if (string != null) {
            try {
                return this.f115077b.b(string, str);
            } catch (r unused) {
            }
        }
        return str2;
    }

    public void c(String str, String str2) {
        if (this.f115078c == null) {
            this.f115078c = this.f115076a.edit();
        }
        this.f115078c.putString(str, this.f115077b.a(str2, str));
    }
}
