package io.ktor.util;

import java.nio.charset.Charset;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.text.CharsKt;
import kotlin.text.Charsets;
import kotlin.text.StringsKt;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes6.dex */
@SourceDebugExtension({"SMAP\nCrypto.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Crypto.kt\nio/ktor/util/CryptoKt__CryptoKt\n+ 2 Builder.kt\nio/ktor/utils/io/core/BuilderKt\n*L\n1#1,137:1\n21#2,3:138\n*S KotlinDebug\n*F\n+ 1 Crypto.kt\nio/ktor/util/CryptoKt__CryptoKt\n*L\n67#1:138,3\n*E\n"})
final /* synthetic */ class e0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    private static final char[] f296579a = v.b("0123456789abcdef");

    @io.ktor.utils.io.o0
    @Nullable
    public static final Object a(@NotNull k0 k0Var, @NotNull String str, @NotNull Charset charset, @NotNull kotlin.coroutines.d<? super byte[]> dVar) {
        k0Var.a(ui.u.l(str, charset));
        return k0Var.b(dVar);
    }

    @io.ktor.utils.io.o0
    @Nullable
    public static final Object b(@NotNull k0 k0Var, @NotNull byte[] bArr, @NotNull kotlin.coroutines.d<? super byte[]> dVar) {
        k0Var.a(bArr);
        return k0Var.b(dVar);
    }

    public static /* synthetic */ Object c(k0 k0Var, String str, Charset charset, kotlin.coroutines.d dVar, int i10, Object obj) {
        if ((i10 & 2) != 0) {
            charset = Charsets.UTF_8;
        }
        return b0.b(k0Var, str, charset, dVar);
    }

    @NotNull
    public static final byte[] d(int i10) {
        kotlinx.io.b bVar = new kotlinx.io.b();
        while (ui.j.f(bVar) < i10) {
            ui.u.p(bVar, b0.e(), 0, 0, null, 14, null);
        }
        return kotlinx.io.g0.d(bVar, i10);
    }

    @NotNull
    public static final String e(@NotNull byte[] bytes) {
        Intrinsics.checkNotNullParameter(bytes, "bytes");
        char[] cArr = new char[bytes.length * 2];
        char[] cArr2 = f296579a;
        int i10 = 0;
        for (byte b10 : bytes) {
            int i11 = i10 + 1;
            cArr[i10] = cArr2[(b10 & 255) >> 4];
            i10 += 2;
            cArr[i11] = cArr2[b10 & com.google.common.base.c.f116464q];
        }
        return StringsKt.w1(cArr);
    }

    @NotNull
    public static final byte[] f(@NotNull String s10) {
        Intrinsics.checkNotNullParameter(s10, "s");
        int length = s10.length() / 2;
        byte[] bArr = new byte[length];
        for (int i10 = 0; i10 < length; i10++) {
            int i11 = i10 * 2;
            bArr[i10] = (byte) (Integer.parseInt(String.valueOf(s10.charAt(i11 + 1)), CharsKt.checkRadix(16)) | (Integer.parseInt(String.valueOf(s10.charAt(i11)), CharsKt.checkRadix(16)) << 4));
        }
        return bArr;
    }
}
