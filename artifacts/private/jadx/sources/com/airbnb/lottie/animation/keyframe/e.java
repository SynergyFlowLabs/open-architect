package com.airbnb.lottie.animation.keyframe;

import java.util.List;

/* JADX INFO: loaded from: classes3.dex */
public class e extends g<com.airbnb.lottie.model.content.d> {

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private final com.airbnb.lottie.model.content.d f88105i;

    public e(List<com.airbnb.lottie.value.a<com.airbnb.lottie.model.content.d>> list) {
        super(list);
        int iMax = 0;
        for (int i10 = 0; i10 < list.size(); i10++) {
            com.airbnb.lottie.model.content.d dVar = list.get(i10).f88869b;
            if (dVar != null) {
                iMax = Math.max(iMax, dVar.f());
            }
        }
        this.f88105i = new com.airbnb.lottie.model.content.d(new float[iMax], new int[iMax]);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // com.airbnb.lottie.animation.keyframe.a
    /* JADX INFO: renamed from: q, reason: merged with bridge method [inline-methods] */
    public com.airbnb.lottie.model.content.d i(com.airbnb.lottie.value.a<com.airbnb.lottie.model.content.d> aVar, float f10) {
        this.f88105i.g(aVar.f88869b, aVar.f88870c, f10);
        return this.f88105i;
    }
}
