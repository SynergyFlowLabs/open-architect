package com.google.android.gms.internal.stats;

import androidx.annotation.p0;
import java.io.Closeable;

/* JADX INFO: loaded from: classes4.dex */
public final class b implements Closeable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final b f109462a = new b(false, null);

    private b(boolean z10, @p0 d dVar) {
    }

    public static b a(boolean z10, @p0 c cVar) {
        return f109462a;
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
    }
}
