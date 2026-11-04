package com.devtodev.analytics.internal.migrator;

import com.devtodev.analytics.internal.domain.Project;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes3.dex */
public interface IMigration {
    void migrateData(@NotNull Project project);
}
