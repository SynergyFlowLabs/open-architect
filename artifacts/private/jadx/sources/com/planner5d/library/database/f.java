package com.planner5d.library.database;

import androidx.annotation.NonNull;

/* JADX INFO: loaded from: classes4.dex */
final class f extends androidx.room.migration.b {
    public f() {
        super(45, 46);
    }

    @Override // androidx.room.migration.b
    public void a(@NonNull final w3.d db2) {
        db2.X8("CREATE TABLE IF NOT EXISTS `user_model_metadata` (`hash` TEXT NOT NULL, `format` TEXT NOT NULL, `uri` TEXT NOT NULL, `file_integrity_hash` TEXT NOT NULL, `last_update_unix_millis` INTEGER NOT NULL, PRIMARY KEY(`hash`, `format`))");
        db2.X8("CREATE INDEX IF NOT EXISTS `index_user_model_metadata_hash` ON `user_model_metadata` (`hash`)");
        db2.X8("CREATE INDEX IF NOT EXISTS `index_user_model_metadata_format` ON `user_model_metadata` (`format`)");
    }
}
