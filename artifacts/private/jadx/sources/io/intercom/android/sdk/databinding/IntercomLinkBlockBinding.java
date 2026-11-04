package io.intercom.android.sdk.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.annotation.p0;
import b4.b;
import b4.c;
import io.intercom.android.sdk.R;

/* JADX INFO: loaded from: classes13.dex */
public final class IntercomLinkBlockBinding implements b {

    @NonNull
    public final TextView author;

    @NonNull
    public final ImageView avatar;

    @NonNull
    public final TextView description;

    @NonNull
    private final LinearLayout rootView;

    @NonNull
    public final TextView title;

    private IntercomLinkBlockBinding(@NonNull LinearLayout linearLayout, @NonNull TextView textView, @NonNull ImageView imageView, @NonNull TextView textView2, @NonNull TextView textView3) {
        this.rootView = linearLayout;
        this.author = textView;
        this.avatar = imageView;
        this.description = textView2;
        this.title = textView3;
    }

    @NonNull
    public static IntercomLinkBlockBinding bind(@NonNull View view) {
        int i10 = R.id.author;
        TextView textView = (TextView) c.a(view, i10);
        if (textView != null) {
            i10 = R.id.avatar;
            ImageView imageView = (ImageView) c.a(view, i10);
            if (imageView != null) {
                i10 = R.id.description;
                TextView textView2 = (TextView) c.a(view, i10);
                if (textView2 != null) {
                    i10 = R.id.title;
                    TextView textView3 = (TextView) c.a(view, i10);
                    if (textView3 != null) {
                        return new IntercomLinkBlockBinding((LinearLayout) view, textView, imageView, textView2, textView3);
                    }
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i10)));
    }

    @NonNull
    public static IntercomLinkBlockBinding inflate(@NonNull LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }

    @NonNull
    public static IntercomLinkBlockBinding inflate(@NonNull LayoutInflater layoutInflater, @p0 ViewGroup viewGroup, boolean z10) {
        View viewInflate = layoutInflater.inflate(R.layout.intercom_link_block, viewGroup, false);
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
