package com.planner5d.library.widget.editor.helper;

import com.planner5d.library.walls.WallsInfo;
import com.planner5d.library.walls.WallsInfoWall;
import java.util.ArrayList;
import java.util.LinkedList;

/* JADX INFO: loaded from: classes8.dex */
public class x2 {
    public static float a(WallsInfo wallsInfo) {
        return c(wallsInfo == null ? null : wallsInfo.get());
    }

    private static float b(float[] fArr) {
        org.locationtech.jts.geom.a aVar = new org.locationtech.jts.geom.a();
        org.locationtech.jts.geom.a aVar2 = new org.locationtech.jts.geom.a();
        org.locationtech.jts.geom.a aVar3 = new org.locationtech.jts.geom.a();
        float fC = 0.0f;
        int i10 = 0;
        while (i10 < fArr.length) {
            aVar.f338092a = fArr[i10];
            aVar.f338093b = fArr[i10 + 1];
            aVar2.f338092a = fArr[i10 + 2];
            aVar2.f338093b = fArr[i10 + 3];
            int i11 = i10 + 5;
            aVar3.f338092a = fArr[i10 + 4];
            i10 += 6;
            aVar3.f338093b = fArr[i11];
            fC = (float) (((double) fC) + org.locationtech.jts.geom.j0.c(aVar, aVar2, aVar3));
        }
        return fC;
    }

    private static float c(WallsInfoWall[] wallsInfoWallArr) {
        if (wallsInfoWallArr != null && wallsInfoWallArr.length >= 2) {
            float[] fArrL = l(wallsInfoWallArr);
            Float fValueOf = null;
            try {
                if (!i(wallsInfoWallArr).A0()) {
                    fValueOf = Float.valueOf(d(wallsInfoWallArr, fArrL));
                }
            } catch (org.locationtech.jts.geom.i0 unused) {
            }
            if (fValueOf == null) {
                try {
                    fValueOf = Float.valueOf(e(wallsInfoWallArr, fArrL));
                } catch (org.locationtech.jts.geom.i0 unused2) {
                    fValueOf = Float.valueOf(b(fArrL));
                }
            }
            return fValueOf.floatValue() / 10000.0f;
        }
        return 0.0f;
    }

    private static float d(WallsInfoWall[] wallsInfoWallArr, float[] fArr) throws org.locationtech.jts.geom.i0 {
        LinkedList linkedList = new LinkedList();
        for (WallsInfoWall wallsInfoWall : wallsInfoWallArr) {
            if (!wallsInfoWall.getWall().isHidden()) {
                linkedList.add(h(wallsInfoWall));
            }
        }
        org.locationtech.jts.geom.r rVarE = com.planner5d.library.services.utility.y1.f229856a.e();
        return b(fArr) - ((float) wm.c.f(rVarE.e((org.locationtech.jts.geom.n[]) linkedList.toArray(new org.locationtech.jts.geom.e0[0]))).t0(wm.c.f(rVarE.e(j(fArr)))).X());
    }

    private static float e(WallsInfoWall[] wallsInfoWallArr, float[] fArr) {
        float fB = b(fArr);
        if (fB > 0.0f) {
            for (WallsInfoWall wallsInfoWall : wallsInfoWallArr) {
                if (!wallsInfoWall.getWall().isHidden()) {
                    fB -= f(j(fArr), wallsInfoWall);
                }
            }
        }
        return Math.max(0.0f, fB);
    }

    private static float f(org.locationtech.jts.geom.n[] nVarArr, WallsInfoWall wallsInfoWall) {
        org.locationtech.jts.geom.e0 e0VarH = h(wallsInfoWall);
        double dX = 0.0d;
        for (org.locationtech.jts.geom.n nVar : nVarArr) {
            if (e0VarH.A0()) {
                dX += e0VarH.t0(nVar).X();
            } else {
                wallsInfoWall.getMiddle();
            }
        }
        return (float) dX;
    }

    @androidx.annotation.p0
    public static com.planner5d.library.math.k g(WallsInfo wallsInfo) {
        if (wallsInfo != null && wallsInfo.get().length != 0) {
            try {
                org.locationtech.jts.geom.d0 d0VarA0 = i(wallsInfo.get()).a0();
                return new com.planner5d.library.math.k((float) d0VarA0.S0(), (float) d0VarA0.T0());
            } catch (org.locationtech.jts.geom.i0 unused) {
            }
        }
        return null;
    }

