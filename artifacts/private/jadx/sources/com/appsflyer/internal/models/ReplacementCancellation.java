package com.appsflyer.internal.models;

import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes3.dex */
public final class ReplacementCancellation {

    @NotNull
    public static final Companion Companion = new Companion(null);

    public static final class Companion implements Deserialize<ReplacementCancellation> {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // com.appsflyer.internal.models.Deserialize
        @NotNull
        public final ReplacementCancellation fromJson(@NotNull JSONObject jSONObject) {
            Intrinsics.checkNotNullParameter(jSONObject, "");
            return new ReplacementCancellation();
        }
    }

    public final boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        return Intrinsics.areEqual(ReplacementCancellation.class, obj != null ? obj.getClass() : null);
    }

    public final int hashCode() {
        return ReplacementCancellation.class.hashCode();
    }
}
