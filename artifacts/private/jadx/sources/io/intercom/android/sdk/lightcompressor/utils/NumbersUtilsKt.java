package io.intercom.android.sdk.lightcompressor.utils;

import androidx.collection.g3;
import kotlin.math.b;

/* JADX INFO: loaded from: classes13.dex */
public final class NumbersUtilsKt {
    public static final int generateWidthHeightValue(double d10, double d11) {
        return roundEven(b.K0((d10 * d11) / ((double) 16)) * 16);
    }

    private static final int roundEven(int i10) {
        return (i10 + 1) & (-2);
    }

    public static final int uInt32ToInt(long j10) throws Exception {
        if (j10 > g3.f12256c || j10 < 0) {
            throw new Exception("uInt32 value is too large");
        }
        return (int) j10;
    }

    public static final long uInt32ToLong(int i10) {
        return i10;
    }

    public static final long uInt64ToLong(long j10) throws Exception {
        if (j10 >= 0) {
            return j10;
        }
        throw new Exception("uInt64 value is too large");
    }

    public static final int uInt32ToInt(int i10) throws Exception {
        if (i10 >= 0) {
            return i10;
        }
        throw new Exception("uInt32 value is too large");
    }
}
