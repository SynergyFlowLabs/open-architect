package io.customer.messaginginapp.gist.utilities;

import eh.d;
import ih.e;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes13.dex */
public final class ElapsedTimer {
    private long startTime;

    @NotNull
    private String title = "";

    @NotNull
    private final e logger = d.f274883c.w();

    public final void end() {
        if (this.startTime > 0) {
            double dCurrentTimeMillis = (System.currentTimeMillis() - this.startTime) / 1000.0d;
            e.a.a(this.logger, "Timer ended for " + this.title + " in " + dCurrentTimeMillis + " seconds", null, 2, null);
            this.startTime = 0L;
        }
    }

    public final void start(@NotNull String title) {
        Intrinsics.checkNotNullParameter(title, "title");
        this.title = title;
        this.startTime = System.currentTimeMillis();
        e.a.a(this.logger, "Timer started for " + title, null, 2, null);
    }
}
