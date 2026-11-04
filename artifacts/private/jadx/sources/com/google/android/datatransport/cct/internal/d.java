package com.google.android.datatransport.cct.internal;

import androidx.annotation.NonNull;
import java.util.List;

/* JADX INFO: loaded from: classes4.dex */
final class d extends n {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final List<u> f103303a;

    d(List<u> list) {
        if (list == null) {
            throw new NullPointerException("Null logRequests");
        }
        this.f103303a = list;
    }

    @Override // com.google.android.datatransport.cct.internal.n
    @NonNull
    @k8.a.InterfaceC2244a(name = "logRequest")
    public List<u> c() {
        return this.f103303a;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof n) {
            return this.f103303a.equals(((n) obj).c());
        }
        return false;
    }

    public int hashCode() {
        return this.f103303a.hashCode() ^ 1000003;
    }

    public String toString() {
        return "BatchedLogRequest{logRequests=" + this.f103303a + "}";
    }
}
