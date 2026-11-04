package com.google.firebase.crashlytics.internal.model;

import androidx.annotation.NonNull;

/* JADX INFO: loaded from: classes5.dex */
final class t extends f0.f.d.a.c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final String f121727a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final int f121728b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final int f121729c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final boolean f121730d;

    static final class b extends f0.f.d.a.c.AbstractC1143a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private String f121731a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private int f121732b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private int f121733c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private boolean f121734d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        private byte f121735e;

        b() {
        }

        @Override // com.google.firebase.crashlytics.internal.model.f0.f.d.a.c.AbstractC1143a
        public f0.f.d.a.c a() {
            String str;
            if (this.f121735e == 7 && (str = this.f121731a) != null) {
                return new t(str, this.f121732b, this.f121733c, this.f121734d);
            }
            StringBuilder sb2 = new StringBuilder();
            if (this.f121731a == null) {
                sb2.append(" processName");
            }
            if ((this.f121735e & 1) == 0) {
                sb2.append(" pid");
            }
            if ((this.f121735e & 2) == 0) {
                sb2.append(" importance");
            }
            if ((this.f121735e & 4) == 0) {
                sb2.append(" defaultProcess");
            }
            throw new IllegalStateException("Missing required properties:" + ((Object) sb2));
        }

        @Override // com.google.firebase.crashlytics.internal.model.f0.f.d.a.c.AbstractC1143a
        public f0.f.d.a.c.AbstractC1143a b(boolean z10) {
            this.f121734d = z10;
            this.f121735e = (byte) (this.f121735e | 4);
            return this;
        }

        @Override // com.google.firebase.crashlytics.internal.model.f0.f.d.a.c.AbstractC1143a
        public f0.f.d.a.c.AbstractC1143a c(int i10) {
            this.f121733c = i10;
            this.f121735e = (byte) (this.f121735e | 2);
            return this;
        }

        @Override // com.google.firebase.crashlytics.internal.model.f0.f.d.a.c.AbstractC1143a
        public f0.f.d.a.c.AbstractC1143a d(int i10) {
            this.f121732b = i10;
            this.f121735e = (byte) (this.f121735e | 1);
            return this;
        }

        @Override // com.google.firebase.crashlytics.internal.model.f0.f.d.a.c.AbstractC1143a
        public f0.f.d.a.c.AbstractC1143a e(String str) {
            if (str == null) {
                throw new NullPointerException("Null processName");
            }
            this.f121731a = str;
            return this;
        }
    }

    @Override // com.google.firebase.crashlytics.internal.model.f0.f.d.a.c
    public int b() {
        return this.f121729c;
    }

    @Override // com.google.firebase.crashlytics.internal.model.f0.f.d.a.c
    public int c() {
        return this.f121728b;
    }

    @Override // com.google.firebase.crashlytics.internal.model.f0.f.d.a.c
    @NonNull
    public String d() {
        return this.f121727a;
    }

    @Override // com.google.firebase.crashlytics.internal.model.f0.f.d.a.c
    public boolean e() {
        return this.f121730d;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof f0.f.d.a.c) {
            f0.f.d.a.c cVar = (f0.f.d.a.c) obj;
            if (this.f121727a.equals(cVar.d()) && this.f121728b == cVar.c() && this.f121729c == cVar.b() && this.f121730d == cVar.e()) {
                return true;
            }
        }
        return false;
    }

    public int hashCode() {
        return (this.f121730d ? 1231 : 1237) ^ ((((((this.f121727a.hashCode() ^ 1000003) * 1000003) ^ this.f121728b) * 1000003) ^ this.f121729c) * 1000003);
    }

    public String toString() {
        return "ProcessDetails{processName=" + this.f121727a + ", pid=" + this.f121728b + ", importance=" + this.f121729c + ", defaultProcess=" + this.f121730d + "}";
    }

    private t(String str, int i10, int i11, boolean z10) {
        this.f121727a = str;
        this.f121728b = i10;
        this.f121729c = i11;
        this.f121730d = z10;
    }
}
