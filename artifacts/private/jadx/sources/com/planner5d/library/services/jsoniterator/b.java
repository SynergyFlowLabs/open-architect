package com.planner5d.library.services.jsoniterator;

import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import org.json.JSONArray;

/* JADX INFO: loaded from: classes10.dex */
public final class b extends a<String> {
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b(@NotNull JSONArray array) {
        super(array);
        Intrinsics.checkNotNullParameter(array, "array");
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.planner5d.library.services.jsoniterator.a
    @Nullable
    /* JADX INFO: renamed from: d, reason: merged with bridge method [inline-methods] */
    public String c(int i10) {
        return b().optString(i10, null);
    }
}
