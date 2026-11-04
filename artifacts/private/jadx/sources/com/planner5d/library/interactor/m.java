package com.planner5d.library.interactor;

import android.app.Application;
import android.graphics.Bitmap;
import android.graphics.Matrix;
import android.net.Uri;
import androidx.compose.runtime.internal.w0;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.util.concurrent.Callable;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.s0;
import org.jetbrains.annotations.NotNull;
import rx.Subscriber;

/* JADX INFO: loaded from: classes7.dex */
@w0(parameters = 0)
public final class m implements le.g {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final int f180213c = 8;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    private final Application f180214a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NotNull
    private final s0 f180215b;

    @kotlin.coroutines.jvm.internal.f(c = "com.planner5d.library.interactor.LoadDownsampledBitmapInteractor$load$1", f = "LoadDownsampledBitmapInteractor.kt", i = {}, l = {32}, m = "invokeSuspend", n = {}, s = {})
    static final class a extends kotlin.coroutines.jvm.internal.o implements Function2<s0, kotlin.coroutines.d<? super Unit>, Object> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        Object f180216a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        int f180217b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ Subscriber<? super Bitmap> f180218c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        final /* synthetic */ m f180219d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        final /* synthetic */ Uri f180220e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        final /* synthetic */ int f180221f;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        a(Subscriber<? super Bitmap> subscriber, m mVar, Uri uri, int i10, kotlin.coroutines.d<? super a> dVar) {
            super(2, dVar);
            this.f180218c = subscriber;
            this.f180219d = mVar;
            this.f180220e = uri;
            this.f180221f = i10;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final kotlin.coroutines.d<Unit> create(Object obj, kotlin.coroutines.d<?> dVar) {
            return new a(this.f180218c, this.f180219d, this.f180220e, this.f180221f, dVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            Subscriber<? super Bitmap> subscriber;
            Object objL = kotlin.coroutines.intrinsics.b.l();
            int i10 = this.f180217b;
            try {
                if (i10 == 0) {
                    ResultKt.m(obj);
                    Subscriber<? super Bitmap> subscriber2 = this.f180218c;
                    m mVar = this.f180219d;
                    Uri uri = this.f180220e;
                    int i11 = this.f180221f;
                    this.f180216a = subscriber2;
                    this.f180217b = 1;
                    Object objG = mVar.g(uri, i11, this);
                    if (objG == objL) {
                        return objL;
                    }
                    subscriber = subscriber2;
                    obj = objG;
                } else {
                    if (i10 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    subscriber = (Subscriber) this.f180216a;
                    ResultKt.m(obj);
                }
                subscriber.onNext(obj);
                this.f180218c.onCompleted();
            } catch (Exception e10) {
                this.f180218c.onError(e10);
            } catch (OutOfMemoryError e11) {
                this.f180218c.onError(e11);
            }
            return Unit.f312394a;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(s0 s0Var, kotlin.coroutines.d<? super Unit> dVar) {
            return ((a) create(s0Var, dVar)).invokeSuspend(Unit.f312394a);
        }
    }

    @kotlin.coroutines.jvm.internal.f(c = "com.planner5d.library.interactor.LoadDownsampledBitmapInteractor$load$3", f = "LoadDownsampledBitmapInteractor.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
    static final class b extends kotlin.coroutines.jvm.internal.o implements Function2<s0, kotlin.coroutines.d<? super Bitmap>, Object> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        int f180222a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ int f180223b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ m f180224c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        final /* synthetic */ Uri f180225d;

        public static final class a implements td.a.InterfaceC2511a {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            final /* synthetic */ Callable<InputStream> f180226a;

            a(Callable<InputStream> callable) {
                this.f180226a = callable;
            }

            @Override // td.a.InterfaceC2511a
            public InputStream a() throws IOException {
                try {
                    InputStream inputStreamCall = this.f180226a.call();
                    Intrinsics.checkNotNullExpressionValue(inputStreamCall, "call(...)");
                    return inputStreamCall;
                } catch (Exception unused) {
                    throw new IOException();
                }
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        b(int i10, m mVar, Uri uri, kotlin.coroutines.d<? super b> dVar) {
            super(2, dVar);
            this.f180223b = i10;
            this.f180224c = mVar;
            this.f180225d = uri;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final InputStream m(m mVar, Uri uri) {
            return mVar.f180214a.getContentResolver().openInputStream(uri);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final kotlin.coroutines.d<Unit> create(Object obj, kotlin.coroutines.d<?> dVar) {
            return new b(this.f180223b, this.f180224c, this.f180225d, dVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            kotlin.coroutines.intrinsics.b.l();
            if (this.f180222a != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.m(obj);
            final m mVar = this.f180224c;
            final Uri uri = this.f180225d;
            Callable callable = new Callable() { // from class: com.planner5d.library.interactor.n
                @Override // java.util.concurrent.Callable
                public final Object call() {
                    return m.b.m(mVar, uri);
                }
            };
            td.a aVar = td.a.f380845a;
            int i10 = this.f180223b;
            Bitmap bitmapV = aVar.v(i10, i10, new a(callable));
            if (bitmapV == null) {
                return null;
            }
            return this.f180224c.e(callable, bitmapV);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(s0 s0Var, kotlin.coroutines.d<? super Bitmap> dVar) {
            return ((b) create(s0Var, dVar)).invokeSuspend(Unit.f312394a);
        }
    }

    @ij.a
    public m(@NotNull Application application, @NotNull s0 coroutineScope) {
        Intrinsics.checkNotNullParameter(application, "application");
        Intrinsics.checkNotNullParameter(coroutineScope, "coroutineScope");
        this.f180214a = application;
        this.f180215b = coroutineScope;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final Bitmap e(Callable<InputStream> callable, Bitmap bitmap) throws OutOfMemoryError {
        int iF = f(callable);
        if (iF == 0) {
            return bitmap;
        }
        Matrix matrix = new Matrix();
        matrix.setRotate(iF);
        return td.a.f380845a.c(bitmap, 0, 0, bitmap.getWidth(), bitmap.getHeight(), matrix);
    }

    private final int f(Callable<InputStream> callable) {
        try {
            int iP = new androidx.exifinterface.media.a(callable.call()).p(androidx.exifinterface.media.a.D, 1);
            if (iP == 3) {
                return 180;
            }
            if (iP != 6) {
                return iP != 8 ? 0 : 270;
            }
            return 90;
        } catch (Exception e10) {
            timber.log.b.f381052a.e(e10);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final Object g(Uri uri, int i10, kotlin.coroutines.d<? super Bitmap> dVar) throws OutOfMemoryError, FileNotFoundException {
        return kotlinx.coroutines.i.h(com.planner5d.library.services.utility.s.f229729a.d(), new b(i10, this, uri, null), dVar);
    }

    @Override // le.g
    public void a(@NotNull Uri uri, int i10, @NotNull Subscriber<? super Bitmap> subscriber) {
        Intrinsics.checkNotNullParameter(uri, "uri");
        Intrinsics.checkNotNullParameter(subscriber, "subscriber");
        kotlinx.coroutines.k.f(this.f180215b, null, null, new a(subscriber, this, uri, i10, null), 3, null);
    }
}
