package com.planner5d.library.interactor;

import android.graphics.pdf.PdfDocument;
import androidx.compose.runtime.internal.w0;
import com.planner5d.library.services.utility.f1;
import java.io.ByteArrayOutputStream;
import java.io.Closeable;
import java.io.IOException;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.s0;
import org.jetbrains.annotations.NotNull;
import rx.Observable;

/* JADX INFO: loaded from: classes7.dex */
@w0(parameters = 0)
public final class h0 implements le.l {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final int f180155c = 8;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    private final com.planner5d.library.activity.helper.b0 f180156a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NotNull
    private final f1 f180157b;

    @kotlin.coroutines.jvm.internal.f(c = "com.planner5d.library.interactor.SavePdfInteractor$saveToFile$1", f = "SavePdfInteractor.kt", i = {}, l = {22}, m = "invokeSuspend", n = {}, s = {})
    static final class a extends kotlin.coroutines.jvm.internal.o implements Function2<s0, kotlin.coroutines.d<? super Unit>, Object> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        Object f180158a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        int f180159b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ le.l.a f180160c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        final /* synthetic */ h0 f180161d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        final /* synthetic */ PdfDocument f180162e;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        a(le.l.a aVar, h0 h0Var, PdfDocument pdfDocument, kotlin.coroutines.d<? super a> dVar) {
            super(2, dVar);
            this.f180160c = aVar;
            this.f180161d = h0Var;
            this.f180162e = pdfDocument;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final kotlin.coroutines.d<Unit> create(Object obj, kotlin.coroutines.d<?> dVar) {
            return new a(this.f180160c, this.f180161d, this.f180162e, dVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            le.l.a aVar;
            Object objL = kotlin.coroutines.intrinsics.b.l();
            int i10 = this.f180159b;
            try {
                if (i10 == 0) {
                    ResultKt.m(obj);
                    le.l.a aVar2 = this.f180160c;
                    h0 h0Var = this.f180161d;
                    PdfDocument pdfDocument = this.f180162e;
                    this.f180158a = aVar2;
                    this.f180159b = 1;
                    Object objD = h0Var.d(pdfDocument, this);
                    if (objD == objL) {
                        return objL;
                    }
                    aVar = aVar2;
                    obj = objD;
                } else {
                    if (i10 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    aVar = (le.l.a) this.f180158a;
                    ResultKt.m(obj);
                }
                aVar.a((String) obj);
            } catch (Throwable th2) {
                this.f180160c.onError(th2);
            }
            return Unit.f312394a;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(s0 s0Var, kotlin.coroutines.d<? super Unit> dVar) {
            return ((a) create(s0Var, dVar)).invokeSuspend(Unit.f312394a);
        }
    }

    @kotlin.coroutines.jvm.internal.f(c = "com.planner5d.library.interactor.SavePdfInteractor$saveToFileSuspend$2", f = "SavePdfInteractor.kt", i = {}, l = {35}, m = "invokeSuspend", n = {}, s = {})
    static final class b extends kotlin.coroutines.jvm.internal.o implements Function2<s0, kotlin.coroutines.d<? super String>, Object> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        Object f180163a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        int f180164b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ PdfDocument f180165c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        final /* synthetic */ h0 f180166d;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        b(PdfDocument pdfDocument, h0 h0Var, kotlin.coroutines.d<? super b> dVar) {
            super(2, dVar);
            this.f180165c = pdfDocument;
            this.f180166d = h0Var;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final kotlin.coroutines.d<Unit> create(Object obj, kotlin.coroutines.d<?> dVar) {
            return new b(this.f180165c, this.f180166d, dVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) throws IOException {
            Throwable th2;
            Closeable closeable;
            Object objL = kotlin.coroutines.intrinsics.b.l();
            int i10 = this.f180164b;
            if (i10 == 0) {
                ResultKt.m(obj);
                ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
                PdfDocument pdfDocument = this.f180165c;
                h0 h0Var = this.f180166d;
                try {
                    pdfDocument.writeTo(byteArrayOutputStream);
                    pdfDocument.close();
                    com.planner5d.library.services.utility.c0 c0Var = com.planner5d.library.services.utility.c0.f225068a;
                    Observable<String> observableM = h0Var.f180156a.m("wishlist", "pdf", "application/pdf", byteArrayOutputStream.toByteArray());
                    Intrinsics.checkNotNullExpressionValue(observableM, "export(...)");
                    this.f180163a = byteArrayOutputStream;
                    this.f180164b = 1;
                    Object objL2 = c0Var.l(observableM, this);
                    if (objL2 == objL) {
                        return objL;
                    }
                    obj = objL2;
                    closeable = byteArrayOutputStream;
                } catch (Throwable th3) {
                    th2 = th3;
                    closeable = byteArrayOutputStream;
                    throw th2;
                }
            } else {
                if (i10 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                closeable = (Closeable) this.f180163a;
                try {
                    ResultKt.m(obj);
                } catch (Throwable th4) {
                    th2 = th4;
                    try {
                        throw th2;
                    } catch (Throwable th5) {
                        kotlin.io.c.a(closeable, th2);
                        throw th5;
                    }
                }
            }
            String str = (String) obj;
            kotlin.io.c.a(closeable, null);
            return str;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(s0 s0Var, kotlin.coroutines.d<? super String> dVar) {
            return ((b) create(s0Var, dVar)).invokeSuspend(Unit.f312394a);
        }
    }

    @ij.a
    public h0(@NotNull com.planner5d.library.activity.helper.b0 helperExportToFile, @NotNull f1 coroutineScope) {
        Intrinsics.checkNotNullParameter(helperExportToFile, "helperExportToFile");
        Intrinsics.checkNotNullParameter(coroutineScope, "coroutineScope");
        this.f180156a = helperExportToFile;
        this.f180157b = coroutineScope;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final Object d(PdfDocument pdfDocument, kotlin.coroutines.d<? super String> dVar) throws Throwable {
        return kotlinx.coroutines.i.h(com.planner5d.library.services.utility.s.f229729a.d(), new b(pdfDocument, this, null), dVar);
    }

    @Override // le.l
    public void a(@NotNull PdfDocument document, @NotNull le.l.a callbacks) {
        Intrinsics.checkNotNullParameter(document, "document");
        Intrinsics.checkNotNullParameter(callbacks, "callbacks");
        kotlinx.coroutines.k.f(this.f180157b, null, null, new a(callbacks, this, document, null), 3, null);
    }
}
