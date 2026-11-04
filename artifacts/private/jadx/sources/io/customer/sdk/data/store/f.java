package io.customer.sdk.data.store;

import android.os.Build;
import java.util.Locale;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes13.dex */
public final class f implements e {
    @Override // io.customer.sdk.data.store.e
    @Nullable
    public Integer c() {
        return Integer.valueOf(Build.VERSION.SDK_INT);
    }

    @Override // io.customer.sdk.data.store.e
    @Nullable
    public String d() {
        return Build.MANUFACTURER;
    }

    @Override // io.customer.sdk.data.store.e
    @Nullable
    public String f() {
        return Build.BRAND;
    }

    @Override // io.customer.sdk.data.store.e
    @Nullable
    public String i() {
        return Build.MODEL;
    }

    @Override // io.customer.sdk.data.store.e
    @Nullable
    public String k() {
        return Locale.getDefault().toLanguageTag();
    }
}
