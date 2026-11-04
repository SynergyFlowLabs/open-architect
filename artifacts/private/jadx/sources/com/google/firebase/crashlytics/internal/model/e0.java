package com.google.firebase.crashlytics.internal.model;

/* JADX INFO: loaded from: classes5.dex */
final class e0 extends g0.c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final String f121567a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final String f121568b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final boolean f121569c;

    e0(String str, String str2, boolean z10) {
        if (str == null) {
            throw new NullPointerException("Null osRelease");
        }
        this.f121567a = str;
        if (str2 == null) {
            throw new NullPointerException("Null osCodeName");
        }
        this.f121568b = str2;
        this.f121569c = z10;
    }

    @Override // com.google.firebase.crashlytics.internal.model.g0.c
    public boolean b() {
        return this.f121569c;
    }

    @Override // com.google.firebase.crashlytics.internal.model.g0.c
    public String c() {
        return this.f121568b;
    }

    @Override // com.google.firebase.crashlytics.internal.model.g0.c
    public String d() {
        return this.f121567a;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof g0.c) {
            g0.c cVar = (g0.c) obj;
            if (this.f121567a.equals(cVar.d()) && this.f121568b.equals(cVar.c()) && this.f121569c == cVar.b()) {
                return true;
            }
        }
        return false;
    }

    public int hashCode() {
        return (this.f121569c ? 1231 : 1237) ^ ((((this.f121567a.hashCode() ^ 1000003) * 1000003) ^ this.f121568b.hashCode()) * 1000003);
    }

    public String toString() {
        return "OsData{osRelease=" + this.f121567a + ", osCodeName=" + this.f121568b + ", isRooted=" + this.f121569c + "}";
    }
}
