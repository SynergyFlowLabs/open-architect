package io.intercom.android.sdk.survey.ui.questiontype.files;

import android.net.Uri;
import androidx.media3.common.s0;
import io.intercom.android.sdk.m5.conversation.ui.components.composer.MediaData;
import io.intercom.android.sdk.survey.ui.models.Answer;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: io.intercom.android.sdk.survey.ui.questiontype.files.ComposableSingletons$FileAttachmentListKt$lambda-1$1, reason: invalid class name */
/* JADX INFO: loaded from: classes13.dex */
final class ComposableSingletons$FileAttachmentListKt$lambda1$1 implements Function2<androidx.compose.runtime.c0, Integer, Unit> {
    public static final ComposableSingletons$FileAttachmentListKt$lambda1$1 INSTANCE = new ComposableSingletons$FileAttachmentListKt$lambda1$1();

    ComposableSingletons$FileAttachmentListKt$lambda1$1() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit invoke$lambda$0(Answer.MediaAnswer.MediaItem it) {
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
        FileAttachmentListKt.FileAttachmentList(CollectionsKt.listOf(new Answer.MediaAnswer.MediaItem(new MediaData.Media.Image(s0.X0, 0, 0, 0L, "google.png", EMPTY, null, 64, null))), new Function1() { // from class: io.intercom.android.sdk.survey.ui.questiontype.files.c
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return ComposableSingletons$FileAttachmentListKt$lambda1$1.invoke$lambda$0((Answer.MediaAnswer.MediaItem) obj);
            }
        }, c0Var, 48);
    }
}
