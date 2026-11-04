package io.intercom.android.sdk.helpcenter.api;

import java.util.List;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes13.dex */
public interface SearchRequestCallback {
    void onComplete(@NotNull List<HelpCenterArticleSearchResult> list);

    void onError(int i10);

    void onFailure();
}
