package io.ktor.util;

import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.text.StringsKt;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes6.dex */
@SourceDebugExtension({"SMAP\nBase64.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Base64.kt\nio/ktor/util/Base64Kt\n+ 2 Builder.kt\nio/ktor/utils/io/core/BuilderKt\n+ 3 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 4 _Strings.kt\nkotlin/text/StringsKt___StringsKt\n+ 5 _Arrays.kt\nkotlin/collections/ArraysKt___ArraysKt\n*L\n1#1,130:1\n126#1:134\n126#1:135\n129#1:149\n21#2,3:131\n21#2,2:137\n23#2:143\n21#2,2:144\n23#2:151\n1#3:136\n389#4,4:139\n13026#5,3:146\n13029#5:150\n*S KotlinDebug\n*F\n+ 1 Base64.kt\nio/ktor/util/Base64Kt\n*L\n53#1:134\n69#1:135\n115#1:149\n29#1:131,3\n99#1:137,2\n99#1:143\n108#1:144,2\n108#1:151\n100#1:139,4\n114#1:146,3\n114#1:150\n*E\n"})
public final class f {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    private static final String f296580a = "ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz0123456789+/";

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static final byte f296581b = 63;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static final int f296582c = 63;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private static final char f296583d = '=';

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    @NotNull
    private static final int[] f296584e;

    static {
        int[] iArr = new int[256];
        for (int i10 = 0; i10 < 256; i10++) {
            iArr[i10] = StringsKt.q3(f296580a, (char) i10, 0, false, 6, null);
        }
        iArr[45] = iArr[43];
        iArr[95] = iArr[47];
        f296584e = iArr;
    }

    @NotNull
    public static final kotlinx.io.c0 b(@NotNull kotlinx.io.c0 c0Var) {
        int i10;
        Intrinsics.checkNotNullParameter(c0Var, "<this>");
        kotlinx.io.b bVar = new kotlinx.io.b();
        byte[] bArr = new byte[4];
        while (!c0Var.y1()) {
            int i11 = 0;
            kotlinx.io.c0 c0Var2 = c0Var;
            int iC = ui.p.c(c0Var2, bArr, 0, 0, 6, null);
            int i12 = 0;
            int i13 = 0;
            while (i11 < 4) {
                i12 |= ((byte) (((byte) f296584e[bArr[i11] & 255]) & 63)) << ((3 - i13) * 6);
                i11++;
                i13++;
            }
            int i14 = 4 - iC;
            if (i14 <= 2) {
                while (true) {
                    bVar.m6((byte) ((i12 >> (i10 * 8)) & 255));
                    i10 = i10 != i14 ? i10 - 1 : 2;
                }
            }
            c0Var = c0Var2;
        }
        return bVar;
    }

    @NotNull
    public static final byte[] c(@NotNull String str) {
        String strSubstring;
        Intrinsics.checkNotNullParameter(str, "<this>");
        kotlinx.io.b bVar = new kotlinx.io.b();
        int iI3 = StringsKt.i3(str);
        while (true) {
            if (-1 >= iI3) {
                strSubstring = "";
                break;
            }
            if (str.charAt(iI3) != '=') {
                strSubstring = str.substring(0, iI3 + 1);
                Intrinsics.checkNotNullExpressionValue(strSubstring, "substring(...)");
                break;
            }
            iI3--;
        }
        ui.u.p(bVar, strSubstring, 0, 0, null, 14, null);
        return kotlinx.io.g0.c(b(bVar));
    }

    @NotNull
    public static final String d(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "<this>");
        byte[] bArrC = c(str);
        return StringsKt.H1(bArrC, 0, bArrC.length, false, 4, null);
    }

    @NotNull
    public static final String e(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "<this>");
        kotlinx.io.b bVar = new kotlinx.io.b();
        ui.u.p(bVar, str, 0, 0, null, 14, null);
        return f(bVar);
    }

    @NotNull
    public static final String f(@NotNull kotlinx.io.c0 c0Var) {
        Intrinsics.checkNotNullParameter(c0Var, "<this>");
        return g(kotlinx.io.g0.c(c0Var));
    }

    @NotNull
    public static final String g(@NotNull byte[] bArr) {
        int i10;
        int i11;
        Intrinsics.checkNotNullParameter(bArr, "<this>");
        int i12 = 3;
        char[] cArr = new char[((bArr.length * 8) / 6) + 3];
        int i13 = 0;
        int i14 = 0;
        while (true) {
            int i15 = i13 + 3;
            if (i15 > bArr.length) {
                break;
            }
            int i16 = (bArr[i13 + 2] & 255) | ((bArr[i13] & 255) << 16) | ((bArr[i13 + 1] & 255) << 8);
            int i17 = 3;
            while (-1 < i17) {
                cArr[i14] = f296580a.charAt((i16 >> (i17 * 6)) & 63);
                i17--;
                i14++;
            }
            i13 = i15;
        }
        int length = bArr.length - i13;
        if (length == 0) {
            return StringsKt.x1(cArr, 0, i14);
        }
        if (length == 1) {
            i10 = (bArr[i13] & 255) << 16;
        } else {
            i10 = ((bArr[i13 + 1] & 255) << 8) | ((bArr[i13] & 255) << 16);
        }
        int i18 = ((3 - length) * 8) / 6;
        if (i18 <= 3) {
            while (true) {
                i11 = i14 + 1;
                cArr[i14] = f296580a.charAt((i10 >> (i12 * 6)) & 63);
                if (i12 == i18) {
                    break;
                }
                i12--;
                i14 = i11;
            }
            i14 = i11;
        }
        int i19 = 0;
        while (i19 < i18) {
            cArr[i14] = f296583d;
            i19++;
            i14++;
        }
        return StringsKt.x1(cArr, 0, i14);
    }

    public static final byte h(byte b10) {
        return (byte) (((byte) f296584e[b10 & 255]) & 63);
    }

    public static final char i(int i10) {
        return f296580a.charAt(i10);
    }
}
