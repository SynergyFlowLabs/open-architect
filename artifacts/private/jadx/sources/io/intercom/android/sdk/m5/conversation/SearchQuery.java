package io.intercom.android.sdk.m5.conversation;

import androidx.compose.runtime.internal.w0;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes13.dex */
interface SearchQuery {

    @w0(parameters = 1)
    public static final class None implements SearchQuery {
        public static final int $stable = 0;

        @NotNull
        public static final None INSTANCE = new None();

        private None() {
        }
    }

    @w0(parameters = 1)
    public static final class Query implements SearchQuery {
        public static final int $stable = 0;

        @NotNull
        private final String value;

        public Query(@NotNull String value) {
            Intrinsics.checkNotNullParameter(value, "value");
            this.value = value;
        }

        public static /* synthetic */ Query copy$default(Query query, String str, int i10, Object obj) {
            if ((i10 & 1) != 0) {
                str = query.value;
            }
            return query.copy(str);
        }

        @NotNull
        public final String component1() {
            return this.value;
        }

        @NotNull
        public final Query copy(@NotNull String value) {
            Intrinsics.checkNotNullParameter(value, "value");
            return new Query(value);
        }

        public boolean equals(@Nullable Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof Query) && Intrinsics.areEqual(this.value, ((Query) obj).value);
        }

        @NotNull
        public final String getValue() {
            return this.value;
        }

        public int hashCode() {
            return this.value.hashCode();
        }

        @NotNull
        public String toString() {
            return "Query(value=" + this.value + ')';
        }
    }
}
