package io.intercom.android.sdk.m5.conversation.ui.components;

import android.content.Context;
import androidx.compose.foundation.layout.d5;
import androidx.compose.foundation.layout.g5;
import androidx.compose.foundation.layout.i6;
import androidx.compose.runtime.d7;
import androidx.compose.runtime.e6;
import androidx.compose.runtime.g4;
import androidx.compose.runtime.k3;
import androidx.compose.runtime.l3;
import androidx.compose.runtime.n3;
import androidx.compose.runtime.n7;
import androidx.compose.runtime.s5;
import androidx.compose.runtime.t4;
import androidx.compose.ui.platform.AndroidCompositionLocals_androidKt;
import androidx.media3.exoplayer.a5;
import io.intercom.android.sdk.R;
import io.intercom.android.sdk.blocks.lib.models.Block;
import io.intercom.android.sdk.blocks.lib.models.TicketType;
import io.intercom.android.sdk.m5.components.FooterNoticeKt;
import io.intercom.android.sdk.m5.components.PoweredByBadgeKt;
import io.intercom.android.sdk.m5.components.avatar.AvatarWrapper;
import io.intercom.android.sdk.m5.conversation.states.AttributeData;
import io.intercom.android.sdk.m5.conversation.states.ContentRow;
import io.intercom.android.sdk.m5.conversation.states.ConversationUiStateKt;
import io.intercom.android.sdk.m5.conversation.states.GroupingPosition;
import io.intercom.android.sdk.m5.conversation.states.PendingMessage;
import io.intercom.android.sdk.m5.conversation.states.ReplySuggestion;
import io.intercom.android.sdk.m5.conversation.ui.components.composer.MessageComposerKt;
import io.intercom.android.sdk.m5.conversation.ui.components.row.AskedAboutRowKt;
import io.intercom.android.sdk.m5.conversation.ui.components.row.BigTicketCardKt;
import io.intercom.android.sdk.m5.conversation.ui.components.row.BubbleMessageRowKt;
import io.intercom.android.sdk.m5.conversation.ui.components.row.DayDividerKt;
import io.intercom.android.sdk.m5.conversation.ui.components.row.EventRowKt;
import io.intercom.android.sdk.m5.conversation.ui.components.row.FailedMessage;
import io.intercom.android.sdk.m5.conversation.ui.components.row.FinAnswerRowKt;
import io.intercom.android.sdk.m5.conversation.ui.components.row.FinStreamingRowKt;
import io.intercom.android.sdk.m5.conversation.ui.components.row.MergedConversationRowKt;
import io.intercom.android.sdk.m5.conversation.ui.components.row.NewMessagesRowKt;
import io.intercom.android.sdk.m5.conversation.ui.components.row.NoteCardRowKt;
import io.intercom.android.sdk.m5.conversation.ui.components.row.PostCardRowKt;
import io.intercom.android.sdk.m5.conversation.ui.components.row.QuickRepliesKt;
import io.intercom.android.sdk.m5.conversation.ui.components.row.SpecialNoticeKt;
import io.intercom.android.sdk.m5.conversation.ui.components.row.TeamIntroKt;
import io.intercom.android.sdk.m5.conversation.ui.components.row.TicketStatusRowKt;
import io.intercom.android.sdk.m5.conversation.ui.components.row.TypingIndicatorKt;
import io.intercom.android.sdk.m5.conversation.utils.KeyboardState;
import io.intercom.android.sdk.m5.conversation.utils.KeyboardStateKt;
import io.intercom.android.sdk.models.InlineSource;
import io.intercom.android.sdk.models.Part;
import io.intercom.android.sdk.models.ReplyOption;
import io.intercom.android.sdk.models.Source;
import io.intercom.android.sdk.ui.IntercomPreviews;
import io.intercom.android.sdk.ui.common.IntercomArrangement;
import io.intercom.android.sdk.ui.theme.IntercomThemeKt;
import io.intercom.android.sdk.utilities.TimeFormatterExtKt;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import kotlin.ResultKt;
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
@SourceDebugExtension({"SMAP\nLazyMessageList.kt\nKotlin\n*S Kotlin\n*F\n+ 1 LazyMessageList.kt\nio/intercom/android/sdk/m5/conversation/ui/components/LazyMessageListKt\n+ 2 CompositionLocal.kt\nandroidx/compose/runtime/CompositionLocal\n+ 3 Composer.kt\nandroidx/compose/runtime/ComposerKt\n+ 4 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 5 Dp.kt\nandroidx/compose/ui/unit/DpKt\n+ 6 Dp.kt\nandroidx/compose/ui/unit/Dp\n+ 7 SnapshotState.kt\nandroidx/compose/runtime/SnapshotStateKt__SnapshotStateKt\n+ 8 SnapshotFloatState.kt\nandroidx/compose/runtime/PrimitiveSnapshotStateKt__SnapshotFloatStateKt\n+ 9 SnapshotIntState.kt\nandroidx/compose/runtime/SnapshotIntStateKt__SnapshotIntStateKt\n+ 10 LazyDsl.kt\nandroidx/compose/foundation/lazy/LazyDslKt\n*L\n1#1,497:1\n75#2:498\n75#2:505\n1282#3,6:499\n1282#3,6:507\n1282#3,6:513\n1282#3,6:519\n1282#3,6:525\n1282#3,6:531\n1282#3,6:537\n1#4:506\n113#5:543\n49#6:544\n85#7:545\n85#7:552\n117#7,2:553\n81#8:546\n114#8,2:547\n78#9:549\n111#9,2:550\n204#10,13:555\n*S KotlinDebug\n*F\n+ 1 LazyMessageList.kt\nio/intercom/android/sdk/m5/conversation/ui/components/LazyMessageListKt\n*L\n99#1:498\n105#1:505\n103#1:499,6\n110#1:507,6\n111#1:513,6\n116#1:519,6\n125#1:525,6\n134#1:531,6\n140#1:537,6\n163#1:543\n163#1:544\n102#1:545\n111#1:552\n111#1:553,2\n103#1:546\n103#1:547,2\n110#1:549\n110#1:550,2\n174#1:555,13\n*E\n"})
public final class LazyMessageListKt {

