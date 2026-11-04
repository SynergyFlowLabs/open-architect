package com.planner5d.library.database.migration;

import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes4.dex */
public final class a extends androidx.room.migration.b {
    public a() {
        super(29, 30);
    }

    @Override // androidx.room.migration.b
    public void a(@NotNull w3.d database) {
        Intrinsics.checkNotNullParameter(database, "database");
        database.X8("DROP TABLE IF EXISTS blog_posts");
        database.X8("CREATE TABLE IF NOT EXISTS blog_posts (`id` INTEGER PRIMARY KEY NOT NULL, `category_id` INTEGER, `title` TEXT, `image_uri` TEXT, `thumbnail_image_uri` TEXT, `announcement` TEXT, `content_uri` TEXT, `video_uri` TEXT, `public_uri` TEXT, `created_at` TEXT)");
        database.X8("CREATE INDEX IF NOT EXISTS `index_blog_posts_id` ON blog_posts (`id`)");
    }
}
