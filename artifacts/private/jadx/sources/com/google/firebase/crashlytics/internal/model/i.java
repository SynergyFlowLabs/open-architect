package com.google.firebase.crashlytics.internal.model;

import androidx.annotation.NonNull;
import androidx.annotation.p0;

/* JADX INFO: loaded from: classes5.dex */
final class i extends f0.f.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final String f121608a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final String f121609b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final String f121610c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final f0.f.a.b f121611d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final String f121612e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final String f121613f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private final String f121614g;

    static final class b extends f0.f.a.AbstractC1131a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private String f121615a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private String f121616b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private String f121617c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private f0.f.a.b f121618d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        private String f121619e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        private String f121620f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        private String f121621g;

        @Override // com.google.firebase.crashlytics.internal.model.f0.f.a.AbstractC1131a
        public f0.f.a a() {
            String str;
            String str2 = this.f121615a;
            if (str2 != null && (str = this.f121616b) != null) {
                return new i(str2, str, this.f121617c, this.f121618d, this.f121619e, this.f121620f, this.f121621g);
            }
            StringBuilder sb2 = new StringBuilder();
            if (this.f121615a == null) {
                sb2.append(" identifier");
            }
            if (this.f121616b == null) {
                sb2.append(" version");
            }
            throw new IllegalStateException("Missing required properties:" + ((Object) sb2));
        }

        @Override // com.google.firebase.crashlytics.internal.model.f0.f.a.AbstractC1131a
        public f0.f.a.AbstractC1131a b(@p0 String str) {
            this.f121620f = str;
            return this;
        }

        @Override // com.google.firebase.crashlytics.internal.model.f0.f.a.AbstractC1131a
        public f0.f.a.AbstractC1131a c(@p0 String str) {
            this.f121621g = str;
            return this;
        }

        @Override // com.google.firebase.crashlytics.internal.model.f0.f.a.AbstractC1131a
        public f0.f.a.AbstractC1131a d(String str) {
            this.f121617c = str;
            return this;
        }

        @Override // com.google.firebase.crashlytics.internal.model.f0.f.a.AbstractC1131a
        public f0.f.a.AbstractC1131a e(String str) {
            if (str == null) {
                throw new NullPointerException("Null identifier");
            }
            this.f121615a = str;
            return this;
        }

        @Override // com.google.firebase.crashlytics.internal.model.f0.f.a.AbstractC1131a
        public f0.f.a.AbstractC1131a f(String str) {
            this.f121619e = str;
            return this;
        }

        @Override // com.google.firebase.crashlytics.internal.model.f0.f.a.AbstractC1131a
        public f0.f.a.AbstractC1131a g(f0.f.a.b bVar) {
            this.f121618d = bVar;
            return this;
        }

        @Override // com.google.firebase.crashlytics.internal.model.f0.f.a.AbstractC1131a
        public f0.f.a.AbstractC1131a h(String str) {
            if (str == null) {
                throw new NullPointerException("Null version");
            }
            this.f121616b = str;
            return this;
        }

        b() {
        }

        private b(f0.f.a aVar) {
            this.f121615a = aVar.e();
            this.f121616b = aVar.h();
            this.f121617c = aVar.d();
            this.f121618d = aVar.g();
            this.f121619e = aVar.f();
            this.f121620f = aVar.b();
            this.f121621g = aVar.c();
        }
    }

    @Override // com.google.firebase.crashlytics.internal.model.f0.f.a
    @p0
    public String b() {
        return this.f121613f;
    }

    @Override // com.google.firebase.crashlytics.internal.model.f0.f.a
    @p0
    public String c() {
        return this.f121614g;
    }

    @Override // com.google.firebase.crashlytics.internal.model.f0.f.a
    @p0
    public String d() {
        return this.f121610c;
    }

    @Override // com.google.firebase.crashlytics.internal.model.f0.f.a
    @NonNull
    public String e() {
        return this.f121608a;
    }

    public boolean equals(Object obj) {
        String str;
        f0.f.a.b bVar;
        String str2;
        String str3;
        String str4;
        if (obj == this) {
            return true;
        }
        if (obj instanceof f0.f.a) {
            f0.f.a aVar = (f0.f.a) obj;
            if (this.f121608a.equals(aVar.e()) && this.f121609b.equals(aVar.h()) && ((str = this.f121610c) != null ? str.equals(aVar.d()) : aVar.d() == null) && ((bVar = this.f121611d) != null ? bVar.equals(aVar.g()) : aVar.g() == null) && ((str2 = this.f121612e) != null ? str2.equals(aVar.f()) : aVar.f() == null) && ((str3 = this.f121613f) != null ? str3.equals(aVar.b()) : aVar.b() == null) && ((str4 = this.f121614g) != null ? str4.equals(aVar.c()) : aVar.c() == null)) {
                return true;
            }
        }
        return false;
    }

    @Override // com.google.firebase.crashlytics.internal.model.f0.f.a
    @p0
    public String f() {
        return this.f121612e;
    }

    @Override // com.google.firebase.crashlytics.internal.model.f0.f.a
    @p0
    public f0.f.a.b g() {
        return this.f121611d;
    }

    @Override // com.google.firebase.crashlytics.internal.model.f0.f.a
    @NonNull
    public String h() {
        return this.f121609b;
    }

    public int hashCode() {
        int iHashCode = (((this.f121608a.hashCode() ^ 1000003) * 1000003) ^ this.f121609b.hashCode()) * 1000003;
        String str = this.f121610c;
        int iHashCode2 = (iHashCode ^ (str == null ? 0 : str.hashCode())) * 1000003;
        f0.f.a.b bVar = this.f121611d;
        int iHashCode3 = (iHashCode2 ^ (bVar == null ? 0 : bVar.hashCode())) * 1000003;
        String str2 = this.f121612e;
        int iHashCode4 = (iHashCode3 ^ (str2 == null ? 0 : str2.hashCode())) * 1000003;
        String str3 = this.f121613f;
        int iHashCode5 = (iHashCode4 ^ (str3 == null ? 0 : str3.hashCode())) * 1000003;
        String str4 = this.f121614g;
        return iHashCode5 ^ (str4 != null ? str4.hashCode() : 0);
    }

    @Override // com.google.firebase.crashlytics.internal.model.f0.f.a
    protected f0.f.a.AbstractC1131a i() {
        return new b(this);
    }

    public String toString() {
        return "Application{identifier=" + this.f121608a + ", version=" + this.f121609b + ", displayVersion=" + this.f121610c + ", organization=" + this.f121611d + ", installationUuid=" + this.f121612e + ", developmentPlatform=" + this.f121613f + ", developmentPlatformVersion=" + this.f121614g + "}";
    }

    private i(String str, String str2, @p0 String str3, @p0 f0.f.a.b bVar, @p0 String str4, @p0 String str5, @p0 String str6) {
        this.f121608a = str;
        this.f121609b = str2;
        this.f121610c = str3;
        this.f121611d = bVar;
        this.f121612e = str4;
        this.f121613f = str5;
        this.f121614g = str6;
    }
}
