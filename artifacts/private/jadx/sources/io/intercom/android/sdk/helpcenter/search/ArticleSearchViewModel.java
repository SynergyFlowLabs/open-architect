package io.intercom.android.sdk.helpcenter.search;

import androidx.compose.runtime.internal.w0;
import androidx.lifecycle.f2;
import androidx.lifecycle.g2;
import androidx.lifecycle.j2;
import androidx.lifecycle.m2;
import io.intercom.android.sdk.Injector;
import io.intercom.android.sdk.api.MessengerApi;
import io.intercom.android.sdk.helpcenter.api.HelpCenterApi;
import io.intercom.android.sdk.helpcenter.articles.ArticleViewState;
import io.intercom.android.sdk.helpcenter.component.TeammateHelpKt;
import io.intercom.android.sdk.helpcenter.utils.networking.NetworkResponse;
import io.intercom.android.sdk.identity.AppConfig;
import io.intercom.android.sdk.m5.data.CommonRepository;
import io.intercom.android.sdk.m5.data.IntercomDataLayer;
import io.intercom.android.sdk.m5.data.IntercomEvent;
import io.intercom.android.sdk.metrics.MetricTracker;
import io.intercom.android.sdk.models.OpenMessengerResponse;
import io.intercom.android.sdk.utilities.extensions.AppConfigExtensionsKt;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import kotlin.Pair;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlinx.coroutines.d1;
import kotlinx.coroutines.e2;
import kotlinx.coroutines.flow.b1;
import kotlinx.coroutines.flow.j0;
import kotlinx.coroutines.flow.k0;
import kotlinx.coroutines.flow.o0;
import kotlinx.coroutines.flow.q0;
import kotlinx.coroutines.flow.z0;
import kotlinx.coroutines.l1;
import kotlinx.coroutines.n0;
import kotlinx.coroutines.s0;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes13.dex */
@w0(parameters = 0)
@SourceDebugExtension({"SMAP\nArticleSearchViewModel.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ArticleSearchViewModel.kt\nio/intercom/android/sdk/helpcenter/search/ArticleSearchViewModel\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n+ 3 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,282:1\n2632#2,3:283\n827#2:286\n855#2,2:287\n1557#2:289\n1628#2,2:290\n1630#2:293\n1#3:292\n*S KotlinDebug\n*F\n+ 1 ArticleSearchViewModel.kt\nio/intercom/android/sdk/helpcenter/search/ArticleSearchViewModel\n*L\n150#1:283,3\n158#1:286\n158#1:287,2\n213#1:289\n213#1:290,2\n213#1:293\n*E\n"})
public final class ArticleSearchViewModel extends f2 {

    @NotNull
    private final k0<ArticleSearchState> _state;

    @NotNull
    private final AppConfig appConfig;

    @NotNull
    private final CommonRepository commonRepository;

    @NotNull
    private final n0 dispatcher;
    private boolean hasClickedAtLeastOneArticle;

    @NotNull
    private final HelpCenterApi helpCenterApi;

    @NotNull
    private final IntercomDataLayer intercomDataLayer;
    private final boolean isFromSearchBrowse;

    @NotNull
    private String lastSearchedInput;

    @NotNull
    private final MetricTracker metricTracker;

    @NotNull
    private final j0<String> searchInput;

    @NotNull
    private final z0<ArticleSearchState> state;

    @NotNull
    public static final Companion Companion = new Companion(null);
    public static final int $stable = 8;

    /* JADX INFO: renamed from: io.intercom.android.sdk.helpcenter.search.ArticleSearchViewModel$1, reason: invalid class name */
    @kotlin.coroutines.jvm.internal.f(c = "io.intercom.android.sdk.helpcenter.search.ArticleSearchViewModel$1", f = "ArticleSearchViewModel.kt", i = {}, l = {118}, m = "invokeSuspend", n = {}, s = {})
    @SourceDebugExtension({"SMAP\nArticleSearchViewModel.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ArticleSearchViewModel.kt\nio/intercom/android/sdk/helpcenter/search/ArticleSearchViewModel$1\n+ 2 Merge.kt\nkotlinx/coroutines/flow/FlowKt__MergeKt\n+ 3 Transform.kt\nkotlinx/coroutines/flow/FlowKt__TransformKt\n+ 4 Emitters.kt\nkotlinx/coroutines/flow/FlowKt__EmittersKt\n+ 5 SafeCollector.common.kt\nkotlinx/coroutines/flow/internal/SafeCollector_commonKt\n*L\n1#1,282:1\n189#2:283\n49#3:284\n51#3:288\n49#3:289\n51#3:293\n46#4:285\n51#4:287\n46#4:290\n51#4:292\n105#5:286\n105#5:291\n*S KotlinDebug\n*F\n+ 1 ArticleSearchViewModel.kt\nio/intercom/android/sdk/helpcenter/search/ArticleSearchViewModel$1\n*L\n61#1:283\n72#1:284\n72#1:288\n76#1:289\n76#1:293\n72#1:285\n72#1:287\n76#1:290\n76#1:292\n72#1:286\n76#1:291\n*E\n"})
    static final class AnonymousClass1 extends kotlin.coroutines.jvm.internal.o implements Function2<s0, kotlin.coroutines.d<? super Unit>, Object> {
        int label;

