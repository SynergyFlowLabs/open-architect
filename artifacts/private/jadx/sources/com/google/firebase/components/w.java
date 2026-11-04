package com.google.firebase.components;

import java.util.Arrays;
import java.util.List;

/* JADX INFO: loaded from: classes5.dex */
public class w extends x {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final List<g<?>> f120822a;

    public w(List<g<?>> list) {
        super("Dependency cycle detected: " + Arrays.toString(list.toArray()));
        this.f120822a = list;
    }

    public List<g<?>> a() {
        return this.f120822a;
    }
}
