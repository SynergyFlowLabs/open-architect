package com.airbnb.lottie.parser;

import java.io.IOException;

/* JADX INFO: loaded from: classes3.dex */
public class r implements n0<Integer> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final r f88791a = new r();

    private r() {
    }

    @Override // com.airbnb.lottie.parser.n0
    /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
    public Integer a(com.airbnb.lottie.parser.moshi.c cVar, float f10) throws IOException {
        return Integer.valueOf(Math.round(s.g(cVar) * f10));
    }
}
