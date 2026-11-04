package io.intercom.android.sdk.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AutoCompleteTextView;
import android.widget.FrameLayout;
import androidx.annotation.NonNull;
import androidx.annotation.p0;
import b4.b;
import b4.c;
import io.intercom.android.sdk.R;

/* JADX INFO: loaded from: classes13.dex */
public final class IntercomWebviewCardInputBinding implements b {

    @NonNull
    public final AutoCompleteTextView input;

    @NonNull
    private final FrameLayout rootView;

    private IntercomWebviewCardInputBinding(@NonNull FrameLayout frameLayout, @NonNull AutoCompleteTextView autoCompleteTextView) {
        this.rootView = frameLayout;
        this.input = autoCompleteTextView;
    }

    @NonNull
    public static IntercomWebviewCardInputBinding bind(@NonNull View view) {
        int i10 = R.id.input;
        AutoCompleteTextView autoCompleteTextView = (AutoCompleteTextView) c.a(view, i10);
        if (autoCompleteTextView != null) {
            return new IntercomWebviewCardInputBinding((FrameLayout) view, autoCompleteTextView);
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i10)));
    }

    @NonNull
    public static IntercomWebviewCardInputBinding inflate(@NonNull LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }

    @NonNull
    public static IntercomWebviewCardInputBinding inflate(@NonNull LayoutInflater layoutInflater, @p0 ViewGroup viewGroup, boolean z10) {
        View viewInflate = layoutInflater.inflate(R.layout.intercom_webview_card_input, viewGroup, false);
        if (z10) {
            viewGroup.addView(viewInflate);
        }
        return bind(viewInflate);
    }

    @Override // b4.b
    @NonNull
    public FrameLayout getRoot() {
        return this.rootView;
    }
}
