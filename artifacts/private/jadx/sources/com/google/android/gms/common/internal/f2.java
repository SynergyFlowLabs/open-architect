package com.google.android.gms.common.internal;

import android.content.ComponentName;

/* JADX INFO: loaded from: classes4.dex */
public final class f2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @androidx.annotation.p0
    private final String f106544a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @androidx.annotation.p0
    private final String f106545b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @androidx.annotation.p0
    private final ComponentName f106546c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final int f106547d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final boolean f106548e;

    public f2(ComponentName componentName, int i10) {
        this.f106544a = null;
        this.f106545b = null;
        w.r(componentName);
        this.f106546c = componentName;
        this.f106547d = 4225;
        this.f106548e = false;
    }

    @androidx.annotation.p0
    public final ComponentName a() {
        return this.f106546c;
    }

    @androidx.annotation.p0
    public final String b() {
        return this.f106544a;
    }

    @androidx.annotation.p0
    public final String c() {
        return this.f106545b;
    }

    public final boolean d() {
        return this.f106548e;
    }

    public final boolean equals(@androidx.annotation.p0 Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof f2)) {
            return false;
        }
        f2 f2Var = (f2) obj;
        return u.b(this.f106544a, f2Var.f106544a) && u.b(this.f106545b, f2Var.f106545b) && u.b(this.f106546c, f2Var.f106546c) && this.f106548e == f2Var.f106548e;
    }

    public final int hashCode() {
        return u.c(this.f106544a, this.f106545b, this.f106546c, 4225, Boolean.valueOf(this.f106548e));
    }

    public final String toString() {
        String str = this.f106544a;
        if (str != null) {
            return str;
        }
        w.r(this.f106546c);
        return this.f106546c.flattenToString();
    }

    public f2(String str, int i10, boolean z10) {
        this(str, "com.google.android.gms", 4225, false);
    }

    public f2(String str, String str2, int i10, boolean z10) {
        w.l(str);
        this.f106544a = str;
        w.l(str2);
        this.f106545b = str2;
        this.f106546c = null;
        this.f106547d = 4225;
        this.f106548e = z10;
    }
}
