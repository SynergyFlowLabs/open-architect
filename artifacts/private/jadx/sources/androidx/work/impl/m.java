package androidx.work.impl;

import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes3.dex */
public final class m extends androidx.room.migration.b {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @NotNull
    public static final m f76903c = new m();

    private m() {
        super(4, 5);
    }

    @Override // androidx.room.migration.b
    public void a(@NotNull w3.d db2) {
        Intrinsics.checkNotNullParameter(db2, "db");
        db2.X8("ALTER TABLE workspec ADD COLUMN `trigger_content_update_delay` INTEGER NOT NULL DEFAULT -1");
        db2.X8("ALTER TABLE workspec ADD COLUMN `trigger_max_content_delay` INTEGER NOT NULL DEFAULT -1");
    }
}
