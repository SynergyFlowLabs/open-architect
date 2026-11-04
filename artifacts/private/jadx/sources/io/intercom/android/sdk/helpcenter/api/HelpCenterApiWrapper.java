package io.intercom.android.sdk.helpcenter.api;

import androidx.compose.runtime.internal.w0;
import io.intercom.android.sdk.helpcenter.collections.HelpCenterCollection;
import io.intercom.android.sdk.helpcenter.search.HelpCenterArticleSearchResponse;
import io.intercom.android.sdk.helpcenter.sections.HelpCenterCollectionContent;
import io.intercom.android.sdk.helpcenter.utils.networking.NetworkResponse;
import io.intercom.android.sdk.metrics.MetricTracker;
import java.util.ArrayList;
import java.util.List;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.coroutines.d;
import kotlin.coroutines.intrinsics.b;
import kotlin.coroutines.jvm.internal.f;
import kotlin.coroutines.jvm.internal.o;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.k0;
import kotlin.text.StringsKt;
import kotlinx.coroutines.f2;
import kotlinx.coroutines.k;
import kotlinx.coroutines.l1;
import kotlinx.coroutines.s0;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes13.dex */
@w0(parameters = 1)
@SourceDebugExtension({"SMAP\nHelpCenterApiWrapper.kt\nKotlin\n*S Kotlin\n*F\n+ 1 HelpCenterApiWrapper.kt\nio/intercom/android/sdk/helpcenter/api/HelpCenterApiWrapper\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,146:1\n1557#2:147\n1628#2,3:148\n*S KotlinDebug\n*F\n+ 1 HelpCenterApiWrapper.kt\nio/intercom/android/sdk/helpcenter/api/HelpCenterApiWrapper\n*L\n127#1:147\n127#1:148,3\n*E\n"})
public final class HelpCenterApiWrapper {
    public static final int $stable = 0;

    @NotNull
    public static final HelpCenterApiWrapper INSTANCE = new HelpCenterApiWrapper();

    /* JADX INFO: renamed from: io.intercom.android.sdk.helpcenter.api.HelpCenterApiWrapper$fetchHelpCenterCollection$1, reason: invalid class name */
    @f(c = "io.intercom.android.sdk.helpcenter.api.HelpCenterApiWrapper$fetchHelpCenterCollection$1", f = "HelpCenterApiWrapper.kt", i = {}, l = {com.planner5d.library.engine.input.f.b.f160718p1, 99}, m = "invokeSuspend", n = {}, s = {})
    static final class AnonymousClass1 extends o implements Function2<s0, d<? super Unit>, Object> {
        final /* synthetic */ CollectionContentRequestCallback $collectionContentRequestCallback;
        final /* synthetic */ String $collectionId;
        final /* synthetic */ MetricTracker $metricTracker;
        int label;

