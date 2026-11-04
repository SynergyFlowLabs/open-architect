package com.planner5d.library.database;

import androidx.annotation.NonNull;
import androidx.room.b2;
import androidx.room.d2;
import androidx.room.e2;
import androidx.room.l0;
import com.devtodev.analytics.internal.storage.sqlite.PeopleCardEntry;
import com.devtodev.core.data.metrics.MetricConsts;
import com.google.android.gms.common.internal.s;
import com.google.firebase.analytics.FirebaseAnalytics;
import io.intercom.android.sdk.m5.navigation.CreateTicketDestinationKt;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;

/* JADX INFO: loaded from: classes4.dex */
public final class ApplicationDatabase_Impl extends ApplicationDatabase {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private volatile com.planner5d.library.feed.data.a f154020a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private volatile com.planner5d.library.database.model.chat.b f154021b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private volatile com.planner5d.library.database.model.spaces.documents.d f154022c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private volatile com.planner5d.library.database.model.c f154023d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private volatile com.planner5d.library.database.model.chat.i f154024e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private volatile com.planner5d.library.database.model.spaces.d f154025f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private volatile com.planner5d.library.database.model.l f154026g;

    class a extends e2.b {
        a(int version) {
            super(version);
        }

        @Override // androidx.room.e2.b
        public void createAllTables(@NonNull final w3.d db2) {
            db2.X8("CREATE TABLE IF NOT EXISTS `blog_posts` (`id` INTEGER NOT NULL, `category_id` INTEGER, `title` TEXT, `image_uri` TEXT, `thumbnail_image_uri` TEXT, `announcement` TEXT, `content_uri` TEXT, `video_uri` TEXT, `public_uri` TEXT, `ghost_uri` TEXT, `created_at` TEXT, PRIMARY KEY(`id`))");
            db2.X8("CREATE INDEX IF NOT EXISTS `index_blog_posts_id` ON `blog_posts` (`id`)");
            db2.X8("CREATE TABLE IF NOT EXISTS `chat_messages` (`id` INTEGER PRIMARY KEY AUTOINCREMENT NOT NULL, `project_id` INTEGER NOT NULL, `created_at` INTEGER NOT NULL, `text` TEXT NOT NULL, `json` TEXT, `ai` INTEGER)");
            db2.X8("CREATE INDEX IF NOT EXISTS `index_chat_messages_id` ON `chat_messages` (`id`)");
            db2.X8("CREATE TABLE IF NOT EXISTS `document` (`hash` TEXT NOT NULL DEFAULT '', `space_hash` TEXT, `name` TEXT, `folder_hash` TEXT, `date_created` INTEGER, `date_updated` INTEGER, `uri` TEXT DEFAULT NULL, `local` INTEGER NOT NULL DEFAULT TRUE, `remote` INTEGER NOT NULL DEFAULT FALSE, PRIMARY KEY(`hash`))");
            db2.X8("CREATE TABLE IF NOT EXISTS `document_folder` (`hash` TEXT NOT NULL DEFAULT '', `parent_hash` TEXT, `space_hash` TEXT, `name` TEXT, `tags` TEXT, `date_created` INTEGER, `date_updated` INTEGER, PRIMARY KEY(`hash`))");
            db2.X8("CREATE TABLE IF NOT EXISTS `favorite_marks` (`user_id` INTEGER NOT NULL, `favorite_type` INTEGER NOT NULL, `item_id` TEXT NOT NULL, PRIMARY KEY(`user_id`, `favorite_type`, `item_id`))");
            db2.X8("CREATE TABLE IF NOT EXISTS `project_conversations` (`user_id` INTEGER NOT NULL, `project_id` INTEGER NOT NULL, `conversation_id` TEXT NOT NULL, PRIMARY KEY(`user_id`, `project_id`))");
            db2.X8("CREATE INDEX IF NOT EXISTS `index_project_conversations_user_id` ON `project_conversations` (`user_id`)");
            db2.X8("CREATE INDEX IF NOT EXISTS `index_project_conversations_project_id` ON `project_conversations` (`project_id`)");
            db2.X8("CREATE INDEX IF NOT EXISTS `index_project_conversations_conversation_id` ON `project_conversations` (`conversation_id`)");
            db2.X8("CREATE TABLE IF NOT EXISTS `space` (`id` INTEGER PRIMARY KEY AUTOINCREMENT NOT NULL, `user_id` INTEGER NOT NULL DEFAULT 0, `created` INTEGER, `title` TEXT, `address` TEXT, `price_amount` INTEGER, `price_currency` TEXT, `cover` TEXT, `hash` TEXT NOT NULL DEFAULT '')");
            db2.X8("CREATE UNIQUE INDEX IF NOT EXISTS `index_space_hash` ON `space` (`hash`)");
            db2.X8("CREATE UNIQUE INDEX IF NOT EXISTS `index_space_id` ON `space` (`id`)");
            db2.X8("CREATE TABLE IF NOT EXISTS `space_attributes` (`id` INTEGER PRIMARY KEY AUTOINCREMENT NOT NULL, `space_id` INTEGER NOT NULL, `area` TEXT, `build_date` TEXT, `total_bedrooms` TEXT, `total_bathrooms` TEXT)");
            db2.X8("CREATE UNIQUE INDEX IF NOT EXISTS `index_space_attributes_id` ON `space_attributes` (`id`)");
            db2.X8("CREATE UNIQUE INDEX IF NOT EXISTS `index_space_attributes_space_id` ON `space_attributes` (`space_id`)");
            db2.X8("CREATE TABLE IF NOT EXISTS `user_model_metadata` (`hash` TEXT NOT NULL, `format` TEXT NOT NULL, `uri` TEXT NOT NULL, `file_integrity_hash` TEXT NOT NULL, `last_update_unix_millis` INTEGER NOT NULL, PRIMARY KEY(`hash`, `format`))");
            db2.X8("CREATE INDEX IF NOT EXISTS `index_user_model_metadata_hash` ON `user_model_metadata` (`hash`)");
            db2.X8("CREATE INDEX IF NOT EXISTS `index_user_model_metadata_format` ON `user_model_metadata` (`format`)");
            db2.X8(d2.f74748g);
            db2.X8("INSERT OR REPLACE INTO room_master_table (id,identity_hash) VALUES(42, 'c73fc1fda2ed4ba33bfb15142e24bd47')");
        }

