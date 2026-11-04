package io.intercom.android.sdk.ui.preview.ui;

import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import androidx.compose.runtime.internal.w0;
import io.intercom.android.sdk.ui.preview.data.IntercomPreviewArgs;
import java.util.List;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes13.dex */
@w0(parameters = 1)
public final class PreviewMediaContract extends g.a<IntercomPreviewArgs, List<Uri>> {
    public static final int $stable = 0;

    @Override // g.a
    @NotNull
    public Intent createIntent(@NotNull Context context, @NotNull IntercomPreviewArgs input) {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(input, "input");
        return IntercomPreviewActivity.Companion.createIntent(context, input);
    }

    @Override // g.a
    @NotNull
    public List<Uri> parseResult(int i10, @Nullable Intent intent) {
        List<Uri> listEmptyList;
        if (i10 != -1) {
            intent = null;
        }
        if (intent != null) {
            Bundle extras = intent.getExtras();
            if (extras == null || (listEmptyList = androidx.core.os.d.d(extras, "MEDIA_RESULT_URIS", Uri.class)) == null) {
                listEmptyList = CollectionsKt.emptyList();
            }
            if (listEmptyList != null) {
                return listEmptyList;
            }
        }
        return CollectionsKt.emptyList();
    }
}
