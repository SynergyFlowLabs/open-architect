package com.planner5d.library.services.upload;

import android.app.Notification;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.text.SpannableString;
import android.text.style.ForegroundColorSpan;
import androidx.annotation.l0;
import androidx.compose.runtime.internal.w0;
import androidx.core.app.w;
import androidx.lifecycle.c2;
import androidx.media3.common.j;
import com.planner5d.library.activity.fragment.FragmentController;
import com.planner5d.library.activity.fragment.projects.ProjectsPagesFragment;
import com.planner5d.library.activity.fragment.spaces.view.k;
import com.planner5d.library.activity.fragment.x;
import com.planner5d.library.model.manager.i;
import com.planner5d.library.model.manager.j2;
import com.planner5d.library.services.exceptions.ErrorMessageException;
import com.planner5d.library.services.r;
import com.planner5d.library.services.utility.f1;
import com.planner5d.library.services.utility.s;
import com.planner5d.library.services.utility.v1;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.jvm.internal.o;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlinx.coroutines.s0;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes10.dex */
@w0(parameters = 0)
@ij.f
@SourceDebugExtension({"SMAP\nDocumentNotification.kt\nKotlin\n*S Kotlin\n*F\n+ 1 DocumentNotification.kt\ncom/planner5d/library/services/upload/DocumentNotification\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,151:1\n1#2:152\n*E\n"})
public final class a extends com.planner5d.library.services.notification.a {

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public static final int f225009p = 8;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    @NotNull
    private final com.planner5d.library.application.b f225010g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    @NotNull
    private final fg.e<com.planner5d.library.model.manager.spaces.documents.c> f225011h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    @NotNull
    private final j2 f225012i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    @NotNull
    private final x f225013j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    @NotNull
    private final g f225014k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    @NotNull
    private final f1 f225015l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    @NotNull
    private final v1.a<C1685a> f225016m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    @NotNull
    private final androidx.lifecycle.w0<C1685a> f225017n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    @Nullable
    private ErrorMessageException f225018o;

    /* JADX INFO: renamed from: com.planner5d.library.services.upload.a$a, reason: collision with other inner class name */
    @w0(parameters = 0)
    public static final class C1685a {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public static final int f225019c = 8;

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        @NotNull
        private final Notification f225020a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private final boolean f225021b;

        public C1685a(@NotNull Notification notification, boolean z10) {
            Intrinsics.checkNotNullParameter(notification, "notification");
            this.f225020a = notification;
            this.f225021b = z10;
        }

        @NotNull
        public final Notification a() {
            return this.f225020a;
        }

        public final boolean b() {
            return this.f225021b;
        }
    }

