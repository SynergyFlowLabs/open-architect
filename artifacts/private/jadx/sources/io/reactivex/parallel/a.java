package io.reactivex.parallel;

/* JADX INFO: loaded from: classes11.dex */
public enum a implements dj.c<Long, Throwable, a> {
    STOP,
    ERROR,
    SKIP,
    RETRY;

    @Override // dj.c
    /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
    public a apply(Long l10, Throwable th2) {
        return this;
    }
}
