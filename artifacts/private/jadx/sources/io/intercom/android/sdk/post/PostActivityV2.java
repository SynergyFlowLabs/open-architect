package io.intercom.android.sdk.post;

import android.content.Context;
import android.os.Bundle;
import androidx.compose.foundation.b5;
import androidx.compose.foundation.layout.d5;
import androidx.compose.foundation.layout.g5;
import androidx.compose.foundation.layout.i6;
import androidx.compose.foundation.layout.j0;
import androidx.compose.foundation.layout.l6;
import androidx.compose.foundation.layout.n0;
import androidx.compose.foundation.layout.q;
import androidx.compose.foundation.q4;
import androidx.compose.material3.ld;
import androidx.compose.material3.pt;
import androidx.compose.runtime.b1;
import androidx.compose.runtime.b2;
import androidx.compose.runtime.c0;
import androidx.compose.runtime.internal.w;
import androidx.compose.runtime.internal.w0;
import androidx.compose.runtime.o;
import androidx.compose.runtime.t;
import androidx.compose.runtime.v;
import androidx.compose.runtime.y7;
import androidx.compose.ui.a0;
import androidx.compose.ui.graphics.q0;
import androidx.compose.ui.layout.a1;
import androidx.compose.ui.m;
import androidx.compose.ui.platform.AndroidCompositionLocals_androidKt;
import androidx.compose.ui.text.font.v0;
import androidx.compose.ui.text.style.j;
import io.intercom.android.sdk.Injector;
import io.intercom.android.sdk.Provider;
import io.intercom.android.sdk.R;
import io.intercom.android.sdk.activities.IntercomBaseActivity;
import io.intercom.android.sdk.blocks.lib.BlockType;
import io.intercom.android.sdk.blocks.lib.models.Block;
import io.intercom.android.sdk.identity.AppConfig;
import io.intercom.android.sdk.m5.ConversationScreenOpenerKt;
import io.intercom.android.sdk.m5.data.IntercomDataLayer;
import io.intercom.android.sdk.models.Avatar;
import io.intercom.android.sdk.models.LastParticipatingAdmin;
import io.intercom.android.sdk.models.Part;
import io.intercom.android.sdk.survey.block.BlockRenderData;
import io.intercom.android.sdk.survey.block.BlockRenderTextStyle;
import io.intercom.android.sdk.survey.block.BlockViewKt;
import io.intercom.android.sdk.survey.block.ImageRenderType;
import io.intercom.android.sdk.ui.theme.IntercomThemeKt;
import io.intercom.android.sdk.utilities.Phrase;
import io.intercom.android.sdk.utilities.TimeFormatter;
import java.util.List;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.f0;
import kotlin.g0;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlinx.coroutines.s0;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import pj.n;

/* JADX INFO: loaded from: classes13.dex */
@w0(parameters = 0)
public final class PostActivityV2 extends IntercomBaseActivity {

    @NotNull
    private static final String COMPOSER_IS_VISIBLE = "composer_is_visible";

    @NotNull
    private static final String LAST_PARTICIPANT = "last_participant";

    @NotNull
    private static final String PARCEL_CONVERSATION_ID = "parcel_conversation_id";

    @NotNull
    private static final String PARCEL_PART = "parcel_part";

    @NotNull
    private static final String POST_PREVIEW = "is_post_preview";

    @NotNull
    public static final Companion Companion = new Companion(null);
    public static final int $stable = 8;

    @NotNull
    private final f0 injector$delegate = g0.c(new Function0() { // from class: io.intercom.android.sdk.post.a
        @Override // kotlin.jvm.functions.Function0
        public final Object invoke() {
            return Injector.get();
        }
    });

    @NotNull
    private final f0 appConfigProvider$delegate = g0.c(new Function0() { // from class: io.intercom.android.sdk.post.b
        @Override // kotlin.jvm.functions.Function0
        public final Object invoke() {
            return PostActivityV2.appConfigProvider_delegate$lambda$1(this.f293149a);
        }
    });

