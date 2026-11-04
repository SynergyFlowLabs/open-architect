package kotlinx.io;

import kotlin.a1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes12.dex */
public final class c {
    @a1
    public static final /* synthetic */ <T> T a(b bVar, long j10, Function2<? super t, ? super Long, ? extends T> lambda) {
        Intrinsics.checkNotNullParameter(bVar, "<this>");
        Intrinsics.checkNotNullParameter(lambda, "lambda");
        if (bVar.g() == null) {
            return lambda.invoke(null, -1L);
        }
        if (bVar.j() - j10 < j10) {
            t tVarO = bVar.o();
            long j11 = bVar.j();
            while (tVarO != null && j11 > j10) {
                j11 -= (long) (tVarO.d() - tVarO.h());
                if (j11 <= j10) {
                    break;
                }
                tVarO = tVarO.j();
            }
            return lambda.invoke(tVarO, Long.valueOf(j11));
        }
        t tVarG = bVar.g();
        long j12 = 0;
        while (tVarG != null) {
            long jD = ((long) (tVarG.d() - tVarG.h())) + j12;
            if (jD > j10) {
                break;
            }
            tVarG = tVarG.f();
            j12 = jD;
        }
        return lambda.invoke(tVarG, Long.valueOf(j12));
    }
}
