package io.intercom.android.sdk;

import android.content.Context;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes13.dex */
public final class IntercomFileProviderKt {
    @NotNull
    public static final String fileProviderAuthority(@NotNull Context context) {
        Intrinsics.checkNotNullParameter(context, "<this>");
        return context.getPackageName() + ".IntercomFileProvider";
    }
}
