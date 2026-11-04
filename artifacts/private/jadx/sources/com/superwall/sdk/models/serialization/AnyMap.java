package com.superwall.sdk.models.serialization;

import java.util.Map;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.b0;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes13.dex */
@b0(with = AnyMapSerializer.class)
public final class AnyMap {

    @NotNull
    public static final Companion Companion = new Companion(null);

    @NotNull
    private final Map<String, Object> map;

    public static final class Companion {
        private Companion() {
        }

        @NotNull
        public final KSerializer<AnyMap> serializer() {
            return AnyMapSerializer.INSTANCE;
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    public AnyMap(@NotNull Map<String, ? extends Object> map) {
        Intrinsics.checkNotNullParameter(map, "map");
        this.map = map;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ AnyMap copy$default(AnyMap anyMap, Map map, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            map = anyMap.map;
        }
        return anyMap.copy(map);
    }

    @NotNull
    public final Map<String, Object> component1() {
        return this.map;
    }

    @NotNull
    public final AnyMap copy(@NotNull Map<String, ? extends Object> map) {
        Intrinsics.checkNotNullParameter(map, "map");
        return new AnyMap(map);
    }

    public boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof AnyMap) && Intrinsics.areEqual(this.map, ((AnyMap) obj).map);
    }

    @NotNull
    public final Map<String, Object> getMap() {
        return this.map;
    }

    public int hashCode() {
        return this.map.hashCode();
    }

    @NotNull
    public String toString() {
        return "AnyMap(map=" + this.map + ")";
    }
}
