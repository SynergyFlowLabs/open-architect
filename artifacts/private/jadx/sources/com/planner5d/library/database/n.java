package com.planner5d.library.database;

import androidx.room.s2;
import java.util.Date;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes4.dex */
@SourceDebugExtension({"SMAP\nConverters.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Converters.kt\ncom/planner5d/library/database/DateConverter\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,34:1\n1#2:35\n*E\n"})
public final class n {
    @s2
    @Nullable
    public final Long a(@Nullable Date date) {
        if (date != null) {
            return Long.valueOf(date.getTime());
        }
        return null;
    }

    @s2
    @Nullable
    public final Date b(@Nullable Long l10) {
        if (l10 != null) {
            return new Date(l10.longValue());
        }
        return null;
    }
}
