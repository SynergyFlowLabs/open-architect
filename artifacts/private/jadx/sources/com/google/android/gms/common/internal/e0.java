package com.google.android.gms.common.internal;

import android.os.Bundle;
import androidx.annotation.NonNull;
import io.intercom.android.sdk.metrics.MetricTracker;

/* JADX INFO: loaded from: classes4.dex */
@g6.a
public class e0 implements com.google.android.gms.common.api.a.d.f {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NonNull
    public static final e0 f106506b = a().a();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @androidx.annotation.p0
    private final String f106507a;

    @g6.a
    public static class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        @androidx.annotation.p0
        private String f106508a;

        private a() {
            throw null;
        }

        @NonNull
        @g6.a
        public e0 a() {
            return new e0(this.f106508a, null);
        }

        @NonNull
        @g6.a
        public a b(@androidx.annotation.p0 String str) {
            this.f106508a = str;
            return this;
        }

        /* synthetic */ a(j0 j0Var) {
        }
    }

    /* synthetic */ e0(String str, j0 j0Var) {
        this.f106507a = str;
    }

    @NonNull
    @g6.a
    public static a a() {
        return new a(null);
    }

    @NonNull
    public final Bundle b() {
        Bundle bundle = new Bundle();
        String str = this.f106507a;
        if (str != null) {
            bundle.putString(MetricTracker.Place.API, str);
        }
        return bundle;
    }

    public final boolean equals(@androidx.annotation.p0 Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof e0) {
            return u.b(this.f106507a, ((e0) obj).f106507a);
        }
        return false;
    }

    public final int hashCode() {
        return u.c(this.f106507a);
    }
}
