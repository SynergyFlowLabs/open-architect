package com.google.firebase.crashlytics.internal.model;

import androidx.annotation.NonNull;
import java.util.List;

/* JADX INFO: loaded from: classes5.dex */
final class y extends f0.f.d.AbstractC1145f {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final List<f0.f.d.e> f121764a;

    static final class b extends f0.f.d.AbstractC1145f.a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private List<f0.f.d.e> f121765a;

        b() {
        }

        @Override // com.google.firebase.crashlytics.internal.model.f0.f.d.AbstractC1145f.a
        public f0.f.d.AbstractC1145f a() {
            List<f0.f.d.e> list = this.f121765a;
            if (list != null) {
                return new y(list);
            }
            throw new IllegalStateException("Missing required properties: rolloutAssignments");
        }

        @Override // com.google.firebase.crashlytics.internal.model.f0.f.d.AbstractC1145f.a
        public f0.f.d.AbstractC1145f.a b(List<f0.f.d.e> list) {
            if (list == null) {
                throw new NullPointerException("Null rolloutAssignments");
            }
            this.f121765a = list;
            return this;
        }
    }

    @Override // com.google.firebase.crashlytics.internal.model.f0.f.d.AbstractC1145f
    @NonNull
    @k8.a.InterfaceC2244a(name = "assignments")
    public List<f0.f.d.e> b() {
        return this.f121764a;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof f0.f.d.AbstractC1145f) {
            return this.f121764a.equals(((f0.f.d.AbstractC1145f) obj).b());
        }
        return false;
    }

    public int hashCode() {
        return this.f121764a.hashCode() ^ 1000003;
    }

    public String toString() {
        return "RolloutsState{rolloutAssignments=" + this.f121764a + "}";
    }

    private y(List<f0.f.d.e> list) {
        this.f121764a = list;
    }
}
