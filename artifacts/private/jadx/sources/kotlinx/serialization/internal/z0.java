package kotlinx.serialization.internal;

import java.util.Locale;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.text.StringsKt;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes13.dex */
@SourceDebugExtension({"SMAP\nPlatform.common.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Platform.common.kt\nkotlinx/serialization/internal/InternalHexConverter\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,190:1\n1#2:191\n*E\n"})
public final class z0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    public static final z0 f316062a = new z0();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NotNull
    private static final String f316063b = "0123456789ABCDEF";

    private z0() {
    }

    private final int a(char c10) {
        if ('0' <= c10 && c10 < ':') {
            return c10 - org.locationtech.jts.geom.l.f338160j;
        }
        if ('A' <= c10 && c10 < 'G') {
            return c10 - '7';
        }
        if ('a' > c10 || c10 >= 'g') {
            return -1;
        }
        return c10 - 'W';
    }

    public static /* synthetic */ String d(z0 z0Var, byte[] bArr, boolean z10, int i10, Object obj) {
        if ((i10 & 2) != 0) {
            z10 = false;
        }
        return z0Var.c(bArr, z10);
    }

    @NotNull
    public final byte[] b(@NotNull String s10) {
        Intrinsics.checkNotNullParameter(s10, "s");
        int length = s10.length();
        if (length % 2 != 0) {
            throw new IllegalArgumentException("HexBinary string must be even length");
        }
        byte[] bArr = new byte[length / 2];
        for (int i10 = 0; i10 < length; i10 += 2) {
            int iA = a(s10.charAt(i10));
            int i11 = i10 + 1;
            int iA2 = a(s10.charAt(i11));
            if (iA == -1 || iA2 == -1) {
                throw new IllegalArgumentException(("Invalid hex chars: " + s10.charAt(i10) + s10.charAt(i11)).toString());
            }
            bArr[i10 / 2] = (byte) ((iA << 4) + iA2);
        }
        return bArr;
    }

    @NotNull
    public final String c(@NotNull byte[] data, boolean z10) {
        Intrinsics.checkNotNullParameter(data, "data");
        StringBuilder sb2 = new StringBuilder(data.length * 2);
        for (byte b10 : data) {
            sb2.append(f316063b.charAt((b10 >> 4) & 15));
            sb2.append(f316063b.charAt(b10 & com.google.common.base.c.f116464q));
        }
        String string = sb2.toString();
        Intrinsics.checkNotNullExpressionValue(string, "toString(...)");
        if (!z10) {
            return string;
        }
        String lowerCase = string.toLowerCase(Locale.ROOT);
        Intrinsics.checkNotNullExpressionValue(lowerCase, "toLowerCase(...)");
        return lowerCase;
    }

    @NotNull
    public final String e(int i10) {
        byte[] bArr = new byte[4];
        for (int i11 = 0; i11 < 4; i11++) {
            bArr[i11] = (byte) (i10 >> (24 - (i11 * 8)));
        }
        String strV5 = StringsKt.V5(c(bArr, true), org.locationtech.jts.geom.l.f338160j);
        if (strV5.length() <= 0) {
            strV5 = null;
        }
        if (strV5 == null) {
            strV5 = com.facebook.appevents.p.f99189d0;
        }
        return strV5;
    }
}
