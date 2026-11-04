package org.locationtech.jts.index.strtree;

import java.io.Serializable;
import java.util.Comparator;

/* JADX INFO: loaded from: classes14.dex */
public class e implements Comparator<d>, Serializable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    boolean f338455a;

    public e(boolean z10) {
        this.f338455a = z10;
    }

    @Override // java.util.Comparator
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public int compare(d dVar, d dVar2) {
        double dP = dVar.p();
        double dP2 = dVar2.p();
        if (this.f338455a) {
            if (dP > dP2) {
                return 1;
            }
            return dP == dP2 ? 0 : -1;
        }
        if (dP > dP2) {
            return -1;
        }
        return dP == dP2 ? 0 : 1;
    }
}
