package com.google.android.gms.internal.common;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: loaded from: classes4.dex */
public final class b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final h0 f107960a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final boolean f107961b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final m0 f107962c;

    private b(m0 m0Var, boolean z10, h0 h0Var, int i10) {
        this.f107962c = m0Var;
        this.f107961b = z10;
        this.f107960a = h0Var;
    }

    public static b c(h0 h0Var) {
        return new b(new m0(h0Var), false, g0.f107972b, Integer.MAX_VALUE);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final Iterator h(CharSequence charSequence) {
        return new n0(this, charSequence, this.f107962c.f107981a);
    }

    public final b b() {
        return new b(this.f107962c, true, this.f107960a, Integer.MAX_VALUE);
    }

    public final Iterable d(CharSequence charSequence) {
        return new o0(this, charSequence);
    }

    public final List f(CharSequence charSequence) {
        charSequence.getClass();
        Iterator itH = h(charSequence);
        ArrayList arrayList = new ArrayList();
        while (itH.hasNext()) {
            arrayList.add((String) itH.next());
        }
        return Collections.unmodifiableList(arrayList);
    }
}
