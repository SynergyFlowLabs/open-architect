package io.intercom.android.sdk.m5.components;

import android.content.Context;
import androidx.compose.foundation.layout.d5;
import androidx.compose.foundation.layout.g5;
import androidx.compose.foundation.layout.i6;
import androidx.compose.foundation.layout.l6;
import androidx.compose.foundation.layout.u5;
import androidx.compose.foundation.layout.x5;
import androidx.compose.foundation.layout.y5;
import androidx.compose.material3.q50;
import androidx.compose.material3.u10;
import androidx.compose.runtime.s5;
import androidx.compose.runtime.t4;
import androidx.compose.runtime.y7;
import androidx.compose.ui.platform.AndroidCompositionLocals_androidKt;
import androidx.compose.ui.text.y3;
import io.intercom.android.sdk.Injector;
import io.intercom.android.sdk.R;
import io.intercom.android.sdk.m5.components.avatar.AvatarWrapper;
import io.intercom.android.sdk.models.Avatar;
import io.intercom.android.sdk.models.Conversation;
import io.intercom.android.sdk.models.LastParticipatingAdmin;
import io.intercom.android.sdk.models.Part;
import io.intercom.android.sdk.models.Participant;
import io.intercom.android.sdk.models.Ticket;
import io.intercom.android.sdk.ui.IntercomPreviews;
import io.intercom.android.sdk.ui.theme.IntercomTheme;
import io.intercom.android.sdk.ui.theme.IntercomThemeKt;
import io.intercom.android.sdk.utilities.GroupConversationTextFormatter;
import io.intercom.android.sdk.utilities.TimeFormatterExtKt;
import java.util.ArrayList;
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
@SourceDebugExtension({"SMAP\nConversationItem.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ConversationItem.kt\nio/intercom/android/sdk/m5/components/ConversationItemKt\n+ 2 Dp.kt\nandroidx/compose/ui/unit/DpKt\n+ 3 CompositionLocal.kt\nandroidx/compose/runtime/CompositionLocal\n+ 4 Composer.kt\nandroidx/compose/runtime/ComposerKt\n+ 5 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n+ 6 Box.kt\nandroidx/compose/foundation/layout/BoxKt\n+ 7 Layout.kt\nandroidx/compose/ui/layout/LayoutKt\n+ 8 Composables.kt\nandroidx/compose/runtime/ComposablesKt\n+ 9 Composer.kt\nandroidx/compose/runtime/Updater\n+ 10 Size.kt\nandroidx/compose/ui/geometry/Size\n+ 11 InlineClassHelper.kt\nandroidx/compose/ui/util/InlineClassHelperKt\n+ 12 InlineClassHelper.jvm.kt\nandroidx/compose/ui/util/InlineClassHelper_jvmKt\n+ 13 Offset.kt\nandroidx/compose/ui/geometry/OffsetKt\n*L\n1#1,256:1\n113#2:257\n113#2:269\n113#2:306\n75#3:258\n1282#4,6:259\n1557#5:265\n1628#5,3:266\n70#6:270\n68#6,8:271\n77#6:310\n80#7,6:279\n87#7,3:294\n90#7,2:303\n94#7:309\n391#8,9:285\n400#8:305\n401#8,2:307\n4360#9,6:297\n57#10:311\n61#10:314\n60#11:312\n70#11:315\n53#11,3:317\n22#12:313\n30#13:316\n*S KotlinDebug\n*F\n+ 1 ConversationItem.kt\nio/intercom/android/sdk/m5/components/ConversationItemKt\n*L\n44#1:257\n147#1:269\n151#1:306\n48#1:258\n49#1:259,6\n136#1:265\n136#1:266,3\n146#1:270\n146#1:271,8\n146#1:310\n146#1:279,6\n146#1:294,3\n146#1:303,2\n146#1:309\n146#1:285,9\n146#1:305\n146#1:307,2\n146#1:297,6\n155#1:311\n155#1:314\n155#1:312\n155#1:315\n155#1:317,3\n155#1:313\n155#1:316\n*E\n"})
public final class ConversationItemKt {
    @androidx.compose.runtime.o
    @androidx.compose.runtime.t(applier = "androidx.compose.ui.UiComposable")
    public static final void ConversationItem(@NotNull final Conversation conversation, @Nullable androidx.compose.ui.a0 a0Var, @Nullable g5 g5Var, boolean z10, @NotNull final Function0<Unit> onClick, @Nullable androidx.compose.runtime.c0 c0Var, final int i10, final int i11) {
        Intrinsics.checkNotNullParameter(conversation, "conversation");
        Intrinsics.checkNotNullParameter(onClick, "onClick");
        androidx.compose.runtime.c0 c0VarR = c0Var.R(-1756864283);
        androidx.compose.ui.a0 a0Var2 = (i11 & 2) != 0 ? androidx.compose.ui.a0.E : a0Var;
        final g5 g5VarF = (i11 & 4) != 0 ? d5.f(androidx.compose.ui.unit.h.r(0)) : g5Var;
        boolean z11 = (i11 & 8) != 0 ? !conversation.isRead() : z10;
        final Context context = (Context) c0VarR.W(AndroidCompositionLocals_androidKt.g());
        c0VarR.E(-437498000);
        boolean z12 = (((57344 & i10) ^ 24576) > 16384 && c0VarR.D(onClick)) || (i10 & 24576) == 16384;
        Object objI0 = c0VarR.i0();
        if (z12 || objI0 == androidx.compose.runtime.c0.f35327a.a()) {
            objI0 = new Function0() { // from class: io.intercom.android.sdk.m5.components.z0
                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    return ConversationItemKt.ConversationItem$lambda$1$lambda$0(onClick);
                }
            };
            c0VarR.Y(objI0);
        }
        c0VarR.A();
        final boolean z13 = z11;
        final androidx.compose.ui.a0 a0Var3 = a0Var2;
        u10.c(androidx.compose.foundation.i1.j(a0Var3, false, null, null, null, (Function0) objI0, 15, null), null, 0L, 0L, 0.0f, 0.0f, null, androidx.compose.runtime.internal.w.e(1413097514, true, new Function2<androidx.compose.runtime.c0, Integer, Unit>() { // from class: io.intercom.android.sdk.m5.components.ConversationItemKt.ConversationItem.2
            @Override // kotlin.jvm.functions.Function2
            public /* bridge */ /* synthetic */ Unit invoke(androidx.compose.runtime.c0 c0Var2, Integer num) {
                invoke(c0Var2, num.intValue());
                return Unit.f312394a;
            }

            @androidx.compose.runtime.o
            @androidx.compose.runtime.t(applier = "androidx.compose.ui.UiComposable")
            public final void invoke(androidx.compose.runtime.c0 c0Var2, int i12) {
                List listListOf;
                androidx.compose.runtime.c0 c0Var3;
                androidx.compose.ui.a0.a aVar;
                Conversation conversation2;
                boolean z14;
                Context context2;
                Context context3;
                String string;
                if ((i12 & 11) == 2 && c0Var2.d()) {
                    c0Var2.u();
                    return;
                }
                androidx.compose.ui.a0.a aVar2 = androidx.compose.ui.a0.E;
                androidx.compose.ui.a0 a0VarP = d5.p(aVar2, g5VarF);
                androidx.compose.ui.e.a aVar3 = androidx.compose.ui.e.f37317a;
                androidx.compose.ui.e.c cVarQ = aVar3.q();
                Conversation conversation3 = conversation;
                boolean z15 = z13;
                Context context4 = context;
                androidx.compose.foundation.layout.q qVar = androidx.compose.foundation.layout.q.f16330a;
                androidx.compose.ui.layout.a1 a1VarE = u5.e(qVar.w(), cVarQ, c0Var2, 48);
                int iHashCode = Long.hashCode(androidx.compose.runtime.v.l(c0Var2, 0));
                androidx.compose.runtime.b1 b1VarK = c0Var2.k();
                androidx.compose.ui.a0 a0VarN = androidx.compose.ui.m.n(c0Var2, a0VarP);
                androidx.compose.ui.node.g.a aVar4 = androidx.compose.ui.node.g.I;
                Function0<androidx.compose.ui.node.g> function0A = aVar4.a();
                if (c0Var2.S() == null) {
                    androidx.compose.runtime.v.r();
                }
                c0Var2.q();
                if (c0Var2.P()) {
                    c0Var2.q0(function0A);
                } else {
                    c0Var2.l();
                }
                androidx.compose.runtime.c0 c0VarD = y7.d(c0Var2);
                y7.n(c0VarD, a1VarE, aVar4.e());
                y7.n(c0VarD, b1VarK, aVar4.g());
                Function2<androidx.compose.ui.node.g, Integer, Unit> function2B = aVar4.b();
                if (c0VarD.P() || !Intrinsics.areEqual(c0VarD.i0(), Integer.valueOf(iHashCode))) {
                    c0VarD.Y(Integer.valueOf(iHashCode));
                    c0VarD.f(Integer.valueOf(iHashCode), function2B);
                }
                y7.n(c0VarD, a0VarN, aVar4.f());
                y5 y5Var = y5.f16577a;
                if (LastParticipatingAdmin.isNull(conversation3.lastParticipatingAdmin())) {
                    listListOf = ConversationItemKt.getActiveAdminsAvatars();
                } else {
                    Avatar avatar = conversation3.lastParticipatingAdmin().getAvatar();
                    Intrinsics.checkNotNullExpressionValue(avatar, "getAvatar(...)");
                    listListOf = CollectionsKt.listOf(new AvatarWrapper(avatar, conversation3.lastParticipatingAdmin().isBot()));
                }
                AvatarTriangleGroupKt.m102AvatarTriangleGroupjt2gSs(listListOf, y5Var.n(aVar2, aVar3.q()), null, androidx.compose.ui.unit.h.r(32), c0Var2, 3080, 4);
                l6.a(i6.B(aVar2, androidx.compose.ui.unit.h.r(12)), c0Var2, 6);
                androidx.compose.ui.a0 a0VarQ = x5.q(y5Var, aVar2, 2.0f, false, 2, null);
                androidx.compose.ui.layout.a1 a1VarB = androidx.compose.foundation.layout.j0.b(qVar.y(), aVar3.u(), c0Var2, 0);
                int iHashCode2 = Long.hashCode(androidx.compose.runtime.v.l(c0Var2, 0));
                androidx.compose.runtime.b1 b1VarK2 = c0Var2.k();
                androidx.compose.ui.a0 a0VarN2 = androidx.compose.ui.m.n(c0Var2, a0VarQ);
                Function0<androidx.compose.ui.node.g> function0A2 = aVar4.a();
                if (c0Var2.S() == null) {
                    androidx.compose.runtime.v.r();
                }
                c0Var2.q();
                if (c0Var2.P()) {
                    c0Var2.q0(function0A2);
                } else {
                    c0Var2.l();
                }
                androidx.compose.runtime.c0 c0VarD2 = y7.d(c0Var2);
                y7.n(c0VarD2, a1VarB, aVar4.e());
                y7.n(c0VarD2, b1VarK2, aVar4.g());
                Function2<androidx.compose.ui.node.g, Integer, Unit> function2B2 = aVar4.b();
                if (c0VarD2.P() || !Intrinsics.areEqual(c0VarD2.i0(), Integer.valueOf(iHashCode2))) {
                    c0VarD2.Y(Integer.valueOf(iHashCode2));
                    c0VarD2.f(Integer.valueOf(iHashCode2), function2B2);
                }
                y7.n(c0VarD2, a0VarN2, aVar4.f());
                androidx.compose.foundation.layout.n0 n0Var = androidx.compose.foundation.layout.n0.f16227a;
                c0Var2.E(-1283476508);
                if (conversation3.getTicket() != null) {
                    TicketHeaderKt.TicketHeader(null, new TicketStatusHeaderArgs(conversation3.getTicket().getTitle(), conversation3.isRead() ? androidx.compose.ui.text.font.v0.f41742b.m() : androidx.compose.ui.text.font.v0.f41742b.o()), c0Var2, 0, 1);
                }
                c0Var2.A();
                String summary = conversation3.lastPart().getSummary();
                if (summary.length() == 0) {
                    summary = conversation3.getTicket() != null ? conversation3.getTicket().getCurrentStatus().getStatusDetail() : "";
                }
                c0Var2.E(-1283454258);
                Intrinsics.checkNotNull(summary);
                if (summary.length() > 0) {
                    c0Var2.E(-1283451787);
                    if (conversation3.lastPart().getParticipant().isUserWithId(ConversationItemKt.getUserIntercomId())) {
                        summary = ((Context) c0Var2.W(AndroidCompositionLocals_androidKt.g())).getString(R.string.intercom_you) + ": " + summary;
                    }
                    c0Var2.A();
                    Intrinsics.checkNotNull(summary);
                    conversation2 = conversation3;
                    z14 = z15;
                    aVar = aVar2;
                    context2 = context4;
                    q50.t(summary, d5.v(aVar2, 0.0f, 0.0f, 0.0f, androidx.compose.ui.unit.h.r(4), 7, null), 0L, null, 0L, null, null, null, 0L, null, null, 0L, androidx.compose.ui.text.style.v.f42256b.c(), false, 1, 0, null, y3.m(IntercomTheme.INSTANCE.getTypography(c0Var2, IntercomTheme.$stable).getType04(), 0L, 0L, conversation3.isRead() ? androidx.compose.ui.text.font.v0.f41742b.m() : androidx.compose.ui.text.font.v0.f41742b.o(), null, null, null, null, 0L, null, null, null, 0L, null, null, null, 0, 0, 0L, null, null, null, 0, 0, null, 16777211, null), c0Var2, 48, 24960, 110588);
                    c0Var3 = c0Var2;
                } else {
                    c0Var3 = c0Var2;
                    aVar = aVar2;
                    conversation2 = conversation3;
                    z14 = z15;
                    context2 = context4;
                }
                c0Var3.A();
                androidx.compose.ui.layout.a1 a1VarE2 = u5.e(qVar.w(), aVar3.w(), c0Var3, 0);
                int iHashCode3 = Long.hashCode(androidx.compose.runtime.v.l(c0Var3, 0));
                androidx.compose.runtime.b1 b1VarK3 = c0Var3.k();
                androidx.compose.ui.a0.a aVar5 = aVar;
                androidx.compose.ui.a0 a0VarN3 = androidx.compose.ui.m.n(c0Var3, aVar5);
                Function0<androidx.compose.ui.node.g> function0A3 = aVar4.a();
                if (c0Var3.S() == null) {
                    androidx.compose.runtime.v.r();
                }
                c0Var3.q();
                if (c0Var3.P()) {
                    c0Var3.q0(function0A3);
                } else {
                    c0Var3.l();
                }
                androidx.compose.runtime.c0 c0VarD3 = y7.d(c0Var3);
                y7.n(c0VarD3, a1VarE2, aVar4.e());
                y7.n(c0VarD3, b1VarK3, aVar4.g());
                Function2<androidx.compose.ui.node.g, Integer, Unit> function2B3 = aVar4.b();
                if (c0VarD3.P() || !Intrinsics.areEqual(c0VarD3.i0(), Integer.valueOf(iHashCode3))) {
                    c0VarD3.Y(Integer.valueOf(iHashCode3));
                    c0VarD3.f(Integer.valueOf(iHashCode3), function2B3);
                }
                y7.n(c0VarD3, a0VarN3, aVar4.f());
                String firstName = conversation2.lastParticipatingAdmin().getFirstName();
                Intrinsics.checkNotNullExpressionValue(firstName, "getFirstName(...)");
                if (firstName.length() == 0) {
                    string = ConversationItemKt.getWorkspaceName();
                    context3 = context2;
                } else {
                    String firstName2 = conversation2.lastParticipatingAdmin().getFirstName();
                    Intrinsics.checkNotNullExpressionValue(firstName2, "getFirstName(...)");
                    context3 = context2;
                    string = GroupConversationTextFormatter.groupConversationSubtitle(firstName2, conversation2.groupConversationParticipants().size(), context3).toString();
                }
                String str = TimeFormatterExtKt.formattedDateFromLong(conversation2.lastPart().getCreatedAt(), context3);
                if (str.length() == 0) {
                    str = conversation2.getTicket() != null ? TimeFormatterExtKt.formattedDateFromLong(conversation2.getTicket().getCurrentStatus().getCreatedDate(), context3) : "";
                }
                IntercomTheme intercomTheme = IntercomTheme.INSTANCE;
                int i13 = IntercomTheme.$stable;
                TextWithSeparatorKt.m171TextWithSeparatorwV1YYcM(string, str, null, null, intercomTheme.getTypography(c0Var3, i13).getType04(), intercomTheme.getColors(c0Var3, i13).m699getDescriptionText0d7_KjU(), 0, 0, null, c0Var2, 0, 460);
                c0Var2.o();
                c0Var2.o();
                if (z14) {
                    c0Var2.E(-1055527017);
                    ConversationItemKt.UnreadIndicator(null, c0Var2, 0, 1);
                    c0Var2.A();
                } else {
                    c0Var2.E(-1055471186);
                    IntercomChevronKt.IntercomChevron(d5.v(aVar5, androidx.compose.ui.unit.h.r(6), 0.0f, 0.0f, 0.0f, 14, null), c0Var2, 6, 0);
                    c0Var2.A();
                }
                c0Var2.o();
            }
        }, c0VarR, 54), c0VarR, 12582912, okhttp3.internal.ws.g.f334652s);
        s5 s5VarT = c0VarR.T();
        if (s5VarT != null) {
            s5VarT.a(new Function2() { // from class: io.intercom.android.sdk.m5.components.a1
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    return ConversationItemKt.ConversationItem$lambda$2(conversation, a0Var3, g5VarF, z13, onClick, i10, i11, (androidx.compose.runtime.c0) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit ConversationItem$lambda$1$lambda$0(Function0 onClick) {
        Intrinsics.checkNotNullParameter(onClick, "$onClick");
        onClick.invoke();
        return Unit.f312394a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit ConversationItem$lambda$2(Conversation conversation, androidx.compose.ui.a0 a0Var, g5 g5Var, boolean z10, Function0 onClick, int i10, int i11, androidx.compose.runtime.c0 c0Var, int i12) {
        Intrinsics.checkNotNullParameter(conversation, "$conversation");
        Intrinsics.checkNotNullParameter(onClick, "$onClick");
        ConversationItem(conversation, a0Var, g5Var, z10, onClick, c0Var, t4.a(i10 | 1), i11);
        return Unit.f312394a;
    }

    @androidx.compose.runtime.o
    @IntercomPreviews
    @androidx.compose.runtime.t(applier = "androidx.compose.ui.UiComposable")
    public static final void ReadConversationWithSimpleTicketHeaderPreview(@Nullable androidx.compose.runtime.c0 c0Var, final int i10) {
        androidx.compose.runtime.c0 c0VarR = c0Var.R(1446702226);
        if (i10 == 0 && c0VarR.d()) {
            c0VarR.u();
        } else {
            IntercomThemeKt.IntercomTheme(null, null, null, ComposableSingletons$ConversationItemKt.INSTANCE.m117getLambda1$intercom_sdk_base_release(), c0VarR, 3072, 7);
        }
        s5 s5VarT = c0VarR.T();
        if (s5VarT != null) {
            s5VarT.a(new Function2() { // from class: io.intercom.android.sdk.m5.components.w0
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    return ConversationItemKt.ReadConversationWithSimpleTicketHeaderPreview$lambda$7(i10, (androidx.compose.runtime.c0) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit ReadConversationWithSimpleTicketHeaderPreview$lambda$7(int i10, androidx.compose.runtime.c0 c0Var, int i11) {
        ReadConversationWithSimpleTicketHeaderPreview(c0Var, t4.a(i10 | 1));
        return Unit.f312394a;
    }

    @androidx.compose.runtime.o
    @IntercomPreviews
    @androidx.compose.runtime.t(applier = "androidx.compose.ui.UiComposable")
    public static final void UnreadConversationCardPreview(@Nullable androidx.compose.runtime.c0 c0Var, final int i10) {
        androidx.compose.runtime.c0 c0VarR = c0Var.R(-1292079862);
        if (i10 == 0 && c0VarR.d()) {
            c0VarR.u();
        } else {
            IntercomThemeKt.IntercomTheme(null, null, null, ComposableSingletons$ConversationItemKt.INSTANCE.m119getLambda3$intercom_sdk_base_release(), c0VarR, 3072, 7);
        }
        s5 s5VarT = c0VarR.T();
        if (s5VarT != null) {
            s5VarT.a(new Function2() { // from class: io.intercom.android.sdk.m5.components.v0
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    return ConversationItemKt.UnreadConversationCardPreview$lambda$9(i10, (androidx.compose.runtime.c0) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit UnreadConversationCardPreview$lambda$9(int i10, androidx.compose.runtime.c0 c0Var, int i11) {
        UnreadConversationCardPreview(c0Var, t4.a(i10 | 1));
        return Unit.f312394a;
    }

    @androidx.compose.runtime.o
    @IntercomPreviews
    @androidx.compose.runtime.t(applier = "androidx.compose.ui.UiComposable")
    public static final void UnreadConversationCardWithBotPreview(@Nullable androidx.compose.runtime.c0 c0Var, final int i10) {
        androidx.compose.runtime.c0 c0VarR = c0Var.R(-516742229);
        if (i10 == 0 && c0VarR.d()) {
            c0VarR.u();
        } else {
            IntercomThemeKt.IntercomTheme(null, null, null, ComposableSingletons$ConversationItemKt.INSTANCE.m120getLambda4$intercom_sdk_base_release(), c0VarR, 3072, 7);
        }
        s5 s5VarT = c0VarR.T();
        if (s5VarT != null) {
            s5VarT.a(new Function2() { // from class: io.intercom.android.sdk.m5.components.x0
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    return ConversationItemKt.UnreadConversationCardWithBotPreview$lambda$10(i10, (androidx.compose.runtime.c0) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit UnreadConversationCardWithBotPreview$lambda$10(int i10, androidx.compose.runtime.c0 c0Var, int i11) {
        UnreadConversationCardWithBotPreview(c0Var, t4.a(i10 | 1));
        return Unit.f312394a;
    }

    @androidx.compose.runtime.o
    @IntercomPreviews
    @androidx.compose.runtime.t(applier = "androidx.compose.ui.UiComposable")
    public static final void UnreadConversationWithSimpleTicketHeaderPreview(@Nullable androidx.compose.runtime.c0 c0Var, final int i10) {
        androidx.compose.runtime.c0 c0VarR = c0Var.R(1866912491);
        if (i10 == 0 && c0VarR.d()) {
            c0VarR.u();
        } else {
            IntercomThemeKt.IntercomTheme(null, null, null, ComposableSingletons$ConversationItemKt.INSTANCE.m118getLambda2$intercom_sdk_base_release(), c0VarR, 3072, 7);
        }
        s5 s5VarT = c0VarR.T();
        if (s5VarT != null) {
            s5VarT.a(new Function2() { // from class: io.intercom.android.sdk.m5.components.y0
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    return ConversationItemKt.UnreadConversationWithSimpleTicketHeaderPreview$lambda$8(i10, (androidx.compose.runtime.c0) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit UnreadConversationWithSimpleTicketHeaderPreview$lambda$8(int i10, androidx.compose.runtime.c0 c0Var, int i11) {
        UnreadConversationWithSimpleTicketHeaderPreview(c0Var, t4.a(i10 | 1));
        return Unit.f312394a;
    }

    @androidx.compose.runtime.o
    @androidx.compose.runtime.t(applier = "androidx.compose.ui.UiComposable")
    public static final void UnreadIndicator(@Nullable final androidx.compose.ui.a0 a0Var, @Nullable androidx.compose.runtime.c0 c0Var, final int i10, final int i11) {
        int i12;
        androidx.compose.runtime.c0 c0VarR = c0Var.R(481161991);
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
            androidx.compose.ui.a0 a0VarW = i6.w(a0Var, androidx.compose.ui.unit.h.r(16));
            androidx.compose.ui.layout.a1 a1VarK = androidx.compose.foundation.layout.x.k(androidx.compose.ui.e.f37317a.k(), false);
            int iHashCode = Long.hashCode(androidx.compose.runtime.v.l(c0VarR, 0));
            androidx.compose.runtime.b1 b1VarK = c0VarR.k();
            androidx.compose.ui.a0 a0VarN = androidx.compose.ui.m.n(c0VarR, a0VarW);
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
            y7.n(c0VarD, a1VarK, aVar.e());
            y7.n(c0VarD, b1VarK, aVar.g());
            Function2<androidx.compose.ui.node.g, Integer, Unit> function2B = aVar.b();
            if (c0VarD.P() || !Intrinsics.areEqual(c0VarD.i0(), Integer.valueOf(iHashCode))) {
                c0VarD.Y(Integer.valueOf(iHashCode));
                c0VarD.f(Integer.valueOf(iHashCode), function2B);
            }
            y7.n(c0VarD, a0VarN, aVar.f());
            androidx.compose.foundation.layout.d0 d0Var = androidx.compose.foundation.layout.d0.f15956a;
            androidx.compose.foundation.f1.e(i6.w(androidx.compose.ui.a0.E, androidx.compose.ui.unit.h.r(8)), new Function1() { // from class: io.intercom.android.sdk.m5.components.b1
                @Override // kotlin.jvm.functions.Function1
                public final Object invoke(Object obj) {
                    return ConversationItemKt.UnreadIndicator$lambda$5$lambda$4((androidx.compose.ui.graphics.drawscope.f) obj);
                }
            }, c0VarR, 54);
            c0VarR.o();
        }
        s5 s5VarT = c0VarR.T();
        if (s5VarT != null) {
            s5VarT.a(new Function2() { // from class: io.intercom.android.sdk.m5.components.c1
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    return ConversationItemKt.UnreadIndicator$lambda$6(a0Var, i10, i11, (androidx.compose.runtime.c0) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit UnreadIndicator$lambda$5$lambda$4(androidx.compose.ui.graphics.drawscope.f Canvas) {
        Intrinsics.checkNotNullParameter(Canvas, "$this$Canvas");
        long jD = androidx.compose.ui.graphics.s0.d(4292544041L);
        float fIntBitsToFloat = Float.intBitsToFloat((int) (Canvas.d() >> 32)) / 2.0f;
        float fIntBitsToFloat2 = Float.intBitsToFloat((int) (Canvas.d() & com.rabbitmq.client.k0.f265952a)) / 2.0f;
        androidx.compose.ui.graphics.drawscope.f.B4(Canvas, jD, 0.0f, n0.g.g((((long) Float.floatToRawIntBits(fIntBitsToFloat)) << 32) | (((long) Float.floatToRawIntBits(fIntBitsToFloat2)) & com.rabbitmq.client.k0.f265952a)), 0.0f, null, null, 0, 122, null);
        return Unit.f312394a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit UnreadIndicator$lambda$6(androidx.compose.ui.a0 a0Var, int i10, int i11, androidx.compose.runtime.c0 c0Var, int i12) {
        UnreadIndicator(a0Var, c0Var, t4.a(i10 | 1), i11);
        return Unit.f312394a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final List<AvatarWrapper> getActiveAdminsAvatars() {
        List<Participant> listTake = CollectionsKt.take(Injector.get().getDataLayer().getTeamPresence().getValue().getBuiltActiveAdmins(), 3);
        ArrayList arrayList = new ArrayList(CollectionsKt.collectionSizeOrDefault(listTake, 10));
        for (Participant participant : listTake) {
            Avatar avatar = participant.getAvatar();
            Intrinsics.checkNotNullExpressionValue(avatar, "getAvatar(...)");
            Boolean boolIsBot = participant.isBot();
            Intrinsics.checkNotNullExpressionValue(boolIsBot, "isBot(...)");
            arrayList.add(new AvatarWrapper(avatar, boolIsBot.booleanValue()));
        }
        return arrayList;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String getUserIntercomId() {
        if (Injector.isNotInitialised()) {
            return "";
        }
        String intercomId = Injector.get().getUserIdentity().getIntercomId();
        Intrinsics.checkNotNullExpressionValue(intercomId, "getIntercomId(...)");
        return intercomId;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String getWorkspaceName() {
        return Injector.get().getAppConfigProvider().get().getName();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Conversation sampleConversation(Ticket ticket, boolean z10) {
        LastParticipatingAdmin.Builder builderWithAvatar = new LastParticipatingAdmin.Builder().withFirstName("Santhosh Kumar").withAvatar(new Avatar.Builder().withInitials("SK"));
        Intrinsics.checkNotNullExpressionValue(builderWithAvatar, "withAvatar(...)");
        return new Conversation("123", z10, null, CollectionsKt.listOf(new Part.Builder().withSummary("This is the last message received/sent to/from this user").withCreatedAt(1659081886L)), null, builderWithAvatar, null, false, false, null, null, false, ticket, null, null, null, null, null, null, null, 1044436, null);
    }

    static /* synthetic */ Conversation sampleConversation$default(Ticket ticket, boolean z10, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            ticket = null;
        }
        if ((i10 & 2) != 0) {
            z10 = false;
        }
        return sampleConversation(ticket, z10);
    }

    private static final Conversation sampleConversationWithBot(Ticket ticket) {
        LastParticipatingAdmin.Builder builderWithIsBot = new LastParticipatingAdmin.Builder().withFirstName("Operator").withAvatar(new Avatar.Builder().withInitials("O")).withIsBot(Boolean.TRUE);
        Intrinsics.checkNotNullExpressionValue(builderWithIsBot, "withIsBot(...)");
        return new Conversation("123", false, null, CollectionsKt.listOf(new Part.Builder().withSummary("This is the last message received/sent to/from this user").withCreatedAt(1659081886L)), null, builderWithIsBot, null, false, false, null, null, false, ticket, null, null, null, null, null, null, null, 1044438, null);
    }

    static /* synthetic */ Conversation sampleConversationWithBot$default(Ticket ticket, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            ticket = null;
        }
        return sampleConversationWithBot(ticket);
    }
}
