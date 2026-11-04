package com.google.android.datatransport.runtime;

import android.content.Context;
import java.io.Closeable;
import java.io.IOException;

/* JADX INFO: loaded from: classes4.dex */
@y5.c(modules = {com.google.android.datatransport.runtime.backends.f.class, com.google.android.datatransport.runtime.scheduling.persistence.f.class, k.class, com.google.android.datatransport.runtime.scheduling.h.class, com.google.android.datatransport.runtime.scheduling.f.class, com.google.android.datatransport.runtime.time.d.class})
@ij.f
abstract class x implements Closeable {

    @y5.c.a
    interface a {
        @y5.b
        a a(Context context);

        x build();
    }

    x() {
    }

    abstract com.google.android.datatransport.runtime.scheduling.persistence.d a();

    abstract w b();

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public void close() throws IOException {
        a().close();
    }
}
