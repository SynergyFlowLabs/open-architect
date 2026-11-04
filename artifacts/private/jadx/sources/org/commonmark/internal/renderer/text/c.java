package org.commonmark.internal.renderer.text;

import org.commonmark.node.w;

/* JADX INFO: loaded from: classes14.dex */
public class c extends b {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final char f337690e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private int f337691f;

    public c(b bVar, w wVar) {
        super(bVar);
        this.f337690e = wVar.s();
        this.f337691f = wVar.t();
    }

    public int c() {
        return this.f337691f;
    }

    public char d() {
        return this.f337690e;
    }

    public void e() {
        this.f337691f++;
    }
}
