package io.customer.sdk.data.store;

import android.content.Context;
import android.content.SharedPreferences;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes13.dex */
public abstract class m {

    @NotNull
    private final Context context;

    public m(@NotNull Context context) {
        Intrinsics.checkNotNullParameter(context, "context");
        this.context = context;
    }

    public void clear(@NotNull String key) {
        Intrinsics.checkNotNullParameter(key, "key");
        getPrefs().edit().remove(key).apply();
    }

    public void clearAll() {
        getPrefs().edit().clear().apply();
    }

    @NotNull
    public final Context getContext() {
        return this.context;
    }

    @NotNull
    protected final SharedPreferences getPrefs() {
        SharedPreferences sharedPreferences = this.context.getApplicationContext().getSharedPreferences(getPrefsName(), 0);
        Intrinsics.checkNotNullExpressionValue(sharedPreferences, "getSharedPreferences(...)");
        return sharedPreferences;
    }

    @NotNull
    public abstract String getPrefsName();
}
