package org.locationtech.jts.operation.linemerge;

/* JADX INFO: loaded from: classes14.dex */
public class b extends org.locationtech.jts.planargraph.a {
    public b(org.locationtech.jts.planargraph.e eVar, org.locationtech.jts.planargraph.e eVar2, org.locationtech.jts.geom.a aVar, boolean z10) {
        super(eVar, eVar2, aVar, z10);
    }

    public b W() {
        if (O().D() != 2) {
            return null;
        }
        if (O().I().d().get(0) == N()) {
            return (b) O().I().d().get(1);
        }
        org.locationtech.jts.util.a.c(O().I().d().get(1) == N());
        return (b) O().I().d().get(0);
    }
}
