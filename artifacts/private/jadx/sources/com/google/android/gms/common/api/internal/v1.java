package com.google.android.gms.common.api.internal;

import com.google.android.gms.common.Feature;

/* JADX INFO: loaded from: classes4.dex */
final class v1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final c f106241a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final Feature f106242b;

    /* synthetic */ v1(c cVar, Feature feature, y1 y1Var) {
        this.f106241a = cVar;
        this.f106242b = feature;
    }

    public final boolean equals(@androidx.annotation.p0 Object obj) {
        if (obj != null && (obj instanceof v1)) {
            v1 v1Var = (v1) obj;
            if (com.google.android.gms.common.internal.u.b(this.f106241a, v1Var.f106241a) && com.google.android.gms.common.internal.u.b(this.f106242b, v1Var.f106242b)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return com.google.android.gms.common.internal.u.c(this.f106241a, this.f106242b);
    }

    public final String toString() {
        return com.google.android.gms.common.internal.u.d(this).a("key", this.f106241a).a("feature", this.f106242b).toString();
    }
}
