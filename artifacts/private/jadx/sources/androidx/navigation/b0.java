package androidx.navigation;

import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes3.dex */
public final class b0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    private final String f70630a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NotNull
    private final j0 f70631b;

    public b0(@NotNull String name, @NotNull j0 argument) {
        Intrinsics.checkNotNullParameter(name, "name");
        Intrinsics.checkNotNullParameter(argument, "argument");
        this.f70630a = name;
        this.f70631b = argument;
    }

    @NotNull
    public final String a() {
        return this.f70630a;
    }

    @NotNull
    public final j0 b() {
        return this.f70631b;
    }

    @NotNull
    public final j0 c() {
        return this.f70631b;
    }

    @NotNull
    public final String d() {
        return this.f70630a;
    }
}
