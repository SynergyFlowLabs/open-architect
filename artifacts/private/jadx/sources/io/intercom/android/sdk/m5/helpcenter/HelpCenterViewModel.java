package io.intercom.android.sdk.m5.helpcenter;

import android.content.Context;
import android.content.res.Configuration;
import androidx.compose.runtime.internal.w0;
import androidx.lifecycle.f2;
import androidx.lifecycle.g2;
import androidx.lifecycle.j2;
import androidx.lifecycle.m2;
import io.intercom.android.sdk.Injector;
import io.intercom.android.sdk.R;
import io.intercom.android.sdk.api.MessengerApi;
import io.intercom.android.sdk.helpcenter.api.HelpCenterApi;
import io.intercom.android.sdk.helpcenter.articles.ArticleViewState;
import io.intercom.android.sdk.helpcenter.collections.HelpCenterCollection;
import io.intercom.android.sdk.helpcenter.component.TeammateHelpKt;
import io.intercom.android.sdk.helpcenter.sections.HelpCenterArticle;
import io.intercom.android.sdk.helpcenter.sections.HelpCenterCollectionContent;
import io.intercom.android.sdk.helpcenter.utils.HelpCenterEligibilityChecker;
import io.intercom.android.sdk.helpcenter.utils.networking.NetworkResponse;
import io.intercom.android.sdk.identity.AppConfig;
import io.intercom.android.sdk.m5.components.ErrorState;
import io.intercom.android.sdk.m5.data.CommonRepository;
import io.intercom.android.sdk.m5.data.IntercomDataLayer;
import io.intercom.android.sdk.m5.helpcenter.states.CollectionDetailsRow;
import io.intercom.android.sdk.m5.helpcenter.states.CollectionDetailsUiState;
import io.intercom.android.sdk.m5.helpcenter.states.CollectionRowData;
import io.intercom.android.sdk.m5.helpcenter.states.CollectionsRow;
import io.intercom.android.sdk.m5.helpcenter.states.CollectionsUiEffects;
import io.intercom.android.sdk.m5.helpcenter.states.CollectionsUiState;
import io.intercom.android.sdk.metrics.MetricTracker;
import io.intercom.android.sdk.models.OpenMessengerResponse;
import io.intercom.android.sdk.models.Space;
import io.intercom.android.sdk.ui.common.StringProvider;
import io.intercom.android.sdk.utilities.ContextLocaliser;
import io.intercom.android.sdk.utilities.extensions.AppConfigExtensionsKt;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.Set;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.collections.SetsKt;
import kotlin.coroutines.d;
import kotlin.coroutines.jvm.internal.f;
import kotlin.coroutines.jvm.internal.o;
import kotlin.f0;
import kotlin.g0;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlinx.coroutines.d1;
import kotlinx.coroutines.flow.b1;
import kotlinx.coroutines.flow.j0;
import kotlinx.coroutines.flow.k;
import kotlinx.coroutines.flow.k0;
import kotlinx.coroutines.flow.o0;
import kotlinx.coroutines.flow.q0;
import kotlinx.coroutines.flow.u0;
import kotlinx.coroutines.flow.z0;
import kotlinx.coroutines.l1;
import kotlinx.coroutines.n0;
import kotlinx.coroutines.s0;
import okhttp3.internal.ws.g;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes13.dex */
@w0(parameters = 0)
@SourceDebugExtension({"SMAP\nHelpCenterViewModel.kt\nKotlin\n*S Kotlin\n*F\n+ 1 HelpCenterViewModel.kt\nio/intercom/android/sdk/m5/helpcenter/HelpCenterViewModel\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 3 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,430:1\n1#2:431\n1557#3:432\n1628#3,3:433\n1557#3:436\n1628#3,3:437\n1557#3:440\n1628#3,3:441\n*S KotlinDebug\n*F\n+ 1 HelpCenterViewModel.kt\nio/intercom/android/sdk/m5/helpcenter/HelpCenterViewModel\n*L\n223#1:432\n223#1:433,3\n342#1:436\n342#1:437,3\n351#1:440\n351#1:441,3\n*E\n"})
public final class HelpCenterViewModel extends f2 {

    @NotNull
    private final k0<CollectionDetailsUiState> _collectionDetailsState;

    @NotNull
    private final k0<CollectionsUiState> _collectionsState;

    @NotNull
    private final j0<CollectionsUiEffects> _effect;

    @NotNull
    private final AppConfig appConfig;

    @NotNull
    private final z0<CollectionDetailsUiState> collectionDetailsState;

    @NotNull
    private final z0<CollectionsUiState> collectionsState;

    @NotNull
    private final CommonRepository commonRepository;

    @NotNull
    private final n0 dispatcher;

    @NotNull
    private final o0<CollectionsUiEffects> effect;

    @NotNull
    private final ErrorState.WithoutCTA genericError;
    private boolean hasClickedAtLeastOneArticle;

    @NotNull
    private final HelpCenterApi helpCenterApi;

    @NotNull
    private final HelpCenterEligibilityChecker helpCenterEligibilityChecker;

    @NotNull
    private final IntercomDataLayer intercomDataLayer;
    private boolean isPartialHelpCenterLoaded;

    @NotNull
    private final MetricTracker metricTracker;

    @NotNull
    private final ErrorState.WithoutCTA notFoundError;

    @NotNull
    private final String place;

    @NotNull
    private final f0 searchBrowseTeamPresenceState$delegate;

    @NotNull
    public static final Companion Companion = new Companion(null);
    public static final int $stable = 8;

    /* JADX INFO: renamed from: io.intercom.android.sdk.m5.helpcenter.HelpCenterViewModel$1, reason: invalid class name */
    @f(c = "io.intercom.android.sdk.m5.helpcenter.HelpCenterViewModel$1", f = "HelpCenterViewModel.kt", i = {}, l = {100}, m = "invokeSuspend", n = {}, s = {})
    static final class AnonymousClass1 extends o implements Function2<s0, d<? super Unit>, Object> {
        int label;

        /* JADX INFO: renamed from: io.intercom.android.sdk.m5.helpcenter.HelpCenterViewModel$1$1, reason: invalid class name and collision with other inner class name */
        @f(c = "io.intercom.android.sdk.m5.helpcenter.HelpCenterViewModel$1$1", f = "HelpCenterViewModel.kt", i = {}, l = {101}, m = "invokeSuspend", n = {}, s = {})
        static final class C20221 extends o implements Function2<AppConfig, d<? super Unit>, Object> {
            int label;
            final /* synthetic */ HelpCenterViewModel this$0;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            C20221(HelpCenterViewModel helpCenterViewModel, d<? super C20221> dVar) {
                super(2, dVar);
                this.this$0 = helpCenterViewModel;
            }

