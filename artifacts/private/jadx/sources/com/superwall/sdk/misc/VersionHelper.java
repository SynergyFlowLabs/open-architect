package com.superwall.sdk.misc;

import android.content.Context;
import java.io.IOException;
import java.io.InputStream;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.Charsets;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes13.dex */
public final class VersionHelper {

    @Nullable
    private final String buildTime;

    @NotNull
    private final Context context;

    @Nullable
    private final String gitSha;

    @NotNull
    private final String sdkVersion;

    public VersionHelper(@NotNull Context context) {
        Intrinsics.checkNotNullParameter(context, "context");
        this.context = context;
        this.gitSha = readFileFromAssets(context, "git_sha.txt");
        this.buildTime = readFileFromAssets(context, "build_time.txt");
        this.sdkVersion = ConstantsKt.getSDK_VERSION();
    }

    private final String readFileFromAssets(Context context, String str) {
        try {
            InputStream inputStreamOpen = context.getAssets().open(str);
            Intrinsics.checkNotNullExpressionValue(inputStreamOpen, "open(...)");
            byte[] bArr = new byte[inputStreamOpen.available()];
            inputStreamOpen.read(bArr);
            inputStreamOpen.close();
            return new String(bArr, Charsets.UTF_8);
        } catch (IOException e10) {
            e10.printStackTrace();
            return null;
        }
    }

    @Nullable
    public final String getBuildTime() {
        return this.buildTime;
    }

    @NotNull
    public final Context getContext() {
        return this.context;
    }

    @Nullable
    public final String getGitSha() {
        return this.gitSha;
    }

    @NotNull
    public final String getSdkVersion() {
        return this.sdkVersion;
    }
}
