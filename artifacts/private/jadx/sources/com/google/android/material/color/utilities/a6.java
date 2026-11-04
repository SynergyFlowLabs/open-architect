package com.google.android.material.color.utilities;

import java.util.LinkedHashMap;
import java.util.Map;

/* JADX INFO: loaded from: classes4.dex */
@androidx.annotation.b1({androidx.annotation.b1.a.LIBRARY_GROUP})
public final class a6 implements y5 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    Map<Integer, Integer> f112088a;

    @Override // com.google.android.material.color.utilities.y5
    public b6 a(int[] iArr, int i10) {
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        for (int i11 : iArr) {
            Integer num = (Integer) linkedHashMap.get(Integer.valueOf(i11));
            int iIntValue = 1;
            if (num != null) {
                iIntValue = 1 + num.intValue();
            }
            linkedHashMap.put(Integer.valueOf(i11), Integer.valueOf(iIntValue));
        }
        this.f112088a = linkedHashMap;
        return new b6(linkedHashMap);
    }

    public Map<Integer, Integer> b() {
        return this.f112088a;
    }
}
