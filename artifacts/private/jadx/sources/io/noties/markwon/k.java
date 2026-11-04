package io.noties.markwon;

import androidx.annotation.NonNull;
import androidx.annotation.p0;

/* JADX INFO: loaded from: classes8.dex */
public interface k {

    public interface a {
        @NonNull
        <N extends org.commonmark.node.v> x a(@NonNull Class<N> cls);

        @p0
        <N extends org.commonmark.node.v> x b(@NonNull Class<N> cls);

        @NonNull
        k build();

        @NonNull
        <N extends org.commonmark.node.v> a c(@NonNull Class<N> cls, @NonNull x xVar);

        @NonNull
        <N extends org.commonmark.node.v> a d(@NonNull Class<N> cls, @NonNull x xVar);

        @NonNull
        <N extends org.commonmark.node.v> a e(@NonNull Class<N> cls, @p0 x xVar);

        @NonNull
        @Deprecated
        <N extends org.commonmark.node.v> a f(@NonNull Class<N> cls, @NonNull x xVar);
    }

    @p0
    <N extends org.commonmark.node.v> x a(@NonNull Class<N> cls);

    @NonNull
    <N extends org.commonmark.node.v> x b(@NonNull Class<N> cls);
}
