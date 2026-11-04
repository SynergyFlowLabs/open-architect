package com.segment.analytics.kotlin.core;

import androidx.media3.extractor.y0;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes13.dex */
public final class c {
    @NotNull
    public static final a a(@NotNull String writeKey, @NotNull Function1<? super f, Unit> configs) {
        Intrinsics.checkNotNullParameter(writeKey, "writeKey");
        Intrinsics.checkNotNullParameter(configs, "configs");
        if (b()) {
            throw new IllegalStateException("Using JVM Analytics initializer in Android platform. Context is required in constructor!");
        }
        f fVar = new f(writeKey, null, null, false, false, false, false, 0, 0, null, null, false, null, null, null, null, y0.f69665l, null);
        configs.invoke(fVar);
        return new a(fVar);
    }

    public static final boolean b() {
        return true;
    }
}
