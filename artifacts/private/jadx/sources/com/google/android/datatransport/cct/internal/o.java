package com.google.android.datatransport.cct.internal;

import androidx.annotation.NonNull;
import androidx.annotation.p0;

/* JADX INFO: loaded from: classes4.dex */
@u7.d
public abstract class o {

    @u7.d.a
    public static abstract class a {
        @NonNull
        public abstract o a();

        @NonNull
        public abstract a b(@p0 com.google.android.datatransport.cct.internal.a aVar);

        @NonNull
        public abstract a c(@p0 b bVar);
    }

    public enum b {
        UNKNOWN(0),
        ANDROID_FIREBASE(23);


        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final int f103360a;

        b(int i10) {
            this.f103360a = i10;
        }
    }

    @NonNull
    public static a a() {
        return new e.b();
    }

    @p0
    public abstract com.google.android.datatransport.cct.internal.a b();

    @p0
    public abstract b c();
}
