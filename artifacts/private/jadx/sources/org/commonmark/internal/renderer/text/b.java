package org.commonmark.internal.renderer.text;

/* JADX INFO: loaded from: classes14.dex */
public abstract class b {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static final String f337686c = "   ";

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private static final String f337687d = "";

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final b f337688a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final String f337689b;

    b(b bVar) {
        this.f337688a = bVar;
        if (bVar == null) {
            this.f337689b = "";
            return;
        }
        this.f337689b = bVar.f337689b + f337686c;
    }

    public String a() {
        return this.f337689b;
    }

    public b b() {
        return this.f337688a;
    }
}
