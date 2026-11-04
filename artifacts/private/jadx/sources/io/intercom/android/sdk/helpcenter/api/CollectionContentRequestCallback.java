package io.intercom.android.sdk.helpcenter.api;

import io.intercom.android.sdk.helpcenter.sections.HelpCenterCollectionContent;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes13.dex */
public interface CollectionContentRequestCallback {
    void onComplete(@NotNull HelpCenterCollectionContent helpCenterCollectionContent);

    void onError(int i10);

    void onFailure();
}
