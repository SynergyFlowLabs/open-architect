package com.google.android.gms.internal.base;

import android.graphics.drawable.Drawable;
import androidx.annotation.p0;

/* JADX INFO: loaded from: classes4.dex */
final class g extends Drawable.ConstantState {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    int f107931a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    int f107932b;

    g(@p0 g gVar) {
        if (gVar != null) {
            this.f107931a = gVar.f107931a;
            this.f107932b = gVar.f107932b;
        }
    }

    @Override // android.graphics.drawable.Drawable.ConstantState
    public final int getChangingConfigurations() {
        return this.f107931a;
    }

    @Override // android.graphics.drawable.Drawable.ConstantState
    public final Drawable newDrawable() {
        return new i(this);
    }
}
