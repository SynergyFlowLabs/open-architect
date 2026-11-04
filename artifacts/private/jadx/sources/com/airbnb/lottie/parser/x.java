package com.airbnb.lottie.parser;

import java.io.IOException;

/* JADX INFO: loaded from: classes3.dex */
class x {
    private x() {
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code duplicated, block: B:29:0x0075  */
    static com.airbnb.lottie.model.content.i a(com.airbnb.lottie.parser.moshi.c cVar, com.airbnb.lottie.k kVar) throws IOException {
        cVar.m1();
        com.airbnb.lottie.model.content.i.a aVar = null;
        com.airbnb.lottie.model.animatable.h hVarK = null;
        com.airbnb.lottie.model.animatable.d dVarH = null;
        boolean zNextBoolean = false;
        while (cVar.hasNext()) {
            String strNa = cVar.na();
            strNa.getClass();
            switch (strNa) {
                case "o":
                    dVarH = d.h(cVar, kVar);
                    break;
                case "pt":
                    hVarK = d.k(cVar, kVar);
                    break;
                case "inv":
                    zNextBoolean = cVar.nextBoolean();
                    break;
                case "mode":
                    String strJc = cVar.jc();
                    strJc.getClass();
                    switch (strJc) {
                        case "a":
                            aVar = com.airbnb.lottie.model.content.i.a.MASK_MODE_ADD;
                            break;
                        case "i":
                            kVar.a("Animation contains intersect masks. They are not supported but will be treated like add masks.");
                            aVar = com.airbnb.lottie.model.content.i.a.MASK_MODE_INTERSECT;
                            break;
                        case "n":
                            aVar = com.airbnb.lottie.model.content.i.a.MASK_MODE_NONE;
                            break;
                        case "s":
                            aVar = com.airbnb.lottie.model.content.i.a.MASK_MODE_SUBTRACT;
                            break;
                        default:
                            com.airbnb.lottie.utils.d.e("Unknown mask mode " + strNa + ". Defaulting to Add.");
                            aVar = com.airbnb.lottie.model.content.i.a.MASK_MODE_ADD;
                            break;
                    }
                    break;
                default:
                    cVar.a9();
                    break;
            }
        }
        cVar.F1();
        return new com.airbnb.lottie.model.content.i(aVar, hVarK, dVarH, zNextBoolean);
    }
}
