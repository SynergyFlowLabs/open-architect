package kotlinx.serialization.json.internal;

import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes13.dex */
public final class CharArrayPool extends CharArrayPoolBase {

    @NotNull
    public static final CharArrayPool INSTANCE = new CharArrayPool();

    private CharArrayPool() {
    }

    public final void release(@NotNull char[] array) {
        Intrinsics.checkNotNullParameter(array, "array");
        releaseImpl(array);
    }

    @NotNull
    public final char[] take() {
        return super.take(128);
    }
}
