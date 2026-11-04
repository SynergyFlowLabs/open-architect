package io.intercom.android.sdk.survey.ui.questiontype.files;

import android.net.Uri;
import android.view.View;
import android.view.ViewParent;
import android.view.Window;
import androidx.compose.foundation.layout.i6;
import androidx.compose.material3.u10;
import androidx.compose.runtime.b2;
import androidx.compose.runtime.d7;
import androidx.compose.runtime.n3;
import androidx.compose.runtime.s5;
import androidx.compose.runtime.t4;
import androidx.compose.ui.graphics.q0;
import androidx.compose.ui.platform.AndroidCompositionLocals_androidKt;
import androidx.core.view.k2;
import androidx.media3.common.s0;
import io.intercom.android.sdk.R;
import io.intercom.android.sdk.m5.conversation.ui.components.composer.MediaData;
import io.intercom.android.sdk.survey.ui.models.Answer;
import io.intercom.android.sdk.ui.IntercomPreviews;
import io.intercom.android.sdk.ui.common.StringProvider;
import io.intercom.android.sdk.ui.preview.data.DeleteType;
import io.intercom.android.sdk.ui.preview.data.IntercomPreviewArgs;
import io.intercom.android.sdk.ui.preview.data.IntercomPreviewFile;
import io.intercom.android.sdk.ui.preview.ui.PreviewRootScreenKt;
import java.util.List;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes13.dex */
@SourceDebugExtension({"SMAP\nFileActionSheet.kt\nKotlin\n*S Kotlin\n*F\n+ 1 FileActionSheet.kt\nio/intercom/android/sdk/survey/ui/questiontype/files/FileActionSheetKt\n+ 2 Composer.kt\nandroidx/compose/runtime/ComposerKt\n+ 3 CompositionLocal.kt\nandroidx/compose/runtime/CompositionLocal\n*L\n1#1,133:1\n1282#2,6:134\n1282#2,6:141\n75#3:140\n*S KotlinDebug\n*F\n+ 1 FileActionSheet.kt\nio/intercom/android/sdk/survey/ui/questiontype/files/FileActionSheetKt\n*L\n39#1:134,6\n74#1:141,6\n59#1:140\n*E\n"})
public final class FileActionSheetKt {

    /* JADX INFO: renamed from: io.intercom.android.sdk.survey.ui.questiontype.files.FileActionSheetKt$FileActionSheetPreviewForStatus$1, reason: invalid class name */
    static final class AnonymousClass1 implements Function2<androidx.compose.runtime.c0, Integer, Unit> {
        final /* synthetic */ Answer.MediaAnswer.FileUploadStatus $uploadStatus;

