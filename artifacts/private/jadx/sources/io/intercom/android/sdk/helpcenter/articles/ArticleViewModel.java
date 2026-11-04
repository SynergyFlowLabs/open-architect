package io.intercom.android.sdk.helpcenter.articles;

import androidx.compose.runtime.internal.w0;
import androidx.lifecycle.f2;
import androidx.lifecycle.g2;
import androidx.lifecycle.j2;
import androidx.lifecycle.m2;
import io.intercom.android.sdk.Injector;
import io.intercom.android.sdk.R;
import io.intercom.android.sdk.api.MessengerApi;
import io.intercom.android.sdk.articles.ArticleWebViewListener;
import io.intercom.android.sdk.helpcenter.api.HelpCenterApi;
import io.intercom.android.sdk.helpcenter.component.TeammateHelpKt;
import io.intercom.android.sdk.helpcenter.utils.networking.NetworkResponse;
import io.intercom.android.sdk.identity.AppConfig;
import io.intercom.android.sdk.m5.data.CommonRepository;
import io.intercom.android.sdk.m5.data.IntercomDataLayer;
import io.intercom.android.sdk.m5.data.IntercomEvent;
import io.intercom.android.sdk.metrics.MetricTracker;
import io.intercom.android.sdk.models.Conversation;
import io.intercom.android.sdk.models.OpenMessengerResponse;
import io.intercom.android.sdk.ui.theme.ThemeManager;
import io.intercom.android.sdk.ui.theme.ThemeMode;
import io.intercom.android.sdk.utilities.extensions.AppConfigExtensionsKt;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlinx.coroutines.flow.b1;
import kotlinx.coroutines.flow.k0;
import kotlinx.coroutines.flow.o0;
import kotlinx.coroutines.flow.z0;
import kotlinx.coroutines.l1;
import kotlinx.coroutines.n0;
import kotlinx.coroutines.s0;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes13.dex */
@w0(parameters = 0)
public final class ArticleViewModel extends f2 implements ArticleWebViewListener {
    public static final int HAPPY_SERVER_INDEX = 0;
    public static final int NEUTRAL_SERVER_INDEX = 1;
    public static final int SAD_SERVER_INDEX = 2;

    @NotNull
    private final k0<ArticleViewState> _state;

    @NotNull
    private final AppConfig appConfig;

    @NotNull
    private String articleContentId;

    @NotNull
    private String articleId;

    @NotNull
    private final String baseUrl;

    @NotNull
    private final CommonRepository commonRepository;

    @NotNull
    private final n0 dispatcher;

    @NotNull
    private final HelpCenterApi helpCenterApi;

    @NotNull
    private final IntercomDataLayer intercomDataLayer;
    private final boolean isFromSearchBrowse;
    private final boolean isSystemInDarkTheme;

    @NotNull
    private final MetricTracker metricTracker;

    @NotNull
    private final Function1<Integer, Unit> scrollTo;
    private final boolean shouldHideReactions;

    @NotNull
    private final z0<ArticleViewState> state;

    @NotNull
    public static final Companion Companion = new Companion(null);
    public static final int $stable = 8;

    /* JADX INFO: renamed from: io.intercom.android.sdk.helpcenter.articles.ArticleViewModel$1, reason: invalid class name */
    @kotlin.coroutines.jvm.internal.f(c = "io.intercom.android.sdk.helpcenter.articles.ArticleViewModel$1", f = "ArticleViewModel.kt", i = {}, l = {com.planner5d.library.engine.input.f.b.f160725s}, m = "invokeSuspend", n = {}, s = {})
    @SourceDebugExtension({"SMAP\nArticleViewModel.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ArticleViewModel.kt\nio/intercom/android/sdk/helpcenter/articles/ArticleViewModel$1\n+ 2 Transform.kt\nkotlinx/coroutines/flow/FlowKt__TransformKt\n+ 3 Emitters.kt\nkotlinx/coroutines/flow/FlowKt__EmittersKt\n+ 4 SafeCollector.common.kt\nkotlinx/coroutines/flow/internal/SafeCollector_commonKt\n*L\n1#1,380:1\n32#2:381\n17#2:382\n19#2:386\n46#3:383\n51#3:385\n105#4:384\n*S KotlinDebug\n*F\n+ 1 ArticleViewModel.kt\nio/intercom/android/sdk/helpcenter/articles/ArticleViewModel$1\n*L\n72#1:381\n72#1:382\n72#1:386\n72#1:383\n72#1:385\n72#1:384\n*E\n"})
    static final class AnonymousClass1 extends kotlin.coroutines.jvm.internal.o implements Function2<s0, kotlin.coroutines.d<? super Unit>, Object> {
        int label;

