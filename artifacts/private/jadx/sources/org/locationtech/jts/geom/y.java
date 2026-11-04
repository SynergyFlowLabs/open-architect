package org.locationtech.jts.geom;

/* JADX INFO: loaded from: classes14.dex */
public class y {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final int f338258a = 0;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final int f338259b = 1;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final int f338260c = 2;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final int f338261d = -1;

    public static char a(int i10) {
        if (i10 == -1) {
            return org.apache.commons.codec.language.l.f335457d;
        }
        if (i10 == 0) {
            return 'i';
        }
        if (i10 == 1) {
            return 'b';
        }
        if (i10 == 2) {
            return 'e';
        }
        throw new IllegalArgumentException("Unknown location value: " + i10);
    }
}
