package com.rabbitmq.client;

import java.util.Arrays;
import java.util.HashSet;

/* JADX INFO: loaded from: classes13.dex */
public class y implements h1 {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final y f266063b = new y("PLAIN");

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final y f266064c = new y("EXTERNAL");

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final String f266065a;

    private y(String str) {
        this.f266065a = str;
    }

    @Override // com.rabbitmq.client.h1
    public i1 a(String[] strArr) {
        if (!new HashSet(Arrays.asList(strArr)).contains(this.f266065a)) {
            return null;
        }
        if (this.f266065a.equals("PLAIN")) {
            return new com.rabbitmq.client.impl.h1();
        }
        if (this.f266065a.equals("EXTERNAL")) {
            return new com.rabbitmq.client.impl.q0();
        }
        return null;
    }
}
