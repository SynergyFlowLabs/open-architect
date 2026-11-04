package com.google.android.datatransport.runtime.scheduling.jobscheduling;

import android.app.job.JobInfo;
import androidx.annotation.w0;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

/* JADX INFO: loaded from: classes4.dex */
@u7.d
public abstract class g {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final long f103642a = 86400000;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static final long f103643b = 30000;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static final long f103644c = 1000;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private static final long f103645d = 10000;

    public static class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private com.google.android.datatransport.runtime.time.a f103646a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private Map<com.google.android.datatransport.h, b> f103647b = new HashMap();

        public a a(com.google.android.datatransport.h hVar, b bVar) {
            this.f103647b.put(hVar, bVar);
            return this;
        }

        public g b() {
            if (this.f103646a == null) {
                throw new NullPointerException("missing required property: clock");
            }
            if (this.f103647b.keySet().size() < com.google.android.datatransport.h.values().length) {
                throw new IllegalStateException("Not all priorities have been configured");
            }
            Map<com.google.android.datatransport.h, b> map = this.f103647b;
            this.f103647b = new HashMap();
            return g.d(this.f103646a, map);
        }

        public a c(com.google.android.datatransport.runtime.time.a aVar) {
            this.f103646a = aVar;
            return this;
        }
    }

    @u7.d
    public static abstract class b {

        @u7.d.a
        public static abstract class a {
            public abstract b a();

            public abstract a b(long j10);

            public abstract a c(Set<c> set);

            public abstract a d(long j10);
        }

        public static a a() {
            return new d.b().c(Collections.EMPTY_SET);
        }

        abstract long b();

        abstract Set<c> c();

        abstract long d();
    }

    public enum c {
        NETWORK_UNMETERED,
        DEVICE_IDLE,
        DEVICE_CHARGING
    }

    private long a(int i10, long j10) {
        int i11 = i10 - 1;
        return (long) (Math.pow(3.0d, i11) * j10 * Math.max(1.0d, Math.log(10000.0d) / Math.log((j10 > 1 ? j10 : 2L) * ((long) i11))));
    }

    public static a b() {
        return new a();
    }

    static g d(com.google.android.datatransport.runtime.time.a aVar, Map<com.google.android.datatransport.h, b> map) {
        return new com.google.android.datatransport.runtime.scheduling.jobscheduling.c(aVar, map);
    }

    public static g f(com.google.android.datatransport.runtime.time.a aVar) {
        return b().a(com.google.android.datatransport.h.DEFAULT, b.a().b(30000L).d(86400000L).a()).a(com.google.android.datatransport.h.HIGHEST, b.a().b(1000L).d(86400000L).a()).a(com.google.android.datatransport.h.VERY_LOW, b.a().b(86400000L).d(86400000L).c(j(c.DEVICE_IDLE)).a()).c(aVar).b();
    }

    private static <T> Set<T> j(T... tArr) {
        return Collections.unmodifiableSet(new HashSet(Arrays.asList(tArr)));
    }

    @w0(api = 21)
    private void k(JobInfo.Builder builder, Set<c> set) {
        if (set.contains(c.NETWORK_UNMETERED)) {
            builder.setRequiredNetworkType(2);
        } else {
            builder.setRequiredNetworkType(1);
        }
        if (set.contains(c.DEVICE_CHARGING)) {
            builder.setRequiresCharging(true);
        }
        if (set.contains(c.DEVICE_IDLE)) {
            builder.setRequiresDeviceIdle(true);
        }
    }

    @w0(api = 21)
    public JobInfo.Builder c(JobInfo.Builder builder, com.google.android.datatransport.h hVar, long j10, int i10) {
        builder.setMinimumLatency(h(hVar, j10, i10));
        k(builder, i().get(hVar).c());
        return builder;
    }

    abstract com.google.android.datatransport.runtime.time.a e();

    public Set<c> g(com.google.android.datatransport.h hVar) {
        return i().get(hVar).c();
    }

    public long h(com.google.android.datatransport.h hVar, long j10, int i10) {
        long jV = j10 - e().V();
        b bVar = i().get(hVar);
        return Math.min(Math.max(a(i10, bVar.b()), jV), bVar.d());
    }

    abstract Map<com.google.android.datatransport.h, b> i();
}
