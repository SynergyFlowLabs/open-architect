package io.intercom.android.sdk.tickets;

import androidx.compose.foundation.layout.i6;
import androidx.compose.foundation.layout.x5;
import androidx.compose.material3.ni;
import io.intercom.android.sdk.R;
import io.intercom.android.sdk.models.FileType;
import io.intercom.android.sdk.models.Ticket;
import io.intercom.android.sdk.ui.theme.IntercomTheme;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes13.dex */
public final class ComposableSingletons$FIleAttachmentListKt {

    @NotNull
    public static final ComposableSingletons$FIleAttachmentListKt INSTANCE = new ComposableSingletons$FIleAttachmentListKt();

    /* JADX INFO: renamed from: lambda-1, reason: not valid java name */
    @NotNull
    public static pj.n<x5, androidx.compose.runtime.c0, Integer, Unit> f298lambda1 = androidx.compose.runtime.internal.w.c(1721837306, false, new pj.n<x5, androidx.compose.runtime.c0, Integer, Unit>() { // from class: io.intercom.android.sdk.tickets.ComposableSingletons$FIleAttachmentListKt$lambda-1$1
        @Override // pj.n
        public /* bridge */ /* synthetic */ Unit invoke(x5 x5Var, androidx.compose.runtime.c0 c0Var, Integer num) {
            invoke(x5Var, c0Var, num.intValue());
            return Unit.f312394a;
        }

        @androidx.compose.runtime.o
        @androidx.compose.runtime.t(applier = "androidx.compose.ui.UiComposable")
        public final void invoke(x5 FileAttachment, androidx.compose.runtime.c0 c0Var, int i10) {
            Intrinsics.checkNotNullParameter(FileAttachment, "$this$FileAttachment");
            if ((i10 & 81) == 16 && c0Var.d()) {
                c0Var.u();
            } else {
                ni.o(u0.e.c(R.drawable.intercom_ic_alert_circle, c0Var, 0), "Error Icon", i6.w(androidx.compose.ui.a0.E, androidx.compose.ui.unit.h.r(16)), IntercomTheme.INSTANCE.getColors(c0Var, IntercomTheme.$stable).m702getError0d7_KjU(), c0Var, 440, 0);
            }
        }
    });

    /* JADX INFO: renamed from: lambda-2, reason: not valid java name */
    @NotNull
    public static Function2<androidx.compose.runtime.c0, Integer, Unit> f299lambda2 = androidx.compose.runtime.internal.w.c(597838424, false, new Function2<androidx.compose.runtime.c0, Integer, Unit>() { // from class: io.intercom.android.sdk.tickets.ComposableSingletons$FIleAttachmentListKt$lambda-2$1
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
            } else {
                FIleAttachmentListKt.FileAttachmentList(null, CollectionsKt.listOf((Object[]) new Ticket.TicketAttribute.FilesAttribute.File[]{new Ticket.TicketAttribute.FilesAttribute.File("", "image.png", "https://www.google.com", FileType.IMAGE), new Ticket.TicketAttribute.FilesAttribute.File("", "video.mp4", "https://www.google.com", FileType.VIDEO), new Ticket.TicketAttribute.FilesAttribute.File("", "attachment.pdf", "https://www.google.com", FileType.ATTACHMENT)}), c0Var, 0, 1);
            }
        }
    });

    @NotNull
    /* JADX INFO: renamed from: getLambda-1$intercom_sdk_base_release, reason: not valid java name */
    public final pj.n<x5, androidx.compose.runtime.c0, Integer, Unit> m524getLambda1$intercom_sdk_base_release() {
        return f298lambda1;
    }

    @NotNull
    /* JADX INFO: renamed from: getLambda-2$intercom_sdk_base_release, reason: not valid java name */
    public final Function2<androidx.compose.runtime.c0, Integer, Unit> m525getLambda2$intercom_sdk_base_release() {
        return f299lambda2;
    }
}
