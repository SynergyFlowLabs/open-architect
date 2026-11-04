package kotlinx.serialization.json.internal;

import kotlin.Unit;
import kotlin.collections.ArrayDeque;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes13.dex */
@SourceDebugExtension({"SMAP\nArrayPools.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ArrayPools.kt\nkotlinx/serialization/json/internal/ByteArrayPoolBase\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,90:1\n1#2:91\n*E\n"})
public class ByteArrayPoolBase {

    @NotNull
    private final ArrayDeque<byte[]> arrays = new ArrayDeque<>();
    private int bytesTotal;

    protected final void releaseImpl(@NotNull byte[] array) {
        Intrinsics.checkNotNullParameter(array, "array");
        synchronized (this) {
            try {
                if (this.bytesTotal + array.length < ArrayPoolsKt.MAX_CHARS_IN_POOL) {
                    this.bytesTotal += array.length / 2;
                    this.arrays.addLast(array);
                }
                Unit unit = Unit.f312394a;
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    @NotNull
    protected final byte[] take(int i10) {
        byte[] bArrRemoveLastOrNull;
        synchronized (this) {
            bArrRemoveLastOrNull = this.arrays.removeLastOrNull();
            if (bArrRemoveLastOrNull != null) {
                this.bytesTotal -= bArrRemoveLastOrNull.length / 2;
            } else {
                bArrRemoveLastOrNull = null;
            }
        }
        return bArrRemoveLastOrNull == null ? new byte[i10] : bArrRemoveLastOrNull;
    }
}
