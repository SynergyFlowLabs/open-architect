package com.superwall.sdk.models.paywall;

import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.random.f;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.a0;
import kotlinx.serialization.b0;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.e;
import kotlinx.serialization.internal.b3;
import kotlinx.serialization.internal.g2;
import kotlinx.serialization.internal.v2;
import oj.n;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes13.dex */
@b0
public final class LocalNotification {

    @NotNull
    public static final Companion Companion = new Companion(null);

    @NotNull
    private final String body;
    private final long delay;

    /* JADX INFO: renamed from: id, reason: collision with root package name */
    private final int f267444id;

    @Nullable
    private final String subtitle;

    @NotNull
    private final String title;

    @NotNull
    private final LocalNotificationType type;

    public static final class Companion {
        private Companion() {
        }

        @NotNull
        public final KSerializer<LocalNotification> serializer() {
            return LocalNotification$$serializer.INSTANCE;
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    static {
        int i10 = 4 << 0;
    }

    public /* synthetic */ LocalNotification(int i10, int i11, LocalNotificationType localNotificationType, String str, String str2, String str3, long j10, v2 v2Var) {
        if (54 != (i10 & 54)) {
            g2.b(i10, 54, LocalNotification$$serializer.INSTANCE.getDescriptor());
        }
        this.f267444id = (i10 & 1) == 0 ? f.f312895a.l() : i11;
        this.type = localNotificationType;
        this.title = str;
        if ((i10 & 8) == 0) {
            this.subtitle = null;
        } else {
            this.subtitle = str2;
        }
        this.body = str3;
        this.delay = j10;
    }

    @a0("body")
    public static /* synthetic */ void getBody$annotations() {
    }

    @a0("delay")
    public static /* synthetic */ void getDelay$annotations() {
    }

    @a0("id")
    public static /* synthetic */ void getId$annotations() {
    }

    @a0("subtitle")
    public static /* synthetic */ void getSubtitle$annotations() {
    }

    @a0("title")
    public static /* synthetic */ void getTitle$annotations() {
    }

    @a0("type")
    public static /* synthetic */ void getType$annotations() {
    }

    @n
    public static final /* synthetic */ void write$Self$superwall_release(LocalNotification localNotification, e eVar, SerialDescriptor serialDescriptor) {
        if (eVar.shouldEncodeElementDefault(serialDescriptor, 0) || localNotification.f267444id != f.f312895a.l()) {
            eVar.encodeIntElement(serialDescriptor, 0, localNotification.f267444id);
        }
        eVar.encodeSerializableElement(serialDescriptor, 1, LocalNotificationTypeSerializer.INSTANCE, localNotification.type);
        eVar.encodeStringElement(serialDescriptor, 2, localNotification.title);
        if (eVar.shouldEncodeElementDefault(serialDescriptor, 3) || localNotification.subtitle != null) {
            eVar.encodeNullableSerializableElement(serialDescriptor, 3, b3.f315897a, localNotification.subtitle);
        }
        eVar.encodeStringElement(serialDescriptor, 4, localNotification.body);
        eVar.encodeLongElement(serialDescriptor, 5, localNotification.delay);
    }

    @NotNull
    public final String getBody() {
        return this.body;
    }

    public final long getDelay() {
        return this.delay;
    }

    public final int getId() {
        return this.f267444id;
    }

    @Nullable
    public final String getSubtitle() {
        return this.subtitle;
    }

    @NotNull
    public final String getTitle() {
        return this.title;
    }

    @NotNull
    public final LocalNotificationType getType() {
        return this.type;
    }

    public LocalNotification(int i10, @NotNull LocalNotificationType type, @NotNull String title, @Nullable String str, @NotNull String body, long j10) {
        Intrinsics.checkNotNullParameter(type, "type");
        Intrinsics.checkNotNullParameter(title, "title");
        Intrinsics.checkNotNullParameter(body, "body");
        this.f267444id = i10;
        this.type = type;
        this.title = title;
        this.subtitle = str;
        this.body = body;
        this.delay = j10;
    }

    public /* synthetic */ LocalNotification(int i10, LocalNotificationType localNotificationType, String str, String str2, String str3, long j10, int i11, DefaultConstructorMarker defaultConstructorMarker) {
        this((i11 & 1) != 0 ? f.f312895a.l() : i10, localNotificationType, str, (i11 & 8) != 0 ? null : str2, str3, j10);
    }
}
