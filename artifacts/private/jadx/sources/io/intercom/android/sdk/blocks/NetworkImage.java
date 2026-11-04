package io.intercom.android.sdk.blocks;

import android.content.Context;
import android.content.res.Resources;
import android.net.Uri;
import android.text.TextUtils;
import android.util.DisplayMetrics;
import android.view.View;
import android.view.ViewGroup;
import android.view.inputmethod.InputMethodManager;
import android.widget.FrameLayout;
import android.widget.ImageView;
import androidx.annotation.NonNull;
import androidx.annotation.l1;
import androidx.annotation.p0;
import coil.decode.r;
import coil.request.f;
import coil.request.i;
import com.facebook.shimmer.e;
import com.intercom.twig.Twig;
import io.intercom.android.sdk.R;
import io.intercom.android.sdk.blocks.lib.BlockAlignment;
import io.intercom.android.sdk.blocks.lib.interfaces.ImageBlock;
import io.intercom.android.sdk.blocks.lib.models.BlockMetadata;
import io.intercom.android.sdk.lightbox.LightBoxActivity;
import io.intercom.android.sdk.logger.LumberMill;
import io.intercom.android.sdk.utilities.AccessibilityUtils;
import io.intercom.android.sdk.utilities.BlockUtils;
import io.intercom.android.sdk.utilities.ImageUtils;
import io.intercom.android.sdk.utilities.IntercomCoilKt;
import io.intercom.android.sdk.utilities.coil.GrayscaleTransformation;
import io.intercom.android.sdk.utilities.coil.RoundedCornersAnimatedTransformation;
import io.intercom.android.sdk.utilities.commons.ScreenUtils;
import io.intercom.android.sdk.views.IntercomShimmerLayout;
import io.intercom.android.sdk.views.ResizableImageView;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes13.dex */
public class NetworkImage extends Image implements ImageBlock {

    @p0
    private final ImageClickListener listener;
    private final Twig twig;
    private final UploadingImageCache uploadingImageCache;

    NetworkImage(StyleType styleType, UploadingImageCache uploadingImageCache, @p0 ImageClickListener imageClickListener) {
        super(styleType);
        this.twig = LumberMill.getLogger();
        this.uploadingImageCache = uploadingImageCache;
        this.listener = imageClickListener;
    }

    private void loadImageFromUrl(final String str, final String str2, final Context context, final int i10, final int i11, final ResizableImageView resizableImageView, final e eVar) {
        if (TextUtils.isEmpty(str)) {
            hideLoadingState(eVar, resizableImageView);
            resizableImageView.setImageResource(R.drawable.intercom_image_load_failed);
            resizableImageView.setScaleType(ImageView.ScaleType.CENTER);
            return;
        }
        i.a aVarJ = new i.a(context).r(R.drawable.intercom_image_load_failed).i(true).l0(resizableImageView).j(str);
        setImageViewBounds(i10, i11, resizableImageView, aVarJ);
        Resources resources = context.getResources();
        if (getStyle() != StyleType.CAROUSEL) {
            if (ImageUtils.isGif(str)) {
                aVarJ.a0(r.f87203f, new RoundedCornersAnimatedTransformation(resources.getDimensionPixelSize(R.dimen.intercom_image_rounded_corners)));
            } else {
                aVarJ.r0(new q4.d(resources.getDimensionPixelSize(R.dimen.intercom_image_rounded_corners)));
            }
        }
        Uri localImageUriForRemoteUrl = this.uploadingImageCache.getLocalImageUriForRemoteUrl(str);
        if (localImageUriForRemoteUrl != null) {
            aVarJ.r0(new GrayscaleTransformation()).j(localImageUriForRemoteUrl);
        }
        aVarJ.D(new i.b() { // from class: io.intercom.android.sdk.blocks.NetworkImage.1
            @Override // coil.request.i.b
            public void onCancel(@NotNull i iVar) {
            }

            @Override // coil.request.i.b
            public void onError(@NonNull i iVar, @NonNull f fVar) {
                ResizableImageView resizableImageView2 = resizableImageView;
                ImageView.ScaleType scaleType = ImageView.ScaleType.CENTER;
                resizableImageView2.setScaleType(scaleType);
                NetworkImage.this.hideLoadingState(eVar, resizableImageView);
                NetworkImage.this.twig.internal(io.sentry.protocol.d.b.f306176b, "FAILURE");
                resizableImageView.setScaleType(scaleType);
            }

            @Override // coil.request.i.b
            public void onStart(@NotNull i iVar) {
            }

            @Override // coil.request.i.b
            public void onSuccess(@NonNull i iVar, @NonNull coil.request.r rVar) {
                NetworkImage.this.twig.internal(io.sentry.protocol.d.b.f306176b, "SUCCESS");
                NetworkImage.this.hideLoadingState(eVar, resizableImageView);
                if (NetworkImage.this.getStyle() == StyleType.CHAT_FULL || NetworkImage.this.listener == null) {
                    return;
                }
                resizableImageView.setOnClickListener(new View.OnClickListener() { // from class: io.intercom.android.sdk.blocks.NetworkImage.1.1
                    @Override // android.view.View.OnClickListener
                    public void onClick(View view) {
                        ((InputMethodManager) context.getSystemService("input_method")).hideSoftInputFromWindow(view.getWindowToken(), 0);
                        ImageClickListener imageClickListener = NetworkImage.this.listener;
                        AnonymousClass1 anonymousClass1 = AnonymousClass1.this;
                        imageClickListener.onImageClicked(str, str2, resizableImageView, i10, i11);
                    }
                });
            }
        });
        IntercomCoilKt.loadIntercomImage(context, aVarJ.f());
    }

