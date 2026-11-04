package com.google.firebase.remoteconfig.interop.rollouts;

import androidx.annotation.NonNull;
import java.util.Set;

/* JADX INFO: loaded from: classes5.dex */
final class c extends e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final Set<d> f124732a;

    c(Set<d> set) {
        if (set == null) {
            throw new NullPointerException("Null rolloutAssignments");
        }
        this.f124732a = set;
    }

    @Override // com.google.firebase.remoteconfig.interop.rollouts.e
    @NonNull
    public Set<d> b() {
        return this.f124732a;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof e) {
            return this.f124732a.equals(((e) obj).b());
        }
        return false;
    }

    public int hashCode() {
        return this.f124732a.hashCode() ^ 1000003;
    }

    public String toString() {
        return "RolloutsState{rolloutAssignments=" + this.f124732a + "}";
    }
}
