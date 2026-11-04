package com.google.android.gms.internal.measurement;

import android.content.Context;
import android.database.ContentObserver;

/* JADX INFO: loaded from: classes4.dex */
final class g9 implements d9 {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @androidx.annotation.b0("GservicesLoader.class")
    private static g9 f108440d;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final Context f108441a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final ContentObserver f108442b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @androidx.annotation.b0("GservicesLoader.class")
    private boolean f108443c;

    private g9() {
        this.f108443c = false;
        boolean z10 = false | false;
        this.f108441a = null;
        this.f108442b = null;
    }

    static g9 c(Context context) {
        g9 g9Var;
        synchronized (g9.class) {
            try {
                if (f108440d == null) {
                    f108440d = androidx.core.content.i0.d(context, "com.google.android.providers.gsf.permission.READ_GSERVICES") == 0 ? new g9(context) : new g9();
                }
                g9 g9Var2 = f108440d;
                if (g9Var2 != null && g9Var2.f108442b != null && !g9Var2.f108443c) {
                    try {
                        context.getContentResolver().registerContentObserver(o8.f108712a, true, f108440d.f108442b);
                        ((g9) com.google.common.base.j0.E(f108440d)).f108443c = true;
                    } catch (SecurityException unused) {
                    }
                }
                g9Var = (g9) com.google.common.base.j0.E(f108440d);
            } catch (Throwable th2) {
                throw th2;
            }
        }
        return g9Var;
    }

    static synchronized void e() {
        Context context;
        try {
            g9 g9Var = f108440d;
            if (g9Var != null && (context = g9Var.f108441a) != null && g9Var.f108442b != null && g9Var.f108443c) {
                context.getContentResolver().unregisterContentObserver(f108440d.f108442b);
            }
            f108440d = null;
        } catch (Throwable th2) {
            throw th2;
        }
    }

    @Override // com.google.android.gms.internal.measurement.d9
    /* JADX INFO: renamed from: d, reason: merged with bridge method [inline-methods] */
    public final String a(final String str) {
        Context context = this.f108441a;
        if (context != null && !u8.b(context)) {
            try {
                return (String) d9.b(new c9() { // from class: com.google.android.gms.internal.measurement.f9
                    @Override // com.google.android.gms.internal.measurement.c9
                    public final /* synthetic */ Object a() {
                        return this.f108423a.f(str);
                    }
                });
            } catch (IllegalStateException | NullPointerException | SecurityException unused) {
                "Unable to read GServices for: ".concat(str);
            }
        }
        return null;
    }

    final /* synthetic */ String f(String str) {
        return n8.a(((Context) com.google.common.base.j0.E(this.f108441a)).getContentResolver(), str, null);
    }

    private g9(Context context) {
        this.f108443c = false;
        this.f108441a = context;
        this.f108442b = new e9(this, null);
    }
}
