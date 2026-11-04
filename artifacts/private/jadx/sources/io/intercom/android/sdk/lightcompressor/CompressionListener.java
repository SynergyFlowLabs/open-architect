package io.intercom.android.sdk.lightcompressor;

import androidx.annotation.l0;
import androidx.annotation.m1;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes13.dex */
public interface CompressionListener {
    @m1
    void onCancelled(int i10);

    @l0
    void onFailure(int i10, @NotNull String str);

    @m1
    void onProgress(int i10, float f10);

    @l0
    void onStart(int i10);

    @l0
    void onSuccess(int i10, long j10, @Nullable String str);
}
