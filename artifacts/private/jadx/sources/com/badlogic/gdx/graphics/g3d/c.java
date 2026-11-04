package com.badlogic.gdx.graphics.g3d;

import com.badlogic.gdx.utils.t;
import java.util.Iterator;

/* JADX INFO: loaded from: classes3.dex */
public class c extends b {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public com.badlogic.gdx.graphics.g3d.environment.f f94373d;

    public c A2(com.badlogic.gdx.graphics.g3d.environment.g gVar) {
        long j10 = com.badlogic.gdx.graphics.g3d.attributes.i.f94347f;
        if (a2(j10)) {
            com.badlogic.gdx.graphics.g3d.attributes.i iVar = (com.badlogic.gdx.graphics.g3d.attributes.i) W1(j10);
            iVar.f94348d.C(gVar, false);
            if (iVar.f94348d.f95174b == 0) {
                e2(j10);
            }
        }
        return this;
    }

    public c B2(com.badlogic.gdx.utils.b<com.badlogic.gdx.graphics.g3d.environment.b> bVar) {
        Iterator<com.badlogic.gdx.graphics.g3d.environment.b> it = bVar.iterator();
        while (it.hasNext()) {
            x2(it.next());
        }
        return this;
    }

    public c C2(com.badlogic.gdx.graphics.g3d.environment.b... bVarArr) {
        for (com.badlogic.gdx.graphics.g3d.environment.b bVar : bVarArr) {
            x2(bVar);
        }
        return this;
    }

    public c q2(com.badlogic.gdx.graphics.g3d.environment.b bVar) {
        if (bVar instanceof com.badlogic.gdx.graphics.g3d.environment.c) {
            r2((com.badlogic.gdx.graphics.g3d.environment.c) bVar);
            return this;
        }
        if (bVar instanceof com.badlogic.gdx.graphics.g3d.environment.e) {
            s2((com.badlogic.gdx.graphics.g3d.environment.e) bVar);
            return this;
        }
        if (!(bVar instanceof com.badlogic.gdx.graphics.g3d.environment.g)) {
            throw new t("Unknown light type");
        }
        u2((com.badlogic.gdx.graphics.g3d.environment.g) bVar);
        return this;
    }

    public c r2(com.badlogic.gdx.graphics.g3d.environment.c cVar) {
        com.badlogic.gdx.graphics.g3d.attributes.e eVar = (com.badlogic.gdx.graphics.g3d.attributes.e) W1(com.badlogic.gdx.graphics.g3d.attributes.e.f94333f);
        if (eVar == null) {
            eVar = new com.badlogic.gdx.graphics.g3d.attributes.e();
            h2(eVar);
        }
        eVar.f94334d.c(cVar);
        return this;
    }

    public c s2(com.badlogic.gdx.graphics.g3d.environment.e eVar) {
        com.badlogic.gdx.graphics.g3d.attributes.h hVar = (com.badlogic.gdx.graphics.g3d.attributes.h) W1(com.badlogic.gdx.graphics.g3d.attributes.h.f94344f);
        if (hVar == null) {
            hVar = new com.badlogic.gdx.graphics.g3d.attributes.h();
            h2(hVar);
        }
        hVar.f94345d.c(eVar);
        return this;
    }

    public c u2(com.badlogic.gdx.graphics.g3d.environment.g gVar) {
        com.badlogic.gdx.graphics.g3d.attributes.i iVar = (com.badlogic.gdx.graphics.g3d.attributes.i) W1(com.badlogic.gdx.graphics.g3d.attributes.i.f94347f);
        if (iVar == null) {
            iVar = new com.badlogic.gdx.graphics.g3d.attributes.i();
            h2(iVar);
        }
        iVar.f94348d.c(gVar);
        return this;
    }

    public c v2(com.badlogic.gdx.utils.b<com.badlogic.gdx.graphics.g3d.environment.b> bVar) {
        Iterator<com.badlogic.gdx.graphics.g3d.environment.b> it = bVar.iterator();
        while (it.hasNext()) {
            q2(it.next());
        }
        return this;
    }

    public c w2(com.badlogic.gdx.graphics.g3d.environment.b... bVarArr) {
        for (com.badlogic.gdx.graphics.g3d.environment.b bVar : bVarArr) {
            q2(bVar);
        }
        return this;
    }

    public c x2(com.badlogic.gdx.graphics.g3d.environment.b bVar) {
        if (bVar instanceof com.badlogic.gdx.graphics.g3d.environment.c) {
            y2((com.badlogic.gdx.graphics.g3d.environment.c) bVar);
            return this;
        }
        if (bVar instanceof com.badlogic.gdx.graphics.g3d.environment.e) {
            z2((com.badlogic.gdx.graphics.g3d.environment.e) bVar);
            return this;
        }
        if (!(bVar instanceof com.badlogic.gdx.graphics.g3d.environment.g)) {
            throw new t("Unknown light type");
        }
        A2((com.badlogic.gdx.graphics.g3d.environment.g) bVar);
        return this;
    }

    public c y2(com.badlogic.gdx.graphics.g3d.environment.c cVar) {
        long j10 = com.badlogic.gdx.graphics.g3d.attributes.e.f94333f;
        if (a2(j10)) {
            com.badlogic.gdx.graphics.g3d.attributes.e eVar = (com.badlogic.gdx.graphics.g3d.attributes.e) W1(j10);
            eVar.f94334d.C(cVar, false);
            if (eVar.f94334d.f95174b == 0) {
                e2(j10);
            }
        }
        return this;
    }

    public c z2(com.badlogic.gdx.graphics.g3d.environment.e eVar) {
        long j10 = com.badlogic.gdx.graphics.g3d.attributes.h.f94344f;
        if (a2(j10)) {
            com.badlogic.gdx.graphics.g3d.attributes.h hVar = (com.badlogic.gdx.graphics.g3d.attributes.h) W1(j10);
            boolean z10 = true | false;
            hVar.f94345d.C(eVar, false);
            if (hVar.f94345d.f95174b == 0) {
                e2(j10);
            }
        }
        return this;
    }
}