        @Override // androidx.room.e2.b
        public void dropAllTables(@NonNull final w3.d db2) {
            db2.X8("DROP TABLE IF EXISTS `blog_posts`");
            db2.X8("DROP TABLE IF EXISTS `chat_messages`");
            db2.X8("DROP TABLE IF EXISTS `document`");
            db2.X8("DROP TABLE IF EXISTS `document_folder`");
            db2.X8("DROP TABLE IF EXISTS `favorite_marks`");
            db2.X8("DROP TABLE IF EXISTS `project_conversations`");
            db2.X8("DROP TABLE IF EXISTS `space`");
            db2.X8("DROP TABLE IF EXISTS `space_attributes`");
            db2.X8("DROP TABLE IF EXISTS `user_model_metadata`");
            List list = ((b2) ApplicationDatabase_Impl.this).mCallbacks;
            if (list != null) {
                Iterator it = list.iterator();
                while (it.hasNext()) {
                    ((b2.b) it.next()).b(db2);
                }
            }
        }

        @Override // androidx.room.e2.b
        public void onCreate(@NonNull final w3.d db2) {
            List list = ((b2) ApplicationDatabase_Impl.this).mCallbacks;
            if (list != null) {
                Iterator it = list.iterator();
                while (it.hasNext()) {
                    ((b2.b) it.next()).a(db2);
                }
            }
        }

        @Override // androidx.room.e2.b
        public void onOpen(@NonNull final w3.d db2) {
            ((b2) ApplicationDatabase_Impl.this).mDatabase = db2;
            ApplicationDatabase_Impl.this.internalInitInvalidationTracker(db2);
            List list = ((b2) ApplicationDatabase_Impl.this).mCallbacks;
            if (list != null) {
                Iterator it = list.iterator();
                while (it.hasNext()) {
                    ((b2.b) it.next()).c(db2);
                }
            }
        }

        @Override // androidx.room.e2.b
        public void onPostMigrate(@NonNull final w3.d db2) {
        }

        @Override // androidx.room.e2.b
        public void onPreMigrate(@NonNull final w3.d db2) throws IOException {
            androidx.room.util.b.b(db2);
        }

