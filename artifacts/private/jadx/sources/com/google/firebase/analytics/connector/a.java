package com.google.firebase.analytics.connector;

import android.os.Bundle;
import androidx.annotation.NonNull;
import androidx.annotation.d1;
import androidx.annotation.m1;
import androidx.annotation.p0;
import java.util.List;
import java.util.Map;
import java.util.Set;

/* JADX INFO: loaded from: classes5.dex */
public interface a {

    /* JADX INFO: renamed from: com.google.firebase.analytics.connector.a$a, reason: collision with other inner class name */
    @g6.a
    public interface InterfaceC1123a {
        @g6.a
        void a();

        @g6.a
        void b();

        @g6.a
        void c(@NonNull Set<String> set);
    }

    @g6.a
    public interface b {
        @g6.a
        void a(int i10, @p0 Bundle bundle);
    }

    @g6.a
    public static class c {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        @NonNull
        @g6.a
        public String f120692a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        @NonNull
        @g6.a
        public String f120693b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        @p0
        @g6.a
        public Object f120694c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        @p0
        @g6.a
        public String f120695d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        @g6.a
        public long f120696e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        @p0
        @g6.a
        public String f120697f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        @p0
        @g6.a
        public Bundle f120698g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        @p0
        @g6.a
        public String f120699h;

        /* JADX INFO: renamed from: i, reason: collision with root package name */
        @p0
        @g6.a
        public Bundle f120700i;

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        @g6.a
        public long f120701j;

        /* JADX INFO: renamed from: k, reason: collision with root package name */
        @p0
        @g6.a
        public String f120702k;

        /* JADX INFO: renamed from: l, reason: collision with root package name */
        @p0
        @g6.a
        public Bundle f120703l;

        /* JADX INFO: renamed from: m, reason: collision with root package name */
        @g6.a
        public long f120704m;

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        @g6.a
        public boolean f120705n;

        /* JADX INFO: renamed from: o, reason: collision with root package name */
        @g6.a
        public long f120706o;
    }

    @g6.a
    void a(@NonNull String str, @NonNull String str2, @p0 Bundle bundle);

    @g6.a
    void b(@NonNull String str, @NonNull String str2, @NonNull Object obj);

    @m1
    @g6.a
    int c(@NonNull @d1(min = 1) String str);

    @g6.a
    void clearConditionalUserProperty(@NonNull @d1(max = 24, min = 1) String str, @p0 String str2, @p0 Bundle bundle);

    @NonNull
    @m1
    @g6.a
    List<c> d(@NonNull String str, @d1(max = 23, min = 1) @p0 String str2);

    @c8.a
    @p0
    @g6.a
    InterfaceC1123a e(@NonNull String str, @NonNull b bVar);

    @g6.a
    void f(@NonNull c cVar);

    @NonNull
    @m1
    @g6.a
    Map<String, Object> g(boolean z10);
}
