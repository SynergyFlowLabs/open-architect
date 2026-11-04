package kotlinx.serialization.json.io.internal;

import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlinx.io.i0;
import kotlinx.io.x;
import kotlinx.serialization.json.internal.InternalJsonWriter;
import kotlinx.serialization.json.internal.StringOpsKt;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes13.dex */
@SourceDebugExtension({"SMAP\nIoJsonStreams.kt\nKotlin\n*S Kotlin\n*F\n+ 1 IoJsonStreams.kt\nkotlinx/serialization/json/io/internal/JsonToIoStreamWriter\n+ 2 JsonStreams.kt\nkotlinx/serialization/json/internal/InternalJsonWriter$Companion\n*L\n1#1,41:1\n20#2,12:42\n*S KotlinDebug\n*F\n+ 1 IoJsonStreams.kt\nkotlinx/serialization/json/io/internal/JsonToIoStreamWriter\n*L\n28#1:42,12\n*E\n"})
public final class JsonToIoStreamWriter implements InternalJsonWriter {

    @NotNull
    private final x sink;

    public JsonToIoStreamWriter(@NotNull x sink) {
        Intrinsics.checkNotNullParameter(sink, "sink");
        this.sink = sink;
    }

    @Override // kotlinx.serialization.json.internal.InternalJsonWriter
    public void release() {
    }

    @Override // kotlinx.serialization.json.internal.InternalJsonWriter
    public void write(@NotNull String text) {
        Intrinsics.checkNotNullParameter(text, "text");
        i0.r(this.sink, text, 0, 0, 6, null);
    }

    @Override // kotlinx.serialization.json.internal.InternalJsonWriter
    public void writeChar(char c10) {
        i0.n(this.sink, c10);
    }

    @Override // kotlinx.serialization.json.internal.InternalJsonWriter
    public void writeLong(long j10) {
        write(String.valueOf(j10));
    }

    @Override // kotlinx.serialization.json.internal.InternalJsonWriter
    public void writeQuoted(@NotNull String text) {
        Intrinsics.checkNotNullParameter(text, "text");
        i0.n(this.sink, 34);
        int length = text.length();
        int i10 = 0;
        for (int i11 = 0; i11 < length; i11++) {
            char cCharAt = text.charAt(i11);
            if (cCharAt < StringOpsKt.getESCAPE_STRINGS().length && StringOpsKt.getESCAPE_STRINGS()[cCharAt] != null) {
                i0.p(this.sink, text, i10, i11);
                String str = StringOpsKt.getESCAPE_STRINGS()[cCharAt];
                Intrinsics.checkNotNull(str);
                i0.p(this.sink, str, 0, str.length());
                i10 = i11 + 1;
            }
        }
        i0.p(this.sink, text, i10, text.length());
        i0.n(this.sink, 34);
    }
}
