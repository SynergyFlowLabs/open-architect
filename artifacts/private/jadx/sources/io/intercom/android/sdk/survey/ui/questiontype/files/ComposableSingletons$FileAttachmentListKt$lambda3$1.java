package io.intercom.android.sdk.survey.ui.questiontype.files;

import android.net.Uri;
import androidx.media3.common.s0;
import io.intercom.android.sdk.R;
import io.intercom.android.sdk.m5.conversation.ui.components.composer.MediaData;
import io.intercom.android.sdk.survey.ui.models.Answer;
import io.intercom.android.sdk.ui.common.StringProvider;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: io.intercom.android.sdk.survey.ui.questiontype.files.ComposableSingletons$FileAttachmentListKt$lambda-3$1, reason: invalid class name */
/* JADX INFO: loaded from: classes13.dex */
final class ComposableSingletons$FileAttachmentListKt$lambda3$1 implements Function2<androidx.compose.runtime.c0, Integer, Unit> {
    public static final ComposableSingletons$FileAttachmentListKt$lambda3$1 INSTANCE = new ComposableSingletons$FileAttachmentListKt$lambda3$1();

    ComposableSingletons$FileAttachmentListKt$lambda3$1() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit invoke$lambda$1(Answer.MediaAnswer.MediaItem it) {
        Intrinsics.checkNotNullParameter(it, "it");
        return Unit.f312394a;
    }

    @Override // kotlin.jvm.functions.Function2
    public /* bridge */ /* synthetic */ Unit invoke(androidx.compose.runtime.c0 c0Var, Integer num) {
        invoke(c0Var, num.intValue());
        return Unit.f312394a;
    }

    @androidx.compose.runtime.o
    @androidx.compose.runtime.t(applier = "androidx.compose.ui.UiComposable")
    public final void invoke(androidx.compose.runtime.c0 c0Var, int i10) {
        if ((i10 & 11) == 2 && c0Var.d()) {
            c0Var.u();
            return;
        }
        Uri EMPTY = Uri.EMPTY;
        Intrinsics.checkNotNullExpressionValue(EMPTY, "EMPTY");
        Answer.MediaAnswer.MediaItem mediaItem = new Answer.MediaAnswer.MediaItem(new MediaData.Media.Image(s0.X0, 0, 0, 0L, "google.png", EMPTY, null, 64, null));
        mediaItem.setUploadStatus(new Answer.MediaAnswer.FileUploadStatus.Error(new Answer.MediaAnswer.FileUploadError.FileLimitExceeded(CollectionsKt.listOf(new StringProvider.StringRes(R.string.intercom_file_max_limit, null, 2, null)))));
        FileAttachmentListKt.FileAttachmentList(CollectionsKt.listOf(mediaItem), new Function1() { // from class: io.intercom.android.sdk.survey.ui.questiontype.files.d
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return ComposableSingletons$FileAttachmentListKt$lambda3$1.invoke$lambda$1((Answer.MediaAnswer.MediaItem) obj);
            }
        }, c0Var, 48);
    }
}
