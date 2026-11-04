package com.planner5d.library.uploadplan.view;

import android.graphics.Bitmap;
import androidx.lifecycle.c1;
import androidx.lifecycle.f2;
import androidx.lifecycle.g2;
import com.planner5d.library.model.manager.b2;
import com.planner5d.library.model.manager.statistics.events.e4;
import java.io.IOException;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.l1;
import kotlinx.coroutines.p2;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes11.dex */
public final class h0 extends f2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    private final b2 f231031a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NotNull
    private final ke.f f231032b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @NotNull
    private final e4 f231033c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @NotNull
    private com.planner5d.library.math.k f231034d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    @NotNull
    private com.planner5d.library.math.k f231035e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    @NotNull
    private final c1<a> f231036f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    @NotNull
    private final c1<Bitmap> f231037g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    @NotNull
    private final androidx.lifecycle.w0<Bitmap> f231038h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    @NotNull
    private final androidx.lifecycle.w0<a> f231039i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    @NotNull
    private e4.c f231040j;

    public enum a {
        Feed,
        ScaleIntro;


        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private static final /* synthetic */ kotlin.enums.a f231044d = kotlin.enums.c.c(k());

        @NotNull
        public static kotlin.enums.a<a> l() {
            return f231044d;
        }
    }

    @kotlin.coroutines.jvm.internal.f(c = "com.planner5d.library.uploadplan.view.UploadPlanScaleRulerViewModel$loadBitmap$1", f = "UploadPlanScaleRulerViewModel.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
    static final class b extends kotlin.coroutines.jvm.internal.o implements Function2<kotlinx.coroutines.s0, kotlin.coroutines.d<? super Unit>, Object> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        int f231045a;

        b(kotlin.coroutines.d<? super b> dVar) {
            super(2, dVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final kotlin.coroutines.d<Unit> create(Object obj, kotlin.coroutines.d<?> dVar) {
            return h0.this.new b(dVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            kotlin.coroutines.intrinsics.b.l();
            if (this.f231045a != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.m(obj);
            try {
                h0.this.f231037g.o(h0.this.f231032b.a(t.f231146l));
            } catch (IOException e10) {
                timber.log.b.f381052a.e(e10);
                h0.this.f231031a.b(com.planner5d.library.f.s.H9, h0.this.f231031a.g(e10));
            }
            return Unit.f312394a;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(kotlinx.coroutines.s0 s0Var, kotlin.coroutines.d<? super Unit> dVar) {
            return ((b) create(s0Var, dVar)).invokeSuspend(Unit.f312394a);
        }
    }

    @ij.a
    public h0(@NotNull b2 messageManager, @NotNull ke.f loadPngUseCase, @NotNull e4 events) {
        Intrinsics.checkNotNullParameter(messageManager, "messageManager");
        Intrinsics.checkNotNullParameter(loadPngUseCase, "loadPngUseCase");
        Intrinsics.checkNotNullParameter(events, "events");
        this.f231031a = messageManager;
        this.f231032b = loadPngUseCase;
        this.f231033c = events;
        this.f231034d = new com.planner5d.library.math.k(0.0f, 0.0f);
        this.f231035e = new com.planner5d.library.math.k(0.0f, 0.0f);
        c1<a> c1Var = new c1<>(null);
        this.f231036f = c1Var;
        c1<Bitmap> c1Var2 = new c1<>(null);
        this.f231037g = c1Var2;
        this.f231038h = c1Var2;
        this.f231039i = c1Var;
        this.f231040j = e4.c.photo_gallery;
    }

    @NotNull
    public final androidx.lifecycle.w0<Bitmap> X() {
        return this.f231038h;
    }

    @NotNull
    public final e4.c Y() {
        return this.f231040j;
    }

    @NotNull
    public final androidx.lifecycle.w0<a> Z() {
        return this.f231039i;
    }

    @NotNull
    public final com.planner5d.library.math.k a0() {
        return this.f231035e;
    }

    @NotNull
    public final com.planner5d.library.math.k b0() {
        return this.f231034d;
    }

    @NotNull
    public final p2 c0() {
        return kotlinx.coroutines.k.f(g2.a(this), l1.c(), null, new b(null), 2, null);
    }

    public final void d0(int i10, int i11, int i12, int i13, int i14) {
        Bitmap bitmapF = this.f231037g.f();
        if (bitmapF != null) {
            float width = bitmapF.getWidth() / i14;
            this.f231034d = new com.planner5d.library.math.k(i10 * width, i11 * width);
            this.f231035e = new com.planner5d.library.math.k(i12 * width, i13 * width);
        }
    }

    public final void f0(@NotNull e4.c cVar) {
        Intrinsics.checkNotNullParameter(cVar, "<set-?>");
        this.f231040j = cVar;
    }

    public final void g0(@NotNull com.planner5d.library.math.k kVar) {
        Intrinsics.checkNotNullParameter(kVar, "<set-?>");
        this.f231035e = kVar;
    }

    public final void h0(@NotNull com.planner5d.library.math.k kVar) {
        Intrinsics.checkNotNullParameter(kVar, "<set-?>");
        this.f231034d = kVar;
    }

    public final void i0(@NotNull e4.a action) {
        Intrinsics.checkNotNullParameter(action, "action");
        e4.b.a(this.f231033c, action, this.f231040j, e4.e.add_scale, null, null, 24, null);
    }

    public final void j0() {
        this.f231033c.h(this.f231040j);
    }
}
