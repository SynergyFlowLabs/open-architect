package org.commonmark.internal;

import java.util.List;
import java.util.Map;

/* JADX INFO: loaded from: classes14.dex */
public class m implements org.commonmark.parser.b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final List<cm.a> f337625a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final Map<String, org.commonmark.node.s> f337626b;

    public m(List<cm.a> list, Map<String, org.commonmark.node.s> map) {
        this.f337625a = list;
        this.f337626b = map;
    }

    @Override // org.commonmark.parser.b
    public List<cm.a> a() {
        return this.f337625a;
    }

    @Override // org.commonmark.parser.b
    public org.commonmark.node.s b(String str) {
        return this.f337626b.get(str);
    }
}
