package io.intercom.android.sdk.m5.conversation.ui.components;

import androidx.compose.foundation.layout.i6;
import io.intercom.android.sdk.R;
import io.intercom.android.sdk.blocks.lib.models.TicketType;
import io.intercom.android.sdk.m5.conversation.states.AttributeData;
import io.intercom.android.sdk.m5.conversation.states.ContentRow;
import io.intercom.android.sdk.m5.conversation.states.GroupingPosition;
import io.intercom.android.sdk.m5.conversation.states.PendingMessage;
import io.intercom.android.sdk.m5.conversation.ui.components.row.BubbleMessageRowKt;
import io.intercom.android.sdk.m5.conversation.ui.components.row.FailedMessage;
import io.intercom.android.sdk.models.Part;
import io.intercom.android.sdk.utilities.TimeFormatterExtKt;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes13.dex */
final class MessageListKt$MessageList$14$1$renderMessageRow$1 implements Function2<androidx.compose.runtime.c0, Integer, Unit> {
    final /* synthetic */ ContentRow $item;
    final /* synthetic */ Function1<TicketType, Unit> $onCreateTicket;
    final /* synthetic */ Function1<PendingMessage.FailedImageUploadData, Unit> $onRetryImageClicked;
    final /* synthetic */ Function1<Part, Unit> $onRetryMessageClicked;
    final /* synthetic */ Function1<AttributeData, Unit> $onSubmitAttribute;

    /* JADX WARN: Multi-variable type inference failed */
    MessageListKt$MessageList$14$1$renderMessageRow$1(ContentRow contentRow, Function1<? super AttributeData, Unit> function1, Function1<? super PendingMessage.FailedImageUploadData, Unit> function2, Function1<? super TicketType, Unit> function3, Function1<? super Part, Unit> function4) {
        this.$item = contentRow;
        this.$onSubmitAttribute = function1;
        this.$onRetryImageClicked = function2;
        this.$onCreateTicket = function3;
        this.$onRetryMessageClicked = function4;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit invoke$lambda$0(Function1 function1, ContentRow item) {
        Intrinsics.checkNotNullParameter(item, "$item");
        function1.invoke(((ContentRow.BubbleMessageRow) item).getPartWrapper().getPart());
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
        FailedMessage failedMessage = null;
        androidx.compose.ui.a0 a0VarH = i6.h(androidx.compose.ui.a0.E, 0.0f, 1, null);
        Part part = ((ContentRow.BubbleMessageRow) this.$item).getPartWrapper().getPart();
        String hourOfDay = TimeFormatterExtKt.toHourOfDay(((ContentRow.BubbleMessageRow) this.$item).getPartWrapper().getPart().getCreatedAt());
        List<String> failedAttributeIdentifiers = ((ContentRow.BubbleMessageRow) this.$item).getPartWrapper().getFailedAttributeIdentifiers();
        List<String> loadingAttributeIdentifiers = ((ContentRow.BubbleMessageRow) this.$item).getPartWrapper().getLoadingAttributeIdentifiers();
        GroupingPosition groupingPosition = ((ContentRow.BubbleMessageRow) this.$item).getGroupingPosition();
        boolean zIsAdminOrAltParticipant = ((ContentRow.BubbleMessageRow) this.$item).getPartWrapper().isAdminOrAltParticipant();
        PendingMessage.FailedImageUploadData failedImageUploadData = ((ContentRow.BubbleMessageRow) this.$item).getFailedImageUploadData();
        c0Var.E(-1874254196);
        if (((ContentRow.BubbleMessageRow) this.$item).isFailed()) {
            String strD = u0.i.d(R.string.intercom_failed_delivery, c0Var, 0);
            final Function1<Part, Unit> function1 = this.$onRetryMessageClicked;
            final ContentRow contentRow = this.$item;
            failedMessage = new FailedMessage(strD, new Function0() { // from class: io.intercom.android.sdk.m5.conversation.ui.components.h2
                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    return MessageListKt$MessageList$14$1$renderMessageRow$1.invoke$lambda$0(function1, contentRow);
                }
            });
        }
        c0Var.A();
        BubbleMessageRowKt.BubbleMessageRow(part, groupingPosition, zIsAdminOrAltParticipant, a0VarH, hourOfDay, this.$onSubmitAttribute, failedAttributeIdentifiers, loadingAttributeIdentifiers, this.$onRetryImageClicked, failedImageUploadData, failedMessage, this.$onCreateTicket, c0Var, 18877448, 0, 0);
    }
}
