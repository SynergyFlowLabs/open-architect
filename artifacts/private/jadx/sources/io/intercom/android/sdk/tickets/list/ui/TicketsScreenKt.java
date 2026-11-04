package io.intercom.android.sdk.tickets.list.ui;

import androidx.annotation.v;
import androidx.compose.foundation.layout.b8;
import androidx.compose.foundation.layout.d0;
import androidx.compose.foundation.layout.d5;
import androidx.compose.foundation.layout.g5;
import androidx.compose.foundation.layout.i6;
import androidx.compose.foundation.layout.j0;
import androidx.compose.foundation.layout.n0;
import androidx.compose.foundation.layout.t7;
import androidx.compose.foundation.layout.v6;
import androidx.compose.foundation.layout.x;
import androidx.compose.foundation.layout.x5;
import androidx.compose.foundation.lazy.w0;
import androidx.compose.material3.a4;
import androidx.compose.material3.pt;
import androidx.compose.material3.q50;
import androidx.compose.runtime.b1;
import androidx.compose.runtime.c0;
import androidx.compose.runtime.internal.w;
import androidx.compose.runtime.s5;
import androidx.compose.runtime.t;
import androidx.compose.runtime.t4;
import androidx.compose.runtime.y7;
import androidx.compose.ui.a0;
import androidx.compose.ui.layout.a1;
import androidx.compose.ui.platform.c4;
import androidx.media3.exoplayer.a5;
import io.intercom.android.sdk.m5.components.ErrorState;
import io.intercom.android.sdk.m5.components.TopActionBarKt;
import io.intercom.android.sdk.tickets.list.data.TicketsScreenUiState;
import io.intercom.android.sdk.ui.theme.IntercomTheme;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.k0;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes13.dex */
public final class TicketsScreenKt {
    /* JADX WARN: Code duplicated, block: B:36:0x0072  */
    /* JADX WARN: Code duplicated, block: B:37:0x0075  */
    /* JADX WARN: Code duplicated, block: B:39:0x0079  */
    /* JADX WARN: Code duplicated, block: B:41:0x007f  */
    /* JADX WARN: Code duplicated, block: B:42:0x0082  */
    /* JADX WARN: Code duplicated, block: B:50:0x009a A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:51:0x009c  */
    /* JADX WARN: Code duplicated, block: B:52:0x00a2  */
    /* JADX WARN: Code duplicated, block: B:56:0x0103  */
    /* JADX WARN: Code duplicated, block: B:58:? A[RETURN, SYNTHETIC] */
    @androidx.compose.runtime.o
    @t(applier = "androidx.compose.ui.UiComposable")
    public static final void TicketsScreen(@NotNull final TicketsScreenUiState uiState, @NotNull final Function0<Unit> onBackButtonClick, @Nullable Function1<? super String, Unit> function1, @v final int i10, @Nullable c0 c0Var, final int i11, final int i12) {
        int i13;
        Function1<? super String, Unit> function2;
        int i14;
        final Function1<? super String, Unit> function3;
        c0 c0Var2;
        s5 s5VarT;
        Intrinsics.checkNotNullParameter(uiState, "uiState");
        Intrinsics.checkNotNullParameter(onBackButtonClick, "onBackButtonClick");
        c0 c0VarR = c0Var.R(-1552213693);
        if ((i12 & 1) != 0) {
            i13 = i11 | 6;
        } else if ((i11 & 14) == 0) {
            i13 = (c0VarR.D(uiState) ? 4 : 2) | i11;
        } else {
            i13 = i11;
        }
        if ((i12 & 2) != 0) {
            i13 |= 48;
        } else if ((i11 & com.planner5d.library.engine.input.f.b.B) == 0) {
            i13 |= c0VarR.k0(onBackButtonClick) ? 32 : 16;
        }
        int i15 = i12 & 4;
        if (i15 == 0) {
            if ((i11 & 896) == 0) {
                function2 = function1;
                i13 |= c0VarR.k0(function2) ? 256 : 128;
            }
            if ((i12 & 8) != 0) {
                i13 |= 3072;
            } else if ((i11 & 7168) == 0) {
                if (c0VarR.K(i10)) {
                    i14 = 2048;
                } else {
                    i14 = 1024;
                }
                i13 |= i14;
            }
            if ((i13 & 5851) == 1170 || !c0VarR.d()) {
                if (i15 != 0) {
                    function3 = new Function1() { // from class: io.intercom.android.sdk.tickets.list.ui.n
                        @Override // kotlin.jvm.functions.Function1
                        public final Object invoke(Object obj) {
                            return TicketsScreenKt.TicketsScreen$lambda$0((String) obj);
                        }
                    };
                } else {
                    function3 = function2;
                }
                c0Var2 = c0VarR;
                pt.f(c4.a(t7.h(androidx.compose.foundation.v.d(a0.E, IntercomTheme.INSTANCE.getColors(c0VarR, IntercomTheme.$stable).m690getBackground0d7_KjU(), null, 2, null), b8.o(v6.f16495a, c0VarR, 8)), "tickets_screen"), w.e(-1473942521, true, new Function2<c0, Integer, Unit>() { // from class: io.intercom.android.sdk.tickets.list.ui.TicketsScreenKt.TicketsScreen.2
                    @Override // kotlin.jvm.functions.Function2
                    public /* bridge */ /* synthetic */ Unit invoke(c0 c0Var3, Integer num) {
                        invoke(c0Var3, num.intValue());
                        return Unit.f312394a;
                    }

                    @androidx.compose.runtime.o
                    @t(applier = "androidx.compose.ui.UiComposable")
                    public final void invoke(c0 c0Var3, int i16) {
                        if ((i16 & 11) == 2 && c0Var3.d()) {
                            c0Var3.u();
                            return;
                        }
                        String screenLabel = uiState.getScreenLabel();
                        Function0<Unit> function0 = onBackButtonClick;
                        Integer numValueOf = Integer.valueOf(i10);
                        IntercomTheme intercomTheme = IntercomTheme.INSTANCE;
                        int i17 = IntercomTheme.$stable;
                        TopActionBarKt.m172TopActionBarNpQZenA(null, screenLabel, null, null, null, function0, numValueOf, false, intercomTheme.getColors(c0Var3, i17).m704getHeader0d7_KjU(), intercomTheme.getColors(c0Var3, i17).m711getOnHeader0d7_KjU(), 0L, null, null, c0Var3, 0, 0, 7325);
                    }
                }, c0VarR, 54), null, null, null, 0, 0L, 0L, null, w.e(-1690440366, true, new pj.n<g5, c0, Integer, Unit>() { // from class: io.intercom.android.sdk.tickets.list.ui.TicketsScreenKt.TicketsScreen.3
                    @Override // pj.n
                    public /* bridge */ /* synthetic */ Unit invoke(g5 g5Var, c0 c0Var3, Integer num) {
                        invoke(g5Var, c0Var3, num.intValue());
                        return Unit.f312394a;
                    }

                    @androidx.compose.runtime.o
                    @t(applier = "androidx.compose.ui.UiComposable")
                    public final void invoke(g5 paddingValues, c0 c0Var3, int i16) {
                        Intrinsics.checkNotNullParameter(paddingValues, "paddingValues");
                        if ((i16 & 14) == 0) {
                            i16 |= c0Var3.D(paddingValues) ? 4 : 2;
                        }
                        if ((i16 & 91) == 18 && c0Var3.d()) {
                            c0Var3.u();
                            return;
                        }
                        TicketsScreenUiState ticketsScreenUiState = uiState;
                        if (ticketsScreenUiState instanceof TicketsScreenUiState.Content) {
                            c0Var3.E(1161791623);
                            TicketsScreenKt.TicketsScreenContent((TicketsScreenUiState.Content) uiState, paddingValues, function3, c0Var3, androidx.paging.compose.b.f71648f | ((i16 << 3) & com.planner5d.library.engine.input.f.b.B), 0);
                            c0Var3.A();
                            return;
                        }
                        if (ticketsScreenUiState instanceof TicketsScreenUiState.Empty) {
                            c0Var3.E(1161993371);
                            TicketsEmptyScreenKt.TicketsEmptyScreen(((TicketsScreenUiState.Empty) uiState).getEmptyState(), d5.p(a0.E, paddingValues), c0Var3, 0, 0);
                            c0Var3.A();
                        } else if (ticketsScreenUiState instanceof TicketsScreenUiState.Error) {
                            c0Var3.E(1162175744);
                            TicketsErrorScreenKt.TicketsErrorScreen(((TicketsScreenUiState.Error) uiState).getErrorState(), d5.p(a0.E, paddingValues), c0Var3, 0, 0);
                            c0Var3.A();
                        } else {
                            if (!(ticketsScreenUiState instanceof TicketsScreenUiState.Initial) && !(ticketsScreenUiState instanceof TicketsScreenUiState.Loading)) {
                                c0Var3.E(2115686198);
                                c0Var3.A();
                                throw new k0();
                            }
                            c0Var3.E(2115705652);
                            TicketsLoadingScreenKt.TicketsLoadingScreen(d5.p(a0.E, paddingValues), c0Var3, 0, 0);
                            c0Var3.A();
                        }
                    }
                }, c0VarR, 54), c0Var2, 805306416, androidx.constraintlayout.core.motion.utils.v.g.f44096p);
            } else {
                c0VarR.u();
                c0Var2 = c0VarR;
                function3 = function2;
            }
            s5VarT = c0Var2.T();
            if (s5VarT != null) {
                s5VarT.a(new Function2() { // from class: io.intercom.android.sdk.tickets.list.ui.o
                    @Override // kotlin.jvm.functions.Function2
                    public final Object invoke(Object obj, Object obj2) {
                        return TicketsScreenKt.TicketsScreen$lambda$1(uiState, onBackButtonClick, function3, i10, i11, i12, (c0) obj, ((Integer) obj2).intValue());
                    }
                });
            }
        }
        i13 |= a5.S0;
        function2 = function1;
        if ((i12 & 8) != 0) {
            i13 |= 3072;
        } else if ((i11 & 7168) == 0) {
            if (c0VarR.K(i10)) {
                i14 = 2048;
            } else {
                i14 = 1024;
            }
            i13 |= i14;
        }
        if ((i13 & 5851) == 1170) {
            if (i15 != 0) {
                function3 = new Function1() { // from class: io.intercom.android.sdk.tickets.list.ui.n
                    @Override // kotlin.jvm.functions.Function1
                    public final Object invoke(Object obj) {
                        return TicketsScreenKt.TicketsScreen$lambda$0((String) obj);
                    }
                };
            } else {
                function3 = function2;
            }
            c0Var2 = c0VarR;
            pt.f(c4.a(t7.h(androidx.compose.foundation.v.d(a0.E, IntercomTheme.INSTANCE.getColors(c0VarR, IntercomTheme.$stable).m690getBackground0d7_KjU(), null, 2, null), b8.o(v6.f16495a, c0VarR, 8)), "tickets_screen"), w.e(-1473942521, true, new Function2<c0, Integer, Unit>() { // from class: io.intercom.android.sdk.tickets.list.ui.TicketsScreenKt.TicketsScreen.2
                @Override // kotlin.jvm.functions.Function2
                public /* bridge */ /* synthetic */ Unit invoke(c0 c0Var3, Integer num) {
                    invoke(c0Var3, num.intValue());
                    return Unit.f312394a;
                }

                @androidx.compose.runtime.o
                @t(applier = "androidx.compose.ui.UiComposable")
                public final void invoke(c0 c0Var3, int i16) {
                    if ((i16 & 11) == 2 && c0Var3.d()) {
                        c0Var3.u();
                        return;
                    }
                    String screenLabel = uiState.getScreenLabel();
                    Function0<Unit> function0 = onBackButtonClick;
                    Integer numValueOf = Integer.valueOf(i10);
                    IntercomTheme intercomTheme = IntercomTheme.INSTANCE;
                    int i17 = IntercomTheme.$stable;
                    TopActionBarKt.m172TopActionBarNpQZenA(null, screenLabel, null, null, null, function0, numValueOf, false, intercomTheme.getColors(c0Var3, i17).m704getHeader0d7_KjU(), intercomTheme.getColors(c0Var3, i17).m711getOnHeader0d7_KjU(), 0L, null, null, c0Var3, 0, 0, 7325);
                }
            }, c0VarR, 54), null, null, null, 0, 0L, 0L, null, w.e(-1690440366, true, new pj.n<g5, c0, Integer, Unit>() { // from class: io.intercom.android.sdk.tickets.list.ui.TicketsScreenKt.TicketsScreen.3
                @Override // pj.n
                public /* bridge */ /* synthetic */ Unit invoke(g5 g5Var, c0 c0Var3, Integer num) {
                    invoke(g5Var, c0Var3, num.intValue());
                    return Unit.f312394a;
                }

                @androidx.compose.runtime.o
                @t(applier = "androidx.compose.ui.UiComposable")
                public final void invoke(g5 paddingValues, c0 c0Var3, int i16) {
                    Intrinsics.checkNotNullParameter(paddingValues, "paddingValues");
                    if ((i16 & 14) == 0) {
                        i16 |= c0Var3.D(paddingValues) ? 4 : 2;
                    }
                    if ((i16 & 91) == 18 && c0Var3.d()) {
                        c0Var3.u();
                        return;
                    }
                    TicketsScreenUiState ticketsScreenUiState = uiState;
                    if (ticketsScreenUiState instanceof TicketsScreenUiState.Content) {
                        c0Var3.E(1161791623);
                        TicketsScreenKt.TicketsScreenContent((TicketsScreenUiState.Content) uiState, paddingValues, function3, c0Var3, androidx.paging.compose.b.f71648f | ((i16 << 3) & com.planner5d.library.engine.input.f.b.B), 0);
                        c0Var3.A();
                        return;
                    }
                    if (ticketsScreenUiState instanceof TicketsScreenUiState.Empty) {
                        c0Var3.E(1161993371);
                        TicketsEmptyScreenKt.TicketsEmptyScreen(((TicketsScreenUiState.Empty) uiState).getEmptyState(), d5.p(a0.E, paddingValues), c0Var3, 0, 0);
                        c0Var3.A();
                    } else if (ticketsScreenUiState instanceof TicketsScreenUiState.Error) {
                        c0Var3.E(1162175744);
                        TicketsErrorScreenKt.TicketsErrorScreen(((TicketsScreenUiState.Error) uiState).getErrorState(), d5.p(a0.E, paddingValues), c0Var3, 0, 0);
                        c0Var3.A();
                    } else {
                        if (!(ticketsScreenUiState instanceof TicketsScreenUiState.Initial) && !(ticketsScreenUiState instanceof TicketsScreenUiState.Loading)) {
                            c0Var3.E(2115686198);
                            c0Var3.A();
                            throw new k0();
                        }
                        c0Var3.E(2115705652);
                        TicketsLoadingScreenKt.TicketsLoadingScreen(d5.p(a0.E, paddingValues), c0Var3, 0, 0);
                        c0Var3.A();
                    }
                }
            }, c0VarR, 54), c0Var2, 805306416, androidx.constraintlayout.core.motion.utils.v.g.f44096p);
        } else {
            if (i15 != 0) {
                function3 = new Function1() { // from class: io.intercom.android.sdk.tickets.list.ui.n
                    @Override // kotlin.jvm.functions.Function1
                    public final Object invoke(Object obj) {
                        return TicketsScreenKt.TicketsScreen$lambda$0((String) obj);
                    }
                };
            } else {
                function3 = function2;
            }
            c0Var2 = c0VarR;
            pt.f(c4.a(t7.h(androidx.compose.foundation.v.d(a0.E, IntercomTheme.INSTANCE.getColors(c0VarR, IntercomTheme.$stable).m690getBackground0d7_KjU(), null, 2, null), b8.o(v6.f16495a, c0VarR, 8)), "tickets_screen"), w.e(-1473942521, true, new Function2<c0, Integer, Unit>() { // from class: io.intercom.android.sdk.tickets.list.ui.TicketsScreenKt.TicketsScreen.2
                @Override // kotlin.jvm.functions.Function2
                public /* bridge */ /* synthetic */ Unit invoke(c0 c0Var3, Integer num) {
                    invoke(c0Var3, num.intValue());
                    return Unit.f312394a;
                }

                @androidx.compose.runtime.o
                @t(applier = "androidx.compose.ui.UiComposable")
                public final void invoke(c0 c0Var3, int i16) {
                    if ((i16 & 11) == 2 && c0Var3.d()) {
                        c0Var3.u();
                        return;
                    }
                    String screenLabel = uiState.getScreenLabel();
                    Function0<Unit> function0 = onBackButtonClick;
                    Integer numValueOf = Integer.valueOf(i10);
                    IntercomTheme intercomTheme = IntercomTheme.INSTANCE;
                    int i17 = IntercomTheme.$stable;
                    TopActionBarKt.m172TopActionBarNpQZenA(null, screenLabel, null, null, null, function0, numValueOf, false, intercomTheme.getColors(c0Var3, i17).m704getHeader0d7_KjU(), intercomTheme.getColors(c0Var3, i17).m711getOnHeader0d7_KjU(), 0L, null, null, c0Var3, 0, 0, 7325);
                }
            }, c0VarR, 54), null, null, null, 0, 0L, 0L, null, w.e(-1690440366, true, new pj.n<g5, c0, Integer, Unit>() { // from class: io.intercom.android.sdk.tickets.list.ui.TicketsScreenKt.TicketsScreen.3
                @Override // pj.n
                public /* bridge */ /* synthetic */ Unit invoke(g5 g5Var, c0 c0Var3, Integer num) {
                    invoke(g5Var, c0Var3, num.intValue());
                    return Unit.f312394a;
                }

                @androidx.compose.runtime.o
                @t(applier = "androidx.compose.ui.UiComposable")
                public final void invoke(g5 paddingValues, c0 c0Var3, int i16) {
                    Intrinsics.checkNotNullParameter(paddingValues, "paddingValues");
                    if ((i16 & 14) == 0) {
                        i16 |= c0Var3.D(paddingValues) ? 4 : 2;
                    }
                    if ((i16 & 91) == 18 && c0Var3.d()) {
                        c0Var3.u();
                        return;
                    }
                    TicketsScreenUiState ticketsScreenUiState = uiState;
                    if (ticketsScreenUiState instanceof TicketsScreenUiState.Content) {
                        c0Var3.E(1161791623);
                        TicketsScreenKt.TicketsScreenContent((TicketsScreenUiState.Content) uiState, paddingValues, function3, c0Var3, androidx.paging.compose.b.f71648f | ((i16 << 3) & com.planner5d.library.engine.input.f.b.B), 0);
                        c0Var3.A();
                        return;
                    }
                    if (ticketsScreenUiState instanceof TicketsScreenUiState.Empty) {
                        c0Var3.E(1161993371);
                        TicketsEmptyScreenKt.TicketsEmptyScreen(((TicketsScreenUiState.Empty) uiState).getEmptyState(), d5.p(a0.E, paddingValues), c0Var3, 0, 0);
                        c0Var3.A();
                    } else if (ticketsScreenUiState instanceof TicketsScreenUiState.Error) {
                        c0Var3.E(1162175744);
                        TicketsErrorScreenKt.TicketsErrorScreen(((TicketsScreenUiState.Error) uiState).getErrorState(), d5.p(a0.E, paddingValues), c0Var3, 0, 0);
                        c0Var3.A();
                    } else {
                        if (!(ticketsScreenUiState instanceof TicketsScreenUiState.Initial) && !(ticketsScreenUiState instanceof TicketsScreenUiState.Loading)) {
                            c0Var3.E(2115686198);
                            c0Var3.A();
                            throw new k0();
                        }
                        c0Var3.E(2115705652);
                        TicketsLoadingScreenKt.TicketsLoadingScreen(d5.p(a0.E, paddingValues), c0Var3, 0, 0);
                        c0Var3.A();
                    }
                }
            }, c0VarR, 54), c0Var2, 805306416, androidx.constraintlayout.core.motion.utils.v.g.f44096p);
        }
        s5VarT = c0Var2.T();
        if (s5VarT != null) {
            s5VarT.a(new Function2() { // from class: io.intercom.android.sdk.tickets.list.ui.o
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    return TicketsScreenKt.TicketsScreen$lambda$1(uiState, onBackButtonClick, function3, i10, i11, i12, (c0) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit TicketsScreen$lambda$0(String it) {
        Intrinsics.checkNotNullParameter(it, "it");
        return Unit.f312394a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit TicketsScreen$lambda$1(TicketsScreenUiState uiState, Function0 onBackButtonClick, Function1 function1, int i10, int i11, int i12, c0 c0Var, int i13) {
        Intrinsics.checkNotNullParameter(uiState, "$uiState");
        Intrinsics.checkNotNullParameter(onBackButtonClick, "$onBackButtonClick");
        TicketsScreen(uiState, onBackButtonClick, function1, i10, c0Var, t4.a(i11 | 1), i12);
        return Unit.f312394a;
    }

    /* JADX WARN: Code duplicated, block: B:40:0x007a A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:41:0x007c  */
    /* JADX WARN: Code duplicated, block: B:42:0x0084  */
    /* JADX WARN: Code duplicated, block: B:46:0x00b0  */
    /* JADX WARN: Code duplicated, block: B:48:? A[RETURN, SYNTHETIC] */
    @androidx.compose.runtime.o
    @t(applier = "androidx.compose.ui.UiComposable")
    public static final void TicketsScreenContent(@NotNull final TicketsScreenUiState.Content uiState, @NotNull final g5 paddingValues, @Nullable Function1<? super String, Unit> function1, @Nullable c0 c0Var, final int i10, final int i11) {
        int i12;
        Function1<? super String, Unit> function2;
        final Function1<? super String, Unit> function3;
        final Function1<? super String, Unit> function4;
        s5 s5VarT;
        Intrinsics.checkNotNullParameter(uiState, "uiState");
        Intrinsics.checkNotNullParameter(paddingValues, "paddingValues");
        c0 c0VarR = c0Var.R(-1912868973);
        if ((i11 & 1) != 0) {
            i12 = i10 | 6;
        } else if ((i10 & 14) == 0) {
            i12 = (c0VarR.D(uiState) ? 4 : 2) | i10;
        } else {
            i12 = i10;
        }
        if ((i11 & 2) != 0) {
            i12 |= 48;
        } else if ((i10 & com.planner5d.library.engine.input.f.b.B) == 0) {
            i12 |= c0VarR.D(paddingValues) ? 32 : 16;
        }
        int i13 = i11 & 4;
        if (i13 == 0) {
            if ((i10 & 896) == 0) {
                function2 = function1;
                i12 |= c0VarR.k0(function2) ? 256 : 128;
            }
            if ((i12 & 731) == 146 || !c0VarR.d()) {
                if (i13 != 0) {
                    function3 = new Function1() { // from class: io.intercom.android.sdk.tickets.list.ui.k
                        @Override // kotlin.jvm.functions.Function1
                        public final Object invoke(Object obj) {
                            return TicketsScreenKt.TicketsScreenContent$lambda$2((String) obj);
                        }
                    };
                } else {
                    function3 = function2;
                }
                androidx.compose.foundation.lazy.h.h(i6.f(a0.E, 0.0f, 1, null), null, paddingValues, false, null, null, null, false, null, new Function1() { // from class: io.intercom.android.sdk.tickets.list.ui.l
                    @Override // kotlin.jvm.functions.Function1
                    public final Object invoke(Object obj) {
                        return TicketsScreenKt.TicketsScreenContent$lambda$3(uiState, function3, (w0) obj);
                    }
                }, c0VarR, ((i12 << 3) & 896) | 6, 506);
                function4 = function3;
            } else {
                c0VarR.u();
                function4 = function2;
            }
            s5VarT = c0VarR.T();
            if (s5VarT != null) {
                s5VarT.a(new Function2() { // from class: io.intercom.android.sdk.tickets.list.ui.m
                    @Override // kotlin.jvm.functions.Function2
                    public final Object invoke(Object obj, Object obj2) {
                        return TicketsScreenKt.TicketsScreenContent$lambda$4(uiState, paddingValues, function4, i10, i11, (c0) obj, ((Integer) obj2).intValue());
                    }
                });
            }
        }
        i12 |= a5.S0;
        function2 = function1;
        if ((i12 & 731) == 146) {
            if (i13 != 0) {
                function3 = new Function1() { // from class: io.intercom.android.sdk.tickets.list.ui.k
                    @Override // kotlin.jvm.functions.Function1
                    public final Object invoke(Object obj) {
                        return TicketsScreenKt.TicketsScreenContent$lambda$2((String) obj);
                    }
                };
            } else {
                function3 = function2;
            }
            androidx.compose.foundation.lazy.h.h(i6.f(a0.E, 0.0f, 1, null), null, paddingValues, false, null, null, null, false, null, new Function1() { // from class: io.intercom.android.sdk.tickets.list.ui.l
                @Override // kotlin.jvm.functions.Function1
                public final Object invoke(Object obj) {
                    return TicketsScreenKt.TicketsScreenContent$lambda$3(uiState, function3, (w0) obj);
                }
            }, c0VarR, ((i12 << 3) & 896) | 6, 506);
            function4 = function3;
        } else {
            if (i13 != 0) {
                function3 = new Function1() { // from class: io.intercom.android.sdk.tickets.list.ui.k
                    @Override // kotlin.jvm.functions.Function1
                    public final Object invoke(Object obj) {
                        return TicketsScreenKt.TicketsScreenContent$lambda$2((String) obj);
                    }
                };
            } else {
                function3 = function2;
            }
            androidx.compose.foundation.lazy.h.h(i6.f(a0.E, 0.0f, 1, null), null, paddingValues, false, null, null, null, false, null, new Function1() { // from class: io.intercom.android.sdk.tickets.list.ui.l
                @Override // kotlin.jvm.functions.Function1
                public final Object invoke(Object obj) {
                    return TicketsScreenKt.TicketsScreenContent$lambda$3(uiState, function3, (w0) obj);
                }
            }, c0VarR, ((i12 << 3) & 896) | 6, 506);
            function4 = function3;
        }
        s5VarT = c0VarR.T();
        if (s5VarT != null) {
            s5VarT.a(new Function2() { // from class: io.intercom.android.sdk.tickets.list.ui.m
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    return TicketsScreenKt.TicketsScreenContent$lambda$4(uiState, paddingValues, function4, i10, i11, (c0) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit TicketsScreenContent$lambda$2(String it) {
        Intrinsics.checkNotNullParameter(it, "it");
        return Unit.f312394a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit TicketsScreenContent$lambda$3(TicketsScreenUiState.Content uiState, Function1 function1, w0 LazyColumn) {
        Intrinsics.checkNotNullParameter(uiState, "$uiState");
        Intrinsics.checkNotNullParameter(LazyColumn, "$this$LazyColumn");
        w0.g(LazyColumn, uiState.getLazyPagingTickets().g(), null, null, w.c(264752689, true, new TicketsScreenKt$TicketsScreenContent$2$1(uiState, function1)), 6, null);
        final ErrorState errorState = uiState.getErrorState();
        if (errorState != null) {
            w0.p(LazyColumn, null, null, w.c(-1511938327, true, new pj.n<androidx.compose.foundation.lazy.i, c0, Integer, Unit>() { // from class: io.intercom.android.sdk.tickets.list.ui.TicketsScreenKt$TicketsScreenContent$2$2
                @Override // pj.n
                public /* bridge */ /* synthetic */ Unit invoke(androidx.compose.foundation.lazy.i iVar, c0 c0Var, Integer num) {
                    invoke(iVar, c0Var, num.intValue());
                    return Unit.f312394a;
                }

                @androidx.compose.runtime.o
                @t(applier = "androidx.compose.ui.UiComposable")
                public final void invoke(androidx.compose.foundation.lazy.i item, c0 c0Var, int i10) {
                    Intrinsics.checkNotNullParameter(item, "$this$item");
                    if ((i10 & 81) == 16 && c0Var.d()) {
                        c0Var.u();
                        return;
                    }
                    a0.a aVar = a0.E;
                    a0 a0VarH = i6.h(d5.t(aVar, 0.0f, androidx.compose.ui.unit.h.r(16), 1, null), 0.0f, 1, null);
                    androidx.compose.ui.e.a aVar2 = androidx.compose.ui.e.f37317a;
                    androidx.compose.ui.e eVarI = aVar2.i();
                    final ErrorState errorState2 = errorState;
                    a1 a1VarK = x.k(eVarI, false);
                    int iHashCode = Long.hashCode(androidx.compose.runtime.v.l(c0Var, 0));
                    b1 b1VarK = c0Var.k();
                    a0 a0VarN = androidx.compose.ui.m.n(c0Var, a0VarH);
                    androidx.compose.ui.node.g.a aVar3 = androidx.compose.ui.node.g.I;
                    Function0<androidx.compose.ui.node.g> function0A = aVar3.a();
                    if (c0Var.S() == null) {
                        androidx.compose.runtime.v.r();
                    }
                    c0Var.q();
                    if (c0Var.P()) {
                        c0Var.q0(function0A);
                    } else {
                        c0Var.l();
                    }
                    c0 c0VarD = y7.d(c0Var);
                    y7.n(c0VarD, a1VarK, aVar3.e());
                    y7.n(c0VarD, b1VarK, aVar3.g());
                    Function2<androidx.compose.ui.node.g, Integer, Unit> function2B = aVar3.b();
                    if (c0VarD.P() || !Intrinsics.areEqual(c0VarD.i0(), Integer.valueOf(iHashCode))) {
                        c0VarD.Y(Integer.valueOf(iHashCode));
                        c0VarD.f(Integer.valueOf(iHashCode), function2B);
                    }
                    y7.n(c0VarD, a0VarN, aVar3.f());
                    d0 d0Var = d0.f15956a;
                    a1 a1VarB = j0.b(androidx.compose.foundation.layout.q.f16330a.y(), aVar2.m(), c0Var, 48);
                    int iHashCode2 = Long.hashCode(androidx.compose.runtime.v.l(c0Var, 0));
                    b1 b1VarK2 = c0Var.k();
                    a0 a0VarN2 = androidx.compose.ui.m.n(c0Var, aVar);
                    Function0<androidx.compose.ui.node.g> function0A2 = aVar3.a();
                    if (c0Var.S() == null) {
                        androidx.compose.runtime.v.r();
                    }
                    c0Var.q();
                    if (c0Var.P()) {
                        c0Var.q0(function0A2);
                    } else {
                        c0Var.l();
                    }
                    c0 c0VarD2 = y7.d(c0Var);
                    y7.n(c0VarD2, a1VarB, aVar3.e());
                    y7.n(c0VarD2, b1VarK2, aVar3.g());
                    Function2<androidx.compose.ui.node.g, Integer, Unit> function2B2 = aVar3.b();
                    if (c0VarD2.P() || !Intrinsics.areEqual(c0VarD2.i0(), Integer.valueOf(iHashCode2))) {
                        c0VarD2.Y(Integer.valueOf(iHashCode2));
                        c0VarD2.f(Integer.valueOf(iHashCode2), function2B2);
                    }
                    y7.n(c0VarD2, a0VarN2, aVar3.f());
                    n0 n0Var = n0.f16227a;
                    q50.t(u0.i.d(errorState2.getMessageResId(), c0Var, 0), null, 0L, null, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, null, c0Var, 0, 0, 262142);
                    c0Var.E(-309108390);
                    if (errorState2 instanceof ErrorState.WithCTA) {
                        a4.p(((ErrorState.WithCTA) errorState2).getOnCtaClick(), null, false, null, null, null, null, null, null, w.e(-774229187, true, new pj.n<x5, c0, Integer, Unit>() { // from class: io.intercom.android.sdk.tickets.list.ui.TicketsScreenKt$TicketsScreenContent$2$2$1$1$1
                            @Override // pj.n
                            public /* bridge */ /* synthetic */ Unit invoke(x5 x5Var, c0 c0Var2, Integer num) {
                                invoke(x5Var, c0Var2, num.intValue());
                                return Unit.f312394a;
                            }

                            @androidx.compose.runtime.o
                            @t(applier = "androidx.compose.ui.UiComposable")
                            public final void invoke(x5 TextButton, c0 c0Var2, int i11) {
                                Intrinsics.checkNotNullParameter(TextButton, "$this$TextButton");
                                if ((i11 & 81) == 16 && c0Var2.d()) {
                                    c0Var2.u();
                                } else {
                                    q50.t(u0.i.d(((ErrorState.WithCTA) errorState2).getCtaResId(), c0Var2, 0), null, 0L, null, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, IntercomTheme.INSTANCE.getTypography(c0Var2, IntercomTheme.$stable).getType04(), c0Var2, 0, 0, 131070);
                                }
                            }
                        }, c0Var, 54), c0Var, 805306368, androidx.constraintlayout.core.motion.utils.v.g.f44098r);
                    }
                    c0Var.A();
                    c0Var.o();
                    c0Var.o();
                }
            }), 3, null);
        }
        if (uiState.isLoadingMore()) {
            w0.p(LazyColumn, null, null, ComposableSingletons$TicketsScreenKt.INSTANCE.m563getLambda1$intercom_sdk_base_release(), 3, null);
        }
        return Unit.f312394a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit TicketsScreenContent$lambda$4(TicketsScreenUiState.Content uiState, g5 paddingValues, Function1 function1, int i10, int i11, c0 c0Var, int i12) {
        Intrinsics.checkNotNullParameter(uiState, "$uiState");
        Intrinsics.checkNotNullParameter(paddingValues, "$paddingValues");
        TicketsScreenContent(uiState, paddingValues, function1, c0Var, t4.a(i10 | 1), i11);
        return Unit.f312394a;
    }
}
