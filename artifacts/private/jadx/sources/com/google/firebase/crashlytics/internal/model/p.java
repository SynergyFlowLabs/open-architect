package com.google.firebase.crashlytics.internal.model;

import androidx.annotation.NonNull;
import androidx.annotation.p0;
import java.util.List;

/* JADX INFO: loaded from: classes5.dex */
final class p extends f0.f.d.a.b.c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final String f121690a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final String f121691b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final List<f0.f.d.a.b.e.AbstractC1141b> f121692c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final f0.f.d.a.b.c f121693d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final int f121694e;

    static final class b extends f0.f.d.a.b.c.AbstractC1137a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private String f121695a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private String f121696b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private List<f0.f.d.a.b.e.AbstractC1141b> f121697c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private f0.f.d.a.b.c f121698d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        private int f121699e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        private byte f121700f;

        b() {
        }

        @Override // com.google.firebase.crashlytics.internal.model.f0.f.d.a.b.c.AbstractC1137a
        public f0.f.d.a.b.c a() {
            String str;
            List<f0.f.d.a.b.e.AbstractC1141b> list;
            if (this.f121700f == 1 && (str = this.f121695a) != null && (list = this.f121697c) != null) {
                return new p(str, this.f121696b, list, this.f121698d, this.f121699e);
            }
            StringBuilder sb2 = new StringBuilder();
            if (this.f121695a == null) {
                sb2.append(" type");
            }
            if (this.f121697c == null) {
                sb2.append(" frames");
            }
            if ((this.f121700f & 1) == 0) {
                sb2.append(" overflowCount");
            }
            throw new IllegalStateException("Missing required properties:" + ((Object) sb2));
        }

        @Override // com.google.firebase.crashlytics.internal.model.f0.f.d.a.b.c.AbstractC1137a
        public f0.f.d.a.b.c.AbstractC1137a b(f0.f.d.a.b.c cVar) {
            this.f121698d = cVar;
            return this;
        }

        @Override // com.google.firebase.crashlytics.internal.model.f0.f.d.a.b.c.AbstractC1137a
        public f0.f.d.a.b.c.AbstractC1137a c(List<f0.f.d.a.b.e.AbstractC1141b> list) {
            if (list == null) {
                throw new NullPointerException("Null frames");
            }
            this.f121697c = list;
            return this;
        }

        @Override // com.google.firebase.crashlytics.internal.model.f0.f.d.a.b.c.AbstractC1137a
        public f0.f.d.a.b.c.AbstractC1137a d(int i10) {
            this.f121699e = i10;
            this.f121700f = (byte) (this.f121700f | 1);
            return this;
        }

        @Override // com.google.firebase.crashlytics.internal.model.f0.f.d.a.b.c.AbstractC1137a
        public f0.f.d.a.b.c.AbstractC1137a e(String str) {
            this.f121696b = str;
            return this;
        }

        @Override // com.google.firebase.crashlytics.internal.model.f0.f.d.a.b.c.AbstractC1137a
        public f0.f.d.a.b.c.AbstractC1137a f(String str) {
            if (str == null) {
                throw new NullPointerException("Null type");
            }
            this.f121695a = str;
            return this;
        }
    }

    @Override // com.google.firebase.crashlytics.internal.model.f0.f.d.a.b.c
    @p0
    public f0.f.d.a.b.c b() {
        return this.f121693d;
    }

    @Override // com.google.firebase.crashlytics.internal.model.f0.f.d.a.b.c
    @NonNull
    public List<f0.f.d.a.b.e.AbstractC1141b> c() {
        return this.f121692c;
    }

    @Override // com.google.firebase.crashlytics.internal.model.f0.f.d.a.b.c
    public int d() {
        return this.f121694e;
    }

    @Override // com.google.firebase.crashlytics.internal.model.f0.f.d.a.b.c
    @p0
    public String e() {
        return this.f121691b;
    }

    public boolean equals(Object obj) {
        f0.f.d.a.b.c cVar;
        if (obj == this) {
            return true;
        }
        if (obj instanceof f0.f.d.a.b.c) {
            f0.f.d.a.b.c cVar2 = (f0.f.d.a.b.c) obj;
            if (this.f121690a.equals(cVar2.f())) {
                String str = this.f121691b;
                if (str == null) {
                    if (cVar2.e() == null) {
                        if (this.f121692c.equals(cVar2.c()) && ((cVar = this.f121693d) != null ? cVar.equals(cVar2.b()) : cVar2.b() == null) && this.f121694e == cVar2.d()) {
                            return true;
                        }
                    }
                } else if (str.equals(cVar2.e())) {
                    if (this.f121692c.equals(cVar2.c())) {
                        return true;
                    }
                }
            }
        }
        return false;
    }

    @Override // com.google.firebase.crashlytics.internal.model.f0.f.d.a.b.c
    @NonNull
    public String f() {
        return this.f121690a;
    }

    public int hashCode() {
        int iHashCode = (this.f121690a.hashCode() ^ 1000003) * 1000003;
        String str = this.f121691b;
        int iHashCode2 = (((iHashCode ^ (str == null ? 0 : str.hashCode())) * 1000003) ^ this.f121692c.hashCode()) * 1000003;
        f0.f.d.a.b.c cVar = this.f121693d;
        return this.f121694e ^ ((iHashCode2 ^ (cVar != null ? cVar.hashCode() : 0)) * 1000003);
    }

    public String toString() {
        return "Exception{type=" + this.f121690a + ", reason=" + this.f121691b + ", frames=" + this.f121692c + ", causedBy=" + this.f121693d + ", overflowCount=" + this.f121694e + "}";
    }

    private p(String str, @p0 String str2, List<f0.f.d.a.b.e.AbstractC1141b> list, @p0 f0.f.d.a.b.c cVar, int i10) {
        this.f121690a = str;
        this.f121691b = str2;
        this.f121692c = list;
        this.f121693d = cVar;
        this.f121694e = i10;
    }
}
