package com.planner5d.library.database;

import androidx.annotation.NonNull;

/* JADX INFO: loaded from: classes4.dex */
final class c extends androidx.room.migration.b {
    public c() {
        super(36, 37);
    }

    @Override // androidx.room.migration.b
    public void a(@NonNull final w3.d db2) {
        db2.X8("CREATE TABLE IF NOT EXISTS `chat_messages` (`id` INTEGER PRIMARY KEY AUTOINCREMENT NOT NULL, `project_id` INTEGER NOT NULL, `created_at` INTEGER NOT NULL, `text` TEXT NOT NULL)");
        db2.X8("CREATE INDEX IF NOT EXISTS `index_chat_messages_id` ON `chat_messages` (`id`)");
        db2.X8("CREATE TABLE IF NOT EXISTS `project_conversations` (`user_id` INTEGER NOT NULL, `project_id` INTEGER NOT NULL, `conversation_id` TEXT NOT NULL, PRIMARY KEY(`user_id`, `project_id`))");
        db2.X8("CREATE INDEX IF NOT EXISTS `index_project_conversations_user_id` ON `project_conversations` (`user_id`)");
        db2.X8("CREATE INDEX IF NOT EXISTS `index_project_conversations_project_id` ON `project_conversations` (`project_id`)");
        db2.X8("CREATE INDEX IF NOT EXISTS `index_project_conversations_conversation_id` ON `project_conversations` (`conversation_id`)");
    }
}
