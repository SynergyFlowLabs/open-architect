package com.google.zxing.pdf417.decoder;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

/* JADX INFO: loaded from: classes5.dex */
final class b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final Map<Integer, Integer> f130749a = new HashMap();

    b() {
    }

    Integer a(int i10) {
        return this.f130749a.get(Integer.valueOf(i10));
    }

    int[] b() {
        ArrayList arrayList = new ArrayList();
        int iIntValue = -1;
        for (Map.Entry<Integer, Integer> entry : this.f130749a.entrySet()) {
            if (entry.getValue().intValue() > iIntValue) {
                iIntValue = entry.getValue().intValue();
                arrayList.clear();
                arrayList.add(entry.getKey());
            } else if (entry.getValue().intValue() == iIntValue) {
                arrayList.add(entry.getKey());
            }
        }
        return aa.a.c(arrayList);
    }

    void c(int i10) {
        Integer num = this.f130749a.get(Integer.valueOf(i10));
        if (num == null) {
            num = 0;
        }
        this.f130749a.put(Integer.valueOf(i10), Integer.valueOf(num.intValue() + 1));
    }
}
