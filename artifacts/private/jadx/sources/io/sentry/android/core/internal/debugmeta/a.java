package io.sentry.android.core.internal.debugmeta;

import android.content.Context;
import io.sentry.ILogger;
import io.sentry.android.core.a1;
import io.sentry.util.e;
import io.sentry.y7;
import java.io.BufferedInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Collections;
import java.util.List;
import java.util.Properties;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes11.dex */
@lm.a.c
public final class a implements io.sentry.internal.debugmeta.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    private final Context f304210a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NotNull
    private final ILogger f304211b;

    public a(@NotNull Context context, @NotNull ILogger iLogger) {
        this.f304210a = a1.g(context);
        this.f304211b = iLogger;
    }

    @Override // io.sentry.internal.debugmeta.a
    @Nullable
    public List<Properties> a() {
        try {
            BufferedInputStream bufferedInputStream = new BufferedInputStream(this.f304210a.getAssets().open(e.f306952a));
            try {
                Properties properties = new Properties();
                properties.load(bufferedInputStream);
                List<Properties> listSingletonList = Collections.singletonList(properties);
                bufferedInputStream.close();
                return listSingletonList;
            } catch (Throwable th2) {
                try {
                    bufferedInputStream.close();
                } catch (Throwable th3) {
                    th2.addSuppressed(th3);
                }
                throw th2;
            }
        } catch (FileNotFoundException unused) {
            this.f304211b.c(y7.INFO, "%s file was not found.", e.f306952a);
            return null;
        } catch (IOException e10) {
            this.f304211b.a(y7.ERROR, "Error getting Proguard UUIDs.", e10);
            return null;
        } catch (RuntimeException e11) {
            this.f304211b.b(y7.ERROR, e11, "%s file is malformed.", e.f306952a);
            return null;
        }
    }
}
