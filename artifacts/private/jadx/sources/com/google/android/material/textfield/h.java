package com.google.android.material.textfield;

import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffXfermode;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;
import android.view.View;
import androidx.annotation.NonNull;
import androidx.annotation.p0;

/* JADX INFO: loaded from: classes4.dex */
class h extends com.google.android.material.shape.k {

    /* JADX INFO: renamed from: k3, reason: collision with root package name */
    @NonNull
    b f114148k3;

    private static class c extends h {

        /* JADX INFO: renamed from: l3, reason: collision with root package name */
        private Paint f114150l3;

        /* JADX INFO: renamed from: m3, reason: collision with root package name */
        private int f114151m3;

        c(@NonNull b bVar) {
            super(bVar);
        }

        private Paint X0() {
            if (this.f114150l3 == null) {
                Paint paint = new Paint(1);
                this.f114150l3 = paint;
                paint.setStyle(Paint.Style.FILL_AND_STROKE);
                this.f114150l3.setColor(-1);
                this.f114150l3.setXfermode(new PorterDuffXfermode(PorterDuff.Mode.DST_OUT));
            }
            return this.f114150l3;
        }

        private void Y0(@NonNull Canvas canvas) {
            if (b1(getCallback())) {
                return;
            }
            canvas.restoreToCount(this.f114151m3);
        }

        private void Z0(@NonNull Canvas canvas) {
            Drawable.Callback callback = getCallback();
            if (!b1(callback)) {
                a1(canvas);
                return;
            }
            View view = (View) callback;
            if (view.getLayerType() != 2) {
                view.setLayerType(2, null);
            }
        }

        private void a1(@NonNull Canvas canvas) {
            int i10 = 6 | 0;
            this.f114151m3 = canvas.saveLayer(0.0f, 0.0f, canvas.getWidth(), canvas.getHeight(), null);
        }

        private boolean b1(Drawable.Callback callback) {
            return callback instanceof View;
        }

        @Override // com.google.android.material.shape.k, android.graphics.drawable.Drawable
        public void draw(@NonNull Canvas canvas) {
            Z0(canvas);
            super.draw(canvas);
            Y0(canvas);
        }

        @Override // com.google.android.material.shape.k
        protected void t(@NonNull Canvas canvas) {
            super.t(canvas);
            canvas.drawRect(this.f114148k3.f114149w, X0());
        }
    }

    @e.b(18)
    private static class d extends h {
        d(@NonNull b bVar) {
            super(bVar);
        }

        @Override // com.google.android.material.shape.k
        protected void t(@NonNull Canvas canvas) {
            if (this.f114148k3.f114149w.isEmpty()) {
                super.t(canvas);
                return;
            }
            canvas.save();
            canvas.clipOutRect(this.f114148k3.f114149w);
            super.t(canvas);
            canvas.restore();
        }
    }

    static h R0(@p0 com.google.android.material.shape.p pVar) {
        if (pVar == null) {
            pVar = new com.google.android.material.shape.p();
        }
        return S0(new b(pVar, new RectF()));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static h S0(@NonNull b bVar) {
        return new d(bVar);
    }

    boolean T0() {
        return !this.f114148k3.f114149w.isEmpty();
    }

    void U0() {
        V0(0.0f, 0.0f, 0.0f, 0.0f);
    }

    void V0(float f10, float f11, float f12, float f13) {
        if (f10 == this.f114148k3.f114149w.left && f11 == this.f114148k3.f114149w.top && f12 == this.f114148k3.f114149w.right && f13 == this.f114148k3.f114149w.bottom) {
            return;
        }
        this.f114148k3.f114149w.set(f10, f11, f12, f13);
        invalidateSelf();
    }

    void W0(@NonNull RectF rectF) {
        V0(rectF.left, rectF.top, rectF.right, rectF.bottom);
    }

    @Override // com.google.android.material.shape.k, android.graphics.drawable.Drawable
    @NonNull
    public Drawable mutate() {
        this.f114148k3 = new b(this.f114148k3);
        return this;
    }

    private static final class b extends com.google.android.material.shape.k.d {

        /* JADX INFO: renamed from: w, reason: collision with root package name */
        @NonNull
        private final RectF f114149w;

        @Override // com.google.android.material.shape.k.d, android.graphics.drawable.Drawable.ConstantState
        @NonNull
        public Drawable newDrawable() {
            h hVarS0 = h.S0(this);
            hVarS0.invalidateSelf();
            return hVarS0;
        }

        private b(@NonNull com.google.android.material.shape.p pVar, @NonNull RectF rectF) {
            super(pVar, null);
            this.f114149w = rectF;
        }

        private b(@NonNull b bVar) {
            super(bVar);
            this.f114149w = bVar.f114149w;
        }
    }

    private h(@NonNull b bVar) {
        super(bVar);
        this.f114148k3 = bVar;
    }
}
