package io.intercom.android.sdk.blocks;

import android.view.View;

/* JADX INFO: loaded from: classes13.dex */
public interface ButtonClickListener {
    void onButtonClicked(View view, String str);

    boolean shouldHandleClicks();
}
