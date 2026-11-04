package io.intercom.android.sdk.survey.block;

import android.content.Context;
import android.net.Uri;
import android.view.View;
import androidx.compose.foundation.e2;
import androidx.compose.foundation.i1;
import androidx.compose.foundation.layout.i6;
import androidx.compose.runtime.d7;
import androidx.compose.runtime.n3;
import androidx.compose.runtime.s5;
import androidx.compose.runtime.t4;
import androidx.compose.ui.graphics.t0;
import androidx.compose.ui.platform.AndroidCompositionLocals_androidKt;
import androidx.compose.ui.platform.q1;
import coil.compose.AsyncImagePainter;
import io.intercom.android.sdk.Injector;
import io.intercom.android.sdk.R;
import io.intercom.android.sdk.blocks.lib.models.Block;
import io.intercom.android.sdk.ui.coil.IntercomImageLoaderKt;
import io.intercom.android.sdk.ui.extension.ModifierExtensionsKt;
import io.intercom.android.sdk.ui.preview.data.DownloadState;
import io.intercom.android.sdk.ui.preview.data.IntercomPreviewArgs;
import io.intercom.android.sdk.ui.preview.data.IntercomPreviewFile;
import io.intercom.android.sdk.ui.preview.ui.IntercomPreviewActivity;
import io.intercom.android.sdk.ui.theme.IntercomTheme;
import io.intercom.android.sdk.utilities.ImageUtils;
import io.intercom.android.sdk.utilities.LinkOpener;
import java.util.List;
import kotlin.Pair;
import kotlin.TuplesKt;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.text.StringsKt;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes13.dex */
@SourceDebugExtension({"SMAP\nImageBlock.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ImageBlock.kt\nio/intercom/android/sdk/survey/block/ImageBlockKt\n+ 2 Composer.kt\nandroidx/compose/runtime/ComposerKt\n+ 3 SnapshotState.kt\nandroidx/compose/runtime/SnapshotStateKt__SnapshotStateKt\n*L\n1#1,194:1\n1282#2,6:195\n85#3:201\n117#3,2:202\n*S KotlinDebug\n*F\n+ 1 ImageBlock.kt\nio/intercom/android/sdk/survey/block/ImageBlockKt\n*L\n69#1:195,6\n69#1:201\n69#1:202,2\n*E\n"})
public final class ImageBlockKt {

    /* JADX INFO: renamed from: io.intercom.android.sdk.survey.block.ImageBlockKt$ImageBlock$1, reason: invalid class name */
    @SourceDebugExtension({"SMAP\nImageBlock.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ImageBlock.kt\nio/intercom/android/sdk/survey/block/ImageBlockKt$ImageBlock$1\n+ 2 CompositionLocal.kt\nandroidx/compose/runtime/CompositionLocal\n+ 3 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 4 Dp.kt\nandroidx/compose/ui/unit/DpKt\n+ 5 Dp.kt\nandroidx/compose/ui/unit/Dp\n+ 6 Composer.kt\nandroidx/compose/runtime/ComposerKt\n*L\n1#1,194:1\n75#2:195\n75#2:201\n75#2:202\n75#2:203\n1#3:196\n113#4:197\n113#4:198\n161#4:200\n66#5:199\n1282#6,6:204\n1282#6,6:210\n1282#6,6:216\n*S KotlinDebug\n*F\n+ 1 ImageBlock.kt\nio/intercom/android/sdk/survey/block/ImageBlockKt$ImageBlock$1\n*L\n72#1:195\n112#1:201\n122#1:202\n133#1:203\n77#1:197\n91#1:198\n107#1:200\n97#1:199\n137#1:204,6\n140#1:210,6\n135#1:216,6\n*E\n"})
    static final class AnonymousClass1 implements pj.n<androidx.compose.foundation.layout.h0, androidx.compose.runtime.c0, Integer, Unit> {
        final /* synthetic */ Block $block;
        final /* synthetic */ String $cacheKey;
        final /* synthetic */ Uri $dataUri;
        final /* synthetic */ androidx.compose.ui.a0 $modifier;
        final /* synthetic */ Function1<Block, Unit> $onClick;
        final /* synthetic */ ImageRenderType $renderType;
        final /* synthetic */ n3<AsyncImagePainter.State> $state$delegate;

