package com.planner5d.library.database.migration;

import android.database.Cursor;
import java.io.IOException;
import kotlin.Unit;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes4.dex */
public final class b extends androidx.room.migration.b {
    @ij.a
    public b() {
        super(30, 31);
    }

    private final void b(w3.d dVar) throws IOException {
        Cursor cursorYd = dVar.yd("SELECT id, renders_count FROM auto_style");
        while (cursorYd.moveToNext()) {
            try {
                long j10 = cursorYd.getLong(0);
                long j11 = cursorYd.getLong(1);
                if (j11 > 0) {
                    Cursor cursorC5 = dVar.C5("SELECT count(1) FROM auto_style_image WHERE auto_style = ?", new Object[]{Long.valueOf(j10)});
                    try {
                        if (cursorC5.moveToNext()) {
                            dVar.da("UPDATE auto_style SET status = ? WHERE id = ?", new Object[]{Integer.valueOf(j11 == cursorC5.getLong(0) ? 2 : 4), Long.valueOf(j10)});
                        }
                        Unit unit = Unit.f312394a;
                        kotlin.io.c.a(cursorC5, null);
                    } catch (Throwable th2) {
                        try {
                            throw th2;
                        } catch (Throwable th3) {
                            kotlin.io.c.a(cursorC5, th2);
                            throw th3;
                        }
                    }
                }
            } catch (Throwable th4) {
                try {
                    throw th4;
                } catch (Throwable th5) {
                    kotlin.io.c.a(cursorYd, th4);
                    throw th5;
                }
            }
        }
        Unit unit2 = Unit.f312394a;
        kotlin.io.c.a(cursorYd, null);
    }

    @Override // androidx.room.migration.b
    public void a(@NotNull w3.d database) throws IOException {
        Intrinsics.checkNotNullParameter(database, "database");
        com.planner5d.library.database.m mVarH = com.planner5d.library.database.m.f154036c.h(database);
        if (mVarH.e("auto_style", "status")) {
            return;
        }
        mVarH.a("auto_style", "status", "INTEGER DEFAULT 0");
        b(database);
    }
}
