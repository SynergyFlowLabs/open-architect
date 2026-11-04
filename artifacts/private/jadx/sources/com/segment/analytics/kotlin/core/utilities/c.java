package com.segment.analytics.kotlin.core.utilities;

import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.text.Charsets;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes13.dex */
@SourceDebugExtension({"SMAP\nBase64Utils.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Base64Utils.kt\ncom/segment/analytics/kotlin/core/utilities/Base64Utils\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,44:1\n1#2:45\n*E\n"})
@oj.i(name = "Base64Utils")
public final class c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    private static final String f266983a = "ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz0123456789+/";

    private static final char a(int i10) {
        return f266983a.charAt(i10);
    }

    @NotNull
    public static final String b(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "str");
        byte[] bytes = str.getBytes(Charsets.UTF_8);
        Intrinsics.checkNotNullExpressionValue(bytes, "this as java.lang.String).getBytes(charset)");
        return c(bytes);
    }

    @NotNull
    public static final String c(@NotNull byte[] bytes) {
        Intrinsics.checkNotNullParameter(bytes, "bytes");
        StringBuilder sb2 = new StringBuilder();
        byte[] bArr = new byte[3];
        int i10 = 0;
        while (i10 < bytes.length) {
            int length = bytes.length - i10;
            if (length >= 3) {
                length = 3;
            }
            int i11 = 0;
            while (i11 < length) {
                bArr[i11] = bytes[i10];
                i11++;
                i10++;
            }
            if (length <= 2) {
                int i12 = 2;
                while (true) {
                    bArr[i12] = 0;
                    if (i12 == length) {
                        break;
                    }
                    i12--;
                }
            }
            int i13 = (bArr[2] & 255) | ((bArr[0] & 255) << 16) | ((bArr[1] & 255) << 8);
            int i14 = ((3 - length) * 8) / 6;
            if (i14 <= 3) {
                int i15 = 3;
                while (true) {
                    sb2.append(a((i13 >> (i15 * 6)) & 63));
                    if (i15 == i14) {
                        break;
                    }
                    i15--;
                }
            }
            for (int i16 = 0; i16 < i14; i16++) {
                sb2.append("=");
            }
        }
        String string = sb2.toString();
        Intrinsics.checkNotNullExpressionValue(string, "StringBuilder().apply(builderAction).toString()");
        return string;
    }
}
