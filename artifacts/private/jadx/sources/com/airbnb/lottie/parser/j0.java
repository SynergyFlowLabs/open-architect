package com.airbnb.lottie.parser;

import com.devtodev.core.data.metrics.MetricConsts;
import java.io.IOException;
import java.util.ArrayList;

/* JADX INFO: loaded from: classes3.dex */
class j0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final com.airbnb.lottie.parser.moshi.c.a f88674a = com.airbnb.lottie.parser.moshi.c.a.a("nm", "hd", MetricConsts.Install);

    private j0() {
    }

    static com.airbnb.lottie.model.content.q a(com.airbnb.lottie.parser.moshi.c cVar, com.airbnb.lottie.k kVar) throws IOException {
        ArrayList arrayList = new ArrayList();
        String strJc = null;
        boolean zNextBoolean = false;
        while (cVar.hasNext()) {
            int iE = cVar.e(f88674a);
            if (iE == 0) {
                strJc = cVar.jc();
            } else if (iE == 1) {
                zNextBoolean = cVar.nextBoolean();
            } else if (iE != 2) {
                cVar.a9();
            } else {
                cVar.J0();
                while (cVar.hasNext()) {
                    com.airbnb.lottie.model.content.c cVarA = h.a(cVar, kVar);
                    if (cVarA != null) {
                        arrayList.add(cVarA);
                    }
                }
                cVar.F0();
            }
        }
        return new com.airbnb.lottie.model.content.q(strJc, arrayList, zNextBoolean);
    }
}
