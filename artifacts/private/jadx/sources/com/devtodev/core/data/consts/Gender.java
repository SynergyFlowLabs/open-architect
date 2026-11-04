package com.devtodev.core.data.consts;

/* JADX INFO: loaded from: classes3.dex */
public enum Gender {
    Unknown(0),
    Male(1),
    Female(2);


    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private int f98078a;

    Gender(int i10) {
        this.f98078a = i10;
    }

    public int getReasonCode() {
        return this.f98078a;
    }
}
