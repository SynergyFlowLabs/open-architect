package com.android.billingclient.api;

import androidx.annotation.NonNull;

/* JADX INFO: loaded from: classes3.dex */
@v3
public final class y {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final boolean f89292a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final boolean f89293b;

    @v3
    public static final class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private boolean f89294a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private boolean f89295b;

        private a() {
        }

        @NonNull
        public y a() {
            if (!this.f89294a) {
                throw new IllegalArgumentException("Pending purchases for one-time products must be supported.");
            }
            return new y(true, this.f89295b);
        }

        @NonNull
        public a b() {
            this.f89294a = true;
            return this;
        }

        @NonNull
        public a c() {
            this.f89295b = true;
            return this;
        }
    }

    private y(boolean z10, boolean z11) {
        this.f89292a = z10;
        this.f89293b = z11;
    }

    @NonNull
    public static a c() {
        return new a();
    }

    boolean a() {
        return this.f89292a;
    }

    boolean b() {
        return this.f89293b;
    }
}
