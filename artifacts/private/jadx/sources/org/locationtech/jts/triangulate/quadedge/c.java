package org.locationtech.jts.triangulate.quadedge;

import org.locationtech.jts.geom.u;

/* JADX INFO: loaded from: classes14.dex */
public class c extends RuntimeException {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private u f339088a;

    public c(String str) {
        super(str);
        this.f339088a = null;
    }

    private static String b(String str, u uVar) {
        if (uVar == null) {
            return str;
        }
        return str + " [ " + uVar + " ]";
    }

    public u a() {
        return this.f339088a;
    }

    public c(String str, u uVar) {
        super(b(str, uVar));
        boolean z10 = true;
        this.f339088a = null;
        this.f339088a = new u(uVar);
    }

    public c(u uVar) {
        super("Locate failed to converge (at edge: " + uVar + ").  Possible causes include invalid Subdivision topology or very close sites");
        this.f339088a = null;
        this.f339088a = new u(uVar);
    }
}
