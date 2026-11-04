package com.google.firebase.installations.remote;

import androidx.annotation.NonNull;
import androidx.annotation.p0;

/* JADX INFO: loaded from: classes5.dex */
@u7.d
public abstract class d {

    @u7.d.a
    public static abstract class a {
        @NonNull
        public abstract d a();

        @NonNull
        public abstract a b(@NonNull f fVar);

        @NonNull
        public abstract a c(@NonNull String str);

        @NonNull
        public abstract a d(@NonNull String str);

        @NonNull
        public abstract a e(@NonNull b bVar);

        @NonNull
        public abstract a f(@NonNull String str);
    }

    public enum b {
        OK,
        BAD_CONFIG
    }

    @NonNull
    public static a a() {
        return new com.google.firebase.installations.remote.a.b();
    }

    @p0
    public abstract f b();

    @p0
    public abstract String c();

    @p0
    public abstract String d();

    @p0
    public abstract b e();

    @p0
    public abstract String f();

    @NonNull
    public abstract a g();
}
