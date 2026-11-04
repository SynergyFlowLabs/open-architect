package com.google.android.datatransport.runtime.backends;

import android.content.Context;
import androidx.annotation.NonNull;

/* JADX INFO: loaded from: classes4.dex */
final class c extends i {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final Context f103474b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final com.google.android.datatransport.runtime.time.a f103475c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final com.google.android.datatransport.runtime.time.a f103476d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final String f103477e;

    c(Context context, com.google.android.datatransport.runtime.time.a aVar, com.google.android.datatransport.runtime.time.a aVar2, String str) {
        if (context == null) {
            throw new NullPointerException("Null applicationContext");
        }
        this.f103474b = context;
        if (aVar == null) {
            throw new NullPointerException("Null wallClock");
        }
        this.f103475c = aVar;
        if (aVar2 == null) {
            throw new NullPointerException("Null monotonicClock");
        }
        this.f103476d = aVar2;
        if (str == null) {
            throw new NullPointerException("Null backendName");
        }
        this.f103477e = str;
    }

    @Override // com.google.android.datatransport.runtime.backends.i
    public Context c() {
        return this.f103474b;
    }

    @Override // com.google.android.datatransport.runtime.backends.i
    @NonNull
    public String d() {
        return this.f103477e;
    }

    @Override // com.google.android.datatransport.runtime.backends.i
    public com.google.android.datatransport.runtime.time.a e() {
        return this.f103476d;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof i) {
            i iVar = (i) obj;
            if (this.f103474b.equals(iVar.c()) && this.f103475c.equals(iVar.f()) && this.f103476d.equals(iVar.e()) && this.f103477e.equals(iVar.d())) {
                return true;
            }
        }
        return false;
    }

    @Override // com.google.android.datatransport.runtime.backends.i
    public com.google.android.datatransport.runtime.time.a f() {
        return this.f103475c;
    }

    public int hashCode() {
        return this.f103477e.hashCode() ^ ((((((this.f103474b.hashCode() ^ 1000003) * 1000003) ^ this.f103475c.hashCode()) * 1000003) ^ this.f103476d.hashCode()) * 1000003);
    }

    public String toString() {
        return "CreationContext{applicationContext=" + this.f103474b + ", wallClock=" + this.f103475c + ", monotonicClock=" + this.f103476d + ", backendName=" + this.f103477e + "}";
    }
}
