package com.devtodev.analytics.internal.domain.events.progressionEvent;

import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes3.dex */
public final class Location {

    @Nullable
    private final Integer difficulty;

    @NotNull
    private final String name;

    @Nullable
    private final String source;
    private final long timestamp;

    public Location(@NotNull String name, @Nullable String str, @Nullable Integer num) {
        Intrinsics.checkNotNullParameter(name, "name");
        this.name = name;
        this.source = str;
        this.difficulty = num;
        this.timestamp = System.currentTimeMillis();
    }

    public static /* synthetic */ Location copy$default(Location location, String str, String str2, Integer num, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            str = location.name;
        }
        if ((i10 & 2) != 0) {
            str2 = location.source;
        }
        if ((i10 & 4) != 0) {
            num = location.difficulty;
        }
        return location.copy(str, str2, num);
    }

    @NotNull
    public final String component1() {
        return this.name;
    }

    @Nullable
    public final String component2() {
        return this.source;
    }

    @Nullable
    public final Integer component3() {
        return this.difficulty;
    }

    @NotNull
    public final Location copy(@NotNull String name, @Nullable String str, @Nullable Integer num) {
        Intrinsics.checkNotNullParameter(name, "name");
        return new Location(name, str, num);
    }

    public boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof Location)) {
            return false;
        }
        Location location = (Location) obj;
        if (Intrinsics.areEqual(this.name, location.name) && Intrinsics.areEqual(this.source, location.source) && Intrinsics.areEqual(this.difficulty, location.difficulty)) {
            return true;
        }
        return false;
    }

    @Nullable
    public final Integer getDifficulty() {
        return this.difficulty;
    }

    @NotNull
    public final String getName() {
        return this.name;
    }

    @Nullable
    public final String getSource() {
        return this.source;
    }

    public final long getTimestamp() {
        return this.timestamp;
    }

    public int hashCode() {
        int iHashCode = this.name.hashCode() * 31;
        String str = this.source;
        int iHashCode2 = (iHashCode + (str == null ? 0 : str.hashCode())) * 31;
        Integer num = this.difficulty;
        return iHashCode2 + (num != null ? num.hashCode() : 0);
    }

    @NotNull
    public String toString() {
        return "Location(name=" + this.name + ", source=" + this.source + ", difficulty=" + this.difficulty + ")";
    }
}
