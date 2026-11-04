package com.google.android.datatransport.cct.internal;

import androidx.annotation.NonNull;
import androidx.annotation.p0;
import java.util.List;

/* JADX INFO: loaded from: classes4.dex */
@u7.d
public abstract class u {

    @u7.d.a
    public static abstract class a {
        @NonNull
        public abstract u a();

        @NonNull
        public abstract a b(@p0 o oVar);

        @NonNull
        public abstract a c(@p0 List<t> list);

        @NonNull
        abstract a d(@p0 Integer num);

        @NonNull
        abstract a e(@p0 String str);

        @NonNull
        public abstract a f(@p0 x xVar);

        @NonNull
        public abstract a g(long j10);

        @NonNull
        public abstract a h(long j10);

        @NonNull
        public a i(int i10) {
            return d(Integer.valueOf(i10));
        }

        @NonNull
        public a j(@NonNull String str) {
            return e(str);
        }
    }

    @NonNull
    public static a a() {
        return new k.b();
    }

    @p0
    public abstract o b();

    @k8.a.InterfaceC2244a(name = "logEvent")
    @p0
    public abstract List<t> c();

    @p0
    public abstract Integer d();

    @p0
    public abstract String e();

    @p0
    public abstract x f();

    public abstract long g();

    public abstract long h();
}
