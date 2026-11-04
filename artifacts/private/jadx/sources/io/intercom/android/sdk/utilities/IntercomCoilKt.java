package io.intercom.android.sdk.utilities;

import android.content.Context;
import android.graphics.drawable.Drawable;
import coil.l;
import coil.request.i;
import io.intercom.android.sdk.ui.coil.IntercomImageLoaderKt;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes13.dex */
public final class IntercomCoilKt {
    public static final void loadIntercomImage(@NotNull Context context, @NotNull i imageRequest) {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(imageRequest, "imageRequest");
        IntercomImageLoaderKt.getImageLoader(context).c(imageRequest);
    }

    @Nullable
    public static final Drawable loadIntercomImageBlocking(@NotNull Context context, @NotNull i imageRequest) {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(imageRequest, "imageRequest");
        return l.b(IntercomImageLoaderKt.getImageLoader(context), imageRequest).a();
    }
}
