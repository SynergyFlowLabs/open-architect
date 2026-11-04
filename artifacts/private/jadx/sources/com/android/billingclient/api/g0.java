package com.android.billingclient.api;

import androidx.annotation.NonNull;

/* JADX INFO: loaded from: classes3.dex */
public final class g0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final String f89053a;

    public static class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private String f89054a;

        private a() {
            throw null;
        }

        @NonNull
        public g0 a() {
            if (this.f89054a != null) {
                return new g0(this, null);
            }
            throw new IllegalArgumentException("Product type must be set");
        }

        @NonNull
        public a b(@NonNull String str) {
            this.f89054a = str;
            return this;
        }

        /* synthetic */ a(m3 m3Var) {
        }
    }

    /* synthetic */ g0(a aVar, m3 m3Var) {
        this.f89053a = aVar.f89054a;
    }

    @NonNull
    public static a a() {
        return new a(null);
    }

    @NonNull
    public final String b() {
        return this.f89053a;
    }
}
