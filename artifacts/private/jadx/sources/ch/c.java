package ch;

import android.content.Context;
import com.google.android.gms.common.f;
import com.google.android.gms.tasks.OnCompleteListener;
import com.google.android.gms.tasks.Task;
import com.google.firebase.messaging.FirebaseMessaging;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes12.dex */
public final class c implements a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    private final Context f86905a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NotNull
    private final ij.c<f> f86906b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @NotNull
    private final ij.c<FirebaseMessaging> f86907c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @NotNull
    private final bh.a f86908d;

    public c(@NotNull Context context, @NotNull ij.c<f> googleApiAvailabilityProvider, @NotNull ij.c<FirebaseMessaging> firebaseMessagingProvider, @NotNull bh.a pushLogger) {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(googleApiAvailabilityProvider, "googleApiAvailabilityProvider");
        Intrinsics.checkNotNullParameter(firebaseMessagingProvider, "firebaseMessagingProvider");
        Intrinsics.checkNotNullParameter(pushLogger, "pushLogger");
        this.f86905a = context;
        this.f86906b = googleApiAvailabilityProvider;
        this.f86907c = firebaseMessagingProvider;
        this.f86908d = pushLogger;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void c(c cVar, Function1 function1, Task task) {
        Intrinsics.checkNotNullParameter(task, "task");
        if (!task.u()) {
            cVar.f86908d.z(task.p());
            function1.invoke(null);
            return;
        }
        String str = (String) task.q();
        bh.a aVar = cVar.f86908d;
        Intrinsics.checkNotNull(str);
        aVar.B(str);
        function1.invoke(str);
    }

    private final boolean d() {
        try {
            int iJ = this.f86906b.get().j(this.f86905a);
            if (iJ == 0) {
                this.f86908d.i();
                return true;
            }
            this.f86908d.j(iJ);
            return false;
        } catch (Throwable th2) {
            this.f86908d.h(th2);
            return false;
        }
    }

    @Override // ch.a
    public void a(@NotNull final Function1<? super String, Unit> onComplete) {
        Intrinsics.checkNotNullParameter(onComplete, "onComplete");
        this.f86908d.A();
        try {
            if (d()) {
                Intrinsics.checkNotNull(this.f86907c.get().B().addOnCompleteListener(new OnCompleteListener() { // from class: ch.b
                    @Override // com.google.android.gms.tasks.OnCompleteListener
                    public final void onComplete(Task task) {
                        c.c(this.f86903a, onComplete, task);
                    }
                }));
            } else {
                onComplete.invoke(null);
            }
        } catch (Throwable th2) {
            this.f86908d.z(th2);
            onComplete.invoke(null);
        }
    }
}
