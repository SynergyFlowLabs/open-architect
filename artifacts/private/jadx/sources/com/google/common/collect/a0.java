package com.google.common.collect;

import java.util.Map;

/* JADX INFO: loaded from: classes4.dex */
@a4
@z7.f("Use ImmutableClassToInstanceMap or MutableClassToInstanceMap")
@com.google.common.annotations.b
public interface a0<B> extends Map<Class<? extends B>, B> {
    @z7.a
    @fj.a
    <T extends B> T d1(Class<T> type, @b9 T value);

    @fj.a
    <T extends B> T u1(Class<T> type);
}
