package com.planner5d.library.database;

import androidx.annotation.NonNull;

/* JADX INFO: loaded from: classes4.dex */
final class b extends androidx.room.migration.b {
    public b() {
        super(34, 35);
    }

    @Override // androidx.room.migration.b
    public void a(@NonNull final w3.d db2) {
        db2.X8("CREATE TABLE IF NOT EXISTS `favorite_marks` (`user_id` INTEGER NOT NULL, `favorite_type` INTEGER NOT NULL, `item_id` TEXT NOT NULL, PRIMARY KEY(`user_id`, `favorite_type`, `item_id`))");
    }
}
