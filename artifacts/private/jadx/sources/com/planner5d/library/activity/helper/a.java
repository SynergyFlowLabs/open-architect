package com.planner5d.library.activity.helper;

import android.content.Intent;
import android.os.Bundle;
import androidx.appcompat.app.d;
import com.planner5d.library.model.manager.v4;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import rx.Subscriber;

/* JADX INFO: loaded from: classes6.dex */
@androidx.compose.runtime.internal.w0(parameters = 0)
public abstract class a<T extends androidx.appcompat.app.d> implements com.planner5d.library.model.manager.initialization.a<T> {

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public static final int f136661n = 8;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @ij.a
    public u f136662a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @ij.a
    public i0 f136663b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @ij.a
    public v4 f136664c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @ij.a
    public fg.e<com.planner5d.library.model.manager.t1> f136665d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    @ij.a
    public com.planner5d.library.modules.user.user.t f136666e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    @ij.a
    public com.planner5d.library.modules.user.user.y0 f136667f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    @ij.a
    public com.planner5d.library.model.manager.statistics.b0 f136668g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    @ij.a
    public com.planner5d.library.model.manager.synchronization.i f136669h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    @ij.a
    public com.planner5d.library.model.manager.builtin.n f136670i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    @ij.a
    public com.planner5d.library.model.manager.config.j f136671j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    @ij.a
    public com.planner5d.library.modules.user.user.g1 f136672k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    @ij.a
    public com.planner5d.library.services.utility.c2 f136673l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    @Nullable
    private T f136674m;

    protected final void A(@Nullable T t10) {
        this.f136674m = t10;
    }

    public final void B(@NotNull com.planner5d.library.model.manager.builtin.n nVar) {
        Intrinsics.checkNotNullParameter(nVar, "<set-?>");
        this.f136670i = nVar;
    }

    public final void C(@NotNull com.planner5d.library.model.manager.config.j jVar) {
        Intrinsics.checkNotNullParameter(jVar, "<set-?>");
        this.f136671j = jVar;
    }

    public final void D(@NotNull u uVar) {
        Intrinsics.checkNotNullParameter(uVar, "<set-?>");
        this.f136662a = uVar;
    }

    public final void E(@NotNull i0 i0Var) {
        Intrinsics.checkNotNullParameter(i0Var, "<set-?>");
        this.f136663b = i0Var;
    }

    public final void F(@NotNull fg.e<com.planner5d.library.model.manager.t1> eVar) {
        Intrinsics.checkNotNullParameter(eVar, "<set-?>");
        this.f136665d = eVar;
    }

    public final void G(@NotNull com.planner5d.library.services.utility.c2 c2Var) {
        Intrinsics.checkNotNullParameter(c2Var, "<set-?>");
        this.f136673l = c2Var;
    }

    public final void H(@NotNull com.planner5d.library.model.manager.statistics.b0 b0Var) {
        Intrinsics.checkNotNullParameter(b0Var, "<set-?>");
        this.f136668g = b0Var;
    }

    public final void I(@NotNull v4 v4Var) {
        Intrinsics.checkNotNullParameter(v4Var, "<set-?>");
        this.f136664c = v4Var;
    }

    public final void J(@NotNull com.planner5d.library.model.manager.synchronization.i iVar) {
        Intrinsics.checkNotNullParameter(iVar, "<set-?>");
        this.f136669h = iVar;
    }

    public final void K(@NotNull com.planner5d.library.modules.user.user.t tVar) {
        Intrinsics.checkNotNullParameter(tVar, "<set-?>");
        this.f136666e = tVar;
    }

    public final void L(@NotNull com.planner5d.library.modules.user.user.y0 y0Var) {
        Intrinsics.checkNotNullParameter(y0Var, "<set-?>");
        this.f136667f = y0Var;
    }

    public final void M(@NotNull com.planner5d.library.modules.user.user.g1 g1Var) {
        Intrinsics.checkNotNullParameter(g1Var, "<set-?>");
        this.f136672k = g1Var;
    }

    @Override // com.planner5d.library.model.manager.initialization.a
    public void a() {
        u().o();
    }

    @Override // com.planner5d.library.model.manager.initialization.a
    public void b() {
        r().e();
    }

    @Override // com.planner5d.library.model.manager.initialization.a
    public void c(@NotNull Intent intent) {
        Intrinsics.checkNotNullParameter(intent, "intent");
        u().k(intent);
    }

    @Override // com.planner5d.library.model.manager.initialization.a
    public void d() {
        u().l(this.f136674m);
    }

