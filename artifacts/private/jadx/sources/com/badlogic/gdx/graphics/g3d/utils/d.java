package com.badlogic.gdx.graphics.g3d.utils;

import com.badlogic.gdx.math.d0;
import java.util.Comparator;

/* JADX INFO: loaded from: classes3.dex */
public class d implements j, Comparator<com.badlogic.gdx.graphics.g3d.h> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private com.planner5d.library.engine.g f94617a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final d0 f94618b = new d0();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final d0 f94619c = new d0();

    @Override // com.badlogic.gdx.graphics.g3d.utils.j
    public void a(com.planner5d.library.engine.g gVar, com.badlogic.gdx.utils.b<com.badlogic.gdx.graphics.g3d.h> bVar) {
        this.f94617a = gVar;
        bVar.sort(this);
    }

    @Override // java.util.Comparator
    /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
    public int compare(com.badlogic.gdx.graphics.g3d.h hVar, com.badlogic.gdx.graphics.g3d.h hVar2) {
        com.badlogic.gdx.graphics.g3d.d dVar = hVar.f94427f;
        long j10 = com.badlogic.gdx.graphics.g3d.attributes.a.f94300i;
        int i10 = 0;
        boolean z10 = dVar.a2(j10) && ((com.badlogic.gdx.graphics.g3d.attributes.a) hVar.f94427f.W1(j10)).f94301d;
        if (z10 != (hVar2.f94427f.a2(j10) && ((com.badlogic.gdx.graphics.g3d.attributes.a) hVar2.f94427f.W1(j10)).f94301d)) {
            return z10 ? 1 : -1;
        }
        hVar.f94422a.r(this.f94618b);
        hVar2.f94422a.r(this.f94619c);
        float fB0 = ((int) (this.f94617a.getPosition().b0(this.f94618b) * 1000.0f)) - ((int) (this.f94617a.getPosition().b0(this.f94619c) * 1000.0f));
        if (fB0 < 0.0f) {
            i10 = -1;
        } else if (fB0 > 0.0f) {
            i10 = 1;
        }
        return z10 ? -i10 : i10;
    }
}
