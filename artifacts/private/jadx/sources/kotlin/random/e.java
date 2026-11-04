package kotlin.random;

import java.util.Random;
import kotlin.e1;
import kotlin.internal.m;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes11.dex */
public final class e {
    @e1(version = "1.3")
    @NotNull
    public static final Random a(@NotNull f fVar) {
        Random randomR;
        Intrinsics.checkNotNullParameter(fVar, "<this>");
        a aVar = fVar instanceof a ? (a) fVar : null;
        return (aVar == null || (randomR = aVar.r()) == null) ? new c(fVar) : randomR;
    }

    @e1(version = "1.3")
    @NotNull
    public static final f b(@NotNull Random random) {
        f fVarA;
        Intrinsics.checkNotNullParameter(random, "<this>");
        c cVar = random instanceof c ? (c) random : null;
        return (cVar == null || (fVarA = cVar.a()) == null) ? new d(random) : fVarA;
    }

    @kotlin.internal.f
    private static final f c() {
        return m.f312513a.b();
    }

    public static final double d(int i10, int i11) {
        return ((((long) i10) << 27) + ((long) i11)) / 9.007199254740992E15d;
    }
}
