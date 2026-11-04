package com.superwall.sdk.web;

import android.net.Uri;
import kotlin.Result;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes13.dex */
public interface CheckForReferral {
    @Nullable
    /* JADX INFO: renamed from: checkForReferral-IoAF18A, reason: not valid java name */
    Object mo80checkForReferralIoAF18A(@NotNull kotlin.coroutines.d<? super Result<String>> dVar);

    @NotNull
    /* JADX INFO: renamed from: handleDeepLink-IoAF18A, reason: not valid java name */
    Object mo81handleDeepLinkIoAF18A(@NotNull Uri uri);
}
