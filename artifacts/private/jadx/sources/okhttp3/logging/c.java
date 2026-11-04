package okhttp3.logging;

import java.io.EOFException;
import kotlin.jvm.internal.Intrinsics;
import kotlin.ranges.r;
import okio.l;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes8.dex */
public final class c {
    public static final boolean a(@NotNull l lVar) {
        Intrinsics.checkNotNullParameter(lVar, "<this>");
        try {
            l lVar2 = new l();
            lVar.o(lVar2, 0L, r.C(lVar.size(), 64L));
            for (int i10 = 0; i10 < 16 && !lVar2.y1(); i10++) {
                int iK7 = lVar2.k7();
                if (Character.isISOControl(iK7) && !Character.isWhitespace(iK7)) {
                    return false;
                }
            }
            return true;
        } catch (EOFException unused) {
            return false;
        }
    }
}
