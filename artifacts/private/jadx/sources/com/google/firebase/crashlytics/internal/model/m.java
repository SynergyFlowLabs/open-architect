package com.google.firebase.crashlytics.internal.model;

import androidx.annotation.NonNull;
import androidx.annotation.p0;
import java.util.List;

/* JADX INFO: loaded from: classes5.dex */
final class m extends f0.f.d.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final f0.f.d.a.b f121656a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final List<f0.d> f121657b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final List<f0.d> f121658c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final Boolean f121659d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final f0.f.d.a.c f121660e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final List<f0.f.d.a.c> f121661f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private final int f121662g;

    static final class b extends f0.f.d.a.AbstractC1133a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private f0.f.d.a.b f121663a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private List<f0.d> f121664b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private List<f0.d> f121665c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private Boolean f121666d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        private f0.f.d.a.c f121667e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        private List<f0.f.d.a.c> f121668f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        private int f121669g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        private byte f121670h;

        @Override // com.google.firebase.crashlytics.internal.model.f0.f.d.a.AbstractC1133a
        public f0.f.d.a a() {
            f0.f.d.a.b bVar;
            if (this.f121670h == 1 && (bVar = this.f121663a) != null) {
                return new m(bVar, this.f121664b, this.f121665c, this.f121666d, this.f121667e, this.f121668f, this.f121669g);
            }
            StringBuilder sb2 = new StringBuilder();
            if (this.f121663a == null) {
                sb2.append(" execution");
            }
            if ((this.f121670h & 1) == 0) {
                sb2.append(" uiOrientation");
            }
            throw new IllegalStateException("Missing required properties:" + ((Object) sb2));
        }

        @Override // com.google.firebase.crashlytics.internal.model.f0.f.d.a.AbstractC1133a
        public f0.f.d.a.AbstractC1133a b(@p0 List<f0.f.d.a.c> list) {
            this.f121668f = list;
            return this;
        }

        @Override // com.google.firebase.crashlytics.internal.model.f0.f.d.a.AbstractC1133a
        public f0.f.d.a.AbstractC1133a c(@p0 Boolean bool) {
            this.f121666d = bool;
            return this;
        }

        @Override // com.google.firebase.crashlytics.internal.model.f0.f.d.a.AbstractC1133a
        public f0.f.d.a.AbstractC1133a d(@p0 f0.f.d.a.c cVar) {
            this.f121667e = cVar;
            return this;
        }

        @Override // com.google.firebase.crashlytics.internal.model.f0.f.d.a.AbstractC1133a
        public f0.f.d.a.AbstractC1133a e(List<f0.d> list) {
            this.f121664b = list;
            return this;
        }

        @Override // com.google.firebase.crashlytics.internal.model.f0.f.d.a.AbstractC1133a
        public f0.f.d.a.AbstractC1133a f(f0.f.d.a.b bVar) {
            if (bVar == null) {
                throw new NullPointerException("Null execution");
            }
            this.f121663a = bVar;
            return this;
        }

        @Override // com.google.firebase.crashlytics.internal.model.f0.f.d.a.AbstractC1133a
        public f0.f.d.a.AbstractC1133a g(List<f0.d> list) {
            this.f121665c = list;
            return this;
        }

        @Override // com.google.firebase.crashlytics.internal.model.f0.f.d.a.AbstractC1133a
        public f0.f.d.a.AbstractC1133a h(int i10) {
            this.f121669g = i10;
            this.f121670h = (byte) (this.f121670h | 1);
            return this;
        }

        b() {
        }

        private b(f0.f.d.a aVar) {
            this.f121663a = aVar.f();
            this.f121664b = aVar.e();
            this.f121665c = aVar.g();
            this.f121666d = aVar.c();
            this.f121667e = aVar.d();
            this.f121668f = aVar.b();
            this.f121669g = aVar.h();
            this.f121670h = (byte) 1;
        }
    }

    @Override // com.google.firebase.crashlytics.internal.model.f0.f.d.a
    @p0
    public List<f0.f.d.a.c> b() {
        return this.f121661f;
    }

    @Override // com.google.firebase.crashlytics.internal.model.f0.f.d.a
    @p0
    public Boolean c() {
        return this.f121659d;
    }

    @Override // com.google.firebase.crashlytics.internal.model.f0.f.d.a
    @p0
    public f0.f.d.a.c d() {
        return this.f121660e;
    }

    @Override // com.google.firebase.crashlytics.internal.model.f0.f.d.a
    @p0
    public List<f0.d> e() {
        return this.f121657b;
    }

    /* JADX WARN: Code duplicated, block: B:32:0x0066  */
    /* JADX WARN: Code duplicated, block: B:34:0x006c  */
    /* JADX WARN: Code duplicated, block: B:35:0x006e  */
    /* JADX WARN: Code duplicated, block: B:37:0x007b  */
    /* JADX WARN: Code duplicated, block: B:39:0x0080  */
    /* JADX WARN: Code duplicated, block: B:42:0x0087  */
    /* JADX WARN: Code duplicated, block: B:46:0x009b A[RETURN] */
    public boolean equals(Object obj) {
        List<f0.d> list;
        Boolean bool;
        f0.f.d.a.c cVar;
        List<f0.f.d.a.c> list2;
        if (obj == this) {
            return true;
        }
        if (obj instanceof f0.f.d.a) {
            f0.f.d.a aVar = (f0.f.d.a) obj;
            if (this.f121656a.equals(aVar.f()) && ((list = this.f121657b) != null ? list.equals(aVar.e()) : aVar.e() == null)) {
                List<f0.d> list3 = this.f121658c;
                if (list3 == null) {
                    if (aVar.g() == null) {
                        bool = this.f121659d;
                        if (bool == null ? bool.equals(aVar.c()) : aVar.c() == null) {
                            cVar = this.f121660e;
                            if (cVar == null) {
                                if (aVar.d() == null) {
                                    list2 = this.f121661f;
                                    if (list2 == null ? list2.equals(aVar.b()) : aVar.b() == null) {
                                        if (this.f121662g == aVar.h()) {
                                            return true;
                                        }
                                    }
                                }
                            } else if (cVar.equals(aVar.d())) {
                                list2 = this.f121661f;
                                if (list2 == null) {
                                    if (this.f121662g == aVar.h()) {
                                        return true;
                                    }
                                } else if (this.f121662g == aVar.h()) {
                                    return true;
                                }
                            }
                        }
                    }
                } else if (list3.equals(aVar.g())) {
                    bool = this.f121659d;
                    if (bool == null) {
                        cVar = this.f121660e;
                        if (cVar == null) {
                            if (aVar.d() == null) {
                                list2 = this.f121661f;
                                if (list2 == null) {
                                    if (this.f121662g == aVar.h()) {
                                        return true;
                                    }
                                } else if (this.f121662g == aVar.h()) {
                                    return true;
                                }
                            }
                        } else if (cVar.equals(aVar.d())) {
                            list2 = this.f121661f;
                            if (list2 == null) {
                                if (this.f121662g == aVar.h()) {
                                    return true;
                                }
                            } else if (this.f121662g == aVar.h()) {
                                return true;
                            }
                        }
                    } else {
                        cVar = this.f121660e;
                        if (cVar == null) {
                            if (aVar.d() == null) {
                                list2 = this.f121661f;
                                if (list2 == null) {
                                    if (this.f121662g == aVar.h()) {
                                        return true;
                                    }
                                } else if (this.f121662g == aVar.h()) {
                                    return true;
                                }
                            }
                        } else if (cVar.equals(aVar.d())) {
                            list2 = this.f121661f;
                            if (list2 == null) {
                                if (this.f121662g == aVar.h()) {
                                    return true;
                                }
                            } else if (this.f121662g == aVar.h()) {
                                return true;
                            }
                        }
                    }
                }
            }
        }
        return false;
    }

    @Override // com.google.firebase.crashlytics.internal.model.f0.f.d.a
    @NonNull
    public f0.f.d.a.b f() {
        return this.f121656a;
    }

    @Override // com.google.firebase.crashlytics.internal.model.f0.f.d.a
    @p0
    public List<f0.d> g() {
        return this.f121658c;
    }

    @Override // com.google.firebase.crashlytics.internal.model.f0.f.d.a
    public int h() {
        return this.f121662g;
    }

    public int hashCode() {
        int iHashCode = (this.f121656a.hashCode() ^ 1000003) * 1000003;
        List<f0.d> list = this.f121657b;
        int iHashCode2 = (iHashCode ^ (list == null ? 0 : list.hashCode())) * 1000003;
        List<f0.d> list2 = this.f121658c;
        int iHashCode3 = (iHashCode2 ^ (list2 == null ? 0 : list2.hashCode())) * 1000003;
        Boolean bool = this.f121659d;
        int iHashCode4 = (iHashCode3 ^ (bool == null ? 0 : bool.hashCode())) * 1000003;
        f0.f.d.a.c cVar = this.f121660e;
        int iHashCode5 = (iHashCode4 ^ (cVar == null ? 0 : cVar.hashCode())) * 1000003;
        List<f0.f.d.a.c> list3 = this.f121661f;
        return this.f121662g ^ ((iHashCode5 ^ (list3 != null ? list3.hashCode() : 0)) * 1000003);
    }

    @Override // com.google.firebase.crashlytics.internal.model.f0.f.d.a
    public f0.f.d.a.AbstractC1133a i() {
        return new b(this);
    }

    public String toString() {
        return "Application{execution=" + this.f121656a + ", customAttributes=" + this.f121657b + ", internalKeys=" + this.f121658c + ", background=" + this.f121659d + ", currentProcessDetails=" + this.f121660e + ", appProcessDetails=" + this.f121661f + ", uiOrientation=" + this.f121662g + "}";
    }

    private m(f0.f.d.a.b bVar, @p0 List<f0.d> list, @p0 List<f0.d> list2, @p0 Boolean bool, @p0 f0.f.d.a.c cVar, @p0 List<f0.f.d.a.c> list3, int i10) {
        this.f121656a = bVar;
        this.f121657b = list;
        this.f121658c = list2;
        this.f121659d = bool;
        this.f121660e = cVar;
        this.f121661f = list3;
        this.f121662g = i10;
    }
}
