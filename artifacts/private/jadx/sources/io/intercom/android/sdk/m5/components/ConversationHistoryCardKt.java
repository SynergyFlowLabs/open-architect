package io.intercom.android.sdk.m5.components;

import androidx.compose.foundation.layout.d5;
import androidx.compose.foundation.layout.i6;
import androidx.compose.runtime.s5;
import androidx.compose.runtime.t4;
import androidx.media3.exoplayer.a5;
import io.intercom.android.sdk.models.Conversation;
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
public final class ConversationHistoryCardKt {

    /* JADX INFO: renamed from: io.intercom.android.sdk.m5.components.ConversationHistoryCardKt$ConversationHistoryCard$2, reason: invalid class name */
    @SourceDebugExtension({"SMAP\nConversationHistoryCard.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ConversationHistoryCard.kt\nio/intercom/android/sdk/m5/components/ConversationHistoryCardKt$ConversationHistoryCard$2\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n+ 3 Dp.kt\nandroidx/compose/ui/unit/DpKt\n*L\n1#1,148:1\n1863#2:149\n1864#2:151\n113#3:150\n*S KotlinDebug\n*F\n+ 1 ConversationHistoryCard.kt\nio/intercom/android/sdk/m5/components/ConversationHistoryCardKt$ConversationHistoryCard$2\n*L\n28#1:149\n28#1:151\n33#1:150\n*E\n"})
    static final class AnonymousClass2 implements Function2<androidx.compose.runtime.c0, Integer, Unit> {
        final /* synthetic */ List<Conversation> $conversations;
        final /* synthetic */ Function1<Conversation, Unit> $onConversationClick;

        /* JADX WARN: Multi-variable type inference failed */
        AnonymousClass2(List<Conversation> list, Function1<? super Conversation, Unit> function1) {
            this.$conversations = list;
            this.$onConversationClick = function1;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final Unit invoke$lambda$1$lambda$0(Function1 function1, Conversation it) {
            Intrinsics.checkNotNullParameter(it, "$it");
            function1.invoke(it);
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
            List<Conversation> list = this.$conversations;
            final Function1<Conversation, Unit> function1 = this.$onConversationClick;
            for (final Conversation conversation : list) {
                ConversationItemKt.ConversationItem(conversation, i6.h(androidx.compose.ui.a0.E, 0.0f, 1, null), d5.g(androidx.compose.ui.unit.h.r(20), androidx.compose.ui.unit.h.r(8)), false, new Function0() { // from class: io.intercom.android.sdk.m5.components.u0
                    @Override // kotlin.jvm.functions.Function0
                    public final Object invoke() {
                        return ConversationHistoryCardKt.AnonymousClass2.invoke$lambda$1$lambda$0(function1, conversation);
                    }
                }, c0Var, 56, 8);
            }
        }
    }

