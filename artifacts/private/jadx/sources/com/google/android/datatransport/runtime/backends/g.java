package com.google.android.datatransport.runtime.backends;

import androidx.annotation.p0;

/* JADX INFO: loaded from: classes4.dex */
@u7.d
public abstract class g {

    @u7.d.a
    public static abstract class a {
        public abstract g a();

        public abstract a b(Iterable<com.google.android.datatransport.runtime.j> iterable);

        public abstract a c(@p0 byte[] bArr);
    }

    public static a a() {
        return new com.google.android.datatransport.runtime.backends.a.b();
    }

    public static g b(Iterable<com.google.android.datatransport.runtime.j> iterable) {
        return a().b(iterable).a();
    }

    public abstract Iterable<com.google.android.datatransport.runtime.j> c();

    @p0
    public abstract byte[] d();
}
