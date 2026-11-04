package com.google.android.datatransport;

import androidx.annotation.NonNull;
import androidx.annotation.p0;

/* JADX INFO: loaded from: classes4.dex */
@u7.d
public abstract class g {

    @u7.d.a
    public static abstract class a {
        @NonNull
        public abstract g a();

        @NonNull
        public abstract a b(byte[] bArr);

        @NonNull
        public abstract a c(byte[] bArr);

        @NonNull
        public abstract a d(String str);
    }

    public static a a() {
        return new b.C0936b();
    }

    @p0
    public abstract byte[] b();

    @p0
    public abstract byte[] c();

    @p0
    public abstract String d();
}
