package io.intercom.android.sdk.blocks;

import android.content.Context;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.core.view.d0;
import io.intercom.android.sdk.Provider;
import io.intercom.android.sdk.R;
import io.intercom.android.sdk.blocks.lib.interfaces.AttachmentListBlock;
import io.intercom.android.sdk.blocks.lib.interfaces.LocalAttachmentBlock;
import io.intercom.android.sdk.blocks.lib.models.BlockAttachment;
import io.intercom.android.sdk.blocks.lib.models.BlockMetadata;
import io.intercom.android.sdk.blocks.views.AttachmentView;
import io.intercom.android.sdk.identity.AppConfig;
import io.intercom.android.sdk.utilities.BlockUtils;
import io.intercom.android.sdk.utilities.ColorUtils;
import io.intercom.android.sdk.utilities.commons.ScreenUtils;
import io.intercom.android.sdk.views.ProgressLinearLayout;
import io.intercom.android.sdk.views.UploadProgressBar;
import java.util.List;

/* JADX INFO: loaded from: classes13.dex */
class Attachment implements AttachmentListBlock, LocalAttachmentBlock {
    private static final int ATTACHMENT_LINE_SPACING_DP = 12;
    private static final int DIVIDER_MARGIN_DP = 6;
    private static final int DIVIDER_WIDTH_DP = 1;
    private static final int LOCAL_ICON_SIZE_DP = 20;
    private final Provider<AppConfig> appConfigProvider;
    private final StyleType style;

    public Attachment(StyleType styleType, Provider<AppConfig> provider) {
        this.style = styleType;
        this.appConfigProvider = provider;
    }

    private ImageView getAttachmentIcon(Context context) {
        ImageView imageView = new ImageView(context);
        imageView.setLayoutParams(new FrameLayout.LayoutParams(-1, -1));
        imageView.setVisibility(8);
        imageView.setImageResource(R.drawable.intercom_icn_attachment);
        return imageView;
    }

    private LinearLayout getAttachmentListView(Context context) {
        LinearLayout linearLayout = new LinearLayout(context);
        linearLayout.setOrientation(1);
        linearLayout.setBackgroundResource(R.color.intercom_full_transparent_full_black);
        BlockUtils.createLayoutParams(linearLayout, -2, -2);
        BlockUtils.setDefaultMarginBottom(linearLayout);
        return linearLayout;
    }

    private View getDivider(Context context) {
        int iDpToPx = ScreenUtils.dpToPx(6.0f, context);
        int iDpToPx2 = ScreenUtils.dpToPx(1.0f, context);
        View view = new View(context);
        view.setBackgroundResource(R.color.intercom_white);
        BlockUtils.createLayoutParams(view, iDpToPx2, -1);
        LinearLayout.LayoutParams layoutParams = (LinearLayout.LayoutParams) view.getLayoutParams();
        layoutParams.leftMargin = iDpToPx;
        layoutParams.rightMargin = iDpToPx;
        return view;
    }

    private FrameLayout getIconHolder(Context context) {
        int iDpToPx = ScreenUtils.dpToPx(20.0f, context);
        FrameLayout frameLayout = new FrameLayout(context);
        BlockUtils.createLayoutParams(frameLayout, iDpToPx, iDpToPx);
        ((LinearLayout.LayoutParams) frameLayout.getLayoutParams()).gravity = 8388627;
        return frameLayout;
    }

    private ProgressLinearLayout getLocalAttachmentView(Context context) {
        ProgressLinearLayout progressLinearLayout = new ProgressLinearLayout(context);
        BlockUtils.createLayoutParams(progressLinearLayout, -2, -2);
        BlockUtils.setDefaultMarginBottom(progressLinearLayout);
        progressLinearLayout.setOrientation(0);
        return progressLinearLayout;
    }

    private TextView getTextView(String str, Context context) {
        TextView textView = new TextView(context);
        BlockUtils.createLayoutParams(textView, -2, -2);
        BlockUtils.setSmallLineSpacing(textView);
        textView.setGravity(8388627);
        textView.setEllipsize(TextUtils.TruncateAt.END);
        textView.setTextSize(15.0f);
        textView.setTextColor(androidx.core.content.d.g(context, R.color.intercom_white));
        textView.setBackgroundResource(R.color.intercom_full_transparent_full_black);
        textView.setText(str);
        return textView;
    }

    private UploadProgressBar getUploadProgressBar(Context context) {
        UploadProgressBar uploadProgressBar = new UploadProgressBar(context);
        uploadProgressBar.setLayoutParams(new FrameLayout.LayoutParams(-1, -1));
        return uploadProgressBar;
    }

    @Override // io.intercom.android.sdk.blocks.lib.interfaces.LocalAttachmentBlock
    public View addAttachment(BlockAttachment blockAttachment, BlockMetadata blockMetadata, ViewGroup viewGroup) {
        Context context = viewGroup.getContext();
        ProgressLinearLayout localAttachmentView = getLocalAttachmentView(context);
        FrameLayout iconHolder = getIconHolder(context);
        ImageView attachmentIcon = getAttachmentIcon(context);
        UploadProgressBar uploadProgressBar = getUploadProgressBar(context);
        getDivider(context);
        TextView textView = getTextView(blockAttachment.getName(), context);
        iconHolder.addView(uploadProgressBar);
        iconHolder.addView(attachmentIcon);
        localAttachmentView.setUploadProgressBar(uploadProgressBar);
        localAttachmentView.setAttachmentIcon(attachmentIcon);
        localAttachmentView.addView(textView);
        BlockUtils.setLayoutMarginsAndGravity(localAttachmentView, d0.f48643b, blockMetadata.isLastObject());
        return localAttachmentView;
    }

    @Override // io.intercom.android.sdk.blocks.lib.interfaces.AttachmentListBlock
    public View addAttachmentList(List<BlockAttachment> list, BlockMetadata blockMetadata, ViewGroup viewGroup) {
        Context context = viewGroup.getContext();
        LinearLayout attachmentListView = getAttachmentListView(context);
        int primaryColor = this.appConfigProvider.get().getPrimaryColor();
        int iG = androidx.core.content.d.g(context, R.color.intercom_white);
        int iG2 = androidx.core.content.d.g(context, R.color.intercom_accessibility_black);
        if (ColorUtils.isComparedColorsLowerThanAccessibilityContrastRatio(primaryColor, iG)) {
            primaryColor = iG2;
        }
        int size = list.size();
        for (int i10 = 0; i10 < size; i10++) {
            AttachmentView attachmentView = new AttachmentView(context, this.style, primaryColor, list.get(i10));
            if (i10 < size - 1) {
                attachmentView.setPadding(attachmentView.getPaddingLeft(), attachmentView.getPaddingTop(), attachmentView.getPaddingRight(), ScreenUtils.dpToPx(12.0f, context));
            }
            attachmentListView.addView(attachmentView);
        }
        BlockUtils.setLayoutMarginsAndGravity(attachmentListView, d0.f48643b, blockMetadata.isLastObject());
        return attachmentListView;
    }
}