        AnonymousClass1(Answer.MediaAnswer.FileUploadStatus fileUploadStatus) {
            this.$uploadStatus = fileUploadStatus;
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
            int i11 = 4 & 0;
            Answer.MediaAnswer.MediaItem mediaItem = new Answer.MediaAnswer.MediaItem(new MediaData.Media.Image(s0.X0, 0, 0, 0L, "google.png", EMPTY, null, 64, null));
            mediaItem.setUploadStatus(this.$uploadStatus);
            FileActionSheetKt.FileActionSheet(mediaItem, new Function0() { // from class: io.intercom.android.sdk.survey.ui.questiontype.files.r
                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    return Unit.f312394a;
                }
            }, new Function0() { // from class: io.intercom.android.sdk.survey.ui.questiontype.files.s
                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    return Unit.f312394a;
                }
            }, new Function0() { // from class: io.intercom.android.sdk.survey.ui.questiontype.files.t
                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    return Unit.f312394a;
                }
            }, new Function0() { // from class: io.intercom.android.sdk.survey.ui.questiontype.files.u
                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    return Unit.f312394a;
                }
            }, c0Var, 28080);
        }
    }

    @androidx.compose.runtime.o
    @androidx.compose.runtime.t(applier = "androidx.compose.ui.UiComposable")
    public static final void FileActionSheet(@NotNull final Answer.MediaAnswer.MediaItem item, @NotNull final Function0<Unit> onRetryClick, @NotNull Function0<Unit> onDeleteClick, @NotNull final Function0<Unit> onStopUploading, @NotNull final Function0<Unit> dismiss, @Nullable androidx.compose.runtime.c0 c0Var, final int i10) {
        int i11;
        final Function0<Unit> function0;
        Intrinsics.checkNotNullParameter(item, "item");
        Intrinsics.checkNotNullParameter(onRetryClick, "onRetryClick");
        Intrinsics.checkNotNullParameter(onDeleteClick, "onDeleteClick");
        Intrinsics.checkNotNullParameter(onStopUploading, "onStopUploading");
        Intrinsics.checkNotNullParameter(dismiss, "dismiss");
        androidx.compose.runtime.c0 c0VarR = c0Var.R(592767504);
        if ((i10 & 14) == 0) {
            i11 = (c0VarR.D(item) ? 4 : 2) | i10;
        } else {
            i11 = i10;
        }
        if ((i10 & com.planner5d.library.engine.input.f.b.B) == 0) {
            i11 |= c0VarR.k0(onRetryClick) ? 32 : 16;
        }
        if ((i10 & 896) == 0) {
            i11 |= c0VarR.k0(onDeleteClick) ? 256 : 128;
        }
        if ((i10 & 7168) == 0) {
            i11 |= c0VarR.k0(onStopUploading) ? 2048 : 1024;
        }
        if ((57344 & i10) == 0) {
            i11 |= c0VarR.k0(dismiss) ? 16384 : 8192;
        }
        if ((46811 & i11) == 9362 && c0VarR.d()) {
            c0VarR.u();
            function0 = onDeleteClick;
        } else {
            c0VarR.E(-984100944);
            Object objI0 = c0VarR.i0();
            androidx.compose.runtime.c0.a aVar = androidx.compose.runtime.c0.f35327a;
            if (objI0 == aVar.a()) {
                objI0 = d7.g(item.getUploadStatus(), null, 2, null);
                c0VarR.Y(objI0);
            }
            n3 n3Var = (n3) objI0;
            c0VarR.A();
            if (!Intrinsics.areEqual(n3Var.getValue(), item.getUploadStatus())) {
                dismiss.invoke();
            }
            n3Var.setValue(item.getUploadStatus());
            Answer.MediaAnswer.FileUploadStatus uploadStatus = item.getUploadStatus();
            if (uploadStatus instanceof Answer.MediaAnswer.FileUploadStatus.Error) {
                c0VarR.E(-442066387);
                int i12 = i11 << 3;
                FileUploadErrorComponentKt.FileUploadErrorComponent(item.getData().getFileName(), ((Answer.MediaAnswer.FileUploadStatus.Error) uploadStatus).getError(), onRetryClick, onDeleteClick, c0VarR, (i12 & 7168) | (i12 & 896) | 64);
                function0 = onDeleteClick;
                c0VarR.A();
            } else {
                function0 = onDeleteClick;
                if (uploadStatus instanceof Answer.MediaAnswer.FileUploadStatus.Success) {
                    c0VarR.E(-441779513);
                    final View view = (View) c0VarR.W(AndroidCompositionLocals_androidKt.m());
                    ViewParent parent = view.getParent();
                    androidx.compose.ui.window.l lVar = parent instanceof androidx.compose.ui.window.l ? (androidx.compose.ui.window.l) parent : null;
                    final Window window = lVar != null ? lVar.getWindow() : null;
                    c0VarR.E(-984074315);
                    if (window != null) {
                        b2.m(new Function0() { // from class: io.intercom.android.sdk.survey.ui.questiontype.files.k
                            @Override // kotlin.jvm.functions.Function0
                            public final Object invoke() {
                                return FileActionSheetKt.FileActionSheet$lambda$2$lambda$1(window, view);
                            }
                        }, c0VarR, 0);
                        Unit unit = Unit.f312394a;
                    }
                    c0VarR.A();
                    androidx.compose.ui.a0 a0VarD = androidx.compose.foundation.v.d(i6.f(androidx.compose.ui.a0.E, 0.0f, 1, null), q0.f38131b.a(), null, 2, null);
                    IntercomPreviewArgs intercomPreviewArgs = new IntercomPreviewArgs(CollectionsKt.listOf(new IntercomPreviewFile.LocalFile(item.getData().getUri())), DeleteType.Delete.INSTANCE, null, false, null, 28, null);
                    c0VarR.E(-984055211);
                    boolean z10 = (i11 & 896) == 256;
                    Object objI1 = c0VarR.i0();
                    if (z10 || objI1 == aVar.a()) {
                        objI1 = new Function1() { // from class: io.intercom.android.sdk.survey.ui.questiontype.files.l
                            @Override // kotlin.jvm.functions.Function1
                            public final Object invoke(Object obj) {
                                return FileActionSheetKt.FileActionSheet$lambda$4$lambda$3(function0, (IntercomPreviewFile) obj);
                            }
                        };
                        c0VarR.Y(objI1);
                    }
                    c0VarR.A();
                    PreviewRootScreenKt.PreviewRootScreen(a0VarD, intercomPreviewArgs, null, dismiss, (Function1) objI1, new Function1() { // from class: io.intercom.android.sdk.survey.ui.questiontype.files.m
                        @Override // kotlin.jvm.functions.Function1
                        public final Object invoke(Object obj) {
                            return FileActionSheetKt.FileActionSheet$lambda$5((List) obj);
                        }
                    }, c0VarR, (IntercomPreviewArgs.$stable << 3) | 196614 | ((i11 >> 3) & 7168), 4);
                    c0VarR = c0VarR;
                    c0VarR.A();
                } else if (Intrinsics.areEqual(uploadStatus, Answer.MediaAnswer.FileUploadStatus.Uploading.INSTANCE)) {
                    c0VarR.E(-440835873);
                    FileUploadProgressComponentKt.FileUploadProgressComponent(item.getData().getFileName(), onStopUploading, c0VarR, (i11 >> 6) & com.planner5d.library.engine.input.f.b.B);
                    c0VarR.A();
                } else {
                    if (!Intrinsics.areEqual(uploadStatus, Answer.MediaAnswer.FileUploadStatus.None.INSTANCE) && !Intrinsics.areEqual(uploadStatus, Answer.MediaAnswer.FileUploadStatus.Queued.INSTANCE)) {
                        c0VarR.E(-984092382);
                        c0VarR.A();
                        throw new kotlin.k0();
                    }
                    c0VarR.E(-440655298);
                    c0VarR.A();
                }
            }
        }
        s5 s5VarT = c0VarR.T();
        if (s5VarT != null) {
            final Function0<Unit> function1 = function0;
            s5VarT.a(new Function2() { // from class: io.intercom.android.sdk.survey.ui.questiontype.files.n
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    return FileActionSheetKt.FileActionSheet$lambda$6(item, onRetryClick, function1, onStopUploading, dismiss, i10, (androidx.compose.runtime.c0) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit FileActionSheet$lambda$2$lambda$1(Window window, View view) {
        Intrinsics.checkNotNullParameter(window, "$window");
        Intrinsics.checkNotNullParameter(view, "$view");
        k2.a(window, view).i(false);
        return Unit.f312394a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit FileActionSheet$lambda$4$lambda$3(Function0 onDeleteClick, IntercomPreviewFile it) {
        Intrinsics.checkNotNullParameter(onDeleteClick, "$onDeleteClick");
        Intrinsics.checkNotNullParameter(it, "it");
        onDeleteClick.invoke();
        return Unit.f312394a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit FileActionSheet$lambda$5(List it) {
        Intrinsics.checkNotNullParameter(it, "it");
        return Unit.f312394a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit FileActionSheet$lambda$6(Answer.MediaAnswer.MediaItem item, Function0 onRetryClick, Function0 onDeleteClick, Function0 onStopUploading, Function0 dismiss, int i10, androidx.compose.runtime.c0 c0Var, int i11) {
        Intrinsics.checkNotNullParameter(item, "$item");
        Intrinsics.checkNotNullParameter(onRetryClick, "$onRetryClick");
        Intrinsics.checkNotNullParameter(onDeleteClick, "$onDeleteClick");
        Intrinsics.checkNotNullParameter(onStopUploading, "$onStopUploading");
        Intrinsics.checkNotNullParameter(dismiss, "$dismiss");
        FileActionSheet(item, onRetryClick, onDeleteClick, onStopUploading, dismiss, c0Var, t4.a(i10 | 1));
        return Unit.f312394a;
    }

    @androidx.compose.runtime.o
    @androidx.compose.runtime.t(applier = "androidx.compose.ui.UiComposable")
    private static final void FileActionSheetPreviewForStatus(final Answer.MediaAnswer.FileUploadStatus fileUploadStatus, androidx.compose.runtime.c0 c0Var, final int i10) {
        int i11;
        androidx.compose.runtime.c0 c0VarR = c0Var.R(-915176137);
        if ((i10 & 14) == 0) {
            i11 = (c0VarR.D(fileUploadStatus) ? 4 : 2) | i10;
        } else {
            i11 = i10;
        }
        if ((i11 & 11) == 2 && c0VarR.d()) {
            c0VarR.u();
        } else {
            u10.c(null, null, 0L, 0L, 0.0f, 0.0f, null, androidx.compose.runtime.internal.w.e(193945980, true, new AnonymousClass1(fileUploadStatus), c0VarR, 54), c0VarR, 12582912, 127);
        }
        s5 s5VarT = c0VarR.T();
        if (s5VarT != null) {
            s5VarT.a(new Function2() { // from class: io.intercom.android.sdk.survey.ui.questiontype.files.o
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    return FileActionSheetKt.FileActionSheetPreviewForStatus$lambda$9(fileUploadStatus, i10, (androidx.compose.runtime.c0) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit FileActionSheetPreviewForStatus$lambda$9(Answer.MediaAnswer.FileUploadStatus uploadStatus, int i10, androidx.compose.runtime.c0 c0Var, int i11) {
        Intrinsics.checkNotNullParameter(uploadStatus, "$uploadStatus");
        FileActionSheetPreviewForStatus(uploadStatus, c0Var, t4.a(i10 | 1));
        return Unit.f312394a;
    }

    @androidx.compose.runtime.o
    @IntercomPreviews
    @androidx.compose.runtime.t(applier = "androidx.compose.ui.UiComposable")
    private static final void FileActionSheetQueuedPreview(androidx.compose.runtime.c0 c0Var, final int i10) {
        androidx.compose.runtime.c0 c0VarR = c0Var.R(-61695068);
        if (i10 == 0 && c0VarR.d()) {
            c0VarR.u();
        } else {
            int i11 = 0 ^ 2;
            FileActionSheetPreviewForStatus(new Answer.MediaAnswer.FileUploadStatus.Error(new Answer.MediaAnswer.FileUploadError.FileLimitExceeded(CollectionsKt.listOf(new StringProvider.StringRes(R.string.intercom_inbox_error_state_title, null, 2, null)))), c0VarR, 8);
        }
        s5 s5VarT = c0VarR.T();
        if (s5VarT != null) {
            s5VarT.a(new Function2() { // from class: io.intercom.android.sdk.survey.ui.questiontype.files.p
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    return FileActionSheetKt.FileActionSheetQueuedPreview$lambda$8(i10, (androidx.compose.runtime.c0) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit FileActionSheetQueuedPreview$lambda$8(int i10, androidx.compose.runtime.c0 c0Var, int i11) {
        FileActionSheetQueuedPreview(c0Var, t4.a(i10 | 1));
        return Unit.f312394a;
    }

    @androidx.compose.runtime.o
    @IntercomPreviews
    @androidx.compose.runtime.t(applier = "androidx.compose.ui.UiComposable")
    private static final void FileActionSheetUploadingPreview(androidx.compose.runtime.c0 c0Var, final int i10) {
        androidx.compose.runtime.c0 c0VarR = c0Var.R(31049684);
        if (i10 == 0 && c0VarR.d()) {
            c0VarR.u();
        } else {
            FileActionSheetPreviewForStatus(Answer.MediaAnswer.FileUploadStatus.Uploading.INSTANCE, c0VarR, 6);
        }
        s5 s5VarT = c0VarR.T();
        if (s5VarT != null) {
            s5VarT.a(new Function2() { // from class: io.intercom.android.sdk.survey.ui.questiontype.files.q
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    return FileActionSheetKt.FileActionSheetUploadingPreview$lambda$7(i10, (androidx.compose.runtime.c0) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit FileActionSheetUploadingPreview$lambda$7(int i10, androidx.compose.runtime.c0 c0Var, int i11) {
        FileActionSheetUploadingPreview(c0Var, t4.a(i10 | 1));
        return Unit.f312394a;
    }
}
