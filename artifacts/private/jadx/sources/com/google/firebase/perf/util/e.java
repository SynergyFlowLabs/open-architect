package com.google.firebase.perf.util;

import android.os.Bundle;

/* JADX INFO: loaded from: classes5.dex */
public final class e {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static final com.google.firebase.perf.logging.a f124231b = com.google.firebase.perf.logging.a.e();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final Bundle f124232a;

    public e() {
        this(new Bundle());
    }

    private f<Integer> d(String str) {
        if (!a(str)) {
            return f.a();
        }
        try {
            return f.b((Integer) this.f124232a.get(str));
        } catch (ClassCastException e10) {
            f124231b.b("Metadata key %s contains type other than int: %s", str, e10.getMessage());
            return f.a();
        }
    }

    public boolean a(String str) {
        return str != null && this.f124232a.containsKey(str);
    }

    public f<Boolean> b(String str) {
        if (!a(str)) {
            return f.a();
        }
        try {
            return f.b((Boolean) this.f124232a.get(str));
        } catch (ClassCastException e10) {
            f124231b.b("Metadata key %s contains type other than boolean: %s", str, e10.getMessage());
            return f.a();
        }
    }

    public f<Double> c(String str) {
        Object obj;
        if (a(str) && (obj = this.f124232a.get(str)) != null) {
            if (obj instanceof Float) {
                return f.e(Double.valueOf(((Float) obj).doubleValue()));
            }
            if (obj instanceof Double) {
                return f.e((Double) obj);
            }
            f124231b.b("Metadata key %s contains type other than double: %s", str);
            return f.a();
        }
        return f.a();
    }

    public f<Long> e(String str) {
        f<Integer> fVarD = d(str);
        return fVarD.d() ? f.e(Long.valueOf(fVarD.c().intValue())) : f.a();
    }

    public e(Bundle bundle) {
        this.f124232a = (Bundle) bundle.clone();
    }
}
