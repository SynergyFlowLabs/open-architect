package io.intercom.android.sdk.m5.inbox.ui;

import androidx.compose.foundation.layout.d5;
import androidx.compose.foundation.layout.i6;
import androidx.compose.foundation.lazy.w0;
import androidx.compose.runtime.c0;
import androidx.compose.runtime.s5;
import androidx.compose.runtime.t4;
import androidx.compose.ui.a0;
import androidx.paging.x1;
import io.intercom.android.sdk.m5.components.ConversationItemKt;
import io.intercom.android.sdk.models.Avatar;
import io.intercom.android.sdk.models.Conversation;
import io.intercom.android.sdk.models.LastParticipatingAdmin;
import io.intercom.android.sdk.models.Part;
import io.intercom.android.sdk.ui.IntercomPreviews;
import io.intercom.android.sdk.ui.component.IntercomDividerKt;
import io.intercom.android.sdk.ui.theme.IntercomThemeKt;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlinx.coroutines.flow.b1;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes13.dex */
public final class InboxContentScreenItemsKt {

    /* JADX INFO: renamed from: io.intercom.android.sdk.m5.inbox.ui.InboxContentScreenItemsKt$inboxContentScreenItems$1, reason: invalid class name */
    @SourceDebugExtension({"SMAP\nInboxContentScreenItems.kt\nKotlin\n*S Kotlin\n*F\n+ 1 InboxContentScreenItems.kt\nio/intercom/android/sdk/m5/inbox/ui/InboxContentScreenItemsKt$inboxContentScreenItems$1\n+ 2 Dp.kt\nandroidx/compose/ui/unit/DpKt\n*L\n1#1,75:1\n113#2:76\n113#2:77\n*S KotlinDebug\n*F\n+ 1 InboxContentScreenItems.kt\nio/intercom/android/sdk/m5/inbox/ui/InboxContentScreenItemsKt$inboxContentScreenItems$1\n*L\n34#1:76\n37#1:77\n*E\n"})
    static final class AnonymousClass1 implements pj.o<androidx.compose.foundation.lazy.i, Integer, c0, Integer, Unit> {
        final /* synthetic */ androidx.paging.compose.b<Conversation> $inboxConversations;
        final /* synthetic */ Function1<Conversation, Unit> $onConversationClick;

        /* JADX WARN: Multi-variable type inference failed */
        AnonymousClass1(androidx.paging.compose.b<Conversation> bVar, Function1<? super Conversation, Unit> function1) {
            this.$inboxConversations = bVar;
            this.$onConversationClick = function1;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final Unit invoke$lambda$1$lambda$0(Function1 onConversationClick, Conversation conversation) {
            Intrinsics.checkNotNullParameter(onConversationClick, "$onConversationClick");
            Intrinsics.checkNotNullParameter(conversation, "$conversation");
            onConversationClick.invoke(conversation);
            return Unit.f312394a;
        }

        @Override // pj.o
        public /* bridge */ /* synthetic */ Unit invoke(androidx.compose.foundation.lazy.i iVar, Integer num, c0 c0Var, Integer num2) {
            invoke(iVar, num.intValue(), c0Var, num2.intValue());
            return Unit.f312394a;
        }

        @androidx.compose.runtime.o
        @androidx.compose.runtime.t(applier = "androidx.compose.ui.UiComposable")
        public final void invoke(androidx.compose.foundation.lazy.i items, int i10, c0 c0Var, int i11) {
            Intrinsics.checkNotNullParameter(items, "$this$items");
            if ((i11 & com.planner5d.library.engine.input.f.b.B) == 0) {
                i11 |= c0Var.K(i10) ? 32 : 16;
            }
            if ((i11 & 721) == 144 && c0Var.d()) {
                c0Var.u();
                return;
            }
            final Conversation conversationF = this.$inboxConversations.f(i10);
            if (conversationF == null) {
                return;
            }
            final Function1<Conversation, Unit> function1 = this.$onConversationClick;
            a0.a aVar = a0.E;
            float f10 = 16;
            ConversationItemKt.ConversationItem(conversationF, i6.h(aVar, 0.0f, 1, null), d5.f(androidx.compose.ui.unit.h.r(f10)), false, new Function0() { // from class: io.intercom.android.sdk.m5.inbox.ui.i
                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    return InboxContentScreenItemsKt.AnonymousClass1.invoke$lambda$1$lambda$0(function1, conversationF);
                }
            }, c0Var, 440, 8);
            IntercomDividerKt.IntercomDivider(d5.t(aVar, androidx.compose.ui.unit.h.r(f10), 0.0f, 2, null), c0Var, 6, 0);
        }
    }

