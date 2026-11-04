package io.intercom.android.sdk.ui.coil;

import android.content.res.Resources;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.pdf.PdfRenderer;
import android.os.ParcelFileDescriptor;
import androidx.compose.runtime.internal.w0;
import coil.decode.g;
import coil.decode.h;
import coil.decode.v;
import coil.fetch.m;
import coil.j;
import coil.request.n;
import coil.size.b;
import coil.size.i;
import io.intercom.android.sdk.ui.extension.ContentTypeExtensionKt;
import kotlin.ResultKt;
import kotlin.coroutines.jvm.internal.d;
import kotlin.coroutines.jvm.internal.f;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.jvm.internal.i1;
import kotlinx.coroutines.m2;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes13.dex */
@w0(parameters = 0)
@SourceDebugExtension({"SMAP\nPdfDecoder.kt\nKotlin\n*S Kotlin\n*F\n+ 1 PdfDecoder.kt\nio/intercom/android/sdk/ui/coil/PdfDecoder\n+ 2 PdfDecoder.kt\nio/intercom/android/sdk/ui/coil/PdfDecoderKt\n+ 3 BitmapDrawable.kt\nandroidx/core/graphics/drawable/BitmapDrawableKt\n*L\n1#1,118:1\n108#2:119\n110#2:120\n27#3:121\n*S KotlinDebug\n*F\n+ 1 PdfDecoder.kt\nio/intercom/android/sdk/ui/coil/PdfDecoder\n*L\n44#1:119\n45#1:120\n77#1:121\n*E\n"})
public final class PdfDecoder implements h {
    public static final int $stable = 8;

    @NotNull
    private final n options;

    @NotNull
    private final v source;

    @w0(parameters = 1)
    public static final class Factory implements h.a {
        public static final int $stable = 0;

        private final boolean isApplicable(String str) {
            if (str != null) {
                return ContentTypeExtensionKt.isPdf(str);
            }
            return false;
        }

        @Override // coil.decode.h.a
        @Nullable
        public h create(@NotNull m result, @NotNull n options, @NotNull j imageLoader) {
            Intrinsics.checkNotNullParameter(result, "result");
            Intrinsics.checkNotNullParameter(options, "options");
            Intrinsics.checkNotNullParameter(imageLoader, "imageLoader");
            if (isApplicable(result.d())) {
                return new PdfDecoder(result.e(), options);
            }
            return null;
        }

        public boolean equals(@Nullable Object obj) {
            return obj instanceof Factory;
        }

        public int hashCode() {
            return Factory.class.hashCode();
        }
    }

    /* JADX INFO: renamed from: io.intercom.android.sdk.ui.coil.PdfDecoder$decode$1, reason: invalid class name */
    @f(c = "io.intercom.android.sdk.ui.coil.PdfDecoder", f = "PdfDecoder.kt", i = {0}, l = {32}, m = "decode", n = {"isSampled"}, s = {"L$0"})
    static final class AnonymousClass1 extends d {
        Object L$0;
        int label;
        /* synthetic */ Object result;

        AnonymousClass1(kotlin.coroutines.d<? super AnonymousClass1> dVar) {
            super(dVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return PdfDecoder.this.decode(this);
        }
    }

    public PdfDecoder(@NotNull v source, @NotNull n options) {
        Intrinsics.checkNotNullParameter(source, "source");
        Intrinsics.checkNotNullParameter(options, "options");
        this.source = source;
        this.options = options;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final BitmapDrawable decode$lambda$2(PdfDecoder this$0, i1.a isSampled) throws Throwable {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        Intrinsics.checkNotNullParameter(isSampled, "$isSampled");
        ParcelFileDescriptor parcelFileDescriptor = null;
        try {
            ParcelFileDescriptor parcelFileDescriptorOpen = ParcelFileDescriptor.open(this$0.source.a().toFile(), 268435456);
            try {
                PdfRenderer.Page pageOpenPage = new PdfRenderer(parcelFileDescriptorOpen).openPage(0);
                Intrinsics.checkNotNullExpressionValue(pageOpenPage, "openPage(...)");
                int width = pageOpenPage.getWidth();
                int height = pageOpenPage.getHeight();
                i iVarP = this$0.options.p();
                int px = b.f(iVarP) ? width : PdfDecoderKt.toPx(iVarP.f(), this$0.options.o());
                i iVarP2 = this$0.options.p();
                int px2 = b.f(iVarP2) ? height : PdfDecoderKt.toPx(iVarP2.e(), this$0.options.o());
                if (width > 0 && height > 0 && (width != px || height != px2)) {
                    double dC = g.c(width, height, px, px2, this$0.options.o());
                    boolean z10 = dC < 1.0d;
                    isSampled.f312744a = z10;
                    if (z10 || !this$0.options.c()) {
                        width = kotlin.math.b.K0(((double) width) * dC);
                        height = kotlin.math.b.K0(dC * ((double) height));
                    }
                }
                Bitmap bitmapCreateBitmap = Bitmap.createBitmap(width, height, Bitmap.Config.ARGB_8888);
                Intrinsics.checkNotNullExpressionValue(bitmapCreateBitmap, "createBitmap(...)");
                new Canvas(bitmapCreateBitmap).drawColor(-1);
                pageOpenPage.render(bitmapCreateBitmap, null, null, 1);
                Resources resources = this$0.options.g().getResources();
                Intrinsics.checkNotNullExpressionValue(resources, "getResources(...)");
                BitmapDrawable bitmapDrawable = new BitmapDrawable(resources, bitmapCreateBitmap);
                if (parcelFileDescriptorOpen != null) {
                    parcelFileDescriptorOpen.close();
                }
                return bitmapDrawable;
            } catch (Throwable th2) {
                th = th2;
                parcelFileDescriptor = parcelFileDescriptorOpen;
                if (parcelFileDescriptor != null) {
                    parcelFileDescriptor.close();
                }
                throw th;
            }
        } catch (Throwable th3) {
            th = th3;
        }
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0016  */
    @Override // coil.decode.h
    @Nullable
    public Object decode(@NotNull kotlin.coroutines.d<? super coil.decode.f> dVar) {
        AnonymousClass1 anonymousClass1;
        i1.a aVar;
        if (dVar instanceof AnonymousClass1) {
            anonymousClass1 = (AnonymousClass1) dVar;
            int i10 = anonymousClass1.label;
            if ((i10 & Integer.MIN_VALUE) != 0) {
                anonymousClass1.label = i10 - Integer.MIN_VALUE;
            } else {
                anonymousClass1 = new AnonymousClass1(dVar);
            }
        } else {
            anonymousClass1 = new AnonymousClass1(dVar);
        }
        Object obj = anonymousClass1.result;
        Object objL = kotlin.coroutines.intrinsics.b.l();
        int i11 = anonymousClass1.label;
        if (i11 == 0) {
            ResultKt.m(obj);
            final i1.a aVar2 = new i1.a();
            Function0 function0 = new Function0() { // from class: io.intercom.android.sdk.ui.coil.a
                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    return PdfDecoder.decode$lambda$2(this.f293893a, aVar2);
                }
            };
            anonymousClass1.L$0 = aVar2;
            anonymousClass1.label = 1;
            Object objC = m2.c(null, function0, anonymousClass1, 1, null);
            if (objC == objL) {
                return objL;
            }
            obj = objC;
            aVar = aVar2;
        } else {
            if (i11 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            aVar = (i1.a) anonymousClass1.L$0;
            ResultKt.m(obj);
        }
        return new coil.decode.f((BitmapDrawable) obj, aVar.f312744a);
    }
}
