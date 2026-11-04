package com.google.firebase.crashlytics.internal.model;

import androidx.annotation.NonNull;
import androidx.annotation.p0;
import java.util.List;

/* JADX INFO: loaded from: classes5.dex */
final class f extends f0.e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final List<f0.e.b> f121570a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final String f121571b;

    static final class b extends f0.e.a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private List<f0.e.b> f121572a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private String f121573b;

        @Override // com.google.firebase.crashlytics.internal.model.f0.e.a
        public f0.e a() {
            List<f0.e.b> list = this.f121572a;
            if (list != null) {
                return new f(list, this.f121573b);
            }
            throw new IllegalStateException("Missing required properties: files");
        }

        @Override // com.google.firebase.crashlytics.internal.model.f0.e.a
        public f0.e.a b(List<f0.e.b> list) {
            if (list == null) {
                throw new NullPointerException("Null files");
            }
            this.f121572a = list;
            return this;
        }

        @Override // com.google.firebase.crashlytics.internal.model.f0.e.a
        public f0.e.a c(String str) {
            this.f121573b = str;
            return this;
        }

        b() {
        }

        private b(f0.e eVar) {
            this.f121572a = eVar.b();
            this.f121573b = eVar.c();
        }
    }

    @Override // com.google.firebase.crashlytics.internal.model.f0.e
    @NonNull
    public List<f0.e.b> b() {
        return this.f121570a;
    }

    @Override // com.google.firebase.crashlytics.internal.model.f0.e
    @p0
    public String c() {
        return this.f121571b;
    }

    @Override // com.google.firebase.crashlytics.internal.model.f0.e
    f0.e.a d() {
        return new b(this);
    }

    public boolean equals(Object obj) {
        String str;
        if (obj == this) {
            return true;
        }
        if (obj instanceof f0.e) {
            f0.e eVar = (f0.e) obj;
            if (this.f121570a.equals(eVar.b()) && ((str = this.f121571b) != null ? str.equals(eVar.c()) : eVar.c() == null)) {
                return true;
            }
        }
        return false;
    }

    public int hashCode() {
        int iHashCode = (this.f121570a.hashCode() ^ 1000003) * 1000003;
        String str = this.f121571b;
        return (str == null ? 0 : str.hashCode()) ^ iHashCode;
    }

    public String toString() {
        return "FilesPayload{files=" + this.f121570a + ", orgId=" + this.f121571b + "}";
    }

    private f(List<f0.e.b> list, @p0 String str) {
        this.f121570a = list;
        this.f121571b = str;
    }
}
