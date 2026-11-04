package com.bumptech.glide.load.engine.bitmap_recycle;

/* JADX INFO: loaded from: classes3.dex */
public final class g implements a<byte[]> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final String f96392a = "ByteArrayPool";

    @Override // com.bumptech.glide.load.engine.bitmap_recycle.a
    public String E() {
        return f96392a;
    }

    @Override // com.bumptech.glide.load.engine.bitmap_recycle.a
    public int b() {
        return 1;
    }

    @Override // com.bumptech.glide.load.engine.bitmap_recycle.a
    /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
    public int a(byte[] bArr) {
        return bArr.length;
    }

    @Override // com.bumptech.glide.load.engine.bitmap_recycle.a
    /* JADX INFO: renamed from: d, reason: merged with bridge method [inline-methods] */
    public byte[] newArray(int i10) {
        return new byte[i10];
    }
}