    @androidx.compose.runtime.o
    @IntercomPreviews
    @androidx.compose.runtime.t(applier = "androidx.compose.ui.UiComposable")
    private static final void InboxContentScreenPreview(c0 c0Var, final int i10) {
        c0 c0VarR = c0Var.R(1634106166);
        if (i10 == 0 && c0VarR.d()) {
            c0VarR.u();
        } else {
            LastParticipatingAdmin.Builder builderWithAvatar = new LastParticipatingAdmin.Builder().withFirstName("Santhosh Kumar").withAvatar(new Avatar.Builder().withInitials("SK"));
            Intrinsics.checkNotNullExpressionValue(builderWithAvatar, "withAvatar(...)");
            InboxContentScreenPreview$DisplayPaging(b1.a(x1.f72696e.e(CollectionsKt.listOf(new Conversation("123", false, null, CollectionsKt.listOf(new Part.Builder().withSummary("This is the last message received/sent to/from this user").withCreatedAt(1659081886L)), null, builderWithAvatar, null, false, false, null, null, false, null, null, null, null, null, null, null, null, 1048534, null)))), c0VarR, 8);
        }
        s5 s5VarT = c0VarR.T();
        if (s5VarT != null) {
            s5VarT.a(new Function2() { // from class: io.intercom.android.sdk.m5.inbox.ui.f
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    return InboxContentScreenItemsKt.InboxContentScreenPreview$lambda$0(i10, (c0) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    @androidx.compose.runtime.o
    @androidx.compose.runtime.t(applier = "androidx.compose.ui.UiComposable")
    private static final void InboxContentScreenPreview$DisplayPaging(kotlinx.coroutines.flow.i<x1<Conversation>> iVar, c0 c0Var, int i10) {
        c0Var.E(1509694910);
        int i11 = 0 >> 7;
        IntercomThemeKt.IntercomTheme(null, null, null, androidx.compose.runtime.internal.w.e(853574228, true, new InboxContentScreenItemsKt$InboxContentScreenPreview$DisplayPaging$1(androidx.paging.compose.c.b(iVar, null, c0Var, 8, 1)), c0Var, 54), c0Var, 3072, 7);
        c0Var.A();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit InboxContentScreenPreview$lambda$0(int i10, c0 c0Var, int i11) {
        InboxContentScreenPreview(c0Var, t4.a(i10 | 1));
        return Unit.f312394a;
    }

    public static final void inboxContentScreenItems(@NotNull w0 w0Var, @NotNull androidx.paging.compose.b<Conversation> inboxConversations, @NotNull Function1<? super Conversation, Unit> onConversationClick) {
        Intrinsics.checkNotNullParameter(w0Var, "<this>");
        Intrinsics.checkNotNullParameter(inboxConversations, "inboxConversations");
        Intrinsics.checkNotNullParameter(onConversationClick, "onConversationClick");
        boolean z10 = false;
        w0.g(w0Var, inboxConversations.g(), null, null, androidx.compose.runtime.internal.w.c(-1371545107, true, new AnonymousClass1(inboxConversations, onConversationClick)), 6, null);
    }
}
