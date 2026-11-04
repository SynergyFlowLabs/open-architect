package kf;

import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes8.dex */
public enum e {
    Blue("blue", -7680779),
    Orange("orange", -1937361),
    Yellow("yellow", -603318),
    Purple("purple", -1541720),
    Green("green", -10174608);


    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    private final String f312212a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final int f312213b;

    e(String str, int i10) {
        this.f312212a = str;
        this.f312213b = i10;
    }

    @NotNull
    public final String l() {
        return this.f312212a;
    }

    public final int n() {
        return this.f312213b;
    }
}
