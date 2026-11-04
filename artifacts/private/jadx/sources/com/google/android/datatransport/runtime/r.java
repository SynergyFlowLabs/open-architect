package com.google.android.datatransport.runtime;

import android.util.Base64;
import androidx.annotation.b1;
import androidx.annotation.p0;

/* JADX INFO: loaded from: classes4.dex */
@u7.d
public abstract class r {

    @u7.d.a
    public static abstract class a {
        public abstract r a();

        public abstract a b(String str);

        public abstract a c(@p0 byte[] bArr);

        @b1({b1.a.LIBRARY_GROUP})
        public abstract a d(com.google.android.datatransport.h hVar);
    }

    public static a a() {
        return new d.b().d(com.google.android.datatransport.h.DEFAULT);
    }

    public abstract String b();

    @p0
    public abstract byte[] c();

    @b1({b1.a.LIBRARY_GROUP})
    public abstract com.google.android.datatransport.h d();

    public boolean e() {
        return c() != null;
    }

    @b1({b1.a.LIBRARY_GROUP})
    public r f(com.google.android.datatransport.h hVar) {
        return a().b(b()).d(hVar).c(c()).a();
    }

    public final String toString() {
        return String.format("TransportContext(%s, %s, %s)", b(), d(), c() == null ? "" : Base64.encodeToString(c(), 2));
    }
}
