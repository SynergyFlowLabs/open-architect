package io.customer.messaginginapp.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.RelativeLayout;
import androidx.annotation.NonNull;
import androidx.annotation.p0;
import b4.b;
import b4.c;
import io.customer.messaginginapp.R;
import io.customer.messaginginapp.ui.ModalInAppMessageView;

/* JADX INFO: loaded from: classes13.dex */
public final class ActivityGistBinding implements b {

    @NonNull
    public final ModalInAppMessageView gistView;

    @NonNull
    public final RelativeLayout modalGistViewLayout;

    @NonNull
    private final RelativeLayout rootView;

    private ActivityGistBinding(@NonNull RelativeLayout relativeLayout, @NonNull ModalInAppMessageView modalInAppMessageView, @NonNull RelativeLayout relativeLayout2) {
        this.rootView = relativeLayout;
        this.gistView = modalInAppMessageView;
        this.modalGistViewLayout = relativeLayout2;
    }

    @NonNull
    public static ActivityGistBinding bind(@NonNull View view) {
        int i10 = R.id.gistView;
        ModalInAppMessageView modalInAppMessageView = (ModalInAppMessageView) c.a(view, i10);
        if (modalInAppMessageView == null) {
            throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i10)));
        }
        RelativeLayout relativeLayout = (RelativeLayout) view;
        return new ActivityGistBinding(relativeLayout, modalInAppMessageView, relativeLayout);
    }

    @NonNull
    public static ActivityGistBinding inflate(@NonNull LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }

    @NonNull
    public static ActivityGistBinding inflate(@NonNull LayoutInflater layoutInflater, @p0 ViewGroup viewGroup, boolean z10) {
        View viewInflate = layoutInflater.inflate(R.layout.activity_gist, viewGroup, false);
        if (z10) {
            viewGroup.addView(viewInflate);
        }
        return bind(viewInflate);
    }

    @Override // b4.b
    @NonNull
    public RelativeLayout getRoot() {
        return this.rootView;
    }
}
