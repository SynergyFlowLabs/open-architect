package com.planner5d.library.services.download;

import android.app.Notification;
import android.content.Context;
import android.content.Intent;
import android.text.SpannableString;
import android.text.style.ForegroundColorSpan;
import androidx.annotation.l0;
import androidx.compose.runtime.internal.w0;
import androidx.core.app.w;
import androidx.lifecycle.c2;
import com.planner5d.library.activity.fragment.FragmentController;
import com.planner5d.library.activity.fragment.profile.ProfileNavigationFragment;
import com.planner5d.library.activity.fragment.profile.q;
import com.planner5d.library.activity.fragment.x;
import com.planner5d.library.model.manager.j2;
import com.planner5d.library.model.manager.managedfiles.a0;
import com.planner5d.library.model.manager.managedfiles.v;
import com.planner5d.library.services.exceptions.ErrorMessageException;
import com.planner5d.library.services.r;
import com.planner5d.library.services.utility.f1;
import com.planner5d.library.services.utility.s;
import com.planner5d.library.services.utility.v1;
import com.planner5d.library.util.navigation.external.NestedNavigationState;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.s0;
import kotlinx.coroutines.z1;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes10.dex */
@w0(parameters = 0)
@ij.f
public final class a extends com.planner5d.library.services.notification.a {

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public static final int f224248p = 8;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    @NotNull
    private final com.planner5d.library.application.b f224249g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    @NotNull
    private final fg.e<a0> f224250h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    @NotNull
    private final j2 f224251i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    @NotNull
    private final x f224252j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    @NotNull
    private final d f224253k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    @NotNull
    private final f1 f224254l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    @NotNull
    private final v1.a<C1671a> f224255m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    @NotNull
    private final androidx.lifecycle.w0<C1671a> f224256n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    @Nullable
    private ErrorMessageException f224257o;

    /* JADX INFO: renamed from: com.planner5d.library.services.download.a$a, reason: collision with other inner class name */
    @w0(parameters = 0)
    public static final class C1671a {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public static final int f224258c = 8;

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        @NotNull
        private final Notification f224259a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private final boolean f224260b;

        public C1671a(@NotNull Notification notification, boolean z10) {
            Intrinsics.checkNotNullParameter(notification, "notification");
            this.f224259a = notification;
            this.f224260b = z10;
        }

        public final boolean a() {
            return this.f224260b;
        }

        @NotNull
        public final Notification b() {
            return this.f224259a;
        }
    }

    @kotlin.coroutines.jvm.internal.f(c = "com.planner5d.library.services.download.DownloadNotification$updateNotification$1", f = "DownloadNotification.kt", i = {}, l = {78}, m = "invokeSuspend", n = {}, s = {})
    static final class b extends kotlin.coroutines.jvm.internal.o implements Function2<s0, kotlin.coroutines.d<? super Unit>, Object> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        int f224261a;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ long f224263c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        final /* synthetic */ boolean f224264d;

        /* JADX INFO: renamed from: com.planner5d.library.services.download.a$b$a, reason: collision with other inner class name */
        @kotlin.coroutines.jvm.internal.f(c = "com.planner5d.library.services.download.DownloadNotification$updateNotification$1$state$1", f = "DownloadNotification.kt", i = {}, l = {com.planner5d.library.engine.input.f.b.X}, m = "invokeSuspend", n = {}, s = {})
        static final class C1672a extends kotlin.coroutines.jvm.internal.o implements Function2<s0, kotlin.coroutines.d<? super v>, Object> {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            int f224265a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            final /* synthetic */ a f224266b;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            C1672a(a aVar, kotlin.coroutines.d<? super C1672a> dVar) {
                super(2, dVar);
                this.f224266b = aVar;
            }

            @Override // kotlin.coroutines.jvm.internal.a
            public final kotlin.coroutines.d<Unit> create(Object obj, kotlin.coroutines.d<?> dVar) {
                return new C1672a(this.f224266b, dVar);
            }

