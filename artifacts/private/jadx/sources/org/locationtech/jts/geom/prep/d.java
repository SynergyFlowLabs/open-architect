package org.locationtech.jts.geom.prep;

import org.locationtech.jts.geom.f0;
import org.locationtech.jts.geom.h0;
import org.locationtech.jts.geom.n;
import org.locationtech.jts.geom.w;

/* JADX INFO: loaded from: classes14.dex */
public class d {
    public static c b(n nVar) {
        return new d().a(nVar);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public c a(n nVar) {
        if (nVar instanceof f0) {
            return new h((f0) nVar);
        }
        if (nVar instanceof w) {
            return new e((w) nVar);
        }
        return nVar instanceof h0 ? new g((h0) nVar) : new b(nVar);
    }
}
