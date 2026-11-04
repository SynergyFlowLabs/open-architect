package com.google.firebase.platforminfo;

/* JADX INFO: loaded from: classes5.dex */
final class a extends f {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final String f124407a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final String f124408b;

    a(String str, String str2) {
        if (str == null) {
            throw new NullPointerException("Null libraryName");
        }
        this.f124407a = str;
        if (str2 == null) {
            throw new NullPointerException("Null version");
        }
        this.f124408b = str2;
    }

    @Override // com.google.firebase.platforminfo.f
    @fj.g
    public String b() {
        return this.f124407a;
    }

    @Override // com.google.firebase.platforminfo.f
    @fj.g
    public String c() {
        return this.f124408b;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof f) {
            f fVar = (f) obj;
            if (this.f124407a.equals(fVar.b()) && this.f124408b.equals(fVar.c())) {
                return true;
            }
        }
        return false;
    }

    public int hashCode() {
        return this.f124408b.hashCode() ^ ((this.f124407a.hashCode() ^ 1000003) * 1000003);
    }

    public String toString() {
        return "LibraryVersion{libraryName=" + this.f124407a + ", version=" + this.f124408b + "}";
    }
}
