package com.devtodev.core.data.consts;

/* JADX INFO: loaded from: classes3.dex */
public enum EndSessionEvent {
    Suspended(1),
    Closed(2),
    Terminated(3);


    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private int f98076a;

    EndSessionEvent(int i10) {
        this.f98076a = i10;
    }

    public int getReasonCode() {
        return this.f98076a;
    }
}
