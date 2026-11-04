package io.sentry.util;

import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes11.dex */
public final class f0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    private static final b f306953a = new b();

    private static class b extends ThreadLocal<c0> {
        private b() {
        }

        /* JADX INFO: Access modifiers changed from: protected */
        @Override // java.lang.ThreadLocal
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public c0 initialValue() {
            return new c0();
        }
    }

    @NotNull
    public static c0 a() {
        return f306953a.get();
    }
}
