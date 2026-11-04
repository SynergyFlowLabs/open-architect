package com.airbnb.lottie.model.layer;

import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.Rect;
import android.graphics.RectF;
import androidx.annotation.NonNull;
import androidx.annotation.p0;
import com.airbnb.lottie.animation.keyframe.q;
import com.airbnb.lottie.b1;
import com.airbnb.lottie.w0;
import com.airbnb.lottie.x0;

/* JADX INFO: loaded from: classes3.dex */
public class d extends b {
    private final Paint H;
    private final Rect I;
    private final Rect J;

    @p0
    private final x0 K;

    @p0
    private com.airbnb.lottie.animation.keyframe.a<ColorFilter, ColorFilter> L;

    @p0
    private com.airbnb.lottie.animation.keyframe.a<Bitmap, Bitmap> M;

    d(w0 w0Var, e eVar) {
        super(w0Var, eVar);
        this.H = new com.airbnb.lottie.animation.a(3);
        this.I = new Rect();
        this.J = new Rect();
        this.K = w0Var.a0(eVar.n());
    }

    @p0
    private Bitmap O() {
        Bitmap bitmapH;
        com.airbnb.lottie.animation.keyframe.a<Bitmap, Bitmap> aVar = this.M;
        if (aVar != null && (bitmapH = aVar.h()) != null) {
            return bitmapH;
        }
        Bitmap bitmapQ = this.f88562p.Q(this.f88563q.n());
        if (bitmapQ != null) {
            return bitmapQ;
        }
        x0 x0Var = this.K;
        if (x0Var != null) {
            return x0Var.b();
        }
        return null;
    }

    @Override // com.airbnb.lottie.model.layer.b, com.airbnb.lottie.animation.content.e
    public void a(RectF rectF, Matrix matrix, boolean z10) {
        super.a(rectF, matrix, z10);
        if (this.K != null) {
            float fE = com.airbnb.lottie.utils.j.e();
            int i10 = 7 & 0;
            rectF.set(0.0f, 0.0f, this.K.g() * fE, this.K.e() * fE);
            this.f88561o.mapRect(rectF);
        }
    }

    @Override // com.airbnb.lottie.model.layer.b, com.airbnb.lottie.model.f
    public <T> void g(T t10, @p0 com.airbnb.lottie.value.j<T> jVar) {
        super.g(t10, jVar);
        if (t10 == b1.K) {
            if (jVar == null) {
                this.L = null;
                return;
            } else {
                this.L = new q(jVar);
                return;
            }
        }
        if (t10 == b1.N) {
            if (jVar == null) {
                this.M = null;
            } else {
                this.M = new q(jVar);
            }
        }
    }

    @Override // com.airbnb.lottie.model.layer.b
    public void t(@NonNull Canvas canvas, Matrix matrix, int i10) {
        Bitmap bitmapO = O();
        if (bitmapO == null || bitmapO.isRecycled() || this.K == null) {
            return;
        }
        float fE = com.airbnb.lottie.utils.j.e();
        this.H.setAlpha(i10);
        com.airbnb.lottie.animation.keyframe.a<ColorFilter, ColorFilter> aVar = this.L;
        if (aVar != null) {
            this.H.setColorFilter(aVar.h());
        }
        canvas.save();
        canvas.concat(matrix);
        this.I.set(0, 0, bitmapO.getWidth(), bitmapO.getHeight());
        if (this.f88562p.b0()) {
            this.J.set(0, 0, (int) (this.K.g() * fE), (int) (this.K.e() * fE));
        } else {
            this.J.set(0, 0, (int) (bitmapO.getWidth() * fE), (int) (bitmapO.getHeight() * fE));
        }
        canvas.drawBitmap(bitmapO, this.I, this.J, this.H);
        canvas.restore();
    }
}
