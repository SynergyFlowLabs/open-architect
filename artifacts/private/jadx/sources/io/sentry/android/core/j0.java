package io.sentry.android.core;

import io.sentry.n8;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes11.dex */
final class j0 implements io.sentry.transport.r {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    private final n8 f304356a;

    static /* synthetic */ class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        static final /* synthetic */ int[] f304357a;

        static {
            int[] iArr = new int[io.sentry.u0.a.values().length];
            f304357a = iArr;
            try {
                iArr[io.sentry.u0.a.CONNECTED.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f304357a[io.sentry.u0.a.UNKNOWN.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f304357a[io.sentry.u0.a.NO_PERMISSION.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
        }
    }

    j0(@NotNull n8 n8Var) {
        this.f304356a = n8Var;
    }

    @lm.n
    boolean a(@NotNull io.sentry.u0.a aVar) {
        int i10 = a.f304357a[aVar.ordinal()];
        return i10 == 1 || i10 == 2 || i10 == 3;
    }

    @Override // io.sentry.transport.r
    public boolean isConnected() {
        return a(this.f304356a.getConnectionStatusProvider().L3());
    }
}
