package com.devtodev.core.data.consts;

/* JADX INFO: loaded from: classes3.dex */
public class SdkError {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private int f98080a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private String f98081b;

    public SdkError(int i10, String str) {
        this.f98080a = i10;
        this.f98081b = str;
    }

    public int getErrorCode() {
        return this.f98080a;
    }

    public String getMessage() {
        return this.f98081b;
    }

    public String toString() {
        return "Code: " + this.f98080a + " Message: " + this.f98081b;
    }
}