        @Override // androidx.room.e2.b
        @NonNull
        public e2.c onValidateSchema(@NonNull final w3.d db2) {
            HashMap map = new HashMap(11);
            map.put("id", new androidx.room.util.g.a("id", "INTEGER", true, 1, null, 1));
            map.put("category_id", new androidx.room.util.g.a("category_id", "INTEGER", false, 0, null, 1));
            map.put("title", new androidx.room.util.g.a("title", "TEXT", false, 0, null, 1));
            map.put("image_uri", new androidx.room.util.g.a("image_uri", "TEXT", false, 0, null, 1));
            map.put("thumbnail_image_uri", new androidx.room.util.g.a("thumbnail_image_uri", "TEXT", false, 0, null, 1));
            map.put("announcement", new androidx.room.util.g.a("announcement", "TEXT", false, 0, null, 1));
            map.put("content_uri", new androidx.room.util.g.a("content_uri", "TEXT", false, 0, null, 1));
            map.put("video_uri", new androidx.room.util.g.a("video_uri", "TEXT", false, 0, null, 1));
            map.put("public_uri", new androidx.room.util.g.a("public_uri", "TEXT", false, 0, null, 1));
            map.put("ghost_uri", new androidx.room.util.g.a("ghost_uri", "TEXT", false, 0, null, 1));
            map.put("created_at", new androidx.room.util.g.a("created_at", "TEXT", false, 0, null, 1));
            HashSet hashSet = new HashSet(0);
            HashSet hashSet2 = new HashSet(1);
            hashSet2.add(new androidx.room.util.g.f("index_blog_posts_id", false, Arrays.asList("id"), Arrays.asList("ASC")));
            androidx.room.util.g gVar = new androidx.room.util.g("blog_posts", map, hashSet, hashSet2);
            androidx.room.util.g gVarA = androidx.room.util.g.a(db2, "blog_posts");
            if (!gVar.equals(gVarA)) {
                return new e2.c(false, "blog_posts(com.planner5d.library.feed.model.BlogPost).\n Expected:\n" + gVar + "\n Found:\n" + gVarA);
            }
            HashMap map2 = new HashMap(6);
            map2.put("id", new androidx.room.util.g.a("id", "INTEGER", true, 1, null, 1));
            map2.put("project_id", new androidx.room.util.g.a("project_id", "INTEGER", true, 0, null, 1));
            map2.put("created_at", new androidx.room.util.g.a("created_at", "INTEGER", true, 0, null, 1));
            map2.put("text", new androidx.room.util.g.a("text", "TEXT", true, 0, null, 1));
            map2.put(PeopleCardEntry.json, new androidx.room.util.g.a(PeopleCardEntry.json, "TEXT", false, 0, null, 1));
            map2.put(MetricConsts.ApplicationInfo, new androidx.room.util.g.a(MetricConsts.ApplicationInfo, "INTEGER", false, 0, null, 1));
            HashSet hashSet3 = new HashSet(0);
            HashSet hashSet4 = new HashSet(1);
            hashSet4.add(new androidx.room.util.g.f("index_chat_messages_id", false, Arrays.asList("id"), Arrays.asList("ASC")));
            androidx.room.util.g gVar2 = new androidx.room.util.g("chat_messages", map2, hashSet3, hashSet4);
            androidx.room.util.g gVarA2 = androidx.room.util.g.a(db2, "chat_messages");
            if (!gVar2.equals(gVarA2)) {
                return new e2.c(false, "chat_messages(com.planner5d.library.database.model.chat.ChatMessage).\n Expected:\n" + gVar2 + "\n Found:\n" + gVarA2);
            }
            HashMap map3 = new HashMap(9);
            map3.put("hash", new androidx.room.util.g.a("hash", "TEXT", true, 1, "''", 1));
            map3.put("space_hash", new androidx.room.util.g.a("space_hash", "TEXT", false, 0, null, 1));
            map3.put("name", new androidx.room.util.g.a("name", "TEXT", false, 0, null, 1));
            map3.put("folder_hash", new androidx.room.util.g.a("folder_hash", "TEXT", false, 0, null, 1));
            map3.put("date_created", new androidx.room.util.g.a("date_created", "INTEGER", false, 0, null, 1));
            map3.put("date_updated", new androidx.room.util.g.a("date_updated", "INTEGER", false, 0, null, 1));
            map3.put("uri", new androidx.room.util.g.a("uri", "TEXT", false, 0, "NULL", 1));
            map3.put(s.f106625b, new androidx.room.util.g.a(s.f106625b, "INTEGER", true, 0, "TRUE", 1));
            map3.put("remote", new androidx.room.util.g.a("remote", "INTEGER", true, 0, "FALSE", 1));
            androidx.room.util.g gVar3 = new androidx.room.util.g("document", map3, new HashSet(0), new HashSet(0));
            androidx.room.util.g gVarA3 = androidx.room.util.g.a(db2, "document");
            if (!gVar3.equals(gVarA3)) {
                return new e2.c(false, "document(com.planner5d.library.database.model.spaces.documents.Document).\n Expected:\n" + gVar3 + "\n Found:\n" + gVarA3);
            }
            HashMap map4 = new HashMap(7);
            map4.put("hash", new androidx.room.util.g.a("hash", "TEXT", true, 1, "''", 1));
            map4.put("parent_hash", new androidx.room.util.g.a("parent_hash", "TEXT", false, 0, null, 1));
            map4.put("space_hash", new androidx.room.util.g.a("space_hash", "TEXT", false, 0, null, 1));
            map4.put("name", new androidx.room.util.g.a("name", "TEXT", false, 0, null, 1));
            map4.put("tags", new androidx.room.util.g.a("tags", "TEXT", false, 0, null, 1));
            map4.put("date_created", new androidx.room.util.g.a("date_created", "INTEGER", false, 0, null, 1));
            map4.put("date_updated", new androidx.room.util.g.a("date_updated", "INTEGER", false, 0, null, 1));
            androidx.room.util.g gVar4 = new androidx.room.util.g("document_folder", map4, new HashSet(0), new HashSet(0));
            androidx.room.util.g gVarA4 = androidx.room.util.g.a(db2, "document_folder");
            if (!gVar4.equals(gVarA4)) {
                return new e2.c(false, "document_folder(com.planner5d.library.database.model.spaces.documents.DocumentFolder).\n Expected:\n" + gVar4 + "\n Found:\n" + gVarA4);
            }
            HashMap map5 = new HashMap(3);
            map5.put("user_id", new androidx.room.util.g.a("user_id", "INTEGER", true, 1, null, 1));
            map5.put("favorite_type", new androidx.room.util.g.a("favorite_type", "INTEGER", true, 2, null, 1));
            map5.put(FirebaseAnalytics.d.f120673q, new androidx.room.util.g.a(FirebaseAnalytics.d.f120673q, "TEXT", true, 3, null, 1));
            androidx.room.util.g gVar5 = new androidx.room.util.g("favorite_marks", map5, new HashSet(0), new HashSet(0));
            androidx.room.util.g gVarA5 = androidx.room.util.g.a(db2, "favorite_marks");
            if (!gVar5.equals(gVarA5)) {
                return new e2.c(false, "favorite_marks(com.planner5d.library.database.model.FavoriteMark).\n Expected:\n" + gVar5 + "\n Found:\n" + gVarA5);
            }
            HashMap map6 = new HashMap(3);
            map6.put("user_id", new androidx.room.util.g.a("user_id", "INTEGER", true, 1, null, 1));
            map6.put("project_id", new androidx.room.util.g.a("project_id", "INTEGER", true, 2, null, 1));
            map6.put(CreateTicketDestinationKt.CONVERSATION_ID, new androidx.room.util.g.a(CreateTicketDestinationKt.CONVERSATION_ID, "TEXT", true, 0, null, 1));
            HashSet hashSet5 = new HashSet(0);
            HashSet hashSet6 = new HashSet(3);
            hashSet6.add(new androidx.room.util.g.f("index_project_conversations_user_id", false, Arrays.asList("user_id"), Arrays.asList("ASC")));
            hashSet6.add(new androidx.room.util.g.f("index_project_conversations_project_id", false, Arrays.asList("project_id"), Arrays.asList("ASC")));
            hashSet6.add(new androidx.room.util.g.f("index_project_conversations_conversation_id", false, Arrays.asList(CreateTicketDestinationKt.CONVERSATION_ID), Arrays.asList("ASC")));
            androidx.room.util.g gVar6 = new androidx.room.util.g("project_conversations", map6, hashSet5, hashSet6);
            androidx.room.util.g gVarA6 = androidx.room.util.g.a(db2, "project_conversations");
            if (!gVar6.equals(gVarA6)) {
                return new e2.c(false, "project_conversations(com.planner5d.library.database.model.chat.ProjectConversation).\n Expected:\n" + gVar6 + "\n Found:\n" + gVarA6);
            }
            HashMap map7 = new HashMap(9);
            map7.put("id", new androidx.room.util.g.a("id", "INTEGER", true, 1, null, 1));
            map7.put("user_id", new androidx.room.util.g.a("user_id", "INTEGER", true, 0, com.facebook.appevents.p.f99189d0, 1));
            map7.put("created", new androidx.room.util.g.a("created", "INTEGER", false, 0, null, 1));
            map7.put("title", new androidx.room.util.g.a("title", "TEXT", false, 0, null, 1));
            map7.put("address", new androidx.room.util.g.a("address", "TEXT", false, 0, null, 1));
            map7.put("price_amount", new androidx.room.util.g.a("price_amount", "INTEGER", false, 0, null, 1));
            map7.put("price_currency", new androidx.room.util.g.a("price_currency", "TEXT", false, 0, null, 1));
            map7.put("cover", new androidx.room.util.g.a("cover", "TEXT", false, 0, null, 1));
            map7.put("hash", new androidx.room.util.g.a("hash", "TEXT", true, 0, "''", 1));
            HashSet hashSet7 = new HashSet(0);
            HashSet hashSet8 = new HashSet(2);
            hashSet8.add(new androidx.room.util.g.f("index_space_hash", true, Arrays.asList("hash"), Arrays.asList("ASC")));
            hashSet8.add(new androidx.room.util.g.f("index_space_id", true, Arrays.asList("id"), Arrays.asList("ASC")));
            androidx.room.util.g gVar7 = new androidx.room.util.g("space", map7, hashSet7, hashSet8);
            androidx.room.util.g gVarA7 = androidx.room.util.g.a(db2, "space");
            if (!gVar7.equals(gVarA7)) {
                return new e2.c(false, "space(com.planner5d.library.database.model.spaces.Space).\n Expected:\n" + gVar7 + "\n Found:\n" + gVarA7);
            }
            HashMap map8 = new HashMap(6);
            map8.put("id", new androidx.room.util.g.a("id", "INTEGER", true, 1, null, 1));
            map8.put("space_id", new androidx.room.util.g.a("space_id", "INTEGER", true, 0, null, 1));
            map8.put("area", new androidx.room.util.g.a("area", "TEXT", false, 0, null, 1));
            map8.put("build_date", new androidx.room.util.g.a("build_date", "TEXT", false, 0, null, 1));
            map8.put("total_bedrooms", new androidx.room.util.g.a("total_bedrooms", "TEXT", false, 0, null, 1));
            map8.put("total_bathrooms", new androidx.room.util.g.a("total_bathrooms", "TEXT", false, 0, null, 1));
            HashSet hashSet9 = new HashSet(0);
            HashSet hashSet10 = new HashSet(2);
            hashSet10.add(new androidx.room.util.g.f("index_space_attributes_id", true, Arrays.asList("id"), Arrays.asList("ASC")));
            hashSet10.add(new androidx.room.util.g.f("index_space_attributes_space_id", true, Arrays.asList("space_id"), Arrays.asList("ASC")));
            androidx.room.util.g gVar8 = new androidx.room.util.g("space_attributes", map8, hashSet9, hashSet10);
            androidx.room.util.g gVarA8 = androidx.room.util.g.a(db2, "space_attributes");
            if (!gVar8.equals(gVarA8)) {
                return new e2.c(false, "space_attributes(com.planner5d.library.database.model.spaces.SpaceAttributes).\n Expected:\n" + gVar8 + "\n Found:\n" + gVarA8);
            }
            HashMap map9 = new HashMap(5);
            map9.put("hash", new androidx.room.util.g.a("hash", "TEXT", true, 1, null, 1));
            map9.put("format", new androidx.room.util.g.a("format", "TEXT", true, 2, null, 1));
            map9.put("uri", new androidx.room.util.g.a("uri", "TEXT", true, 0, null, 1));
            map9.put("file_integrity_hash", new androidx.room.util.g.a("file_integrity_hash", "TEXT", true, 0, null, 1));
            map9.put("last_update_unix_millis", new androidx.room.util.g.a("last_update_unix_millis", "INTEGER", true, 0, null, 1));
            HashSet hashSet11 = new HashSet(0);
            HashSet hashSet12 = new HashSet(2);
            hashSet12.add(new androidx.room.util.g.f("index_user_model_metadata_hash", false, Arrays.asList("hash"), Arrays.asList("ASC")));
            hashSet12.add(new androidx.room.util.g.f("index_user_model_metadata_format", false, Arrays.asList("format"), Arrays.asList("ASC")));
            androidx.room.util.g gVar9 = new androidx.room.util.g("user_model_metadata", map9, hashSet11, hashSet12);
            androidx.room.util.g gVarA9 = androidx.room.util.g.a(db2, "user_model_metadata");
            if (gVar9.equals(gVarA9)) {
                return new e2.c(true, null);
            }
            return new e2.c(false, "user_model_metadata(com.planner5d.library.database.model.UserModelMetadata).\n Expected:\n" + gVar9 + "\n Found:\n" + gVarA9);
        }
    }

