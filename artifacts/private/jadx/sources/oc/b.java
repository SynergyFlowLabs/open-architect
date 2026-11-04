package oc;

import java.nio.ByteBuffer;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes7.dex */
public final class b {
    @NotNull
    public static final ByteBuffer a(@NotNull ByteBuffer byteBuffer, @NotNull a v10) {
        Intrinsics.checkNotNullParameter(byteBuffer, "<this>");
        Intrinsics.checkNotNullParameter(v10, "v");
        byteBuffer.putFloat(v10.h());
        byteBuffer.putFloat(v10.i());
        byteBuffer.putFloat(v10.j());
        byteBuffer.putInt(v10.g());
        return byteBuffer;
    }
}
