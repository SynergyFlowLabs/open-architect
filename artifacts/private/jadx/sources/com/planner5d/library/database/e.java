package com.planner5d.library.database;

import androidx.annotation.NonNull;

/* JADX INFO: loaded from: classes4.dex */
final class e extends androidx.room.migration.b {
    public e() {
        super(43, 44);
    }

    @Override // androidx.room.migration.b
    public void a(@NonNull final w3.d db2) {
        db2.X8("CREATE TABLE IF NOT EXISTS `document` (`hash` TEXT NOT NULL DEFAULT '', `space_hash` TEXT, `name` TEXT, `folder_hash` TEXT, `date_created` INTEGER, `date_updated` INTEGER, PRIMARY KEY(`hash`))");
        db2.X8("CREATE TABLE IF NOT EXISTS `document_folder` (`hash` TEXT NOT NULL DEFAULT '', `parent_hash` TEXT, `space_hash` TEXT, `name` TEXT, `tags` TEXT, `date_created` INTEGER, `date_updated` INTEGER, PRIMARY KEY(`hash`))");
    }
}