    @Override // io.intercom.android.sdk.blocks.lib.interfaces.ImageBlock
    public View addImage(String str, String str2, String str3, int i10, int i11, BlockAlignment blockAlignment, BlockMetadata blockMetadata, ViewGroup viewGroup) {
        Context context = viewGroup.getContext();
        int iDpToPx = ScreenUtils.dpToPx(i10, context);
        int iDpToPx2 = ScreenUtils.dpToPx(i11, context);
        e intercomShimmerLayout = new IntercomShimmerLayout(context);
        BlockUtils.createLayoutParams(intercomShimmerLayout, -2, -2);
        BlockUtils.setDefaultMarginBottom(intercomShimmerLayout);
        ResizableImageView resizableImageView = new ResizableImageView(context);
        resizableImageView.setTransitionName(LightBoxActivity.TRANSITION_KEY);
        resizableImageView.setLayoutParams(new FrameLayout.LayoutParams(-2, -2));
        resizableImageView.setAdjustViewBounds(true);
        resizableImageView.setScaleType(ImageView.ScaleType.FIT_START);
        setBackground(resizableImageView);
        intercomShimmerLayout.addView(resizableImageView);
        loadImageFromUrl(str, str2, context, iDpToPx, iDpToPx2, resizableImageView, intercomShimmerLayout);
        BlockUtils.setLayoutMarginsAndGravity(intercomShimmerLayout, blockAlignment.getGravity(), blockMetadata.isLastObject());
        if (TextUtils.isEmpty(str2) && TextUtils.isEmpty(str3)) {
            AccessibilityUtils.INSTANCE.removeClickAbilityAnnouncement(resizableImageView);
            return intercomShimmerLayout;
        }
        if (!TextUtils.isEmpty(str3)) {
            resizableImageView.setFocusable(true);
            resizableImageView.setContentDescription(str3);
        }
        return intercomShimmerLayout;
    }

    @l1
    int getSampleSize(int i10, int i11, DisplayMetrics displayMetrics) {
        int i12 = displayMetrics.widthPixels;
        if (i10 <= i12 && i11 <= displayMetrics.heightPixels) {
            return 1;
        }
        return (int) Math.pow(2.0d, (int) Math.ceil(Math.log(((double) i12) / ((double) Math.max(i11, i10))) / Math.log(0.5d)));
    }

    void hideLoadingState(e eVar, ImageView imageView) {
        if (eVar != null) {
            eVar.hideShimmer();
            imageView.setBackgroundResource(android.R.color.transparent);
        }
    }
}
