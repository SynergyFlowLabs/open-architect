package com.google.firebase.crashlytics.internal.common;

import android.content.Context;
import android.content.SharedPreferences;
import android.os.Build;
import androidx.annotation.NonNull;
import java.util.Locale;
import java.util.Objects;
import java.util.UUID;
import java.util.concurrent.TimeUnit;
import java.util.regex.Pattern;

/* JADX INFO: loaded from: classes5.dex */
public class n0 implements o0 {

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private static final int f121133g = 10000;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public static final String f121134h = "0.0";

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    static final String f121135i = "crashlytics.advertising.id";

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    static final String f121136j = "crashlytics.installation.id";

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    static final String f121137k = "firebase.installation.id";

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    static final String f121138l = "crashlytics.installation.id";

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private static final String f121140n = "SYN_";

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final p0 f121142a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final Context f121143b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final String f121144c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final com.google.firebase.installations.k f121145d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final i0 f121146e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private o0.a f121147f;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private static final Pattern f121139m = Pattern.compile("[^\\p{Alnum}]");

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    private static final String f121141o = Pattern.quote("/");

    public n0(Context context, String str, com.google.firebase.installations.k kVar, i0 i0Var) {
        if (context == null) {
            throw new IllegalArgumentException("appContext must not be null");
        }
        if (str == null) {
            throw new IllegalArgumentException("appIdentifier must not be null");
        }
        this.f121143b = context;
        this.f121144c = str;
        this.f121145d = kVar;
        this.f121146e = i0Var;
        this.f121142a = new p0();
    }

    @NonNull
    private synchronized String b(String str, SharedPreferences sharedPreferences) {
        String strE;
        try {
            strE = e(UUID.randomUUID().toString());
            com.google.firebase.crashlytics.internal.g.f().k("Created new Crashlytics installation ID: " + strE + " for FID: " + str);
            sharedPreferences.edit().putString("crashlytics.installation.id", strE).putString(f121137k, str).apply();
        } catch (Throwable th2) {
            throw th2;
        }
        return strE;
    }

    static String c() {
        return f121140n + UUID.randomUUID().toString();
    }

    @NonNull
    private static String e(@NonNull String str) {
        return f121139m.matcher(str).replaceAll("").toLowerCase(Locale.US);
    }

    static boolean k(String str) {
        return str != null && str.startsWith(f121140n);
    }

    private String l(SharedPreferences sharedPreferences) {
        return sharedPreferences.getString("crashlytics.installation.id", null);
    }

    private String m(String str) {
        return str.replaceAll(f121141o, "");
    }

    private boolean n() {
        o0.a aVar = this.f121147f;
        if (aVar != null) {
            return aVar.e() == null && this.f121146e.d();
        }
        return true;
    }

    @Override // com.google.firebase.crashlytics.internal.common.o0
    @NonNull
    public synchronized o0.a a() {
        if (!n()) {
            return this.f121147f;
        }
        com.google.firebase.crashlytics.internal.g.f().k("Determining Crashlytics installation ID...");
        SharedPreferences sharedPreferencesR = i.r(this.f121143b);
        String string = sharedPreferencesR.getString(f121137k, null);
        com.google.firebase.crashlytics.internal.g.f().k("Cached Firebase Installation ID: " + string);
        if (this.f121146e.d()) {
            m0 m0VarD = d(false);
            com.google.firebase.crashlytics.internal.g.f().k("Fetched Firebase Installation ID: " + m0VarD.f());
            if (m0VarD.f() == null) {
                m0VarD = new m0(string == null ? c() : string, null);
            }
            if (Objects.equals(m0VarD.f(), string)) {
                this.f121147f = o0.a.a(l(sharedPreferencesR), m0VarD);
            } else {
                this.f121147f = o0.a.a(b(m0VarD.f(), sharedPreferencesR), m0VarD);
            }
        } else if (k(string)) {
            this.f121147f = o0.a.b(l(sharedPreferencesR));
        } else {
            this.f121147f = o0.a.b(b(c(), sharedPreferencesR));
        }
        com.google.firebase.crashlytics.internal.g.f().k("Install IDs: " + this.f121147f);
        return this.f121147f;
    }

    @NonNull
    public m0 d(boolean z10) {
        String strB;
        com.google.firebase.crashlytics.internal.concurrency.n.e();
        String str = null;
        if (z10) {
            try {
                strB = ((com.google.firebase.installations.p) com.google.android.gms.tasks.n.b(this.f121145d.b(false), 10000L, TimeUnit.MILLISECONDS)).b();
            } catch (Exception e10) {
                com.google.firebase.crashlytics.internal.g.f().n("Error getting Firebase authentication token.", e10);
                strB = null;
            }
        } else {
            strB = null;
        }
        try {
            str = (String) com.google.android.gms.tasks.n.b(this.f121145d.getId(), 10000L, TimeUnit.MILLISECONDS);
        } catch (Exception e11) {
            com.google.firebase.crashlytics.internal.g.f().n("Error getting Firebase installation id.", e11);
        }
        return new m0(str, strB);
    }

    public String f() {
        return this.f121144c;
    }

    public String g() {
        return this.f121142a.a(this.f121143b);
    }

    public String h() {
        return String.format(Locale.US, "%s/%s", m(Build.MANUFACTURER), m(Build.MODEL));
    }

    public String i() {
        return m(Build.VERSION.INCREMENTAL);
    }

    public String j() {
        return m(Build.VERSION.RELEASE);
    }
}
