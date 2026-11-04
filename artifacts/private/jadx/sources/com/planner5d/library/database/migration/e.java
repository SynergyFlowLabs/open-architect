package com.planner5d.library.database.migration;

import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes4.dex */
public final class e extends androidx.room.migration.b {
    public e() {
        super(33, 34);
    }

    @Override // androidx.room.migration.b
    public void a(@NotNull w3.d database) {
        Intrinsics.checkNotNullParameter(database, "database");
        if (com.planner5d.library.database.m.f154036c.h(database).e("projects_revisions", "type")) {
            return;
        }
        database.X8("CREATE TABLE temp_projects_revisions (Id INTEGER PRIMARY KEY AUTOINCREMENT, data BLOB, date_created INTEGER, project_id INTEGER, type INTEGER, source INTEGER)");
        database.X8("INSERT INTO temp_projects_revisions (Id, data, date_created, project_id, type, source) SELECT Id, data, date_created, project_id, resolved, source FROM projects_revisions");
        database.X8("DROP TABLE projects_revisions");
        database.X8("ALTER TABLE temp_projects_revisions RENAME TO projects_revisions");
    }
}
