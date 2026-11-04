package com.rabbitmq.client;

/* JADX INFO: loaded from: classes13.dex */
public class u extends RuntimeException implements com.rabbitmq.utility.d<u> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final long f266054a = 1;

    @Override // com.rabbitmq.utility.d
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public u Kk() {
        try {
            return (u) super.clone();
        } catch (CloneNotSupportedException e10) {
            throw new RuntimeException(e10);
        }
    }
}
