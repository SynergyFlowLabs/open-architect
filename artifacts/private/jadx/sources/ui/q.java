package ui;

import kotlin.b1;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes6.dex */
public final class q {
    @kotlin.l(message = "ByteArray instead", replaceWith = @b1(expression = "ByteArray", imports = {}))
    public static /* synthetic */ void a() {
    }

    public static final void b(@NotNull byte[] bArr, int i10, int i11) {
        Intrinsics.checkNotNullParameter(bArr, "<this>");
        bArr[i10] = (byte) (i11 >> 24);
        bArr[i10 + 1] = (byte) (i11 >> 16);
        bArr[i10 + 2] = (byte) (i11 >> 8);
        bArr[i10 + 3] = (byte) i11;
    }

    public static final <T> T c(int i10, @NotNull Function1<? super byte[], ? extends T> block) {
        Intrinsics.checkNotNullParameter(block, "block");
        return block.invoke(new byte[i10]);
    }
}
