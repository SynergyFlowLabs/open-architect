package io.intercom.android.sdk.m5.conversation.ui.components.row;

import androidx.compose.foundation.layout.d5;
import androidx.compose.foundation.layout.i6;
import androidx.compose.foundation.layout.s3;
import androidx.compose.foundation.layout.t2;
import androidx.compose.material3.q50;
import androidx.compose.runtime.s5;
import androidx.compose.runtime.t4;
import io.intercom.android.sdk.m5.conversation.states.ReplySuggestion;
import io.intercom.android.sdk.models.ReplyOption;
import io.intercom.android.sdk.ui.IntercomPreviews;
import io.intercom.android.sdk.ui.component.IntercomCardKt;
import io.intercom.android.sdk.ui.component.IntercomCardStyle;
import io.intercom.android.sdk.ui.theme.IntercomTheme;
import io.intercom.android.sdk.ui.theme.IntercomThemeKt;
import java.util.ArrayList;
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
@SourceDebugExtension({"SMAP\nQuickReplies.kt\nKotlin\n*S Kotlin\n*F\n+ 1 QuickReplies.kt\nio/intercom/android/sdk/m5/conversation/ui/components/row/QuickRepliesKt\n+ 2 Dp.kt\nandroidx/compose/ui/unit/DpKt\n+ 3 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n+ 4 Composer.kt\nandroidx/compose/runtime/ComposerKt\n+ 5 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,146:1\n113#2:147\n113#2:148\n1557#3:149\n1628#3,3:150\n1557#3:153\n1628#3,3:154\n1282#4,6:157\n1#5:163\n*S KotlinDebug\n*F\n+ 1 QuickReplies.kt\nio/intercom/android/sdk/m5/conversation/ui/components/row/QuickRepliesKt\n*L\n39#1:147\n40#1:148\n74#1:149\n74#1:150,3\n89#1:153\n89#1:154,3\n102#1:157,6\n*E\n"})
public final class QuickRepliesKt {

    /* JADX INFO: renamed from: io.intercom.android.sdk.m5.conversation.ui.components.row.QuickRepliesKt$QuickReplies$1, reason: invalid class name */
    @SourceDebugExtension({"SMAP\nQuickReplies.kt\nKotlin\n*S Kotlin\n*F\n+ 1 QuickReplies.kt\nio/intercom/android/sdk/m5/conversation/ui/components/row/QuickRepliesKt$QuickReplies$1\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n+ 3 Composer.kt\nandroidx/compose/runtime/ComposerKt\n+ 4 Dp.kt\nandroidx/compose/ui/unit/DpKt\n*L\n1#1,146:1\n1863#2:147\n1864#2:157\n1282#3,6:148\n113#4:154\n113#4:155\n113#4:156\n*S KotlinDebug\n*F\n+ 1 QuickReplies.kt\nio/intercom/android/sdk/m5/conversation/ui/components/row/QuickRepliesKt$QuickReplies$1\n*L\n42#1:147\n42#1:157\n44#1:148,6\n48#1:154\n51#1:155\n52#1:156\n*E\n"})
    static final class AnonymousClass1 implements pj.n<s3, androidx.compose.runtime.c0, Integer, Unit> {
        final /* synthetic */ Function1<QuickReply, Unit> $onQuickReplyClick;
        final /* synthetic */ List<QuickReply> $quickReplies;

