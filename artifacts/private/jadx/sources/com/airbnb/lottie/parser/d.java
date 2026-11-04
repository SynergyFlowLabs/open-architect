package com.airbnb.lottie.parser;

import java.io.IOException;
import java.util.List;

/* JADX INFO: loaded from: classes3.dex */
public class d {
    private d() {
    }

    private static <T> List<com.airbnb.lottie.value.a<T>> a(com.airbnb.lottie.parser.moshi.c cVar, float f10, com.airbnb.lottie.k kVar, n0<T> n0Var) throws IOException {
        return u.a(cVar, kVar, f10, n0Var, false);
    }

    private static <T> List<com.airbnb.lottie.value.a<T>> b(com.airbnb.lottie.parser.moshi.c cVar, com.airbnb.lottie.k kVar, n0<T> n0Var) throws IOException {
        return u.a(cVar, kVar, 1.0f, n0Var, false);
    }

    static com.airbnb.lottie.model.animatable.a c(com.airbnb.lottie.parser.moshi.c cVar, com.airbnb.lottie.k kVar) throws IOException {
        return new com.airbnb.lottie.model.animatable.a(b(cVar, kVar, g.f88661a));
    }

    static com.airbnb.lottie.model.animatable.j d(com.airbnb.lottie.parser.moshi.c cVar, com.airbnb.lottie.k kVar) throws IOException {
        return new com.airbnb.lottie.model.animatable.j(a(cVar, com.airbnb.lottie.utils.j.e(), kVar, i.f88666a));
    }

    public static com.airbnb.lottie.model.animatable.b e(com.airbnb.lottie.parser.moshi.c cVar, com.airbnb.lottie.k kVar) throws IOException {
        return f(cVar, kVar, true);
    }

    public static com.airbnb.lottie.model.animatable.b f(com.airbnb.lottie.parser.moshi.c cVar, com.airbnb.lottie.k kVar, boolean z10) throws IOException {
        return new com.airbnb.lottie.model.animatable.b(a(cVar, z10 ? com.airbnb.lottie.utils.j.e() : 1.0f, kVar, l.f88683a));
    }

    static com.airbnb.lottie.model.animatable.c g(com.airbnb.lottie.parser.moshi.c cVar, com.airbnb.lottie.k kVar, int i10) throws IOException {
        return new com.airbnb.lottie.model.animatable.c(b(cVar, kVar, new o(i10)));
    }

    static com.airbnb.lottie.model.animatable.d h(com.airbnb.lottie.parser.moshi.c cVar, com.airbnb.lottie.k kVar) throws IOException {
        return new com.airbnb.lottie.model.animatable.d(b(cVar, kVar, r.f88791a));
    }

    static com.airbnb.lottie.model.animatable.f i(com.airbnb.lottie.parser.moshi.c cVar, com.airbnb.lottie.k kVar) throws IOException {
        return new com.airbnb.lottie.model.animatable.f(u.a(cVar, kVar, com.airbnb.lottie.utils.j.e(), b0.f88651a, true));
    }

    static com.airbnb.lottie.model.animatable.g j(com.airbnb.lottie.parser.moshi.c cVar, com.airbnb.lottie.k kVar) throws IOException {
        return new com.airbnb.lottie.model.animatable.g((List<com.airbnb.lottie.value.a<com.airbnb.lottie.value.k>>) b(cVar, kVar, g0.f88662a));
    }

    static com.airbnb.lottie.model.animatable.h k(com.airbnb.lottie.parser.moshi.c cVar, com.airbnb.lottie.k kVar) throws IOException {
        return new com.airbnb.lottie.model.animatable.h(a(cVar, com.airbnb.lottie.utils.j.e(), kVar, h0.f88664a));
    }
}
