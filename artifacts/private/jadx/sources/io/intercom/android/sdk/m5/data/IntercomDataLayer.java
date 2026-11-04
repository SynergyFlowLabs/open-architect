package io.intercom.android.sdk.m5.data;

import android.app.Activity;
import android.content.Context;
import android.content.SharedPreferences;
import androidx.compose.runtime.internal.w0;
import androidx.constraintlayout.core.motion.utils.v;
import io.intercom.android.nexus.NexusConfig;
import io.intercom.android.sdk.Intercom;
import io.intercom.android.sdk.R;
import io.intercom.android.sdk.identity.AppConfig;
import io.intercom.android.sdk.identity.AppConfigKt;
import io.intercom.android.sdk.m5.home.data.HomeCards;
import io.intercom.android.sdk.models.BotIntro;
import io.intercom.android.sdk.models.Config;
import io.intercom.android.sdk.models.ConfigModules;
import io.intercom.android.sdk.models.Conversation;
import io.intercom.android.sdk.models.CustomizationModel;
import io.intercom.android.sdk.models.DeliveryOption;
import io.intercom.android.sdk.models.HostAppState;
import io.intercom.android.sdk.models.OpenMessengerResponse;
import io.intercom.android.sdk.models.OverlayState;
import io.intercom.android.sdk.models.TeamPresence;
import io.intercom.android.sdk.models.Ticket;
import io.intercom.android.sdk.models.carousel.Carousel;
import io.intercom.android.sdk.survey.model.SurveyData;
import io.intercom.android.sdk.ui.theme.ThemeManager;
import io.intercom.android.sdk.ui.theme.ThemeMode;
import io.intercom.android.sdk.utilities.ActivityUtils;
import io.intercom.android.sdk.utilities.PreferenceKeys;
import io.intercom.android.sdk.utilities.extensions.ConversationExtensionsKt;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Comparator;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.Set;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.a0;
import kotlin.collections.CollectionsKt;
import kotlin.collections.SetsKt;
import kotlin.comparisons.a;
import kotlin.coroutines.d;
import kotlin.coroutines.intrinsics.b;
import kotlin.coroutines.jvm.internal.f;
import kotlin.coroutines.jvm.internal.o;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlinx.coroutines.flow.b1;
import kotlinx.coroutines.flow.j;
import kotlinx.coroutines.flow.j0;
import kotlinx.coroutines.flow.k;
import kotlinx.coroutines.flow.k0;
import kotlinx.coroutines.flow.o0;
import kotlinx.coroutines.flow.q0;
import kotlinx.coroutines.flow.z0;
import kotlinx.coroutines.s0;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes13.dex */
@w0(parameters = 0)
@SourceDebugExtension({"SMAP\nIntercomDataLayer.kt\nKotlin\n*S Kotlin\n*F\n+ 1 IntercomDataLayer.kt\nio/intercom/android/sdk/m5/data/IntercomDataLayer\n+ 2 StateFlow.kt\nkotlinx/coroutines/flow/StateFlowKt\n+ 3 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n+ 4 SharedPreferences.kt\nandroidx/core/content/SharedPreferencesKt\n*L\n1#1,469:1\n226#2,3:470\n229#2,2:482\n226#2,5:484\n226#2,5:489\n226#2,5:494\n226#2,5:499\n226#2,5:504\n226#2,5:509\n226#2,5:514\n226#2,5:519\n226#2,5:524\n226#2,5:529\n226#2,5:534\n226#2,5:539\n226#2,5:544\n226#2,5:549\n226#2,5:566\n226#2,3:571\n229#2,2:577\n226#2,3:579\n229#2,2:585\n226#2,3:587\n229#2,2:593\n226#2,5:595\n226#2,3:600\n229#2,2:609\n226#2,3:611\n229#2,2:623\n226#2,5:625\n226#2,5:630\n226#2,5:635\n226#2,5:640\n226#2,5:645\n226#2,5:650\n226#2,5:655\n226#2,5:660\n226#2,5:665\n226#2,5:670\n226#2,5:675\n226#2,5:680\n226#2,5:685\n226#2,5:690\n226#2,5:695\n226#2,5:700\n1062#3:473\n1663#3,8:474\n827#3:574\n855#3,2:575\n827#3:582\n855#3,2:583\n827#3:590\n855#3,2:591\n827#3:603\n855#3:604\n1755#3,3:605\n856#3:608\n827#3:614\n855#3:615\n1755#3,3:616\n856#3:619\n827#3:620\n855#3,2:621\n41#4,12:554\n*S KotlinDebug\n*F\n+ 1 IntercomDataLayer.kt\nio/intercom/android/sdk/m5/data/IntercomDataLayer\n*L\n105#1:470,3\n105#1:482,2\n113#1:484,5\n117#1:489,5\n121#1:494,5\n125#1:499,5\n129#1:504,5\n130#1:509,5\n138#1:514,5\n139#1:519,5\n147#1:524,5\n155#1:529,5\n163#1:534,5\n171#1:539,5\n179#1:544,5\n187#1:549,5\n207#1:566,5\n212#1:571,3\n212#1:577,2\n218#1:579,3\n218#1:585,2\n226#1:587,3\n226#1:593,2\n230#1:595,5\n239#1:600,3\n239#1:609,2\n253#1:611,3\n253#1:623,2\n269#1:625,5\n278#1:630,5\n289#1:635,5\n297#1:640,5\n303#1:645,5\n312#1:650,5\n321#1:655,5\n330#1:660,5\n339#1:665,5\n340#1:670,5\n341#1:675,5\n342#1:680,5\n343#1:685,5\n344#1:690,5\n345#1:695,5\n353#1:700,5\n107#1:473\n108#1:474,8\n214#1:574\n214#1:575,2\n219#1:582\n219#1:583,2\n227#1:590\n227#1:591,2\n242#1:603\n242#1:604\n244#1:605,3\n242#1:608\n256#1:614\n256#1:615\n258#1:616,3\n256#1:619\n259#1:620\n259#1:621,2\n206#1:554,12\n*E\n"})
public final class IntercomDataLayer {
    public static final int $stable = 8;

