package com.badlogic.gdx.utils;

import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.nio.FloatBuffer;

/* JADX INFO: loaded from: classes3.dex */
public final class BufferUtils {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final b<ByteBuffer> f95141a = new b<>();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static final boolean f95142b = true;

    public static void a(float[] fArr, FloatBuffer floatBuffer, int i10, int i11) {
        floatBuffer.limit(i10);
        floatBuffer.put(fArr, i11, i10);
        floatBuffer.position(0);
    }

    public static void b(ByteBuffer byteBuffer) {
        b<ByteBuffer> bVar = f95141a;
        synchronized (bVar) {
            try {
                if (!bVar.C(byteBuffer, true)) {
                    throw new IllegalArgumentException("buffer not allocated with newDisposableByteBuffer or already disposed");
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
        freeMemory(byteBuffer);
    }

    public static ByteBuffer c(int i10) {
        ByteBuffer byteBufferNewDisposableByteBuffer = newDisposableByteBuffer(i10);
        b<ByteBuffer> bVar = f95141a;
        synchronized (bVar) {
            try {
                bVar.c(byteBufferNewDisposableByteBuffer);
            } catch (Throwable th2) {
                throw th2;
            }
        }
        byteBufferNewDisposableByteBuffer.order(ByteOrder.nativeOrder());
        return byteBufferNewDisposableByteBuffer;
    }

    private static native void freeMemory(ByteBuffer byteBuffer);

    private static native ByteBuffer newDisposableByteBuffer(int i10);
}
