package com.google.android.gms.internal.measurement;

import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

/* JADX INFO: loaded from: classes4.dex */
public final class bb {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static volatile boolean f108297b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static volatile bb f108298c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    static final bb f108299d = new bb(true);

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final /* synthetic */ int f108300e = 0;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final Map f108301a;

    bb() {
        this.f108301a = new HashMap();
    }

    public static bb a() {
        bb bbVar = f108298c;
        if (bbVar != null) {
            return bbVar;
        }
        synchronized (bb.class) {
            try {
                bb bbVar2 = f108298c;
                if (bbVar2 != null) {
                    return bbVar2;
                }
                int i10 = gd.f108451d;
                bb bbVarB = jb.b(bb.class);
                f108298c = bbVarB;
                return bbVarB;
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    public final pb b(yc ycVar, int i10) {
        return (pb) this.f108301a.get(new ab(ycVar, i10));
    }

    bb(boolean z10) {
        this.f108301a = Collections.EMPTY_MAP;
    }
}