        AnonymousClass1(kotlin.coroutines.d<? super AnonymousClass1> dVar) {
            super(2, dVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final kotlin.coroutines.d<Unit> create(Object obj, kotlin.coroutines.d<?> dVar) {
            return ArticleSearchViewModel.this.new AnonymousClass1(dVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            Object objL = kotlin.coroutines.intrinsics.b.l();
            int i10 = this.label;
            if (i10 == 0) {
                ResultKt.m(obj);
                int i11 = 0 >> 0;
                final kotlinx.coroutines.flow.i iVarF2 = kotlinx.coroutines.flow.k.f2(ArticleSearchViewModel.this.searchInput, new ArticleSearchViewModel$1$invokeSuspend$$inlined$flatMapLatest$1(null, ArticleSearchViewModel.this));
                final ArticleSearchViewModel articleSearchViewModel = ArticleSearchViewModel.this;
                final kotlinx.coroutines.flow.i<NetworkResponse<? extends List<? extends HelpCenterArticleSearchResponse>>> iVar = new kotlinx.coroutines.flow.i<NetworkResponse<? extends List<? extends HelpCenterArticleSearchResponse>>>() { // from class: io.intercom.android.sdk.helpcenter.search.ArticleSearchViewModel$1$invokeSuspend$$inlined$map$1

                    /* JADX INFO: renamed from: io.intercom.android.sdk.helpcenter.search.ArticleSearchViewModel$1$invokeSuspend$$inlined$map$1$2, reason: invalid class name */
                    @SourceDebugExtension({"SMAP\nEmitters.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Emitters.kt\nkotlinx/coroutines/flow/FlowKt__EmittersKt$unsafeTransform$1$1\n+ 2 Transform.kt\nkotlinx/coroutines/flow/FlowKt__TransformKt\n+ 3 ArticleSearchViewModel.kt\nio/intercom/android/sdk/helpcenter/search/ArticleSearchViewModel$1\n*L\n1#1,218:1\n50#2:219\n73#3,2:220\n*E\n"})
                    public static final class AnonymousClass2<T> implements kotlinx.coroutines.flow.j {
                        final /* synthetic */ kotlinx.coroutines.flow.j $this_unsafeFlow;
                        final /* synthetic */ ArticleSearchViewModel this$0;

                        /* JADX INFO: renamed from: io.intercom.android.sdk.helpcenter.search.ArticleSearchViewModel$1$invokeSuspend$$inlined$map$1$2$1, reason: invalid class name */
                        @kotlin.coroutines.jvm.internal.f(c = "io.intercom.android.sdk.helpcenter.search.ArticleSearchViewModel$1$invokeSuspend$$inlined$map$1$2", f = "ArticleSearchViewModel.kt", i = {}, l = {219}, m = "emit", n = {}, s = {})
                        public static final class AnonymousClass1 extends kotlin.coroutines.jvm.internal.d {
                            Object L$0;
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

                        public AnonymousClass2(kotlinx.coroutines.flow.j jVar, ArticleSearchViewModel articleSearchViewModel) {
                            this.$this_unsafeFlow = jVar;
                            this.this$0 = articleSearchViewModel;
                        }

                        /* JADX WARN: Code duplicated, block: B:7:0x0017  */
                        /* JADX WARN: Multi-variable type inference failed */
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
                                Pair pair = (Pair) obj;
                                this.this$0.lastSearchedInput = (String) pair.getSecond();
                                Object first = pair.getFirst();
                                anonymousClass1.label = 1;
                                if (jVar.emit(first, anonymousClass1) == objL) {
                                    return objL;
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
                    public Object collect(@NotNull kotlinx.coroutines.flow.j<? super NetworkResponse<? extends List<? extends HelpCenterArticleSearchResponse>>> jVar, @NotNull kotlin.coroutines.d dVar) {
                        Object objCollect = iVarF2.collect(new AnonymousClass2(jVar, articleSearchViewModel), dVar);
                        return objCollect == kotlin.coroutines.intrinsics.b.l() ? objCollect : Unit.f312394a;
                    }
                };
                final ArticleSearchViewModel articleSearchViewModel2 = ArticleSearchViewModel.this;
                kotlinx.coroutines.flow.i<ArticleSearchState> iVar2 = new kotlinx.coroutines.flow.i<ArticleSearchState>() { // from class: io.intercom.android.sdk.helpcenter.search.ArticleSearchViewModel$1$invokeSuspend$$inlined$map$2

                    /* JADX INFO: renamed from: io.intercom.android.sdk.helpcenter.search.ArticleSearchViewModel$1$invokeSuspend$$inlined$map$2$2, reason: invalid class name */
                    @SourceDebugExtension({"SMAP\nEmitters.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Emitters.kt\nkotlinx/coroutines/flow/FlowKt__EmittersKt$unsafeTransform$1$1\n+ 2 Transform.kt\nkotlinx/coroutines/flow/FlowKt__TransformKt\n+ 3 ArticleSearchViewModel.kt\nio/intercom/android/sdk/helpcenter/search/ArticleSearchViewModel$1\n*L\n1#1,218:1\n50#2:219\n77#3,41:220\n*E\n"})
                    public static final class AnonymousClass2<T> implements kotlinx.coroutines.flow.j {
                        final /* synthetic */ kotlinx.coroutines.flow.j $this_unsafeFlow;
                        final /* synthetic */ ArticleSearchViewModel this$0;

                        /* JADX INFO: renamed from: io.intercom.android.sdk.helpcenter.search.ArticleSearchViewModel$1$invokeSuspend$$inlined$map$2$2$1, reason: invalid class name */
                        @kotlin.coroutines.jvm.internal.f(c = "io.intercom.android.sdk.helpcenter.search.ArticleSearchViewModel$1$invokeSuspend$$inlined$map$2$2", f = "ArticleSearchViewModel.kt", i = {1, 1}, l = {234, com.planner5d.library.engine.input.f.b.O1, 219}, m = "emit", n = {"this", "teamPresenceState"}, s = {"L$0", "L$2"})
                        public static final class AnonymousClass1 extends kotlin.coroutines.jvm.internal.d {
                            Object L$0;
                            Object L$1;
                            Object L$2;
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

                        public AnonymousClass2(kotlinx.coroutines.flow.j jVar, ArticleSearchViewModel articleSearchViewModel) {
                            this.$this_unsafeFlow = jVar;
                            this.this$0 = articleSearchViewModel;
                        }

                        /* JADX WARN: Code duplicated, block: B:43:0x0108  */
                        /* JADX WARN: Code duplicated, block: B:44:0x010d  */
                        /* JADX WARN: Code duplicated, block: B:46:0x0110  */
                        /* JADX WARN: Code duplicated, block: B:7:0x001a  */
                        /* JADX WARN: Code restructure failed: missing block: B:54:0x015e, code lost:
                        
                            if (r4.emit(r0, r2) == r3) goto L55;
                         */
                        @Override // kotlinx.coroutines.flow.j
                        @org.jetbrains.annotations.Nullable
                        /*
                            Code decompiled incorrectly, please refer to instructions dump.
                            To view partially-correct add '--show-bad-code' argument
                        */
                        public final java.lang.Object emit(java.lang.Object r24, @org.jetbrains.annotations.NotNull kotlin.coroutines.d r25) {
                            /*
                                Method dump skipped, instruction units count: 356
                                To view this dump add '--comments-level debug' option
                            */
                            throw new UnsupportedOperationException("Method not decompiled: io.intercom.android.sdk.helpcenter.search.ArticleSearchViewModel$1$invokeSuspend$$inlined$map$2.AnonymousClass2.emit(java.lang.Object, kotlin.coroutines.d):java.lang.Object");
                        }
                    }

                    @Override // kotlinx.coroutines.flow.i
                    @Nullable
                    public Object collect(@NotNull kotlinx.coroutines.flow.j<? super ArticleSearchState> jVar, @NotNull kotlin.coroutines.d dVar) {
                        Object objCollect = iVar.collect(new AnonymousClass2(jVar, articleSearchViewModel2), dVar);
                        return objCollect == kotlin.coroutines.intrinsics.b.l() ? objCollect : Unit.f312394a;
                    }
                };
                final ArticleSearchViewModel articleSearchViewModel3 = ArticleSearchViewModel.this;
                kotlinx.coroutines.flow.j<? super ArticleSearchState> jVar = new kotlinx.coroutines.flow.j() { // from class: io.intercom.android.sdk.helpcenter.search.ArticleSearchViewModel.1.4
                    @Override // kotlinx.coroutines.flow.j
                    public /* bridge */ /* synthetic */ Object emit(Object obj2, kotlin.coroutines.d dVar) {
                        return emit((ArticleSearchState) obj2, (kotlin.coroutines.d<? super Unit>) dVar);
                    }

                    public final Object emit(ArticleSearchState articleSearchState, kotlin.coroutines.d<? super Unit> dVar) {
                        articleSearchViewModel3._state.setValue(articleSearchState);
                        return Unit.f312394a;
                    }
                };
                this.label = 1;
                if (iVar2.collect(jVar, this) == objL) {
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

    /* JADX INFO: renamed from: io.intercom.android.sdk.helpcenter.search.ArticleSearchViewModel$2, reason: invalid class name */
    @kotlin.coroutines.jvm.internal.f(c = "io.intercom.android.sdk.helpcenter.search.ArticleSearchViewModel$2", f = "ArticleSearchViewModel.kt", i = {}, l = {okhttp3.internal.ws.g.f334652s}, m = "invokeSuspend", n = {}, s = {})
    @SourceDebugExtension({"SMAP\nArticleSearchViewModel.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ArticleSearchViewModel.kt\nio/intercom/android/sdk/helpcenter/search/ArticleSearchViewModel$2\n+ 2 Transform.kt\nkotlinx/coroutines/flow/FlowKt__TransformKt\n+ 3 Emitters.kt\nkotlinx/coroutines/flow/FlowKt__EmittersKt\n+ 4 SafeCollector.common.kt\nkotlinx/coroutines/flow/internal/SafeCollector_commonKt\n*L\n1#1,282:1\n32#2:283\n17#2:284\n19#2:288\n46#3:285\n51#3:287\n105#4:286\n*S KotlinDebug\n*F\n+ 1 ArticleSearchViewModel.kt\nio/intercom/android/sdk/helpcenter/search/ArticleSearchViewModel$2\n*L\n125#1:283\n125#1:284\n125#1:288\n125#1:285\n125#1:287\n125#1:286\n*E\n"})
    static final class AnonymousClass2 extends kotlin.coroutines.jvm.internal.o implements Function2<s0, kotlin.coroutines.d<? super Unit>, Object> {
        int label;

        AnonymousClass2(kotlin.coroutines.d<? super AnonymousClass2> dVar) {
            super(2, dVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final kotlin.coroutines.d<Unit> create(Object obj, kotlin.coroutines.d<?> dVar) {
            return ArticleSearchViewModel.this.new AnonymousClass2(dVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            Object objL = kotlin.coroutines.intrinsics.b.l();
            int i10 = this.label;
            if (i10 == 0) {
                ResultKt.m(obj);
                final o0<IntercomEvent> event = ArticleSearchViewModel.this.intercomDataLayer.getEvent();
                kotlinx.coroutines.flow.i<Object> iVar = new kotlinx.coroutines.flow.i<Object>() { // from class: io.intercom.android.sdk.helpcenter.search.ArticleSearchViewModel$2$invokeSuspend$$inlined$filterIsInstance$1

                    /* JADX INFO: renamed from: io.intercom.android.sdk.helpcenter.search.ArticleSearchViewModel$2$invokeSuspend$$inlined$filterIsInstance$1$2, reason: invalid class name */
                    @SourceDebugExtension({"SMAP\nEmitters.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Emitters.kt\nkotlinx/coroutines/flow/FlowKt__EmittersKt$unsafeTransform$1$1\n+ 2 Transform.kt\nkotlinx/coroutines/flow/FlowKt__TransformKt\n*L\n1#1,218:1\n18#2:219\n32#2:220\n19#2:221\n*E\n"})
                    public static final class AnonymousClass2<T> implements kotlinx.coroutines.flow.j {
                        final /* synthetic */ kotlinx.coroutines.flow.j $this_unsafeFlow;

                        /* JADX INFO: renamed from: io.intercom.android.sdk.helpcenter.search.ArticleSearchViewModel$2$invokeSuspend$$inlined$filterIsInstance$1$2$1, reason: invalid class name */
                        @kotlin.coroutines.jvm.internal.f(c = "io.intercom.android.sdk.helpcenter.search.ArticleSearchViewModel$2$invokeSuspend$$inlined$filterIsInstance$1$2", f = "ArticleSearchViewModel.kt", i = {}, l = {219}, m = "emit", n = {}, s = {})
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

                        /* JADX WARN: Code duplicated, block: B:7:0x0018  */
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
                final ArticleSearchViewModel articleSearchViewModel = ArticleSearchViewModel.this;
                kotlinx.coroutines.flow.j<? super Object> jVar = new kotlinx.coroutines.flow.j() { // from class: io.intercom.android.sdk.helpcenter.search.ArticleSearchViewModel.2.1
                    public final Object emit(IntercomEvent.NewConversation newConversation, kotlin.coroutines.d<? super Unit> dVar) {
                        Object objUpdateTeammateHelpRow = articleSearchViewModel.updateTeammateHelpRow(dVar);
                        return objUpdateTeammateHelpRow == kotlin.coroutines.intrinsics.b.l() ? objUpdateTeammateHelpRow : Unit.f312394a;
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
            return ((AnonymousClass2) create(s0Var, dVar)).invokeSuspend(Unit.f312394a);
        }
    }

    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        /* JADX WARN: Type inference failed for: r1v1, types: [io.intercom.android.sdk.helpcenter.search.ArticleSearchViewModel$Companion$factory$1] */
        private final ArticleSearchViewModel$Companion$factory$1 factory(final HelpCenterApi helpCenterApi, final boolean z10) {
            return new j2.c() { // from class: io.intercom.android.sdk.helpcenter.search.ArticleSearchViewModel$Companion$factory$1
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
                    boolean z11 = z10;
                    Intrinsics.checkNotNull(dataLayer);
                    MessengerApi messengerApi = Injector.get().getMessengerApi();
                    Intrinsics.checkNotNullExpressionValue(messengerApi, "getMessengerApi(...)");
                    return new ArticleSearchViewModel(helpCenterApi2, appConfig2, metricTracker, z11, null, dataLayer, new CommonRepository(messengerApi, dataLayer), 16, null);
                }
            };
        }

        @NotNull
        public final ArticleSearchViewModel create(@NotNull m2 owner, @NotNull HelpCenterApi helpCenterApi, boolean z10) {
            Intrinsics.checkNotNullParameter(owner, "owner");
            Intrinsics.checkNotNullParameter(helpCenterApi, "helpCenterApi");
            return (ArticleSearchViewModel) new j2(owner, factory(helpCenterApi, z10)).c(ArticleSearchViewModel.class);
        }

        private Companion() {
        }
    }

    /* JADX INFO: renamed from: io.intercom.android.sdk.helpcenter.search.ArticleSearchViewModel$addTeammateHelpRow$1, reason: invalid class name and case insensitive filesystem */
    @kotlin.coroutines.jvm.internal.f(c = "io.intercom.android.sdk.helpcenter.search.ArticleSearchViewModel$addTeammateHelpRow$1", f = "ArticleSearchViewModel.kt", i = {0}, l = {183, 185}, m = "invokeSuspend", n = {"currentState"}, s = {"L$0"})
    @SourceDebugExtension({"SMAP\nArticleSearchViewModel.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ArticleSearchViewModel.kt\nio/intercom/android/sdk/helpcenter/search/ArticleSearchViewModel$addTeammateHelpRow$1\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,282:1\n2632#2,3:283\n*S KotlinDebug\n*F\n+ 1 ArticleSearchViewModel.kt\nio/intercom/android/sdk/helpcenter/search/ArticleSearchViewModel$addTeammateHelpRow$1\n*L\n180#1:283,3\n*E\n"})
    static final class C27771 extends kotlin.coroutines.jvm.internal.o implements Function2<s0, kotlin.coroutines.d<? super Unit>, Object> {
        Object L$0;
        Object L$1;
        Object L$2;
        int label;

        C27771(kotlin.coroutines.d<? super C27771> dVar) {
            super(2, dVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final kotlin.coroutines.d<Unit> create(Object obj, kotlin.coroutines.d<?> dVar) {
            return ArticleSearchViewModel.this.new C27771(dVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            ArticleSearchState articleSearchState;
            ArticleSearchState.Content content;
            k0 k0Var;
            Collection collection;
            Object objL = kotlin.coroutines.intrinsics.b.l();
            int i10 = this.label;
            if (i10 != 0) {
                if (i10 == 1) {
                    articleSearchState = (ArticleSearchState) this.L$0;
                    ResultKt.m(obj);
                } else {
                    if (i10 != 2) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    collection = (Collection) this.L$2;
                    content = (ArticleSearchState.Content) this.L$1;
                    k0Var = (k0) this.L$0;
                    ResultKt.m(obj);
                }
                k0Var.setValue(content.copy(CollectionsKt.plus((Collection<? extends Object>) collection, obj)));
                return Unit.f312394a;
            }
            ResultKt.m(obj);
            ArticleSearchViewModel.this.hasClickedAtLeastOneArticle = true;
            if (ArticleSearchViewModel.this.shouldAddSendMessageRow()) {
                articleSearchState = (ArticleSearchState) ArticleSearchViewModel.this._state.getValue();
                if (articleSearchState instanceof ArticleSearchState.Content) {
                    List<ArticleSearchResultRow> searchResults = ((ArticleSearchState.Content) articleSearchState).getSearchResults();
                    if (!(searchResults instanceof Collection) || !searchResults.isEmpty()) {
                        Iterator<T> it = searchResults.iterator();
                        while (it.hasNext()) {
                            if (((ArticleSearchResultRow) it.next()) instanceof ArticleSearchResultRow.TeammateHelpRow) {
                            }
                        }
                    }
                    this.L$0 = articleSearchState;
                    this.label = 1;
                    if (d1.b(2000L, this) != objL) {
                    }
                    return objL;
                }
            }
            return Unit.f312394a;
            k0 k0Var2 = ArticleSearchViewModel.this._state;
            content = (ArticleSearchState.Content) articleSearchState;
            List<ArticleSearchResultRow> searchResults2 = content.getSearchResults();
            ArticleSearchViewModel articleSearchViewModel = ArticleSearchViewModel.this;
            this.L$0 = k0Var2;
            this.L$1 = content;
            this.L$2 = searchResults2;
            this.label = 2;
            Object objTeammateHelpRow = articleSearchViewModel.teammateHelpRow(this);
            if (objTeammateHelpRow != objL) {
                obj = objTeammateHelpRow;
                k0Var = k0Var2;
                collection = searchResults2;
                k0Var.setValue(content.copy(CollectionsKt.plus((Collection<? extends Object>) collection, obj)));
                return Unit.f312394a;
            }
            return objL;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(s0 s0Var, kotlin.coroutines.d<? super Unit> dVar) {
            return ((C27771) create(s0Var, dVar)).invokeSuspend(Unit.f312394a);
        }
    }

    /* JADX INFO: renamed from: io.intercom.android.sdk.helpcenter.search.ArticleSearchViewModel$searchForArticles$1, reason: invalid class name and case insensitive filesystem */
    @kotlin.coroutines.jvm.internal.f(c = "io.intercom.android.sdk.helpcenter.search.ArticleSearchViewModel$searchForArticles$1", f = "ArticleSearchViewModel.kt", i = {}, l = {136}, m = "invokeSuspend", n = {}, s = {})
    static final class C27781 extends kotlin.coroutines.jvm.internal.o implements Function2<s0, kotlin.coroutines.d<? super Unit>, Object> {
        final /* synthetic */ kotlinx.coroutines.flow.i<String> $textChanged;
        int label;
        final /* synthetic */ ArticleSearchViewModel this$0;

        /* JADX INFO: renamed from: io.intercom.android.sdk.helpcenter.search.ArticleSearchViewModel$searchForArticles$1$1, reason: invalid class name and collision with other inner class name */
        @kotlin.coroutines.jvm.internal.f(c = "io.intercom.android.sdk.helpcenter.search.ArticleSearchViewModel$searchForArticles$1$1", f = "ArticleSearchViewModel.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
        static final class C20041 extends kotlin.coroutines.jvm.internal.o implements Function2<kotlinx.coroutines.flow.j<? super String>, kotlin.coroutines.d<? super Unit>, Object> {
            int label;
            final /* synthetic */ ArticleSearchViewModel this$0;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            C20041(ArticleSearchViewModel articleSearchViewModel, kotlin.coroutines.d<? super C20041> dVar) {
                super(2, dVar);
                this.this$0 = articleSearchViewModel;
            }

            @Override // kotlin.coroutines.jvm.internal.a
            public final kotlin.coroutines.d<Unit> create(Object obj, kotlin.coroutines.d<?> dVar) {
                return new C20041(this.this$0, dVar);
            }

            @Override // kotlin.coroutines.jvm.internal.a
            public final Object invokeSuspend(Object obj) {
                kotlin.coroutines.intrinsics.b.l();
                if (this.label != 0) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.m(obj);
                this.this$0.metricTracker.searchedNativeHelpCenter(this.this$0.isFromSearchBrowse);
                return Unit.f312394a;
            }

            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(kotlinx.coroutines.flow.j<? super String> jVar, kotlin.coroutines.d<? super Unit> dVar) {
                return ((C20041) create(jVar, dVar)).invokeSuspend(Unit.f312394a);
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C27781(kotlinx.coroutines.flow.i<String> iVar, ArticleSearchViewModel articleSearchViewModel, kotlin.coroutines.d<? super C27781> dVar) {
            super(2, dVar);
            this.$textChanged = iVar;
            this.this$0 = articleSearchViewModel;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final kotlin.coroutines.d<Unit> create(Object obj, kotlin.coroutines.d<?> dVar) {
            return new C27781(this.$textChanged, this.this$0, dVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            Object objL = kotlin.coroutines.intrinsics.b.l();
            int i10 = this.label;
            if (i10 == 0) {
                ResultKt.m(obj);
                kotlinx.coroutines.flow.i iVarO1 = kotlinx.coroutines.flow.k.o1(kotlinx.coroutines.flow.k.c0(this.$textChanged, 400L), new C20041(this.this$0, null));
                final ArticleSearchViewModel articleSearchViewModel = this.this$0;
                kotlinx.coroutines.flow.j jVar = new kotlinx.coroutines.flow.j() { // from class: io.intercom.android.sdk.helpcenter.search.ArticleSearchViewModel.searchForArticles.1.2
                    @Override // kotlinx.coroutines.flow.j
                    public /* bridge */ /* synthetic */ Object emit(Object obj2, kotlin.coroutines.d dVar) {
                        return emit((String) obj2, (kotlin.coroutines.d<? super Unit>) dVar);
                    }

                    public final Object emit(String str, kotlin.coroutines.d<? super Unit> dVar) {
                        if (str.length() == 0) {
                            articleSearchViewModel._state.setValue(ArticleSearchState.Initial.INSTANCE);
                            return Unit.f312394a;
                        }
                        articleSearchViewModel._state.setValue(ArticleSearchState.Loading.INSTANCE);
                        Object objEmit = articleSearchViewModel.searchInput.emit(str, dVar);
                        return objEmit == kotlin.coroutines.intrinsics.b.l() ? objEmit : Unit.f312394a;
                    }
                };
                this.label = 1;
                if (iVarO1.collect(jVar, this) == objL) {
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
            return ((C27781) create(s0Var, dVar)).invokeSuspend(Unit.f312394a);
        }
    }

    /* JADX INFO: renamed from: io.intercom.android.sdk.helpcenter.search.ArticleSearchViewModel$sendClickOnSearchResultMetric$1, reason: invalid class name and case insensitive filesystem */
    @kotlin.coroutines.jvm.internal.f(c = "io.intercom.android.sdk.helpcenter.search.ArticleSearchViewModel$sendClickOnSearchResultMetric$1", f = "ArticleSearchViewModel.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
    static final class C27791 extends kotlin.coroutines.jvm.internal.o implements Function2<s0, kotlin.coroutines.d<? super Unit>, Object> {
        int label;

        C27791(kotlin.coroutines.d<? super C27791> dVar) {
            super(2, dVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final kotlin.coroutines.d<Unit> create(Object obj, kotlin.coroutines.d<?> dVar) {
            return ArticleSearchViewModel.this.new C27791(dVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            kotlin.coroutines.intrinsics.b.l();
            if (this.label != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.m(obj);
            if (ArticleSearchViewModel.this._state.getValue() instanceof ArticleSearchState.Content) {
                ArticleSearchViewModel.this.metricTracker.openedNativeHelpCenterSearchResult(ArticleSearchViewModel.this.isFromSearchBrowse, ArticleSearchViewModel.this.lastSearchedInput);
            }
            return Unit.f312394a;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(s0 s0Var, kotlin.coroutines.d<? super Unit> dVar) {
            return ((C27791) create(s0Var, dVar)).invokeSuspend(Unit.f312394a);
        }
    }

    /* JADX INFO: renamed from: io.intercom.android.sdk.helpcenter.search.ArticleSearchViewModel$teammateHelpRow$1, reason: invalid class name and case insensitive filesystem */
    @kotlin.coroutines.jvm.internal.f(c = "io.intercom.android.sdk.helpcenter.search.ArticleSearchViewModel", f = "ArticleSearchViewModel.kt", i = {0}, l = {240}, m = "teammateHelpRow", n = {"teamPresenceState"}, s = {"L$0"})
    static final class C27801 extends kotlin.coroutines.jvm.internal.d {
        Object L$0;
        int label;
        /* synthetic */ Object result;

        C27801(kotlin.coroutines.d<? super C27801> dVar) {
            super(dVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return ArticleSearchViewModel.this.teammateHelpRow(this);
        }
    }

    /* JADX INFO: renamed from: io.intercom.android.sdk.helpcenter.search.ArticleSearchViewModel$transformToUiModel$1, reason: invalid class name and case insensitive filesystem */
    @kotlin.coroutines.jvm.internal.f(c = "io.intercom.android.sdk.helpcenter.search.ArticleSearchViewModel", f = "ArticleSearchViewModel.kt", i = {0}, l = {226}, m = "transformToUiModel", n = {"listToRender"}, s = {"L$0"})
    static final class C27811 extends kotlin.coroutines.jvm.internal.d {
        Object L$0;
        Object L$1;
        int label;
        /* synthetic */ Object result;

        C27811(kotlin.coroutines.d<? super C27811> dVar) {
            super(dVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return ArticleSearchViewModel.this.transformToUiModel(null, this);
        }
    }

    /* JADX INFO: renamed from: io.intercom.android.sdk.helpcenter.search.ArticleSearchViewModel$updateTeammateHelpRow$1, reason: invalid class name and case insensitive filesystem */
    @kotlin.coroutines.jvm.internal.f(c = "io.intercom.android.sdk.helpcenter.search.ArticleSearchViewModel", f = "ArticleSearchViewModel.kt", i = {}, l = {152}, m = "updateTeammateHelpRow", n = {}, s = {})
    static final class C27821 extends kotlin.coroutines.jvm.internal.d {
        Object L$0;
        Object L$1;
        Object L$2;
        int label;
        /* synthetic */ Object result;

        C27821(kotlin.coroutines.d<? super C27821> dVar) {
            super(dVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return ArticleSearchViewModel.this.updateTeammateHelpRow(this);
        }
    }

    public /* synthetic */ ArticleSearchViewModel(HelpCenterApi helpCenterApi, AppConfig appConfig, MetricTracker metricTracker, boolean z10, n0 n0Var, IntercomDataLayer intercomDataLayer, CommonRepository commonRepository, int i10, DefaultConstructorMarker defaultConstructorMarker) {
        this(helpCenterApi, appConfig, metricTracker, (i10 & 8) != 0 ? false : z10, (i10 & 16) != 0 ? l1.c() : n0Var, intercomDataLayer, commonRepository);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void sendFailedSearchMetric(Integer num) {
        this.metricTracker.failedHelpCenter(MetricTracker.Object.HELP_CENTER, "search_results", num != null ? num.toString() : null, this.isFromSearchBrowse);
    }

    static /* synthetic */ void sendFailedSearchMetric$default(ArticleSearchViewModel articleSearchViewModel, Integer num, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            num = null;
        }
        articleSearchViewModel.sendFailedSearchMetric(num);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final boolean shouldAddSendMessageRow() {
        return AppConfigExtensionsKt.canStartNewConversation(this.appConfig);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Code duplicated, block: B:7:0x0017  */
    public final Object teammateHelpRow(kotlin.coroutines.d<? super ArticleSearchResultRow.TeammateHelpRow> dVar) {
        C27801 c27801;
        ArticleViewState.TeamPresenceState teamPresenceStateCopy$default;
        if (dVar instanceof C27801) {
            c27801 = (C27801) dVar;
            int i10 = c27801.label;
            if ((i10 & Integer.MIN_VALUE) != 0) {
                c27801.label = i10 - Integer.MIN_VALUE;
            } else {
                c27801 = new C27801(dVar);
            }
        } else {
            c27801 = new C27801(dVar);
        }
        Object obj = c27801.result;
        Object objL = kotlin.coroutines.intrinsics.b.l();
        int i11 = c27801.label;
        if (i11 == 0) {
            ResultKt.m(obj);
            ArticleViewState.TeamPresenceState teamPresenceStateComputeViewState = TeammateHelpKt.computeViewState(null, ArticleViewState.TeamPresenceState.Companion.getDefaultTeamPresenceState(), this.intercomDataLayer.getTeamPresence().getValue(), this.appConfig, "search_results", this.isFromSearchBrowse);
            CommonRepository commonRepository = this.commonRepository;
            c27801.L$0 = teamPresenceStateComputeViewState;
            c27801.label = 1;
            Object objOpenMessenger = commonRepository.openMessenger(c27801);
            if (objOpenMessenger == objL) {
                return objL;
            }
            teamPresenceStateCopy$default = teamPresenceStateComputeViewState;
            obj = objOpenMessenger;
        } else {
            if (i11 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ArticleViewState.TeamPresenceState teamPresenceState = (ArticleViewState.TeamPresenceState) c27801.L$0;
            ResultKt.m(obj);
            teamPresenceStateCopy$default = teamPresenceState;
        }
        OpenMessengerResponse openMessengerResponse = (OpenMessengerResponse) obj;
        if ((openMessengerResponse != null ? openMessengerResponse.getNewConversationData() : null) != null) {
            teamPresenceStateCopy$default = ArticleViewState.TeamPresenceState.copy$default(teamPresenceStateCopy$default, null, null, null, 0, 0, 0, null, null, false, openMessengerResponse.getNewConversationData().getCta(), 511, null);
        }
        return new ArticleSearchResultRow.TeammateHelpRow(teamPresenceStateCopy$default);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Code duplicated, block: B:7:0x0017  */
    public final Object transformToUiModel(List<HelpCenterArticleSearchResponse> list, kotlin.coroutines.d<? super List<? extends ArticleSearchResultRow>> dVar) {
        C27811 c27811;
        List mutableList;
        Collection collection;
        if (dVar instanceof C27811) {
            c27811 = (C27811) dVar;
            int i10 = c27811.label;
            if ((i10 & Integer.MIN_VALUE) != 0) {
                c27811.label = i10 - Integer.MIN_VALUE;
            } else {
                c27811 = new C27811(dVar);
            }
        } else {
            c27811 = new C27811(dVar);
        }
        Object obj = c27811.result;
        Object objL = kotlin.coroutines.intrinsics.b.l();
        int i11 = c27811.label;
        if (i11 == 0) {
            ResultKt.m(obj);
            List<HelpCenterArticleSearchResponse> list2 = list;
            ArrayList arrayList = new ArrayList(CollectionsKt.collectionSizeOrDefault(list2, 10));
            for (HelpCenterArticleSearchResponse helpCenterArticleSearchResponse : list2) {
                HelpCenterArticleSearchResponse.Highlight highlight = helpCenterArticleSearchResponse.getHighlight();
                String articleId = helpCenterArticleSearchResponse.getArticleId();
                String title = highlight.getTitle();
                if (title.length() == 0) {
                    title = helpCenterArticleSearchResponse.getTitle();
                }
                arrayList.add(new ArticleSearchResultRow.ArticleResultRow(articleId, title, highlight.getSummary(), highlight.getSummary().length() == 0 ? 8 : 0));
            }
            mutableList = CollectionsKt.toMutableList((Collection) arrayList);
            if (shouldAddSendMessageRow() && this.hasClickedAtLeastOneArticle) {
                List list3 = mutableList;
                c27811.L$0 = mutableList;
                c27811.L$1 = list3;
                c27811.label = 1;
                Object objTeammateHelpRow = teammateHelpRow(c27811);
                if (objTeammateHelpRow == objL) {
                    return objL;
                }
                obj = objTeammateHelpRow;
                collection = list3;
            }
            return mutableList;
        }
        if (i11 != 1) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        collection = (Collection) c27811.L$1;
        mutableList = (List) c27811.L$0;
        ResultKt.m(obj);
        collection.add(obj);
        return mutableList;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Code duplicated, block: B:7:0x0017  */
    public final Object updateTeammateHelpRow(kotlin.coroutines.d<? super Unit> dVar) {
        C27821 c27821;
        ArticleSearchState.Content content;
        k0<ArticleSearchState> k0Var;
        Collection collection;
        if (dVar instanceof C27821) {
            c27821 = (C27821) dVar;
            int i10 = c27821.label;
            if ((i10 & Integer.MIN_VALUE) != 0) {
                c27821.label = i10 - Integer.MIN_VALUE;
            } else {
                c27821 = new C27821(dVar);
            }
        } else {
            c27821 = new C27821(dVar);
        }
        Object obj = c27821.result;
        Object objL = kotlin.coroutines.intrinsics.b.l();
        int i11 = c27821.label;
        if (i11 == 0) {
            ResultKt.m(obj);
            ArticleSearchState value = this._state.getValue();
            if (!shouldAddSendMessageRow()) {
                k0<ArticleSearchState> k0Var2 = this._state;
                if (value instanceof ArticleSearchState.Content) {
                    ArticleSearchState.Content content2 = (ArticleSearchState.Content) value;
                    List<ArticleSearchResultRow> searchResults = content2.getSearchResults();
                    ArrayList arrayList = new ArrayList();
                    for (Object obj2 : searchResults) {
                        if (!(((ArticleSearchResultRow) obj2) instanceof ArticleSearchResultRow.TeammateHelpRow)) {
                            arrayList.add(obj2);
                        }
                    }
                    value = content2.copy(arrayList);
                } else if (value instanceof ArticleSearchState.NoResults) {
                    value = new ArticleSearchState.NoResultsNoTeamHelp(((ArticleSearchState.NoResults) value).getSearchTerm());
                }
                k0Var2.setValue(value);
            } else if (value instanceof ArticleSearchState.Content) {
                ArticleSearchState.Content content3 = (ArticleSearchState.Content) value;
                List<ArticleSearchResultRow> searchResults2 = content3.getSearchResults();
                if (!(searchResults2 instanceof Collection) || !searchResults2.isEmpty()) {
                    Iterator<T> it = searchResults2.iterator();
                    while (it.hasNext()) {
                        if (((ArticleSearchResultRow) it.next()) instanceof ArticleSearchResultRow.TeammateHelpRow) {
                        }
                    }
                }
                k0<ArticleSearchState> k0Var3 = this._state;
                List<ArticleSearchResultRow> searchResults3 = content3.getSearchResults();
                c27821.L$0 = k0Var3;
                c27821.L$1 = content3;
                c27821.L$2 = searchResults3;
                c27821.label = 1;
                Object objTeammateHelpRow = teammateHelpRow(c27821);
                if (objTeammateHelpRow == objL) {
                    return objL;
                }
                content = content3;
                k0Var = k0Var3;
                obj = objTeammateHelpRow;
                collection = searchResults3;
            }
            return Unit.f312394a;
        }
        if (i11 != 1) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        collection = (Collection) c27821.L$2;
        content = (ArticleSearchState.Content) c27821.L$1;
        k0Var = (k0) c27821.L$0;
        ResultKt.m(obj);
        k0Var.setValue(content.copy(CollectionsKt.plus((Collection<? extends Object>) collection, obj)));
        return Unit.f312394a;
    }

    public final void addTeammateHelpRow() {
        kotlinx.coroutines.k.f(g2.a(this), this.dispatcher, null, new C27771(null), 2, null);
    }

    @NotNull
    public final z0<ArticleSearchState> getState() {
        return this.state;
    }

    @e2
    public final void searchForArticles(@NotNull kotlinx.coroutines.flow.i<String> textChanged) {
        Intrinsics.checkNotNullParameter(textChanged, "textChanged");
        kotlinx.coroutines.k.f(g2.a(this), this.dispatcher, null, new C27781(textChanged, this, null), 2, null);
    }

    public final void sendClickOnSearchResultMetric() {
        kotlinx.coroutines.k.f(g2.a(this), this.dispatcher, null, new C27791(null), 2, null);
    }

    public ArticleSearchViewModel(@NotNull HelpCenterApi helpCenterApi, @NotNull AppConfig appConfig, @NotNull MetricTracker metricTracker, boolean z10, @NotNull n0 dispatcher, @NotNull IntercomDataLayer intercomDataLayer, @NotNull CommonRepository commonRepository) {
        Intrinsics.checkNotNullParameter(helpCenterApi, "helpCenterApi");
        Intrinsics.checkNotNullParameter(appConfig, "appConfig");
        Intrinsics.checkNotNullParameter(metricTracker, "metricTracker");
        Intrinsics.checkNotNullParameter(dispatcher, "dispatcher");
        Intrinsics.checkNotNullParameter(intercomDataLayer, "intercomDataLayer");
        Intrinsics.checkNotNullParameter(commonRepository, "commonRepository");
        this.helpCenterApi = helpCenterApi;
        this.appConfig = appConfig;
        this.metricTracker = metricTracker;
        this.isFromSearchBrowse = z10;
        this.dispatcher = dispatcher;
        this.intercomDataLayer = intercomDataLayer;
        this.commonRepository = commonRepository;
        k0<ArticleSearchState> k0VarA = b1.a(ArticleSearchState.Initial.INSTANCE);
        this._state = k0VarA;
        this.state = kotlinx.coroutines.flow.k.n(k0VarA);
        this.lastSearchedInput = "";
        this.searchInput = q0.b(0, 0, null, 7, null);
        kotlinx.coroutines.k.f(g2.a(this), dispatcher, null, new AnonymousClass1(null), 2, null);
        kotlinx.coroutines.k.f(g2.a(this), dispatcher, null, new AnonymousClass2(null), 2, null);
    }
}
