package com.android.billingclient.api;

import androidx.annotation.NonNull;

/* JADX INFO: loaded from: classes3.dex */
public final class b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private String f88999a;

    public static final class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private String f89000a;

        private a() {
            throw null;
        }

        @NonNull
        public b a() {
            String str = this.f89000a;
            if (str == null) {
                throw new IllegalArgumentException("Purchase token must be set");
            }
            b bVar = new b(null);
            bVar.f88999a = str;
            return bVar;
        }

        @NonNull
        public a b(@NonNull String str) {
            this.f89000a = str;
            return this;
        }

        /* synthetic */ a(l0 l0Var) {
        }
    }

    private b() {
        throw null;
    }

    @NonNull
    public static a b() {
        return new a(null);
    }

    @NonNull
    public String a() {
        return this.f88999a;
    }

    /* synthetic */ b(l0 l0Var) {
    }
}
