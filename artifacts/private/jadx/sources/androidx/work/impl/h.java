package androidx.work.impl;

import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes3.dex */
public final class h extends androidx.room.migration.b {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @NotNull
    public static final h f76873c = new h();

    private h() {
        super(12, 13);
    }

    @Override // androidx.room.migration.b
    public void a(@NotNull w3.d db2) {
        Intrinsics.checkNotNullParameter(db2, "db");
        db2.X8("UPDATE workspec SET required_network_type = 0 WHERE required_network_type IS NULL ");
        db2.X8("UPDATE workspec SET content_uri_triggers = x'' WHERE content_uri_triggers is NULL");
    }
}
