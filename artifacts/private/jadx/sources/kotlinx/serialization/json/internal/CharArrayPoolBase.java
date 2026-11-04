package kotlinx.serialization.json.internal;

import kotlin.Unit;
import kotlin.collections.ArrayDeque;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes13.dex */
@SourceDebugExtension({"SMAP\nArrayPools.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ArrayPools.kt\nkotlinx/serialization/json/internal/CharArrayPoolBase\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,90:1\n1#2:91\n*E\n"})
public class CharArrayPoolBase {

    @NotNull
    private final ArrayDeque<char[]> arrays = new ArrayDeque<>();
    private int charsTotal;

    protected final void releaseImpl(@NotNull char[] array) {
        Intrinsics.checkNotNullParameter(array, "array");
        synchronized (this) {
            try {
                if (this.charsTotal + array.length < ArrayPoolsKt.MAX_CHARS_IN_POOL) {
                    this.charsTotal += array.length;
                    this.arrays.addLast(array);
                }
                Unit unit = Unit.f312394a;
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    @NotNull
    protected final char[] take(int i10) {
        char[] cArrRemoveLastOrNull;
        synchronized (this) {
            try {
                cArrRemoveLastOrNull = this.arrays.removeLastOrNull();
                if (cArrRemoveLastOrNull != null) {
                    this.charsTotal -= cArrRemoveLastOrNull.length;
                } else {
                    cArrRemoveLastOrNull = null;
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
        return cArrRemoveLastOrNull == null ? new char[i10] : cArrRemoveLastOrNull;
    }
}
