package io.intercom.android.sdk.m5.navigation;

import android.content.Intent;
import android.os.Bundle;
import androidx.compose.foundation.layout.b8;
import androidx.compose.foundation.layout.d5;
import androidx.compose.foundation.layout.g5;
import androidx.compose.foundation.layout.t7;
import androidx.compose.foundation.layout.v6;
import androidx.compose.material3.pt;
import androidx.compose.runtime.s5;
import androidx.compose.runtime.t4;
import androidx.compose.runtime.w6;
import androidx.compose.ui.platform.c4;
import androidx.media3.exoplayer.a5;
import androidx.navigation.d3;
import androidx.navigation.x3;
import io.intercom.android.sdk.m5.components.TopActionBarKt;
import io.intercom.android.sdk.m5.navigation.transitions.TransitionArgs;
import io.intercom.android.sdk.m5.navigation.transitions.TransitionStyleKt;
import io.intercom.android.sdk.metrics.MetricTracker;
import io.intercom.android.sdk.tickets.TicketDetailContentKt;
import io.intercom.android.sdk.tickets.TicketDetailErrorScreenKt;
import io.intercom.android.sdk.tickets.TicketDetailState;
import io.intercom.android.sdk.tickets.TicketDetailViewModel;
import io.intercom.android.sdk.tickets.TicketDetailsLoadingScreenKt;
import io.intercom.android.sdk.tickets.TicketLaunchedFrom;
import io.intercom.android.sdk.ui.R;
import io.intercom.android.sdk.ui.extension.NavBackStackEntryExtensionKt;
import io.intercom.android.sdk.ui.theme.IntercomTheme;
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
public final class TicketDetailDestinationKt {

    @NotNull
    public static final String LAUNCHED_FROM = "from";

    @NotNull
    public static final String SHOW_SUBMISSION_CARD = "show_submission_card";

    @NotNull
    public static final String TICKET_ID = "ticket_id";

    /* JADX INFO: renamed from: io.intercom.android.sdk.m5.navigation.TicketDetailDestinationKt$TicketDetailScreen$4, reason: invalid class name */
    @SourceDebugExtension({"SMAP\nTicketDetailDestination.kt\nKotlin\n*S Kotlin\n*F\n+ 1 TicketDetailDestination.kt\nio/intercom/android/sdk/m5/navigation/TicketDetailDestinationKt$TicketDetailScreen$4\n+ 2 Composer.kt\nandroidx/compose/runtime/ComposerKt\n*L\n1#1,263:1\n1282#2,6:264\n*S KotlinDebug\n*F\n+ 1 TicketDetailDestination.kt\nio/intercom/android/sdk/m5/navigation/TicketDetailDestinationKt$TicketDetailScreen$4\n*L\n251#1:264,6\n*E\n"})
    static final class AnonymousClass4 implements pj.n<g5, androidx.compose.runtime.c0, Integer, Unit> {
        final /* synthetic */ boolean $isLaunchedProgrammatically;
        final /* synthetic */ Function2<String, Boolean, Unit> $onConversationCTAClicked;
        final /* synthetic */ boolean $showSubmissionCard;
        final /* synthetic */ TicketDetailState $ticketDetailState;

        /* JADX WARN: Multi-variable type inference failed */
        AnonymousClass4(TicketDetailState ticketDetailState, Function2<? super String, ? super Boolean, Unit> function2, boolean z10, boolean z11) {
            this.$ticketDetailState = ticketDetailState;
            this.$onConversationCTAClicked = function2;
            this.$isLaunchedProgrammatically = z10;
            this.$showSubmissionCard = z11;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final Unit invoke$lambda$1$lambda$0(Function2 function2, TicketDetailState ticketDetailState, boolean z10, String str) {
            Intrinsics.checkNotNullParameter(ticketDetailState, "$ticketDetailState");
            function2.invoke(((TicketDetailState.TicketDetailContentState) ticketDetailState).getConversationId(), Boolean.valueOf(z10));
            return Unit.f312394a;
        }

        @Override // pj.n
        public /* bridge */ /* synthetic */ Unit invoke(g5 g5Var, androidx.compose.runtime.c0 c0Var, Integer num) {
            invoke(g5Var, c0Var, num.intValue());
            return Unit.f312394a;
        }

        @androidx.compose.runtime.o
        @androidx.compose.runtime.t(applier = "androidx.compose.ui.UiComposable")
        public final void invoke(g5 contentPadding, androidx.compose.runtime.c0 c0Var, int i10) {
            Intrinsics.checkNotNullParameter(contentPadding, "contentPadding");
            if ((i10 & 14) == 0) {
                i10 |= c0Var.D(contentPadding) ? 4 : 2;
            }
            if ((i10 & 91) == 18 && c0Var.d()) {
                c0Var.u();
                return;
            }
            TicketDetailState ticketDetailState = this.$ticketDetailState;
            if (Intrinsics.areEqual(ticketDetailState, TicketDetailState.Initial.INSTANCE) || Intrinsics.areEqual(ticketDetailState, TicketDetailState.Loading.INSTANCE)) {
                c0Var.E(1534755158);
                TicketDetailsLoadingScreenKt.TicketDetailsLoadingScreen(d5.p(androidx.compose.ui.a0.E, contentPadding), c0Var, 0, 0);
                c0Var.A();
                return;
            }
            if (ticketDetailState instanceof TicketDetailState.Error) {
                c0Var.E(332916057);
                TicketDetailErrorScreenKt.TicketDetailErrorScreen(((TicketDetailState.Error) this.$ticketDetailState).getErrorState(), d5.p(androidx.compose.ui.a0.E, contentPadding), c0Var, 0, 0);
                c0Var.A();
                return;
            }
            if (!(ticketDetailState instanceof TicketDetailState.TicketDetailContentState)) {
                c0Var.E(1534752236);
                c0Var.A();
                throw new kotlin.k0();
            }
            c0Var.E(333141954);
            androidx.compose.ui.a0 a0VarP = d5.p(androidx.compose.ui.a0.E, contentPadding);
            TicketDetailState.TicketDetailContentState ticketDetailContentState = (TicketDetailState.TicketDetailContentState) this.$ticketDetailState;
            c0Var.E(1534773801);
            boolean zD = c0Var.D(this.$onConversationCTAClicked) | c0Var.D(this.$ticketDetailState) | c0Var.G(this.$isLaunchedProgrammatically);
            final Function2<String, Boolean, Unit> function2 = this.$onConversationCTAClicked;
            final TicketDetailState ticketDetailState2 = this.$ticketDetailState;
            final boolean z10 = this.$isLaunchedProgrammatically;
            Object objI0 = c0Var.i0();
            if (zD || objI0 == androidx.compose.runtime.c0.f35327a.a()) {
                objI0 = new Function1() { // from class: io.intercom.android.sdk.m5.navigation.r2
                    @Override // kotlin.jvm.functions.Function1
                    public final Object invoke(Object obj) {
                        return TicketDetailDestinationKt.AnonymousClass4.invoke$lambda$1$lambda$0(function2, ticketDetailState2, z10, (String) obj);
                    }
                };
                c0Var.Y(objI0);
            }
            c0Var.A();
            TicketDetailContentKt.TicketDetailContent(a0VarP, ticketDetailContentState, (Function1) objI0, this.$showSubmissionCard, c0Var, 64, 0);
            c0Var.A();
        }
    }

