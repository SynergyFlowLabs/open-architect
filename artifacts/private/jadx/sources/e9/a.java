package e9;

import android.content.Context;
import android.content.SharedPreferences;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageManager;
import android.os.Bundle;
import androidx.annotation.l1;
import androidx.core.content.d;
import m8.c;

/* JADX INFO: loaded from: classes5.dex */
public class a {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private static final String f274707e = "com.google.firebase.common.prefs:";

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    @l1
    public static final String f274708f = "firebase_data_collection_default_enabled";

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final Context f274709a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final SharedPreferences f274710b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final c f274711c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private boolean f274712d;

    public a(Context context, String str, c cVar) {
        Context contextA = a(context);
        this.f274709a = contextA;
        this.f274710b = contextA.getSharedPreferences(f274707e + str, 0);
        this.f274711c = cVar;
        this.f274712d = c();
    }

    private static Context a(Context context) {
        return d.c(context);
    }

    private boolean c() {
        if (!this.f274710b.contains(f274708f)) {
            return d();
        }
        int i10 = 2 << 1;
        return this.f274710b.getBoolean(f274708f, true);
    }

    private boolean d() {
        ApplicationInfo applicationInfo;
        Bundle bundle;
        try {
            PackageManager packageManager = this.f274709a.getPackageManager();
            if (packageManager != null && (applicationInfo = packageManager.getApplicationInfo(this.f274709a.getPackageName(), 128)) != null && (bundle = applicationInfo.metaData) != null && bundle.containsKey(f274708f)) {
                return applicationInfo.metaData.getBoolean(f274708f);
            }
        } catch (PackageManager.NameNotFoundException unused) {
        }
        return true;
    }

    private synchronized void f(boolean z10) {
        try {
            if (this.f274712d != z10) {
                this.f274712d = z10;
                this.f274711c.c(new m8.a<>(com.google.firebase.c.class, new com.google.firebase.c(z10)));
            }
        } catch (Throwable th2) {
            throw th2;
        }
    }

    public synchronized boolean b() {
        try {
        } catch (Throwable th2) {
            throw th2;
        }
        return this.f274712d;
    }

    public synchronized void e(Boolean bool) {
        try {
            if (bool == null) {
                this.f274710b.edit().remove(f274708f).apply();
                f(d());
            } else {
                boolean zEquals = Boolean.TRUE.equals(bool);
                this.f274710b.edit().putBoolean(f274708f, zEquals).apply();
                f(zEquals);
            }
        } catch (Throwable th2) {
            throw th2;
        }
    }
}