    @Override // com.planner5d.library.model.manager.initialization.a
    public void e(int i10, int i11, @Nullable Intent intent) {
    }

    @Override // com.planner5d.library.model.manager.initialization.a
    public void i(@NotNull T activity, @Nullable Bundle bundle) {
        Intrinsics.checkNotNullParameter(activity, "activity");
        this.f136674m = activity;
        q().c(activity, activity);
        r().g(activity);
        v().o().subscribe((Subscriber<? super Void>) new com.planner5d.library.services.rx.e());
        s().get().o().subscribe((Subscriber<? super Void>) new com.planner5d.library.services.rx.e());
        x().W();
        y().m();
        u().j(activity);
        w().u();
        o().t();
    }

    @Override // com.planner5d.library.model.manager.initialization.a
    public void l() {
        q().e();
        u().m(this.f136674m);
    }

    @Override // com.planner5d.library.model.manager.initialization.a
    public void m() {
        u().n();
    }

    @Nullable
    protected final T n() {
        return this.f136674m;
    }

    @NotNull
    public final com.planner5d.library.model.manager.builtin.n o() {
        com.planner5d.library.model.manager.builtin.n nVar = this.f136670i;
        if (nVar != null) {
            return nVar;
        }
        Intrinsics.throwUninitializedPropertyAccessException("dataManager");
        return null;
    }

    @NotNull
    public final com.planner5d.library.model.manager.config.j p() {
        com.planner5d.library.model.manager.config.j jVar = this.f136671j;
        if (jVar != null) {
            return jVar;
        }
        Intrinsics.throwUninitializedPropertyAccessException("featureConfigManager");
        return null;
    }

    @NotNull
    public final u q() {
        u uVar = this.f136662a;
        if (uVar != null) {
            return uVar;
        }
        Intrinsics.throwUninitializedPropertyAccessException("helperActivity");
        return null;
    }

    @NotNull
    public final i0 r() {
        i0 i0Var = this.f136663b;
        if (i0Var != null) {
            return i0Var;
        }
        Intrinsics.throwUninitializedPropertyAccessException("helperLicensing");
        return null;
    }

    @NotNull
    public final fg.e<com.planner5d.library.model.manager.t1> s() {
        fg.e<com.planner5d.library.model.manager.t1> eVar = this.f136665d;
        if (eVar != null) {
            return eVar;
        }
        Intrinsics.throwUninitializedPropertyAccessException("logRecordManager");
        return null;
    }

    @NotNull
    public final com.planner5d.library.services.utility.c2 t() {
        com.planner5d.library.services.utility.c2 c2Var = this.f136673l;
        if (c2Var != null) {
            return c2Var;
        }
        Intrinsics.throwUninitializedPropertyAccessException("networkStateUtility");
        return null;
    }

    @NotNull
    public final com.planner5d.library.model.manager.statistics.b0 u() {
        com.planner5d.library.model.manager.statistics.b0 b0Var = this.f136668g;
        if (b0Var != null) {
            return b0Var;
        }
        Intrinsics.throwUninitializedPropertyAccessException("statisticsManager");
        return null;
    }

    @NotNull
    public final v4 v() {
        v4 v4Var = this.f136664c;
        if (v4Var != null) {
            return v4Var;
        }
        Intrinsics.throwUninitializedPropertyAccessException("supportRepository");
        return null;
    }

    @NotNull
    public final com.planner5d.library.model.manager.synchronization.i w() {
        com.planner5d.library.model.manager.synchronization.i iVar = this.f136669h;
        if (iVar != null) {
            return iVar;
        }
        Intrinsics.throwUninitializedPropertyAccessException("synchronizationManager");
        return null;
    }

    @NotNull
    public final com.planner5d.library.modules.user.user.t x() {
        com.planner5d.library.modules.user.user.t tVar = this.f136666e;
        if (tVar != null) {
            return tVar;
        }
        Intrinsics.throwUninitializedPropertyAccessException("userAuthorization");
        return null;
    }

    @NotNull
    public final com.planner5d.library.modules.user.user.y0 y() {
        com.planner5d.library.modules.user.user.y0 y0Var = this.f136667f;
        if (y0Var != null) {
            return y0Var;
        }
        Intrinsics.throwUninitializedPropertyAccessException("userRemember");
        return null;
    }

    @NotNull
    public final com.planner5d.library.modules.user.user.g1 z() {
        com.planner5d.library.modules.user.user.g1 g1Var = this.f136672k;
        if (g1Var != null) {
            return g1Var;
        }
        Intrinsics.throwUninitializedPropertyAccessException("userSocial");
        return null;
    }
}
