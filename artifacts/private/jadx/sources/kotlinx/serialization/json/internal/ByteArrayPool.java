package kotlinx.serialization.json.internal;

import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes13.dex */
public final class ByteArrayPool extends ByteArrayPoolBase {

    @NotNull
    public static final ByteArrayPool INSTANCE = new ByteArrayPool();

    private ByteArrayPool() {
    }

    public final void release(@NotNull byte[] array) {
        Intrinsics.checkNotNullParameter(array, "array");
        releaseImpl(array);
    }

    @NotNull
    public final byte[] take() {
        return super.take(512);
    }
}
