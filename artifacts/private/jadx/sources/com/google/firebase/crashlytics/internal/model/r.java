package com.google.firebase.crashlytics.internal.model;

import androidx.annotation.NonNull;
import java.util.List;

/* JADX INFO: loaded from: classes5.dex */
final class r extends f0.f.d.a.b.e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final String f121708a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final int f121709b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final List<f0.f.d.a.b.e.AbstractC1141b> f121710c;

    static final class b extends f0.f.d.a.b.e.AbstractC1140a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private String f121711a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private int f121712b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private List<f0.f.d.a.b.e.AbstractC1141b> f121713c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private byte f121714d;

        b() {
        }

        @Override // com.google.firebase.crashlytics.internal.model.f0.f.d.a.b.e.AbstractC1140a
        public f0.f.d.a.b.e a() {
            String str;
            List<f0.f.d.a.b.e.AbstractC1141b> list;
            if (this.f121714d == 1 && (str = this.f121711a) != null && (list = this.f121713c) != null) {
                return new r(str, this.f121712b, list);
            }
            StringBuilder sb2 = new StringBuilder();
            if (this.f121711a == null) {
                sb2.append(" name");
            }
            if ((1 & this.f121714d) == 0) {
                sb2.append(" importance");
            }
            if (this.f121713c == null) {
                sb2.append(" frames");
            }
            throw new IllegalStateException("Missing required properties:" + ((Object) sb2));
        }

        @Override // com.google.firebase.crashlytics.internal.model.f0.f.d.a.b.e.AbstractC1140a
        public f0.f.d.a.b.e.AbstractC1140a b(List<f0.f.d.a.b.e.AbstractC1141b> list) {
            if (list == null) {
                throw new NullPointerException("Null frames");
            }
            this.f121713c = list;
            return this;
        }

        @Override // com.google.firebase.crashlytics.internal.model.f0.f.d.a.b.e.AbstractC1140a
        public f0.f.d.a.b.e.AbstractC1140a c(int i10) {
            this.f121712b = i10;
            this.f121714d = (byte) (this.f121714d | 1);
            return this;
        }

        @Override // com.google.firebase.crashlytics.internal.model.f0.f.d.a.b.e.AbstractC1140a
        public f0.f.d.a.b.e.AbstractC1140a d(String str) {
            if (str == null) {
                throw new NullPointerException("Null name");
            }
            this.f121711a = str;
            return this;
        }
    }

    @Override // com.google.firebase.crashlytics.internal.model.f0.f.d.a.b.e
    @NonNull
    public List<f0.f.d.a.b.e.AbstractC1141b> b() {
        return this.f121710c;
    }

    @Override // com.google.firebase.crashlytics.internal.model.f0.f.d.a.b.e
    public int c() {
        return this.f121709b;
    }

    @Override // com.google.firebase.crashlytics.internal.model.f0.f.d.a.b.e
    @NonNull
    public String d() {
        return this.f121708a;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof f0.f.d.a.b.e) {
            f0.f.d.a.b.e eVar = (f0.f.d.a.b.e) obj;
            if (this.f121708a.equals(eVar.d()) && this.f121709b == eVar.c() && this.f121710c.equals(eVar.b())) {
                return true;
            }
        }
        return false;
    }

    public int hashCode() {
        return this.f121710c.hashCode() ^ ((((this.f121708a.hashCode() ^ 1000003) * 1000003) ^ this.f121709b) * 1000003);
    }

    public String toString() {
        return "Thread{name=" + this.f121708a + ", importance=" + this.f121709b + ", frames=" + this.f121710c + "}";
    }

    private r(String str, int i10, List<f0.f.d.a.b.e.AbstractC1141b> list) {
        this.f121708a = str;
        this.f121709b = i10;
        this.f121710c = list;
    }
}
