package com.bumptech.glide.load.resource.bitmap;

import android.graphics.drawable.BitmapDrawable;
import androidx.annotation.NonNull;

/* JADX INFO: loaded from: classes3.dex */
public class c extends com.bumptech.glide.load.resource.drawable.b<BitmapDrawable> implements com.bumptech.glide.load.engine.r {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final com.bumptech.glide.load.engine.bitmap_recycle.e f96961b;

    public c(BitmapDrawable bitmapDrawable, com.bumptech.glide.load.engine.bitmap_recycle.e eVar) {
        super(bitmapDrawable);
        this.f96961b = eVar;
    }

    @Override // com.bumptech.glide.load.engine.v
    public void a() {
        this.f96961b.e(((BitmapDrawable) this.f97110a).getBitmap());
    }

    @Override // com.bumptech.glide.load.engine.v
    @NonNull
    public Class<BitmapDrawable> b() {
        return BitmapDrawable.class;
    }

    @Override // com.bumptech.glide.load.engine.v
    public int getSize() {
        return com.bumptech.glide.util.m.h(((BitmapDrawable) this.f97110a).getBitmap());
    }

    @Override // com.bumptech.glide.load.resource.drawable.b, com.bumptech.glide.load.engine.r
    public void initialize() {
        ((BitmapDrawable) this.f97110a).getBitmap().prepareToDraw();
    }
}
