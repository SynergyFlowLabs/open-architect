package com.bumptech.glide.load.engine.bitmap_recycle;

/* JADX INFO: loaded from: classes3.dex */
public final class i implements a<int[]> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final String f96399a = "IntegerArrayPool";

    @Override // com.bumptech.glide.load.engine.bitmap_recycle.a
    public String E() {
        return f96399a;
    }

    @Override // com.bumptech.glide.load.engine.bitmap_recycle.a
    public int b() {
        return 4;
    }

    @Override // com.bumptech.glide.load.engine.bitmap_recycle.a
    /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
    public int a(int[] iArr) {
        return iArr.length;
    }

    @Override // com.bumptech.glide.load.engine.bitmap_recycle.a
    /* JADX INFO: renamed from: d, reason: merged with bridge method [inline-methods] */
    public int[] newArray(int i10) {
        return new int[i10];
    }
}
