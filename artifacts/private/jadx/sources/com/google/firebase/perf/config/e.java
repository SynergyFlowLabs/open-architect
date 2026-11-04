package com.google.firebase.perf.config;

import android.content.Context;
import android.content.SharedPreferences;
import androidx.annotation.l1;
import androidx.annotation.p0;
import com.google.firebase.h;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

/* JADX INFO: loaded from: classes5.dex */
@l1(otherwise = 3)
public class e {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static final com.google.firebase.perf.logging.a f123895c = com.google.firebase.perf.logging.a.e();

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private static final String f123896d = "FirebasePerfSharedPrefs";

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private static e f123897e;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private volatile SharedPreferences f123898a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final ExecutorService f123899b;

    @l1
    public e(ExecutorService executorService) {
        this.f123899b = executorService;
    }

    public static /* synthetic */ void a(e eVar, Context context) {
        if (eVar.f123898a != null || context == null) {
            return;
        }
        eVar.f123898a = context.getSharedPreferences("FirebasePerfSharedPrefs", 0);
    }

    @l1
    public static void c() {
        f123897e = null;
    }

    @p0
    private Context g() {
        try {
            h.p();
            return h.p().n();
        } catch (IllegalStateException unused) {
            return null;
        }
    }

    @e.a({"ThreadPoolCreation"})
    public static synchronized e h() {
        try {
            if (f123897e == null) {
                f123897e = new e(Executors.newSingleThreadExecutor());
            }
        } catch (Throwable th2) {
            throw th2;
        }
        return f123897e;
    }

    public void b(String str) {
        if (str == null) {
            f123895c.a("Key is null. Cannot clear nullable key");
        } else {
            this.f123898a.edit().remove(str).apply();
        }
    }

    public boolean d(String str) {
        return (this.f123898a == null || str == null || !this.f123898a.contains(str)) ? false : true;
    }

    public com.google.firebase.perf.util.f<Boolean> e(String str) {
        if (str == null) {
            f123895c.a("Key is null when getting boolean value on device cache.");
            return com.google.firebase.perf.util.f.a();
        }
        if (this.f123898a == null) {
            k(g());
            if (this.f123898a == null) {
                return com.google.firebase.perf.util.f.a();
            }
        }
        if (!this.f123898a.contains(str)) {
            return com.google.firebase.perf.util.f.a();
        }
        try {
            return com.google.firebase.perf.util.f.e(Boolean.valueOf(this.f123898a.getBoolean(str, false)));
        } catch (ClassCastException e10) {
            f123895c.b("Key %s from sharedPreferences has type other than long: %s", str, e10.getMessage());
            return com.google.firebase.perf.util.f.a();
        }
    }

    public com.google.firebase.perf.util.f<Double> f(String str) {
        if (str == null) {
            f123895c.a("Key is null when getting double value on device cache.");
            return com.google.firebase.perf.util.f.a();
        }
        if (this.f123898a == null) {
            k(g());
            if (this.f123898a == null) {
                return com.google.firebase.perf.util.f.a();
            }
        }
        if (!this.f123898a.contains(str)) {
            return com.google.firebase.perf.util.f.a();
        }
        try {
            try {
                return com.google.firebase.perf.util.f.e(Double.valueOf(Double.longBitsToDouble(this.f123898a.getLong(str, 0L))));
            } catch (ClassCastException e10) {
                f123895c.b("Key %s from sharedPreferences has type other than double: %s", str, e10.getMessage());
                return com.google.firebase.perf.util.f.a();
            }
        } catch (ClassCastException unused) {
            return com.google.firebase.perf.util.f.e(Double.valueOf(Float.valueOf(this.f123898a.getFloat(str, 0.0f)).doubleValue()));
        }
    }

    public com.google.firebase.perf.util.f<Long> i(String str) {
        if (str == null) {
            f123895c.a("Key is null when getting long value on device cache.");
            return com.google.firebase.perf.util.f.a();
        }
        if (this.f123898a == null) {
            k(g());
            if (this.f123898a == null) {
                return com.google.firebase.perf.util.f.a();
            }
        }
        if (!this.f123898a.contains(str)) {
            return com.google.firebase.perf.util.f.a();
        }
        try {
            return com.google.firebase.perf.util.f.e(Long.valueOf(this.f123898a.getLong(str, 0L)));
        } catch (ClassCastException e10) {
            f123895c.b("Key %s from sharedPreferences has type other than long: %s", str, e10.getMessage());
            return com.google.firebase.perf.util.f.a();
        }
    }

    public com.google.firebase.perf.util.f<String> j(String str) {
        if (str == null) {
            f123895c.a("Key is null when getting String value on device cache.");
            return com.google.firebase.perf.util.f.a();
        }
        if (this.f123898a == null) {
            k(g());
            if (this.f123898a == null) {
                return com.google.firebase.perf.util.f.a();
            }
        }
        if (!this.f123898a.contains(str)) {
            return com.google.firebase.perf.util.f.a();
        }
        try {
            return com.google.firebase.perf.util.f.e(this.f123898a.getString(str, ""));
        } catch (ClassCastException e10) {
            f123895c.b("Key %s from sharedPreferences has type other than String: %s", str, e10.getMessage());
            return com.google.firebase.perf.util.f.a();
        }
    }

    public synchronized void k(final Context context) {
        if (this.f123898a == null && context != null) {
            this.f123899b.execute(new Runnable() { // from class: com.google.firebase.perf.config.d
                @Override // java.lang.Runnable
                public final void run() {
                    e.a(this.f123893a, context);
                }
            });
        }
    }

    public boolean l(String str, double d10) {
        if (str == null) {
            f123895c.a("Key is null when setting double value on device cache.");
            return false;
        }
        if (this.f123898a == null) {
            k(g());
            if (this.f123898a == null) {
                return false;
            }
        }
        this.f123898a.edit().putLong(str, Double.doubleToRawLongBits(d10)).apply();
        return true;
    }

    public boolean m(String str, long j10) {
        if (str == null) {
            f123895c.a("Key is null when setting long value on device cache.");
            return false;
        }
        if (this.f123898a == null) {
            k(g());
            if (this.f123898a == null) {
                return false;
            }
        }
        this.f123898a.edit().putLong(str, j10).apply();
        return true;
    }

    public boolean n(String str, String str2) {
        if (str == null) {
            f123895c.a("Key is null when setting String value on device cache.");
            return false;
        }
        if (this.f123898a == null) {
            k(g());
            if (this.f123898a == null) {
                return false;
            }
        }
        if (str2 == null) {
            this.f123898a.edit().remove(str).apply();
            return true;
        }
        this.f123898a.edit().putString(str, str2).apply();
        return true;
    }

    public boolean o(String str, boolean z10) {
        if (str == null) {
            f123895c.a("Key is null when setting boolean value on device cache.");
            return false;
        }
        if (this.f123898a == null) {
            k(g());
            if (this.f123898a == null) {
                return false;
            }
        }
        this.f123898a.edit().putBoolean(str, z10).apply();
        return true;
    }
}
