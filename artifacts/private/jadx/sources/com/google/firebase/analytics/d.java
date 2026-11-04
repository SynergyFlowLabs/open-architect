package com.google.firebase.analytics;

import android.os.Bundle;
import androidx.annotation.NonNull;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes5.dex */
public final class d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    private final Bundle f120731a = new Bundle();

    @NotNull
    public final Bundle a() {
        return this.f120731a;
    }

    public final void b(@NonNull String key, double d10) {
        Intrinsics.checkNotNullParameter(key, "key");
        this.f120731a.putDouble(key, d10);
    }

    public final void c(@NonNull String key, long j10) {
        Intrinsics.checkNotNullParameter(key, "key");
        this.f120731a.putLong(key, j10);
    }

    public final void d(@NonNull String key, @NonNull Bundle value) {
        Intrinsics.checkNotNullParameter(key, "key");
        Intrinsics.checkNotNullParameter(value, "value");
        this.f120731a.putBundle(key, value);
    }

    public final void e(@NonNull String key, @NonNull String value) {
        Intrinsics.checkNotNullParameter(key, "key");
        Intrinsics.checkNotNullParameter(value, "value");
        this.f120731a.putString(key, value);
    }

    public final void f(@NonNull String key, @NonNull Bundle[] value) {
        Intrinsics.checkNotNullParameter(key, "key");
        Intrinsics.checkNotNullParameter(value, "value");
        this.f120731a.putParcelableArray(key, value);
    }
}