    /* JADX INFO: renamed from: io.intercom.android.sdk.m5.conversation.ui.components.LazyMessageListKt$LazyMessageList$14, reason: invalid class name */
    @kotlin.coroutines.jvm.internal.f(c = "io.intercom.android.sdk.m5.conversation.ui.components.LazyMessageListKt$LazyMessageList$14", f = "LazyMessageList.kt", i = {}, l = {155}, m = "invokeSuspend", n = {}, s = {})
    @SourceDebugExtension({"SMAP\nLazyMessageList.kt\nKotlin\n*S Kotlin\n*F\n+ 1 LazyMessageList.kt\nio/intercom/android/sdk/m5/conversation/ui/components/LazyMessageListKt$LazyMessageList$14\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,497:1\n1755#2,3:498\n*S KotlinDebug\n*F\n+ 1 LazyMessageList.kt\nio/intercom/android/sdk/m5/conversation/ui/components/LazyMessageListKt$LazyMessageList$14\n*L\n153#1:498,3\n*E\n"})
    static final class AnonymousClass14 extends kotlin.coroutines.jvm.internal.o implements Function2<kotlinx.coroutines.s0, kotlin.coroutines.d<? super Unit>, Object> {
        final /* synthetic */ List<ContentRow> $contentRows;
        final /* synthetic */ n3<Boolean> $isListAtTheBottom$delegate;
        final /* synthetic */ androidx.compose.foundation.lazy.j1 $lazyListState;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        AnonymousClass14(List<? extends ContentRow> list, androidx.compose.foundation.lazy.j1 j1Var, n3<Boolean> n3Var, kotlin.coroutines.d<? super AnonymousClass14> dVar) {
            super(2, dVar);
            this.$contentRows = list;
            this.$lazyListState = j1Var;
            this.$isListAtTheBottom$delegate = n3Var;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final kotlin.coroutines.d<Unit> create(Object obj, kotlin.coroutines.d<?> dVar) {
            return new AnonymousClass14(this.$contentRows, this.$lazyListState, this.$isListAtTheBottom$delegate, dVar);
        }

        /* JADX WARN: Code duplicated, block: B:27:0x0077 A[RETURN] */
        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            androidx.compose.foundation.lazy.j1 j1Var;
            Object objL = kotlin.coroutines.intrinsics.b.l();
            int i10 = this.label;
            boolean z10 = !true;
            if (i10 == 0) {
                ResultKt.m(obj);
                if (LazyMessageListKt.LazyMessageList$lambda$18(this.$isListAtTheBottom$delegate)) {
                    j1Var = this.$lazyListState;
                    this.label = 1;
                    if (androidx.compose.foundation.lazy.j1.x(j1Var, Integer.MAX_VALUE, 0, this, 2, null) == objL) {
                        return objL;
                    }
                } else {
                    List<ContentRow> list = this.$contentRows;
                    if (!(list instanceof Collection) || !list.isEmpty()) {
                        Iterator<T> it = list.iterator();
                        while (true) {
                            if (it.hasNext()) {
                                ContentRow contentRow = (ContentRow) it.next();
                                ContentRow.BubbleMessageRow bubbleMessageRow = contentRow instanceof ContentRow.BubbleMessageRow ? (ContentRow.BubbleMessageRow) contentRow : null;
                                if (bubbleMessageRow != null && bubbleMessageRow.isPending()) {
                                    break;
                                }
                            }
                        }
                        j1Var = this.$lazyListState;
                        this.label = 1;
                        if (androidx.compose.foundation.lazy.j1.x(j1Var, Integer.MAX_VALUE, 0, this, 2, null) == objL) {
                            return objL;
                        }
                    }
                }
            } else {
                if (i10 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.m(obj);
            }
            return Unit.f312394a;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(kotlinx.coroutines.s0 s0Var, kotlin.coroutines.d<? super Unit> dVar) {
            return ((AnonymousClass14) create(s0Var, dVar)).invokeSuspend(Unit.f312394a);
        }
    }

    /* JADX WARN: Code duplicated, block: B:101:0x021c A[PHI: r33
      0x021c: PHI (r33v8 androidx.compose.foundation.lazy.j1) = (r33v2 androidx.compose.foundation.lazy.j1), (r33v9 androidx.compose.foundation.lazy.j1) binds: [B:100:0x021a, B:98:0x0213] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:102:0x021e  */
    /* JADX WARN: Code duplicated, block: B:105:0x0226  */
    /* JADX WARN: Code duplicated, block: B:109:0x0234  */
    /* JADX WARN: Code duplicated, block: B:112:0x026d  */
    /* JADX WARN: Code duplicated, block: B:114:0x0273  */
    /* JADX WARN: Code duplicated, block: B:120:0x0280  */
    /* JADX WARN: Code duplicated, block: B:122:0x0286  */
    /* JADX WARN: Code duplicated, block: B:125:0x02a6  */
    /* JADX WARN: Code duplicated, block: B:127:0x02ac  */
    /* JADX WARN: Code duplicated, block: B:133:0x02b9  */
    /* JADX WARN: Code duplicated, block: B:137:0x02c2  */
    /* JADX WARN: Code duplicated, block: B:140:0x02ec  */
    /* JADX WARN: Code duplicated, block: B:141:0x02f1  */
    /* JADX WARN: Code duplicated, block: B:144:0x0321  */
    /* JADX WARN: Code duplicated, block: B:151:0x0333  */
    /* JADX WARN: Code duplicated, block: B:154:0x03a8  */
    /* JADX WARN: Code duplicated, block: B:156:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:92:0x01cf  */
    /* JADX WARN: Code duplicated, block: B:99:0x0216  */
    @androidx.compose.runtime.o
    @androidx.compose.runtime.t(applier = "androidx.compose.ui.UiComposable")
    public static final void LazyMessageList(@Nullable androidx.compose.ui.a0 a0Var, @NotNull final List<? extends ContentRow> contentRows, @Nullable androidx.compose.foundation.lazy.j1 j1Var, @Nullable Function1<? super ReplySuggestion, Unit> function1, @Nullable Function1<? super ReplyOption, Unit> function2, @Nullable Function1<? super Part, Unit> function3, @Nullable Function1<? super PendingMessage.FailedImageUploadData, Unit> function4, @Nullable Function1<? super AttributeData, Unit> function5, @Nullable Function0<Unit> function0, @Nullable Function1<? super TicketType, Unit> function6, boolean z10, @Nullable Function1<? super String, Unit> function7, boolean z11, @Nullable Function2<? super List<InlineSource>, ? super List<Source>, Unit> function8, boolean z12, @Nullable Function0<Unit> function9, @Nullable androidx.compose.runtime.c0 c0Var, final int i10, final int i11, final int i12) {
        androidx.compose.foundation.lazy.j1 j1VarF;
        int i13;
        int i14;
        float fS7;
        androidx.compose.foundation.lazy.j1 j1Var2;
        boolean z13;
        boolean z14;
        Object objI0;
        androidx.compose.foundation.lazy.j1 j1Var3;
        androidx.compose.foundation.lazy.j1 j1Var4;
        boolean z15;
        boolean z16;
        Object objI1;
        androidx.compose.foundation.lazy.j1 j1Var5;
        n3 n3Var;
        boolean z17;
        Object objI2;
        boolean z18;
        Object objI3;
        kotlin.coroutines.d dVar;
        float fR;
        ContentRow contentRow;
        androidx.compose.foundation.layout.q.m mVarItemAtBottom;
        final Function1<? super String, Unit> function10;
        final Function1<? super AttributeData, Unit> function11;
        final Function0<Unit> function12;
        final Function1<? super TicketType, Unit> function13;
        final Function2<? super List<InlineSource>, ? super List<Source>, Unit> function14;
        final Function0<Unit> function15;
        final Function1<? super PendingMessage.FailedImageUploadData, Unit> function16;
        final androidx.compose.ui.a0 a0Var2;
        final androidx.compose.foundation.lazy.j1 j1Var6;
        s5 s5VarT;
        Intrinsics.checkNotNullParameter(contentRows, "contentRows");
        androidx.compose.runtime.c0 c0VarR = c0Var.R(-906198490);
        androidx.compose.ui.a0 a0Var3 = (i12 & 1) != 0 ? androidx.compose.ui.a0.E : a0Var;
        if ((i12 & 4) != 0) {
            j1VarF = androidx.compose.foundation.lazy.o1.f(0, 0, c0VarR, 0, 3);
            i13 = i10 & (-897);
        } else {
            j1VarF = j1Var;
            i13 = i10;
        }
        Function1<? super ReplySuggestion, Unit> function17 = (i12 & 8) != 0 ? new Function1() { // from class: io.intercom.android.sdk.m5.conversation.ui.components.n0
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return LazyMessageListKt.LazyMessageList$lambda$0((ReplySuggestion) obj);
            }
        } : function1;
        Function1<? super ReplyOption, Unit> function18 = (i12 & 16) != 0 ? new Function1() { // from class: io.intercom.android.sdk.m5.conversation.ui.components.s0
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return LazyMessageListKt.LazyMessageList$lambda$1((ReplyOption) obj);
            }
        } : function2;
        final Function1<? super Part, Unit> function19 = (i12 & 32) != 0 ? new Function1() { // from class: io.intercom.android.sdk.m5.conversation.ui.components.t0
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return LazyMessageListKt.LazyMessageList$lambda$2((Part) obj);
            }
        } : function3;
        Function1<? super PendingMessage.FailedImageUploadData, Unit> function20 = (i12 & 64) != 0 ? new Function1() { // from class: io.intercom.android.sdk.m5.conversation.ui.components.u0
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return LazyMessageListKt.LazyMessageList$lambda$3((PendingMessage.FailedImageUploadData) obj);
            }
        } : function4;
        Function1<? super AttributeData, Unit> function21 = (i12 & 128) != 0 ? new Function1() { // from class: io.intercom.android.sdk.m5.conversation.ui.components.v0
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return LazyMessageListKt.LazyMessageList$lambda$4((AttributeData) obj);
            }
        } : function5;
        Function0<Unit> function22 = (i12 & 256) != 0 ? new Function0() { // from class: io.intercom.android.sdk.m5.conversation.ui.components.w0
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return Unit.f312394a;
            }
        } : function0;
        Function1<? super TicketType, Unit> function23 = (i12 & 512) != 0 ? new Function1() { // from class: io.intercom.android.sdk.m5.conversation.ui.components.x0
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return LazyMessageListKt.LazyMessageList$lambda$6((TicketType) obj);
            }
        } : function6;
        boolean z19 = (i12 & 1024) != 0 ? false : z10;
        Function1<? super String, Unit> function24 = (i12 & 2048) != 0 ? new Function1() { // from class: io.intercom.android.sdk.m5.conversation.ui.components.y0
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return LazyMessageListKt.LazyMessageList$lambda$7((String) obj);
            }
        } : function7;
        boolean z20 = (i12 & 4096) != 0 ? false : z11;
        Function2<? super List<InlineSource>, ? super List<Source>, Unit> function25 = (i12 & 8192) != 0 ? null : function8;
        boolean z21 = (i12 & 16384) != 0 ? true : z12;
        Function0<Unit> function26 = (i12 & 32768) != 0 ? new Function0() { // from class: io.intercom.android.sdk.m5.conversation.ui.components.z0
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return Unit.f312394a;
            }
        } : function9;
        final Context context = (Context) c0VarR.W(AndroidCompositionLocals_androidKt.g());
        final boolean z22 = z21;
        n7<KeyboardState> n7VarKeyboardAsState = KeyboardStateKt.keyboardAsState(c0VarR, 0);
        c0VarR.E(-1167327746);
        Object objI4 = c0VarR.i0();
        androidx.compose.runtime.c0.a aVar = androidx.compose.runtime.c0.f35327a;
        final Function1<? super ReplySuggestion, Unit> function27 = function17;
        if (objI4 == aVar.a()) {
            objI4 = g4.b(0.0f);
            c0VarR.Y(objI4);
        }
        k3 k3Var = (k3) objI4;
        c0VarR.A();
        c0VarR.E(-1167325507);
        if (z20) {
            i14 = 0;
            fS7 = ((androidx.compose.ui.unit.d) c0VarR.W(androidx.compose.ui.platform.q1.m())).S7(PoweredByBadgeKt.getPoweredByBadgeHeight(c0VarR, 0));
        } else {
            i14 = 0;
            fS7 = 0.0f;
        }
        c0VarR.A();
        c0VarR.E(-1167320293);
        Object objI5 = c0VarR.i0();
        int i15 = i14;
        if (objI5 == aVar.a()) {
            objI5 = e6.b(i15);
            c0VarR.Y(objI5);
        }
        final l3 l3Var = (l3) objI5;
        c0VarR.A();
        c0VarR.E(-1167318276);
        Object objI6 = c0VarR.i0();
        final Function1<? super ReplyOption, Unit> function28 = function18;
        if (objI6 == aVar.a()) {
            objI6 = d7.g(Boolean.FALSE, null, 2, null);
            c0VarR.Y(objI6);
        }
        n3 n3Var2 = (n3) objI6;
        c0VarR.A();
        Boolean boolValueOf = Boolean.valueOf(LazyMessageList$lambda$9(n7VarKeyboardAsState).isVisible());
        Boolean boolValueOf2 = Boolean.valueOf(LazyMessageList$lambda$9(n7VarKeyboardAsState).isAnimating());
        c0VarR.E(-1167313666);
        boolean zD = c0VarR.D(n7VarKeyboardAsState) | c0VarR.I(fS7);
        float f10 = fS7;
        int i16 = (i10 & 896) ^ a5.S0;
        if (i16 <= 256 || !c0VarR.D(j1VarF)) {
            j1Var2 = j1VarF;
            if ((i10 & a5.S0) != 256) {
                z13 = false;
            }
            z14 = z13 | zD;
            objI0 = c0VarR.i0();
            if (!z14 || objI0 == aVar.a()) {
                androidx.compose.foundation.lazy.j1 j1Var7 = j1Var2;
                objI0 = new LazyMessageListKt$LazyMessageList$10$1(f10, j1Var7, n7VarKeyboardAsState, k3Var, null);
                j1Var3 = j1Var7;
                c0VarR.Y(objI0);
            } else {
                j1Var3 = j1Var2;
            }
            c0VarR.A();
            androidx.compose.runtime.b2.h(boolValueOf, boolValueOf2, (Function2) objI0, c0VarR, 512);
            Boolean boolValueOf3 = Boolean.valueOf(LazyMessageList$lambda$9(n7VarKeyboardAsState).isDismissed());
            c0VarR.E(-1167300817);
            boolean zD2 = c0VarR.D(n7VarKeyboardAsState);
            if (i16 > 256 || !c0VarR.D(j1Var3)) {
                j1Var4 = j1Var3;
                if ((i10 & a5.S0) != 256) {
                    z15 = false;
                }
                z16 = z15 | zD2;
                objI1 = c0VarR.i0();
                if (!z16 || objI1 == aVar.a()) {
                    androidx.compose.foundation.lazy.j1 j1Var8 = j1Var4;
                    objI1 = new LazyMessageListKt$LazyMessageList$11$1(j1Var8, n7VarKeyboardAsState, n3Var2, k3Var, null);
                    j1Var5 = j1Var8;
                    n3Var = n3Var2;
                    c0VarR.Y(objI1);
                } else {
                    j1Var5 = j1Var4;
                    n3Var = n3Var2;
                }
                c0VarR.A();
                androidx.compose.runtime.b2.i(boolValueOf3, (Function2) objI1, c0VarR, 64);
                c0VarR.E(-1167292902);
                z17 = (i16 <= 256 && c0VarR.D(j1Var5)) || (i10 & a5.S0) == 256;
                objI2 = c0VarR.i0();
                if (z17 || objI2 == aVar.a()) {
                    objI2 = new LazyMessageListKt$LazyMessageList$12$1(j1Var5, l3Var, null);
                    c0VarR.Y(objI2);
                }
                c0VarR.A();
                int i17 = ((i13 >> 6) & 14) | 64;
                androidx.compose.runtime.b2.i(j1Var5, (Function2) objI2, c0VarR, i17);
                c0VarR.E(-1167286604);
                z18 = (i16 <= 256 && c0VarR.D(j1Var5)) || (i10 & a5.S0) == 256;
                objI3 = c0VarR.i0();
                if (!z18 || objI3 == aVar.a()) {
                    dVar = null;
                    objI3 = new LazyMessageListKt$LazyMessageList$13$1(j1Var5, n3Var, null);
                    c0VarR.Y(objI3);
                } else {
                    dVar = null;
                }
                c0VarR.A();
                androidx.compose.runtime.b2.i(j1Var5, (Function2) objI3, c0VarR, i17);
                androidx.compose.runtime.b2.i(contentRows, new AnonymousClass14(contentRows, j1Var5, n3Var, dVar), c0VarR, 72);
                androidx.compose.ui.a0 a0VarF = i6.f(a0Var3, 0.0f, 1, dVar);
                float fR2 = androidx.compose.ui.unit.h.r(16);
                if (z19) {
                    fR = MessageComposerKt.getComposerHalfSize();
                } else {
                    fR = androidx.compose.ui.unit.h.r(0);
                }
                g5 g5VarJ = d5.j(0.0f, 0.0f, 0.0f, androidx.compose.ui.unit.h.r(fR2 + fR), 7, null);
                contentRow = (ContentRow) CollectionsKt.lastOrNull((List) contentRows);
                if (!(contentRow instanceof ContentRow.FooterNoticeRow) || (contentRow instanceof ContentRow.ComposerSuggestionRow) || (contentRow instanceof ContentRow.QuickRepliesRow)) {
                    mVarItemAtBottom = IntercomArrangement.INSTANCE.itemAtBottom(CollectionsKt.getLastIndex(contentRows));
                } else {
                    mVarItemAtBottom = androidx.compose.foundation.layout.q.f16330a.y();
                }
                androidx.compose.foundation.layout.q.m mVar = mVarItemAtBottom;
                function10 = function24;
                final n3 n3Var3 = n3Var;
                function11 = function21;
                function12 = function22;
                function13 = function23;
                function14 = function25;
                function15 = function26;
                function16 = function20;
                a0Var2 = a0Var3;
                j1Var6 = j1Var5;
                androidx.compose.foundation.lazy.h.h(a0VarF, j1Var6, g5VarJ, false, mVar, androidx.compose.ui.e.f37317a.m(), null, false, null, new Function1() { // from class: io.intercom.android.sdk.m5.conversation.ui.components.o0
                    @Override // kotlin.jvm.functions.Function1
                    public final Object invoke(Object obj) {
                        return LazyMessageListKt.LazyMessageList$lambda$27(contentRows, function12, function27, function28, z22, function15, j1Var6, function10, function11, function16, function13, context, function14, n3Var3, l3Var, function19, (androidx.compose.foundation.lazy.w0) obj);
                    }
                }, c0VarR, ((i13 >> 3) & com.planner5d.library.engine.input.f.b.B) | 199680, 448);
                s5VarT = c0VarR.T();
                if (s5VarT != null) {
                    final Function1<? super Part, Unit> function29 = function19;
                    final boolean z23 = z19;
                    final boolean z24 = z20;
                    s5VarT.a(new Function2() { // from class: io.intercom.android.sdk.m5.conversation.ui.components.r0
                        @Override // kotlin.jvm.functions.Function2
                        public final Object invoke(Object obj, Object obj2) {
                            return LazyMessageListKt.LazyMessageList$lambda$28(a0Var2, contentRows, j1Var6, function27, function28, function29, function16, function11, function12, function13, z23, function10, z24, function14, z22, function15, i10, i11, i12, (androidx.compose.runtime.c0) obj, ((Integer) obj2).intValue());
                        }
                    });
                }
            }
            j1Var4 = j1Var3;
            z15 = true;
            z16 = z15 | zD2;
            objI1 = c0VarR.i0();
            if (z16) {
                androidx.compose.foundation.lazy.j1 j1Var9 = j1Var4;
                objI1 = new LazyMessageListKt$LazyMessageList$11$1(j1Var9, n7VarKeyboardAsState, n3Var2, k3Var, null);
                j1Var5 = j1Var9;
                n3Var = n3Var2;
                c0VarR.Y(objI1);
            } else {
                androidx.compose.foundation.lazy.j1 j1Var10 = j1Var4;
                objI1 = new LazyMessageListKt$LazyMessageList$11$1(j1Var10, n7VarKeyboardAsState, n3Var2, k3Var, null);
                j1Var5 = j1Var10;
                n3Var = n3Var2;
                c0VarR.Y(objI1);
            }
            c0VarR.A();
            androidx.compose.runtime.b2.i(boolValueOf3, (Function2) objI1, c0VarR, 64);
            c0VarR.E(-1167292902);
            if (i16 <= 256) {
            }
            objI2 = c0VarR.i0();
            if (z17) {
                objI2 = new LazyMessageListKt$LazyMessageList$12$1(j1Var5, l3Var, null);
                c0VarR.Y(objI2);
            } else {
                objI2 = new LazyMessageListKt$LazyMessageList$12$1(j1Var5, l3Var, null);
                c0VarR.Y(objI2);
            }
            c0VarR.A();
            int i18 = ((i13 >> 6) & 14) | 64;
            androidx.compose.runtime.b2.i(j1Var5, (Function2) objI2, c0VarR, i18);
            c0VarR.E(-1167286604);
            if (i16 <= 256) {
            }
            objI3 = c0VarR.i0();
            if (z18) {
                dVar = null;
                objI3 = new LazyMessageListKt$LazyMessageList$13$1(j1Var5, n3Var, null);
                c0VarR.Y(objI3);
            } else {
                dVar = null;
                objI3 = new LazyMessageListKt$LazyMessageList$13$1(j1Var5, n3Var, null);
                c0VarR.Y(objI3);
            }
            c0VarR.A();
            androidx.compose.runtime.b2.i(j1Var5, (Function2) objI3, c0VarR, i18);
            androidx.compose.runtime.b2.i(contentRows, new AnonymousClass14(contentRows, j1Var5, n3Var, dVar), c0VarR, 72);
            androidx.compose.ui.a0 a0VarF2 = i6.f(a0Var3, 0.0f, 1, dVar);
            float fR3 = androidx.compose.ui.unit.h.r(16);
            if (z19) {
                fR = MessageComposerKt.getComposerHalfSize();
            } else {
                fR = androidx.compose.ui.unit.h.r(0);
            }
            g5 g5VarJ2 = d5.j(0.0f, 0.0f, 0.0f, androidx.compose.ui.unit.h.r(fR3 + fR), 7, null);
            contentRow = (ContentRow) CollectionsKt.lastOrNull((List) contentRows);
            if (contentRow instanceof ContentRow.FooterNoticeRow) {
                mVarItemAtBottom = IntercomArrangement.INSTANCE.itemAtBottom(CollectionsKt.getLastIndex(contentRows));
            } else {
                mVarItemAtBottom = IntercomArrangement.INSTANCE.itemAtBottom(CollectionsKt.getLastIndex(contentRows));
            }
            androidx.compose.foundation.layout.q.m mVar2 = mVarItemAtBottom;
            function10 = function24;
            final n3 n3Var4 = n3Var;
            function11 = function21;
            function12 = function22;
            function13 = function23;
            function14 = function25;
            function15 = function26;
            function16 = function20;
            a0Var2 = a0Var3;
            j1Var6 = j1Var5;
            androidx.compose.foundation.lazy.h.h(a0VarF2, j1Var6, g5VarJ2, false, mVar2, androidx.compose.ui.e.f37317a.m(), null, false, null, new Function1() { // from class: io.intercom.android.sdk.m5.conversation.ui.components.o0
                @Override // kotlin.jvm.functions.Function1
                public final Object invoke(Object obj) {
                    return LazyMessageListKt.LazyMessageList$lambda$27(contentRows, function12, function27, function28, z22, function15, j1Var6, function10, function11, function16, function13, context, function14, n3Var4, l3Var, function19, (androidx.compose.foundation.lazy.w0) obj);
                }
            }, c0VarR, ((i13 >> 3) & com.planner5d.library.engine.input.f.b.B) | 199680, 448);
            s5VarT = c0VarR.T();
            if (s5VarT != null) {
                final Function1 function210 = function19;
                final boolean z25 = z19;
                final boolean z26 = z20;
                s5VarT.a(new Function2() { // from class: io.intercom.android.sdk.m5.conversation.ui.components.r0
                    @Override // kotlin.jvm.functions.Function2
                    public final Object invoke(Object obj, Object obj2) {
                        return LazyMessageListKt.LazyMessageList$lambda$28(a0Var2, contentRows, j1Var6, function27, function28, function210, function16, function11, function12, function13, z25, function10, z26, function14, z22, function15, i10, i11, i12, (androidx.compose.runtime.c0) obj, ((Integer) obj2).intValue());
                    }
                });
            }
        }
        j1Var2 = j1VarF;
        z13 = true;
        z14 = z13 | zD;
        objI0 = c0VarR.i0();
        if (z14) {
            androidx.compose.foundation.lazy.j1 j1Var11 = j1Var2;
            objI0 = new LazyMessageListKt$LazyMessageList$10$1(f10, j1Var11, n7VarKeyboardAsState, k3Var, null);
            j1Var3 = j1Var11;
            c0VarR.Y(objI0);
        } else {
            androidx.compose.foundation.lazy.j1 j1Var12 = j1Var2;
            objI0 = new LazyMessageListKt$LazyMessageList$10$1(f10, j1Var12, n7VarKeyboardAsState, k3Var, null);
            j1Var3 = j1Var12;
            c0VarR.Y(objI0);
        }
        c0VarR.A();
        androidx.compose.runtime.b2.h(boolValueOf, boolValueOf2, (Function2) objI0, c0VarR, 512);
        Boolean boolValueOf4 = Boolean.valueOf(LazyMessageList$lambda$9(n7VarKeyboardAsState).isDismissed());
        c0VarR.E(-1167300817);
        boolean zD3 = c0VarR.D(n7VarKeyboardAsState);
        if (i16 > 256) {
            j1Var4 = j1Var3;
            if ((i10 & a5.S0) != 256) {
                z15 = true;
            } else {
                z15 = false;
            }
        } else {
            j1Var4 = j1Var3;
            if ((i10 & a5.S0) != 256) {
                z15 = true;
            } else {
                z15 = false;
            }
        }
        z16 = z15 | zD3;
        objI1 = c0VarR.i0();
        if (z16) {
            androidx.compose.foundation.lazy.j1 j1Var13 = j1Var4;
            objI1 = new LazyMessageListKt$LazyMessageList$11$1(j1Var13, n7VarKeyboardAsState, n3Var2, k3Var, null);
            j1Var5 = j1Var13;
            n3Var = n3Var2;
            c0VarR.Y(objI1);
        } else {
            androidx.compose.foundation.lazy.j1 j1Var14 = j1Var4;
            objI1 = new LazyMessageListKt$LazyMessageList$11$1(j1Var14, n7VarKeyboardAsState, n3Var2, k3Var, null);
            j1Var5 = j1Var14;
            n3Var = n3Var2;
            c0VarR.Y(objI1);
        }
        c0VarR.A();
        androidx.compose.runtime.b2.i(boolValueOf4, (Function2) objI1, c0VarR, 64);
        c0VarR.E(-1167292902);
        if (i16 <= 256) {
        }
        objI2 = c0VarR.i0();
        if (z17) {
            objI2 = new LazyMessageListKt$LazyMessageList$12$1(j1Var5, l3Var, null);
            c0VarR.Y(objI2);
        } else {
            objI2 = new LazyMessageListKt$LazyMessageList$12$1(j1Var5, l3Var, null);
            c0VarR.Y(objI2);
        }
        c0VarR.A();
        int i19 = ((i13 >> 6) & 14) | 64;
        androidx.compose.runtime.b2.i(j1Var5, (Function2) objI2, c0VarR, i19);
        c0VarR.E(-1167286604);
        if (i16 <= 256) {
        }
        objI3 = c0VarR.i0();
        if (z18) {
            dVar = null;
            objI3 = new LazyMessageListKt$LazyMessageList$13$1(j1Var5, n3Var, null);
            c0VarR.Y(objI3);
        } else {
            dVar = null;
            objI3 = new LazyMessageListKt$LazyMessageList$13$1(j1Var5, n3Var, null);
            c0VarR.Y(objI3);
        }
        c0VarR.A();
        androidx.compose.runtime.b2.i(j1Var5, (Function2) objI3, c0VarR, i19);
        androidx.compose.runtime.b2.i(contentRows, new AnonymousClass14(contentRows, j1Var5, n3Var, dVar), c0VarR, 72);
        androidx.compose.ui.a0 a0VarF3 = i6.f(a0Var3, 0.0f, 1, dVar);
        float fR4 = androidx.compose.ui.unit.h.r(16);
        if (z19) {
            fR = MessageComposerKt.getComposerHalfSize();
        } else {
            fR = androidx.compose.ui.unit.h.r(0);
        }
        g5 g5VarJ3 = d5.j(0.0f, 0.0f, 0.0f, androidx.compose.ui.unit.h.r(fR4 + fR), 7, null);
        contentRow = (ContentRow) CollectionsKt.lastOrNull((List) contentRows);
        if (contentRow instanceof ContentRow.FooterNoticeRow) {
            mVarItemAtBottom = IntercomArrangement.INSTANCE.itemAtBottom(CollectionsKt.getLastIndex(contentRows));
        } else {
            mVarItemAtBottom = IntercomArrangement.INSTANCE.itemAtBottom(CollectionsKt.getLastIndex(contentRows));
        }
        androidx.compose.foundation.layout.q.m mVar3 = mVarItemAtBottom;
        function10 = function24;
        final n3 n3Var5 = n3Var;
        function11 = function21;
        function12 = function22;
        function13 = function23;
        function14 = function25;
        function15 = function26;
        function16 = function20;
        a0Var2 = a0Var3;
        j1Var6 = j1Var5;
        androidx.compose.foundation.lazy.h.h(a0VarF3, j1Var6, g5VarJ3, false, mVar3, androidx.compose.ui.e.f37317a.m(), null, false, null, new Function1() { // from class: io.intercom.android.sdk.m5.conversation.ui.components.o0
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return LazyMessageListKt.LazyMessageList$lambda$27(contentRows, function12, function27, function28, z22, function15, j1Var6, function10, function11, function16, function13, context, function14, n3Var5, l3Var, function19, (androidx.compose.foundation.lazy.w0) obj);
            }
        }, c0VarR, ((i13 >> 3) & com.planner5d.library.engine.input.f.b.B) | 199680, 448);
        s5VarT = c0VarR.T();
        if (s5VarT != null) {
            final Function1 function211 = function19;
            final boolean z27 = z19;
            final boolean z28 = z20;
            s5VarT.a(new Function2() { // from class: io.intercom.android.sdk.m5.conversation.ui.components.r0
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    return LazyMessageListKt.LazyMessageList$lambda$28(a0Var2, contentRows, j1Var6, function27, function28, function211, function16, function11, function12, function13, z27, function10, z28, function14, z22, function15, i10, i11, i12, (androidx.compose.runtime.c0) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit LazyMessageList$lambda$0(ReplySuggestion it) {
        Intrinsics.checkNotNullParameter(it, "it");
        return Unit.f312394a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit LazyMessageList$lambda$1(ReplyOption it) {
        Intrinsics.checkNotNullParameter(it, "it");
        return Unit.f312394a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean LazyMessageList$lambda$18(n3<Boolean> n3Var) {
        return n3Var.getValue().booleanValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void LazyMessageList$lambda$19(n3<Boolean> n3Var, boolean z10) {
        n3Var.setValue(Boolean.valueOf(z10));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit LazyMessageList$lambda$2(Part it) {
        Intrinsics.checkNotNullParameter(it, "it");
        return Unit.f312394a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit LazyMessageList$lambda$27(final List contentRows, final Function0 function0, final Function1 function1, final Function1 function2, final boolean z10, final Function0 function3, final androidx.compose.foundation.lazy.j1 j1Var, final Function1 function4, final Function1 function5, final Function1 function6, final Function1 function7, final Context context, final Function2 function8, final n3 isListAtTheBottom$delegate, final l3 firstVisibleItemIndex$delegate, final Function1 function9, androidx.compose.foundation.lazy.w0 LazyColumn) {
        Intrinsics.checkNotNullParameter(contentRows, "$contentRows");
        Intrinsics.checkNotNullParameter(context, "$context");
        Intrinsics.checkNotNullParameter(isListAtTheBottom$delegate, "$isListAtTheBottom$delegate");
        Intrinsics.checkNotNullParameter(firstVisibleItemIndex$delegate, "$firstVisibleItemIndex$delegate");
        Intrinsics.checkNotNullParameter(LazyColumn, "$this$LazyColumn");
        final Function2 function10 = new Function2() { // from class: io.intercom.android.sdk.m5.conversation.ui.components.q0
            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(Object obj, Object obj2) {
                return LazyMessageListKt.LazyMessageList$lambda$27$lambda$24(((Integer) obj).intValue(), (ContentRow) obj2);
            }
        };
        LazyColumn.A(contentRows.size(), new Function1<Integer, Object>() { // from class: io.intercom.android.sdk.m5.conversation.ui.components.LazyMessageListKt$LazyMessageList$lambda$27$$inlined$itemsIndexed$default$1
            @Override // kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ Object invoke(Integer num) {
                return invoke(num.intValue());
            }

            public final Object invoke(int i10) {
                return function10.invoke(Integer.valueOf(i10), contentRows.get(i10));
            }
        }, new Function1<Integer, Object>() { // from class: io.intercom.android.sdk.m5.conversation.ui.components.LazyMessageListKt$LazyMessageList$lambda$27$$inlined$itemsIndexed$default$2
            @Override // kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ Object invoke(Integer num) {
                return invoke(num.intValue());
            }

            public final Object invoke(int i10) {
                contentRows.get(i10);
                int i11 = 3 << 0;
                return null;
            }
        }, androidx.compose.runtime.internal.w.c(2039820996, true, new pj.o<androidx.compose.foundation.lazy.i, Integer, androidx.compose.runtime.c0, Integer, Unit>() { // from class: io.intercom.android.sdk.m5.conversation.ui.components.LazyMessageListKt$LazyMessageList$lambda$27$$inlined$itemsIndexed$default$3
            @Override // pj.o
            public /* bridge */ /* synthetic */ Unit invoke(androidx.compose.foundation.lazy.i iVar, Integer num, androidx.compose.runtime.c0 c0Var, Integer num2) {
                invoke(iVar, num.intValue(), c0Var, num2.intValue());
                return Unit.f312394a;
            }

            @androidx.compose.runtime.o
            public final void invoke(androidx.compose.foundation.lazy.i iVar, int i10, androidx.compose.runtime.c0 c0Var, int i11) {
                int i12;
                String conversationId;
                float f10;
                androidx.compose.runtime.c0 c0Var2 = c0Var;
                if ((i11 & 6) == 0) {
                    i12 = i11 | (c0Var2.D(iVar) ? 4 : 2);
                } else {
                    i12 = i11;
                }
                if ((i11 & 48) == 0) {
                    i12 |= c0Var2.K(i10) ? 32 : 16;
                }
                if (!c0Var2.h((i12 & com.planner5d.library.engine.input.f.b.F1) != 146, i12 & 1)) {
                    c0Var2.u();
                    return;
                }
                if (androidx.compose.runtime.m0.l0()) {
                    androidx.compose.runtime.m0.A0(2039820996, i12, -1, "androidx.compose.foundation.lazy.itemsIndexed.<anonymous> (LazyDsl.kt:214)");
                }
                final ContentRow contentRow = (ContentRow) contentRows.get(i10);
                c0Var2.E(890829930);
                FailedMessage failedMessage = null;
                androidx.compose.ui.a0 a0VarA = iVar.a(d5.v(androidx.compose.ui.a0.E, 0.0f, MessageListKt.gapWithPrevious(contentRow, i10, contentRows), 0.0f, 0.0f, 13, null), LazyMessageListKt.shouldFadeInItem(contentRow) ? androidx.compose.animation.core.p.r(0.0f, 400.0f, null, 5, null) : null, null, LazyMessageListKt.shouldFadeOutItem(contentRow) ? androidx.compose.animation.core.p.r(0.0f, 400.0f, null, 5, null) : null);
                if (contentRow instanceof ContentRow.AskedAboutRow) {
                    c0Var2.E(891423796);
                    AskedAboutRowKt.AskedAboutRow(i6.h(a0VarA, 0.0f, 1, null), ((ContentRow.AskedAboutRow) contentRow).getPart(), c0Var2, 64, 0);
                    c0Var2.A();
                } else if (contentRow instanceof ContentRow.BigTicketRow) {
                    c0Var2.E(891655552);
                    BigTicketCardKt.BigTicketCard(((ContentRow.BigTicketRow) contentRow).getTicketDetailContentState(), function0, true, a0VarA, c0Var2, 392, 0);
                    c0Var2 = c0Var2;
                    c0Var2.A();
                } else if (contentRow instanceof ContentRow.ComposerSuggestionRow) {
                    c0Var2.E(892009355);
                    QuickRepliesKt.ComposerSuggestions(d5.t(i6.h(a0VarA, 0.0f, 1, null), androidx.compose.ui.unit.h.r(16), 0.0f, 2, null), ((ContentRow.ComposerSuggestionRow) contentRow).getSuggestions(), function1, c0Var2, 64, 0);
                    c0Var2.A();
                } else if (contentRow instanceof ContentRow.QuickRepliesRow) {
                    c0Var2.E(892408046);
                    androidx.compose.ui.a0 a0VarH = i6.h(a0VarA, 0.0f, 1, null);
                    float f11 = 16;
                    QuickRepliesKt.ReplyOptions(d5.v(a0VarH, androidx.compose.ui.unit.h.r(f11), 0.0f, androidx.compose.ui.unit.h.r(f11), 0.0f, 10, null), ((ContentRow.QuickRepliesRow) contentRow).getReplyOptions(), function2, c0Var2, 64, 0);
                    c0Var2.A();
                } else if (contentRow instanceof ContentRow.DayDividerRow) {
                    c0Var2.E(892798305);
                    DayDividerKt.DayDivider(TimeFormatterExtKt.formattedDateForDayDivider(((ContentRow.DayDividerRow) contentRow).getTimestamp(), (Context) c0Var2.W(AndroidCompositionLocals_androidKt.g())), i6.h(a0VarA, 0.0f, 1, null), c0Var2, 0, 0);
                    c0Var2.A();
                } else if (contentRow instanceof ContentRow.EventRow) {
                    c0Var2.E(893073802);
                    ContentRow.EventRow eventRow = (ContentRow.EventRow) contentRow;
                    EventRowKt.EventRow(i6.h(a0VarA, 0.0f, 1, null), eventRow.getLabelSegments(), new AvatarWrapper(eventRow.getAvatar(), false, 2, null), c0Var2, 576, 0);
                    c0Var2.A();
                } else if (contentRow instanceof ContentRow.FinAnswerRow) {
                    c0Var2.E(893387305);
                    ContentRow.FinAnswerRow finAnswerRow = (ContentRow.FinAnswerRow) contentRow;
                    Part part = finAnswerRow.getPart();
                    GroupingPosition groupingPosition = finAnswerRow.getGroupingPosition();
                    String hourOfDay = TimeFormatterExtKt.toHourOfDay(finAnswerRow.getPart().getCreatedAt());
                    final Function2 function11 = function8;
                    FinAnswerRowKt.FinAnswerRow(part, groupingPosition, a0VarA, hourOfDay, new Function1<List<? extends InlineSource>, Unit>() { // from class: io.intercom.android.sdk.m5.conversation.ui.components.LazyMessageListKt$LazyMessageList$15$2$1
                        @Override // kotlin.jvm.functions.Function1
                        public /* bridge */ /* synthetic */ Unit invoke(List<? extends InlineSource> list) {
                            invoke2((List<InlineSource>) list);
                            return Unit.f312394a;
                        }

                        /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
                        public final void invoke2(List<InlineSource> selectedSources) {
                            Intrinsics.checkNotNullParameter(selectedSources, "selectedSources");
                            Function2<List<InlineSource>, List<Source>, Unit> function12 = function11;
                            if (function12 != null) {
                                List<Source> sources = ((ContentRow.FinAnswerRow) contentRow).getPart().getSources();
                                Intrinsics.checkNotNullExpressionValue(sources, "getSources(...)");
                                function12.invoke(selectedSources, sources);
                            }
                        }
                    }, z10, function3, c0Var, 8, 0);
                    c0Var.A();
                    c0Var2 = c0Var;
                } else if (contentRow instanceof ContentRow.FinStreamingRow) {
                    c0Var2.E(894069553);
                    ContentRow.FinStreamingRow finStreamingRow = (ContentRow.FinStreamingRow) contentRow;
                    List<Block> blocks = finStreamingRow.getBlocks();
                    c0Var2.E(-248252408);
                    boolean zD = c0Var2.D(j1Var) | ((((i12 & com.planner5d.library.engine.input.f.b.B) ^ 48) > 32 && c0Var2.K(i10)) || (i12 & 48) == 32);
                    Object objI0 = c0Var2.i0();
                    if (zD || objI0 == androidx.compose.runtime.c0.f35327a.a()) {
                        f10 = 0.0f;
                        LazyMessageListKt$LazyMessageList$15$2$2$1 lazyMessageListKt$LazyMessageList$15$2$2$1 = new LazyMessageListKt$LazyMessageList$15$2$2$1(i10, j1Var, isListAtTheBottom$delegate, firstVisibleItemIndex$delegate, null);
                        c0Var2.Y(lazyMessageListKt$LazyMessageList$15$2$2$1);
                        objI0 = lazyMessageListKt$LazyMessageList$15$2$2$1;
                    } else {
                        f10 = 0.0f;
                    }
                    c0Var2.A();
                    androidx.compose.runtime.b2.i(blocks, (Function2) objI0, c0Var2, 72);
                    c0Var2 = c0Var2;
                    FinStreamingRowKt.FinStreamingRow(finStreamingRow.getBlocks(), finStreamingRow.getStreamingPart(), i6.h(a0VarA, f10, 1, null), c0Var2, 72, 0);
                    c0Var2.A();
                } else if (contentRow instanceof ContentRow.FooterNoticeRow) {
                    c0Var2 = c0Var2;
                    c0Var2.E(894617013);
                    ContentRow.FooterNoticeRow footerNoticeRow = (ContentRow.FooterNoticeRow) contentRow;
                    FooterNoticeKt.ExpandedFooterNotice(d5.s(a0VarA, androidx.compose.ui.unit.h.r(24), androidx.compose.ui.unit.h.r(4)), footerNoticeRow.getFooterNoticeState().getTitle(), footerNoticeRow.getFooterNoticeState().getSubtitle(), footerNoticeRow.getFooterNoticeState().getAvatars(), c0Var2, 4096, 0);
                    c0Var2 = c0Var2;
                    c0Var2.A();
                } else if (contentRow instanceof ContentRow.MergedConversationRow) {
                    c0Var2.E(895046735);
                    ContentRow.MergedConversationRow mergedConversationRow = (ContentRow.MergedConversationRow) contentRow;
                    String description = mergedConversationRow.getDescription();
                    if (description != null && description.length() != 0 && (conversationId = mergedConversationRow.getConversationId()) != null && conversationId.length() != 0) {
                        c0Var2 = c0Var2;
                        MergedConversationRowKt.MergedConversationRow(a0VarA, mergedConversationRow.getDescription(), mergedConversationRow.getConversationId(), function4, c0Var, 0, 0);
                        c0Var2 = c0Var;
                    }
                    c0Var2 = c0Var2;
                    c0Var2 = c0Var2;
                    c0Var2 = c0Var2;
                    c0Var2 = c0Var2;
                    c0Var2.A();
                } else if (contentRow instanceof ContentRow.BubbleMessageRow) {
                    c0Var2.E(895596396);
                    androidx.compose.ui.a0 a0VarH2 = i6.h(a0VarA, 0.0f, 1, null);
                    ContentRow.BubbleMessageRow bubbleMessageRow = (ContentRow.BubbleMessageRow) contentRow;
                    Part part2 = bubbleMessageRow.getPartWrapper().getPart();
                    String hourOfDay2 = TimeFormatterExtKt.toHourOfDay(bubbleMessageRow.getPartWrapper().getPart().getCreatedAt());
                    List<String> failedAttributeIdentifiers = bubbleMessageRow.getPartWrapper().getFailedAttributeIdentifiers();
                    List<String> loadingAttributeIdentifiers = bubbleMessageRow.getPartWrapper().getLoadingAttributeIdentifiers();
                    GroupingPosition groupingPosition2 = bubbleMessageRow.getGroupingPosition();
                    boolean zIsAdminOrAltParticipant = bubbleMessageRow.getPartWrapper().isAdminOrAltParticipant();
                    PendingMessage.FailedImageUploadData failedImageUploadData = bubbleMessageRow.getFailedImageUploadData();
                    c0Var2.E(-248176227);
                    if (bubbleMessageRow.isFailed()) {
                        c0Var2 = c0Var2;
                        String strD = u0.i.d(R.string.intercom_failed_delivery, c0Var2, 0);
                        final Function1 function12 = function9;
                        failedMessage = new FailedMessage(strD, new Function0<Unit>() { // from class: io.intercom.android.sdk.m5.conversation.ui.components.LazyMessageListKt$LazyMessageList$15$2$3
                            @Override // kotlin.jvm.functions.Function0
                            public /* bridge */ /* synthetic */ Unit invoke() {
                                invoke2();
                                return Unit.f312394a;
                            }

                            /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
                            public final void invoke2() {
                                function12.invoke(((ContentRow.BubbleMessageRow) contentRow).getPartWrapper().getPart());
                            }
                        });
                    }
                    c0Var2 = c0Var2;
                    c0Var2.A();
                    BubbleMessageRowKt.BubbleMessageRow(part2, groupingPosition2, zIsAdminOrAltParticipant, a0VarH2, hourOfDay2, function5, failedAttributeIdentifiers, loadingAttributeIdentifiers, function6, failedImageUploadData, failedMessage, function7, c0Var, 18874376, 0, 0);
                    c0Var2 = c0Var;
                    c0Var2.A();
                } else if (contentRow instanceof ContentRow.NewMessagesRow) {
                    c0Var2 = c0Var2;
                    c0Var2.E(896939564);
                    NewMessagesRowKt.NewMessagesRow(a0VarA, c0Var2, 0, 0);
                    c0Var2.A();
                } else if (contentRow instanceof ContentRow.NoteCardRow) {
                    c0Var2 = c0Var2;
                    c0Var2.E(897114125);
                    ContentRow.NoteCardRow noteCardRow = (ContentRow.NoteCardRow) contentRow;
                    NoteCardRowKt.NoteCardRow(a0VarA, noteCardRow.getPart(), noteCardRow.getCompanyName(), c0Var2, 64, 0);
                    c0Var2.A();
                } else if (contentRow instanceof ContentRow.PostCardRow) {
                    c0Var2 = c0Var2;
                    c0Var2.E(897379981);
                    ContentRow.PostCardRow postCardRow = (ContentRow.PostCardRow) contentRow;
                    PostCardRowKt.PostCardRow(a0VarA, postCardRow.getPart(), postCardRow.getCompanyName(), c0Var2, 64, 0);
                    c0Var2.A();
                } else if (contentRow instanceof ContentRow.TeamIntroRow) {
                    c0Var2 = c0Var2;
                    c0Var2.E(897646240);
                    float f12 = 16;
                    TeamIntroKt.TeamIntro(((ContentRow.TeamIntroRow) contentRow).getMessage(), d5.v(a0VarA, androidx.compose.ui.unit.h.r(f12), 0.0f, androidx.compose.ui.unit.h.r(f12), 0.0f, 10, null), c0Var2, 0, 0);
                    c0Var2.A();
                } else if (contentRow instanceof ContentRow.SpecialNoticeRow) {
                    c0Var2 = c0Var2;
                    c0Var2.E(897898332);
                    float f13 = 16;
                    SpecialNoticeKt.SpecialNotice(((ContentRow.SpecialNoticeRow) contentRow).getMessage(), d5.v(a0VarA, androidx.compose.ui.unit.h.r(f13), 0.0f, androidx.compose.ui.unit.h.r(f13), 0.0f, 10, null), c0Var2, 0, 0);
                    c0Var2.A();
                } else if (contentRow instanceof ContentRow.TicketStatusRow) {
                    c0Var2 = c0Var2;
                    c0Var2.E(898162049);
                    ContentRow.TicketStatusRow ticketStatusRow = (ContentRow.TicketStatusRow) contentRow;
                    TicketStatusRowKt.TicketStatusRow(ticketStatusRow.getTicketEventStatus(), ticketStatusRow.getTicketStatusText(), TimeFormatterExtKt.formattedDateFromLong(ticketStatusRow.getCreatedAt(), context), d5.t(a0VarA, androidx.compose.ui.unit.h.r(16), 0.0f, 2, null), ticketStatusRow.getCustomStateLabel(), ticketStatusRow.getCustomStatePrefix(), c0Var, 0, 0);
                    c0Var2 = c0Var;
                    c0Var2.A();
                } else {
                    if (!(contentRow instanceof ContentRow.TypingIndicatorRow)) {
                        c0Var2 = c0Var2;
                        c0Var2.E(-248333446);
                        c0Var2.A();
                        throw new kotlin.k0();
                    }
                    c0Var2 = c0Var2;
                    c0Var2.E(898696241);
                    TypingIndicatorKt.m321TypingIndicator6a0pyJM(d5.t(i6.h(a0VarA, 0.0f, 1, null), androidx.compose.ui.unit.h.r(16), 0.0f, 2, null), ((ContentRow.TypingIndicatorRow) contentRow).getCurrentlyTypingState(), androidx.compose.ui.unit.h.r(36), c0Var2, 448, 0);
                    c0Var2.A();
                }
                c0Var2.A();
                if (androidx.compose.runtime.m0.l0()) {
                    androidx.compose.runtime.m0.z0();
                }
            }
        }));
        androidx.compose.foundation.lazy.w0.p(LazyColumn, ConversationUiStateKt.LastAnchorRowKey, null, ComposableSingletons$LazyMessageListKt.INSTANCE.m206getLambda1$intercom_sdk_base_release(), 2, null);
        return Unit.f312394a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Object LazyMessageList$lambda$27$lambda$24(int i10, ContentRow item) {
        Intrinsics.checkNotNullParameter(item, "item");
        return item.getKey();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit LazyMessageList$lambda$28(androidx.compose.ui.a0 a0Var, List contentRows, androidx.compose.foundation.lazy.j1 j1Var, Function1 function1, Function1 function2, Function1 function3, Function1 function4, Function1 function5, Function0 function0, Function1 function6, boolean z10, Function1 function7, boolean z11, Function2 function8, boolean z12, Function0 function9, int i10, int i11, int i12, androidx.compose.runtime.c0 c0Var, int i13) {
        Intrinsics.checkNotNullParameter(contentRows, "$contentRows");
        LazyMessageList(a0Var, contentRows, j1Var, function1, function2, function3, function4, function5, function0, function6, z10, function7, z11, function8, z12, function9, c0Var, t4.a(i10 | 1), t4.a(i11), i12);
        return Unit.f312394a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit LazyMessageList$lambda$3(PendingMessage.FailedImageUploadData it) {
        Intrinsics.checkNotNullParameter(it, "it");
        return Unit.f312394a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit LazyMessageList$lambda$4(AttributeData it) {
        Intrinsics.checkNotNullParameter(it, "it");
        return Unit.f312394a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit LazyMessageList$lambda$6(TicketType it) {
        Intrinsics.checkNotNullParameter(it, "it");
        return Unit.f312394a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit LazyMessageList$lambda$7(String it) {
        Intrinsics.checkNotNullParameter(it, "it");
        return Unit.f312394a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final KeyboardState LazyMessageList$lambda$9(n7<KeyboardState> n7Var) {
        return n7Var.getValue();
    }

    @androidx.compose.runtime.o
    @IntercomPreviews
    @androidx.compose.runtime.t(applier = "androidx.compose.ui.UiComposable")
    public static final void LazyMessageListPreview(@Nullable androidx.compose.runtime.c0 c0Var, final int i10) {
        androidx.compose.runtime.c0 c0VarR = c0Var.R(834972857);
        if (i10 == 0 && c0VarR.d()) {
            c0VarR.u();
        } else {
            IntercomThemeKt.IntercomTheme(null, null, null, ComposableSingletons$LazyMessageListKt.INSTANCE.m208getLambda3$intercom_sdk_base_release(), c0VarR, 3072, 7);
        }
        s5 s5VarT = c0VarR.T();
        if (s5VarT != null) {
            s5VarT.a(new Function2() { // from class: io.intercom.android.sdk.m5.conversation.ui.components.p0
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    return LazyMessageListKt.LazyMessageListPreview$lambda$29(i10, (androidx.compose.runtime.c0) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit LazyMessageListPreview$lambda$29(int i10, androidx.compose.runtime.c0 c0Var, int i11) {
        LazyMessageListPreview(c0Var, t4.a(i10 | 1));
        return Unit.f312394a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Code duplicated, block: B:10:0x002a  */
    /* JADX WARN: Code duplicated, block: B:12:0x002f  */
    /* JADX WARN: Code duplicated, block: B:13:0x0031  */
    public static final boolean shouldFadeInItem(ContentRow contentRow) {
        if (!(contentRow instanceof ContentRow.TypingIndicatorRow)) {
            if (contentRow instanceof ContentRow.BubbleMessageRow) {
                ContentRow.BubbleMessageRow bubbleMessageRow = (ContentRow.BubbleMessageRow) contentRow;
                if (!bubbleMessageRow.getPartWrapper().isLastPart() || bubbleMessageRow.getPartWrapper().getPart().getMessageState() != Part.MessageState.SENDING) {
                    if (contentRow instanceof ContentRow.QuickRepliesRow) {
                        return false;
                    }
                }
            } else if (contentRow instanceof ContentRow.QuickRepliesRow) {
                return false;
            }
        }
        return true;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean shouldFadeOutItem(ContentRow contentRow) {
        return (contentRow instanceof ContentRow.TypingIndicatorRow) || (contentRow instanceof ContentRow.QuickRepliesRow);
    }
}
