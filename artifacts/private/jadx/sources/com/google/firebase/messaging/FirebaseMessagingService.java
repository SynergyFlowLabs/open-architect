package com.google.firebase.messaging;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.text.TextUtils;
import androidx.annotation.NonNull;
import com.google.android.gms.cloudmessaging.CloudMessage;
import java.util.ArrayDeque;
import java.util.Queue;
import java.util.concurrent.ExecutorService;

/* JADX INFO: loaded from: classes5.dex */
public class FirebaseMessagingService extends i {
    public static final String ACTION_DIRECT_BOOT_REMOTE_INTENT = "com.google.firebase.messaging.RECEIVE_DIRECT_BOOT";
    static final String ACTION_NEW_TOKEN = "com.google.firebase.messaging.NEW_TOKEN";
    static final String ACTION_REMOTE_INTENT = "com.google.android.c2dm.intent.RECEIVE";
    static final String EXTRA_TOKEN = "token";
    private static final int RECENTLY_RECEIVED_MESSAGE_IDS_MAX_SIZE = 10;
    private static final Queue<String> recentlyReceivedMessageIds = new ArrayDeque(10);
    private com.google.android.gms.cloudmessaging.d rpc;

    private boolean e(String str) {
        if (TextUtils.isEmpty(str)) {
            return false;
        }
        Queue<String> queue = recentlyReceivedMessageIds;
        if (queue.contains(str)) {
            return true;
        }
        if (queue.size() >= 10) {
            queue.remove();
        }
        queue.add(str);
        return false;
    }

    private void f(Intent intent) {
        Bundle extras = intent.getExtras();
        if (extras == null) {
            extras = new Bundle();
        }
        extras.remove("androidx.content.wakelockid");
        if (q0.v(extras)) {
            q0 q0Var = new q0(extras);
            ExecutorService executorServiceF = o.f();
            try {
                if (new f(this, q0Var, executorServiceF).a()) {
                    executorServiceF.shutdown();
                    return;
                } else {
                    executorServiceF.shutdown();
                    if (n0.E(intent)) {
                        n0.w(intent);
                    }
                }
            } catch (Throwable th2) {
                executorServiceF.shutdown();
                throw th2;
            }
        }
        onMessageReceived(new RemoteMessage(extras));
    }

    private String g(Intent intent) {
        String stringExtra = intent.getStringExtra(e.d.f123517h);
        return stringExtra == null ? intent.getStringExtra(e.d.f123515f) : stringExtra;
    }

    private com.google.android.gms.cloudmessaging.d h(Context context) {
        if (this.rpc == null) {
            this.rpc = new com.google.android.gms.cloudmessaging.d(context.getApplicationContext());
        }
        return this.rpc;
    }

    private void i(Intent intent) {
        if (!e(intent.getStringExtra(e.d.f123517h))) {
            j(intent);
        }
        h(this).b(new CloudMessage(intent));
    }

    private void j(Intent intent) {
        String stringExtra = intent.getStringExtra(e.d.f123513d);
        if (stringExtra == null) {
            stringExtra = e.C1174e.f123527a;
        }
        switch (stringExtra) {
            case "deleted_messages":
                onDeletedMessages();
                break;
            case "gcm":
                n0.y(intent);
                f(intent);
                break;
            case "send_error":
                onSendError(g(intent), new a1(intent.getStringExtra("error")));
                break;
            case "send_event":
                onMessageSent(intent.getStringExtra(e.d.f123517h));
                break;
        }
    }

    @androidx.annotation.l1
    static void resetForTesting() {
        recentlyReceivedMessageIds.clear();
    }

    @Override // com.google.firebase.messaging.i
    protected Intent getStartCommandIntent(Intent intent) {
        return b1.b().c();
    }

    @Override // com.google.firebase.messaging.i
    public void handleIntent(Intent intent) {
        String action = intent.getAction();
        if (ACTION_REMOTE_INTENT.equals(action) || ACTION_DIRECT_BOOT_REMOTE_INTENT.equals(action)) {
            i(intent);
        } else if (ACTION_NEW_TOKEN.equals(action)) {
            onNewToken(intent.getStringExtra("token"));
        } else {
            intent.getAction();
        }
    }

    @androidx.annotation.m1
    public void onDeletedMessages() {
    }

    @androidx.annotation.m1
    public void onMessageReceived(@NonNull RemoteMessage remoteMessage) {
    }

    @androidx.annotation.m1
    @Deprecated
    public void onMessageSent(@NonNull String str) {
    }

    @androidx.annotation.m1
    public void onNewToken(@NonNull String str) {
    }

    @androidx.annotation.m1
    @Deprecated
    public void onSendError(@NonNull String str, @NonNull Exception exc) {
    }

    @androidx.annotation.l1
    void setRpcForTesting(com.google.android.gms.cloudmessaging.d dVar) {
        this.rpc = dVar;
    }
}