    @Override // androidx.room.b2
    public void clearAllTables() {
        super.assertNotMainThread();
        w3.d writableDatabase = super.getOpenHelper().getWritableDatabase();
        try {
            super.beginTransaction();
            writableDatabase.X8("DELETE FROM `blog_posts`");
            writableDatabase.X8("DELETE FROM `chat_messages`");
            writableDatabase.X8("DELETE FROM `document`");
            writableDatabase.X8("DELETE FROM `document_folder`");
            writableDatabase.X8("DELETE FROM `favorite_marks`");
            writableDatabase.X8("DELETE FROM `project_conversations`");
            writableDatabase.X8("DELETE FROM `space`");
            writableDatabase.X8("DELETE FROM `space_attributes`");
            writableDatabase.X8("DELETE FROM `user_model_metadata`");
            super.setTransactionSuccessful();
            super.endTransaction();
            writableDatabase.yd("PRAGMA wal_checkpoint(FULL)").close();
            if (!writableDatabase.pe()) {
                writableDatabase.X8("VACUUM");
            }
        } catch (Throwable th2) {
            super.endTransaction();
            writableDatabase.yd("PRAGMA wal_checkpoint(FULL)").close();
            if (!writableDatabase.pe()) {
                writableDatabase.X8("VACUUM");
            }
            throw th2;
        }
    }

