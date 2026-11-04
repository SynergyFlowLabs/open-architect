package com.badlogic.gdx.utils;

import java.io.DataOutputStream;

/* JADX INFO: loaded from: classes3.dex */
public class m extends o {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final e1.a f95696a;

    public m() {
        this(32);
    }

    public byte[] d() {
        return this.f95696a.a();
    }

    public byte[] e() {
        return this.f95696a.toByteArray();
    }

    public m(int i10) {
        super(new e1.a(i10));
        this.f95696a = (e1.a) ((DataOutputStream) this).out;
    }
}
