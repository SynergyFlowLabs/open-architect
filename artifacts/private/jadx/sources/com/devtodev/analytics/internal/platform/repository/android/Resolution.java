package com.devtodev.analytics.internal.platform.repository.android;

import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes3.dex */
public final class Resolution {

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    private final int f98055x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    private final int f98056y;

    public Resolution(int i10, int i11) {
        this.f98055x = i10;
        this.f98056y = i11;
    }

    public static /* synthetic */ Resolution copy$default(Resolution resolution, int i10, int i11, int i12, Object obj) {
        if ((i12 & 1) != 0) {
            i10 = resolution.f98055x;
        }
        if ((i12 & 2) != 0) {
            i11 = resolution.f98056y;
        }
        return resolution.copy(i10, i11);
    }

    public final int component1() {
        return this.f98055x;
    }

    public final int component2() {
        return this.f98056y;
    }

    @NotNull
    public final Resolution copy(int i10, int i11) {
        return new Resolution(i10, i11);
    }

    public boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof Resolution)) {
            return false;
        }
        Resolution resolution = (Resolution) obj;
        return this.f98055x == resolution.f98055x && this.f98056y == resolution.f98056y;
    }

    public final int getX() {
        return this.f98055x;
    }

    public final int getY() {
        return this.f98056y;
    }

    public int hashCode() {
        return Integer.hashCode(this.f98056y) + (Integer.hashCode(this.f98055x) * 31);
    }

    @NotNull
    public String toString() {
        return "Resolution(x=" + this.f98055x + ", y=" + this.f98056y + ")";
    }
}
