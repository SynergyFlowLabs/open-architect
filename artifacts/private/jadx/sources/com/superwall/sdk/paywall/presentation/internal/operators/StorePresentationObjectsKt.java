package com.superwall.sdk.paywall.presentation.internal.operators;

import com.superwall.sdk.Superwall;
import com.superwall.sdk.paywall.presentation.LastPresentationItems;
import com.superwall.sdk.paywall.presentation.internal.PresentationRequest;
import com.superwall.sdk.paywall.presentation.internal.state.PaywallState;
import kotlin.Unit;
import kotlin.coroutines.d;
import kotlinx.coroutines.flow.j0;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes13.dex */
public final class StorePresentationObjectsKt {
    @Nullable
    public static final Object storePresentationObjects(@NotNull Superwall superwall, @Nullable PresentationRequest presentationRequest, @NotNull j0<PaywallState> j0Var, @NotNull d<? super Unit> dVar) {
        if (presentationRequest == null) {
            return Unit.f312394a;
        }
        superwall.getPresentationItems$superwall_release().setLast(new LastPresentationItems(presentationRequest, j0Var));
        return Unit.f312394a;
    }
}