        /* JADX WARN: Multi-variable type inference failed */
        AnonymousClass1(List<QuickReply> list, Function1<? super QuickReply, Unit> function1) {
            this.$quickReplies = list;
            this.$onQuickReplyClick = function1;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final Unit invoke$lambda$2$lambda$1$lambda$0(Function1 onQuickReplyClick, QuickReply it) {
            Intrinsics.checkNotNullParameter(onQuickReplyClick, "$onQuickReplyClick");
            Intrinsics.checkNotNullParameter(it, "$it");
            onQuickReplyClick.invoke(it);
            return Unit.f312394a;
        }

        @Override // pj.n
        public /* bridge */ /* synthetic */ Unit invoke(s3 s3Var, androidx.compose.runtime.c0 c0Var, Integer num) {
            invoke(s3Var, c0Var, num.intValue());
            return Unit.f312394a;
        }

        @androidx.compose.runtime.o
        @androidx.compose.runtime.t(applier = "androidx.compose.ui.UiComposable")
        public final void invoke(s3 FlowRow, androidx.compose.runtime.c0 c0Var, int i10) {
            androidx.compose.runtime.c0 c0Var2 = c0Var;
            Intrinsics.checkNotNullParameter(FlowRow, "$this$FlowRow");
            if ((i10 & 81) == 16 && c0Var2.d()) {
                c0Var2.u();
                return;
            }
            List<QuickReply> list = this.$quickReplies;
            final Function1<QuickReply, Unit> function1 = this.$onQuickReplyClick;
            for (final QuickReply quickReply : list) {
                c0Var2.E(373518625);
                boolean zD = c0Var2.D(function1) | c0Var2.D(quickReply);
                Object objI0 = c0Var2.i0();
                if (zD || objI0 == androidx.compose.runtime.c0.f35327a.a()) {
                    objI0 = new Function0() { // from class: io.intercom.android.sdk.m5.conversation.ui.components.row.t1
                        @Override // kotlin.jvm.functions.Function0
                        public final Object invoke() {
                            return QuickRepliesKt.AnonymousClass1.invoke$lambda$2$lambda$1$lambda$0(function1, quickReply);
                        }
                    };
                    c0Var2.Y(objI0);
                }
                Function0 function0 = (Function0) objI0;
                c0Var2.A();
                IntercomCardStyle intercomCardStyle = IntercomCardStyle.INSTANCE;
                androidx.compose.foundation.shape.n nVarH = androidx.compose.foundation.shape.o.h(androidx.compose.ui.unit.h.r(20));
                IntercomTheme intercomTheme = IntercomTheme.INSTANCE;
                int i11 = IntercomTheme.$stable;
                IntercomCardKt.IntercomCard(function0, null, false, intercomCardStyle.m597defaultStyleqUnfpCA(nVarH, intercomTheme.getColors(c0Var2, i11).m690getBackground0d7_KjU(), intercomTheme.getColors(c0Var2, i11).m714getPrimaryText0d7_KjU(), androidx.compose.ui.unit.h.r(0), androidx.compose.foundation.b1.a(androidx.compose.ui.unit.h.r(1), intercomTheme.getColors(c0Var2, i11).m692getBorder0d7_KjU()), 0L, c0Var, (IntercomCardStyle.$stable << 18) | 3072, 32), null, androidx.compose.runtime.internal.w.e(-1399332631, true, new pj.n<androidx.compose.foundation.layout.m0, androidx.compose.runtime.c0, Integer, Unit>() { // from class: io.intercom.android.sdk.m5.conversation.ui.components.row.QuickRepliesKt$QuickReplies$1$1$2
                    @Override // pj.n
                    public /* bridge */ /* synthetic */ Unit invoke(androidx.compose.foundation.layout.m0 m0Var, androidx.compose.runtime.c0 c0Var3, Integer num) {
                        invoke(m0Var, c0Var3, num.intValue());
                        return Unit.f312394a;
                    }

                    @androidx.compose.runtime.o
                    @androidx.compose.runtime.t(applier = "androidx.compose.ui.UiComposable")
                    public final void invoke(androidx.compose.foundation.layout.m0 IntercomCard, androidx.compose.runtime.c0 c0Var3, int i12) {
                        Intrinsics.checkNotNullParameter(IntercomCard, "$this$IntercomCard");
                        if ((i12 & 81) == 16 && c0Var3.d()) {
                            c0Var3.u();
                            return;
                        }
                        androidx.compose.ui.a0 a0VarS = d5.s(androidx.compose.ui.a0.E, androidx.compose.ui.unit.h.r(16), androidx.compose.ui.unit.h.r(12));
                        String text = quickReply.getText();
                        IntercomTheme intercomTheme2 = IntercomTheme.INSTANCE;
                        int i13 = IntercomTheme.$stable;
                        q50.t(text, a0VarS, intercomTheme2.getColors(c0Var3, i13).m714getPrimaryText0d7_KjU(), null, 0L, null, null, null, 0L, null, androidx.compose.ui.text.style.j.h(androidx.compose.ui.text.style.j.f42206b.a()), 0L, 0, false, 0, 0, null, intercomTheme2.getTypography(c0Var3, i13).getType04Point5(), c0Var3, 0, 0, 130040);
                    }
                }, c0Var, 54), c0Var, (IntercomCardStyle.Style.$stable << 9) | androidx.profileinstaller.n.c.f73814m, 22);
                function1 = function1;
                c0Var2 = c0Var;
            }
        }
    }