    @androidx.compose.runtime.o
    @androidx.compose.runtime.t(applier = "androidx.compose.ui.UiComposable")
    public static final void ConversationHistoryCard(@Nullable androidx.compose.ui.a0 a0Var, @NotNull final String cardTitle, @NotNull final List<Conversation> conversations, @Nullable Function1<? super Conversation, Unit> function1, @Nullable androidx.compose.runtime.c0 c0Var, final int i10, final int i11) {
        Intrinsics.checkNotNullParameter(cardTitle, "cardTitle");
        Intrinsics.checkNotNullParameter(conversations, "conversations");
        androidx.compose.runtime.c0 c0VarR = c0Var.R(-1629591433);
        final androidx.compose.ui.a0 a0Var2 = (i11 & 1) != 0 ? androidx.compose.ui.a0.E : a0Var;
        Function1<? super Conversation, Unit> function2 = (i11 & 8) != 0 ? new Function1() { // from class: io.intercom.android.sdk.m5.components.q0
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return ConversationHistoryCardKt.ConversationHistoryCard$lambda$0((Conversation) obj);
            }
        } : function1;
        HomeCardScaffoldKt.HomeCardScaffold(a0Var2, cardTitle, androidx.compose.runtime.internal.w.e(1614953259, true, new AnonymousClass2(conversations, function2), c0VarR, 54), c0VarR, (i10 & 14) | a5.S0 | (i10 & com.planner5d.library.engine.input.f.b.B), 0);
        s5 s5VarT = c0VarR.T();
        if (s5VarT != null) {
            final Function1<? super Conversation, Unit> function3 = function2;
            s5VarT.a(new Function2() { // from class: io.intercom.android.sdk.m5.components.r0
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    return ConversationHistoryCardKt.ConversationHistoryCard$lambda$1(a0Var2, cardTitle, conversations, function3, i10, i11, (androidx.compose.runtime.c0) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit ConversationHistoryCard$lambda$0(Conversation it) {
        Intrinsics.checkNotNullParameter(it, "it");
        return Unit.f312394a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit ConversationHistoryCard$lambda$1(androidx.compose.ui.a0 a0Var, String cardTitle, List conversations, Function1 function1, int i10, int i11, androidx.compose.runtime.c0 c0Var, int i12) {
        Intrinsics.checkNotNullParameter(cardTitle, "$cardTitle");
        Intrinsics.checkNotNullParameter(conversations, "$conversations");
        ConversationHistoryCard(a0Var, cardTitle, conversations, function1, c0Var, t4.a(i10 | 1), i11);
        return Unit.f312394a;
    }

    @androidx.compose.runtime.o
    @IntercomPreviews
    @androidx.compose.runtime.t(applier = "androidx.compose.ui.UiComposable")
    private static final void RecentConversationsCardPreview(androidx.compose.runtime.c0 c0Var, final int i10) {
        androidx.compose.runtime.c0 c0VarR = c0Var.R(593700998);
        if (i10 == 0 && c0VarR.d()) {
            c0VarR.u();
        } else {
            IntercomThemeKt.IntercomTheme(null, null, null, ComposableSingletons$ConversationHistoryCardKt.INSTANCE.m116getLambda2$intercom_sdk_base_release(), c0VarR, 3072, 7);
        }
        s5 s5VarT = c0VarR.T();
        if (s5VarT != null) {
            s5VarT.a(new Function2() { // from class: io.intercom.android.sdk.m5.components.s0
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    return ConversationHistoryCardKt.RecentConversationsCardPreview$lambda$3(i10, (androidx.compose.runtime.c0) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit RecentConversationsCardPreview$lambda$3(int i10, androidx.compose.runtime.c0 c0Var, int i11) {
        RecentConversationsCardPreview(c0Var, t4.a(i10 | 1));
        return Unit.f312394a;
    }

    @androidx.compose.runtime.o
    @IntercomPreviews
    @androidx.compose.runtime.t(applier = "androidx.compose.ui.UiComposable")
    private static final void RecentConversationsCardWithSimpleTicketHeaderPreview(androidx.compose.runtime.c0 c0Var, final int i10) {
        androidx.compose.runtime.c0 c0VarR = c0Var.R(1823267221);
        if (i10 == 0 && c0VarR.d()) {
            c0VarR.u();
        } else {
            int i11 = 6 | 0;
            IntercomThemeKt.IntercomTheme(null, null, null, ComposableSingletons$ConversationHistoryCardKt.INSTANCE.m115getLambda1$intercom_sdk_base_release(), c0VarR, 3072, 7);
        }
        s5 s5VarT = c0VarR.T();
        if (s5VarT != null) {
            s5VarT.a(new Function2() { // from class: io.intercom.android.sdk.m5.components.t0
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    return ConversationHistoryCardKt.RecentConversationsCardWithSimpleTicketHeaderPreview$lambda$2(i10, (androidx.compose.runtime.c0) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit RecentConversationsCardWithSimpleTicketHeaderPreview$lambda$2(int i10, androidx.compose.runtime.c0 c0Var, int i11) {
        RecentConversationsCardWithSimpleTicketHeaderPreview(c0Var, t4.a(i10 | 1));
        return Unit.f312394a;
    }
}
