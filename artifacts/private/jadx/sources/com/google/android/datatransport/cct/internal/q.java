package com.google.android.datatransport.cct.internal;

import androidx.annotation.NonNull;
import androidx.annotation.p0;

/* JADX INFO: loaded from: classes4.dex */
@u7.d
public abstract class q {

    @u7.d.a
    public static abstract class a {
        @NonNull
        public abstract q a();

        @NonNull
        public abstract a b(@p0 byte[] bArr);

        @NonNull
        public abstract a c(@p0 byte[] bArr);
    }

    @NonNull
    public static a a() {
        return new g.b();
    }

    @p0
    public abstract byte[] b();

    @p0
    public abstract byte[] c();
}