    @NotNull
    private final k0<String> _botBehaviourId;

    @NotNull
    private final k0<BotIntro> _botIntro;

    @NotNull
    private final k0<AppConfig> _config;

    @NotNull
    private final k0<List<Conversation>> _conversations;

    @NotNull
    private final j0<IntercomEvent> _event;

    @NotNull
    private final k0<HostAppState> _hostAppState;

    @NotNull
    private final k0<OverlayState> _overlayState;

    @NotNull
    private final k0<Boolean> _pushNotificationsBannerDismissed;

    @NotNull
    private final k0<SurveyData> _surveyData;

    @NotNull
    private final k0<TeamPresence> _teamPresence;

    @NotNull
    private final k0<Ticket> _ticket;

    @NotNull
    private final k0<Set<String>> _unreadConversationIds;

    @NotNull
    private final s0 applicationScope;

    @NotNull
    private final z0<String> botBehaviourId;

    @NotNull
    private final z0<BotIntro> botIntro;

    @NotNull
    private final z0<AppConfig> config;

    @NotNull
    private final Context context;

    @NotNull
    private final z0<List<Conversation>> conversations;

    @NotNull
    private final o0<IntercomEvent> event;

    @NotNull
    private List<? extends HomeCards> homeCards;

    @NotNull
    private final z0<HostAppState> hostAppState;

    @Nullable
    private OpenMessengerResponse openResponse;

    @NotNull
    private final z0<OverlayState> overlayState;

    @NotNull
    private final z0<Boolean> pushNotificationsBannerDismissed;

    @NotNull
    private final z0<SurveyData> surveyData;

    @NotNull
    private final z0<TeamPresence> teamPresence;

    @NotNull
    private final z0<Ticket> ticket;

    @NotNull
    private final z0<Set<String>> unreadConversationIds;

    /* JADX INFO: renamed from: io.intercom.android.sdk.m5.data.IntercomDataLayer$configUpdates$1, reason: invalid class name */
    @f(c = "io.intercom.android.sdk.m5.data.IntercomDataLayer$configUpdates$1", f = "IntercomDataLayer.kt", i = {}, l = {390}, m = "invokeSuspend", n = {}, s = {})
    static final class AnonymousClass1 extends o implements Function2<s0, d<? super Unit>, Object> {
        final /* synthetic */ Function1<AppConfig, Unit> $onNewAppConfig;
        int label;

