package com.android.billingclient.api;

import androidx.annotation.NonNull;

/* JADX INFO: loaded from: classes3.dex */
public final class n {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private int f89196a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private String f89197b;

    public static class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private int f89198a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private String f89199b = "";

        private a() {
        }

        @NonNull
        public n a() {
            n nVar = new n();
            nVar.f89196a = this.f89198a;
            nVar.f89197b = this.f89199b;
            return nVar;
        }

        @NonNull
        public a b(@NonNull String str) {
            this.f89199b = str;
            return this;
        }

        @NonNull
        public a c(int i10) {
            this.f89198a = i10;
            return this;
        }

        /* synthetic */ a(s2 s2Var) {
        }
    }

    @NonNull
    public static a c() {
        return new a(null);
    }

    @NonNull
    public String a() {
        return this.f89197b;
    }

    public int b() {
        return this.f89196a;
    }

    @NonNull
    public String toString() {
        return "Response Code: " + com.google.android.gms.internal.play_billing.p3.i(this.f89196a) + ", Debug Message: " + this.f89197b;
    }
}
