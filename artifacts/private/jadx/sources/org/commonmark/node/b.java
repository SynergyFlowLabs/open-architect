package org.commonmark.node;

/* JADX INFO: loaded from: classes14.dex */
public abstract class b extends v {
    @Override // org.commonmark.node.v
    protected void m(v vVar) {
        if (!(vVar instanceof b)) {
            throw new IllegalArgumentException("Parent of block must also be block (can not be inline)");
        }
        super.m(vVar);
    }

    @Override // org.commonmark.node.v
    /* JADX INFO: renamed from: p, reason: merged with bridge method [inline-methods] */
    public b h() {
        return (b) super.h();
    }
}
