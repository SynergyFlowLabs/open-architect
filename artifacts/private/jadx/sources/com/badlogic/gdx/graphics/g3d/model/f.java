package com.badlogic.gdx.graphics.g3d.model;

import com.badlogic.gdx.graphics.g3d.h;
import com.badlogic.gdx.math.Matrix4;

/* JADX INFO: loaded from: classes3.dex */
public class f {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public b f94457a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public com.badlogic.gdx.graphics.g3d.d f94458b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public com.badlogic.gdx.utils.c<c, Matrix4> f94459c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public Matrix4[] f94460d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public boolean f94461e = true;

    public f() {
    }

    public h a(h hVar) {
        hVar.f94427f = this.f94458b;
        b bVar = this.f94457a;
        hVar.f94423b = bVar.f94439e;
        hVar.f94424c = bVar.f94437c;
        hVar.f94425d = bVar.f94438d;
        hVar.f94426e = bVar.f94436b;
        hVar.f94429h = this.f94460d;
        return hVar;
    }

    public f(b bVar, com.badlogic.gdx.graphics.g3d.d dVar) {
        this.f94457a = bVar;
        this.f94458b = dVar;
    }
}
