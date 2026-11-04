package com.google.protobuf;

import java.lang.reflect.Field;

/* JADX INFO: loaded from: classes5.dex */
@y
final class c3 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final int f125819a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final Field f125820b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final Field f125821c;

    public c3(int id2, Field caseField, Field valueField) {
        this.f125819a = id2;
        this.f125820b = caseField;
        this.f125821c = valueField;
    }

    public Field a() {
        return this.f125820b;
    }

    public int b() {
        return this.f125819a;
    }

    public Field c() {
        return this.f125821c;
    }
}
