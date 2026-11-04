package com.planner5d.library.database;

import androidx.annotation.NonNull;

/* JADX INFO: loaded from: classes4.dex */
final class d extends androidx.room.migration.b {
    public d() {
        super(38, 39);
    }

    @Override // androidx.room.migration.b
    public void a(@NonNull final w3.d db2) {
        db2.X8("CREATE TABLE IF NOT EXISTS `space` (`id` INTEGER PRIMARY KEY AUTOINCREMENT NOT NULL, `created` INTEGER, `title` TEXT, `address` TEXT, `price_amount` INTEGER, `price_currency` TEXT, `cover` TEXT)");
        db2.X8("CREATE INDEX IF NOT EXISTS `index_space_id` ON `space` (`id`)");
        db2.X8("CREATE TABLE IF NOT EXISTS `space_attributes` (`id` INTEGER PRIMARY KEY AUTOINCREMENT NOT NULL, `space_id` INTEGER NOT NULL, `area` TEXT, `build_date` TEXT, `total_bedrooms` TEXT, `total_bathrooms` TEXT)");
        db2.X8("CREATE INDEX IF NOT EXISTS `index_space_attributes_id` ON `space_attributes` (`id`)");
    }
}
