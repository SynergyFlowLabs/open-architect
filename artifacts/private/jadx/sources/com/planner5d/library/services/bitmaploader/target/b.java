package com.planner5d.library.services.bitmaploader.target;

import android.graphics.Bitmap;

/* JADX INFO: loaded from: classes10.dex */
public class b extends a {

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private Bitmap f224181h = null;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private final boolean f224182i;

    public b(boolean keepStrongReference) {
        this.f224182i = keepStrongReference;
    }

    @Override // com.planner5d.library.services.bitmaploader.target.a
    protected void b(boolean withoutBitmap) {
        if (withoutBitmap) {
            return;
        }
        this.f224181h = null;
    }

    @Override // com.planner5d.library.services.bitmaploader.target.a
    protected void h(Bitmap bitmap) {
        if (this.f224182i) {
            this.f224181h = bitmap;
        }
    }

    public Bitmap l() {
        return this.f224181h;
    }
}