            @Override // kotlin.coroutines.jvm.internal.a
            public final Object invokeSuspend(Object obj) {
                Object objL = kotlin.coroutines.intrinsics.b.l();
                int i10 = this.f224265a;
                if (i10 != 0) {
                    if (i10 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    ResultKt.m(obj);
                    return obj;
                }
                ResultKt.m(obj);
                a0 a0Var = (a0) this.f224266b.f224250h.get();
                this.f224265a = 1;
                Object objI = a0Var.i(this);
                return objI == objL ? objL : objI;
            }

            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(s0 s0Var, kotlin.coroutines.d<? super v> dVar) {
                return ((C1672a) create(s0Var, dVar)).invokeSuspend(Unit.f312394a);
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        b(long j10, boolean z10, kotlin.coroutines.d<? super b> dVar) {
            super(2, dVar);
            this.f224263c = j10;
            this.f224264d = z10;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final kotlin.coroutines.d<Unit> create(Object obj, kotlin.coroutines.d<?> dVar) {
            return a.this.new b(this.f224263c, this.f224264d, dVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            Object objL = kotlin.coroutines.intrinsics.b.l();
            int i10 = this.f224261a;
            if (i10 == 0) {
                ResultKt.m(obj);
                z1 z1VarD = s.f229729a.d();
                C1672a c1672a = new C1672a(a.this, null);
                this.f224261a = 1;
                obj = kotlinx.coroutines.i.h(z1VarD, c1672a, this);
                if (obj == objL) {
                    return objL;
                }
            } else {
                if (i10 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.m(obj);
            }
            v vVar = (v) obj;
            ErrorMessageException errorMessageException = a.this.f224257o;
            a.this.f224257o = null;
            if (vVar == null || (a.this.h() == null && errorMessageException == null)) {
                a.this.f224255m.r(null);
                a.this.f224251i.a(a.this.f());
                DownloadService.f224236d.g(a.this.f224249g, false);
                return Unit.f312394a;
            }
            w.n nVarU = a.this.u(vVar, errorMessageException, this.f224263c);
            if (errorMessageException != null) {
                a.this.f224255m.r(null);
                a.this.f224251i.d(a.this.f(), nVarU);
                DownloadService.f224236d.g(a.this.f224249g, true);
            } else {
                Notification notificationH = nVarU.h();
                Intrinsics.checkNotNullExpressionValue(notificationH, "build(...)");
                if (a.this.f224253k.a()) {
                    a.this.f224255m.r(null);
                    DownloadService.f224236d.f(a.this.f224249g, notificationH, this.f224264d);
                } else {
                    a.this.f224255m.r(new C1671a(notificationH, this.f224264d));
                }
            }
            return Unit.f312394a;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(s0 s0Var, kotlin.coroutines.d<? super Unit> dVar) {
            return ((b) create(s0Var, dVar)).invokeSuspend(Unit.f312394a);
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    @ij.a
    public a(@NotNull com.planner5d.library.application.b application, @NotNull fg.e<a0> managedFileManager, @NotNull j2 notificationManager, @NotNull x navigator, @NotNull d downloadServiceStatus, @NotNull f1 coroutineScope, @NotNull fg.e<com.planner5d.library.model.manager.i> consumableIntentRepository) {
        super(application, notificationManager, consumableIntentRepository, coroutineScope);
        Intrinsics.checkNotNullParameter(application, "application");
        Intrinsics.checkNotNullParameter(managedFileManager, "managedFileManager");
        Intrinsics.checkNotNullParameter(notificationManager, "notificationManager");
        Intrinsics.checkNotNullParameter(navigator, "navigator");
        Intrinsics.checkNotNullParameter(downloadServiceStatus, "downloadServiceStatus");
        Intrinsics.checkNotNullParameter(coroutineScope, "coroutineScope");
        Intrinsics.checkNotNullParameter(consumableIntentRepository, "consumableIntentRepository");
        this.f224249g = application;
        this.f224250h = managedFileManager;
        this.f224251i = notificationManager;
        this.f224252j = navigator;
        this.f224253k = downloadServiceStatus;
        this.f224254l = coroutineScope;
        v1.a<C1671a> aVarJ = v1.f229769a.j(null);
        this.f224255m = aVarJ;
        this.f224256n = c2.f(aVarJ);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final w.n u(v vVar, ErrorMessageException errorMessageException, long j10) {
        w.n nVarD0 = com.planner5d.library.services.notification.a.d(this, j10, null, 2, null).i0(h() != null && errorMessageException == null).d0(errorMessageException == null ? -16711936 : l1.a.f316127c, 1000, 2000);
        Intrinsics.checkNotNullExpressionValue(nVarD0, "setLights(...)");
        if (errorMessageException == null) {
            com.planner5d.library.model.manager.managedfiles.w wVarE = vVar.e();
            if (wVarE != null) {
                nVarD0.l0(100, (int) (wVarE.e() * 100), false);
            }
            nVarD0.O(this.f224249g.getString(com.planner5d.library.f.s.jp, org.apache.commons.io.k.a(wVarE != null ? wVarE.c() : 0L), org.apache.commons.io.k.a(wVarE != null ? wVarE.d() : 0L), Integer.valueOf((int) Math.rint((wVarE != null ? wVarE.e() : 0.0f) * 100))));
            return nVarD0;
        }
        nVarD0.O(this.f224249g.getString(com.planner5d.library.f.s.G9));
        SpannableString spannableString = new SpannableString(ErrorMessageException.getError((Context) this.f224249g, errorMessageException));
        spannableString.setSpan(new ForegroundColorSpan(androidx.core.content.d.g(this.f224249g, com.planner5d.library.f.C1549f.N3)), 0, spannableString.length(), 33);
        nVarD0.N(spannableString);
        return nVarD0;
    }

    private final void x(boolean z10, long j10) {
        kotlinx.coroutines.k.f(this.f224254l, s.f229729a.a(), null, new b(j10, z10, null), 2, null);
    }

    @Override // com.planner5d.library.services.notification.a
    @NotNull
    protected j2.a e() {
        return j2.a.Download;
    }

    @Override // com.planner5d.library.services.notification.a
    protected int f() {
        return 6;
    }

    @Override // com.planner5d.library.services.notification.a
    @NotNull
    protected r g() {
        return r.downloadNotification;
    }

    @Override // com.planner5d.library.services.notification.a
    @l0
    protected void i(long j10, @NotNull Intent intent) {
        Intrinsics.checkNotNullParameter(intent, "intent");
        super.i(j10, intent);
        if (h() == null) {
            this.f224257o = null;
            this.f224255m.r(null);
        }
        x xVar = this.f224252j;
        androidx.navigation.c2 c2VarC = q.c();
        Intrinsics.checkNotNullExpressionValue(c2VarC, "toManageData(...)");
        x.g(xVar, new oe.a((Class<? extends FragmentController>) ProfileNavigationFragment.class, new NestedNavigationState(c2VarC)), false, 2, null);
    }

    @NotNull
    public final androidx.lifecycle.w0<C1671a> v() {
        return this.f224256n;
    }

    public final void w(boolean z10, @Nullable ErrorMessageException errorMessageException, long j10) {
        Long lH = h();
        boolean z11 = lH != null;
        long jCurrentTimeMillis = System.currentTimeMillis();
        boolean z12 = z11 != z10;
        if (lH == null || z12 || jCurrentTimeMillis - lH.longValue() > androidx.media3.common.j.f60679f2) {
            k(z10 ? Long.valueOf(jCurrentTimeMillis) : null);
            this.f224257o = errorMessageException;
            x(z12, j10);
        }
    }
}
