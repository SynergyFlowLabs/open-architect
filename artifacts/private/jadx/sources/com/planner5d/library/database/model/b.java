package com.planner5d.library.database.model;

import androidx.room.u;
import com.google.firebase.analytics.FirebaseAnalytics;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes4.dex */
@u(primaryKeys = {"user_id", "favorite_type", FirebaseAnalytics.d.f120673q}, tableName = "favorite_marks")
public final class b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @androidx.room.i(name = "user_id")
    private final long f154104a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @androidx.room.i(name = "favorite_type")
    private final int f154105b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @androidx.room.i(name = FirebaseAnalytics.d.f120673q)
    @NotNull
    private final String f154106c;

    public b(long j10, int i10, @NotNull String itemId) {
        Intrinsics.checkNotNullParameter(itemId, "itemId");
        this.f154104a = j10;
        this.f154105b = i10;
        this.f154106c = itemId;
    }

    public final int a() {
        return this.f154105b;
    }

    @NotNull
    public final String b() {
        return this.f154106c;
    }

    public final long c() {
        return this.f154104a;
    }
}
