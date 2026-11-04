package com.airbnb.lottie.model.layer;

import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.ColorFilter;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.RectF;
import androidx.annotation.p0;
import com.airbnb.lottie.animation.keyframe.q;
import com.airbnb.lottie.b1;
import com.airbnb.lottie.w0;

/* JADX INFO: loaded from: classes3.dex */
public class h extends b {
    private final RectF H;
    private final Paint I;
    private final float[] J;
    private final Path K;
    private final e L;

    @p0
    private com.airbnb.lottie.animation.keyframe.a<ColorFilter, ColorFilter> M;

    @p0
    private com.airbnb.lottie.animation.keyframe.a<Integer, Integer> N;

    h(w0 w0Var, e eVar) {
        super(w0Var, eVar);
        this.H = new RectF();
        com.airbnb.lottie.animation.a aVar = new com.airbnb.lottie.animation.a();
        this.I = aVar;
        this.J = new float[8];
        this.K = new Path();
        this.L = eVar;
        aVar.setAlpha(0);
        aVar.setStyle(Paint.Style.FILL);
        aVar.setColor(eVar.p());
    }

    @Override // com.airbnb.lottie.model.layer.b, com.airbnb.lottie.animation.content.e
    public void a(RectF rectF, Matrix matrix, boolean z10) {
        super.a(rectF, matrix, z10);
        this.H.set(0.0f, 0.0f, this.L.r(), this.L.q());
        this.f88561o.mapRect(this.H);
        rectF.set(this.H);
    }

    @Override // com.airbnb.lottie.model.layer.b, com.airbnb.lottie.model.f
    public <T> void g(T t10, @p0 com.airbnb.lottie.value.j<T> jVar) {
        super.g(t10, jVar);
        if (t10 == b1.K) {
            if (jVar == null) {
                this.M = null;
                return;
            } else {
                this.M = new q(jVar);
                return;
            }
        }
        if (t10 == b1.f88151a) {
            if (jVar != null) {
                this.N = new q(jVar);
            } else {
                this.N = null;
                this.I.setColor(this.L.p());
            }
        }
    }

    @Override // com.airbnb.lottie.model.layer.b
    public void t(Canvas canvas, Matrix matrix, int i10) {
        int iAlpha = Color.alpha(this.L.p());
        if (iAlpha == 0) {
            return;
        }
        com.airbnb.lottie.animation.keyframe.a<Integer, Integer> aVar = this.N;
        Integer numH = aVar == null ? null : aVar.h();
        if (numH != null) {
            this.I.setColor(numH.intValue());
        } else {
            this.I.setColor(this.L.p());
        }
        int iIntValue = (int) ((i10 / 255.0f) * (((iAlpha / 255.0f) * (this.f88570x.h() == null ? 100 : this.f88570x.h().h().intValue())) / 100.0f) * 255.0f);
        this.I.setAlpha(iIntValue);
        com.airbnb.lottie.animation.keyframe.a<ColorFilter, ColorFilter> aVar2 = this.M;
        if (aVar2 != null) {
            this.I.setColorFilter(aVar2.h());
        }
        if (iIntValue > 0) {
            float[] fArr = this.J;
            fArr[0] = 0.0f;
            fArr[1] = 0.0f;
            fArr[2] = this.L.r();
            float[] fArr2 = this.J;
            fArr2[3] = 0.0f;
            fArr2[4] = this.L.r();
            this.J[5] = this.L.q();
            float[] fArr3 = this.J;
            fArr3[6] = 0.0f;
            int i11 = 6 ^ 7;
            fArr3[7] = this.L.q();
            matrix.mapPoints(this.J);
            this.K.reset();
            Path path = this.K;
            float[] fArr4 = this.J;
            path.moveTo(fArr4[0], fArr4[1]);
            Path path2 = this.K;
            float[] fArr5 = this.J;
            path2.lineTo(fArr5[2], fArr5[3]);
            Path path3 = this.K;
            float[] fArr6 = this.J;
            path3.lineTo(fArr6[4], fArr6[5]);
            Path path4 = this.K;
            float[] fArr7 = this.J;
            path4.lineTo(fArr7[6], fArr7[7]);
            Path path5 = this.K;
            float[] fArr8 = this.J;
            path5.lineTo(fArr8[0], fArr8[1]);
            this.K.close();
            canvas.drawPath(this.K, this.I);
        }
    }
}
