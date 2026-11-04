package io.intercom.android.sdk.m5;

import android.content.Context;
import android.content.Intent;
import io.intercom.android.sdk.helpcenter.articles.ArticleMetadata;
import io.intercom.android.sdk.m5.navigation.IntercomRootActivityArgs;
import io.intercom.android.sdk.m5.navigation.IntercomRootActivityArgsKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes13.dex */
@SourceDebugExtension({"SMAP\nConversationScreenOpener.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ConversationScreenOpener.kt\nio/intercom/android/sdk/m5/ConversationScreenOpenerKt\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,54:1\n1#2:55\n*E\n"})
public final class ConversationScreenOpenerKt {
    @NotNull
    public static final Intent getComposerIntent(@NotNull Context context, @NotNull String initialMessage, boolean z10, @Nullable ArticleMetadata articleMetadata, @Nullable String str, @NotNull Class<?> activityName) {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(initialMessage, "initialMessage");
        Intrinsics.checkNotNullParameter(activityName, "activityName");
        return IntercomRootActivityArgsKt.getIntentForArgs$default(context, new IntercomRootActivityArgs.ConversationScreenArgs(str, initialMessage, z10, articleMetadata != null ? articleMetadata.getId() : null, articleMetadata != null ? articleMetadata.getTitle() : null, null, 32, null), activityName, null, 8, null);
    }

    public static /* synthetic */ Intent getComposerIntent$default(Context context, String str, boolean z10, ArticleMetadata articleMetadata, String str2, Class cls, int i10, Object obj) {
        if ((i10 & 2) != 0) {
            str = "";
        }
        if ((i10 & 32) != 0) {
            cls = IntercomRootActivity.class;
        }
        return getComposerIntent(context, str, z10, articleMetadata, str2, cls);
    }

    @NotNull
    public static final Intent getConversationIntent(@NotNull Context context, @Nullable String str) {
        Intrinsics.checkNotNullParameter(context, "context");
        int i10 = (4 & 0) ^ 0;
        return IntercomRootActivityArgsKt.getIntentForArgs$default(context, new IntercomRootActivityArgs.ConversationScreenArgs(str, "", false, null, null, null, 48, null), null, null, 12, null);
    }

    public static final void openComposer(@NotNull Context context, @NotNull String initialMessage, boolean z10, @Nullable ArticleMetadata articleMetadata, @Nullable String str) {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(initialMessage, "initialMessage");
        context.startActivity(getComposerIntent$default(context, initialMessage, z10, articleMetadata, str, null, 32, null));
    }

    public static /* synthetic */ void openComposer$default(Context context, String str, boolean z10, ArticleMetadata articleMetadata, String str2, int i10, Object obj) {
        if ((i10 & 2) != 0) {
            str = "";
        }
        if ((i10 & 4) != 0) {
            z10 = false;
        }
        if ((i10 & 8) != 0) {
            articleMetadata = null;
        }
        if ((i10 & 16) != 0) {
            str2 = null;
        }
        openComposer(context, str, z10, articleMetadata, str2);
    }
}
