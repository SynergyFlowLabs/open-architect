package io.intercom.android.sdk.views;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.widget.Button;
import android.widget.RelativeLayout;
import android.widget.TextView;
import androidx.annotation.f1;
import androidx.annotation.l;
import androidx.annotation.p0;
import io.intercom.android.sdk.R;
import io.intercom.android.sdk.utilities.FontUtils;

/* JADX INFO: loaded from: classes13.dex */
public class IntercomErrorView extends RelativeLayout {
    private Button actionButton;
    private TextView subtitle;
    private TextView titleView;

    public IntercomErrorView(Context context) {
        this(context, null);
    }

    @Override // android.view.View
    protected void onFinishInflate() {
        super.onFinishInflate();
        TextView textView = (TextView) findViewById(R.id.empty_text_title);
        this.titleView = textView;
        FontUtils.setRobotoMediumTypeface(textView);
        this.subtitle = (TextView) findViewById(R.id.empty_text_subtitle);
        this.actionButton = (Button) findViewById(R.id.action_button);
    }

    public void setActionButtonClickListener(@p0 View.OnClickListener onClickListener) {
        this.actionButton.setOnClickListener(onClickListener);
    }

    public void setActionButtonText(@f1 int i10) {
        this.actionButton.setText(i10);
    }

    public void setActionButtonTextColor(@l int i10) {
        this.actionButton.setTextColor(i10);
    }

    public void setActionButtonVisibility(int i10) {
        this.actionButton.setVisibility(i10);
    }

    public void setSubtitle(CharSequence charSequence) {
        this.subtitle.setText(charSequence);
    }

    public void setTitle(@f1 int i10) {
        this.titleView.setText(i10);
    }

    public IntercomErrorView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    public void setSubtitle(@f1 int i10) {
        this.subtitle.setText(i10);
    }
}
