package klipper;

import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes11.dex */
public final class v {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private int f312366a = -1;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private boolean f312367b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private boolean f312368c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @Nullable
    private v f312369d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    @Nullable
    private u f312370e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    @Nullable
    private u f312371f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    @Nullable
    private x f312372g;

    public final double a() {
        u uVar = this.f312370e;
        if (uVar != null) {
            return uVar.a();
        }
        return 0.0d;
    }

    @Nullable
    public final u b() {
        return this.f312371f;
    }

    @Nullable
    public final v c() {
        return this.f312369d;
    }

    public final int d() {
        return this.f312366a;
    }

    @Nullable
    public final x e() {
        return this.f312372g;
    }

    @Nullable
    public final u f() {
        return this.f312370e;
    }

    public final boolean g() {
        return this.f312367b;
    }

    public final boolean h() {
        return this.f312368c;
    }

    public final boolean i(@NotNull v outRec2) {
        Intrinsics.checkNotNullParameter(outRec2, "outRec2");
        do {
            Intrinsics.checkNotNull(this);
            this = this.f312369d;
            if (Intrinsics.areEqual(this, outRec2)) {
                return true;
            }
        } while (this != null);
        return false;
    }

    public final void j(@Nullable u uVar) {
        this.f312371f = uVar;
    }

    public final void k(@Nullable v vVar) {
        this.f312369d = vVar;
    }

    public final void l(boolean z10) {
        this.f312367b = z10;
    }

    public final void m(int i10) {
        this.f312366a = i10;
    }

    public final void n(boolean z10) {
        this.f312368c = z10;
    }

    public final void o(@Nullable x xVar) {
        this.f312372g = xVar;
    }

    public final void p(@Nullable u uVar) {
        this.f312370e = uVar;
    }

    public final void q() {
        u uVarG = this.f312370e;
        Intrinsics.checkNotNull(uVarG);
        do {
            uVarG.k(this.f312366a);
            uVarG = uVarG.g();
        } while (!Intrinsics.areEqual(uVarG, this.f312370e));
    }
}
