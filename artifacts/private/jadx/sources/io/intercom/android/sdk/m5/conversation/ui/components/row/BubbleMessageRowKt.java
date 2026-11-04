package io.intercom.android.sdk.m5.conversation.ui.components.row;

import androidx.compose.foundation.layout.d5;
import androidx.compose.foundation.layout.g5;
import androidx.compose.foundation.layout.i6;
import androidx.compose.foundation.layout.u5;
import androidx.compose.foundation.layout.y5;
import androidx.compose.material3.a4;
import androidx.compose.material3.ni;
import androidx.compose.material3.o6;
import androidx.compose.material3.q50;
import androidx.compose.material3.s3;
import androidx.compose.material3.u10;
import androidx.compose.runtime.s5;
import androidx.compose.runtime.t4;
import androidx.compose.runtime.y7;
import androidx.compose.ui.graphics.q3;
import androidx.media3.exoplayer.a5;
import io.intercom.android.sdk.R;
import io.intercom.android.sdk.blocks.lib.BlockType;
import io.intercom.android.sdk.blocks.lib.models.Block;
import io.intercom.android.sdk.blocks.lib.models.BlockAttachment;
import io.intercom.android.sdk.blocks.lib.models.TicketType;
import io.intercom.android.sdk.m5.components.avatar.AvatarWrapper;
import io.intercom.android.sdk.m5.conversation.states.AttributeData;
import io.intercom.android.sdk.m5.conversation.states.GroupingPosition;
import io.intercom.android.sdk.m5.conversation.states.PendingMessage;
import io.intercom.android.sdk.m5.conversation.ui.components.MessageMetadataKt;
import io.intercom.android.sdk.models.Attachments;
import io.intercom.android.sdk.models.Attribute;
import io.intercom.android.sdk.models.Avatar;
import io.intercom.android.sdk.models.Metadata;
import io.intercom.android.sdk.models.Part;
import io.intercom.android.sdk.survey.block.BlockRenderData;
import io.intercom.android.sdk.survey.block.BlockRenderTextStyle;
import io.intercom.android.sdk.survey.block.BlockViewKt;
import io.intercom.android.sdk.survey.block.ImageRenderType;
import io.intercom.android.sdk.ui.IntercomPreviews;
import io.intercom.android.sdk.ui.theme.IntercomTheme;
import io.intercom.android.sdk.ui.theme.IntercomThemeKt;
import io.intercom.android.sdk.views.compose.AttributeCollectorCardKt;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
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
@SourceDebugExtension({"SMAP\nBubbleMessageRow.kt\nKotlin\n*S Kotlin\n*F\n+ 1 BubbleMessageRow.kt\nio/intercom/android/sdk/m5/conversation/ui/components/row/BubbleMessageRowKt\n+ 2 Dp.kt\nandroidx/compose/ui/unit/DpKt\n+ 3 Column.kt\nandroidx/compose/foundation/layout/ColumnKt\n+ 4 Layout.kt\nandroidx/compose/ui/layout/LayoutKt\n+ 5 Composables.kt\nandroidx/compose/runtime/ComposablesKt\n+ 6 Composer.kt\nandroidx/compose/runtime/Updater\n+ 7 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n+ 8 Box.kt\nandroidx/compose/foundation/layout/BoxKt\n+ 9 Row.kt\nandroidx/compose/foundation/layout/RowKt\n+ 10 AnnotatedString.kt\nandroidx/compose/ui/text/AnnotatedStringKt\n+ 11 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,582:1\n113#2:583\n113#2:584\n113#2:585\n113#2:586\n113#2:587\n113#2:588\n113#2:589\n113#2:590\n113#2:591\n113#2:592\n113#2:593\n113#2:594\n113#2:721\n113#2:722\n87#3:595\n83#3,10:596\n94#3:684\n80#4,6:606\n87#4,3:621\n90#4,2:630\n80#4,6:649\n87#4,3:664\n90#4,2:673\n94#4:678\n94#4:683\n80#4,6:694\n87#4,3:709\n90#4,2:718\n94#4:725\n391#5,9:612\n400#5:632\n391#5,9:655\n400#5,3:675\n401#5,2:681\n391#5,9:700\n400#5:720\n401#5,2:723\n4360#6,6:624\n4360#6,6:667\n4360#6,6:712\n1557#7:633\n1628#7,3:634\n1863#7:637\n1864#7:680\n70#8:638\n66#8,10:639\n77#8:679\n99#9:685\n97#9,8:686\n106#9:726\n1574#10:727\n1#11:728\n*S KotlinDebug\n*F\n+ 1 BubbleMessageRow.kt\nio/intercom/android/sdk/m5/conversation/ui/components/row/BubbleMessageRowKt\n*L\n172#1:583\n173#1:584\n177#1:585\n192#1:586\n195#1:587\n200#1:588\n201#1:589\n205#1:590\n225#1:591\n227#1:592\n257#1:593\n276#1:594\n481#1:721\n494#1:722\n278#1:595\n278#1:596,10\n278#1:684\n278#1:606,6\n278#1:621,3\n278#1:630,2\n319#1:649,6\n319#1:664,3\n319#1:673,2\n319#1:678\n278#1:683\n475#1:694,6\n475#1:709,3\n475#1:718,2\n475#1:725\n278#1:612,9\n278#1:632\n319#1:655,9\n319#1:675,3\n278#1:681,2\n475#1:700,9\n475#1:720\n475#1:723,2\n278#1:624,6\n319#1:667,6\n475#1:712,6\n304#1:633\n304#1:634,3\n318#1:637\n318#1:680\n319#1:638\n319#1:639,10\n319#1:679\n475#1:685\n475#1:686,8\n475#1:726\n505#1:727\n*E\n"})
public final class BubbleMessageRowKt {
    private static final Block.Builder answerBlock;
    private static final Block.Builder articleBlock;
    private static final Block.Builder createTicketBlock;

    @NotNull
    private static final Metadata humanMetadata;

    @NotNull
    private static final List<BlockType> imageBlockTypes;
    private static final Block.Builder longParagraphBlock;
    private static final Block.Builder paragraphBlock;

