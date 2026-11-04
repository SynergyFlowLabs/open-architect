package io.sentry.android.core.internal.util;

import io.sentry.y7;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes11.dex */
@lm.a.c
public class i {
    @NotNull
    public static io.sentry.f a(@NotNull String str) {
        io.sentry.f fVar = new io.sentry.f();
        fVar.Y(io.sentry.cache.f.f305178k);
        fVar.U("state", str);
        fVar.T("app.lifecycle");
        fVar.V(y7.INFO);
        return fVar;
    }
}
