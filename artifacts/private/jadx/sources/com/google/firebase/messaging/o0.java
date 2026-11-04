package com.google.firebase.messaging;

import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes5.dex */
public final class o0 {
    @NotNull
    public static final FirebaseMessaging a(@NotNull com.google.firebase.d dVar) {
        Intrinsics.checkNotNullParameter(dVar, "<this>");
        FirebaseMessaging firebaseMessagingY = FirebaseMessaging.y();
        Intrinsics.checkNotNullExpressionValue(firebaseMessagingY, "getInstance(...)");
        return firebaseMessagingY;
    }

    @NotNull
    public static final RemoteMessage b(@NotNull String to, @NotNull Function1<? super RemoteMessage.b, Unit> init) {
        Intrinsics.checkNotNullParameter(to, "to");
        Intrinsics.checkNotNullParameter(init, "init");
        RemoteMessage.b bVar = new RemoteMessage.b(to);
        init.invoke(bVar);
        RemoteMessage remoteMessageB = bVar.b();
        Intrinsics.checkNotNullExpressionValue(remoteMessageB, "build(...)");
        return remoteMessageB;
    }
}
