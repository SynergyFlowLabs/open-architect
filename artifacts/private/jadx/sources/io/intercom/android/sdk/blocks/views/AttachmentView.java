package io.intercom.android.sdk.blocks.views;

import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.text.TextUtils;
import android.view.View;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.annotation.l;
import androidx.core.content.d;
import io.intercom.android.sdk.R;
import io.intercom.android.sdk.blocks.StyleType;
import io.intercom.android.sdk.blocks.lib.models.BlockAttachment;
import io.intercom.android.sdk.utilities.IntentUtils;
import io.intercom.android.sdk.utilities.commons.ScreenUtils;

/* JADX INFO: loaded from: classes13.dex */
@e.a({"ViewConstructor"})
public class AttachmentView extends LinearLayout implements View.OnClickListener {
    static final int ATTACHMENT_ICON_WIDTH_DP = 20;
    static final int DIVIDER_MARGIN_DP = 6;
    static final int DIVIDER_WIDTH_DP = 1;
    private final String url;

    public AttachmentView(Context context, StyleType styleType, @l int i10, BlockAttachment blockAttachment) {
        super(context);
        this.url = blockAttachment.getUrl();
        setOrientation(0);
        addView(setupIcon(context, styleType, i10));
        if (isUserMessage(styleType)) {
            addView(setupDivider(context));
        }
        addView(setupName(context, styleType, i10, blockAttachment.getName()));
    }

    private boolean isUserMessage(StyleType styleType) {
        return StyleType.PREVIEW == styleType || StyleType.USER == styleType;
    }

    private View setupDivider(Context context) {
        View view = new View(context);
        int iDpToPx = ScreenUtils.dpToPx(1.0f, context);
        int iDpToPx2 = ScreenUtils.dpToPx(6.0f, context);
        LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(iDpToPx, -1);
        layoutParams.setMargins(iDpToPx2, 0, iDpToPx2, 0);
        view.setLayoutParams(layoutParams);
        view.setBackgroundResource(R.color.intercom_white);
        return view;
    }

    private ImageView setupIcon(Context context, StyleType styleType, int i10) {
        ImageView imageView = new ImageView(context);
        LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(ScreenUtils.dpToPx(20.0f, context), -2);
        layoutParams.gravity = 8388627;
        imageView.setLayoutParams(layoutParams);
        imageView.setImageResource(R.drawable.intercom_icn_attachment);
        if (!isUserMessage(styleType)) {
            imageView.setColorFilter(i10);
        }
        return imageView;
    }

    private TextView setupName(Context context, StyleType styleType, int i10, String str) {
        TextView textView = new TextView(context);
        LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(-2, -2);
        layoutParams.gravity = 8388627;
        textView.setLayoutParams(layoutParams);
        textView.setEllipsize(TextUtils.TruncateAt.END);
        textView.setBackgroundResource(R.color.intercom_full_transparent_full_black);
        textView.setGravity(8388627);
        textView.setTextSize(15.0f);
        textView.setText(str);
        textView.setOnClickListener(this);
        if (isUserMessage(styleType)) {
            textView.setTextColor(d.g(context, R.color.intercom_white));
            return textView;
        }
        textView.setTextColor(i10);
        return textView;
    }

    @Override // android.view.View.OnClickListener
    public void onClick(View view) {
        Uri uri = Uri.parse(this.url);
        if (Uri.EMPTY.equals(uri)) {
            return;
        }
        Intent intent = new Intent("android.intent.action.VIEW", uri);
        intent.setFlags(268435456);
        IntentUtils.safelyOpenIntent(getContext(), intent);
    }
}
