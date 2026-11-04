package com.airbnb.lottie.value;

import androidx.annotation.NonNull;

/* JADX INFO: loaded from: classes3.dex */
public class g extends j<Float> {
    public g() {
    }

    /* JADX WARN: Multi-variable type inference failed */
    public Float e(b<Float> bVar) {
        T t10 = this.f88898c;
        if (t10 != 0) {
            return (Float) t10;
        }
        throw new IllegalArgumentException("You must provide a static value in the constructor , call setValue, or override getValue.");
    }

    @Override // com.airbnb.lottie.value.j
    /* JADX INFO: renamed from: f, reason: merged with bridge method [inline-methods] */
    public Float a(b<Float> bVar) {
        return Float.valueOf(com.airbnb.lottie.utils.i.k(bVar.g().floatValue(), bVar.b().floatValue(), bVar.c()) + e(bVar).floatValue());
    }

    public g(@NonNull Float f10) {
        super(f10);
    }
}
