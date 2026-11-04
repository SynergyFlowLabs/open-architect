package com.android.billingclient.api;

import androidx.annotation.NonNull;

/* JADX INFO: loaded from: classes3.dex */
public final class o {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private String f89207a;

    public static final class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private String f89208a;

        private a() {
            throw null;
        }

        @NonNull
        public o a() {
            String str = this.f89208a;
            if (str == null) {
                throw new IllegalArgumentException("Purchase token must be set");
            }
            o oVar = new o(null);
            oVar.f89207a = str;
            return oVar;
        }

        @NonNull
        public a b(@NonNull String str) {
            this.f89208a = str;
            return this;
        }

        /* synthetic */ a(u2 u2Var) {
        }
    }

    private o() {
        throw null;
    }

    @NonNull
    public static a b() {
        return new a(null);
    }

    @NonNull
    public String a() {
        return this.f89207a;
    }

    /* synthetic */ o(u2 u2Var) {
    }
}
