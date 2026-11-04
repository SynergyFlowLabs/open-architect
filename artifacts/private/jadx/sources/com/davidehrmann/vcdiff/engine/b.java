package com.davidehrmann.vcdiff.engine;

import java.nio.ByteBuffer;

/* JADX INFO: loaded from: classes3.dex */
class b {

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final int f97820f = 5;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final byte f97821a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final byte f97822b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final byte f97823c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final byte f97824d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final byte f97825e;

    public b(ByteBuffer byteBuffer) {
        this.f97821a = byteBuffer.get();
        this.f97822b = byteBuffer.get();
        this.f97823c = byteBuffer.get();
        this.f97824d = byteBuffer.get();
        this.f97825e = byteBuffer.get();
    }
}
