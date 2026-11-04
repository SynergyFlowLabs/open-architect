package com.airbnb.lottie.model.layer;

import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.RectF;
import androidx.annotation.NonNull;
import androidx.annotation.p0;
import com.airbnb.lottie.k;
import com.airbnb.lottie.model.content.q;
import com.airbnb.lottie.w0;
import java.util.Collections;
import java.util.List;

/* JADX INFO: loaded from: classes3.dex */
public class g extends b {
    private final com.airbnb.lottie.animation.content.d H;
    private final c I;

    g(w0 w0Var, e eVar, c cVar, k kVar) {
        super(w0Var, eVar);
        this.I = cVar;
        com.airbnb.lottie.animation.content.d dVar = new com.airbnb.lottie.animation.content.d(w0Var, this, new q("__container", eVar.o(), false), kVar);
        this.H = dVar;
        List<com.airbnb.lottie.animation.content.c> list = Collections.EMPTY_LIST;
        dVar.e(list, list);
    }

    @Override // com.airbnb.lottie.model.layer.b
    protected void H(com.airbnb.lottie.model.e eVar, int i10, List<com.airbnb.lottie.model.e> list, com.airbnb.lottie.model.e eVar2) {
        this.H.h(eVar, i10, list, eVar2);
    }

    @Override // com.airbnb.lottie.model.layer.b, com.airbnb.lottie.animation.content.e
    public void a(RectF rectF, Matrix matrix, boolean z10) {
        super.a(rectF, matrix, z10);
        this.H.a(rectF, this.f88561o, z10);
    }

    @Override // com.airbnb.lottie.model.layer.b
    void t(@NonNull Canvas canvas, Matrix matrix, int i10) {
        this.H.c(canvas, matrix, i10);
    }

    @Override // com.airbnb.lottie.model.layer.b
    @p0
    public com.airbnb.lottie.model.content.a w() {
        com.airbnb.lottie.model.content.a aVarW = super.w();
        return aVarW != null ? aVarW : this.I.w();
    }

    @Override // com.airbnb.lottie.model.layer.b
    @p0
    public com.airbnb.lottie.parser.j y() {
        com.airbnb.lottie.parser.j jVarY = super.y();
        return jVarY != null ? jVarY : this.I.y();
    }
}
