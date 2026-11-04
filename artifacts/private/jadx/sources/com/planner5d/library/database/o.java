package com.planner5d.library.database;

import androidx.room.s2;
import java.util.List;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.jvm.internal.q1;
import kotlinx.serialization.json.Json;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes4.dex */
@SourceDebugExtension({"SMAP\nConverters.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Converters.kt\ncom/planner5d/library/database/ListConverter\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,34:1\n1#2:35\n*E\n"})
public final class o {
    @s2
    @Nullable
    public final String a(@Nullable List<String> list) {
        if (list != null) {
            return Json.Default.encodeToString(hk.a.i(hk.a.K(q1.f312784a)), list);
        }
        return null;
    }

    @s2
    @Nullable
    public final List<String> b(@Nullable String str) {
        if (str != null) {
            return (List) Json.Default.decodeFromString(hk.a.i(hk.a.K(q1.f312784a)), str);
        }
        return null;
    }
}