    @kotlin.coroutines.jvm.internal.f(c = "com.planner5d.library.services.upload.DocumentNotification$updateNotification$1", f = "DocumentNotification.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
    static final class b extends o implements Function2<s0, kotlin.coroutines.d<? super Unit>, Object> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        int f225022a;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ long f225024c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        final /* synthetic */ boolean f225025d;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        b(long j10, boolean z10, kotlin.coroutines.d<? super b> dVar) {
            super(2, dVar);
            this.f225024c = j10;
            this.f225025d = z10;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final kotlin.coroutines.d<Unit> create(Object obj, kotlin.coroutines.d<?> dVar) {
            return a.this.new b(this.f225024c, this.f225025d, dVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            kotlin.coroutines.intrinsics.b.l();
            if (this.f225022a != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.m(obj);
            com.planner5d.library.activity.fragment.spaces.view.d dVarF = ((com.planner5d.library.model.manager.spaces.documents.c) a.this.f225011h.get()).G0().f();
            ErrorMessageException errorMessageException = a.this.f225018o;
            a.this.f225018o = null;
            if (dVarF == null || (a.this.h() == null && errorMessageException == null)) {
                a.this.f225016m.r(null);
                a.this.f225012i.a(a.this.f());
                DocumentService.f224995d.e(a.this.f225010g, false);
                return Unit.f312394a;
            }
            w.n nVarU = a.this.u(dVarF, errorMessageException, this.f225024c);
            if (errorMessageException != null) {
                a.this.f225016m.r(null);
                a.this.f225012i.d(a.this.f(), nVarU);
                DocumentService.f224995d.e(a.this.f225010g, true);
            } else {
                Notification notificationH = nVarU.h();
                Intrinsics.checkNotNullExpressionValue(notificationH, "build(...)");
                if (a.this.f225014k.b()) {
                    a.this.f225016m.r(null);
                    DocumentService.f224995d.d(a.this.f225010g, notificationH, this.f225025d);
                } else {
                    a.this.f225016m.r(new C1685a(notificationH, this.f225025d));
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
    public a(@NotNull com.planner5d.library.application.b application, @NotNull fg.e<com.planner5d.library.model.manager.spaces.documents.c> documentsManager, @NotNull j2 notificationManager, @NotNull x navigator, @NotNull g documentServiceStatus, @NotNull f1 coroutineScope, @NotNull fg.e<i> consumableIntentRepository) {
        super(application, notificationManager, consumableIntentRepository, coroutineScope);
        Intrinsics.checkNotNullParameter(application, "application");
        Intrinsics.checkNotNullParameter(documentsManager, "documentsManager");
        Intrinsics.checkNotNullParameter(notificationManager, "notificationManager");
        Intrinsics.checkNotNullParameter(navigator, "navigator");
        Intrinsics.checkNotNullParameter(documentServiceStatus, "documentServiceStatus");
        Intrinsics.checkNotNullParameter(coroutineScope, "coroutineScope");
        Intrinsics.checkNotNullParameter(consumableIntentRepository, "consumableIntentRepository");
        this.f225010g = application;
        this.f225011h = documentsManager;
        this.f225012i = notificationManager;
        this.f225013j = navigator;
        this.f225014k = documentServiceStatus;
        this.f225015l = coroutineScope;
        v1.a<C1685a> aVarJ = v1.f229769a.j(null);
        this.f225016m = aVarJ;
        this.f225017n = c2.f(aVarJ);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Code duplicated, block: B:18:0x0052  */
    public final w.n u(com.planner5d.library.activity.fragment.spaces.view.d dVar, ErrorMessageException errorMessageException, long j10) {
        String string;
        w.n nVarD0 = com.planner5d.library.services.notification.a.d(this, j10, null, 2, null).i0(h() != null && errorMessageException == null).d0((errorMessageException != null || (dVar instanceof com.planner5d.library.activity.fragment.spaces.view.i)) ? l1.a.f316127c : -16711936, 1000, 2000);
        Intrinsics.checkNotNullExpressionValue(nVarD0, "setLights(...)");
        Integer numB = dVar.b();
        String str = "";
        if (numB != null) {
            string = this.f225010g.getString(numB.intValue());
            if (string == null) {
                string = "";
            }
        } else {
            string = "";
        }
        nVarD0.O(string);
        if (errorMessageException != null) {
            SpannableString spannableString = new SpannableString(ErrorMessageException.getError((Context) this.f225010g, errorMessageException));
            spannableString.setSpan(new ForegroundColorSpan(androidx.core.content.d.g(this.f225010g, com.planner5d.library.f.C1549f.N3)), 0, spannableString.length(), 33);
            nVarD0.N(spannableString);
            return nVarD0;
        }
        if (dVar instanceof k) {
            nVarD0.l0(1, 1, true);
        }
        Integer numA = dVar.a();
        if (numA != null) {
            String string2 = this.f225010g.getString(numA.intValue());
            if (string2 != null) {
                str = string2;
            }
        }
        nVarD0.N(str);
        return nVarD0;
    }

    private final void x(boolean z10, long j10) {
        kotlinx.coroutines.k.f(this.f225015l, s.f229729a.a(), null, new b(j10, z10, null), 2, null);
    }

    @Override // com.planner5d.library.services.notification.a
    @NotNull
    protected j2.a e() {
        return j2.a.Document;
    }

    @Override // com.planner5d.library.services.notification.a
    protected int f() {
        return 8;
    }

    @Override // com.planner5d.library.services.notification.a
    @NotNull
    protected r g() {
        return r.documentNotification;
    }

    @Override // com.planner5d.library.services.notification.a
    @l0
    protected void i(long j10, @NotNull Intent intent) {
        Intrinsics.checkNotNullParameter(intent, "intent");
        super.i(j10, intent);
        com.planner5d.library.activity.fragment.spaces.view.d dVarF = this.f225011h.get().G0().f();
        int i10 = 1 >> 0;
        if (dVarF instanceof com.planner5d.library.activity.fragment.spaces.view.i) {
            Function0<Unit> function0C = ((com.planner5d.library.activity.fragment.spaces.view.i) dVarF).c();
            if (function0C != null) {
                function0C.invoke();
            }
            if (h() == null) {
                this.f225018o = null;
                this.f225016m.r(null);
                return;
            }
            return;
        }
        if (h() == null) {
            this.f225018o = null;
            this.f225016m.r(null);
        }
        x xVar = this.f225013j;
        Bundle bundle = new Bundle();
        bundle.putSerializable(r.tab.f224891a, r.documentsList);
        Unit unit = Unit.f312394a;
        x.g(xVar, new com.planner5d.library.activity.helper.event.content.c((Class<? extends FragmentController>) ProjectsPagesFragment.class, bundle), false, 2, null);
    }

    @NotNull
    public final androidx.lifecycle.w0<C1685a> v() {
        return this.f225017n;
    }

    public final void w(boolean z10, @Nullable ErrorMessageException errorMessageException, long j10) {
        Long lH = h();
        boolean z11 = lH != null;
        long jCurrentTimeMillis = System.currentTimeMillis();
        boolean z12 = z11 != z10;
        if (lH == null || z12 || jCurrentTimeMillis - lH.longValue() > j.f60679f2) {
            k(z10 ? Long.valueOf(jCurrentTimeMillis) : null);
            this.f225018o = errorMessageException;
            x(z12, j10);
        }
    }
}
