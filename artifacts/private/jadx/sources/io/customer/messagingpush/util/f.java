package io.customer.messagingpush.util;

import android.app.NotificationChannel;
import android.app.NotificationManager;
import android.content.Context;
import android.os.Bundle;
import androidx.annotation.l1;
import androidx.annotation.w0;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes13.dex */
public final class f {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @NotNull
    public static final a f288469c = new a(null);

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @NotNull
    public static final String f288470d = "io.customer.notification_channel_id";

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    @NotNull
    public static final String f288471e = "io.customer.notification_channel_name";

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    @NotNull
    public static final String f288472f = "io.customer.notification_channel_importance";

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    private final io.customer.messagingpush.util.a f288473a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NotNull
    private final bh.a f288474b;

    public static final class a {
        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @l1
        public static /* synthetic */ void a() {
        }

        @l1
        public static /* synthetic */ void b() {
        }

        @l1
        public static /* synthetic */ void c() {
        }

        private a() {
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public f() {
        this(null, 0 == true ? 1 : 0, 3, 0 == true ? 1 : 0);
    }

    @w0(24)
    private final int b(int i10) {
        if (i10 == 0 || i10 == 1 || i10 == 2 || i10 == 3 || i10 == 4 || i10 == 5) {
            return i10;
        }
        this.f288474b.l(i10);
        return 3;
    }

    @NotNull
    public final String a(@NotNull Context context, @NotNull String applicationName, @Nullable Bundle bundle, @NotNull NotificationManager notificationManager) {
        String strB;
        String strB2;
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(applicationName, "applicationName");
        Intrinsics.checkNotNullParameter(notificationManager, "notificationManager");
        String packageName = context.getPackageName();
        if (bundle != null && (strB2 = ah.a.b(bundle, f288470d)) != null) {
            packageName = strB2;
        }
        if (this.f288473a.a()) {
            NotificationChannel notificationChannel = notificationManager.getNotificationChannel(packageName);
            if (bundle == null || (strB = ah.a.b(bundle, f288471e)) == null) {
                strB = applicationName + " Notifications";
            }
            int iB = b(bundle != null ? bundle.getInt(f288472f, 3) : 3);
            if (notificationChannel == null || !Intrinsics.areEqual(notificationChannel.getName(), strB)) {
                bh.a aVar = this.f288474b;
                Intrinsics.checkNotNull(packageName);
                aVar.a(packageName, strB, iB);
                notificationManager.createNotificationChannel(new NotificationChannel(packageName, strB, iB));
            } else {
                bh.a aVar2 = this.f288474b;
                Intrinsics.checkNotNull(packageName);
                aVar2.n(packageName);
            }
        }
        Intrinsics.checkNotNull(packageName);
        return packageName;
    }

    public f(@NotNull io.customer.messagingpush.util.a androidVersionChecker, @NotNull bh.a logger) {
        Intrinsics.checkNotNullParameter(androidVersionChecker, "androidVersionChecker");
        Intrinsics.checkNotNullParameter(logger, "logger");
        this.f288473a = androidVersionChecker;
        this.f288474b = logger;
    }

    public /* synthetic */ f(io.customer.messagingpush.util.a aVar, bh.a aVar2, int i10, DefaultConstructorMarker defaultConstructorMarker) {
        this((i10 & 1) != 0 ? new io.customer.messagingpush.util.a() : aVar, (i10 & 2) != 0 ? zg.c.i(eh.d.f274883c) : aVar2);
    }
}
