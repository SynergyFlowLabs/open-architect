package com.planner5d.library.model.manager;

import android.app.Notification;
import android.app.NotificationChannel;
import android.app.NotificationManager;
import android.content.Intent;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes7.dex */
@androidx.compose.runtime.internal.w0(parameters = 0)
@ij.f
@SourceDebugExtension({"SMAP\nNotificationManager.kt\nKotlin\n*S Kotlin\n*F\n+ 1 NotificationManager.kt\ncom/planner5d/library/model/manager/NotificationManager\n+ 2 _Arrays.kt\nkotlin/collections/ArraysKt___ArraysKt\n*L\n1#1,91:1\n13409#2,2:92\n*S KotlinDebug\n*F\n+ 1 NotificationManager.kt\ncom/planner5d/library/model/manager/NotificationManager\n*L\n50#1:92,2\n*E\n"})
public class j2 implements x1 {

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    @NotNull
    public static final b f191776g = new b(null);

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public static final int f191777h = 8;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public static final int f191778i = 6;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public static final int f191779j = 7;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public static final int f191780k = 8;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @NotNull
    private final com.planner5d.library.application.b f191781c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @NotNull
    private final fg.e<com.planner5d.library.services.download.a> f191782d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    @NotNull
    private final fg.e<com.planner5d.library.services.render.a> f191783e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    @NotNull
    private final fg.e<com.planner5d.library.services.upload.a> f191784f;

    public enum a {
        Download("downloading", com.planner5d.library.f.s.f169342p7),
        Unlock("unlock", com.planner5d.library.f.s.qs),
        Render("render", com.planner5d.library.f.s.oz),
        Document("document", com.planner5d.library.f.s.Z6);


        /* JADX INFO: renamed from: h, reason: collision with root package name */
        private static final /* synthetic */ kotlin.enums.a f191790h = kotlin.enums.c.c(k());

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        @NotNull
        private final String f191791a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private final int f191792b;

        a(String str, int i10) {
            this.f191791a = str;
            this.f191792b = i10;
        }

        @NotNull
        public static kotlin.enums.a<a> n() {
            return f191790h;
        }

        @NotNull
        public final String getId() {
            return this.f191791a;
        }

        public final int l() {
            return this.f191792b;
        }
    }

    public static final class b {
        public /* synthetic */ b(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private b() {
        }
    }

    @ij.a
    public j2(@NotNull com.planner5d.library.application.b application, @NotNull fg.e<com.planner5d.library.services.download.a> downloadNotification, @NotNull fg.e<com.planner5d.library.services.render.a> renderNotification, @NotNull fg.e<com.planner5d.library.services.upload.a> documentNotification) {
        Intrinsics.checkNotNullParameter(application, "application");
        Intrinsics.checkNotNullParameter(downloadNotification, "downloadNotification");
        Intrinsics.checkNotNullParameter(renderNotification, "renderNotification");
        Intrinsics.checkNotNullParameter(documentNotification, "documentNotification");
        this.f191781c = application;
        this.f191782d = downloadNotification;
        this.f191783e = renderNotification;
        this.f191784f = documentNotification;
        NotificationManager notificationManager = (NotificationManager) androidx.core.content.d.s(application, NotificationManager.class);
        if (notificationManager != null) {
            for (a aVar : a.values()) {
                NotificationChannel notificationChannel = new NotificationChannel(aVar.getId(), this.f191781c.getString(com.planner5d.library.f.s.K1), 3);
                notificationChannel.setSound(null, null);
                notificationChannel.setDescription(this.f191781c.getString(aVar.l()));
                notificationManager.createNotificationChannel(notificationChannel);
            }
        }
    }

    public final void a(int i10) {
        androidx.core.app.c0.q(this.f191781c).c(i10);
    }

    @NotNull
    public final androidx.core.app.w.n b(@NotNull a channel) {
        Intrinsics.checkNotNullParameter(channel, "channel");
        androidx.core.app.w.n nVarY0 = new androidx.core.app.w.n(this.f191781c, channel.getId()).j0(true).S(4).t0(com.planner5d.library.f.o.f168925b).k0(0).y0(null, 0);
        Intrinsics.checkNotNullExpressionValue(nVarY0, "setSound(...)");
        return nVarY0;
    }

    @e.a({"MissingPermission"})
    public final void c(int i10, @NotNull Notification notification) {
        Intrinsics.checkNotNullParameter(notification, "notification");
        androidx.core.app.c0.q(this.f191781c).F(i10, notification);
    }

    @e.a({"MissingPermission"})
    public final void d(int i10, @NotNull androidx.core.app.w.n builder) {
        Intrinsics.checkNotNullParameter(builder, "builder");
        androidx.core.app.c0.q(this.f191781c).F(i10, builder.h());
    }

    public final void f(@NotNull Intent intent) {
        Intrinsics.checkNotNullParameter(intent, "intent");
        this.f191782d.get().j(intent);
        this.f191783e.get().j(intent);
        this.f191784f.get().j(intent);
    }
}
