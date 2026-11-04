package androidx.compose.ui.graphics;

import android.graphics.ColorSpace;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes2.dex */
@androidx.annotation.w0(34)
final class f1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    public static final f1 f37762a = new f1();

    private f1() {
    }

    @oj.n
    @Nullable
    public static final ColorSpace a(@NotNull androidx.compose.ui.graphics.colorspace.c cVar) {
        androidx.compose.ui.graphics.colorspace.k kVar = androidx.compose.ui.graphics.colorspace.k.f37611a;
        if (Intrinsics.areEqual(cVar, kVar.q())) {
            return ColorSpace.get(ColorSpace.Named.BT2020_HLG);
        }
        if (Intrinsics.areEqual(cVar, kVar.s())) {
            return ColorSpace.get(ColorSpace.Named.BT2020_PQ);
        }
        return null;
    }

    @oj.n
    @NotNull
    public static final androidx.compose.ui.graphics.colorspace.c b(int i10) {
        if (i10 == ColorSpace.Named.BT2020_HLG.ordinal()) {
            return androidx.compose.ui.graphics.colorspace.k.f37611a.q();
        }
        return i10 == ColorSpace.Named.BT2020_PQ.ordinal() ? androidx.compose.ui.graphics.colorspace.k.f37611a.s() : androidx.compose.ui.graphics.colorspace.k.f37611a.N();
    }
}
