package com.badlogic.gdx.utils;

import android.opengl.GLES20;
import java.nio.ByteBuffer;

/* JADX INFO: loaded from: classes3.dex */
public final class w0 {
    public static byte[] a(int i10, int i11, int i12, int i13, boolean z10) {
        GLES20.glPixelStorei(3333, 1);
        int i14 = i12 * i13 * 4;
        ByteBuffer byteBufferC = BufferUtils.c(i14);
        GLES20.glReadPixels(i10, i11, i12, i13, 6408, 5121, byteBufferC);
        byte[] bArr = new byte[i14];
        if (z10) {
            int i15 = i12 * 4;
            for (int i16 = 0; i16 < i13; i16++) {
                byteBufferC.position(((i13 - i16) - 1) * i15);
                byteBufferC.get(bArr, i16 * i15, i15);
            }
        } else {
            byteBufferC.clear();
            byteBufferC.get(bArr);
        }
        BufferUtils.b(byteBufferC);
        return bArr;
    }
}
