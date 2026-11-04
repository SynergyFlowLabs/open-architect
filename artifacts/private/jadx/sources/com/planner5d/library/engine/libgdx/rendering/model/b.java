package com.planner5d.library.engine.libgdx.rendering.model;

import com.badlogic.gdx.graphics.g3d.g;
import com.badlogic.gdx.graphics.g3d.h;
import com.badlogic.gdx.graphics.g3d.i;
import com.badlogic.gdx.graphics.g3d.model.f;
import com.badlogic.gdx.utils.o0;
import java.util.Iterator;

/* JADX INFO: loaded from: classes5.dex */
class b implements i {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final Boolean f160905a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final g f160906b;

    b(cc.c cVar, Boolean bool) {
        this.f160906b = (g) cVar;
        this.f160905a = bool;
    }

    private void k(com.badlogic.gdx.graphics.g3d.model.c cVar, com.badlogic.gdx.utils.b<h> bVar, o0<h> o0Var) {
        com.badlogic.gdx.graphics.g3d.d dVar;
        if (cVar != null) {
            int i10 = 0;
            while (true) {
                com.badlogic.gdx.utils.b<f> bVar2 = cVar.f94448i;
                if (i10 >= bVar2.f95174b) {
                    break;
                }
                f fVar = bVar2.get(i10);
                if (fVar != null && fVar.f94461e && (dVar = fVar.f94458b) != null) {
                    if (this.f160905a == null) {
                        bVar.c(this.f160906b.E(o0Var.f(), cVar, fVar));
                    } else {
                        boolean zZ1 = dVar.z1();
                        if ((this.f160905a.booleanValue() && zZ1) || (!this.f160905a.booleanValue() && !zZ1)) {
                            bVar.c(this.f160906b.E(o0Var.f(), cVar, fVar));
                        }
                    }
                }
                i10++;
            }
            Iterator<com.badlogic.gdx.graphics.g3d.model.c> it = cVar.n().iterator();
            while (it.hasNext()) {
                k(it.next(), bVar, o0Var);
            }
        }
    }

    @Override // com.badlogic.gdx.graphics.g3d.i
    public void f(com.badlogic.gdx.utils.b<h> bVar, o0<h> o0Var) {
        com.badlogic.gdx.graphics.g3d.model.c[] cVarArr = this.f160906b.f94415b.f95173a;
        for (int i10 = 0; i10 < this.f160906b.f94415b.f95174b; i10++) {
            k(cVarArr[i10], bVar, o0Var);
        }
    }
}