        /* JADX WARN: Multi-variable type inference failed */
        AnonymousClass1(Block block, ImageRenderType imageRenderType, String str, Uri uri, androidx.compose.ui.a0 a0Var, n3<AsyncImagePainter.State> n3Var, Function1<? super Block, Unit> function1) {
            this.$block = block;
            this.$renderType = imageRenderType;
            this.$cacheKey = str;
            this.$dataUri = uri;
            this.$modifier = a0Var;
            this.$state$delegate = n3Var;
            this.$onClick = function1;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final androidx.compose.ui.a0 invoke$lambda$10$lambda$9(float f10, float f11, androidx.compose.ui.a0 ifTrue) {
            Intrinsics.checkNotNullParameter(ifTrue, "$this$ifTrue");
            return i6.y(ifTrue, f10, f11);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final Unit invoke$lambda$12(Function1 function1, Block block, View currentView, String fileSavingText, String fileSavedText, String saveFailedText, String permissionDeniedText) {
            Intrinsics.checkNotNullParameter(block, "$block");
            Intrinsics.checkNotNullParameter(currentView, "$currentView");
            Intrinsics.checkNotNullParameter(fileSavingText, "$fileSavingText");
            Intrinsics.checkNotNullParameter(fileSavedText, "$fileSavedText");
            Intrinsics.checkNotNullParameter(saveFailedText, "$saveFailedText");
            Intrinsics.checkNotNullParameter(permissionDeniedText, "$permissionDeniedText");
            if (function1 != null) {
                function1.invoke(block);
            } else {
                String linkUrl = block.getLinkUrl();
                Intrinsics.checkNotNullExpressionValue(linkUrl, "getLinkUrl(...)");
                if (linkUrl.length() > 0) {
                    LinkOpener.handleUrl(block.getLinkUrl(), currentView.getContext(), Injector.get().getApi());
                } else {
                    Context context = currentView.getContext();
                    IntercomPreviewActivity.Companion companion = IntercomPreviewActivity.Companion;
                    Intrinsics.checkNotNull(context);
                    String url = block.getUrl();
                    Intrinsics.checkNotNullExpressionValue(url, "getUrl(...)");
                    List listListOf = CollectionsKt.listOf(new IntercomPreviewFile.NetworkFile(url, "image/*"));
                    String url2 = block.getUrl();
                    Intrinsics.checkNotNullExpressionValue(url2, "getUrl(...)");
                    context.startActivity(companion.createIntent(context, new IntercomPreviewArgs(listListOf, null, null, false, new DownloadState(url2.length() > 0, fileSavingText, fileSavedText, saveFailedText, permissionDeniedText), 14, null)));
                }
            }
            return Unit.f312394a;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final Unit invoke$lambda$14$lambda$13(n3 state$delegate, AsyncImagePainter.State it) {
            Intrinsics.checkNotNullParameter(state$delegate, "$state$delegate");
            Intrinsics.checkNotNullParameter(it, "it");
            ImageBlockKt.ImageBlock$lambda$2(state$delegate, it);
            return Unit.f312394a;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final androidx.compose.ui.a0 invoke$lambda$8$lambda$7(float f10, float f11, androidx.compose.ui.a0 ifTrue) {
            Intrinsics.checkNotNullParameter(ifTrue, "$this$ifTrue");
            return i6.A(ifTrue, 0.0f, 0.0f, f10, f11, 3, null);
        }

        @Override // pj.n
        public /* bridge */ /* synthetic */ Unit invoke(androidx.compose.foundation.layout.h0 h0Var, androidx.compose.runtime.c0 c0Var, Integer num) {
            invoke(h0Var, c0Var, num.intValue());
            return Unit.f312394a;
        }

        @androidx.compose.runtime.o
        @androidx.compose.runtime.t(applier = "androidx.compose.ui.UiComposable")
        public final void invoke(androidx.compose.foundation.layout.h0 BoxWithConstraints, androidx.compose.runtime.c0 c0Var, int i10) {
            int i11;
            Pair pair;
            Intrinsics.checkNotNullParameter(BoxWithConstraints, "$this$BoxWithConstraints");
            if ((i10 & 14) == 0) {
                i11 = i10 | (c0Var.D(BoxWithConstraints) ? 4 : 2);
            } else {
                i11 = i10;
            }
            if ((i11 & 91) == 18 && c0Var.d()) {
                c0Var.u();
                return;
            }
            androidx.compose.ui.unit.d dVar = (androidx.compose.ui.unit.d) c0Var.W(q1.m());
            boolean z10 = this.$block.getHeight() > 0 && this.$block.getWidth() > 0;
            ImageRenderType imageRenderType = this.$renderType;
            ImageRenderType imageRenderType2 = ImageRenderType.WITH_MAX_SIZE;
            if (imageRenderType == imageRenderType2 && z10) {
                float fS7 = dVar.S7(androidx.compose.ui.unit.h.r(268));
                if (this.$block.getWidth() > this.$block.getHeight()) {
                    pair = TuplesKt.to(androidx.compose.ui.unit.h.o(dVar.F3(fS7)), androidx.compose.ui.unit.h.o(dVar.F3(fS7 * ((this.$block.getHeight() * 1.0f) / this.$block.getWidth()))));
                } else {
                    pair = TuplesKt.to(androidx.compose.ui.unit.h.o(dVar.F3(((this.$block.getWidth() * 1.0f) / this.$block.getHeight()) * fS7)), androidx.compose.ui.unit.h.o(dVar.F3(fS7)));
                }
            } else if (imageRenderType == imageRenderType2) {
                float f10 = 268;
                pair = TuplesKt.to(androidx.compose.ui.unit.h.o(androidx.compose.ui.unit.h.r(f10)), androidx.compose.ui.unit.h.o(androidx.compose.ui.unit.h.r(f10)));
            } else {
                float fC = BoxWithConstraints.c();
                float fG = this.$renderType == ImageRenderType.FULL ? BoxWithConstraints.g() : androidx.compose.ui.unit.h.r(1.5f * fC);
                if (this.$block.getHeight() > 0) {
                    Block block = this.$block;
                    fG = androidx.compose.ui.unit.h.r(kotlin.ranges.r.A(dVar.D3(ImageUtils.getAspectHeight((int) dVar.S7(fC), ImageUtils.getAspectRatio(block.getWidth(), block.getHeight()))), fG));
                }
                pair = TuplesKt.to(androidx.compose.ui.unit.h.o(fC), androidx.compose.ui.unit.h.o(fG));
            }
            final float fO = ((androidx.compose.ui.unit.h) pair.component1()).O();
            final float fO2 = ((androidx.compose.ui.unit.h) pair.component2()).O();
            final View view = (View) c0Var.W(AndroidCompositionLocals_androidKt.m());
            float[] fArrC = t0.c(null, 1, null);
            t0.r(fArrC, 0.0f);
            final String strD = u0.i.d(R.string.intercom_permission_denied, c0Var, 0);
            final String strD2 = u0.i.d(R.string.intercom_file_saved, c0Var, 0);
            final String strD3 = u0.i.d(R.string.intercom_saving, c0Var, 0);
            final String strD4 = u0.i.d(R.string.intercom_something_went_wrong_try_again, c0Var, 0);
            coil.request.i iVarF = new coil.request.i.a((Context) c0Var.W(AndroidCompositionLocals_androidKt.g())).H(this.$cacheKey).o(this.$cacheKey).j(this.$dataUri).e0((int) dVar.S7(fO), (int) dVar.S7(fO2)).i(true).r(R.drawable.intercom_image_load_failed).f();
            coil.j imageLoader = IntercomImageLoaderKt.getImageLoader((Context) c0Var.W(AndroidCompositionLocals_androidKt.g()));
            c0Var.E(1738641811);
            String text = this.$block.getText();
            if (StringsKt.w3(text)) {
                text = u0.i.d(R.string.intercom_image_attached, c0Var, 0);
            }
            c0Var.A();
            androidx.compose.ui.a0 a0Var = this.$modifier;
            boolean z11 = this.$renderType == imageRenderType2 && !z10;
            c0Var.E(1738649296);
            boolean zI = c0Var.I(fO) | c0Var.I(fO2);
            Object objI0 = c0Var.i0();
            if (zI || objI0 == androidx.compose.runtime.c0.f35327a.a()) {
                objI0 = new Function1() { // from class: io.intercom.android.sdk.survey.block.r
                    @Override // kotlin.jvm.functions.Function1
                    public final Object invoke(Object obj) {
                        return ImageBlockKt.AnonymousClass1.invoke$lambda$8$lambda$7(fO, fO2, (androidx.compose.ui.a0) obj);
                    }
                };
                c0Var.Y(objI0);
            }
            c0Var.A();
            androidx.compose.ui.a0 a0VarIfTrue = ModifierExtensionsKt.ifTrue(a0Var, z11, (Function1) objI0);
            boolean z12 = this.$renderType != imageRenderType2 || z10;
            c0Var.E(1738655368);
            boolean zI2 = c0Var.I(fO) | c0Var.I(fO2);
            Object objI1 = c0Var.i0();
            if (zI2 || objI1 == androidx.compose.runtime.c0.f35327a.a()) {
                objI1 = new Function1() { // from class: io.intercom.android.sdk.survey.block.s
                    @Override // kotlin.jvm.functions.Function1
                    public final Object invoke(Object obj) {
                        return ImageBlockKt.AnonymousClass1.invoke$lambda$10$lambda$9(fO, fO2, (androidx.compose.ui.a0) obj);
                    }
                };
                c0Var.Y(objI1);
            }
            c0Var.A();
            androidx.compose.ui.a0 a0VarC = e2.c(com.google.accompanist.placeholder.e.d(androidx.compose.foundation.v.d(ModifierExtensionsKt.ifTrue(a0VarIfTrue, z12, (Function1) objI1), IntercomTheme.INSTANCE.getColors(c0Var, IntercomTheme.$stable).m693getBubbleBackground0d7_KjU(), null, 2, null), (ImageBlockKt.ImageBlock$lambda$1(this.$state$delegate) instanceof AsyncImagePainter.State.a) || (ImageBlockKt.ImageBlock$lambda$1(this.$state$delegate) instanceof AsyncImagePainter.State.Loading), androidx.compose.ui.graphics.s0.b(869059788), null, com.google.accompanist.placeholder.d.d(com.google.accompanist.placeholder.c.f103143a, androidx.compose.ui.graphics.s0.d(2499805183L), null, 0.0f, 6, null), null, null, 52, null), false, null, 3, null);
            final Function1<Block, Unit> function1 = this.$onClick;
            final Block block2 = this.$block;
            androidx.compose.ui.a0 a0VarJ = i1.j(a0VarC, false, null, null, null, new Function0() { // from class: io.intercom.android.sdk.survey.block.t
                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    return ImageBlockKt.AnonymousClass1.invoke$lambda$12(function1, block2, view, strD3, strD2, strD4, strD);
                }
            }, 15, null);
            androidx.compose.ui.layout.l lVarA = this.$renderType == ImageRenderType.CROPPED ? androidx.compose.ui.layout.l.f39405a.a() : androidx.compose.ui.layout.l.f39405a.i();
            androidx.compose.ui.graphics.r0 r0VarA = ImageBlockKt.getHasUri(this.$block) ? androidx.compose.ui.graphics.r0.f38151b.a(fArrC) : null;
            c0Var.E(1738644608);
            final n3<AsyncImagePainter.State> n3Var = this.$state$delegate;
            Object objI2 = c0Var.i0();
            if (objI2 == androidx.compose.runtime.c0.f35327a.a()) {
                objI2 = new Function1() { // from class: io.intercom.android.sdk.survey.block.u
                    @Override // kotlin.jvm.functions.Function1
                    public final Object invoke(Object obj) {
                        return ImageBlockKt.AnonymousClass1.invoke$lambda$14$lambda$13(n3Var, (AsyncImagePainter.State) obj);
                    }
                };
                c0Var.Y(objI2);
            }
            c0Var.A();
            coil.compose.c.g(iVarF, text, imageLoader, a0VarJ, null, (Function1) objI2, null, lVarA, 0.0f, r0VarA, 0, false, null, c0Var, 197128, 0, 7504);
        }
    }

    @androidx.compose.runtime.o
    @androidx.compose.runtime.t(applier = "androidx.compose.ui.UiComposable")
    public static final void ImageBlock(@NotNull final Block block, @Nullable androidx.compose.ui.a0 a0Var, @Nullable Function1<? super Block, Unit> function1, boolean z10, @Nullable ImageRenderType imageRenderType, @Nullable androidx.compose.runtime.c0 c0Var, final int i10, final int i11) {
        Uri localUri;
        String previewUrl;
        Intrinsics.checkNotNullParameter(block, "block");
        androidx.compose.runtime.c0 c0VarR = c0Var.R(-762701011);
        androidx.compose.ui.a0 a0Var2 = (i11 & 2) != 0 ? androidx.compose.ui.a0.E : a0Var;
        Function1<? super Block, Unit> function2 = (i11 & 4) != 0 ? null : function1;
        boolean z11 = false;
        boolean z12 = (i11 & 8) != 0 ? false : z10;
        ImageRenderType imageRenderType2 = (i11 & 16) != 0 ? ImageRenderType.CROPPED : imageRenderType;
        if (!getHasUri(block) && z12 && (previewUrl = block.getPreviewUrl()) != null && previewUrl.length() != 0) {
            z11 = true;
        }
        if (getHasUri(block)) {
            localUri = block.getLocalUri();
        } else if (z11) {
            localUri = Uri.parse(block.getPreviewUrl());
        } else {
            String url = block.getUrl();
            if (url == null) {
                url = "";
            }
            localUri = Uri.parse(url);
        }
        String path = localUri.getPath();
        c0VarR.E(2072019078);
        Object objI0 = c0VarR.i0();
        if (objI0 == androidx.compose.runtime.c0.f35327a.a()) {
            objI0 = d7.g(AsyncImagePainter.State.a.f86965b, null, 2, null);
            c0VarR.Y(objI0);
        }
        c0VarR.A();
        final androidx.compose.ui.a0 a0Var3 = a0Var2;
        final ImageRenderType imageRenderType3 = imageRenderType2;
        androidx.compose.foundation.layout.g0.c(a0Var3, null, false, androidx.compose.runtime.internal.w.e(-179054825, true, new AnonymousClass1(block, imageRenderType2, path, localUri, a0Var3, (n3) objI0, function2), c0VarR, 54), c0VarR, ((i10 >> 3) & 14) | 3072, 6);
        s5 s5VarT = c0VarR.T();
        if (s5VarT != null) {
            final Function1<? super Block, Unit> function3 = function2;
            final boolean z13 = z12;
            s5VarT.a(new Function2() { // from class: io.intercom.android.sdk.survey.block.q
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    return ImageBlockKt.ImageBlock$lambda$3(block, a0Var3, function3, z13, imageRenderType3, i10, i11, (androidx.compose.runtime.c0) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final AsyncImagePainter.State ImageBlock$lambda$1(n3<AsyncImagePainter.State> n3Var) {
        return n3Var.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void ImageBlock$lambda$2(n3<AsyncImagePainter.State> n3Var, AsyncImagePainter.State state) {
        n3Var.setValue(state);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit ImageBlock$lambda$3(Block block, androidx.compose.ui.a0 a0Var, Function1 function1, boolean z10, ImageRenderType imageRenderType, int i10, int i11, androidx.compose.runtime.c0 c0Var, int i12) {
        Intrinsics.checkNotNullParameter(block, "$block");
        ImageBlock(block, a0Var, function1, z10, imageRenderType, c0Var, t4.a(i10 | 1), i11);
        return Unit.f312394a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean getHasUri(Block block) {
        return (block.getLocalUri() == null || Intrinsics.areEqual(block.getLocalUri(), Uri.EMPTY)) ? false : true;
    }
}
