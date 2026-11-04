package com.android.billingclient.api;

import androidx.annotation.NonNull;

/* JADX INFO: loaded from: classes3.dex */
public final class f0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final String f89040a;

    public static class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private String f89041a;

        private a() {
            throw null;
        }

        @NonNull
        public f0 a() {
            if (this.f89041a == null) {
                throw new IllegalArgumentException("Product type must be set");
            }
            boolean z10 = true | false;
            return new f0(this, null);
        }

        @NonNull
        public a b(@NonNull String str) {
            this.f89041a = str;
            return this;
        }

        /* synthetic */ a(l3 l3Var) {
        }
    }

    /* synthetic */ f0(a aVar, l3 l3Var) {
        this.f89040a = aVar.f89041a;
    }

    @NonNull
    public static a a() {
        return new a(null);
    }

    @NonNull
    public final String b() {
        return this.f89040a;
    }
}
