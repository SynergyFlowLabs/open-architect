package io.grpc.util;

import io.grpc.internal.e3;
import io.grpc.internal.h1;
import io.grpc.internal.n3;
import io.grpc.o1;
import io.grpc.p1;
import io.grpc.q1;
import io.grpc.t0;
import io.grpc.x1;
import io.grpc.y2;
import java.util.List;
import java.util.Map;

/* JADX INFO: loaded from: classes13.dex */
@t0
public final class m extends p1 {
    private x1.c f(Map<String, ?> map) {
        Long lN = h1.n(map, "interval");
        Long lN2 = h1.n(map, "baseEjectionTime");
        Long lN3 = h1.n(map, "maxEjectionTime");
        Integer numJ = h1.j(map, "maxEjectionPercentage");
        l.g.a aVar = new l.g.a();
        if (lN != null) {
            aVar.e(lN);
        }
        if (lN2 != null) {
            aVar.b(lN2);
        }
        if (lN3 != null) {
            aVar.g(lN3);
        }
        if (numJ != null) {
            aVar.f(numJ);
        }
        Map<String, ?> mapL = h1.l(map, "successRateEjection");
        if (mapL != null) {
            l.g.c.a aVar2 = new l.g.c.a();
            Integer numJ2 = h1.j(mapL, "stdevFactor");
            Integer numJ3 = h1.j(mapL, "enforcementPercentage");
            Integer numJ4 = h1.j(mapL, "minimumHosts");
            Integer numJ5 = h1.j(mapL, "requestVolume");
            if (numJ2 != null) {
                aVar2.e(numJ2);
            }
            if (numJ3 != null) {
                aVar2.b(numJ3);
            }
            if (numJ4 != null) {
                aVar2.c(numJ4);
            }
            if (numJ5 != null) {
                aVar2.d(numJ5);
            }
            aVar.h(aVar2.a());
        }
        Map<String, ?> mapL2 = h1.l(map, "failurePercentageEjection");
        if (mapL2 != null) {
            l.g.b.a aVar3 = new l.g.b.a();
            Integer numJ6 = h1.j(mapL2, "threshold");
            Integer numJ7 = h1.j(mapL2, "enforcementPercentage");
            Integer numJ8 = h1.j(mapL2, "minimumHosts");
            Integer numJ9 = h1.j(mapL2, "requestVolume");
            if (numJ6 != null) {
                aVar3.e(numJ6);
            }
            if (numJ7 != null) {
                aVar3.b(numJ7);
            }
            if (numJ8 != null) {
                aVar3.c(numJ8);
            }
            if (numJ9 != null) {
                aVar3.d(numJ9);
            }
            aVar.d(aVar3.a());
        }
        List<e3.a> listB = e3.B(h1.f(map, "childPolicy"));
        if (listB == null || listB.isEmpty()) {
            return x1.c.b(y2.f291464s.u("No child policy in outlier_detection_experimental LB policy: " + map));
        }
        x1.c cVarZ = e3.z(listB, q1.c());
        if (cVarZ.d() != null) {
            return cVarZ;
        }
        aVar.c((e3.b) cVarZ.c());
        return x1.c.a(aVar.a());
    }

    @Override // io.grpc.o1.d
    public o1 a(o1.f fVar) {
        return new l(fVar, n3.f289633a);
    }

    @Override // io.grpc.p1
    public String b() {
        return "outlier_detection_experimental";
    }

    @Override // io.grpc.p1
    public int c() {
        return 5;
    }

    @Override // io.grpc.p1
    public boolean d() {
        return true;
    }

    @Override // io.grpc.p1
    public x1.c e(Map<String, ?> map) {
        try {
            return f(map);
        } catch (RuntimeException e10) {
            return x1.c.b(y2.f291465t.t(e10).u("Failed parsing configuration for " + b()));
        }
    }
}
