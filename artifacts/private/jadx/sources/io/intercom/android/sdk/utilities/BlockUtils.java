package io.intercom.android.sdk.utilities;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.TextView;
import io.intercom.android.sdk.R;
import io.intercom.android.sdk.utilities.commons.ScreenUtils;

/* JADX INFO: loaded from: classes13.dex */
public class BlockUtils {
    private static final int DEFAULT_MARGIN_BOTTOM_DP = 10;
    private static final int LARGE_LINE_SPACING_DP = 4;
    private static final int SMALL_LINE_SPACING_DP = 2;

    public static void createLayoutParams(View view, int i10, int i11) {
        view.setLayoutParams(new LinearLayout.LayoutParams(i10, i11));
    }

    public static View getBlockView(ViewGroup viewGroup, LinearLayout linearLayout, Context context) {
        View viewInflate = LayoutInflater.from(context).inflate(R.layout.intercom_container_layout, viewGroup, false);
        LinearLayout linearLayout2 = (LinearLayout) viewInflate.findViewById(R.id.cellLayout);
        if (linearLayout.getParent() != null) {
            ((LinearLayout) linearLayout.getParent()).removeView(linearLayout);
        }
        if (linearLayout2.getChildCount() > 0) {
            linearLayout2.removeAllViews();
        }
        linearLayout2.addView(linearLayout, 0);
        viewInflate.setFocusable(false);
        linearLayout2.setVisibility(0);
        return viewInflate;
    }

    public static void setDefaultMarginBottom(View view) {
        setMarginBottom(view, 10);
    }

    public static void setLargeLineSpacing(TextView textView) {
        setLineSpacing(textView, 4);
    }

    public static void setLayoutMarginsAndGravity(View view, int i10, boolean z10) {
        LinearLayout.LayoutParams layoutParams = (LinearLayout.LayoutParams) view.getLayoutParams();
        if (z10) {
            layoutParams.setMargins(layoutParams.leftMargin, layoutParams.topMargin, layoutParams.rightMargin, 0);
        }
        layoutParams.gravity = i10;
    }

    private static void setLineSpacing(TextView textView, int i10) {
        textView.setLineSpacing(ScreenUtils.dpToPx(i10, textView.getContext()), 1.0f);
    }

    public static void setMarginBottom(View view, int i10) {
        ((ViewGroup.MarginLayoutParams) view.getLayoutParams()).bottomMargin = ScreenUtils.dpToPx(i10, view.getContext());
    }

    public static void setMarginLeft(View view, int i10) {
        ((ViewGroup.MarginLayoutParams) view.getLayoutParams()).setMarginStart(ScreenUtils.dpToPx(i10, view.getContext()));
    }

    public static void setSmallLineSpacing(TextView textView) {
        setLineSpacing(textView, 2);
    }
}