    /* JADX INFO: renamed from: io.intercom.android.sdk.m5.conversation.ui.components.row.BubbleMessageRowKt$BubbleMessageRow$6, reason: invalid class name */
    @SourceDebugExtension({"SMAP\nBubbleMessageRow.kt\nKotlin\n*S Kotlin\n*F\n+ 1 BubbleMessageRow.kt\nio/intercom/android/sdk/m5/conversation/ui/components/row/BubbleMessageRowKt$BubbleMessageRow$6\n+ 2 Dp.kt\nandroidx/compose/ui/unit/DpKt\n+ 3 Row.kt\nandroidx/compose/foundation/layout/RowKt\n+ 4 Layout.kt\nandroidx/compose/ui/layout/LayoutKt\n+ 5 Composables.kt\nandroidx/compose/runtime/ComposablesKt\n+ 6 Composer.kt\nandroidx/compose/runtime/Updater\n+ 7 Column.kt\nandroidx/compose/foundation/layout/ColumnKt\n+ 8 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,582:1\n113#2:583\n113#2:626\n113#2:670\n99#3:584\n95#3,10:585\n106#3:625\n80#4,6:595\n87#4,3:610\n90#4,2:619\n94#4:624\n80#4,6:636\n87#4,3:651\n90#4,2:660\n94#4:673\n391#5,9:601\n400#5,3:621\n391#5,9:642\n400#5:662\n401#5,2:671\n4360#6,6:613\n4360#6,6:654\n87#7:627\n85#7,8:628\n94#7:674\n1557#8:663\n1628#8,3:664\n1755#8,3:667\n*S KotlinDebug\n*F\n+ 1 BubbleMessageRow.kt\nio/intercom/android/sdk/m5/conversation/ui/components/row/BubbleMessageRowKt$BubbleMessageRow$6\n*L\n99#1:583\n109#1:626\n136#1:670\n98#1:584\n98#1:585,10\n98#1:625\n98#1:595,6\n98#1:610,3\n98#1:619,2\n98#1:624\n107#1:636,6\n107#1:651,3\n107#1:660,2\n107#1:673\n98#1:601,9\n98#1:621,3\n107#1:642,9\n107#1:662\n107#1:671,2\n98#1:613,6\n107#1:654,6\n107#1:627\n107#1:628,8\n107#1:674\n114#1:663\n114#1:664,3\n122#1:667,3\n*E\n"})
    static final class AnonymousClass6 implements pj.p<androidx.compose.foundation.layout.m0, Part, Function0<? extends Unit>, androidx.compose.runtime.c0, Integer, Unit> {
        final /* synthetic */ Part $conversationPart;
        final /* synthetic */ List<String> $failedAttributeIdentifiers;
        final /* synthetic */ PendingMessage.FailedImageUploadData $failedImageUploadData;
        final /* synthetic */ FailedMessage $failedMessage;
        final /* synthetic */ boolean $isAdminOrAltParticipant;
        final /* synthetic */ List<String> $loadingAttributeIdentifiers;
        final /* synthetic */ MessageStyle $messageStyle;
        final /* synthetic */ Function1<TicketType, Unit> $onCreateTicket;
        final /* synthetic */ Function1<PendingMessage.FailedImageUploadData, Unit> $onRetryImageClicked;
        final /* synthetic */ Function1<AttributeData, Unit> $onSubmitAttribute;

        /* JADX WARN: Multi-variable type inference failed */
        AnonymousClass6(FailedMessage failedMessage, MessageStyle messageStyle, Part part, List<String> list, List<String> list2, Function1<? super AttributeData, Unit> function1, Function1<? super TicketType, Unit> function2, boolean z10, PendingMessage.FailedImageUploadData failedImageUploadData, Function1<? super PendingMessage.FailedImageUploadData, Unit> function3) {
            this.$failedMessage = failedMessage;
            this.$messageStyle = messageStyle;
            this.$conversationPart = part;
            this.$failedAttributeIdentifiers = list;
            this.$loadingAttributeIdentifiers = list2;
            this.$onSubmitAttribute = function1;
            this.$onCreateTicket = function2;
            this.$isAdminOrAltParticipant = z10;
            this.$failedImageUploadData = failedImageUploadData;
            this.$onRetryImageClicked = function3;
        }

        /* JADX INFO: Access modifiers changed from: private */
        @androidx.compose.runtime.o
        @androidx.compose.runtime.t(applier = "androidx.compose.ui.UiComposable")
        public static final void invoke$lambda$5$Content(Part part, Part part2, List<String> list, List<String> list2, Function1<? super AttributeData, Unit> function1, MessageStyle messageStyle, Function0<Unit> function0, Function1<? super TicketType, Unit> function2, boolean z10, PendingMessage.FailedImageUploadData failedImageUploadData, Function1<? super PendingMessage.FailedImageUploadData, Unit> function3, long j10, androidx.compose.ui.a0 a0Var, androidx.compose.runtime.c0 c0Var, int i10, int i11) {
            c0Var.E(1340766378);
            long jM714getPrimaryText0d7_KjU = (i11 & 1) != 0 ? IntercomTheme.INSTANCE.getColors(c0Var, IntercomTheme.$stable).m714getPrimaryText0d7_KjU() : j10;
            androidx.compose.ui.a0 a0Var2 = (i11 & 2) != 0 ? androidx.compose.ui.a0.E : a0Var;
            androidx.compose.ui.layout.a1 a1VarB = androidx.compose.foundation.layout.j0.b(androidx.compose.foundation.layout.q.f16330a.G(androidx.compose.ui.unit.h.r(8)), androidx.compose.ui.e.f37317a.u(), c0Var, 6);
            boolean z11 = false;
            int iHashCode = Long.hashCode(androidx.compose.runtime.v.l(c0Var, 0));
            androidx.compose.runtime.b1 b1VarK = c0Var.k();
            androidx.compose.ui.a0 a0VarN = androidx.compose.ui.m.n(c0Var, a0Var2);
            androidx.compose.ui.node.g.a aVar = androidx.compose.ui.node.g.I;
            Function0<androidx.compose.ui.node.g> function0A = aVar.a();
            if (c0Var.S() == null) {
                androidx.compose.runtime.v.r();
            }
            c0Var.q();
            if (c0Var.P()) {
                c0Var.q0(function0A);
            } else {
                c0Var.l();
            }
            androidx.compose.runtime.c0 c0VarD = y7.d(c0Var);
            y7.n(c0VarD, a1VarB, aVar.e());
            y7.n(c0VarD, b1VarK, aVar.g());
            Function2<androidx.compose.ui.node.g, Integer, Unit> function2B = aVar.b();
            if (c0VarD.P() || !Intrinsics.areEqual(c0VarD.i0(), Integer.valueOf(iHashCode))) {
                c0VarD.Y(Integer.valueOf(iHashCode));
                c0VarD.f(Integer.valueOf(iHashCode), function2B);
            }
            y7.n(c0VarD, a0VarN, aVar.f());
            androidx.compose.foundation.layout.n0 n0Var = androidx.compose.foundation.layout.n0.f16227a;
            Metadata metadata = part.getMetadata();
            c0Var.E(301232084);
            if (metadata != null) {
                List<Avatar> avatars = metadata.getAvatars();
                ArrayList arrayList = new ArrayList(CollectionsKt.collectionSizeOrDefault(avatars, 10));
                Iterator<T> it = avatars.iterator();
                while (it.hasNext()) {
                    arrayList.add(new AvatarWrapper((Avatar) it.next(), false, 2, null));
                }
                MessageMetadataKt.MessageMetadata(arrayList, metadata.getTitle(), null, metadata.getSuffix(), metadata.getTimestamp(), c0Var, 8, 4);
            }
            c0Var.A();
            List<Block> blocks = part.getBlocks();
            Intrinsics.checkNotNullExpressionValue(blocks, "getBlocks(...)");
            List<Block> list3 = blocks;
            if (!(list3 instanceof Collection) || !list3.isEmpty()) {
                Iterator<T> it2 = list3.iterator();
                while (true) {
                    if (it2.hasNext()) {
                        if (((Block) it2.next()).getType() == BlockType.CREATETICKETCARD) {
                            if (part.getParentConversation().getTicket() != null) {
                                break;
                            } else {
                                break;
                            }
                        }
                    }
                    z11 = true;
                    break;
                }
            }
            z11 = true;
            break;
            BubbleMessageRowKt.m275MessageContent993knro(part2, list, list2, function1, jM714getPrimaryText0d7_KjU, z11, messageStyle.getContentShape(), function0, function2, z10, failedImageUploadData, function3, androidx.compose.ui.unit.h.r(12), c0Var, ((i10 << 12) & 57344) | 584, a5.S0, 0);
            c0Var.o();
            c0Var.A();
        }

