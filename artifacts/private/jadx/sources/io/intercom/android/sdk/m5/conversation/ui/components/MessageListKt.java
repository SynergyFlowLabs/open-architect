package io.intercom.android.sdk.m5.conversation.ui.components;

import androidx.compose.foundation.b5;
import androidx.compose.runtime.n3;
import androidx.compose.runtime.n7;
import androidx.compose.runtime.s5;
import androidx.compose.runtime.t4;
import io.intercom.android.sdk.blocks.lib.models.TicketType;
import io.intercom.android.sdk.m5.conversation.states.AttributeData;
import io.intercom.android.sdk.m5.conversation.states.ContentRow;
import io.intercom.android.sdk.m5.conversation.states.GroupingPosition;
import io.intercom.android.sdk.m5.conversation.states.PendingMessage;
import io.intercom.android.sdk.m5.conversation.states.ReplySuggestion;
import io.intercom.android.sdk.m5.conversation.utils.KeyboardState;
import io.intercom.android.sdk.models.Part;
import io.intercom.android.sdk.models.ReplyOption;
import io.intercom.android.sdk.models.Source;
import io.intercom.android.sdk.ui.IntercomPreviews;
import io.intercom.android.sdk.ui.theme.IntercomThemeKt;
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
@SourceDebugExtension({"SMAP\nMessageList.kt\nKotlin\n*S Kotlin\n*F\n+ 1 MessageList.kt\nio/intercom/android/sdk/m5/conversation/ui/components/MessageListKt\n+ 2 CompositionLocal.kt\nandroidx/compose/runtime/CompositionLocal\n+ 3 Effects.kt\nandroidx/compose/runtime/EffectsKt\n+ 4 Composer.kt\nandroidx/compose/runtime/ComposerKt\n+ 5 Effects.kt\nandroidx/compose/runtime/EffectsKt$rememberCoroutineScope$1\n+ 6 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n+ 7 Dp.kt\nandroidx/compose/ui/unit/DpKt\n+ 8 Dp.kt\nandroidx/compose/ui/unit/Dp\n+ 9 Column.kt\nandroidx/compose/foundation/layout/ColumnKt\n+ 10 Layout.kt\nandroidx/compose/ui/layout/LayoutKt\n+ 11 Composables.kt\nandroidx/compose/runtime/ComposablesKt\n+ 12 Composer.kt\nandroidx/compose/runtime/Updater\n+ 13 SnapshotState.kt\nandroidx/compose/runtime/SnapshotStateKt__SnapshotStateKt\n+ 14 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,620:1\n75#2:621\n75#2:622\n75#2:734\n607#3:623\n604#3,6:624\n1282#4,3:630\n1285#4,3:634\n1282#4,6:637\n1282#4,6:643\n1282#4,6:649\n1282#4,6:655\n1282#4,6:664\n1282#4,6:670\n1282#4,6:676\n1282#4,6:684\n1282#4,6:725\n1282#4,6:737\n1282#4,6:743\n605#5:633\n1755#6,3:661\n1872#6,2:723\n1874#6:750\n113#7:682\n113#7:731\n113#7:732\n113#7:733\n113#7:735\n113#7:736\n113#7:749\n113#7:769\n113#7:770\n113#7:771\n113#7:772\n49#8:683\n87#9,6:690\n94#9:754\n80#10,6:696\n87#10,3:711\n90#10,2:720\n94#10:753\n391#11,9:702\n400#11:722\n401#11,2:751\n4360#12,6:714\n85#13:755\n85#13:756\n117#13,2:757\n85#13:759\n117#13,2:760\n85#13:762\n117#13,2:763\n85#13:765\n117#13,2:766\n1#14:768\n*S KotlinDebug\n*F\n+ 1 MessageList.kt\nio/intercom/android/sdk/m5/conversation/ui/components/MessageListKt\n*L\n106#1:621\n107#1:622\n302#1:734\n108#1:623\n108#1:624,6\n108#1:630,3\n108#1:634,3\n112#1:637,6\n114#1:643,6\n116#1:649,6\n118#1:655,6\n124#1:664,6\n140#1:670,6\n158#1:676,6\n187#1:684,6\n235#1:725,6\n369#1:737,6\n385#1:743,6\n108#1:633\n120#1:661,3\n198#1:723,2\n198#1:750\n186#1:682\n270#1:731\n276#1:732\n288#1:733\n335#1:735\n367#1:736\n419#1:749\n490#1:769\n491#1:770\n492#1:771\n493#1:772\n186#1:683\n179#1:690,6\n179#1:754\n179#1:696,6\n179#1:711,3\n179#1:720,2\n179#1:753\n179#1:702,9\n179#1:722\n179#1:751,2\n179#1:714,6\n109#1:755\n112#1:756\n112#1:757,2\n114#1:759\n114#1:760,2\n116#1:762\n116#1:763,2\n118#1:765\n118#1:766,2\n*E\n"})
public final class MessageListKt {
    private static final float GroupedMessageGap = androidx.compose.ui.unit.h.r(2);
    private static final float DefaultMessageGap = androidx.compose.ui.unit.h.r(16);
    private static final float BigMessageGap = androidx.compose.ui.unit.h.r(24);
    private static final float LargeMessageGap = androidx.compose.ui.unit.h.r(32);

