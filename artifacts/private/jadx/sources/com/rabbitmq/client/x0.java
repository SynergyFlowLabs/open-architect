package com.rabbitmq.client;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

/* JADX INFO: loaded from: classes13.dex */
public interface x0 {

    public static class a implements x0 {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final long f266061a;

        public a(long j10) {
            this.f266061a = j10;
        }

        @Override // com.rabbitmq.client.x0
        public long b(int i10) {
            return this.f266061a;
        }
    }

    long b(int i10);

    public static class b implements x0 {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final List<Long> f266062a;

        public b() {
            this.f266062a = Arrays.asList(2000L, Long.valueOf(androidx.media3.common.j.f60679f2), 5000L, 8000L, 13000L, 21000L, 34000L);
        }

        @Override // com.rabbitmq.client.x0
        public long b(int i10) {
            if (i10 >= this.f266062a.size()) {
                i10 = this.f266062a.size() - 1;
            }
            return this.f266062a.get(i10).longValue();
        }

        public b(List<Long> list) {
            if (list == null || list.isEmpty()) {
                throw new IllegalArgumentException();
            }
            this.f266062a = Collections.unmodifiableList(list);
        }
    }
}
