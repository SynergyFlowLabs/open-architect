package com.airbnb.lottie.network;

import androidx.annotation.b1;

/* JADX INFO: loaded from: classes3.dex */
@b1({b1.a.LIBRARY})
public enum c {
    JSON(".json"),
    ZIP(".zip"),
    GZIP(".gz");


    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f88632a;

    c(String str) {
        this.f88632a = str;
    }

    public String l() {
        return ".temp" + this.f88632a;
    }

    @Override // java.lang.Enum
    public String toString() {
        return this.f88632a;
    }
}
