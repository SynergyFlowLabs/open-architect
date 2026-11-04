package androidx.compose.ui.layout;

import com.sun.jna.Callback;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes2.dex */
final class OnLayoutRectChangedElement extends androidx.compose.ui.node.e1<t1> {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final long f39226c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final long f39227d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    @NotNull
    private final Function1<androidx.compose.ui.spatial.h, Unit> f39228e;

    /* JADX WARN: Multi-variable type inference failed */
    public OnLayoutRectChangedElement(long j10, long j11, @NotNull Function1<? super androidx.compose.ui.spatial.h, Unit> function1) {
        this.f39226c = j10;
        this.f39227d = j11;
        this.f39228e = function1;
    }

    @Override // androidx.compose.ui.node.e1
    public boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof OnLayoutRectChangedElement)) {
            return false;
        }
        OnLayoutRectChangedElement onLayoutRectChangedElement = (OnLayoutRectChangedElement) obj;
        return this.f39226c == onLayoutRectChangedElement.f39226c && this.f39227d == onLayoutRectChangedElement.f39227d && this.f39228e == onLayoutRectChangedElement.f39228e;
    }

    @Override // androidx.compose.ui.node.e1
    public int hashCode() {
        return (((Long.hashCode(this.f39226c) * 31) + Long.hashCode(this.f39227d)) * 31) + this.f39228e.hashCode();
    }

    @Override // androidx.compose.ui.node.e1
    public void j(@NotNull androidx.compose.ui.platform.t2 t2Var) {
        t2Var.d("onRectChanged");
        t2Var.b().c("throttleMillis", Long.valueOf(this.f39226c));
        t2Var.b().c("debounceMillis", Long.valueOf(this.f39227d));
        t2Var.b().c(Callback.METHOD_NAME, this.f39228e);
    }

    @Override // androidx.compose.ui.node.e1
    @NotNull
    /* JADX INFO: renamed from: l, reason: merged with bridge method [inline-methods] */
    public t1 a() {
        return new t1(this.f39226c, this.f39227d, this.f39228e);
    }

    @NotNull
    public final Function1<androidx.compose.ui.spatial.h, Unit> m() {
        return this.f39228e;
    }

    public final long n() {
        return this.f39227d;
    }

    public final long o() {
        return this.f39226c;
    }

    @Override // androidx.compose.ui.node.e1
    /* JADX INFO: renamed from: p, reason: merged with bridge method [inline-methods] */
    public void k(@NotNull t1 t1Var) {
        t1Var.D9(this.f39226c);
        t1Var.B9(this.f39227d);
        t1Var.A9(this.f39228e);
        t1Var.v9();
    }
}
