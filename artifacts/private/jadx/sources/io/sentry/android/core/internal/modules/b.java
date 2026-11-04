package io.sentry.android.core.internal.modules;

import android.content.Context;
import io.sentry.ILogger;
import io.sentry.android.core.a1;
import io.sentry.internal.modules.d;
import io.sentry.y7;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.util.Map;
import java.util.TreeMap;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes11.dex */
@lm.a.c
public final class b extends d {

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    @NotNull
    private final Context f304244f;

    public b(@NotNull Context context, @NotNull ILogger iLogger) {
        super(iLogger);
        this.f304244f = a1.g(context);
        new Thread(new Runnable() { // from class: io.sentry.android.core.internal.modules.a
            @Override // java.lang.Runnable
            public final void run() {
                this.f304243a.a();
            }
        }).start();
    }

    @Override // io.sentry.internal.modules.d
    protected Map<String, String> b() {
        TreeMap treeMap = new TreeMap();
        try {
            InputStream inputStreamOpen = this.f304244f.getAssets().open(d.f305632e);
            try {
                Map<String, String> mapC = c(inputStreamOpen);
                if (inputStreamOpen == null) {
                    return mapC;
                }
                inputStreamOpen.close();
                return mapC;
            } catch (Throwable th2) {
                if (inputStreamOpen != null) {
                    try {
                        inputStreamOpen.close();
                    } catch (Throwable th3) {
                        th2.addSuppressed(th3);
                    }
                }
                throw th2;
            }
        } catch (FileNotFoundException unused) {
            this.f305633a.c(y7.INFO, "%s file was not found.", d.f305632e);
            return treeMap;
        } catch (IOException e10) {
            this.f305633a.a(y7.ERROR, "Error extracting modules.", e10);
            return treeMap;
        }
    }
}
