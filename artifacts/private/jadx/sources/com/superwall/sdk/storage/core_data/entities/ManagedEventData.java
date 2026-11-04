package com.superwall.sdk.storage.core_data.entities;

import androidx.room.u;
import androidx.room.u0;
import java.util.Date;
import java.util.Map;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes13.dex */
@u
public final class ManagedEventData {

    @NotNull
    private final Date createdAt;

    /* JADX INFO: renamed from: id, reason: collision with root package name */
    @u0
    @NotNull
    private final String f267526id;

    @NotNull
    private final String name;

    @NotNull
    private final Map<String, Object> parameters;

    public ManagedEventData(@NotNull String id2, @NotNull Date createdAt, @NotNull String name, @NotNull Map<String, ? extends Object> parameters) {
        Intrinsics.checkNotNullParameter(id2, "id");
        Intrinsics.checkNotNullParameter(createdAt, "createdAt");
        Intrinsics.checkNotNullParameter(name, "name");
        Intrinsics.checkNotNullParameter(parameters, "parameters");
        this.f267526id = id2;
        this.createdAt = createdAt;
        this.name = name;
        this.parameters = parameters;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ ManagedEventData copy$default(ManagedEventData managedEventData, String str, Date date, String str2, Map map, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            str = managedEventData.f267526id;
        }
        if ((i10 & 2) != 0) {
            date = managedEventData.createdAt;
        }
        if ((i10 & 4) != 0) {
            str2 = managedEventData.name;
        }
        if ((i10 & 8) != 0) {
            map = managedEventData.parameters;
        }
        return managedEventData.copy(str, date, str2, map);
    }

    @NotNull
    public final String component1() {
        return this.f267526id;
    }

    @NotNull
    public final Date component2() {
        return this.createdAt;
    }

    @NotNull
    public final String component3() {
        return this.name;
    }

    @NotNull
    public final Map<String, Object> component4() {
        return this.parameters;
    }

    @NotNull
    public final ManagedEventData copy(@NotNull String id2, @NotNull Date createdAt, @NotNull String name, @NotNull Map<String, ? extends Object> parameters) {
        Intrinsics.checkNotNullParameter(id2, "id");
        Intrinsics.checkNotNullParameter(createdAt, "createdAt");
        Intrinsics.checkNotNullParameter(name, "name");
        Intrinsics.checkNotNullParameter(parameters, "parameters");
        return new ManagedEventData(id2, createdAt, name, parameters);
    }

    public boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ManagedEventData)) {
            return false;
        }
        ManagedEventData managedEventData = (ManagedEventData) obj;
        return Intrinsics.areEqual(this.f267526id, managedEventData.f267526id) && Intrinsics.areEqual(this.createdAt, managedEventData.createdAt) && Intrinsics.areEqual(this.name, managedEventData.name) && Intrinsics.areEqual(this.parameters, managedEventData.parameters);
    }

    @NotNull
    public final Date getCreatedAt() {
        return this.createdAt;
    }

    @NotNull
    public final String getId() {
        return this.f267526id;
    }

    @NotNull
    public final String getName() {
        return this.name;
    }

    @NotNull
    public final Map<String, Object> getParameters() {
        return this.parameters;
    }

    public int hashCode() {
        return (((((this.f267526id.hashCode() * 31) + this.createdAt.hashCode()) * 31) + this.name.hashCode()) * 31) + this.parameters.hashCode();
    }

    @NotNull
    public String toString() {
        return "ManagedEventData(id=" + this.f267526id + ", createdAt=" + this.createdAt + ", name=" + this.name + ", parameters=" + this.parameters + ")";
    }
}
