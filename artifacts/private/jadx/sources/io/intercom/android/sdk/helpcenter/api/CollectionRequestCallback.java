package io.intercom.android.sdk.helpcenter.api;

import io.intercom.android.sdk.helpcenter.collections.HelpCenterCollection;
import java.util.List;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes13.dex */
public interface CollectionRequestCallback {
    void onComplete(@NotNull List<HelpCenterCollection> list);

    void onError(int i10);

    void onFailure();
}
