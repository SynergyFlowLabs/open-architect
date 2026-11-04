package com.google.firebase.inappmessaging.internal;

/* JADX INFO: loaded from: classes5.dex */
final class h extends o2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final String f122642a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final com.google.firebase.installations.p f122643b;

    h(String str, com.google.firebase.installations.p pVar) {
        if (str == null) {
            throw new NullPointerException("Null installationId");
        }
        this.f122642a = str;
        if (pVar == null) {
            throw new NullPointerException("Null installationTokenResult");
        }
        this.f122643b = pVar;
    }

    @Override // com.google.firebase.inappmessaging.internal.o2
    String b() {
        return this.f122642a;
    }

    @Override // com.google.firebase.inappmessaging.internal.o2
    com.google.firebase.installations.p c() {
        return this.f122643b;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof o2) {
            o2 o2Var = (o2) obj;
            if (this.f122642a.equals(o2Var.b()) && this.f122643b.equals(o2Var.c())) {
                return true;
            }
        }
        return false;
    }

    public int hashCode() {
        return this.f122643b.hashCode() ^ ((this.f122642a.hashCode() ^ 1000003) * 1000003);
    }

    public String toString() {
        return "InstallationIdResult{installationId=" + this.f122642a + ", installationTokenResult=" + this.f122643b + "}";
    }
}