    @Override // androidx.room.b2
    @NonNull
    protected l0 createInvalidationTracker() {
        return new l0(this, new HashMap(0), new HashMap(0), "blog_posts", "chat_messages", "document", "document_folder", "favorite_marks", "project_conversations", "space", "space_attributes", "user_model_metadata");
    }

    @Override // androidx.room.b2
    @NonNull
    protected w3.e createOpenHelper(@NonNull final androidx.room.n config) {
        return config.f75015c.a(w3.e.b.a(config.f75013a).d(config.f75014b).c(new e2(config, new a(51), "c73fc1fda2ed4ba33bfb15142e24bd47", "bf6ec5b294432effe4ed45fbc01ef91b")).b());
    }

    @Override // com.planner5d.library.database.ApplicationDatabase
    public com.planner5d.library.feed.data.a d() {
        com.planner5d.library.feed.data.a aVar;
        if (this.f154020a != null) {
            return this.f154020a;
        }
        synchronized (this) {
            try {
                if (this.f154020a == null) {
                    this.f154020a = new com.planner5d.library.feed.data.c(this);
                }
                aVar = this.f154020a;
            } catch (Throwable th2) {
                throw th2;
            }
        }
        return aVar;
    }

    @Override // com.planner5d.library.database.ApplicationDatabase
    public com.planner5d.library.database.model.chat.b e() {
        com.planner5d.library.database.model.chat.b bVar;
        if (this.f154021b != null) {
            return this.f154021b;
        }
        synchronized (this) {
            try {
                if (this.f154021b == null) {
                    this.f154021b = new com.planner5d.library.database.model.chat.c(this);
                }
                bVar = this.f154021b;
            } catch (Throwable th2) {
                throw th2;
            }
        }
        return bVar;
    }

