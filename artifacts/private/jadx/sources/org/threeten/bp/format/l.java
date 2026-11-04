package org.threeten.bp.format;

/* JADX INFO: loaded from: classes14.dex */
public enum l {
    NORMAL,
    ALWAYS,
    NEVER,
    NOT_NEGATIVE,
    EXCEEDS_PAD;

    boolean b(boolean z10, boolean z11, boolean z12) {
        int iOrdinal = ordinal();
        if (iOrdinal == 0) {
            return (z10 && z11) ? false : true;
        }
        if (iOrdinal == 1 || iOrdinal == 4) {
            return true;
        }
        return (z11 || z12) ? false : true;
    }
}
