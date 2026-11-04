package com.android.billingclient.api;

import androidx.annotation.NonNull;
import java.util.HashSet;
import java.util.List;

/* JADX INFO: loaded from: classes3.dex */
public final class e0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final com.google.android.gms.internal.play_billing.r1 f89027a;

    public static class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private com.google.android.gms.internal.play_billing.r1 f89028a;

        private a() {
            throw null;
        }

        @NonNull
        public e0 a() {
            if (this.f89028a != null) {
                return new e0(this, null);
            }
            throw new IllegalArgumentException("Product list must be set to a non empty list.");
        }

        @NonNull
        public a b(@NonNull List<b> list) {
            if (list == null || list.isEmpty()) {
                throw new IllegalArgumentException("Product list cannot be empty.");
            }
            HashSet hashSet = new HashSet();
            for (b bVar : list) {
                if (!"play_pass_subs".equals(bVar.c())) {
                    hashSet.add(bVar.c());
                }
            }
            if (hashSet.size() > 1) {
                throw new IllegalArgumentException("All products should be of the same product type.");
            }
            this.f89028a = com.google.android.gms.internal.play_billing.r1.u(list);
            return this;
        }

        /* synthetic */ a(j3 j3Var) {
        }
    }

    public static class b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final String f89029a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private final String f89030b;

        public static class a {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            private String f89031a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            private String f89032b;

            private a() {
                throw null;
            }

            @NonNull
            public b a() {
                if ("first_party".equals(this.f89032b)) {
                    throw new IllegalArgumentException("Serialized doc id must be provided for first party products.");
                }
                if (this.f89031a == null) {
                    throw new IllegalArgumentException("Product id must be provided.");
                }
                if (this.f89032b != null) {
                    return new b(this, null);
                }
                throw new IllegalArgumentException("Product type must be provided.");
            }

            @NonNull
            public a b(@NonNull String str) {
                this.f89031a = str;
                return this;
            }

            @NonNull
            public a c(@NonNull String str) {
                this.f89032b = str;
                return this;
            }

            /* synthetic */ a(j3 j3Var) {
            }
        }

        /* synthetic */ b(a aVar, j3 j3Var) {
            this.f89029a = aVar.f89031a;
            this.f89030b = aVar.f89032b;
        }

        @NonNull
        public static a a() {
            return new a(null);
        }

        @NonNull
        public final String b() {
            return this.f89029a;
        }

        @NonNull
        public final String c() {
            return this.f89030b;
        }
    }

    /* synthetic */ e0(a aVar, j3 j3Var) {
        this.f89027a = aVar.f89028a;
    }

    @NonNull
    public static a a() {
        return new a(null);
    }

    public final com.google.android.gms.internal.play_billing.r1 b() {
        return this.f89027a;
    }

    @NonNull
    public final String c() {
        return ((b) this.f89027a.get(0)).c();
    }
}
