package com.google.zxing.multi.qrcode.detector;

import com.google.zxing.common.g;
import com.google.zxing.e;
import com.google.zxing.m;
import com.google.zxing.q;
import com.google.zxing.qrcode.detector.c;
import com.google.zxing.qrcode.detector.f;
import com.google.zxing.u;
import java.util.ArrayList;
import java.util.Map;

/* JADX INFO: loaded from: classes5.dex */
public final class a extends c {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static final g[] f130524c = new g[0];

    public a(com.google.zxing.common.b bVar) {
        super(bVar);
    }

    public g[] n(Map<e, ?> map) throws m {
        f[] fVarArrR = new b(h(), map == null ? null : (u) map.get(e.NEED_RESULT_POINT_CALLBACK)).r(map);
        if (fVarArrR.length == 0) {
            throw m.a();
        }
        ArrayList arrayList = new ArrayList();
        for (f fVar : fVarArrR) {
            try {
                arrayList.add(j(fVar));
            } catch (q unused) {
            }
        }
        return arrayList.isEmpty() ? f130524c : (g[]) arrayList.toArray(new g[arrayList.size()]);
    }
}
