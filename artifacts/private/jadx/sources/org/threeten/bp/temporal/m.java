package org.threeten.bp.temporal;

/* JADX INFO: loaded from: classes14.dex */
public interface m {
    <R extends e> R b(R r10, long j10);

    boolean c(e eVar);

    long d(e eVar, e eVar2);

    org.threeten.bp.e getDuration();

    boolean isDateBased();

    boolean isDurationEstimated();

    boolean isTimeBased();

    String toString();
}
