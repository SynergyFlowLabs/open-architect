package androidx.compose.material3;

import kotlin.Unit;
import kotlin.jvm.internal.DefaultConstructorMarker;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes.dex */
final class cj implements n90 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final boolean f26778a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final boolean f26779b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @NotNull
    private final androidx.compose.animation.core.w1<Boolean> f26780c;

    /* JADX WARN: Illegal instructions before constructor call */
    public cj() {
        boolean z10 = false;
        this(z10, z10, 3, null);
    }

    @Override // androidx.compose.material3.n90
    public void a() {
    }

    @Override // androidx.compose.material3.n90
    @NotNull
    public androidx.compose.animation.core.w1<Boolean> b() {
        return this.f26780c;
    }

    @Override // androidx.compose.material3.n90
    @Nullable
    public Object c(@NotNull androidx.compose.foundation.q3 q3Var, @NotNull kotlin.coroutines.d<? super Unit> dVar) {
        return Unit.f312394a;
    }

    @Override // androidx.compose.material3.n90
    public boolean d() {
        return this.f26779b;
    }

    @Override // androidx.compose.material3.n90
    public void dismiss() {
    }

    @Override // androidx.compose.material3.n90
    public boolean isVisible() {
        return this.f26778a;
    }

    public cj(boolean z10, boolean z11) {
        this.f26778a = z10;
        this.f26779b = z11;
        this.f26780c = new androidx.compose.animation.core.w1<>(Boolean.FALSE);
    }

    public /* synthetic */ cj(boolean z10, boolean z11, int i10, DefaultConstructorMarker defaultConstructorMarker) {
        this((i10 & 1) != 0 ? true : z10, (i10 & 2) != 0 ? true : z11);
    }
}
