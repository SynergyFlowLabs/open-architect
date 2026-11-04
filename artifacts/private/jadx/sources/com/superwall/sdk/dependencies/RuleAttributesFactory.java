package com.superwall.sdk.dependencies;

import com.superwall.sdk.models.config.ComputedPropertyRequest;
import com.superwall.sdk.models.events.EventData;
import java.util.List;
import java.util.Map;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes13.dex */
public interface RuleAttributesFactory {
    @Nullable
    Object makeRuleAttributes(@Nullable EventData eventData, @NotNull List<ComputedPropertyRequest> list, @NotNull kotlin.coroutines.d<? super Map<String, ? extends Object>> dVar);
}
