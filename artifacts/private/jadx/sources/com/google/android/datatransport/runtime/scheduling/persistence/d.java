package com.google.android.datatransport.runtime.scheduling.persistence;

import androidx.annotation.m1;
import java.io.Closeable;

/* JADX INFO: loaded from: classes4.dex */
@m1
public interface d extends Closeable {
    long Bb(com.google.android.datatransport.runtime.r rVar);

    Iterable<com.google.android.datatransport.runtime.r> E9();

    boolean Lb(com.google.android.datatransport.runtime.r rVar);

    void Q8(Iterable<k> iterable);

    void Rb(Iterable<k> iterable);

    int p0();

    @androidx.annotation.p0
    k te(com.google.android.datatransport.runtime.r rVar, com.google.android.datatransport.runtime.j jVar);

    void v2(com.google.android.datatransport.runtime.r rVar, long j10);

    Iterable<k> wc(com.google.android.datatransport.runtime.r rVar);
}