    /* JADX WARN: Code duplicated, block: B:26:0x004c  */
    /* JADX WARN: Code duplicated, block: B:28:0x0051  */
    /* JADX WARN: Code duplicated, block: B:30:0x0055  */
    /* JADX WARN: Code duplicated, block: B:32:0x005d  */
    /* JADX WARN: Code duplicated, block: B:33:0x0060  */
    /* JADX WARN: Code duplicated, block: B:37:0x0067  */
    /* JADX WARN: Code duplicated, block: B:39:0x006c  */
    /* JADX WARN: Code duplicated, block: B:41:0x0070  */
    /* JADX WARN: Code duplicated, block: B:43:0x007a  */
    /* JADX WARN: Code duplicated, block: B:44:0x007d  */
    /* JADX WARN: Code duplicated, block: B:48:0x0084  */
    /* JADX WARN: Code duplicated, block: B:49:0x0087  */
    /* JADX WARN: Code duplicated, block: B:51:0x008d  */
    /* JADX WARN: Code duplicated, block: B:53:0x0093  */
    /* JADX WARN: Code duplicated, block: B:54:0x0096  */
    /* JADX WARN: Code duplicated, block: B:58:0x00a1  */
    /* JADX WARN: Code duplicated, block: B:62:0x00b3 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:63:0x00b5  */
    /* JADX WARN: Code duplicated, block: B:64:0x00bb  */
    /* JADX WARN: Code duplicated, block: B:66:0x00be  */
    /* JADX WARN: Code duplicated, block: B:67:0x00c4  */
    /* JADX WARN: Code duplicated, block: B:69:0x00c7  */
    /* JADX WARN: Code duplicated, block: B:70:0x00c9  */
    /* JADX WARN: Code duplicated, block: B:74:0x0129  */
    /* JADX WARN: Code duplicated, block: B:76:? A[RETURN, SYNTHETIC] */
    @androidx.compose.runtime.o
    @androidx.compose.runtime.t(applier = "androidx.compose.ui.UiComposable")
    public static final void TicketDetailScreen(@NotNull final TicketDetailState ticketDetailState, @Nullable Function0<Unit> function0, @Nullable Function2<? super String, ? super Boolean, Unit> function2, boolean z10, final boolean z11, @Nullable androidx.compose.runtime.c0 c0Var, final int i10, final int i11) {
        int i12;
        Function0<Unit> function1;
        int i13;
        Function2<? super String, ? super Boolean, Unit> function3;
        int i14;
        int i15;
        boolean z12;
        int i16;
        int i17;
        final Function0<Unit> function4;
        final Function2<? super String, ? super Boolean, Unit> function5;
        final boolean z13;
        androidx.compose.runtime.c0 c0Var2;
        s5 s5VarT;
        Intrinsics.checkNotNullParameter(ticketDetailState, "ticketDetailState");
        androidx.compose.runtime.c0 c0VarR = c0Var.R(226165078);
        if ((i11 & 1) != 0) {
            i12 = i10 | 6;
        } else if ((i10 & 14) == 0) {
            i12 = (c0VarR.D(ticketDetailState) ? 4 : 2) | i10;
        } else {
            i12 = i10;
        }
        int i18 = i11 & 2;
        if (i18 == 0) {
            if ((i10 & com.planner5d.library.engine.input.f.b.B) == 0) {
                function1 = function0;
                i12 |= c0VarR.k0(function1) ? 32 : 16;
            }
            i13 = i11 & 4;
            if (i13 != 0) {
                if ((i10 & 896) == 0) {
                    function3 = function2;
                    if (c0VarR.k0(function3)) {
                        i14 = 256;
                    } else {
                        i14 = 128;
                    }
                    i12 |= i14;
                }
                i15 = i11 & 8;
                if (i15 != 0) {
                    if ((i10 & 7168) == 0) {
                        z12 = z10;
                        if (c0VarR.G(z12)) {
                            i16 = 2048;
                        } else {
                            i16 = 1024;
                        }
                        i12 |= i16;
                    }
                    if ((i11 & 16) != 0) {
                        i12 |= 24576;
                    } else if ((57344 & i10) == 0) {
                        if (c0VarR.G(z11)) {
                            i17 = 16384;
                        } else {
                            i17 = 8192;
                        }
                        i12 |= i17;
                    }
                    if ((i12 & 46811) == 9362 || !c0VarR.d()) {
                        if (i18 != 0) {
                            function4 = new Function0() { // from class: io.intercom.android.sdk.m5.navigation.j2
                                @Override // kotlin.jvm.functions.Function0
                                public final Object invoke() {
                                    return Unit.f312394a;
                                }
                            };
                        } else {
                            function4 = function1;
                        }
                        if (i13 != 0) {
                            function5 = new Function2() { // from class: io.intercom.android.sdk.m5.navigation.k2
                                @Override // kotlin.jvm.functions.Function2
                                public final Object invoke(Object obj, Object obj2) {
                                    return TicketDetailDestinationKt.TicketDetailScreen$lambda$18((String) obj, ((Boolean) obj2).booleanValue());
                                }
                            };
                        } else {
                            function5 = function3;
                        }
                        if (i15 != 0) {
                            z13 = false;
                        } else {
                            z13 = z12;
                        }
                        c0Var2 = c0VarR;
                        pt.f(c4.a(t7.h(androidx.compose.foundation.v.d(androidx.compose.ui.a0.E, IntercomTheme.INSTANCE.getColors(c0VarR, IntercomTheme.$stable).m690getBackground0d7_KjU(), null, 2, null), b8.o(v6.f16495a, c0VarR, 8)), "ticket_detail_screen"), androidx.compose.runtime.internal.w.e(-2018170598, true, new Function2<androidx.compose.runtime.c0, Integer, Unit>() { // from class: io.intercom.android.sdk.m5.navigation.TicketDetailDestinationKt.TicketDetailScreen.3
                            @Override // kotlin.jvm.functions.Function2
                            public /* bridge */ /* synthetic */ Unit invoke(androidx.compose.runtime.c0 c0Var3, Integer num) {
                                invoke(c0Var3, num.intValue());
                                return Unit.f312394a;
                            }

                            @androidx.compose.runtime.o
                            @androidx.compose.runtime.t(applier = "androidx.compose.ui.UiComposable")
                            public final void invoke(androidx.compose.runtime.c0 c0Var3, int i19) {
                                String ticketName;
                                if ((i19 & 11) == 2 && c0Var3.d()) {
                                    c0Var3.u();
                                    return;
                                }
                                TicketDetailState ticketDetailState2 = ticketDetailState;
                                TicketDetailState.TicketDetailContentState ticketDetailContentState = ticketDetailState2 instanceof TicketDetailState.TicketDetailContentState ? (TicketDetailState.TicketDetailContentState) ticketDetailState2 : null;
                                if (ticketDetailContentState == null || (ticketName = ticketDetailContentState.getTicketName()) == null) {
                                    ticketName = "";
                                }
                                Function0<Unit> function6 = function4;
                                Integer numValueOf = Integer.valueOf(R.drawable.intercom_ic_close);
                                IntercomTheme intercomTheme = IntercomTheme.INSTANCE;
                                int i20 = IntercomTheme.$stable;
                                TopActionBarKt.m172TopActionBarNpQZenA(null, ticketName, null, null, null, function6, numValueOf, false, intercomTheme.getColors(c0Var3, i20).m690getBackground0d7_KjU(), intercomTheme.getColors(c0Var3, i20).m714getPrimaryText0d7_KjU(), 0L, null, null, c0Var3, 0, 0, 7325);
                            }
                        }, c0VarR, 54), null, null, null, 0, 0L, 0L, null, androidx.compose.runtime.internal.w.e(1401868325, true, new AnonymousClass4(ticketDetailState, function5, z11, z13), c0VarR, 54), c0Var2, 805306416, androidx.constraintlayout.core.motion.utils.v.g.f44096p);
                    } else {
                        c0VarR.u();
                        c0Var2 = c0VarR;
                        function4 = function1;
                        function5 = function3;
                        z13 = z12;
                    }
                    s5VarT = c0Var2.T();
                    if (s5VarT != null) {
                        s5VarT.a(new Function2() { // from class: io.intercom.android.sdk.m5.navigation.l2
                            @Override // kotlin.jvm.functions.Function2
                            public final Object invoke(Object obj, Object obj2) {
                                return TicketDetailDestinationKt.TicketDetailScreen$lambda$19(ticketDetailState, function4, function5, z13, z11, i10, i11, (androidx.compose.runtime.c0) obj, ((Integer) obj2).intValue());
                            }
                        });
                    }
                }
                i12 |= 3072;
                z12 = z10;
                if ((i11 & 16) != 0) {
                    i12 |= 24576;
                } else if ((57344 & i10) == 0) {
                    if (c0VarR.G(z11)) {
                        i17 = 16384;
                    } else {
                        i17 = 8192;
                    }
                    i12 |= i17;
                }
                if ((i12 & 46811) == 9362) {
                    if (i18 != 0) {
                        function4 = new Function0() { // from class: io.intercom.android.sdk.m5.navigation.j2
                            @Override // kotlin.jvm.functions.Function0
                            public final Object invoke() {
                                return Unit.f312394a;
                            }
                        };
                    } else {
                        function4 = function1;
                    }
                    if (i13 != 0) {
                        function5 = new Function2() { // from class: io.intercom.android.sdk.m5.navigation.k2
                            @Override // kotlin.jvm.functions.Function2
                            public final Object invoke(Object obj, Object obj2) {
                                return TicketDetailDestinationKt.TicketDetailScreen$lambda$18((String) obj, ((Boolean) obj2).booleanValue());
                            }
                        };
                    } else {
                        function5 = function3;
                    }
                    if (i15 != 0) {
                        z13 = false;
                    } else {
                        z13 = z12;
                    }
                    c0Var2 = c0VarR;
                    pt.f(c4.a(t7.h(androidx.compose.foundation.v.d(androidx.compose.ui.a0.E, IntercomTheme.INSTANCE.getColors(c0VarR, IntercomTheme.$stable).m690getBackground0d7_KjU(), null, 2, null), b8.o(v6.f16495a, c0VarR, 8)), "ticket_detail_screen"), androidx.compose.runtime.internal.w.e(-2018170598, true, new Function2<androidx.compose.runtime.c0, Integer, Unit>() { // from class: io.intercom.android.sdk.m5.navigation.TicketDetailDestinationKt.TicketDetailScreen.3
                        @Override // kotlin.jvm.functions.Function2
                        public /* bridge */ /* synthetic */ Unit invoke(androidx.compose.runtime.c0 c0Var3, Integer num) {
                            invoke(c0Var3, num.intValue());
                            return Unit.f312394a;
                        }

                        @androidx.compose.runtime.o
                        @androidx.compose.runtime.t(applier = "androidx.compose.ui.UiComposable")
                        public final void invoke(androidx.compose.runtime.c0 c0Var3, int i19) {
                            String ticketName;
                            if ((i19 & 11) == 2 && c0Var3.d()) {
                                c0Var3.u();
                                return;
                            }
                            TicketDetailState ticketDetailState2 = ticketDetailState;
                            TicketDetailState.TicketDetailContentState ticketDetailContentState = ticketDetailState2 instanceof TicketDetailState.TicketDetailContentState ? (TicketDetailState.TicketDetailContentState) ticketDetailState2 : null;
                            if (ticketDetailContentState == null || (ticketName = ticketDetailContentState.getTicketName()) == null) {
                                ticketName = "";
                            }
                            Function0<Unit> function6 = function4;
                            Integer numValueOf = Integer.valueOf(R.drawable.intercom_ic_close);
                            IntercomTheme intercomTheme = IntercomTheme.INSTANCE;
                            int i20 = IntercomTheme.$stable;
                            TopActionBarKt.m172TopActionBarNpQZenA(null, ticketName, null, null, null, function6, numValueOf, false, intercomTheme.getColors(c0Var3, i20).m690getBackground0d7_KjU(), intercomTheme.getColors(c0Var3, i20).m714getPrimaryText0d7_KjU(), 0L, null, null, c0Var3, 0, 0, 7325);
                        }
                    }, c0VarR, 54), null, null, null, 0, 0L, 0L, null, androidx.compose.runtime.internal.w.e(1401868325, true, new AnonymousClass4(ticketDetailState, function5, z11, z13), c0VarR, 54), c0Var2, 805306416, androidx.constraintlayout.core.motion.utils.v.g.f44096p);
                } else {
                    if (i18 != 0) {
                        function4 = new Function0() { // from class: io.intercom.android.sdk.m5.navigation.j2
                            @Override // kotlin.jvm.functions.Function0
                            public final Object invoke() {
                                return Unit.f312394a;
                            }
                        };
                    } else {
                        function4 = function1;
                    }
                    if (i13 != 0) {
                        function5 = new Function2() { // from class: io.intercom.android.sdk.m5.navigation.k2
                            @Override // kotlin.jvm.functions.Function2
                            public final Object invoke(Object obj, Object obj2) {
                                return TicketDetailDestinationKt.TicketDetailScreen$lambda$18((String) obj, ((Boolean) obj2).booleanValue());
                            }
                        };
                    } else {
                        function5 = function3;
                    }
                    if (i15 != 0) {
                        z13 = false;
                    } else {
                        z13 = z12;
                    }
                    c0Var2 = c0VarR;
                    pt.f(c4.a(t7.h(androidx.compose.foundation.v.d(androidx.compose.ui.a0.E, IntercomTheme.INSTANCE.getColors(c0VarR, IntercomTheme.$stable).m690getBackground0d7_KjU(), null, 2, null), b8.o(v6.f16495a, c0VarR, 8)), "ticket_detail_screen"), androidx.compose.runtime.internal.w.e(-2018170598, true, new Function2<androidx.compose.runtime.c0, Integer, Unit>() { // from class: io.intercom.android.sdk.m5.navigation.TicketDetailDestinationKt.TicketDetailScreen.3
                        @Override // kotlin.jvm.functions.Function2
                        public /* bridge */ /* synthetic */ Unit invoke(androidx.compose.runtime.c0 c0Var3, Integer num) {
                            invoke(c0Var3, num.intValue());
                            return Unit.f312394a;
                        }

                        @androidx.compose.runtime.o
                        @androidx.compose.runtime.t(applier = "androidx.compose.ui.UiComposable")
                        public final void invoke(androidx.compose.runtime.c0 c0Var3, int i19) {
                            String ticketName;
                            if ((i19 & 11) == 2 && c0Var3.d()) {
                                c0Var3.u();
                                return;
                            }
                            TicketDetailState ticketDetailState2 = ticketDetailState;
                            TicketDetailState.TicketDetailContentState ticketDetailContentState = ticketDetailState2 instanceof TicketDetailState.TicketDetailContentState ? (TicketDetailState.TicketDetailContentState) ticketDetailState2 : null;
                            if (ticketDetailContentState == null || (ticketName = ticketDetailContentState.getTicketName()) == null) {
                                ticketName = "";
                            }
                            Function0<Unit> function6 = function4;
                            Integer numValueOf = Integer.valueOf(R.drawable.intercom_ic_close);
                            IntercomTheme intercomTheme = IntercomTheme.INSTANCE;
                            int i20 = IntercomTheme.$stable;
                            TopActionBarKt.m172TopActionBarNpQZenA(null, ticketName, null, null, null, function6, numValueOf, false, intercomTheme.getColors(c0Var3, i20).m690getBackground0d7_KjU(), intercomTheme.getColors(c0Var3, i20).m714getPrimaryText0d7_KjU(), 0L, null, null, c0Var3, 0, 0, 7325);
                        }
                    }, c0VarR, 54), null, null, null, 0, 0L, 0L, null, androidx.compose.runtime.internal.w.e(1401868325, true, new AnonymousClass4(ticketDetailState, function5, z11, z13), c0VarR, 54), c0Var2, 805306416, androidx.constraintlayout.core.motion.utils.v.g.f44096p);
                }
                s5VarT = c0Var2.T();
                if (s5VarT != null) {
                    s5VarT.a(new Function2() { // from class: io.intercom.android.sdk.m5.navigation.l2
                        @Override // kotlin.jvm.functions.Function2
                        public final Object invoke(Object obj, Object obj2) {
                            return TicketDetailDestinationKt.TicketDetailScreen$lambda$19(ticketDetailState, function4, function5, z13, z11, i10, i11, (androidx.compose.runtime.c0) obj, ((Integer) obj2).intValue());
                        }
                    });
                }
            }
            i12 |= a5.S0;
            function3 = function2;
            i15 = i11 & 8;
            if (i15 != 0) {
                if ((i10 & 7168) == 0) {
                    z12 = z10;
                    if (c0VarR.G(z12)) {
                        i16 = 2048;
                    } else {
                        i16 = 1024;
                    }
                    i12 |= i16;
                }
                if ((i11 & 16) != 0) {
                    i12 |= 24576;
                } else if ((57344 & i10) == 0) {
                    if (c0VarR.G(z11)) {
                        i17 = 16384;
                    } else {
                        i17 = 8192;
                    }
                    i12 |= i17;
                }
                if ((i12 & 46811) == 9362) {
                    if (i18 != 0) {
                        function4 = new Function0() { // from class: io.intercom.android.sdk.m5.navigation.j2
                            @Override // kotlin.jvm.functions.Function0
                            public final Object invoke() {
                                return Unit.f312394a;
                            }
                        };
                    } else {
                        function4 = function1;
                    }
                    if (i13 != 0) {
                        function5 = new Function2() { // from class: io.intercom.android.sdk.m5.navigation.k2
                            @Override // kotlin.jvm.functions.Function2
                            public final Object invoke(Object obj, Object obj2) {
                                return TicketDetailDestinationKt.TicketDetailScreen$lambda$18((String) obj, ((Boolean) obj2).booleanValue());
                            }
                        };
                    } else {
                        function5 = function3;
                    }
                    if (i15 != 0) {
                        z13 = false;
                    } else {
                        z13 = z12;
                    }
                    c0Var2 = c0VarR;
                    pt.f(c4.a(t7.h(androidx.compose.foundation.v.d(androidx.compose.ui.a0.E, IntercomTheme.INSTANCE.getColors(c0VarR, IntercomTheme.$stable).m690getBackground0d7_KjU(), null, 2, null), b8.o(v6.f16495a, c0VarR, 8)), "ticket_detail_screen"), androidx.compose.runtime.internal.w.e(-2018170598, true, new Function2<androidx.compose.runtime.c0, Integer, Unit>() { // from class: io.intercom.android.sdk.m5.navigation.TicketDetailDestinationKt.TicketDetailScreen.3
                        @Override // kotlin.jvm.functions.Function2
                        public /* bridge */ /* synthetic */ Unit invoke(androidx.compose.runtime.c0 c0Var3, Integer num) {
                            invoke(c0Var3, num.intValue());
                            return Unit.f312394a;
                        }

                        @androidx.compose.runtime.o
                        @androidx.compose.runtime.t(applier = "androidx.compose.ui.UiComposable")
                        public final void invoke(androidx.compose.runtime.c0 c0Var3, int i19) {
                            String ticketName;
                            if ((i19 & 11) == 2 && c0Var3.d()) {
                                c0Var3.u();
                                return;
                            }
                            TicketDetailState ticketDetailState2 = ticketDetailState;
                            TicketDetailState.TicketDetailContentState ticketDetailContentState = ticketDetailState2 instanceof TicketDetailState.TicketDetailContentState ? (TicketDetailState.TicketDetailContentState) ticketDetailState2 : null;
                            if (ticketDetailContentState == null || (ticketName = ticketDetailContentState.getTicketName()) == null) {
                                ticketName = "";
                            }
                            Function0<Unit> function6 = function4;
                            Integer numValueOf = Integer.valueOf(R.drawable.intercom_ic_close);
                            IntercomTheme intercomTheme = IntercomTheme.INSTANCE;
                            int i20 = IntercomTheme.$stable;
                            TopActionBarKt.m172TopActionBarNpQZenA(null, ticketName, null, null, null, function6, numValueOf, false, intercomTheme.getColors(c0Var3, i20).m690getBackground0d7_KjU(), intercomTheme.getColors(c0Var3, i20).m714getPrimaryText0d7_KjU(), 0L, null, null, c0Var3, 0, 0, 7325);
                        }
                    }, c0VarR, 54), null, null, null, 0, 0L, 0L, null, androidx.compose.runtime.internal.w.e(1401868325, true, new AnonymousClass4(ticketDetailState, function5, z11, z13), c0VarR, 54), c0Var2, 805306416, androidx.constraintlayout.core.motion.utils.v.g.f44096p);
                } else {
                    if (i18 != 0) {
                        function4 = new Function0() { // from class: io.intercom.android.sdk.m5.navigation.j2
                            @Override // kotlin.jvm.functions.Function0
                            public final Object invoke() {
                                return Unit.f312394a;
                            }
                        };
                    } else {
                        function4 = function1;
                    }
                    if (i13 != 0) {
                        function5 = new Function2() { // from class: io.intercom.android.sdk.m5.navigation.k2
                            @Override // kotlin.jvm.functions.Function2
                            public final Object invoke(Object obj, Object obj2) {
                                return TicketDetailDestinationKt.TicketDetailScreen$lambda$18((String) obj, ((Boolean) obj2).booleanValue());
                            }
                        };
                    } else {
                        function5 = function3;
                    }
                    if (i15 != 0) {
                        z13 = false;
                    } else {
                        z13 = z12;
                    }
                    c0Var2 = c0VarR;
                    pt.f(c4.a(t7.h(androidx.compose.foundation.v.d(androidx.compose.ui.a0.E, IntercomTheme.INSTANCE.getColors(c0VarR, IntercomTheme.$stable).m690getBackground0d7_KjU(), null, 2, null), b8.o(v6.f16495a, c0VarR, 8)), "ticket_detail_screen"), androidx.compose.runtime.internal.w.e(-2018170598, true, new Function2<androidx.compose.runtime.c0, Integer, Unit>() { // from class: io.intercom.android.sdk.m5.navigation.TicketDetailDestinationKt.TicketDetailScreen.3
                        @Override // kotlin.jvm.functions.Function2
                        public /* bridge */ /* synthetic */ Unit invoke(androidx.compose.runtime.c0 c0Var3, Integer num) {
                            invoke(c0Var3, num.intValue());
                            return Unit.f312394a;
                        }

                        @androidx.compose.runtime.o
                        @androidx.compose.runtime.t(applier = "androidx.compose.ui.UiComposable")
                        public final void invoke(androidx.compose.runtime.c0 c0Var3, int i19) {
                            String ticketName;
                            if ((i19 & 11) == 2 && c0Var3.d()) {
                                c0Var3.u();
                                return;
                            }
                            TicketDetailState ticketDetailState2 = ticketDetailState;
                            TicketDetailState.TicketDetailContentState ticketDetailContentState = ticketDetailState2 instanceof TicketDetailState.TicketDetailContentState ? (TicketDetailState.TicketDetailContentState) ticketDetailState2 : null;
                            if (ticketDetailContentState == null || (ticketName = ticketDetailContentState.getTicketName()) == null) {
                                ticketName = "";
                            }
                            Function0<Unit> function6 = function4;
                            Integer numValueOf = Integer.valueOf(R.drawable.intercom_ic_close);
                            IntercomTheme intercomTheme = IntercomTheme.INSTANCE;
                            int i20 = IntercomTheme.$stable;
                            TopActionBarKt.m172TopActionBarNpQZenA(null, ticketName, null, null, null, function6, numValueOf, false, intercomTheme.getColors(c0Var3, i20).m690getBackground0d7_KjU(), intercomTheme.getColors(c0Var3, i20).m714getPrimaryText0d7_KjU(), 0L, null, null, c0Var3, 0, 0, 7325);
                        }
                    }, c0VarR, 54), null, null, null, 0, 0L, 0L, null, androidx.compose.runtime.internal.w.e(1401868325, true, new AnonymousClass4(ticketDetailState, function5, z11, z13), c0VarR, 54), c0Var2, 805306416, androidx.constraintlayout.core.motion.utils.v.g.f44096p);
                }
                s5VarT = c0Var2.T();
                if (s5VarT != null) {
                    s5VarT.a(new Function2() { // from class: io.intercom.android.sdk.m5.navigation.l2
                        @Override // kotlin.jvm.functions.Function2
                        public final Object invoke(Object obj, Object obj2) {
                            return TicketDetailDestinationKt.TicketDetailScreen$lambda$19(ticketDetailState, function4, function5, z13, z11, i10, i11, (androidx.compose.runtime.c0) obj, ((Integer) obj2).intValue());
                        }
                    });
                }
            }
            i12 |= 3072;
            z12 = z10;
            if ((i11 & 16) != 0) {
                i12 |= 24576;
            } else if ((57344 & i10) == 0) {
                if (c0VarR.G(z11)) {
                    i17 = 16384;
                } else {
                    i17 = 8192;
                }
                i12 |= i17;
            }
            if ((i12 & 46811) == 9362) {
                if (i18 != 0) {
                    function4 = new Function0() { // from class: io.intercom.android.sdk.m5.navigation.j2
                        @Override // kotlin.jvm.functions.Function0
                        public final Object invoke() {
                            return Unit.f312394a;
                        }
                    };
                } else {
                    function4 = function1;
                }
                if (i13 != 0) {
                    function5 = new Function2() { // from class: io.intercom.android.sdk.m5.navigation.k2
                        @Override // kotlin.jvm.functions.Function2
                        public final Object invoke(Object obj, Object obj2) {
                            return TicketDetailDestinationKt.TicketDetailScreen$lambda$18((String) obj, ((Boolean) obj2).booleanValue());
                        }
                    };
                } else {
                    function5 = function3;
                }
                if (i15 != 0) {
                    z13 = false;
                } else {
                    z13 = z12;
                }
                c0Var2 = c0VarR;
                pt.f(c4.a(t7.h(androidx.compose.foundation.v.d(androidx.compose.ui.a0.E, IntercomTheme.INSTANCE.getColors(c0VarR, IntercomTheme.$stable).m690getBackground0d7_KjU(), null, 2, null), b8.o(v6.f16495a, c0VarR, 8)), "ticket_detail_screen"), androidx.compose.runtime.internal.w.e(-2018170598, true, new Function2<androidx.compose.runtime.c0, Integer, Unit>() { // from class: io.intercom.android.sdk.m5.navigation.TicketDetailDestinationKt.TicketDetailScreen.3
                    @Override // kotlin.jvm.functions.Function2
                    public /* bridge */ /* synthetic */ Unit invoke(androidx.compose.runtime.c0 c0Var3, Integer num) {
                        invoke(c0Var3, num.intValue());
                        return Unit.f312394a;
                    }

                    @androidx.compose.runtime.o
                    @androidx.compose.runtime.t(applier = "androidx.compose.ui.UiComposable")
                    public final void invoke(androidx.compose.runtime.c0 c0Var3, int i19) {
                        String ticketName;
                        if ((i19 & 11) == 2 && c0Var3.d()) {
                            c0Var3.u();
                            return;
                        }
                        TicketDetailState ticketDetailState2 = ticketDetailState;
                        TicketDetailState.TicketDetailContentState ticketDetailContentState = ticketDetailState2 instanceof TicketDetailState.TicketDetailContentState ? (TicketDetailState.TicketDetailContentState) ticketDetailState2 : null;
                        if (ticketDetailContentState == null || (ticketName = ticketDetailContentState.getTicketName()) == null) {
                            ticketName = "";
                        }
                        Function0<Unit> function6 = function4;
                        Integer numValueOf = Integer.valueOf(R.drawable.intercom_ic_close);
                        IntercomTheme intercomTheme = IntercomTheme.INSTANCE;
                        int i20 = IntercomTheme.$stable;
                        TopActionBarKt.m172TopActionBarNpQZenA(null, ticketName, null, null, null, function6, numValueOf, false, intercomTheme.getColors(c0Var3, i20).m690getBackground0d7_KjU(), intercomTheme.getColors(c0Var3, i20).m714getPrimaryText0d7_KjU(), 0L, null, null, c0Var3, 0, 0, 7325);
                    }
                }, c0VarR, 54), null, null, null, 0, 0L, 0L, null, androidx.compose.runtime.internal.w.e(1401868325, true, new AnonymousClass4(ticketDetailState, function5, z11, z13), c0VarR, 54), c0Var2, 805306416, androidx.constraintlayout.core.motion.utils.v.g.f44096p);
            } else {
                if (i18 != 0) {
                    function4 = new Function0() { // from class: io.intercom.android.sdk.m5.navigation.j2
                        @Override // kotlin.jvm.functions.Function0
                        public final Object invoke() {
                            return Unit.f312394a;
                        }
                    };
                } else {
                    function4 = function1;
                }
                if (i13 != 0) {
                    function5 = new Function2() { // from class: io.intercom.android.sdk.m5.navigation.k2
                        @Override // kotlin.jvm.functions.Function2
                        public final Object invoke(Object obj, Object obj2) {
                            return TicketDetailDestinationKt.TicketDetailScreen$lambda$18((String) obj, ((Boolean) obj2).booleanValue());
                        }
                    };
                } else {
                    function5 = function3;
                }
                if (i15 != 0) {
                    z13 = false;
                } else {
                    z13 = z12;
                }
                c0Var2 = c0VarR;
                pt.f(c4.a(t7.h(androidx.compose.foundation.v.d(androidx.compose.ui.a0.E, IntercomTheme.INSTANCE.getColors(c0VarR, IntercomTheme.$stable).m690getBackground0d7_KjU(), null, 2, null), b8.o(v6.f16495a, c0VarR, 8)), "ticket_detail_screen"), androidx.compose.runtime.internal.w.e(-2018170598, true, new Function2<androidx.compose.runtime.c0, Integer, Unit>() { // from class: io.intercom.android.sdk.m5.navigation.TicketDetailDestinationKt.TicketDetailScreen.3
                    @Override // kotlin.jvm.functions.Function2
                    public /* bridge */ /* synthetic */ Unit invoke(androidx.compose.runtime.c0 c0Var3, Integer num) {
                        invoke(c0Var3, num.intValue());
                        return Unit.f312394a;
                    }

                    @androidx.compose.runtime.o
                    @androidx.compose.runtime.t(applier = "androidx.compose.ui.UiComposable")
                    public final void invoke(androidx.compose.runtime.c0 c0Var3, int i19) {
                        String ticketName;
                        if ((i19 & 11) == 2 && c0Var3.d()) {
                            c0Var3.u();
                            return;
                        }
                        TicketDetailState ticketDetailState2 = ticketDetailState;
                        TicketDetailState.TicketDetailContentState ticketDetailContentState = ticketDetailState2 instanceof TicketDetailState.TicketDetailContentState ? (TicketDetailState.TicketDetailContentState) ticketDetailState2 : null;
                        if (ticketDetailContentState == null || (ticketName = ticketDetailContentState.getTicketName()) == null) {
                            ticketName = "";
                        }
                        Function0<Unit> function6 = function4;
                        Integer numValueOf = Integer.valueOf(R.drawable.intercom_ic_close);
                        IntercomTheme intercomTheme = IntercomTheme.INSTANCE;
                        int i20 = IntercomTheme.$stable;
                        TopActionBarKt.m172TopActionBarNpQZenA(null, ticketName, null, null, null, function6, numValueOf, false, intercomTheme.getColors(c0Var3, i20).m690getBackground0d7_KjU(), intercomTheme.getColors(c0Var3, i20).m714getPrimaryText0d7_KjU(), 0L, null, null, c0Var3, 0, 0, 7325);
                    }
                }, c0VarR, 54), null, null, null, 0, 0L, 0L, null, androidx.compose.runtime.internal.w.e(1401868325, true, new AnonymousClass4(ticketDetailState, function5, z11, z13), c0VarR, 54), c0Var2, 805306416, androidx.constraintlayout.core.motion.utils.v.g.f44096p);
            }
            s5VarT = c0Var2.T();
            if (s5VarT != null) {
                s5VarT.a(new Function2() { // from class: io.intercom.android.sdk.m5.navigation.l2
                    @Override // kotlin.jvm.functions.Function2
                    public final Object invoke(Object obj, Object obj2) {
                        return TicketDetailDestinationKt.TicketDetailScreen$lambda$19(ticketDetailState, function4, function5, z13, z11, i10, i11, (androidx.compose.runtime.c0) obj, ((Integer) obj2).intValue());
                    }
                });
            }
        }
        i12 |= 48;
        function1 = function0;
        i13 = i11 & 4;
        if (i13 != 0) {
            if ((i10 & 896) == 0) {
                function3 = function2;
                if (c0VarR.k0(function3)) {
                    i14 = 256;
                } else {
                    i14 = 128;
                }
                i12 |= i14;
            }
            i15 = i11 & 8;
            if (i15 != 0) {
                if ((i10 & 7168) == 0) {
                    z12 = z10;
                    if (c0VarR.G(z12)) {
                        i16 = 2048;
                    } else {
                        i16 = 1024;
                    }
                    i12 |= i16;
                }
                if ((i11 & 16) != 0) {
                    i12 |= 24576;
                } else if ((57344 & i10) == 0) {
                    if (c0VarR.G(z11)) {
                        i17 = 16384;
                    } else {
                        i17 = 8192;
                    }
                    i12 |= i17;
                }
                if ((i12 & 46811) == 9362) {
                    if (i18 != 0) {
                        function4 = new Function0() { // from class: io.intercom.android.sdk.m5.navigation.j2
                            @Override // kotlin.jvm.functions.Function0
                            public final Object invoke() {
                                return Unit.f312394a;
                            }
                        };
                    } else {
                        function4 = function1;
                    }
                    if (i13 != 0) {
                        function5 = new Function2() { // from class: io.intercom.android.sdk.m5.navigation.k2
                            @Override // kotlin.jvm.functions.Function2
                            public final Object invoke(Object obj, Object obj2) {
                                return TicketDetailDestinationKt.TicketDetailScreen$lambda$18((String) obj, ((Boolean) obj2).booleanValue());
                            }
                        };
                    } else {
                        function5 = function3;
                    }
                    if (i15 != 0) {
                        z13 = false;
                    } else {
                        z13 = z12;
                    }
                    c0Var2 = c0VarR;
                    pt.f(c4.a(t7.h(androidx.compose.foundation.v.d(androidx.compose.ui.a0.E, IntercomTheme.INSTANCE.getColors(c0VarR, IntercomTheme.$stable).m690getBackground0d7_KjU(), null, 2, null), b8.o(v6.f16495a, c0VarR, 8)), "ticket_detail_screen"), androidx.compose.runtime.internal.w.e(-2018170598, true, new Function2<androidx.compose.runtime.c0, Integer, Unit>() { // from class: io.intercom.android.sdk.m5.navigation.TicketDetailDestinationKt.TicketDetailScreen.3
                        @Override // kotlin.jvm.functions.Function2
                        public /* bridge */ /* synthetic */ Unit invoke(androidx.compose.runtime.c0 c0Var3, Integer num) {
                            invoke(c0Var3, num.intValue());
                            return Unit.f312394a;
                        }

                        @androidx.compose.runtime.o
                        @androidx.compose.runtime.t(applier = "androidx.compose.ui.UiComposable")
                        public final void invoke(androidx.compose.runtime.c0 c0Var3, int i19) {
                            String ticketName;
                            if ((i19 & 11) == 2 && c0Var3.d()) {
                                c0Var3.u();
                                return;
                            }
                            TicketDetailState ticketDetailState2 = ticketDetailState;
                            TicketDetailState.TicketDetailContentState ticketDetailContentState = ticketDetailState2 instanceof TicketDetailState.TicketDetailContentState ? (TicketDetailState.TicketDetailContentState) ticketDetailState2 : null;
                            if (ticketDetailContentState == null || (ticketName = ticketDetailContentState.getTicketName()) == null) {
                                ticketName = "";
                            }
                            Function0<Unit> function6 = function4;
                            Integer numValueOf = Integer.valueOf(R.drawable.intercom_ic_close);
                            IntercomTheme intercomTheme = IntercomTheme.INSTANCE;
                            int i20 = IntercomTheme.$stable;
                            TopActionBarKt.m172TopActionBarNpQZenA(null, ticketName, null, null, null, function6, numValueOf, false, intercomTheme.getColors(c0Var3, i20).m690getBackground0d7_KjU(), intercomTheme.getColors(c0Var3, i20).m714getPrimaryText0d7_KjU(), 0L, null, null, c0Var3, 0, 0, 7325);
                        }
                    }, c0VarR, 54), null, null, null, 0, 0L, 0L, null, androidx.compose.runtime.internal.w.e(1401868325, true, new AnonymousClass4(ticketDetailState, function5, z11, z13), c0VarR, 54), c0Var2, 805306416, androidx.constraintlayout.core.motion.utils.v.g.f44096p);
                } else {
                    if (i18 != 0) {
                        function4 = new Function0() { // from class: io.intercom.android.sdk.m5.navigation.j2
                            @Override // kotlin.jvm.functions.Function0
                            public final Object invoke() {
                                return Unit.f312394a;
                            }
                        };
                    } else {
                        function4 = function1;
                    }
                    if (i13 != 0) {
                        function5 = new Function2() { // from class: io.intercom.android.sdk.m5.navigation.k2
                            @Override // kotlin.jvm.functions.Function2
                            public final Object invoke(Object obj, Object obj2) {
                                return TicketDetailDestinationKt.TicketDetailScreen$lambda$18((String) obj, ((Boolean) obj2).booleanValue());
                            }
                        };
                    } else {
                        function5 = function3;
                    }
                    if (i15 != 0) {
                        z13 = false;
                    } else {
                        z13 = z12;
                    }
                    c0Var2 = c0VarR;
                    pt.f(c4.a(t7.h(androidx.compose.foundation.v.d(androidx.compose.ui.a0.E, IntercomTheme.INSTANCE.getColors(c0VarR, IntercomTheme.$stable).m690getBackground0d7_KjU(), null, 2, null), b8.o(v6.f16495a, c0VarR, 8)), "ticket_detail_screen"), androidx.compose.runtime.internal.w.e(-2018170598, true, new Function2<androidx.compose.runtime.c0, Integer, Unit>() { // from class: io.intercom.android.sdk.m5.navigation.TicketDetailDestinationKt.TicketDetailScreen.3
                        @Override // kotlin.jvm.functions.Function2
                        public /* bridge */ /* synthetic */ Unit invoke(androidx.compose.runtime.c0 c0Var3, Integer num) {
                            invoke(c0Var3, num.intValue());
                            return Unit.f312394a;
                        }

                        @androidx.compose.runtime.o
                        @androidx.compose.runtime.t(applier = "androidx.compose.ui.UiComposable")
                        public final void invoke(androidx.compose.runtime.c0 c0Var3, int i19) {
                            String ticketName;
                            if ((i19 & 11) == 2 && c0Var3.d()) {
                                c0Var3.u();
                                return;
                            }
                            TicketDetailState ticketDetailState2 = ticketDetailState;
                            TicketDetailState.TicketDetailContentState ticketDetailContentState = ticketDetailState2 instanceof TicketDetailState.TicketDetailContentState ? (TicketDetailState.TicketDetailContentState) ticketDetailState2 : null;
                            if (ticketDetailContentState == null || (ticketName = ticketDetailContentState.getTicketName()) == null) {
                                ticketName = "";
                            }
                            Function0<Unit> function6 = function4;
                            Integer numValueOf = Integer.valueOf(R.drawable.intercom_ic_close);
                            IntercomTheme intercomTheme = IntercomTheme.INSTANCE;
                            int i20 = IntercomTheme.$stable;
                            TopActionBarKt.m172TopActionBarNpQZenA(null, ticketName, null, null, null, function6, numValueOf, false, intercomTheme.getColors(c0Var3, i20).m690getBackground0d7_KjU(), intercomTheme.getColors(c0Var3, i20).m714getPrimaryText0d7_KjU(), 0L, null, null, c0Var3, 0, 0, 7325);
                        }
                    }, c0VarR, 54), null, null, null, 0, 0L, 0L, null, androidx.compose.runtime.internal.w.e(1401868325, true, new AnonymousClass4(ticketDetailState, function5, z11, z13), c0VarR, 54), c0Var2, 805306416, androidx.constraintlayout.core.motion.utils.v.g.f44096p);
                }
                s5VarT = c0Var2.T();
                if (s5VarT != null) {
                    s5VarT.a(new Function2() { // from class: io.intercom.android.sdk.m5.navigation.l2
                        @Override // kotlin.jvm.functions.Function2
                        public final Object invoke(Object obj, Object obj2) {
                            return TicketDetailDestinationKt.TicketDetailScreen$lambda$19(ticketDetailState, function4, function5, z13, z11, i10, i11, (androidx.compose.runtime.c0) obj, ((Integer) obj2).intValue());
                        }
                    });
                }
            }
            i12 |= 3072;
            z12 = z10;
            if ((i11 & 16) != 0) {
                i12 |= 24576;
            } else if ((57344 & i10) == 0) {
                if (c0VarR.G(z11)) {
                    i17 = 16384;
                } else {
                    i17 = 8192;
                }
                i12 |= i17;
            }
            if ((i12 & 46811) == 9362) {
                if (i18 != 0) {
                    function4 = new Function0() { // from class: io.intercom.android.sdk.m5.navigation.j2
                        @Override // kotlin.jvm.functions.Function0
                        public final Object invoke() {
                            return Unit.f312394a;
                        }
                    };
                } else {
                    function4 = function1;
                }
                if (i13 != 0) {
                    function5 = new Function2() { // from class: io.intercom.android.sdk.m5.navigation.k2
                        @Override // kotlin.jvm.functions.Function2
                        public final Object invoke(Object obj, Object obj2) {
                            return TicketDetailDestinationKt.TicketDetailScreen$lambda$18((String) obj, ((Boolean) obj2).booleanValue());
                        }
                    };
                } else {
                    function5 = function3;
                }
                if (i15 != 0) {
                    z13 = false;
                } else {
                    z13 = z12;
                }
                c0Var2 = c0VarR;
                pt.f(c4.a(t7.h(androidx.compose.foundation.v.d(androidx.compose.ui.a0.E, IntercomTheme.INSTANCE.getColors(c0VarR, IntercomTheme.$stable).m690getBackground0d7_KjU(), null, 2, null), b8.o(v6.f16495a, c0VarR, 8)), "ticket_detail_screen"), androidx.compose.runtime.internal.w.e(-2018170598, true, new Function2<androidx.compose.runtime.c0, Integer, Unit>() { // from class: io.intercom.android.sdk.m5.navigation.TicketDetailDestinationKt.TicketDetailScreen.3
                    @Override // kotlin.jvm.functions.Function2
                    public /* bridge */ /* synthetic */ Unit invoke(androidx.compose.runtime.c0 c0Var3, Integer num) {
                        invoke(c0Var3, num.intValue());
                        return Unit.f312394a;
                    }

                    @androidx.compose.runtime.o
                    @androidx.compose.runtime.t(applier = "androidx.compose.ui.UiComposable")
                    public final void invoke(androidx.compose.runtime.c0 c0Var3, int i19) {
                        String ticketName;
                        if ((i19 & 11) == 2 && c0Var3.d()) {
                            c0Var3.u();
                            return;
                        }
                        TicketDetailState ticketDetailState2 = ticketDetailState;
                        TicketDetailState.TicketDetailContentState ticketDetailContentState = ticketDetailState2 instanceof TicketDetailState.TicketDetailContentState ? (TicketDetailState.TicketDetailContentState) ticketDetailState2 : null;
                        if (ticketDetailContentState == null || (ticketName = ticketDetailContentState.getTicketName()) == null) {
                            ticketName = "";
                        }
                        Function0<Unit> function6 = function4;
                        Integer numValueOf = Integer.valueOf(R.drawable.intercom_ic_close);
                        IntercomTheme intercomTheme = IntercomTheme.INSTANCE;
                        int i20 = IntercomTheme.$stable;
                        TopActionBarKt.m172TopActionBarNpQZenA(null, ticketName, null, null, null, function6, numValueOf, false, intercomTheme.getColors(c0Var3, i20).m690getBackground0d7_KjU(), intercomTheme.getColors(c0Var3, i20).m714getPrimaryText0d7_KjU(), 0L, null, null, c0Var3, 0, 0, 7325);
                    }
                }, c0VarR, 54), null, null, null, 0, 0L, 0L, null, androidx.compose.runtime.internal.w.e(1401868325, true, new AnonymousClass4(ticketDetailState, function5, z11, z13), c0VarR, 54), c0Var2, 805306416, androidx.constraintlayout.core.motion.utils.v.g.f44096p);
            } else {
                if (i18 != 0) {
                    function4 = new Function0() { // from class: io.intercom.android.sdk.m5.navigation.j2
                        @Override // kotlin.jvm.functions.Function0
                        public final Object invoke() {
                            return Unit.f312394a;
                        }
                    };
                } else {
                    function4 = function1;
                }
                if (i13 != 0) {
                    function5 = new Function2() { // from class: io.intercom.android.sdk.m5.navigation.k2
                        @Override // kotlin.jvm.functions.Function2
                        public final Object invoke(Object obj, Object obj2) {
                            return TicketDetailDestinationKt.TicketDetailScreen$lambda$18((String) obj, ((Boolean) obj2).booleanValue());
                        }
                    };
                } else {
                    function5 = function3;
                }
                if (i15 != 0) {
                    z13 = false;
                } else {
                    z13 = z12;
                }
                c0Var2 = c0VarR;
                pt.f(c4.a(t7.h(androidx.compose.foundation.v.d(androidx.compose.ui.a0.E, IntercomTheme.INSTANCE.getColors(c0VarR, IntercomTheme.$stable).m690getBackground0d7_KjU(), null, 2, null), b8.o(v6.f16495a, c0VarR, 8)), "ticket_detail_screen"), androidx.compose.runtime.internal.w.e(-2018170598, true, new Function2<androidx.compose.runtime.c0, Integer, Unit>() { // from class: io.intercom.android.sdk.m5.navigation.TicketDetailDestinationKt.TicketDetailScreen.3
                    @Override // kotlin.jvm.functions.Function2
                    public /* bridge */ /* synthetic */ Unit invoke(androidx.compose.runtime.c0 c0Var3, Integer num) {
                        invoke(c0Var3, num.intValue());
                        return Unit.f312394a;
                    }

                    @androidx.compose.runtime.o
                    @androidx.compose.runtime.t(applier = "androidx.compose.ui.UiComposable")
                    public final void invoke(androidx.compose.runtime.c0 c0Var3, int i19) {
                        String ticketName;
                        if ((i19 & 11) == 2 && c0Var3.d()) {
                            c0Var3.u();
                            return;
                        }
                        TicketDetailState ticketDetailState2 = ticketDetailState;
                        TicketDetailState.TicketDetailContentState ticketDetailContentState = ticketDetailState2 instanceof TicketDetailState.TicketDetailContentState ? (TicketDetailState.TicketDetailContentState) ticketDetailState2 : null;
                        if (ticketDetailContentState == null || (ticketName = ticketDetailContentState.getTicketName()) == null) {
                            ticketName = "";
                        }
                        Function0<Unit> function6 = function4;
                        Integer numValueOf = Integer.valueOf(R.drawable.intercom_ic_close);
                        IntercomTheme intercomTheme = IntercomTheme.INSTANCE;
                        int i20 = IntercomTheme.$stable;
                        TopActionBarKt.m172TopActionBarNpQZenA(null, ticketName, null, null, null, function6, numValueOf, false, intercomTheme.getColors(c0Var3, i20).m690getBackground0d7_KjU(), intercomTheme.getColors(c0Var3, i20).m714getPrimaryText0d7_KjU(), 0L, null, null, c0Var3, 0, 0, 7325);
                    }
                }, c0VarR, 54), null, null, null, 0, 0L, 0L, null, androidx.compose.runtime.internal.w.e(1401868325, true, new AnonymousClass4(ticketDetailState, function5, z11, z13), c0VarR, 54), c0Var2, 805306416, androidx.constraintlayout.core.motion.utils.v.g.f44096p);
            }
            s5VarT = c0Var2.T();
            if (s5VarT != null) {
                s5VarT.a(new Function2() { // from class: io.intercom.android.sdk.m5.navigation.l2
                    @Override // kotlin.jvm.functions.Function2
                    public final Object invoke(Object obj, Object obj2) {
                        return TicketDetailDestinationKt.TicketDetailScreen$lambda$19(ticketDetailState, function4, function5, z13, z11, i10, i11, (androidx.compose.runtime.c0) obj, ((Integer) obj2).intValue());
                    }
                });
            }
        }
        i12 |= a5.S0;
        function3 = function2;
        i15 = i11 & 8;
        if (i15 != 0) {
            if ((i10 & 7168) == 0) {
                z12 = z10;
                if (c0VarR.G(z12)) {
                    i16 = 2048;
                } else {
                    i16 = 1024;
                }
                i12 |= i16;
            }
            if ((i11 & 16) != 0) {
                i12 |= 24576;
            } else if ((57344 & i10) == 0) {
                if (c0VarR.G(z11)) {
                    i17 = 16384;
                } else {
                    i17 = 8192;
                }
                i12 |= i17;
            }
            if ((i12 & 46811) == 9362) {
                if (i18 != 0) {
                    function4 = new Function0() { // from class: io.intercom.android.sdk.m5.navigation.j2
                        @Override // kotlin.jvm.functions.Function0
                        public final Object invoke() {
                            return Unit.f312394a;
                        }
                    };
                } else {
                    function4 = function1;
                }
                if (i13 != 0) {
                    function5 = new Function2() { // from class: io.intercom.android.sdk.m5.navigation.k2
                        @Override // kotlin.jvm.functions.Function2
                        public final Object invoke(Object obj, Object obj2) {
                            return TicketDetailDestinationKt.TicketDetailScreen$lambda$18((String) obj, ((Boolean) obj2).booleanValue());
                        }
                    };
                } else {
                    function5 = function3;
                }
                if (i15 != 0) {
                    z13 = false;
                } else {
                    z13 = z12;
                }
                c0Var2 = c0VarR;
                pt.f(c4.a(t7.h(androidx.compose.foundation.v.d(androidx.compose.ui.a0.E, IntercomTheme.INSTANCE.getColors(c0VarR, IntercomTheme.$stable).m690getBackground0d7_KjU(), null, 2, null), b8.o(v6.f16495a, c0VarR, 8)), "ticket_detail_screen"), androidx.compose.runtime.internal.w.e(-2018170598, true, new Function2<androidx.compose.runtime.c0, Integer, Unit>() { // from class: io.intercom.android.sdk.m5.navigation.TicketDetailDestinationKt.TicketDetailScreen.3
                    @Override // kotlin.jvm.functions.Function2
                    public /* bridge */ /* synthetic */ Unit invoke(androidx.compose.runtime.c0 c0Var3, Integer num) {
                        invoke(c0Var3, num.intValue());
                        return Unit.f312394a;
                    }

                    @androidx.compose.runtime.o
                    @androidx.compose.runtime.t(applier = "androidx.compose.ui.UiComposable")
                    public final void invoke(androidx.compose.runtime.c0 c0Var3, int i19) {
                        String ticketName;
                        if ((i19 & 11) == 2 && c0Var3.d()) {
                            c0Var3.u();
                            return;
                        }
                        TicketDetailState ticketDetailState2 = ticketDetailState;
                        TicketDetailState.TicketDetailContentState ticketDetailContentState = ticketDetailState2 instanceof TicketDetailState.TicketDetailContentState ? (TicketDetailState.TicketDetailContentState) ticketDetailState2 : null;
                        if (ticketDetailContentState == null || (ticketName = ticketDetailContentState.getTicketName()) == null) {
                            ticketName = "";
                        }
                        Function0<Unit> function6 = function4;
                        Integer numValueOf = Integer.valueOf(R.drawable.intercom_ic_close);
                        IntercomTheme intercomTheme = IntercomTheme.INSTANCE;
                        int i20 = IntercomTheme.$stable;
                        TopActionBarKt.m172TopActionBarNpQZenA(null, ticketName, null, null, null, function6, numValueOf, false, intercomTheme.getColors(c0Var3, i20).m690getBackground0d7_KjU(), intercomTheme.getColors(c0Var3, i20).m714getPrimaryText0d7_KjU(), 0L, null, null, c0Var3, 0, 0, 7325);
                    }
                }, c0VarR, 54), null, null, null, 0, 0L, 0L, null, androidx.compose.runtime.internal.w.e(1401868325, true, new AnonymousClass4(ticketDetailState, function5, z11, z13), c0VarR, 54), c0Var2, 805306416, androidx.constraintlayout.core.motion.utils.v.g.f44096p);
            } else {
                if (i18 != 0) {
                    function4 = new Function0() { // from class: io.intercom.android.sdk.m5.navigation.j2
                        @Override // kotlin.jvm.functions.Function0
                        public final Object invoke() {
                            return Unit.f312394a;
                        }
                    };
                } else {
                    function4 = function1;
                }
                if (i13 != 0) {
                    function5 = new Function2() { // from class: io.intercom.android.sdk.m5.navigation.k2
                        @Override // kotlin.jvm.functions.Function2
                        public final Object invoke(Object obj, Object obj2) {
                            return TicketDetailDestinationKt.TicketDetailScreen$lambda$18((String) obj, ((Boolean) obj2).booleanValue());
                        }
                    };
                } else {
                    function5 = function3;
                }
                if (i15 != 0) {
                    z13 = false;
                } else {
                    z13 = z12;
                }
                c0Var2 = c0VarR;
                pt.f(c4.a(t7.h(androidx.compose.foundation.v.d(androidx.compose.ui.a0.E, IntercomTheme.INSTANCE.getColors(c0VarR, IntercomTheme.$stable).m690getBackground0d7_KjU(), null, 2, null), b8.o(v6.f16495a, c0VarR, 8)), "ticket_detail_screen"), androidx.compose.runtime.internal.w.e(-2018170598, true, new Function2<androidx.compose.runtime.c0, Integer, Unit>() { // from class: io.intercom.android.sdk.m5.navigation.TicketDetailDestinationKt.TicketDetailScreen.3
                    @Override // kotlin.jvm.functions.Function2
                    public /* bridge */ /* synthetic */ Unit invoke(androidx.compose.runtime.c0 c0Var3, Integer num) {
                        invoke(c0Var3, num.intValue());
                        return Unit.f312394a;
                    }

                    @androidx.compose.runtime.o
                    @androidx.compose.runtime.t(applier = "androidx.compose.ui.UiComposable")
                    public final void invoke(androidx.compose.runtime.c0 c0Var3, int i19) {
                        String ticketName;
                        if ((i19 & 11) == 2 && c0Var3.d()) {
                            c0Var3.u();
                            return;
                        }
                        TicketDetailState ticketDetailState2 = ticketDetailState;
                        TicketDetailState.TicketDetailContentState ticketDetailContentState = ticketDetailState2 instanceof TicketDetailState.TicketDetailContentState ? (TicketDetailState.TicketDetailContentState) ticketDetailState2 : null;
                        if (ticketDetailContentState == null || (ticketName = ticketDetailContentState.getTicketName()) == null) {
                            ticketName = "";
                        }
                        Function0<Unit> function6 = function4;
                        Integer numValueOf = Integer.valueOf(R.drawable.intercom_ic_close);
                        IntercomTheme intercomTheme = IntercomTheme.INSTANCE;
                        int i20 = IntercomTheme.$stable;
                        TopActionBarKt.m172TopActionBarNpQZenA(null, ticketName, null, null, null, function6, numValueOf, false, intercomTheme.getColors(c0Var3, i20).m690getBackground0d7_KjU(), intercomTheme.getColors(c0Var3, i20).m714getPrimaryText0d7_KjU(), 0L, null, null, c0Var3, 0, 0, 7325);
                    }
                }, c0VarR, 54), null, null, null, 0, 0L, 0L, null, androidx.compose.runtime.internal.w.e(1401868325, true, new AnonymousClass4(ticketDetailState, function5, z11, z13), c0VarR, 54), c0Var2, 805306416, androidx.constraintlayout.core.motion.utils.v.g.f44096p);
            }
            s5VarT = c0Var2.T();
            if (s5VarT != null) {
                s5VarT.a(new Function2() { // from class: io.intercom.android.sdk.m5.navigation.l2
                    @Override // kotlin.jvm.functions.Function2
                    public final Object invoke(Object obj, Object obj2) {
                        return TicketDetailDestinationKt.TicketDetailScreen$lambda$19(ticketDetailState, function4, function5, z13, z11, i10, i11, (androidx.compose.runtime.c0) obj, ((Integer) obj2).intValue());
                    }
                });
            }
        }
        i12 |= 3072;
        z12 = z10;
        if ((i11 & 16) != 0) {
            i12 |= 24576;
        } else if ((57344 & i10) == 0) {
            if (c0VarR.G(z11)) {
                i17 = 16384;
            } else {
                i17 = 8192;
            }
            i12 |= i17;
        }
        if ((i12 & 46811) == 9362) {
            if (i18 != 0) {
                function4 = new Function0() { // from class: io.intercom.android.sdk.m5.navigation.j2
                    @Override // kotlin.jvm.functions.Function0
                    public final Object invoke() {
                        return Unit.f312394a;
                    }
                };
            } else {
                function4 = function1;
            }
            if (i13 != 0) {
                function5 = new Function2() { // from class: io.intercom.android.sdk.m5.navigation.k2
                    @Override // kotlin.jvm.functions.Function2
                    public final Object invoke(Object obj, Object obj2) {
                        return TicketDetailDestinationKt.TicketDetailScreen$lambda$18((String) obj, ((Boolean) obj2).booleanValue());
                    }
                };
            } else {
                function5 = function3;
            }
            if (i15 != 0) {
                z13 = false;
            } else {
                z13 = z12;
            }
            c0Var2 = c0VarR;
            pt.f(c4.a(t7.h(androidx.compose.foundation.v.d(androidx.compose.ui.a0.E, IntercomTheme.INSTANCE.getColors(c0VarR, IntercomTheme.$stable).m690getBackground0d7_KjU(), null, 2, null), b8.o(v6.f16495a, c0VarR, 8)), "ticket_detail_screen"), androidx.compose.runtime.internal.w.e(-2018170598, true, new Function2<androidx.compose.runtime.c0, Integer, Unit>() { // from class: io.intercom.android.sdk.m5.navigation.TicketDetailDestinationKt.TicketDetailScreen.3
                @Override // kotlin.jvm.functions.Function2
                public /* bridge */ /* synthetic */ Unit invoke(androidx.compose.runtime.c0 c0Var3, Integer num) {
                    invoke(c0Var3, num.intValue());
                    return Unit.f312394a;
                }

                @androidx.compose.runtime.o
                @androidx.compose.runtime.t(applier = "androidx.compose.ui.UiComposable")
                public final void invoke(androidx.compose.runtime.c0 c0Var3, int i19) {
                    String ticketName;
                    if ((i19 & 11) == 2 && c0Var3.d()) {
                        c0Var3.u();
                        return;
                    }
                    TicketDetailState ticketDetailState2 = ticketDetailState;
                    TicketDetailState.TicketDetailContentState ticketDetailContentState = ticketDetailState2 instanceof TicketDetailState.TicketDetailContentState ? (TicketDetailState.TicketDetailContentState) ticketDetailState2 : null;
                    if (ticketDetailContentState == null || (ticketName = ticketDetailContentState.getTicketName()) == null) {
                        ticketName = "";
                    }
                    Function0<Unit> function6 = function4;
                    Integer numValueOf = Integer.valueOf(R.drawable.intercom_ic_close);
                    IntercomTheme intercomTheme = IntercomTheme.INSTANCE;
                    int i20 = IntercomTheme.$stable;
                    TopActionBarKt.m172TopActionBarNpQZenA(null, ticketName, null, null, null, function6, numValueOf, false, intercomTheme.getColors(c0Var3, i20).m690getBackground0d7_KjU(), intercomTheme.getColors(c0Var3, i20).m714getPrimaryText0d7_KjU(), 0L, null, null, c0Var3, 0, 0, 7325);
                }
            }, c0VarR, 54), null, null, null, 0, 0L, 0L, null, androidx.compose.runtime.internal.w.e(1401868325, true, new AnonymousClass4(ticketDetailState, function5, z11, z13), c0VarR, 54), c0Var2, 805306416, androidx.constraintlayout.core.motion.utils.v.g.f44096p);
        } else {
            if (i18 != 0) {
                function4 = new Function0() { // from class: io.intercom.android.sdk.m5.navigation.j2
                    @Override // kotlin.jvm.functions.Function0
                    public final Object invoke() {
                        return Unit.f312394a;
                    }
                };
            } else {
                function4 = function1;
            }
            if (i13 != 0) {
                function5 = new Function2() { // from class: io.intercom.android.sdk.m5.navigation.k2
                    @Override // kotlin.jvm.functions.Function2
                    public final Object invoke(Object obj, Object obj2) {
                        return TicketDetailDestinationKt.TicketDetailScreen$lambda$18((String) obj, ((Boolean) obj2).booleanValue());
                    }
                };
            } else {
                function5 = function3;
            }
            if (i15 != 0) {
                z13 = false;
            } else {
                z13 = z12;
            }
            c0Var2 = c0VarR;
            pt.f(c4.a(t7.h(androidx.compose.foundation.v.d(androidx.compose.ui.a0.E, IntercomTheme.INSTANCE.getColors(c0VarR, IntercomTheme.$stable).m690getBackground0d7_KjU(), null, 2, null), b8.o(v6.f16495a, c0VarR, 8)), "ticket_detail_screen"), androidx.compose.runtime.internal.w.e(-2018170598, true, new Function2<androidx.compose.runtime.c0, Integer, Unit>() { // from class: io.intercom.android.sdk.m5.navigation.TicketDetailDestinationKt.TicketDetailScreen.3
                @Override // kotlin.jvm.functions.Function2
                public /* bridge */ /* synthetic */ Unit invoke(androidx.compose.runtime.c0 c0Var3, Integer num) {
                    invoke(c0Var3, num.intValue());
                    return Unit.f312394a;
                }

                @androidx.compose.runtime.o
                @androidx.compose.runtime.t(applier = "androidx.compose.ui.UiComposable")
                public final void invoke(androidx.compose.runtime.c0 c0Var3, int i19) {
                    String ticketName;
                    if ((i19 & 11) == 2 && c0Var3.d()) {
                        c0Var3.u();
                        return;
                    }
                    TicketDetailState ticketDetailState2 = ticketDetailState;
                    TicketDetailState.TicketDetailContentState ticketDetailContentState = ticketDetailState2 instanceof TicketDetailState.TicketDetailContentState ? (TicketDetailState.TicketDetailContentState) ticketDetailState2 : null;
                    if (ticketDetailContentState == null || (ticketName = ticketDetailContentState.getTicketName()) == null) {
                        ticketName = "";
                    }
                    Function0<Unit> function6 = function4;
                    Integer numValueOf = Integer.valueOf(R.drawable.intercom_ic_close);
                    IntercomTheme intercomTheme = IntercomTheme.INSTANCE;
                    int i20 = IntercomTheme.$stable;
                    TopActionBarKt.m172TopActionBarNpQZenA(null, ticketName, null, null, null, function6, numValueOf, false, intercomTheme.getColors(c0Var3, i20).m690getBackground0d7_KjU(), intercomTheme.getColors(c0Var3, i20).m714getPrimaryText0d7_KjU(), 0L, null, null, c0Var3, 0, 0, 7325);
                }
            }, c0VarR, 54), null, null, null, 0, 0L, 0L, null, androidx.compose.runtime.internal.w.e(1401868325, true, new AnonymousClass4(ticketDetailState, function5, z11, z13), c0VarR, 54), c0Var2, 805306416, androidx.constraintlayout.core.motion.utils.v.g.f44096p);
        }
        s5VarT = c0Var2.T();
        if (s5VarT != null) {
            s5VarT.a(new Function2() { // from class: io.intercom.android.sdk.m5.navigation.l2
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    return TicketDetailDestinationKt.TicketDetailScreen$lambda$19(ticketDetailState, function4, function5, z13, z11, i10, i11, (androidx.compose.runtime.c0) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit TicketDetailScreen$lambda$18(String str, boolean z10) {
        return Unit.f312394a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit TicketDetailScreen$lambda$19(TicketDetailState ticketDetailState, Function0 function0, Function2 function2, boolean z10, boolean z11, int i10, int i11, androidx.compose.runtime.c0 c0Var, int i12) {
        Intrinsics.checkNotNullParameter(ticketDetailState, "$ticketDetailState");
        TicketDetailScreen(ticketDetailState, function0, function2, z10, z11, c0Var, t4.a(i10 | 1), i11);
        return Unit.f312394a;
    }

    public static final void ticketDetailDestination(@NotNull androidx.navigation.g2 g2Var, @NotNull final androidx.navigation.r2 navController, @NotNull final androidx.activity.l rootActivity) {
        Intrinsics.checkNotNullParameter(g2Var, "<this>");
        Intrinsics.checkNotNullParameter(navController, "navController");
        Intrinsics.checkNotNullParameter(rootActivity, "rootActivity");
        androidx.navigation.compose.t.f(g2Var, "TICKET_DETAIL?show_submission_card={show_submission_card}&transitionArgs={transitionArgs}&isLaunchedProgrammatically={isLaunchedProgrammatically}", CollectionsKt.listOf((Object[]) new androidx.navigation.b0[]{androidx.navigation.c0.a(SHOW_SUBMISSION_CARD, new Function1() { // from class: io.intercom.android.sdk.m5.navigation.m2
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return TicketDetailDestinationKt.ticketDetailDestination$lambda$2((androidx.navigation.k0) obj);
            }
        }), androidx.navigation.c0.a("transitionArgs", new Function1() { // from class: io.intercom.android.sdk.m5.navigation.z1
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return TicketDetailDestinationKt.ticketDetailDestination$lambda$3((androidx.navigation.k0) obj);
            }
        }), androidx.navigation.c0.a("isLaunchedProgrammatically", new Function1() { // from class: io.intercom.android.sdk.m5.navigation.a2
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return TicketDetailDestinationKt.ticketDetailDestination$lambda$4((androidx.navigation.k0) obj);
            }
        })}), null, new Function1() { // from class: io.intercom.android.sdk.m5.navigation.b2
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return TicketDetailDestinationKt.ticketDetailDestination$lambda$5((androidx.compose.animation.i) obj);
            }
        }, new Function1() { // from class: io.intercom.android.sdk.m5.navigation.c2
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return TicketDetailDestinationKt.ticketDetailDestination$lambda$6((androidx.compose.animation.i) obj);
            }
        }, new Function1() { // from class: io.intercom.android.sdk.m5.navigation.d2
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return TicketDetailDestinationKt.ticketDetailDestination$lambda$7((androidx.compose.animation.i) obj);
            }
        }, new Function1() { // from class: io.intercom.android.sdk.m5.navigation.e2
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return TicketDetailDestinationKt.ticketDetailDestination$lambda$8((androidx.compose.animation.i) obj);
            }
        }, null, androidx.compose.runtime.internal.w.c(-1948427665, true, new pj.o<androidx.compose.animation.g, androidx.navigation.n0, androidx.compose.runtime.c0, Integer, Unit>() { // from class: io.intercom.android.sdk.m5.navigation.TicketDetailDestinationKt.ticketDetailDestination.8

            /* JADX INFO: renamed from: io.intercom.android.sdk.m5.navigation.TicketDetailDestinationKt$ticketDetailDestination$8$1, reason: invalid class name */
            /* synthetic */ class AnonymousClass1 extends kotlin.jvm.internal.g0 implements Function0<Unit> {
                final /* synthetic */ androidx.navigation.r2 $navController;
                final /* synthetic */ androidx.activity.l $rootActivity;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                AnonymousClass1(androidx.navigation.r2 r2Var, androidx.activity.l lVar) {
                    super(0, Intrinsics.a.class, "onBackClicked", "ticketDetailDestination$onBackClicked(Landroidx/navigation/NavHostController;Landroidx/activity/ComponentActivity;)V", 0);
                    this.$navController = r2Var;
                    this.$rootActivity = lVar;
                }

                @Override // kotlin.jvm.functions.Function0
                public /* bridge */ /* synthetic */ Unit invoke() {
                    invoke2();
                    return Unit.f312394a;
                }

                /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
                public final void invoke2() {
                    TicketDetailDestinationKt.ticketDetailDestination$onBackClicked(this.$navController, this.$rootActivity);
                }
            }

            /* JADX INFO: renamed from: io.intercom.android.sdk.m5.navigation.TicketDetailDestinationKt$ticketDetailDestination$8$2, reason: invalid class name */
            /* synthetic */ class AnonymousClass2 extends kotlin.jvm.internal.g0 implements Function2<String, Boolean, Unit> {
                final /* synthetic */ androidx.navigation.r2 $navController;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                AnonymousClass2(androidx.navigation.r2 r2Var) {
                    super(2, Intrinsics.a.class, "onConversationCTAClicked", "ticketDetailDestination$onConversationCTAClicked(Landroidx/navigation/NavHostController;Ljava/lang/String;Z)V", 0);
                    this.$navController = r2Var;
                }

                @Override // kotlin.jvm.functions.Function2
                public /* bridge */ /* synthetic */ Unit invoke(String str, Boolean bool) {
                    invoke(str, bool.booleanValue());
                    return Unit.f312394a;
                }

                public final void invoke(String str, boolean z10) {
                    TicketDetailDestinationKt.ticketDetailDestination$onConversationCTAClicked(this.$navController, str, z10);
                }
            }

            @Override // pj.o
            public /* bridge */ /* synthetic */ Unit invoke(androidx.compose.animation.g gVar, androidx.navigation.n0 n0Var, androidx.compose.runtime.c0 c0Var, Integer num) {
                invoke(gVar, n0Var, c0Var, num.intValue());
                return Unit.f312394a;
            }

            @androidx.compose.runtime.o
            @androidx.compose.runtime.t(applier = "androidx.compose.ui.UiComposable")
            public final void invoke(androidx.compose.animation.g composable, androidx.navigation.n0 it, androidx.compose.runtime.c0 c0Var, int i10) {
                Intrinsics.checkNotNullParameter(composable, "$this$composable");
                Intrinsics.checkNotNullParameter(it, "it");
                Bundle bundleB = it.b();
                boolean z10 = bundleB != null ? bundleB.getBoolean(TicketDetailDestinationKt.SHOW_SUBMISSION_CARD) : false;
                Bundle bundleB2 = it.b();
                boolean z11 = bundleB2 != null ? bundleB2.getBoolean("isLaunchedProgrammatically") : false;
                TicketDetailViewModel.Companion companion = TicketDetailViewModel.Companion;
                androidx.lifecycle.m2 m2VarC = androidx.lifecycle.viewmodel.compose.b.f52543a.c(c0Var, androidx.lifecycle.viewmodel.compose.b.f52545c);
                if (m2VarC == null) {
                    m2VarC = rootActivity;
                }
                TicketDetailDestinationKt.TicketDetailScreen((TicketDetailState) w6.b(companion.create(m2VarC, new TicketLaunchedFrom.Conversation(null, 1, null)).getStateFlow(), null, c0Var, 8, 1).getValue(), new AnonymousClass1(navController, rootActivity), new AnonymousClass2(navController), z10, z11, c0Var, 0, 0);
            }
        }), 132, null);
        androidx.navigation.compose.t.f(g2Var, "TICKET_DETAIL/{ticket_id}?from={from}&transitionArgs={transitionArgs}&isLaunchedProgrammatically={isLaunchedProgrammatically}", CollectionsKt.listOf((Object[]) new androidx.navigation.b0[]{androidx.navigation.c0.a(TICKET_ID, new Function1() { // from class: io.intercom.android.sdk.m5.navigation.f2
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return TicketDetailDestinationKt.ticketDetailDestination$lambda$9((androidx.navigation.k0) obj);
            }
        }), androidx.navigation.c0.a("from", new Function1() { // from class: io.intercom.android.sdk.m5.navigation.g2
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return TicketDetailDestinationKt.ticketDetailDestination$lambda$10((androidx.navigation.k0) obj);
            }
        }), androidx.navigation.c0.a("transitionArgs", new Function1() { // from class: io.intercom.android.sdk.m5.navigation.h2
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return TicketDetailDestinationKt.ticketDetailDestination$lambda$11((androidx.navigation.k0) obj);
            }
        }), androidx.navigation.c0.a("isLaunchedProgrammatically", new Function1() { // from class: io.intercom.android.sdk.m5.navigation.n2
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return TicketDetailDestinationKt.ticketDetailDestination$lambda$12((androidx.navigation.k0) obj);
            }
        })}), null, new Function1() { // from class: io.intercom.android.sdk.m5.navigation.o2
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return TicketDetailDestinationKt.ticketDetailDestination$lambda$13((androidx.compose.animation.i) obj);
            }
        }, new Function1() { // from class: io.intercom.android.sdk.m5.navigation.p2
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return TicketDetailDestinationKt.ticketDetailDestination$lambda$14((androidx.compose.animation.i) obj);
            }
        }, new Function1() { // from class: io.intercom.android.sdk.m5.navigation.q2
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return TicketDetailDestinationKt.ticketDetailDestination$lambda$15((androidx.compose.animation.i) obj);
            }
        }, new Function1() { // from class: io.intercom.android.sdk.m5.navigation.y1
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return TicketDetailDestinationKt.ticketDetailDestination$lambda$16((androidx.compose.animation.i) obj);
            }
        }, null, androidx.compose.runtime.internal.w.c(1365826072, true, new pj.o<androidx.compose.animation.g, androidx.navigation.n0, androidx.compose.runtime.c0, Integer, Unit>() { // from class: io.intercom.android.sdk.m5.navigation.TicketDetailDestinationKt.ticketDetailDestination.17

            /* JADX INFO: renamed from: io.intercom.android.sdk.m5.navigation.TicketDetailDestinationKt$ticketDetailDestination$17$1, reason: invalid class name */
            /* synthetic */ class AnonymousClass1 extends kotlin.jvm.internal.g0 implements Function0<Unit> {
                final /* synthetic */ androidx.navigation.r2 $navController;
                final /* synthetic */ androidx.activity.l $rootActivity;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                AnonymousClass1(androidx.navigation.r2 r2Var, androidx.activity.l lVar) {
                    super(0, Intrinsics.a.class, "onBackClicked", "ticketDetailDestination$onBackClicked(Landroidx/navigation/NavHostController;Landroidx/activity/ComponentActivity;)V", 0);
                    this.$navController = r2Var;
                    this.$rootActivity = lVar;
                }

                @Override // kotlin.jvm.functions.Function0
                public /* bridge */ /* synthetic */ Unit invoke() {
                    invoke2();
                    return Unit.f312394a;
                }

                /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
                public final void invoke2() {
                    TicketDetailDestinationKt.ticketDetailDestination$onBackClicked(this.$navController, this.$rootActivity);
                }
            }

            /* JADX INFO: renamed from: io.intercom.android.sdk.m5.navigation.TicketDetailDestinationKt$ticketDetailDestination$17$2, reason: invalid class name */
            /* synthetic */ class AnonymousClass2 extends kotlin.jvm.internal.g0 implements Function2<String, Boolean, Unit> {
                final /* synthetic */ androidx.navigation.r2 $navController;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                AnonymousClass2(androidx.navigation.r2 r2Var) {
                    super(2, Intrinsics.a.class, "onConversationCTAClicked", "ticketDetailDestination$onConversationCTAClicked(Landroidx/navigation/NavHostController;Ljava/lang/String;Z)V", 0);
                    this.$navController = r2Var;
                }

                @Override // kotlin.jvm.functions.Function2
                public /* bridge */ /* synthetic */ Unit invoke(String str, Boolean bool) {
                    invoke(str, bool.booleanValue());
                    return Unit.f312394a;
                }

                public final void invoke(String str, boolean z10) {
                    TicketDetailDestinationKt.ticketDetailDestination$onConversationCTAClicked(this.$navController, str, z10);
                }
            }

            @Override // pj.o
            public /* bridge */ /* synthetic */ Unit invoke(androidx.compose.animation.g gVar, androidx.navigation.n0 n0Var, androidx.compose.runtime.c0 c0Var, Integer num) {
                invoke(gVar, n0Var, c0Var, num.intValue());
                return Unit.f312394a;
            }

            @androidx.compose.runtime.o
            @androidx.compose.runtime.t(applier = "androidx.compose.ui.UiComposable")
            public final void invoke(androidx.compose.animation.g composable, androidx.navigation.n0 it, androidx.compose.runtime.c0 c0Var, int i10) {
                String ticketId;
                String from;
                Intrinsics.checkNotNullParameter(composable, "$this$composable");
                Intrinsics.checkNotNullParameter(it, "it");
                Bundle bundleB = it.b();
                if (bundleB == null || (ticketId = bundleB.getString(TicketDetailDestinationKt.TICKET_ID)) == null) {
                    ticketId = "";
                }
                Bundle bundleB2 = it.b();
                boolean z10 = bundleB2 != null ? bundleB2.getBoolean("isLaunchedProgrammatically") : false;
                Bundle bundleB3 = it.b();
                if (bundleB3 == null || (from = bundleB3.getString("from")) == null) {
                    from = MetricTracker.Context.FROM_TICKETS_SPACE;
                }
                if (navController.Q() == null) {
                    Intent intent = rootActivity.getIntent();
                    Intrinsics.checkNotNullExpressionValue(intent, "getIntent(...)");
                    IntercomRootActivityArgs argsForIntent = IntercomRootActivityArgsKt.getArgsForIntent(intent);
                    if (argsForIntent instanceof IntercomRootActivityArgs.TicketDetailsScreenArgs) {
                        IntercomRootActivityArgs.TicketDetailsScreenArgs ticketDetailsScreenArgs = (IntercomRootActivityArgs.TicketDetailsScreenArgs) argsForIntent;
                        ticketId = ticketDetailsScreenArgs.getTicketId();
                        from = ticketDetailsScreenArgs.getFrom();
                    }
                }
                TicketDetailViewModel.Companion companion = TicketDetailViewModel.Companion;
                androidx.lifecycle.m2 m2VarC = androidx.lifecycle.viewmodel.compose.b.f52543a.c(c0Var, androidx.lifecycle.viewmodel.compose.b.f52545c);
                if (m2VarC == null) {
                    m2VarC = rootActivity;
                }
                TicketDetailDestinationKt.TicketDetailScreen((TicketDetailState) w6.b(companion.create(m2VarC, Intrinsics.areEqual(from, "conversation") ? new TicketLaunchedFrom.Conversation(null, 1, null) : new TicketLaunchedFrom.Other(ticketId, from)).getStateFlow(), null, c0Var, 8, 1).getValue(), new AnonymousClass1(navController, rootActivity), new AnonymousClass2(navController), false, z10, c0Var, 3072, 0);
            }
        }), 132, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit ticketDetailDestination$lambda$10(androidx.navigation.k0 navArgument) {
        Intrinsics.checkNotNullParameter(navArgument, "$this$navArgument");
        navArgument.h(d3.StringType);
        int i10 = 1 >> 1;
        navArgument.g(true);
        navArgument.f(MetricTracker.Context.FROM_TICKETS_SPACE);
        return Unit.f312394a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit ticketDetailDestination$lambda$11(androidx.navigation.k0 navArgument) {
        Intrinsics.checkNotNullParameter(navArgument, "$this$navArgument");
        navArgument.h(TransitionStyleKt.getTransitionArgNavType());
        navArgument.f(new TransitionArgs(null, null, null, null, 15, null));
        return Unit.f312394a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit ticketDetailDestination$lambda$12(androidx.navigation.k0 navArgument) {
        Intrinsics.checkNotNullParameter(navArgument, "$this$navArgument");
        navArgument.h(d3.BoolType);
        navArgument.f(Boolean.FALSE);
        return Unit.f312394a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Multi-variable type inference failed */
    public static final androidx.compose.animation.d0 ticketDetailDestination$lambda$13(androidx.compose.animation.i composable) {
        Intrinsics.checkNotNullParameter(composable, "$this$composable");
        int i10 = 2 << 0;
        return ((TransitionArgs) NavBackStackEntryExtensionKt.getParcelableObject((androidx.navigation.n0) composable.j(), "transitionArgs", TransitionArgs.class, new TransitionArgs(null, null, null, null, 15, null))).getEnter().transition();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Multi-variable type inference failed */
    public static final androidx.compose.animation.f0 ticketDetailDestination$lambda$14(androidx.compose.animation.i composable) {
        Intrinsics.checkNotNullParameter(composable, "$this$composable");
        return ((TransitionArgs) NavBackStackEntryExtensionKt.getParcelableObject((androidx.navigation.n0) composable.l(), "transitionArgs", TransitionArgs.class, new TransitionArgs(null, null, null, null, 15, null))).getExit().transition();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Multi-variable type inference failed */
    public static final androidx.compose.animation.d0 ticketDetailDestination$lambda$15(androidx.compose.animation.i composable) {
        Intrinsics.checkNotNullParameter(composable, "$this$composable");
        return ((TransitionArgs) NavBackStackEntryExtensionKt.getParcelableObject((androidx.navigation.n0) composable.j(), "transitionArgs", TransitionArgs.class, new TransitionArgs(null, null, null, null, 15, null))).getPopEnter().transition();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Multi-variable type inference failed */
    public static final androidx.compose.animation.f0 ticketDetailDestination$lambda$16(androidx.compose.animation.i composable) {
        Intrinsics.checkNotNullParameter(composable, "$this$composable");
        return ((TransitionArgs) NavBackStackEntryExtensionKt.getParcelableObject((androidx.navigation.n0) composable.l(), "transitionArgs", TransitionArgs.class, new TransitionArgs(null, null, null, null, 15, null))).getPopExit().transition();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit ticketDetailDestination$lambda$2(androidx.navigation.k0 navArgument) {
        Intrinsics.checkNotNullParameter(navArgument, "$this$navArgument");
        navArgument.h(d3.BoolType);
        return Unit.f312394a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit ticketDetailDestination$lambda$3(androidx.navigation.k0 navArgument) {
        Intrinsics.checkNotNullParameter(navArgument, "$this$navArgument");
        navArgument.h(TransitionStyleKt.getTransitionArgNavType());
        navArgument.f(new TransitionArgs(null, null, null, null, 15, null));
        return Unit.f312394a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit ticketDetailDestination$lambda$4(androidx.navigation.k0 navArgument) {
        Intrinsics.checkNotNullParameter(navArgument, "$this$navArgument");
        navArgument.h(d3.BoolType);
        navArgument.f(Boolean.FALSE);
        return Unit.f312394a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Multi-variable type inference failed */
    public static final androidx.compose.animation.d0 ticketDetailDestination$lambda$5(androidx.compose.animation.i composable) {
        Intrinsics.checkNotNullParameter(composable, "$this$composable");
        return ((TransitionArgs) NavBackStackEntryExtensionKt.getParcelableObject((androidx.navigation.n0) composable.j(), "transitionArgs", TransitionArgs.class, new TransitionArgs(null, null, null, null, 15, null))).getEnter().transition();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Multi-variable type inference failed */
    public static final androidx.compose.animation.f0 ticketDetailDestination$lambda$6(androidx.compose.animation.i composable) {
        Intrinsics.checkNotNullParameter(composable, "$this$composable");
        int i10 = (1 << 0) | 0;
        return ((TransitionArgs) NavBackStackEntryExtensionKt.getParcelableObject((androidx.navigation.n0) composable.l(), "transitionArgs", TransitionArgs.class, new TransitionArgs(null, null, null, null, 15, null))).getExit().transition();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Multi-variable type inference failed */
    public static final androidx.compose.animation.d0 ticketDetailDestination$lambda$7(androidx.compose.animation.i composable) {
        Intrinsics.checkNotNullParameter(composable, "$this$composable");
        return ((TransitionArgs) NavBackStackEntryExtensionKt.getParcelableObject((androidx.navigation.n0) composable.j(), "transitionArgs", TransitionArgs.class, new TransitionArgs(null, null, null, null, 15, null))).getPopEnter().transition();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Multi-variable type inference failed */
    public static final androidx.compose.animation.f0 ticketDetailDestination$lambda$8(androidx.compose.animation.i composable) {
        Intrinsics.checkNotNullParameter(composable, "$this$composable");
        return ((TransitionArgs) NavBackStackEntryExtensionKt.getParcelableObject((androidx.navigation.n0) composable.l(), "transitionArgs", TransitionArgs.class, new TransitionArgs(null, null, null, null, 15, null))).getPopExit().transition();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit ticketDetailDestination$lambda$9(androidx.navigation.k0 navArgument) {
        Intrinsics.checkNotNullParameter(navArgument, "$this$navArgument");
        navArgument.h(d3.StringType);
        return Unit.f312394a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void ticketDetailDestination$onBackClicked(androidx.navigation.r2 r2Var, androidx.activity.l lVar) {
        if (r2Var.Q() == null) {
            lVar.getOnBackPressedDispatcher().p();
        } else {
            r2Var.z0();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void ticketDetailDestination$onConversationCTAClicked(androidx.navigation.r2 r2Var, String str, boolean z10) {
        IntercomRouterKt.openConversation$default(r2Var, str, null, z10, null, androidx.navigation.b3.a(new Function1() { // from class: io.intercom.android.sdk.m5.navigation.x1
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return TicketDetailDestinationKt.ticketDetailDestination$onConversationCTAClicked$lambda$1((androidx.navigation.a3) obj);
            }
        }), null, 42, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit ticketDetailDestination$onConversationCTAClicked$lambda$1(androidx.navigation.a3 navOptions) {
        Intrinsics.checkNotNullParameter(navOptions, "$this$navOptions");
        navOptions.p("CONVERSATION", new Function1() { // from class: io.intercom.android.sdk.m5.navigation.i2
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return TicketDetailDestinationKt.ticketDetailDestination$onConversationCTAClicked$lambda$1$lambda$0((x3) obj);
            }
        });
        return Unit.f312394a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit ticketDetailDestination$onConversationCTAClicked$lambda$1$lambda$0(x3 popUpTo) {
        Intrinsics.checkNotNullParameter(popUpTo, "$this$popUpTo");
        popUpTo.c(true);
        return Unit.f312394a;
    }
}
