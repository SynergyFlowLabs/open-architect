package i0;

import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes.dex */
public final class d {
    public static final void a(int i10, @NotNull Function2<? super Integer, ? super Integer, Unit> function2) {
        int i11 = 0;
        while (i10 != 0) {
            int iLowestOneBit = Integer.lowestOneBit(i10);
            function2.invoke(Integer.valueOf(iLowestOneBit), Integer.valueOf(i11));
            i11++;
            i10 ^= iLowestOneBit;
        }
    }
}
