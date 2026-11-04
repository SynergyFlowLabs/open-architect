package androidx.compose.foundation.text.contextmenu.internal;

import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes.dex */
final class f0 implements androidx.compose.ui.window.s {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    private final androidx.compose.ui.window.s f18859a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @Nullable
    private androidx.compose.ui.unit.u f18860b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @Nullable
    private androidx.compose.ui.unit.w f18861c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @Nullable
    private androidx.compose.ui.unit.u f18862d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    @Nullable
    private androidx.compose.ui.unit.q f18863e;

    public f0(@NotNull androidx.compose.ui.window.s sVar) {
        this.f18859a = sVar;
    }

    @Override // androidx.compose.ui.window.s
    public long a(@NotNull androidx.compose.ui.unit.s sVar, long j10, @NotNull androidx.compose.ui.unit.w wVar, long j11) {
        androidx.compose.ui.unit.q qVar = this.f18863e;
        if (qVar != null) {
            androidx.compose.ui.unit.u uVar = this.f18860b;
            if ((uVar == null ? false : androidx.compose.ui.unit.u.h(uVar.q(), j10)) && this.f18861c == wVar) {
                androidx.compose.ui.unit.u uVar2 = this.f18862d;
                if (uVar2 != null ? androidx.compose.ui.unit.u.h(uVar2.q(), j11) : false) {
                    return qVar.x();
                }
            }
        }
        long jA = this.f18859a.a(sVar, j10, wVar, j11);
        this.f18860b = androidx.compose.ui.unit.u.b(j10);
        this.f18861c = wVar;
        this.f18862d = androidx.compose.ui.unit.u.b(j11);
        this.f18863e = androidx.compose.ui.unit.q.c(jA);
        return jA;
    }

    @NotNull
    public final androidx.compose.ui.window.s b() {
        return this.f18859a;
    }

    @Nullable
    public final androidx.compose.ui.unit.w c() {
        return this.f18861c;
    }

    @Nullable
    public final androidx.compose.ui.unit.u d() {
        return this.f18862d;
    }

    @Nullable
    public final androidx.compose.ui.unit.q e() {
        return this.f18863e;
    }

    @Nullable
    public final androidx.compose.ui.unit.u f() {
        return this.f18860b;
    }

    public final void g(@Nullable androidx.compose.ui.unit.w wVar) {
        this.f18861c = wVar;
    }

    public final void h(@Nullable androidx.compose.ui.unit.u uVar) {
        this.f18862d = uVar;
    }

    public final void i(@Nullable androidx.compose.ui.unit.q qVar) {
        this.f18863e = qVar;
    }

    public final void j(@Nullable androidx.compose.ui.unit.u uVar) {
        this.f18860b = uVar;
    }
}
