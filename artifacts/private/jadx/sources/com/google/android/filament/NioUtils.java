package com.google.android.filament;

import androidx.annotation.NonNull;
import com.google.android.filament.proguard.UsedByNative;
import java.nio.Buffer;
import java.nio.ByteBuffer;
import java.nio.CharBuffer;
import java.nio.FloatBuffer;
import java.nio.IntBuffer;
import java.nio.LongBuffer;
import java.nio.ShortBuffer;

/* JADX INFO: loaded from: classes4.dex */
@UsedByNative("NioUtils.cpp")
final class NioUtils {

    enum a {
        BYTE,
        CHAR,
        SHORT,
        INT,
        LONG,
        FLOAT,
        DOUBLE
    }

    private NioUtils() {
    }

    @UsedByNative("NioUtils.cpp")
    static Object getBaseArray(@NonNull Buffer buffer) {
        if (buffer.hasArray()) {
            return buffer.array();
        }
        return null;
    }

    @UsedByNative("NioUtils.cpp")
    static int getBaseArrayOffset(@NonNull Buffer buffer, int i10) {
        if (buffer.hasArray()) {
            return (buffer.arrayOffset() + buffer.position()) << i10;
        }
        return 0;
    }

    @UsedByNative("NioUtils.cpp")
    static long getBasePointer(@NonNull Buffer buffer, long j10, int i10) {
        if (j10 != 0) {
            return j10 + ((long) (buffer.position() << i10));
        }
        return 0L;
    }

    @UsedByNative("NioUtils.cpp")
    static int getBufferType(@NonNull Buffer buffer) {
        if (buffer instanceof ByteBuffer) {
            return a.BYTE.ordinal();
        }
        if (buffer instanceof CharBuffer) {
            return a.CHAR.ordinal();
        }
        if (buffer instanceof ShortBuffer) {
            return a.SHORT.ordinal();
        }
        if (buffer instanceof IntBuffer) {
            return a.INT.ordinal();
        }
        if (buffer instanceof LongBuffer) {
            return a.LONG.ordinal();
        }
        return buffer instanceof FloatBuffer ? a.FLOAT.ordinal() : a.DOUBLE.ordinal();
    }
}
