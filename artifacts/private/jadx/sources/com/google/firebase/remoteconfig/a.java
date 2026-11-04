package com.google.firebase.remoteconfig;

import androidx.annotation.NonNull;
import java.util.Set;

/* JADX INFO: loaded from: classes5.dex */
final class a extends c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final Set<String> f124420a;

    a(Set<String> set) {
        if (set == null) {
            throw new NullPointerException("Null updatedKeys");
        }
        this.f124420a = set;
    }

    @Override // com.google.firebase.remoteconfig.c
    @NonNull
    public Set<String> b() {
        return this.f124420a;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof c) {
            return this.f124420a.equals(((c) obj).b());
        }
        return false;
    }

    public int hashCode() {
        return this.f124420a.hashCode() ^ 1000003;
    }

    public String toString() {
        return "ConfigUpdate{updatedKeys=" + this.f124420a + "}";
    }
}
