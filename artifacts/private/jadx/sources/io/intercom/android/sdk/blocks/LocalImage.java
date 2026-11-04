package io.intercom.android.sdk.blocks;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.ColorMatrix;
import android.graphics.ColorMatrixColorFilter;
import android.net.Uri;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.ImageView;
import androidx.annotation.NonNull;
import coil.request.f;
import coil.request.i;
import coil.request.r;
import com.intercom.twig.Twig;
import io.intercom.android.sdk.R;
import io.intercom.android.sdk.blocks.lib.BlockAlignment;
import io.intercom.android.sdk.blocks.lib.interfaces.LocalImageBlock;
import io.intercom.android.sdk.blocks.lib.models.BlockMetadata;
import io.intercom.android.sdk.logger.LumberMill;
import io.intercom.android.sdk.utilities.BlockUtils;
import io.intercom.android.sdk.utilities.IntercomCoilKt;
import io.intercom.android.sdk.utilities.commons.ScreenUtils;
import io.intercom.android.sdk.views.ProgressFrameLayout;
import io.intercom.android.sdk.views.ResizableImageView;
import io.intercom.android.sdk.views.UploadProgressBar;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes13.dex */
class LocalImage extends Image implements LocalImageBlock {
    private final Twig twig;

    LocalImage(StyleType styleType) {
        super(styleType);
        this.twig = LumberMill.getLogger();
    }

    @Override // io.intercom.android.sdk.blocks.lib.interfaces.LocalImageBlock
    public View addImage(Uri uri, int i10, int i11, BlockAlignment blockAlignment, BlockMetadata blockMetadata, ViewGroup viewGroup) {
        Context context = viewGroup.getContext();
        int iDpToPx = ScreenUtils.dpToPx(i10, context);
        int iDpToPx2 = ScreenUtils.dpToPx(i11, context);
        ProgressFrameLayout progressFrameLayout = new ProgressFrameLayout(context);
        BlockUtils.createLayoutParams(progressFrameLayout, -2, -2);
        BlockUtils.setDefaultMarginBottom(progressFrameLayout);
        final ResizableImageView resizableImageView = new ResizableImageView(context);
        BlockUtils.createLayoutParams(resizableImageView, -2, -2);
        resizableImageView.setAdjustViewBounds(true);
        resizableImageView.setScaleType(ImageView.ScaleType.FIT_START);
        progressFrameLayout.addView(resizableImageView);
        i.a aVarJ = new i.a(context).l0(resizableImageView).j(uri);
        setImageViewBounds(iDpToPx, iDpToPx2, resizableImageView, aVarJ);
        View childAt = progressFrameLayout.getChildAt(0);
        Resources resources = context.getResources();
        if (childAt instanceof UploadProgressBar) {
            int dimensionPixelSize = resources.getDimensionPixelSize(R.dimen.intercom_local_image_upload_size);
            childAt.setLayoutParams(new FrameLayout.LayoutParams(dimensionPixelSize, dimensionPixelSize, 17));
            childAt.bringToFront();
            progressFrameLayout.uploadStarted();
        }
        setBackground(resizableImageView);
        ColorMatrix colorMatrix = new ColorMatrix();
        colorMatrix.setSaturation(0.0f);
        resizableImageView.setColorFilter(new ColorMatrixColorFilter(colorMatrix));
        aVarJ.r0(new q4.d(resources.getDimensionPixelSize(R.dimen.intercom_image_rounded_corners))).i(true).D(new i.b() { // from class: io.intercom.android.sdk.blocks.LocalImage.1
            @Override // coil.request.i.b
            public void onCancel(@NotNull i iVar) {
            }

            @Override // coil.request.i.b
            public void onError(@NonNull i iVar, @NonNull f fVar) {
                LocalImage.this.twig.internal(io.sentry.protocol.d.b.f306176b, "FAILURE");
            }

            @Override // coil.request.i.b
            public void onStart(@NotNull i iVar) {
            }

            @Override // coil.request.i.b
            public void onSuccess(@NonNull i iVar, @NonNull r rVar) {
                LocalImage.this.twig.internal(io.sentry.protocol.d.b.f306176b, "SUCCESS");
                resizableImageView.setBackgroundResource(android.R.color.transparent);
            }
        });
        IntercomCoilKt.loadIntercomImage(context, aVarJ.f());
        BlockUtils.setLayoutMarginsAndGravity(progressFrameLayout, blockAlignment.getGravity(), blockMetadata.isLastObject());
        return progressFrameLayout;
    }
}
