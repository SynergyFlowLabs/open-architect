package com.planner5d.library.uploadplan.view;

import android.net.Uri;
import androidx.lifecycle.c1;
import androidx.lifecycle.f2;
import androidx.lifecycle.g2;
import com.planner5d.library.model.manager.b2;
import com.planner5d.library.model.manager.statistics.events.e4;
import java.io.IOException;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.l1;
import kotlinx.coroutines.p2;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes11.dex */
public final class t extends f2 {

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    @NotNull
    public static final a f231145k = new a(null);

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    @NotNull
    public static final String f231146l = "uploadImage.png";

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    private final e4 f231147a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NotNull
    private final ke.d f231148b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @NotNull
    private final b2 f231149c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @NotNull
    private e4.c f231150d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private boolean f231151e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private boolean f231152f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    @NotNull
    private final c1<b> f231153g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    @NotNull
    private final c1<c> f231154h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    @NotNull
    private final androidx.lifecycle.w0<b> f231155i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    @NotNull
    private final androidx.lifecycle.w0<c> f231156j;

    public static final class a {
        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private a() {
        }
    }

    public enum b {
        Cancel,
        Next;


        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private static final /* synthetic */ kotlin.enums.a f231160d = kotlin.enums.c.c(k());

        @NotNull
        public static kotlin.enums.a<b> l() {
            return f231160d;
        }
    }

    public static final class c {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final boolean f231161a;

        public c(boolean z10) {
            this.f231161a = z10;
        }

        public final boolean a() {
            return this.f231161a;
        }
    }

    @kotlin.coroutines.jvm.internal.f(c = "com.planner5d.library.uploadplan.view.UploadPlanImageCropViewModel$storeBitmap$1", f = "UploadPlanImageCropViewModel.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
    static final class d extends kotlin.coroutines.jvm.internal.o implements Function2<kotlinx.coroutines.s0, kotlin.coroutines.d<? super Unit>, Object> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        int f231162a;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ Uri f231164c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        d(Uri uri, kotlin.coroutines.d<? super d> dVar) {
            super(2, dVar);
            this.f231164c = uri;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final kotlin.coroutines.d<Unit> create(Object obj, kotlin.coroutines.d<?> dVar) {
            return t.this.new d(this.f231164c, dVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            kotlin.coroutines.intrinsics.b.l();
            if (this.f231162a != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.m(obj);
            t.this.f231154h.o(new c(true));
            try {
                t.this.f231148b.a(this.f231164c, t.f231146l);
                t.this.f231153g.o(b.Next);
            } catch (IOException e10) {
                timber.log.b.f381052a.e(e10);
                t.this.f231149c.b(he.b.s.H9, t.this.f231149c.g(e10));
            }
            t.this.f231154h.o(new c(false));
            return Unit.f312394a;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(kotlinx.coroutines.s0 s0Var, kotlin.coroutines.d<? super Unit> dVar) {
            return ((d) create(s0Var, dVar)).invokeSuspend(Unit.f312394a);
        }
    }

    @ij.a
    public t(@NotNull e4 events, @NotNull ke.d copyFromUriUseCase, @NotNull b2 messageManager) {
        Intrinsics.checkNotNullParameter(events, "events");
        Intrinsics.checkNotNullParameter(copyFromUriUseCase, "copyFromUriUseCase");
        Intrinsics.checkNotNullParameter(messageManager, "messageManager");
        this.f231147a = events;
        this.f231148b = copyFromUriUseCase;
        this.f231149c = messageManager;
        this.f231150d = e4.c.photo_gallery;
        c1<b> c1Var = new c1<>(null);
        this.f231153g = c1Var;
        c1<c> c1Var2 = new c1<>(new c(false));
        this.f231154h = c1Var2;
        this.f231155i = c1Var;
        this.f231156j = c1Var2;
    }

    public final boolean Y() {
        return this.f231152f;
    }

    @NotNull
    public final e4.c Z() {
        return this.f231150d;
    }

    @NotNull
    public final androidx.lifecycle.w0<b> a0() {
        return this.f231155i;
    }

    public final boolean b0() {
        return this.f231151e;
    }

    @NotNull
    public final androidx.lifecycle.w0<c> c0() {
        return this.f231156j;
    }

    public final void d0(boolean z10) {
        this.f231152f = z10;
    }

    public final void f0(@NotNull e4.c cVar) {
        Intrinsics.checkNotNullParameter(cVar, "<set-?>");
        this.f231150d = cVar;
    }

    public final void g0(boolean z10) {
        this.f231151e = z10;
    }

    @NotNull
    public final p2 h0(@NotNull Uri contentUri) {
        Intrinsics.checkNotNullParameter(contentUri, "contentUri");
        return kotlinx.coroutines.k.f(g2.a(this), l1.c(), null, new d(contentUri, null), 2, null);
    }

    public final void i0(@NotNull e4.a action) {
        Intrinsics.checkNotNullParameter(action, "action");
        e4 e4Var = this.f231147a;
        e4.c cVar = this.f231150d;
        e4.e eVar = action == e4.a.close ? e4.e.crop_edit : null;
        e4.a aVar = e4.a.saved_scale;
        e4Var.n0(action, cVar, eVar, action == aVar ? Boolean.valueOf(this.f231151e) : null, action == aVar ? Boolean.valueOf(this.f231152f) : null);
    }
}
