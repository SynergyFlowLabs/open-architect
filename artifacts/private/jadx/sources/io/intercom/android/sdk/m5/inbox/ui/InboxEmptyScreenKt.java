package io.intercom.android.sdk.m5.inbox.ui;

import androidx.compose.runtime.c0;
import androidx.compose.runtime.s5;
import androidx.compose.runtime.t4;
import androidx.compose.ui.a0;
import androidx.media3.exoplayer.a5;
import io.intercom.android.sdk.R;
import io.intercom.android.sdk.m5.components.EmptyStateKt;
import io.intercom.android.sdk.m5.components.IntercomPrimaryButtonKt;
import io.intercom.android.sdk.m5.home.data.IconType;
import io.intercom.android.sdk.models.ActionType;
import io.intercom.android.sdk.models.EmptyState;
import io.intercom.android.sdk.ui.IntercomPreviews;
import io.intercom.android.sdk.ui.theme.IntercomThemeKt;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.k0;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes13.dex */
public final class InboxEmptyScreenKt {
    @androidx.compose.runtime.o
    @IntercomPreviews
    @androidx.compose.runtime.t(applier = "androidx.compose.ui.UiComposable")
    private static final void EmptyScreenBotPreview(c0 c0Var, final int i10) {
        c0 c0VarR = c0Var.R(862447475);
        if (i10 == 0 && c0VarR.d()) {
            c0VarR.u();
        } else {
            IntercomThemeKt.IntercomTheme(null, null, null, ComposableSingletons$InboxEmptyScreenKt.INSTANCE.m397getLambda8$intercom_sdk_base_release(), c0VarR, 3072, 7);
        }
        s5 s5VarT = c0VarR.T();
        if (s5VarT != null) {
            s5VarT.a(new Function2() { // from class: io.intercom.android.sdk.m5.inbox.ui.l
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    return InboxEmptyScreenKt.EmptyScreenBotPreview$lambda$4(i10, (c0) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit EmptyScreenBotPreview$lambda$4(int i10, c0 c0Var, int i11) {
        EmptyScreenBotPreview(c0Var, t4.a(i10 | 1));
        return Unit.f312394a;
    }

    @androidx.compose.runtime.o
    @IntercomPreviews
    @androidx.compose.runtime.t(applier = "androidx.compose.ui.UiComposable")
    private static final void EmptyScreenHelpPreview(c0 c0Var, final int i10) {
        c0 c0VarR = c0Var.R(-1522245405);
        if (i10 == 0 && c0VarR.d()) {
            c0VarR.u();
        } else {
            IntercomThemeKt.IntercomTheme(null, null, null, ComposableSingletons$InboxEmptyScreenKt.INSTANCE.m393getLambda4$intercom_sdk_base_release(), c0VarR, 3072, 7);
        }
        s5 s5VarT = c0VarR.T();
        if (s5VarT != null) {
            s5VarT.a(new Function2() { // from class: io.intercom.android.sdk.m5.inbox.ui.n
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    return InboxEmptyScreenKt.EmptyScreenHelpPreview$lambda$2(i10, (c0) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit EmptyScreenHelpPreview$lambda$2(int i10, c0 c0Var, int i11) {
        EmptyScreenHelpPreview(c0Var, t4.a(i10 | 1));
        return Unit.f312394a;
    }

    @androidx.compose.runtime.o
    @IntercomPreviews
    @androidx.compose.runtime.t(applier = "androidx.compose.ui.UiComposable")
    private static final void EmptyScreenMessagePreview(c0 c0Var, final int i10) {
        c0 c0VarR = c0Var.R(1317218099);
        if (i10 == 0 && c0VarR.d()) {
            c0VarR.u();
        } else {
            IntercomThemeKt.IntercomTheme(null, null, null, ComposableSingletons$InboxEmptyScreenKt.INSTANCE.m391getLambda2$intercom_sdk_base_release(), c0VarR, 3072, 7);
        }
        s5 s5VarT = c0VarR.T();
        if (s5VarT != null) {
            s5VarT.a(new Function2() { // from class: io.intercom.android.sdk.m5.inbox.ui.j
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    return InboxEmptyScreenKt.EmptyScreenMessagePreview$lambda$1(i10, (c0) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit EmptyScreenMessagePreview$lambda$1(int i10, c0 c0Var, int i11) {
        EmptyScreenMessagePreview(c0Var, t4.a(i10 | 1));
        return Unit.f312394a;
    }

    @androidx.compose.runtime.o
    @IntercomPreviews
    @androidx.compose.runtime.t(applier = "androidx.compose.ui.UiComposable")
    private static final void EmptyScreenWithoutActionPreview(c0 c0Var, final int i10) {
        c0 c0VarR = c0Var.R(-132232118);
        if (i10 == 0 && c0VarR.d()) {
            c0VarR.u();
        } else {
            int i11 = 1 | 7;
            IntercomThemeKt.IntercomTheme(null, null, null, ComposableSingletons$InboxEmptyScreenKt.INSTANCE.m395getLambda6$intercom_sdk_base_release(), c0VarR, 3072, 7);
        }
        s5 s5VarT = c0VarR.T();
        if (s5VarT != null) {
            s5VarT.a(new Function2() { // from class: io.intercom.android.sdk.m5.inbox.ui.k
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    return InboxEmptyScreenKt.EmptyScreenWithoutActionPreview$lambda$3(i10, (c0) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit EmptyScreenWithoutActionPreview$lambda$3(int i10, c0 c0Var, int i11) {
        EmptyScreenWithoutActionPreview(c0Var, t4.a(i10 | 1));
        return Unit.f312394a;
    }

    @androidx.compose.runtime.o
    @androidx.compose.runtime.t(applier = "androidx.compose.ui.UiComposable")
    public static final void InboxEmptyScreen(@NotNull final EmptyState emptyState, final boolean z10, @NotNull final Function0<Unit> onActionButtonClick, @Nullable a0 a0Var, @Nullable c0 c0Var, final int i10, final int i11) {
        int i12;
        final a0 a0Var2;
        Intrinsics.checkNotNullParameter(emptyState, "emptyState");
        Intrinsics.checkNotNullParameter(onActionButtonClick, "onActionButtonClick");
        c0 c0VarR = c0Var.R(-727293785);
        if ((i11 & 1) != 0) {
            i12 = i10 | 6;
        } else if ((i10 & 14) == 0) {
            i12 = (c0VarR.D(emptyState) ? 4 : 2) | i10;
        } else {
            i12 = i10;
        }
        if ((i11 & 2) != 0) {
            i12 |= 48;
        } else if ((i10 & com.planner5d.library.engine.input.f.b.B) == 0) {
            i12 |= c0VarR.G(z10) ? 32 : 16;
        }
        if ((i11 & 4) != 0) {
            i12 |= a5.S0;
        } else if ((i10 & 896) == 0) {
            i12 |= c0VarR.k0(onActionButtonClick) ? 256 : 128;
        }
        int i13 = i11 & 8;
        if (i13 != 0) {
            i12 |= 3072;
        } else if ((i10 & 7168) == 0) {
            i12 |= c0VarR.D(a0Var) ? 2048 : 1024;
        }
        if ((i12 & 5851) == 1170 && c0VarR.d()) {
            c0VarR.u();
            a0Var2 = a0Var;
        } else {
            if (i13 != 0) {
                a0Var = a0.E;
            }
            a0 a0Var3 = a0Var;
            EmptyStateKt.EmptyState(emptyState.getTitle(), a0Var3, emptyState.getText(), Integer.valueOf(R.drawable.intercom_messages_icon), androidx.compose.runtime.internal.w.e(2045450098, true, new Function2<c0, Integer, Unit>() { // from class: io.intercom.android.sdk.m5.inbox.ui.InboxEmptyScreenKt.InboxEmptyScreen.1

                /* JADX INFO: renamed from: io.intercom.android.sdk.m5.inbox.ui.InboxEmptyScreenKt$InboxEmptyScreen$1$WhenMappings */
                public /* synthetic */ class WhenMappings {
                    public static final /* synthetic */ int[] $EnumSwitchMapping$0;
                    public static final /* synthetic */ int[] $EnumSwitchMapping$1;

                    static {
                        int[] iArr = new int[IconType.values().length];
                        try {
                            iArr[IconType.TEAMMATE.ordinal()] = 1;
                        } catch (NoSuchFieldError unused) {
                        }
                        try {
                            iArr[IconType.BOT.ordinal()] = 2;
                        } catch (NoSuchFieldError unused2) {
                        }
                        try {
                            iArr[IconType.FIN.ordinal()] = 3;
                        } catch (NoSuchFieldError unused3) {
                        }
                        try {
                            iArr[IconType.FACE_PILE.ordinal()] = 4;
                        } catch (NoSuchFieldError unused4) {
                        }
                        $EnumSwitchMapping$0 = iArr;
                        int[] iArr2 = new int[ActionType.values().length];
                        try {
                            iArr2[ActionType.MESSAGE.ordinal()] = 1;
                        } catch (NoSuchFieldError unused5) {
                        }
                        try {
                            iArr2[ActionType.HELP.ordinal()] = 2;
                        } catch (NoSuchFieldError unused6) {
                        }
                        $EnumSwitchMapping$1 = iArr2;
                    }
                }

                @Override // kotlin.jvm.functions.Function2
                public /* bridge */ /* synthetic */ Unit invoke(c0 c0Var2, Integer num) {
                    invoke(c0Var2, num.intValue());
                    return Unit.f312394a;
                }

                @androidx.compose.runtime.o
                @androidx.compose.runtime.t(applier = "androidx.compose.ui.UiComposable")
                public final void invoke(c0 c0Var2, int i14) {
                    int i15;
                    Integer numValueOf;
                    if ((i14 & 11) == 2 && c0Var2.d()) {
                        c0Var2.u();
                        return;
                    }
                    if (z10) {
                        int i16 = WhenMappings.$EnumSwitchMapping$1[emptyState.getAction().getType().ordinal()];
                        if (i16 != 1) {
                            if (i16 != 2) {
                                c0Var2.E(1738020481);
                                c0Var2.A();
                                throw new k0();
                            }
                            c0Var2.E(1738038509);
                            IntercomPrimaryButtonKt.IntercomPrimaryButton(emptyState.getAction().getLabel(), null, Integer.valueOf(R.drawable.intercom_article_book_icon), onActionButtonClick, c0Var2, 0, 2);
                            c0Var2.A();
                            return;
                        }
                        c0Var2.E(1738022382);
                        String label = emptyState.getAction().getLabel();
                        IconType icon = emptyState.getAction().getIcon();
                        if (icon == null) {
                            i15 = -1;
                            int i17 = 7 ^ (-1);
                        } else {
                            i15 = WhenMappings.$EnumSwitchMapping$0[icon.ordinal()];
                        }
                        if (i15 != 1) {
                            numValueOf = (i15 == 2 || i15 == 3 || i15 == 4) ? Integer.valueOf(R.drawable.intercom_conversation_card_question) : null;
                        } else {
                            numValueOf = Integer.valueOf(R.drawable.intercom_send_message_icon);
                        }
                        IntercomPrimaryButtonKt.IntercomPrimaryButton(label, null, numValueOf, onActionButtonClick, c0Var2, 0, 2);
                        c0Var2.A();
                    }
                }
            }, c0VarR, 54), c0VarR, ((i12 >> 6) & com.planner5d.library.engine.input.f.b.B) | 24576, 0);
            a0Var2 = a0Var3;
        }
        s5 s5VarT = c0VarR.T();
        if (s5VarT != null) {
            s5VarT.a(new Function2() { // from class: io.intercom.android.sdk.m5.inbox.ui.m
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    return InboxEmptyScreenKt.InboxEmptyScreen$lambda$0(emptyState, z10, onActionButtonClick, a0Var2, i10, i11, (c0) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit InboxEmptyScreen$lambda$0(EmptyState emptyState, boolean z10, Function0 onActionButtonClick, a0 a0Var, int i10, int i11, c0 c0Var, int i12) {
        Intrinsics.checkNotNullParameter(emptyState, "$emptyState");
        Intrinsics.checkNotNullParameter(onActionButtonClick, "$onActionButtonClick");
        InboxEmptyScreen(emptyState, z10, onActionButtonClick, a0Var, c0Var, t4.a(i10 | 1), i11);
        return Unit.f312394a;
    }
}
