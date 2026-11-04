package io.intercom.android.sdk.ui.preview.ui;

import android.content.Context;
import android.database.Cursor;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.pdf.PdfRenderer;
import android.net.Uri;
import android.os.ParcelFileDescriptor;
import android.view.ViewGroup;
import androidx.compose.foundation.layout.d5;
import androidx.compose.foundation.layout.i6;
import androidx.compose.foundation.layout.l6;
import androidx.compose.foundation.lazy.w0;
import androidx.compose.foundation.s2;
import androidx.compose.material3.q50;
import androidx.compose.runtime.b1;
import androidx.compose.runtime.b2;
import androidx.compose.runtime.k4;
import androidx.compose.runtime.m0;
import androidx.compose.runtime.n7;
import androidx.compose.runtime.s5;
import androidx.compose.runtime.t4;
import androidx.compose.runtime.u1;
import androidx.compose.runtime.v1;
import androidx.compose.runtime.w6;
import androidx.compose.runtime.y7;
import androidx.compose.ui.graphics.r0;
import androidx.compose.ui.layout.a1;
import androidx.compose.ui.platform.AndroidCompositionLocals_androidKt;
import androidx.lifecycle.o0;
import androidx.media3.common.k0;
import androidx.media3.exoplayer.ExoPlayer;
import androidx.media3.ui.PlayerView;
import com.google.firebase.perf.network.FirebasePerfUrlConnection;
import io.intercom.android.sdk.ui.R;
import io.intercom.android.sdk.ui.coil.IntercomImageLoaderKt;
import io.intercom.android.sdk.ui.extension.ContentTypeExtensionKt;
import io.intercom.android.sdk.ui.preview.data.IntercomPreviewFile;
import io.intercom.android.sdk.ui.theme.IntercomTheme;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.net.URL;
import java.net.URLConnection;
import java.util.ArrayList;
import java.util.List;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlinx.coroutines.l1;
import kotlinx.coroutines.n0;
import kotlinx.coroutines.s0;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes13.dex */
@SourceDebugExtension({"SMAP\nPreviewUri.kt\nKotlin\n*S Kotlin\n*F\n+ 1 PreviewUri.kt\nio/intercom/android/sdk/ui/preview/ui/PreviewUriKt\n+ 2 CompositionLocal.kt\nandroidx/compose/runtime/CompositionLocal\n+ 3 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 4 Effects.kt\nandroidx/compose/runtime/DisposableEffectScope\n+ 5 LazyDsl.kt\nandroidx/compose/foundation/lazy/LazyDslKt\n*L\n1#1,292:1\n75#2:293\n75#2:294\n75#2:295\n75#2:297\n75#2:298\n75#2:299\n75#2:300\n1#3:296\n66#4,5:301\n168#5,13:306\n*S KotlinDebug\n*F\n+ 1 PreviewUri.kt\nio/intercom/android/sdk/ui/preview/ui/PreviewUriKt\n*L\n65#1:293\n93#1:294\n102#1:295\n123#1:297\n124#1:298\n179#1:299\n243#1:300\n164#1:301,5\n226#1:306,13\n*E\n"})
public final class PreviewUriKt {

