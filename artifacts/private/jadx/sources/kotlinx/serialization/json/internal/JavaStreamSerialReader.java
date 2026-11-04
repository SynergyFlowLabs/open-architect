package kotlinx.serialization.json.internal;

import java.io.InputStream;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.Charsets;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes13.dex */
public final class JavaStreamSerialReader implements InternalJsonReader {

    @NotNull
    private final CharsetReader reader;

    public JavaStreamSerialReader(@NotNull InputStream stream) {
        Intrinsics.checkNotNullParameter(stream, "stream");
        this.reader = new CharsetReader(stream, Charsets.UTF_8);
    }

    @Override // kotlinx.serialization.json.internal.InternalJsonReader
    public int read(@NotNull char[] buffer, int i10, int i11) {
        Intrinsics.checkNotNullParameter(buffer, "buffer");
        return this.reader.read(buffer, i10, i11);
    }

    public final void release() {
        this.reader.release();
    }
}
