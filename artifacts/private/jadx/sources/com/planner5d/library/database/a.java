package com.planner5d.library.database;

import androidx.annotation.NonNull;

/* JADX INFO: loaded from: classes4.dex */
final class a extends androidx.room.migration.b {
    public a() {
        super(31, 32);
    }

    @Override // androidx.room.migration.b
    public void a(@NonNull final w3.d db2) {
        db2.X8("ALTER TABLE `blog_posts` ADD COLUMN `ghost_uri` TEXT DEFAULT NULL");
    }
}
