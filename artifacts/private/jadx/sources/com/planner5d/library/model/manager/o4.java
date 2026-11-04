package com.planner5d.library.model.manager;

import android.app.Application;
import android.content.Context;
import com.planner5d.library.activity.fragment.dialog.DialogWebView;
import com.planner5d.library.activity.fragment.dialog.support.SupportDialog;
import kotlin.Unit;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes7.dex */
@SourceDebugExtension({"SMAP\nSupportManager.kt\nKotlin\n*S Kotlin\n*F\n+ 1 SupportManager.kt\ncom/planner5d/library/model/manager/SupportManager\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 3 ArraysJVM.kt\nkotlin/collections/ArraysKt__ArraysJVMKt\n*L\n1#1,94:1\n1#2:95\n37#3,2:96\n*S KotlinDebug\n*F\n+ 1 SupportManager.kt\ncom/planner5d/library/model/manager/SupportManager\n*L\n79#1:96,2\n*E\n"})
public final class o4 implements x1, s4 {

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    @NotNull
    private static final a f192228h = new a(null);

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    @NotNull
    private static final String f192229i = "support_dialog";

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @NotNull
    private final Application f192230c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @NotNull
    private final h1 f192231d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    @NotNull
    private final com.planner5d.library.services.utility.c2 f192232e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    @NotNull
    private final q4 f192233f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    @NotNull
    private final p5 f192234g;

    private static final class a {
        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private a() {
        }
    }

    private static final class b extends d implements DialogWebView.c {
        @Override // com.planner5d.library.activity.fragment.dialog.DialogWebView.c
        public void t3(@NotNull DialogWebView dialog) {
            Intrinsics.checkNotNullParameter(dialog, "dialog");
            a(dialog);
        }
    }

    private static final class c extends d implements DialogWebView.d {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        @NotNull
        private final String f192235a;

        public c(@NotNull String supportSubmitUrl) {
            Intrinsics.checkNotNullParameter(supportSubmitUrl, "supportSubmitUrl");
            this.f192235a = supportSubmitUrl;
        }

        @Override // com.planner5d.library.activity.fragment.dialog.DialogWebView.d
        public void f2(@NotNull DialogWebView dialog, @NotNull String url) {
            Intrinsics.checkNotNullParameter(dialog, "dialog");
            Intrinsics.checkNotNullParameter(url, "url");
            if (Intrinsics.areEqual(url, this.f192235a)) {
                dialog.dismiss();
                a(dialog);
            }
        }
    }

    private static abstract class d {
        protected final void a(@NotNull DialogWebView dialogWebView) {
            Intrinsics.checkNotNullParameter(dialogWebView, "dialogWebView");
            new SupportDialog().show(dialogWebView.getParentFragmentManager(), o4.f192229i);
        }
    }

    @ij.a
    public o4(@NotNull Application application, @NotNull h1 intercomManager, @NotNull com.planner5d.library.services.utility.c2 networkStateUtility, @NotNull q4 supportManagerDataService, @NotNull p5 uriViewerService) {
        Intrinsics.checkNotNullParameter(application, "application");
        Intrinsics.checkNotNullParameter(intercomManager, "intercomManager");
        Intrinsics.checkNotNullParameter(networkStateUtility, "networkStateUtility");
        Intrinsics.checkNotNullParameter(supportManagerDataService, "supportManagerDataService");
        Intrinsics.checkNotNullParameter(uriViewerService, "uriViewerService");
        this.f192230c = application;
        this.f192231d = intercomManager;
        this.f192232e = networkStateUtility;
        this.f192233f = supportManagerDataService;
        this.f192234g = uriViewerService;
    }

    private final void d(androidx.fragment.app.s sVar) {
        String strF = this.f192233f.f(sVar);
        if (strF == null) {
            f(sVar);
            return;
        }
        DialogWebView.a aVar = DialogWebView.Companion;
        String strD = this.f192233f.d();
        aVar.c(strF, strD != null ? new c(strD) : null, new b());
    }

    private final void f(androidx.fragment.app.s sVar) {
        new SupportDialog().show(sVar.getSupportFragmentManager(), f192229i);
    }

    @Override // com.planner5d.library.model.manager.s4
    @androidx.annotation.k1
    public void a(@NotNull androidx.fragment.app.s fragmentActivity) {
        Intrinsics.checkNotNullParameter(fragmentActivity, "fragmentActivity");
        if (!this.f192233f.e()) {
            this.f192234g.a(fragmentActivity, androidx.core.net.c.f48012b + this.f192230c.getString(pc.b.r.qC));
            return;
        }
        boolean zD = this.f192232e.d(fragmentActivity);
        if (this.f192231d.j() && zD) {
            this.f192231d.l();
        } else if (zD) {
            d(fragmentActivity);
        } else {
            f(fragmentActivity);
        }
        this.f192233f.h();
    }

    @NotNull
    public final String b(@NotNull Context context) {
        Intrinsics.checkNotNullParameter(context, "context");
        return this.f192233f.i(context);
    }

    @NotNull
    public final y4[] c() {
        return (y4[]) y4.l().toArray(new y4[0]);
    }

    @Nullable
    public final Object h(@Nullable x4 x4Var, @NotNull kotlin.coroutines.d<? super Unit> dVar) {
        Object objG;
        return (x4Var == null || (objG = this.f192233f.g(x4Var, dVar)) != kotlin.coroutines.intrinsics.b.l()) ? Unit.f312394a : objG;
    }
}