    @Override // com.planner5d.library.database.ApplicationDatabase
    public com.planner5d.library.database.model.spaces.documents.d f() {
        com.planner5d.library.database.model.spaces.documents.d dVar;
        if (this.f154022c != null) {
            return this.f154022c;
        }
        synchronized (this) {
            try {
                if (this.f154022c == null) {
                    this.f154022c = new com.planner5d.library.database.model.spaces.documents.e(this);
                }
                dVar = this.f154022c;
            } catch (Throwable th2) {
                throw th2;
            }
        }
        return dVar;
    }

    @Override // com.planner5d.library.database.ApplicationDatabase
    public com.planner5d.library.database.model.c g() {
        com.planner5d.library.database.model.c cVar;
        if (this.f154023d != null) {
            return this.f154023d;
        }
        synchronized (this) {
            try {
                if (this.f154023d == null) {
                    this.f154023d = new com.planner5d.library.database.model.e(this);
                }
                cVar = this.f154023d;
            } catch (Throwable th2) {
                throw th2;
            }
        }
        return cVar;
    }

    @Override // androidx.room.b2
    @NonNull
    public List<androidx.room.migration.b> getAutoMigrations(@NonNull final Map<Class<? extends androidx.room.migration.a>, androidx.room.migration.a> autoMigrationSpecs) {
        ArrayList arrayList = new ArrayList();
        arrayList.add(new com.planner5d.library.database.a());
        arrayList.add(new b());
        arrayList.add(new c());
        arrayList.add(new d());
        arrayList.add(new e());
        arrayList.add(new f());
        return arrayList;
    }

