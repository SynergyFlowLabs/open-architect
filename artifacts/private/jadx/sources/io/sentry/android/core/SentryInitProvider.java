package io.sentry.android.core;

import android.content.Context;
import android.content.pm.ProviderInfo;
import android.net.Uri;
import io.sentry.t5;
import io.sentry.w7;
import io.sentry.y7;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes11.dex */
@lm.a.c
public final class SentryInitProvider extends i1 {
    @Override // android.content.ContentProvider
    public void attachInfo(@NotNull Context context, @NotNull ProviderInfo providerInfo) {
        if (SentryInitProvider.class.getName().equals(providerInfo.authority)) {
            throw new IllegalStateException("An applicationId is required to fulfill the manifest placeholder.");
        }
        super.attachInfo(context, providerInfo);
    }

    @Override // android.content.ContentProvider
    @Nullable
    public String getType(@NotNull Uri uri) {
        return null;
    }

    @Override // android.content.ContentProvider
    public boolean onCreate() {
        y yVar = new y();
        Context context = getContext();
        if (context == null) {
            yVar.c(y7.FATAL, "App. Context from ContentProvider is null", new Object[0]);
            return false;
        }
        if (w1.c(context, yVar) && !a1.f(context)) {
            g2.f(context, yVar);
            w7.e().a("AutoInit");
        }
        return true;
    }

    @Override // android.content.ContentProvider
    public void shutdown() {
        t5.E();
    }
}
