package io.sentry.android.core;

import io.sentry.protocol.DebugImage;
import java.util.List;
import java.util.Set;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes11.dex */
final class y1 implements l1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final y1 f304619a = new y1();

    private y1() {
    }

    public static y1 d() {
        return f304619a;
    }

    @Override // io.sentry.android.core.l1
    @Nullable
    public Set<DebugImage> a(Set<String> set) {
        return null;
    }

    @Override // io.sentry.android.core.l1
    @Nullable
    public List<DebugImage> b() {
        return null;
    }

    @Override // io.sentry.android.core.l1
    public void c() {
    }
}
