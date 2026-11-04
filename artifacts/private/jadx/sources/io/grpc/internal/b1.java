package io.grpc.internal;

import java.util.ArrayList;

/* JADX INFO: loaded from: classes13.dex */
public final class b1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final ArrayList<String> f288867a = new ArrayList<>();

    public b1 a(@fj.h Object obj) {
        this.f288867a.add(String.valueOf(obj));
        return this;
    }

    public b1 b(String str, @fj.h Object obj) {
        this.f288867a.add(str + "=" + obj);
        return this;
    }

    public String toString() {
        return this.f288867a.toString();
    }
}
