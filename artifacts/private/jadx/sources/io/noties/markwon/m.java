package io.noties.markwon;

import androidx.annotation.NonNull;
import androidx.annotation.p0;
import org.commonmark.node.c0;

/* JADX INFO: loaded from: classes8.dex */
public interface m extends c0 {

    public interface a {
        void a(@NonNull m mVar, @NonNull org.commonmark.node.v vVar);

        void b(@NonNull m mVar, @NonNull org.commonmark.node.v vVar);
    }

    public interface b {
        @NonNull
        <N extends org.commonmark.node.v> b a(@NonNull Class<N> cls, @p0 c<? super N> cVar);

        @NonNull
        m b(@NonNull g gVar, @NonNull u uVar);

        @NonNull
        b c(@NonNull a aVar);
    }

    public interface c<N extends org.commonmark.node.v> {
        void a(@NonNull m mVar, @NonNull N n10);
    }

    void I(@NonNull org.commonmark.node.v vVar);

    void L();

    void b(int i10, @p0 Object obj);

    @NonNull
    y builder();

    void clear();

    void d(@NonNull org.commonmark.node.v vVar);

    <N extends org.commonmark.node.v> void f(@NonNull Class<N> cls, int i10);

    void h(@NonNull org.commonmark.node.v vVar);

    @NonNull
    u i();

    <N extends org.commonmark.node.v> void j(@NonNull N n10, int i10);

    <N extends org.commonmark.node.v> void l(@NonNull Class<N> cls, int i10);

    int length();

    @NonNull
    g n();

    void p();

    <N extends org.commonmark.node.v> void w(@NonNull N n10, int i10);

    boolean y(@NonNull org.commonmark.node.v vVar);
}