    private static org.locationtech.jts.geom.e0 h(WallsInfoWall wallsInfoWall) {
        org.locationtech.jts.geom.r rVarE = com.planner5d.library.services.utility.y1.f229856a.e();
        LinkedList linkedList = new LinkedList();
        for (com.planner5d.library.math.c cVar : wallsInfoWall.getStart()) {
            linkedList.add(com.planner5d.library.services.utility.y1.g(cVar.e()));
        }
        linkedList.add(com.planner5d.library.services.utility.y1.g(wallsInfoWall.getTop().e()));
        for (int length = wallsInfoWall.getEnd().length - 1; length >= 0; length--) {
            linkedList.add(com.planner5d.library.services.utility.y1.g(wallsInfoWall.getEnd()[length].c()));
        }
        linkedList.add(com.planner5d.library.services.utility.y1.g(wallsInfoWall.getBottom().c()));
        linkedList.add(com.planner5d.library.services.utility.y1.g(wallsInfoWall.getBottom().e()));
        return rVarE.C((org.locationtech.jts.geom.a[]) linkedList.toArray(new org.locationtech.jts.geom.a[0]));
    }

    private static org.locationtech.jts.geom.e0 i(WallsInfoWall[] wallsInfoWallArr) {
        if (wallsInfoWallArr.length == 0) {
            return com.planner5d.library.services.utility.y1.f229856a.e().y();
        }
        LinkedList linkedList = new LinkedList();
        for (WallsInfoWall wallsInfoWall : wallsInfoWallArr) {
            linkedList.add(com.planner5d.library.services.utility.y1.g(wallsInfoWall.getBottom().e()));
            linkedList.add(com.planner5d.library.services.utility.y1.g(wallsInfoWall.getBottom().c()));
        }
        linkedList.add(com.planner5d.library.services.utility.y1.g(wallsInfoWallArr[0].getBottom().e()));
        return com.planner5d.library.services.utility.y1.f229856a.e().C((org.locationtech.jts.geom.a[]) linkedList.toArray(new org.locationtech.jts.geom.a[0]));
    }

    private static org.locationtech.jts.geom.e0[] j(float[] fArr) {
        org.locationtech.jts.geom.r rVarE = com.planner5d.library.services.utility.y1.f229856a.e();
        LinkedList linkedList = new LinkedList();
        int i10 = 0;
        while (i10 < fArr.length) {
            org.locationtech.jts.geom.a aVar = new org.locationtech.jts.geom.a(fArr[i10 + 4], fArr[i10 + 5]);
            org.locationtech.jts.geom.a aVar2 = new org.locationtech.jts.geom.a(fArr[i10], fArr[i10 + 1]);
            org.locationtech.jts.geom.a aVar3 = new org.locationtech.jts.geom.a(fArr[i10 + 2], fArr[i10 + 3]);
            int i11 = i10 + 5;
            double d10 = fArr[i10 + 4];
            i10 += 6;
            org.locationtech.jts.geom.e0 e0VarC = rVarE.C(new org.locationtech.jts.geom.a[]{aVar, aVar2, aVar3, new org.locationtech.jts.geom.a(d10, fArr[i11])});
            if (e0VarC.X() > 0.0d) {
                linkedList.add(e0VarC);
            }
        }
        return (org.locationtech.jts.geom.e0[]) linkedList.toArray(new org.locationtech.jts.geom.e0[0]);
    }

    public static float[] k(com.planner5d.library.math.k[] kVarArr) {
        ArrayList arrayList = new ArrayList();
        com.planner5d.library.math.k kVar = null;
        for (com.planner5d.library.math.k kVar2 : kVarArr) {
            if (kVar == null || !kVar.equals(kVar2)) {
                arrayList.add(Float.valueOf(kVar2.f180480a));
                arrayList.add(Float.valueOf(kVar2.f180481b));
                kVar = kVar2;
            }
        }
        float[] fArrF = com.planner5d.library.services.utility.j3.f225291c.f(org.apache.commons.lang3.c.S4((Float[]) arrayList.toArray(new Float[0])), false);
        arrayList.clear();
        return fArrF;
    }

    private static float[] l(WallsInfoWall[] wallsInfoWallArr) {
        ArrayList arrayList = new ArrayList();
        for (WallsInfoWall wallsInfoWall : wallsInfoWallArr) {
            arrayList.add(wallsInfoWall.getBottom().e());
            arrayList.add(wallsInfoWall.getBottom().c());
        }
        return k((com.planner5d.library.math.k[]) arrayList.toArray(new com.planner5d.library.math.k[0]));
    }
}
