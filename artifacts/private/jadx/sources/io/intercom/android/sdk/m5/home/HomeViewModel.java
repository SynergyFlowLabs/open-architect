package io.intercom.android.sdk.m5.home;

import androidx.compose.runtime.internal.w0;
import androidx.lifecycle.c0;
import androidx.lifecycle.f2;
import androidx.lifecycle.g2;
import androidx.lifecycle.j2;
import androidx.lifecycle.m2;
import androidx.lifecycle.u;
import io.intercom.android.nexus.NexusEventType;
import io.intercom.android.sdk.Injector;
import io.intercom.android.sdk.api.MessengerApi;
import io.intercom.android.sdk.helpcenter.utils.networking.NetworkResponse;
import io.intercom.android.sdk.identity.AppConfig;
import io.intercom.android.sdk.m5.conversation.data.ParsedNexusEvent;
import io.intercom.android.sdk.m5.data.CommonRepository;
import io.intercom.android.sdk.m5.data.IntercomDataLayer;
import io.intercom.android.sdk.m5.home.data.HomeCards;
import io.intercom.android.sdk.m5.home.data.HomeRepository;
import io.intercom.android.sdk.m5.home.data.HomeV2Response;
import io.intercom.android.sdk.m5.home.reducers.HomeReducer;
import io.intercom.android.sdk.m5.home.states.HomeClientState;
import io.intercom.android.sdk.m5.home.states.HomeUiEffects;
import io.intercom.android.sdk.m5.home.states.HomeUiState;
import io.intercom.android.sdk.models.ConfigModules;
import io.intercom.android.sdk.models.HomeConfig;
import io.intercom.android.sdk.models.OpenConfig;
import io.intercom.android.sdk.models.OpenMessengerResponse;
import io.intercom.android.sdk.models.OpenToSpace;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.d;
import kotlin.coroutines.intrinsics.b;
import kotlin.coroutines.jvm.internal.f;
import kotlin.coroutines.jvm.internal.o;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlinx.coroutines.a1;
import kotlinx.coroutines.flow.b1;
import kotlinx.coroutines.flow.f0;
import kotlinx.coroutines.flow.i;
import kotlinx.coroutines.flow.j;
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
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes13.dex */
@w0(parameters = 0)
@SourceDebugExtension({"SMAP\nHomeViewModel.kt\nKotlin\n*S Kotlin\n*F\n+ 1 HomeViewModel.kt\nio/intercom/android/sdk/m5/home/HomeViewModel\n+ 2 Transform.kt\nkotlinx/coroutines/flow/FlowKt__TransformKt\n+ 3 Emitters.kt\nkotlinx/coroutines/flow/FlowKt__EmittersKt\n+ 4 SafeCollector.common.kt\nkotlinx/coroutines/flow/internal/SafeCollector_commonKt\n+ 5 StateFlow.kt\nkotlinx/coroutines/flow/StateFlowKt\n*L\n1#1,185:1\n49#2:186\n51#2:190\n46#3:187\n51#3:189\n105#4:188\n226#5,5:191\n226#5,5:196\n*S KotlinDebug\n*F\n+ 1 HomeViewModel.kt\nio/intercom/android/sdk/m5/home/HomeViewModel\n*L\n53#1:186\n53#1:190\n53#1:187\n53#1:189\n53#1:188\n137#1:191,5\n145#1:196,5\n*E\n"})
public final class HomeViewModel extends f2 {

    @NotNull
    private final j0<HomeUiEffects> _effect;

    @NotNull
    private final k0<HomeClientState> clientState;

    @NotNull
    private final CommonRepository commonRepository;

    @NotNull
    private final n0 dispatcher;

    @NotNull
    private final o0<HomeUiEffects> effect;
    private boolean hasConversationScreenOpenedDirectlyFromHome;

    @NotNull
    private final HomeReducer homeReducer;

    @NotNull
    private final HomeRepository homeRepository;

    @NotNull
    private final IntercomDataLayer intercomDataLayer;

    @NotNull
    private final z0<HomeUiState> uiState;

    @NotNull
    public static final Companion Companion = new Companion(null);
    public static final int $stable = 8;

    /* JADX INFO: renamed from: io.intercom.android.sdk.m5.home.HomeViewModel$1, reason: invalid class name */
    @f(c = "io.intercom.android.sdk.m5.home.HomeViewModel$1", f = "HomeViewModel.kt", i = {}, l = {com.planner5d.library.engine.input.f.b.f160708m0}, m = "invokeSuspend", n = {}, s = {})
    static final class AnonymousClass1 extends o implements Function2<s0, d<? super Unit>, Object> {
        final /* synthetic */ c0 $lifecycle;
        int label;

