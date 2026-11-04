package io.sentry.android.core.internal.util;

import android.content.ContentProvider;
import io.sentry.android.core.u0;
import io.sentry.c3;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes11.dex */
@lm.a.c
public final class k {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    private final u0 f304311a;

    public k() {
        this(new u0(c3.e()));
    }

    @e.a({"NewApi"})
    public void a(@NotNull ContentProvider contentProvider) {
        int iD = this.f304311a.d();
        if (iD < 26 || iD > 28) {
            return;
        }
        String callingPackage = contentProvider.getCallingPackage();
        String packageName = contentProvider.getContext().getPackageName();
        if (callingPackage == null || !callingPackage.equals(packageName)) {
            throw new SecurityException("Provider does not allow for granting of Uri permissions");
        }
    }

    public k(@NotNull u0 u0Var) {
        this.f304311a = u0Var;
    }
}
