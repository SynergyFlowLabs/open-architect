package androidx.compose.material3.carousel;

import kotlin.collections.CollectionsKt;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes.dex */
public final class t0 {

    public static final class a implements androidx.compose.foundation.gestures.snapping.o {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ b0 f26683a;

        a(b0 b0Var) {
            this.f26683a = b0Var;
        }

        @Override // androidx.compose.foundation.gestures.snapping.o
        public int a(int i10, int i11, int i12, int i13, int i14, int i15) {
            return t0.b(this.f26683a.b(), i14, i15);
        }
    }

    @NotNull
    public static final androidx.compose.foundation.gestures.snapping.o a(@NotNull b0 b0Var) {
        return new a(b0Var);
    }

    public static final int b(@NotNull y0 y0Var, int i10, int i11) {
        if (!y0Var.l()) {
            return 0;
        }
        int iL0 = kotlin.math.b.L0(y0Var.e().s().m() - (y0Var.g() / 2.0f));
        if (i10 <= CollectionsKt.getLastIndex(y0Var.k())) {
            iL0 = kotlin.math.b.L0(y0Var.k().get(kotlin.ranges.r.I(CollectionsKt.getLastIndex(y0Var.k()) - i10, 0, CollectionsKt.getLastIndex(y0Var.k()))).s().m() - (y0Var.g() / 2.0f));
        }
        int i12 = i11 - 1;
        if (i10 < i12 - CollectionsKt.getLastIndex(y0Var.f()) || i11 <= y0Var.e().w()) {
            return iL0;
        }
        return kotlin.math.b.L0(y0Var.f().get(kotlin.ranges.r.I(CollectionsKt.getLastIndex(y0Var.f()) - (i12 - i10), 0, CollectionsKt.getLastIndex(y0Var.f()))).s().m() - (y0Var.g() / 2.0f));
    }
}
