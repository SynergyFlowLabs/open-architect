package com.android.billingclient.api;

import androidx.annotation.NonNull;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes3.dex */
@Deprecated
public class h0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private String f89093a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private List f89094b;

    public static class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private String f89095a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private List f89096b;

        private a() {
            throw null;
        }

        @NonNull
        public h0 a() {
            String str = this.f89095a;
            if (str == null) {
                throw new IllegalArgumentException("SKU type must be set");
            }
            if (this.f89096b == null) {
                throw new IllegalArgumentException("SKU list must be set");
            }
            h0 h0Var = new h0();
            h0Var.f89093a = str;
            h0Var.f89094b = this.f89096b;
            return h0Var;
        }

        @NonNull
        public a b(@NonNull List<String> list) {
            this.f89096b = new ArrayList(list);
            return this;
        }

        @NonNull
        public a c(@NonNull String str) {
            this.f89095a = str;
            return this;
        }

        /* synthetic */ a(o3 o3Var) {
        }
    }

    @NonNull
    public static a c() {
        return new a(null);
    }

    @NonNull
    public String a() {
        return this.f89093a;
    }

    @NonNull
    public List<String> b() {
        return this.f89094b;
    }
}
