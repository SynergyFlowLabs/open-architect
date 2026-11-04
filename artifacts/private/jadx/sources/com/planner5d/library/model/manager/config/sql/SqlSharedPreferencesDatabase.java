package com.planner5d.library.model.manager.config.sql;

import android.content.Context;
import androidx.annotation.m1;
import androidx.room.a2;
import androidx.room.b2;
import com.google.common.util.concurrent.y2;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes8.dex */
@androidx.room.m(entities = {n.class}, version = 1)
public abstract class SqlSharedPreferencesDatabase extends b2 {

    @SourceDebugExtension({"SMAP\nSqlSharedPreferencesDatabase.kt\nKotlin\n*S Kotlin\n*F\n+ 1 SqlSharedPreferencesDatabase.kt\ncom/planner5d/library/model/manager/config/sql/SqlSharedPreferencesDatabase$Factory\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,37:1\n1#2:38\n*E\n"})
    public static final class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        @NotNull
        private final Context f190633a;

        public a(@NotNull Context context) {
            Intrinsics.checkNotNullParameter(context, "context");
            this.f190633a = context;
        }

        @m1
        @NotNull
        public final SqlSharedPreferencesDatabase a() {
            b2.a aVarV = a2.a(this.f190633a, SqlSharedPreferencesDatabase.class, "P5dSharedPreferences.sqlite").v(com.planner5d.library.services.utility.s.f229729a.h().M0());
            ThreadPoolExecutor threadPoolExecutor = new ThreadPoolExecutor(1, 1, 8L, TimeUnit.SECONDS, new LinkedBlockingQueue(), new y2().f("p5d-shared-preferences-transactions").b());
            threadPoolExecutor.allowCoreThreadTimeOut(true);
            return (SqlSharedPreferencesDatabase) aVarV.w(threadPoolExecutor).f();
        }
    }

    @NotNull
    public abstract e d();
}
