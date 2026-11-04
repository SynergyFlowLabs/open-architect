package com.google.common.reflect;

import java.util.Map;

/* JADX INFO: loaded from: classes5.dex */
@z7.f("Use ImmutableTypeToInstanceMap or MutableTypeToInstanceMap")
@d
public interface p<B> extends Map<q<? extends B>, B> {
    @fj.a
    <T extends B> T G2(q<T> type);

    @z7.a
    @fj.a
    <T extends B> T H3(q<T> type, @k T value);

    @z7.a
    @fj.a
    <T extends B> T d1(Class<T> type, @k T value);

    @fj.a
    <T extends B> T u1(Class<T> type);
}
