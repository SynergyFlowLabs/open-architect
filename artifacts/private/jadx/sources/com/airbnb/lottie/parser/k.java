package com.airbnb.lottie.parser;

import androidx.annotation.p0;
import java.io.IOException;

/* JADX INFO: loaded from: classes3.dex */
public class k {

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private static final com.airbnb.lottie.parser.moshi.c.a f88675f = com.airbnb.lottie.parser.moshi.c.a.a("ef");

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private static final com.airbnb.lottie.parser.moshi.c.a f88676g = com.airbnb.lottie.parser.moshi.c.a.a("nm", "v");

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private com.airbnb.lottie.model.animatable.a f88677a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private com.airbnb.lottie.model.animatable.b f88678b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private com.airbnb.lottie.model.animatable.b f88679c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private com.airbnb.lottie.model.animatable.b f88680d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private com.airbnb.lottie.model.animatable.b f88681e;

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code duplicated, block: B:12:0x0032  */
    private void a(com.airbnb.lottie.parser.moshi.c cVar, com.airbnb.lottie.k kVar) throws IOException {
        cVar.m1();
        String strJc = "";
        while (cVar.hasNext()) {
            int iE = cVar.e(f88676g);
            if (iE != 0) {
                if (iE == 1) {
                    strJc.getClass();
                    switch (strJc) {
                        case "Distance":
                            this.f88680d = d.e(cVar, kVar);
                            break;
                        case "Opacity":
                            this.f88678b = d.f(cVar, kVar, false);
                            break;
                        case "Direction":
                            this.f88679c = d.f(cVar, kVar, false);
                            break;
                        case "Shadow Color":
                            this.f88677a = d.c(cVar, kVar);
                            break;
                        case "Softness":
                            this.f88681e = d.e(cVar, kVar);
                            break;
                        default:
                            cVar.a9();
                            break;
                    }
                } else {
                    cVar.f();
                    cVar.a9();
                }
            } else {
                strJc = cVar.jc();
            }
        }
        cVar.F1();
    }

    @p0
    j b(com.airbnb.lottie.parser.moshi.c cVar, com.airbnb.lottie.k kVar) throws IOException {
        com.airbnb.lottie.model.animatable.b bVar;
        com.airbnb.lottie.model.animatable.b bVar2;
        com.airbnb.lottie.model.animatable.b bVar3;
        com.airbnb.lottie.model.animatable.b bVar4;
        while (cVar.hasNext()) {
            if (cVar.e(f88675f) != 0) {
                cVar.f();
                cVar.a9();
            } else {
                cVar.J0();
                while (cVar.hasNext()) {
                    a(cVar, kVar);
                }
                cVar.F0();
            }
        }
        com.airbnb.lottie.model.animatable.a aVar = this.f88677a;
        if (aVar == null || (bVar = this.f88678b) == null || (bVar2 = this.f88679c) == null || (bVar3 = this.f88680d) == null || (bVar4 = this.f88681e) == null) {
            return null;
        }
        return new j(aVar, bVar, bVar2, bVar3, bVar4);
    }
}
