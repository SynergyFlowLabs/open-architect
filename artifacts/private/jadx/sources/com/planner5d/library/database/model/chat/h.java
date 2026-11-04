package com.planner5d.library.database.model.chat;

import androidx.room.u;
import io.intercom.android.sdk.m5.navigation.CreateTicketDestinationKt;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes4.dex */
@u(primaryKeys = {"user_id", "project_id"}, tableName = "project_conversations")
public final class h {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @androidx.room.i(index = true, name = "user_id")
    private final long f154140a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @androidx.room.i(index = true, name = "project_id")
    private final long f154141b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @androidx.room.i(index = true, name = CreateTicketDestinationKt.CONVERSATION_ID)
    @NotNull
    private final String f154142c;

    public h(long j10, long j11, @NotNull String conversationId) {
        Intrinsics.checkNotNullParameter(conversationId, "conversationId");
        this.f154140a = j10;
        this.f154141b = j11;
        this.f154142c = conversationId;
    }

    @NotNull
    public final String a() {
        return this.f154142c;
    }

    public final long b() {
        return this.f154141b;
    }

    public final long c() {
        return this.f154140a;
    }
}