        AnonymousClass1(kotlin.coroutines.d<? super AnonymousClass1> dVar) {
            super(2, dVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final kotlin.coroutines.d<Unit> create(Object obj, kotlin.coroutines.d<?> dVar) {
            return ArticleViewModel.this.new AnonymousClass1(dVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            Object objL = kotlin.coroutines.intrinsics.b.l();
            int i10 = this.label;
            if (i10 == 0) {
                ResultKt.m(obj);
                final o0<IntercomEvent> event = ArticleViewModel.this.intercomDataLayer.getEvent();
                kotlinx.coroutines.flow.i<Object> iVar = new kotlinx.coroutines.flow.i<Object>() { // from class: io.intercom.android.sdk.helpcenter.articles.ArticleViewModel$1$invokeSuspend$$inlined$filterIsInstance$1

                    /* JADX INFO: renamed from: io.intercom.android.sdk.helpcenter.articles.ArticleViewModel$1$invokeSuspend$$inlined$filterIsInstance$1$2, reason: invalid class name */
                    @SourceDebugExtension({"SMAP\nEmitters.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Emitters.kt\nkotlinx/coroutines/flow/FlowKt__EmittersKt$unsafeTransform$1$1\n+ 2 Transform.kt\nkotlinx/coroutines/flow/FlowKt__TransformKt\n*L\n1#1,218:1\n18#2:219\n32#2:220\n19#2:221\n*E\n"})
                    public static final class AnonymousClass2<T> implements kotlinx.coroutines.flow.j {
                        final /* synthetic */ kotlinx.coroutines.flow.j $this_unsafeFlow;

                        /* JADX INFO: renamed from: io.intercom.android.sdk.helpcenter.articles.ArticleViewModel$1$invokeSuspend$$inlined$filterIsInstance$1$2$1, reason: invalid class name */
                        @kotlin.coroutines.jvm.internal.f(c = "io.intercom.android.sdk.helpcenter.articles.ArticleViewModel$1$invokeSuspend$$inlined$filterIsInstance$1$2", f = "ArticleViewModel.kt", i = {}, l = {219}, m = "emit", n = {}, s = {})
                        public static final class AnonymousClass1 extends kotlin.coroutines.jvm.internal.d {
                            Object L$0;
                            Object L$1;
                            int label;
                            /* synthetic */ Object result;

                            public AnonymousClass1(kotlin.coroutines.d dVar) {
                                super(dVar);
                            }

                            @Override // kotlin.coroutines.jvm.internal.a
                            @Nullable
                            public final Object invokeSuspend(@NotNull Object obj) {
                                this.result = obj;
                                this.label |= Integer.MIN_VALUE;
                                return AnonymousClass2.this.emit(null, this);
                            }
                        }

                        public AnonymousClass2(kotlinx.coroutines.flow.j jVar) {
                            this.$this_unsafeFlow = jVar;
                        }

                        /* JADX WARN: Code duplicated, block: B:7:0x0019  */
                        @Override // kotlinx.coroutines.flow.j
                        @Nullable
                        public final Object emit(Object obj, @NotNull kotlin.coroutines.d dVar) {
                            AnonymousClass1 anonymousClass1;
                            if (dVar instanceof AnonymousClass1) {
                                anonymousClass1 = (AnonymousClass1) dVar;
                                int i10 = anonymousClass1.label;
                                if ((i10 & Integer.MIN_VALUE) != 0) {
                                    anonymousClass1.label = i10 - Integer.MIN_VALUE;
                                } else {
                                    anonymousClass1 = new AnonymousClass1(dVar);
                                }
                            } else {
                                anonymousClass1 = new AnonymousClass1(dVar);
                            }
                            Object obj2 = anonymousClass1.result;
                            Object objL = kotlin.coroutines.intrinsics.b.l();
                            int i11 = anonymousClass1.label;
                            if (i11 == 0) {
                                ResultKt.m(obj2);
                                kotlinx.coroutines.flow.j jVar = this.$this_unsafeFlow;
                                if (obj instanceof IntercomEvent.NewConversation) {
                                    anonymousClass1.label = 1;
                                    if (jVar.emit(obj, anonymousClass1) == objL) {
                                        return objL;
                                    }
                                }
                            } else {
                                if (i11 != 1) {
                                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                                }
                                ResultKt.m(obj2);
                            }
                            return Unit.f312394a;
                        }
                    }

                    @Override // kotlinx.coroutines.flow.i
                    @Nullable
                    public Object collect(@NotNull kotlinx.coroutines.flow.j<? super Object> jVar, @NotNull kotlin.coroutines.d dVar) {
                        Object objCollect = event.collect(new AnonymousClass2(jVar), dVar);
                        return objCollect == kotlin.coroutines.intrinsics.b.l() ? objCollect : Unit.f312394a;
                    }
                };
                final ArticleViewModel articleViewModel = ArticleViewModel.this;
                kotlinx.coroutines.flow.j<? super Object> jVar = new kotlinx.coroutines.flow.j() { // from class: io.intercom.android.sdk.helpcenter.articles.ArticleViewModel.1.1
                    public final Object emit(IntercomEvent.NewConversation newConversation, kotlin.coroutines.d<? super Unit> dVar) {
                        articleViewModel.updateTeamPresence(newConversation.getConversation());
                        return Unit.f312394a;
                    }

                    @Override // kotlinx.coroutines.flow.j
                    public /* bridge */ /* synthetic */ Object emit(Object obj2, kotlin.coroutines.d dVar) {
                        return emit((IntercomEvent.NewConversation) obj2, (kotlin.coroutines.d<? super Unit>) dVar);
                    }
                };
                this.label = 1;
                if (iVar.collect(jVar, this) == objL) {
                    return objL;
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
        public final Object invoke(s0 s0Var, kotlin.coroutines.d<? super Unit> dVar) {
            return ((AnonymousClass1) create(s0Var, dVar)).invokeSuspend(Unit.f312394a);
        }
    }

    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* JADX WARN: Type inference failed for: r1v1, types: [io.intercom.android.sdk.helpcenter.articles.ArticleViewModel$Companion$factory$1] */
        public final ArticleViewModel$Companion$factory$1 factory(final HelpCenterApi helpCenterApi, final String str, final String str2, final boolean z10, final boolean z11, final Function1<? super Integer, Unit> function1, final boolean z12) {
            return new j2.c() { // from class: io.intercom.android.sdk.helpcenter.articles.ArticleViewModel$Companion$factory$1
                @Override // androidx.lifecycle.j2.c
                public <T extends f2> T create(Class<T> modelClass) {
                    Intrinsics.checkNotNullParameter(modelClass, "modelClass");
                    IntercomDataLayer dataLayer = Injector.get().getDataLayer();
                    AppConfig appConfig = Injector.get().getAppConfigProvider().get();
                    Intrinsics.checkNotNullExpressionValue(appConfig, "get(...)");
                    AppConfig appConfig2 = appConfig;
                    MetricTracker metricTracker = Injector.get().getMetricTracker();
                    Intrinsics.checkNotNullExpressionValue(metricTracker, "getMetricTracker(...)");
                    Intrinsics.checkNotNull(dataLayer);
                    MessengerApi messengerApi = Injector.get().getMessengerApi();
                    Intrinsics.checkNotNullExpressionValue(messengerApi, "getMessengerApi(...)");
                    return new ArticleViewModel(helpCenterApi, str, appConfig2, metricTracker, str2, z10, z11, null, dataLayer, new CommonRepository(messengerApi, dataLayer), function1, z12, 128, null);
                }
            };
        }

        @NotNull
        public final ArticleViewModel create(@NotNull m2 owner, @NotNull HelpCenterApi helpCenterApi, @NotNull String baseUrl, @NotNull String metricPlace, boolean z10, boolean z11, @NotNull Function1<? super Integer, Unit> scrollTo, boolean z12) {
            Intrinsics.checkNotNullParameter(owner, "owner");
            Intrinsics.checkNotNullParameter(helpCenterApi, "helpCenterApi");
            Intrinsics.checkNotNullParameter(baseUrl, "baseUrl");
            Intrinsics.checkNotNullParameter(metricPlace, "metricPlace");
            Intrinsics.checkNotNullParameter(scrollTo, "scrollTo");
            return (ArticleViewModel) new j2(owner, factory(helpCenterApi, baseUrl, metricPlace, z10, z11, scrollTo, z12)).c(ArticleViewModel.class);
        }

        private Companion() {
        }
    }

    public /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[ThemeMode.values().length];
            try {
                iArr[ThemeMode.DARK.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[ThemeMode.LIGHT.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[ThemeMode.SYSTEM.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    /* JADX INFO: renamed from: io.intercom.android.sdk.helpcenter.articles.ArticleViewModel$fragmentLoaded$1, reason: invalid class name and case insensitive filesystem */
    @kotlin.coroutines.jvm.internal.f(c = "io.intercom.android.sdk.helpcenter.articles.ArticleViewModel$fragmentLoaded$1", f = "ArticleViewModel.kt", i = {}, l = {com.planner5d.library.engine.input.f.b.f160733u1}, m = "invokeSuspend", n = {}, s = {})
    static final class C27741 extends kotlin.coroutines.jvm.internal.o implements Function2<s0, kotlin.coroutines.d<? super Unit>, Object> {
        final /* synthetic */ String $articleId;
        final /* synthetic */ ArticleViewState.Content $defaultState;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C27741(String str, ArticleViewState.Content content, kotlin.coroutines.d<? super C27741> dVar) {
            super(2, dVar);
            this.$articleId = str;
            this.$defaultState = content;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final kotlin.coroutines.d<Unit> create(Object obj, kotlin.coroutines.d<?> dVar) {
            return ArticleViewModel.this.new C27741(this.$articleId, this.$defaultState, dVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            Object objFetchArticle$default;
            Object objL = kotlin.coroutines.intrinsics.b.l();
            int i10 = this.label;
            if (i10 == 0) {
                ResultKt.m(obj);
                HelpCenterApi helpCenterApi = ArticleViewModel.this.helpCenterApi;
                String str = this.$articleId;
                this.label = 1;
                objFetchArticle$default = HelpCenterApi.DefaultImpls.fetchArticle$default(helpCenterApi, str, null, this, 2, null);
                if (objFetchArticle$default == objL) {
                    return objL;
                }
            } else {
                if (i10 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.m(obj);
                objFetchArticle$default = obj;
            }
            NetworkResponse networkResponse = (NetworkResponse) objFetchArticle$default;
            if ((networkResponse instanceof NetworkResponse.ClientError) || (networkResponse instanceof NetworkResponse.NetworkError) || (networkResponse instanceof NetworkResponse.ServerError)) {
                ArticleViewModel.this._state.setValue(ArticleViewState.Content.copy$default(this.$defaultState, null, null, ArticleViewState.WebViewStatus.Idle, null, null, 27, null));
            } else {
                if (!(networkResponse instanceof NetworkResponse.Success)) {
                    throw new kotlin.k0();
                }
                NetworkResponse.Success success = (NetworkResponse.Success) networkResponse;
                String relatedConversationId = ((ArticleResponse) success.getBody()).getArticle().getRelatedConversationId();
                ArticleViewState.TeamPresenceState teamPresenceStateCopy$default = relatedConversationId != null ? ArticleViewState.TeamPresenceState.copy$default(ArticleViewState.TeamPresenceState.Companion.getDefaultTeamPresenceState(), null, new ArticleViewState.ConversationState(relatedConversationId, 0, 2, null), null, 0, 0, 0, null, null, false, null, 1021, null) : null;
                k0 k0Var = ArticleViewModel.this._state;
                ArticleViewState.WebViewStatus webViewStatus = ArticleViewState.WebViewStatus.Idle;
                if (teamPresenceStateCopy$default == null) {
                    teamPresenceStateCopy$default = ArticleViewState.TeamPresenceState.Companion.getDefaultTeamPresenceState();
                }
                k0Var.setValue(ArticleViewState.Content.copy$default(this.$defaultState, null, new ArticleMetadata(((ArticleResponse) success.getBody()).getArticle().getCard().getArticleId(), ((ArticleResponse) success.getBody()).getArticle().getCard().getTitle()), webViewStatus, null, teamPresenceStateCopy$default, 9, null));
            }
            return Unit.f312394a;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(s0 s0Var, kotlin.coroutines.d<? super Unit> dVar) {
            return ((C27741) create(s0Var, dVar)).invokeSuspend(Unit.f312394a);
        }
    }

    /* JADX INFO: renamed from: io.intercom.android.sdk.helpcenter.articles.ArticleViewModel$sadReactionTapped$1, reason: invalid class name and case insensitive filesystem */
    @kotlin.coroutines.jvm.internal.f(c = "io.intercom.android.sdk.helpcenter.articles.ArticleViewModel$sadReactionTapped$1", f = "ArticleViewModel.kt", i = {0, 0, 0, 0, 0}, l = {198}, m = "invokeSuspend", n = {"$this$invokeSuspend_u24lambda_u240", "teamPresenceState", "transitionState", "teamHelpVisibility", "shouldScrollToBottom"}, s = {"L$0", "L$1", "I$0", "I$1", "I$2"})
    static final class C27751 extends kotlin.coroutines.jvm.internal.o implements Function2<s0, kotlin.coroutines.d<? super Unit>, Object> {
        int I$0;
        int I$1;
        int I$2;
        Object L$0;
        Object L$1;
        Object L$2;
        int label;

        C27751(kotlin.coroutines.d<? super C27751> dVar) {
            super(2, dVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final kotlin.coroutines.d<Unit> create(Object obj, kotlin.coroutines.d<?> dVar) {
            return ArticleViewModel.this.new C27751(dVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            k0 k0Var;
            Object objOpenMessenger;
            ArticleViewState.Content content;
            int i10;
            ArticleViewState.TeamPresenceState teamPresenceStateCopy$default;
            int i11;
            int i12;
            Object objL = kotlin.coroutines.intrinsics.b.l();
            int i13 = this.label;
            if (i13 == 0) {
                ResultKt.m(obj);
                ArticleViewState articleViewState = (ArticleViewState) ArticleViewModel.this._state.getValue();
                if (articleViewState instanceof ArticleViewState.Content) {
                    k0Var = ArticleViewModel.this._state;
                    ArticleViewModel articleViewModel = ArticleViewModel.this;
                    ArticleViewState.Content content2 = (ArticleViewState.Content) articleViewState;
                    articleViewModel.metricTracker.sentArticleReaction(MetricTracker.Context.REACTION_SAD, kotlin.coroutines.jvm.internal.b.a(articleViewModel.appConfig.isInboundMessages()), articleViewModel.isFromSearchBrowse);
                    articleViewModel.sendReactionToServer(articleViewModel.articleId, articleViewModel.articleContentId, 2);
                    int i14 = R.id.sad_end;
                    boolean zShouldAddSendMessageRow = articleViewModel.shouldAddSendMessageRow();
                    int i15 = zShouldAddSendMessageRow ? 0 : 8;
                    ArticleViewState.TeamPresenceState teamPresenceStateComputeViewState = TeammateHelpKt.computeViewState(content2.getArticleMetadata(), content2.getTeamPresenceState(), articleViewModel.intercomDataLayer.getTeamPresence().getValue(), articleViewModel.appConfig, "article", articleViewModel.isFromSearchBrowse);
                    CommonRepository commonRepository = articleViewModel.commonRepository;
                    this.L$0 = content2;
                    this.L$1 = teamPresenceStateComputeViewState;
                    this.L$2 = k0Var;
                    this.I$0 = i14;
                    this.I$1 = i15;
                    this.I$2 = zShouldAddSendMessageRow ? 1 : 0;
                    this.label = 1;
                    objOpenMessenger = commonRepository.openMessenger(this);
                    if (objOpenMessenger == objL) {
                        return objL;
                    }
                    content = content2;
                    i10 = zShouldAddSendMessageRow ? 1 : 0;
                    teamPresenceStateCopy$default = teamPresenceStateComputeViewState;
                    i11 = i14;
                    i12 = i15;
                } else if (!Intrinsics.areEqual(articleViewState, ArticleViewState.Initial.INSTANCE) && !(articleViewState instanceof ArticleViewState.Error)) {
                    throw new kotlin.k0();
                }
                return Unit.f312394a;
            }
            if (i13 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            i10 = this.I$2;
            int i16 = this.I$1;
            int i17 = this.I$0;
            k0Var = (k0) this.L$2;
            ArticleViewState.TeamPresenceState teamPresenceState = (ArticleViewState.TeamPresenceState) this.L$1;
            ArticleViewState.Content content3 = (ArticleViewState.Content) this.L$0;
            ResultKt.m(obj);
            i12 = i16;
            i11 = i17;
            teamPresenceStateCopy$default = teamPresenceState;
            content = content3;
            objOpenMessenger = obj;
            k0 k0Var2 = k0Var;
            OpenMessengerResponse openMessengerResponse = (OpenMessengerResponse) objOpenMessenger;
            if ((openMessengerResponse != null ? openMessengerResponse.getNewConversationData() : null) != null) {
                teamPresenceStateCopy$default = ArticleViewState.TeamPresenceState.copy$default(teamPresenceStateCopy$default, null, null, null, 0, 0, 0, null, null, false, openMessengerResponse.getNewConversationData().getCta(), 511, null);
            }
            k0Var2.setValue(ArticleViewState.Content.copy$default(content, null, null, null, ArticleViewState.ReactionState.copy$default(content.getReactionState(), 0, i11, ArticleViewState.Reaction.Sad, i12, i10 != 0, 1, null), teamPresenceStateCopy$default, 7, null));
            return Unit.f312394a;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(s0 s0Var, kotlin.coroutines.d<? super Unit> dVar) {
            return ((C27751) create(s0Var, dVar)).invokeSuspend(Unit.f312394a);
        }
    }

    /* JADX INFO: renamed from: io.intercom.android.sdk.helpcenter.articles.ArticleViewModel$sendReactionToServer$1, reason: invalid class name and case insensitive filesystem */
    @kotlin.coroutines.jvm.internal.f(c = "io.intercom.android.sdk.helpcenter.articles.ArticleViewModel$sendReactionToServer$1", f = "ArticleViewModel.kt", i = {}, l = {270}, m = "invokeSuspend", n = {}, s = {})
    static final class C27761 extends kotlin.coroutines.jvm.internal.o implements Function2<s0, kotlin.coroutines.d<? super Unit>, Object> {
        final /* synthetic */ String $articleContentId;
        final /* synthetic */ String $articleId;
        final /* synthetic */ int $reactionIndex;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C27761(String str, int i10, String str2, kotlin.coroutines.d<? super C27761> dVar) {
            super(2, dVar);
            this.$articleId = str;
            this.$reactionIndex = i10;
            this.$articleContentId = str2;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final kotlin.coroutines.d<Unit> create(Object obj, kotlin.coroutines.d<?> dVar) {
            return ArticleViewModel.this.new C27761(this.$articleId, this.$reactionIndex, this.$articleContentId, dVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            Object objL = kotlin.coroutines.intrinsics.b.l();
            int i10 = this.label;
            if (i10 == 0) {
                ResultKt.m(obj);
                HelpCenterApi helpCenterApi = ArticleViewModel.this.helpCenterApi;
                String str = this.$articleId;
                int i11 = this.$reactionIndex;
                String str2 = this.$articleContentId;
                String str3 = ArticleViewModel.this.isFromSearchBrowse ? "search_browse" : null;
                this.label = 1;
                if (HelpCenterApi.DefaultImpls.reactToArticle$default(helpCenterApi, str, i11, str2, false, str3, null, this, 40, null) == objL) {
                    return objL;
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
        public final Object invoke(s0 s0Var, kotlin.coroutines.d<? super Unit> dVar) {
            return ((C27761) create(s0Var, dVar)).invokeSuspend(Unit.f312394a);
        }
    }

    public /* synthetic */ ArticleViewModel(HelpCenterApi helpCenterApi, String str, AppConfig appConfig, MetricTracker metricTracker, String str2, boolean z10, boolean z11, n0 n0Var, IntercomDataLayer intercomDataLayer, CommonRepository commonRepository, Function1 function1, boolean z12, int i10, DefaultConstructorMarker defaultConstructorMarker) {
        this(helpCenterApi, str, appConfig, metricTracker, str2, (i10 & 32) != 0 ? false : z10, (i10 & 64) != 0 ? false : z11, (i10 & 128) != 0 ? l1.c() : n0Var, intercomDataLayer, commonRepository, function1, (i10 & 2048) != 0 ? false : z12);
    }

    private final void sendFailedMetric(Integer num) {
        this.metricTracker.failedHelpCenter(MetricTracker.Object.HELP_CENTER, "article", num != null ? num.toString() : null, this.isFromSearchBrowse);
    }

    static /* synthetic */ void sendFailedMetric$default(ArticleViewModel articleViewModel, Integer num, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            num = null;
        }
        articleViewModel.sendFailedMetric(num);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void sendReactionToServer(String str, String str2, int i10) {
        kotlinx.coroutines.k.f(g2.a(this), this.dispatcher, null, new C27761(str, i10, str2, null), 2, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final boolean shouldAddSendMessageRow() {
        return AppConfigExtensionsKt.canStartNewConversation(this.appConfig) && this.appConfig.getArticleAutoReactionEnabled();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void updateTeamPresence(Conversation conversation) {
        ArticleViewState value = this._state.getValue();
        if (value instanceof ArticleViewState.Content) {
            ArticleViewState.Content content = (ArticleViewState.Content) value;
            if (content.getReactionState().getTransitionState() == R.id.sad_end) {
                this._state.setValue(ArticleViewState.Content.copy$default(content, null, null, null, null, ArticleViewState.TeamPresenceState.copy$default(content.getTeamPresenceState(), null, new ArticleViewState.ConversationState(conversation.getId(), 0, 2, null), null, 0, 0, 0, null, null, false, null, 1021, null), 15, null));
            }
        }
    }

    public final void articleContentIdFetched(@Nullable String str) {
        if (str != null) {
            this.articleContentId = str;
            ArticleViewState value = this._state.getValue();
            if (value instanceof ArticleViewState.Content) {
                ArticleViewState.Content content = (ArticleViewState.Content) value;
                this._state.setValue(ArticleViewState.Content.copy$default(content, null, null, null, ArticleViewState.ReactionState.copy$default(content.getReactionState(), this.shouldHideReactions ? 8 : 0, 0, null, 0, false, 30, null), null, 23, null));
            } else if (!Intrinsics.areEqual(value, ArticleViewState.Initial.INSTANCE) && !(value instanceof ArticleViewState.Error)) {
                throw new kotlin.k0();
            }
        }
    }

    @Override // io.intercom.android.sdk.articles.ArticleWebViewListener
    public void articleNotFound() {
        sendFailedMetric(404);
        this._state.setValue(new ArticleViewState.Error(R.string.intercom_page_not_found, 8, this.appConfig.getPrimaryColor()));
    }

    /* JADX WARN: Code duplicated, block: B:11:0x002f  */
    public final void fragmentLoaded(@NotNull String articleId) {
        Intrinsics.checkNotNullParameter(articleId, "articleId");
        this.articleId = articleId;
        int i10 = WhenMappings.$EnumSwitchMapping$0[ThemeManager.INSTANCE.getCurrentThemeMode().ordinal()];
        String str = "dark";
        if (i10 != 1) {
            if (i10 == 2) {
                str = "light";
            } else {
                if (i10 != 3) {
                    throw new kotlin.k0();
                }
                if (!this.isSystemInDarkTheme) {
                    str = "light";
                }
            }
        }
        ArticleViewState.Content content = new ArticleViewState.Content(this.baseUrl + "/articles/" + articleId + "?theme=" + str, new ArticleMetadata(articleId, null, 2, null), ArticleViewState.WebViewStatus.Loading, ArticleViewState.ReactionState.Companion.getDefaultReactionState(), ArticleViewState.TeamPresenceState.Companion.getDefaultTeamPresenceState());
        this._state.setValue(content);
        kotlinx.coroutines.k.f(g2.a(this), this.dispatcher, null, new C27741(articleId, content, null), 2, null);
    }

    @NotNull
    public final z0<ArticleViewState> getState() {
        return this.state;
    }

    public final void happyReactionTapped() {
        ArticleViewState value = this._state.getValue();
        if (!(value instanceof ArticleViewState.Content)) {
            if (!Intrinsics.areEqual(value, ArticleViewState.Initial.INSTANCE) && !(value instanceof ArticleViewState.Error)) {
                throw new kotlin.k0();
            }
        } else {
            k0<ArticleViewState> k0Var = this._state;
            ArticleViewState.Content content = (ArticleViewState.Content) value;
            this.metricTracker.sentArticleReaction(MetricTracker.Context.REACTION_HAPPY, null, this.isFromSearchBrowse);
            sendReactionToServer(this.articleId, this.articleContentId, 0);
            k0Var.setValue(ArticleViewState.Content.copy$default(content, null, null, null, ArticleViewState.ReactionState.copy$default(content.getReactionState(), 0, R.id.happy_end, ArticleViewState.Reaction.Happy, 8, false, 1, null), null, 23, null));
        }
    }

    public final void neutralReactionTapped() {
        ArticleViewState value = this._state.getValue();
        if (!(value instanceof ArticleViewState.Content)) {
            if (!Intrinsics.areEqual(value, ArticleViewState.Initial.INSTANCE) && !(value instanceof ArticleViewState.Error)) {
                throw new kotlin.k0();
            }
        } else {
            k0<ArticleViewState> k0Var = this._state;
            ArticleViewState.Content content = (ArticleViewState.Content) value;
            this.metricTracker.sentArticleReaction(MetricTracker.Context.REACTION_NEUTRAL, null, this.isFromSearchBrowse);
            sendReactionToServer(this.articleId, this.articleContentId, 1);
            int i10 = (3 >> 0) >> 0;
            k0Var.setValue(ArticleViewState.Content.copy$default(content, null, null, null, ArticleViewState.ReactionState.copy$default(content.getReactionState(), 0, R.id.neutral_end, ArticleViewState.Reaction.Neutral, 8, false, 1, null), null, 23, null));
        }
    }

    @Override // io.intercom.android.sdk.articles.ArticleWebViewListener
    public void onArticleFinishedLoading() {
        this.metricTracker.viewedNativeHelpCenter("article", null, this.isFromSearchBrowse);
        ArticleViewState value = this._state.getValue();
        if (value instanceof ArticleViewState.Content) {
            this._state.setValue(ArticleViewState.Content.copy$default((ArticleViewState.Content) value, null, null, ArticleViewState.WebViewStatus.Ready, null, null, 27, null));
        } else if (!Intrinsics.areEqual(value, ArticleViewState.Initial.INSTANCE) && !(value instanceof ArticleViewState.Error)) {
            throw new kotlin.k0();
        }
    }

    @Override // io.intercom.android.sdk.articles.ArticleWebViewListener
    public void onArticleLoadingError() {
        sendFailedMetric$default(this, null, 1, null);
        this._state.setValue(new ArticleViewState.Error(R.string.intercom_something_went_wrong_try_again, 0, this.appConfig.getPrimaryColor()));
    }

    @Override // io.intercom.android.sdk.articles.ArticleWebViewListener
    public void onArticleStartedLoading() {
        ArticleViewState value = this._state.getValue();
        if (value instanceof ArticleViewState.Content) {
            this._state.setValue(ArticleViewState.Content.copy$default((ArticleViewState.Content) value, null, null, ArticleViewState.WebViewStatus.Loading, null, null, 27, null));
        } else if (!Intrinsics.areEqual(value, ArticleViewState.Initial.INSTANCE) && !(value instanceof ArticleViewState.Error)) {
            throw new kotlin.k0();
        }
    }

    public final void sadReactionTapped() {
        kotlinx.coroutines.k.f(g2.a(this), this.dispatcher, null, new C27751(null), 2, null);
    }

    @Override // io.intercom.android.sdk.articles.ArticleWebViewListener
    public void scrollArticleViewTo(int i10) {
        this.scrollTo.invoke(Integer.valueOf(i10));
    }

    /* JADX WARN: Multi-variable type inference failed */
    public ArticleViewModel(@NotNull HelpCenterApi helpCenterApi, @NotNull String baseUrl, @NotNull AppConfig appConfig, @NotNull MetricTracker metricTracker, @NotNull String metricPlace, boolean z10, boolean z11, @NotNull n0 dispatcher, @NotNull IntercomDataLayer intercomDataLayer, @NotNull CommonRepository commonRepository, @NotNull Function1<? super Integer, Unit> scrollTo, boolean z12) {
        Intrinsics.checkNotNullParameter(helpCenterApi, "helpCenterApi");
        Intrinsics.checkNotNullParameter(baseUrl, "baseUrl");
        Intrinsics.checkNotNullParameter(appConfig, "appConfig");
        Intrinsics.checkNotNullParameter(metricTracker, "metricTracker");
        Intrinsics.checkNotNullParameter(metricPlace, "metricPlace");
        Intrinsics.checkNotNullParameter(dispatcher, "dispatcher");
        Intrinsics.checkNotNullParameter(intercomDataLayer, "intercomDataLayer");
        Intrinsics.checkNotNullParameter(commonRepository, "commonRepository");
        Intrinsics.checkNotNullParameter(scrollTo, "scrollTo");
        this.helpCenterApi = helpCenterApi;
        this.baseUrl = baseUrl;
        this.appConfig = appConfig;
        this.metricTracker = metricTracker;
        this.isFromSearchBrowse = z10;
        this.shouldHideReactions = z11;
        this.dispatcher = dispatcher;
        this.intercomDataLayer = intercomDataLayer;
        this.commonRepository = commonRepository;
        this.scrollTo = scrollTo;
        this.isSystemInDarkTheme = z12;
        k0<ArticleViewState> k0VarA = b1.a(ArticleViewState.Initial.INSTANCE);
        this._state = k0VarA;
        this.state = kotlinx.coroutines.flow.k.n(k0VarA);
        this.articleContentId = "";
        this.articleId = "";
        if (!Intrinsics.areEqual(metricPlace, MetricTracker.Place.COLLECTION_LIST)) {
            if (!Intrinsics.areEqual(metricPlace, "article")) {
                metricTracker.openedNativeHelpCenter(metricPlace, Intrinsics.areEqual(metricPlace, MetricTracker.Place.API) ? "article" : MetricTracker.Context.NO_CONTEXT);
            }
        }
        kotlinx.coroutines.k.f(g2.a(this), dispatcher, null, new AnonymousClass1(null), 2, null);
    }
}
