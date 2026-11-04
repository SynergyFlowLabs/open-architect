package com.planner5d.library.widget.editor.editor2d;

import android.graphics.PointF;

/* JADX INFO: loaded from: classes12.dex */
class i {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private static final float f255117e = 1.0f;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private com.planner5d.library.widget.editor.editor2d.painter.d.c f255118a = null;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private com.planner5d.library.widget.editor.editor2d.painter.d.C1727d f255119b = null;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final com.planner5d.library.math.k f255120c = new com.planner5d.library.math.k();

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final com.planner5d.library.math.k f255121d = new com.planner5d.library.math.k();

    i() {
    }

    private com.planner5d.library.widget.editor.editor2d.drawable.gizmo.c a(o oVar) {
        com.planner5d.library.widget.editor.editor2d.drawable.f[] fVarArrE = oVar == null ? null : oVar.e();
        if (fVarArrE != null) {
            for (com.planner5d.library.widget.editor.editor2d.drawable.f fVar : fVarArrE) {
                if (fVar instanceof com.planner5d.library.widget.editor.editor2d.drawable.gizmo.c) {
                    return (com.planner5d.library.widget.editor.editor2d.drawable.gizmo.c) fVar;
                }
            }
        }
        return null;
    }

    boolean b(o oVar, com.planner5d.library.widget.editor.editor2d.painter.d dVar, int i10, PointF pointF, com.planner5d.library.widget.editor.helper.g gVar) {
        com.planner5d.library.widget.editor.editor2d.drawable.gizmo.c cVarA;
        if ((oVar == null ? null : oVar.l()) == null || (cVarA = a(oVar)) == null) {
            return false;
        }
        if (i10 == 0) {
            this.f255120c.U(pointF.x, pointF.y);
            com.planner5d.library.widget.editor.editor2d.painter.d.c cVarT = cVarA.t(pointF);
            this.f255118a = cVarT;
            if (cVarT != null) {
                cVarA.u(cVarT);
                this.f255119b = dVar.U(pointF, this.f255118a);
                if (this.f255118a == com.planner5d.library.widget.editor.editor2d.painter.d.c.Rotate) {
                    gVar.f(true);
                } else {
                    gVar.g();
                }
                return true;
            }
        }
        if (this.f255119b == null) {
            return false;
        }
        if (i10 != 1 && i10 != 3) {
            if (i10 != 2) {
                return false;
            }
            this.f255121d.U(pointF.x, pointF.y);
            dVar.B(this.f255119b, pointF);
            return true;
        }
        cVarA.u(null);
        dVar.X(this.f255119b);
        if (this.f255120c.m(this.f255121d) > 1.0f) {
            dVar.d0();
        }
        com.planner5d.library.widget.editor.editor2d.painter.d.c cVar = this.f255118a;
        if (cVar != null) {
            if (cVar == com.planner5d.library.widget.editor.editor2d.painter.d.c.Rotate) {
                gVar.h();
            } else {
                gVar.j();
            }
        }
        this.f255118a = null;
        this.f255119b = null;
        return true;
    }

    boolean c() {
        return this.f255119b != null;
    }
}
