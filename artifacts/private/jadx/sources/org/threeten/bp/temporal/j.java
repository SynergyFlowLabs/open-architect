package org.threeten.bp.temporal;

import java.util.Locale;
import java.util.Map;

/* JADX INFO: loaded from: classes14.dex */
public interface j {
    <R extends e> R b(R r10, long j10);

    boolean c(f fVar);

    o d(f fVar);

    long e(f fVar);

    f f(Map<j, Long> map, f fVar, org.threeten.bp.format.k kVar);

    m getBaseUnit();

    String getDisplayName(Locale locale);

    m getRangeUnit();

    boolean isDateBased();

    boolean isTimeBased();

    o range();
}
