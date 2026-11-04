package com.ionspin.kotlin.bignum.integer;

import kotlin.k0;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes5.dex */
public enum l {
    POSITIVE,
    NEGATIVE,
    ZERO;


    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private static final /* synthetic */ kotlin.enums.a f131130e = kotlin.enums.c.c(k());

    public /* synthetic */ class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f131131a;

        static {
            int[] iArr = new int[l.values().length];
            try {
                iArr[l.POSITIVE.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[l.NEGATIVE.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[l.ZERO.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            f131131a = iArr;
        }
    }

    @NotNull
    public static kotlin.enums.a<l> l() {
        return f131130e;
    }

    @NotNull
    public final l n() {
        int i10 = a.f131131a[ordinal()];
        if (i10 == 1) {
            return NEGATIVE;
        }
        if (i10 == 2) {
            return POSITIVE;
        }
        int i11 = 6 ^ 3;
        if (i10 == 3) {
            return ZERO;
        }
        throw new k0();
    }

    public final int o() {
        int i10 = a.f131131a[ordinal()];
        if (i10 == 1) {
            return 1;
        }
        if (i10 == 2) {
            return -1;
        }
        if (i10 == 3) {
            return 0;
        }
        throw new k0();
    }
}
