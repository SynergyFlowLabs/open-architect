package io.intercom.android.sdk.tickets.list.reducers;

import androidx.compose.runtime.c0;
import androidx.compose.runtime.o;
import androidx.paging.compose.b;
import androidx.paging.x0;
import io.intercom.android.sdk.Injector;
import io.intercom.android.sdk.R;
import io.intercom.android.sdk.identity.AppConfig;
import io.intercom.android.sdk.m5.components.ErrorState;
import io.intercom.android.sdk.models.EmptyState;
import io.intercom.android.sdk.models.Space;
import io.intercom.android.sdk.tickets.list.data.TicketsScreenUiState;
import io.intercom.android.sdk.tickets.list.reducers.TicketsListReducerKt;
import io.intercom.android.sdk.tickets.list.ui.TicketRowData;
import java.io.IOException;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import u0.i;

/* JADX INFO: loaded from: classes13.dex */
public final class TicketsListReducerKt {
    @o
    @NotNull
    public static final TicketsScreenUiState reduceToTicketsScreenUiState(@NotNull final b<TicketRowData> bVar, @Nullable Function0<AppConfig> function0, @Nullable c0 c0Var, int i10, int i11) {
        TicketsScreenUiState initial;
        Intrinsics.checkNotNullParameter(bVar, "<this>");
        c0Var.E(-356015290);
        if ((i11 & 1) != 0) {
            function0 = new Function0() { // from class: ci.a
                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    return TicketsListReducerKt.reduceToTicketsScreenUiState$lambda$0();
                }
            };
        }
        String spaceLabelIfExists = function0.invoke().getSpaceLabelIfExists(Space.Type.TICKETS);
        c0Var.E(-374395883);
        if (spaceLabelIfExists == null) {
            spaceLabelIfExists = i.d(R.string.intercom_tickets_space_title, c0Var, 0);
        }
        c0Var.A();
        if (bVar.h().size() != 0) {
            boolean z10 = bVar.i().b() instanceof x0.b;
            x0 x0VarB = bVar.i().b();
            ErrorState withoutCTA = null;
            x0.a aVar = x0VarB instanceof x0.a ? (x0.a) x0VarB : null;
            if (aVar != null) {
                if (aVar.b() instanceof IOException) {
                    withoutCTA = new ErrorState.WithCTA(0, 0, null, 0, new Function0() { // from class: ci.b
                        @Override // kotlin.jvm.functions.Function0
                        public final Object invoke() {
                            return TicketsListReducerKt.reduceToTicketsScreenUiState$lambda$2$lambda$1(bVar);
                        }
                    }, 15, null);
                } else {
                    int i12 = 7 << 0;
                    withoutCTA = new ErrorState.WithoutCTA(0, 0, null, 7, null);
                }
            }
            initial = new TicketsScreenUiState.Content(bVar, z10, withoutCTA, spaceLabelIfExists);
        } else if (bVar.i().e() instanceof x0.a) {
            x0 x0VarE = bVar.i().e();
            Intrinsics.checkNotNull(x0VarE, "null cannot be cast to non-null type androidx.paging.LoadState.Error");
            initial = ((x0.a) x0VarE).b() instanceof IOException ? new TicketsScreenUiState.Error(new ErrorState.WithCTA(0, 0, Integer.valueOf(R.string.intercom_failed_to_load_tickets), 0, new Function0() { // from class: ci.c
                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    return TicketsListReducerKt.reduceToTicketsScreenUiState$lambda$3(bVar);
                }
            }, 11, null), spaceLabelIfExists) : new TicketsScreenUiState.Error(new ErrorState.WithoutCTA(0, 0, Integer.valueOf(R.string.intercom_failed_to_load_tickets), 3, null), spaceLabelIfExists);
        } else {
            initial = bVar.i().e() instanceof x0.b ? new TicketsScreenUiState.Initial(spaceLabelIfExists) : new TicketsScreenUiState.Empty(new EmptyState(i.d(R.string.intercom_tickets_empty_state_title, c0Var, 0), i.d(R.string.intercom_tickets_empty_state_text, c0Var, 0), null, 4, null), spaceLabelIfExists);
        }
        c0Var.A();
        return initial;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final AppConfig reduceToTicketsScreenUiState$lambda$0() {
        return Injector.get().getAppConfigProvider().get();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit reduceToTicketsScreenUiState$lambda$2$lambda$1(b this_reduceToTicketsScreenUiState) {
        Intrinsics.checkNotNullParameter(this_reduceToTicketsScreenUiState, "$this_reduceToTicketsScreenUiState");
        this_reduceToTicketsScreenUiState.l();
        return Unit.f312394a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit reduceToTicketsScreenUiState$lambda$3(b this_reduceToTicketsScreenUiState) {
        Intrinsics.checkNotNullParameter(this_reduceToTicketsScreenUiState, "$this_reduceToTicketsScreenUiState");
        this_reduceToTicketsScreenUiState.k();
        return Unit.f312394a;
    }
}