        @Override // pj.p
        public /* bridge */ /* synthetic */ Unit invoke(androidx.compose.foundation.layout.m0 m0Var, Part part, Function0<? extends Unit> function0, androidx.compose.runtime.c0 c0Var, Integer num) {
            invoke(m0Var, part, (Function0<Unit>) function0, c0Var, num.intValue());
            return Unit.f312394a;
        }

        @androidx.compose.runtime.o
        @androidx.compose.runtime.t(applier = "androidx.compose.ui.UiComposable")
        public final void invoke(androidx.compose.foundation.layout.m0 ClickableMessageRow, final Part part, final Function0<Unit> onClick, androidx.compose.runtime.c0 c0Var, int i10) {
            Intrinsics.checkNotNullParameter(ClickableMessageRow, "$this$ClickableMessageRow");
            Intrinsics.checkNotNullParameter(part, "part");
            Intrinsics.checkNotNullParameter(onClick, "onClick");
            androidx.compose.foundation.layout.q.f fVarG = androidx.compose.foundation.layout.q.f16330a.G(androidx.compose.ui.unit.h.r(8));
            androidx.compose.ui.e.c cVarQ = androidx.compose.ui.e.f37317a.q();
            FailedMessage failedMessage = this.$failedMessage;
            final MessageStyle messageStyle = this.$messageStyle;
            final Part part2 = this.$conversationPart;
            final List<String> list = this.$failedAttributeIdentifiers;
            final List<String> list2 = this.$loadingAttributeIdentifiers;
            final Function1<AttributeData, Unit> function1 = this.$onSubmitAttribute;
            final Function1<TicketType, Unit> function2 = this.$onCreateTicket;
            final boolean z10 = this.$isAdminOrAltParticipant;
            final PendingMessage.FailedImageUploadData failedImageUploadData = this.$failedImageUploadData;
            final Function1<PendingMessage.FailedImageUploadData, Unit> function3 = this.$onRetryImageClicked;
            androidx.compose.ui.a0.a aVar = androidx.compose.ui.a0.E;
            androidx.compose.ui.layout.a1 a1VarE = u5.e(fVarG, cVarQ, c0Var, 54);
            int iHashCode = Long.hashCode(androidx.compose.runtime.v.l(c0Var, 0));
            androidx.compose.runtime.b1 b1VarK = c0Var.k();
            androidx.compose.ui.a0 a0VarN = androidx.compose.ui.m.n(c0Var, aVar);
            androidx.compose.ui.node.g.a aVar2 = androidx.compose.ui.node.g.I;
            Function0<androidx.compose.ui.node.g> function0A = aVar2.a();
            if (c0Var.S() == null) {
                androidx.compose.runtime.v.r();
            }
            c0Var.q();
            if (c0Var.P()) {
                c0Var.q0(function0A);
            } else {
                c0Var.l();
            }
            androidx.compose.runtime.c0 c0VarD = y7.d(c0Var);
            y7.n(c0VarD, a1VarE, aVar2.e());
            y7.n(c0VarD, b1VarK, aVar2.g());
            Function2<androidx.compose.ui.node.g, Integer, Unit> function2B = aVar2.b();
            if (c0VarD.P() || !Intrinsics.areEqual(c0VarD.i0(), Integer.valueOf(iHashCode))) {
                c0VarD.Y(Integer.valueOf(iHashCode));
                c0VarD.f(Integer.valueOf(iHashCode), function2B);
            }
            y7.n(c0VarD, a0VarN, aVar2.f());
            y5 y5Var = y5.f16577a;
            c0Var.E(-737212874);
            if (failedMessage != null) {
                BubbleMessageRowKt.FailedMessageIcon(null, c0Var, 0, 1);
            }
            c0Var.A();
            c0Var.E(-737209582);
            final MessageStyle.BubbleStyle bubbleStyle = messageStyle.getBubbleStyle();
            u10.c(null, bubbleStyle.getShape(), bubbleStyle.m319getColor0d7_KjU(), 0L, 0.0f, 0.0f, bubbleStyle.getBorderStroke(), androidx.compose.runtime.internal.w.e(722028815, true, new Function2<androidx.compose.runtime.c0, Integer, Unit>() { // from class: io.intercom.android.sdk.m5.conversation.ui.components.row.BubbleMessageRowKt$BubbleMessageRow$6$1$1$1
                @Override // kotlin.jvm.functions.Function2
                public /* bridge */ /* synthetic */ Unit invoke(androidx.compose.runtime.c0 c0Var2, Integer num) {
                    invoke(c0Var2, num.intValue());
                    return Unit.f312394a;
                }

                @androidx.compose.runtime.o
                @androidx.compose.runtime.t(applier = "androidx.compose.ui.UiComposable")
                public final void invoke(androidx.compose.runtime.c0 c0Var2, int i11) {
                    if ((i11 & 11) == 2 && c0Var2.d()) {
                        c0Var2.u();
                    } else {
                        BubbleMessageRowKt.AnonymousClass6.invoke$lambda$5$Content(part2, part, list, list2, function1, messageStyle, onClick, function2, z10, failedImageUploadData, function3, o6.g(bubbleStyle.m319getColor0d7_KjU(), c0Var2, 0), d5.p(androidx.compose.ui.a0.E, bubbleStyle.getPadding()), c0Var2, 0, 0);
                    }
                }
            }, c0Var, 54), c0Var, 12582912, 57);
            c0Var.A();
            c0Var.o();
        }
    }

