package com.planner5d.library.services.utility;

import android.util.Base64;
import kotlin.collections.ArraysKt;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes10.dex */
public final class l {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    public static final l f225301a = new l();

    private l() {
    }

    @oj.n
    public static final void a(@NotNull byte[] bytes, @androidx.annotation.g0(from = 1) int i10) {
        Intrinsics.checkNotNullParameter(bytes, "bytes");
        if (bytes.length == 0) {
            return;
        }
        int length = (bytes.length / 2) - (i10 / 2);
        for (int i11 = 0; i11 < i10; i11++) {
            int i12 = length + i11;
            Byte orNull = ArraysKt.getOrNull(bytes, i12);
            if (orNull != null) {
                bytes[i12] = (byte) (orNull.byteValue() + 1);
            }
        }
    }

    public static /* synthetic */ String d(l lVar, byte[] bArr, int i10, int i11, Object obj) {
        if ((i11 & 2) != 0) {
            i10 = 2;
        }
        return lVar.c(bArr, i10);
    }

    @oj.n
    @NotNull
    public static final String e(@NotNull byte[] input) {
        Intrinsics.checkNotNullParameter(input, "input");
        char[] cArrN = org.apache.commons.codec.binary.l.n(input);
        Intrinsics.checkNotNullExpressionValue(cArrN, "encodeHex(...)");
        return new String(cArrN);
    }

    @oj.j
    @NotNull
    public final String b(@NotNull byte[] input) {
        Intrinsics.checkNotNullParameter(input, "input");
        return d(this, input, 0, 2, null);
    }

    @oj.j
    @NotNull
    public final String c(@NotNull byte[] input, int i10) {
        Intrinsics.checkNotNullParameter(input, "input");
        String strEncodeToString = Base64.encodeToString(input, i10);
        Intrinsics.checkNotNullExpressionValue(strEncodeToString, "encodeToString(...)");
        return strEncodeToString;
    }
}
