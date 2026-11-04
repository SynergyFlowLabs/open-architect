package org.locationtech.jts.operation.overlay.snap;

import org.locationtech.jts.geom.n;

/* JADX INFO: loaded from: classes14.dex */
public class c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private n[] f338838a;

    public c(n nVar, n nVar2) {
        this.f338838a = new n[]{nVar, nVar2};
    }

    public static n a(n nVar, n nVar2) {
        return d(nVar, nVar2, 3);
    }

    public static n c(n nVar, n nVar2) {
        return d(nVar, nVar2, 1);
    }

    public static n d(n nVar, n nVar2, int i10) {
        return new c(nVar, nVar2).b(i10);
    }

    public static n e(n nVar, n nVar2) {
        return d(nVar, nVar2, 4);
    }

    public static n f(n nVar, n nVar2) {
        return d(nVar, nVar2, 2);
    }

    /* JADX WARN: Code restructure failed: missing block: B:16:?, code lost:
    
        throw r1;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public org.locationtech.jts.geom.n b(int r7) {
        /*
            r6 = this;
            r0 = 1
            r5 = 5
            r1 = 0
            r2 = 0
            r5 = r2
            org.locationtech.jts.geom.n[] r3 = r6.f338838a     // Catch: java.lang.RuntimeException -> L13
            r5 = 4
            r4 = r3[r2]     // Catch: java.lang.RuntimeException -> L13
            r3 = r3[r0]     // Catch: java.lang.RuntimeException -> L13
            org.locationtech.jts.geom.n r3 = org.locationtech.jts.operation.overlay.g.w(r4, r3, r7)     // Catch: java.lang.RuntimeException -> L13
            r5 = 3
            r4 = r0
            goto L19
        L13:
            r3 = move-exception
            r4 = r3
            r3 = r1
            r1 = r4
            r5 = 7
            r4 = r2
        L19:
            if (r4 != 0) goto L28
            org.locationtech.jts.geom.n[] r6 = r6.f338838a     // Catch: java.lang.RuntimeException -> L27
            r2 = r6[r2]     // Catch: java.lang.RuntimeException -> L27
            r6 = r6[r0]     // Catch: java.lang.RuntimeException -> L27
            org.locationtech.jts.geom.n r3 = org.locationtech.jts.operation.overlay.snap.d.f(r2, r6, r7)     // Catch: java.lang.RuntimeException -> L27
            r5 = 6
            goto L28
        L27:
            throw r1
        L28:
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: org.locationtech.jts.operation.overlay.snap.c.b(int):org.locationtech.jts.geom.n");
    }
}
