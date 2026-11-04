package io.intercom.android.sdk.post;

import android.content.Context;
import android.view.ViewGroup;
import androidx.compose.foundation.i1;
import androidx.compose.foundation.layout.x5;
import androidx.compose.material3.q50;
import androidx.compose.runtime.c0;
import androidx.compose.runtime.o;
import androidx.compose.runtime.t;
import androidx.compose.ui.a0;
import androidx.compose.ui.graphics.s0;
import androidx.media3.exoplayer.a5;
import io.intercom.android.sdk.R;
import io.intercom.android.sdk.activities.ConversationReactionListener;
import io.intercom.android.sdk.conversation.ReactionInputView;
import io.intercom.android.sdk.metrics.MetricTracker;
import io.intercom.android.sdk.models.Part;
import io.intercom.android.sdk.models.ReactionReply;
import io.intercom.android.sdk.ui.theme.IntercomTheme;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import pj.n;

/* JADX INFO: loaded from: classes13.dex */
final class PostActivityV2$onCreate$1$1$3$1$1 implements n<x5, c0, Integer, Unit> {
    final /* synthetic */ Part $part;
    final /* synthetic */ PostActivityV2 this$0;

    PostActivityV2$onCreate$1$1$3$1$1(Part part, PostActivityV2 postActivityV2) {
        this.$part = part;
        this.this$0 = postActivityV2;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final ReactionInputView invoke$lambda$1(Part part, PostActivityV2 this$0, Context it) {
        Intrinsics.checkNotNullParameter(part, "$part");
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        Intrinsics.checkNotNullParameter(it, "it");
        ReactionInputView reactionInputView = new ReactionInputView(it, null);
        reactionInputView.setLayoutParams(new ViewGroup.LayoutParams(-1, -2));
        reactionInputView.setUpReactions(part.getReactionReply(), true, new ConversationReactionListener(MetricTracker.ReactionLocation.IN_APP, part.getId(), this$0.getConversationId(), this$0.getInjector().getApi(), this$0.getInjector().getMetricTracker()));
        return reactionInputView;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit invoke$lambda$2(PostActivityV2 this$0) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        this$0.openConversation();
        return Unit.f312394a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit invoke$lambda$3(PostActivityV2 this$0) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        this$0.openConversation();
        return Unit.f312394a;
    }

    @Override // pj.n
    public /* bridge */ /* synthetic */ Unit invoke(x5 x5Var, c0 c0Var, Integer num) {
        invoke(x5Var, c0Var, num.intValue());
        return Unit.f312394a;
    }

    @o
    @t(applier = "androidx.compose.ui.UiComposable")
    public final void invoke(x5 BottomBarContent, c0 c0Var, int i10) {
        Intrinsics.checkNotNullParameter(BottomBarContent, "$this$BottomBarContent");
        if ((i10 & 81) == 16 && c0Var.d()) {
            c0Var.u();
            return;
        }
        if (!ReactionReply.isNull(this.$part.getReactionReply())) {
            c0Var.E(1850071740);
            final Part part = this.$part;
            final PostActivityV2 postActivityV2 = this.this$0;
            androidx.compose.ui.viewinterop.e.a(new Function1() { // from class: io.intercom.android.sdk.post.e
                @Override // kotlin.jvm.functions.Function1
                public final Object invoke(Object obj) {
                    return PostActivityV2$onCreate$1$1$3$1$1.invoke$lambda$1(part, postActivityV2, (Context) obj);
                }
            }, null, null, c0Var, 0, 6);
            c0Var.A();
            return;
        }
        if (!this.this$0.isComposerVisible()) {
            c0Var.E(1852828291);
            c0Var.A();
            return;
        }
        c0Var.E(1851864191);
        a0.a aVar = a0.E;
        final PostActivityV2 postActivityV3 = this.this$0;
        a0 a0VarJ = i1.j(aVar, false, null, null, null, new Function0() { // from class: io.intercom.android.sdk.post.f
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return PostActivityV2$onCreate$1$1$3$1$1.invoke$lambda$2(postActivityV3);
            }
        }, 15, null);
        String string = this.this$0.getString(R.string.intercom_reply_to_conversation);
        Intrinsics.checkNotNullExpressionValue(string, "getString(...)");
        IntercomTheme intercomTheme = IntercomTheme.INSTANCE;
        int i11 = IntercomTheme.$stable;
        q50.t(string, a0VarJ, s0.d(4288585374L), null, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, intercomTheme.getTypography(c0Var, i11).getType04(), c0Var, a5.S0, 0, 131064);
        final PostActivityV2 postActivityV4 = this.this$0;
        a0 a0VarJ2 = i1.j(aVar, false, null, null, null, new Function0() { // from class: io.intercom.android.sdk.post.g
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return PostActivityV2$onCreate$1$1$3$1$1.invoke$lambda$3(postActivityV4);
            }
        }, 15, null);
        String string2 = this.this$0.getString(R.string.intercom_send);
        Intrinsics.checkNotNullExpressionValue(string2, "getString(...)");
        q50.t(string2, a0VarJ2, s0.d(4288585374L), null, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, intercomTheme.getTypography(c0Var, i11).getType04(), c0Var, a5.S0, 0, 131064);
        c0Var.A();
    }
}
