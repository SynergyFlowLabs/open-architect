package com.google.firebase.sessions;

import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlinx.serialization.KSerializer;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes5.dex */
public final class SessionData$$b {
    private SessionData$$b() {
    }

    @NotNull
    public final KSerializer<SessionData> serializer() {
        return SessionData$$a.f124829a;
    }

    public /* synthetic */ SessionData$$b(DefaultConstructorMarker defaultConstructorMarker) {
        this();
    }
}