    @Override // androidx.room.b2
    @NonNull
    public Set<Class<? extends androidx.room.migration.a>> getRequiredAutoMigrationSpecs() {
        return new HashSet();
    }

    @Override // androidx.room.b2
    @NonNull
    protected Map<Class<?>, List<Class<?>>> getRequiredTypeConverters() {
        HashMap map = new HashMap();
        map.put(com.planner5d.library.feed.data.a.class, com.planner5d.library.feed.data.c.k());
        map.put(com.planner5d.library.database.model.chat.b.class, com.planner5d.library.database.model.chat.c.e());
        map.put(com.planner5d.library.database.model.spaces.documents.d.class, com.planner5d.library.database.model.spaces.documents.e.t());
        map.put(com.planner5d.library.database.model.c.class, com.planner5d.library.database.model.e.m());
        map.put(com.planner5d.library.database.model.chat.i.class, com.planner5d.library.database.model.chat.j.e());
        map.put(com.planner5d.library.database.model.spaces.d.class, com.planner5d.library.database.model.spaces.g.q());
        map.put(com.planner5d.library.database.model.l.class, com.planner5d.library.database.model.m.c());
        return map;
    }

    @Override // com.planner5d.library.database.ApplicationDatabase
    public com.planner5d.library.database.model.chat.i h() {
        com.planner5d.library.database.model.chat.i iVar;
        if (this.f154024e != null) {
            return this.f154024e;
        }
        synchronized (this) {
            try {
                if (this.f154024e == null) {
                    this.f154024e = new com.planner5d.library.database.model.chat.j(this);
                }
                iVar = this.f154024e;
            } catch (Throwable th2) {
                throw th2;
            }
        }
        return iVar;
    }

    @Override // com.planner5d.library.database.ApplicationDatabase
    public com.planner5d.library.database.model.spaces.d i() {
        com.planner5d.library.database.model.spaces.d dVar;
        if (this.f154025f != null) {
            return this.f154025f;
        }
        synchronized (this) {
            try {
                if (this.f154025f == null) {
                    this.f154025f = new com.planner5d.library.database.model.spaces.g(this);
                }
                dVar = this.f154025f;
            } catch (Throwable th2) {
                throw th2;
            }
        }
        return dVar;
    }

    @Override // com.planner5d.library.database.ApplicationDatabase
    public com.planner5d.library.database.model.l j() {
        com.planner5d.library.database.model.l lVar;
        if (this.f154026g != null) {
            return this.f154026g;
        }
        synchronized (this) {
            try {
                if (this.f154026g == null) {
                    this.f154026g = new com.planner5d.library.database.model.m(this);
                }
                lVar = this.f154026g;
            } catch (Throwable th2) {
                throw th2;
            }
        }
        return lVar;
    }
}
