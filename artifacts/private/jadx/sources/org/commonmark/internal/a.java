package org.commonmark.internal;

/* JADX INFO: loaded from: classes14.dex */
class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final StringBuilder f337568a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private int f337569b;

    public a() {
        this.f337569b = 0;
        this.f337568a = new StringBuilder();
    }

    public void a(CharSequence charSequence) {
        if (this.f337569b != 0) {
            this.f337568a.append('\n');
        }
        this.f337568a.append(charSequence);
        this.f337569b++;
    }

    public String b() {
        return this.f337568a.toString();
    }

    public a(String str) {
        this.f337569b = 0;
        this.f337568a = new StringBuilder(str);
    }
}
