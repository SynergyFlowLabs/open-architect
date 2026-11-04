package com.devtodev.analytics.internal.backend.repository;

import com.devtodev.analytics.internal.backend.Identifiers;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes3.dex */
public final class BackendMessage {

    @NotNull
    private final String data;

    /* JADX INFO: renamed from: id, reason: collision with root package name */
    @NotNull
    private final Identifiers f98052id;

    public BackendMessage(@NotNull String data, @NotNull Identifiers id2) {
        Intrinsics.checkNotNullParameter(data, "data");
        Intrinsics.checkNotNullParameter(id2, "id");
        this.data = data;
        this.f98052id = id2;
    }

    public static /* synthetic */ BackendMessage copy$default(BackendMessage backendMessage, String str, Identifiers identifiers, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            str = backendMessage.data;
        }
        if ((i10 & 2) != 0) {
            identifiers = backendMessage.f98052id;
        }
        return backendMessage.copy(str, identifiers);
    }

    @NotNull
    public final String component1() {
        return this.data;
    }

    @NotNull
    public final Identifiers component2() {
        return this.f98052id;
    }

    @NotNull
    public final BackendMessage copy(@NotNull String data, @NotNull Identifiers id2) {
        Intrinsics.checkNotNullParameter(data, "data");
        Intrinsics.checkNotNullParameter(id2, "id");
        return new BackendMessage(data, id2);
    }

    public boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof BackendMessage)) {
            return false;
        }
        BackendMessage backendMessage = (BackendMessage) obj;
        return Intrinsics.areEqual(this.data, backendMessage.data) && Intrinsics.areEqual(this.f98052id, backendMessage.f98052id);
    }

    @NotNull
    public final String getData() {
        return this.data;
    }

    @NotNull
    public final Identifiers getId() {
        return this.f98052id;
    }

    public int hashCode() {
        return this.f98052id.hashCode() + (this.data.hashCode() * 31);
    }

    @NotNull
    public String toString() {
        return "BackendMessage(data=" + this.data + ", id=" + this.f98052id + ")";
    }
}
