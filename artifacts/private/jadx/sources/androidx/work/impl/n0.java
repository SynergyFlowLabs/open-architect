package androidx.work.impl;

import androidx.annotation.NonNull;

/* JADX INFO: loaded from: classes3.dex */
class n0 extends androidx.room.migration.b {
    public n0() {
        super(18, 19);
    }

    @Override // androidx.room.migration.b
    public void a(@NonNull final w3.d database) {
        database.X8("ALTER TABLE `WorkSpec` ADD COLUMN `stop_reason` INTEGER NOT NULL DEFAULT -256");
    }
}
