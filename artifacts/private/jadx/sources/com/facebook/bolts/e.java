package com.facebook.bolts;

import android.content.Intent;
import android.os.Bundle;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes4.dex */
public final class e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    public static final e f99328a = new e();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NotNull
    public static final String f99329b = "al_applink_data";

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @NotNull
    public static final String f99330c = "extras";

    private e() {
    }

    @oj.n
    @Nullable
    public static final Bundle a(@NotNull Intent intent) {
        Intrinsics.checkNotNullParameter(intent, "intent");
        return intent.getBundleExtra(f99329b);
    }

    @oj.n
    @Nullable
    public static final Bundle b(@NotNull Intent intent) {
        Intrinsics.checkNotNullParameter(intent, "intent");
        Bundle bundleA = a(intent);
        if (bundleA == null) {
            return null;
        }
        return bundleA.getBundle(f99330c);
    }
}
