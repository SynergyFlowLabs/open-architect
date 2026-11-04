package com.planner5d.library.database.migration;

import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes4.dex */
public final class k extends androidx.room.migration.b {
    public k() {
        super(42, 43);
    }

    @Override // androidx.room.migration.b
    public void a(@NotNull w3.d db2) {
        Intrinsics.checkNotNullParameter(db2, "db");
        if (com.planner5d.library.database.m.f154036c.h(db2).e("space", "hash")) {
            return;
        }
        db2.X8("ALTER TABLE `space` ADD COLUMN `hash` TEXT NOT NULL DEFAULT ''");
        db2.X8("DROP INDEX IF EXISTS `index_space_id`");
        db2.X8("CREATE UNIQUE INDEX IF NOT EXISTS `index_space_id` ON `space` (`id`)");
        db2.X8("CREATE UNIQUE INDEX IF NOT EXISTS `index_space_hash` ON `space` (`hash`)");
        db2.X8("DROP INDEX IF EXISTS `index_space_attributes_id`");
        db2.X8("CREATE UNIQUE INDEX IF NOT EXISTS `index_space_attributes_id` ON `space_attributes` (`id`)");
        db2.X8("CREATE UNIQUE INDEX IF NOT EXISTS `index_space_attributes_space_id` ON `space_attributes` (`space_id`)");
    }
}
