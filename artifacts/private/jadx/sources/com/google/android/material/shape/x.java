package com.google.android.material.shape;

import android.graphics.Outline;
import android.view.View;
import android.view.ViewOutlineProvider;
import androidx.annotation.NonNull;
import androidx.annotation.w0;

/* JADX INFO: loaded from: classes4.dex */
@w0(33)
class x extends u {

    class a extends ViewOutlineProvider {
        a() {
        }

        @Override // android.view.ViewOutlineProvider
        public void getOutline(View view, Outline outline) {
            if (!x.this.f113686e.isEmpty()) {
                outline.setPath(x.this.f113686e);
            }
        }
    }

    x(@NonNull View view) {
        l(view);
    }

    @androidx.annotation.u
    private void l(View view) {
        view.setOutlineProvider(new a());
    }

    @Override // com.google.android.material.shape.u
    void b(@NonNull View view) {
        view.setClipToOutline(!j());
        if (j()) {
            view.invalidate();
        } else {
            view.invalidateOutline();
        }
    }

    @Override // com.google.android.material.shape.u
    boolean j() {
        return this.f113682a;
    }
}
