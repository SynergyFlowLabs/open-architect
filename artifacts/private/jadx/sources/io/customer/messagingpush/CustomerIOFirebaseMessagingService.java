package io.customer.messagingpush;

import android.content.Context;
import com.google.firebase.messaging.FirebaseMessagingService;
import com.google.firebase.messaging.RemoteMessage;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import oj.j;
import oj.n;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes13.dex */
public class CustomerIOFirebaseMessagingService extends FirebaseMessagingService {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    public static final a f288387a = new a(null);

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NotNull
    private static final io.customer.sdk.communication.b f288388b = eh.d.f274883c.v();

    public static final class a {
        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        /* JADX WARN: Multi-variable type inference failed */
        private final boolean b(Context context, RemoteMessage remoteMessage, boolean z10) {
            eh.d dVar = eh.d.f274883c;
            eh.e.a(dVar, context);
            return new b(zg.c.j(dVar), remoteMessage, new io.customer.messagingpush.util.f(null, 0 == true ? 1 : 0, 3, 0 == true ? 1 : 0)).h(context, z10);
        }

        static /* synthetic */ boolean c(a aVar, Context context, RemoteMessage remoteMessage, boolean z10, int i10, Object obj) {
            if ((i10 & 4) != 0) {
                z10 = true;
            }
            return aVar.b(context, remoteMessage, z10);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public final void d(Context context, String str) {
            eh.e.a(eh.d.f274883c, context);
            CustomerIOFirebaseMessagingService.f288388b.d(new io.customer.sdk.communication.a.c(str));
        }

        public static /* synthetic */ boolean g(a aVar, Context context, RemoteMessage remoteMessage, boolean z10, int i10, Object obj) {
            if ((i10 & 4) != 0) {
                z10 = true;
            }
            return aVar.f(context, remoteMessage, z10);
        }

        @j
        @n
        public final boolean e(@NotNull Context context, @NotNull RemoteMessage remoteMessage) {
            Intrinsics.checkNotNullParameter(context, "context");
            Intrinsics.checkNotNullParameter(remoteMessage, "remoteMessage");
            return g(this, context, remoteMessage, false, 4, null);
        }

        @j
        @n
        public final boolean f(@NotNull Context context, @NotNull RemoteMessage remoteMessage, boolean z10) {
            Intrinsics.checkNotNullParameter(context, "context");
            Intrinsics.checkNotNullParameter(remoteMessage, "remoteMessage");
            return b(context, remoteMessage, z10);
        }

        @n
        public final void h(@NotNull Context context, @NotNull String token) {
            Intrinsics.checkNotNullParameter(context, "context");
            Intrinsics.checkNotNullParameter(token, "token");
            d(context, token);
        }

        private a() {
        }
    }

    @j
    @n
    public static final boolean l(@NotNull Context context, @NotNull RemoteMessage remoteMessage) {
        return f288387a.e(context, remoteMessage);
    }

    @j
    @n
    public static final boolean m(@NotNull Context context, @NotNull RemoteMessage remoteMessage, boolean z10) {
        return f288387a.f(context, remoteMessage, z10);
    }

    @n
    public static final void n(@NotNull Context context, @NotNull String str) {
        f288387a.h(context, str);
    }

    @Override // com.google.firebase.messaging.FirebaseMessagingService
    public void onMessageReceived(@NotNull RemoteMessage remoteMessage) {
        Intrinsics.checkNotNullParameter(remoteMessage, "remoteMessage");
        a.c(f288387a, this, remoteMessage, false, 4, null);
    }

    @Override // com.google.firebase.messaging.FirebaseMessagingService
    public void onNewToken(@NotNull String token) {
        Intrinsics.checkNotNullParameter(token, "token");
        f288387a.d(this, token);
    }
}
