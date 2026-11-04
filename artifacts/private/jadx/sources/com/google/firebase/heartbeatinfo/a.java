package com.google.firebase.heartbeatinfo;

import java.util.List;

/* JADX INFO: loaded from: classes5.dex */
final class a extends r {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final String f122076a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final List<String> f122077b;

    a(String str, List<String> list) {
        if (str == null) {
            throw new NullPointerException("Null userAgent");
        }
        this.f122076a = str;
        if (list == null) {
            throw new NullPointerException("Null usedDates");
        }
        this.f122077b = list;
    }

    @Override // com.google.firebase.heartbeatinfo.r
    public List<String> b() {
        return this.f122077b;
    }

    @Override // com.google.firebase.heartbeatinfo.r
    public String c() {
        return this.f122076a;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof r) {
            r rVar = (r) obj;
            if (this.f122076a.equals(rVar.c()) && this.f122077b.equals(rVar.b())) {
                return true;
            }
        }
        return false;
    }

    public int hashCode() {
        return this.f122077b.hashCode() ^ ((this.f122076a.hashCode() ^ 1000003) * 1000003);
    }

    public String toString() {
        return "HeartBeatResult{userAgent=" + this.f122076a + ", usedDates=" + this.f122077b + "}";
    }
}
