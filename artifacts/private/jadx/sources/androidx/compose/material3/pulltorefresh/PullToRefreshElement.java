package androidx.compose.material3.pulltorefresh;

import androidx.compose.runtime.internal.w0;
import androidx.compose.ui.node.e1;
import androidx.compose.ui.platform.t2;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes.dex */
@w0(parameters = 1)
public final class PullToRefreshElement extends e1<q> {

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public static final int f31884h = 0;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final boolean f31885c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @NotNull
    private final Function0<Unit> f31886d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final boolean f31887e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    @NotNull
    private final r f31888f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private final float f31889g;

    public /* synthetic */ PullToRefreshElement(boolean z10, Function0 function0, boolean z11, r rVar, float f10, DefaultConstructorMarker defaultConstructorMarker) {
        this(z10, function0, z11, rVar, f10);
    }

    @Override // androidx.compose.ui.node.e1
    public boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof PullToRefreshElement)) {
            return false;
        }
        PullToRefreshElement pullToRefreshElement = (PullToRefreshElement) obj;
        return this.f31885c == pullToRefreshElement.f31885c && this.f31887e == pullToRefreshElement.f31887e && this.f31886d == pullToRefreshElement.f31886d && Intrinsics.areEqual(this.f31888f, pullToRefreshElement.f31888f) && androidx.compose.ui.unit.h.x(this.f31889g, pullToRefreshElement.f31889g);
    }

    @Override // androidx.compose.ui.node.e1
    public int hashCode() {
        return (((((((Boolean.hashCode(this.f31885c) * 31) + Boolean.hashCode(this.f31887e)) * 31) + this.f31886d.hashCode()) * 31) + this.f31888f.hashCode()) * 31) + androidx.compose.ui.unit.h.D(this.f31889g);
    }

    @Override // androidx.compose.ui.node.e1
    public void j(@NotNull t2 t2Var) {
        t2Var.d("PullToRefreshModifierNode");
        t2Var.b().c("isRefreshing", Boolean.valueOf(this.f31885c));
        t2Var.b().c("onRefresh", this.f31886d);
        t2Var.b().c("enabled", Boolean.valueOf(this.f31887e));
        t2Var.b().c("state", this.f31888f);
        t2Var.b().c("threshold", androidx.compose.ui.unit.h.o(this.f31889g));
    }

    @Override // androidx.compose.ui.node.e1
    @NotNull
    /* JADX INFO: renamed from: l, reason: merged with bridge method [inline-methods] */
    public q a() {
        return new q(this.f31885c, this.f31886d, this.f31887e, this.f31888f, this.f31889g, null);
    }

    public final boolean m() {
        return this.f31887e;
    }

    @NotNull
    public final Function0<Unit> n() {
        return this.f31886d;
    }

    @NotNull
    public final r o() {
        return this.f31888f;
    }

    public final float p() {
        return this.f31889g;
    }

    public final boolean q() {
        return this.f31885c;
    }

    @Override // androidx.compose.ui.node.e1
    /* JADX INFO: renamed from: r, reason: merged with bridge method [inline-methods] */
    public void k(@NotNull q qVar) {
        qVar.ca(this.f31886d);
        qVar.ba(this.f31887e);
        qVar.ea(this.f31888f);
        qVar.fa(this.f31889g);
        boolean zY9 = qVar.Y9();
        boolean z10 = this.f31885c;
        if (zY9 != z10) {
            qVar.da(z10);
            qVar.ha();
        }
    }

    private PullToRefreshElement(boolean z10, Function0<Unit> function0, boolean z11, r rVar, float f10) {
        this.f31885c = z10;
        this.f31886d = function0;
        this.f31887e = z11;
        this.f31888f = rVar;
        this.f31889g = f10;
    }
}
