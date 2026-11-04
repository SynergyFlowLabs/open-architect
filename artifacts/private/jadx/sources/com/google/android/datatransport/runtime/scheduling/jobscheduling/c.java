package com.google.android.datatransport.runtime.scheduling.jobscheduling;

import java.util.Map;

/* JADX INFO: loaded from: classes4.dex */
final class c extends g {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final com.google.android.datatransport.runtime.time.a f103624e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final Map<com.google.android.datatransport.h, g.b> f103625f;

    c(com.google.android.datatransport.runtime.time.a aVar, Map<com.google.android.datatransport.h, g.b> map) {
        if (aVar == null) {
            throw new NullPointerException("Null clock");
        }
        this.f103624e = aVar;
        if (map == null) {
            throw new NullPointerException("Null values");
        }
        this.f103625f = map;
    }

    @Override // com.google.android.datatransport.runtime.scheduling.jobscheduling.g
    com.google.android.datatransport.runtime.time.a e() {
        return this.f103624e;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof g) {
            g gVar = (g) obj;
            if (this.f103624e.equals(gVar.e()) && this.f103625f.equals(gVar.i())) {
                return true;
            }
        }
        return false;
    }

    public int hashCode() {
        return this.f103625f.hashCode() ^ ((this.f103624e.hashCode() ^ 1000003) * 1000003);
    }

    @Override // com.google.android.datatransport.runtime.scheduling.jobscheduling.g
    Map<com.google.android.datatransport.h, g.b> i() {
        return this.f103625f;
    }

    public String toString() {
        return "SchedulerConfig{clock=" + this.f103624e + ", values=" + this.f103625f + "}";
    }
}
