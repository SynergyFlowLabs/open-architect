package org.threeten.bp.format;

/* JADX INFO: loaded from: classes14.dex */
public enum o {
    FULL,
    FULL_STANDALONE,
    SHORT,
    SHORT_STANDALONE,
    NARROW,
    NARROW_STANDALONE;

    public o k() {
        return values()[ordinal() & (-2)];
    }

    public o l() {
        return values()[ordinal() | 1];
    }

    public boolean n() {
        return (ordinal() & 1) == 1;
    }
}
