package com.planner5d.library.model.manager.config.sql;

import androidx.annotation.m1;
import java.util.Map;
import java.util.Set;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes8.dex */
@SourceDebugExtension({"SMAP\nXmlToSqlSharedPreferencesMigration.kt\nKotlin\n*S Kotlin\n*F\n+ 1 XmlToSqlSharedPreferencesMigration.kt\ncom/planner5d/library/model/manager/config/sql/XmlToSqlSharedPreferencesMigration\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 3 _Maps.kt\nkotlin/collections/MapsKt___MapsKt\n*L\n1#1,32:1\n1#2:33\n216#3,2:34\n*S KotlinDebug\n*F\n+ 1 XmlToSqlSharedPreferencesMigration.kt\ncom/planner5d/library/model/manager/config/sql/XmlToSqlSharedPreferencesMigration\n*L\n14#1:34,2\n*E\n"})
public final class u {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    private final com.planner5d.library.model.manager.config.xml.a f190886a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NotNull
    private final l f190887b;

    public u(@NotNull com.planner5d.library.model.manager.config.xml.a xmlManager, @NotNull l nonCachedSqlManager) {
        Intrinsics.checkNotNullParameter(xmlManager, "xmlManager");
        Intrinsics.checkNotNullParameter(nonCachedSqlManager, "nonCachedSqlManager");
        this.f190886a = xmlManager;
        this.f190887b = nonCachedSqlManager;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void c(Map map, u uVar) {
        for (Map.Entry entry : map.entrySet()) {
            String str = (String) entry.getKey();
            Object value = entry.getValue();
            if (value instanceof String) {
                l lVar = uVar.f190887b;
                Intrinsics.checkNotNull(str);
                lVar.B(str, (String) value);
            } else if (value instanceof Integer) {
                l lVar2 = uVar.f190887b;
                Intrinsics.checkNotNull(str);
                lVar2.O(str, ((Number) value).intValue());
            } else if (value instanceof Long) {
                l lVar3 = uVar.f190887b;
                Intrinsics.checkNotNull(str);
                lVar3.P(str, ((Number) value).longValue());
            } else if (value instanceof Boolean) {
                l lVar4 = uVar.f190887b;
                Intrinsics.checkNotNull(str);
                lVar4.M(str, ((Boolean) value).booleanValue());
            } else if (value instanceof Set) {
                l lVar5 = uVar.f190887b;
                Intrinsics.checkNotNull(str);
                Intrinsics.checkNotNull(value, "null cannot be cast to non-null type kotlin.collections.Set<kotlin.String>");
                lVar5.e(str, (Set) value);
            } else if (value instanceof Float) {
                throw new UnsupportedOperationException();
            }
        }
    }

    @m1
    public final void b() {
        final Map<String, ?> all = this.f190886a.S().getAll();
        Intrinsics.checkNotNull(all);
        if (all.isEmpty()) {
            all = null;
        }
        if (all == null) {
            return;
        }
        this.f190887b.j0(new Runnable() { // from class: com.planner5d.library.model.manager.config.sql.t
            @Override // java.lang.Runnable
            public final void run() {
                u.c(all, this);
            }
        });
        this.f190886a.K();
    }
}
