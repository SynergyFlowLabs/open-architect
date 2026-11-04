package com.planner5d.library.uploadplan.view;

import android.graphics.Bitmap;
import androidx.lifecycle.c1;
import androidx.lifecycle.f2;
import androidx.lifecycle.g2;
import com.planner5d.library.model.manager.b2;
import com.planner5d.library.model.manager.statistics.events.e4;
import com.planner5d.library.model.manager.t1;
import com.planner5d.library.uploadplan.view.dialog.RecognitionStartedDialog;
import java.io.IOException;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.l1;
import kotlinx.coroutines.p2;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes11.dex */
public final class s0 extends f2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    private final com.planner5d.library.application.b f231117a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NotNull
    private final e4 f231118b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @NotNull
    private final com.planner5d.library.model.manager.f2 f231119c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @NotNull
    private final com.planner5d.library.services.utility.p0 f231120d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    @NotNull
    private final com.planner5d.library.activity.fragment.dialog.k f231121e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    @NotNull
    private final t1 f231122f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    @NotNull
    private final ke.h f231123g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    @NotNull
    private final ke.f f231124h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    @NotNull
    private final b2 f231125i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    @NotNull
    private final c1<b> f231126j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    @NotNull
    private final androidx.lifecycle.w0<b> f231127k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    @NotNull
    private e4.c f231128l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    @NotNull
    private final c1<a> f231129m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    @NotNull
    private final androidx.lifecycle.w0<a> f231130n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    @NotNull
    private final c1<Bitmap> f231131o;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    @NotNull
    private final androidx.lifecycle.w0<Bitmap> f231132s;

    public enum a {
        Feed;


        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private static final /* synthetic */ kotlin.enums.a f231135c = kotlin.enums.c.c(k());

        @NotNull
        public static kotlin.enums.a<a> l() {
            return f231135c;
        }
    }

    public static final class b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final boolean f231136a;

        public b(boolean z10) {
            this.f231136a = z10;
        }

        public final boolean a() {
            return this.f231136a;
        }
    }

    @kotlin.coroutines.jvm.internal.f(c = "com.planner5d.library.uploadplan.view.UploadPlanScaleUnitsViewModel$loadBitmap$1", f = "UploadPlanScaleUnitsViewModel.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
    static final class c extends kotlin.coroutines.jvm.internal.o implements Function2<kotlinx.coroutines.s0, kotlin.coroutines.d<? super Unit>, Object> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        int f231137a;

        c(kotlin.coroutines.d<? super c> dVar) {
            super(2, dVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final kotlin.coroutines.d<Unit> create(Object obj, kotlin.coroutines.d<?> dVar) {
            return s0.this.new c(dVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            kotlin.coroutines.intrinsics.b.l();
            if (this.f231137a != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.m(obj);
            try {
                s0.this.f231131o.o(s0.this.f231124h.a(t.f231146l));
            } catch (IOException e10) {
                timber.log.b.f381052a.e(e10);
                s0.this.f231125i.b(com.planner5d.library.f.s.H9, s0.this.f231125i.g(e10));
            }
            return Unit.f312394a;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(kotlinx.coroutines.s0 s0Var, kotlin.coroutines.d<? super Unit> dVar) {
            return ((c) create(s0Var, dVar)).invokeSuspend(Unit.f312394a);
        }
    }

    @kotlin.coroutines.jvm.internal.f(c = "com.planner5d.library.uploadplan.view.UploadPlanScaleUnitsViewModel$uploadBitmap$1", f = "UploadPlanScaleUnitsViewModel.kt", i = {}, l = {com.planner5d.library.engine.input.f.b.f160716p}, m = "invokeSuspend", n = {}, s = {})
    static final class d extends kotlin.coroutines.jvm.internal.o implements Function2<kotlinx.coroutines.s0, kotlin.coroutines.d<? super Unit>, Object> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        int f231139a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ boolean f231140b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ float f231141c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        final /* synthetic */ s0 f231142d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        final /* synthetic */ com.planner5d.library.math.k f231143e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        final /* synthetic */ com.planner5d.library.math.k f231144f;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        d(boolean z10, float f10, s0 s0Var, com.planner5d.library.math.k kVar, com.planner5d.library.math.k kVar2, kotlin.coroutines.d<? super d> dVar) {
            super(2, dVar);
            this.f231140b = z10;
            this.f231141c = f10;
            this.f231142d = s0Var;
            this.f231143e = kVar;
            this.f231144f = kVar2;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final kotlin.coroutines.d<Unit> create(Object obj, kotlin.coroutines.d<?> dVar) {
            return new d(this.f231140b, this.f231141c, this.f231142d, this.f231143e, this.f231144f, dVar);
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            Throwable th2;
            d dVar;
            Object objL = kotlin.coroutines.intrinsics.b.l();
            int i10 = this.f231139a;
            try {
                if (i10 == 0) {
                    ResultKt.m(obj);
                    try {
                        float fW = this.f231140b ? this.f231141c : this.f231142d.f231119c.w(this.f231141c, new com.planner5d.library.model.metricunit.b(this.f231142d.f231117a, this.f231142d.f231120d));
                        Bitmap bitmap = (Bitmap) this.f231142d.f231131o.f();
                        if (bitmap != null) {
                            s0 s0Var = this.f231142d;
                            com.planner5d.library.math.k kVar = this.f231143e;
                            com.planner5d.library.math.k kVar2 = this.f231144f;
                            ke.h hVar = s0Var.f231123g;
                            this.f231139a = 1;
                            dVar = this;
                            try {
                                if (hVar.a(bitmap, kVar, kVar2, fW, dVar) == objL) {
                                    return objL;
                                }
                            } catch (Throwable th3) {
                                th = th3;
                                th2 = th;
                                dVar.f231142d.f231118b.E0(dVar.f231142d.k0(), e4.f.uploading, 0L, th2.getMessage());
                                dVar.f231142d.f231122f.b("upload_plan", null, th2);
                                dVar.f231142d.f231125i.c(th2);
                                dVar.f231142d.f231126j.o(new b(false));
                            }
                        }
                        dVar.f231142d.f231129m.o(a.Feed);
                        dVar.f231142d.f231121e.c(RecognitionStartedDialog.class).g();
                    } catch (Throwable th4) {
                        th = th4;
                        dVar = this;
                        th2 = th;
                        dVar.f231142d.f231118b.E0(dVar.f231142d.k0(), e4.f.uploading, 0L, th2.getMessage());
                        dVar.f231142d.f231122f.b("upload_plan", null, th2);
                        dVar.f231142d.f231125i.c(th2);
                        dVar.f231142d.f231126j.o(new b(false));
                    }
                    return Unit.f312394a;
                }
                if (i10 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.m(obj);
                dVar = this;
                dVar.f231142d.f231129m.o(a.Feed);
                dVar.f231142d.f231121e.c(RecognitionStartedDialog.class).g();
            } catch (Throwable th5) {
                th2 = th5;
                dVar = this;
            }
            return Unit.f312394a;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(kotlinx.coroutines.s0 s0Var, kotlin.coroutines.d<? super Unit> dVar) {
            return ((d) create(s0Var, dVar)).invokeSuspend(Unit.f312394a);
        }
    }

    @ij.a
    public s0(@NotNull com.planner5d.library.application.b application, @NotNull e4 events, @NotNull com.planner5d.library.model.manager.f2 metricUnitManager, @NotNull com.planner5d.library.services.utility.p0 formatter, @NotNull com.planner5d.library.activity.fragment.dialog.k dialogLauncher, @NotNull t1 logRecordManager, @NotNull ke.h uploadPlanUseCase, @NotNull ke.f loadPngUseCase, @NotNull b2 messageManager) {
        Intrinsics.checkNotNullParameter(application, "application");
        Intrinsics.checkNotNullParameter(events, "events");
        Intrinsics.checkNotNullParameter(metricUnitManager, "metricUnitManager");
        Intrinsics.checkNotNullParameter(formatter, "formatter");
        Intrinsics.checkNotNullParameter(dialogLauncher, "dialogLauncher");
        Intrinsics.checkNotNullParameter(logRecordManager, "logRecordManager");
        Intrinsics.checkNotNullParameter(uploadPlanUseCase, "uploadPlanUseCase");
        Intrinsics.checkNotNullParameter(loadPngUseCase, "loadPngUseCase");
        Intrinsics.checkNotNullParameter(messageManager, "messageManager");
        this.f231117a = application;
        this.f231118b = events;
        this.f231119c = metricUnitManager;
        this.f231120d = formatter;
        this.f231121e = dialogLauncher;
        this.f231122f = logRecordManager;
        this.f231123g = uploadPlanUseCase;
        this.f231124h = loadPngUseCase;
        this.f231125i = messageManager;
        c1<b> c1Var = new c1<>(new b(false));
        this.f231126j = c1Var;
        this.f231127k = c1Var;
        this.f231128l = e4.c.photo_gallery;
        c1<a> c1Var2 = new c1<>(null);
        this.f231129m = c1Var2;
        this.f231130n = c1Var2;
        c1<Bitmap> c1Var3 = new c1<>(null);
        this.f231131o = c1Var3;
        this.f231132s = c1Var3;
    }

    public final double h0(long j10) {
        return this.f231119c.h(j10);
    }

    public final int i0(double d10) {
        return (int) (d10 / 12);
    }

    @NotNull
    public final androidx.lifecycle.w0<Bitmap> j0() {
        return this.f231132s;
    }

    @NotNull
    public final e4.c k0() {
        return this.f231128l;
    }

    @NotNull
    public final androidx.lifecycle.w0<a> l0() {
        return this.f231130n;
    }

    @NotNull
    public final androidx.lifecycle.w0<b> m0() {
        return this.f231127k;
    }

    public final float n0(long j10) {
        return (float) this.f231119c.i(j10);
    }

    @NotNull
    public final p2 o0() {
        int i10 = 2 & 0;
        return kotlinx.coroutines.k.f(g2.a(this), l1.c(), null, new c(null), 2, null);
    }

    public final float p0(double d10) {
        return (float) (d10 % 12);
    }

    public final void q0(@NotNull e4.c cVar) {
        Intrinsics.checkNotNullParameter(cVar, "<set-?>");
        this.f231128l = cVar;
    }

    public final void r0() {
        e4.b.a(this.f231118b, e4.a.choice_units, this.f231128l, null, null, null, 28, null);
    }

    public final void s0(@NotNull e4.a action) {
        Intrinsics.checkNotNullParameter(action, "action");
        e4.b.a(this.f231118b, action, this.f231128l, e4.e.add_scale, null, null, 24, null);
    }

    public final void t0() {
        this.f231118b.h(this.f231128l);
    }

    public final void u0(@NotNull com.planner5d.library.math.k point1, @NotNull com.planner5d.library.math.k point2, float f10, boolean z10) {
        Intrinsics.checkNotNullParameter(point1, "point1");
        Intrinsics.checkNotNullParameter(point2, "point2");
        this.f231126j.r(new b(true));
        kotlinx.coroutines.k.f(g2.a(this), com.planner5d.library.services.utility.s.f229729a.h(), null, new d(z10, f10, this, point1, point2, null), 2, null);
    }
}
