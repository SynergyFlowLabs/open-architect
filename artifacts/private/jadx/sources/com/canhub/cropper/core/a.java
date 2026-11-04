package com.canhub.cropper.core;

import android.content.Context;
import android.graphics.Bitmap;
import android.net.Uri;
import java.io.FileNotFoundException;
import java.lang.ref.WeakReference;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.CoroutineContext;
import kotlin.coroutines.jvm.internal.o;
import kotlin.jvm.functions.Function2;
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
public final class a implements s0 {

    @NotNull
    private p2 X;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    private final Context f97681a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NotNull
    private final WeakReference<CropImageView> f97682b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @Nullable
    private final Uri f97683c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @Nullable
    private final Bitmap f97684d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    @NotNull
    private final float[] f97685e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final int f97686f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private final int f97687g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private final int f97688h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private final boolean f97689i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private final int f97690j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private final int f97691k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private final int f97692l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private final int f97693m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private final boolean f97694n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    private final boolean f97695o;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    @NotNull
    private final CropImageView.k f97696s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    @NotNull
    private final Bitmap.CompressFormat f97697t;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    private final int f97698v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    @Nullable
    private final Uri f97699w;

    @kotlin.coroutines.jvm.internal.f(c = "com.canhub.cropper.core.BitmapCroppingWorkerJob$onPostExecute$2", f = "BitmapCroppingWorkerJob.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
    static final class b extends o implements Function2<s0, kotlin.coroutines.d<? super Unit>, Object> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        int f97705a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private /* synthetic */ Object f97706b;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        final /* synthetic */ C0876a f97708d;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        b(C0876a c0876a, kotlin.coroutines.d<? super b> dVar) {
            super(2, dVar);
            this.f97708d = c0876a;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final kotlin.coroutines.d<Unit> create(Object obj, kotlin.coroutines.d<?> dVar) {
            b bVar = a.this.new b(this.f97708d, dVar);
            bVar.f97706b = obj;
            return bVar;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            CropImageView cropImageView;
            kotlin.coroutines.intrinsics.b.l();
            if (this.f97705a != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.m(obj);
            s0 s0Var = (s0) this.f97706b;
            i1.a aVar = new i1.a();
            if (t0.k(s0Var) && (cropImageView = (CropImageView) a.this.f97682b.get()) != null) {
                C0876a c0876a = this.f97708d;
                aVar.f312744a = true;
                cropImageView.v(c0876a);
            }
            if (!aVar.f312744a && this.f97708d.a() != null) {
                this.f97708d.a().recycle();
            }
            return Unit.f312394a;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(s0 s0Var, kotlin.coroutines.d<? super Unit> dVar) {
            return ((b) create(s0Var, dVar)).invokeSuspend(Unit.f312394a);
        }
    }

    @kotlin.coroutines.jvm.internal.f(c = "com.canhub.cropper.core.BitmapCroppingWorkerJob$start$1", f = "BitmapCroppingWorkerJob.kt", i = {}, l = {com.planner5d.library.engine.input.f.b.f160716p, 102}, m = "invokeSuspend", n = {}, s = {})
    static final class c extends o implements Function2<s0, kotlin.coroutines.d<? super Unit>, Object> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        int f97709a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private /* synthetic */ Object f97710b;

        /* JADX INFO: renamed from: com.canhub.cropper.core.a$c$a, reason: collision with other inner class name */
        @kotlin.coroutines.jvm.internal.f(c = "com.canhub.cropper.core.BitmapCroppingWorkerJob$start$1$1", f = "BitmapCroppingWorkerJob.kt", i = {}, l = {com.planner5d.library.engine.input.f.b.f160700j1}, m = "invokeSuspend", n = {}, s = {})
        static final class C0877a extends o implements Function2<s0, kotlin.coroutines.d<? super Unit>, Object> {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            int f97712a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            final /* synthetic */ a f97713b;

            /* JADX INFO: renamed from: c, reason: collision with root package name */
            final /* synthetic */ Bitmap f97714c;

            /* JADX INFO: renamed from: d, reason: collision with root package name */
            final /* synthetic */ com.canhub.cropper.core.c.a f97715d;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            C0877a(a aVar, Bitmap bitmap, com.canhub.cropper.core.c.a aVar2, kotlin.coroutines.d<? super C0877a> dVar) {
                super(2, dVar);
                this.f97713b = aVar;
                this.f97714c = bitmap;
                this.f97715d = aVar2;
            }

            @Override // kotlin.coroutines.jvm.internal.a
            public final kotlin.coroutines.d<Unit> create(Object obj, kotlin.coroutines.d<?> dVar) {
                return new C0877a(this.f97713b, this.f97714c, this.f97715d, dVar);
            }

            @Override // kotlin.coroutines.jvm.internal.a
            public final Object invokeSuspend(Object obj) throws FileNotFoundException {
                Object objL = kotlin.coroutines.intrinsics.b.l();
                int i10 = this.f97712a;
                int i11 = 3 & 1;
                if (i10 == 0) {
                    ResultKt.m(obj);
                    Uri uriK = com.canhub.cropper.core.c.f97737a.K(this.f97713b.f97681a, this.f97714c, this.f97713b.f97697t, this.f97713b.f97698v, this.f97713b.f97699w);
                    this.f97714c.recycle();
                    a aVar = this.f97713b;
                    C0876a c0876a = new C0876a(uriK, this.f97715d.b());
                    this.f97712a = 1;
                    if (aVar.B(c0876a, this) == objL) {
                        return objL;
                    }
                } else {
                    if (i10 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    ResultKt.m(obj);
                }
                return Unit.f312394a;
            }

            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(s0 s0Var, kotlin.coroutines.d<? super Unit> dVar) {
                return ((C0877a) create(s0Var, dVar)).invokeSuspend(Unit.f312394a);
            }
        }

        c(kotlin.coroutines.d<? super c> dVar) {
            super(2, dVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final kotlin.coroutines.d<Unit> create(Object obj, kotlin.coroutines.d<?> dVar) {
            c cVar = a.this.new c(dVar);
            cVar.f97710b = obj;
            return cVar;
        }

        /* JADX WARN: Code restructure failed: missing block: B:29:0x0122, code lost:
        
            if (r4.B(r5, r21) == r2) goto L30;
         */
        @Override // kotlin.coroutines.jvm.internal.a
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public final java.lang.Object invokeSuspend(java.lang.Object r22) {
            /*
                Method dump skipped, instruction units count: 296
                To view this dump add '--comments-level debug' option
            */
            throw new UnsupportedOperationException("Method not decompiled: com.canhub.cropper.core.a.c.invokeSuspend(java.lang.Object):java.lang.Object");
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(s0 s0Var, kotlin.coroutines.d<? super Unit> dVar) {
            return ((c) create(s0Var, dVar)).invokeSuspend(Unit.f312394a);
        }
    }

    public a(@NotNull Context context, @NotNull WeakReference<CropImageView> cropImageViewReference, @Nullable Uri uri, @Nullable Bitmap bitmap, @NotNull float[] cropPoints, int i10, int i11, int i12, boolean z10, int i13, int i14, int i15, int i16, boolean z11, boolean z12, @NotNull CropImageView.k options, @NotNull Bitmap.CompressFormat saveCompressFormat, int i17, @Nullable Uri uri2) {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(cropImageViewReference, "cropImageViewReference");
        Intrinsics.checkNotNullParameter(cropPoints, "cropPoints");
        Intrinsics.checkNotNullParameter(options, "options");
        Intrinsics.checkNotNullParameter(saveCompressFormat, "saveCompressFormat");
        this.f97681a = context;
        this.f97682b = cropImageViewReference;
        this.f97683c = uri;
        this.f97684d = bitmap;
        this.f97685e = cropPoints;
        this.f97686f = i10;
        this.f97687g = i11;
        this.f97688h = i12;
        this.f97689i = z10;
        this.f97690j = i13;
        this.f97691k = i14;
        this.f97692l = i15;
        this.f97693m = i16;
        this.f97694n = z11;
        this.f97695o = z12;
        this.f97696s = options;
        this.f97697t = saveCompressFormat;
        this.f97698v = i17;
        this.f97699w = uri2;
        this.X = u2.c(null, 1, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final Object B(C0876a c0876a, kotlin.coroutines.d<? super Unit> dVar) {
        Object objH = i.h(l1.e(), new b(c0876a, null), dVar);
        return objH == kotlin.coroutines.intrinsics.b.l() ? objH : Unit.f312394a;
    }

    @Nullable
    public final Uri A() {
        return this.f97683c;
    }

    public final void C() {
        this.X = k.f(this, l1.a(), null, new c(null), 2, null);
    }

    @Override // kotlinx.coroutines.s0
    @NotNull
    public CoroutineContext getCoroutineContext() {
        return l1.e().plus(this.X);
    }

    public final void z() {
        p2.a.b(this.X, null, 1, null);
    }

    /* JADX INFO: renamed from: com.canhub.cropper.core.a$a, reason: collision with other inner class name */
    public static final class C0876a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        @Nullable
        private final Bitmap f97700a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        @Nullable
        private final Uri f97701b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        @Nullable
        private final Exception f97702c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private final boolean f97703d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        private final int f97704e;

        public C0876a(@Nullable Bitmap bitmap, int i10) {
            this.f97700a = bitmap;
            this.f97701b = null;
            this.f97702c = null;
            this.f97703d = false;
            this.f97704e = i10;
        }

        @Nullable
        public final Bitmap a() {
            return this.f97700a;
        }

        @Nullable
        public final Exception b() {
            return this.f97702c;
        }

        public final int c() {
            return this.f97704e;
        }

        @Nullable
        public final Uri d() {
            return this.f97701b;
        }

        public final boolean e() {
            return this.f97703d;
        }

        public C0876a(@Nullable Uri uri, int i10) {
            this.f97700a = null;
            this.f97701b = uri;
            this.f97702c = null;
            this.f97703d = true;
            this.f97704e = i10;
        }

        public C0876a(@Nullable Exception exc, boolean z10) {
            this.f97700a = null;
            this.f97701b = null;
            this.f97702c = exc;
            this.f97703d = z10;
            this.f97704e = 1;
        }
    }
}