    @NotNull
    private final f0 timeFormatter$delegate = g0.c(new Function0() { // from class: io.intercom.android.sdk.post.c
        @Override // kotlin.jvm.functions.Function0
        public final Object invoke() {
            return PostActivityV2.timeFormatter_delegate$lambda$2(this.f293150a);
        }
    });

    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Provider appConfigProvider_delegate$lambda$1(PostActivityV2 this$0) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        return this$0.getInjector().getAppConfigProvider();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final Provider<AppConfig> getAppConfigProvider() {
        return (Provider) this.appConfigProvider$delegate.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final String getConversationId() {
        Bundle extras = getIntent().getExtras();
        if (extras == null) {
            extras = new Bundle();
        }
        String string = extras.getString(PARCEL_CONVERSATION_ID, "");
        Intrinsics.checkNotNullExpressionValue(string, "getString(...)");
        return string;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final Injector getInjector() {
        return (Injector) this.injector$delegate.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final Part getPart() {
        Bundle extras = getIntent().getExtras();
        if (extras != null) {
            extras.setClassLoader(Part.class.getClassLoader());
            if (extras.containsKey(PARCEL_PART)) {
                Part part = (Part) androidx.core.os.d.b(extras, PARCEL_PART, Part.class);
                if (part != null) {
                    return part;
                }
                Part NULL = Part.NULL;
                Intrinsics.checkNotNullExpressionValue(NULL, "NULL");
                return NULL;
            }
        }
        Part NULL2 = Part.NULL;
        Intrinsics.checkNotNullExpressionValue(NULL2, "NULL");
        return NULL2;
    }

    private final TimeFormatter getTimeFormatter() {
        return (TimeFormatter) this.timeFormatter$delegate.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final String getUserStatus() {
        Bundle extras = getIntent().getExtras();
        if (extras != null && extras.containsKey(LAST_PARTICIPANT)) {
            LastParticipatingAdmin lastParticipatingAdmin = (LastParticipatingAdmin) androidx.core.os.d.b(extras, LAST_PARTICIPANT, LastParticipatingAdmin.class);
            if (!LastParticipatingAdmin.isNull(lastParticipatingAdmin)) {
                TimeFormatter timeFormatter = getTimeFormatter();
                Intrinsics.checkNotNull(lastParticipatingAdmin);
                timeFormatter.getAdminActiveStatus(lastParticipatingAdmin, getAppConfigProvider());
            }
        }
        return "";
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final boolean isComposerVisible() {
        Bundle extras = getIntent().getExtras();
        if (extras != null) {
            return extras.getBoolean(COMPOSER_IS_VISIBLE, true);
        }
        return true;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final boolean isPreview() {
        Bundle extras = getIntent().getExtras();
        if (extras == null) {
            extras = new Bundle();
        }
        return extras.getBoolean(POST_PREVIEW, false);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void openConversation() {
        Bundle extras = getIntent().getExtras();
        if (extras == null) {
            extras = new Bundle();
        }
        String string = extras.getString(PARCEL_CONVERSATION_ID, "");
        getInjector().getMetricTracker().openedConversationFromFull(string, getPart().getId());
        startActivity(ConversationScreenOpenerKt.getConversationIntent(this, string));
        finish();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void sendPostAsRead() {
        Bundle extras = getIntent().getExtras();
        if (extras == null || !extras.containsKey(PARCEL_CONVERSATION_ID)) {
            return;
        }
        String string = extras.getString(PARCEL_CONVERSATION_ID, "");
        IntercomDataLayer dataLayer = getInjector().getDataLayer();
        Intrinsics.checkNotNull(string);
        dataLayer.markConversationAsRead(string);
        getInjector().getApi().markConversationAsRead(string);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final TimeFormatter timeFormatter_delegate$lambda$2(PostActivityV2 this$0) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        return new TimeFormatter(this$0, this$0.getInjector().getTimeProvider());
    }

    @Override // io.intercom.android.sdk.activities.IntercomBaseActivity, androidx.fragment.app.s, androidx.activity.l, androidx.core.app.m, android.app.Activity
    protected void onCreate(@Nullable Bundle bundle) {
        super.onCreate(bundle);
        androidx.activity.compose.f.b(this, null, w.c(-1329969746, true, new Function2<c0, Integer, Unit>() { // from class: io.intercom.android.sdk.post.PostActivityV2.onCreate.1
            @Override // kotlin.jvm.functions.Function2
            public /* bridge */ /* synthetic */ Unit invoke(c0 c0Var, Integer num) {
                invoke(c0Var, num.intValue());
                return Unit.f312394a;
            }

            @o
            @t(applier = "androidx.compose.ui.UiComposable")
            public final void invoke(c0 c0Var, int i10) {
                if ((i10 & 11) == 2 && c0Var.d()) {
                    c0Var.u();
                    return;
                }
                final b5 b5VarF = q4.f(0, c0Var, 0, 1);
                final PostActivityV2 postActivityV2 = PostActivityV2.this;
                IntercomThemeKt.IntercomTheme(null, null, null, w.e(1349674692, true, new Function2<c0, Integer, Unit>() { // from class: io.intercom.android.sdk.post.PostActivityV2.onCreate.1.1

                    /* JADX INFO: renamed from: io.intercom.android.sdk.post.PostActivityV2$onCreate$1$1$1, reason: invalid class name and collision with other inner class name */
                    @kotlin.coroutines.jvm.internal.f(c = "io.intercom.android.sdk.post.PostActivityV2$onCreate$1$1$1", f = "PostActivityV2.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
                    static final class C20321 extends kotlin.coroutines.jvm.internal.o implements Function2<s0, kotlin.coroutines.d<? super Unit>, Object> {
                        int label;
                        final /* synthetic */ PostActivityV2 this$0;

                        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                        C20321(PostActivityV2 postActivityV2, kotlin.coroutines.d<? super C20321> dVar) {
                            super(2, dVar);
                            this.this$0 = postActivityV2;
                        }

                        @Override // kotlin.coroutines.jvm.internal.a
                        public final kotlin.coroutines.d<Unit> create(Object obj, kotlin.coroutines.d<?> dVar) {
                            return new C20321(this.this$0, dVar);
                        }

                        @Override // kotlin.coroutines.jvm.internal.a
                        public final Object invokeSuspend(Object obj) {
                            kotlin.coroutines.intrinsics.b.l();
                            if (this.label != 0) {
                                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                            }
                            ResultKt.m(obj);
                            this.this$0.sendPostAsRead();
                            return Unit.f312394a;
                        }

                        @Override // kotlin.jvm.functions.Function2
                        public final Object invoke(s0 s0Var, kotlin.coroutines.d<? super Unit> dVar) {
                            return ((C20321) create(s0Var, dVar)).invokeSuspend(Unit.f312394a);
                        }
                    }

                    /* JADX INFO: renamed from: io.intercom.android.sdk.post.PostActivityV2$onCreate$1$1$2, reason: invalid class name */
                    @SourceDebugExtension({"SMAP\nPostActivityV2.kt\nKotlin\n*S Kotlin\n*F\n+ 1 PostActivityV2.kt\nio/intercom/android/sdk/post/PostActivityV2$onCreate$1$1$2\n+ 2 CompositionLocal.kt\nandroidx/compose/runtime/CompositionLocal\n*L\n1#1,329:1\n75#2:330\n*S KotlinDebug\n*F\n+ 1 PostActivityV2.kt\nio/intercom/android/sdk/post/PostActivityV2$onCreate$1$1$2\n*L\n92#1:330\n*E\n"})
                    static final class AnonymousClass2 implements Function2<c0, Integer, Unit> {
                        final /* synthetic */ Part $part;
                        final /* synthetic */ PostActivityV2 this$0;

                        AnonymousClass2(Part part, PostActivityV2 postActivityV2) {
                            this.$part = part;
                            this.this$0 = postActivityV2;
                        }

                        /* JADX INFO: Access modifiers changed from: private */
                        public static final Unit invoke$lambda$0(PostActivityV2 this$0) {
                            Intrinsics.checkNotNullParameter(this$0, "this$0");
                            this$0.finish();
                            return Unit.f312394a;
                        }

                        @Override // kotlin.jvm.functions.Function2
                        public /* bridge */ /* synthetic */ Unit invoke(c0 c0Var, Integer num) {
                            invoke(c0Var, num.intValue());
                            return Unit.f312394a;
                        }

                        @o
                        @t(applier = "androidx.compose.ui.UiComposable")
                        public final void invoke(c0 c0Var, int i10) {
                            if ((i10 & 11) == 2 && c0Var.d()) {
                                c0Var.u();
                                return;
                            }
                            CharSequence charSequence = Phrase.from((Context) c0Var.W(AndroidCompositionLocals_androidKt.g()), R.string.intercom_teammate_from_company).put("name", this.$part.getParticipant().getForename()).put("company", ((AppConfig) this.this$0.getAppConfigProvider().get()).getName()).format();
                            a0.a aVar = a0.E;
                            Avatar avatar = this.$part.getParticipant().getAvatar();
                            Intrinsics.checkNotNullExpressionValue(avatar, "getAvatar(...)");
                            String string = charSequence.toString();
                            String userStatus = this.this$0.getUserStatus();
                            final PostActivityV2 postActivityV2 = this.this$0;
                            PostActivityV2Kt.TopBar(aVar, avatar, string, userStatus, new Function0() { // from class: io.intercom.android.sdk.post.d
                                @Override // kotlin.jvm.functions.Function0
                                public final Object invoke() {
                                    return PostActivityV2.AnonymousClass1.C20311.AnonymousClass2.invoke$lambda$0(postActivityV2);
                                }
                            }, c0Var, 70);
                        }
                    }

                    @Override // kotlin.jvm.functions.Function2
                    public /* bridge */ /* synthetic */ Unit invoke(c0 c0Var2, Integer num) {
                        invoke(c0Var2, num.intValue());
                        return Unit.f312394a;
                    }

                    @o
                    @t(applier = "androidx.compose.ui.UiComposable")
                    public final void invoke(c0 c0Var2, int i11) {
                        if ((i11 & 11) == 2 && c0Var2.d()) {
                            c0Var2.u();
                            return;
                        }
                        b2.i("", new C20321(postActivityV2, null), c0Var2, 70);
                        final Part part = postActivityV2.getPart();
                        long jA = q0.f38131b.a();
                        androidx.compose.runtime.internal.c cVarE = w.e(-1416328832, true, new AnonymousClass2(part, postActivityV2), c0Var2, 54);
                        final PostActivityV2 postActivityV3 = postActivityV2;
                        androidx.compose.runtime.internal.c cVarE2 = w.e(294322015, true, new Function2<c0, Integer, Unit>() { // from class: io.intercom.android.sdk.post.PostActivityV2.onCreate.1.1.3
                            @Override // kotlin.jvm.functions.Function2
                            public /* bridge */ /* synthetic */ Unit invoke(c0 c0Var3, Integer num) {
                                invoke(c0Var3, num.intValue());
                                return Unit.f312394a;
                            }

                            @o
                            @t(applier = "androidx.compose.ui.UiComposable")
                            public final void invoke(c0 c0Var3, int i12) {
                                if ((i12 & 11) == 2 && c0Var3.d()) {
                                    c0Var3.u();
                                    return;
                                }
                                if (postActivityV3.isPreview()) {
                                    Part part2 = part;
                                    PostActivityV2 postActivityV4 = postActivityV3;
                                    a0.a aVar = a0.E;
                                    a1 a1VarB = j0.b(q.f16330a.y(), androidx.compose.ui.e.f37317a.u(), c0Var3, 0);
                                    int iHashCode = Long.hashCode(v.l(c0Var3, 0));
                                    b1 b1VarK = c0Var3.k();
                                    a0 a0VarN = m.n(c0Var3, aVar);
                                    androidx.compose.ui.node.g.a aVar2 = androidx.compose.ui.node.g.I;
                                    Function0<androidx.compose.ui.node.g> function0A = aVar2.a();
                                    if (c0Var3.S() == null) {
                                        v.r();
                                    }
                                    c0Var3.q();
                                    if (c0Var3.P()) {
                                        c0Var3.q0(function0A);
                                    } else {
                                        c0Var3.l();
                                    }
                                    c0 c0VarD = y7.d(c0Var3);
                                    y7.n(c0VarD, a1VarB, aVar2.e());
                                    y7.n(c0VarD, b1VarK, aVar2.g());
                                    Function2<androidx.compose.ui.node.g, Integer, Unit> function2B = aVar2.b();
                                    if (c0VarD.P() || !Intrinsics.areEqual(c0VarD.i0(), Integer.valueOf(iHashCode))) {
                                        c0VarD.Y(Integer.valueOf(iHashCode));
                                        c0VarD.f(Integer.valueOf(iHashCode), function2B);
                                    }
                                    y7.n(c0VarD, a0VarN, aVar2.f());
                                    n0 n0Var = n0.f16227a;
                                    ld.h(null, androidx.compose.ui.unit.h.r((float) 0.65d), androidx.compose.ui.graphics.s0.d(2594086558L), c0Var3, 432, 1);
                                    PostActivityV2Kt.BottomBarContent(aVar, w.e(-391111001, true, new PostActivityV2$onCreate$1$1$3$1$1(part2, postActivityV4), c0Var3, 54), c0Var3, 54);
                                    c0Var3.o();
                                }
                            }
                        }, c0Var2, 54);
                        final b5 b5Var = b5VarF;
                        pt.f(null, cVarE, cVarE2, null, null, 0, jA, 0L, null, w.e(-1777074859, true, new n<g5, c0, Integer, Unit>() { // from class: io.intercom.android.sdk.post.PostActivityV2.onCreate.1.1.4
                            @Override // pj.n
                            public /* bridge */ /* synthetic */ Unit invoke(g5 g5Var, c0 c0Var3, Integer num) {
                                invoke(g5Var, c0Var3, num.intValue());
                                return Unit.f312394a;
                            }

                            @o
                            @t(applier = "androidx.compose.ui.UiComposable")
                            public final void invoke(g5 contentPadding, c0 c0Var3, int i12) {
                                List<Block> list;
                                int i13;
                                float fR;
                                BlockType type;
                                Intrinsics.checkNotNullParameter(contentPadding, "contentPadding");
                                if ((((i12 & 14) == 0 ? i12 | (c0Var3.D(contentPadding) ? 4 : 2) : i12) & 91) == 18 && c0Var3.d()) {
                                    c0Var3.u();
                                    return;
                                }
                                a0.a aVar = a0.E;
                                int i14 = 16;
                                float f10 = 16;
                                a0 a0VarV = d5.v(d5.p(q4.m(aVar, b5Var, true, null, false, 12, null), contentPadding), androidx.compose.ui.unit.h.r(f10), 0.0f, androidx.compose.ui.unit.h.r(f10), androidx.compose.ui.unit.h.r(f10), 2, null);
                                Part part2 = part;
                                int i15 = 0;
                                a1 a1VarB = j0.b(q.f16330a.y(), androidx.compose.ui.e.f37317a.u(), c0Var3, 0);
                                int iHashCode = Long.hashCode(v.l(c0Var3, 0));
                                b1 b1VarK = c0Var3.k();
                                a0 a0VarN = m.n(c0Var3, a0VarV);
                                androidx.compose.ui.node.g.a aVar2 = androidx.compose.ui.node.g.I;
                                Function0<androidx.compose.ui.node.g> function0A = aVar2.a();
                                if (c0Var3.S() == null) {
                                    v.r();
                                }
                                c0Var3.q();
                                if (c0Var3.P()) {
                                    c0Var3.q0(function0A);
                                } else {
                                    c0Var3.l();
                                }
                                c0 c0VarD = y7.d(c0Var3);
                                y7.n(c0VarD, a1VarB, aVar2.e());
                                y7.n(c0VarD, b1VarK, aVar2.g());
                                Function2<androidx.compose.ui.node.g, Integer, Unit> function2B = aVar2.b();
                                if (c0VarD.P() || !Intrinsics.areEqual(c0VarD.i0(), Integer.valueOf(iHashCode))) {
                                    c0VarD.Y(Integer.valueOf(iHashCode));
                                    c0VarD.f(Integer.valueOf(iHashCode), function2B);
                                }
                                y7.n(c0VarD, a0VarN, aVar2.f());
                                n0 n0Var = n0.f16227a;
                                l6.a(i6.i(aVar, androidx.compose.ui.unit.h.r(8)), c0Var3, 6);
                                List<Block> blocks = part2.getBlocks();
                                if (blocks == null) {
                                    blocks = CollectionsKt.emptyList();
                                }
                                c0Var3.E(-1177115769);
                                int i16 = 0;
                                for (Object obj : blocks) {
                                    int i17 = i16 + 1;
                                    if (i16 < 0) {
                                        CollectionsKt.throwIndexOverflow();
                                    }
                                    Block block = (Block) obj;
                                    a0.a aVar3 = a0.E;
                                    a0 a0VarH = i6.h(aVar3, 0.0f, 1, null);
                                    Intrinsics.checkNotNull(block);
                                    q0.a aVar4 = q0.f38131b;
                                    q0 q0VarN = q0.n(aVar4.w());
                                    long jW = aVar4.w();
                                    v0.a aVar5 = v0.f41742b;
                                    BlockRenderData blockRenderData = new BlockRenderData(block, q0VarN, new BlockRenderTextStyle(androidx.compose.ui.unit.a0.m(24), aVar5.c(), androidx.compose.ui.unit.a0.m(36), q0.n(jW), null, null, 48, null), new BlockRenderTextStyle(androidx.compose.ui.unit.a0.m(i14), aVar5.m(), androidx.compose.ui.unit.a0.m(36), q0.n(aVar4.w()), null, null, 48, null), new BlockRenderTextStyle(androidx.compose.ui.unit.a0.m(i14), aVar5.m(), androidx.compose.ui.unit.a0.m(24), q0.n(aVar4.w()), null, j.h(j.f42206b.c()), 16, null), null);
                                    List<Block> list2 = blocks;
                                    float f11 = f10;
                                    int i18 = i16;
                                    int i19 = i14;
                                    BlockViewKt.BlockView(a0VarH, blockRenderData, false, null, false, null, ImageRenderType.FULL, null, null, false, null, null, c0Var3, 1572934, 0, 4028);
                                    if (i18 == CollectionsKt.getLastIndex(list2)) {
                                        fR = androidx.compose.ui.unit.h.r(56);
                                        list = list2;
                                        i16 = i17;
                                        i13 = 0;
                                    } else {
                                        BlockType type2 = block.getType();
                                        BlockType blockType = BlockType.PARAGRAPH;
                                        i16 = i17;
                                        if (type2 == blockType) {
                                            Block block2 = (Block) CollectionsKt.getOrNull(list, i16);
                                            if (block2 != null) {
                                                list = list2;
                                                type = block2.getType();
                                            } else {
                                                list = list2;
                                                type = null;
                                            }
                                            i13 = 0;
                                            if (type == blockType) {
                                                fR = androidx.compose.ui.unit.h.r(0);
                                            }
                                        } else {
                                            list = list2;
                                            i13 = 0;
                                        }
                                        fR = androidx.compose.ui.unit.h.r(f11);
                                    }
                                    l6.a(i6.i(aVar3, fR), c0Var3, i13);
                                    i15 = i13;
                                    blocks = list;
                                    i14 = i19;
                                    f10 = f11;
                                }
                                c0Var3.A();
                                c0Var3.o();
                            }
                        }, c0Var2, 54), c0Var2, 806879664, 441);
                    }
                }, c0Var, 54), c0Var, 3072, 7);
            }
        }), 1, null);
    }
}
