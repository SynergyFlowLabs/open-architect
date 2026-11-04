package com.google.common.eventbus;

import com.google.common.base.j0;
import com.google.common.collect.e9;
import java.util.Iterator;
import java.util.Objects;
import java.util.Queue;
import java.util.concurrent.ConcurrentLinkedQueue;

/* JADX INFO: loaded from: classes5.dex */
@e
abstract class d {

    private static final class b extends d {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private static final b f118521a = new b();

        private b() {
        }

        @Override // com.google.common.eventbus.d
        void a(Object event, Iterator<j> subscribers) {
            j0.E(event);
            while (subscribers.hasNext()) {
                subscribers.next().d(event);
            }
        }
    }

    private static final class c extends d {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final ConcurrentLinkedQueue<a> f118522a;

        private static final class a {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            private final Object f118523a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            private final j f118524b;

            private a(Object event, j subscriber) {
                this.f118523a = event;
                this.f118524b = subscriber;
            }
        }

        private c() {
            this.f118522a = e9.f();
        }

        @Override // com.google.common.eventbus.d
        void a(Object event, Iterator<j> subscribers) {
            j0.E(event);
            while (subscribers.hasNext()) {
                this.f118522a.add(new a(event, subscribers.next()));
            }
            while (true) {
                a aVarPoll = this.f118522a.poll();
                if (aVarPoll == null) {
                    return;
                } else {
                    aVarPoll.f118524b.d(aVarPoll.f118523a);
                }
            }
        }
    }

    /* JADX INFO: renamed from: com.google.common.eventbus.d$d, reason: collision with other inner class name */
    private static final class C1080d extends d {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final ThreadLocal<Queue<c>> f118525a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private final ThreadLocal<Boolean> f118526b;

        /* JADX INFO: renamed from: com.google.common.eventbus.d$d$a */
        class a extends ThreadLocal<Queue<c>> {
            a() {
            }

            /* JADX INFO: Access modifiers changed from: protected */
            @Override // java.lang.ThreadLocal
            /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
            public Queue<c> initialValue() {
                return e9.d();
            }
        }

        /* JADX INFO: renamed from: com.google.common.eventbus.d$d$b */
        class b extends ThreadLocal<Boolean> {
            b() {
            }

            /* JADX INFO: Access modifiers changed from: protected */
            @Override // java.lang.ThreadLocal
            /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
            public Boolean initialValue() {
                return Boolean.FALSE;
            }
        }

        /* JADX INFO: renamed from: com.google.common.eventbus.d$d$c */
        private static final class c {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            private final Object f118529a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            private final Iterator<j> f118530b;

            private c(Object event, Iterator<j> subscribers) {
                this.f118529a = event;
                this.f118530b = subscribers;
            }
        }

        private C1080d() {
            this.f118525a = new a();
            this.f118526b = new b();
        }

        @Override // com.google.common.eventbus.d
        void a(Object event, Iterator<j> subscribers) {
            j0.E(event);
            j0.E(subscribers);
            Queue<c> queue = this.f118525a.get();
            Objects.requireNonNull(queue);
            Queue<c> queue2 = queue;
            queue2.offer(new c(event, subscribers));
            if (this.f118526b.get().booleanValue()) {
                return;
            }
            this.f118526b.set(Boolean.TRUE);
            while (true) {
                try {
                    c cVarPoll = queue2.poll();
                    if (cVarPoll == null) {
                        this.f118526b.remove();
                        this.f118525a.remove();
                        return;
                    } else {
                        while (cVarPoll.f118530b.hasNext()) {
                            ((j) cVarPoll.f118530b.next()).d(cVarPoll.f118529a);
                        }
                    }
                } catch (Throwable th2) {
                    this.f118526b.remove();
                    this.f118525a.remove();
                    throw th2;
                }
            }
        }
    }

    d() {
    }

    static d b() {
        return b.f118521a;
    }

    static d c() {
        return new c();
    }

    static d d() {
        return new C1080d();
    }

    abstract void a(Object event, Iterator<j> subscribers);
}
