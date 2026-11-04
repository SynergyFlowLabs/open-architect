package com.planner5d.library.database;

import android.app.Application;
import androidx.annotation.m1;
import androidx.room.a2;
import androidx.room.b2;
import androidx.room.t2;
import com.google.common.util.concurrent.y2;
import com.planner5d.library.database.migration.r;
import com.planner5d.library.services.utility.s;
import java.util.Arrays;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes4.dex */
@androidx.room.m(autoMigrations = {@androidx.room.g(from = 31, to = 32), @androidx.room.g(from = 34, to = 35), @androidx.room.g(from = 36, to = 37), @androidx.room.g(from = 38, to = 39), @androidx.room.g(from = 43, to = 44), @androidx.room.g(from = 45, to = 46)}, entities = {jc.a.class, com.planner5d.library.database.model.chat.a.class, com.planner5d.library.database.model.spaces.documents.a.class, com.planner5d.library.database.model.spaces.documents.c.class, com.planner5d.library.database.model.b.class, com.planner5d.library.database.model.chat.h.class, com.planner5d.library.database.model.spaces.a.class, com.planner5d.library.database.model.spaces.b.class, com.planner5d.library.database.model.k.class}, version = 51)
@t2({n.class, o.class})
public abstract class ApplicationDatabase extends b2 {

    @SourceDebugExtension({"SMAP\nApplicationDatabase.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ApplicationDatabase.kt\ncom/planner5d/library/database/ApplicationDatabase$Factory\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,97:1\n1#2:98\n*E\n"})
    public static final class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        @NotNull
        private final Application f154017a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        @NotNull
        private final r f154018b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        @NotNull
        private final ad.b f154019c;

        @ij.a
        public a(@NotNull Application application, @NotNull r migrations, @NotNull ad.b loggingMiddleware) {
            Intrinsics.checkNotNullParameter(application, "application");
            Intrinsics.checkNotNullParameter(migrations, "migrations");
            Intrinsics.checkNotNullParameter(loggingMiddleware, "loggingMiddleware");
            this.f154017a = application;
            this.f154018b = migrations;
            this.f154019c = loggingMiddleware;
        }

        @m1
        @NotNull
        public final ApplicationDatabase a() {
            b2.a aVarV = a2.a(this.f154017a, ApplicationDatabase.class, "Planner5D.sqlite").v(s.f229729a.h().M0());
            androidx.room.migration.b[] bVarArrA = this.f154018b.a();
            b2.a aVarC = aVarV.c((androidx.room.migration.b[]) Arrays.copyOf(bVarArrA, bVarArrA.length));
            ThreadPoolExecutor threadPoolExecutor = new ThreadPoolExecutor(1, 1, 8L, TimeUnit.SECONDS, new LinkedBlockingQueue(), new y2().f("p5d-db-transactions").b());
            threadPoolExecutor.allowCoreThreadTimeOut(true);
            b2.a aVarW = aVarC.w(threadPoolExecutor);
            this.f154019c.apply(aVarW);
            ApplicationDatabase applicationDatabase = (ApplicationDatabase) aVarW.f();
            applicationDatabase.query("PRAGMA busy_timeout = 30000", (Object[]) null).close();
            return applicationDatabase;
        }
    }

    @NotNull
    public abstract com.planner5d.library.feed.data.a d();

    @NotNull
    public abstract com.planner5d.library.database.model.chat.b e();

    @NotNull
    public abstract com.planner5d.library.database.model.spaces.documents.d f();

    @NotNull
    public abstract com.planner5d.library.database.model.c g();

    @NotNull
    public abstract com.planner5d.library.database.model.chat.i h();

    @NotNull
    public abstract com.planner5d.library.database.model.spaces.d i();

    @NotNull
    public abstract com.planner5d.library.database.model.l j();
}
