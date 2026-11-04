package io.intercom.android.sdk.blocks;

import android.text.TextUtils;
import android.view.View;
import androidx.compose.runtime.internal.w0;
import io.intercom.android.sdk.api.Api;
import io.intercom.android.sdk.utilities.LinkOpener;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes13.dex */
@w0(parameters = 0)
public final class CarouselImageClickListener implements ImageClickListener {
    public static final int $stable = 8;

    @NotNull
    private final Api api;

    public CarouselImageClickListener(@NotNull Api api) {
        Intrinsics.checkNotNullParameter(api, "api");
        this.api = api;
    }

    @Override // io.intercom.android.sdk.blocks.ImageClickListener
    public void onImageClicked(@NotNull String imageUrl, @NotNull String linkUrl, @NotNull View imageView, int i10, int i11) {
        Intrinsics.checkNotNullParameter(imageUrl, "imageUrl");
        Intrinsics.checkNotNullParameter(linkUrl, "linkUrl");
        Intrinsics.checkNotNullParameter(imageView, "imageView");
        if (TextUtils.isEmpty(linkUrl)) {
            return;
        }
        LinkOpener.handleUrl(linkUrl, imageView.getContext(), this.api);
    }
}
