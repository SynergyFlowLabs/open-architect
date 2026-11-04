package io.customer.messaginginapp.gist;

import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes13.dex */
public interface GistEnvironmentEndpoints {
    @NotNull
    String getEngineApiUrl();

    @NotNull
    String getGistQueueApiUrl();

    @NotNull
    String getGistRendererUrl();
}
