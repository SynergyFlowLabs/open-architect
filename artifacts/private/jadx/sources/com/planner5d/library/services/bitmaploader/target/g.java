package com.planner5d.library.services.bitmaploader.target;

import android.graphics.Bitmap;
import androidx.annotation.NonNull;

/* JADX INFO: loaded from: classes10.dex */
public class g extends a {

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private final a f224189h;

    public g(@NonNull a target) {
        this.f224189h = target;
    }

    @Override // com.planner5d.library.services.bitmaploader.target.a
    protected void b(boolean withoutBitmap) {
        if (withoutBitmap) {
            return;
        }
        this.f224189h.dispose();
    }

    @Override // com.planner5d.library.services.bitmaploader.target.a
    protected void h(Bitmap bitmap) {
    }

    @Override // com.planner5d.library.services.bitmaploader.target.a
    public void j(Bitmap bitmap, Throwable error) {
        super.j(bitmap, error);
        this.f224189h.j(bitmap, error);
    }
}
