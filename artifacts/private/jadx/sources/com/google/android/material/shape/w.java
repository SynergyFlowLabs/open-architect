package com.google.android.material.shape;

import android.graphics.Outline;
import android.graphics.RectF;
import android.view.View;
import android.view.ViewOutlineProvider;
import androidx.annotation.NonNull;
import androidx.annotation.l1;
import androidx.annotation.w0;

/* JADX INFO: loaded from: classes4.dex */
@w0(22)
class w extends u {

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private boolean f113687f = false;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private float f113688g = 0.0f;

    class a extends ViewOutlineProvider {
        a() {
        }

        @Override // android.view.ViewOutlineProvider
        public void getOutline(View view, Outline outline) {
            w wVar = w.this;
            if (wVar.f113684c == null || wVar.f113685d.isEmpty()) {
                return;
            }
            w wVar2 = w.this;
            RectF rectF = wVar2.f113685d;
            outline.setRoundRect((int) rectF.left, (int) rectF.top, (int) rectF.right, (int) rectF.bottom, wVar2.f113688g);
        }
    }

    w(@NonNull View view) {
        o(view);
    }

    private float n() {
        RectF rectF;
        p pVar = this.f113684c;
        if (pVar == null || (rectF = this.f113685d) == null) {
            return 0.0f;
        }
        return pVar.f113601f.a(rectF);
    }

    @androidx.annotation.u
    private void o(View view) {
        view.setOutlineProvider(new a());
    }

    private boolean p() {
        p pVar;
        if (!this.f113685d.isEmpty() && (pVar = this.f113684c) != null) {
            return pVar.u(this.f113685d);
        }
        return false;
    }

    private boolean q() {
        p pVar;
        if (!this.f113685d.isEmpty() && (pVar = this.f113684c) != null && this.f113683b && !pVar.u(this.f113685d) && r(this.f113684c)) {
            float fA = this.f113684c.r().a(this.f113685d);
            float fA2 = this.f113684c.t().a(this.f113685d);
            float fA3 = this.f113684c.j().a(this.f113685d);
            float fA4 = this.f113684c.l().a(this.f113685d);
            if (fA == 0.0f && fA3 == 0.0f && fA2 == fA4) {
                RectF rectF = this.f113685d;
                rectF.set(rectF.left - fA2, rectF.top, rectF.right, rectF.bottom);
                this.f113688g = fA2;
                return true;
            }
            if (fA == 0.0f && fA2 == 0.0f && fA3 == fA4) {
                RectF rectF2 = this.f113685d;
                rectF2.set(rectF2.left, rectF2.top - fA3, rectF2.right, rectF2.bottom);
                this.f113688g = fA3;
                return true;
            }
            if (fA2 == 0.0f && fA4 == 0.0f && fA == fA3) {
                RectF rectF3 = this.f113685d;
                rectF3.set(rectF3.left, rectF3.top, rectF3.right + fA, rectF3.bottom);
                this.f113688g = fA;
                return true;
            }
            if (fA3 == 0.0f && fA4 == 0.0f && fA == fA2) {
                RectF rectF4 = this.f113685d;
                rectF4.set(rectF4.left, rectF4.top, rectF4.right, rectF4.bottom + fA);
                this.f113688g = fA;
                return true;
            }
        }
        return false;
    }

    private static boolean r(p pVar) {
        return (pVar.q() instanceof o) && (pVar.s() instanceof o) && (pVar.i() instanceof o) && (pVar.k() instanceof o);
    }

    @Override // com.google.android.material.shape.u
    void b(@NonNull View view) {
        this.f113688g = n();
        this.f113687f = p() || q();
        view.setClipToOutline(!j());
        if (j()) {
            view.invalidate();
        } else {
            view.invalidateOutline();
        }
    }

    @Override // com.google.android.material.shape.u
    boolean j() {
        return !this.f113687f || this.f113682a;
    }

    @l1
    float m() {
        return this.f113688g;
    }
}
