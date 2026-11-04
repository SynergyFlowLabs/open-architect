package androidx.compose.foundation.text.input.internal;

import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes.dex */
@SourceDebugExtension({"SMAP\nMathUtils.kt\nKotlin\n*S Kotlin\n*F\n+ 1 MathUtils.kt\nandroidx/compose/foundation/text/input/internal/MathUtilsKt\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,62:1\n1#2:63\n*E\n"})
public final class f4 {
    public static final int a(int i10, int i11, @NotNull Function0<Integer> function0) {
        int i12 = i10 + i11;
        return ((i10 ^ i12) & (i11 ^ i12)) < 0 ? function0.invoke().intValue() : i12;
    }

    private static final float b(long j10, n0.j jVar) {
        if (androidx.compose.foundation.text.selection.n2.d(jVar, j10)) {
            return 0.0f;
        }
        float fN = n0.g.n(n0.g.v(jVar.E(), j10));
        if (fN >= Float.MAX_VALUE) {
            fN = Float.MAX_VALUE;
        }
        float fN2 = n0.g.n(n0.g.v(jVar.F(), j10));
        if (fN2 < fN) {
            fN = fN2;
        }
        float fN3 = n0.g.n(n0.g.v(jVar.m(), j10));
        if (fN3 < fN) {
            fN = fN3;
        }
        float fN4 = n0.g.n(n0.g.v(jVar.n(), j10));
        return fN4 < fN ? fN4 : fN;
    }

    public static final int c(long j10, @NotNull n0.j jVar, @NotNull n0.j jVar2) {
        float fB = b(j10, jVar);
        float fB2 = b(j10, jVar2);
        if (fB == fB2) {
            return 0;
        }
        return fB < fB2 ? -1 : 1;
    }

    public static final int d(int i10, int i11, @NotNull Function0<Integer> function0) {
        int i12 = i10 - i11;
        return ((i10 ^ i12) & (i11 ^ i10)) < 0 ? function0.invoke().intValue() : i12;
    }
}
