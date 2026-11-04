package com.google.zxing.oned.rss.expanded;

import java.util.List;

/* JADX INFO: loaded from: classes5.dex */
final class a {
    private a() {
    }

    static com.google.zxing.common.a a(List<b> list) {
        int size = list.size() << 1;
        int i10 = size - 1;
        if (list.get(list.size() - 1).d() == null) {
            i10 = size - 2;
        }
        com.google.zxing.common.a aVar = new com.google.zxing.common.a(i10 * 12);
        int i11 = 0;
        int iB = list.get(0).d().b();
        for (int i12 = 11; i12 >= 0; i12--) {
            if (((1 << i12) & iB) != 0) {
                aVar.r(i11);
            }
            i11++;
        }
        for (int i13 = 1; i13 < list.size(); i13++) {
            b bVar = list.get(i13);
            int iB2 = bVar.c().b();
            for (int i14 = 11; i14 >= 0; i14--) {
                if (((1 << i14) & iB2) != 0) {
                    aVar.r(i11);
                }
                i11++;
            }
            if (bVar.d() != null) {
                int iB3 = bVar.d().b();
                for (int i15 = 11; i15 >= 0; i15--) {
                    if (((1 << i15) & iB3) != 0) {
                        aVar.r(i11);
                    }
                    i11++;
                }
            }
        }
        return aVar;
    }
}
