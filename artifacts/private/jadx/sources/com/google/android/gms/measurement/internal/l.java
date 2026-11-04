package com.google.android.gms.measurement.internal;

/* JADX INFO: loaded from: classes4.dex */
enum l {
    UNSET(org.locationtech.jts.geom.l.f338160j),
    REMOTE_DEFAULT(org.locationtech.jts.geom.l.f338161k),
    REMOTE_DELEGATION(org.locationtech.jts.geom.l.f338162l),
    MANIFEST('3'),
    INITIALIZATION('4'),
    API('5'),
    CHILD_ACCOUNT('6'),
    TCF('7'),
    REMOTE_ENFORCED_DEFAULT('8'),
    FAILSAFE('9');


    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final char f110215a;

    l(char c10) {
        this.f110215a = c10;
    }

    public static l b(char c10) {
        for (l lVar : values()) {
            if (lVar.f110215a == c10) {
                return lVar;
            }
        }
        return UNSET;
    }

    final /* synthetic */ char k() {
        return this.f110215a;
    }
}