        /* JADX INFO: renamed from: io.intercom.android.sdk.helpcenter.api.HelpCenterApiWrapper$fetchHelpCenterCollection$1$1, reason: invalid class name and collision with other inner class name */
        @f(c = "io.intercom.android.sdk.helpcenter.api.HelpCenterApiWrapper$fetchHelpCenterCollection$1$1", f = "HelpCenterApiWrapper.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
        static final class C19981 extends o implements Function2<s0, d<? super Unit>, Object> {
            final /* synthetic */ CollectionContentRequestCallback $collectionContentRequestCallback;
            final /* synthetic */ NetworkResponse<HelpCenterCollectionContent> $fetchSectionsListResponse;
            final /* synthetic */ MetricTracker $metricTracker;
            int label;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            C19981(NetworkResponse<HelpCenterCollectionContent> networkResponse, MetricTracker metricTracker, CollectionContentRequestCallback collectionContentRequestCallback, d<? super C19981> dVar) {
                super(2, dVar);
                this.$fetchSectionsListResponse = networkResponse;
                this.$metricTracker = metricTracker;
                this.$collectionContentRequestCallback = collectionContentRequestCallback;
            }

            @Override // kotlin.coroutines.jvm.internal.a
            public final d<Unit> create(Object obj, d<?> dVar) {
                return new C19981(this.$fetchSectionsListResponse, this.$metricTracker, this.$collectionContentRequestCallback, dVar);
            }

            @Override // kotlin.coroutines.jvm.internal.a
            public final Object invokeSuspend(Object obj) {
                b.l();
                if (this.label != 0) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.m(obj);
                NetworkResponse<HelpCenterCollectionContent> networkResponse = this.$fetchSectionsListResponse;
                if (networkResponse instanceof NetworkResponse.ServerError) {
                    this.$metricTracker.failedHelpCenter(MetricTracker.Object.HELP_CENTER_DATA_API, MetricTracker.Place.ARTICLE_LIST, String.valueOf(((NetworkResponse.ServerError) networkResponse).getCode()), false);
                    this.$collectionContentRequestCallback.onError(((NetworkResponse.ServerError) this.$fetchSectionsListResponse).getCode());
                } else if ((networkResponse instanceof NetworkResponse.ClientError) || (networkResponse instanceof NetworkResponse.NetworkError)) {
                    this.$metricTracker.failedHelpCenter(MetricTracker.Object.HELP_CENTER_DATA_API, MetricTracker.Place.ARTICLE_LIST, null, false);
                    this.$collectionContentRequestCallback.onFailure();
                } else {
                    if (!(networkResponse instanceof NetworkResponse.Success)) {
                        throw new k0();
                    }
                    this.$collectionContentRequestCallback.onComplete((HelpCenterCollectionContent) ((NetworkResponse.Success) networkResponse).getBody());
                }
                return Unit.f312394a;
            }

            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(s0 s0Var, d<? super Unit> dVar) {
                return ((C19981) create(s0Var, dVar)).invokeSuspend(Unit.f312394a);
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        AnonymousClass1(MetricTracker metricTracker, String str, CollectionContentRequestCallback collectionContentRequestCallback, d<? super AnonymousClass1> dVar) {
            super(2, dVar);
            this.$metricTracker = metricTracker;
            this.$collectionId = str;
            this.$collectionContentRequestCallback = collectionContentRequestCallback;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final d<Unit> create(Object obj, d<?> dVar) {
            return new AnonymousClass1(this.$metricTracker, this.$collectionId, this.$collectionContentRequestCallback, dVar);
        }

        /* JADX WARN: Code restructure failed: missing block: B:15:0x0068, code lost:
        
            if (kotlinx.coroutines.i.h(r11, r1, r7) == r0) goto L16;
         */
        @Override // kotlin.coroutines.jvm.internal.a
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public final java.lang.Object invokeSuspend(java.lang.Object r12) {
            /*
                r11 = this;
                java.lang.Object r0 = kotlin.coroutines.intrinsics.b.l()
                int r1 = r11.label
                r2 = 2
                r10 = 4
                r3 = 1
                if (r1 == 0) goto L24
                r10 = 5
                if (r1 == r3) goto L1e
                if (r1 != r2) goto L15
                r10 = 4
                kotlin.ResultKt.m(r12)
                goto L6b
            L15:
                java.lang.IllegalStateException r11 = new java.lang.IllegalStateException
                java.lang.String r12 = "call to 'resume' before 'invoke' with coroutine"
                r11.<init>(r12)
                r10 = 0
                throw r11
            L1e:
                kotlin.ResultKt.m(r12)
                r7 = r11
                r7 = r11
                goto L4c
            L24:
                kotlin.ResultKt.m(r12)
                io.intercom.android.sdk.metrics.MetricTracker r12 = r11.$metricTracker
                java.lang.String r1 = "taslltr_iecs"
                java.lang.String r1 = "article_list"
                r12.requestedHelpCenterData(r1)
                io.intercom.android.sdk.Injector r12 = io.intercom.android.sdk.Injector.get()
                r10 = 3
                io.intercom.android.sdk.helpcenter.api.HelpCenterApi r4 = r12.getHelpCenterApi()
                r10 = 4
                java.lang.String r5 = r11.$collectionId
                r11.label = r3
                r10 = 0
                r6 = 0
                r8 = 2
                r9 = 2
                r9 = 0
                r7 = r11
                r10 = 3
                java.lang.Object r12 = io.intercom.android.sdk.helpcenter.api.HelpCenterApi.DefaultImpls.fetchCollectionDetails$default(r4, r5, r6, r7, r8, r9)
                if (r12 != r0) goto L4c
                goto L6a
            L4c:
                r10 = 4
                io.intercom.android.sdk.helpcenter.utils.networking.NetworkResponse r12 = (io.intercom.android.sdk.helpcenter.utils.networking.NetworkResponse) r12
                kotlinx.coroutines.a3 r11 = kotlinx.coroutines.l1.e()
                io.intercom.android.sdk.helpcenter.api.HelpCenterApiWrapper$fetchHelpCenterCollection$1$1 r1 = new io.intercom.android.sdk.helpcenter.api.HelpCenterApiWrapper$fetchHelpCenterCollection$1$1
                r10 = 6
                io.intercom.android.sdk.metrics.MetricTracker r3 = r7.$metricTracker
                r10 = 5
                io.intercom.android.sdk.helpcenter.api.CollectionContentRequestCallback r4 = r7.$collectionContentRequestCallback
                r10 = 3
                r5 = 0
                r10 = 5
                r1.<init>(r12, r3, r4, r5)
                r7.label = r2
                java.lang.Object r11 = kotlinx.coroutines.i.h(r11, r1, r7)
                r10 = 4
                if (r11 != r0) goto L6b
            L6a:
                return r0
            L6b:
                kotlin.Unit r11 = kotlin.Unit.f312394a
                r10 = 1
                return r11
            */
            throw new UnsupportedOperationException("Method not decompiled: io.intercom.android.sdk.helpcenter.api.HelpCenterApiWrapper.AnonymousClass1.invokeSuspend(java.lang.Object):java.lang.Object");
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(s0 s0Var, d<? super Unit> dVar) {
            return ((AnonymousClass1) create(s0Var, dVar)).invokeSuspend(Unit.f312394a);
        }
    }

    /* JADX INFO: renamed from: io.intercom.android.sdk.helpcenter.api.HelpCenterApiWrapper$fetchHelpCenterCollections$1, reason: invalid class name and case insensitive filesystem */
    @f(c = "io.intercom.android.sdk.helpcenter.api.HelpCenterApiWrapper$fetchHelpCenterCollections$1", f = "HelpCenterApiWrapper.kt", i = {}, l = {23, 24}, m = "invokeSuspend", n = {}, s = {})
    static final class C27721 extends o implements Function2<s0, d<? super Unit>, Object> {
        final /* synthetic */ CollectionRequestCallback $collectionRequestCallback;
        final /* synthetic */ MetricTracker $metricTracker;
        int label;

        /* JADX INFO: renamed from: io.intercom.android.sdk.helpcenter.api.HelpCenterApiWrapper$fetchHelpCenterCollections$1$1, reason: invalid class name and collision with other inner class name */
        @f(c = "io.intercom.android.sdk.helpcenter.api.HelpCenterApiWrapper$fetchHelpCenterCollections$1$1", f = "HelpCenterApiWrapper.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
        static final class C19991 extends o implements Function2<s0, d<? super Unit>, Object> {
            final /* synthetic */ CollectionRequestCallback $collectionRequestCallback;
            final /* synthetic */ NetworkResponse<List<HelpCenterCollection>> $fetchCollectionListResponse;
            final /* synthetic */ MetricTracker $metricTracker;
            int label;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            /* JADX WARN: Multi-variable type inference failed */
            C19991(NetworkResponse<? extends List<HelpCenterCollection>> networkResponse, MetricTracker metricTracker, CollectionRequestCallback collectionRequestCallback, d<? super C19991> dVar) {
                super(2, dVar);
                this.$fetchCollectionListResponse = networkResponse;
                this.$metricTracker = metricTracker;
                this.$collectionRequestCallback = collectionRequestCallback;
            }

            @Override // kotlin.coroutines.jvm.internal.a
            public final d<Unit> create(Object obj, d<?> dVar) {
                return new C19991(this.$fetchCollectionListResponse, this.$metricTracker, this.$collectionRequestCallback, dVar);
            }

            @Override // kotlin.coroutines.jvm.internal.a
            public final Object invokeSuspend(Object obj) {
                b.l();
                if (this.label != 0) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.m(obj);
                NetworkResponse<List<HelpCenterCollection>> networkResponse = this.$fetchCollectionListResponse;
                int i10 = 2 << 0;
                if (networkResponse instanceof NetworkResponse.ServerError) {
                    this.$metricTracker.failedHelpCenter(MetricTracker.Object.HELP_CENTER_DATA_API, MetricTracker.Place.COLLECTION_LIST, String.valueOf(((NetworkResponse.ServerError) networkResponse).getCode()), false);
                    this.$collectionRequestCallback.onError(((NetworkResponse.ServerError) this.$fetchCollectionListResponse).getCode());
                } else if ((networkResponse instanceof NetworkResponse.ClientError) || (networkResponse instanceof NetworkResponse.NetworkError)) {
                    this.$metricTracker.failedHelpCenter(MetricTracker.Object.HELP_CENTER_DATA_API, MetricTracker.Place.COLLECTION_LIST, null, false);
                    this.$collectionRequestCallback.onFailure();
                } else {
                    if (!(networkResponse instanceof NetworkResponse.Success)) {
                        throw new k0();
                    }
                    this.$collectionRequestCallback.onComplete((List) ((NetworkResponse.Success) networkResponse).getBody());
                }
                return Unit.f312394a;
            }

            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(s0 s0Var, d<? super Unit> dVar) {
                return ((C19991) create(s0Var, dVar)).invokeSuspend(Unit.f312394a);
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C27721(MetricTracker metricTracker, CollectionRequestCallback collectionRequestCallback, d<? super C27721> dVar) {
            super(2, dVar);
            this.$metricTracker = metricTracker;
            this.$collectionRequestCallback = collectionRequestCallback;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final d<Unit> create(Object obj, d<?> dVar) {
            return new C27721(this.$metricTracker, this.$collectionRequestCallback, dVar);
        }

        /* JADX WARN: Code restructure failed: missing block: B:15:0x0059, code lost:
        
            if (kotlinx.coroutines.i.h(r1, r4, r8) == r0) goto L16;
         */
        @Override // kotlin.coroutines.jvm.internal.a
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public final java.lang.Object invokeSuspend(java.lang.Object r9) {
            /*
                r8 = this;
                java.lang.Object r0 = kotlin.coroutines.intrinsics.b.l()
                int r1 = r8.label
                r2 = 2
                r7 = 1
                r3 = 0
                r4 = 1
                if (r1 == 0) goto L23
                if (r1 == r4) goto L1f
                r7 = 3
                if (r1 != r2) goto L15
                kotlin.ResultKt.m(r9)
                goto L5c
            L15:
                java.lang.IllegalStateException r8 = new java.lang.IllegalStateException
                r7 = 6
                java.lang.String r9 = "call to 'resume' before 'invoke' with coroutine"
                r7 = 4
                r8.<init>(r9)
                throw r8
            L1f:
                kotlin.ResultKt.m(r9)
                goto L42
            L23:
                r7 = 3
                kotlin.ResultKt.m(r9)
                r7 = 6
                io.intercom.android.sdk.metrics.MetricTracker r9 = r8.$metricTracker
                java.lang.String r1 = "collection_list"
                r9.requestedHelpCenterData(r1)
                r7 = 3
                io.intercom.android.sdk.Injector r9 = io.intercom.android.sdk.Injector.get()
                io.intercom.android.sdk.helpcenter.api.HelpCenterApi r9 = r9.getHelpCenterApi()
                r8.label = r4
                java.lang.Object r9 = io.intercom.android.sdk.helpcenter.api.HelpCenterApi.DefaultImpls.fetchCollections$default(r9, r3, r8, r4, r3)
                r7 = 0
                if (r9 != r0) goto L42
                goto L5b
            L42:
                io.intercom.android.sdk.helpcenter.utils.networking.NetworkResponse r9 = (io.intercom.android.sdk.helpcenter.utils.networking.NetworkResponse) r9
                kotlinx.coroutines.a3 r1 = kotlinx.coroutines.l1.e()
                io.intercom.android.sdk.helpcenter.api.HelpCenterApiWrapper$fetchHelpCenterCollections$1$1 r4 = new io.intercom.android.sdk.helpcenter.api.HelpCenterApiWrapper$fetchHelpCenterCollections$1$1
                r7 = 3
                io.intercom.android.sdk.metrics.MetricTracker r5 = r8.$metricTracker
                io.intercom.android.sdk.helpcenter.api.CollectionRequestCallback r6 = r8.$collectionRequestCallback
                r4.<init>(r9, r5, r6, r3)
                r8.label = r2
                java.lang.Object r8 = kotlinx.coroutines.i.h(r1, r4, r8)
                r7 = 5
                if (r8 != r0) goto L5c
            L5b:
                return r0
            L5c:
                kotlin.Unit r8 = kotlin.Unit.f312394a
                return r8
            */
            throw new UnsupportedOperationException("Method not decompiled: io.intercom.android.sdk.helpcenter.api.HelpCenterApiWrapper.C27721.invokeSuspend(java.lang.Object):java.lang.Object");
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(s0 s0Var, d<? super Unit> dVar) {
            return ((C27721) create(s0Var, dVar)).invokeSuspend(Unit.f312394a);
        }
    }

    /* JADX INFO: renamed from: io.intercom.android.sdk.helpcenter.api.HelpCenterApiWrapper$fetchHelpCenterResultsForSearchTerm$1, reason: invalid class name and case insensitive filesystem */
    @f(c = "io.intercom.android.sdk.helpcenter.api.HelpCenterApiWrapper$fetchHelpCenterResultsForSearchTerm$1", f = "HelpCenterApiWrapper.kt", i = {}, l = {com.planner5d.library.engine.input.f.b.D0, 60}, m = "invokeSuspend", n = {}, s = {})
    static final class C27731 extends o implements Function2<s0, d<? super Unit>, Object> {
        final /* synthetic */ MetricTracker $metricTracker;
        final /* synthetic */ SearchRequestCallback $searchRequestCallback;
        final /* synthetic */ String $searchTerm;
        int label;

        /* JADX INFO: renamed from: io.intercom.android.sdk.helpcenter.api.HelpCenterApiWrapper$fetchHelpCenterResultsForSearchTerm$1$1, reason: invalid class name and collision with other inner class name */
        @f(c = "io.intercom.android.sdk.helpcenter.api.HelpCenterApiWrapper$fetchHelpCenterResultsForSearchTerm$1$1", f = "HelpCenterApiWrapper.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
        static final class C20001 extends o implements Function2<s0, d<? super Unit>, Object> {
            final /* synthetic */ MetricTracker $metricTracker;
            final /* synthetic */ NetworkResponse<List<HelpCenterArticleSearchResponse>> $searchForArticlesResponse;
            final /* synthetic */ SearchRequestCallback $searchRequestCallback;
            int label;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            /* JADX WARN: Multi-variable type inference failed */
            C20001(NetworkResponse<? extends List<HelpCenterArticleSearchResponse>> networkResponse, MetricTracker metricTracker, SearchRequestCallback searchRequestCallback, d<? super C20001> dVar) {
                super(2, dVar);
                this.$searchForArticlesResponse = networkResponse;
                this.$metricTracker = metricTracker;
                this.$searchRequestCallback = searchRequestCallback;
            }

            @Override // kotlin.coroutines.jvm.internal.a
            public final d<Unit> create(Object obj, d<?> dVar) {
                return new C20001(this.$searchForArticlesResponse, this.$metricTracker, this.$searchRequestCallback, dVar);
            }

            @Override // kotlin.coroutines.jvm.internal.a
            public final Object invokeSuspend(Object obj) {
                b.l();
                if (this.label != 0) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.m(obj);
                NetworkResponse<List<HelpCenterArticleSearchResponse>> networkResponse = this.$searchForArticlesResponse;
                if (networkResponse instanceof NetworkResponse.ServerError) {
                    this.$metricTracker.failedHelpCenter(MetricTracker.Object.HELP_CENTER_DATA_API, "search_results", String.valueOf(((NetworkResponse.ServerError) networkResponse).getCode()), false);
                    this.$searchRequestCallback.onError(((NetworkResponse.ServerError) this.$searchForArticlesResponse).getCode());
                } else if ((networkResponse instanceof NetworkResponse.ClientError) || (networkResponse instanceof NetworkResponse.NetworkError)) {
                    this.$metricTracker.failedHelpCenter(MetricTracker.Object.HELP_CENTER_DATA_API, "search_results", null, false);
                    this.$searchRequestCallback.onFailure();
                } else {
                    if (!(networkResponse instanceof NetworkResponse.Success)) {
                        throw new k0();
                    }
                    this.$searchRequestCallback.onComplete(HelpCenterApiWrapper.INSTANCE.transformSearchResponse((List) ((NetworkResponse.Success) networkResponse).getBody()));
                }
                return Unit.f312394a;
            }

            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(s0 s0Var, d<? super Unit> dVar) {
                return ((C20001) create(s0Var, dVar)).invokeSuspend(Unit.f312394a);
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C27731(MetricTracker metricTracker, String str, SearchRequestCallback searchRequestCallback, d<? super C27731> dVar) {
            super(2, dVar);
            this.$metricTracker = metricTracker;
            this.$searchTerm = str;
            this.$searchRequestCallback = searchRequestCallback;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final d<Unit> create(Object obj, d<?> dVar) {
            return new C27731(this.$metricTracker, this.$searchTerm, this.$searchRequestCallback, dVar);
        }

        /* JADX WARN: Code restructure failed: missing block: B:15:0x0069, code lost:
        
            if (kotlinx.coroutines.i.h(r12, r1, r8) == r0) goto L16;
         */
        @Override // kotlin.coroutines.jvm.internal.a
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public final java.lang.Object invokeSuspend(java.lang.Object r13) {
            /*
                r12 = this;
                java.lang.Object r0 = kotlin.coroutines.intrinsics.b.l()
                r11 = 5
                int r1 = r12.label
                r2 = 2
                r11 = 7
                r3 = 1
                if (r1 == 0) goto L25
                r11 = 6
                if (r1 == r3) goto L1e
                if (r1 != r2) goto L16
                kotlin.ResultKt.m(r13)
                r11 = 7
                goto L6c
            L16:
                java.lang.IllegalStateException r12 = new java.lang.IllegalStateException
                java.lang.String r13 = "call to 'resume' before 'invoke' with coroutine"
                r12.<init>(r13)
                throw r12
            L1e:
                kotlin.ResultKt.m(r13)
                r8 = r12
                r8 = r12
                r11 = 1
                goto L4f
            L25:
                kotlin.ResultKt.m(r13)
                io.intercom.android.sdk.metrics.MetricTracker r13 = r12.$metricTracker
                r11 = 6
                java.lang.String r1 = "srseutssacl_re"
                java.lang.String r1 = "search_results"
                r11 = 3
                r13.requestedHelpCenterData(r1)
                r11 = 2
                io.intercom.android.sdk.Injector r13 = io.intercom.android.sdk.Injector.get()
                io.intercom.android.sdk.helpcenter.api.HelpCenterApi r4 = r13.getHelpCenterApi()
                java.lang.String r5 = r12.$searchTerm
                r12.label = r3
                r6 = 0
                r7 = 1
                r7 = 0
                r9 = 2
                r9 = 6
                r10 = 0
                r8 = r12
                r11 = 3
                java.lang.Object r13 = io.intercom.android.sdk.helpcenter.api.HelpCenterApi.DefaultImpls.searchForArticles$default(r4, r5, r6, r7, r8, r9, r10)
                if (r13 != r0) goto L4f
                goto L6b
            L4f:
                io.intercom.android.sdk.helpcenter.utils.networking.NetworkResponse r13 = (io.intercom.android.sdk.helpcenter.utils.networking.NetworkResponse) r13
                kotlinx.coroutines.a3 r12 = kotlinx.coroutines.l1.e()
                r11 = 5
                io.intercom.android.sdk.helpcenter.api.HelpCenterApiWrapper$fetchHelpCenterResultsForSearchTerm$1$1 r1 = new io.intercom.android.sdk.helpcenter.api.HelpCenterApiWrapper$fetchHelpCenterResultsForSearchTerm$1$1
                io.intercom.android.sdk.metrics.MetricTracker r3 = r8.$metricTracker
                io.intercom.android.sdk.helpcenter.api.SearchRequestCallback r4 = r8.$searchRequestCallback
                r5 = 5
                r5 = 0
                r11 = 0
                r1.<init>(r13, r3, r4, r5)
                r11 = 1
                r8.label = r2
                java.lang.Object r12 = kotlinx.coroutines.i.h(r12, r1, r8)
                if (r12 != r0) goto L6c
            L6b:
                return r0
            L6c:
                r11 = 2
                kotlin.Unit r12 = kotlin.Unit.f312394a
                return r12
            */
            throw new UnsupportedOperationException("Method not decompiled: io.intercom.android.sdk.helpcenter.api.HelpCenterApiWrapper.C27731.invokeSuspend(java.lang.Object):java.lang.Object");
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(s0 s0Var, d<? super Unit> dVar) {
            return ((C27731) create(s0Var, dVar)).invokeSuspend(Unit.f312394a);
        }
    }

    private HelpCenterApiWrapper() {
    }

    private final String removeHighlightTags(String str) {
        return StringsKt.k2(StringsKt.k2(str, "<highlight>", "", false, 4, null), "</highlight>", "", false, 4, null);
    }

    public final void fetchHelpCenterCollection(@NotNull MetricTracker metricTracker, @NotNull String collectionId, @NotNull CollectionContentRequestCallback collectionContentRequestCallback) {
        Intrinsics.checkNotNullParameter(metricTracker, "metricTracker");
        Intrinsics.checkNotNullParameter(collectionId, "collectionId");
        Intrinsics.checkNotNullParameter(collectionContentRequestCallback, "collectionContentRequestCallback");
        k.f(f2.f314023a, l1.c(), null, new AnonymousClass1(metricTracker, collectionId, collectionContentRequestCallback, null), 2, null);
    }

    public final void fetchHelpCenterCollections(@NotNull MetricTracker metricTracker, @NotNull CollectionRequestCallback collectionRequestCallback) {
        Intrinsics.checkNotNullParameter(metricTracker, "metricTracker");
        Intrinsics.checkNotNullParameter(collectionRequestCallback, "collectionRequestCallback");
        k.f(f2.f314023a, l1.c(), null, new C27721(metricTracker, collectionRequestCallback, null), 2, null);
    }

    public final void fetchHelpCenterResultsForSearchTerm(@NotNull MetricTracker metricTracker, @NotNull String searchTerm, @NotNull SearchRequestCallback searchRequestCallback) {
        Intrinsics.checkNotNullParameter(metricTracker, "metricTracker");
        Intrinsics.checkNotNullParameter(searchTerm, "searchTerm");
        Intrinsics.checkNotNullParameter(searchRequestCallback, "searchRequestCallback");
        k.f(f2.f314023a, l1.c(), null, new C27731(metricTracker, searchTerm, searchRequestCallback, null), 2, null);
    }

    @NotNull
    public final List<HelpCenterArticleSearchResult> transformSearchResponse(@NotNull List<HelpCenterArticleSearchResponse> response) {
        Intrinsics.checkNotNullParameter(response, "response");
        List<HelpCenterArticleSearchResponse> list = response;
        ArrayList arrayList = new ArrayList(CollectionsKt.collectionSizeOrDefault(list, 10));
        for (HelpCenterArticleSearchResponse helpCenterArticleSearchResponse : list) {
            String title = helpCenterArticleSearchResponse.getHighlight().getTitle();
            String title2 = (title == null || title.length() == 0) ? helpCenterArticleSearchResponse.getTitle() : helpCenterArticleSearchResponse.getHighlight().getTitle();
            String summary = helpCenterArticleSearchResponse.getHighlight().getSummary();
            String str = "";
            if (summary == null) {
                summary = "";
            }
            String articleId = helpCenterArticleSearchResponse.getArticleId();
            HelpCenterApiWrapper helpCenterApiWrapper = INSTANCE;
            String strRemoveHighlightTags = helpCenterApiWrapper.removeHighlightTags(title2);
            String summary2 = helpCenterArticleSearchResponse.getSummary();
            if (summary2 != null) {
                str = summary2;
            }
            arrayList.add(new HelpCenterArticleSearchResult(articleId, strRemoveHighlightTags, str, helpCenterApiWrapper.removeHighlightTags(summary)));
        }
        return arrayList;
    }
}
