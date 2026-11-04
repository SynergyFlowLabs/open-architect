package io.intercom.android.sdk.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.annotation.NonNull;
import androidx.annotation.p0;
import androidx.compose.ui.platform.ComposeView;
import androidx.constraintlayout.widget.ConstraintLayout;
import b4.b;
import b4.c;
import io.intercom.android.sdk.R;

/* JADX INFO: loaded from: classes13.dex */
public final class IntercomActivityArticleSearchBinding implements b {

    @NonNull
    public final ComposeView articleSearchComposeView;

    @NonNull
    public final ConstraintLayout intercomSearchScreenRoot;

    @NonNull
    private final ConstraintLayout rootView;

    private IntercomActivityArticleSearchBinding(@NonNull ConstraintLayout constraintLayout, @NonNull ComposeView composeView, @NonNull ConstraintLayout constraintLayout2) {
        this.rootView = constraintLayout;
        this.articleSearchComposeView = composeView;
        this.intercomSearchScreenRoot = constraintLayout2;
    }

    @NonNull
    public static IntercomActivityArticleSearchBinding bind(@NonNull View view) {
        int i10 = R.id.article_search_compose_view;
        ComposeView composeView = (ComposeView) c.a(view, i10);
        if (composeView == null) {
            throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i10)));
        }
        ConstraintLayout constraintLayout = (ConstraintLayout) view;
        return new IntercomActivityArticleSearchBinding(constraintLayout, composeView, constraintLayout);
    }

    @NonNull
    public static IntercomActivityArticleSearchBinding inflate(@NonNull LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }

    @NonNull
    public static IntercomActivityArticleSearchBinding inflate(@NonNull LayoutInflater layoutInflater, @p0 ViewGroup viewGroup, boolean z10) {
        View viewInflate = layoutInflater.inflate(R.layout.intercom_activity_article_search, viewGroup, false);
        if (z10) {
            viewGroup.addView(viewInflate);
        }
        return bind(viewInflate);
    }

    @Override // b4.b
    @NonNull
    public ConstraintLayout getRoot() {
        return this.rootView;
    }
}
