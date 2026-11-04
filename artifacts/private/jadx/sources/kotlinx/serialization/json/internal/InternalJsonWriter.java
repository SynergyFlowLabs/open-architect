package kotlinx.serialization.json.internal;

import kotlin.Unit;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import pj.n;

/* JADX INFO: loaded from: classes13.dex */
@JsonFriendModuleApi
public interface InternalJsonWriter {

    @NotNull
    public static final Companion Companion = Companion.$$INSTANCE;

    public static final class Companion {
        static final /* synthetic */ Companion $$INSTANCE = new Companion();

        private Companion() {
        }

        public final void doWriteEscaping(@NotNull String text, @NotNull n<? super String, ? super Integer, ? super Integer, Unit> writeImpl) {
            Intrinsics.checkNotNullParameter(text, "text");
            Intrinsics.checkNotNullParameter(writeImpl, "writeImpl");
            int length = text.length();
            int i10 = 0;
            for (int i11 = 0; i11 < length; i11++) {
                char cCharAt = text.charAt(i11);
                if (cCharAt < StringOpsKt.getESCAPE_STRINGS().length && StringOpsKt.getESCAPE_STRINGS()[cCharAt] != null) {
                    writeImpl.invoke(text, Integer.valueOf(i10), Integer.valueOf(i11));
                    String str = StringOpsKt.getESCAPE_STRINGS()[cCharAt];
                    Intrinsics.checkNotNull(str);
                    writeImpl.invoke(str, 0, Integer.valueOf(str.length()));
                    i10 = i11 + 1;
                }
            }
            writeImpl.invoke(text, Integer.valueOf(i10), Integer.valueOf(text.length()));
        }
    }

    void release();

    void write(@NotNull String str);

    void writeChar(char c10);

    void writeLong(long j10);

    void writeQuoted(@NotNull String str);
}