            @Override // kotlin.coroutines.jvm.internal.a
            public final d<Unit> create(Object obj, d<?> dVar) {
                return new C20221(this.this$0, dVar);
            }

            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(AppConfig appConfig, d<? super Unit> dVar) {
                return ((C20221) create(appConfig, dVar)).invokeSuspend(Unit.f312394a);
            }

            @Override // kotlin.coroutines.jvm.internal.a
            public final Object invokeSuspend(Object obj) {
                Object objL = kotlin.coroutines.intrinsics.b.l();
                int i10 = this.label;
                if (i10 == 0) {
                    ResultKt.m(obj);
                    HelpCenterViewModel helpCenterViewModel = this.this$0;
                    this.label = 1;
                    if (helpCenterViewModel.onNewConfig(this) == objL) {
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
        }

        AnonymousClass1(d<? super AnonymousClass1> dVar) {
            super(2, dVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final d<Unit> create(Object obj, d<?> dVar) {
            return HelpCenterViewModel.this.new AnonymousClass1(dVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            Object objL = kotlin.coroutines.intrinsics.b.l();
            int i10 = this.label;
            if (i10 == 0) {
                ResultKt.m(obj);
                z0<AppConfig> config = HelpCenterViewModel.this.intercomDataLayer.getConfig();
                C20221 c20221 = new C20221(HelpCenterViewModel.this, null);
                this.label = 1;
                if (k.C(config, c20221, this) == objL) {
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
        public final Object invoke(s0 s0Var, d<? super Unit> dVar) {
            return ((AnonymousClass1) create(s0Var, dVar)).invokeSuspend(Unit.f312394a);
        }
    }

    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        /* JADX WARN: Type inference failed for: r1v1, types: [io.intercom.android.sdk.m5.helpcenter.HelpCenterViewModel$Companion$factory$1] */
        private final HelpCenterViewModel$Companion$factory$1 factory(final HelpCenterApi helpCenterApi, final String str) {
            return new j2.c() { // from class: io.intercom.android.sdk.m5.helpcenter.HelpCenterViewModel$Companion$factory$1
                @Override // androidx.lifecycle.j2.c
                public <T extends f2> T create(Class<T> modelClass) {
                    Intrinsics.checkNotNullParameter(modelClass, "modelClass");
                    IntercomDataLayer dataLayer = Injector.get().getDataLayer();
                    HelpCenterApi helpCenterApi2 = helpCenterApi;
                    AppConfig appConfig = Injector.get().getAppConfigProvider().get();
                    Intrinsics.checkNotNullExpressionValue(appConfig, "get(...)");
                    AppConfig appConfig2 = appConfig;
                    MetricTracker metricTracker = Injector.get().getMetricTracker();
                    Intrinsics.checkNotNullExpressionValue(metricTracker, "getMetricTracker(...)");
                    String str2 = str;
                    Intrinsics.checkNotNull(dataLayer);
                    MessengerApi messengerApi = Injector.get().getMessengerApi();
                    Intrinsics.checkNotNullExpressionValue(messengerApi, "getMessengerApi(...)");
                    return new HelpCenterViewModel(helpCenterApi2, appConfig2, metricTracker, str2, null, null, dataLayer, new CommonRepository(messengerApi, dataLayer), 48, null);
                }
            };
        }

        @NotNull
        public final HelpCenterViewModel create(@NotNull m2 owner, @NotNull HelpCenterApi helpCenterApi, @NotNull String place) {
            Intrinsics.checkNotNullParameter(owner, "owner");
            Intrinsics.checkNotNullParameter(helpCenterApi, "helpCenterApi");
            Intrinsics.checkNotNullParameter(place, "place");
            return (HelpCenterViewModel) new j2(owner, factory(helpCenterApi, place)).c(HelpCenterViewModel.class);
        }

        private Companion() {
        }
    }

    /* JADX INFO: renamed from: io.intercom.android.sdk.m5.helpcenter.HelpCenterViewModel$fetchCollectionDetails$1, reason: invalid class name and case insensitive filesystem */
    @f(c = "io.intercom.android.sdk.m5.helpcenter.HelpCenterViewModel$fetchCollectionDetails$1", f = "HelpCenterViewModel.kt", i = {1, 1}, l = {com.planner5d.library.engine.input.f.b.M1, 285}, m = "invokeSuspend", n = {"collectionDetailsContent", "newState"}, s = {"L$0", "L$1"})
    static final class C28111 extends o implements Function2<s0, d<? super Unit>, Object> {
        final /* synthetic */ String $collectionId;
        Object L$0;
        Object L$1;
        Object L$2;
        Object L$3;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C28111(String str, d<? super C28111> dVar) {
            super(2, dVar);
            this.$collectionId = str;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final Unit invokeSuspend$lambda$0(HelpCenterViewModel helpCenterViewModel, String str) {
            helpCenterViewModel.fetchCollectionDetails(str);
            return Unit.f312394a;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final d<Unit> create(Object obj, d<?> dVar) {
            return HelpCenterViewModel.this.new C28111(this.$collectionId, dVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            C28111 c28111;
            k0 k0Var;
            HelpCenterCollectionContent helpCenterCollectionContent;
            List list;
            List list2;
            List list3;
            CollectionDetailsUiState error;
            Object objL = kotlin.coroutines.intrinsics.b.l();
            int i10 = this.label;
            if (i10 == 0) {
                ResultKt.m(obj);
                CollectionDetailsUiState value = HelpCenterViewModel.this.getCollectionDetailsState().getValue();
                if ((value instanceof CollectionDetailsUiState.Content) && Intrinsics.areEqual(((CollectionDetailsUiState.Content) value).getId(), this.$collectionId)) {
                    return Unit.f312394a;
                }
                HelpCenterViewModel.this._collectionDetailsState.setValue(CollectionDetailsUiState.Loading.INSTANCE);
                HelpCenterApi helpCenterApi = HelpCenterViewModel.this.helpCenterApi;
                String str = this.$collectionId;
                this.label = 1;
                c28111 = this;
                obj = HelpCenterApi.DefaultImpls.fetchCollectionDetails$default(helpCenterApi, str, null, c28111, 2, null);
                if (obj == objL) {
                }
                return objL;
            }
            if (i10 == 1) {
                ResultKt.m(obj);
                c28111 = this;
            } else {
                if (i10 != 2) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                list2 = (List) this.L$3;
                k0Var = (k0) this.L$2;
                list3 = (List) this.L$1;
                helpCenterCollectionContent = (HelpCenterCollectionContent) this.L$0;
                ResultKt.m(obj);
            }
            list2.add(new CollectionDetailsRow.SendMessageRow((ArticleViewState.TeamPresenceState) obj));
            list = list3;
            k0Var = k0Var;
            error = new CollectionDetailsUiState.Content(helpCenterCollectionContent.getCollectionId(), helpCenterCollectionContent.getTitle(), helpCenterCollectionContent.getSummary(), helpCenterCollectionContent.getArticlesCount(), helpCenterCollectionContent.getAuthors(), list);
            k0Var.setValue(error);
            return Unit.f312394a;
            NetworkResponse networkResponse = (NetworkResponse) obj;
            k0Var = HelpCenterViewModel.this._collectionDetailsState;
            if (networkResponse instanceof NetworkResponse.ServerError) {
                NetworkResponse.ServerError serverError = (NetworkResponse.ServerError) networkResponse;
                HelpCenterViewModel.this.sendFailedSingleCollectionMetric(kotlin.coroutines.jvm.internal.b.f(serverError.getCode()));
                error = serverError.getCode() == 404 ? new CollectionDetailsUiState.Error(HelpCenterViewModel.this.notFoundError) : new CollectionDetailsUiState.Error(HelpCenterViewModel.this.genericError);
            } else if (networkResponse instanceof NetworkResponse.ClientError) {
                HelpCenterViewModel.sendFailedSingleCollectionMetric$default(HelpCenterViewModel.this, null, 1, null);
                error = new CollectionDetailsUiState.Error(HelpCenterViewModel.this.genericError);
            } else if (networkResponse instanceof NetworkResponse.NetworkError) {
                HelpCenterViewModel.sendFailedSingleCollectionMetric$default(HelpCenterViewModel.this, null, 1, null);
                final HelpCenterViewModel helpCenterViewModel = HelpCenterViewModel.this;
                final String str2 = c28111.$collectionId;
                error = new CollectionDetailsUiState.Error(helpCenterViewModel.errorWithRetry(new Function0() { // from class: io.intercom.android.sdk.m5.helpcenter.b
                    @Override // kotlin.jvm.functions.Function0
                    public final Object invoke() {
                        return HelpCenterViewModel.C28111.invokeSuspend$lambda$0(helpCenterViewModel, str2);
                    }
                }));
            } else {
                if (!(networkResponse instanceof NetworkResponse.Success)) {
                    throw new kotlin.k0();
                }
                helpCenterCollectionContent = (HelpCenterCollectionContent) ((NetworkResponse.Success) networkResponse).getBody();
                List mutableList = CollectionsKt.toMutableList((Collection) HelpCenterViewModel.this.transformToUiModel(helpCenterCollectionContent));
                if (HelpCenterViewModel.this.isPartialHelpCenterLoaded) {
                    mutableList.add(CollectionDetailsRow.FullHelpCenterRow.INSTANCE);
                }
                HelpCenterViewModel.this.metricTracker.viewedNativeHelpCenter(MetricTracker.Place.ARTICLE_LIST, kotlin.coroutines.jvm.internal.b.a(HelpCenterViewModel.this.isPartialHelpCenterLoaded), HelpCenterViewModel.this.isFromSearchBrowse());
                if (HelpCenterViewModel.this.shouldAddSendMessageRow()) {
                    HelpCenterViewModel helpCenterViewModel2 = HelpCenterViewModel.this;
                    c28111.L$0 = helpCenterCollectionContent;
                    c28111.L$1 = mutableList;
                    c28111.L$2 = k0Var;
                    c28111.L$3 = mutableList;
                    c28111.label = 2;
                    Object ctaData = helpCenterViewModel2.getCtaData(c28111);
                    if (ctaData != objL) {
                        list2 = mutableList;
                        obj = ctaData;
                        list3 = list2;
                        list2.add(new CollectionDetailsRow.SendMessageRow((ArticleViewState.TeamPresenceState) obj));
                        list = list3;
                    }
                    return objL;
                }
                list = mutableList;
                k0Var = k0Var;
                error = new CollectionDetailsUiState.Content(helpCenterCollectionContent.getCollectionId(), helpCenterCollectionContent.getTitle(), helpCenterCollectionContent.getSummary(), helpCenterCollectionContent.getArticlesCount(), helpCenterCollectionContent.getAuthors(), list);
            }
            k0Var.setValue(error);
            return Unit.f312394a;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(s0 s0Var, d<? super Unit> dVar) {
            return ((C28111) create(s0Var, dVar)).invokeSuspend(Unit.f312394a);
        }
    }

    /* JADX INFO: renamed from: io.intercom.android.sdk.m5.helpcenter.HelpCenterViewModel$fetchCollections$1, reason: invalid class name and case insensitive filesystem */
    @f(c = "io.intercom.android.sdk.m5.helpcenter.HelpCenterViewModel$fetchCollections$1", f = "HelpCenterViewModel.kt", i = {3}, l = {g.f334652s, 165, 175, 198}, m = "invokeSuspend", n = {"uiModel"}, s = {"L$0"})
    @SourceDebugExtension({"SMAP\nHelpCenterViewModel.kt\nKotlin\n*S Kotlin\n*F\n+ 1 HelpCenterViewModel.kt\nio/intercom/android/sdk/m5/helpcenter/HelpCenterViewModel$fetchCollections$1\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,430:1\n774#2:431\n865#2,2:432\n*S KotlinDebug\n*F\n+ 1 HelpCenterViewModel.kt\nio/intercom/android/sdk/m5/helpcenter/HelpCenterViewModel$fetchCollections$1\n*L\n151#1:431\n151#1:432,2\n*E\n"})
    static final class C28121 extends o implements Function2<s0, d<? super Unit>, Object> {
        final /* synthetic */ Set<String> $collectionIds;
        Object L$0;
        Object L$1;
        Object L$2;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C28121(Set<String> set, d<? super C28121> dVar) {
            super(2, dVar);
            this.$collectionIds = set;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final Unit invokeSuspend$lambda$0(HelpCenterViewModel helpCenterViewModel, Set set) {
            helpCenterViewModel.fetchCollections(set);
            return Unit.f312394a;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final d<Unit> create(Object obj, d<?> dVar) {
            return HelpCenterViewModel.this.new C28121(this.$collectionIds, dVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            k0 k0Var;
            CollectionsUiState error;
            List mutableList;
            List list;
            List list2;
            Object objL = kotlin.coroutines.intrinsics.b.l();
            int i10 = this.label;
            if (i10 == 0) {
                ResultKt.m(obj);
                if (HelpCenterViewModel.this.getCollectionsState().getValue() instanceof CollectionsUiState.Content) {
                    return Unit.f312394a;
                }
                HelpCenterViewModel.this._collectionsState.setValue(CollectionsUiState.Loading.INSTANCE);
                HelpCenterApi helpCenterApi = HelpCenterViewModel.this.helpCenterApi;
                this.label = 1;
                obj = HelpCenterApi.DefaultImpls.fetchCollections$default(helpCenterApi, null, this, 1, null);
                if (obj != objL) {
                }
                return objL;
            }
            if (i10 != 1) {
                if (i10 == 2) {
                    ResultKt.m(obj);
                    return Unit.f312394a;
                }
                if (i10 == 3) {
                    ResultKt.m(obj);
                    return Unit.f312394a;
                }
                if (i10 != 4) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                list = (List) this.L$2;
                k0Var = (k0) this.L$1;
                list2 = (List) this.L$0;
                ResultKt.m(obj);
                list.add(new CollectionsRow.SendMessageRow((ArticleViewState.TeamPresenceState) obj));
                mutableList = list2;
                error = new CollectionsUiState.Content(mutableList);
                k0Var.setValue(error);
                return Unit.f312394a;
            }
            ResultKt.m(obj);
            NetworkResponse networkResponse = (NetworkResponse) obj;
            k0Var = HelpCenterViewModel.this._collectionsState;
            if (networkResponse instanceof NetworkResponse.ServerError) {
                NetworkResponse.ServerError serverError = (NetworkResponse.ServerError) networkResponse;
                HelpCenterViewModel.this.sendFailedCollectionListMetric(kotlin.coroutines.jvm.internal.b.f(serverError.getCode()));
                error = serverError.getCode() == 404 ? new CollectionsUiState.Error(HelpCenterViewModel.this.notFoundError) : new CollectionsUiState.Error(HelpCenterViewModel.this.genericError);
            } else if (networkResponse instanceof NetworkResponse.ClientError) {
                HelpCenterViewModel.sendFailedCollectionListMetric$default(HelpCenterViewModel.this, null, 1, null);
                error = new CollectionsUiState.Error(HelpCenterViewModel.this.genericError);
            } else {
                if (!(networkResponse instanceof NetworkResponse.NetworkError)) {
                    if (!(networkResponse instanceof NetworkResponse.Success)) {
                        throw new kotlin.k0();
                    }
                    List list3 = (List) ((NetworkResponse.Success) networkResponse).getBody();
                    Set<String> set = this.$collectionIds;
                    ArrayList arrayList = new ArrayList();
                    for (Object obj2 : list3) {
                        if (set.contains(((HelpCenterCollection) obj2).getId())) {
                            arrayList.add(obj2);
                        }
                    }
                    HelpCenterViewModel.this.isPartialHelpCenterLoaded = arrayList.size() < list3.size() && !arrayList.isEmpty();
                    HelpCenterViewModel.this.metricTracker.viewedNativeHelpCenter(MetricTracker.Place.COLLECTION_LIST, kotlin.coroutines.jvm.internal.b.a(HelpCenterViewModel.this.isPartialHelpCenterLoaded), HelpCenterViewModel.this.isFromSearchBrowse());
                    if (arrayList.size() == 1) {
                        j0 j0Var = HelpCenterViewModel.this._effect;
                        CollectionsUiEffects.NavigateToCollectionContent navigateToCollectionContent = new CollectionsUiEffects.NavigateToCollectionContent(((HelpCenterCollection) CollectionsKt.first((List) arrayList)).getId());
                        this.L$0 = k0Var;
                        this.label = 2;
                        if (j0Var.emit(navigateToCollectionContent, this) == objL) {
                        }
                        return Unit.f312394a;
                    }
                    if (list3.size() == 1) {
                        j0 j0Var2 = HelpCenterViewModel.this._effect;
                        CollectionsUiEffects.NavigateToCollectionContent navigateToCollectionContent2 = new CollectionsUiEffects.NavigateToCollectionContent(((HelpCenterCollection) CollectionsKt.first(list3)).getId());
                        this.L$0 = k0Var;
                        this.label = 3;
                        if (j0Var2.emit(navigateToCollectionContent2, this) == objL) {
                        }
                        return Unit.f312394a;
                    }
                    boolean zIsEmpty = arrayList.isEmpty();
                    if (!arrayList.isEmpty()) {
                        list3 = arrayList;
                    }
                    if (list3.isEmpty()) {
                        error = new CollectionsUiState.Error(HelpCenterViewModel.this.genericError);
                    } else {
                        mutableList = CollectionsKt.toMutableList((Collection) HelpCenterViewModel.this.transformToUiModel((List<HelpCenterCollection>) list3));
                        if (!zIsEmpty) {
                            mutableList.add(CollectionsRow.BrowseAllHelpTopicsAsListRow.INSTANCE);
                        } else if (HelpCenterViewModel.this.isPartialHelpCenterLoaded) {
                            mutableList.add(CollectionsRow.FullHelpCenterRow.INSTANCE);
                        }
                        if (HelpCenterViewModel.this.shouldAddSendMessageRow()) {
                            HelpCenterViewModel helpCenterViewModel = HelpCenterViewModel.this;
                            this.L$0 = mutableList;
                            this.L$1 = k0Var;
                            this.L$2 = mutableList;
                            this.label = 4;
                            Object ctaData = helpCenterViewModel.getCtaData(this);
                            if (ctaData != objL) {
                                list = mutableList;
                                obj = ctaData;
                                list2 = list;
                                list.add(new CollectionsRow.SendMessageRow((ArticleViewState.TeamPresenceState) obj));
                                mutableList = list2;
                            }
                        }
                        error = new CollectionsUiState.Content(mutableList);
                    }
                    return objL;
                }
                HelpCenterViewModel.sendFailedCollectionListMetric$default(HelpCenterViewModel.this, null, 1, null);
                final HelpCenterViewModel helpCenterViewModel2 = HelpCenterViewModel.this;
                final Set<String> set2 = this.$collectionIds;
                error = new CollectionsUiState.Error(helpCenterViewModel2.errorWithRetry(new Function0() { // from class: io.intercom.android.sdk.m5.helpcenter.c
                    @Override // kotlin.jvm.functions.Function0
                    public final Object invoke() {
                        return HelpCenterViewModel.C28121.invokeSuspend$lambda$0(helpCenterViewModel2, set2);
                    }
                }));
            }
            k0Var.setValue(error);
            return Unit.f312394a;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(s0 s0Var, d<? super Unit> dVar) {
            return ((C28121) create(s0Var, dVar)).invokeSuspend(Unit.f312394a);
        }
    }

    /* JADX INFO: renamed from: io.intercom.android.sdk.m5.helpcenter.HelpCenterViewModel$getCtaData$1, reason: invalid class name and case insensitive filesystem */
    @f(c = "io.intercom.android.sdk.m5.helpcenter.HelpCenterViewModel", f = "HelpCenterViewModel.kt", i = {0}, l = {390}, m = "getCtaData", n = {"this"}, s = {"L$0"})
    static final class C28131 extends kotlin.coroutines.jvm.internal.d {
        Object L$0;
        int label;
        /* synthetic */ Object result;

        C28131(d<? super C28131> dVar) {
            super(dVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return HelpCenterViewModel.this.getCtaData(this);
        }
    }

    /* JADX INFO: renamed from: io.intercom.android.sdk.m5.helpcenter.HelpCenterViewModel$onArticleClicked$1, reason: invalid class name and case insensitive filesystem */
    @f(c = "io.intercom.android.sdk.m5.helpcenter.HelpCenterViewModel$onArticleClicked$1", f = "HelpCenterViewModel.kt", i = {0, 0, 0, 0, 1, 1}, l = {311, 314, 319}, m = "invokeSuspend", n = {"collectionDetailsContent", "collectionsContent", "shouldAddToCollectionDetails", "shouldAddToCollections", "collectionsContent", "shouldAddToCollections"}, s = {"L$0", "L$1", "I$0", "I$1", "L$0", "I$0"})
    static final class C28141 extends o implements Function2<s0, d<? super Unit>, Object> {
        int I$0;
        int I$1;
        Object L$0;
        Object L$1;
        Object L$2;
        int label;

        C28141(d<? super C28141> dVar) {
            super(2, dVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final d<Unit> create(Object obj, d<?> dVar) {
            return HelpCenterViewModel.this.new C28141(dVar);
        }

        /* JADX WARN: Code duplicated, block: B:50:0x00ff  */
        /* JADX WARN: Code duplicated, block: B:55:0x011b  */
        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            CollectionDetailsUiState.Content content;
            CollectionsUiState.Content content2;
            int i10;
            int i11;
            CollectionDetailsUiState.Content content3;
            k0 k0Var;
            k0 k0Var2;
            k0 k0Var3;
            CollectionsUiState.Content content4;
            Object objL = kotlin.coroutines.intrinsics.b.l();
            int i12 = this.label;
            if (i12 == 0) {
                ResultKt.m(obj);
                HelpCenterViewModel.this.hasClickedAtLeastOneArticle = true;
                if (HelpCenterViewModel.this.shouldAddSendMessageRow()) {
                    Object value = HelpCenterViewModel.this._collectionDetailsState.getValue();
                    content = value instanceof CollectionDetailsUiState.Content ? (CollectionDetailsUiState.Content) value : null;
                    Object value2 = HelpCenterViewModel.this._collectionsState.getValue();
                    CollectionsUiState.Content content5 = value2 instanceof CollectionsUiState.Content ? (CollectionsUiState.Content) value2 : null;
                    int i13 = 0;
                    int i14 = (content == null || content.hasSendMessageRow()) ? 0 : 1;
                    if (content5 != null && !content5.hasSendMessageRow()) {
                        i13 = 1;
                    }
                    if (i14 != 0 || i13 != 0) {
                        this.L$0 = content;
                        this.L$1 = content5;
                        this.I$0 = i14;
                        this.I$1 = i13;
                        this.label = 1;
                        if (d1.b(2000L, this) != objL) {
                            int i15 = i13;
                            content2 = content5;
                            i10 = i15;
                            i11 = i14;
                        }
                        return objL;
                    }
                }
                return Unit.f312394a;
            }
            if (i12 == 1) {
                i10 = this.I$1;
                i11 = this.I$0;
                content2 = (CollectionsUiState.Content) this.L$1;
                CollectionDetailsUiState.Content content6 = (CollectionDetailsUiState.Content) this.L$0;
                ResultKt.m(obj);
                content = content6;
            } else {
                if (i12 == 2) {
                    i10 = this.I$0;
                    k0Var = (k0) this.L$2;
                    content3 = (CollectionDetailsUiState.Content) this.L$1;
                    content2 = (CollectionsUiState.Content) this.L$0;
                    ResultKt.m(obj);
                    k0Var.setValue(content3.copyWithSingleSendMessageRow((ArticleViewState.TeamPresenceState) obj));
                    if (i10 != 0 && content2 != null) {
                        HelpCenterViewModel helpCenterViewModel = HelpCenterViewModel.this;
                        k0Var2 = helpCenterViewModel._collectionsState;
                        this.L$0 = content2;
                        this.L$1 = k0Var2;
                        this.L$2 = null;
                        this.label = 3;
                        obj = helpCenterViewModel.getCtaData(this);
                        if (obj != objL) {
                            k0Var3 = k0Var2;
                            content4 = content2;
                        }
                        return objL;
                    }
                    return Unit.f312394a;
                }
                if (i12 != 3) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                k0Var3 = (k0) this.L$1;
                content4 = (CollectionsUiState.Content) this.L$0;
                ResultKt.m(obj);
            }
            k0Var3.setValue(content4.copyWithSingleSendMessageRow((ArticleViewState.TeamPresenceState) obj));
            return Unit.f312394a;
            if (i11 == 0 || content == null) {
                if (i10 != 0) {
                    HelpCenterViewModel helpCenterViewModel2 = HelpCenterViewModel.this;
                    k0Var2 = helpCenterViewModel2._collectionsState;
                    this.L$0 = content2;
                    this.L$1 = k0Var2;
                    this.L$2 = null;
                    this.label = 3;
                    obj = helpCenterViewModel2.getCtaData(this);
                    if (obj != objL) {
                        k0Var3 = k0Var2;
                        content4 = content2;
                        k0Var3.setValue(content4.copyWithSingleSendMessageRow((ArticleViewState.TeamPresenceState) obj));
                    }
                }
                return Unit.f312394a;
            }
            HelpCenterViewModel helpCenterViewModel3 = HelpCenterViewModel.this;
            k0 k0Var4 = helpCenterViewModel3._collectionDetailsState;
            this.L$0 = content2;
            this.L$1 = content;
            this.L$2 = k0Var4;
            this.I$0 = i10;
            this.label = 2;
            Object ctaData = helpCenterViewModel3.getCtaData(this);
            if (ctaData != objL) {
                content3 = content;
                obj = ctaData;
                k0Var = k0Var4;
                k0Var.setValue(content3.copyWithSingleSendMessageRow((ArticleViewState.TeamPresenceState) obj));
                if (i10 != 0) {
                    HelpCenterViewModel helpCenterViewModel4 = HelpCenterViewModel.this;
                    k0Var2 = helpCenterViewModel4._collectionsState;
                    this.L$0 = content2;
                    this.L$1 = k0Var2;
                    this.L$2 = null;
                    this.label = 3;
                    obj = helpCenterViewModel4.getCtaData(this);
                    if (obj != objL) {
                        k0Var3 = k0Var2;
                        content4 = content2;
                        k0Var3.setValue(content4.copyWithSingleSendMessageRow((ArticleViewState.TeamPresenceState) obj));
                    }
                }
                return Unit.f312394a;
            }
            return objL;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(s0 s0Var, d<? super Unit> dVar) {
            return ((C28141) create(s0Var, dVar)).invokeSuspend(Unit.f312394a);
        }
    }

    /* JADX INFO: renamed from: io.intercom.android.sdk.m5.helpcenter.HelpCenterViewModel$onNewConfig$1, reason: invalid class name and case insensitive filesystem */
    @f(c = "io.intercom.android.sdk.m5.helpcenter.HelpCenterViewModel", f = "HelpCenterViewModel.kt", i = {0}, l = {371, 379}, m = "onNewConfig", n = {"this"}, s = {"L$0"})
    static final class C28151 extends kotlin.coroutines.jvm.internal.d {
        Object L$0;
        Object L$1;
        Object L$2;
        int label;
        /* synthetic */ Object result;

        C28151(d<? super C28151> dVar) {
            super(dVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return HelpCenterViewModel.this.onNewConfig(this);
        }
    }

    public /* synthetic */ HelpCenterViewModel(HelpCenterApi helpCenterApi, AppConfig appConfig, MetricTracker metricTracker, String str, HelpCenterEligibilityChecker helpCenterEligibilityChecker, n0 n0Var, IntercomDataLayer intercomDataLayer, CommonRepository commonRepository, int i10, DefaultConstructorMarker defaultConstructorMarker) {
        this(helpCenterApi, appConfig, metricTracker, str, (i10 & 16) != 0 ? HelpCenterEligibilityChecker.INSTANCE : helpCenterEligibilityChecker, (i10 & 32) != 0 ? l1.c() : n0Var, intercomDataLayer, commonRepository);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final ErrorState.WithCTA errorWithRetry(Function0<Unit> function0) {
        int i10 = 7 & 0;
        return new ErrorState.WithCTA(0, 0, null, 0, function0, 15, null);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ void fetchCollections$default(HelpCenterViewModel helpCenterViewModel, Set set, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            set = SetsKt.emptySet();
        }
        helpCenterViewModel.fetchCollections(set);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Code duplicated, block: B:7:0x0014  */
    public final Object getCtaData(d<? super ArticleViewState.TeamPresenceState> dVar) {
        C28131 c28131;
        OpenMessengerResponse.NewConversationData newConversationData;
        if (dVar instanceof C28131) {
            c28131 = (C28131) dVar;
            int i10 = c28131.label;
            if ((i10 & Integer.MIN_VALUE) != 0) {
                c28131.label = i10 - Integer.MIN_VALUE;
            } else {
                c28131 = new C28131(dVar);
            }
        } else {
            c28131 = new C28131(dVar);
        }
        Object objOpenMessenger = c28131.result;
        Object objL = kotlin.coroutines.intrinsics.b.l();
        int i11 = c28131.label;
        if (i11 == 0) {
            ResultKt.m(objOpenMessenger);
            CommonRepository commonRepository = this.commonRepository;
            c28131.L$0 = this;
            c28131.label = 1;
            objOpenMessenger = commonRepository.openMessenger(c28131);
            if (objOpenMessenger == objL) {
                return objL;
            }
        } else {
            if (i11 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            this = (HelpCenterViewModel) c28131.L$0;
            ResultKt.m(objOpenMessenger);
        }
        OpenMessengerResponse openMessengerResponse = (OpenMessengerResponse) objOpenMessenger;
        if (openMessengerResponse != null && (newConversationData = openMessengerResponse.getNewConversationData()) != null) {
            return ArticleViewState.TeamPresenceState.copy$default(this.getSearchBrowseTeamPresenceState(), null, null, null, 0, 0, 0, null, null, false, newConversationData.getCta(), 511, null);
        }
        return this.getSearchBrowseTeamPresenceState();
    }

    private final ArticleViewState.TeamPresenceState getSearchBrowseTeamPresenceState() {
        return (ArticleViewState.TeamPresenceState) this.searchBrowseTeamPresenceState$delegate.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final boolean isFromSearchBrowse() {
        return Intrinsics.areEqual(this.place, "search_browse");
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Code duplicated, block: B:30:0x00ad  */
    /* JADX WARN: Code duplicated, block: B:32:0x00b7  */
    /* JADX WARN: Code duplicated, block: B:35:0x00cf  */
    /* JADX WARN: Code duplicated, block: B:37:0x00df  */
    /* JADX WARN: Code duplicated, block: B:7:0x0015  */
    public final Object onNewConfig(d<? super Unit> dVar) {
        C28151 c28151;
        k0<CollectionsUiState> k0Var;
        HelpCenterViewModel helpCenterViewModel;
        CollectionsUiState.Content contentCopyWithoutSendMessageRow;
        CollectionsUiState.Content content;
        CollectionDetailsUiState value;
        k0<CollectionDetailsUiState> k0Var2;
        CollectionDetailsUiState.Content contentCopyWithoutSendMessageRow2;
        CollectionDetailsUiState.Content content2;
        Object ctaData;
        CollectionDetailsUiState.Content content3;
        k0<CollectionDetailsUiState> k0Var3;
        if (dVar instanceof C28151) {
            c28151 = (C28151) dVar;
            int i10 = c28151.label;
            if ((i10 & Integer.MIN_VALUE) != 0) {
                c28151.label = i10 - Integer.MIN_VALUE;
            } else {
                c28151 = new C28151(dVar);
            }
        } else {
            c28151 = new C28151(dVar);
        }
        Object obj = c28151.result;
        Object objL = kotlin.coroutines.intrinsics.b.l();
        int i11 = c28151.label;
        int i12 = 6 & 1;
        if (i11 != 0) {
            if (i11 == 1) {
                content = (CollectionsUiState.Content) c28151.L$2;
                k0Var = (k0) c28151.L$1;
                helpCenterViewModel = (HelpCenterViewModel) c28151.L$0;
                ResultKt.m(obj);
            } else {
                if (i11 != 2) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                content3 = (CollectionDetailsUiState.Content) c28151.L$1;
                k0Var3 = (k0) c28151.L$0;
                ResultKt.m(obj);
            }
            contentCopyWithoutSendMessageRow2 = content3.copyWithSingleSendMessageRow((ArticleViewState.TeamPresenceState) obj);
            k0Var2 = k0Var3;
            k0Var2.setValue(contentCopyWithoutSendMessageRow2);
            return Unit.f312394a;
        }
        ResultKt.m(obj);
        CollectionsUiState value2 = this._collectionsState.getValue();
        if (!(value2 instanceof CollectionsUiState.Content)) {
            value = this._collectionDetailsState.getValue();
            if (value instanceof CollectionDetailsUiState.Content) {
                k0Var2 = this._collectionDetailsState;
                if (this.shouldAddSendMessageRow()) {
                    content2 = (CollectionDetailsUiState.Content) value;
                    c28151.L$0 = k0Var2;
                    c28151.L$1 = content2;
                    c28151.L$2 = null;
                    c28151.label = 2;
                    ctaData = this.getCtaData(c28151);
                    if (ctaData != objL) {
                        obj = ctaData;
                        content3 = content2;
                        k0Var3 = k0Var2;
                        contentCopyWithoutSendMessageRow2 = content3.copyWithSingleSendMessageRow((ArticleViewState.TeamPresenceState) obj);
                        k0Var2 = k0Var3;
                    }
                } else {
                    contentCopyWithoutSendMessageRow2 = ((CollectionDetailsUiState.Content) value).copyWithoutSendMessageRow();
                }
                k0Var2.setValue(contentCopyWithoutSendMessageRow2);
            }
            return Unit.f312394a;
        }
        k0Var = this._collectionsState;
        if (!shouldAddSendMessageRow()) {
            helpCenterViewModel = this;
            contentCopyWithoutSendMessageRow = ((CollectionsUiState.Content) value2).copyWithoutSendMessageRow();
            k0Var.setValue(contentCopyWithoutSendMessageRow);
            this = helpCenterViewModel;
            value = this._collectionDetailsState.getValue();
            if (value instanceof CollectionDetailsUiState.Content) {
                k0Var2 = this._collectionDetailsState;
                if (this.shouldAddSendMessageRow()) {
                    content2 = (CollectionDetailsUiState.Content) value;
                    c28151.L$0 = k0Var2;
                    c28151.L$1 = content2;
                    c28151.L$2 = null;
                    c28151.label = 2;
                    ctaData = this.getCtaData(c28151);
                    if (ctaData != objL) {
                        obj = ctaData;
                        content3 = content2;
                        k0Var3 = k0Var2;
                        contentCopyWithoutSendMessageRow2 = content3.copyWithSingleSendMessageRow((ArticleViewState.TeamPresenceState) obj);
                        k0Var2 = k0Var3;
                    }
                } else {
                    contentCopyWithoutSendMessageRow2 = ((CollectionDetailsUiState.Content) value).copyWithoutSendMessageRow();
                }
                k0Var2.setValue(contentCopyWithoutSendMessageRow2);
            }
            return Unit.f312394a;
        }
        CollectionsUiState.Content content4 = (CollectionsUiState.Content) value2;
        c28151.L$0 = this;
        c28151.L$1 = k0Var;
        c28151.L$2 = content4;
        c28151.label = 1;
        Object ctaData2 = getCtaData(c28151);
        if (ctaData2 != objL) {
            helpCenterViewModel = this;
            content = content4;
            obj = ctaData2;
        }
        return objL;
        contentCopyWithoutSendMessageRow = content.copyWithSingleSendMessageRow((ArticleViewState.TeamPresenceState) obj);
        k0Var.setValue(contentCopyWithoutSendMessageRow);
        this = helpCenterViewModel;
        value = this._collectionDetailsState.getValue();
        if (value instanceof CollectionDetailsUiState.Content) {
            k0Var2 = this._collectionDetailsState;
            if (this.shouldAddSendMessageRow()) {
                content2 = (CollectionDetailsUiState.Content) value;
                c28151.L$0 = k0Var2;
                c28151.L$1 = content2;
                c28151.L$2 = null;
                c28151.label = 2;
                ctaData = this.getCtaData(c28151);
                if (ctaData != objL) {
                    obj = ctaData;
                    content3 = content2;
                    k0Var3 = k0Var2;
                    contentCopyWithoutSendMessageRow2 = content3.copyWithSingleSendMessageRow((ArticleViewState.TeamPresenceState) obj);
                    k0Var2 = k0Var3;
                }
                return objL;
            }
            contentCopyWithoutSendMessageRow2 = ((CollectionDetailsUiState.Content) value).copyWithoutSendMessageRow();
            k0Var2.setValue(contentCopyWithoutSendMessageRow2);
        }
        return Unit.f312394a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final ArticleViewState.TeamPresenceState searchBrowseTeamPresenceState_delegate$lambda$0(HelpCenterViewModel this$0) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        return TeammateHelpKt.computeViewState(null, ArticleViewState.TeamPresenceState.Companion.getDefaultTeamPresenceState(), this$0.intercomDataLayer.getTeamPresence().getValue(), this$0.appConfig, this$0.place, true);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void sendFailedCollectionListMetric(Integer num) {
        this.metricTracker.failedHelpCenter(MetricTracker.Object.HELP_CENTER, MetricTracker.Place.COLLECTION_LIST, num != null ? num.toString() : null, isFromSearchBrowse());
    }

    static /* synthetic */ void sendFailedCollectionListMetric$default(HelpCenterViewModel helpCenterViewModel, Integer num, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            num = null;
        }
        helpCenterViewModel.sendFailedCollectionListMetric(num);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void sendFailedSingleCollectionMetric(Integer num) {
        this.metricTracker.failedHelpCenter(MetricTracker.Object.HELP_CENTER, MetricTracker.Place.ARTICLE_LIST, num != null ? num.toString() : null, isFromSearchBrowse());
    }

    static /* synthetic */ void sendFailedSingleCollectionMetric$default(HelpCenterViewModel helpCenterViewModel, Integer num, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            num = null;
        }
        helpCenterViewModel.sendFailedSingleCollectionMetric(num);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final boolean shouldAddSendMessageRow() {
        return AppConfigExtensionsKt.canStartNewConversation(this.appConfig) && this.hasClickedAtLeastOneArticle;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final List<CollectionsRow.CollectionRow> transformToUiModel(List<HelpCenterCollection> list) {
        List<HelpCenterCollection> list2 = list;
        ArrayList arrayList = new ArrayList(CollectionsKt.collectionSizeOrDefault(list2, 10));
        for (HelpCenterCollection helpCenterCollection : list2) {
            arrayList.add(new CollectionsRow.CollectionRow(new CollectionRowData(helpCenterCollection.getId(), helpCenterCollection.getTitle(), helpCenterCollection.getSummary().length() == 0 ? 8 : 0, helpCenterCollection.getSummary(), helpCenterCollection.getArticlesCount(), helpCenterCollection.getCollectionsCount())));
        }
        return arrayList;
    }

    public final void fetchCollectionDetails(@NotNull String collectionId) {
        Intrinsics.checkNotNullParameter(collectionId, "collectionId");
        kotlinx.coroutines.k.f(g2.a(this), this.dispatcher, null, new C28111(collectionId, null), 2, null);
    }

    public final void fetchCollections(@NotNull Set<String> collectionIds) {
        Intrinsics.checkNotNullParameter(collectionIds, "collectionIds");
        if (this.helpCenterEligibilityChecker.isEligibleUser()) {
            kotlinx.coroutines.k.f(g2.a(this), this.dispatcher, null, new C28121(collectionIds, null), 2, null);
        } else {
            this._collectionsState.setValue(new CollectionsUiState.Error(this.genericError));
        }
    }

    @NotNull
    public final z0<CollectionDetailsUiState> getCollectionDetailsState() {
        return this.collectionDetailsState;
    }

    @NotNull
    public final z0<CollectionsUiState> getCollectionsState() {
        return this.collectionsState;
    }

    @NotNull
    public final o0<CollectionsUiEffects> getEffect() {
        return this.effect;
    }

    @NotNull
    public final StringProvider getScreenTitle() {
        String spaceLabelIfExists = this.appConfig.getSpaceLabelIfExists(Space.Type.HELP);
        return spaceLabelIfExists != null ? new StringProvider.ActualString(spaceLabelIfExists) : new StringProvider.StringRes(R.string.intercom_get_help, null, 2, null);
    }

    @NotNull
    public final Context localizedContext(@NotNull Context context) {
        Intrinsics.checkNotNullParameter(context, "context");
        Configuration configuration = new Configuration(context.getResources().getConfiguration());
        configuration.setLocale(ContextLocaliser.convertToLocale(this.appConfig.getHelpCenterLocale()));
        Context contextCreateConfigurationContext = context.createConfigurationContext(configuration);
        Intrinsics.checkNotNullExpressionValue(contextCreateConfigurationContext, "createConfigurationContext(...)");
        return contextCreateConfigurationContext;
    }

    public final void onArticleClicked() {
        kotlinx.coroutines.k.f(g2.a(this), this.dispatcher, null, new C28141(null), 2, null);
    }

    public HelpCenterViewModel(@NotNull HelpCenterApi helpCenterApi, @NotNull AppConfig appConfig, @NotNull MetricTracker metricTracker, @NotNull String place, @NotNull HelpCenterEligibilityChecker helpCenterEligibilityChecker, @NotNull n0 dispatcher, @NotNull IntercomDataLayer intercomDataLayer, @NotNull CommonRepository commonRepository) {
        Intrinsics.checkNotNullParameter(helpCenterApi, "helpCenterApi");
        Intrinsics.checkNotNullParameter(appConfig, "appConfig");
        Intrinsics.checkNotNullParameter(metricTracker, "metricTracker");
        Intrinsics.checkNotNullParameter(place, "place");
        Intrinsics.checkNotNullParameter(helpCenterEligibilityChecker, "helpCenterEligibilityChecker");
        Intrinsics.checkNotNullParameter(dispatcher, "dispatcher");
        Intrinsics.checkNotNullParameter(intercomDataLayer, "intercomDataLayer");
        Intrinsics.checkNotNullParameter(commonRepository, "commonRepository");
        this.helpCenterApi = helpCenterApi;
        this.appConfig = appConfig;
        this.metricTracker = metricTracker;
        this.place = place;
        this.helpCenterEligibilityChecker = helpCenterEligibilityChecker;
        this.dispatcher = dispatcher;
        this.intercomDataLayer = intercomDataLayer;
        this.commonRepository = commonRepository;
        k0<CollectionsUiState> k0VarA = b1.a(CollectionsUiState.Initial.INSTANCE);
        this._collectionsState = k0VarA;
        this.collectionsState = k.n(k0VarA);
        k0<CollectionDetailsUiState> k0VarA2 = b1.a(CollectionDetailsUiState.Initial.INSTANCE);
        this._collectionDetailsState = k0VarA2;
        this.collectionDetailsState = k.n(k0VarA2);
        j0<CollectionsUiEffects> j0VarB = q0.b(0, 0, null, 7, null);
        this._effect = j0VarB;
        this.effect = kotlinx.coroutines.flow.f0.h(j0VarB, g2.a(this), u0.f314834a.c(), 0, 4, null);
        this.genericError = new ErrorState.WithoutCTA(0, 0, null, 7, null);
        this.notFoundError = new ErrorState.WithoutCTA(0, R.string.intercom_page_not_found, null, 5, null);
        this.searchBrowseTeamPresenceState$delegate = g0.c(new Function0() { // from class: io.intercom.android.sdk.m5.helpcenter.a
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return HelpCenterViewModel.searchBrowseTeamPresenceState_delegate$lambda$0(this.f292688a);
            }
        });
        if (place.length() > 0) {
            metricTracker.openedNativeHelpCenter(place, null);
        }
        kotlinx.coroutines.k.f(g2.a(this), null, null, new AnonymousClass1(null), 3, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final List<CollectionDetailsRow> transformToUiModel(HelpCenterCollectionContent helpCenterCollectionContent) {
        ArrayList arrayList = new ArrayList();
        List<HelpCenterArticle> helpCenterArticles = helpCenterCollectionContent.getHelpCenterArticles();
        ArrayList arrayList2 = new ArrayList(CollectionsKt.collectionSizeOrDefault(helpCenterArticles, 10));
        for (HelpCenterArticle helpCenterArticle : helpCenterArticles) {
            arrayList2.add(new CollectionDetailsRow.ArticleRow(helpCenterArticle.getArticleId(), helpCenterArticle.getTitle()));
        }
        arrayList.addAll(arrayList2);
        List<HelpCenterCollection> subCollections = helpCenterCollectionContent.getSubCollections();
        ArrayList arrayList3 = new ArrayList(CollectionsKt.collectionSizeOrDefault(subCollections, 10));
        for (HelpCenterCollection helpCenterCollection : subCollections) {
            arrayList3.add(new CollectionDetailsRow.CollectionRow(new CollectionRowData(helpCenterCollection.getId(), helpCenterCollection.getTitle(), helpCenterCollection.getSummary().length() == 0 ? 8 : 0, helpCenterCollection.getSummary(), helpCenterCollection.getArticlesCount(), helpCenterCollection.getCollectionsCount())));
        }
        arrayList.addAll(arrayList3);
        return arrayList;
    }
}
