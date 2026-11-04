package com.google.zxing.common.reedsolomon;

import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes5.dex */
public final class d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final a f130371a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final List<b> f130372b;

    public d(a aVar) {
        this.f130371a = aVar;
        ArrayList arrayList = new ArrayList();
        this.f130372b = arrayList;
        arrayList.add(new b(aVar, new int[]{1}));
    }

    private b a(int i10) {
        if (i10 >= this.f130372b.size()) {
            List<b> list = this.f130372b;
            b bVarI = list.get(list.size() - 1);
            for (int size = this.f130372b.size(); size <= i10; size++) {
                a aVar = this.f130371a;
                bVarI = bVarI.i(new b(aVar, new int[]{1, aVar.c((size - 1) + aVar.d())}));
                this.f130372b.add(bVarI);
            }
        }
        return this.f130372b.get(i10);
    }

    public void b(int[] iArr, int i10) {
        if (i10 == 0) {
            throw new IllegalArgumentException("No error correction bytes");
        }
        int length = iArr.length - i10;
        if (length <= 0) {
            throw new IllegalArgumentException("No data bytes provided");
        }
        b bVarA = a(i10);
        int[] iArr2 = new int[length];
        System.arraycopy(iArr, 0, iArr2, 0, length);
        int[] iArrE = new b(this.f130371a, iArr2).j(i10, 1).b(bVarA)[1].e();
        int length2 = i10 - iArrE.length;
        for (int i11 = 0; i11 < length2; i11++) {
            iArr[length + i11] = 0;
        }
        System.arraycopy(iArrE, 0, iArr, length + length2, iArrE.length);
    }
}
