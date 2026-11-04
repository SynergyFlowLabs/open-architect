package io.intercom.android.sdk.api;

import android.content.Context;
import androidx.compose.runtime.internal.w0;
import kotlin.jvm.internal.Intrinsics;
import okhttp3.b0;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes13.dex */
@w0(parameters = 1)
public final class IntercomFlipperClient {
    public static final int $stable = 0;

    @NotNull
    public static final IntercomFlipperClient INSTANCE = new IntercomFlipperClient();

    private IntercomFlipperClient() {
    }

    public final void addDefaultFlipperInterceptor(@NotNull b0.a builder, @NotNull Context context) {
        Intrinsics.checkNotNullParameter(builder, "builder");
        Intrinsics.checkNotNullParameter(context, "context");
    }

    public final void addInterceptor(@NotNull b0.a builder, @NotNull Context context) {
        Intrinsics.checkNotNullParameter(builder, "builder");
        Intrinsics.checkNotNullParameter(context, "context");
    }
}
