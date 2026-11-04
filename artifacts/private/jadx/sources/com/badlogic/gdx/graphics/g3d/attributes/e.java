package com.badlogic.gdx.graphics.g3d.attributes;

import java.util.Iterator;

/* JADX INFO: loaded from: classes3.dex */
public class e extends com.badlogic.gdx.graphics.g3d.a {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final String f94332e = "directionalLights";

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final long f94333f = com.badlogic.gdx.graphics.g3d.a.p(f94332e);

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final com.badlogic.gdx.utils.b<com.badlogic.gdx.graphics.g3d.environment.c> f94334d;

    public e() {
        super(f94333f);
        this.f94334d = new com.badlogic.gdx.utils.b<>(1);
    }

    public static final boolean s(long j10) {
        return (f94333f & j10) == j10;
    }

    @Override // com.badlogic.gdx.graphics.g3d.a
    public int hashCode() {
        int iHashCode = super.hashCode();
        Iterator<com.badlogic.gdx.graphics.g3d.environment.c> it = this.f94334d.iterator();
        while (it.hasNext()) {
            com.badlogic.gdx.graphics.g3d.environment.c next = it.next();
            iHashCode = (iHashCode * 1229) + (next == null ? 0 : next.hashCode());
        }
        return iHashCode;
    }

    @Override // java.lang.Comparable
    /* JADX INFO: renamed from: q, reason: merged with bridge method [inline-methods] */
    public int compareTo(com.badlogic.gdx.graphics.g3d.a aVar) {
        long j10 = this.f94297a;
        long j11 = aVar.f94297a;
        if (j10 != j11) {
            return j10 < j11 ? -1 : 1;
        }
        return 0;
    }

    @Override // com.badlogic.gdx.graphics.g3d.a
    /* JADX INFO: renamed from: r, reason: merged with bridge method [inline-methods] */
    public e k() {
        return new e(this);
    }

    public e(e eVar) {
        this();
        this.f94334d.d(eVar.f94334d);
    }
}
