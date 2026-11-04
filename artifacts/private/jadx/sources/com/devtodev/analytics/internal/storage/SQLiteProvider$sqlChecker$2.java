package com.devtodev.analytics.internal.storage;

import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.l0;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes3.dex */
public final class SQLiteProvider$sqlChecker$2 extends l0 implements Function0<SQLiteChecker> {
    final /* synthetic */ SQLiteProvider this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public SQLiteProvider$sqlChecker$2(SQLiteProvider sQLiteProvider) {
        super(0);
        this.this$0 = sQLiteProvider;
    }

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // kotlin.jvm.functions.Function0
    @NotNull
    public final SQLiteChecker invoke() {
        return new SQLiteChecker(this.this$0.database);
    }
}
