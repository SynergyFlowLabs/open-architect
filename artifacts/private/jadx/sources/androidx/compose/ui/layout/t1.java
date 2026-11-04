package androidx.compose.ui.layout;

import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes2.dex */
final class t1 extends androidx.compose.ui.a0.d {

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    private long f39548s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    private long f39549t;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    @NotNull
    private Function1<? super androidx.compose.ui.spatial.h, Unit> f39550v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    @Nullable
    private androidx.compose.ui.node.j.a f39551w;

    public t1(long j10, long j11, @NotNull Function1<? super androidx.compose.ui.spatial.h, Unit> function1) {
        this.f39548s = j10;
        this.f39549t = j11;
        this.f39550v = function1;
    }

    public final void A9(@NotNull Function1<? super androidx.compose.ui.spatial.h, Unit> function1) {
        this.f39550v = function1;
    }

    public final void B9(long j10) {
        this.f39549t = j10;
    }

    public final void C9(@Nullable androidx.compose.ui.node.j.a aVar) {
        this.f39551w = aVar;
    }

    public final void D9(long j10) {
        this.f39548s = j10;
    }

    @Override // androidx.compose.ui.a0.d
    public void e9() {
        v9();
    }

    @Override // androidx.compose.ui.a0.d
    public void f9() {
        androidx.compose.ui.node.j.a aVar = this.f39551w;
        if (aVar != null) {
            aVar.a();
        }
        this.f39551w = null;
    }

    public final void v9() {
        androidx.compose.ui.node.j.a aVar = this.f39551w;
        if (aVar != null) {
            aVar.a();
        }
        this.f39551w = s1.c(this, this.f39548s, this.f39549t, this.f39550v);
    }

    @NotNull
    public final Function1<androidx.compose.ui.spatial.h, Unit> w9() {
        return this.f39550v;
    }

    public final long x9() {
        return this.f39549t;
    }

    @Nullable
    public final androidx.compose.ui.node.j.a y9() {
        return this.f39551w;
    }

    public final long z9() {
        return this.f39548s;
    }
}
