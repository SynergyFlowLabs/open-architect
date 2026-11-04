package com.rabbitmq.client.impl;

import java.util.HashSet;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Set;

/* JADX INFO: loaded from: classes13.dex */
public class l1<T> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final Set<T> f265522a = new HashSet();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final Queue<T> f265523b = new LinkedList();

    public boolean a(T t10) {
        if (this.f265522a.contains(t10)) {
            return false;
        }
        this.f265522a.add(t10);
        this.f265523b.offer(t10);
        return true;
    }

    public void b() {
        this.f265523b.clear();
        this.f265522a.clear();
    }

    public boolean c(T t10) {
        return this.f265522a.contains(t10);
    }

    public boolean d() {
        return this.f265522a.isEmpty();
    }

    public T e() {
        T tPoll = this.f265523b.poll();
        if (tPoll != null) {
            this.f265522a.remove(tPoll);
        }
        return tPoll;
    }

    public boolean f(T t10) {
        this.f265523b.remove(t10);
        return this.f265522a.remove(t10);
    }
}
