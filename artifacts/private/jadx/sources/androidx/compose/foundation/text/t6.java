package androidx.compose.foundation.text;

import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes.dex */
final class t6 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    private androidx.compose.ui.unit.w f21609a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NotNull
    private androidx.compose.ui.unit.d f21610b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @NotNull
    private androidx.compose.ui.text.font.y.b f21611c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @NotNull
    private androidx.compose.ui.text.y3 f21612d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    @NotNull
    private Object f21613e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private long f21614f = a();

    public t6(@NotNull androidx.compose.ui.unit.w wVar, @NotNull androidx.compose.ui.unit.d dVar, @NotNull androidx.compose.ui.text.font.y.b bVar, @NotNull androidx.compose.ui.text.y3 y3Var, @NotNull Object obj) {
        this.f21609a = wVar;
        this.f21610b = dVar;
        this.f21611c = bVar;
        this.f21612d = y3Var;
        this.f21613e = obj;
    }

    private final long a() {
        boolean z10 = false | false;
        return r5.b(this.f21612d, this.f21610b, this.f21611c, null, 0, 24, null);
    }

    @NotNull
    public final androidx.compose.ui.unit.d b() {
        return this.f21610b;
    }

    @NotNull
    public final androidx.compose.ui.text.font.y.b c() {
        return this.f21611c;
    }

    @NotNull
    public final androidx.compose.ui.unit.w d() {
        return this.f21609a;
    }

    public final long e() {
        return this.f21614f;
    }

    @NotNull
    public final androidx.compose.ui.text.y3 f() {
        return this.f21612d;
    }

    @NotNull
    public final Object g() {
        return this.f21613e;
    }

    public final void h(@NotNull androidx.compose.ui.unit.d dVar) {
        this.f21610b = dVar;
    }

    public final void i(@NotNull androidx.compose.ui.text.font.y.b bVar) {
        this.f21611c = bVar;
    }

    public final void j(@NotNull androidx.compose.ui.unit.w wVar) {
        this.f21609a = wVar;
    }

    public final void k(@NotNull androidx.compose.ui.text.y3 y3Var) {
        this.f21612d = y3Var;
    }

    public final void l(@NotNull Object obj) {
        this.f21613e = obj;
    }

    public final void m(@NotNull androidx.compose.ui.unit.w wVar, @NotNull androidx.compose.ui.unit.d dVar, @NotNull androidx.compose.ui.text.font.y.b bVar, @NotNull androidx.compose.ui.text.y3 y3Var, @NotNull Object obj) {
        if (wVar == this.f21609a && Intrinsics.areEqual(dVar, this.f21610b) && Intrinsics.areEqual(bVar, this.f21611c) && Intrinsics.areEqual(y3Var, this.f21612d) && Intrinsics.areEqual(obj, this.f21613e)) {
            return;
        }
        this.f21609a = wVar;
        this.f21610b = dVar;
        this.f21611c = bVar;
        this.f21612d = y3Var;
        this.f21613e = obj;
        this.f21614f = a();
    }
}
