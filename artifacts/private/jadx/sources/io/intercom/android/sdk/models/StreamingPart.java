package io.intercom.android.sdk.models;

import androidx.compose.runtime.internal.w0;
import com.google.gson.annotations.c;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes13.dex */
@w0(parameters = 0)
public final class StreamingPart {
    public static final int $stable = 8;

    @c("metadata")
    @Nullable
    private final Metadata metadata;

    /* JADX WARN: Multi-variable type inference failed */
    public StreamingPart() {
        this(null, 1, 0 == true ? 1 : 0);
    }

    public static /* synthetic */ StreamingPart copy$default(StreamingPart streamingPart, Metadata metadata, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            metadata = streamingPart.metadata;
        }
        return streamingPart.copy(metadata);
    }

    @Nullable
    public final Metadata component1() {
        return this.metadata;
    }

    @NotNull
    public final StreamingPart copy(@Nullable Metadata metadata) {
        return new StreamingPart(metadata);
    }

    public boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof StreamingPart) && Intrinsics.areEqual(this.metadata, ((StreamingPart) obj).metadata);
    }

    @Nullable
    public final Metadata getMetadata() {
        return this.metadata;
    }

    public int hashCode() {
        Metadata metadata = this.metadata;
        if (metadata == null) {
            return 0;
        }
        return metadata.hashCode();
    }

    @NotNull
    public String toString() {
        return "StreamingPart(metadata=" + this.metadata + ')';
    }

    public StreamingPart(@Nullable Metadata metadata) {
        this.metadata = metadata;
    }

    public /* synthetic */ StreamingPart(Metadata metadata, int i10, DefaultConstructorMarker defaultConstructorMarker) {
        this((i10 & 1) != 0 ? null : metadata);
    }
}
