package androidx.compose.animation;

import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes.dex */
final class h1 implements g1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final boolean f13516a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NotNull
    private final Function2<androidx.compose.ui.unit.u, androidx.compose.ui.unit.u, androidx.compose.animation.core.y0<androidx.compose.ui.unit.u>> f13517b;

    /* JADX WARN: Multi-variable type inference failed */
    public h1(boolean z10, @NotNull Function2<? super androidx.compose.ui.unit.u, ? super androidx.compose.ui.unit.u, ? extends androidx.compose.animation.core.y0<androidx.compose.ui.unit.u>> function2) {
        this.f13516a = z10;
        this.f13517b = function2;
    }

    @NotNull
    public final Function2<androidx.compose.ui.unit.u, androidx.compose.ui.unit.u, androidx.compose.animation.core.y0<androidx.compose.ui.unit.u>> a() {
        return this.f13517b;
    }

    @Override // androidx.compose.animation.g1
    public boolean b() {
        return this.f13516a;
    }

    @Override // androidx.compose.animation.g1
    @NotNull
    public androidx.compose.animation.core.y0<androidx.compose.ui.unit.u> c(long j10, long j11) {
        return this.f13517b.invoke(androidx.compose.ui.unit.u.b(j10), androidx.compose.ui.unit.u.b(j11));
    }

    public /* synthetic */ h1(boolean z10, Function2 function2, int i10, DefaultConstructorMarker defaultConstructorMarker) {
        this((i10 & 1) != 0 ? true : z10, function2);
    }
}
