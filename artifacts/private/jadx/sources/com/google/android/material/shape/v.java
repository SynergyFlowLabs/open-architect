package com.google.android.material.shape;

import android.view.View;
import androidx.annotation.NonNull;

/* JADX INFO: loaded from: classes4.dex */
class v extends u {
    v() {
    }

    @Override // com.google.android.material.shape.u
    void b(@NonNull View view) {
        if (this.f113684c == null || this.f113685d.isEmpty() || !j()) {
            return;
        }
        view.invalidate();
    }

    @Override // com.google.android.material.shape.u
    boolean j() {
        return true;
    }
}
