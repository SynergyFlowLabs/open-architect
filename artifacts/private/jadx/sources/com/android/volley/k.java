package com.android.volley;

import android.text.TextUtils;

/* JADX INFO: loaded from: classes3.dex */
public final class k {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final String f89463a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final String f89464b;

    public k(String str, String str2) {
        this.f89463a = str;
        this.f89464b = str2;
    }

    public final String a() {
        return this.f89463a;
    }

    public final String b() {
        return this.f89464b;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && k.class == obj.getClass()) {
            k kVar = (k) obj;
            if (TextUtils.equals(this.f89463a, kVar.f89463a) && TextUtils.equals(this.f89464b, kVar.f89464b)) {
                return true;
            }
        }
        return false;
    }

    public int hashCode() {
        return (this.f89463a.hashCode() * 31) + this.f89464b.hashCode();
    }

    public String toString() {
        return "Header[name=" + this.f89463a + ",value=" + this.f89464b + "]";
    }
}
