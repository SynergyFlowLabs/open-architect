package io.intercom.android.sdk.blocks;

import android.view.View;
import io.intercom.android.sdk.api.Api;
import io.intercom.android.sdk.utilities.LinkOpener;

/* JADX INFO: loaded from: classes13.dex */
public class LinkOpeningButtonClickListener implements ButtonClickListener {
    private final Api api;

    public LinkOpeningButtonClickListener(Api api) {
        this.api = api;
    }

    @Override // io.intercom.android.sdk.blocks.ButtonClickListener
    public void onButtonClicked(View view, String str) {
        LinkOpener.handleUrl(str, view.getContext(), this.api);
    }

    @Override // io.intercom.android.sdk.blocks.ButtonClickListener
    public boolean shouldHandleClicks() {
        return true;
    }
}
