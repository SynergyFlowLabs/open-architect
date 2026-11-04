package com.superwall.sdk.models.internal;

import com.superwall.sdk.models.internal.RedemptionOwnership;
import java.lang.annotation.Annotation;
import kotlin.f0;
import kotlin.g0;
import kotlin.j0;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.j1;
import kotlin.reflect.d;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.a0;
import kotlinx.serialization.b0;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.e;
import kotlinx.serialization.internal.g2;
import kotlinx.serialization.internal.v2;
import kotlinx.serialization.json.JsonClassDiscriminator;
import kotlinx.serialization.v;
import oj.n;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes13.dex */
@JsonClassDiscriminator(discriminator = "type")
@b0
public abstract class RedemptionOwnership {

    @NotNull
    public static final Companion Companion = new Companion(null);

    @NotNull
    private static final f0<KSerializer<Object>> $cachedSerializer$delegate = g0.b(j0.PUBLICATION, new Function0() { // from class: yf.c
        @Override // kotlin.jvm.functions.Function0
        public final Object invoke() {
            return RedemptionOwnership._init_$_anonymous_();
        }
    });

    @b0
    @a0("APP_USER")
    public static final class AppUser extends RedemptionOwnership {

        @NotNull
        public static final Companion Companion = new Companion(null);

        @NotNull
        private final String appUserId;

        public static final class Companion {
            private Companion() {
            }

            @NotNull
            public final KSerializer<AppUser> serializer() {
                return RedemptionOwnership$AppUser$$serializer.INSTANCE;
            }

            public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public /* synthetic */ AppUser(int i10, String str, v2 v2Var) {
            super(i10, v2Var);
            if (1 != (i10 & 1)) {
                g2.b(i10, 1, RedemptionOwnership$AppUser$$serializer.INSTANCE.getDescriptor());
            }
            this.appUserId = str;
        }

        public static /* synthetic */ AppUser copy$default(AppUser appUser, String str, int i10, Object obj) {
            if ((i10 & 1) != 0) {
                str = appUser.appUserId;
            }
            return appUser.copy(str);
        }

        @a0("appUserId")
        public static /* synthetic */ void getAppUserId$annotations() {
        }

        @n
        public static final /* synthetic */ void write$Self$superwall_release(AppUser appUser, e eVar, SerialDescriptor serialDescriptor) {
            RedemptionOwnership.write$Self(appUser, eVar, serialDescriptor);
            eVar.encodeStringElement(serialDescriptor, 0, appUser.appUserId);
        }

        @NotNull
        public final String component1() {
            return this.appUserId;
        }

        @NotNull
        public final AppUser copy(@NotNull String appUserId) {
            Intrinsics.checkNotNullParameter(appUserId, "appUserId");
            return new AppUser(appUserId);
        }

        public boolean equals(@Nullable Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof AppUser) && Intrinsics.areEqual(this.appUserId, ((AppUser) obj).appUserId);
        }

        @NotNull
        public final String getAppUserId() {
            return this.appUserId;
        }

        public int hashCode() {
            return this.appUserId.hashCode();
        }

        @NotNull
        public String toString() {
            return "AppUser(appUserId=" + this.appUserId + ")";
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AppUser(@NotNull String appUserId) {
            super(null);
            Intrinsics.checkNotNullParameter(appUserId, "appUserId");
            this.appUserId = appUserId;
        }
    }

    public static final class Companion {
        private Companion() {
        }

        private final /* synthetic */ KSerializer get$cachedSerializer() {
            return (KSerializer) RedemptionOwnership.$cachedSerializer$delegate.getValue();
        }

        @NotNull
        public final KSerializer<RedemptionOwnership> serializer() {
            return get$cachedSerializer();
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    @b0
    @a0("DEVICE")
    public static final class Device extends RedemptionOwnership {

        @NotNull
        public static final Companion Companion = new Companion(null);

        @NotNull
        private final String deviceId;

        public static final class Companion {
            private Companion() {
            }

            @NotNull
            public final KSerializer<Device> serializer() {
                return RedemptionOwnership$Device$$serializer.INSTANCE;
            }

            public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public /* synthetic */ Device(int i10, String str, v2 v2Var) {
            super(i10, v2Var);
            if (1 != (i10 & 1)) {
                g2.b(i10, 1, RedemptionOwnership$Device$$serializer.INSTANCE.getDescriptor());
            }
            this.deviceId = str;
        }

        public static /* synthetic */ Device copy$default(Device device, String str, int i10, Object obj) {
            if ((i10 & 1) != 0) {
                str = device.deviceId;
            }
            return device.copy(str);
        }

        @a0("deviceId")
        public static /* synthetic */ void getDeviceId$annotations() {
        }

        @n
        public static final /* synthetic */ void write$Self$superwall_release(Device device, e eVar, SerialDescriptor serialDescriptor) {
            RedemptionOwnership.write$Self(device, eVar, serialDescriptor);
            eVar.encodeStringElement(serialDescriptor, 0, device.deviceId);
        }

        @NotNull
        public final String component1() {
            return this.deviceId;
        }

        @NotNull
        public final Device copy(@NotNull String deviceId) {
            Intrinsics.checkNotNullParameter(deviceId, "deviceId");
            return new Device(deviceId);
        }

        public boolean equals(@Nullable Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof Device) && Intrinsics.areEqual(this.deviceId, ((Device) obj).deviceId);
        }

        @NotNull
        public final String getDeviceId() {
            return this.deviceId;
        }

        public int hashCode() {
            return this.deviceId.hashCode();
        }

        @NotNull
        public String toString() {
            return "Device(deviceId=" + this.deviceId + ")";
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public Device(@NotNull String deviceId) {
            super(null);
            Intrinsics.checkNotNullParameter(deviceId, "deviceId");
            this.deviceId = deviceId;
        }
    }

    public /* synthetic */ RedemptionOwnership(DefaultConstructorMarker defaultConstructorMarker) {
        this();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final /* synthetic */ KSerializer _init_$_anonymous_() {
        return new v("com.superwall.sdk.models.internal.RedemptionOwnership", j1.d(RedemptionOwnership.class), new d[]{j1.d(AppUser.class), j1.d(Device.class)}, new KSerializer[]{RedemptionOwnership$AppUser$$serializer.INSTANCE, RedemptionOwnership$Device$$serializer.INSTANCE}, new Annotation[]{new RedemptionResult$Error$$serializer$annotationImpl$kotlinx_serialization_json_JsonClassDiscriminator$0("type")});
    }

    @n
    public static final /* synthetic */ void write$Self(RedemptionOwnership redemptionOwnership, e eVar, SerialDescriptor serialDescriptor) {
    }

    private RedemptionOwnership() {
    }

    public /* synthetic */ RedemptionOwnership(int i10, v2 v2Var) {
    }
}
