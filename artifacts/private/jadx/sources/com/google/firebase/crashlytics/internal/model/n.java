package com.google.firebase.crashlytics.internal.model;

import androidx.annotation.NonNull;
import androidx.annotation.p0;
import java.util.List;

/* JADX INFO: loaded from: classes5.dex */
final class n extends f0.f.d.a.b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final List<f0.f.d.a.b.e> f121671a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final f0.f.d.a.b.c f121672b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final f0.a f121673c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final f0.f.d.a.b.AbstractC1138d f121674d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final List<f0.f.d.a.b.AbstractC1134a> f121675e;

    static final class b extends f0.f.d.a.b.AbstractC1136b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private List<f0.f.d.a.b.e> f121676a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private f0.f.d.a.b.c f121677b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private f0.a f121678c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private f0.f.d.a.b.AbstractC1138d f121679d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        private List<f0.f.d.a.b.AbstractC1134a> f121680e;

        b() {
        }

        @Override // com.google.firebase.crashlytics.internal.model.f0.f.d.a.b.AbstractC1136b
        public f0.f.d.a.b a() {
            List<f0.f.d.a.b.AbstractC1134a> list;
            f0.f.d.a.b.AbstractC1138d abstractC1138d = this.f121679d;
            if (abstractC1138d != null && (list = this.f121680e) != null) {
                return new n(this.f121676a, this.f121677b, this.f121678c, abstractC1138d, list);
            }
            StringBuilder sb2 = new StringBuilder();
            if (this.f121679d == null) {
                sb2.append(" signal");
            }
            if (this.f121680e == null) {
                sb2.append(" binaries");
            }
            throw new IllegalStateException("Missing required properties:" + ((Object) sb2));
        }

        @Override // com.google.firebase.crashlytics.internal.model.f0.f.d.a.b.AbstractC1136b
        public f0.f.d.a.b.AbstractC1136b b(f0.a aVar) {
            this.f121678c = aVar;
            return this;
        }

        @Override // com.google.firebase.crashlytics.internal.model.f0.f.d.a.b.AbstractC1136b
        public f0.f.d.a.b.AbstractC1136b c(List<f0.f.d.a.b.AbstractC1134a> list) {
            if (list == null) {
                throw new NullPointerException("Null binaries");
            }
            this.f121680e = list;
            return this;
        }

        @Override // com.google.firebase.crashlytics.internal.model.f0.f.d.a.b.AbstractC1136b
        public f0.f.d.a.b.AbstractC1136b d(f0.f.d.a.b.c cVar) {
            this.f121677b = cVar;
            return this;
        }

        @Override // com.google.firebase.crashlytics.internal.model.f0.f.d.a.b.AbstractC1136b
        public f0.f.d.a.b.AbstractC1136b e(f0.f.d.a.b.AbstractC1138d abstractC1138d) {
            if (abstractC1138d == null) {
                throw new NullPointerException("Null signal");
            }
            this.f121679d = abstractC1138d;
            return this;
        }

        @Override // com.google.firebase.crashlytics.internal.model.f0.f.d.a.b.AbstractC1136b
        public f0.f.d.a.b.AbstractC1136b f(List<f0.f.d.a.b.e> list) {
            this.f121676a = list;
            return this;
        }
    }

    @Override // com.google.firebase.crashlytics.internal.model.f0.f.d.a.b
    @p0
    public f0.a b() {
        return this.f121673c;
    }

    @Override // com.google.firebase.crashlytics.internal.model.f0.f.d.a.b
    @NonNull
    public List<f0.f.d.a.b.AbstractC1134a> c() {
        return this.f121675e;
    }

    @Override // com.google.firebase.crashlytics.internal.model.f0.f.d.a.b
    @p0
    public f0.f.d.a.b.c d() {
        return this.f121672b;
    }

    @Override // com.google.firebase.crashlytics.internal.model.f0.f.d.a.b
    @NonNull
    public f0.f.d.a.b.AbstractC1138d e() {
        return this.f121674d;
    }

    /* JADX WARN: Code duplicated, block: B:23:0x0042  */
    /* JADX WARN: Code duplicated, block: B:25:0x004a  */
    /* JADX WARN: Code duplicated, block: B:26:0x004c  */
    /* JADX WARN: Code duplicated, block: B:28:0x0057  */
    /* JADX WARN: Code duplicated, block: B:30:0x0064  */
    public boolean equals(Object obj) {
        f0.a aVar;
        if (obj == this) {
            return true;
        }
        if (obj instanceof f0.f.d.a.b) {
            f0.f.d.a.b bVar = (f0.f.d.a.b) obj;
            List<f0.f.d.a.b.e> list = this.f121671a;
            if (list != null ? list.equals(bVar.f()) : bVar.f() == null) {
                f0.f.d.a.b.c cVar = this.f121672b;
                if (cVar == null) {
                    if (bVar.d() == null) {
                        aVar = this.f121673c;
                        if (aVar == null) {
                            if (bVar.b() == null) {
                                if (this.f121674d.equals(bVar.e()) && this.f121675e.equals(bVar.c())) {
                                    return true;
                                }
                            }
                        } else if (aVar.equals(bVar.b())) {
                            if (this.f121674d.equals(bVar.e())) {
                                return true;
                            }
                        }
                    }
                } else if (cVar.equals(bVar.d())) {
                    aVar = this.f121673c;
                    if (aVar == null) {
                        if (bVar.b() == null) {
                            if (this.f121674d.equals(bVar.e())) {
                                return true;
                            }
                        }
                    } else if (aVar.equals(bVar.b())) {
                        if (this.f121674d.equals(bVar.e())) {
                            return true;
                        }
                    }
                }
            }
        }
        return false;
    }

    @Override // com.google.firebase.crashlytics.internal.model.f0.f.d.a.b
    @p0
    public List<f0.f.d.a.b.e> f() {
        return this.f121671a;
    }

    public int hashCode() {
        List<f0.f.d.a.b.e> list = this.f121671a;
        int iHashCode = 0;
        int iHashCode2 = ((list == null ? 0 : list.hashCode()) ^ 1000003) * 1000003;
        f0.f.d.a.b.c cVar = this.f121672b;
        int iHashCode3 = (iHashCode2 ^ (cVar == null ? 0 : cVar.hashCode())) * 1000003;
        f0.a aVar = this.f121673c;
        if (aVar != null) {
            iHashCode = aVar.hashCode();
        }
        return this.f121675e.hashCode() ^ ((((iHashCode3 ^ iHashCode) * 1000003) ^ this.f121674d.hashCode()) * 1000003);
    }

    public String toString() {
        return "Execution{threads=" + this.f121671a + ", exception=" + this.f121672b + ", appExitInfo=" + this.f121673c + ", signal=" + this.f121674d + ", binaries=" + this.f121675e + "}";
    }

    private n(@p0 List<f0.f.d.a.b.e> list, @p0 f0.f.d.a.b.c cVar, @p0 f0.a aVar, f0.f.d.a.b.AbstractC1138d abstractC1138d, List<f0.f.d.a.b.AbstractC1134a> list2) {
        this.f121671a = list;
        this.f121672b = cVar;
        this.f121673c = aVar;
        this.f121674d = abstractC1138d;
        this.f121675e = list2;
    }
}
