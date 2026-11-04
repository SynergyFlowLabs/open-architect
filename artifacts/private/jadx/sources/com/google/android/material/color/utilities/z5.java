package com.google.android.material.color.utilities;

import java.util.Iterator;
import java.util.Map;
import java.util.Set;

/* JADX INFO: loaded from: classes4.dex */
@androidx.annotation.b1({androidx.annotation.b1.a.LIBRARY_GROUP})
public final class z5 {
    private z5() {
    }

    public static Map<Integer, Integer> a(int[] iArr, int i10) {
        Set<Integer> setKeySet = new d6().a(iArr, i10).f112101a.keySet();
        int[] iArr2 = new int[setKeySet.size()];
        Iterator<Integer> it = setKeySet.iterator();
        int i11 = 0;
        while (it.hasNext()) {
            iArr2[i11] = it.next().intValue();
            i11++;
        }
        return c6.a(iArr, iArr2, i10);
    }
}
