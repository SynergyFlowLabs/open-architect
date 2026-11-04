package com.superwall.sdk.models.postback;

import com.superwall.sdk.models.SerializableEntity;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.b0;
import kotlinx.serialization.internal.g2;
import kotlinx.serialization.internal.v2;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes13.dex */
@b0
public final class PostBackResponse implements SerializableEntity {

    @NotNull
    public static final Companion Companion = new Companion(null);

    @NotNull
    private final String status;

    public static final class Companion {
        private Companion() {
        }

        @NotNull
        public final KSerializer<PostBackResponse> serializer() {
            return PostBackResponse$$serializer.INSTANCE;
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    public /* synthetic */ PostBackResponse(int i10, String str, v2 v2Var) {
        if (1 != (i10 & 1)) {
            g2.b(i10, 1, PostBackResponse$$serializer.INSTANCE.getDescriptor());
        }
        this.status = str;
    }

    public static /* synthetic */ PostBackResponse copy$default(PostBackResponse postBackResponse, String str, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            str = postBackResponse.status;
        }
        return postBackResponse.copy(str);
    }

    @NotNull
    public final String component1() {
        return this.status;
    }

    @NotNull
    public final PostBackResponse copy(@NotNull String status) {
        Intrinsics.checkNotNullParameter(status, "status");
        return new PostBackResponse(status);
    }

    public boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof PostBackResponse) && Intrinsics.areEqual(this.status, ((PostBackResponse) obj).status);
    }

    @NotNull
    public final String getStatus() {
        return this.status;
    }

    public int hashCode() {
        return this.status.hashCode();
    }

    @NotNull
    public String toString() {
        return "PostBackResponse(status=" + this.status + ")";
    }

    public PostBackResponse(@NotNull String status) {
        Intrinsics.checkNotNullParameter(status, "status");
        this.status = status;
    }
}