    public /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[BlockType.values().length];
            try {
                iArr[BlockType.SUBHEADING.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[BlockType.HEADING.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[BlockType.CODE.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[BlockType.PARAGRAPH.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                iArr[BlockType.LINK.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                iArr[BlockType.UNORDEREDLIST.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                iArr[BlockType.ORDEREDLIST.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    static {
        Block.Builder builderWithText = new Block.Builder().withText("Hey");
        BlockType blockType = BlockType.PARAGRAPH;
        paragraphBlock = builderWithText.withType(blockType.getSerializedName());
        longParagraphBlock = new Block.Builder().withText("Lorem ipsum dolor sit amet, consectetur adipiscing elit, sed do eiusmod tempor incididunt ut labore et dolore magna aliqua.").withType(blockType.getSerializedName());
        int i10 = 3 | (-1);
        createTicketBlock = new Block.Builder().withTitle("Create ticket").withTicketType(new TicketType(-1, "Bug", "", CollectionsKt.emptyList(), false)).withType(BlockType.CREATETICKETCARD.getSerializedName());
        answerBlock = new Block.Builder().withText("Yes, you can change the date of your stay for up to seven days before it is due to begin. To do this, first go to your stays and click the relevant one. Then, go to change details and enter a new date. <a class=\"inline-citation\" data-entity-id=\"1\" data-entity-type=\"other\" data-source-index=\"1\" href=\"http://external.source.com\" title=\"Changing the date of your stay using our mobile app\"></a> <a class=\"inline-citation\" data-entity-id=\"2\" data-entity-type=\"article\" data-source-index=\"2\" href=\"http://intercom.com\" title=\"Cancel your booking\"></a>").withType(blockType.getSerializedName());
        articleBlock = new Block.Builder().withText("I can’t find exactly what you need, but here is an article that could help:<br><br><a href=\"http://www.intercom.com\"> Making a group reservation</a><br>Explains how to make a group reservation with multiple guests.").withType(blockType.getSerializedName());
        humanMetadata = new Metadata("Lisa", null, null, CollectionsKt.listOf(new Avatar.Builder().withInitials("L")), 6, null);
        imageBlockTypes = CollectionsKt.listOf((Object[]) new BlockType[]{BlockType.IMAGE, BlockType.LOCALIMAGE});
    }

    /* JADX WARN: Code duplicated, block: B:50:0x00f1  */
    /* JADX WARN: Code duplicated, block: B:52:0x00fb  */
    /* JADX WARN: Code duplicated, block: B:55:0x014c  */
    /* JADX WARN: Code duplicated, block: B:57:? A[RETURN, SYNTHETIC] */
    @androidx.compose.runtime.o
    @androidx.compose.runtime.t(applier = "androidx.compose.ui.UiComposable")
    public static final void BubbleMessageRow(@NotNull final Part conversationPart, @NotNull final GroupingPosition groupingPosition, final boolean z10, @Nullable androidx.compose.ui.a0 a0Var, @Nullable String str, @Nullable Function1<? super AttributeData, Unit> function1, @Nullable List<String> list, @Nullable List<String> list2, @Nullable Function1<? super PendingMessage.FailedImageUploadData, Unit> function2, @Nullable PendingMessage.FailedImageUploadData failedImageUploadData, @Nullable FailedMessage failedMessage, @Nullable Function1<? super TicketType, Unit> function3, @Nullable androidx.compose.runtime.c0 c0Var, final int i10, final int i11, final int i12) {
        String str2;
        BottomMetadata bottomMetadata;
        BottomMetadata bottomMetadata2;
        Function0<Unit> onRetryMessageClicked;
        final FailedMessage failedMessage2;
        final Function1<? super TicketType, Unit> function4;
        final PendingMessage.FailedImageUploadData failedImageUploadData2;
        final Function1<? super PendingMessage.FailedImageUploadData, Unit> function5;
        final Function1<? super AttributeData, Unit> function6;
        final androidx.compose.ui.a0 a0Var2;
        s5 s5VarT;
        Intrinsics.checkNotNullParameter(conversationPart, "conversationPart");
        Intrinsics.checkNotNullParameter(groupingPosition, "groupingPosition");
        androidx.compose.runtime.c0 c0VarR = c0Var.R(1247044792);
        androidx.compose.ui.a0 a0Var3 = (i12 & 8) != 0 ? androidx.compose.ui.a0.E : a0Var;
        String str3 = (i12 & 16) != 0 ? null : str;
        Function1<? super AttributeData, Unit> function7 = (i12 & 32) != 0 ? new Function1() { // from class: io.intercom.android.sdk.m5.conversation.ui.components.row.m
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return BubbleMessageRowKt.BubbleMessageRow$lambda$0((AttributeData) obj);
            }
        } : function1;
        final List<String> listEmptyList = (i12 & 64) != 0 ? CollectionsKt.emptyList() : list;
        final List<String> listEmptyList2 = (i12 & 128) != 0 ? CollectionsKt.emptyList() : list2;
        Function1<? super PendingMessage.FailedImageUploadData, Unit> function8 = (i12 & 256) != 0 ? new Function1() { // from class: io.intercom.android.sdk.m5.conversation.ui.components.row.n
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return BubbleMessageRowKt.BubbleMessageRow$lambda$1((PendingMessage.FailedImageUploadData) obj);
            }
        } : function2;
        PendingMessage.FailedImageUploadData failedImageUploadData3 = (i12 & 512) != 0 ? null : failedImageUploadData;
        FailedMessage failedMessage3 = (i12 & 1024) != 0 ? null : failedMessage;
        Function1<? super TicketType, Unit> function9 = (i12 & 2048) != 0 ? new Function1() { // from class: io.intercom.android.sdk.m5.conversation.ui.components.row.o
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return BubbleMessageRowKt.BubbleMessageRow$lambda$2((TicketType) obj);
            }
        } : function3;
        int i13 = i10 >> 6;
        MessageStyle messageStyle = getMessageStyle(z10, groupingPosition, failedMessage3 != null, c0VarR, (i13 & 14) | (i10 & com.planner5d.library.engine.input.f.b.B));
        if (failedMessage3 == null) {
            if (str3 != null) {
                String str4 = str3;
                bottomMetadata2 = new BottomMetadata(str4, 0.0f, false, 6, null);
                str2 = str4;
            } else {
                str2 = str3;
                bottomMetadata = null;
            }
            androidx.compose.ui.e.b rowAlignment = messageStyle.getRowAlignment();
            g5 rowPadding = messageStyle.getRowPadding();
            if (failedMessage3 != null) {
                onRetryMessageClicked = failedMessage3.getOnRetryMessageClicked();
            } else {
                onRetryMessageClicked = null;
            }
            failedMessage2 = failedMessage3;
            function4 = function9;
            failedImageUploadData2 = failedImageUploadData3;
            function5 = function8;
            function6 = function7;
            a0Var2 = a0Var3;
            ClickableMessageRowKt.ClickableMessageRow(conversationPart, a0Var2, bottomMetadata, rowAlignment, rowPadding, onRetryMessageClicked, androidx.compose.runtime.internal.w.e(873055205, true, new AnonymousClass6(failedMessage2, messageStyle, conversationPart, listEmptyList, listEmptyList2, function6, function4, z10, failedImageUploadData2, function5), c0VarR, 54), c0VarR, 1572872 | (i13 & com.planner5d.library.engine.input.f.b.B), 0);
            s5VarT = c0VarR.T();
            if (s5VarT != null) {
                final String str5 = str2;
                s5VarT.a(new Function2() { // from class: io.intercom.android.sdk.m5.conversation.ui.components.row.p
                    @Override // kotlin.jvm.functions.Function2
                    public final Object invoke(Object obj, Object obj2) {
                        return BubbleMessageRowKt.BubbleMessageRow$lambda$5(conversationPart, groupingPosition, z10, a0Var2, str5, function6, listEmptyList, listEmptyList2, function5, failedImageUploadData2, failedMessage2, function4, i10, i11, i12, (androidx.compose.runtime.c0) obj, ((Integer) obj2).intValue());
                    }
                });
            }
        }
        bottomMetadata2 = new BottomMetadata(failedMessage3.getMessage(), 0.0f, true, 2, null);
        str2 = str3;
        bottomMetadata = bottomMetadata2;
        androidx.compose.ui.e.b rowAlignment2 = messageStyle.getRowAlignment();
        g5 rowPadding2 = messageStyle.getRowPadding();
        if (failedMessage3 != null) {
            onRetryMessageClicked = failedMessage3.getOnRetryMessageClicked();
        } else {
            onRetryMessageClicked = null;
        }
        failedMessage2 = failedMessage3;
        function4 = function9;
        failedImageUploadData2 = failedImageUploadData3;
        function5 = function8;
        function6 = function7;
        a0Var2 = a0Var3;
        ClickableMessageRowKt.ClickableMessageRow(conversationPart, a0Var2, bottomMetadata, rowAlignment2, rowPadding2, onRetryMessageClicked, androidx.compose.runtime.internal.w.e(873055205, true, new AnonymousClass6(failedMessage2, messageStyle, conversationPart, listEmptyList, listEmptyList2, function6, function4, z10, failedImageUploadData2, function5), c0VarR, 54), c0VarR, 1572872 | (i13 & com.planner5d.library.engine.input.f.b.B), 0);
        s5VarT = c0VarR.T();
        if (s5VarT != null) {
            final String str6 = str2;
            s5VarT.a(new Function2() { // from class: io.intercom.android.sdk.m5.conversation.ui.components.row.p
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    return BubbleMessageRowKt.BubbleMessageRow$lambda$5(conversationPart, groupingPosition, z10, a0Var2, str6, function6, listEmptyList, listEmptyList2, function5, failedImageUploadData2, failedMessage2, function4, i10, i11, i12, (androidx.compose.runtime.c0) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit BubbleMessageRow$lambda$0(AttributeData it) {
        Intrinsics.checkNotNullParameter(it, "it");
        return Unit.f312394a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit BubbleMessageRow$lambda$1(PendingMessage.FailedImageUploadData it) {
        Intrinsics.checkNotNullParameter(it, "it");
        return Unit.f312394a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit BubbleMessageRow$lambda$2(TicketType it) {
        Intrinsics.checkNotNullParameter(it, "it");
        return Unit.f312394a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit BubbleMessageRow$lambda$5(Part conversationPart, GroupingPosition groupingPosition, boolean z10, androidx.compose.ui.a0 a0Var, String str, Function1 function1, List list, List list2, Function1 function2, PendingMessage.FailedImageUploadData failedImageUploadData, FailedMessage failedMessage, Function1 function3, int i10, int i11, int i12, androidx.compose.runtime.c0 c0Var, int i13) {
        Intrinsics.checkNotNullParameter(conversationPart, "$conversationPart");
        Intrinsics.checkNotNullParameter(groupingPosition, "$groupingPosition");
        BubbleMessageRow(conversationPart, groupingPosition, z10, a0Var, str, function1, list, list2, function2, failedImageUploadData, failedMessage, function3, c0Var, t4.a(i10 | 1), t4.a(i11), i12);
        return Unit.f312394a;
    }

    @androidx.compose.runtime.o
    @IntercomPreviews
    @androidx.compose.runtime.t(applier = "androidx.compose.ui.UiComposable")
    private static final void BubbleMessageRowPreview(androidx.compose.runtime.c0 c0Var, final int i10) {
        androidx.compose.runtime.c0 c0VarR = c0Var.R(481690275);
        if (i10 == 0 && c0VarR.d()) {
            c0VarR.u();
        } else {
            int i11 = 7 ^ 0;
            IntercomThemeKt.IntercomTheme(null, null, null, ComposableSingletons$BubbleMessageRowKt.INSTANCE.m281getLambda2$intercom_sdk_base_release(), c0VarR, 3072, 7);
        }
        s5 s5VarT = c0VarR.T();
        if (s5VarT != null) {
            s5VarT.a(new Function2() { // from class: io.intercom.android.sdk.m5.conversation.ui.components.row.l
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    return BubbleMessageRowKt.BubbleMessageRowPreview$lambda$13(i10, (androidx.compose.runtime.c0) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit BubbleMessageRowPreview$lambda$13(int i10, androidx.compose.runtime.c0 c0Var, int i11) {
        BubbleMessageRowPreview(c0Var, t4.a(i10 | 1));
        return Unit.f312394a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    @androidx.compose.runtime.o
    @androidx.compose.runtime.t(applier = "androidx.compose.ui.UiComposable")
    public static final void FailedMessageIcon(final androidx.compose.ui.a0 a0Var, androidx.compose.runtime.c0 c0Var, final int i10, final int i11) {
        int i12;
        androidx.compose.runtime.c0 c0VarR = c0Var.R(-1829301504);
        int i13 = i11 & 1;
        if (i13 != 0) {
            i12 = i10 | 6;
        } else if ((i10 & 14) == 0) {
            i12 = (c0VarR.D(a0Var) ? 4 : 2) | i10;
        } else {
            i12 = i10;
        }
        if ((i12 & 11) == 2 && c0VarR.d()) {
            c0VarR.u();
        } else {
            if (i13 != 0) {
                a0Var = androidx.compose.ui.a0.E;
            }
            ni.o(u0.e.c(R.drawable.intercom_message_error, c0VarR, 0), null, i6.w(a0Var, androidx.compose.ui.unit.h.r(16)), IntercomTheme.INSTANCE.getColors(c0VarR, IntercomTheme.$stable).m702getError0d7_KjU(), c0VarR, 56, 0);
        }
        s5 s5VarT = c0VarR.T();
        if (s5VarT != null) {
            s5VarT.a(new Function2() { // from class: io.intercom.android.sdk.m5.conversation.ui.components.row.i
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    return BubbleMessageRowKt.FailedMessageIcon$lambda$6(a0Var, i10, i11, (androidx.compose.runtime.c0) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit FailedMessageIcon$lambda$6(androidx.compose.ui.a0 a0Var, int i10, int i11, androidx.compose.runtime.c0 c0Var, int i12) {
        FailedMessageIcon(a0Var, c0Var, t4.a(i10 | 1), i11);
        return Unit.f312394a;
    }

    @androidx.compose.runtime.o
    @androidx.compose.runtime.t(applier = "androidx.compose.ui.UiComposable")
    /* JADX INFO: renamed from: MessageContent-993knro, reason: not valid java name */
    public static final void m275MessageContent993knro(@NotNull final Part conversationPart, @NotNull final List<String> failedAttributeIdentifiers, @NotNull final List<String> loadingAttributeIdentifiers, @NotNull final Function1<? super AttributeData, Unit> onSubmitAttribute, final long j10, final boolean z10, @NotNull final q3 contentShape, @NotNull final Function0<Unit> function0, @NotNull final Function1<? super TicketType, Unit> function1, final boolean z11, @Nullable final PendingMessage.FailedImageUploadData failedImageUploadData, @NotNull final Function1<? super PendingMessage.FailedImageUploadData, Unit> onRetryImageClicked, float f10, @Nullable androidx.compose.runtime.c0 c0Var, final int i10, final int i11, final int i12) {
        List listEmptyList;
        Intrinsics.checkNotNullParameter(conversationPart, "conversationPart");
        Intrinsics.checkNotNullParameter(failedAttributeIdentifiers, "failedAttributeIdentifiers");
        Intrinsics.checkNotNullParameter(loadingAttributeIdentifiers, "loadingAttributeIdentifiers");
        Intrinsics.checkNotNullParameter(onSubmitAttribute, "onSubmitAttribute");
        Intrinsics.checkNotNullParameter(contentShape, "contentShape");
        Function0<Unit> onClick = function0;
        Intrinsics.checkNotNullParameter(onClick, "onClick");
        Function1<? super TicketType, Unit> onCreateTicket = function1;
        Intrinsics.checkNotNullParameter(onCreateTicket, "onCreateTicket");
        Intrinsics.checkNotNullParameter(onRetryImageClicked, "onRetryImageClicked");
        androidx.compose.runtime.c0 c0VarR = c0Var.R(-1984008321);
        float fR = (i12 & 4096) != 0 ? androidx.compose.ui.unit.h.r(0) : f10;
        androidx.compose.foundation.layout.q.f fVarG = androidx.compose.foundation.layout.q.f16330a.G(fR);
        androidx.compose.ui.a0.a aVar = androidx.compose.ui.a0.E;
        androidx.compose.ui.layout.a1 a1VarB = androidx.compose.foundation.layout.j0.b(fVarG, androidx.compose.ui.e.f37317a.u(), c0VarR, 0);
        int iHashCode = Long.hashCode(androidx.compose.runtime.v.l(c0VarR, 0));
        androidx.compose.runtime.b1 b1VarK = c0VarR.k();
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
        androidx.compose.foundation.layout.n0 n0Var = androidx.compose.foundation.layout.n0.f16227a;
        c0VarR.E(1162898485);
        if (conversationPart.getMessageStyle() == io.intercom.android.sdk.models.MessageStyle.ATTRIBUTE_COLLECTOR) {
            androidx.compose.ui.a0 a0VarH = i6.h(aVar, 0.0f, 1, null);
            List<Attribute> attributes = conversationPart.getForm().getAttributes();
            String id2 = conversationPart.getId();
            Intrinsics.checkNotNullExpressionValue(id2, "getId(...)");
            AttributeCollectorCardKt.AttributeCollectorCard(a0VarH, attributes, failedAttributeIdentifiers, loadingAttributeIdentifiers, id2, conversationPart.getForm().getDisabled(), onSubmitAttribute, c0VarR, ((i10 << 9) & 3670016) | 4678, 0);
        }
        c0VarR.A();
        c0VarR.E(1162960640);
        List<Block> blocks = conversationPart.getBlocks();
        Intrinsics.checkNotNullExpressionValue(blocks, "getBlocks(...)");
        List<Block> list = blocks;
        List<Attachments> attachments = conversationPart.getAttachments();
        Intrinsics.checkNotNullExpressionValue(attachments, "getAttachments(...)");
        if (attachments.isEmpty()) {
            listEmptyList = CollectionsKt.emptyList();
        } else {
            Block.Builder builderWithType = new Block.Builder().withType("ATTACHMENTLIST");
            List<Attachments> attachments2 = conversationPart.getAttachments();
            Intrinsics.checkNotNullExpressionValue(attachments2, "getAttachments(...)");
            List<Attachments> list2 = attachments2;
            ArrayList arrayList = new ArrayList(CollectionsKt.collectionSizeOrDefault(list2, 10));
            for (Attachments attachments3 : list2) {
                arrayList.add(new BlockAttachment.Builder().withName(attachments3.getName()).withUrl(attachments3.getUrl()).withContentType(attachments3.getContentType()).withHumanFileSize(attachments3.getHumanFileSize()).build());
            }
            listEmptyList = CollectionsKt.listOf(builderWithType.withAttachments(CollectionsKt.toList(arrayList)).build());
        }
        Iterator it = CollectionsKt.plus((Collection) list, (Iterable) listEmptyList).iterator();
        while (it.hasNext()) {
            Block block = (Block) it.next();
            androidx.compose.ui.a0.a aVar3 = androidx.compose.ui.a0.E;
            androidx.compose.ui.e.a aVar4 = androidx.compose.ui.e.f37317a;
            androidx.compose.ui.layout.a1 a1VarK = androidx.compose.foundation.layout.x.k(aVar4.C(), false);
            int iHashCode2 = Long.hashCode(androidx.compose.runtime.v.l(c0VarR, 0));
            androidx.compose.runtime.b1 b1VarK2 = c0VarR.k();
            androidx.compose.ui.a0 a0VarN2 = androidx.compose.ui.m.n(c0VarR, aVar3);
            androidx.compose.ui.node.g.a aVar5 = androidx.compose.ui.node.g.I;
            Iterator it2 = it;
            Function0<androidx.compose.ui.node.g> function0A2 = aVar5.a();
            if (c0VarR.S() == null) {
                androidx.compose.runtime.v.r();
            }
            c0VarR.q();
            if (c0VarR.P()) {
                c0VarR.q0(function0A2);
            } else {
                c0VarR.l();
            }
            androidx.compose.runtime.c0 c0VarD2 = y7.d(c0VarR);
            y7.n(c0VarD2, a1VarK, aVar5.e());
            y7.n(c0VarD2, b1VarK2, aVar5.g());
            Function2<androidx.compose.ui.node.g, Integer, Unit> function2B2 = aVar5.b();
            if (c0VarD2.P() || !Intrinsics.areEqual(c0VarD2.i0(), Integer.valueOf(iHashCode2))) {
                c0VarD2.Y(Integer.valueOf(iHashCode2));
                c0VarD2.f(Integer.valueOf(iHashCode2), function2B2);
            }
            y7.n(c0VarD2, a0VarN2, aVar5.f());
            androidx.compose.foundation.layout.d0 d0Var = androidx.compose.foundation.layout.d0.f15956a;
            androidx.compose.ui.a0 a0VarA = androidx.compose.ui.draw.j.a(aVar3, contentShape);
            Intrinsics.checkNotNull(block);
            androidx.compose.ui.graphics.q0 q0VarN = androidx.compose.ui.graphics.q0.n(j10);
            IntercomTheme intercomTheme = IntercomTheme.INSTANCE;
            int i13 = IntercomTheme.$stable;
            long jX = intercomTheme.getTypography(c0VarR, i13).getType04().x();
            androidx.compose.ui.text.font.v0 v0VarA = intercomTheme.getTypography(c0VarR, i13).getType04().A();
            if (v0VarA == null) {
                v0VarA = androidx.compose.ui.text.font.v0.f41742b.m();
            }
            BlockViewKt.BlockView(a0VarA, new BlockRenderData(block, q0VarN, null, null, new BlockRenderTextStyle(jX, v0VarA, intercomTheme.getTypography(c0VarR, i13).getType04().I(), null, null, null, 56, null), 12, null), z11, null, z10, conversationPart.getParentConversation().getId(), ImageRenderType.WITH_MAX_SIZE, onClick, onCreateTicket, false, null, null, c0VarR, ((i10 >> 21) & 896) | 1572928 | ((i10 >> 3) & 57344) | (i10 & 29360128) | (i10 & 234881024), 0, 3592);
            c0VarR.E(1737872381);
            if (failedImageUploadData != null) {
                a4.g(new Function0() { // from class: io.intercom.android.sdk.m5.conversation.ui.components.row.j
                    @Override // kotlin.jvm.functions.Function0
                    public final Object invoke() {
                        return BubbleMessageRowKt.MessageContent_993knro$lambda$11$lambda$10$lambda$9$lambda$8(onRetryImageClicked, failedImageUploadData);
                    }
                }, d0Var.b(aVar3, aVar4.i()), false, null, s3.f32666a.b(intercomTheme.getColors(c0VarR, i13).m684getAction0d7_KjU(), o6.g(intercomTheme.getColors(c0VarR, i13).m684getAction0d7_KjU(), c0VarR, 0), 0L, 0L, c0VarR, s3.f32683r << 12, 12), null, null, null, null, ComposableSingletons$BubbleMessageRowKt.INSTANCE.m280getLambda1$intercom_sdk_base_release(), c0VarR, 805306368, 492);
            }
            c0VarR.A();
            c0VarR.o();
            onClick = function0;
            onCreateTicket = function1;
            it = it2;
        }
        c0VarR.A();
        c0VarR.o();
        s5 s5VarT = c0VarR.T();
        if (s5VarT != null) {
            final float f11 = fR;
            s5VarT.a(new Function2() { // from class: io.intercom.android.sdk.m5.conversation.ui.components.row.k
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    return BubbleMessageRowKt.MessageContent_993knro$lambda$12(conversationPart, failedAttributeIdentifiers, loadingAttributeIdentifiers, onSubmitAttribute, j10, z10, contentShape, function0, function1, z11, failedImageUploadData, onRetryImageClicked, f11, i10, i11, i12, (androidx.compose.runtime.c0) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit MessageContent_993knro$lambda$11$lambda$10$lambda$9$lambda$8(Function1 onRetryImageClicked, PendingMessage.FailedImageUploadData failedImageUploadData) {
        Intrinsics.checkNotNullParameter(onRetryImageClicked, "$onRetryImageClicked");
        onRetryImageClicked.invoke(failedImageUploadData);
        return Unit.f312394a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit MessageContent_993knro$lambda$12(Part conversationPart, List failedAttributeIdentifiers, List loadingAttributeIdentifiers, Function1 onSubmitAttribute, long j10, boolean z10, q3 contentShape, Function0 onClick, Function1 onCreateTicket, boolean z11, PendingMessage.FailedImageUploadData failedImageUploadData, Function1 onRetryImageClicked, float f10, int i10, int i11, int i12, androidx.compose.runtime.c0 c0Var, int i13) {
        Intrinsics.checkNotNullParameter(conversationPart, "$conversationPart");
        Intrinsics.checkNotNullParameter(failedAttributeIdentifiers, "$failedAttributeIdentifiers");
        Intrinsics.checkNotNullParameter(loadingAttributeIdentifiers, "$loadingAttributeIdentifiers");
        Intrinsics.checkNotNullParameter(onSubmitAttribute, "$onSubmitAttribute");
        Intrinsics.checkNotNullParameter(contentShape, "$contentShape");
        Intrinsics.checkNotNullParameter(onClick, "$onClick");
        Intrinsics.checkNotNullParameter(onCreateTicket, "$onCreateTicket");
        Intrinsics.checkNotNullParameter(onRetryImageClicked, "$onRetryImageClicked");
        m275MessageContent993knro(conversationPart, failedAttributeIdentifiers, loadingAttributeIdentifiers, onSubmitAttribute, j10, z10, contentShape, onClick, onCreateTicket, z11, failedImageUploadData, onRetryImageClicked, f10, c0Var, t4.a(i10 | 1), t4.a(i11), i12);
        return Unit.f312394a;
    }

    @androidx.compose.runtime.o
    @androidx.compose.runtime.t(applier = "androidx.compose.ui.UiComposable")
    public static final void MessageMeta(@Nullable androidx.compose.ui.a0 a0Var, @NotNull final String metaString, @NotNull final String attributeString, final boolean z10, @Nullable androidx.compose.runtime.c0 c0Var, final int i10, final int i11) {
        androidx.compose.ui.a0 a0Var2;
        int i12;
        androidx.compose.runtime.c0 c0Var2;
        androidx.compose.ui.a0 a0Var3;
        IntercomTheme intercomTheme;
        int i13;
        int i14;
        long j10;
        androidx.compose.runtime.c0 c0Var3;
        final androidx.compose.ui.a0 a0Var4;
        Intrinsics.checkNotNullParameter(metaString, "metaString");
        Intrinsics.checkNotNullParameter(attributeString, "attributeString");
        androidx.compose.runtime.c0 c0VarR = c0Var.R(302477331);
        int i15 = i11 & 1;
        if (i15 != 0) {
            i12 = i10 | 6;
            a0Var2 = a0Var;
        } else if ((i10 & 14) == 0) {
            a0Var2 = a0Var;
            i12 = (c0VarR.D(a0Var2) ? 4 : 2) | i10;
        } else {
            a0Var2 = a0Var;
            i12 = i10;
        }
        if ((i11 & 2) != 0) {
            i12 |= 48;
        } else if ((i10 & com.planner5d.library.engine.input.f.b.B) == 0) {
            i12 |= c0VarR.D(metaString) ? 32 : 16;
        }
        if ((i11 & 4) != 0) {
            i12 |= a5.S0;
        } else if ((i10 & 896) == 0) {
            i12 |= c0VarR.D(attributeString) ? 256 : 128;
        }
        if ((i11 & 8) != 0) {
            i12 |= 3072;
        } else if ((i10 & 7168) == 0) {
            i12 |= c0VarR.G(z10) ? 2048 : 1024;
        }
        if ((i12 & 5851) == 1170 && c0VarR.d()) {
            c0VarR.u();
            c0Var3 = c0VarR;
            a0Var4 = a0Var2;
        } else {
            androidx.compose.ui.a0 a0Var5 = i15 != 0 ? androidx.compose.ui.a0.E : a0Var2;
            IntercomTheme intercomTheme2 = IntercomTheme.INSTANCE;
            int i16 = IntercomTheme.$stable;
            long jM699getDescriptionText0d7_KjU = intercomTheme2.getColors(c0VarR, i16).m699getDescriptionText0d7_KjU();
            androidx.compose.ui.layout.a1 a1VarE = u5.e(androidx.compose.foundation.layout.q.f16330a.s(), androidx.compose.ui.e.f37317a.w(), c0VarR, 6);
            int iHashCode = Long.hashCode(androidx.compose.runtime.v.l(c0VarR, 0));
            androidx.compose.runtime.b1 b1VarK = c0VarR.k();
            androidx.compose.ui.a0 a0VarN = androidx.compose.ui.m.n(c0VarR, a0Var5);
            androidx.compose.ui.node.g.a aVar = androidx.compose.ui.node.g.I;
            Function0<androidx.compose.ui.node.g> function0A = aVar.a();
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
            y7.n(c0VarD, a1VarE, aVar.e());
            y7.n(c0VarD, b1VarK, aVar.g());
            Function2<androidx.compose.ui.node.g, Integer, Unit> function2B = aVar.b();
            if (c0VarD.P() || !Intrinsics.areEqual(c0VarD.i0(), Integer.valueOf(iHashCode))) {
                c0VarD.Y(Integer.valueOf(iHashCode));
                c0VarD.f(Integer.valueOf(iHashCode), function2B);
            }
            y7.n(c0VarD, a0VarN, aVar.f());
            y5 y5Var = y5.f16577a;
            c0VarR.E(-1112135187);
            if (z10) {
                c0Var2 = c0VarR;
                a0Var3 = a0Var5;
                intercomTheme = intercomTheme2;
                i13 = i12;
                i14 = i16;
                j10 = jM699getDescriptionText0d7_KjU;
            } else {
                a0Var3 = a0Var5;
                i13 = i12;
                intercomTheme = intercomTheme2;
                i14 = i16;
                q50.t(attributeString, d5.v(androidx.compose.ui.a0.E, 0.0f, 0.0f, androidx.compose.ui.unit.h.r(8), 0.0f, 11, null), jM699getDescriptionText0d7_KjU, null, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, intercomTheme2.getTypography(c0VarR, i16).getType05(), c0VarR, ((i12 >> 6) & 14) | 48, 0, 131064);
                j10 = jM699getDescriptionText0d7_KjU;
                c0Var2 = c0VarR;
            }
            c0Var2.A();
            int i17 = i14;
            androidx.compose.runtime.c0 c0Var4 = c0Var2;
            IntercomTheme intercomTheme3 = intercomTheme;
            q50.t(metaString, null, j10, null, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, intercomTheme.getTypography(c0Var2, i17).getType05(), c0Var4, (i13 >> 3) & 14, 0, 131066);
            c0Var4.E(-1112121618);
            if (z10) {
                c0Var3 = c0Var4;
                q50.t(attributeString, d5.v(androidx.compose.ui.a0.E, androidx.compose.ui.unit.h.r(8), 0.0f, 0.0f, 0.0f, 14, null), j10, null, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, intercomTheme3.getTypography(c0Var4, i17).getType05(), c0Var3, ((i13 >> 6) & 14) | 48, 0, 131064);
            } else {
                c0Var3 = c0Var4;
            }
            c0Var3.A();
            c0Var3.o();
            a0Var4 = a0Var3;
        }
        s5 s5VarT = c0Var3.T();
        if (s5VarT != null) {
            s5VarT.a(new Function2() { // from class: io.intercom.android.sdk.m5.conversation.ui.components.row.q
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    return BubbleMessageRowKt.MessageMeta$lambda$15(a0Var4, metaString, attributeString, z10, i10, i11, (androidx.compose.runtime.c0) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit MessageMeta$lambda$15(androidx.compose.ui.a0 a0Var, String metaString, String attributeString, boolean z10, int i10, int i11, androidx.compose.runtime.c0 c0Var, int i12) {
        Intrinsics.checkNotNullParameter(metaString, "$metaString");
        Intrinsics.checkNotNullParameter(attributeString, "$attributeString");
        MessageMeta(a0Var, metaString, attributeString, z10, c0Var, t4.a(i10 | 1), i11);
        return Unit.f312394a;
    }

    @androidx.compose.runtime.o
    public static final float contentAlpha(boolean z10, @Nullable androidx.compose.runtime.c0 c0Var, int i10) {
        c0Var.E(1168284893);
        float f10 = z10 ? 1.0f : 0.38f;
        c0Var.A();
        return f10;
    }

    public static final Block.Builder getAnswerBlock() {
        return answerBlock;
    }

    public static final Block.Builder getArticleBlock() {
        return articleBlock;
    }

    @NotNull
    public static final androidx.compose.ui.text.f getCopyText(@NotNull Part part) {
        Intrinsics.checkNotNullParameter(part, "<this>");
        androidx.compose.ui.text.f.b bVar = new androidx.compose.ui.text.f.b(0, 1, null);
        for (Block block : part.getBlocks()) {
            BlockType type = block.getType();
            switch (type == null ? -1 : WhenMappings.$EnumSwitchMapping$0[type.ordinal()]) {
                case 1:
                case 2:
                case 3:
                case 4:
                    bVar.p(androidx.core.text.c.a(block.getText(), 0).toString());
                    break;
                case 5:
                    String url = block.getUrl();
                    Intrinsics.checkNotNullExpressionValue(url, "getUrl(...)");
                    bVar.p(url);
                    break;
                case 6:
                case 7:
                    for (String str : block.getItems()) {
                        Intrinsics.checkNotNull(str);
                        bVar.p(str);
                    }
                    break;
            }
        }
        androidx.compose.ui.text.f fVarC = bVar.C();
        if (fVarC.length() != 0) {
            return fVarC;
        }
        String summary = part.getSummary();
        Intrinsics.checkNotNullExpressionValue(summary, "getSummary(...)");
        return new androidx.compose.ui.text.f(summary, null, 2, null);
    }

    public static final Block.Builder getCreateTicketBlock() {
        return createTicketBlock;
    }

    @NotNull
    public static final Metadata getHumanMetadata() {
        return humanMetadata;
    }

    public static final Block.Builder getLongParagraphBlock() {
        return longParagraphBlock;
    }

    @androidx.compose.runtime.o
    private static final MessageStyle getMessageStyle(boolean z10, GroupingPosition groupingPosition, boolean z11, androidx.compose.runtime.c0 c0Var, int i10) {
        MessageStyle messageStyle;
        c0Var.E(1733827858);
        if (z10) {
            c0Var.E(-1196940615);
            float fR = androidx.compose.ui.unit.h.r(20);
            float fR2 = androidx.compose.ui.unit.h.r(4);
            IntercomTheme intercomTheme = IntercomTheme.INSTANCE;
            int i11 = IntercomTheme.$stable;
            long jM687getAdminBackground0d7_KjU = intercomTheme.getColors(c0Var, i11).m687getAdminBackground0d7_KjU();
            float f10 = 16;
            g5 g5VarG = d5.g(androidx.compose.ui.unit.h.r(f10), androidx.compose.ui.unit.h.r(12));
            float f11 = (groupingPosition == GroupingPosition.BOTTOM || groupingPosition == GroupingPosition.MIDDLE) ? fR2 : fR;
            if (groupingPosition != GroupingPosition.TOP && groupingPosition != GroupingPosition.MIDDLE) {
                fR2 = fR;
            }
            messageStyle = new MessageStyle(new MessageStyle.BubbleStyle(jM687getAdminBackground0d7_KjU, g5VarG, androidx.compose.foundation.shape.o.i(f11, fR, fR, fR2), androidx.compose.foundation.b1.a(androidx.compose.ui.unit.h.r(1), intercomTheme.getColors(c0Var, i11).m688getAdminBorder0d7_KjU()), null), androidx.compose.ui.e.f37317a.u(), d5.j(androidx.compose.ui.unit.h.r(f10), 0.0f, androidx.compose.ui.unit.h.r(60), 0.0f, 10, null), androidx.compose.foundation.shape.o.h(fR));
            c0Var.A();
        } else {
            c0Var.E(-1195737257);
            float fR3 = androidx.compose.ui.unit.h.r(20);
            float fR4 = androidx.compose.ui.unit.h.r(4);
            long jM684getAction0d7_KjU = IntercomTheme.INSTANCE.getColors(c0Var, IntercomTheme.$stable).m684getAction0d7_KjU();
            float f12 = 16;
            g5 g5VarG2 = d5.g(androidx.compose.ui.unit.h.r(f12), androidx.compose.ui.unit.h.r(12));
            float f13 = (groupingPosition == GroupingPosition.BOTTOM || groupingPosition == GroupingPosition.MIDDLE) ? fR4 : fR3;
            if (groupingPosition != GroupingPosition.TOP && groupingPosition != GroupingPosition.MIDDLE) {
                fR4 = fR3;
            }
            MessageStyle messageStyle2 = new MessageStyle(new MessageStyle.BubbleStyle(jM684getAction0d7_KjU, g5VarG2, androidx.compose.foundation.shape.o.i(fR3, f13, fR4, fR3), null, null), androidx.compose.ui.e.f37317a.s(), z11 ? d5.j(androidx.compose.ui.unit.h.r(36), 0.0f, androidx.compose.ui.unit.h.r(f12), 0.0f, 10, null) : d5.j(androidx.compose.ui.unit.h.r(60), 0.0f, androidx.compose.ui.unit.h.r(f12), 0.0f, 10, null), androidx.compose.foundation.shape.o.h(fR3));
            c0Var.A();
            messageStyle = messageStyle2;
        }
        c0Var.A();
        return messageStyle;
    }

    public static final Block.Builder getParagraphBlock() {
        return paragraphBlock;
    }

    public static final boolean shouldShowAttribution(@NotNull Part part) {
        Intrinsics.checkNotNullParameter(part, "<this>");
        int i10 = 5 & 1;
        if (part.getBlocks().size() == 1) {
            List<BlockType> list = imageBlockTypes;
            List<Block> blocks = part.getBlocks();
            Intrinsics.checkNotNullExpressionValue(blocks, "getBlocks(...)");
            if (list.contains(((Block) CollectionsKt.first((List) blocks)).getType())) {
                List<Block> blocks2 = part.getBlocks();
                Intrinsics.checkNotNullExpressionValue(blocks2, "getBlocks(...)");
                String attribution = ((Block) CollectionsKt.first((List) blocks2)).getAttribution();
                Intrinsics.checkNotNullExpressionValue(attribution, "getAttribution(...)");
                if (attribution.length() > 0 && part.getMessageState() == Part.MessageState.NORMAL) {
                    return true;
                }
            }
        }
        return false;
    }
}
