package com.google.firebase.installations.remote;

import androidx.annotation.NonNull;
import androidx.annotation.p0;

/* JADX INFO: loaded from: classes5.dex */
@u7.d
public abstract class f {

    @u7.d.a
    public static abstract class a {
        @NonNull
        public abstract f a();

        @NonNull
        public abstract a b(@NonNull b bVar);

        @NonNull
        public abstract a c(@NonNull String str);

        @NonNull
        public abstract a d(long j10);
    }

    public enum b {
        OK,
        BAD_CONFIG,
        AUTH_ERROR
    }

    @NonNull
    public static a a() {
        return new com.google.firebase.installations.remote.b.C1170b().d(0L);
    }

    @p0
    public abstract b b();

    @p0
    public abstract String c();

    @NonNull
    public abstract long d();

    @NonNull
    public abstract a e();
}
