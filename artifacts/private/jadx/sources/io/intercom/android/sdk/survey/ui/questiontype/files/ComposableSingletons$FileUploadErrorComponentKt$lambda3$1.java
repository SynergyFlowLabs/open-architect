package io.intercom.android.sdk.survey.ui.questiontype.files;

import io.intercom.android.sdk.R;
import io.intercom.android.sdk.survey.ui.models.Answer;
import io.intercom.android.sdk.ui.common.StringProvider;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;

/* JADX INFO: renamed from: io.intercom.android.sdk.survey.ui.questiontype.files.ComposableSingletons$FileUploadErrorComponentKt$lambda-3$1, reason: invalid class name */
/* JADX INFO: loaded from: classes13.dex */
final class ComposableSingletons$FileUploadErrorComponentKt$lambda3$1 implements Function2<androidx.compose.runtime.c0, Integer, Unit> {
    public static final ComposableSingletons$FileUploadErrorComponentKt$lambda3$1 INSTANCE = new ComposableSingletons$FileUploadErrorComponentKt$lambda3$1();

    ComposableSingletons$FileUploadErrorComponentKt$lambda3$1() {
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
        FileUploadErrorComponentKt.FileUploadErrorComponent("Error", new Answer.MediaAnswer.FileUploadError.UploadFailed(CollectionsKt.listOf(new StringProvider.StringRes(R.string.intercom_upload_failed, null, 2, null))), new Function0() { // from class: io.intercom.android.sdk.survey.ui.questiontype.files.g
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return Unit.f312394a;
            }
        }, new Function0() { // from class: io.intercom.android.sdk.survey.ui.questiontype.files.h
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return Unit.f312394a;
            }
        }, c0Var, 3462);
    }
}
