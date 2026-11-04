package io.intercom.android.sdk.blocks.views;

import android.content.Context;
import android.graphics.PorterDuff;
import android.view.View;
import android.widget.ImageView;
import android.widget.ProgressBar;
import android.widget.RelativeLayout;
import androidx.annotation.NonNull;
import androidx.core.content.d;
import coil.request.f;
import coil.request.i;
import coil.request.r;
import io.intercom.android.sdk.Provider;
import io.intercom.android.sdk.R;
import io.intercom.android.sdk.blocks.StyleType;
import io.intercom.android.sdk.identity.AppConfig;
import io.intercom.android.sdk.utilities.AccessibilityUtils;
import io.intercom.android.sdk.utilities.BackgroundUtils;
import io.intercom.android.sdk.utilities.BlockUtils;
import io.intercom.android.sdk.utilities.ColorUtils;
import io.intercom.android.sdk.utilities.IntercomCoilKt;
import io.intercom.android.sdk.utilities.commons.ScreenUtils;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes13.dex */
public class VideoPreviewView extends RelativeLayout {
    private static final int PLAY_ARROW_OFFSET_DP = 3;
    private static final int PLAY_BUTTON_DIAMETER_DP = 48;
    private final ProgressBar loadingSpinner;
    private final ImageView playButton;
    private final ImageView thumbnailImageView;

    public VideoPreviewView(@NonNull Context context, Provider<AppConfig> provider, StyleType styleType) {
        super(context);
        BlockUtils.createLayoutParams(this, -2, -2);
        BlockUtils.setDefaultMarginBottom(this);
        ImageView videoImageView = getVideoImageView(context);
        this.thumbnailImageView = videoImageView;
        ImageView playButtonView = getPlayButtonView(context);
        this.playButton = playButtonView;
        ProgressBar loadingSpinner = getLoadingSpinner();
        this.loadingSpinner = loadingSpinner;
        addView(videoImageView);
        addView(playButtonView);
        addView(loadingSpinner);
        int primaryColor = provider.get().getPrimaryColor();
        primaryColor = styleType == StyleType.POST ? ColorUtils.lightenColor(primaryColor) : primaryColor;
        if (ColorUtils.isColorLight(primaryColor)) {
            playButtonView.setColorFilter(d.g(context, R.color.intercom_accessibility_black), PorterDuff.Mode.SRC_ATOP);
        } else {
            playButtonView.setColorFilter(primaryColor, PorterDuff.Mode.SRC_ATOP);
        }
        AccessibilityUtils accessibilityUtils = AccessibilityUtils.INSTANCE;
        accessibilityUtils.removeClickAbilityAnnouncement(this);
        accessibilityUtils.addClickAbilityAnnouncement(playButtonView);
    }

    private ProgressBar getLoadingSpinner() {
        return (ProgressBar) View.inflate(getContext(), R.layout.intercom_progress_bar, null).findViewById(R.id.progressBar);
    }

    private ImageView getPlayButtonView(Context context) {
        int iDpToPx = ScreenUtils.dpToPx(48.0f, context);
        RelativeLayout.LayoutParams layoutParams = new RelativeLayout.LayoutParams(iDpToPx, iDpToPx);
        layoutParams.addRule(13);
        ImageView imageView = new ImageView(context);
        imageView.setLayoutParams(layoutParams);
        imageView.setScaleType(ImageView.ScaleType.CENTER);
        imageView.setImageResource(R.drawable.intercom_play_arrow);
        imageView.setPadding(ScreenUtils.dpToPx(3.0f, context), 0, 0, 0);
        imageView.setBackgroundResource(R.drawable.intercom_solid_circle);
        imageView.setVisibility(8);
        imageView.setId(R.id.intercom_video_thumbnail_play_button);
        AccessibilityUtils.INSTANCE.addClickAbilityAnnouncement(imageView);
        return imageView;
    }

    private ImageView getVideoImageView(Context context) {
        RelativeLayout.LayoutParams layoutParams = new RelativeLayout.LayoutParams(-2, -2);
        ImageView imageView = new ImageView(context);
        imageView.setLayoutParams(layoutParams);
        imageView.setAdjustViewBounds(true);
        imageView.setScaleType(ImageView.ScaleType.CENTER_CROP);
        imageView.setId(R.id.intercom_video_thumbnail);
        return imageView;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void updateThumbnailAspectRatio() {
        this.thumbnailImageView.getLayoutParams().height = (this.thumbnailImageView.getWidth() * 3) / 4;
    }

    public void displayThumbnail(String str) {
        this.loadingSpinner.setVisibility(0);
        this.thumbnailImageView.setVisibility(4);
        IntercomCoilKt.loadIntercomImage(getContext(), new i.a(getContext()).j(str).L(R.drawable.intercom_video_thumbnail_fallback).r(R.drawable.intercom_video_thumbnail_fallback).i(true).l0(this.thumbnailImageView).D(new i.b() { // from class: io.intercom.android.sdk.blocks.views.VideoPreviewView.1
            @Override // coil.request.i.b
            public void onCancel(@NotNull i iVar) {
            }

            @Override // coil.request.i.b
            public void onError(@NonNull i iVar, @NonNull f fVar) {
                VideoPreviewView.this.loadingSpinner.setVisibility(8);
                int i10 = 7 << 0;
                VideoPreviewView.this.thumbnailImageView.setVisibility(0);
                VideoPreviewView.this.updateThumbnailAspectRatio();
                VideoPreviewView.this.playButton.setVisibility(8);
            }

            @Override // coil.request.i.b
            public void onStart(@NotNull i iVar) {
            }

            @Override // coil.request.i.b
            public void onSuccess(@NonNull i iVar, @NonNull r rVar) {
                VideoPreviewView.this.loadingSpinner.setVisibility(8);
                VideoPreviewView.this.thumbnailImageView.setVisibility(0);
                VideoPreviewView.this.updateThumbnailAspectRatio();
                VideoPreviewView.this.thumbnailImageView.setColorFilter(d.g(VideoPreviewView.this.thumbnailImageView.getContext(), R.color.intercom_semi_transparent), PorterDuff.Mode.DARKEN);
                VideoPreviewView.this.playButton.setVisibility(0);
            }
        }).f());
    }

    public ImageView getThumbnailImageView() {
        return this.thumbnailImageView;
    }

    public void showFailedImage() {
        this.thumbnailImageView.post(new Runnable() { // from class: io.intercom.android.sdk.blocks.views.a
            @Override // java.lang.Runnable
            public final void run() {
                VideoPreviewView videoPreviewView = this.f291545a;
                BackgroundUtils.setBackground(videoPreviewView.thumbnailImageView, d.l(videoPreviewView.getContext(), R.drawable.intercom_video_thumbnail_fallback));
            }
        });
    }
}
