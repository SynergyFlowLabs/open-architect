package com.rabbitmq.client.impl;

import java.util.Arrays;

/* JADX INFO: loaded from: classes13.dex */
public class r implements com.rabbitmq.client.i1 {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static final String f265671b = "RABBIT-CR-DEMO";

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private int f265672a = 0;

    public static class a implements com.rabbitmq.client.h1 {
        @Override // com.rabbitmq.client.h1
        public com.rabbitmq.client.i1 a(String[] strArr) {
            if (Arrays.asList(strArr).contains(r.f265671b)) {
                return new r();
            }
            return null;
        }
    }

    @Override // com.rabbitmq.client.i1
    public com.rabbitmq.client.k0 a(com.rabbitmq.client.k0 k0Var, String str, String str2) {
        int i10 = this.f265672a + 1;
        this.f265672a = i10;
        if (i10 == 1) {
            return x0.a(str);
        }
        return x0.a("My password is " + str2);
    }

    @Override // com.rabbitmq.client.i1
    public String getName() {
        return f265671b;
    }
}
