package com.google.common.graph;

import com.google.common.collect.z6;
import com.google.common.collect.z9;
import java.util.Iterator;
import java.util.Objects;
import java.util.Set;

/* JADX INFO: loaded from: classes5.dex */
@g0
abstract class i0<N> extends com.google.common.collect.c<h0<N>> {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final x<N> f118630c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final Iterator<N> f118631d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    @fj.a
    N f118632e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    Iterator<N> f118633f;

    private static final class b<N> extends i0<N> {
        /* JADX INFO: Access modifiers changed from: protected */
        @Override // com.google.common.collect.c
        @fj.a
        /* JADX INFO: renamed from: g, reason: merged with bridge method [inline-methods] */
        public h0<N> b() {
            while (!this.f118633f.hasNext()) {
                if (!e()) {
                    return c();
                }
            }
            N n10 = this.f118632e;
            Objects.requireNonNull(n10);
            return h0.r(n10, this.f118633f.next());
        }

        private b(x<N> graph) {
            super(graph);
        }
    }

    private static final class c<N> extends i0<N> {

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        @fj.a
        private Set<N> f118634g;

        /* JADX INFO: Access modifiers changed from: protected */
        @Override // com.google.common.collect.c
        @fj.a
        /* JADX INFO: renamed from: g, reason: merged with bridge method [inline-methods] */
        public h0<N> b() {
            do {
                Objects.requireNonNull(this.f118634g);
                while (this.f118633f.hasNext()) {
                    N next = this.f118633f.next();
                    if (!this.f118634g.contains(next)) {
                        N n10 = this.f118632e;
                        Objects.requireNonNull(n10);
                        return h0.u(n10, next);
                    }
                }
                this.f118634g.add(this.f118632e);
            } while (e());
            this.f118634g = null;
            return c();
        }

        private c(x<N> graph) {
            super(graph);
            this.f118634g = z9.y(graph.e().size() + 1);
        }
    }

    static <N> i0<N> f(x<N> graph) {
        return graph.c() ? new b(graph) : new c(graph);
    }

    final boolean e() {
        com.google.common.base.j0.g0(!this.f118633f.hasNext());
        if (!this.f118631d.hasNext()) {
            return false;
        }
        N next = this.f118631d.next();
        this.f118632e = next;
        this.f118633f = this.f118630c.a((Object) next).iterator();
        return true;
    }

    private i0(x<N> graph) {
        this.f118632e = null;
        this.f118633f = z6.G().iterator();
        this.f118630c = graph;
        this.f118631d = graph.e().iterator();
    }
}
