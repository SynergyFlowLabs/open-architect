package com.planner5d.library.model.manager.push;

import com.google.android.gms.tasks.OnCompleteListener;
import com.google.android.gms.tasks.Task;
import com.google.firebase.messaging.FirebaseMessaging;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes8.dex */
public final class f {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    public static final f f193303a = new f();

    private f() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void d(FirebaseMessaging firebaseMessaging, Task it) {
        Intrinsics.checkNotNullParameter(it, "it");
        if (it.u()) {
            firebaseMessaging.B().addOnCompleteListener(new OnCompleteListener() { // from class: com.planner5d.library.model.manager.push.d
                @Override // com.google.android.gms.tasks.OnCompleteListener
                public final void onComplete(Task task) {
                    f.e(task);
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void e(Task result) {
        Intrinsics.checkNotNullParameter(result, "result");
        if (result.u()) {
            timber.log.b.f381052a.H(FirebaseMessaging.f123333q).a("Firebase token updated: %s", result.q());
        } else {
            timber.log.b.f381052a.H(FirebaseMessaging.f123333q).a("Firebase token not updated", new Object[0]);
        }
    }

    public final void c() {
        final FirebaseMessaging firebaseMessagingY = FirebaseMessaging.y();
        Intrinsics.checkNotNullExpressionValue(firebaseMessagingY, "getInstance(...)");
        firebaseMessagingY.u().addOnCompleteListener(new OnCompleteListener() { // from class: com.planner5d.library.model.manager.push.e
            @Override // com.google.android.gms.tasks.OnCompleteListener
            public final void onComplete(Task task) {
                f.d(firebaseMessagingY, task);
            }
        });
    }
}
