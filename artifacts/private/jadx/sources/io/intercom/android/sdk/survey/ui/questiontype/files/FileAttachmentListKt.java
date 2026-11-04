package io.intercom.android.sdk.survey.ui.questiontype.files;

import androidx.compose.foundation.i1;
import androidx.compose.foundation.layout.i6;
import androidx.compose.foundation.layout.n0;
import androidx.compose.foundation.layout.x5;
import androidx.compose.material3.os;
import androidx.compose.runtime.b1;
import androidx.compose.runtime.s5;
import androidx.compose.runtime.t4;
import androidx.compose.runtime.y7;
import androidx.compose.ui.layout.a1;
import io.intercom.android.sdk.survey.ui.models.Answer;
import io.intercom.android.sdk.tickets.FIleAttachmentListKt;
import io.intercom.android.sdk.ui.IntercomPreviews;
import io.intercom.android.sdk.ui.theme.IntercomThemeKt;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes13.dex */
@SourceDebugExtension({"SMAP\nFileAttachmentList.kt\nKotlin\n*S Kotlin\n*F\n+ 1 FileAttachmentList.kt\nio/intercom/android/sdk/survey/ui/questiontype/files/FileAttachmentListKt\n+ 2 Dp.kt\nandroidx/compose/ui/unit/DpKt\n+ 3 Column.kt\nandroidx/compose/foundation/layout/ColumnKt\n+ 4 Layout.kt\nandroidx/compose/ui/layout/LayoutKt\n+ 5 Composables.kt\nandroidx/compose/runtime/ComposablesKt\n+ 6 Composer.kt\nandroidx/compose/runtime/Updater\n+ 7 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,124:1\n113#2:125\n87#3:126\n83#3,10:127\n94#3:169\n80#4,6:137\n87#4,3:152\n90#4,2:161\n94#4:168\n391#5,9:143\n400#5:163\n401#5,2:166\n4360#6,6:155\n1863#7,2:164\n*S KotlinDebug\n*F\n+ 1 FileAttachmentList.kt\nio/intercom/android/sdk/survey/ui/questiontype/files/FileAttachmentListKt\n*L\n35#1:125\n34#1:126\n34#1:127,10\n34#1:169\n34#1:137,6\n34#1:152,3\n34#1:161,2\n34#1:168\n34#1:143,9\n34#1:163\n34#1:166,2\n34#1:155,6\n37#1:164,2\n*E\n"})
public final class FileAttachmentListKt {
    @androidx.compose.runtime.o
    @androidx.compose.runtime.t(applier = "androidx.compose.ui.UiComposable")
    public static final void FileAttachmentList(@NotNull final List<Answer.MediaAnswer.MediaItem> items, @NotNull final Function1<? super Answer.MediaAnswer.MediaItem, Unit> onItemClick, @Nullable androidx.compose.runtime.c0 c0Var, final int i10) {
        Intrinsics.checkNotNullParameter(items, "items");
        Intrinsics.checkNotNullParameter(onItemClick, "onItemClick");
        androidx.compose.runtime.c0 c0VarR = c0Var.R(-2107060022);
        androidx.compose.foundation.layout.q.f fVarG = androidx.compose.foundation.layout.q.f16330a.G(androidx.compose.ui.unit.h.r(8));
        androidx.compose.ui.a0.a aVar = androidx.compose.ui.a0.E;
        a1 a1VarB = androidx.compose.foundation.layout.j0.b(fVarG, androidx.compose.ui.e.f37317a.u(), c0VarR, 6);
        int iHashCode = Long.hashCode(androidx.compose.runtime.v.l(c0VarR, 0));
        b1 b1VarK = c0VarR.k();
        androidx.compose.ui.a0 a0VarN = androidx.compose.ui.m.n(c0VarR, aVar);
        androidx.compose.ui.node.g.a aVar2 = androidx.compose.ui.node.g.I;
        Function0<androidx.compose.ui.node.g> function0A = aVar2.a();
        if (c0VarR.S() == null) {
            androidx.compose.runtime.v.r();
        }
        c0VarR.q();
        if (c0VarR.P()) {
            c0VarR.q0(function0A);
        } else {
            c0VarR.l();
        }
        androidx.compose.runtime.c0 c0VarD = y7.d(c0VarR);
        y7.n(c0VarD, a1VarB, aVar2.e());
        y7.n(c0VarD, b1VarK, aVar2.g());
        Function2<androidx.compose.ui.node.g, Integer, Unit> function2B = aVar2.b();
        if (c0VarD.P() || !Intrinsics.areEqual(c0VarD.i0(), Integer.valueOf(iHashCode))) {
            c0VarD.Y(Integer.valueOf(iHashCode));
            c0VarD.f(Integer.valueOf(iHashCode), function2B);
        }
        y7.n(c0VarD, a0VarN, aVar2.f());
        n0 n0Var = n0.f16227a;
        c0VarR.E(1339367056);
        for (final Answer.MediaAnswer.MediaItem mediaItem : items) {
            if (mediaItem.getUploadStatus() instanceof Answer.MediaAnswer.FileUploadStatus.Error) {
                c0VarR.E(-582474763);
                FIleAttachmentListKt.FailedFileAttached(i1.j(androidx.compose.ui.a0.E, false, null, null, null, new Function0() { // from class: io.intercom.android.sdk.survey.ui.questiontype.files.w
                    @Override // kotlin.jvm.functions.Function0
                    public final Object invoke() {
                        return FileAttachmentListKt.FileAttachmentList$lambda$3$lambda$2$lambda$0(onItemClick, mediaItem);
                    }
                }, 15, null), mediaItem.getData().getFileName(), FIleAttachmentListKt.getFileType(mediaItem.getData().getMimeType()), c0VarR, 0, 0);
                c0VarR.A();
            } else {
                c0VarR.E(-582164546);
                FIleAttachmentListKt.m541FileAttachmentvRFhKjU(i1.j(androidx.compose.ui.a0.E, false, null, null, null, new Function0() { // from class: io.intercom.android.sdk.survey.ui.questiontype.files.x
                    @Override // kotlin.jvm.functions.Function0
                    public final Object invoke() {
                        return FileAttachmentListKt.FileAttachmentList$lambda$3$lambda$2$lambda$1(onItemClick, mediaItem);
                    }
                }, 15, null), mediaItem.getData().getFileName(), FIleAttachmentListKt.getFileType(mediaItem.getData().getMimeType()), 0L, 0L, null, androidx.compose.runtime.internal.w.e(2007803062, true, new pj.n<x5, androidx.compose.runtime.c0, Integer, Unit>() { // from class: io.intercom.android.sdk.survey.ui.questiontype.files.FileAttachmentListKt$FileAttachmentList$1$1$3
                    @Override // pj.n
                    public /* bridge */ /* synthetic */ Unit invoke(x5 x5Var, androidx.compose.runtime.c0 c0Var2, Integer num) {
                        invoke(x5Var, c0Var2, num.intValue());
                        return Unit.f312394a;
                    }

                    @androidx.compose.runtime.o
                    @androidx.compose.runtime.t(applier = "androidx.compose.ui.UiComposable")
                    public final void invoke(x5 FileAttachment, androidx.compose.runtime.c0 c0Var2, int i11) {
                        Intrinsics.checkNotNullParameter(FileAttachment, "$this$FileAttachment");
                        if ((i11 & 81) == 16 && c0Var2.d()) {
                            c0Var2.u();
                            return;
                        }
                        Answer.MediaAnswer.FileUploadStatus uploadStatus = mediaItem.getUploadStatus();
                        if (Intrinsics.areEqual(uploadStatus, Answer.MediaAnswer.FileUploadStatus.Uploading.INSTANCE)) {
                            os.F(i6.w(androidx.compose.ui.a0.E, androidx.compose.ui.unit.h.r(16)), 0L, androidx.compose.ui.unit.h.r(1), 0L, 0, 0.0f, c0Var2, 390, 58);
                        } else if (!Intrinsics.areEqual(uploadStatus, Answer.MediaAnswer.FileUploadStatus.None.INSTANCE) && !(uploadStatus instanceof Answer.MediaAnswer.FileUploadStatus.Success) && !(uploadStatus instanceof Answer.MediaAnswer.FileUploadStatus.Error) && !(uploadStatus instanceof Answer.MediaAnswer.FileUploadStatus.Queued)) {
                            throw new kotlin.k0();
                        }
                    }
                }, c0VarR, 54), c0VarR, 1572864, 56);
                c0VarR.A();
            }
        }
        c0VarR.A();
        c0VarR.o();
        s5 s5VarT = c0VarR.T();
        if (s5VarT != null) {
            s5VarT.a(new Function2() { // from class: io.intercom.android.sdk.survey.ui.questiontype.files.y
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    return FileAttachmentListKt.FileAttachmentList$lambda$4(items, onItemClick, i10, (androidx.compose.runtime.c0) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit FileAttachmentList$lambda$3$lambda$2$lambda$0(Function1 onItemClick, Answer.MediaAnswer.MediaItem it) {
        Intrinsics.checkNotNullParameter(onItemClick, "$onItemClick");
        Intrinsics.checkNotNullParameter(it, "$it");
        onItemClick.invoke(it);
        return Unit.f312394a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit FileAttachmentList$lambda$3$lambda$2$lambda$1(Function1 onItemClick, Answer.MediaAnswer.MediaItem it) {
        Intrinsics.checkNotNullParameter(onItemClick, "$onItemClick");
        Intrinsics.checkNotNullParameter(it, "$it");
        onItemClick.invoke(it);
        return Unit.f312394a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit FileAttachmentList$lambda$4(List items, Function1 onItemClick, int i10, androidx.compose.runtime.c0 c0Var, int i11) {
        Intrinsics.checkNotNullParameter(items, "$items");
        Intrinsics.checkNotNullParameter(onItemClick, "$onItemClick");
        FileAttachmentList(items, onItemClick, c0Var, t4.a(i10 | 1));
        return Unit.f312394a;
    }

    @androidx.compose.runtime.o
    @IntercomPreviews
    @androidx.compose.runtime.t(applier = "androidx.compose.ui.UiComposable")
    private static final void FileAttachmentListErrorPreview(androidx.compose.runtime.c0 c0Var, final int i10) {
        androidx.compose.runtime.c0 c0VarR = c0Var.R(232584117);
        if (i10 == 0 && c0VarR.d()) {
            c0VarR.u();
        } else {
            int i11 = 7 | 0;
            IntercomThemeKt.IntercomTheme(null, null, null, ComposableSingletons$FileAttachmentListKt.INSTANCE.m498getLambda4$intercom_sdk_base_release(), c0VarR, 3072, 7);
        }
        s5 s5VarT = c0VarR.T();
        if (s5VarT != null) {
            s5VarT.a(new Function2() { // from class: io.intercom.android.sdk.survey.ui.questiontype.files.v
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    return FileAttachmentListKt.FileAttachmentListErrorPreview$lambda$6(i10, (androidx.compose.runtime.c0) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit FileAttachmentListErrorPreview$lambda$6(int i10, androidx.compose.runtime.c0 c0Var, int i11) {
        FileAttachmentListErrorPreview(c0Var, t4.a(i10 | 1));
        return Unit.f312394a;
    }

    @androidx.compose.runtime.o
    @IntercomPreviews
    @androidx.compose.runtime.t(applier = "androidx.compose.ui.UiComposable")
    private static final void FileAttachmentListPreview(androidx.compose.runtime.c0 c0Var, final int i10) {
        androidx.compose.runtime.c0 c0VarR = c0Var.R(-1973696025);
        if (i10 == 0 && c0VarR.d()) {
            c0VarR.u();
        } else {
            IntercomThemeKt.IntercomTheme(null, null, null, ComposableSingletons$FileAttachmentListKt.INSTANCE.m496getLambda2$intercom_sdk_base_release(), c0VarR, 3072, 7);
        }
        s5 s5VarT = c0VarR.T();
        if (s5VarT != null) {
            s5VarT.a(new Function2() { // from class: io.intercom.android.sdk.survey.ui.questiontype.files.z
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    return FileAttachmentListKt.FileAttachmentListPreview$lambda$5(i10, (androidx.compose.runtime.c0) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit FileAttachmentListPreview$lambda$5(int i10, androidx.compose.runtime.c0 c0Var, int i11) {
        FileAttachmentListPreview(c0Var, t4.a(i10 | 1));
        return Unit.f312394a;
    }
}
