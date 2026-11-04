package io.intercom.android.sdk.m5.helpcenter.ui.components;

import android.content.Context;
import android.util.AttributeSet;
import androidx.compose.runtime.d7;
import androidx.compose.runtime.internal.w0;
import androidx.compose.runtime.n3;
import androidx.compose.runtime.s5;
import androidx.compose.runtime.t4;
import io.intercom.android.sdk.Injector;
import io.intercom.android.sdk.helpcenter.articles.ArticleViewState;
import io.intercom.android.sdk.identity.AppConfig;
import io.intercom.android.sdk.m5.ConfigurableIntercomThemeKt;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes13.dex */
@w0(parameters = 1)
@SourceDebugExtension({"SMAP\nTeamPresenceComponent.kt\nKotlin\n*S Kotlin\n*F\n+ 1 TeamPresenceComponent.kt\nio/intercom/android/sdk/m5/helpcenter/ui/components/TeamPresenceComponent\n+ 2 SnapshotState.kt\nandroidx/compose/runtime/SnapshotStateKt__SnapshotStateKt\n*L\n1#1,235:1\n85#2:236\n117#2,2:237\n85#2:239\n117#2,2:240\n*S KotlinDebug\n*F\n+ 1 TeamPresenceComponent.kt\nio/intercom/android/sdk/m5/helpcenter/ui/components/TeamPresenceComponent\n*L\n138#1:236\n138#1:237,2\n139#1:239\n139#1:240,2\n*E\n"})
public final class TeamPresenceComponent extends androidx.compose.ui.platform.a {
    public static final int $stable = 0;

    @NotNull
    private final n3 needsChatBubble$delegate;

    @NotNull
    private final n3 teamPresenceState$delegate;

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    @oj.j
    public TeamPresenceComponent(@NotNull Context context) {
        this(context, null, 0, 6, null);
        Intrinsics.checkNotNullParameter(context, "context");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit Content$lambda$1(TeamPresenceComponent tmp1_rcvr, int i10, androidx.compose.runtime.c0 c0Var, int i11) {
        Intrinsics.checkNotNullParameter(tmp1_rcvr, "$tmp1_rcvr");
        tmp1_rcvr.Content(c0Var, t4.a(i10 | 1));
        return Unit.f312394a;
    }

    @Override // androidx.compose.ui.platform.a
    @androidx.compose.runtime.o
    @androidx.compose.runtime.t(applier = "androidx.compose.ui.UiComposable")
    public void Content(@Nullable androidx.compose.runtime.c0 c0Var, final int i10) {
        int i11;
        androidx.compose.runtime.c0 c0VarR = c0Var.R(-1850798977);
        if ((i10 & 14) == 0) {
            i11 = (c0VarR.D(this) ? 4 : 2) | i10;
        } else {
            i11 = i10;
        }
        if ((i11 & 11) == 2 && c0VarR.d()) {
            c0VarR.u();
        } else {
            final ArticleViewState.TeamPresenceState teamPresenceState = getTeamPresenceState();
            if (teamPresenceState != null) {
                AppConfig appConfig = Injector.get().getAppConfigProvider().get();
                Intrinsics.checkNotNullExpressionValue(appConfig, "get(...)");
                ConfigurableIntercomThemeKt.ConfigurableIntercomTheme(appConfig, androidx.compose.runtime.internal.w.e(-1302062926, true, new Function2<androidx.compose.runtime.c0, Integer, Unit>() { // from class: io.intercom.android.sdk.m5.helpcenter.ui.components.TeamPresenceComponent$Content$1$1
                    @Override // kotlin.jvm.functions.Function2
                    public /* bridge */ /* synthetic */ Unit invoke(androidx.compose.runtime.c0 c0Var2, Integer num) {
                        invoke(c0Var2, num.intValue());
                        return Unit.f312394a;
                    }

                    @androidx.compose.runtime.o
                    @androidx.compose.runtime.t(applier = "androidx.compose.ui.UiComposable")
                    public final void invoke(androidx.compose.runtime.c0 c0Var2, int i12) {
                        if ((i12 & 11) == 2 && c0Var2.d()) {
                            c0Var2.u();
                            return;
                        }
                        if (this.this$0.getNeedsChatBubble()) {
                            c0Var2.E(-365619251);
                            TeamPresenceComponentKt.TeamPresenceComponentWithBubble(teamPresenceState, c0Var2, 0);
                            c0Var2.A();
                        } else {
                            c0Var2.E(-365539209);
                            int i13 = 4 << 6;
                            TeamPresenceComponentKt.TeamPresenceComponent(teamPresenceState, false, null, c0Var2, 0, 6);
                            c0Var2.A();
                        }
                    }
                }, c0VarR, 54), c0VarR, 56);
            }
        }
        s5 s5VarT = c0VarR.T();
        if (s5VarT != null) {
            s5VarT.a(new Function2() { // from class: io.intercom.android.sdk.m5.helpcenter.ui.components.e0
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    return TeamPresenceComponent.Content$lambda$1(this.f292724a, i10, (androidx.compose.runtime.c0) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final boolean getNeedsChatBubble() {
        return ((Boolean) this.needsChatBubble$delegate.getValue()).booleanValue();
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Nullable
    public final ArticleViewState.TeamPresenceState getTeamPresenceState() {
        return (ArticleViewState.TeamPresenceState) this.teamPresenceState$delegate.getValue();
    }

    public final void setNeedsChatBubble(boolean z10) {
        this.needsChatBubble$delegate.setValue(Boolean.valueOf(z10));
    }

    public final void setTeamPresenceState(@Nullable ArticleViewState.TeamPresenceState teamPresenceState) {
        this.teamPresenceState$delegate.setValue(teamPresenceState);
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    @oj.j
    public TeamPresenceComponent(@NotNull Context context, @Nullable AttributeSet attributeSet) {
        this(context, attributeSet, 0, 4, null);
        Intrinsics.checkNotNullParameter(context, "context");
    }

    public /* synthetic */ TeamPresenceComponent(Context context, AttributeSet attributeSet, int i10, int i11, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, (i11 & 2) != 0 ? null : attributeSet, (i11 & 4) != 0 ? 0 : i10);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    @oj.j
    public TeamPresenceComponent(@NotNull Context context, @Nullable AttributeSet attributeSet, int i10) {
        super(context, attributeSet, i10);
        Intrinsics.checkNotNullParameter(context, "context");
        this.teamPresenceState$delegate = d7.g(null, null, 2, null);
        this.needsChatBubble$delegate = d7.g(Boolean.FALSE, null, 2, null);
    }
}
