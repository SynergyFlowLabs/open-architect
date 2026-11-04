package com.google.vr.sdk.deps;

import java.util.Comparator;

/* JADX INFO: loaded from: classes5.dex */
final class m2 implements Comparator<k2> {
    m2() {
    }

    @Override // java.util.Comparator
    public final /* synthetic */ int compare(k2 k2Var, k2 k2Var2) {
        k2 k2Var3 = k2Var;
        k2 k2Var4 = k2Var2;
        q2 it = k2Var3.iterator();
        q2 it2 = k2Var4.iterator();
        while (it.hasNext() && it2.hasNext()) {
            int iCompare = Integer.compare(k2.w(it.y()), k2.w(it2.y()));
            if (iCompare != 0) {
                return iCompare;
            }
        }
        return Integer.compare(k2Var3.v(), k2Var4.v());
    }
}
