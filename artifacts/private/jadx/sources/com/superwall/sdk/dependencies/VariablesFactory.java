package com.superwall.sdk.dependencies;

import com.superwall.sdk.models.config.ComputedPropertyRequest;
import com.superwall.sdk.models.events.EventData;
import com.superwall.sdk.models.product.ProductVariable;
import com.superwall.sdk.paywall.view.webview.templating.models.JsonVariables;
import java.util.List;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes13.dex */
public interface VariablesFactory {
    @Nullable
    Object makeJsonVariables(@Nullable List<ProductVariable> list, @NotNull List<ComputedPropertyRequest> list2, @Nullable EventData eventData, @NotNull kotlin.coroutines.d<? super JsonVariables> dVar);
}
