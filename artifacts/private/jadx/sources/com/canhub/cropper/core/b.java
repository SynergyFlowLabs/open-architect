package com.canhub.cropper.core;

import android.content.Context;
import android.graphics.Bitmap;
import android.net.Uri;
import android.util.DisplayMetrics;
import java.lang.ref.WeakReference;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.CoroutineContext;
import kotlin.coroutines.jvm.internal.o;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.i1;
import kotlinx.coroutines.i;
import kotlinx.coroutines.k;
import kotlinx.coroutines.l1;
import kotlinx.coroutines.p2;
import kotlinx.coroutines.s0;
import kotlinx.coroutines.t0;
import kotlinx.coroutines.u2;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes3.dex */
public final class b implements s0 {

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    @NotNull
    public static final a f97716g = new a(null);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    private final Context f97717a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NotNull
    private final Uri f97718b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final int f97719c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final int f97720d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    @NotNull
    private final WeakReference<CropImageView> f97721e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    @NotNull
    private p2 f97722f;

    public static final class a {
        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private a() {
        }
    }

    @kotlin.coroutines.jvm.internal.f(c = "com.canhub.cropper.core.BitmapLoadingWorkerJob$onPostExecute$2", f = "BitmapLoadingWorkerJob.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
    static final class c extends o implements Function2<s0, kotlin.coroutines.d<? super Unit>, Object> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        int f97730a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private /* synthetic */ Object f97731b;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        final /* synthetic */ C0878b f97733d;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        c(C0878b c0878b, kotlin.coroutines.d<? super c> dVar) {
            super(2, dVar);
            this.f97733d = c0878b;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final kotlin.coroutines.d<Unit> create(Object obj, kotlin.coroutines.d<?> dVar) {
            c cVar = b.this.new c(this.f97733d, dVar);
            cVar.f97731b = obj;
            return cVar;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            CropImageView cropImageView;
            kotlin.coroutines.intrinsics.b.l();
            if (this.f97730a != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.m(obj);
            s0 s0Var = (s0) this.f97731b;
            i1.a aVar = new i1.a();
            if (t0.k(s0Var) && (cropImageView = (CropImageView) b.this.f97721e.get()) != null) {
                C0878b c0878b = this.f97733d;
                aVar.f312744a = true;
                cropImageView.w(c0878b);
            }
            if (!aVar.f312744a && this.f97733d.a() != null) {
                this.f97733d.a().recycle();
            }
            return Unit.f312394a;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(s0 s0Var, kotlin.coroutines.d<? super Unit> dVar) {
            return ((c) create(s0Var, dVar)).invokeSuspend(Unit.f312394a);
        }
    }

    @kotlin.coroutines.jvm.internal.f(c = "com.canhub.cropper.core.BitmapLoadingWorkerJob$start$1", f = "BitmapLoadingWorkerJob.kt", i = {}, l = {45, com.planner5d.library.engine.input.f.b.f160710n}, m = "invokeSuspend", n = {}, s = {})
    static final class d extends o implements Function2<s0, kotlin.coroutines.d<? super Unit>, Object> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        int f97734a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private /* synthetic */ Object f97735b;

        d(kotlin.coroutines.d<? super d> dVar) {
            super(2, dVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final kotlin.coroutines.d<Unit> create(Object obj, kotlin.coroutines.d<?> dVar) {
            d dVar2 = b.this.new d(dVar);
            dVar2.f97735b = obj;
            return dVar2;
        }

        /* JADX WARN: Code restructure failed: missing block: B:21:0x00a3, code lost:
        
            if (r13 == r1) goto L25;
         */
        /* JADX WARN: Code restructure failed: missing block: B:24:0x00b9, code lost:
        
            if (r0.m(r3, r13) == r1) goto L25;
         */
        /* JADX WARN: Code restructure failed: missing block: B:25:0x00bb, code lost:
        
            return r1;
         */
        /* JADX WARN: Multi-variable type inference failed */
        /* JADX WARN: Type inference failed for: r13v10 */
        /* JADX WARN: Type inference failed for: r13v7 */
        /* JADX WARN: Type inference failed for: r13v8 */
        @Override // kotlin.coroutines.jvm.internal.a
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public final java.lang.Object invokeSuspend(java.lang.Object r14) throws java.lang.Throwable {
            /*
                r13 = this;
                java.lang.Object r1 = kotlin.coroutines.intrinsics.b.l()
                int r0 = r13.f97734a
                r2 = 2
                r12 = 4
                r3 = 1
                if (r0 == 0) goto L2d
                r12 = 1
                if (r0 == r3) goto L23
                if (r0 != r2) goto L16
                r12 = 1
                kotlin.ResultKt.m(r14)
                goto Lbc
            L16:
                java.lang.IllegalStateException r13 = new java.lang.IllegalStateException
                r12 = 5
                java.lang.String r14 = "bes/e/o//teuileou mw oei /o/ltr/rvo/fnt a kcricne h"
                java.lang.String r14 = "call to 'resume' before 'invoke' with coroutine"
                r12 = 6
                r13.<init>(r14)
                r12 = 4
                throw r13
            L23:
                kotlin.ResultKt.m(r14)     // Catch: java.lang.Exception -> L28
                goto Lbc
            L28:
                r0 = move-exception
                r14 = r0
                r14 = r0
                r12 = 7
                goto La6
            L2d:
                kotlin.ResultKt.m(r14)
                java.lang.Object r14 = r13.f97735b
                r12 = 6
                kotlinx.coroutines.s0 r14 = (kotlinx.coroutines.s0) r14
                r12 = 3
                boolean r0 = kotlinx.coroutines.t0.k(r14)     // Catch: java.lang.Exception -> L28
                r12 = 2
                if (r0 == 0) goto Lbc
                com.canhub.cropper.core.c r0 = com.canhub.cropper.core.c.f97737a     // Catch: java.lang.Exception -> L28
                com.canhub.cropper.core.b r4 = com.canhub.cropper.core.b.this     // Catch: java.lang.Exception -> L28
                android.content.Context r4 = com.canhub.cropper.core.b.c(r4)     // Catch: java.lang.Exception -> L28
                com.canhub.cropper.core.b r5 = com.canhub.cropper.core.b.this     // Catch: java.lang.Exception -> L28
                android.net.Uri r5 = r5.l()     // Catch: java.lang.Exception -> L28
                com.canhub.cropper.core.b r6 = com.canhub.cropper.core.b.this     // Catch: java.lang.Exception -> L28
                r12 = 2
                int r6 = com.canhub.cropper.core.b.i(r6)     // Catch: java.lang.Exception -> L28
                r12 = 0
                com.canhub.cropper.core.b r7 = com.canhub.cropper.core.b.this     // Catch: java.lang.Exception -> L28
                r12 = 6
                int r7 = com.canhub.cropper.core.b.f(r7)     // Catch: java.lang.Exception -> L28
                r12 = 6
                com.canhub.cropper.core.c$a r4 = r0.m(r4, r5, r6, r7)     // Catch: java.lang.Exception -> L28
                r12 = 2
                boolean r14 = kotlinx.coroutines.t0.k(r14)     // Catch: java.lang.Exception -> L28
                if (r14 == 0) goto Lbc
                android.graphics.Bitmap r14 = r4.a()     // Catch: java.lang.Exception -> L28
                com.canhub.cropper.core.b r5 = com.canhub.cropper.core.b.this     // Catch: java.lang.Exception -> L28
                android.content.Context r5 = com.canhub.cropper.core.b.c(r5)     // Catch: java.lang.Exception -> L28
                r12 = 5
                com.canhub.cropper.core.b r6 = com.canhub.cropper.core.b.this     // Catch: java.lang.Exception -> L28
                android.net.Uri r6 = r6.l()     // Catch: java.lang.Exception -> L28
                r12 = 4
                com.canhub.cropper.core.c$b r14 = r0.F(r14, r5, r6)     // Catch: java.lang.Exception -> L28
                com.canhub.cropper.core.b r0 = com.canhub.cropper.core.b.this     // Catch: java.lang.Exception -> L28
                com.canhub.cropper.core.b$b r5 = new com.canhub.cropper.core.b$b     // Catch: java.lang.Exception -> L28
                android.net.Uri r6 = r0.l()     // Catch: java.lang.Exception -> L28
                android.graphics.Bitmap r7 = r14.a()     // Catch: java.lang.Exception -> L28
                int r8 = r4.b()     // Catch: java.lang.Exception -> L28
                int r9 = r14.b()     // Catch: java.lang.Exception -> L28
                boolean r10 = r14.c()     // Catch: java.lang.Exception -> L28
                boolean r11 = r14.d()     // Catch: java.lang.Exception -> L28
                r5.<init>(r6, r7, r8, r9, r10, r11)     // Catch: java.lang.Exception -> L28
                r12 = 5
                r13.f97734a = r3     // Catch: java.lang.Exception -> L28
                java.lang.Object r13 = com.canhub.cropper.core.b.j(r0, r5, r13)     // Catch: java.lang.Exception -> L28
                r12 = 1
                if (r13 != r1) goto Lbc
                goto Lbb
            La6:
                com.canhub.cropper.core.b r0 = com.canhub.cropper.core.b.this
                r12 = 3
                com.canhub.cropper.core.b$b r3 = new com.canhub.cropper.core.b$b
                android.net.Uri r4 = r0.l()
                r3.<init>(r4, r14)
                r13.f97734a = r2
                java.lang.Object r13 = com.canhub.cropper.core.b.j(r0, r3, r13)
                r12 = 7
                if (r13 != r1) goto Lbc
            Lbb:
                return r1
            Lbc:
                kotlin.Unit r13 = kotlin.Unit.f312394a
                return r13
            */
            throw new UnsupportedOperationException("Method not decompiled: com.canhub.cropper.core.b.d.invokeSuspend(java.lang.Object):java.lang.Object");
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(s0 s0Var, kotlin.coroutines.d<? super Unit> dVar) {
            return ((d) create(s0Var, dVar)).invokeSuspend(Unit.f312394a);
        }
    }

    public b(@NotNull Context context, @NotNull CropImageView cropImageView, @NotNull Uri uri) {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(cropImageView, "cropImageView");
        Intrinsics.checkNotNullParameter(uri, "uri");
        this.f97717a = context;
        this.f97718b = uri;
        this.f97721e = new WeakReference<>(cropImageView);
        this.f97722f = u2.c(null, 1, null);
        DisplayMetrics displayMetrics = cropImageView.getResources().getDisplayMetrics();
        float f10 = displayMetrics.density;
        double d10 = f10 > 1.0f ? 1.0d / ((double) f10) : 1.0d;
        this.f97719c = (int) (((double) displayMetrics.widthPixels) * d10);
        this.f97720d = (int) (((double) displayMetrics.heightPixels) * d10);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final Object m(C0878b c0878b, kotlin.coroutines.d<? super Unit> dVar) {
        Object objH = i.h(l1.e(), new c(c0878b, null), dVar);
        return objH == kotlin.coroutines.intrinsics.b.l() ? objH : Unit.f312394a;
    }

    @Override // kotlinx.coroutines.s0
    @NotNull
    public CoroutineContext getCoroutineContext() {
        return l1.e().plus(this.f97722f);
    }

    public final void k() {
        p2.a.b(this.f97722f, null, 1, null);
    }

    @NotNull
    public final Uri l() {
        return this.f97718b;
    }

    public final void n() {
        this.f97722f = k.f(this, l1.a(), null, new d(null), 2, null);
    }

    /* JADX INFO: renamed from: com.canhub.cropper.core.b$b, reason: collision with other inner class name */
    public static final class C0878b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        @NotNull
        private final Uri f97723a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        @Nullable
        private final Bitmap f97724b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private final int f97725c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private final int f97726d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        private boolean f97727e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        private boolean f97728f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        @Nullable
        private final Exception f97729g;

        public C0878b(@NotNull Uri uri, @Nullable Bitmap bitmap, int i10, int i11, boolean z10, boolean z11) {
            Intrinsics.checkNotNullParameter(uri, "uri");
            this.f97723a = uri;
            this.f97724b = bitmap;
            this.f97725c = i10;
            this.f97726d = i11;
            this.f97727e = z10;
            this.f97728f = z11;
            this.f97729g = null;
        }

        public static /* synthetic */ String i(C0878b c0878b, Context context, boolean z10, int i10, Object obj) {
            if ((i10 & 2) != 0) {
                z10 = false;
            }
            return c0878b.h(context, z10);
        }

        @Nullable
        public final Bitmap a() {
            return this.f97724b;
        }

        public final int b() {
            return this.f97726d;
        }

        @Nullable
        public final Exception c() {
            return this.f97729g;
        }

        public final boolean d() {
            return this.f97727e;
        }

        public final boolean e() {
            return this.f97728f;
        }

        public final int f() {
            return this.f97725c;
        }

        @NotNull
        public final Uri g() {
            return this.f97723a;
        }

        @NotNull
        public final String h(@NotNull Context context, boolean z10) {
            Intrinsics.checkNotNullParameter(context, "context");
            return a5.a.d(context, this.f97723a, z10);
        }

        public final void j(boolean z10) {
            this.f97727e = z10;
        }

        public final void k(boolean z10) {
            this.f97728f = z10;
        }

        public C0878b(@NotNull Uri uri, @Nullable Exception exc) {
            Intrinsics.checkNotNullParameter(uri, "uri");
            this.f97723a = uri;
            this.f97724b = null;
            this.f97725c = 0;
            this.f97726d = 0;
            this.f97729g = exc;
        }
    }
}
