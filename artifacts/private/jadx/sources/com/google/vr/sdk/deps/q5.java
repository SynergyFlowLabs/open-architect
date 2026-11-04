package com.google.vr.sdk.deps;

import java.util.Iterator;
import java.util.Map;

/* JADX INFO: loaded from: classes5.dex */
final class q5 extends w5 {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final /* synthetic */ n5 f129557b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    private q5(n5 n5Var) {
        super(n5Var, (byte) 0);
        this.f129557b = n5Var;
    }

    @Override // com.google.vr.sdk.deps.w5, java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
    public final Iterator<Map.Entry<Object, Object>> iterator() {
        return new p5(this.f129557b, (byte) 0);
    }

    /* synthetic */ q5(n5 n5Var, byte b10) {
        this(n5Var);
    }
}
