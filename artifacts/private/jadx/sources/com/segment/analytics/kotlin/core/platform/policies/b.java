package com.segment.analytics.kotlin.core.platform.policies;

import com.segment.analytics.kotlin.core.BaseEvent;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes13.dex */
public interface b {

    public static final class a {
        public static void a(@NotNull b bVar) {
        }

        public static void b(@NotNull b bVar, @NotNull com.segment.analytics.kotlin.core.a analytics) {
            Intrinsics.checkNotNullParameter(analytics, "analytics");
        }

        public static void c(@NotNull b bVar) {
        }

        public static void d(@NotNull b bVar, @NotNull BaseEvent event) {
            Intrinsics.checkNotNullParameter(event, "event");
        }
    }

    boolean a();

    void b(@NotNull com.segment.analytics.kotlin.core.a aVar);

    void c(@NotNull BaseEvent baseEvent);

    void d();

    void reset();
}
