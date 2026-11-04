package kotlinx.serialization.encoding;

import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes12.dex */
@kotlinx.serialization.g
public interface c {
    @kotlinx.serialization.g
    void decodeStringChunked(@NotNull Function1<? super String, Unit> function1);
}
