package com.planner5d.library.uploadplan.view;

import android.content.IntentSender;
import android.net.Uri;
import androidx.lifecycle.c1;
import androidx.lifecycle.f2;
import androidx.lifecycle.g2;
import com.devtodev.core.data.metrics.MetricConsts;
import com.planner5d.library.model.manager.b2;
import com.planner5d.library.model.manager.statistics.events.e4;
import com.planner5d.library.model.manager.t1;
import java.io.IOException;
import kotlin.Pair;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.p2;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes11.dex */
public final class y0 extends f2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    private final com.planner5d.library.application.b f231230a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NotNull
    private final b2 f231231b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @NotNull
    private final com.planner5d.library.modules.user.user.t0 f231232c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @NotNull
    private final com.planner5d.library.modules.user.user.t f231233d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    @NotNull
    private final ke.b f231234e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    @NotNull
    private final e4 f231235f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    @NotNull
    private final ke.e f231236g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    @NotNull
    private final t1 f231237h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    @NotNull
    private e4.c f231238i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    @NotNull
    private final c1<Pair<a, Uri>> f231239j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    @NotNull
    private final c1<b> f231240k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    @NotNull
    private final androidx.lifecycle.w0<Pair<a, Uri>> f231241l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    @NotNull
    private final androidx.lifecycle.w0<b> f231242m;

    public enum a {
        Crop;


        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private static final /* synthetic */ kotlin.enums.a f231245c = kotlin.enums.c.c(k());

        static {
            boolean z10 = false & false;
        }

        @NotNull
        public static kotlin.enums.a<a> l() {
            return f231245c;
        }
    }

    public static final class b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final boolean f231246a;

        public b(boolean z10) {
            this.f231246a = z10;
        }

        public final boolean a() {
            return this.f231246a;
        }
    }

    @kotlin.coroutines.jvm.internal.f(c = "com.planner5d.library.uploadplan.view.UploadPlanUploadViewModel$selectImage$1", f = "UploadPlanUploadViewModel.kt", i = {1}, l = {44, 50}, m = "invokeSuspend", n = {MetricConsts.Install}, s = {"L$1"})
    static final class c extends kotlin.coroutines.jvm.internal.o implements Function2<kotlinx.coroutines.s0, kotlin.coroutines.d<? super Unit>, Object> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        Object f231247a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        Object f231248b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        int f231249c;

        c(kotlin.coroutines.d<? super c> dVar) {
            super(2, dVar);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final Unit m(y0 y0Var, String str) {
            e4.c cVarM = y0Var.f231235f.m(str);
            y0Var.k0(cVarM);
            y0Var.f231235f.Y(cVarM);
            return Unit.f312394a;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final kotlin.coroutines.d<Unit> create(Object obj, kotlin.coroutines.d<?> dVar) {
            return y0.this.new c(dVar);
        }

        /* JADX WARN: Code duplicated, block: B:32:0x0087 A[Catch: IOException -> 0x001b, a -> 0x001e, TryCatch #5 {IOException -> 0x001b, a -> 0x001e, blocks: (B:7:0x0017, B:30:0x007f, B:32:0x0087, B:33:0x008c), top: B:46:0x0017 }] */
        /* JADX WARN: Code duplicated, block: B:33:0x008c A[Catch: IOException -> 0x001b, a -> 0x001e, TRY_LEAVE, TryCatch #5 {IOException -> 0x001b, a -> 0x001e, blocks: (B:7:0x0017, B:30:0x007f, B:32:0x0087, B:33:0x008c), top: B:46:0x0017 }] */
        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            y0 y0Var;
            Uri uri;
            ke.e.a e10;
            IOException e11;
            Object objL = kotlin.coroutines.intrinsics.b.l();
            int i10 = this.f231249c;
            try {
                if (i10 == 0) {
                    ResultKt.m(obj);
                    ke.b bVar = y0.this.f231234e;
                    final y0 y0Var2 = y0.this;
                    IntentSender intentSenderA = new je.a(new Function1() { // from class: com.planner5d.library.uploadplan.view.z0
                        @Override // kotlin.jvm.functions.Function1
                        public final Object invoke(Object obj2) {
                            return y0.c.m(y0Var2, (String) obj2);
                        }
                    }).a(y0.this.f231230a);
                    this.f231249c = 1;
                    obj = bVar.a(true, intentSenderA, this);
                    if (obj == objL) {
                    }
                    return objL;
                }
                if (i10 != 1) {
                    if (i10 != 2) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    uri = (Uri) this.f231248b;
                    y0Var = (y0) this.f231247a;
                    try {
                        ResultKt.m(obj);
                        if (((Boolean) obj).booleanValue()) {
                            y0Var.i0(uri);
                        } else {
                            y0Var.f231231b.b(he.b.s.f284287q1, new Object[0]);
                        }
                    } catch (IOException e12) {
                        e11 = e12;
                        y0Var.h0(e11, uri);
                    } catch (ke.e.a e13) {
                        e10 = e13;
                        y0Var.h0(e10, uri);
                    }
                    return Unit.f312394a;
                }
                ResultKt.m(obj);
                Uri uri2 = (Uri) obj;
                if (uri2 != null) {
                    y0Var = y0.this;
                    try {
                        ke.e eVar = y0Var.f231236g;
                        this.f231247a = y0Var;
                        this.f231248b = uri2;
                        this.f231249c = 2;
                        Object objA = eVar.a(uri2, this);
                        if (objA != objL) {
                            uri = uri2;
                            obj = objA;
                            if (((Boolean) obj).booleanValue()) {
                                y0Var.i0(uri);
                            } else {
                                y0Var.f231231b.b(he.b.s.f284287q1, new Object[0]);
                            }
                        }
                        return objL;
                    } catch (IOException e14) {
                        uri = uri2;
                        e11 = e14;
                        y0Var.h0(e11, uri);
                    } catch (ke.e.a e15) {
                        uri = uri2;
                        e10 = e15;
                        y0Var.h0(e10, uri);
                    }
                }
            } catch (IOException e16) {
                y0.this.f231231b.c(e16);
            }
            return Unit.f312394a;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(kotlinx.coroutines.s0 s0Var, kotlin.coroutines.d<? super Unit> dVar) {
            return ((c) create(s0Var, dVar)).invokeSuspend(Unit.f312394a);
        }
    }

    @ij.a
    public y0(@NotNull com.planner5d.library.application.b application, @NotNull b2 messageManager, @NotNull com.planner5d.library.modules.user.user.t0 userPurchases, @NotNull com.planner5d.library.modules.user.user.t userAuthorization, @NotNull ke.b chooseImageAndSaveToPngUseCase, @NotNull e4 events, @NotNull ke.e detectPlanUseCase, @NotNull t1 logRecordManager) {
        Intrinsics.checkNotNullParameter(application, "application");
        Intrinsics.checkNotNullParameter(messageManager, "messageManager");
        Intrinsics.checkNotNullParameter(userPurchases, "userPurchases");
        Intrinsics.checkNotNullParameter(userAuthorization, "userAuthorization");
        Intrinsics.checkNotNullParameter(chooseImageAndSaveToPngUseCase, "chooseImageAndSaveToPngUseCase");
        Intrinsics.checkNotNullParameter(events, "events");
        Intrinsics.checkNotNullParameter(detectPlanUseCase, "detectPlanUseCase");
        Intrinsics.checkNotNullParameter(logRecordManager, "logRecordManager");
        this.f231230a = application;
        this.f231231b = messageManager;
        this.f231232c = userPurchases;
        this.f231233d = userAuthorization;
        this.f231234e = chooseImageAndSaveToPngUseCase;
        this.f231235f = events;
        this.f231236g = detectPlanUseCase;
        this.f231237h = logRecordManager;
        this.f231238i = e4.c.photo_gallery;
        c1<Pair<a, Uri>> c1Var = new c1<>(null);
        this.f231239j = c1Var;
        c1<b> c1Var2 = new c1<>(new b(false));
        this.f231240k = c1Var2;
        this.f231241l = c1Var;
        this.f231242m = c1Var2;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void h0(Throwable th2, Uri uri) {
        this.f231237h.b("detect_plan", null, th2);
        i0(uri);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void i0(Uri uri) {
        this.f231239j.r(new Pair<>(a.Crop, uri));
    }

    @NotNull
    public final e4.c b0() {
        return this.f231238i;
    }

    @NotNull
    public final androidx.lifecycle.w0<Pair<a, Uri>> c0() {
        return this.f231241l;
    }

    @NotNull
    public final androidx.lifecycle.w0<b> d0() {
        return this.f231242m;
    }

    public final boolean f0() {
        id.a aVarA = this.f231233d.a();
        if ((aVarA != null ? aVarA.b() : 0) <= 0) {
            if (!(aVarA != null && aVarA.g())) {
                return false;
            }
        }
        return true;
    }

    public final boolean g0() {
        return this.f231232c.c() || this.f231232c.r();
    }

    @NotNull
    public final p2 j0() {
        return kotlinx.coroutines.k.f(g2.a(this), null, null, new c(null), 3, null);
    }

    public final void k0(@NotNull e4.c cVar) {
        Intrinsics.checkNotNullParameter(cVar, "<set-?>");
        this.f231238i = cVar;
    }

    public final void l0(@NotNull e4.a action) {
        Intrinsics.checkNotNullParameter(action, "action");
        e4.b.a(this.f231235f, action, this.f231238i, e4.e.about_upload, null, null, 24, null);
    }
}