    public /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[androidx.lifecycle.c0.a.values().length];
            try {
                iArr[androidx.lifecycle.c0.a.ON_PAUSE.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    /* JADX INFO: renamed from: io.intercom.android.sdk.ui.preview.ui.PreviewUriKt$loadFilesAsBitmaps$1, reason: invalid class name and case insensitive filesystem */
    @kotlin.coroutines.jvm.internal.f(c = "io.intercom.android.sdk.ui.preview.ui.PreviewUriKt$loadFilesAsBitmaps$1", f = "PreviewUri.kt", i = {0, 0}, l = {com.planner5d.library.engine.input.f.b.U1}, m = "invokeSuspend", n = {"$this$produceState", "bitmaps"}, s = {"L$0", "L$1"})
    static final class C28391 extends kotlin.coroutines.jvm.internal.o implements Function2<k4<List<? extends Bitmap>>, kotlin.coroutines.d<? super Unit>, Object> {
        final /* synthetic */ Context $context;
        final /* synthetic */ IntercomPreviewFile $file;
        private /* synthetic */ Object L$0;
        Object L$1;
        int label;

        /* JADX INFO: renamed from: io.intercom.android.sdk.ui.preview.ui.PreviewUriKt$loadFilesAsBitmaps$1$1, reason: invalid class name and collision with other inner class name */
        @kotlin.coroutines.jvm.internal.f(c = "io.intercom.android.sdk.ui.preview.ui.PreviewUriKt$loadFilesAsBitmaps$1$1", f = "PreviewUri.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
        @SourceDebugExtension({"SMAP\nPreviewUri.kt\nKotlin\n*S Kotlin\n*F\n+ 1 PreviewUri.kt\nio/intercom/android/sdk/ui/preview/ui/PreviewUriKt$loadFilesAsBitmaps$1$1\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,292:1\n1#2:293\n*E\n"})
        static final class C20501 extends kotlin.coroutines.jvm.internal.o implements Function2<s0, kotlin.coroutines.d<? super ParcelFileDescriptor>, Object> {
            final /* synthetic */ IntercomPreviewFile $file;
            final /* synthetic */ File $tempFile;
            int label;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            C20501(IntercomPreviewFile intercomPreviewFile, File file, kotlin.coroutines.d<? super C20501> dVar) {
                super(2, dVar);
                this.$file = intercomPreviewFile;
                this.$tempFile = file;
            }

            @Override // kotlin.coroutines.jvm.internal.a
            public final kotlin.coroutines.d<Unit> create(Object obj, kotlin.coroutines.d<?> dVar) {
                return new C20501(this.$file, this.$tempFile, dVar);
            }

            @Override // kotlin.coroutines.jvm.internal.a
            public final Object invokeSuspend(Object obj) throws IOException {
                kotlin.coroutines.intrinsics.b.l();
                if (this.label != 0) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.m(obj);
                InputStream inputStream = ((URLConnection) FirebasePerfUrlConnection.instrument(new URL(((IntercomPreviewFile.NetworkFile) this.$file).getUrl()).openConnection())).getInputStream();
                if (inputStream == null) {
                    return null;
                }
                File file = this.$tempFile;
                try {
                    FileOutputStream fileOutputStream = new FileOutputStream(file);
                    try {
                        byte[] bArr = new byte[4096];
                        while (true) {
                            int i10 = inputStream.read(bArr);
                            if (i10 <= 0) {
                                fileOutputStream.flush();
                                fileOutputStream.close();
                                Unit unit = Unit.f312394a;
                                kotlin.io.c.a(fileOutputStream, null);
                                ParcelFileDescriptor parcelFileDescriptorOpen = ParcelFileDescriptor.open(file, 268435456);
                                kotlin.io.c.a(inputStream, null);
                                return parcelFileDescriptorOpen;
                            }
                            fileOutputStream.write(bArr, 0, i10);
                            try {
                                throw th;
                            } catch (Throwable th2) {
                                kotlin.io.c.a(inputStream, th);
                                throw th2;
                            }
                        }
                    } catch (Throwable th3) {
                        try {
                            throw th3;
                        } catch (Throwable th4) {
                            kotlin.io.c.a(fileOutputStream, th3);
                            throw th4;
                        }
                    }
                } catch (Throwable th5) {
                    throw th5;
                }
            }

            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(s0 s0Var, kotlin.coroutines.d<? super ParcelFileDescriptor> dVar) {
                return ((C20501) create(s0Var, dVar)).invokeSuspend(Unit.f312394a);
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C28391(IntercomPreviewFile intercomPreviewFile, Context context, kotlin.coroutines.d<? super C28391> dVar) {
            super(2, dVar);
            this.$file = intercomPreviewFile;
            this.$context = context;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final kotlin.coroutines.d<Unit> create(Object obj, kotlin.coroutines.d<?> dVar) {
            C28391 c28391 = new C28391(this.$file, this.$context, dVar);
            c28391.L$0 = obj;
            return c28391;
        }

        /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
        public final Object invoke2(k4<List<Bitmap>> k4Var, kotlin.coroutines.d<? super Unit> dVar) {
            return ((C28391) create(k4Var, dVar)).invokeSuspend(Unit.f312394a);
        }

        /* JADX WARN: Code duplicated, block: B:26:0x009b A[Catch: all -> 0x00d4, LOOP:0: B:25:0x0099->B:26:0x009b, LOOP_END, TryCatch #0 {all -> 0x00d4, blocks: (B:24:0x008d, B:26:0x009b, B:29:0x00d8), top: B:37:0x008d }] */
        /* JADX WARN: Code duplicated, block: B:31:0x00de  */
        /* JADX WARN: Code duplicated, block: B:37:0x008d A[EXC_TOP_SPLITTER, SYNTHETIC] */
        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) throws Throwable {
            List arrayList;
            ParcelFileDescriptor parcelFileDescriptorOpenFileDescriptor;
            k4 k4Var;
            List list;
            PdfRenderer pdfRenderer;
            int pageCount;
            int i10;
            Object objL = kotlin.coroutines.intrinsics.b.l();
            int i11 = this.label;
            ParcelFileDescriptor parcelFileDescriptor = null;
            try {
                if (i11 == 0) {
                    ResultKt.m(obj);
                    k4 k4Var2 = (k4) this.L$0;
                    arrayList = new ArrayList();
                    if (this.$file instanceof IntercomPreviewFile.NetworkFile) {
                        File fileCreateTempFile = File.createTempFile("download_", ".tmp", this.$context.getCacheDir());
                        n0 n0VarC = l1.c();
                        C20501 c20501 = new C20501(this.$file, fileCreateTempFile, null);
                        this.L$0 = k4Var2;
                        this.L$1 = arrayList;
                        this.label = 1;
                        Object objH = kotlinx.coroutines.i.h(n0VarC, c20501, this);
                        if (objH == objL) {
                            return objL;
                        }
                        obj = objH;
                        k4Var = k4Var2;
                        list = arrayList;
                    } else {
                        parcelFileDescriptorOpenFileDescriptor = this.$context.getContentResolver().openFileDescriptor(this.$file.getUri(), "r");
                        k4Var = k4Var2;
                    }
                    if (parcelFileDescriptorOpenFileDescriptor != null) {
                        try {
                            pdfRenderer = new PdfRenderer(parcelFileDescriptorOpenFileDescriptor);
                            pageCount = pdfRenderer.getPageCount();
                            for (i10 = 0; i10 < pageCount; i10++) {
                                PdfRenderer.Page pageOpenPage = pdfRenderer.openPage(i10);
                                Intrinsics.checkNotNullExpressionValue(pageOpenPage, "openPage(...)");
                                Bitmap bitmapCreateBitmap = Bitmap.createBitmap(pageOpenPage.getWidth(), pageOpenPage.getHeight(), Bitmap.Config.ARGB_8888);
                                Intrinsics.checkNotNullExpressionValue(bitmapCreateBitmap, "createBitmap(...)");
                                new Canvas(bitmapCreateBitmap).drawColor(-1);
                                pageOpenPage.render(bitmapCreateBitmap, null, null, 1);
                                arrayList.add(bitmapCreateBitmap);
                                pageOpenPage.close();
                            }
                        } catch (Throwable th2) {
                            th = th2;
                            parcelFileDescriptor = parcelFileDescriptorOpenFileDescriptor;
                            if (parcelFileDescriptor != null) {
                                parcelFileDescriptor.close();
                            }
                            throw th;
                        }
                    }
                    k4Var.setValue(arrayList);
                    if (parcelFileDescriptorOpenFileDescriptor != null) {
                        parcelFileDescriptorOpenFileDescriptor.close();
                    }
                    return Unit.f312394a;
                }
                if (i11 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                list = (List) this.L$1;
                k4Var = (k4) this.L$0;
                ResultKt.m(obj);
                parcelFileDescriptorOpenFileDescriptor = (ParcelFileDescriptor) obj;
                arrayList = list;
                if (parcelFileDescriptorOpenFileDescriptor != null) {
                    pdfRenderer = new PdfRenderer(parcelFileDescriptorOpenFileDescriptor);
                    pageCount = pdfRenderer.getPageCount();
                    while (i10 < pageCount) {
                        PdfRenderer.Page pageOpenPage2 = pdfRenderer.openPage(i10);
                        Intrinsics.checkNotNullExpressionValue(pageOpenPage2, "openPage(...)");
                        Bitmap bitmapCreateBitmap2 = Bitmap.createBitmap(pageOpenPage2.getWidth(), pageOpenPage2.getHeight(), Bitmap.Config.ARGB_8888);
                        Intrinsics.checkNotNullExpressionValue(bitmapCreateBitmap2, "createBitmap(...)");
                        new Canvas(bitmapCreateBitmap2).drawColor(-1);
                        pageOpenPage2.render(bitmapCreateBitmap2, null, null, 1);
                        arrayList.add(bitmapCreateBitmap2);
                        pageOpenPage2.close();
                    }
                }
                k4Var.setValue(arrayList);
                if (parcelFileDescriptorOpenFileDescriptor != null) {
                    parcelFileDescriptorOpenFileDescriptor.close();
                }
                return Unit.f312394a;
            } catch (Throwable th3) {
                th = th3;
            }
        }

        @Override // kotlin.jvm.functions.Function2
        public /* bridge */ /* synthetic */ Object invoke(k4<List<? extends Bitmap>> k4Var, kotlin.coroutines.d<? super Unit> dVar) {
            return invoke2((k4<List<Bitmap>>) k4Var, dVar);
        }
    }

    @androidx.compose.runtime.o
    @androidx.compose.runtime.t(applier = "androidx.compose.ui.UiComposable")
    private static final void DocumentPreview(final androidx.compose.ui.a0 a0Var, final Uri uri, boolean z10, androidx.compose.ui.layout.l lVar, androidx.compose.runtime.c0 c0Var, final int i10, final int i11) {
        androidx.compose.runtime.c0 c0VarR = c0Var.R(1870066421);
        final boolean z11 = (i11 & 4) != 0 ? true : z10;
        final androidx.compose.ui.layout.l lVarI = (i11 & 8) != 0 ? androidx.compose.ui.layout.l.f39405a.i() : lVar;
        final Context context = (Context) c0VarR.W(AndroidCompositionLocals_androidKt.g());
        androidx.compose.foundation.layout.g0.c(i6.f(a0Var, 0.0f, 1, null), null, false, androidx.compose.runtime.internal.w.e(1599096779, true, new pj.n<androidx.compose.foundation.layout.h0, androidx.compose.runtime.c0, Integer, Unit>() { // from class: io.intercom.android.sdk.ui.preview.ui.PreviewUriKt.DocumentPreview.1
            @Override // pj.n
            public /* bridge */ /* synthetic */ Unit invoke(androidx.compose.foundation.layout.h0 h0Var, androidx.compose.runtime.c0 c0Var2, Integer num) throws IOException {
                invoke(h0Var, c0Var2, num.intValue());
                return Unit.f312394a;
            }

            @androidx.compose.runtime.o
            @androidx.compose.runtime.t(applier = "androidx.compose.ui.UiComposable")
            public final void invoke(androidx.compose.foundation.layout.h0 BoxWithConstraints, androidx.compose.runtime.c0 c0Var2, int i12) throws IOException {
                int i13;
                Intrinsics.checkNotNullParameter(BoxWithConstraints, "$this$BoxWithConstraints");
                if ((i12 & 14) == 0) {
                    i13 = i12 | (c0Var2.D(BoxWithConstraints) ? 4 : 2);
                } else {
                    i13 = i12;
                }
                if ((i13 & 91) == 18 && c0Var2.d()) {
                    c0Var2.u();
                    return;
                }
                float fC = BoxWithConstraints.c();
                Cursor cursorQuery = context.getContentResolver().query(uri, null, null, null, null);
                String string = "";
                if (cursorQuery != null) {
                    try {
                        cursorQuery.moveToFirst();
                        string = cursorQuery.getColumnIndex("_display_name") != -1 ? cursorQuery.getString(cursorQuery.getColumnIndexOrThrow("_display_name")) : "";
                        Unit unit = Unit.f312394a;
                        kotlin.io.c.a(cursorQuery, null);
                    } catch (Throwable th2) {
                        try {
                            throw th2;
                        } catch (Throwable th3) {
                            kotlin.io.c.a(cursorQuery, th2);
                            throw th3;
                        }
                    }
                }
                String str = string;
                androidx.compose.ui.a0.a aVar = androidx.compose.ui.a0.E;
                androidx.compose.ui.a0 a0VarY = i6.y(aVar, fC, androidx.compose.ui.unit.h.r(1.414f * fC));
                IntercomTheme intercomTheme = IntercomTheme.INSTANCE;
                androidx.compose.ui.a0 a0VarD = androidx.compose.foundation.v.d(a0VarY, intercomTheme.getColors(c0Var2, 6).m690getBackground0d7_KjU(), null, 2, null);
                androidx.compose.ui.e.a aVar2 = androidx.compose.ui.e.f37317a;
                androidx.compose.ui.a0 a0VarB = BoxWithConstraints.b(a0VarD, aVar2.i());
                androidx.compose.ui.e.b bVarM = aVar2.m();
                androidx.compose.foundation.layout.q.f fVarM = androidx.compose.foundation.layout.q.f16330a.m();
                androidx.compose.ui.layout.l lVar2 = lVarI;
                boolean z12 = z11;
                a1 a1VarB = androidx.compose.foundation.layout.j0.b(fVarM, bVarM, c0Var2, 54);
                int iHashCode = Long.hashCode(androidx.compose.runtime.v.l(c0Var2, 0));
                b1 b1VarK = c0Var2.k();
                androidx.compose.ui.a0 a0VarN = androidx.compose.ui.m.n(c0Var2, a0VarB);
                androidx.compose.ui.node.g.a aVar3 = androidx.compose.ui.node.g.I;
                Function0<androidx.compose.ui.node.g> function0A = aVar3.a();
                if (c0Var2.S() == null) {
                    androidx.compose.runtime.v.r();
                }
                c0Var2.q();
                if (c0Var2.P()) {
                    c0Var2.q0(function0A);
                } else {
                    c0Var2.l();
                }
                androidx.compose.runtime.c0 c0VarD = y7.d(c0Var2);
                y7.n(c0VarD, a1VarB, aVar3.e());
                y7.n(c0VarD, b1VarK, aVar3.g());
                Function2<androidx.compose.ui.node.g, Integer, Unit> function2B = aVar3.b();
                if (c0VarD.P() || !Intrinsics.areEqual(c0VarD.i0(), Integer.valueOf(iHashCode))) {
                    c0VarD.Y(Integer.valueOf(iHashCode));
                    c0VarD.f(Integer.valueOf(iHashCode), function2B);
                }
                y7.n(c0VarD, a0VarN, aVar3.f());
                androidx.compose.foundation.layout.n0 n0Var = androidx.compose.foundation.layout.n0.f16227a;
                s2.d(u0.e.c(R.drawable.intercom_ic_document, c0Var2, 0), "Doc Icon", i6.w(aVar, androidx.compose.ui.unit.h.r(androidx.compose.ui.unit.h.q(fC, androidx.compose.ui.unit.h.r((float) 48)) > 0 ? 56 : 24)), null, lVar2, 0.0f, r0.a.d(r0.f38151b, intercomTheme.getColors(c0Var2, 6).m684getAction0d7_KjU(), 0, 2, null), c0Var2, 56, 40);
                c0Var2.E(-547888989);
                if (z12) {
                    l6.a(i6.i(aVar, androidx.compose.ui.unit.h.r(16)), c0Var2, 6);
                    q50.t(str, null, intercomTheme.getColors(c0Var2, 6).m714getPrimaryText0d7_KjU(), null, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, intercomTheme.getTypography(c0Var2, 6).getType04Point5(), c0Var2, 0, 0, 131066);
                }
                c0Var2.A();
                c0Var2.o();
            }
        }, c0VarR, 54), c0VarR, 3072, 6);
        s5 s5VarT = c0VarR.T();
        if (s5VarT != null) {
            s5VarT.a(new Function2() { // from class: io.intercom.android.sdk.ui.preview.ui.h0
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    return PreviewUriKt.DocumentPreview$lambda$11(a0Var, uri, z11, lVarI, i10, i11, (androidx.compose.runtime.c0) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit DocumentPreview$lambda$11(androidx.compose.ui.a0 modifier, Uri uri, boolean z10, androidx.compose.ui.layout.l lVar, int i10, int i11, androidx.compose.runtime.c0 c0Var, int i12) {
        Intrinsics.checkNotNullParameter(modifier, "$modifier");
        Intrinsics.checkNotNullParameter(uri, "$uri");
        DocumentPreview(modifier, uri, z10, lVar, c0Var, t4.a(i10 | 1), i11);
        return Unit.f312394a;
    }

    @androidx.compose.runtime.o
    @androidx.compose.runtime.t(applier = "androidx.compose.ui.UiComposable")
    private static final void PdfPreview(androidx.compose.ui.a0 a0Var, final IntercomPreviewFile intercomPreviewFile, androidx.compose.runtime.c0 c0Var, final int i10, final int i11) {
        androidx.compose.runtime.c0 c0VarR = c0Var.R(25606530);
        final androidx.compose.ui.a0 a0Var2 = (i11 & 1) != 0 ? androidx.compose.ui.a0.E : a0Var;
        final List<Bitmap> value = loadFilesAsBitmaps(intercomPreviewFile, c0VarR, 8).getValue();
        androidx.compose.foundation.lazy.h.h(i6.f(a0Var2, 0.0f, 1, null), null, null, false, null, null, null, false, null, new Function1() { // from class: io.intercom.android.sdk.ui.preview.ui.i0
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return PreviewUriKt.PdfPreview$lambda$13(value, (w0) obj);
            }
        }, c0VarR, 0, androidx.constraintlayout.core.motion.utils.v.g.f44098r);
        s5 s5VarT = c0VarR.T();
        if (s5VarT != null) {
            s5VarT.a(new Function2() { // from class: io.intercom.android.sdk.ui.preview.ui.j0
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    return PreviewUriKt.PdfPreview$lambda$14(a0Var2, intercomPreviewFile, i10, i11, (androidx.compose.runtime.c0) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit PdfPreview$lambda$13(final List bitmaps, w0 LazyColumn) {
        Intrinsics.checkNotNullParameter(bitmaps, "$bitmaps");
        Intrinsics.checkNotNullParameter(LazyColumn, "$this$LazyColumn");
        final PreviewUriKt$PdfPreview$lambda$13$$inlined$items$default$1 previewUriKt$PdfPreview$lambda$13$$inlined$items$default$1 = new Function1() { // from class: io.intercom.android.sdk.ui.preview.ui.PreviewUriKt$PdfPreview$lambda$13$$inlined$items$default$1
            @Override // kotlin.jvm.functions.Function1
            public final Void invoke(Bitmap bitmap) {
                return null;
            }

            @Override // kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                return invoke((Bitmap) obj);
            }
        };
        LazyColumn.A(bitmaps.size(), null, new Function1<Integer, Object>() { // from class: io.intercom.android.sdk.ui.preview.ui.PreviewUriKt$PdfPreview$lambda$13$$inlined$items$default$3
            @Override // kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ Object invoke(Integer num) {
                return invoke(num.intValue());
            }

            public final Object invoke(int i10) {
                return previewUriKt$PdfPreview$lambda$13$$inlined$items$default$1.invoke(bitmaps.get(i10));
            }
        }, androidx.compose.runtime.internal.w.c(802480018, true, new pj.o<androidx.compose.foundation.lazy.i, Integer, androidx.compose.runtime.c0, Integer, Unit>() { // from class: io.intercom.android.sdk.ui.preview.ui.PreviewUriKt$PdfPreview$lambda$13$$inlined$items$default$4
            @Override // pj.o
            public /* bridge */ /* synthetic */ Unit invoke(androidx.compose.foundation.lazy.i iVar, Integer num, androidx.compose.runtime.c0 c0Var, Integer num2) {
                invoke(iVar, num.intValue(), c0Var, num2.intValue());
                return Unit.f312394a;
            }

            @androidx.compose.runtime.o
            public final void invoke(androidx.compose.foundation.lazy.i iVar, int i10, androidx.compose.runtime.c0 c0Var, int i11) {
                int i12;
                if ((i11 & 6) == 0) {
                    i12 = i11 | (c0Var.D(iVar) ? 4 : 2);
                } else {
                    i12 = i11;
                }
                if ((i11 & 48) == 0) {
                    i12 |= c0Var.K(i10) ? 32 : 16;
                }
                if (!c0Var.h((i12 & com.planner5d.library.engine.input.f.b.F1) != 146, i12 & 1)) {
                    c0Var.u();
                    return;
                }
                if (m0.l0()) {
                    m0.A0(802480018, i12, -1, "androidx.compose.foundation.lazy.items.<anonymous> (LazyDsl.kt:178)");
                }
                Bitmap bitmap = (Bitmap) bitmaps.get(i10);
                c0Var.E(-1436658847);
                s2.h(androidx.compose.ui.graphics.j.c(bitmap), "Pdf Preview", d5.v(i6.f(androidx.compose.ui.a0.E, 0.0f, 1, null), 0.0f, 0.0f, 0.0f, androidx.compose.ui.unit.h.r(8), 7, null), null, androidx.compose.ui.layout.l.f39405a.g(), 0.0f, null, 0, c0Var, 25016, 232);
                c0Var.A();
                if (m0.l0()) {
                    m0.z0();
                }
            }
        }));
        return Unit.f312394a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit PdfPreview$lambda$14(androidx.compose.ui.a0 a0Var, IntercomPreviewFile file, int i10, int i11, androidx.compose.runtime.c0 c0Var, int i12) {
        Intrinsics.checkNotNullParameter(file, "$file");
        PdfPreview(a0Var, file, c0Var, t4.a(i10 | 1), i11);
        return Unit.f312394a;
    }

    @androidx.compose.runtime.o
    @androidx.compose.runtime.t(applier = "androidx.compose.ui.UiComposable")
    public static final void PreviewUri(@Nullable androidx.compose.ui.a0 a0Var, @NotNull final IntercomPreviewFile file, @Nullable androidx.compose.runtime.c0 c0Var, final int i10, final int i11) {
        Intrinsics.checkNotNullParameter(file, "file");
        androidx.compose.runtime.c0 c0VarR = c0Var.R(1385802164);
        if ((i11 & 1) != 0) {
            a0Var = androidx.compose.ui.a0.E;
        }
        final androidx.compose.ui.a0 a0Var2 = a0Var;
        Context context = (Context) c0VarR.W(AndroidCompositionLocals_androidKt.g());
        Uri uri = file.getUri();
        String mimeType = file.getMimeType(context);
        if (ContentTypeExtensionKt.isImage(mimeType)) {
            c0VarR.E(1931959814);
            ThumbnailPreview(a0Var2, null, file, c0VarR, (i10 & 14) | 512, 2);
            c0VarR.A();
        } else if (ContentTypeExtensionKt.isVideo(mimeType) || ContentTypeExtensionKt.isAudio(mimeType)) {
            c0VarR.E(1932086573);
            VideoPlayer(a0Var2, uri, c0VarR, (i10 & 14) | 64, 0);
            c0VarR.A();
        } else if (ContentTypeExtensionKt.isPdf(mimeType)) {
            c0VarR.E(1932182828);
            PdfPreview(a0Var2, file, c0VarR, (i10 & 14) | 64, 0);
            c0VarR.A();
        } else {
            c0VarR.E(1932268233);
            DocumentPreview(a0Var2, uri, false, null, c0VarR, (i10 & 14) | 64, 12);
            c0VarR = c0VarR;
            c0VarR.A();
        }
        s5 s5VarT = c0VarR.T();
        if (s5VarT != null) {
            s5VarT.a(new Function2() { // from class: io.intercom.android.sdk.ui.preview.ui.d0
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    return PreviewUriKt.PreviewUri$lambda$0(a0Var2, file, i10, i11, (androidx.compose.runtime.c0) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit PreviewUri$lambda$0(androidx.compose.ui.a0 a0Var, IntercomPreviewFile file, int i10, int i11, androidx.compose.runtime.c0 c0Var, int i12) {
        Intrinsics.checkNotNullParameter(file, "$file");
        PreviewUri(a0Var, file, c0Var, t4.a(i10 | 1), i11);
        return Unit.f312394a;
    }

    @androidx.compose.runtime.o
    @androidx.compose.runtime.t(applier = "androidx.compose.ui.UiComposable")
    public static final void ThumbnailPreview(@Nullable androidx.compose.ui.a0 a0Var, @Nullable androidx.compose.ui.layout.l lVar, @NotNull final IntercomPreviewFile file, @Nullable androidx.compose.runtime.c0 c0Var, final int i10, final int i11) {
        androidx.compose.runtime.c0 c0Var2;
        Intrinsics.checkNotNullParameter(file, "file");
        androidx.compose.runtime.c0 c0VarR = c0Var.R(1221057551);
        final androidx.compose.ui.a0 a0Var2 = (i11 & 1) != 0 ? androidx.compose.ui.a0.E : a0Var;
        androidx.compose.ui.layout.l lVarI = (i11 & 2) != 0 ? androidx.compose.ui.layout.l.f39405a.i() : lVar;
        Context context = (Context) c0VarR.W(AndroidCompositionLocals_androidKt.g());
        String mimeType = file.getMimeType(context);
        if (ContentTypeExtensionKt.isImage(mimeType) || ContentTypeExtensionKt.isVideo(mimeType) || ContentTypeExtensionKt.isPdf(mimeType)) {
            c0VarR.E(-1993113608);
            androidx.compose.ui.a0 a0VarF = i6.f(a0Var2, 0.0f, 1, null);
            coil.j imageLoader = IntercomImageLoaderKt.getImageLoader(context);
            coil.request.i.a aVarJ = new coil.request.i.a((Context) c0VarR.W(AndroidCompositionLocals_androidKt.g())).j(file.getUri());
            aVarJ.i(true);
            c0Var2 = c0VarR;
            coil.compose.c.g(aVarJ.f(), "Image", imageLoader, a0VarF, null, null, null, lVarI, 0.0f, null, 0, false, null, c0Var2, ((i10 << 18) & 29360128) | 568, 0, 8048);
            c0Var2.A();
        } else {
            c0VarR.E(-1992720435);
            DocumentPreview(a0Var2, file.getUri(), false, lVarI, c0VarR, (i10 & 14) | 448 | ((i10 << 6) & 7168), 0);
            c0VarR.A();
            c0Var2 = c0VarR;
        }
        s5 s5VarT = c0Var2.T();
        if (s5VarT != null) {
            final androidx.compose.ui.layout.l lVar2 = lVarI;
            s5VarT.a(new Function2() { // from class: io.intercom.android.sdk.ui.preview.ui.b0
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    return PreviewUriKt.ThumbnailPreview$lambda$2(a0Var2, lVar2, file, i10, i11, (androidx.compose.runtime.c0) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit ThumbnailPreview$lambda$2(androidx.compose.ui.a0 a0Var, androidx.compose.ui.layout.l lVar, IntercomPreviewFile file, int i10, int i11, androidx.compose.runtime.c0 c0Var, int i12) {
        Intrinsics.checkNotNullParameter(file, "$file");
        ThumbnailPreview(a0Var, lVar, file, c0Var, t4.a(i10 | 1), i11);
        return Unit.f312394a;
    }

    @androidx.compose.runtime.o
    @androidx.compose.runtime.t(applier = "androidx.compose.ui.UiComposable")
    private static final void VideoPlayer(androidx.compose.ui.a0 a0Var, final Uri uri, androidx.compose.runtime.c0 c0Var, final int i10, final int i11) {
        androidx.compose.runtime.c0 c0VarR = c0Var.R(-1579699387);
        if ((i11 & 1) != 0) {
            a0Var = androidx.compose.ui.a0.E;
        }
        final androidx.compose.ui.a0 a0Var2 = a0Var;
        Context context = (Context) c0VarR.W(AndroidCompositionLocals_androidKt.g());
        final n7 n7VarW = w6.w(c0VarR.W(AndroidCompositionLocals_androidKt.getLocalLifecycleOwner()), c0VarR, 8);
        k0.c cVarA = k0.c(uri).a();
        cVarA.E(String.valueOf(uri.hashCode()));
        cVarA.L(uri);
        k0 k0VarA = cVarA.a();
        Intrinsics.checkNotNullExpressionValue(k0VarA, "build(...)");
        final ExoPlayer exoPlayerW = new ExoPlayer.b(context).w();
        exoPlayerW.K0(k0VarA);
        exoPlayerW.A();
        Intrinsics.checkNotNullExpressionValue(exoPlayerW, "apply(...)");
        int i12 = 7 ^ 4;
        androidx.compose.ui.viewinterop.e.a(new Function1() { // from class: io.intercom.android.sdk.ui.preview.ui.e0
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return PreviewUriKt.VideoPlayer$lambda$6(exoPlayerW, (Context) obj);
            }
        }, a0Var2, null, c0VarR, (i10 << 3) & com.planner5d.library.engine.input.f.b.B, 4);
        b2.d("", new Function1() { // from class: io.intercom.android.sdk.ui.preview.ui.f0
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return PreviewUriKt.VideoPlayer$lambda$9(exoPlayerW, n7VarW, (v1) obj);
            }
        }, c0VarR, 6);
        s5 s5VarT = c0VarR.T();
        if (s5VarT != null) {
            s5VarT.a(new Function2() { // from class: io.intercom.android.sdk.ui.preview.ui.g0
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    return PreviewUriKt.VideoPlayer$lambda$10(a0Var2, uri, i10, i11, (androidx.compose.runtime.c0) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit VideoPlayer$lambda$10(androidx.compose.ui.a0 a0Var, Uri uri, int i10, int i11, androidx.compose.runtime.c0 c0Var, int i12) {
        Intrinsics.checkNotNullParameter(uri, "$uri");
        VideoPlayer(a0Var, uri, c0Var, t4.a(i10 | 1), i11);
        return Unit.f312394a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final PlayerView VideoPlayer$lambda$6(ExoPlayer exoPlayer, Context it) {
        Intrinsics.checkNotNullParameter(exoPlayer, "$exoPlayer");
        Intrinsics.checkNotNullParameter(it, "it");
        PlayerView playerView = new PlayerView(it);
        playerView.setPlayer(exoPlayer);
        playerView.setLayoutParams(new ViewGroup.LayoutParams(-1, -1));
        return playerView;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final u1 VideoPlayer$lambda$9(final ExoPlayer exoPlayer, n7 lifecycleOwner, v1 DisposableEffect) {
        Intrinsics.checkNotNullParameter(exoPlayer, "$exoPlayer");
        Intrinsics.checkNotNullParameter(lifecycleOwner, "$lifecycleOwner");
        Intrinsics.checkNotNullParameter(DisposableEffect, "$this$DisposableEffect");
        exoPlayer.B();
        final androidx.lifecycle.j0 j0Var = new androidx.lifecycle.j0() { // from class: io.intercom.android.sdk.ui.preview.ui.c0
            @Override // androidx.lifecycle.j0
            public final void e(o0 o0Var, androidx.lifecycle.c0.a aVar) {
                PreviewUriKt.VideoPlayer$lambda$9$lambda$7(exoPlayer, o0Var, aVar);
            }
        };
        final androidx.lifecycle.c0 lifecycle = ((o0) lifecycleOwner.getValue()).getLifecycle();
        lifecycle.c(j0Var);
        return new u1() { // from class: io.intercom.android.sdk.ui.preview.ui.PreviewUriKt$VideoPlayer$lambda$9$$inlined$onDispose$1
            @Override // androidx.compose.runtime.u1
            public void dispose() {
                lifecycle.g(j0Var);
                exoPlayer.release();
            }
        };
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void VideoPlayer$lambda$9$lambda$7(ExoPlayer exoPlayer, o0 o0Var, androidx.lifecycle.c0.a event) {
        Intrinsics.checkNotNullParameter(exoPlayer, "$exoPlayer");
        Intrinsics.checkNotNullParameter(o0Var, "<unused var>");
        Intrinsics.checkNotNullParameter(event, "event");
        if (WhenMappings.$EnumSwitchMapping$0[event.ordinal()] == 1) {
            exoPlayer.pause();
        }
    }

    @androidx.compose.runtime.o
    private static final n7<List<Bitmap>> loadFilesAsBitmaps(IntercomPreviewFile intercomPreviewFile, androidx.compose.runtime.c0 c0Var, int i10) {
        c0Var.E(-964565197);
        n7<List<Bitmap>> n7VarS = w6.s(CollectionsKt.emptyList(), intercomPreviewFile, new C28391(intercomPreviewFile, (Context) c0Var.W(AndroidCompositionLocals_androidKt.g()), null), c0Var, 582);
        c0Var.A();
        return n7VarS;
    }
}
