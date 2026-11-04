package io.intercom.android.sdk.blocks;

import android.content.Context;
import android.graphics.Typeface;
import android.text.Spanned;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.core.view.d0;
import io.intercom.android.sdk.R;
import io.intercom.android.sdk.blocks.lib.interfaces.CodeBlock;
import io.intercom.android.sdk.blocks.lib.models.BlockMetadata;
import io.intercom.android.sdk.utilities.BlockUtils;
import io.intercom.android.sdk.utilities.commons.ScreenUtils;

/* JADX INFO: loaded from: classes13.dex */
class Code implements CodeBlock {
    Code() {
    }

    private TextView getCodeBlockView(Spanned spanned, Context context) {
        TextView textView = new TextView(context);
        textView.setTextColor(androidx.core.content.d.g(context, R.color.intercom_white));
        textView.setTextSize(14.0f);
        textView.setText(spanned);
        textView.setPadding(ScreenUtils.dpToPx(14.0f, context), ScreenUtils.dpToPx(12.0f, context), ScreenUtils.dpToPx(14.0f, context), ScreenUtils.dpToPx(14.0f, context));
        textView.setBackgroundResource(R.color.intercom_slate_grey_two);
        textView.setTypeface(Typeface.MONOSPACE);
        BlockUtils.createLayoutParams(textView, -2, -2);
        BlockUtils.setDefaultMarginBottom(textView);
        return textView;
    }

    @Override // io.intercom.android.sdk.blocks.lib.interfaces.CodeBlock
    public View addCode(Spanned spanned, BlockMetadata blockMetadata, ViewGroup viewGroup) {
        TextView codeBlockView = getCodeBlockView(spanned, viewGroup.getContext());
        BlockUtils.setLayoutMarginsAndGravity(codeBlockView, d0.f48643b, blockMetadata.isLastObject());
        return codeBlockView;
    }
}
