package kotlin.uuid;

import com.google.common.primitives.t;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes11.dex */
@SourceDebugExtension({"SMAP\nUuid.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Uuid.kt\nkotlin/uuid/UuidKt__UuidKt\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,447:1\n1#2:448\n*E\n"})
class g extends f {
    /* JADX INFO: Access modifiers changed from: private */
    public static final void m(String str, int i10) {
        if (str.charAt(i10) == '-') {
            return;
        }
        throw new IllegalArgumentException(("Expected '-' (hyphen) at index 8, but was " + str.charAt(i10)).toString());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void n(long j10, byte[] bArr, int i10, int i11) {
        int i12 = i10 + (i11 * 2);
        for (int i13 = 0; i13 < i11; i13++) {
            int i14 = kotlin.text.g.m()[(int) (255 & j10)];
            bArr[i12 - 1] = (byte) i14;
            i12 -= 2;
            bArr[i12] = (byte) (i14 >> 8);
            j10 >>= 8;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void o(long j10, byte[] bArr, int i10) {
        for (int i11 = 0; i11 < 8; i11++) {
            bArr[i10 + i11] = (byte) (j10 >>> ((7 - i11) * 8));
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final long p(byte[] bArr, int i10) {
        return (((long) bArr[i10 + 7]) & 255) | ((((long) bArr[i10]) & 255) << 56) | ((((long) bArr[i10 + 1]) & 255) << 48) | ((((long) bArr[i10 + 2]) & 255) << 40) | ((((long) bArr[i10 + 3]) & 255) << 32) | ((((long) bArr[i10 + 4]) & 255) << 24) | ((((long) bArr[i10 + 5]) & 255) << 16) | ((((long) bArr[i10 + 6]) & 255) << 8);
    }

    @a
    @NotNull
    public static final d q(@NotNull byte[] randomBytes) {
        Intrinsics.checkNotNullParameter(randomBytes, "randomBytes");
        byte b10 = (byte) (randomBytes[6] & com.google.common.base.c.f116464q);
        randomBytes[6] = b10;
        randomBytes[6] = (byte) (b10 | t.f119782a);
        byte b11 = (byte) (randomBytes[8] & 63);
        randomBytes[8] = b11;
        randomBytes[8] = (byte) (b11 | 128);
        return d.f313446c.a(randomBytes);
    }
}
