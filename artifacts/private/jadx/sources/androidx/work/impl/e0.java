package androidx.work.impl;

import java.util.concurrent.TimeUnit;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes3.dex */
public final class e0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    private static final String f76819a = "DELETE FROM workspec WHERE state IN (2, 3, 5) AND (last_enqueue_time + minimum_retention_duration) < ";

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NotNull
    private static final String f76820b = " AND (SELECT COUNT(*)=0 FROM dependency WHERE     prerequisite_id=id AND     work_spec_id NOT IN         (SELECT id FROM workspec WHERE state IN (2, 3, 5)))";

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @oj.f
    public static final long f76821c = TimeUnit.DAYS.toMillis(1);
}
