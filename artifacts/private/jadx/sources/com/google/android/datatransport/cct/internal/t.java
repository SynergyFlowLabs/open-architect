package com.google.android.datatransport.cct.internal;

import androidx.annotation.NonNull;
import androidx.annotation.p0;

/* JADX INFO: loaded from: classes4.dex */
@u7.d
public abstract class t {

    @u7.d.a
    public static abstract class a {
        @NonNull
        public abstract t a();

        @NonNull
        public abstract a b(@p0 p pVar);

        @NonNull
        public abstract a c(@p0 Integer num);

        @NonNull
        public abstract a d(long j10);

        @NonNull
        public abstract a e(long j10);

        @NonNull
        public abstract a f(@p0 q qVar);

        @NonNull
        public abstract a g(@p0 w wVar);

        @NonNull
        abstract a h(@p0 byte[] bArr);

        @NonNull
        abstract a i(@p0 String str);

        @NonNull
        public abstract a j(long j10);
    }

    private static a a() {
        return new j.b();
    }

    @NonNull
    public static a k(@NonNull String str) {
        return a().i(str);
    }

    @NonNull
    public static a l(@NonNull byte[] bArr) {
        return a().h(bArr);
    }

    @p0
    public abstract p b();

    @p0
    public abstract Integer c();

    public abstract long d();

    public abstract long e();

    @p0
    public abstract q f();

    @p0
    public abstract w g();

    @p0
    public abstract byte[] h();

    @p0
    public abstract String i();

    public abstract long j();
}