        /* JADX INFO: renamed from: io.intercom.android.sdk.m5.data.IntercomDataLayer$configUpdates$1$1, reason: invalid class name and collision with other inner class name */
        @f(c = "io.intercom.android.sdk.m5.data.IntercomDataLayer$configUpdates$1$1", f = "IntercomDataLayer.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
        static final class C20181 extends o implements Function2<AppConfig, d<? super Unit>, Object> {
            final /* synthetic */ Function1<AppConfig, Unit> $onNewAppConfig;
            /* synthetic */ Object L$0;
            int label;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            /* JADX WARN: Multi-variable type inference failed */
            C20181(Function1<? super AppConfig, Unit> function1, d<? super C20181> dVar) {
                super(2, dVar);
                this.$onNewAppConfig = function1;
            }

            @Override // kotlin.coroutines.jvm.internal.a
            public final d<Unit> create(Object obj, d<?> dVar) {
                C20181 c20181 = new C20181(this.$onNewAppConfig, dVar);
                c20181.L$0 = obj;
                return c20181;
            }

            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(AppConfig appConfig, d<? super Unit> dVar) {
                return ((C20181) create(appConfig, dVar)).invokeSuspend(Unit.f312394a);
            }

            @Override // kotlin.coroutines.jvm.internal.a
            public final Object invokeSuspend(Object obj) {
                b.l();
                if (this.label != 0) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.m(obj);
                this.$onNewAppConfig.invoke((AppConfig) this.L$0);
                return Unit.f312394a;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        AnonymousClass1(Function1<? super AppConfig, Unit> function1, d<? super AnonymousClass1> dVar) {
            super(2, dVar);
            this.$onNewAppConfig = function1;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final d<Unit> create(Object obj, d<?> dVar) {
            return IntercomDataLayer.this.new AnonymousClass1(this.$onNewAppConfig, dVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            Object objL = b.l();
            int i10 = this.label;
            if (i10 == 0) {
                ResultKt.m(obj);
                z0<AppConfig> config = IntercomDataLayer.this.getConfig();
                C20181 c20181 = new C20181(this.$onNewAppConfig, null);
                this.label = 1;
                if (k.C(config, c20181, this) == objL) {
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

    /* JADX INFO: renamed from: io.intercom.android.sdk.m5.data.IntercomDataLayer$emitEvent$2, reason: invalid class name */
    @f(c = "io.intercom.android.sdk.m5.data.IntercomDataLayer$emitEvent$2", f = "IntercomDataLayer.kt", i = {}, l = {427}, m = "invokeSuspend", n = {}, s = {})
    static final class AnonymousClass2 extends o implements Function2<s0, d<? super Unit>, Object> {
        final /* synthetic */ IntercomEvent $event;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        AnonymousClass2(IntercomEvent intercomEvent, d<? super AnonymousClass2> dVar) {
            super(2, dVar);
            this.$event = intercomEvent;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final d<Unit> create(Object obj, d<?> dVar) {
            return IntercomDataLayer.this.new AnonymousClass2(this.$event, dVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            Object objL = b.l();
            int i10 = this.label;
            if (i10 == 0) {
                ResultKt.m(obj);
                IntercomDataLayer intercomDataLayer = IntercomDataLayer.this;
                IntercomEvent intercomEvent = this.$event;
                this.label = 1;
                if (intercomDataLayer.emitEvent(intercomEvent, this) == objL) {
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

    /* JADX INFO: renamed from: io.intercom.android.sdk.m5.data.IntercomDataLayer$listenToEvents$1, reason: invalid class name and case insensitive filesystem */
    @f(c = "io.intercom.android.sdk.m5.data.IntercomDataLayer$listenToEvents$1", f = "IntercomDataLayer.kt", i = {}, l = {439}, m = "invokeSuspend", n = {}, s = {})
    static final class C28081 extends o implements Function2<s0, d<? super Unit>, Object> {
        final /* synthetic */ Function1<IntercomEvent, Unit> $onNewEvent;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        C28081(Function1<? super IntercomEvent, Unit> function1, d<? super C28081> dVar) {
            super(2, dVar);
            this.$onNewEvent = function1;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final d<Unit> create(Object obj, d<?> dVar) {
            return IntercomDataLayer.this.new C28081(this.$onNewEvent, dVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            Object objL = b.l();
            int i10 = this.label;
            if (i10 == 0) {
                ResultKt.m(obj);
                o0<IntercomEvent> event = IntercomDataLayer.this.getEvent();
                final Function1<IntercomEvent, Unit> function1 = this.$onNewEvent;
                j<? super IntercomEvent> jVar = new j() { // from class: io.intercom.android.sdk.m5.data.IntercomDataLayer.listenToEvents.1.1
                    public final Object emit(IntercomEvent intercomEvent, d<? super Unit> dVar) {
                        function1.invoke(intercomEvent);
                        return Unit.f312394a;
                    }

                    @Override // kotlinx.coroutines.flow.j
                    public /* bridge */ /* synthetic */ Object emit(Object obj2, d dVar) {
                        return emit((IntercomEvent) obj2, (d<? super Unit>) dVar);
                    }
                };
                this.label = 1;
                if (event.collect(jVar, this) == objL) {
                    return objL;
                }
            } else {
                if (i10 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.m(obj);
            }
            throw new a0();
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(s0 s0Var, d<? super Unit> dVar) {
            return ((C28081) create(s0Var, dVar)).invokeSuspend(Unit.f312394a);
        }
    }

    /* JADX INFO: renamed from: io.intercom.android.sdk.m5.data.IntercomDataLayer$overlayStateUpdates$1, reason: invalid class name and case insensitive filesystem */
    @f(c = "io.intercom.android.sdk.m5.data.IntercomDataLayer$overlayStateUpdates$1", f = "IntercomDataLayer.kt", i = {}, l = {402}, m = "invokeSuspend", n = {}, s = {})
    static final class C28091 extends o implements Function2<s0, d<? super Unit>, Object> {
        final /* synthetic */ Function1<OverlayState, Unit> $onNewOverlyState;
        int label;

        /* JADX INFO: renamed from: io.intercom.android.sdk.m5.data.IntercomDataLayer$overlayStateUpdates$1$1, reason: invalid class name and collision with other inner class name */
        @f(c = "io.intercom.android.sdk.m5.data.IntercomDataLayer$overlayStateUpdates$1$1", f = "IntercomDataLayer.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
        static final class C20201 extends o implements Function2<OverlayState, d<? super Unit>, Object> {
            final /* synthetic */ Function1<OverlayState, Unit> $onNewOverlyState;
            /* synthetic */ Object L$0;
            int label;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            /* JADX WARN: Multi-variable type inference failed */
            C20201(Function1<? super OverlayState, Unit> function1, d<? super C20201> dVar) {
                super(2, dVar);
                this.$onNewOverlyState = function1;
            }

            @Override // kotlin.coroutines.jvm.internal.a
            public final d<Unit> create(Object obj, d<?> dVar) {
                C20201 c20201 = new C20201(this.$onNewOverlyState, dVar);
                c20201.L$0 = obj;
                return c20201;
            }

            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(OverlayState overlayState, d<? super Unit> dVar) {
                return ((C20201) create(overlayState, dVar)).invokeSuspend(Unit.f312394a);
            }

            @Override // kotlin.coroutines.jvm.internal.a
            public final Object invokeSuspend(Object obj) {
                b.l();
                if (this.label != 0) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.m(obj);
                this.$onNewOverlyState.invoke((OverlayState) this.L$0);
                return Unit.f312394a;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        C28091(Function1<? super OverlayState, Unit> function1, d<? super C28091> dVar) {
            super(2, dVar);
            this.$onNewOverlyState = function1;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final d<Unit> create(Object obj, d<?> dVar) {
            return IntercomDataLayer.this.new C28091(this.$onNewOverlyState, dVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            Object objL = b.l();
            int i10 = this.label;
            if (i10 == 0) {
                ResultKt.m(obj);
                z0<OverlayState> overlayState = IntercomDataLayer.this.getOverlayState();
                C20201 c20201 = new C20201(this.$onNewOverlyState, null);
                this.label = 1;
                if (k.C(overlayState, c20201, this) == objL) {
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
            return ((C28091) create(s0Var, dVar)).invokeSuspend(Unit.f312394a);
        }
    }

    /* JADX INFO: renamed from: io.intercom.android.sdk.m5.data.IntercomDataLayer$unreadConversationIdsUpdates$1, reason: invalid class name and case insensitive filesystem */
    @f(c = "io.intercom.android.sdk.m5.data.IntercomDataLayer$unreadConversationIdsUpdates$1", f = "IntercomDataLayer.kt", i = {}, l = {414}, m = "invokeSuspend", n = {}, s = {})
    static final class C28101 extends o implements Function2<s0, d<? super Unit>, Object> {
        final /* synthetic */ Function1<Set<String>, Unit> $onNewUnreadConversationsIdsState;
        int label;

        /* JADX INFO: renamed from: io.intercom.android.sdk.m5.data.IntercomDataLayer$unreadConversationIdsUpdates$1$1, reason: invalid class name and collision with other inner class name */
        @f(c = "io.intercom.android.sdk.m5.data.IntercomDataLayer$unreadConversationIdsUpdates$1$1", f = "IntercomDataLayer.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
        static final class C20211 extends o implements Function2<Set<? extends String>, d<? super Unit>, Object> {
            final /* synthetic */ Function1<Set<String>, Unit> $onNewUnreadConversationsIdsState;
            /* synthetic */ Object L$0;
            int label;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            /* JADX WARN: Multi-variable type inference failed */
            C20211(Function1<? super Set<String>, Unit> function1, d<? super C20211> dVar) {
                super(2, dVar);
                this.$onNewUnreadConversationsIdsState = function1;
            }

            @Override // kotlin.coroutines.jvm.internal.a
            public final d<Unit> create(Object obj, d<?> dVar) {
                C20211 c20211 = new C20211(this.$onNewUnreadConversationsIdsState, dVar);
                c20211.L$0 = obj;
                return c20211;
            }

            @Override // kotlin.jvm.functions.Function2
            public /* bridge */ /* synthetic */ Object invoke(Set<? extends String> set, d<? super Unit> dVar) {
                return invoke2((Set<String>) set, dVar);
            }

            @Override // kotlin.coroutines.jvm.internal.a
            public final Object invokeSuspend(Object obj) {
                b.l();
                if (this.label != 0) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.m(obj);
                this.$onNewUnreadConversationsIdsState.invoke((Set) this.L$0);
                return Unit.f312394a;
            }

            /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
            public final Object invoke2(Set<String> set, d<? super Unit> dVar) {
                return ((C20211) create(set, dVar)).invokeSuspend(Unit.f312394a);
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        C28101(Function1<? super Set<String>, Unit> function1, d<? super C28101> dVar) {
            super(2, dVar);
            this.$onNewUnreadConversationsIdsState = function1;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final d<Unit> create(Object obj, d<?> dVar) {
            return IntercomDataLayer.this.new C28101(this.$onNewUnreadConversationsIdsState, dVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            Object objL = b.l();
            int i10 = this.label;
            if (i10 == 0) {
                ResultKt.m(obj);
                z0<Set<String>> unreadConversationIds = IntercomDataLayer.this.getUnreadConversationIds();
                C20211 c20211 = new C20211(this.$onNewUnreadConversationsIdsState, null);
                this.label = 1;
                if (k.C(unreadConversationIds, c20211, this) == objL) {
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
            return ((C28101) create(s0Var, dVar)).invokeSuspend(Unit.f312394a);
        }
    }

    public IntercomDataLayer(@NotNull Context context, @NotNull s0 applicationScope) {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(applicationScope, "applicationScope");
        this.context = context;
        this.applicationScope = applicationScope;
        k0<List<Conversation>> k0VarA = b1.a(CollectionsKt.emptyList());
        this._conversations = k0VarA;
        this.conversations = k.n(k0VarA);
        k0<BotIntro> k0VarA2 = b1.a(BotIntro.NULL);
        this._botIntro = k0VarA2;
        this.botIntro = k.n(k0VarA2);
        k0<String> k0VarA3 = b1.a(null);
        this._botBehaviourId = k0VarA3;
        this.botBehaviourId = k.n(k0VarA3);
        k0<TeamPresence> k0VarA4 = b1.a(TeamPresence.NULL);
        this._teamPresence = k0VarA4;
        this.teamPresence = k.n(k0VarA4);
        k0<Ticket> k0VarA5 = b1.a(Ticket.Companion.getNULL());
        this._ticket = k0VarA5;
        this.ticket = k.n(k0VarA5);
        k0<SurveyData> k0VarA6 = b1.a(SurveyData.Companion.getNULL());
        this._surveyData = k0VarA6;
        this.surveyData = k.n(k0VarA6);
        k0<OverlayState> k0VarA7 = b1.a(OverlayState.NULL);
        this._overlayState = k0VarA7;
        this.overlayState = k.n(k0VarA7);
        k0<HostAppState> k0VarA8 = b1.a(HostAppState.NULL);
        this._hostAppState = k0VarA8;
        this.hostAppState = k.n(k0VarA8);
        k0<Set<String>> k0VarA9 = b1.a(SetsKt.emptySet());
        this._unreadConversationIds = k0VarA9;
        this.unreadConversationIds = k.n(k0VarA9);
        j0<IntercomEvent> j0VarB = q0.b(0, 0, null, 7, null);
        this._event = j0VarB;
        this.event = j0VarB;
        this.homeCards = CollectionsKt.emptyList();
        SharedPreferences sharedPreferences = context.getSharedPreferences(PreferenceKeys.INTERCOM_PREFS, 0);
        Intrinsics.checkNotNull(sharedPreferences);
        k0<AppConfig> k0VarA10 = b1.a(AppConfigKt.getAppConfig(sharedPreferences, androidx.core.content.d.g(context, R.color.intercom_main_blue), new NexusConfig()));
        this._config = k0VarA10;
        k0<Boolean> k0VarA11 = b1.a(Boolean.valueOf(sharedPreferences.getBoolean("push_notifications_banner_dismissed", false)));
        this._pushNotificationsBannerDismissed = k0VarA11;
        this.config = k.n(k0VarA10);
        this.pushNotificationsBannerDismissed = k.n(k0VarA11);
    }

    public static /* synthetic */ void emitEvent$default(IntercomDataLayer intercomDataLayer, s0 s0Var, IntercomEvent intercomEvent, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            s0Var = intercomDataLayer.applicationScope;
        }
        intercomDataLayer.emitEvent(s0Var, intercomEvent);
    }

    /* JADX WARN: Code duplicated, block: B:27:0x0082 A[ADDED_TO_REGION, REMOVE] */
    private final void updateAppConfig(AppConfig appConfig) {
        CustomizationModel customization;
        String themeMode;
        ThemeMode themeMode2;
        if (Intrinsics.areEqual(appConfig, this._config.getValue())) {
            return;
        }
        SharedPreferences sharedPreferences = this.context.getSharedPreferences(PreferenceKeys.INTERCOM_PREFS, 0);
        Intrinsics.checkNotNull(sharedPreferences);
        AppConfigKt.setAppConfig(sharedPreferences, appConfig);
        this._config.setValue(appConfig);
        ConfigModules configModules = appConfig.getConfigModules();
        if (configModules == null || (customization = configModules.getCustomization()) == null || (themeMode = customization.getThemeMode()) == null) {
            return;
        }
        String lowerCase = themeMode.toLowerCase(Locale.ROOT);
        Intrinsics.checkNotNullExpressionValue(lowerCase, "toLowerCase(...)");
        int iHashCode = lowerCase.hashCode();
        if (iHashCode != -887328209) {
            if (iHashCode != 3075958) {
                if (iHashCode == 102970646 && !lowerCase.equals("light")) {
                    themeMode2 = ThemeMode.LIGHT;
                } else {
                    themeMode2 = ThemeMode.LIGHT;
                }
            } else if (lowerCase.equals("dark")) {
                themeMode2 = ThemeMode.DARK;
            } else {
                themeMode2 = ThemeMode.LIGHT;
            }
        } else if (lowerCase.equals("system")) {
            themeMode2 = ThemeMode.SYSTEM;
        } else {
            themeMode2 = ThemeMode.LIGHT;
        }
        ThemeManager.INSTANCE.updateServerTheme(themeMode2);
    }

    public final void activityPaused(@NotNull Activity activity) {
        Intrinsics.checkNotNullParameter(activity, "activity");
        k0<OverlayState> k0Var = this._overlayState;
        while (true) {
            OverlayState value = k0Var.getValue();
            Activity activity2 = activity;
            if (k0Var.compareAndSet(value, OverlayState.copy$default(value, null, null, 0, null, null, null, null, null, activity2, 127, null))) {
                return;
            } else {
                activity = activity2;
            }
        }
    }

    public final void activityReadyForViewAttachment(@NotNull Activity activity) {
        OverlayState value;
        Intrinsics.checkNotNullParameter(activity, "activity");
        if (!ActivityUtils.isHostActivity(activity)) {
            activity = null;
        }
        Activity activity2 = activity;
        k0<OverlayState> k0Var = this._overlayState;
        do {
            value = k0Var.getValue();
            boolean z10 = true | false;
        } while (!k0Var.compareAndSet(value, OverlayState.copy$default(value, null, null, 0, null, null, null, null, activity2, null, 127, null)));
    }

    public final void activityStopped(@NotNull Activity activity) {
        OverlayState value;
        Intrinsics.checkNotNullParameter(activity, "activity");
        Activity pausedHostActivity = Intrinsics.areEqual(activity, this.overlayState.getValue().getPausedHostActivity()) ? null : this.overlayState.getValue().getPausedHostActivity();
        k0<OverlayState> k0Var = this._overlayState;
        do {
            value = k0Var.getValue();
        } while (!k0Var.compareAndSet(value, OverlayState.copy$default(value, null, null, 0, null, null, null, null, null, pausedHostActivity, 255, null)));
    }

    public final void addConversations(@NotNull List<Conversation> newConversations) {
        List<Conversation> value;
        ArrayList arrayList;
        Intrinsics.checkNotNullParameter(newConversations, "newConversations");
        k0<List<Conversation>> k0Var = this._conversations;
        do {
            value = k0Var.getValue();
            List listSortedWith = CollectionsKt.sortedWith(CollectionsKt.plus((Collection) newConversations, (Iterable) value), new Comparator() { // from class: io.intercom.android.sdk.m5.data.IntercomDataLayer$addConversations$lambda$2$$inlined$sortedByDescending$1
                /* JADX WARN: Multi-variable type inference failed */
                @Override // java.util.Comparator
                public final int compare(T t10, T t11) {
                    return a.l(Long.valueOf(ConversationExtensionsKt.lastActionCreatedAt((Conversation) t11)), Long.valueOf(ConversationExtensionsKt.lastActionCreatedAt((Conversation) t10)));
                }
            });
            HashSet hashSet = new HashSet();
            arrayList = new ArrayList();
            for (Object obj : listSortedWith) {
                if (hashSet.add(((Conversation) obj).getId())) {
                    arrayList.add(obj);
                }
            }
        } while (!k0Var.compareAndSet(value, arrayList));
    }

    public final void appEnteredBackground(long j10) {
        OverlayState value;
        HostAppState value2;
        k0<OverlayState> k0Var = this._overlayState;
        do {
            value = k0Var.getValue();
        } while (!k0Var.compareAndSet(value, OverlayState.copy$default(value, null, null, 0, null, null, null, null, null, null, 127, null)));
        k0<HostAppState> k0Var2 = this._hostAppState;
        do {
            value2 = k0Var2.getValue();
        } while (!k0Var2.compareAndSet(value2, HostAppState.copy$default(value2, true, false, j10, 2, null)));
    }

    public final void appEnteredForeground() {
        HostAppState value;
        k0<HostAppState> k0Var = this._hostAppState;
        do {
            value = k0Var.getValue();
        } while (!k0Var.compareAndSet(value, HostAppState.copy$default(value, false, false, 0L, 4, null)));
    }

    public final void clearCarousel() {
        OverlayState value;
        Carousel NULL;
        k0<OverlayState> k0Var = this._overlayState;
        do {
            value = k0Var.getValue();
            NULL = Carousel.NULL;
            Intrinsics.checkNotNullExpressionValue(NULL, "NULL");
        } while (!k0Var.compareAndSet(value, OverlayState.copy$default(value, null, NULL, 0, null, null, null, null, null, null, 509, null)));
    }

    public final void clearOpenResponse() {
        this.openResponse = null;
    }

    public final void clearSurveyData() {
        OverlayState value;
        k0<SurveyData> k0Var = this._surveyData;
        while (!k0Var.compareAndSet(k0Var.getValue(), SurveyData.Companion.getNULL())) {
        }
        k0<OverlayState> k0Var2 = this._overlayState;
        do {
            value = k0Var2.getValue();
        } while (!k0Var2.compareAndSet(value, OverlayState.copy$default(value, SurveyData.Companion.getNULL(), null, 0, null, null, null, null, null, null, v.g.f44098r, null)));
    }

    public final void clearUserData() {
        OverlayState value;
        SurveyData surveyData;
        Carousel NULL;
        k0<List<Conversation>> k0Var = this._conversations;
        while (!k0Var.compareAndSet(k0Var.getValue(), CollectionsKt.emptyList())) {
        }
        k0<BotIntro> k0Var2 = this._botIntro;
        while (!k0Var2.compareAndSet(k0Var2.getValue(), BotIntro.NULL)) {
        }
        k0<String> k0Var3 = this._botBehaviourId;
        while (!k0Var3.compareAndSet(k0Var3.getValue(), null)) {
        }
        k0<TeamPresence> k0Var4 = this._teamPresence;
        while (!k0Var4.compareAndSet(k0Var4.getValue(), TeamPresence.NULL)) {
        }
        k0<Ticket> k0Var5 = this._ticket;
        while (!k0Var5.compareAndSet(k0Var5.getValue(), Ticket.Companion.getNULL())) {
        }
        k0<SurveyData> k0Var6 = this._surveyData;
        while (!k0Var6.compareAndSet(k0Var6.getValue(), SurveyData.Companion.getNULL())) {
        }
        k0<OverlayState> k0Var7 = this._overlayState;
        do {
            value = k0Var7.getValue();
            surveyData = SurveyData.Companion.getNULL();
            NULL = Carousel.NULL;
            Intrinsics.checkNotNullExpressionValue(NULL, "NULL");
        } while (!k0Var7.compareAndSet(value, OverlayState.copy$default(value, surveyData, NULL, 0, null, null, CollectionsKt.emptyList(), SetsKt.emptySet(), null, null, 412, null)));
        k0<Set<String>> k0Var8 = this._unreadConversationIds;
        while (!k0Var8.compareAndSet(k0Var8.getValue(), SetsKt.emptySet())) {
        }
        this.openResponse = null;
        this.homeCards = CollectionsKt.emptyList();
    }

    public final void configUpdates(@NotNull s0 coroutineScope, @NotNull Function1<? super AppConfig, Unit> onNewAppConfig) {
        Intrinsics.checkNotNullParameter(coroutineScope, "coroutineScope");
        Intrinsics.checkNotNullParameter(onNewAppConfig, "onNewAppConfig");
        kotlinx.coroutines.k.f(coroutineScope, null, null, new AnonymousClass1(onNewAppConfig, null), 3, null);
    }

    @oj.j
    public final void emitEvent(@NotNull IntercomEvent event) {
        Intrinsics.checkNotNullParameter(event, "event");
        emitEvent$default(this, null, event, 1, null);
    }

    public final void fetchConversationSuccess(@NotNull Conversation conversation) {
        Set<String> value;
        ArrayList arrayList;
        Intrinsics.checkNotNullParameter(conversation, "conversation");
        Set<String> value2 = this.unreadConversationIds.getValue();
        if (!conversation.isRead()) {
            k0<Set<String>> k0Var = this._unreadConversationIds;
            while (!k0Var.compareAndSet(k0Var.getValue(), SetsKt.plus(value2, conversation.getId()))) {
            }
            return;
        }
        k0<Set<String>> k0Var2 = this._unreadConversationIds;
        do {
            value = k0Var2.getValue();
            arrayList = new ArrayList();
            for (Object obj : value2) {
                if (!Intrinsics.areEqual((String) obj, conversation.getId())) {
                    arrayList.add(obj);
                }
            }
        } while (!k0Var2.compareAndSet(value, CollectionsKt.toSet(arrayList)));
    }

    @NotNull
    public final z0<String> getBotBehaviourId() {
        return this.botBehaviourId;
    }

    @NotNull
    public final z0<BotIntro> getBotIntro() {
        return this.botIntro;
    }

    @NotNull
    public final z0<AppConfig> getConfig() {
        return this.config;
    }

    @NotNull
    public final z0<List<Conversation>> getConversations() {
        return this.conversations;
    }

    @NotNull
    public final o0<IntercomEvent> getEvent() {
        return this.event;
    }

    @NotNull
    public final z0<HostAppState> getHostAppState() {
        return this.hostAppState;
    }

    @Nullable
    public final OpenMessengerResponse getOpenResponse() {
        return this.openResponse;
    }

    @NotNull
    public final z0<OverlayState> getOverlayState() {
        return this.overlayState;
    }

    @NotNull
    public final z0<Boolean> getPushNotificationsBannerDismissed() {
        return this.pushNotificationsBannerDismissed;
    }

    @NotNull
    public final z0<SurveyData> getSurveyData() {
        return this.surveyData;
    }

    @NotNull
    public final z0<TeamPresence> getTeamPresence() {
        return this.teamPresence;
    }

    @NotNull
    public final z0<Ticket> getTicket() {
        return this.ticket;
    }

    @NotNull
    public final z0<Set<String>> getUnreadConversationIds() {
        return this.unreadConversationIds;
    }

    public final void hardReset() {
        HostAppState value;
        resetConfig();
        k0<HostAppState> k0Var = this._hostAppState;
        do {
            value = k0Var.getValue();
        } while (!k0Var.compareAndSet(value, HostAppState.copy$default(value, false, false, 0L, 5, null)));
    }

    public final void listenToEvents(@NotNull s0 coroutineScope, @NotNull Function1<? super IntercomEvent, Unit> onNewEvent) {
        Intrinsics.checkNotNullParameter(coroutineScope, "coroutineScope");
        Intrinsics.checkNotNullParameter(onNewEvent, "onNewEvent");
        kotlinx.coroutines.k.f(coroutineScope, null, null, new C28081(onNewEvent, null), 3, null);
    }

    public final void markConversationAsRead(@NotNull String conversationId) {
        OverlayState value;
        OverlayState overlayState;
        ArrayList arrayList;
        Set<String> value2;
        ArrayList arrayList2;
        Intrinsics.checkNotNullParameter(conversationId, "conversationId");
        List<Conversation> conversations = this.overlayState.getValue().getConversations();
        k0<OverlayState> k0Var = this._overlayState;
        do {
            value = k0Var.getValue();
            overlayState = value;
            arrayList = new ArrayList();
            for (Object obj : conversations) {
                if (!Intrinsics.areEqual(((Conversation) obj).getId(), conversationId)) {
                    arrayList.add(obj);
                }
            }
        } while (!k0Var.compareAndSet(value, OverlayState.copy$default(overlayState, null, null, 0, null, null, arrayList, null, null, null, 479, null)));
        Set<String> value3 = this.unreadConversationIds.getValue();
        k0<Set<String>> k0Var2 = this._unreadConversationIds;
        do {
            value2 = k0Var2.getValue();
            arrayList2 = new ArrayList();
            for (Object obj2 : value3) {
                if (!Intrinsics.areEqual((String) obj2, conversationId)) {
                    arrayList2.add(obj2);
                }
            }
        } while (!k0Var2.compareAndSet(value2, CollectionsKt.toSet(arrayList2)));
    }

    public final void markConversationPartAsDismissed(@NotNull String partId) {
        OverlayState value;
        OverlayState overlayState;
        ArrayList arrayList;
        Intrinsics.checkNotNullParameter(partId, "partId");
        List<Conversation> conversations = this.overlayState.getValue().getConversations();
        Set setPlus = SetsKt.plus(this.overlayState.getValue().getDismissedPartIds(), partId);
        k0<OverlayState> k0Var = this._overlayState;
        do {
            value = k0Var.getValue();
            overlayState = value;
            arrayList = new ArrayList();
            for (Object obj : conversations) {
                Conversation conversation = (Conversation) obj;
                Set set = setPlus;
                if (!(set instanceof Collection) || !set.isEmpty()) {
                    Iterator it = set.iterator();
                    do {
                        if (it.hasNext()) {
                        }
                    } while (!Intrinsics.areEqual((String) it.next(), conversation.lastPart().getId()));
                }
                arrayList.add(obj);
            }
        } while (!k0Var.compareAndSet(value, OverlayState.copy$default(overlayState, null, null, 0, null, null, arrayList, setPlus, null, null, 415, null)));
    }

    public final void overlayStateUpdates(@NotNull s0 coroutineScope, @NotNull Function1<? super OverlayState, Unit> onNewOverlyState) {
        Intrinsics.checkNotNullParameter(coroutineScope, "coroutineScope");
        Intrinsics.checkNotNullParameter(onNewOverlyState, "onNewOverlyState");
        kotlinx.coroutines.k.f(coroutineScope, null, null, new C28091(onNewOverlyState, null), 3, null);
    }

    public final void resetConfig() {
        updateAppConfig(AppConfig.copy$default(this.config.getValue(), null, 0, 0, 0, false, false, false, 0, 0L, 0L, 0L, 0L, false, false, null, null, false, false, null, null, null, null, "", false, false, false, false, false, null, new NexusConfig(), null, false, null, false, -541065217, 3, null));
    }

    public final void unreadConversationIdsUpdates(@NotNull s0 coroutineScope, @NotNull Function1<? super Set<String>, Unit> onNewUnreadConversationsIdsState) {
        Intrinsics.checkNotNullParameter(coroutineScope, "coroutineScope");
        Intrinsics.checkNotNullParameter(onNewUnreadConversationsIdsState, "onNewUnreadConversationsIdsState");
        kotlinx.coroutines.k.f(coroutineScope, null, null, new C28101(onNewUnreadConversationsIdsState, null), 3, null);
    }

    public final void updateBotBehaviourId(@Nullable String str) {
        k0<String> k0Var = this._botBehaviourId;
        while (!k0Var.compareAndSet(k0Var.getValue(), str)) {
        }
    }

    public final void updateBotIntro(@NotNull BotIntro botIntro) {
        Intrinsics.checkNotNullParameter(botIntro, "botIntro");
        k0<BotIntro> k0Var = this._botIntro;
        while (!k0Var.compareAndSet(k0Var.getValue(), botIntro)) {
        }
    }

    public final void updateBottomPadding(int i10) {
        k0<OverlayState> k0Var = this._overlayState;
        while (true) {
            OverlayState value = k0Var.getValue();
            int i11 = i10;
            if (k0Var.compareAndSet(value, OverlayState.copy$default(value, null, null, i11, null, null, null, null, null, null, v.g.f44095o, null))) {
                return;
            } else {
                i10 = i11;
            }
        }
    }

    public final void updateCarousel(@NotNull Carousel carousel) {
        OverlayState value;
        OverlayState overlayState;
        Intrinsics.checkNotNullParameter(carousel, "carousel");
        k0<OverlayState> k0Var = this._overlayState;
        do {
            value = k0Var.getValue();
            overlayState = value;
        } while (!k0Var.compareAndSet(value, OverlayState.copy$default(overlayState, null, Intrinsics.areEqual(overlayState.getCarousel(), Carousel.NULL) ? carousel : overlayState.getCarousel(), 0, null, null, null, null, null, null, 509, null)));
    }

    public final void updateConfig(@NotNull Config config) {
        Intrinsics.checkNotNullParameter(config, "config");
        if (Intrinsics.areEqual(config, Config.Companion.getNULL())) {
            return;
        }
        updateAppConfig(AppConfigKt.getAppConfig(config, this._config.getValue().getPrimaryColor()));
    }

    public final void updateInAppNotificationsVisibility(@NotNull Intercom.Visibility visibility) {
        Intrinsics.checkNotNullParameter(visibility, "visibility");
        k0<OverlayState> k0Var = this._overlayState;
        while (true) {
            OverlayState value = k0Var.getValue();
            Intercom.Visibility visibility2 = visibility;
            if (k0Var.compareAndSet(value, OverlayState.copy$default(value, null, null, 0, null, visibility2, null, null, null, null, 495, null))) {
                return;
            } else {
                visibility = visibility2;
            }
        }
    }

    public final void updateLauncherVisibility(@NotNull Intercom.Visibility visibility) {
        Intrinsics.checkNotNullParameter(visibility, "visibility");
        k0<OverlayState> k0Var = this._overlayState;
        while (true) {
            OverlayState value = k0Var.getValue();
            Intercom.Visibility visibility2 = visibility;
            if (k0Var.compareAndSet(value, OverlayState.copy$default(value, null, null, 0, visibility2, null, null, null, null, null, 503, null))) {
                return;
            } else {
                visibility = visibility2;
            }
        }
    }

    public final void updateOpenResponse(@NotNull OpenMessengerResponse response) {
        Intrinsics.checkNotNullParameter(response, "response");
        this.openResponse = response;
    }

    public final void updateOverlayConversations(@NotNull List<Conversation> conversations) {
        OverlayState value;
        OverlayState overlayState;
        ArrayList arrayList;
        Intrinsics.checkNotNullParameter(conversations, "conversations");
        Set<String> dismissedPartIds = this.overlayState.getValue().getDismissedPartIds();
        k0<OverlayState> k0Var = this._overlayState;
        do {
            value = k0Var.getValue();
            overlayState = value;
            ArrayList arrayList2 = new ArrayList();
            for (Object obj : conversations) {
                Conversation conversation = (Conversation) obj;
                Set<String> set = dismissedPartIds;
                if (!(set instanceof Collection) || !set.isEmpty()) {
                    Iterator<T> it = set.iterator();
                    do {
                        if (it.hasNext()) {
                        }
                    } while (!Intrinsics.areEqual((String) it.next(), conversation.lastPart().getId()));
                }
                arrayList2.add(obj);
            }
            arrayList = new ArrayList();
            for (Object obj2 : arrayList2) {
                if (((Conversation) obj2).lastPart().getDeliveryOption() != DeliveryOption.BADGE) {
                    arrayList.add(obj2);
                }
            }
        } while (!k0Var.compareAndSet(value, OverlayState.copy$default(overlayState, null, null, 0, null, null, arrayList, null, null, null, 479, null)));
    }

    public final void updatePushNotificationsBannerDismissed(boolean z10) {
        Boolean value;
        SharedPreferences sharedPreferences = this.context.getSharedPreferences(PreferenceKeys.INTERCOM_PREFS, 0);
        Intrinsics.checkNotNull(sharedPreferences);
        SharedPreferences.Editor editorEdit = sharedPreferences.edit();
        editorEdit.putBoolean("push_notifications_banner_dismissed", z10);
        editorEdit.apply();
        k0<Boolean> k0Var = this._pushNotificationsBannerDismissed;
        do {
            value = k0Var.getValue();
            value.getClass();
        } while (!k0Var.compareAndSet(value, Boolean.valueOf(z10)));
    }

    public final void updateSessionStarted() {
        HostAppState value;
        k0<HostAppState> k0Var = this._hostAppState;
        do {
            value = k0Var.getValue();
        } while (!k0Var.compareAndSet(value, HostAppState.copy$default(value, false, true, 0L, 5, null)));
    }

    public final void updateSurveyData(@NotNull SurveyData surveyData) {
        OverlayState value;
        OverlayState overlayState;
        Intrinsics.checkNotNullParameter(surveyData, "surveyData");
        k0<SurveyData> k0Var = this._surveyData;
        while (!k0Var.compareAndSet(k0Var.getValue(), surveyData)) {
        }
        k0<OverlayState> k0Var2 = this._overlayState;
        do {
            value = k0Var2.getValue();
            overlayState = value;
        } while (!k0Var2.compareAndSet(value, OverlayState.copy$default(overlayState, Intrinsics.areEqual(overlayState.getSurveyData(), SurveyData.Companion.getNULL()) ? surveyData : overlayState.getSurveyData(), null, 0, null, null, null, null, null, null, v.g.f44098r, null)));
    }

    public final void updateTeamPresence(@NotNull TeamPresence teamPresence) {
        Intrinsics.checkNotNullParameter(teamPresence, "teamPresence");
        k0<TeamPresence> k0Var = this._teamPresence;
        while (!k0Var.compareAndSet(k0Var.getValue(), teamPresence)) {
        }
    }

    public final void updateTicket(@NotNull Ticket ticket) {
        Intrinsics.checkNotNullParameter(ticket, "ticket");
        k0<Ticket> k0Var = this._ticket;
        while (!k0Var.compareAndSet(k0Var.getValue(), ticket)) {
        }
    }

    public final void updateUnreadConversationIds(@NotNull Set<String> unreadConversationIds) {
        Intrinsics.checkNotNullParameter(unreadConversationIds, "unreadConversationIds");
        k0<Set<String>> k0Var = this._unreadConversationIds;
        while (!k0Var.compareAndSet(k0Var.getValue(), unreadConversationIds)) {
        }
    }

    @Nullable
    public final Object emitEvent(@NotNull IntercomEvent intercomEvent, @NotNull d<? super Unit> dVar) {
        Object objEmit = this._event.emit(intercomEvent, dVar);
        return objEmit == b.l() ? objEmit : Unit.f312394a;
    }

    @oj.j
    public final void emitEvent(@NotNull s0 coroutineScope, @NotNull IntercomEvent event) {
        Intrinsics.checkNotNullParameter(coroutineScope, "coroutineScope");
        Intrinsics.checkNotNullParameter(event, "event");
        kotlinx.coroutines.k.f(coroutineScope, null, null, new AnonymousClass2(event, null), 3, null);
    }
}
