package bd;

import android.app.Application;
import com.google.firebase.messaging.RemoteMessage;
import com.planner5d.library.model.manager.push.g;
import io.customer.messagingpush.CustomerIOFirebaseMessagingService;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import timber.log.b;

/* JADX INFO: loaded from: classes7.dex */
public final class a implements g {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    private final Application f77773a;

    public a(@NotNull Application application) {
        Intrinsics.checkNotNullParameter(application, "application");
        this.f77773a = application;
    }

    @Override // com.planner5d.library.model.manager.push.g
    public void a(@NotNull String token) {
        Intrinsics.checkNotNullParameter(token, "token");
        b.f381052a.H("CIO").a("Sending Firebase token to CIO: " + token, new Object[0]);
        CustomerIOFirebaseMessagingService.f288387a.h(this.f77773a, token);
    }

    @Override // com.planner5d.library.model.manager.push.g
    public boolean b(@NotNull Object pushMessage) {
        Intrinsics.checkNotNullParameter(pushMessage, "pushMessage");
        int i10 = 5 | 0;
        b.f381052a.H("CIO").a("Message received", new Object[0]);
        RemoteMessage remoteMessage = pushMessage instanceof RemoteMessage ? (RemoteMessage) pushMessage : null;
        if (remoteMessage == null) {
            return false;
        }
        return CustomerIOFirebaseMessagingService.a.g(CustomerIOFirebaseMessagingService.f288387a, this.f77773a, remoteMessage, false, 4, null);
    }
}
