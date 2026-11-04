package androidx.work.impl;

import androidx.annotation.NonNull;

/* JADX INFO: loaded from: classes3.dex */
class m0 extends androidx.room.migration.b {
    public m0() {
        super(17, 18);
    }

    @Override // androidx.room.migration.b
    public void a(@NonNull final w3.d database) {
        database.X8("ALTER TABLE `WorkSpec` ADD COLUMN `next_schedule_time_override` INTEGER NOT NULL DEFAULT 9223372036854775807");
        database.X8("ALTER TABLE `WorkSpec` ADD COLUMN `next_schedule_time_override_generation` INTEGER NOT NULL DEFAULT 0");
    }
}