        /* JADX INFO: renamed from: io.intercom.android.sdk.m5.home.HomeViewModel$1$1, reason: invalid class name and collision with other inner class name */
        @f(c = "io.intercom.android.sdk.m5.home.HomeViewModel$1$1", f = "HomeViewModel.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
        static final class C20251 extends o implements Function2<AppConfig, d<? super Unit>, Object> {
            /* synthetic */ Object L$0;
            int label;
            final /* synthetic */ HomeViewModel this$0;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            C20251(HomeViewModel homeViewModel, d<? super C20251> dVar) {
                super(2, dVar);
                this.this$0 = homeViewModel;
            }

            @Override // kotlin.coroutines.jvm.internal.a
            public final d<Unit> create(Object obj, d<?> dVar) {
                C20251 c20251 = new C20251(this.this$0, dVar);
                c20251.L$0 = obj;
                return c20251;
            }

            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(AppConfig appConfig, d<? super Unit> dVar) {
                return ((C20251) create(appConfig, dVar)).invokeSuspend(Unit.f312394a);
            }

            @Override // kotlin.coroutines.jvm.internal.a
            public final Object invokeSuspend(Object obj) {
                b.l();
                if (this.label != 0) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.m(obj);
                this.this$0.onConfig((AppConfig) this.L$0);
                return Unit.f312394a;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        AnonymousClass1(c0 c0Var, d<? super AnonymousClass1> dVar) {
            super(2, dVar);
            this.$lifecycle = c0Var;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final d<Unit> create(Object obj, d<?> dVar) {
            return HomeViewModel.this.new AnonymousClass1(this.$lifecycle, dVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            Object objL = b.l();
            int i10 = this.label;
            if (i10 == 0) {
                ResultKt.m(obj);
                i iVarA = u.a(HomeViewModel.this.intercomDataLayer.getConfig(), this.$lifecycle, c0.b.RESUMED);
                C20251 c20251 = new C20251(HomeViewModel.this, null);
                this.label = 1;
                if (k.C(iVarA, c20251, this) == objL) {
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

    /* JADX INFO: renamed from: io.intercom.android.sdk.m5.home.HomeViewModel$2, reason: invalid class name */
    @f(c = "io.intercom.android.sdk.m5.home.HomeViewModel$2", f = "HomeViewModel.kt", i = {}, l = {com.planner5d.library.engine.input.f.b.f160716p}, m = "invokeSuspend", n = {}, s = {})
    @SourceDebugExtension({"SMAP\nHomeViewModel.kt\nKotlin\n*S Kotlin\n*F\n+ 1 HomeViewModel.kt\nio/intercom/android/sdk/m5/home/HomeViewModel$2\n+ 2 Transform.kt\nkotlinx/coroutines/flow/FlowKt__TransformKt\n+ 3 Emitters.kt\nkotlinx/coroutines/flow/FlowKt__EmittersKt\n+ 4 SafeCollector.common.kt\nkotlinx/coroutines/flow/internal/SafeCollector_commonKt\n*L\n1#1,185:1\n32#2:186\n17#2:187\n19#2:191\n17#2:192\n19#2:196\n46#3:188\n51#3:190\n46#3:193\n51#3:195\n105#4:189\n105#4:194\n*S KotlinDebug\n*F\n+ 1 HomeViewModel.kt\nio/intercom/android/sdk/m5/home/HomeViewModel$2\n*L\n75#1:186\n75#1:187\n75#1:191\n76#1:192\n76#1:196\n75#1:188\n75#1:190\n76#1:193\n76#1:195\n75#1:189\n76#1:194\n*E\n"})
    static final class AnonymousClass2 extends o implements Function2<s0, d<? super Unit>, Object> {
        final /* synthetic */ c0 $lifecycle;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        AnonymousClass2(c0 c0Var, d<? super AnonymousClass2> dVar) {
            super(2, dVar);
            this.$lifecycle = c0Var;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final d<Unit> create(Object obj, d<?> dVar) {
            return HomeViewModel.this.new AnonymousClass2(this.$lifecycle, dVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            Object objL = b.l();
            int i10 = this.label;
            if (i10 == 0) {
                ResultKt.m(obj);
                final i iVarA = u.a(HomeViewModel.this.homeRepository.realTimeEvents(), this.$lifecycle, c0.b.RESUMED);
                final i<Object> iVar = new i<Object>() { // from class: io.intercom.android.sdk.m5.home.HomeViewModel$2$invokeSuspend$$inlined$filterIsInstance$1

                    /* JADX INFO: renamed from: io.intercom.android.sdk.m5.home.HomeViewModel$2$invokeSuspend$$inlined$filterIsInstance$1$2, reason: invalid class name */
                    @SourceDebugExtension({"SMAP\nEmitters.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Emitters.kt\nkotlinx/coroutines/flow/FlowKt__EmittersKt$unsafeTransform$1$1\n+ 2 Transform.kt\nkotlinx/coroutines/flow/FlowKt__TransformKt\n*L\n1#1,218:1\n18#2:219\n32#2:220\n19#2:221\n*E\n"})
                    public static final class AnonymousClass2<T> implements j {
                        final /* synthetic */ j $this_unsafeFlow;

                        /* JADX INFO: renamed from: io.intercom.android.sdk.m5.home.HomeViewModel$2$invokeSuspend$$inlined$filterIsInstance$1$2$1, reason: invalid class name */
                        @f(c = "io.intercom.android.sdk.m5.home.HomeViewModel$2$invokeSuspend$$inlined$filterIsInstance$1$2", f = "HomeViewModel.kt", i = {}, l = {219}, m = "emit", n = {}, s = {})
                        public static final class AnonymousClass1 extends kotlin.coroutines.jvm.internal.d {
                            Object L$0;
                            Object L$1;
                            int label;
                            /* synthetic */ Object result;

                            public AnonymousClass1(d dVar) {
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

                        public AnonymousClass2(j jVar) {
                            this.$this_unsafeFlow = jVar;
                        }

                        /* JADX WARN: Code duplicated, block: B:7:0x0016  */
                        @Override // kotlinx.coroutines.flow.j
                        @Nullable
                        public final Object emit(Object obj, @NotNull d dVar) {
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
                            Object objL = b.l();
                            int i11 = anonymousClass1.label;
                            if (i11 == 0) {
                                ResultKt.m(obj2);
                                j jVar = this.$this_unsafeFlow;
                                if (obj instanceof ParsedNexusEvent.ConversationNexusEvent) {
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
                    public Object collect(@NotNull j<? super Object> jVar, @NotNull d dVar) {
                        Object objCollect = iVarA.collect(new AnonymousClass2(jVar), dVar);
                        return objCollect == b.l() ? objCollect : Unit.f312394a;
                    }
                };
                i<ParsedNexusEvent.ConversationNexusEvent> iVar2 = new i<ParsedNexusEvent.ConversationNexusEvent>() { // from class: io.intercom.android.sdk.m5.home.HomeViewModel$2$invokeSuspend$$inlined$filter$1

                    /* JADX INFO: renamed from: io.intercom.android.sdk.m5.home.HomeViewModel$2$invokeSuspend$$inlined$filter$1$2, reason: invalid class name */
                    @SourceDebugExtension({"SMAP\nEmitters.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Emitters.kt\nkotlinx/coroutines/flow/FlowKt__EmittersKt$unsafeTransform$1$1\n+ 2 Transform.kt\nkotlinx/coroutines/flow/FlowKt__TransformKt\n+ 3 HomeViewModel.kt\nio/intercom/android/sdk/m5/home/HomeViewModel$2\n*L\n1#1,218:1\n18#2:219\n19#2:221\n76#3:220\n*E\n"})
                    public static final class AnonymousClass2<T> implements j {
                        final /* synthetic */ j $this_unsafeFlow;

                        /* JADX INFO: renamed from: io.intercom.android.sdk.m5.home.HomeViewModel$2$invokeSuspend$$inlined$filter$1$2$1, reason: invalid class name */
                        @f(c = "io.intercom.android.sdk.m5.home.HomeViewModel$2$invokeSuspend$$inlined$filter$1$2", f = "HomeViewModel.kt", i = {}, l = {219}, m = "emit", n = {}, s = {})
                        public static final class AnonymousClass1 extends kotlin.coroutines.jvm.internal.d {
                            Object L$0;
                            Object L$1;
                            int label;
                            /* synthetic */ Object result;

                            public AnonymousClass1(d dVar) {
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

                        public AnonymousClass2(j jVar) {
                            this.$this_unsafeFlow = jVar;
                        }

                        /* JADX WARN: Code duplicated, block: B:7:0x0018  */
                        @Override // kotlinx.coroutines.flow.j
                        @Nullable
                        public final Object emit(Object obj, @NotNull d dVar) {
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
                            Object objL = b.l();
                            int i11 = anonymousClass1.label;
                            if (i11 == 0) {
                                ResultKt.m(obj2);
                                j jVar = this.$this_unsafeFlow;
                                if (((ParsedNexusEvent.ConversationNexusEvent) obj).getEventType() == NexusEventType.NewComment) {
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
                    public Object collect(@NotNull j<? super ParsedNexusEvent.ConversationNexusEvent> jVar, @NotNull d dVar) {
                        Object objCollect = iVar.collect(new AnonymousClass2(jVar), dVar);
                        return objCollect == b.l() ? objCollect : Unit.f312394a;
                    }
                };
                final HomeViewModel homeViewModel = HomeViewModel.this;
                j<? super ParsedNexusEvent.ConversationNexusEvent> jVar = new j() { // from class: io.intercom.android.sdk.m5.home.HomeViewModel.2.2
                    public final Object emit(ParsedNexusEvent.ConversationNexusEvent conversationNexusEvent, d<? super Unit> dVar) {
                        homeViewModel.fetchHomeData();
                        return Unit.f312394a;
                    }

                    @Override // kotlinx.coroutines.flow.j
                    public /* bridge */ /* synthetic */ Object emit(Object obj2, d dVar) {
                        return emit((ParsedNexusEvent.ConversationNexusEvent) obj2, (d<? super Unit>) dVar);
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
        public final Object invoke(s0 s0Var, d<? super Unit> dVar) {
            return ((AnonymousClass2) create(s0Var, dVar)).invokeSuspend(Unit.f312394a);
        }
    }

    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        /* JADX WARN: Type inference failed for: r1v1, types: [io.intercom.android.sdk.m5.home.HomeViewModel$Companion$factory$1] */
        private final HomeViewModel$Companion$factory$1 factory(final c0 c0Var) {
            return new j2.c() { // from class: io.intercom.android.sdk.m5.home.HomeViewModel$Companion$factory$1
                /* JADX WARN: Multi-variable type inference failed */
                @Override // androidx.lifecycle.j2.c
                public <T extends f2> T create(Class<T> modelClass) {
                    Intrinsics.checkNotNullParameter(modelClass, "modelClass");
                    IntercomDataLayer dataLayer = Injector.get().getDataLayer();
                    HomeRepository homeRepository = new HomeRepository(null, 0 == true ? 1 : 0, 3, 0 == true ? 1 : 0);
                    MessengerApi messengerApi = Injector.get().getMessengerApi();
                    Intrinsics.checkNotNullExpressionValue(messengerApi, "getMessengerApi(...)");
                    Intrinsics.checkNotNull(dataLayer);
                    return new HomeViewModel(c0Var, homeRepository, new CommonRepository(messengerApi, dataLayer), null, dataLayer, null, 40, null);
                }
            };
        }

        @NotNull
        public final HomeViewModel create(@NotNull m2 owner, @NotNull c0 lifecycle) {
            Intrinsics.checkNotNullParameter(owner, "owner");
            Intrinsics.checkNotNullParameter(lifecycle, "lifecycle");
            return (HomeViewModel) new j2(owner, factory(lifecycle)).c(HomeViewModel.class);
        }

        private Companion() {
        }
    }

    public /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[OpenToSpace.values().length];
            try {
                iArr[OpenToSpace.HOME.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[OpenToSpace.MESSAGES.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[OpenToSpace.CONVERSATION.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    /* JADX INFO: renamed from: io.intercom.android.sdk.m5.home.HomeViewModel$fetchHomeData$1, reason: invalid class name and case insensitive filesystem */
    @f(c = "io.intercom.android.sdk.m5.home.HomeViewModel$fetchHomeData$1", f = "HomeViewModel.kt", i = {0, 1}, l = {115, androidx.media3.extractor.metadata.dvbsi.b.f67479d}, m = "invokeSuspend", n = {"$this$launch", "homeResponse"}, s = {"L$0", "L$0"})
    @SourceDebugExtension({"SMAP\nHomeViewModel.kt\nKotlin\n*S Kotlin\n*F\n+ 1 HomeViewModel.kt\nio/intercom/android/sdk/m5/home/HomeViewModel$fetchHomeData$1\n+ 2 StateFlow.kt\nkotlinx/coroutines/flow/StateFlowKt\n+ 3 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n+ 4 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,185:1\n226#2,5:186\n808#3,11:191\n2642#3:202\n1#4:203\n*S KotlinDebug\n*F\n+ 1 HomeViewModel.kt\nio/intercom/android/sdk/m5/home/HomeViewModel$fetchHomeData$1\n*L\n117#1:186,5\n126#1:191,11\n127#1:202\n127#1:203\n*E\n"})
    static final class C28171 extends o implements Function2<s0, d<? super Unit>, Object> {
        private /* synthetic */ Object L$0;
        int label;

        C28171(d<? super C28171> dVar) {
            super(2, dVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final d<Unit> create(Object obj, d<?> dVar) {
            C28171 c28171 = HomeViewModel.this.new C28171(dVar);
            c28171.L$0 = obj;
            return c28171;
        }

        /* JADX WARN: Code duplicated, block: B:23:0x009f  */
        /* JADX WARN: Code duplicated, block: B:26:0x00c0  */
        /* JADX WARN: Code duplicated, block: B:32:0x00dc A[LOOP:2: B:30:0x00d5->B:32:0x00dc, LOOP_END] */
        /* JADX WARN: Code duplicated, block: B:38:0x00c9 A[SYNTHETIC] */
        /* JADX WARN: Code duplicated, block: B:40:0x00b9 A[SYNTHETIC] */
        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            s0 s0Var;
            NetworkResponse networkResponse;
            OpenMessengerResponse openMessengerResponse;
            k0 k0Var;
            Object value;
            ArrayList arrayList;
            HomeViewModel homeViewModel;
            Iterator it;
            Object objL = b.l();
            int i10 = this.label;
            if (i10 == 0) {
                ResultKt.m(obj);
                s0 s0Var2 = (s0) this.L$0;
                a1 a1VarB = kotlinx.coroutines.k.b(s0Var2, null, null, new HomeViewModel$fetchHomeData$1$homeResponse$1(HomeViewModel.this, null), 3, null);
                this.L$0 = s0Var2;
                this.label = 1;
                obj = a1VarB.q(this);
                if (obj != objL) {
                    s0Var = s0Var2;
                }
                return objL;
            }
            if (i10 == 1) {
                s0 s0Var3 = (s0) this.L$0;
                ResultKt.m(obj);
                s0Var = s0Var3;
            } else {
                if (i10 != 2) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                NetworkResponse networkResponse2 = (NetworkResponse) this.L$0;
                ResultKt.m(obj);
                networkResponse = networkResponse2;
            }
            openMessengerResponse = (OpenMessengerResponse) obj;
            k0Var = HomeViewModel.this.clientState;
            do {
                value = k0Var.getValue();
            } while (!k0Var.compareAndSet(value, HomeClientState.copy$default((HomeClientState) value, networkResponse, openMessengerResponse, false, 4, null)));
            if (networkResponse instanceof NetworkResponse.Success) {
                List<HomeCards> cards = ((HomeV2Response) ((NetworkResponse.Success) networkResponse).getBody()).getCards();
                arrayList = new ArrayList();
                for (Object obj2 : cards) {
                    if (obj2 instanceof HomeCards.HomeRecentConversationData) {
                        arrayList.add(obj2);
                    }
                }
                homeViewModel = HomeViewModel.this;
                it = arrayList.iterator();
                while (it.hasNext()) {
                    homeViewModel.intercomDataLayer.addConversations(((HomeCards.HomeRecentConversationData) it.next()).getConversations());
                }
            }
            return Unit.f312394a;
            NetworkResponse networkResponse3 = (NetworkResponse) obj;
            a1 a1VarB2 = kotlinx.coroutines.k.b(s0Var, null, null, new HomeViewModel$fetchHomeData$1$openMessengerResponseData$1(HomeViewModel.this, null), 3, null);
            this.L$0 = networkResponse3;
            this.label = 2;
            Object objQ = a1VarB2.q(this);
            if (objQ != objL) {
                networkResponse = networkResponse3;
                obj = objQ;
                openMessengerResponse = (OpenMessengerResponse) obj;
                k0Var = HomeViewModel.this.clientState;
                do {
                    value = k0Var.getValue();
                } while (!k0Var.compareAndSet(value, HomeClientState.copy$default((HomeClientState) value, networkResponse, openMessengerResponse, false, 4, null)));
                if (networkResponse instanceof NetworkResponse.Success) {
                    List<HomeCards> cards2 = ((HomeV2Response) ((NetworkResponse.Success) networkResponse).getBody()).getCards();
                    arrayList = new ArrayList();
                    while (r14.hasNext()) {
                        if (obj2 instanceof HomeCards.HomeRecentConversationData) {
                            arrayList.add(obj2);
                        }
                    }
                    homeViewModel = HomeViewModel.this;
                    it = arrayList.iterator();
                    while (it.hasNext()) {
                        homeViewModel.intercomDataLayer.addConversations(((HomeCards.HomeRecentConversationData) it.next()).getConversations());
                    }
                }
                return Unit.f312394a;
            }
            return objL;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(s0 s0Var, d<? super Unit> dVar) {
            return ((C28171) create(s0Var, dVar)).invokeSuspend(Unit.f312394a);
        }
    }

    /* JADX INFO: renamed from: io.intercom.android.sdk.m5.home.HomeViewModel$handleOpening$1, reason: invalid class name and case insensitive filesystem */
    @f(c = "io.intercom.android.sdk.m5.home.HomeViewModel$handleOpening$1", f = "HomeViewModel.kt", i = {}, l = {85}, m = "invokeSuspend", n = {}, s = {})
    static final class C28181 extends o implements Function2<s0, d<? super Unit>, Object> {
        int label;

        C28181(d<? super C28181> dVar) {
            super(2, dVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final d<Unit> create(Object obj, d<?> dVar) {
            return HomeViewModel.this.new C28181(dVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            Object objL = b.l();
            int i10 = this.label;
            if (i10 == 0) {
                ResultKt.m(obj);
                j0 j0Var = HomeViewModel.this._effect;
                HomeUiEffects.NavigateToMessages navigateToMessages = HomeUiEffects.NavigateToMessages.INSTANCE;
                this.label = 1;
                if (j0Var.emit(navigateToMessages, this) == objL) {
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
            return ((C28181) create(s0Var, dVar)).invokeSuspend(Unit.f312394a);
        }
    }

    /* JADX INFO: renamed from: io.intercom.android.sdk.m5.home.HomeViewModel$handleOpening$2, reason: invalid class name and case insensitive filesystem */
    @f(c = "io.intercom.android.sdk.m5.home.HomeViewModel$handleOpening$2", f = "HomeViewModel.kt", i = {}, l = {com.planner5d.library.engine.input.f.b.f160711n0, com.planner5d.library.engine.input.f.b.f160718p1}, m = "invokeSuspend", n = {}, s = {})
    static final class C28192 extends o implements Function2<s0, d<? super Unit>, Object> {
        int label;

        C28192(d<? super C28192> dVar) {
            super(2, dVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final d<Unit> create(Object obj, d<?> dVar) {
            return HomeViewModel.this.new C28192(dVar);
        }

        /* JADX WARN: Code restructure failed: missing block: B:23:0x0078, code lost:
        
            if (r1.emit(r4, r6) == r0) goto L24;
         */
        @Override // kotlin.coroutines.jvm.internal.a
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public final java.lang.Object invokeSuspend(java.lang.Object r7) {
            /*
                r6 = this;
                java.lang.Object r0 = kotlin.coroutines.intrinsics.b.l()
                r5 = 4
                int r1 = r6.label
                r2 = 2
                r5 = r5 | r2
                r3 = 3
                r3 = 1
                r5 = 3
                if (r1 == 0) goto L25
                if (r1 == r3) goto L21
                if (r1 != r2) goto L17
                kotlin.ResultKt.m(r7)
                r5 = 1
                goto L7b
            L17:
                java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
                java.lang.String r7 = "ehs/rifce moi srkt/bncuwot ueole ///ot/i/erav/lne  "
                java.lang.String r7 = "call to 'resume' before 'invoke' with coroutine"
                r6.<init>(r7)
                throw r6
            L21:
                kotlin.ResultKt.m(r7)
                goto L39
            L25:
                kotlin.ResultKt.m(r7)
                io.intercom.android.sdk.m5.home.HomeViewModel r7 = io.intercom.android.sdk.m5.home.HomeViewModel.this
                r5 = 4
                io.intercom.android.sdk.m5.data.CommonRepository r7 = io.intercom.android.sdk.m5.home.HomeViewModel.access$getCommonRepository$p(r7)
                r5 = 0
                r6.label = r3
                java.lang.Object r7 = r7.openMessenger(r6)
                if (r7 != r0) goto L39
                goto L7a
            L39:
                r5 = 3
                io.intercom.android.sdk.models.OpenMessengerResponse r7 = (io.intercom.android.sdk.models.OpenMessengerResponse) r7
                if (r7 == 0) goto L45
                java.util.List r7 = r7.getOpenInboundConversations()
                r5 = 0
                if (r7 != 0) goto L49
            L45:
                java.util.List r7 = kotlin.collections.CollectionsKt.emptyList()
            L49:
                io.intercom.android.sdk.m5.home.HomeViewModel r1 = io.intercom.android.sdk.m5.home.HomeViewModel.this
                io.intercom.android.sdk.m5.home.HomeViewModel.access$fetchHomeData(r1)
                r5 = 5
                io.intercom.android.sdk.m5.home.HomeViewModel r1 = io.intercom.android.sdk.m5.home.HomeViewModel.this
                kotlinx.coroutines.flow.j0 r1 = io.intercom.android.sdk.m5.home.HomeViewModel.access$get_effect$p(r1)
                r4 = r7
                java.util.Collection r4 = (java.util.Collection) r4
                boolean r4 = r4.isEmpty()
                r5 = 4
                if (r4 != 0) goto L6d
                io.intercom.android.sdk.m5.home.states.HomeUiEffects$NavigateToConversation r4 = new io.intercom.android.sdk.m5.home.states.HomeUiEffects$NavigateToConversation
                java.lang.Object r7 = kotlin.collections.CollectionsKt.first(r7)
                r5 = 0
                java.lang.String r7 = (java.lang.String) r7
                r5 = 6
                r4.<init>(r7)
                goto L70
            L6d:
                r5 = 5
                io.intercom.android.sdk.m5.home.states.HomeUiEffects$NavigateToNewConversation r4 = io.intercom.android.sdk.m5.home.states.HomeUiEffects.NavigateToNewConversation.INSTANCE
            L70:
                r5 = 7
                r6.label = r2
                r5 = 7
                java.lang.Object r7 = r1.emit(r4, r6)
                if (r7 != r0) goto L7b
            L7a:
                return r0
            L7b:
                io.intercom.android.sdk.m5.home.HomeViewModel r6 = io.intercom.android.sdk.m5.home.HomeViewModel.this
                r5 = 2
                io.intercom.android.sdk.m5.home.HomeViewModel.access$setHasConversationScreenOpenedDirectlyFromHome$p(r6, r3)
                kotlin.Unit r6 = kotlin.Unit.f312394a
                r5 = 4
                return r6
            */
            throw new UnsupportedOperationException("Method not decompiled: io.intercom.android.sdk.m5.home.HomeViewModel.C28192.invokeSuspend(java.lang.Object):java.lang.Object");
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(s0 s0Var, d<? super Unit> dVar) {
            return ((C28192) create(s0Var, dVar)).invokeSuspend(Unit.f312394a);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public /* synthetic */ HomeViewModel(c0 c0Var, HomeRepository homeRepository, CommonRepository commonRepository, HomeReducer homeReducer, IntercomDataLayer intercomDataLayer, n0 n0Var, int i10, DefaultConstructorMarker defaultConstructorMarker) {
        this(c0Var, homeRepository, commonRepository, (i10 & 8) != 0 ? new HomeReducer(null, 0 == true ? 1 : 0, 3, 0 == true ? 1 : 0) : homeReducer, intercomDataLayer, (i10 & 32) != 0 ? l1.c() : n0Var);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void fetchHomeData() {
        kotlinx.coroutines.k.f(g2.a(this), this.dispatcher, null, new C28171(null), 2, null);
    }

    private final void handleOpening(OpenToSpace openToSpace) {
        int i10 = WhenMappings.$EnumSwitchMapping$0[openToSpace.ordinal()];
        if (i10 == 1) {
            fetchHomeData();
            return;
        }
        if (i10 == 2) {
            kotlinx.coroutines.k.f(g2.a(this), null, null, new C28181(null), 3, null);
        } else {
            if (i10 != 3) {
                throw new kotlin.k0();
            }
            if (this.hasConversationScreenOpenedDirectlyFromHome) {
                return;
            }
            int i11 = 1 | 3;
            kotlinx.coroutines.k.f(g2.a(this), null, null, new C28192(null), 3, null);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void onConfig(AppConfig appConfig) {
        OpenToSpace openTo;
        HomeConfig home;
        OpenConfig openConfig;
        ConfigModules configModules = appConfig.getConfigModules();
        if (configModules == null || (home = configModules.getHome()) == null || (openConfig = home.getOpenConfig()) == null || (openTo = openConfig.getOpenTo()) == null) {
            openTo = OpenToSpace.HOME;
        }
        handleOpening(openTo);
    }

    @NotNull
    public final o0<HomeUiEffects> getEffect() {
        return this.effect;
    }

    @NotNull
    public final z0<HomeUiState> getUiState() {
        return this.uiState;
    }

    public final void onHeaderImageLoaded() {
        HomeClientState value;
        k0<HomeClientState> k0Var = this.clientState;
        do {
            value = k0Var.getValue();
        } while (!k0Var.compareAndSet(value, HomeClientState.copy$default(value, null, null, true, 3, null)));
    }

    public final void onRetryClicked() {
        HomeClientState value;
        k0<HomeClientState> k0Var = this.clientState;
        do {
            value = k0Var.getValue();
        } while (!k0Var.compareAndSet(value, HomeClientState.copy$default(value, null, null, false, 6, null)));
        fetchHomeData();
    }

    public HomeViewModel(@NotNull c0 lifecycle, @NotNull HomeRepository homeRepository, @NotNull CommonRepository commonRepository, @NotNull HomeReducer homeReducer, @NotNull IntercomDataLayer intercomDataLayer, @NotNull n0 dispatcher) {
        Intrinsics.checkNotNullParameter(lifecycle, "lifecycle");
        Intrinsics.checkNotNullParameter(homeRepository, "homeRepository");
        Intrinsics.checkNotNullParameter(commonRepository, "commonRepository");
        Intrinsics.checkNotNullParameter(homeReducer, "homeReducer");
        Intrinsics.checkNotNullParameter(intercomDataLayer, "intercomDataLayer");
        Intrinsics.checkNotNullParameter(dispatcher, "dispatcher");
        this.homeRepository = homeRepository;
        this.commonRepository = commonRepository;
        this.homeReducer = homeReducer;
        this.intercomDataLayer = intercomDataLayer;
        this.dispatcher = dispatcher;
        j0<HomeUiEffects> j0VarB = q0.b(0, 0, null, 7, null);
        this._effect = j0VarB;
        s0 s0VarA = g2.a(this);
        u0.a aVar = u0.f314834a;
        this.effect = f0.h(j0VarB, s0VarA, aVar.c(), 0, 4, null);
        final k0<HomeClientState> k0VarA = b1.a(new HomeClientState(null, null, false, 7, null));
        this.clientState = k0VarA;
        this.uiState = k.Q1(new i<HomeUiState>() { // from class: io.intercom.android.sdk.m5.home.HomeViewModel$special$$inlined$map$1

            /* JADX INFO: renamed from: io.intercom.android.sdk.m5.home.HomeViewModel$special$$inlined$map$1$2, reason: invalid class name */
            @SourceDebugExtension({"SMAP\nEmitters.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Emitters.kt\nkotlinx/coroutines/flow/FlowKt__EmittersKt$unsafeTransform$1$1\n+ 2 Transform.kt\nkotlinx/coroutines/flow/FlowKt__TransformKt\n+ 3 HomeViewModel.kt\nio/intercom/android/sdk/m5/home/HomeViewModel\n*L\n1#1,218:1\n50#2:219\n54#3:220\n*E\n"})
            public static final class AnonymousClass2<T> implements j {
                final /* synthetic */ j $this_unsafeFlow;
                final /* synthetic */ HomeViewModel this$0;

                /* JADX INFO: renamed from: io.intercom.android.sdk.m5.home.HomeViewModel$special$$inlined$map$1$2$1, reason: invalid class name */
                @f(c = "io.intercom.android.sdk.m5.home.HomeViewModel$special$$inlined$map$1$2", f = "HomeViewModel.kt", i = {}, l = {219}, m = "emit", n = {}, s = {})
                public static final class AnonymousClass1 extends kotlin.coroutines.jvm.internal.d {
                    Object L$0;
                    int label;
                    /* synthetic */ Object result;

                    public AnonymousClass1(d dVar) {
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

                public AnonymousClass2(j jVar, HomeViewModel homeViewModel) {
                    this.$this_unsafeFlow = jVar;
                    this.this$0 = homeViewModel;
                }

                /* JADX WARN: Code duplicated, block: B:7:0x0017  */
                @Override // kotlinx.coroutines.flow.j
                @Nullable
                public final Object emit(Object obj, @NotNull d dVar) {
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
                    Object objL = b.l();
                    int i11 = anonymousClass1.label;
                    if (i11 == 0) {
                        ResultKt.m(obj2);
                        j jVar = this.$this_unsafeFlow;
                        HomeUiState homeUiStateComputeUiState$intercom_sdk_base_release = this.this$0.homeReducer.computeUiState$intercom_sdk_base_release((HomeClientState) obj, new HomeViewModel$uiState$1$1(this.this$0));
                        anonymousClass1.label = 1;
                        if (jVar.emit(homeUiStateComputeUiState$intercom_sdk_base_release, anonymousClass1) == objL) {
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
            public Object collect(@NotNull j<? super HomeUiState> jVar, @NotNull d dVar) {
                Object objCollect = k0VarA.collect(new AnonymousClass2(jVar, this), dVar);
                return objCollect == b.l() ? objCollect : Unit.f312394a;
            }
        }, g2.a(this), u0.a.b(aVar, 5000L, 0L, 2, null), new HomeUiState.Loading(null));
        kotlinx.coroutines.k.f(g2.a(this), null, null, new AnonymousClass1(lifecycle, null), 3, null);
        kotlinx.coroutines.k.f(g2.a(this), null, null, new AnonymousClass2(lifecycle, null), 3, null);
    }
}
