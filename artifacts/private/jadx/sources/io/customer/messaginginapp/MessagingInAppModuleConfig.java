package io.customer.messaginginapp;

import hh.b;
import io.customer.messaginginapp.type.InAppEventListener;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes13.dex */
public final class MessagingInAppModuleConfig implements b {

    @Nullable
    private final InAppEventListener eventListener;

    @NotNull
    private final jh.b region;

    @NotNull
    private final String siteId;

    public static final class Builder implements b.a<MessagingInAppModuleConfig> {

        @Nullable
        private InAppEventListener eventListener;

        @NotNull
        private final jh.b region;

        @NotNull
        private final String siteId;

        public Builder(@NotNull String siteId, @NotNull jh.b region) {
            Intrinsics.checkNotNullParameter(siteId, "siteId");
            Intrinsics.checkNotNullParameter(region, "region");
            this.siteId = siteId;
            this.region = region;
        }

        @NotNull
        public final Builder setEventListener(@NotNull InAppEventListener eventListener) {
            Intrinsics.checkNotNullParameter(eventListener, "eventListener");
            this.eventListener = eventListener;
            return this;
        }

        @Override // hh.b.a
        @NotNull
        public MessagingInAppModuleConfig build() {
            return new MessagingInAppModuleConfig(this.siteId, this.region, this.eventListener, null);
        }
    }

    public /* synthetic */ MessagingInAppModuleConfig(String str, jh.b bVar, InAppEventListener inAppEventListener, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, bVar, inAppEventListener);
    }

    @Nullable
    public final InAppEventListener getEventListener() {
        return this.eventListener;
    }

    @NotNull
    public final jh.b getRegion() {
        return this.region;
    }

    @NotNull
    public final String getSiteId() {
        return this.siteId;
    }

    private MessagingInAppModuleConfig(String str, jh.b bVar, InAppEventListener inAppEventListener) {
        this.siteId = str;
        this.region = bVar;
        this.eventListener = inAppEventListener;
    }
}
