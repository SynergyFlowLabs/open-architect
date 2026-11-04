package com.airbnb.lottie.animation.keyframe;

import android.graphics.Color;
import android.graphics.Paint;
import androidx.annotation.p0;

/* JADX INFO: loaded from: classes3.dex */
public class c implements com.airbnb.lottie.animation.keyframe.a.b {

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private static final double f88095h = 0.017453292519943295d;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final com.airbnb.lottie.animation.keyframe.a.b f88096a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final com.airbnb.lottie.animation.keyframe.a<Integer, Integer> f88097b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final com.airbnb.lottie.animation.keyframe.a<Float, Float> f88098c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final com.airbnb.lottie.animation.keyframe.a<Float, Float> f88099d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final com.airbnb.lottie.animation.keyframe.a<Float, Float> f88100e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final com.airbnb.lottie.animation.keyframe.a<Float, Float> f88101f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private boolean f88102g = true;

    class a extends com.airbnb.lottie.value.j<Float> {

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        final /* synthetic */ com.airbnb.lottie.value.j f88103d;

        a(com.airbnb.lottie.value.j jVar) {
            this.f88103d = jVar;
        }

        @Override // com.airbnb.lottie.value.j
        @p0
        /* JADX INFO: renamed from: e, reason: merged with bridge method [inline-methods] */
        public Float a(com.airbnb.lottie.value.b<Float> bVar) {
            Float f10 = (Float) this.f88103d.a(bVar);
            if (f10 == null) {
                return null;
            }
            return Float.valueOf(f10.floatValue() * 2.55f);
        }
    }

    public c(com.airbnb.lottie.animation.keyframe.a.b bVar, com.airbnb.lottie.model.layer.b bVar2, com.airbnb.lottie.parser.j jVar) {
        this.f88096a = bVar;
        com.airbnb.lottie.animation.keyframe.a<Integer, Integer> aVarA = jVar.a().a();
        this.f88097b = aVarA;
        aVarA.a(this);
        bVar2.i(aVarA);
        com.airbnb.lottie.animation.keyframe.a<Float, Float> aVarA2 = jVar.d().a();
        this.f88098c = aVarA2;
        aVarA2.a(this);
        bVar2.i(aVarA2);
        com.airbnb.lottie.animation.keyframe.a<Float, Float> aVarA3 = jVar.b().a();
        this.f88099d = aVarA3;
        aVarA3.a(this);
        bVar2.i(aVarA3);
        com.airbnb.lottie.animation.keyframe.a<Float, Float> aVarA4 = jVar.c().a();
        this.f88100e = aVarA4;
        aVarA4.a(this);
        bVar2.i(aVarA4);
        com.airbnb.lottie.animation.keyframe.a<Float, Float> aVarA5 = jVar.e().a();
        this.f88101f = aVarA5;
        aVarA5.a(this);
        bVar2.i(aVarA5);
    }

    public void a(Paint paint) {
        if (this.f88102g) {
            this.f88102g = false;
            double dFloatValue = ((double) this.f88099d.h().floatValue()) * f88095h;
            float fFloatValue = this.f88100e.h().floatValue();
            float fSin = ((float) Math.sin(dFloatValue)) * fFloatValue;
            float fCos = ((float) Math.cos(dFloatValue + 3.141592653589793d)) * fFloatValue;
            int iIntValue = this.f88097b.h().intValue();
            paint.setShadowLayer(this.f88101f.h().floatValue(), fSin, fCos, Color.argb(Math.round(this.f88098c.h().floatValue()), Color.red(iIntValue), Color.green(iIntValue), Color.blue(iIntValue)));
        }
    }

    public void b(@p0 com.airbnb.lottie.value.j<Integer> jVar) {
        this.f88097b.o(jVar);
    }

    public void c(@p0 com.airbnb.lottie.value.j<Float> jVar) {
        this.f88099d.o(jVar);
    }

    @Override // com.airbnb.lottie.animation.keyframe.a.b
    public void d() {
        this.f88102g = true;
        this.f88096a.d();
    }

    public void e(@p0 com.airbnb.lottie.value.j<Float> jVar) {
        this.f88100e.o(jVar);
    }

    public void f(@p0 com.airbnb.lottie.value.j<Float> jVar) {
        if (jVar == null) {
            this.f88098c.o(null);
        } else {
            this.f88098c.o(new a(jVar));
        }
    }

    public void g(@p0 com.airbnb.lottie.value.j<Float> jVar) {
        this.f88101f.o(jVar);
    }
}
