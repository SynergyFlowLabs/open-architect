package com.segment.analytics.kotlin.core.platform;

import com.segment.analytics.kotlin.core.BaseEvent;
import com.segment.analytics.kotlin.core.Settings;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes13.dex */
public interface e {

    public static final class a {
        @Nullable
        public static BaseEvent a(@NotNull e eVar, @NotNull BaseEvent event) {
            Intrinsics.checkNotNullParameter(event, "event");
            return event;
        }

        public static void b(@NotNull e eVar, @NotNull com.segment.analytics.kotlin.core.a analytics) {
            Intrinsics.checkNotNullParameter(analytics, "analytics");
            eVar.f(analytics);
        }

        public static void c(@NotNull e eVar, @NotNull Settings settings, @NotNull c type) {
            Intrinsics.checkNotNullParameter(settings, "settings");
            Intrinsics.checkNotNullParameter(type, "type");
        }
    }

    public enum b {
        Before,
        Enrichment,
        Destination,
        After,
        Utility;

        static {
            int i10 = 7 << 2;
        }
    }

    public enum c {
        Initial,
        Refresh
    }

    @Nullable
    BaseEvent a(@NotNull BaseEvent baseEvent);

    void b(@NotNull com.segment.analytics.kotlin.core.a aVar);

    @NotNull
    b c();

    void f(@NotNull com.segment.analytics.kotlin.core.a aVar);

    void i(@NotNull Settings settings, @NotNull c cVar);

    @NotNull
    com.segment.analytics.kotlin.core.a j();
}
