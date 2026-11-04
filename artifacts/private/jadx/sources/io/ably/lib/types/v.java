package io.ably.lib.types;

/* JADX INFO: loaded from: classes13.dex */
public enum v {
    MESSAGE_CREATE,
    MESSAGE_UPDATE,
    MESSAGE_DELETE,
    META,
    MESSAGE_SUMMARY;

    static v l(int i10) {
        if (values().length <= i10) {
            return null;
        }
        return values()[i10];
    }
}
