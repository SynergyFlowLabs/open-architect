package io.intercom.android.sdk.views;

import android.content.Context;
import android.graphics.Point;
import android.util.AttributeSet;
import androidx.appcompat.widget.AppCompatImageView;
import io.intercom.android.sdk.utilities.ImageUtils;
import io.intercom.android.sdk.utilities.commons.ScreenUtils;

/* JADX INFO: loaded from: classes13.dex */
public class ResizableImageView extends AppCompatImageView {
    private int imageHeight;
    private int imageWidth;
    private int totalViewPadding;

    public ResizableImageView(Context context) {
        this(context, null);
    }

    private int calculateContainerWidth() {
        return ScreenUtils.getScreenDimensions(getContext()).x;
    }

    public Point getImageDimens() {
        double aspectRatio = ImageUtils.getAspectRatio(this.imageWidth, this.imageHeight);
        int iMin = Math.min(this.imageWidth, calculateContainerWidth() - this.totalViewPadding);
        return new Point(iMin, ImageUtils.getAspectHeight(iMin, aspectRatio));
    }

    @Override // android.widget.ImageView, android.view.View
    protected void onMeasure(int i10, int i11) {
        Point imageDimens = getImageDimens();
        if (this.imageWidth <= 0 || this.imageHeight <= 0) {
            super.onMeasure(i10, i11);
        } else {
            setMeasuredDimension(imageDimens.x, imageDimens.y);
        }
    }

    public void setDisplayImageDimensions(int i10, int i11) {
        this.imageHeight = i11;
        this.imageWidth = i10;
    }

    public void setTotalViewPadding(int i10) {
        this.totalViewPadding = i10;
    }

    public ResizableImageView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public ResizableImageView(Context context, AttributeSet attributeSet, int i10) {
        super(context, attributeSet, i10);
    }
}
