package com.badlogic.gdx.math;

/* JADX INFO: loaded from: classes3.dex */
public class p {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f95004a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public int f95005b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public int f95006c;

    public p() {
    }

    public p a(int i10, int i11, int i12) {
        this.f95004a = i10;
        this.f95005b = i11;
        this.f95006c = i12;
        return this;
    }

    public p b(p pVar) {
        this.f95004a = pVar.f95004a;
        this.f95005b = pVar.f95005b;
        this.f95006c = pVar.f95006c;
        return this;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && obj.getClass() == getClass()) {
            p pVar = (p) obj;
            if (this.f95004a == pVar.f95004a && this.f95005b == pVar.f95005b && this.f95006c == pVar.f95006c) {
                return true;
            }
        }
        return false;
    }

    public int hashCode() {
        return ((((this.f95004a + 17) * 17) + this.f95005b) * 17) + this.f95006c;
    }

    public p(int i10, int i11, int i12) {
        this.f95004a = i10;
        this.f95005b = i11;
        this.f95006c = i12;
    }

    public p(p pVar) {
        this.f95004a = pVar.f95004a;
        this.f95005b = pVar.f95005b;
        this.f95006c = pVar.f95006c;
    }
}
