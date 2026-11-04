package com.badlogic.gdx.graphics.g3d.attributes;

import com.badlogic.gdx.math.s;
import com.badlogic.gdx.utils.h0;

/* JADX INFO: loaded from: classes3.dex */
public class f extends com.badlogic.gdx.graphics.g3d.a {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final String f94335e = "shininess";

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final long f94336f = com.badlogic.gdx.graphics.g3d.a.p(f94335e);

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static final String f94337g = "alphaTest";

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public static final long f94338h = com.badlogic.gdx.graphics.g3d.a.p(f94337g);

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public float f94339d;

    public f(long j10) {
        super(j10);
    }

    public static f r(float f10) {
        return new f(f94338h, f10);
    }

    public static f s(float f10) {
        return new f(f94336f, f10);
    }

    @Override // com.badlogic.gdx.graphics.g3d.a
    public int hashCode() {
        return (super.hashCode() * 977) + h0.d(this.f94339d);
    }

    @Override // com.badlogic.gdx.graphics.g3d.a
    public com.badlogic.gdx.graphics.g3d.a k() {
        return new f(this.f94297a, this.f94339d);
    }

    @Override // java.lang.Comparable
    /* JADX INFO: renamed from: q, reason: merged with bridge method [inline-methods] */
    public int compareTo(com.badlogic.gdx.graphics.g3d.a aVar) {
        long j10 = this.f94297a;
        long j11 = aVar.f94297a;
        if (j10 != j11) {
            return (int) (j10 - j11);
        }
        float f10 = ((f) aVar).f94339d;
        if (s.m(this.f94339d, f10)) {
            return 0;
        }
        return this.f94339d < f10 ? -1 : 1;
    }

    public f(long j10, float f10) {
        super(j10);
        this.f94339d = f10;
    }
}
