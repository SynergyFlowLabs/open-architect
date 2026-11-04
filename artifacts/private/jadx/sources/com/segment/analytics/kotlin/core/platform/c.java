package com.segment.analytics.kotlin.core.platform;

import com.segment.analytics.kotlin.core.AliasEvent;
import com.segment.analytics.kotlin.core.BaseEvent;
import com.segment.analytics.kotlin.core.GroupEvent;
import com.segment.analytics.kotlin.core.IdentifyEvent;
import com.segment.analytics.kotlin.core.ScreenEvent;
import com.segment.analytics.kotlin.core.Settings;
import com.segment.analytics.kotlin.core.TrackEvent;
import kotlin.jvm.internal.Intrinsics;
import kotlin.k0;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes13.dex */
public interface c extends e {

    public static final class a {
        @Nullable
        public static BaseEvent a(@NotNull c cVar, @NotNull AliasEvent payload) {
            Intrinsics.checkNotNullParameter(payload, "payload");
            return payload;
        }

        @Nullable
        public static BaseEvent b(@NotNull c cVar, @NotNull BaseEvent event) {
            Intrinsics.checkNotNullParameter(event, "event");
            if (event instanceof IdentifyEvent) {
                return cVar.d((IdentifyEvent) event);
            }
            if (event instanceof TrackEvent) {
                return cVar.g((TrackEvent) event);
            }
            if (event instanceof GroupEvent) {
                return cVar.k((GroupEvent) event);
            }
            if (event instanceof ScreenEvent) {
                return cVar.h((ScreenEvent) event);
            }
            if (event instanceof AliasEvent) {
                return cVar.l((AliasEvent) event);
            }
            throw new k0();
        }

        public static void c(@NotNull c cVar) {
        }

        @Nullable
        public static BaseEvent d(@NotNull c cVar, @NotNull GroupEvent payload) {
            Intrinsics.checkNotNullParameter(payload, "payload");
            return payload;
        }

        @Nullable
        public static BaseEvent e(@NotNull c cVar, @NotNull IdentifyEvent payload) {
            Intrinsics.checkNotNullParameter(payload, "payload");
            return payload;
        }

        public static void f(@NotNull c cVar) {
        }

        @Nullable
        public static BaseEvent g(@NotNull c cVar, @NotNull ScreenEvent payload) {
            Intrinsics.checkNotNullParameter(payload, "payload");
            return payload;
        }

        public static void h(@NotNull c cVar, @NotNull com.segment.analytics.kotlin.core.a analytics) {
            Intrinsics.checkNotNullParameter(analytics, "analytics");
            e.a.b(cVar, analytics);
        }

        @Nullable
        public static BaseEvent i(@NotNull c cVar, @NotNull TrackEvent payload) {
            Intrinsics.checkNotNullParameter(payload, "payload");
            return payload;
        }

        public static void j(@NotNull c cVar, @NotNull Settings settings, @NotNull e.c type) {
            Intrinsics.checkNotNullParameter(settings, "settings");
            Intrinsics.checkNotNullParameter(type, "type");
            e.a.c(cVar, settings, type);
        }
    }

    @Override // com.segment.analytics.kotlin.core.platform.e
    @Nullable
    BaseEvent a(@NotNull BaseEvent baseEvent);

    @Nullable
    BaseEvent d(@NotNull IdentifyEvent identifyEvent);

    void flush();

    @Nullable
    BaseEvent g(@NotNull TrackEvent trackEvent);

    @Nullable
    BaseEvent h(@NotNull ScreenEvent screenEvent);

    @Nullable
    BaseEvent k(@NotNull GroupEvent groupEvent);

    @Nullable
    BaseEvent l(@NotNull AliasEvent aliasEvent);

    void reset();
}
