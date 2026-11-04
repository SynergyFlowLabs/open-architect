package bh;

import com.google.firebase.messaging.RemoteMessage;
import ih.e;
import io.customer.messagingpush.data.model.CustomerIOParsedPushPayload;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes12.dex */
public final class a {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NotNull
    public static final C0798a f82325b = new C0798a(null);

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @NotNull
    public static final String f82326c = "Push";

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    private final e f82327a;

    /* JADX INFO: renamed from: bh.a$a, reason: collision with other inner class name */
    public static final class C0798a {
        public /* synthetic */ C0798a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private C0798a() {
        }
    }

    public a(@NotNull e logger) {
        Intrinsics.checkNotNullParameter(logger, "logger");
        this.f82327a = logger;
    }

    private final String C(RemoteMessage remoteMessage) {
        RemoteMessage.d dVarP2 = remoteMessage.p2();
        if (dVarP2 == null) {
            return remoteMessage.T1().toString();
        }
        StringBuilder sb2 = new StringBuilder();
        sb2.append("Notification:");
        sb2.append('\n');
        sb2.append("  title = " + dVarP2.w());
        sb2.append('\n');
        sb2.append("  body = " + dVarP2.a());
        sb2.append('\n');
        sb2.append("  icon = " + dVarP2.k());
        sb2.append('\n');
        sb2.append("  color = " + dVarP2.f());
        sb2.append('\n');
        sb2.append("  imageUrl = " + dVarP2.l());
        sb2.append('\n');
        sb2.append("Data: " + remoteMessage.T1());
        sb2.append('\n');
        return sb2.toString();
    }

    public final void A() {
        this.f82327a.a("Getting current device token from Firebase messaging on app launch", "Push");
    }

    public final void B(@NotNull String token) {
        Intrinsics.checkNotNullParameter(token, "token");
        this.f82327a.a("Got current device token: " + token, "Push");
    }

    public final void a(@NotNull String channelId, @NotNull String channelName, int i10) {
        Intrinsics.checkNotNullParameter(channelId, "channelId");
        Intrinsics.checkNotNullParameter(channelName, "channelName");
        this.f82327a.a("Creating new notification channel id: " + channelId + ", name: " + channelName + ", importance: " + i10, "Push");
    }

    public final void b() {
        this.f82327a.a("Deep link handled by host app callback implementation", "Push");
    }

    public final void c() {
        this.f82327a.a("Deep link handled by internal host app navigation", "Push");
    }

    public final void d() {
        this.f82327a.a("Deep link handled by opening default host app", "Push");
    }

    public final void e() {
        this.f82327a.a("Deep link handled by external app", "Push");
    }

    public final void f() {
        this.f82327a.a("Deep link was not handled", "Push");
    }

    public final void g(@NotNull Throwable throwable) {
        Intrinsics.checkNotNullParameter(throwable, "throwable");
        this.f82327a.c("Failed to handle push click: " + throwable.getMessage(), "Push", throwable);
    }

    public final void h(@NotNull Throwable throwable) {
        Intrinsics.checkNotNullParameter(throwable, "throwable");
        this.f82327a.c("Checking Google Play Service availability check failed with error: : " + throwable.getMessage(), "Push", throwable);
    }

    public final void i() {
        this.f82327a.a("Google Play Services is available for this device", "Push");
    }

    public final void j(int i10) {
        this.f82327a.a("Google Play Services is NOT available for this device with result: " + i10, "Push");
    }

    public final void k(@NotNull CustomerIOParsedPushPayload payload, @NotNull xg.a behavior) {
        Intrinsics.checkNotNullParameter(payload, "payload");
        Intrinsics.checkNotNullParameter(behavior, "behavior");
        this.f82327a.a("Handling push notification deep link with payload: " + payload + " - pushClickBehavior: " + behavior, "Push");
    }

    public final void l(int i10) {
        e.a.b(this.f82327a, "Notification channel importance level invalid: " + i10, "Push", null, 4, null);
    }

    public final void m() {
        e.a.b(this.f82327a, "Intent is null, cannot process notification click", "Push", null, 4, null);
    }

    public final void n(@NotNull String channelId) {
        Intrinsics.checkNotNullParameter(channelId, "channelId");
        this.f82327a.a("Notification channel already exists id: " + channelId, "Push");
    }

    public final void o() {
        this.f82327a.a("Received message but auto tracking is disabled", "Push");
    }

    public final void p() {
        this.f82327a.a("Received CIO push message", "Push");
    }

    public final void q(@NotNull String deliveryId) {
        Intrinsics.checkNotNullParameter(deliveryId, "deliveryId");
        this.f82327a.a("Received duplicate message with deliveryId: " + deliveryId, "Push");
    }

    public final void r() {
        this.f82327a.a("Push message received is empty", "Push");
    }

    public final void s(@NotNull String deliveryId) {
        Intrinsics.checkNotNullParameter(deliveryId, "deliveryId");
        this.f82327a.a("Received new message with deliveryId: " + deliveryId, "Push");
    }

    public final void t() {
        this.f82327a.a("Received non CIO push message, ignoring message", "Push");
    }

    public final void u(@NotNull RemoteMessage message, boolean z10) {
        Intrinsics.checkNotNullParameter(message, "message");
        this.f82327a.a("handleNotificationTrigger: " + z10 + " - Received notification for message: " + C(message), "Push");
    }

    public final void v() {
        this.f82327a.a("Received message with empty deliveryId", "Push");
    }

    public final void w(@NotNull RemoteMessage message) {
        Intrinsics.checkNotNullParameter(message, "message");
        this.f82327a.a("Showing notification for message: " + C(message), "Push");
    }

    public final void x(@NotNull String deliveryId) {
        Intrinsics.checkNotNullParameter(deliveryId, "deliveryId");
        this.f82327a.a("Tracking push message delivered with deliveryId: " + deliveryId, "Push");
    }

    public final void y(@NotNull CustomerIOParsedPushPayload payload) {
        Intrinsics.checkNotNullParameter(payload, "payload");
        this.f82327a.a("Tracking push message opened with payload: " + payload, "Push");
    }

    public final void z(@Nullable Throwable th2) {
        this.f82327a.c("Failed to get device token with error: " + (th2 != null ? th2.getMessage() : null), "Push", th2);
    }
}
