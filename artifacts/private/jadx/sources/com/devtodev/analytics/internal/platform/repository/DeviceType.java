package com.devtodev.analytics.internal.platform.repository;

/* JADX INFO: loaded from: classes3.dex */
public enum DeviceType {
    UNKNOWN(0),
    PHONE(1),
    TABLET(2),
    DESKTOP(3),
    WATCH(4),
    TV(5),
    SIMULATOR(6);

    private final int type;

    DeviceType(int i10) {
        this.type = i10;
    }

    public final int getType() {
        return this.type;
    }
}
