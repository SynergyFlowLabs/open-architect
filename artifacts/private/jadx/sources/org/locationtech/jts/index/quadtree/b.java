package org.locationtech.jts.index.quadtree;

/* JADX INFO: loaded from: classes14.dex */
public class b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final int f338427a = -50;

    public static boolean a(double d10, double d11) {
        double d12 = d11 - d10;
        return d12 == 0.0d || a.b(d12 / Math.max(Math.abs(d10), Math.abs(d11))) <= -50;
    }
}
