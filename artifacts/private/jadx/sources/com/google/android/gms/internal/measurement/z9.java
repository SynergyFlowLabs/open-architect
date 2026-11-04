package com.google.android.gms.internal.measurement;

/* JADX INFO: loaded from: classes4.dex */
public enum z9 implements ub {
    PURPOSE_RESTRICTION_NOT_ALLOWED(0),
    PURPOSE_RESTRICTION_REQUIRE_CONSENT(1),
    PURPOSE_RESTRICTION_REQUIRE_LEGITIMATE_INTEREST(2),
    PURPOSE_RESTRICTION_UNDEFINED(3),
    UNRECOGNIZED(-1);


    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final int f109025a;

    static {
        int i10 = 7 << 3;
    }

    z9(int i10) {
        this.f109025a = i10;
    }

    @Override // com.google.android.gms.internal.measurement.ub
    public final int a() {
        if (this != UNRECOGNIZED) {
            return this.f109025a;
        }
        throw new IllegalArgumentException("Can't get the number of an unknown enum value.");
    }

    @Override // java.lang.Enum
    public final String toString() {
        return Integer.toString(this.f109025a);
    }
}
