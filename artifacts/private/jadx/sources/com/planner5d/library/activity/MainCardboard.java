package com.planner5d.library.activity;

import android.content.Intent;
import android.content.res.Configuration;
import android.os.Bundle;
import androidx.compose.runtime.internal.w0;
import com.google.vr.ndk.base.GvrApi;
import com.google.vr.sdk.base.GvrView;
import com.planner5d.library.activity.fragment.dialog.k;
import com.planner5d.library.activity.helper.b2;
import com.planner5d.library.services.r;
import com.planner5d.library.widget.editor.helper.s2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes5.dex */
@w0(parameters = 0)
@SourceDebugExtension({"SMAP\nMainCardboard.kt\nKotlin\n*S Kotlin\n*F\n+ 1 MainCardboard.kt\ncom/planner5d/library/activity/MainCardboard\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,174:1\n1#2:175\n*E\n"})
public final class MainCardboard extends com.planner5d.library.activity.b {

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public static final int f131466j = 8;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    @Nullable
    private com.planner5d.library.widget.editor.editor3dcardboard.d f131467e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    @Nullable
    private com.google.vr.sdk.controller.b f131468f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    @Nullable
    private com.google.vr.sdk.controller.a f131469g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    @ij.a
    public k f131470h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    @ij.a
    public com.planner5d.library.model.manager.initialization.d<MainCardboard, b2, com.planner5d.library.activity.helper.b<MainCardboard>> f131471i;

    private final class a extends com.google.vr.sdk.controller.a.d implements com.google.vr.sdk.controller.b.c {
        public a() {
        }

        @Override // com.google.vr.sdk.controller.b.c
        public void a() {
        }

        @Override // com.google.vr.sdk.controller.b.c
        public void b(int i10) {
        }

        @Override // com.google.vr.sdk.controller.a.d
        public void c(int i10) {
        }

        @Override // com.google.vr.sdk.controller.a.d
        public void d() {
            com.google.vr.sdk.controller.a aVar = MainCardboard.this.f131469g;
            if (aVar != null) {
                int i10 = 6 << 1;
                if (aVar.f127639g) {
                    MainCardboard.this.F();
                }
            }
        }
    }

    public static final class b extends GvrView {
        b(MainCardboard mainCardboard) {
            super(mainCardboard);
        }

        @Override // com.google.vr.sdk.base.GvrView
        public void d() {
        }

        @Override // com.google.vr.sdk.base.GvrView
        public void e() {
        }

        @Override // android.view.View
        public boolean isInEditMode() {
            return true;
        }

        @Override // com.google.vr.sdk.base.GvrView
        public void l() {
        }

        @Override // com.google.vr.sdk.base.GvrView
        public void setOnCardboardTriggerListener(Runnable runnable) {
        }
    }

    private final com.planner5d.library.model.manager.initialization.a<MainCardboard> N() {
        return O().c(this);
    }

    private final boolean P(GvrView gvrView) {
        try {
            GvrApi gvrApi = gvrView.getGvrApi();
            if (gvrApi != null && gvrApi.C() == 1) {
                return true;
            }
        } catch (Throwable unused) {
        }
        return false;
    }

    private final void S() {
        if (E() != null) {
            return;
        }
        super.G(new b(this));
    }

    @Override // com.planner5d.library.activity.b
    public void F() {
        N().j();
    }

    @Override // com.planner5d.library.activity.b
    public void G(@Nullable GvrView gvrView) {
        GvrView gvrViewE = E();
        if (!Intrinsics.areEqual(gvrViewE, gvrView)) {
            if (gvrViewE != null) {
                gvrViewE.setOnCardboardTriggerListener(null);
            }
            super.G(gvrView);
            boolean zP = gvrView != null ? P(gvrView) : false;
            if (zP) {
                com.google.vr.cardboard.a.j(this, true, 1);
                com.google.vr.cardboard.a.h(this, true);
            } else {
                com.google.vr.cardboard.a.j(this, false, 1);
                com.google.vr.cardboard.a.h(this, false);
            }
            if (gvrView != null) {
                gvrView.setMultisampling(zP ? 0 : 4);
                gvrView.setOnCardboardTriggerListener(new Runnable() { // from class: com.planner5d.library.activity.g
                    @Override // java.lang.Runnable
                    public final void run() {
                        this.f136658a.F();
                    }
                });
            }
        }
    }

    @NotNull
    public final k M() {
        k kVar = this.f131470h;
        if (kVar != null) {
            return kVar;
        }
        Intrinsics.throwUninitializedPropertyAccessException("dialogLauncher");
        return null;
    }

