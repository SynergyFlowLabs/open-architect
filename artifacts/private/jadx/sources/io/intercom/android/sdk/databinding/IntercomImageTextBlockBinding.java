package io.intercom.android.sdk.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.annotation.p0;
import b4.b;
import b4.c;
import io.intercom.android.sdk.R;

/* JADX INFO: loaded from: classes13.dex */
public final class IntercomImageTextBlockBinding implements b {

    @NonNull
    public final FrameLayout imageHolder;

    @NonNull
    private final LinearLayout rootView;

    @NonNull
    public final TextView text;

    @NonNull
    public final TextView title;

    private IntercomImageTextBlockBinding(@NonNull LinearLayout linearLayout, @NonNull FrameLayout frameLayout, @NonNull TextView textView, @NonNull TextView textView2) {
        this.rootView = linearLayout;
        this.imageHolder = frameLayout;
        this.text = textView;
        this.title = textView2;
    }

    @NonNull
    public static IntercomImageTextBlockBinding bind(@NonNull View view) {
        int i10 = R.id.image_holder;
        FrameLayout frameLayout = (FrameLayout) c.a(view, i10);
        if (frameLayout != null) {
            i10 = R.id.text;
            TextView textView = (TextView) c.a(view, i10);
            if (textView != null) {
                i10 = R.id.title;
                TextView textView2 = (TextView) c.a(view, i10);
                if (textView2 != null) {
                    return new IntercomImageTextBlockBinding((LinearLayout) view, frameLayout, textView, textView2);
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i10)));
    }

    @NonNull
    public static IntercomImageTextBlockBinding inflate(@NonNull LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }

    @NonNull
    public static IntercomImageTextBlockBinding inflate(@NonNull LayoutInflater layoutInflater, @p0 ViewGroup viewGroup, boolean z10) {
        View viewInflate = layoutInflater.inflate(R.layout.intercom_image_text_block, viewGroup, false);
        if (z10) {
            viewGroup.addView(viewInflate);
        }
        return bind(viewInflate);
    }

    @Override // b4.b
    @NonNull
    public LinearLayout getRoot() {
        return this.rootView;
    }
}
