package com.badlogic.gdx.graphics.g3d.model;

/* JADX INFO: loaded from: classes3.dex */
public class b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public String f94435a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public int f94436b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public int f94437c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public int f94438d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public com.badlogic.gdx.graphics.f f94439e;

    public b() {
    }

    public boolean a(b bVar) {
        if (bVar != this) {
            return bVar != null && bVar.f94439e == this.f94439e && bVar.f94436b == this.f94436b && bVar.f94437c == this.f94437c && bVar.f94438d == this.f94438d;
        }
        return true;
    }

    public boolean equals(Object obj) {
        if (obj == null) {
            return false;
        }
        if (obj == this) {
            return true;
        }
        if (obj instanceof b) {
            return a((b) obj);
        }
        return false;
    }

    public b(String str, com.badlogic.gdx.graphics.f fVar, int i10, int i11, int i12) {
        this.f94435a = str;
        this.f94439e = fVar;
        this.f94437c = i10;
        this.f94438d = i11;
        this.f94436b = i12;
    }

    public b(b bVar) {
        this(bVar.f94435a, bVar.f94439e, bVar.f94437c, bVar.f94438d, bVar.f94436b);
    }
}
