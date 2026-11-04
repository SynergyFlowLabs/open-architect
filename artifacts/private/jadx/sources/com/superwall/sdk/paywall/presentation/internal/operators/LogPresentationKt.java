package com.superwall.sdk.paywall.presentation.internal.operators;

import com.superwall.sdk.Superwall;
import com.superwall.sdk.logger.LogLevel;
import com.superwall.sdk.logger.LogScope;
import com.superwall.sdk.logger.Logger;
import com.superwall.sdk.models.events.EventData;
import com.superwall.sdk.paywall.presentation.internal.PresentationRequest;
import java.util.Map;
import kotlin.Pair;
import kotlin.TuplesKt;
import kotlin.collections.MapsKt;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.w0;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes13.dex */
public final class LogPresentationKt {
    @NotNull
    public static final Map<String, Object> logPresentation(@NotNull Superwall superwall, @NotNull PresentationRequest request, @NotNull String message) {
        String string;
        Intrinsics.checkNotNullParameter(superwall, "<this>");
        Intrinsics.checkNotNullParameter(request, "request");
        Intrinsics.checkNotNullParameter(message, "message");
        EventData eventData = request.getPresentationInfo().getEventData();
        Pair pair = TuplesKt.to(w0.f315666d, String.valueOf(request.getPresenter()));
        if (eventData == null || (string = eventData.toString()) == null) {
            string = "";
        }
        Map<String, Object> mapMapOf = MapsKt.mapOf(pair, TuplesKt.to("fromEvent", string));
        Logger.debug$default(Logger.INSTANCE, LogLevel.debug, LogScope.paywallPresentation, message, mapMapOf, null, 16, null);
        return mapMapOf;
    }
}
