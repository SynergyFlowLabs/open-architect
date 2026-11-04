package com.google.firebase.heartbeatinfo;

/* JADX INFO: loaded from: classes5.dex */
@u7.d
public abstract class s implements Comparable<s> {
    public static s c(String str, long j10) {
        return new b(str, j10);
    }

    @Override // java.lang.Comparable
    /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
    public int compareTo(s sVar) {
        return k() < sVar.k() ? -1 : 1;
    }

    public abstract long k();

    public abstract String l();
}
