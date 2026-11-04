package kotlinx.serialization.json.io.internal;

import kotlin.jvm.internal.Intrinsics;
import kotlinx.io.c0;
import kotlinx.io.i0;
import kotlinx.serialization.json.internal.InternalJsonReaderCodePointImpl;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes13.dex */
public final class IoSerialReader extends InternalJsonReaderCodePointImpl {

    @NotNull
    private final c0 source;

    public IoSerialReader(@NotNull c0 source) {
        Intrinsics.checkNotNullParameter(source, "source");
        this.source = source;
    }

    @Override // kotlinx.serialization.json.internal.InternalJsonReaderCodePointImpl
    public boolean exhausted() {
        return this.source.y1();
    }

    @Override // kotlinx.serialization.json.internal.InternalJsonReaderCodePointImpl
    public int nextCodePoint() {
        return i0.e(this.source);
    }
}
