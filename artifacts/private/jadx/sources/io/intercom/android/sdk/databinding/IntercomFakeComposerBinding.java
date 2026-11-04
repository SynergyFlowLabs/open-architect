package io.intercom.android.sdk.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.EditText;
import androidx.annotation.NonNull;
import androidx.annotation.p0;
import b4.b;
import io.intercom.android.sdk.R;

/* JADX INFO: loaded from: classes13.dex */
public final class IntercomFakeComposerBinding implements b {

    @NonNull
    public final EditText composerInputView;

    @NonNull
    private final EditText rootView;

    private IntercomFakeComposerBinding(@NonNull EditText editText, @NonNull EditText editText2) {
        this.rootView = editText;
        this.composerInputView = editText2;
    }

    @NonNull
    public static IntercomFakeComposerBinding bind(@NonNull View view) {
        if (view == null) {
            throw new NullPointerException("rootView");
        }
        EditText editText = (EditText) view;
        return new IntercomFakeComposerBinding(editText, editText);
    }

    @NonNull
    public static IntercomFakeComposerBinding inflate(@NonNull LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }

    @NonNull
    public static IntercomFakeComposerBinding inflate(@NonNull LayoutInflater layoutInflater, @p0 ViewGroup viewGroup, boolean z10) {
        View viewInflate = layoutInflater.inflate(R.layout.intercom_fake_composer, viewGroup, false);
        if (z10) {
            viewGroup.addView(viewInflate);
        }
        return bind(viewInflate);
    }

    @Override // b4.b
    @NonNull
    public EditText getRoot() {
        return this.rootView;
    }
}
