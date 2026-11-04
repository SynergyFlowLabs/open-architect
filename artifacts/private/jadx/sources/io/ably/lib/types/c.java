package io.ably.lib.types;

/* JADX INFO: loaded from: classes13.dex */
public enum c {
    ANNOTATION_CREATE,
    ANNOTATION_DELETE;

    static {
        int i10 = 3 << 1;
    }

    static c l(int i10) {
        if (values().length <= i10) {
            return null;
        }
        return values()[i10];
    }
}