    @androidx.compose.runtime.o
    @androidx.compose.runtime.t(applier = "androidx.compose.ui.UiComposable")
    public static final void AnimatedQuickReplies(@NotNull final List<ReplyOption> replyOptions, @NotNull final Function1<? super ReplyOption, Unit> onReplyClicked, @Nullable androidx.compose.runtime.c0 c0Var, final int i10) {
        Intrinsics.checkNotNullParameter(replyOptions, "replyOptions");
        Intrinsics.checkNotNullParameter(onReplyClicked, "onReplyClicked");
        androidx.compose.runtime.c0 c0VarR = c0Var.R(-2072519615);
        c0VarR.E(-407350720);
        Object objI0 = c0VarR.i0();
        Object obj = objI0;
        if (objI0 == androidx.compose.runtime.c0.f35327a.a()) {
            androidx.compose.animation.core.w1 w1Var = new androidx.compose.animation.core.w1(Boolean.FALSE);
            w1Var.f(Boolean.TRUE);
            c0VarR.Y(w1Var);
            obj = w1Var;
        }
        c0VarR.A();
        androidx.compose.animation.k.d((androidx.compose.animation.core.w1) obj, null, androidx.compose.animation.b0.I(null, new Function1() { // from class: io.intercom.android.sdk.m5.conversation.ui.components.row.o1
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj2) {
                return Integer.valueOf(QuickRepliesKt.AnimatedQuickReplies$lambda$13(((Integer) obj2).intValue()));
            }
        }, 1, null).c(androidx.compose.animation.b0.o(null, 0.0f, 3, null)), androidx.compose.animation.b0.q(null, 0.0f, 3, null), null, androidx.compose.runtime.internal.w.e(992499481, true, new pj.n<androidx.compose.animation.l, androidx.compose.runtime.c0, Integer, Unit>() { // from class: io.intercom.android.sdk.m5.conversation.ui.components.row.QuickRepliesKt.AnimatedQuickReplies.2
            @Override // pj.n
            public /* bridge */ /* synthetic */ Unit invoke(androidx.compose.animation.l lVar, androidx.compose.runtime.c0 c0Var2, Integer num) {
                invoke(lVar, c0Var2, num.intValue());
                return Unit.f312394a;
            }

            @androidx.compose.runtime.o
            @androidx.compose.runtime.t(applier = "androidx.compose.ui.UiComposable")
            public final void invoke(androidx.compose.animation.l AnimatedVisibility, androidx.compose.runtime.c0 c0Var2, int i11) {
                Intrinsics.checkNotNullParameter(AnimatedVisibility, "$this$AnimatedVisibility");
                float f10 = 16;
                QuickRepliesKt.ReplyOptions(d5.v(i6.h(androidx.compose.ui.a0.E, 0.0f, 1, null), androidx.compose.ui.unit.h.r(f10), 0.0f, androidx.compose.ui.unit.h.r(f10), 0.0f, 10, null), replyOptions, onReplyClicked, c0Var2, 70, 0);
            }
        }, c0VarR, 54), c0VarR, androidx.compose.animation.core.w1.f13348e | 200064, 18);
        s5 s5VarT = c0VarR.T();
        if (s5VarT != null) {
            s5VarT.a(new Function2() { // from class: io.intercom.android.sdk.m5.conversation.ui.components.row.p1
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj2, Object obj3) {
                    return QuickRepliesKt.AnimatedQuickReplies$lambda$14(replyOptions, onReplyClicked, i10, (androidx.compose.runtime.c0) obj2, ((Integer) obj3).intValue());
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final int AnimatedQuickReplies$lambda$13(int i10) {
        return i10 / 2;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit AnimatedQuickReplies$lambda$14(List replyOptions, Function1 onReplyClicked, int i10, androidx.compose.runtime.c0 c0Var, int i11) {
        Intrinsics.checkNotNullParameter(replyOptions, "$replyOptions");
        Intrinsics.checkNotNullParameter(onReplyClicked, "$onReplyClicked");
        AnimatedQuickReplies(replyOptions, onReplyClicked, c0Var, t4.a(i10 | 1));
        return Unit.f312394a;
    }

    @androidx.compose.runtime.o
    @androidx.compose.runtime.t(applier = "androidx.compose.ui.UiComposable")
    public static final void ComposerSuggestions(@Nullable androidx.compose.ui.a0 a0Var, @NotNull final List<ReplySuggestion> suggestions, @NotNull final Function1<? super ReplySuggestion, Unit> onSuggestionClick, @Nullable androidx.compose.runtime.c0 c0Var, final int i10, final int i11) {
        Intrinsics.checkNotNullParameter(suggestions, "suggestions");
        Intrinsics.checkNotNullParameter(onSuggestionClick, "onSuggestionClick");
        androidx.compose.runtime.c0 c0VarR = c0Var.R(-719570861);
        final androidx.compose.ui.a0 a0Var2 = (i11 & 1) != 0 ? androidx.compose.ui.a0.E : a0Var;
        List<ReplySuggestion> list = suggestions;
        ArrayList arrayList = new ArrayList(CollectionsKt.collectionSizeOrDefault(list, 10));
        for (ReplySuggestion replySuggestion : list) {
            arrayList.add(new QuickReply(replySuggestion.getId(), replySuggestion.getText()));
        }
        QuickReplies(arrayList, new Function1() { // from class: io.intercom.android.sdk.m5.conversation.ui.components.row.r1
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return QuickRepliesKt.ComposerSuggestions$lambda$9(suggestions, onSuggestionClick, (QuickReply) obj);
            }
        }, a0Var2, c0VarR, ((i10 << 6) & 896) | 8, 0);
        s5 s5VarT = c0VarR.T();
        if (s5VarT != null) {
            s5VarT.a(new Function2() { // from class: io.intercom.android.sdk.m5.conversation.ui.components.row.s1
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    return QuickRepliesKt.ComposerSuggestions$lambda$10(a0Var2, suggestions, onSuggestionClick, i10, i11, (androidx.compose.runtime.c0) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit ComposerSuggestions$lambda$10(androidx.compose.ui.a0 a0Var, List suggestions, Function1 onSuggestionClick, int i10, int i11, androidx.compose.runtime.c0 c0Var, int i12) {
        Intrinsics.checkNotNullParameter(suggestions, "$suggestions");
        Intrinsics.checkNotNullParameter(onSuggestionClick, "$onSuggestionClick");
        ComposerSuggestions(a0Var, suggestions, onSuggestionClick, c0Var, t4.a(i10 | 1), i11);
        return Unit.f312394a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit ComposerSuggestions$lambda$9(List suggestions, Function1 onSuggestionClick, QuickReply quickReply) {
        Object next;
        Intrinsics.checkNotNullParameter(suggestions, "$suggestions");
        Intrinsics.checkNotNullParameter(onSuggestionClick, "$onSuggestionClick");
        Intrinsics.checkNotNullParameter(quickReply, "quickReply");
        Iterator it = suggestions.iterator();
        do {
            if (!it.hasNext()) {
                next = null;
                break;
            }
            next = it.next();
        } while (!Intrinsics.areEqual(((ReplySuggestion) next).getId(), quickReply.getId()));
        ReplySuggestion replySuggestion = (ReplySuggestion) next;
        if (replySuggestion != null) {
            onSuggestionClick.invoke(replySuggestion);
        }
        return Unit.f312394a;
    }

    @androidx.compose.runtime.o
    @androidx.compose.runtime.t(applier = "androidx.compose.ui.UiComposable")
    public static final void QuickReplies(@NotNull final List<QuickReply> quickReplies, @NotNull final Function1<? super QuickReply, Unit> onQuickReplyClick, @Nullable androidx.compose.ui.a0 a0Var, @Nullable androidx.compose.runtime.c0 c0Var, final int i10, final int i11) {
        Intrinsics.checkNotNullParameter(quickReplies, "quickReplies");
        Intrinsics.checkNotNullParameter(onQuickReplyClick, "onQuickReplyClick");
        androidx.compose.runtime.c0 c0VarR = c0Var.R(368433331);
        if ((i11 & 4) != 0) {
            a0Var = androidx.compose.ui.a0.E;
        }
        androidx.compose.ui.a0 a0VarH = i6.h(a0Var, 0.0f, 1, null);
        androidx.compose.foundation.layout.q qVar = androidx.compose.foundation.layout.q.f16330a;
        float f10 = 8;
        float fR = androidx.compose.ui.unit.h.r(f10);
        androidx.compose.ui.e.a aVar = androidx.compose.ui.e.f37317a;
        t2.m(a0VarH, qVar.H(fR, aVar.s()), qVar.I(androidx.compose.ui.unit.h.r(f10), aVar.a()), null, 0, 0, androidx.compose.runtime.internal.w.e(-458232018, true, new AnonymousClass1(quickReplies, onQuickReplyClick), c0VarR, 54), c0VarR, 1573296, 56);
        s5 s5VarT = c0VarR.T();
        if (s5VarT != null) {
            final androidx.compose.ui.a0 a0Var2 = a0Var;
            s5VarT.a(new Function2() { // from class: io.intercom.android.sdk.m5.conversation.ui.components.row.q1
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    return QuickRepliesKt.QuickReplies$lambda$0(quickReplies, onQuickReplyClick, a0Var2, i10, i11, (androidx.compose.runtime.c0) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit QuickReplies$lambda$0(List quickReplies, Function1 onQuickReplyClick, androidx.compose.ui.a0 a0Var, int i10, int i11, androidx.compose.runtime.c0 c0Var, int i12) {
        Intrinsics.checkNotNullParameter(quickReplies, "$quickReplies");
        Intrinsics.checkNotNullParameter(onQuickReplyClick, "$onQuickReplyClick");
        QuickReplies(quickReplies, onQuickReplyClick, a0Var, c0Var, t4.a(i10 | 1), i11);
        return Unit.f312394a;
    }

    @androidx.compose.runtime.o
    @IntercomPreviews
    @androidx.compose.runtime.t(applier = "androidx.compose.ui.UiComposable")
    public static final void QuickRepliesPreview(@Nullable androidx.compose.runtime.c0 c0Var, final int i10) {
        androidx.compose.runtime.c0 c0VarR = c0Var.R(1503246755);
        if (i10 == 0 && c0VarR.d()) {
            c0VarR.u();
        } else {
            int i11 = 1 << 0;
            IntercomThemeKt.IntercomTheme(null, null, null, ComposableSingletons$QuickRepliesKt.INSTANCE.m299getLambda2$intercom_sdk_base_release(), c0VarR, 3072, 7);
        }
        s5 s5VarT = c0VarR.T();
        if (s5VarT != null) {
            s5VarT.a(new Function2() { // from class: io.intercom.android.sdk.m5.conversation.ui.components.row.l1
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    return QuickRepliesKt.QuickRepliesPreview$lambda$15(i10, (androidx.compose.runtime.c0) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit QuickRepliesPreview$lambda$15(int i10, androidx.compose.runtime.c0 c0Var, int i11) {
        QuickRepliesPreview(c0Var, t4.a(i10 | 1));
        return Unit.f312394a;
    }

    @androidx.compose.runtime.o
    @androidx.compose.runtime.t(applier = "androidx.compose.ui.UiComposable")
    public static final void ReplyOptions(@Nullable androidx.compose.ui.a0 a0Var, @NotNull final List<ReplyOption> replyOptions, @NotNull final Function1<? super ReplyOption, Unit> onReplyClicked, @Nullable androidx.compose.runtime.c0 c0Var, final int i10, final int i11) {
        Intrinsics.checkNotNullParameter(replyOptions, "replyOptions");
        Intrinsics.checkNotNullParameter(onReplyClicked, "onReplyClicked");
        androidx.compose.runtime.c0 c0VarR = c0Var.R(-1003293676);
        final androidx.compose.ui.a0 a0Var2 = (i11 & 1) != 0 ? androidx.compose.ui.a0.E : a0Var;
        List<ReplyOption> list = replyOptions;
        ArrayList arrayList = new ArrayList(CollectionsKt.collectionSizeOrDefault(list, 10));
        for (ReplyOption replyOption : list) {
            arrayList.add(new QuickReply(replyOption.getUuid(), replyOption.getText()));
        }
        QuickReplies(arrayList, new Function1() { // from class: io.intercom.android.sdk.m5.conversation.ui.components.row.m1
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return QuickRepliesKt.ReplyOptions$lambda$4(replyOptions, onReplyClicked, (QuickReply) obj);
            }
        }, a0Var2, c0VarR, ((i10 << 6) & 896) | 8, 0);
        s5 s5VarT = c0VarR.T();
        if (s5VarT != null) {
            s5VarT.a(new Function2() { // from class: io.intercom.android.sdk.m5.conversation.ui.components.row.n1
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    return QuickRepliesKt.ReplyOptions$lambda$5(a0Var2, replyOptions, onReplyClicked, i10, i11, (androidx.compose.runtime.c0) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit ReplyOptions$lambda$4(List replyOptions, Function1 onReplyClicked, QuickReply quickReply) {
        Object next;
        Intrinsics.checkNotNullParameter(replyOptions, "$replyOptions");
        Intrinsics.checkNotNullParameter(onReplyClicked, "$onReplyClicked");
        Intrinsics.checkNotNullParameter(quickReply, "quickReply");
        Iterator it = replyOptions.iterator();
        do {
            if (!it.hasNext()) {
                next = null;
                break;
            }
            next = it.next();
        } while (!Intrinsics.areEqual(((ReplyOption) next).getUuid(), quickReply.getId()));
        ReplyOption replyOption = (ReplyOption) next;
        if (replyOption != null) {
            onReplyClicked.invoke(replyOption);
        }
        return Unit.f312394a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit ReplyOptions$lambda$5(androidx.compose.ui.a0 a0Var, List replyOptions, Function1 onReplyClicked, int i10, int i11, androidx.compose.runtime.c0 c0Var, int i12) {
        Intrinsics.checkNotNullParameter(replyOptions, "$replyOptions");
        Intrinsics.checkNotNullParameter(onReplyClicked, "$onReplyClicked");
        ReplyOptions(a0Var, replyOptions, onReplyClicked, c0Var, t4.a(i10 | 1), i11);
        return Unit.f312394a;
    }
}
