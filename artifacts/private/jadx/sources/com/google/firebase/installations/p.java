package com.google.firebase.installations;

import androidx.annotation.NonNull;

/* JADX INFO: loaded from: classes5.dex */
@u7.d
public abstract class p {

    @u7.d.a
    public static abstract class a {
        @NonNull
        public abstract p a();

        @NonNull
        public abstract a b(@NonNull String str);

        @NonNull
        public abstract a c(long j10);

        @NonNull
        public abstract a d(long j10);
    }

    @NonNull
    public static a a() {
        return new com.google.firebase.installations.a.b();
    }

    @NonNull
    public abstract String b();

    @NonNull
    public abstract long c();

    @NonNull
    public abstract long d();

    @NonNull
    public abstract a e();
}
