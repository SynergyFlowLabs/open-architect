package io.intercom.android.sdk.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.annotation.p0;
import b4.b;
import b4.c;
import io.intercom.android.sdk.R;
import io.intercom.android.sdk.views.IntercomErrorView;

/* JADX INFO: loaded from: classes13.dex */
public final class IntercomErrorSheetBinding implements b {

    @NonNull
    public final Button actionButton;

    @NonNull
    public final TextView emptyTextSubtitle;

    @NonNull
    public final TextView emptyTextTitle;

    @NonNull
    public final IntercomErrorView errorLayoutSheet;

    @NonNull
    private final IntercomErrorView rootView;

    private IntercomErrorSheetBinding(@NonNull IntercomErrorView intercomErrorView, @NonNull Button button, @NonNull TextView textView, @NonNull TextView textView2, @NonNull IntercomErrorView intercomErrorView2) {
        this.rootView = intercomErrorView;
        this.actionButton = button;
        this.emptyTextSubtitle = textView;
        this.emptyTextTitle = textView2;
        this.errorLayoutSheet = intercomErrorView2;
    }

    @NonNull
    public static IntercomErrorSheetBinding bind(@NonNull View view) {
        int i10 = R.id.action_button;
        Button button = (Button) c.a(view, i10);
        if (button != null) {
            i10 = R.id.empty_text_subtitle;
            TextView textView = (TextView) c.a(view, i10);
            if (textView != null) {
                i10 = R.id.empty_text_title;
                TextView textView2 = (TextView) c.a(view, i10);
                if (textView2 != null) {
                    IntercomErrorView intercomErrorView = (IntercomErrorView) view;
                    return new IntercomErrorSheetBinding(intercomErrorView, button, textView, textView2, intercomErrorView);
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i10)));
    }

    @NonNull
    public static IntercomErrorSheetBinding inflate(@NonNull LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }

    @NonNull
    public static IntercomErrorSheetBinding inflate(@NonNull LayoutInflater layoutInflater, @p0 ViewGroup viewGroup, boolean z10) {
        View viewInflate = layoutInflater.inflate(R.layout.intercom_error_sheet, viewGroup, false);
        if (z10) {
            viewGroup.addView(viewInflate);
        }
        return bind(viewInflate);
    }

    @Override // b4.b
    @NonNull
    public IntercomErrorView getRoot() {
        return this.rootView;
    }
}
