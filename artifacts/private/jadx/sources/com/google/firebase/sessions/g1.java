package com.google.firebase.sessions;

import java.util.UUID;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes5.dex */
public final class g1 implements f1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    public static final g1 f125032a = new g1();

    private g1() {
    }

    @Override // com.google.firebase.sessions.f1
    @NotNull
    public UUID next() {
        UUID uuidRandomUUID = UUID.randomUUID();
        Intrinsics.checkNotNullExpressionValue(uuidRandomUUID, "randomUUID(...)");
        return uuidRandomUUID;
    }
}
