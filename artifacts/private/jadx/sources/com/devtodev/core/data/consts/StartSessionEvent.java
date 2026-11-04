package com.devtodev.core.data.consts;

/* JADX INFO: loaded from: classes3.dex */
public enum StartSessionEvent {
    New(1),
    Resumed(2);


    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private int f98084a;

    static {
        int i10 = 7 & 1;
    }

    StartSessionEvent(int i10) {
        this.f98084a = i10;
    }

    public int getReasonCode() {
        return this.f98084a;
    }
}
