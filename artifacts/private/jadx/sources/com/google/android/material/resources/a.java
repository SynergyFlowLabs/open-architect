package com.google.android.material.resources;

import android.graphics.Typeface;
import androidx.annotation.b1;

/* JADX INFO: loaded from: classes4.dex */
@b1({b1.a.LIBRARY_GROUP})
public final class a extends f {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final Typeface f113294a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final InterfaceC0992a f113295b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private boolean f113296c;

    /* JADX INFO: renamed from: com.google.android.material.resources.a$a, reason: collision with other inner class name */
    public interface InterfaceC0992a {
        void a(Typeface typeface);
    }

    public a(InterfaceC0992a interfaceC0992a, Typeface typeface) {
        this.f113294a = typeface;
        this.f113295b = interfaceC0992a;
    }

    private void d(Typeface typeface) {
        if (!this.f113296c) {
            this.f113295b.a(typeface);
        }
    }

    @Override // com.google.android.material.resources.f
    public void a(int i10) {
        d(this.f113294a);
    }

    @Override // com.google.android.material.resources.f
    public void b(Typeface typeface, boolean z10) {
        d(typeface);
    }

    public void c() {
        this.f113296c = true;
    }
}