    public /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[GroupingPosition.values().length];
            try {
                iArr[GroupingPosition.STANDALONE.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[GroupingPosition.TOP.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[GroupingPosition.MIDDLE.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[GroupingPosition.BOTTOM.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    @androidx.compose.runtime.o
    @IntercomPreviews
    @androidx.compose.runtime.t(applier = "androidx.compose.ui.UiComposable")
    private static final void EmptyMessageListPreview(androidx.compose.runtime.c0 c0Var, final int i10) {
        androidx.compose.runtime.c0 c0VarR = c0Var.R(-1882438622);
        if (i10 == 0 && c0VarR.d()) {
            c0VarR.u();
        } else {
            IntercomThemeKt.IntercomTheme(null, null, null, ComposableSingletons$MessageListKt.INSTANCE.m216getLambda4$intercom_sdk_base_release(), c0VarR, 3072, 7);
        }
        s5 s5VarT = c0VarR.T();
        if (s5VarT != null) {
            s5VarT.a(new Function2() { // from class: io.intercom.android.sdk.m5.conversation.ui.components.o1
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    return MessageListKt.EmptyMessageListPreview$lambda$43(i10, (androidx.compose.runtime.c0) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit EmptyMessageListPreview$lambda$43(int i10, androidx.compose.runtime.c0 c0Var, int i11) {
        EmptyMessageListPreview(c0Var, t4.a(i10 | 1));
        return Unit.f312394a;
    }

    /*  JADX ERROR: Types fix failed
        jadx.core.utils.exceptions.JadxOverflowException: Type inference error: updates count limit reached with updateSeq = 28741. Try increasing type updates limit count.
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:99)
        */
    @androidx.compose.runtime.o
    @androidx.compose.runtime.t(applier = "androidx.compose.ui.UiComposable")
    public static final void MessageList(@org.jetbrains.annotations.Nullable androidx.compose.ui.a0 r40, @org.jetbrains.annotations.NotNull java.util.List<? extends io.intercom.android.sdk.m5.conversation.states.ContentRow> r41, @org.jetbrains.annotations.Nullable androidx.compose.foundation.b5 r42, @org.jetbrains.annotations.Nullable kotlin.jvm.functions.Function1<? super io.intercom.android.sdk.m5.conversation.states.ReplySuggestion, kotlin.Unit> r43, @org.jetbrains.annotations.Nullable kotlin.jvm.functions.Function1<? super io.intercom.android.sdk.models.ReplyOption, kotlin.Unit> r44, @org.jetbrains.annotations.Nullable kotlin.jvm.functions.Function1<? super io.intercom.android.sdk.models.Part, kotlin.Unit> r45, @org.jetbrains.annotations.Nullable kotlin.jvm.functions.Function1<? super io.intercom.android.sdk.m5.conversation.states.PendingMessage.FailedImageUploadData, kotlin.Unit> r46, @org.jetbrains.annotations.Nullable kotlin.jvm.functions.Function1<? super io.intercom.android.sdk.m5.conversation.states.AttributeData, kotlin.Unit> r47, @org.jetbrains.annotations.Nullable kotlin.jvm.functions.Function0<kotlin.Unit> r48, @org.jetbrains.annotations.Nullable kotlin.jvm.functions.Function1<? super io.intercom.android.sdk.blocks.lib.models.TicketType, kotlin.Unit> r49, boolean r50, @org.jetbrains.annotations.Nullable kotlin.jvm.functions.Function1<? super java.lang.String, kotlin.Unit> r51, @org.jetbrains.annotations.Nullable kotlin.jvm.functions.Function2<? super java.util.List<io.intercom.android.sdk.models.InlineSource>, ? super java.util.List<io.intercom.android.sdk.models.Source>, kotlin.Unit> r52, boolean r53, @org.jetbrains.annotations.Nullable kotlin.jvm.functions.Function0<kotlin.Unit> r54, @org.jetbrains.annotations.Nullable androidx.compose.runtime.c0 r55, int r56, int r57, int r58) {
        /*
            Method dump skipped, instruction units count: 2874
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: io.intercom.android.sdk.m5.conversation.ui.components.MessageListKt.MessageList(androidx.compose.ui.a0, java.util.List, androidx.compose.foundation.b5, kotlin.jvm.functions.Function1, kotlin.jvm.functions.Function1, kotlin.jvm.functions.Function1, kotlin.jvm.functions.Function1, kotlin.jvm.functions.Function1, kotlin.jvm.functions.Function0, kotlin.jvm.functions.Function1, boolean, kotlin.jvm.functions.Function1, kotlin.jvm.functions.Function2, boolean, kotlin.jvm.functions.Function0, androidx.compose.runtime.c0, int, int, int):void");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit MessageList$lambda$0(ReplySuggestion it) {
        Intrinsics.checkNotNullParameter(it, "it");
        return Unit.f312394a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit MessageList$lambda$1(ReplyOption it) {
        Intrinsics.checkNotNullParameter(it, "it");
        return Unit.f312394a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final MessageListCoordinates MessageList$lambda$11(n3<MessageListCoordinates> n3Var) {
        return n3Var.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final MessageListCoordinates MessageList$lambda$14(n3<MessageListCoordinates> n3Var) {
        return n3Var.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean MessageList$lambda$17(n3<Boolean> n3Var) {
        return n3Var.getValue().booleanValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void MessageList$lambda$18(n3<Boolean> n3Var, boolean z10) {
        n3Var.setValue(Boolean.valueOf(z10));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit MessageList$lambda$2(Part it) {
        Intrinsics.checkNotNullParameter(it, "it");
        return Unit.f312394a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean MessageList$lambda$20(n3<Boolean> n3Var) {
        return n3Var.getValue().booleanValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void MessageList$lambda$21(n3<Boolean> n3Var, boolean z10) {
        n3Var.setValue(Boolean.valueOf(z10));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit MessageList$lambda$27$lambda$26(n3 currentBounds$delegate, androidx.compose.ui.layout.g0 layoutCoordinates) {
        Intrinsics.checkNotNullParameter(currentBounds$delegate, "$currentBounds$delegate");
        Intrinsics.checkNotNullParameter(layoutCoordinates, "layoutCoordinates");
        currentBounds$delegate.setValue(new MessageListCoordinates(androidx.compose.ui.layout.h0.a(layoutCoordinates), androidx.compose.ui.layout.h0.c(layoutCoordinates), androidx.compose.ui.unit.v.h(layoutCoordinates.a()), null));
        return Unit.f312394a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit MessageList$lambda$3(PendingMessage.FailedImageUploadData it) {
        Intrinsics.checkNotNullParameter(it, "it");
        return Unit.f312394a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit MessageList$lambda$39$lambda$38$lambda$30(Function2 function2, ContentRow item, List clickedSource) {
        Intrinsics.checkNotNullParameter(item, "$item");
        Intrinsics.checkNotNullParameter(clickedSource, "clickedSource");
        if (function2 != null) {
            List<Source> sources = ((ContentRow.FinAnswerRow) item).getPart().getSources();
            Intrinsics.checkNotNullExpressionValue(sources, "getSources(...)");
            function2.invoke(clickedSource, sources);
        }
        return Unit.f312394a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit MessageList$lambda$39$lambda$38$lambda$33$lambda$32(androidx.compose.ui.unit.d density, float f10, n3 hasUserScrolled$delegate, n3 currentBounds$delegate, n3 autoScrollEnabled$delegate, androidx.compose.ui.layout.g0 it) {
        Intrinsics.checkNotNullParameter(density, "$density");
        Intrinsics.checkNotNullParameter(hasUserScrolled$delegate, "$hasUserScrolled$delegate");
        Intrinsics.checkNotNullParameter(currentBounds$delegate, "$currentBounds$delegate");
        Intrinsics.checkNotNullParameter(autoScrollEnabled$delegate, "$autoScrollEnabled$delegate");
        Intrinsics.checkNotNullParameter(it, "it");
        n0.j jVarC = androidx.compose.ui.layout.h0.c(it);
        float fS7 = density.S7(f10);
        if (!MessageList$lambda$20(hasUserScrolled$delegate)) {
            MessageList$lambda$18(autoScrollEnabled$delegate, jVarC.B() == MessageList$lambda$14(currentBounds$delegate).getBoundsInWindow().B() || jVarC.B() > MessageList$lambda$14(currentBounds$delegate).getBoundsInWindow().B() + fS7);
        }
        return Unit.f312394a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final int MessageList$lambda$39$lambda$38$lambda$36(int i10) {
        return i10;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final int MessageList$lambda$39$lambda$38$lambda$37(int i10) {
        return i10;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit MessageList$lambda$4(AttributeData it) {
        Intrinsics.checkNotNullParameter(it, "it");
        return Unit.f312394a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit MessageList$lambda$40(kotlinx.coroutines.s0 scope, b5 b5Var) {
        Intrinsics.checkNotNullParameter(scope, "$scope");
        kotlinx.coroutines.k.f(scope, null, null, new MessageListKt$MessageList$15$1(b5Var, null), 3, null);
        return Unit.f312394a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit MessageList$lambda$41(androidx.compose.ui.a0 a0Var, List contentRows, b5 b5Var, Function1 function1, Function1 function2, Function1 function3, Function1 function4, Function1 function5, Function0 function0, Function1 function6, boolean z10, Function1 function7, Function2 function8, boolean z11, Function0 function9, int i10, int i11, int i12, androidx.compose.runtime.c0 c0Var, int i13) {
        Intrinsics.checkNotNullParameter(contentRows, "$contentRows");
        MessageList(a0Var, contentRows, b5Var, function1, function2, function3, function4, function5, function0, function6, z10, function7, function8, z11, function9, c0Var, t4.a(i10 | 1), t4.a(i11), i12);
        return Unit.f312394a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit MessageList$lambda$6(TicketType it) {
        Intrinsics.checkNotNullParameter(it, "it");
        return Unit.f312394a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit MessageList$lambda$7(String it) {
        Intrinsics.checkNotNullParameter(it, "it");
        return Unit.f312394a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final KeyboardState MessageList$lambda$9(n7<KeyboardState> n7Var) {
        return n7Var.getValue();
    }

    @androidx.compose.runtime.o
    @IntercomPreviews
    @androidx.compose.runtime.t(applier = "androidx.compose.ui.UiComposable")
    public static final void MessageListPreview(@Nullable androidx.compose.runtime.c0 c0Var, final int i10) {
        androidx.compose.runtime.c0 c0VarR = c0Var.R(394311697);
        if (i10 == 0 && c0VarR.d()) {
            c0VarR.u();
        } else {
            IntercomThemeKt.IntercomTheme(null, null, null, ComposableSingletons$MessageListKt.INSTANCE.m214getLambda2$intercom_sdk_base_release(), c0VarR, 3072, 7);
        }
        s5 s5VarT = c0VarR.T();
        if (s5VarT != null) {
            s5VarT.a(new Function2() { // from class: io.intercom.android.sdk.m5.conversation.ui.components.w1
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    return MessageListKt.MessageListPreview$lambda$42(i10, (androidx.compose.runtime.c0) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit MessageListPreview$lambda$42(int i10, androidx.compose.runtime.c0 c0Var, int i11) {
        MessageListPreview(c0Var, t4.a(i10 | 1));
        return Unit.f312394a;
    }

    public static final float gapWithPrevious(@NotNull ContentRow contentRow, int i10, @NotNull List<? extends ContentRow> allContentRows) {
        GroupingPosition groupingPosition;
        Intrinsics.checkNotNullParameter(contentRow, "contentRow");
        Intrinsics.checkNotNullParameter(allContentRows, "allContentRows");
        if (contentRow instanceof ContentRow.DayDividerRow) {
            return LargeMessageGap;
        }
        if (!(contentRow instanceof ContentRow.SpecialNoticeRow) && !(contentRow instanceof ContentRow.TeamIntroRow) && !(contentRow instanceof ContentRow.BubbleMessageRow) && !(contentRow instanceof ContentRow.FinAnswerRow) && !(contentRow instanceof ContentRow.QuickRepliesRow) && !(contentRow instanceof ContentRow.AskedAboutRow) && !(contentRow instanceof ContentRow.BigTicketRow) && !(contentRow instanceof ContentRow.ComposerSuggestionRow) && !(contentRow instanceof ContentRow.EventRow) && !(contentRow instanceof ContentRow.TypingIndicatorRow) && !(contentRow instanceof ContentRow.NewMessagesRow) && !(contentRow instanceof ContentRow.FooterNoticeRow) && !(contentRow instanceof ContentRow.PostCardRow) && !(contentRow instanceof ContentRow.NoteCardRow) && !(contentRow instanceof ContentRow.FinStreamingRow)) {
            if (!(contentRow instanceof ContentRow.TicketStatusRow) && !(contentRow instanceof ContentRow.MergedConversationRow)) {
                throw new kotlin.k0();
            }
            return BigMessageGap;
        }
        ContentRow.BubbleMessageRow bubbleMessageRow = contentRow instanceof ContentRow.BubbleMessageRow ? (ContentRow.BubbleMessageRow) contentRow : null;
        if (bubbleMessageRow == null || (groupingPosition = bubbleMessageRow.getGroupingPosition()) == null) {
            ContentRow.FinAnswerRow finAnswerRow = contentRow instanceof ContentRow.FinAnswerRow ? (ContentRow.FinAnswerRow) contentRow : null;
            groupingPosition = finAnswerRow != null ? finAnswerRow.getGroupingPosition() : GroupingPosition.STANDALONE;
        }
        int i11 = WhenMappings.$EnumSwitchMapping$0[groupingPosition.ordinal()];
        if (i11 != 1 && i11 != 2) {
            if (i11 != 3 && i11 != 4) {
                throw new kotlin.k0();
            }
            return GroupedMessageGap;
        }
        ContentRow contentRow2 = (ContentRow) CollectionsKt.getOrNull(allContentRows, i10 - 1);
        if (!(contentRow2 instanceof ContentRow.TicketStatusRow) && !(contentRow2 instanceof ContentRow.MergedConversationRow)) {
            return DefaultMessageGap;
        }
        return BigMessageGap;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean isAtBottom(b5 b5Var) {
        return b5Var.B() == b5Var.A();
    }
}
