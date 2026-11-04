package org.locationtech.jts.algorithm;

/* JADX INFO: loaded from: classes14.dex */
public class s {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final int f338051a = -1;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final int f338052b = -1;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final int f338053c = 1;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final int f338054d = 1;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final int f338055e = 0;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final int f338056f = 0;

    public static int a(org.locationtech.jts.geom.a aVar, org.locationtech.jts.geom.a aVar2, org.locationtech.jts.geom.a aVar3) {
        return f.b(aVar, aVar2, aVar3);
    }

    public static boolean b(org.locationtech.jts.geom.a[] aVarArr) {
        int length = aVarArr.length - 1;
        if (length < 3) {
            throw new IllegalArgumentException("Ring has fewer than 4 points, so orientation cannot be determined");
        }
        org.locationtech.jts.geom.a aVar = aVarArr[0];
        int i10 = 0;
        for (int i11 = 1; i11 <= length; i11++) {
            org.locationtech.jts.geom.a aVar2 = aVarArr[i11];
            if (aVar2.f338093b > aVar.f338093b) {
                i10 = i11;
                aVar = aVar2;
            }
        }
        int i12 = i10;
        do {
            i12--;
            if (i12 < 0) {
                i12 = length;
            }
            if (!aVarArr[i12].p(aVar)) {
                break;
            }
        } while (i12 != i10);
        int i13 = i10;
        do {
            i13 = (i13 + 1) % length;
            if (!aVarArr[i13].p(aVar)) {
                break;
            }
        } while (i13 != i10);
        org.locationtech.jts.geom.a aVar3 = aVarArr[i12];
        org.locationtech.jts.geom.a aVar4 = aVarArr[i13];
        if (!aVar3.p(aVar) && !aVar4.p(aVar) && !aVar3.p(aVar4)) {
            int iA = a(aVar3, aVar, aVar4);
            if (iA == 0) {
                return aVar3.f338092a > aVar4.f338092a;
            }
            if (iA > 0) {
                return true;
            }
        }
        return false;
    }
}