    @NotNull
    public final com.planner5d.library.model.manager.initialization.d<MainCardboard, b2, com.planner5d.library.activity.helper.b<MainCardboard>> O() {
        com.planner5d.library.model.manager.initialization.d<MainCardboard, b2, com.planner5d.library.activity.helper.b<MainCardboard>> dVar = this.f131471i;
        if (dVar != null) {
            return dVar;
        }
        Intrinsics.throwUninitializedPropertyAccessException("initializableHandler");
        return null;
    }

    public final void Q(@NotNull k kVar) {
        Intrinsics.checkNotNullParameter(kVar, "<set-?>");
        this.f131470h = kVar;
    }

    public final void R(@NotNull com.planner5d.library.model.manager.initialization.d<MainCardboard, b2, com.planner5d.library.activity.helper.b<MainCardboard>> dVar) {
        Intrinsics.checkNotNullParameter(dVar, "<set-?>");
        this.f131471i = dVar;
    }

    @Override // com.planner5d.library.activity.b, androidx.activity.l, android.app.Activity
    public void onBackPressed() {
        S();
        try {
            super.onBackPressed();
        } catch (IllegalStateException e10) {
            timber.log.b.f381052a.e(e10);
        }
    }

    @Override // androidx.appcompat.app.d, androidx.activity.l, android.app.Activity, android.content.ComponentCallbacks
    public void onConfigurationChanged(@NotNull Configuration newConfig) {
        Intrinsics.checkNotNullParameter(newConfig, "newConfig");
        super.onConfigurationChanged(newConfig);
        N().onConfigurationChanged(newConfig);
    }

    @Override // com.planner5d.library.activity.b, androidx.fragment.app.s, androidx.activity.l, androidx.core.app.m, android.app.Activity
    protected void onCreate(@Nullable Bundle bundle) {
        super.onCreate(bundle);
        setContentView(com.planner5d.library.f.m.C);
        a aVar = new a();
        com.google.vr.sdk.controller.b bVar = new com.google.vr.sdk.controller.b(this, aVar);
        this.f131468f = bVar;
        com.google.vr.sdk.controller.a aVarE = bVar.e();
        this.f131469g = aVarE;
        if (aVarE != null) {
            aVarE.k(aVar);
        }
        com.planner5d.library.application.b.f142455c.a().N1(this);
        this.f131467e = new com.planner5d.library.widget.editor.editor3dcardboard.d();
        O().e(this, com.planner5d.library.f.j.H7, bundle);
    }

    @Override // com.planner5d.library.activity.b, androidx.appcompat.app.d, androidx.fragment.app.s, android.app.Activity
    protected void onDestroy() {
        Bundle bundleA = new com.planner5d.library.services.utility.i(getIntent().getExtras()).a();
        r rVar = r.projectId;
        s2.f256732d.a(this, bundleA.containsKey(rVar.f224891a) ? Long.valueOf(bundleA.getLong(rVar.f224891a, 0L)) : null);
        S();
        super.onDestroy();
        N().b();
    }

    @Override // androidx.activity.l, android.app.Activity
    protected void onNewIntent(@NotNull Intent intent) {
        Intrinsics.checkNotNullParameter(intent, "intent");
        super.onNewIntent(intent);
        N().c(intent);
    }

    @Override // com.planner5d.library.activity.b, androidx.fragment.app.s, android.app.Activity
    protected void onPause() {
        M().f();
        N().d();
        super.onPause();
        com.planner5d.library.widget.editor.editor3dcardboard.d dVar = this.f131467e;
        if (dVar != null) {
            dVar.b();
        }
    }

    @Override // com.planner5d.library.activity.b, androidx.fragment.app.s, android.app.Activity
    protected void onResume() {
        M().g();
        N().l();
        super.onResume();
        com.planner5d.library.widget.editor.editor3dcardboard.d dVar = this.f131467e;
        if (dVar != null) {
            dVar.a(this);
        }
    }

    @Override // androidx.appcompat.app.d, androidx.fragment.app.s, android.app.Activity
    protected void onStart() {
        super.onStart();
        com.google.vr.sdk.controller.b bVar = this.f131468f;
        if (bVar != null) {
            bVar.i();
        }
    }

    @Override // androidx.appcompat.app.d, androidx.fragment.app.s, android.app.Activity
    protected void onStop() {
        com.google.vr.sdk.controller.b bVar = this.f131468f;
        if (bVar != null) {
            bVar.j();
        }
        super.onStop();
    }
}
