package io.intercom.android.sdk.ui.extension;

import android.os.Bundle;
import android.os.Parcelable;
import androidx.core.os.d;
import androidx.navigation.n0;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes13.dex */
public final class NavBackStackEntryExtensionKt {
    @NotNull
    public static final <T extends Parcelable> T getParcelableObject(@NotNull n0 n0Var, @NotNull String key, @NotNull Class<T> clazz, @NotNull T defaultValue) {
        T t10;
        Intrinsics.checkNotNullParameter(n0Var, "<this>");
        Intrinsics.checkNotNullParameter(key, "key");
        Intrinsics.checkNotNullParameter(clazz, "clazz");
        Intrinsics.checkNotNullParameter(defaultValue, "defaultValue");
        Bundle bundleB = n0Var.b();
        return (bundleB == null || (t10 = (T) d.b(bundleB, key, clazz)) == null) ? defaultValue : t10;
    }
}
